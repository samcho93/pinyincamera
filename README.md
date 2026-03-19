# 拼音相机 (Pinyin Camera)

카메라로 중국어 텍스트를 비추면 실시간으로 병음(拼音)을 표시해주는 Android 앱입니다.

## 주요 기능

- **실시간 중국어 인식** - ML Kit을 이용한 카메라 기반 OCR
- **자동 병음 변환** - 인식된 한자 위에 병음(拼音) 오버레이 표시
- **성조 색상 구분** - 4성조를 색상으로 직관적으로 구분
  - 1성 (ˉ): 빨강
  - 2성 (ˊ): 초록
  - 3성 (ˇ): 파랑
  - 4성 (ˋ): 보라
  - 경성: 회색
- **도움말** - 앱 사용법과 성조 안내를 제공하는 도움말 화면

## 기술 스택

| 분류 | 기술 |
|------|------|
| 언어 | Kotlin |
| UI | Jetpack Compose + Material 3 |
| 아키텍처 | MVVM + Clean Architecture |
| DI | Hilt |
| 카메라 | CameraX 1.3.1 |
| 텍스트 인식 | ML Kit (Chinese Text Recognition) |
| 병음 변환 | pinyin4j 2.5.1 |
| 비동기 | Coroutines + Flow |

## 프로젝트 구조

```
app/src/main/java/com/project/chinesepinyin/
├── ChinesePinyinApp.kt          # Hilt Application
├── MainActivity.kt              # 진입점, 카메라 권한 처리
├── di/
│   └── AppModule.kt             # Hilt 의존성 모듈
├── domain/
│   ├── model/
│   │   └── ChineseCharInfo.kt   # 한자 정보 모델
│   └── usecase/
│       └── ConvertToPinyinUseCase.kt  # 병음 변환 유스케이스
├── data/
│   └── repository/
│       └── PinyinRepository.kt  # pinyin4j 기반 병음 조회
└── ui/
    ├── screens/
    │   └── CameraScreen.kt      # 메인 카메라 화면
    ├── components/
    │   ├── PinyinOverlay.kt     # 병음 오버레이 Canvas
    │   └── HelpDialog.kt        # 도움말 다이얼로그
    ├── viewmodel/
    │   └── CameraViewModel.kt   # 카메라 UI 상태 관리
    └── theme/
        └── Theme.kt             # Material 3 테마
```

## 빌드 및 실행

### 요구사항

- Android Studio Hedgehog (2023.1.1) 이상
- JDK 17
- Android SDK 34
- 최소 지원: Android 7.0 (API 24)

### 빌드

```bash
./gradlew assembleDebug
```

### 설치

```bash
./gradlew installDebug
```

## 사용법

1. 앱을 실행하고 카메라 권한을 허용합니다
2. 중국어 텍스트에 카메라를 비춥니다
3. 인식된 한자 위에 병음이 자동으로 표시됩니다
4. 색상으로 성조를 구분할 수 있습니다
5. 우측 상단 `?` 버튼을 눌러 도움말을 확인할 수 있습니다

## 라이선스

MIT License
