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

    private val COMPILED_STRESS_REPLACEMENTS: List<Triple<String, Pattern, String>> = STRESS_REPLACEMENTS.map { (word, stressed) ->
        Triple(
            word,
            Pattern.compile("\\b" + Pattern.quote(word) + "\\b", Pattern.CASE_INSENSITIVE or Pattern.UNICODE_CASE),
            stressed
        )
    }

    private val STRIP_SYMBOLS_REGEX = Regex("[|_~^`<>♦•▪▫►◄▲▼★☆♪♫\\\\]+")
    private val STRIP_STARS_REGEX = Regex("\\*{1,3}")
    private val MULTI_SPACE_REGEX = Regex("\\s+")
    private val ELLIPSIS_REGEX = Regex("\\.{3,}")
    private val EM_DASH_REGEX = Regex("\\s*—\\s*")
    private val EN_DASH_REGEX = Regex("\\s*–\\s*")
    private val INTERJECTION_HMM = Regex("(?iu)\\bхмм+\\b")
    private val INTERJECTION_MMM = Regex("(?iu)\\bммм+\\b")
    private val INTERJECTION_PFF = Regex("(?iu)\\bпфф+\\b")
    private val INTERJECTION_TSS = Regex("(?iu)\\bтц+\\b")
    private val INTERJECTION_UGH = Regex("(?iu)\\bугх+\\b")
    private val INTERJECTION_ARGH = Regex("(?iu)\\bагрх+\\b")
    private val INTERJECTION_EEE = Regex("(?iu)\\bээ+\\b")
    private val MULTI_EXCL_REGEX = Regex("!{2,}")
    private val MULTI_QST_REGEX = Regex("\\?{2,}")
    private val ZAMOK_REGEX = Regex("(?iu)\\b(замок|замка|замку|замком|замке)\\b")

    private val ROMAN_MASC_MAP = mapOf(
        "X" to "десятый",
        "IX" to "девятый",
        "VIII" to "восьмой",
        "VII" to "седьмой",
        "VI" to "шестой",
        "IV" to "четвёртый",
        "V" to "пятый",
        "III" to "третий",
        "II" to "второй"
    )

    private val ROMAN_FEM_MAP = mapOf(
        "X" to "десятая",
        "IX" to "девятая",
        "VIII" to "восьмая",
        "VII" to "седьмая",
        "VI" to "шестая",
        "IV" to "четвёртая",
        "V" to "пятая",
        "III" to "третья",
        "II" to "вторая"
    )

    // Contextual Roman numerals only (never standalone X/V in buttons or titles like "Mega Man X")
    private val ROMAN_MASC_CONTEXT_REGEX = Regex(
        "(?iu)\\b(акт|том|век|уровень|эпизод|этап|сезон|класс|ранг|тир)\\s+(?-i)(X|IX|VIII|VII|VI|IV|V|III|II)\\b"
    )
    private val ROMAN_FEM_CONTEXT_REGEX = Regex(
        "(?iu)\\b(глава|часть|серия|книга|версия|ступень|стадия|фаза|эпоха|Final\\s+Fantasy|Dragon\\s+Quest|Persona|Shin\\s+Megami\\s+Tensei|Castlevania|Phantasy\\s+Star|Fire\\s+Emblem)\\s+(?-i)(X|IX|VIII|VII|VI|IV|V|III|II)\\b"
    )

    fun normalize(text: String, languageCode: String = "ru"): String {
        if (text.isBlank()) return text

        // 1. Strip OCR border noise symbols that TTS engines read aloud
        var result = text
            .replace(STRIP_SYMBOLS_REGEX, " ")
            .replace(STRIP_STARS_REGEX, " ")
            .replace(MULTI_SPACE_REGEX, " ")
            .trim()

        // 2. Process gaming acronyms
        for ((pattern, replacement) in ABBREVIATIONS) {
            result = pattern.matcher(result).replaceAll(replacement)
        }

        // 3. Clean pause handling on em-dashes and ellipses
        result = result
            .replace(ELLIPSIS_REGEX, "... ")
            .replace(EM_DASH_REGEX, " — ")
            .replace(EN_DASH_REGEX, " — ")
            .replace(MULTI_SPACE_REGEX, " ")

        // 4. Expressive interjections, contextual Roman numerals & stress for Russian
        if (languageCode.lowercase().startsWith("ru")) {
            result = result
                .replace(INTERJECTION_HMM, "хм")
                .replace(INTERJECTION_MMM, "м-м")
                .replace(INTERJECTION_PFF, "пф-ф")
                .replace(INTERJECTION_TSS, "тс-с")
                .replace(INTERJECTION_UGH, "ух")
                .replace(INTERJECTION_ARGH, "аргх")
                .replace(INTERJECTION_EEE, "э-э")

            result = ROMAN_FEM_CONTEXT_REGEX.replace(result) { match ->
                val prefix = match.groupValues[1]
                val numeral = match.groupValues[2]
                "$prefix ${ROMAN_FEM_MAP[numeral] ?: numeral}"
            }
            result = ROMAN_MASC_CONTEXT_REGEX.replace(result) { match ->
                val prefix = match.groupValues[1]
                val numeral = match.groupValues[2]
                "$prefix ${ROMAN_MASC_MAP[numeral] ?: numeral}"
            }

            // Disambiguate "замок" (castle: за́мок vs lock: замо́к) across inflected forms
            result = disambiguateZamok(result)

            // Apply precompiled word stress replacements
            for ((word, pattern, stressed) in COMPILED_STRESS_REPLACEMENTS) {
                if (!result.contains(word, ignoreCase = true)) continue
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
        result = result.replace(MULTI_EXCL_REGEX, "!")
            .replace(MULTI_QST_REGEX, "?")

        return result.trim()
    }

    private fun disambiguateZamok(text: String): String {
        if (!text.contains("зам", ignoreCase = true)) {
            return text
        }

        val lower = text.lowercase()
        val isLock = LOCK_CONTEXT_WORDS.any { lower.contains(it) }

        return ZAMOK_REGEX.replace(text) { match ->
            val orig = match.value
            val formLower = orig.lowercase()
            val stressed = when (formLower) {
                "замок" -> if (isLock) "замо${ACCENT}к" else "за${ACCENT}мок"
                "замка" -> if (isLock) "замка${ACCENT}" else "за${ACCENT}мка"
                "замку" -> if (isLock) "замку${ACCENT}" else "за${ACCENT}мку"
                "замком" -> if (isLock) "замко${ACCENT}м" else "за${ACCENT}мком"
                "замке" -> if (isLock) "замке${ACCENT}" else "за${ACCENT}мке"
                else -> orig
            }
            if (orig.isNotEmpty() && Character.isUpperCase(orig[0])) {
                stressed.replaceFirstChar { it.uppercase() }
            } else {
                stressed
            }
        }
    }

    private fun MatcherQuote(s: String): String {
        return java.util.regex.Matcher.quoteReplacement(s)
    }
}
