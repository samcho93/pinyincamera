package com.project.chinesepinyin.domain.usecase

import android.graphics.Rect
import com.project.chinesepinyin.data.repository.PinyinRepository
import com.project.chinesepinyin.domain.model.ChineseCharInfo
import com.project.chinesepinyin.domain.model.RecognizedTextBlock
import com.google.mlkit.vision.text.Text
import javax.inject.Inject

class ConvertToPinyinUseCase @Inject constructor(
    private val pinyinRepository: PinyinRepository
) {
    fun execute(visionText: Text, imageWidth: Int, imageHeight: Int): List<RecognizedTextBlock> {
        val blocks = mutableListOf<RecognizedTextBlock>()

        for (block in visionText.textBlocks) {
            for (line in block.lines) {
                val charInfos = mutableListOf<ChineseCharInfo>()

                for (element in line.elements) {
                    val symbols = element.symbols
                    if (symbols.isNotEmpty()) {
                        for (symbol in symbols) {
                            val char = symbol.text
                            if (isChinese(char)) {
                                val pinyinResult = pinyinRepository.getPinyin(char)
                                charInfos.add(
                                    ChineseCharInfo(
                                        character = char,
                                        pinyin = pinyinResult.first,
                                        toneNumber = pinyinResult.second,
                                        boundingBox = symbol.boundingBox ?: Rect()
                                    )
                                )
                            }
                        }
                    } else {
                        val text = element.text
                        val box = element.boundingBox ?: continue
                        val charWidth = if (text.isNotEmpty()) box.width() / text.length else 0

                        for ((i, c) in text.withIndex()) {
                            val char = c.toString()
                            if (isChinese(char)) {
                                val pinyinResult = pinyinRepository.getPinyin(char)
                                val charBox = Rect(
                                    box.left + i * charWidth,
                                    box.top,
                                    box.left + (i + 1) * charWidth,
                                    box.bottom
                                )
                                charInfos.add(
                                    ChineseCharInfo(
                                        character = char,
                                        pinyin = pinyinResult.first,
                                        toneNumber = pinyinResult.second,
                                        boundingBox = charBox
                                    )
                                )
                            }
                        }
                    }
                }

                if (charInfos.isNotEmpty()) {
                    blocks.add(RecognizedTextBlock(chars = charInfos))
                }
            }
        }

        return blocks
    }

    private fun isChinese(char: String): Boolean {
        if (char.isEmpty()) return false
        val cp = char.codePointAt(0)
        return cp in 0x4E00..0x9FFF ||
                cp in 0x3400..0x4DBF ||
                cp in 0x20000..0x2A6DF ||
                cp in 0xF900..0xFAFF
    }
}
