package me.magnum.melonds.translator.ocr

import java.util.Locale

object SmartWordCorrector {

    fun correctText(text: String, lang: String): String {
        if (text.isBlank()) return text
        val cleanLang = lang.lowercase(Locale.ROOT)
        return when {
            cleanLang.startsWith("ja") -> correctJapaneseText(text)
            cleanLang.startsWith("zh") -> text
            else -> correctLatinText(text)
        }
    }

    private fun correctLatinText(text: String): String {
        return text.trim()
            .replace(Regex("(?i)^\\[?TR\\]?[:\\s]+\\s*"), "")
            .replace(Regex("\\s+"), " ")
    }

    private fun correctJapaneseText(text: String): String {
        val sb = StringBuilder(text.length)
        for (ch in text) {
            val full = when (ch) {
                'ｱ' -> 'ア'; 'ｲ' -> 'イ'; 'ｳ' -> 'ウ'; 'ｴ' -> 'エ'; 'ｵ' -> 'オ'
                'ｶ' -> 'カ'; 'ｷ' -> 'キ'; 'ｸ' -> 'ク'; 'ｹ' -> 'ケ'; 'ｺ' -> 'コ'
                'ｻ' -> 'サ'; 'ｼ' -> 'シ'; 'ｽ' -> 'ス'; 'ｾ' -> 'セ'; 'ｿ' -> 'ソ'
                'ﾀ' -> 'タ'; 'ﾁ' -> 'チ'; 'ﾂ' -> 'ツ'; 'ﾃ' -> 'テ'; 'ﾄ' -> 'ト'
                'ﾅ' -> 'ナ'; 'ﾆ' -> 'ニ'; 'ﾇ' -> 'ヌ'; 'ﾈ' -> 'ネ'; 'ﾉ' -> 'ノ'
                'ﾊ' -> 'ハ'; 'ﾋ' -> 'ヒ'; 'ﾌ' -> 'フ'; 'ﾍ' -> 'ヘ'; 'ﾎ' -> 'ホ'
                'ﾏ' -> 'マ'; 'ﾐ' -> 'ミ'; 'ﾑ' -> 'ム'; 'ﾒ' -> 'メ'; 'ﾓ' -> 'モ'
                'ﾔ' -> 'ヤ'; 'ﾕ' -> 'ユ'; 'ﾖ' -> 'ヨ'
                'ﾗ' -> 'ラ'; 'ﾘ' -> 'リ'; 'ﾙ' -> 'ル'; 'ﾚ' -> 'レ'; 'ﾛ' -> 'ロ'
                'ﾜ' -> 'ワ'; 'ｦ' -> 'ヲ'; 'ﾝ' -> 'ン'
                'ｧ' -> 'ァ'; 'ｨ' -> 'ィ'; 'ｩ' -> 'ゥ'; 'ｪ' -> 'ェ'; 'ｫ' -> 'ォ'
                'ｬ' -> 'ャ'; 'ｭ' -> 'ュ'; 'ｮ' -> 'ョ'; 'ｯ' -> 'ッ'; 'ｰ' -> 'ー'
                else -> ch
            }
            sb.append(full)
        }
        return sb.toString()
    }
}
