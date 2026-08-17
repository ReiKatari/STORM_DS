package me.magnum.melonds.translator.util

object GameTextCleaner {

    private val GLOSSARY_REPLACEMENTS = listOf(
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
    )

    /**
     * Cleans raw OCR text and intelligently reconstructs broken dialogue sentences.
     * Video games break sentences across narrow lines; reconstructing them into whole
     * sentences prevents fragmented, low-quality machine translations.
     */
    fun prepareForTranslation(rawText: String): String {
        val lines = rawText.lines()
            .map { cleanOcrNoise(it) }
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

    private fun cleanOcrNoise(line: String): String {
        return line.trim()
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

        if (targetLang.lowercase().startsWith("ru")) {
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
