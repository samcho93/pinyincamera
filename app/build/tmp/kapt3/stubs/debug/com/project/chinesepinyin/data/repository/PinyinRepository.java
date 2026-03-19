package com.project.chinesepinyin.data.repository;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import javax.inject.Inject;
import javax.inject.Singleton;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\f\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u0010\u001a\u00020\tJ\u001c\u0010\u0011\u001a\u00020\t*\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/project/chinesepinyin/data/repository/PinyinRepository;", "", "()V", "formatWithToneNumber", "Lnet/sourceforge/pinyin4j/format/HanyuPinyinOutputFormat;", "toneMarks", "", "", "", "", "addToneMarks", "pinyin", "tone", "", "getPinyin", "Lkotlin/Pair;", "character", "replaceLast", "old", "new", "app_debug"})
public final class PinyinRepository {
    @org.jetbrains.annotations.NotNull()
    private final net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat formatWithToneNumber = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.Character, java.lang.String[]> toneMarks = null;
    
    @javax.inject.Inject()
    public PinyinRepository() {
        super();
    }
    
    /**
     * Returns a Pair of (pinyin with tone marks, tone number 1-4 or 5 for neutral)
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<java.lang.String, java.lang.Integer> getPinyin(@org.jetbrains.annotations.NotNull()
    java.lang.String character) {
        return null;
    }
    
    private final java.lang.String addToneMarks(java.lang.String pinyin, int tone) {
        return null;
    }
    
    private final java.lang.String replaceLast(java.lang.String $this$replaceLast, java.lang.String old, java.lang.String p2_54480) {
        return null;
    }
}