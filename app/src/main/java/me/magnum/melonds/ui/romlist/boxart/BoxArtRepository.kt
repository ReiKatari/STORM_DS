package me.magnum.melonds.ui.romlist.boxart

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import me.magnum.melonds.domain.model.rom.Rom
import org.json.JSONObject
import java.io.File
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLDecoder
import java.text.Normalizer
import java.util.concurrent.ConcurrentHashMap
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BoxArtRepository @Inject constructor(
    @param:ApplicationContext private val context: Context,
) {
    companion object {
        private const val BASE_URL = "https://thumbnails.libretro.com/Nintendo%20-%20Nintendo%20DS/Named_Boxarts/"
        private const val INDEX_MAX_AGE_MS = 30L * 24 * 60 * 60 * 1000
        private const val NO_MATCH = "-"
    }

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private val cacheDir = File(context.filesDir, "boxart").apply { mkdirs() }
    private val indexFile = File(cacheDir, "named_boxarts_index.txt")
    private val matchesFile = File(cacheDir, "matches.json")

    private val mutex = Mutex()
    private val memoryCache = ConcurrentHashMap<String, String>()
    private var indexEntries: List<IndexEntry>? = null
    private var isMatchesLoaded = false
    private var isDirty = false

    private data class IndexEntry(val encodedName: String, val normalized: String, val tokens: Set<String>)

    init {
        scope.launch {
            loadMatches()
        }
    }

    suspend fun getBoxArtUrl(rom: Rom): String? = withContext(Dispatchers.IO) {
        val key = rom.uri.toString()

        // 1. Fast in-memory check without lock
        val cached = memoryCache[key]
        if (cached != null) {
            return@withContext if (cached == NO_MATCH) null else BASE_URL + cached
        }

        mutex.withLock {
            // Double check inside lock
            val secondCheck = memoryCache[key]
            if (secondCheck != null) {
                return@withContext if (secondCheck == NO_MATCH) null else BASE_URL + secondCheck
            }

            if (!isMatchesLoaded) {
                loadMatches()
            }

            val stored = memoryCache[key]
            if (stored != null) {
                return@withContext if (stored == NO_MATCH) null else BASE_URL + stored
            }

            val entries = loadIndex() ?: return@withContext null
            val candidates = buildList {
                add(rom.fileName.substringBeforeLast('.'))
                rom.config.customName?.let { add(it) }
                add(rom.name)
            }.filter { it.isNotBlank() }

            val match = findBestMatch(candidates, entries)
            val matchValue = match?.encodedName ?: NO_MATCH
            memoryCache[key] = matchValue
            schedulePersistMatches()

            if (matchValue == NO_MATCH) null else BASE_URL + matchValue
        }
    }

    private fun loadMatches() {
        if (isMatchesLoaded) return
        runCatching {
            if (matchesFile.isFile) {
                val json = JSONObject(matchesFile.readText())
                val keys = json.keys()
                while (keys.hasNext()) {
                    val k = keys.next()
                    memoryCache[k] = json.optString(k, NO_MATCH)
                }
            }
        }
        isMatchesLoaded = true
    }

    private fun schedulePersistMatches() {
        isDirty = true
        scope.launch {
            if (!isDirty) return@launch
            isDirty = false
            runCatching {
                val json = JSONObject()
                memoryCache.forEach { (k, v) ->
                    json.put(k, v)
                }
                matchesFile.writeText(json.toString())
            }
        }
    }

    private fun loadIndex(): List<IndexEntry>? {
        indexEntries?.let { return it }

        val raw = if (indexFile.isFile && System.currentTimeMillis() - indexFile.lastModified() < INDEX_MAX_AGE_MS) {
            runCatching { indexFile.readText() }.getOrNull()
        } else {
            downloadIndex()?.also { content ->
                runCatching { indexFile.writeText(content) }
            } ?: runCatching { indexFile.takeIf { it.isFile }?.readText() }.getOrNull()
        } ?: return null

        val entries = raw.lineSequence()
            .filter { it.isNotBlank() }
            .map { encoded ->
                val decoded = runCatching { URLDecoder.decode(encoded, "UTF-8") }.getOrDefault(encoded)
                val cleanName = decoded.removeSuffix(".png").substringBefore(" (")
                val normalized = normalize(cleanName)
                IndexEntry(encoded, normalized, normalized.split(' ').filter { it.isNotEmpty() }.toSet())
            }
            .toList()
        indexEntries = entries
        return entries
    }

    private fun downloadIndex(): String? {
        return runCatching {
            val connection = URL(BASE_URL).openConnection() as HttpURLConnection
            connection.connectTimeout = 8000
            connection.readTimeout = 20000
            connection.setRequestProperty("User-Agent", "melonDS-android-boxart")
            try {
                val html = connection.inputStream.bufferedReader().readText()
                Regex("href=\"([^\"]+\\.png)\"").findAll(html)
                    .map { it.groupValues[1] }
                    .filter { !it.startsWith("/") && !it.startsWith("..") }
                    .joinToString("\n")
                    .takeIf { it.isNotBlank() }
            } finally {
                connection.disconnect()
            }
        }.getOrNull()
    }

    private fun findBestMatch(candidates: List<String>, entries: List<IndexEntry>): IndexEntry? {
        for (candidate in candidates) {
            val fullNormalized = normalize(candidate.substringBefore(" (").ifBlank { candidate })
            if (fullNormalized.isBlank()) continue

            entries.firstOrNull { it.normalized == fullNormalized }?.let { return it }
        }

        var best: IndexEntry? = null
        var bestScore = 0.0
        for (candidate in candidates) {
            val tokens = normalize(candidate).split(' ').filter { it.isNotEmpty() }.toSet()
            if (tokens.isEmpty()) continue
            for (entry in entries) {
                if (entry.tokens.isEmpty()) continue
                val intersection = tokens.intersect(entry.tokens).size.toDouble()
                if (intersection == 0.0) continue
                val union = tokens.union(entry.tokens).size.toDouble()
                val score = intersection / union
                if (score > bestScore) {
                    bestScore = score
                    best = entry
                }
            }
        }
        return best.takeIf { bestScore >= 0.65 }
    }

    private fun normalize(value: String): String {
        val decomposed = Normalizer.normalize(value, Normalizer.Form.NFD)
        return decomposed
            .replace(Regex("\\p{M}+"), "")
            .lowercase()
    }
}
