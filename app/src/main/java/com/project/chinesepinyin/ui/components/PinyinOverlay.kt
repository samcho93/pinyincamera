package com.project.chinesepinyin.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.text.TextMeasurer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.sp
import com.project.chinesepinyin.domain.model.ChineseCharInfo
import com.project.chinesepinyin.domain.model.RecognizedTextBlock

private val TONE_COLORS = mapOf(
    1 to Color(0xFFFF4444), // 1st tone: red
    2 to Color(0xFF44AA44), // 2nd tone: green
    3 to Color(0xFF4488FF), // 3rd tone: blue
    4 to Color(0xFF9944CC), // 4th tone: purple
    5 to Color(0xFFAAAAAA)  // neutral: gray
)

@Composable
fun PinyinOverlay(
    textBlocks: List<RecognizedTextBlock>,
    imageWidth: Int,
    imageHeight: Int,
    modifier: Modifier = Modifier
) {
    val textMeasurer = rememberTextMeasurer()

    Canvas(modifier = modifier.fillMaxSize()) {
        if (imageWidth <= 0 || imageHeight <= 0) return@Canvas

        // FILL_CENTER: scale up to fill view, crop excess, centered
        val scale = maxOf(size.width / imageWidth, size.height / imageHeight)
        val offsetX = (size.width - imageWidth * scale) / 2f
        val offsetY = (size.height - imageHeight * scale) / 2f

        for (block in textBlocks) {
            for (charInfo in block.chars) {
                drawPinyinAboveChar(
                    charInfo = charInfo,
                    scale = scale,
                    offsetX = offsetX,
                    offsetY = offsetY,
                    textMeasurer = textMeasurer
                )
            }
        }
    }
}

private fun DrawScope.drawPinyinAboveChar(
    charInfo: ChineseCharInfo,
    scale: Float,
    offsetX: Float,
    offsetY: Float,
    textMeasurer: TextMeasurer
) {
    val box = charInfo.boundingBox
    if (box.isEmpty) return

    val scaledLeft = box.left * scale + offsetX
    val scaledTop = box.top * scale + offsetY
    val scaledRight = box.right * scale + offsetX
    val scaledCharWidth = scaledRight - scaledLeft
    val scaledCharHeight = (box.bottom - box.top) * scale

    // Skip characters outside the visible screen area
    if (scaledRight < 0 || scaledLeft > size.width ||
        (scaledTop + scaledCharHeight) < 0 || scaledTop > size.height) {
        return
    }

    // Pinyin font size proportional to char size, but capped
    val pinyinFontSize = (scaledCharHeight * 0.35f).coerceIn(8f, 24f)

    val toneColor = TONE_COLORS[charInfo.toneNumber] ?: TONE_COLORS[5]!!

    val style = TextStyle(
        color = toneColor,
        fontSize = pinyinFontSize.sp,
        shadow = Shadow(
            color = Color.Black,
            offset = Offset(1f, 1f),
            blurRadius = 3f
        )
    )

    val textLayoutResult = textMeasurer.measure(
        text = charInfo.pinyin,
        style = style
    )

    val pinyinWidth = textLayoutResult.size.width
    val pinyinHeight = textLayoutResult.size.height

    // Center pinyin above the character
    var x = scaledLeft + (scaledCharWidth - pinyinWidth) / 2f
    val y = scaledTop - pinyinHeight - 2f

    // Keep within screen bounds horizontally
    x = x.coerceIn(2f, size.width - pinyinWidth - 2f)

    // Skip if pinyin would be entirely off-screen vertically
    if (y + pinyinHeight < 0) return

    // Draw background pill for readability
    drawRoundRect(
        color = Color.Black.copy(alpha = 0.6f),
        topLeft = Offset(x - 4f, y - 2f),
        size = Size(pinyinWidth + 8f, pinyinHeight + 4f),
        cornerRadius = CornerRadius(6f, 6f)
    )

    drawText(
        textLayoutResult = textLayoutResult,
        topLeft = Offset(x, y)
    )
}
