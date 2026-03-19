package com.project.chinesepinyin.domain.usecase;

import android.graphics.Rect;
import com.project.chinesepinyin.data.repository.PinyinRepository;
import com.project.chinesepinyin.domain.model.ChineseCharInfo;
import com.project.chinesepinyin.domain.model.RecognizedTextBlock;
import com.google.mlkit.vision.text.Text;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/project/chinesepinyin/domain/usecase/ConvertToPinyinUseCase;", "", "pinyinRepository", "Lcom/project/chinesepinyin/data/repository/PinyinRepository;", "(Lcom/project/chinesepinyin/data/repository/PinyinRepository;)V", "execute", "", "Lcom/project/chinesepinyin/domain/model/RecognizedTextBlock;", "visionText", "Lcom/google/mlkit/vision/text/Text;", "imageWidth", "", "imageHeight", "isChinese", "", "char", "", "app_debug"})
public final class ConvertToPinyinUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.project.chinesepinyin.data.repository.PinyinRepository pinyinRepository = null;
    
    @javax.inject.Inject()
    public ConvertToPinyinUseCase(@org.jetbrains.annotations.NotNull()
    com.project.chinesepinyin.data.repository.PinyinRepository pinyinRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.project.chinesepinyin.domain.model.RecognizedTextBlock> execute(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.vision.text.Text visionText, int imageWidth, int imageHeight) {
        return null;
    }
    
    private final boolean isChinese(java.lang.String p0_1526187) {
        return false;
    }
}