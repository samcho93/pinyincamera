const CACHE = 'camrec-v5';
const ASSETS = ['./','./index.html','./manifest.json','./icons/icon-192.png','./icons/icon-512.png','./icons/maskable-512.png','./icons/apple-touch-icon.png'];
self.addEventListener('install', e => { e.waitUntil(caches.open(CACHE).then(c => c.addAll(ASSETS))); self.skipWaiting(); });
self.addEventListener('activate', e => {
  e.waitUntil(caches.keys().then(ks => Promise.all(ks.filter(k => k !== CACHE).map(k => caches.delete(k)))));
  self.clients.claim();
});
self.addEventListener('fetch', e => {
  if (e.request.method !== 'GET') return;
  // 네트워크 우선, 실패 시 캐시 (오프라인 실행 지원)
  e.respondWith(fetch(e.request).then(r => {
    const copy = r.clone(); caches.open(CACHE).then(c => c.put(e.request, copy)); return r;
  }).catch(() => caches.match(e.request).then(m => m || caches.match('./index.html'))));
});
