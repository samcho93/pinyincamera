package com.project.chinesepinyin.ui.viewmodel;

import androidx.lifecycle.ViewModel;
import com.project.chinesepinyin.domain.model.RecognizedTextBlock;
import com.project.chinesepinyin.domain.usecase.ConvertToPinyinUseCase;
import com.google.mlkit.vision.text.Text;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0014"}, d2 = {"Lcom/project/chinesepinyin/ui/viewmodel/CameraViewModel;", "Landroidx/lifecycle/ViewModel;", "convertToPinyinUseCase", "Lcom/project/chinesepinyin/domain/usecase/ConvertToPinyinUseCase;", "(Lcom/project/chinesepinyin/domain/usecase/ConvertToPinyinUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/project/chinesepinyin/ui/viewmodel/CameraUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "onProcessingStarted", "", "onTextRecognized", "visionText", "Lcom/google/mlkit/vision/text/Text;", "imageWidth", "", "imageHeight", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class CameraViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.project.chinesepinyin.domain.usecase.ConvertToPinyinUseCase convertToPinyinUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.project.chinesepinyin.ui.viewmodel.CameraUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.project.chinesepinyin.ui.viewmodel.CameraUiState> uiState = null;
    
    @javax.inject.Inject()
    public CameraViewModel(@org.jetbrains.annotations.NotNull()
    com.project.chinesepinyin.domain.usecase.ConvertToPinyinUseCase convertToPinyinUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.project.chinesepinyin.ui.viewmodel.CameraUiState> getUiState() {
        return null;
    }
    
    public final void onTextRecognized(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.vision.text.Text visionText, int imageWidth, int imageHeight) {
    }
    
    public final void onProcessingStarted() {
    }
}