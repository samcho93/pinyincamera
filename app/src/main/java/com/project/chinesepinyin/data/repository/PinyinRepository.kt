package com.project.chinesepinyin.data.repository

import net.sourceforge.pinyin4j.PinyinHelper
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PinyinRepository @Inject constructor() {

    private val formatWithToneNumber = HanyuPinyinOutputFormat().apply {
        caseType = HanyuPinyinCaseType.LOWERCASE
        toneType = HanyuPinyinToneType.WITH_TONE_NUMBER
        vCharType = HanyuPinyinVCharType.WITH_V
    }

    private val toneMarks = mapOf(
        'a' to arrayOf("ā", "á", "ǎ", "à"),
        'e' to arrayOf("ē", "é", "ě", "è"),
        'i' to arrayOf("ī", "í", "ǐ", "ì"),
        'o' to arrayOf("ō", "ó", "ǒ", "ò"),
        'u' to arrayOf("ū", "ú", "ǔ", "ù"),
        'v' to arrayOf("ǖ", "ǘ", "ǚ", "ǜ")
    )

    /**
     * Returns a Pair of (pinyin with tone marks, tone number 1-4 or 5 for neutral)
     */
    fun getPinyin(character: String): Pair<String, Int> {
        if (character.isEmpty()) return Pair("", 0)
        val char = character[0]

        return try {
            val pinyinArray = PinyinHelper.toHanyuPinyinStringArray(char, formatWithToneNumber)
            if (pinyinArray.isNullOrEmpty()) {
                Pair(character, 0)
            } else {
                val raw = pinyinArray[0] // e.g., "zhong1"
                val toneNumber = raw.last().digitToIntOrNull() ?: 5
                val base = raw.dropLast(1) // e.g., "zhong"
                val withMarks = addToneMarks(base, toneNumber)
                Pair(withMarks, toneNumber)
            }
        } catch (e: Exception) {
            Pair(character, 0)
        }
    }

    private fun addToneMarks(pinyin: String, tone: Int): String {
        if (tone < 1 || tone > 4) return pinyin

        // Tone placement rules:
        // 1. If there is an 'a' or 'e', put tone on it
        // 2. If there is 'ou', put tone on 'o'
        // 3. Otherwise, put tone on the last vowel
        val vowels = "aeiouv"

        for (c in pinyin) {
            if (c == 'a' || c == 'e') {
                return pinyin.replace(c.toString(), toneMarks[c]!![tone - 1])
            }
        }

        if ("ou" in pinyin) {
            return pinyin.replaceFirst("o", toneMarks['o']!![tone - 1])
        }

        // Find last vowel
        for (c in pinyin.reversed()) {
            if (c in vowels) {
                return pinyin.replaceLast(c.toString(), toneMarks[c]!![tone - 1])
            }
        }

        return pinyin
    }

    private fun String.replaceLast(old: String, new: String): String {
        val index = lastIndexOf(old)
        if (index < 0) return this
        return substring(0, index) + new + substring(index + old.length)
    }
}
