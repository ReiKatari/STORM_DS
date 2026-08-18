package me.magnum.melonds.translator.questlog

import android.content.Context
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

data class QuestLogEntry(
    val id: Long,
    val speaker: String,
    val text: String,
    val location: String,
    val timestamp: String,
    val isKeyObjective: Boolean
)

/**
 * AI Quest Log & Dialogue History Manager for RPG games (Dragon Quest, Final Fantasy, Pokemon, Zelda).
 * Automatically chronologizes translated in-game dialogue into an interactive story quest journal.
 */
object AiQuestLogManager {
    private val _questEntries = MutableStateFlow<List<QuestLogEntry>>(emptyList())
    val questEntries = _questEntries.asStateFlow()

    private val timeFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())

    fun recordDialogue(speaker: String, text: String, location: String = "Мир приключений") {
        if (text.isBlank()) return

        val cleanText = text.trim()
        val isObjective = cleanText.contains("найди", ignoreCase = true) ||
                cleanText.contains("отправляйся", ignoreCase = true) ||
                cleanText.contains("победи", ignoreCase = true) ||
                cleanText.contains("спаси", ignoreCase = true) ||
                cleanText.contains("ключ", ignoreCase = true) ||
                cleanText.contains("принеси", ignoreCase = true) ||
                cleanText.contains("тайна", ignoreCase = true) ||
                cleanText.contains("find", ignoreCase = true) ||
                cleanText.contains("defeat", ignoreCase = true) ||
                cleanText.contains("quest", ignoreCase = true)

        val entry = QuestLogEntry(
            id = System.currentTimeMillis(),
            speaker = speaker.ifBlank { "Собеседник" },
            text = cleanText,
            location = location,
            timestamp = timeFormat.format(Date()),
            isKeyObjective = isObjective
        )

        val current = _questEntries.value.toMutableList()
        // Avoid duplicate identical consecutive lines
        if (current.lastOrNull()?.text != cleanText) {
            current.add(entry)
            if (current.size > 150) current.removeAt(0)
            _questEntries.value = current
        }
    }

    fun clearLog() {
        _questEntries.value = emptyList()
    }
}
