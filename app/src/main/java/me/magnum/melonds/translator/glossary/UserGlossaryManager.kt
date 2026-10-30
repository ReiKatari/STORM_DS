package me.magnum.melonds.translator.glossary

import android.content.Context
import android.os.Environment
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import org.json.JSONArray
import org.json.JSONObject
import java.io.File
import java.text.Normalizer
import java.util.concurrent.ConcurrentHashMap
import java.util.regex.Matcher

/**
 * User Glossary & Character Name Dictionary Manager.
 *
 * Persists custom translation dictionaries in .stormdict.json format:
 * - Primary storage: /storage/emulated/0/STORM DS/translator/dictionaries/global.stormdict.json
 * - Fallback storage: <context.filesDir>/translator/dictionaries/global.stormdict.json
 * - Optional per-game dictionaries: <storageDir>/<gameKey>.stormdict.json
 *
 * Ensures consistent terminology and prevents character names from being corrupted by machine translation.
 */
class UserGlossaryManager(
    private val context: Context,
    var onCacheInvalidate: ((String) -> Unit)? = null
) {
    data class GlossaryEntry(
        val sourceTerm: String,
        val targetTerm: String,
        val caseSensitive: Boolean = false
    )

    private val scope = CoroutineScope(Dispatchers.IO + SupervisorJob())
    private val globalEntries = ConcurrentHashMap<String, GlossaryEntry>()
    private val gameEntries = ConcurrentHashMap<String, GlossaryEntry>()

    private var activeGameKey: String = "global"

    private val primaryBaseDir = File("/storage/emulated/0/STORM DS/translator/dictionaries")
    private val fallbackBaseDir by lazy { File(context.filesDir, "translator/dictionaries") }

    init {
        ensureDirectories()
        loadDictionaries()
    }

    private fun ensureDirectories() {
        try {
            if (!primaryBaseDir.exists()) primaryBaseDir.mkdirs()
        } catch (_: Throwable) {}
        try {
            if (!fallbackBaseDir.exists()) fallbackBaseDir.mkdirs()
        } catch (_: Throwable) {}
    }

    private fun getStorageDir(): File {
        return try {
            val extState = Environment.getExternalStorageState()
            if (extState == Environment.MEDIA_MOUNTED && (primaryBaseDir.exists() || primaryBaseDir.mkdirs()) && primaryBaseDir.canWrite()) {
                primaryBaseDir
            } else {
                if (!fallbackBaseDir.exists()) fallbackBaseDir.mkdirs()
                fallbackBaseDir
            }
        } catch (_: Throwable) {
            if (!fallbackBaseDir.exists()) fallbackBaseDir.mkdirs()
            fallbackBaseDir
        }
    }

    fun getDictionaryFile(gameKey: String = "global"): File {
        val safeKey = sanitizeKey(gameKey)
        val dir = getStorageDir()
        val file = File(dir, "$safeKey.stormdict.json")
        // If file doesn't exist in primary but exists in fallback, return fallback
        if (!file.exists() && dir != fallbackBaseDir) {
            val fallbackFile = File(fallbackBaseDir, "$safeKey.stormdict.json")
            if (fallbackFile.exists()) return fallbackFile
        }
        return file
    }

    fun getDictionaryFilePath(isGameSpecific: Boolean = false): String {
        val key = if (isGameSpecific && activeGameKey != "global") activeGameKey else "global"
        return getDictionaryFile(key).absolutePath
    }

    fun setGameKey(gameKey: String?) {
        val safeKey = sanitizeKey(gameKey ?: "global")
        if (safeKey == activeGameKey && gameEntries.isNotEmpty()) return

        activeGameKey = safeKey
        gameEntries.clear()
        if (safeKey != "global") {
            loadEntriesFromFile(getDictionaryFile(safeKey), gameEntries)
        }
    }

    fun getActiveGameKey(): String = activeGameKey

    @Synchronized
    fun loadDictionaries() {
        globalEntries.clear()
        loadEntriesFromFile(getDictionaryFile("global"), globalEntries)

        if (activeGameKey != "global") {
            gameEntries.clear()
            loadEntriesFromFile(getDictionaryFile(activeGameKey), gameEntries)
        }
    }

    private fun loadEntriesFromFile(file: File, targetMap: MutableMap<String, GlossaryEntry>) {
        if (!file.exists() || !file.isFile) return
        try {
            val content = file.readText(Charsets.UTF_8).trim()
            if (content.isEmpty()) return

            if (content.startsWith("{")) {
                val json = JSONObject(content)
                if (json.has("entries")) {
                    val array = json.getJSONArray("entries")
                    for (i in 0 until array.length()) {
                        val obj = array.getJSONObject(i)
                        val source = obj.optString("sourceTerm", "").trim()
                        val target = obj.optString("targetTerm", "").trim()
                        val caseSens = obj.optBoolean("caseSensitive", false)
                        if (source.isNotBlank() && target.isNotBlank()) {
                            targetMap[normalizeTermKey(source, caseSens)] = GlossaryEntry(source, target, caseSens)
                        }
                    }
                } else {
                    // Flat key-value format support
                    val keys = json.keys()
                    while (keys.hasNext()) {
                        val k = keys.next()
                        val v = json.optString(k, "").trim()
                        if (k.isNotBlank() && v.isNotBlank()) {
                            targetMap[normalizeTermKey(k, false)] = GlossaryEntry(k, v, false)
                        }
                    }
                }
            } else if (content.startsWith("[")) {
                val array = JSONArray(content)
                for (i in 0 until array.length()) {
                    val obj = array.getJSONObject(i)
                    val source = obj.optString("sourceTerm", "").trim()
                    val target = obj.optString("targetTerm", "").trim()
                    val caseSens = obj.optBoolean("caseSensitive", false)
                    if (source.isNotBlank() && target.isNotBlank()) {
                        targetMap[normalizeTermKey(source, caseSens)] = GlossaryEntry(source, target, caseSens)
                    }
                }
            }
            Log.i(TAG, "Loaded ${targetMap.size} glossary entries from [${file.name}]")
        } catch (e: Throwable) {
            Log.w(TAG, "Failed to load glossary from [${file.absolutePath}]: ${e.message}")
        }
    }

    fun getAllEntries(): List<GlossaryEntry> {
        // Game-specific entries override global entries for identical source terms
        val merged = LinkedHashMap<String, GlossaryEntry>()
        for ((k, v) in globalEntries) {
            merged[k] = v
        }
        for ((k, v) in gameEntries) {
            merged[k] = v
        }
        return merged.values.toList()
    }

    fun getGlobalEntries(): List<GlossaryEntry> = globalEntries.values.toList()

    fun getGameEntries(): List<GlossaryEntry> = gameEntries.values.toList()

    fun isGameSpecific(sourceTerm: String): Boolean {
        val exactKey = normalizeTermKey(sourceTerm, true)
        val lowerKey = normalizeTermKey(sourceTerm, false)
        return gameEntries.containsKey(exactKey) || gameEntries.containsKey(lowerKey)
    }

    fun addOrUpdateEntry(
        entry: GlossaryEntry,
        isGameSpecific: Boolean = false
    ) {
        val cleanSource = entry.sourceTerm.trim()
        val cleanTarget = entry.targetTerm.trim()
        if (cleanSource.isEmpty() || cleanTarget.isEmpty()) return

        val normalizedKey = normalizeTermKey(cleanSource, entry.caseSensitive)
        val validEntry = entry.copy(sourceTerm = cleanSource, targetTerm = cleanTarget)

        if (isGameSpecific && activeGameKey != "global") {
            gameEntries[normalizedKey] = validEntry
            saveToFileAsync(getDictionaryFile(activeGameKey), gameEntries.values.toList(), activeGameKey)
        } else {
            globalEntries[normalizedKey] = validEntry
            saveToFileAsync(getDictionaryFile("global"), globalEntries.values.toList(), "global")
        }

        // Evict affected cached translations immediately
        onCacheInvalidate?.invoke(cleanSource)
        onCacheInvalidate?.invoke(cleanTarget)
    }

    fun deleteEntry(
        sourceTerm: String,
        isGameSpecific: Boolean = false
    ) {
        val cleanSource = sourceTerm.trim()
        if (cleanSource.isEmpty()) return

        val exactKey = normalizeTermKey(cleanSource, true)
        val lowerKey = normalizeTermKey(cleanSource, false)

        var removed = false
        if (isGameSpecific && activeGameKey != "global") {
            val removedEntry = gameEntries.remove(exactKey) ?: gameEntries.remove(lowerKey)
            if (removedEntry != null) {
                removed = true
                saveToFileAsync(getDictionaryFile(activeGameKey), gameEntries.values.toList(), activeGameKey)
            }
        } else {
            val removedEntry = globalEntries.remove(exactKey) ?: globalEntries.remove(lowerKey)
            if (removedEntry != null) {
                removed = true
                saveToFileAsync(getDictionaryFile("global"), globalEntries.values.toList(), "global")
            }
        }

        if (removed) {
            onCacheInvalidate?.invoke(cleanSource)
        }
    }

    private fun saveToFileAsync(file: File, entries: List<GlossaryEntry>, gameKey: String) {
        scope.launch {
            try {
                val parent = file.parentFile
                if (parent != null && !parent.exists()) {
                    parent.mkdirs()
                }

                val json = JSONObject()
                json.put("version", 1)
                json.put("gameKey", gameKey)

                val array = JSONArray()
                for (entry in entries) {
                    val obj = JSONObject()
                    obj.put("sourceTerm", entry.sourceTerm)
                    obj.put("targetTerm", entry.targetTerm)
                    obj.put("caseSensitive", entry.caseSensitive)
                    array.put(obj)
                }
                json.put("entries", array)

                file.writeText(json.toString(2), Charsets.UTF_8)
                Log.i(TAG, "Saved ${entries.size} glossary entries to [${file.name}]")
            } catch (e: Throwable) {
                Log.e(TAG, "Failed to save glossary file [${file.absolutePath}]", e)
            }
        }
    }

    fun exportDictionaryJson(isGameSpecific: Boolean = false): String {
        val entries = if (isGameSpecific && activeGameKey != "global") getGameEntries() else getGlobalEntries()
        val json = JSONObject()
        json.put("version", 1)
        json.put("gameKey", if (isGameSpecific) activeGameKey else "global")
        val array = JSONArray()
        for (e in entries) {
            val obj = JSONObject()
            obj.put("sourceTerm", e.sourceTerm)
            obj.put("targetTerm", e.targetTerm)
            obj.put("caseSensitive", e.caseSensitive)
            array.put(obj)
        }
        json.put("entries", array)
        return json.toString(2)
    }

    /**
     * Pre-translation replacement: replaces terms and names in source text
     * so that target character names or specific game terms remain pristine.
     */
    fun applyPreTranslation(text: String): String {
        if (text.isBlank()) return text
        var result = text
        val sortedEntries = getAllEntries().sortedByDescending { it.sourceTerm.length }
        for (entry in sortedEntries) {
            if (entry.sourceTerm.isBlank() || entry.targetTerm.isBlank()) continue
            result = replaceTerm(result, entry.sourceTerm, entry.targetTerm, entry.caseSensitive)
        }
        return result
    }

    /**
     * Post-translation replacement: checks if the source text contained a glossary term,
     * or if the untranslated source term is present in the translated text,
     * and guarantees substitution with the canonical targetTerm.
     */
    fun applyPostTranslation(sourceText: String, translatedText: String): String {
        if (translatedText.isBlank()) return translatedText
        var result = translatedText
        val sortedEntries = getAllEntries().sortedByDescending { it.sourceTerm.length }

        for (entry in sortedEntries) {
            if (entry.sourceTerm.isBlank() || entry.targetTerm.isBlank()) continue

            // Check if term was present in source or left untranslated in translated text
            val inSource = containsTerm(sourceText, entry.sourceTerm, entry.caseSensitive)
            val inTranslation = containsTerm(result, entry.sourceTerm, entry.caseSensitive)

            if (inTranslation || inSource) {
                result = replaceTerm(result, entry.sourceTerm, entry.targetTerm, entry.caseSensitive)
            }
        }
        return result
    }

    companion object {
        private const val TAG = "UserGlossaryManager"

        private fun sanitizeKey(key: String): String {
            return key.replace(Regex("[^a-zA-Z0-9_]"), "_").take(32)
        }

        private fun normalizeTermKey(term: String, caseSensitive: Boolean): String {
            val norm = Normalizer.normalize(term.trim(), Normalizer.Form.NFKC)
            return if (caseSensitive) norm else norm.lowercase()
        }

        private fun containsTerm(text: String, term: String, caseSensitive: Boolean): Boolean {
            return if (caseSensitive) {
                text.contains(term)
            } else {
                text.contains(term, ignoreCase = true)
            }
        }

        private fun isCjk(text: String): Boolean {
            return text.any { it.code in 0x3000..0x9FFF }
        }

        private fun isWordToken(text: String): Boolean {
            if (text.isEmpty()) return false
            if (isCjk(text)) return false
            val first = text.first()
            val last = text.last()
            return Character.isLetterOrDigit(first) && Character.isLetterOrDigit(last)
        }

        fun replaceTerm(text: String, sourceTerm: String, targetTerm: String, caseSensitive: Boolean): String {
            if (sourceTerm.isEmpty()) return text
            val options = if (caseSensitive) emptySet() else setOf(RegexOption.IGNORE_CASE)

            return try {
                val pattern = if (isWordToken(sourceTerm)) {
                    "\\b${Regex.escape(sourceTerm)}\\b"
                } else {
                    Regex.escape(sourceTerm)
                }
                Regex(pattern, options).replace(text, Matcher.quoteReplacement(targetTerm))
            } catch (_: Throwable) {
                if (caseSensitive) {
                    text.replace(sourceTerm, targetTerm)
                } else {
                    text.replace(sourceTerm, targetTerm, ignoreCase = true)
                }
            }
        }
    }
}
