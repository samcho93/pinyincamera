package com.project.chinesepinyin.domain.model

import android.graphics.Rect

data class ChineseCharInfo(
    val character: String,
    val pinyin: String,
    val toneNumber: Int,
    val boundingBox: Rect
)

data class RecognizedTextBlock(
    val chars: List<ChineseCharInfo>
)
