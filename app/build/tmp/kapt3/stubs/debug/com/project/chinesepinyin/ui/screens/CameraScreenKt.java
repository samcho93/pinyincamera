package com.project.chinesepinyin.ui.screens;

import android.Manifest;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.compose.material3.IconButtonDefaults;
import androidx.compose.material.icons.Icons;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.TextAlign;
import androidx.core.content.ContextCompat;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.text.TextRecognizer;
import com.project.chinesepinyin.ui.viewmodel.CameraViewModel;
import java.util.concurrent.Executors;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001c\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0003\u001a\u0012\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003\u00a8\u0006\r"}, d2 = {"CameraScreen", "", "textRecognizer", "Lcom/google/mlkit/vision/text/TextRecognizer;", "viewModel", "Lcom/project/chinesepinyin/ui/viewmodel/CameraViewModel;", "PermissionRequest", "onResult", "Lkotlin/Function1;", "", "ToneLegend", "modifier", "Landroidx/compose/ui/Modifier;", "app_debug"})
public final class CameraScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void CameraScreen(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.vision.text.TextRecognizer textRecognizer, @org.jetbrains.annotations.NotNull()
    com.project.chinesepinyin.ui.viewmodel.CameraViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void ToneLegend(androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void PermissionRequest(kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onResult) {
    }
}