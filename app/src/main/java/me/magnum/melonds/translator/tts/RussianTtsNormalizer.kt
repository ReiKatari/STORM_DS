package me.magnum.melonds.translator.tts

import java.util.regex.Pattern

/**
 * Normalizes text for Russian Text-to-Speech engines:
 * - Fixes stress (ударения) on famous gaming characters, locations, and RPG terms using combining acute accent (U+0301).
 * - Expands gaming abbreviations (HP, MP, EXP, LVL, etc.) into readable phonetics.
 * - Improves pronunciation of punctuation, numbers, and Roman numerals.
 */
object RussianTtsNormalizer {

    // Combining acute accent for Russian stress
    private const val ACCENT = "\u0301"

    // Dictionary of gaming characters and terms with correct vowel stress
    private val STRESS_REPLACEMENTS = mapOf(
        // Characters & Franchises
        "Бэтмен" to "Бэ${ACCENT}тмен",
        "Бэтмэн" to "Бэ${ACCENT}тмэн",
        "Джокер" to "Джо${ACCENT}кер",
        "Готэм" to "Го${ACCENT}тэм",
        "Зельда" to "Зе${ACCENT}льда",
        "Лейтон" to "Ле${ACCENT}йтон",
        "Пикачу" to "Пикачу${ACCENT}",
        "Покемон" to "Покемо${ACCENT}н",
        "Покемоны" to "Покемо${ACCENT}ны",
        "Марио" to "Ма${ACCENT}рио",
        "Луиджи" to "Луи${ACCENT}джи",
        "Баузер" to "Ба${ACCENT}узер",
        "Боузер" to "Бо${ACCENT}узер",
        "Кастлвания" to "Кастлва${ACCENT}ния",
        "Кастлевания" to "Кастлева${ACCENT}ния",
        "Эджворт" to "Э${ACCENT}джворт",
        "Феникс Райт" to "Фе${ACCENT}никс Райт",
        "Гамшу" to "Гамшу${ACCENT}",
        "Метроид" to "Метро${ACCENT}ид",
        "Самус" to "Са${ACCENT}мус",
        "Соник" to "Со${ACCENT}ник",
        "Наклз" to "На${ACCENT}клз",
        "Тейлз" to "Те${ACCENT}йлз",
        "Тейлс" to "Те${ACCENT}йлс",
        "Клауд" to "Кла${ACCENT}уд",
        "Сефирот" to "Сефиро${ACCENT}т",
        "Данте" to "Да${ACCENT}нте",
        "Кратос" to "Кра${ACCENT}тос",
        "Снейк" to "Снейк",
        "Вескер" to "Ве${ACCENT}скер",

        // Common Gaming / RPG Terms (fixing homographs and awkward stresses)
        "подземелье" to "подземе${ACCENT}лье",
        "подземелья" to "подземе${ACCENT}лья",
        "подземелий" to "подземе${ACCENT}лий",
        "инвентарь" to "инвента${ACCENT}рь",
        "артефакт" to "артефа${ACCENT}кт",
        "артефакты" to "артефа${ACCENT}кты",
        "доспехи" to "доспе${ACCENT}хи",
        "оружие" to "ору${ACCENT}жие",
        "заклинание" to "заклина${ACCENT}ние",
        "заклинания" to "заклина${ACCENT}ния",
        "исцеление" to "исцеле${ACCENT}ние",
        "сундук" to "сунду${ACCENT}к",
        "сундуки" to "сундуки${ACCENT}",
        "снаряжение" to "снаряже${ACCENT}ние",
        "эликсир" to "эликси${ACCENT}р",
        "зелье" to "зе${ACCENT}лье",
        "зелья" to "зе${ACCENT}лья",
        "уровень" to "у${ACCENT}ровень",
        "уровня" to "у${ACCENT}ровня",
        "уровне" to "у${ACCENT}ровне",
        "опыт" to "о${ACCENT}пыт",
        "урон" to "уро${ACCENT}н",
        "защита" to "защи${ACCENT}та",
        "атака" to "ата${ACCENT}ка",
        "способность" to "спосо${ACCENT}бность",
        "способности" to "спосо${ACCENT}бности",
        "головоломка" to "головоло${ACCENT}мка",
        "головоломки" to "головоло${ACCENT}мки",
        "загадка" to "зага${ACCENT}дка",
        "загадки" to "зага${ACCENT}дки",
        "препятствие" to "препя${ACCENT}тствие",
        "препятствия" to "препя${ACCENT}тствия",
        "королевство" to "короле${ACCENT}вство",
        "принцесса" to "принце${ACCENT}сса",
        "чудовище" to "чудо${ACCENT}вище",
        "чудовища" to "чудо${ACCENT}вища",
        "сохранение" to "сохране${ACCENT}ние",
        "загрузка" to "загру${ACCENT}зка"
    )

    // Acronyms and short forms
    private val ABBREVIATIONS = listOf(
        Pattern.compile("\\bHP\\b", Pattern.CASE_INSENSITIVE) to "хэ-пэ",
        Pattern.compile("\\bMP\\b", Pattern.CASE_INSENSITIVE) to "магия",
        Pattern.compile("\\bEXP\\b", Pattern.CASE_INSENSITIVE) to "опыт",
        Pattern.compile("\\bXP\\b", Pattern.CASE_INSENSITIVE) to "опыт",
        Pattern.compile("\\bLVL?\\b", Pattern.CASE_INSENSITIVE) to "уровень",
        Pattern.compile("\\bATK\\b", Pattern.CASE_INSENSITIVE) to "атака",
        Pattern.compile("\\bDEF\\b", Pattern.CASE_INSENSITIVE) to "защита",
        Pattern.compile("\\bCRIT\\b", Pattern.CASE_INSENSITIVE) to "критический удар",
        Pattern.compile("\\bNPC\\b", Pattern.CASE_INSENSITIVE) to "нпц",
        Pattern.compile("\\bNDS\\b", Pattern.CASE_INSENSITIVE) to "Ниндендо Ди-Эс",
        Pattern.compile("\\bDS\\b", Pattern.CASE_INSENSITIVE) to "Ди-Эс",
        Pattern.compile("\\b3DS\\b", Pattern.CASE_INSENSITIVE) to "Три-Ди-Эс",
        Pattern.compile("\\bKO\\b", Pattern.CASE_INSENSITIVE) to "нокаут"
    )

    // Roman Numerals in names/titles (e.g., "Final Fantasy IV" -> "Final Fantasy четвертая")
    private val ROMAN_NUMERALS = listOf(
        Pattern.compile("\\bX\\b") to "десятая",
        Pattern.compile("\\bIX\\b") to "девятая",
        Pattern.compile("\\bVIII\\b") to "восьмая",
        Pattern.compile("\\bVII\\b") to "седьмая",
        Pattern.compile("\\bVI\\b") to "шестая",
        Pattern.compile("\\bIV\\b") to "четвертая",
        Pattern.compile("\\bV\\b") to "пятая",
        Pattern.compile("\\bIII\\b") to "третья",
        Pattern.compile("\\bII\\b") to "вторая",
        Pattern.compile("\\bI\\b") to "первая"
    )

    fun normalize(text: String, languageCode: String = "ru"): String {
        if (text.isBlank()) return text

        var result = text

        // Process acronyms
        for ((pattern, replacement) in ABBREVIATIONS) {
            result = pattern.matcher(result).replaceAll(replacement)
        }

        // Roman numerals if in Russian context
        if (languageCode.equals("ru", ignoreCase = true)) {
            for ((pattern, replacement) in ROMAN_NUMERALS) {
                result = pattern.matcher(result).replaceAll(replacement)
            }

            // Apply word stress replacements
            for ((word, stressed) in STRESS_REPLACEMENTS) {
                // Word boundary replacement with case preservation
                val pattern = Pattern.compile("(?i)\\b" + Pattern.quote(word) + "\\b")
                val matcher = pattern.matcher(result)
                val sb = StringBuffer()
                while (matcher.find()) {
                    val matched = matcher.group()
                    // Match capitalization
                    val replacement = if (matched.isNotEmpty() && Character.isUpperCase(matched[0])) {
                        stressed.replaceFirstChar { it.uppercase() }
                    } else {
                        stressed.lowercase()
                    }
                    matcher.appendReplacement(sb, MatcherQuote(replacement))
                }
                matcher.appendTail(sb)
                result = sb.toString()
            }
        }

        // Clean up multiple exclamation / question marks that confuse TTS
        result = result.replace(Regex("!{2,}"), "!")
            .replace(Regex("\\?{2,}"), "?")
            .replace(Regex("\\.{3,}"), "...")

        return result
    }

    private fun MatcherQuote(s: String): String {
        return java.util.regex.Matcher.quoteReplacement(s)
    }
}
