package com.project.chinesepinyin.ui.components;

import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextStyle;
import com.project.chinesepinyin.domain.model.ChineseCharInfo;
import com.project.chinesepinyin.domain.model.RecognizedTextBlock;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000B\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u001a4\u0010\r\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"TONE_COLORS", "", "", "Landroidx/compose/ui/graphics/Color;", "PinyinOverlay", "", "textBlocks", "", "Lcom/project/chinesepinyin/domain/model/RecognizedTextBlock;", "imageWidth", "imageHeight", "modifier", "Landroidx/compose/ui/Modifier;", "drawPinyinAboveChar", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "charInfo", "Lcom/project/chinesepinyin/domain/model/ChineseCharInfo;", "scale", "", "offsetX", "offsetY", "textMeasurer", "Landroidx/compose/ui/text/TextMeasurer;", "app_debug"})
public final class PinyinOverlayKt {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.lang.Integer, androidx.compose.ui.graphics.Color> TONE_COLORS = null;
    
    @androidx.compose.runtime.Composable()
    public static final void PinyinOverlay(@org.jetbrains.annotations.NotNull()
    java.util.List<com.project.chinesepinyin.domain.model.RecognizedTextBlock> textBlocks, int imageWidth, int imageHeight, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    private static final void drawPinyinAboveChar(androidx.compose.ui.graphics.drawscope.DrawScope $this$drawPinyinAboveChar, com.project.chinesepinyin.domain.model.ChineseCharInfo charInfo, float scale, float offsetX, float offsetY, androidx.compose.ui.text.TextMeasurer textMeasurer) {
    }
}