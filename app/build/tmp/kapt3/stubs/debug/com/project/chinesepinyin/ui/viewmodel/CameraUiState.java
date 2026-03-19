package com.project.chinesepinyin.ui.viewmodel;

import androidx.lifecycle.ViewModel;
import com.project.chinesepinyin.domain.model.RecognizedTextBlock;
import com.project.chinesepinyin.domain.usecase.ConvertToPinyinUseCase;
import com.google.mlkit.vision.text.Text;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\tH\u00c6\u0003J7\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001b"}, d2 = {"Lcom/project/chinesepinyin/ui/viewmodel/CameraUiState;", "", "textBlocks", "", "Lcom/project/chinesepinyin/domain/model/RecognizedTextBlock;", "imageWidth", "", "imageHeight", "isProcessing", "", "(Ljava/util/List;IIZ)V", "getImageHeight", "()I", "getImageWidth", "()Z", "getTextBlocks", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "app_debug"})
public final class CameraUiState {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.project.chinesepinyin.domain.model.RecognizedTextBlock> textBlocks = null;
    private final int imageWidth = 0;
    private final int imageHeight = 0;
    private final boolean isProcessing = false;
    
    public CameraUiState(@org.jetbrains.annotations.NotNull()
    java.util.List<com.project.chinesepinyin.domain.model.RecognizedTextBlock> textBlocks, int imageWidth, int imageHeight, boolean isProcessing) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.project.chinesepinyin.domain.model.RecognizedTextBlock> getTextBlocks() {
        return null;
    }
    
    public final int getImageWidth() {
        return 0;
    }
    
    public final int getImageHeight() {
        return 0;
    }
    
    public final boolean isProcessing() {
        return false;
    }
    
    public CameraUiState() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.project.chinesepinyin.domain.model.RecognizedTextBlock> component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.project.chinesepinyin.ui.viewmodel.CameraUiState copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.project.chinesepinyin.domain.model.RecognizedTextBlock> textBlocks, int imageWidth, int imageHeight, boolean isProcessing) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}