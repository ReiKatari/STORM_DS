package me.magnum.melonds.translator.engine

import android.content.Context
import android.util.Log
import android.util.LruCache
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import org.json.JSONObject
import java.io.File
import java.text.Normalizer
import java.util.concurrent.ConcurrentHashMap

/**
 * High-performance Two-Tier Translation Cache:
 * - Tier 1: In-memory LruCache (up to 2000 entries, 0ms instant display)
 * - Tier 2: Persistent ROM-specific JSON disk cache stored in context.filesDir/translation_cache/
 *
 * Persists translations across game sessions so that recurring dialogue, menu items,
 * and inventory strings translate instantly with zero network delay.
 */
class TranslationCache(
    private val context: Context,
    maxEntries: Int = 2000
) {
    private val lru = LruCache<String, String>(maxEntries)
    private val diskCacheMap = ConcurrentHashMap<String, String>()
    private val scope = CoroutineScope(Dispatchers.IO + SupervisorJob())

    private var activeGameKey: String = "global"
    @Volatile
    private var isDirty = false

    private val cacheDir: File by lazy {
        val extRoot = runCatching { android.os.Environment.getExternalStorageDirectory() }.getOrNull()
        val dir = if (extRoot != null) {
            File(extRoot, "STORM DS/cache/translation_cache")
        } else {
            File(context.filesDir, "translation_cache")
        }
        dir.apply { mkdirs() }
    }

    private val translationsDir: File by lazy {
        val extRoot = runCatching { android.os.Environment.getExternalStorageDirectory() }.getOrNull()
        val dir = if (extRoot != null) {
            File(extRoot, "STORM DS/translations")
        } else {
            File(context.filesDir, "translations")
        }
        dir.apply { mkdirs() }
    }

    fun setGameKey(gameKey: String) {
        val safeKey = gameKey.replace(Regex("[^a-zA-Z0-9_]"), "_").take(32)
        if (safeKey == activeGameKey && diskCacheMap.isNotEmpty()) return

        flush()
        activeGameKey = safeKey
        loadFromDisk(safeKey)
    }

    private fun getCacheFile(safeKey: String): File {
        return File(cacheDir, "cache_$safeKey.json")
    }

    private fun getStormDictFile(safeKey: String): File {
        return File(translationsDir, "$safeKey.stormdict.json")
    }

    private fun loadFromDisk(safeKey: String) {
        diskCacheMap.clear()
        for (file in listOf(getCacheFile(safeKey), getStormDictFile(safeKey))) {
            if (!file.exists() || !file.isFile) continue
            try {
                val jsonStr = file.readText(Charsets.UTF_8)
                val json = JSONObject(jsonStr)
                val keys = json.keys()
                while (keys.hasNext()) {
                    val k = keys.next()
                    val v = json.optString(k, "")
                    if (v.isNotBlank()) {
                        diskCacheMap[k] = v
                        lru.put(k, v)
                    }
                }
            } catch (e: Throwable) {
                Log.w("TranslationCache", "Failed to load translation memory from [${file.name}]: ${e.message}")
            }
        }
        if (diskCacheMap.isNotEmpty()) {
            Log.i("TranslationCache", "Loaded ${diskCacheMap.size} persistent translations for game [$safeKey]")
        }
    }

    fun get(engine: String, sourceLang: String, targetLang: String, text: String): String? {
        val exactKey = key(engine, sourceLang, targetLang, text)
        val dictKey = dictKey(sourceLang, targetLang, text)

        // Check LruCache (Tier 1)
        lru.get(exactKey)?.let { return it }
        lru.get(dictKey)?.let { return it }

        // Check Disk Cache Map & .stormdict.json (Tier 2)
        diskCacheMap[exactKey]?.let {
            lru.put(exactKey, it)
            return it
        }
        diskCacheMap[dictKey]?.let {
            lru.put(exactKey, it)
            return it
        }

        return null
    }

    fun put(engine: String, sourceLang: String, targetLang: String, text: String, translation: String) {
        if (translation.isBlank()) return
        val exactKey = key(engine, sourceLang, targetLang, text)
        val sharedDictKey = dictKey(sourceLang, targetLang, text)
        lru.put(exactKey, translation)
        lru.put(sharedDictKey, translation)
        diskCacheMap[exactKey] = translation
        diskCacheMap[sharedDictKey] = translation
        isDirty = true

        scope.launch {
            saveToDisk()
        }
    }

    fun flush() {
        if (!isDirty) return
        scope.launch {
            saveToDisk()
        }
    }

    @Synchronized
    private fun saveToDisk() {
        if (!isDirty) return
        try {
            val safeKey = activeGameKey
            val cacheFile = getCacheFile(safeKey)
            val dictFile = getStormDictFile(safeKey)
            val fullJson = JSONObject()
            val dictJson = JSONObject()
            for ((k, v) in diskCacheMap) {
                fullJson.put(k, v)
                if (k.contains("->")) {
                    dictJson.put(k, v)
                }
            }
            cacheFile.writeText(fullJson.toString(), Charsets.UTF_8)
            if (dictJson.length() > 0) {
                dictFile.writeText(dictJson.toString(2), Charsets.UTF_8)
            }
            isDirty = false
            Log.i("TranslationCache", "Saved ${diskCacheMap.size} entries to persistent cache and ${dictFile.name}")
        } catch (e: Throwable) {
            Log.w("TranslationCache", "Failed to write persistent translation cache: ${e.message}")
        }
    }

    fun clear() {
        clearAll()
    }

    fun clearMemory() {
        lru.evictAll()
    }

    fun clearAll() {
        lru.evictAll()
        diskCacheMap.clear()
        runCatching {
            cacheDir.listFiles { f -> f.isFile && f.name.startsWith("cache_") && f.name.endsWith(".json") }
                ?.forEach { it.delete() }
            translationsDir.listFiles { f -> f.isFile && f.name.endsWith(".stormdict.json") }
                ?.forEach { it.delete() }
        }
        val file = getCacheFile(activeGameKey)
        if (file.exists()) file.delete()
        val dictFile = getStormDictFile(activeGameKey)
        if (dictFile.exists()) dictFile.delete()
        isDirty = false
    }

    companion object {
        private val WHITESPACE = Regex("\\s+")

        fun normalize(text: String): String =
            Normalizer.normalize(text, Normalizer.Form.NFKC).replace(WHITESPACE, " ").trim()

        fun key(engine: String, sourceLang: String, targetLang: String, text: String): String =
            "$engine|$sourceLang|$targetLang|${normalize(text)}"

        fun dictKey(sourceLang: String, targetLang: String, text: String): String =
            "$sourceLang->$targetLang::${normalize(text)}"
    }
}
