package me.magnum.melonds.translator.ocr

/**
 * Sentence-aware assembly of OCR fragments.
 *
 * DS games wrap dialogue manually, so ML Kit often returns one sentence as several lines or even
 * several text blocks ("Batman, I'm so glad you could join" + "me."). Translating those pieces
 * separately destroys the meaning ("...ты присоединился" + "Мне."). These helpers decide when two
 * fragments belong to the same sentence and join them into one translatable string.
 */
object DialogueSentenceAssembler {

    private val strictTerminals = charArrayOf('.', '!', '?', '。', '！', '？', '‼', '⁉')
    private val closingMarks = charArrayOf('"', '\'', '”', '’', '»', '」', '』', ')', '）', '】', ']')
    private val softEndings = charArrayOf(',', '，', '、', ';', '；', ':', '：', '-', '–', '—', '…')

    /** Joins the lines of one fragment, repairing words hyphenated across line breaks. */
    fun joinFragments(parts: List<String>, isCjk: Boolean): String {
        val builder = StringBuilder()
        for (raw in parts) {
            val part = raw.trim()
            if (part.isEmpty()) continue
            if (builder.isEmpty()) {
                builder.append(part)
                continue
            }
            if (isCjk) {
                builder.append(part)
                continue
            }
            val endsWithHyphen = builder.length >= 2
                && builder[builder.length - 1] == '-'
                && builder[builder.length - 2].isLetter()
            if (endsWithHyphen && part.first().isLowerCase()) {
                builder.setLength(builder.length - 1)
                builder.append(part)
            } else {
                builder.append(' ').append(part)
            }
        }
        return builder.toString()
    }

    /** True when [text] ends a sentence (terminal punctuation, optionally followed by closing quotes). */
    fun endsSentence(text: String): Boolean {
        var t = text.trimEnd()
        while (t.isNotEmpty() && t.last() in closingMarks) {
            t = t.dropLast(1).trimEnd()
        }
        if (t.isEmpty()) return true
        if (t.endsWith("...") || t.last() == '…') return false
        return t.last() in strictTerminals
    }

    private fun endsSoftly(text: String): Boolean {
        val t = text.trimEnd()
        return t.isNotEmpty() && (t.last() in softEndings || t.endsWith("..."))
    }

    private fun startsLowercase(text: String): Boolean {
        val first = text.trimStart().firstOrNull { it.isLetterOrDigit() } ?: return false
        return first.isLetter() && first.isLowerCase()
    }

    /**
     * True when [next] most likely continues the sentence started in [previous].
     * For CJK there are no case cues, so only the terminal punctuation of [previous] counts.
     */
    fun continuesSentence(previous: String, next: String, isCjk: Boolean): Boolean {
        if (previous.isBlank() || next.isBlank()) return false
        if (isCjk) return !endsSentence(previous)
        if (startsLowercase(next)) return true
        if (endsSoftly(previous)) return true
        // No terminal punctuation and the next fragment does not look like a new speaker tag/menu item.
        return !endsSentence(previous) && previous.trim().length >= 12
    }

    /**
     * Final safety net for every OCR result (custom regions, split-screen passes, cached frames):
     * merges blocks only on strong continuation cues (next starts lowercase, or previous ends with
     * a comma/dash/ellipsis) when they are vertically adjacent and horizontally related.
     */
    fun mergeSentenceContinuations(
        blocks: List<me.magnum.melonds.translator.model.TranslatedTextBlock>
    ): List<me.magnum.melonds.translator.model.TranslatedTextBlock> {
        if (blocks.size <= 1) return blocks
        val sorted = blocks.sortedWith(compareBy({ it.boundingBox.top }, { it.boundingBox.left }))
        val result = mutableListOf<me.magnum.melonds.translator.model.TranslatedTextBlock>()
        for (block in sorted) {
            val prev = result.lastOrNull()
            if (prev != null && isStrongContinuation(prev, block)) {
                val box = android.graphics.RectF(
                    minOf(prev.boundingBox.left, block.boundingBox.left),
                    minOf(prev.boundingBox.top, block.boundingBox.top),
                    maxOf(prev.boundingBox.right, block.boundingBox.right),
                    maxOf(prev.boundingBox.bottom, block.boundingBox.bottom)
                )
                result[result.size - 1] = prev.copy(
                    originalText = joinFragments(listOf(prev.originalText, block.originalText), prev.isCjk),
                    boundingBox = box
                )
            } else {
                result += block
            }
        }
        return result
    }

    private fun isStrongContinuation(
        a: me.magnum.melonds.translator.model.TranslatedTextBlock,
        b: me.magnum.melonds.translator.model.TranslatedTextBlock
    ): Boolean {
        val strongCue = if (a.isCjk) {
            !endsSentence(a.originalText)
        } else {
            !endsSentence(a.originalText) && (startsLowercase(b.originalText) || endsSoftly(a.originalText))
        }
        if (!strongCue) return false
        if (a.screenIndex != b.screenIndex) return false
        val lineH = minOf(a.boundingBox.height(), b.boundingBox.height()).coerceAtLeast(0.005f)
        val gap = b.boundingBox.top - a.boundingBox.bottom
        if (gap > lineH * 2.0f || gap < -lineH) return false
        val overlap = maxOf(0f, minOf(a.boundingBox.right, b.boundingBox.right) - maxOf(a.boundingBox.left, b.boundingBox.left))
        val minW = minOf(a.boundingBox.width(), b.boundingBox.width())
        val leftAligned = kotlin.math.abs(a.boundingBox.left - b.boundingBox.left) <= maxOf(a.boundingBox.width(), b.boundingBox.width()) * 0.15f
        return (minW > 0f && overlap / minW >= 0.3f) || leftAligned
    }
}
