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

    fun setGameKey(gameKey: String) {
        val safeKey = gameKey.replace(Regex("[^a-zA-Z0-9_]"), "_").take(32)
        if (safeKey == activeGameKey) return

        flush()
        activeGameKey = safeKey
        loadFromDisk(safeKey)
    }

    private fun getCacheFile(safeKey: String): File {
        return File(cacheDir, "cache_$safeKey.json")
    }

    private fun loadFromDisk(safeKey: String) {
        diskCacheMap.clear()
        val file = getCacheFile(safeKey)
        if (!file.exists() || !file.isFile) return

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
            Log.i("TranslationCache", "Loaded ${diskCacheMap.size} persistent translations for game [$safeKey]")
        } catch (e: Throwable) {
            Log.w("TranslationCache", "Failed to load persistent translation cache for [$safeKey]: ${e.message}")
        }
    }

    fun get(engine: String, sourceLang: String, targetLang: String, text: String): String? {
        val k = key(engine, sourceLang, targetLang, text)
        // Check LruCache (Tier 1)
        val mem = lru.get(k)
        if (mem != null) return mem

        // Check Disk Cache Map (Tier 2)
        val disk = diskCacheMap[k]
        if (disk != null) {
            lru.put(k, disk)
            return disk
        }

        return null
    }

    fun put(engine: String, sourceLang: String, targetLang: String, text: String, translation: String) {
        if (translation.isBlank()) return
        val k = key(engine, sourceLang, targetLang, text)
        lru.put(k, translation)
        diskCacheMap[k] = translation
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
            val file = getCacheFile(safeKey)
            val json = JSONObject()
            for ((k, v) in diskCacheMap) {
                json.put(k, v)
            }
            file.writeText(json.toString(), Charsets.UTF_8)
            isDirty = false
            Log.i("TranslationCache", "Saved ${diskCacheMap.size} translations to persistent cache [${file.name}]")
        } catch (e: Throwable) {
            Log.w("TranslationCache", "Failed to write persistent translation cache: ${e.message}")
        }
    }

    fun clear() {
        clearMemory()
    }

    fun clearMemory() {
        lru.evictAll()
    }

    fun clearAll() {
        lru.evictAll()
        diskCacheMap.clear()
        val file = getCacheFile(activeGameKey)
        if (file.exists()) file.delete()
        isDirty = false
    }

    companion object {
        private val WHITESPACE = Regex("\\s+")

        fun normalize(text: String): String =
            Normalizer.normalize(text, Normalizer.Form.NFKC).replace(WHITESPACE, " ").trim()

        fun key(engine: String, sourceLang: String, targetLang: String, text: String): String =
            "$engine|$sourceLang|$targetLang|${normalize(text)}"
    }
}
