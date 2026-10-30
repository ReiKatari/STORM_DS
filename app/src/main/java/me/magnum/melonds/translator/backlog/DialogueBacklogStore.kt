package me.magnum.melonds.translator.backlog

import java.text.SimpleDateFormat
import java.util.ArrayDeque
import java.util.Date
import java.util.Locale
import java.util.UUID
import java.util.concurrent.CopyOnWriteArrayList
import kotlin.math.abs

/**
 * Thread-Safe Circular Dialogue Backlog Buffer.
 *
 * Stores the last 50 recognized and translated dialogue turns with:
 * - Smart Levenshtein-based OCR deduplication (difference <= 1 noise char updates top entry)
 * - Exact 24-hour time formatting (HH:mm:ss / HH:mm)
 * - Observers notification on new or updated dialogue lines
 */
class DialogueBacklogStore(
    private val capacity: Int = 50
) {
    data class DialogueItem(
        val id: String = UUID.randomUUID().toString(),
        val timestampMs: Long = System.currentTimeMillis(),
        val formattedTime: String = formatTime(timestampMs),
        val sourceText: String,
        val translatedText: String,
        val sourceLang: String,
        val targetLang: String
    ) {
        val formattedTimeShort: String
            get() = formatTimeShort(timestampMs)
    }

    private val lock = Any()
    private val buffer = ArrayDeque<DialogueItem>(capacity)
    private val listeners = CopyOnWriteArrayList<() -> Unit>()

    /**
     * Adds a new dialogue turn or updates the existing top entry if it represents
     * the same ongoing dialogue box with minor OCR flicker (Levenshtein distance <= 1).
     */
    fun addOrUpdate(
        sourceText: String,
        translatedText: String,
        sourceLang: String,
        targetLang: String,
        allowDeduplication: Boolean = true
    ): DialogueItem {
        synchronized(lock) {
            val cleanSource = sourceText.trim()
            val cleanTrans = translatedText.trim()

            val top = buffer.peekFirst()
            if (allowDeduplication && top != null) {
                val sourceSimilar = isSimilar(top.sourceText, cleanSource)
                val transSimilar = isSimilar(top.translatedText, cleanTrans)

                if (sourceSimilar || transSimilar) {
                    val updated = top.copy(
                        timestampMs = System.currentTimeMillis(),
                        formattedTime = formatTime(System.currentTimeMillis()),
                        sourceText = if (cleanSource.length >= top.sourceText.length) cleanSource else top.sourceText,
                        translatedText = if (cleanTrans.length >= top.translatedText.length) cleanTrans else top.translatedText,
                        sourceLang = sourceLang,
                        targetLang = targetLang
                    )
                    buffer.removeFirst()
                    buffer.addFirst(updated)
                    notifyListeners()
                    return updated
                }
            }

            if (buffer.size >= capacity) {
                buffer.removeLast()
            }

            val newItem = DialogueItem(
                sourceText = cleanSource,
                translatedText = cleanTrans,
                sourceLang = sourceLang,
                targetLang = targetLang
            )
            buffer.addFirst(newItem)
            notifyListeners()
            return newItem
        }
    }

    fun getAll(): List<DialogueItem> {
        synchronized(lock) {
            return buffer.toList()
        }
    }

    fun clear() {
        synchronized(lock) {
            buffer.clear()
        }
        notifyListeners()
    }

    fun size(): Int {
        synchronized(lock) {
            return buffer.size
        }
    }

    fun addListener(listener: () -> Unit) {
        listeners.add(listener)
    }

    fun removeListener(listener: () -> Unit) {
        listeners.remove(listener)
    }

    private fun notifyListeners() {
        for (listener in listeners) {
            try {
                listener.invoke()
            } catch (_: Throwable) {}
        }
    }

    companion object {
        fun formatTime(timestampMs: Long): String {
            val sdf = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
            return sdf.format(Date(timestampMs))
        }

        fun formatTimeShort(timestampMs: Long): String {
            val sdf = SimpleDateFormat("HH:mm", Locale.getDefault())
            return sdf.format(Date(timestampMs))
        }

        /**
         * Checks whether two OCR strings represent the same speech turn.
         * Returns true if strings are identical or differ by <= 1 noise character.
         */
        fun isSimilar(a: String, b: String): Boolean {
            val s1 = a.trim()
            val s2 = b.trim()
            if (s1.equals(s2, ignoreCase = true)) return true
            if (abs(s1.length - s2.length) > 2) return false
            return levenshteinDistance(s1, s2) <= 1
        }

        /**
         * Dynamic programming Levenshtein distance.
         */
        fun levenshteinDistance(s1: String, s2: String): Int {
            if (s1 == s2) return 0
            if (s1.isEmpty()) return s2.length
            if (s2.isEmpty()) return s1.length

            var prev = IntArray(s2.length + 1) { it }
            var curr = IntArray(s2.length + 1)

            for (i in s1.indices) {
                curr[0] = i + 1
                for (j in s2.indices) {
                    val cost = if (s1[i].equals(s2[j], ignoreCase = true)) 0 else 1
                    curr[j + 1] = minOf(
                        curr[j] + 1,        // insertion
                        prev[j + 1] + 1,    // deletion
                        prev[j] + cost      // substitution
                    )
                }
                val temp = prev
                prev = curr
                curr = temp
            }
            return prev[s2.length]
        }
    }
}
