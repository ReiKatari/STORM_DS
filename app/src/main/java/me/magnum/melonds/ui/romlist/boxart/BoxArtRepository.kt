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
        private const val BASE_URL_DS = "https://thumbnails.libretro.com/Nintendo%20-%20Nintendo%20DS/Named_Boxarts/"
        private const val BASE_URL_DSI = "https://thumbnails.libretro.com/Nintendo%20-%20Nintendo%20DSi/Named_Boxarts/"
        private const val INDEX_MAX_AGE_MS = 30L * 24 * 60 * 60 * 1000
        private const val NO_MATCH = "-"
    }

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private val cacheDir = File(context.filesDir, "boxart").apply { mkdirs() }
    private val indexFile = File(cacheDir, "named_boxarts_index_v3.txt")
    private val matchesFile = File(cacheDir, "matches_v3.json")

    private val mutex = Mutex()
    private val memoryCache = ConcurrentHashMap<String, String>()
    private var indexEntries: List<IndexEntry>? = null
    private var isMatchesLoaded = false
    private var isDirty = false

    private data class IndexEntry(val fullUrl: String, val normalized: String, val tokens: Set<String>)

    init {
        scope.launch {
            loadMatches()
        }
    }

    suspend fun getBoxArtUrl(rom: Rom): String? = withContext(Dispatchers.IO) {
        val key = rom.uri.toString()

        // 1. Instant in-memory check without mutex
        val cached = memoryCache[key]
        if (cached != null) {
            return@withContext if (cached == NO_MATCH) null else cached
        }

        mutex.withLock {
            val secondCheck = memoryCache[key]
            if (secondCheck != null) {
                return@withContext if (secondCheck == NO_MATCH) null else secondCheck
            }

            if (!isMatchesLoaded) {
                loadMatches()
            }

            val stored = memoryCache[key]
            if (stored != null) {
                return@withContext if (stored == NO_MATCH) null else stored
            }

            val entries = loadIndex() ?: return@withContext null
            val candidates = buildList {
                if (rom.name.isNotBlank()) add(rom.name)
                val fileBase = rom.fileName.substringBeforeLast('.')
                if (fileBase.isNotBlank() && fileBase != rom.name) add(fileBase)
                rom.config.customName?.let { if (it.isNotBlank()) add(it) }
            }.filter { it.isNotBlank() }

            val match = findBestMatch(candidates, entries)
            val matchValue = match?.fullUrl ?: NO_MATCH
            memoryCache[key] = matchValue
            schedulePersistMatches()

            if (matchValue == NO_MATCH) null else matchValue
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
            .mapNotNull { line ->
                val separatorIndex = line.indexOf('\t')
                val (prefix, encoded) = if (separatorIndex != -1) {
                    line.substring(0, separatorIndex) to line.substring(separatorIndex + 1)
                } else {
                    "DS" to line
                }
                val baseUrl = if (prefix == "DSI") BASE_URL_DSI else BASE_URL_DS
                val decoded = runCatching { URLDecoder.decode(encoded, "UTF-8") }.getOrDefault(encoded)
                val cleanName = decoded.removeSuffix(".png").substringBefore(" (")
                val normalized = normalize(cleanName)
                if (normalized.isNotBlank()) {
                    IndexEntry(baseUrl + encoded, normalized, normalized.split(' ').filter { it.isNotEmpty() }.toSet())
                } else null
            }
            .toList()
        indexEntries = entries
        return entries
    }

    private fun downloadIndex(): String? {
        return runCatching {
            val dsLines = downloadRepoIndex(BASE_URL_DS, "DS")
            val dsiLines = downloadRepoIndex(BASE_URL_DSI, "DSI")
            (dsLines + dsiLines).joinToString("\n").takeIf { it.isNotBlank() }
        }.getOrNull()
    }

    private fun downloadRepoIndex(baseUrl: String, prefix: String): List<String> {
        return runCatching {
            val connection = URL(baseUrl).openConnection() as HttpURLConnection
            connection.connectTimeout = 10000
            connection.readTimeout = 30000
            connection.setRequestProperty("User-Agent", "melonDS-android-boxart")
            try {
                val html = connection.inputStream.bufferedReader().readText()
                Regex("href=\"([^\"]+\\.png)\"").findAll(html)
                    .map { "$prefix\t${it.groupValues[1]}" }
                    .filter { !it.contains("/..") }
                    .toList()
            } finally {
                connection.disconnect()
            }
        }.getOrElse { emptyList() }
    }

    private fun findBestMatch(candidates: List<String>, entries: List<IndexEntry>): IndexEntry? {
        // Pass 1: Direct normalized match
        for (candidate in candidates) {
            val fullNormalized = normalize(candidate.substringBefore(" (").ifBlank { candidate })
            if (fullNormalized.isBlank()) continue

            entries.firstOrNull { it.normalized == fullNormalized }?.let { return it }
        }

        // Pass 2: Token Jaccard similarity
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
        return best.takeIf { bestScore >= 0.70 }
    }

    private fun normalize(value: String): String {
        val decomposed = Normalizer.normalize(value, Normalizer.Form.NFD)
        return decomposed
            .replace(Regex("\\p{M}+"), "")
            .lowercase()
            .replace(Regex("\\(.*?\\)|\\[.*?]"), " ")
            .replace(Regex("[^a-z0-9]+"), " ")
            .trim()
            .replace(Regex("\\s+"), " ")
    }
}
