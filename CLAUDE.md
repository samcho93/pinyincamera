# mobile_20260319_171633

> **타입**: 🤖 Android / Wear OS  
> **생성**: 2026-03-19 17:16  
> **원본 명령**: If you project Chinese sentences with a camera on a mobile app, make an app that looks like a combination of pinyin and 

## 기술 스택
- Kotlin / Android SDK
- Jetpack Compose (UI) 또는 XML Layout
- MVVM + Clean Architecture
- Hilt (DI), Room (DB), Retrofit (Network)
- Coroutines + Flow (비동기)

## 구조 (Clean Architecture)
```
ui/
  screens/    → 화면별 Composable
  components/ → 재사용 UI 컴포넌트
  viewmodel/  → ViewModel (StateFlow)
data/
  repository/ → Repository 구현체
  remote/     → Retrofit API
  local/      → Room DAO, Entity
domain/
  model/      → 비즈니스 모델
  usecase/    → UseCase 클래스
di/           → Hilt Module
```

## Wear OS 추가사항
- `Horologist` 라이브러리 활용
- `WearNavigation` 사용
- 폰↔워치 통신: `Wearable.getMessageClient()`
- 배터리 고려: 백그라운드 최소화

## 코드 규칙
- 클래스: PascalCase / 변수: camelCase / 상수: UPPER_SNAKE
- ViewModel → Repository → DataSource 단방향
- UI에서 직접 Repository 호출 금지
