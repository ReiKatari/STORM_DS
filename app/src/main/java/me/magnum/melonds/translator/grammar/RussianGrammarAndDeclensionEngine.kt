package me.magnum.melonds.translator.grammar

import java.util.Locale
import java.util.regex.Pattern

/**
 * 6-Case Russian Declension Engine and Grammatical Gender Agreement Post-Processor.
 *
 * Implements:
 * 1. 6-case Russian proper-noun and term declension (И, Р, Д, В, Т, П) with prepositional triggers.
 * 2. Strict Russian literary indeclinability laws (Japanese/foreign stems in -о, -у, -и, -э, -ю
 *    and consonant-ending female surnames remain 100% invariant).
 * 3. 1st-person female past-tense verb agreement after "я" (including irregulars and short adjectives).
 * 4. Elimination of bracketed machine-translation forms ("готов(а)", "понял(а)").
 * 5. Phonetic euphony (в/во, с/со, к/ко, о/об/обо) and unambiguous "ё" restoration.
 */
object RussianGrammarAndDeclensionEngine {

    enum class RussianCase {
        NOMINATIVE,    // Именительный: Кто? Что?
        GENITIVE,      // Родительный: Кого? Чего?
        DATIVE,        // Дательный: Кому? Чему?
        ACCUSATIVE,    // Винительный: Кого? Что?
        INSTRUMENTAL,  // Творительный: Кем? Чем?
        PREPOSITIONAL  // Предложный: О ком? О чем?
    }

    // Prepositions triggering specific cases
    private val GENITIVE_PREPOSITIONS = setOf(
        "у", "без", "от", "для", "из", "около", "возле", "вокруг", "до", "кроме", "из-за", "из-под"
    )
    private val DATIVE_PREPOSITIONS = setOf(
        "к", "ко", "по", "благодаря", "согласно", "вопреки"
    )
    private val ACCUSATIVE_PREPOSITIONS = setOf(
        "про", "через", "сквозь"
    )
    private val INSTRUMENTAL_PREPOSITIONS = setOf(
        "с", "со", "между", "над", "перед"
    )
    private val PREPOSITIONAL_PREPOSITIONS = setOf(
        "о", "об", "обо", "при"
    )

    // Foreign vowel endings that are 100% indeclinable in literary Russian
    private val INDECLINABLE_VOWEL_ENDINGS = listOf("о", "у", "и", "э", "ю", "е")

    // Guard non-verb nouns ending in -л to prevent false-positive verb inflections
    private val MASCULINE_NOUNS_ENDING_IN_L = setOf(
        "стол", "пол", "зал", "балл", "кристалл", "портал", "металл", "генерал",
        "кинжал", "вокзал", "финал", "сигнал", "журнал", "оригинал", "символ",
        "ангел", "дьявол", "орел", "орёл", "козел", "козёл", "узел", "пепел",
        "факел", "ствол", "угол", "укол", "чехол", "футбол", "посол", "котёл",
        "котел", "гул", "тыл", "пыл", "ил", "пылесос", "арсенал", "канал",
        "бокал", "вокал", "подвал", "провал", "интервал", "завал", "развал",
        "обвал", "привал", "ритуал", "материал", "филиал", "сериал", "потенциал",
        "мемориал", "скандал", "квартал", "фестиваль", "штиль", "стиль", "купол",
        "дятел", "сусел", "павел", "титул", "раздел", "выстрел", "предел", "удел"
    )

    // Irregular Russian 1st-person past tense verbs (masculine -> female)
    private val IRREGULAR_FEMALE_VERBS = mapOf(
        "пришёл" to "пришла", "пришел" to "пришла",
        "ушёл" to "ушла", "ушел" to "ушла",
        "нашёл" to "нашла", "нашел" to "нашла",
        "пошёл" to "пошла", "пошел" to "пошла",
        "вошёл" to "вошла", "вошел" to "вошла",
        "вышел" to "вышла",
        "прошёл" to "прошла", "прошел" to "прошла",
        "дошёл" to "дошла", "дошел" to "дошла",
        "обошёл" to "обошла", "обошел" to "обошла",
        "зашёл" to "зашла", "зашел" to "зашла",
        "отошёл" to "отошла", "отошел" to "отошла",
        "подошёл" to "подошла", "подошел" to "подошла",
        "сошёл" to "сошла", "сошел" to "сошла",
        "перешёл" to "перешла", "перешел" to "перешла",
        "разошёлся" to "разошлась", "разошелся" to "разошлась",
        "смог" to "смогла",
        "мог" to "могла",
        "помог" to "помогла",
        "нанёс" to "нанесла", "нанес" to "нанесла",
        "принёс" to "принесла", "принес" to "принесла",
        "унёс" to "унесла", "унес" to "унесла",
        "перенёс" to "перенесла", "перенес" to "перенесла",
        "спас" to "спасла",
        "провёл" to "провела", "провел" to "провела",
        "привёл" to "привела", "привел" to "привела",
        "увёл" to "увела", "увел" to "увела",
        "ввёл" to "ввела", "ввел" to "ввела",
        "ошибся" to "ошиблась",
        "испугался" to "испугалась",
        "вернулся" to "вернулась",
        "оказался" to "оказалась",
        "остался" to "осталась",
        "собрался" to "собралась",
        "проснулся" to "проснулась",
        "улыбнулся" to "улыбнулась",
        "удивился" to "удивилась",
        "надеялся" to "надеялась",
        "боялся" to "боялась",
        "старался" to "старалась",
        "согласился" to "согласилась",
        "разобрался" to "разобралась",
        "догадался" to "догадалась",
        "постарался" to "постаралась",
        "отказался" to "отказалась",
        "задумался" to "задумалась",
        "направился" to "направилась",
        "сдался" to "сдалась",
        "показался" to "показалась"
    )

    // Short adjectives & predicatives after "я" (masculine -> female)
    private val SHORT_ADJECTIVES_FEMALE = mapOf(
        "рад" to "рада",
        "готов" to "готова",
        "должен" to "должна",
        "обязан" to "обязана",
        "уверен" to "уверена",
        "согласен" to "согласна",
        "удивлён" to "удивлена", "удивлен" to "удивлена",
        "потрясён" to "потрясена", "потрясен" to "потрясена",
        "ранен" to "ранена",
        "счастлив" to "счастлива",
        "благодарен" to "благодарна",
        "виноват" to "виновата",
        "занят" to "занята",
        "прав" to "права",
        "сам" to "сама",
        "один" to "одна",
        "спокоен" to "спокойна",
        "голоден" to "голодна"
    )

    // Bracketed gendered endings from machine translation
    private val BRACKETED_FORMS_PATTERN = Pattern.compile(
        "([А-Яа-яЁё]+)\\((?:а|на|ла|я)\\)"
    )

    // Specific common bracketed replacements
    private val KNOWN_BRACKETED = mapOf(
        "готов(а)" to ("готов" to "готова"),
        "рад(а)" to ("рад" to "рада"),
        "понял(а)" to ("понял" to "поняла"),
        "должен(на)" to ("должен" to "должна"),
        "ранен(а)" to ("ранен" to "ранена"),
        "сам(а)" to ("сам" to "сама"),
        "согласен(на)" to ("согласен" to "согласна"),
        "уверен(а)" to ("уверен" to "уверена"),
        "видел(а)" to ("видел" to "видела"),
        "знал(а)" to ("знал" to "знала"),
        "думал(а)" to ("думал" to "думала"),
        "сделал(а)" to ("сделал" to "сделала"),
        "хотел(а)" to ("хотел" to "хотела"),
        "сказал(а)" to ("сказал" to "сказала"),
        "ушёл(ла)" to ("ушёл" to "ушла"),
        "ушел(ла)" to ("ушел" to "ушла"),
        "пришёл(ла)" to ("пришёл" to "пришла"),
        "пришел(ла)" to ("пришел" to "пришла")
    )

    /**
     * Declines a Russian proper noun or game term into all 6 cases.
     * Respects literary indeclinability laws for Japanese/foreign names.
     */
    fun generateAllCases(noun: String, gender: Gender = Gender.NEUTRAL): Map<RussianCase, String> {
        val trimmed = noun.trim()
        if (trimmed.isBlank()) return RussianCase.values().associateWith { trimmed }

        // Multiple words (e.g. "Майя Фей" or "Феникс Райт")
        val words = trimmed.split(Regex("\\s+"))
        if (words.size > 1) {
            val declinedPerWord = words.map { word ->
                // For female surnames ending in consonants ("Фей", "Скай"), surname remains invariant!
                val isSurname = word != words.first()
                if (gender == Gender.FEMALE && isSurname && !word.endsWith("а") && !word.endsWith("я") && !word.endsWith("ая") && !word.endsWith("яя")) {
                    RussianCase.values().associateWith { word }
                } else {
                    declineSingleNounAllCases(word, gender)
                }
            }
            return RussianCase.values().associateWith { rCase ->
                declinedPerWord.joinToString(" ") { it[rCase] ?: words.first() }
            }
        }

        return declineSingleNounAllCases(trimmed, gender)
    }

    private fun declineSingleNounAllCases(word: String, gender: Gender): Map<RussianCase, String> {
        val lower = word.lowercase(Locale.ROOT)

        // Foreign/Japanese stems ending in vowels (-о, -у, -и, -э, -ю, -е) are 100% invariant
        for (vowel in INDECLINABLE_VOWEL_ENDINGS) {
            if (lower.endsWith(vowel)) {
                return RussianCase.values().associateWith { word }
            }
        }

        // Female names ending in consonants (e.g. "Кармен", "Энн", "Скай", "Фей") are invariant
        if (gender == Gender.FEMALE && !lower.endsWith("а") && !lower.endsWith("я")) {
            return RussianCase.values().associateWith { word }
        }

        // 1st declension: feminine & masculine in -а / -я (e.g. "Майя", "Синтия", "Алёна")
        if (lower.endsWith("а") || lower.endsWith("я")) {
            val isSoft = lower.endsWith("я")
            val stem = word.dropLast(1)
            val isIa = lower.endsWith("ия")

            val genitive = if (isIa) stem + "и" else if (isSoft) stem + "и" else stem + (if (isVelarOrSibilant(stem.takeLast(1))) "и" else "ы")
            val dative = if (isIa) stem + "и" else stem + "е"
            val accusative = if (isSoft) stem + "ю" else stem + "у"
            val instrumental = if (isSoft) stem + "ей" else stem + "ой"
            val prepositional = if (isIa) stem + "и" else stem + "е"

            return mapOf(
                RussianCase.NOMINATIVE to word,
                RussianCase.GENITIVE to genitive,
                RussianCase.DATIVE to dative,
                RussianCase.ACCUSATIVE to accusative,
                RussianCase.INSTRUMENTAL to instrumental,
                RussianCase.PREPOSITIONAL to prepositional
            )
        }

        // 2nd declension: masculine in consonant (e.g. "Феникс", "Эджворт", "Лейтон")
        if (gender == Gender.MALE || gender == Gender.NEUTRAL) {
            val stem = word
            return mapOf(
                RussianCase.NOMINATIVE to word,
                RussianCase.GENITIVE to stem + "а",
                RussianCase.DATIVE to stem + "у",
                RussianCase.ACCUSATIVE to stem + "а", // Animate masculine accusative = genitive
                RussianCase.INSTRUMENTAL to stem + "ом",
                RussianCase.PREPOSITIONAL to stem + "е"
            )
        }

        return RussianCase.values().associateWith { word }
    }

    private fun isVelarOrSibilant(char: String): Boolean {
        return char.lowercase(Locale.ROOT) in setOf("г", "к", "х", "ж", "ч", "ш", "щ")
    }

    /**
     * Determines the required Russian grammatical case by the preceding preposition.
     */
    fun matchCaseByPrecedingPreposition(precedingWord: String): RussianCase? {
        val prep = precedingWord.trim().lowercase(Locale.ROOT)
        return when {
            prep in GENITIVE_PREPOSITIONS -> RussianCase.GENITIVE
            prep in DATIVE_PREPOSITIONS -> RussianCase.DATIVE
            prep in ACCUSATIVE_PREPOSITIONS -> RussianCase.ACCUSATIVE
            prep in INSTRUMENTAL_PREPOSITIONS -> RussianCase.INSTRUMENTAL
            prep in PREPOSITIONAL_PREPOSITIONS -> RussianCase.PREPOSITIONAL
            else -> null
        }
    }

    /**
     * Universal Russian Grammatical Gender Agreement Post-Processor.
     * Works across ALL translation engines (Google, ML Kit, DeepL, Custom AI).
     */
    fun harmonizeGenderAndStyle(
        text: String,
        speakerGender: Gender,
        speakerName: String = "",
        targetLang: String = "ru"
    ): String {
        if (!targetLang.lowercase(Locale.ROOT).startsWith("ru")) return text
        if (text.isBlank()) return text

        var result = text

        // 1. Resolve and eliminate ugly bracketed MT forms
        result = eliminateBracketedForms(result, speakerGender)

        // 2. Female 1st-person past-tense verbal inflection after "я"
        if (speakerGender == Gender.FEMALE) {
            result = inflectFemaleFirstPersonVerbs(result)
        }

        // 3. Fix phonetic euphony (в/во, с/со, к/ко, о/об/обо)
        result = fixPhoneticEuphony(result)

        // 4. Restore unambiguous Russian "ё"
        result = restoreYo(result)

        return result
    }

    private fun eliminateBracketedForms(text: String, speakerGender: Gender): String {
        var res = text
        for ((pattern, pair) in KNOWN_BRACKETED) {
            if (res.contains(pattern, ignoreCase = true)) {
                val replacement = if (speakerGender == Gender.FEMALE) pair.second else pair.first
                res = res.replace(pattern, replacement, ignoreCase = true)
            }
        }

        // Catch general regex bracketed forms: "видел(а)" -> "видела" or "видел"
        val matcher = BRACKETED_FORMS_PATTERN.matcher(res)
        val sb = StringBuffer()
        while (matcher.find()) {
            val stem = matcher.group(1).orEmpty()
            val matched = matcher.group(0).orEmpty()
            val replacement = if (speakerGender == Gender.FEMALE) {
                if (matched.endsWith("(а)")) stem + "а"
                else if (matched.endsWith("(на)")) stem + "на"
                else if (matched.endsWith("(ла)")) stem + "ла"
                else if (matched.endsWith("(я)")) stem + "я"
                else stem
            } else {
                stem
            }
            matcher.appendReplacement(sb, MatcherQuote(replacement))
        }
        matcher.appendTail(sb)
        return sb.toString()
    }

    private fun inflectFemaleFirstPersonVerbs(text: String): String {
        // Match 1st person triggers: "я", "я не", "я уже", "я только", "я просто", "я бы", "я же", "я ведь"
        // Also conjunctions: "что я", "когда я", "если я", "разве я", "потому что я"
        val triggerRegex = Pattern.compile(
            "(?i)(?:\\b(?:что|когда|если|разве|потому\\s+что|пока)\\s+)?\\bя\\s+(?:не\\s+|уже\\s+|только\\s+|просто\\s+|бы\\s+|же\\s+|ведь\\s+|всегда\\s+|никогда\\s+|тоже\\s+|также\\s+|совсем\\s+)*([А-Яа-яЁё]+)"
        )

        var result = text
        val matcher = triggerRegex.matcher(result)
        val sb = StringBuffer()

        while (matcher.find()) {
            val fullMatch = matcher.group(0).orEmpty()
            val verb = matcher.group(1).orEmpty()
            val verbLower = verb.lowercase(Locale.ROOT)

            var replacedVerb: String? = null

            // 1. Irregulars
            val irregular = IRREGULAR_FEMALE_VERBS[verbLower]
            if (irregular != null) {
                replacedVerb = matchCase(verb, irregular)
            }
            // 2. Short adjectives
            else if (SHORT_ADJECTIVES_FEMALE.containsKey(verbLower)) {
                replacedVerb = matchCase(verb, SHORT_ADJECTIVES_FEMALE[verbLower]!!)
            }
            // 3. Regular past-tense verbs in -л / -лся (guarding non-verb nouns like стол, пол, зал)
            else if (verbLower.endsWith("л") && verbLower !in MASCULINE_NOUNS_ENDING_IN_L && verbLower.length >= 4) {
                replacedVerb = matchCase(verb, verbLower + "а")
            } else if (verbLower.endsWith("лся") && verbLower.length >= 6) {
                replacedVerb = matchCase(verb, verbLower.dropLast(3) + "лась")
            }

            if (replacedVerb != null) {
                val prefix = fullMatch.substring(0, fullMatch.length - verb.length)
                matcher.appendReplacement(sb, MatcherQuote(prefix + replacedVerb))
            } else {
                matcher.appendReplacement(sb, MatcherQuote(fullMatch))
            }
        }
        matcher.appendTail(sb)
        result = sb.toString()

        return result
    }

    private fun fixPhoneticEuphony(text: String): String {
        var res = text

        // в -> во перед в/ф + согласная, а также перед мне, мной, всеми, всем, всякий
        res = res.replace(Regex("(?i)\\bв\\s+мне\\b"), "во мне")
        res = res.replace(Regex("(?i)\\bв\\s+мной\\b"), "во мне")
        res = res.replace(Regex("(?i)\\bв\\s+всех\\b"), "во всех")
        res = res.replace(Regex("(?i)\\bв\\s+всем\\b"), "во всем")
        res = res.replace(Regex("(?i)\\bв\\s+всём\\b"), "во всём")
        res = res.replace(Regex("(?i)\\bв\\s+всяком\\b"), "во всяком")
        res = res.replace(Regex("(?i)\\bв\\s+Франции\\b"), "во Франции")
        res = res.replace(Regex("(?i)\\bв\\s+сне\\b"), "во сне")
        res = res.replace(Regex("(?i)\\bв\\s+дворе\\b"), "во дворе")
        res = res.replace(Regex("(?i)\\bв\\s+взгляде\\b"), "во взгляде")

        // с -> со перед мне, мной, всеми, всем, снегом, слезами
        res = res.replace(Regex("(?i)\\bс\\s+мной\\b"), "со мной")
        res = res.replace(Regex("(?i)\\bс\\s+мне\\b"), "со мной")
        res = res.replace(Regex("(?i)\\bс\\s+всеми\\b"), "со всеми")
        res = res.replace(Regex("(?i)\\bс\\s+всем\\b"), "со всем")
        res = res.replace(Regex("(?i)\\bс\\s+снегом\\b"), "со снегом")
        res = res.replace(Regex("(?i)\\bс\\s+слезами\\b"), "со слезами")

        // к -> ко перед мне, мной, всему, всем
        res = res.replace(Regex("(?i)\\bк\\s+мне\\b"), "ко мне")
        res = res.replace(Regex("(?i)\\bк\\s+всему\\b"), "ко всему")
        res = res.replace(Regex("(?i)\\bк\\s+всем\\b"), "ко всем")

        // о -> об перед гласными а, о, у, э, и, е, ё, ю, я
        res = res.replace(Regex("(?i)\\bо\\s+([аоуэиеёюяАОУЭИЕЁЮЯ][а-яёА-ЯЁ]*)")) { match ->
            val word = match.groupValues[1]
            if (word.equals("мне", ignoreCase = true)) "обо мне"
            else "об $word"
        }

        return res
    }

    private fun restoreYo(text: String): String {
        val yoMap = mapOf(
            "еще" to "ещё",
            "Еще" to "Ещё",
            "вперед" to "вперёд",
            "Вперед" to "Вперёд",
            "черный" to "чёрный",
            "Черный" to "Чёрный",
            "черная" to "чёрная",
            "Черная" to "Чёрная",
            "желтый" to "жёлтый",
            "Желтый" to "Жёлтый",
            "слезы" to "слёзы",
            "Слезы" to "Слёзы",
            "серьезно" to "серьёзно",
            "Серьезно" to "Серьёзно",
            "серьезный" to "серьёзный",
            "Серьезный" to "Серьёзный",
            "тяжелый" to "тяжёлый",
            "Тяжелый" to "Тяжёлый",
            "легкий" to "лёгкий",
            "Легкий" to "Лёгкий",
            "определенно" to "определённо",
            "Определенно" to "Определённо",
            "четвертый" to "четвёртый",
            "Четвертый" to "Четвёртый",
            "нашел" to "нашёл",
            "Нашел" to "Нашёл",
            "пришел" to "пришёл",
            "Пришел" to "Пришёл",
            "ушел" to "ушёл",
            "Ушел" to "Ушёл",
            "пошел" to "пошёл",
            "Пошел" to "Пошёл",
            "вошел" to "вошёл",
            "Вошел" to "Вошёл"
        )

        var res = text
        for ((plain, yo) in yoMap) {
            res = res.replace(Regex("\\b$plain\\b"), yo)
        }
        return res
    }

    private fun matchCase(original: String, target: String): String {
        if (original.isEmpty() || target.isEmpty()) return target
        return if (Character.isUpperCase(original[0])) {
            target.replaceFirstChar { it.uppercase(Locale.ROOT) }
        } else {
            target.lowercase(Locale.ROOT)
        }
    }

    private fun MatcherQuote(s: String): String {
        return java.util.regex.Matcher.quoteReplacement(s)
    }
}
