package me.magnum.melonds.translator.engine

import android.content.Context
import android.util.Log
import android.util.LruCache
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.json.JSONObject
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStreamWriter
import java.text.Normalizer
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicLong

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
    private val cacheLock = Any()
    private val writeLock = Any()

    private var activeGameKey: String = "global"
    @Volatile
    private var loadedGameKey: String? = null
    @Volatile
    private var isDirty = false
    private val dirtyVersion = AtomicLong(0L)
    private val persistQueued = AtomicBoolean(false)

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
        val dirtySnapshot: Pair<String, Map<String, String>>?
        synchronized(cacheLock) {
            if (safeKey == activeGameKey && (loadedGameKey == safeKey || diskCacheMap.isNotEmpty())) {
                return
            }
            dirtySnapshot = if (isDirty) {
                isDirty = false
                dirtyVersion.incrementAndGet()
                activeGameKey to HashMap(diskCacheMap)
            } else {
                null
            }
            activeGameKey = safeKey
            loadedGameKey = null
            diskCacheMap.clear()
        }

        if (dirtySnapshot != null) {
            val (prevKey, entries) = dirtySnapshot
            scope.launch {
                writeSnapshotToDisk(prevKey, entries)
            }
        }
        scope.launch {
            loadFromDisk(safeKey)
        }
    }

    private fun getCacheFile(safeKey: String): File {
        return File(cacheDir, "cache_$safeKey.json")
    }

    private fun getStormDictFile(safeKey: String): File {
        return File(translationsDir, "$safeKey.stormdict.json")
    }

    private fun loadFromDisk(safeKey: String) {
        val loaded = LinkedHashMap<String, String>()
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
                        loaded[k] = v
                    }
                }
            } catch (e: Throwable) {
                Log.w("TranslationCache", "Failed to load translation memory from [${file.name}]: ${e.message}")
            }
        }
        synchronized(cacheLock) {
            if (activeGameKey != safeKey) return
            for ((k, v) in loaded) {
                diskCacheMap.putIfAbsent(k, v)
                if (lru.get(k) == null) {
                    lru.put(k, v)
                }
            }
            loadedGameKey = safeKey
        }
        if (loaded.isNotEmpty()) {
            Log.i("TranslationCache", "Loaded ${loaded.size} persistent translations for game [$safeKey]")
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
        synchronized(cacheLock) {
            lru.put(exactKey, translation)
            lru.put(sharedDictKey, translation)
            diskCacheMap[exactKey] = translation
            diskCacheMap[sharedDictKey] = translation
            isDirty = true
            dirtyVersion.incrementAndGet()
        }
        scheduleDebouncedSave()
    }

    fun flush() {
        val snapshot: Pair<String, Map<String, String>>?
        synchronized(cacheLock) {
            if (!isDirty) return
            isDirty = false
            dirtyVersion.incrementAndGet()
            snapshot = activeGameKey to HashMap(diskCacheMap)
        }
        val (safeKey, entries) = snapshot ?: return
        scope.launch {
            writeSnapshotToDisk(safeKey, entries)
        }
    }

    private fun scheduleDebouncedSave() {
        if (!persistQueued.compareAndSet(false, true)) {
            return
        }
        scope.launch {
            var lastWriteSucceeded = true
            try {
                while (isDirty) {
                    delay(750L)
                    val snapshotKey: String
                    val snapshotEntries: Map<String, String>
                    val targetVersion: Long
                    synchronized(cacheLock) {
                        if (!isDirty) break
                        targetVersion = dirtyVersion.get()
                        snapshotKey = activeGameKey
                        snapshotEntries = HashMap(diskCacheMap)
                    }
                    val wrote = writeSnapshotToDisk(snapshotKey, snapshotEntries)
                    if (wrote) {
                        synchronized(cacheLock) {
                            if (dirtyVersion.get() == targetVersion && activeGameKey == snapshotKey) {
                                isDirty = false
                            }
                        }
                    } else {
                        lastWriteSucceeded = false
                        break
                    }
                }
            } finally {
                persistQueued.set(false)
                if (lastWriteSucceeded && isDirty) {
                    scheduleDebouncedSave()
                }
            }
        }
    }

    private fun writeSnapshotToDisk(safeKey: String, entries: Map<String, String>): Boolean {
        return synchronized(writeLock) {
            try {
                val cacheFile = getCacheFile(safeKey)
                val dictFile = getStormDictFile(safeKey)
                val fullJson = JSONObject()
                val dictJson = JSONObject()
                for ((k, v) in entries) {
                    fullJson.put(k, v)
                    if (k.contains("->")) {
                        dictJson.put(k, v)
                    }
                }
                writeTextAtomically(cacheFile, fullJson.toString())
                if (dictJson.length() > 0) {
                    writeTextAtomically(dictFile, dictJson.toString(2))
                }
                Log.i("TranslationCache", "Saved ${entries.size} entries to persistent cache and ${dictFile.name}")
                true
            } catch (e: Throwable) {
                Log.w("TranslationCache", "Failed to write persistent translation cache: ${e.message}")
                false
            }
        }
    }

    private fun writeTextAtomically(file: File, text: String) {
        file.parentFile?.mkdirs()
        val tempFile = File(file.parentFile, "${file.name}.tmp")
        FileOutputStream(tempFile).use { stream ->
            OutputStreamWriter(stream, Charsets.UTF_8).use { writer ->
                writer.write(text)
                writer.flush()
            }
        }
        if (!tempFile.renameTo(file)) {
            if (file.exists()) {
                file.delete()
            }
            if (!tempFile.renameTo(file)) {
                tempFile.copyTo(file, overwrite = true)
                tempFile.delete()
            }
        }
    }

    fun evictContaining(term: String) {
        if (term.isBlank()) return
        val norm = normalize(term)
        val lowerNorm = norm.lowercase(java.util.Locale.ROOT)
        val keysToRemove = mutableListOf<String>()

        synchronized(cacheLock) {
            for ((k, v) in diskCacheMap) {
                if (k.contains(norm, ignoreCase = true) || v.contains(norm, ignoreCase = true) ||
                    k.lowercase(java.util.Locale.ROOT).contains(lowerNorm) || v.lowercase(java.util.Locale.ROOT).contains(lowerNorm)) {
                    keysToRemove.add(k)
                }
            }

            for (k in keysToRemove) {
                diskCacheMap.remove(k)
                lru.remove(k)
            }

            if (keysToRemove.isNotEmpty()) {
                isDirty = true
                dirtyVersion.incrementAndGet()
            }
        }

        if (keysToRemove.isNotEmpty()) {
            scheduleDebouncedSave()
            Log.i("TranslationCache", "Evicted ${keysToRemove.size} cached translations containing '$term'")
        }
    }

    fun clear() {
        clearAll()
    }

    fun clearMemory() {
        lru.evictAll()
    }

    fun clearAll() {
        val currentKey: String
        synchronized(cacheLock) {
            lru.evictAll()
            diskCacheMap.clear()
            isDirty = false
            dirtyVersion.incrementAndGet()
            currentKey = activeGameKey
        }
        scope.launch {
            synchronized(writeLock) {
                runCatching {
                    cacheDir.listFiles { f -> f.isFile && (f.name.startsWith("cache_") && f.name.endsWith(".json") || f.name.endsWith(".tmp")) }
                        ?.forEach { it.delete() }
                    translationsDir.listFiles { f -> f.isFile && (f.name.endsWith(".stormdict.json") || f.name.endsWith(".tmp")) }
                        ?.forEach { it.delete() }
                }
                val file = getCacheFile(currentKey)
                if (file.exists()) file.delete()
                val dictFile = getStormDictFile(currentKey)
                if (dictFile.exists()) dictFile.delete()
            }
        }
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
