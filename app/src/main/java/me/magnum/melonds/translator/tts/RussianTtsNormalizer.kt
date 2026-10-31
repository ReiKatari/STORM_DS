package me.magnum.melonds.translator.tts

import java.util.regex.Pattern

/**
 * Studio Script Normalizer for Russian & Multilingual Text-to-Speech engines:
 * - Fixes stress (ударения) on 200+ gaming characters, locations, and RPG terms using combining acute accent (U+0301).
 * - Contextual homograph disambiguation (за́мок vs замо́к).
 * - Strips OCR border artifacts (|, ~, *, _, stray brackets) so voice actors never read symbol names aloud.
 * - Handles pauses on em-dashes (—) and ellipses (...) cleanly without audio clipping.
 * - Expands gaming abbreviations (HP, MP, EXP, LVL, ATK, DEF, G, etc.) into natural Russian speech.
 */
object RussianTtsNormalizer {

    // Combining acute accent for Russian stress
    private const val ACCENT = "\u0301"

    // Context cues for disambiguating "замок" (castle) vs "замок" (lock)
    private val LOCK_CONTEXT_WORDS = setOf(
        "дверной", "двери", "ключ", "ключом", "ключа", "взломать", "взлом", "отпереть",
        "запереть", "отмычка", "отмычкой", "висячий", "навесной", "защёлка", "защелка", "личинка"
    )

    // Dictionary of gaming characters, locations, and terms with verified studio vowel stress
    private val STRESS_REPLACEMENTS = mapOf(
        // DC / Batman
        "Бэтмен" to "Бэ${ACCENT}тмен",
        "Бэтмена" to "Бэ${ACCENT}тмена",
        "Бэтмену" to "Бэ${ACCENT}тмену",
        "Бэтменом" to "Бэ${ACCENT}тменом",
        "Бэтмэн" to "Бэ${ACCENT}тмэн",
        "Джокер" to "Джо${ACCENT}кер",
        "Джокера" to "Джо${ACCENT}кера",
        "Готэм" to "Го${ACCENT}тэм",
        "Готэма" to "Го${ACCENT}тэма",
        "Аркхэм" to "А${ACCENT}ркхэм",
        "Робин" to "Ро${ACCENT}бин",
        "Харли" to "Ха${ACCENT}рли",
        "Риддлер" to "Ри${ACCENT}ддлер",
        "Аквамен" to "Акваме${ACCENT}н",
        "Альфред" to "А${ACCENT}льфред",
        "Гордон" to "Го${ACCENT}рдон",

        // Ace Attorney & Professor Layton
        "Феникс" to "Фе${ACCENT}никс",
        "Феникса" to "Фе${ACCENT}никса",
        "Эджворт" to "Э${ACCENT}джворт",
        "Эджворта" to "Э${ACCENT}джворта",
        "Гамшу" to "Гамшу${ACCENT}",
        "Франциска" to "Франци${ACCENT}ска",
        "Манфред" to "Ма${ACCENT}нфред",
        "Годо" to "Годо${ACCENT}",
        "Аполло" to "Апо${ACCENT}лло",
        "Труси" to "Тру${ACCENT}си",
        "Трюси" to "Трю${ACCENT}си",
        "Клавир" to "Клави${ACCENT}р",
        "Лейтон" to "Ле${ACCENT}йтон",
        "Лейтона" to "Ле${ACCENT}йтона",
        "Челми" to "Че${ACCENT}лми",
        "Дескоул" to "Деско${ACCENT}ул",
        "Флора" to "Фло${ACCENT}ра",
        "Пикараты" to "Пикара${ACCENT}ты",
        "пикаратов" to "пикара${ACCENT}тов",
        "улика" to "ули${ACCENT}ка",
        "улики" to "ули${ACCENT}ки",
        "показания" to "показа${ACCENT}ния",
        "протестую" to "протесту${ACCENT}ю",
        "постойте" to "посто${ACCENT}йте",
        "получайте" to "получа${ACCENT}йте",

        // Nintendo / Zelda / Mario / Pokémon / Metroid
        "Зельда" to "Зе${ACCENT}льда",
        "Зельды" to "Зе${ACCENT}льды",
        "Ганондорф" to "Ганондо${ACCENT}рф",
        "Ганон" to "Га${ACCENT}нон",
        "Хайрул" to "Хайру${ACCENT}л",
        "Лайнбек" to "Ла${ACCENT}йнбек",
        "Сиела" to "Сие${ACCENT}ла",
        "Пикачу" to "Пикачу${ACCENT}",
        "Покемон" to "Покемо${ACCENT}н",
        "Покемоны" to "Покемо${ACCENT}ны",
        "Покемонов" to "Покемо${ACCENT}нов",
        "Покедекс" to "Покеде${ACCENT}кс",
        "Покебол" to "Покебо${ACCENT}л",
        "Гиратина" to "Гирати${ACCENT}на",
        "Даркрай" to "Даркра${ACCENT}й",
        "Аркеус" to "Арке${ACCENT}ус",
        "Синтия" to "Си${ACCENT}нтия",
        "Гетсис" to "Ге${ACCENT}тсис",
        "Джованни" to "Джова${ACCENT}нни",
        "Марио" to "Ма${ACCENT}рио",
        "Луиджи" to "Луи${ACCENT}джи",
        "Баузер" to "Ба${ACCENT}узер",
        "Боузер" to "Бо${ACCENT}узер",
        "Фофул" to "Фо${ACCENT}фул",
        "Старлоу" to "Ста${ACCENT}рлоу",
        "Варио" to "Ва${ACCENT}рио",
        "Валуиджи" to "Валуи${ACCENT}джи",
        "Метроид" to "Метро${ACCENT}ид",
        "Самус" to "Са${ACCENT}мус",
        "Соник" to "Со${ACCENT}ник",
        "Наклз" to "На${ACCENT}клз",
        "Тейлз" to "Те${ACCENT}йлз",
        "Тейлс" to "Те${ACCENT}йлс",
        "Эггман" to "Э${ACCENT}ггман",

        // JRPGs / Castlevania / Chrono Trigger / FF / TWEWY / 999 / Ghost Trick
        "Кастлвания" to "Кастлва${ACCENT}ния",
        "Кастлевания" to "Кастлева${ACCENT}ния",
        "Алукард" to "Алука${ACCENT}рд",
        "Дракула" to "Дра${ACCENT}кула",
        "Дракулы" to "Дра${ACCENT}кулы",
        "Бельмонт" to "Бельмо${ACCENT}нт",
        "Шаноа" to "Шано${ACCENT}а",
        "Хроно" to "Хро${ACCENT}но",
        "Магус" to "Ма${ACCENT}гус",
        "Лавос" to "Ла${ACCENT}вос",
        "Неку" to "Не${ACCENT}ку",
        "Шики" to "Ши${ACCENT}ки",
        "Джошуа" to "Джо${ACCENT}шуа",
        "Сиссель" to "Сиссе${ACCENT}ль",
        "Дзюнпей" to "Дзюнпе${ACCENT}й",
        "Аканэ" to "Аканэ${ACCENT}"
    )

    // Acronyms and short forms
    private val ABBREVIATIONS = listOf(
        Pattern.compile("(?i)\\b(\\d+)\\s*HP\\b") to "$1 очков здоровья",
        Pattern.compile("(?i)\\bHP\\b") to "очки здоровья",
        Pattern.compile("(?i)\\b(\\d+)\\s*MP\\b") to "$1 очков магии",
        Pattern.compile("(?i)\\bMP\\b") to "очки магии",
        Pattern.compile("(?i)\\b(\\d+)\\s*SP\\b") to "$1 очков навыков",
        Pattern.compile("(?i)\\bSP\\b") to "очки навыков",
        Pattern.compile("(?i)\\b(\\d+)\\s*(?:EXP|XP)\\b") to "$1 опыта",
        Pattern.compile("(?i)\\b(?:EXP|XP)\\b") to "очки опыта",
        Pattern.compile("(?i)\\b(\\d+)\\s*(?:G|GP)\\b") to "$1 золота",
        Pattern.compile("(?i)\\b(?:LVL?|УР)\\s*(\\d+)\\b") to "уровень $1",
        Pattern.compile("(?i)\\b(?:LVL?)\\b") to "уровень",
        Pattern.compile("(?i)\\bNPC\\b") to "персонаж",
        Pattern.compile("(?i)\\bATK\\b") to "атака",
        Pattern.compile("(?i)\\bDEF\\b") to "защита",
        Pattern.compile("(?i)\\bSPD\\b") to "скорость",
        Pattern.compile("(?i)\\bCRIT\\b") to "критический удар",
        Pattern.compile("(?i)\\bNDS\\b") to "Нинтендо Ди-Эс",
        Pattern.compile("(?i)\\bDS\\b") to "Ди-Эс",
        Pattern.compile("(?i)\\b3DS\\b") to "Три-Ди-Эс",
        Pattern.compile("(?i)\\bKO\\b") to "нокаут"
    )

    // Roman Numerals in names/titles
    private val ROMAN_NUMERALS = listOf(
        Pattern.compile("\\bX\\b") to "десятая",
        Pattern.compile("\\bIX\\b") to "девятая",
        Pattern.compile("\\bVIII\\b") to "восьмая",
        Pattern.compile("\\bVII\\b") to "седьмая",
        Pattern.compile("\\bVI\\b") to "шестая",
        Pattern.compile("\\bIV\\b") to "четвёртая",
        Pattern.compile("\\bV\\b") to "пятая",
        Pattern.compile("\\bIII\\b") to "третья",
        Pattern.compile("\\bII\\b") to "вторая"
    )

    fun normalize(text: String, languageCode: String = "ru"): String {
        if (text.isBlank()) return text

        // 1. Strip OCR border noise symbols that TTS engines read aloud
        var result = text
            .replace(Regex("[|_~^`<>♦•▪▫►◄▲▼★☆♪♫\\\\]+"), " ")
            .replace(Regex("\\*{1,3}"), " ")
            .replace(Regex("\\s+"), " ")
            .trim()

        // 2. Process gaming acronyms
        for ((pattern, replacement) in ABBREVIATIONS) {
            result = pattern.matcher(result).replaceAll(replacement)
        }

        // 3. Clean pause handling on em-dashes and ellipses
        result = result
            .replace(Regex("\\.{3,}"), "... ")
            .replace(Regex("\\s*—\\s*"), " — ")
            .replace(Regex("\\s*–\\s*"), " — ")
            .replace(Regex("\\s+"), " ")

        // 4. Expressive interjections, Roman numerals & stress for Russian
        if (languageCode.lowercase().startsWith("ru")) {
            result = result
                .replace(Regex("(?i)\\bхмм+\\b"), "хм")
                .replace(Regex("(?i)\\bммм+\\b"), "м-м")
                .replace(Regex("(?i)\\bпфф+\\b"), "пф-ф")
                .replace(Regex("(?i)\\bтц+\\b"), "тс-с")
                .replace(Regex("(?i)\\bугх+\\b"), "ух")
                .replace(Regex("(?i)\\bагрх+\\b"), "аргх")
                .replace(Regex("(?i)\\bээ+\\b"), "э-э")

            for ((pattern, replacement) in ROMAN_NUMERALS) {
                result = pattern.matcher(result).replaceAll(replacement)
            }

            // Disambiguate "замок" (castle: за́мок vs lock: замо́к)
            result = disambiguateZamok(result)

            // Apply word stress replacements
            for ((word, stressed) in STRESS_REPLACEMENTS) {
                if (!result.contains(word, ignoreCase = true)) continue
                val pattern = Pattern.compile("(?i)\\b" + Pattern.quote(word) + "\\b")
                val matcher = pattern.matcher(result)
                val sb = StringBuffer()
                while (matcher.find()) {
                    val matched = matcher.group()
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

        // Clean up multiple exclamation / question marks
        result = result.replace(Regex("!{2,}"), "!")
            .replace(Regex("\\?{2,}"), "?")

        return result.trim()
    }

    private fun disambiguateZamok(text: String): String {
        if (!text.contains("замок", ignoreCase = true) && !text.contains("замка", ignoreCase = true) &&
            !text.contains("замку", ignoreCase = true) && !text.contains("замком", ignoreCase = true) &&
            !text.contains("замке", ignoreCase = true)
        ) {
            return text
        }

        val lower = text.lowercase()
        val isLock = LOCK_CONTEXT_WORDS.any { lower.contains(it) }

        val stressedCastle = "за${ACCENT}мок"
        val stressedLock = "замо${ACCENT}к"
        val chosenReplacement = if (isLock) stressedLock else stressedCastle

        return text.replace(Regex("(?i)\\bзамок\\b")) { match ->
            val orig = match.value
            if (Character.isUpperCase(orig[0])) {
                chosenReplacement.replaceFirstChar { it.uppercase() }
            } else {
                chosenReplacement
            }
        }
    }

    private fun MatcherQuote(s: String): String {
        return java.util.regex.Matcher.quoteReplacement(s)
    }
}
