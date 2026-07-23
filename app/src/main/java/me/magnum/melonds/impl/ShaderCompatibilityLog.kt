package me.magnum.melonds.impl

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import java.io.File
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ShaderCompatibilityLog @Inject constructor(
    @ApplicationContext private val context: Context,
) {

    companion object {
        private const val MAX_ENTRIES = 200
        private const val FILE_NAME = "shader-compatibility.log"
    }

    data class Entry(
        val timestampMillis: Long,
        val backend: String,
        val succeeded: Boolean,
        val presetPath: String,
        val sourceSize: String,
        val outputSize: String,
        val reason: String,
    ) {
        val presetName: String
            get() = presetPath.substringAfter("retroarch-shaders/installed/", presetPath.substringAfterLast('/'))
    }

    private val logFile = File(context.filesDir, FILE_NAME)
    private val timestampFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US)

    @Synchronized
    fun append(records: Array<String>): List<Entry> {
        if (records.isEmpty()) {
            return emptyList()
        }

        val now = System.currentTimeMillis()
        val entries = records.mapNotNull { record ->
            val parts = record.split('\t')
            if (parts.size < 5) return@mapNotNull null
            Entry(
                timestampMillis = now,
                backend = parts[0],
                succeeded = parts[1] == "OK",
                presetPath = parts[2],
                sourceSize = parts[3],
                outputSize = parts[4],
                reason = parts.getOrNull(5).orEmpty(),
            )
        }
        if (entries.isEmpty()) {
            return emptyList()
        }

        runCatching {
            val existing = if (logFile.isFile) logFile.readLines() else emptyList()
            val appended = entries.map { entry ->
                buildString {
                    append(timestampFormat.format(Date(entry.timestampMillis)))
                    append('\t').append(entry.backend)
                    append('\t').append(if (entry.succeeded) "OK" else "FAIL")
                    append('\t').append(entry.presetName)
                    append('\t').append(entry.sourceSize).append(" -> ").append(entry.outputSize)
                    if (entry.reason.isNotBlank()) {
                        append('\t').append(entry.reason.replace('\n', ' ').replace('\r', ' '))
                    }
                }
            }
            val combined = (existing + appended).takeLast(MAX_ENTRIES)
            logFile.writeText(combined.joinToString("\n", postfix = "\n"))
        }

        return entries
    }

    @Synchronized
    fun read(): List<String> {
        return runCatching { if (logFile.isFile) logFile.readLines() else emptyList() }.getOrDefault(emptyList())
    }

    @Synchronized
    fun clear() {
        runCatching { logFile.delete() }
    }

    fun hasEntries(): Boolean = logFile.isFile && logFile.length() > 0
}
