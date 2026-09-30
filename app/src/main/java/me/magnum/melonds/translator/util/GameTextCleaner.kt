package me.magnum.melonds.translator.util

object GameTextCleaner {

    /**
     * Cleans raw OCR text and normalizes dialogue sentences.
     * Prevents fragmented or noisy text from harming machine translation accuracy.
     */
    fun prepareForTranslation(rawText: String): String {
        val lines = rawText.lines()
            .map { cleanOcrNoise(it) }
            .map { repairPixelArtOcrText(it) }
            .filter { it.isNotBlank() }

        if (lines.isEmpty()) return ""
        if (lines.size == 1) return lines.first()

        // Check if lines are distinct menu items or entries
        val isLikelyMenu = lines.all { it.length < 28 && !it.endsWith('.') && !it.endsWith('!') && !it.endsWith('?') }
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
                if (prev.endsWith('-')) {
                    // Hyphenated word split across lines
                    reconstructed.setLength(reconstructed.length - 1)
                    reconstructed.append(line)
                } else {
                    reconstructed.append(" ").append(line)
                }
            }
        }

        return reconstructed.toString().trim()
    }

    /**
     * Fixes classic 8x8 retro font glyph misrecognitions inside words without corrupting
     * legitimate numbers, levels, statistics, or gaming abbreviations (e.g., "1P", "HP 100", "LV 15").
     */
    fun repairPixelArtOcrText(rawText: String): String {
        var text = rawText

        // Fix '0' confused with 'o' inside words surrounded by letters
        text = text.replace(Regex("([a-zA-Z])0([a-zA-Z])")) { "${it.groupValues[1]}o${it.groupValues[2]}" }
        text = text.replace(Regex("(?i)\\by0u\\b"), "you")
        text = text.replace(Regex("(?i)\\bc0me\\b"), "come")
        text = text.replace(Regex("(?i)\\bg0\\b"), "go")
        text = text.replace(Regex("(?i)\\bt0\\b"), "to")
        text = text.replace(Regex("(?i)\\bn0\\b"), "no")
        text = text.replace(Regex("(?i)\\bf0r\\b"), "for")
        text = text.replace(Regex("(?i)\\bfr0m\\b"), "from")

        // Fix '1', '|', '!' confused with lowercase 'l' inside words surrounded by letters
        text = text.replace(Regex("([a-zA-Z])[1|!]([a-zA-Z])")) { "${it.groupValues[1]}l${it.groupValues[2]}" }
        text = text.replace(Regex("(?i)\\bp1ease\\b"), "please")
        text = text.replace(Regex("(?i)\\bhe11o\\b"), "hello")
        text = text.replace(Regex("(?i)\\bshou1d\\b"), "should")
        text = text.replace(Regex("(?i)\\bcann0t\\b"), "cannot")

        return text
    }

    private fun cleanOcrNoise(line: String): String {
        return line.trim()
            // Remove floating button artifact ("TR", "[TR]")
            .replace(Regex("(?i)^\\[?TR\\]?[:\\s]+\\s*"), "")
            // Remove stray edge scan noise (bullets, pipes, tildes, hyphens at boundaries)
            .replace(Regex("^[•|~>_—\\-]+\\s*"), "")
            .replace(Regex("\\s*[•|~_—\\-]+$"), "")
            .replace(Regex("\\s+"), " ")
            .trim()
    }

    /**
     * Polishes translated text: ensures proper capitalization, clean punctuation spacing,
     * and strips residual artifacts.
     */
    fun polishTranslation(translatedText: String, targetLang: String): String {
        if (translatedText.isBlank()) return translatedText

        var text = translatedText.trim()

        // Clean stray leading floating button artifacts
        text = text.replace(Regex("(?i)^\\[?TR\\]?[:\\s]+\\s*"), "")

        // Fix spacing before punctuation (e.g. "слово ?" -> "слово?")
        text = text.replace(Regex("\\s+([.,!?:;…])"), "$1")

        // Capitalize first letter of sentences
        text = text.replace(Regex("(^|[.!?]\\s+)([a-zа-яё])")) { match ->
            match.groupValues[1] + match.groupValues[2].uppercase()
        }

        return text.trim()
    }
}
