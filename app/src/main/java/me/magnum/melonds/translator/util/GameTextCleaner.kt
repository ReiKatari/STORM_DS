package me.magnum.melonds.translator.util

object GameTextCleaner {

    private val GLOSSARY_REPLACEMENTS = listOf(
        // Speaker name translations (Chrono Trigger, Pokémon, Dragon Quest, Final Fantasy)
        Regex("(?i)^TR\\s+Mother[i:;]?\\s*") to "Мама: ",
        Regex("(?i)^TR\\s+Mom[i:;]?\\s*") to "Мама: ",
        Regex("(?i)^TR\\s+") to "",
        Regex("(?i)\\bMother[i:;]?\\s*") to "Мама: ",
        Regex("(?i)\\bMom[i:;]?\\s*") to "Мама: ",
        Regex("(?i)\\bFather[i:;]?\\s*") to "Папа: ",
        Regex("(?i)\\bDad[i:;]?\\s*") to "Папа: ",
        Regex("(?i)\\bBrother[i:;]?\\s*") to "Брат: ",
        Regex("(?i)\\bSister[i:;]?\\s*") to "Сестра: ",
        Regex("(?i)\\bGrandpa[i:;]?\\s*") to "Дедушка: ",
        Regex("(?i)\\bGrandma[i:;]?\\s*") to "Бабушка: ",
        Regex("(?i)\\bDoctor[i:;]?\\s*") to "Доктор: ",
        Regex("(?i)\\bProfessor[i:;]?\\s*") to "Профессор: ",
        Regex("(?i)\\bKing[i:;]?\\s*") to "Король: ",
        Regex("(?i)\\bQueen[i:;]?\\s*") to "Королева: ",
        Regex("(?i)\\bPrincess[i:;]?\\s*") to "Принцесса: ",
        Regex("(?i)\\bMayor[i:;]?\\s*") to "Мэр: ",
        Regex("(?i)\\bGuard[i:;]?\\s*") to "Стражник: ",
        Regex("(?i)\\bSoldier[i:;]?\\s*") to "Солдат: ",
        Regex("(?i)\\bVillager[i:;]?\\s*") to "Житель: ",
        Regex("(?i)\\bMerchant[i:;]?\\s*") to "Торговец: ",
        Regex("(?i)\\bShopkeeper[i:;]?\\s*") to "Продавец: ",
        Regex("(?i)\\bInnkeeper[i:;]?\\s*") to "Трактирщик: ",
        Regex("(?i)\\bElder[i:;]?\\s*") to "Старейшина: ",
        Regex("(?i)\\bNarrator[i:;]?\\s*") to "Рассказчик: ",

        // Common JRPG / Nintendo phrases and idioms
        Regex("(?i)\\bCome on,?\\s+sleepyhead!?\\s*It'?s time to get up!?") to "Просыпайся, соня! Пора вставать!",
        Regex("(?i)\\bCome on,?\\s+sleepyhead!?") to "Просыпайся, соня!",
        Regex("(?i)\\bSleepyhead\\b") to "соня",
        Regex("(?i)\\bIt'?s time to get up!?") to "Пора вставать!",
        Regex("(?i)\\bНу\\s+или,?\\s+соня!?") to "Просыпайся, соня!",
        Regex("(?i)\\bДавай\\s+или\\s+соня!?") to "Просыпайся, соня!",
        Regex("(?i)\\bДавай или дурак!?") to "Просыпайся, соня!",
        Regex("(?i)\\bДавай\\s+или\\s+дурак\\b") to "Просыпайся, соня",
        Regex("(?i)\\bНу\\s+давай,?\\s+соня!?") to "Просыпайся, соня!",
        Regex("(?i)\\bДавай,?\\s+соня!?") to "Просыпайся, соня!",
        Regex("(?i)\\bWake up!?") to "Просыпайся!",
        Regex("(?i)\\bGet up!?") to "Вставай!",
        Regex("(?i)\\bNew Game\\b") to "Новая игра",
        Regex("(?i)\\bContinue\\b") to "Продолжить",
        Regex("(?i)\\bOptions\\b") to "Настройки",
        Regex("(?i)\\bSettings\\b") to "Настройки",
        Regex("(?i)\\bLoad Game\\b") to "Загрузить игру",
        Regex("(?i)\\bSave Game\\b") to "Сохранить игру",
        Regex("(?i)\\bGame Over\\b") to "Игра окончена",
        Regex("(?i)\\bPress Start\\b") to "Нажмите START",
        Regex("(?i)\\bTouch the Touch Screen\\b") to "Коснитесь сенсорного экрана",
        Regex("(?i)\\bTouch to Start\\b") to "Коснитесь для начала",
        Regex("(?i)\\bTap to Begin\\b") to "Нажмите для старта",
        Regex("(?i)\\bPower Button\\b") to "кнопку питания",
        Regex("(?i)\\bPower button\\b") to "кнопку питания",
        Regex("(?i)\\bOperations Manual\\b") to "Руководство по эксплуатации",
        Regex("(?i)\\bOperation Manual\\b") to "Руководство по эксплуатации",
        Regex("(?i)\\bTouch Screen\\b") to "Сенсорный экран",
        Regex("(?i)\\bUpper Screen\\b") to "Верхний экран",
        Regex("(?i)\\bLower Screen\\b") to "Нижний экран",
        Regex("(?i)\\bMain Menu\\b") to "Главное меню",
        Regex("(?i)\\bSystem Settings\\b") to "Системные настройки",
        Regex("(?i)\\bPress and hold\\b") to "Нажмите и удерживайте",
        Regex("(?i)\\bPress AND HOLD\\b") to "НАЖМИТЕ И УДЕРЖИВАЙТЕ",
        Regex("(?i)\\bInventory\\b") to "Инвентарь",
        Regex("(?i)\\bEquipment\\b") to "Снаряжение",
        Regex("(?i)\\bStatus\\b") to "Статус",
        Regex("(?i)\\bQuest\\b") to "Задание",
        Regex("(?i)\\bQuests\\b") to "Задания",
        Regex("(?i)\\bAttack\\b") to "Атака",
        Regex("(?i)\\bMagic\\b") to "Магия",
        Regex("(?i)\\bDefend\\b") to "Защита",
        Regex("(?i)\\bItem\\b") to "Предмет",
        Regex("(?i)\\bItems\\b") to "Предметы",
        Regex("(?i)\\bRun away\\b") to "Сбежать",
        Regex("(?i)\\bEscape\\b") to "Побег",
        Regex("(?i)\\bLevel Up!?\\b") to "Новый уровень!",
        Regex("(?i)\\bExperience\\b") to "Опыт",
        Regex("(?i)\\bWhat'?s going on\\??") to "Что происходит?",
        Regex("(?i)\\bWhat happened\\??") to "Что случилось?",
        Regex("(?i)\\bAre you ready\\??") to "Ты готов?",
        Regex("(?i)\\bLet'?s go!?") to "Погнали!",
        Regex("(?i)\\bWait a minute!?") to "Минуточку!",
        Regex("(?i)\\bHold on!?") to "Погоди-ка!",
        Regex("(?i)\\bGood morning!?") to "Доброе утро!",
        Regex("(?i)\\bGood night!?") to "Спокойной ночи!",
        Regex("(?i)\\bThank you very much!?") to "Большое спасибо!",
        Regex("(?i)\\bYou'?re welcome!?") to "Пожалуйста!",
        Regex("(?i)\\bSee you later!?") to "Увидимся!",
    )

    /**
     * Cleans raw OCR text and intelligently reconstructs broken dialogue sentences.
     * Video games break sentences across narrow lines; reconstructing them into whole
     * sentences prevents fragmented, low-quality machine translations.
     */
    fun prepareForTranslation(rawText: String): String {
        val lines = rawText.lines()
            .map { cleanOcrNoise(it) }
            .map { repairPixelArtOcrText(it) }
            .filter { it.isNotBlank() }

        if (lines.isEmpty()) return ""
        if (lines.size == 1) return lines.first()

        // Check if lines look like separate menu items (short lines, no trailing punctuation)
        val isLikelyMenu = lines.all { it.length < 25 && !it.endsWith('.') && !it.endsWith('!') && !it.endsWith('?') }
        if (isLikelyMenu) {
            return lines.joinToString("\n")
        }

        val reconstructed = StringBuilder()
        for (i in lines.indices) {
            val line = lines[i]
            if (reconstructed.isEmpty()) {
                reconstructed.append(line)
            } else {
                val prev = reconstructed.toString()
                // If previous line ended with a hyphen indicating a broken word (e.g. "con- \n tinue")
                if (prev.endsWith('-')) {
                    reconstructed.setLength(reconstructed.length - 1)
                    reconstructed.append(line)
                } else if (prev.endsWith('.') || prev.endsWith('!') || prev.endsWith('?') || prev.endsWith(':')) {
                    reconstructed.append(" ").append(line)
                } else {
                    // Continuous sentence split across lines in game dialog
                    reconstructed.append(" ").append(line)
                }
            }
        }

        return reconstructed.toString().trim()
    }

    /**
     * Fixes classic 8x8 pixel font glyph misrecognitions in video games:
     * - '1', '|', 'I', '!' confused with lowercase 'l' in words: e.g. "he11o" -> "hello", "p1ease" -> "please", "shou1d" -> "should"
     * - '0' confused with 'o' / 'O' in words: e.g. "c0me" -> "come", "y0u" -> "you", "g0" -> "go"
     * - '5' confused with 'S' / 's' in words: e.g. "5tart" -> "Start", "5word" -> "Sword"
     * - '8' confused with 'B' / 'b' in words: e.g. "8oss" -> "Boss"
     */
    fun repairPixelArtOcrText(rawText: String): String {
        var text = rawText
        // Fix 1/|/! inside words
        text = text.replace(Regex("([a-zA-Z])[1|!]([a-zA-Z])")) { "${it.groupValues[1]}l${it.groupValues[2]}" }
        text = text.replace(Regex("(?i)\\b([a-z])[1|!]([a-z]+)\\b")) { "${it.groupValues[1]}l${it.groupValues[2]}" }
        text = text.replace(Regex("(?i)\\b1([a-z]{2,})\\b")) { "l${it.groupValues[1]}" }
        text = text.replace(Regex("(?i)\\b([a-z]+)1\\b")) { "${it.groupValues[1]}l" }

        // Fix 0 inside words
        text = text.replace(Regex("([a-zA-Z])0([a-zA-Z])")) { "${it.groupValues[1]}o${it.groupValues[2]}" }
        text = text.replace(Regex("(?i)\\by0u\\b"), "you")
        text = text.replace(Regex("(?i)\\bc0me\\b"), "come")
        text = text.replace(Regex("(?i)\\bg0\\b"), "go")
        text = text.replace(Regex("(?i)\\bt0\\b"), "to")
        text = text.replace(Regex("(?i)\\bn0\\b"), "no")
        text = text.replace(Regex("(?i)\\bf0r\\b"), "for")
        text = text.replace(Regex("(?i)\\bfr0m\\b"), "from")

        // Fix 5/8 inside words
        text = text.replace(Regex("(?i)\\b5([a-z]{2,})\\b")) { "S${it.groupValues[1]}" }
        text = text.replace(Regex("(?i)\\b8([a-z]{2,})\\b")) { "B${it.groupValues[1]}" }

        return text
    }

    private fun cleanOcrNoise(line: String): String {
        return line.trim()
            // Clean stray leading floating button artifacts e.g. "TR ", "TR: ", "[TR] "
            .replace(Regex("(?i)^\\[?TR\\]?[:\\s]+\\s*"), "")
            // Clean stray leading OCR artifacts like "l: P. ", "1: P. ", "| ", "> ", "• ", "[l] ", "I: "
            .replace(Regex("^[lI1|!:\'\"\\s\\.\\,\\-\\_~>•\\[\\]]+(?=[A-ZА-Яa-zа-я])"), "")
            .replace(Regex("(?i)^([lI1|!:\'\"\\.\\,\\-\\_]+\\s+)+"), "")
            .replace(Regex("^[|•>~_—\\-]+\\s*"), "")
            .replace(Regex("\\s*[|•>~_—\\-]+$"), "")
            .replace(Regex("\\s+"), " ")
            .trim()
    }

    /**
     * Polishes translated text with game localization terms, proper Russian capitalization,
     * punctuation spacing, and typography.
     */
    fun polishTranslation(translatedText: String, targetLang: String): String {
        if (translatedText.isBlank()) return translatedText

        var text = translatedText.trim()

        // Clean stray leading floating button artifacts
        text = text.replace(Regex("(?i)^\\[?TR\\]?[:\\s]+\\s*"), "")

        if (targetLang.lowercase().startsWith("ru")) {
            // Clean stray initial OCR punctuation/artifacts
            text = text.replace(Regex("^[lI1|!:\'\"\\s\\.\\,\\-\\_~>•\\[\\]]+(?=[A-ZА-Яa-zа-я])"), "")

            // Apply localization terms
            for ((pattern, replacement) in GLOSSARY_REPLACEMENTS) {
                text = text.replace(pattern, replacement)
            }

            // Fix spacing before punctuation (e.g., "слово ?" -> "слово?")
            text = text.replace(Regex("\\s+([.,!?:;…])"), "$1")

            // Ensure first letter of sentences is capitalized
            text = text.replace(Regex("(^|[.!?]\\s+)([a-zа-яё])")) { match ->
                match.groupValues[1] + match.groupValues[2].uppercase()
            }
        }

        return text
    }
}
