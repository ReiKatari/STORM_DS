package me.magnum.melonds.translator.tts

import java.util.regex.Pattern

/**
 * Studio Script Normalizer for Russian & Multilingual Text-to-Speech engines:
 * - Fixes stress (ударения) on 150+ gaming characters, locations, and RPG terms using combining acute accent (U+0301).
 * - Strips OCR border artifacts (|, ~, *, _, stray brackets) so voice actors never read symbol names aloud.
 * - Normalizes emotional interjections, stutters, and elongated cries for natural studio voice acting.
 * - Expands gaming abbreviations (HP, MP, EXP, LVL, ATK, DEF, etc.) into natural Russian speech.
 */
object RussianTtsNormalizer {

    // Combining acute accent for Russian stress
    private const val ACCENT = "\u0301"

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
        "Клавир" to "Клави${ACCENT}р",
        "Лейтон" to "Ле${ACCENT}йтон",
        "Лейтона" to "Ле${ACCENT}йтона",
        "Челми" to "Че${ACCENT}лми",
        "Дескоул" to "Деско${ACCENT}ул",
        "Флора" to "Фло${ACCENT}ра",
        "Пикараты" to "Пикара${ACCENT}ты",
        "пикаратов" to "пикара${ACCENT}тов",

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
        "Арикадо" to "Арика${ACCENT}до",
        "Шаноа" to "Шано${ACCENT}а",
        "Дракула" to "Дра${ACCENT}кула",
        "Дракулы" to "Дра${ACCENT}кулы",
        "Бельмонт" to "Бе${ACCENT}льмонт",
        "Кроно" to "Кро${ACCENT}но",
        "Хроно" to "Хро${ACCENT}но",
        "Лукка" to "Лу${ACCENT}кка",
        "Магус" to "Ма${ACCENT}гус",
        "Лавос" to "Ла${ACCENT}вос",
        "Сесил" to "Се${ACCENT}сил",
        "Голбез" to "Го${ACCENT}лбез",
        "Ридия" to "Ри${ACCENT}дия",
        "Балтьер" to "Балтье${ACCENT}р",
        "Роксас" to "Ро${ACCENT}ксас",
        "Аксель" to "А${ACCENT}ксель",
        "Ксемнас" to "Ксе${ACCENT}мнас",
        "Сора" to "Со${ACCENT}ра",
        "Неку" to "Не${ACCENT}ку",
        "Шики" to "Ши${ACCENT}ки",
        "Джошуа" to "Джо${ACCENT}шуа",
        "Джунпей" to "Джунпе${ACCENT}й",
        "Аканэ" to "Ака${ACCENT}нэ",
        "Сиссел" to "Си${ACCENT}ссел",
        "Кабанела" to "Кабане${ACCENT}ла",
        "Клауд" to "Кла${ACCENT}уд",
        "Сефирот" to "Сефиро${ACCENT}т",
        "Данте" to "Да${ACCENT}нте",
        "Кратос" to "Кра${ACCENT}тос",
        "Вескер" to "Ве${ACCENT}скер",

        // Common Gaming / RPG Terms
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
        "загрузка" to "загру${ACCENT}зка",
        "улика" to "ули${ACCENT}ка",
        "улики" to "ули${ACCENT}ки",
        "показания" to "показа${ACCENT}ния",
        "протестую" to "протесту${ACCENT}ю",
        "постойте" to "посто${ACCENT}йте",
        "получайте" to "получа${ACCENT}йте"
    )

    // Acronyms and short forms
    private val ABBREVIATIONS = listOf(
        Pattern.compile("\\bHP\\b", Pattern.CASE_INSENSITIVE) to "очки здоровья",
        Pattern.compile("\\bMP\\b", Pattern.CASE_INSENSITIVE) to "очки маны",
        Pattern.compile("\\bSP\\b", Pattern.CASE_INSENSITIVE) to "очки навыков",
        Pattern.compile("\\bEXP\\b", Pattern.CASE_INSENSITIVE) to "очки опыта",
        Pattern.compile("\\bXP\\b", Pattern.CASE_INSENSITIVE) to "очки опыта",
        Pattern.compile("\\bNPC\\b", Pattern.CASE_INSENSITIVE) to "персонаж",
        Pattern.compile("\\bLVL?\\b", Pattern.CASE_INSENSITIVE) to "уровень",
        Pattern.compile("\\bATK\\b", Pattern.CASE_INSENSITIVE) to "атака",
        Pattern.compile("\\bDEF\\b", Pattern.CASE_INSENSITIVE) to "защита",
        Pattern.compile("\\bCRIT\\b", Pattern.CASE_INSENSITIVE) to "критический удар",
        Pattern.compile("\\bNDS\\b", Pattern.CASE_INSENSITIVE) to "Нинтендо Ди-Эс",
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
        Pattern.compile("\\bIV\\b") to "четвёртая",
        Pattern.compile("\\bV\\b") to "пятая",
        Pattern.compile("\\bIII\\b") to "третья",
        Pattern.compile("\\bII\\b") to "вторая"
    )

    fun normalize(text: String, languageCode: String = "ru"): String {
        if (text.isBlank()) return text

        // 1. Strip OCR border noise symbols that TTS engines otherwise read aloud ("вертикальная черта", "звёздочка")
        var result = text
            .replace(Regex("[|_~^`<>♦•▪▫►◄▲▼★☆♪♫]+"), " ")
            .replace(Regex("\\*{1,3}"), " ")
            .replace(Regex("\\s+"), " ")
            .trim()

        // 2. Process gaming acronyms
        for ((pattern, replacement) in ABBREVIATIONS) {
            result = pattern.matcher(result).replaceAll(replacement)
        }

        // 3. Expressive interjections & Roman numerals for Russian
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
            .replace(Regex("\\.{3,}"), "...")

        return result.trim()
    }

    private fun MatcherQuote(s: String): String {
        return java.util.regex.Matcher.quoteReplacement(s)
    }
}
