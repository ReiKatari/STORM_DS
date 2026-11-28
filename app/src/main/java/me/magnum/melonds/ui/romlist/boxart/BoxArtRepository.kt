package me.magnum.melonds.ui.romlist.boxart

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.util.Log
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import me.magnum.melonds.common.network.SharedOkHttpClient
import me.magnum.melonds.domain.model.rom.Rom
import okhttp3.Request
import org.json.JSONObject
import java.io.File
import java.io.FileOutputStream
import java.net.URLDecoder
import java.text.Normalizer
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicLong
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BoxArtRepository @Inject constructor(
    @param:ApplicationContext private val context: Context,
) {
    companion object {
        private const val TAG = "BoxArtRepository"
        private const val BASE_URL_DS = "https://thumbnails.libretro.com/Nintendo%20-%20Nintendo%20DS/Named_Boxarts/"
        private const val BASE_URL_DSI = "https://thumbnails.libretro.com/Nintendo%20-%20Nintendo%20DSi/Named_Boxarts/"
        private const val INDEX_MAX_AGE_MS = 30L * 24 * 60 * 60 * 1000
        private const val NO_MATCH = "-"
        private const val INDEX_RETRY_BACKOFF_MS = 10L * 60 * 1000
    }

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private val cacheDir: File by lazy {
        val primary = File(android.os.Environment.getExternalStorageDirectory(), "STORM DS/covers/boxart")
        if (runCatching { primary.mkdirs(); primary.exists() && primary.canWrite() }.getOrDefault(false)) {
            primary
        } else {
            File(context.filesDir, "boxart").apply { mkdirs() }
        }
    }
    private val indexFile: File by lazy { File(cacheDir, "named_boxarts_index_v3.txt") }
    private val matchesFile: File by lazy { File(cacheDir, "matches_v3.json") }

    private val mutex = Mutex()
    private val memoryCache = ConcurrentHashMap<String, String>()
    private val indexLock = Any()
    @Volatile private var indexEntries: List<IndexEntry>? = null
    private val exactIndexMap = HashMap<String, IndexEntry>()
    private val indexDownloadInFlight = AtomicBoolean(false)
    @Volatile private var lastIndexDownloadFailure = 0L
    private var isMatchesLoaded = false
    @Volatile private var isDirty = false
    private val dirtyVersion = AtomicLong(0L)
    private val persistQueued = AtomicBoolean(false)
    private val httpClient by lazy {
        SharedOkHttpClient.instance.newBuilder()
            .readTimeout(45, TimeUnit.SECONDS)
            .callTimeout(60, TimeUnit.SECONDS)
            .build()
    }

    private val _coverUpdates = MutableSharedFlow<Pair<String, String?>>(extraBufferCapacity = 32)
    val coverUpdates: SharedFlow<Pair<String, String?>> = _coverUpdates.asSharedFlow()

    private val _indexReady = MutableStateFlow(false)
    val indexReady: StateFlow<Boolean> = _indexReady.asStateFlow()

    sealed interface BoxArtResult {
        data class Found(val url: String) : BoxArtResult
        data object NotFound : BoxArtResult
        data object IndexPending : BoxArtResult
    }

    private data class IndexEntry(val fullUrl: String, val normalized: String, val tokens: Set<String>)

    init {
        scope.launch {
            val oldCacheDir = File(context.filesDir, "boxart")
            if (oldCacheDir.exists()) {
                runCatching {
                    oldCacheDir.copyRecursively(cacheDir, overwrite = false)
                    oldCacheDir.deleteRecursively()
                }
            }
            loadMatches()
            loadIndex()
        }
    }

    fun getSanitizedCoverKey(rom: Rom): String {
        val base = rom.fileName.substringBeforeLast('.').ifBlank { rom.name }.ifBlank { "game" }
        return base.replace(Regex("[\\\\/:*?\"<>|]"), "_").trim()
    }

    suspend fun migrateCover(oldRom: Rom, newUri: Uri, newFileName: String) = withContext(Dispatchers.IO) {
        runCatching {
            loadMatches()
            val oldKey = oldRom.uri.toString()
            val newKey = newUri.toString()
            val previousUrl = if (oldKey != newKey) memoryCache.remove(oldKey) else memoryCache[oldKey]
            val oldCover = getCustomCoverFile(oldRom)
            if (oldCover != null && oldCover.isFile && oldCover.length() > 0) {
                val newSanitized = newFileName.substringBeforeLast('.').ifBlank { oldRom.name }
                    .replace(Regex("[\\\\/:*?\"<>|]"), "_").trim()
                val ext = oldCover.extension.ifBlank { "png" }
                val dest = File(oldCover.parentFile, "$newSanitized.$ext")
                if (dest.absolutePath != oldCover.absolutePath) {
                    oldCover.copyTo(dest, overwrite = true)
                    memoryCache[newKey] = "file://${dest.absolutePath}?t=${dest.lastModified()}"
                    _coverUpdates.emit(newKey to memoryCache[newKey])
                }
            } else if (previousUrl != null && previousUrl != NO_MATCH) {
                memoryCache[newKey] = previousUrl
                _coverUpdates.emit(newKey to previousUrl)
            }
            if (oldKey != newKey) {
                _coverUpdates.emit(oldKey to null)
            }
            schedulePersistMatches()
        }
    }

    fun getCustomCoverFile(rom: Rom): File? {
        val key = getSanitizedCoverKey(rom)
        val primaryDir = File(android.os.Environment.getExternalStorageDirectory(), "STORM DS/covers")
        val fallbackDir = File(context.filesDir, "custom_covers")

        val extensions = listOf("png", "jpg", "jpeg", "webp")
        for (ext in extensions) {
            val f = File(primaryDir, "$key.$ext")
            if (f.isFile && f.length() > 0) return f
        }
        for (ext in extensions) {
            val f = File(fallbackDir, "$key.$ext")
            if (f.isFile && f.length() > 0) return f
        }
        return null
    }

    fun hasCustomCover(rom: Rom): Boolean {
        return getCustomCoverFile(rom) != null
    }

    suspend fun saveCustomCover(context: Context, rom: Rom, sourceUri: Uri): Boolean = withContext(Dispatchers.IO) {
        try {
            val options = BitmapFactory.Options().apply { inJustDecodeBounds = true }
            context.contentResolver.openInputStream(sourceUri)?.use {
                BitmapFactory.decodeStream(it, null, options)
            } ?: return@withContext false

            val origWidth = options.outWidth
            val origHeight = options.outHeight
            if (origWidth <= 0 || origHeight <= 0) return@withContext false

            var inSampleSize = 1
            val maxDimension = 1024
            while (origWidth / inSampleSize > maxDimension * 2 || origHeight / inSampleSize > maxDimension * 2) {
                inSampleSize *= 2
            }

            val decodeOptions = BitmapFactory.Options().apply {
                this.inSampleSize = inSampleSize
                inPreferredConfig = Bitmap.Config.ARGB_8888
            }
            val bitmap = context.contentResolver.openInputStream(sourceUri)?.use {
                BitmapFactory.decodeStream(it, null, decodeOptions)
            } ?: return@withContext false

            val scaledBitmap = if (bitmap.width > maxDimension || bitmap.height > maxDimension) {
                val ratio = minOf(maxDimension.toFloat() / bitmap.width, maxDimension.toFloat() / bitmap.height)
                val targetW = (bitmap.width * ratio).toInt().coerceAtLeast(1)
                val targetH = (bitmap.height * ratio).toInt().coerceAtLeast(1)
                val scaled = Bitmap.createScaledBitmap(bitmap, targetW, targetH, true)
                if (scaled != bitmap) bitmap.recycle()
                scaled
            } else {
                bitmap
            }

            val key = getSanitizedCoverKey(rom)
            val primaryDir = File(android.os.Environment.getExternalStorageDirectory(), "STORM DS/covers").apply { mkdirs() }
            val targetFile = if (primaryDir.exists() && primaryDir.canWrite()) {
                File(primaryDir, "$key.png")
            } else {
                val fallbackDir = File(context.filesDir, "custom_covers").apply { mkdirs() }
                File(fallbackDir, "$key.png")
            }

            FileOutputStream(targetFile).use { out ->
                scaledBitmap.compress(Bitmap.CompressFormat.PNG, 100, out)
                out.flush()
            }
            scaledBitmap.recycle()

            loadMatches()
            val cacheBustUrl = "file://${targetFile.absolutePath}?t=${targetFile.lastModified()}"
            val romKey = rom.uri.toString()
            memoryCache[romKey] = cacheBustUrl
            schedulePersistMatches()
            _coverUpdates.emit(romKey to cacheBustUrl)
            true
        } catch (e: Throwable) {
            Log.e(TAG, "Failed to save custom cover for ${rom.name}", e)
            false
        }
    }

    suspend fun clearCustomCover(context: Context, rom: Rom): Boolean = withContext(Dispatchers.IO) {
        try {
            val key = getSanitizedCoverKey(rom)
            val primaryDir = File(android.os.Environment.getExternalStorageDirectory(), "STORM DS/covers")
            val fallbackDir = File(context.filesDir, "custom_covers")
            val extensions = listOf("png", "jpg", "jpeg", "webp")
            for (ext in extensions) {
                File(primaryDir, "$key.$ext").takeIf { it.exists() }?.delete()
                File(fallbackDir, "$key.$ext").takeIf { it.exists() }?.delete()
            }

            loadMatches()
            val romKey = rom.uri.toString()
            memoryCache.remove(romKey)
            schedulePersistMatches()
            val fallbackUrl = getBoxArtUrl(rom)
            _coverUpdates.emit(romKey to fallbackUrl)
            true
        } catch (e: Throwable) {
            Log.e(TAG, "Failed to clear custom cover for ${rom.name}", e)
            false
        }
    }

    suspend fun getBoxArtUrl(rom: Rom): String? = when (val result = resolveBoxArt(rom)) {
        is BoxArtResult.Found -> result.url
        BoxArtResult.NotFound, BoxArtResult.IndexPending -> null
    }

    suspend fun resolveBoxArt(rom: Rom): BoxArtResult = withContext(Dispatchers.IO) {
        val key = rom.uri.toString()

        // 1. Check for local user custom cover first
        val customCover = getCustomCoverFile(rom)
        if (customCover != null && customCover.exists() && customCover.length() > 0) {
            val customUrl = "file://${customCover.absolutePath}?t=${customCover.lastModified()}"
            memoryCache[key] = customUrl
            return@withContext BoxArtResult.Found(customUrl)
        }

        // 2. Instant in-memory check without lock
        val cached = memoryCache[key]
        if (cached != null) {
            return@withContext if (cached == NO_MATCH) BoxArtResult.NotFound else BoxArtResult.Found(cached)
        }

        if (!isMatchesLoaded) {
            loadMatches()
            val stored = memoryCache[key]
            if (stored != null) {
                return@withContext if (stored == NO_MATCH) BoxArtResult.NotFound else BoxArtResult.Found(stored)
            }
        }

        val entries = indexEntries ?: loadIndex() ?: return@withContext BoxArtResult.IndexPending

        val candidates = buildList {
            if (rom.name.isNotBlank()) add(rom.name)
            val fileBase = rom.fileName.substringBeforeLast('.')
            if (fileBase.isNotBlank() && fileBase != rom.name) add(fileBase)
            rom.config.customName?.let { if (it.isNotBlank()) add(it) }
        }.filter { it.isNotBlank() }

        val match = findBestMatch(candidates, entries)
        if (entries.size < 500) {
            return@withContext if (match != null) BoxArtResult.Found(match.fullUrl) else BoxArtResult.IndexPending
        }
        val matchValue = match?.fullUrl ?: NO_MATCH
        memoryCache[key] = matchValue
        schedulePersistMatches()

        if (matchValue == NO_MATCH) BoxArtResult.NotFound else BoxArtResult.Found(matchValue)
    }

    suspend fun getAllCachedMatches(): Map<String, String> = withContext(Dispatchers.IO) {
        if (!isMatchesLoaded) {
            loadMatches()
        }
        memoryCache.filterValues { value ->
            if (value == NO_MATCH) return@filterValues false
            if (value.startsWith("file://", ignoreCase = true)) {
                val path = value.removePrefix("file://").substringBefore('?')
                File(path).let { it.isFile && it.length() > 0 }
            } else {
                true
            }
        }
    }

    private suspend fun loadMatches() {
        if (isMatchesLoaded) return
        mutex.withLock {
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
    }

    private fun schedulePersistMatches() {
        isDirty = true
        dirtyVersion.incrementAndGet()
        if (!persistQueued.compareAndSet(false, true)) {
            return
        }
        scope.launch {
            var lastWriteSucceeded = true
            try {
                while (isDirty) {
                    delay(750L)
                    val targetVersion = dirtyVersion.get()
                    val wrote = mutex.withLock {
                        runCatching {
                            matchesFile.parentFile?.mkdirs()
                            val json = JSONObject()
                            memoryCache.forEach { (k, v) ->
                                json.put(k, v)
                            }
                            val tmpFile = File(matchesFile.parentFile, "${matchesFile.name}.tmp")
                            tmpFile.writeText(json.toString())
                            if (!tmpFile.renameTo(matchesFile)) {
                                tmpFile.copyTo(matchesFile, overwrite = true)
                                tmpFile.delete()
                            }
                        }.isSuccess
                    }
                    if (wrote) {
                        if (dirtyVersion.get() == targetVersion) {
                            isDirty = false
                        }
                    } else {
                        lastWriteSucceeded = false
                        break
                    }
                }
            } finally {
                persistQueued.set(false)
                if (lastWriteSucceeded && isDirty) {
                    schedulePersistMatches()
                }
            }
        }
    }

    private fun loadIndex(): List<IndexEntry>? {
        indexEntries?.let { return it }

        if (indexFile.isFile) {
            val raw = runCatching { indexFile.readText() }.getOrNull()
            if (raw != null) {
                val entries = parseIndex(raw)
                indexEntries = entries
                if (System.currentTimeMillis() - indexFile.lastModified() >= INDEX_MAX_AGE_MS) {
                    scheduleIndexDownload()
                }
                return entries
            }
        }

        // First time - schedule background download without stalling callers
        scheduleIndexDownload()
        return null
    }

    /**
     * Downloads the libretro index at most once at a time, with a back-off after a failure, so a slow or
     * blocked connection is not flooded by one download per visible cover.
     */
    private fun scheduleIndexDownload() {
        val now = System.currentTimeMillis()
        if (now - lastIndexDownloadFailure < INDEX_RETRY_BACKOFF_MS) return
        if (!indexDownloadInFlight.compareAndSet(false, true)) return
        scope.launch {
            try {
                val content = downloadIndex()
                if (content != null) {
                    runCatching {
                        val tmpIndex = File(indexFile.parentFile, "${indexFile.name}.tmp")
                        tmpIndex.writeText(content)
                        if (!tmpIndex.renameTo(indexFile)) {
                            tmpIndex.copyTo(indexFile, overwrite = true)
                            tmpIndex.delete()
                        }
                        indexEntries = parseIndex(content)
                    }
                } else {
                    lastIndexDownloadFailure = System.currentTimeMillis()
                }
            } finally {
                indexDownloadInFlight.set(false)
            }
        }
    }

    private fun parseIndex(raw: String): List<IndexEntry> {
        val newExactMap = HashMap<String, IndexEntry>()
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
                    val entry = IndexEntry(baseUrl + encoded, normalized, normalized.split(' ').filter { it.isNotEmpty() }.toSet())
                    newExactMap[normalized] = entry
                    entry
                } else null
            }
            .toList()
        synchronized(indexLock) {
            exactIndexMap.clear()
            exactIndexMap.putAll(newExactMap)
            indexEntries = entries
            _indexReady.value = entries.size >= 500
        }
        return entries
    }

    private fun downloadIndex(): String? {
        return runCatching {
            val dsLines = downloadRepoIndex(BASE_URL_DS, "DS")
            val dsiLines = downloadRepoIndex(BASE_URL_DSI, "DSI")
            if (dsLines.size < 500 && dsiLines.size < 5) return null
            (dsLines + dsiLines).joinToString("\n").takeIf { it.isNotBlank() }
        }.getOrNull()
    }

    private fun downloadRepoIndex(baseUrl: String, prefix: String): List<String> {
        return runCatching {
            val request = Request.Builder()
                .url(baseUrl)
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36")
                .build()
            httpClient.newCall(request).execute().use { response ->
                val body = response.body
                if (!response.isSuccessful || body == null) return@runCatching emptyList()
                val html = body.string()
                Regex("href=\"([^\"]+\\.png)\"").findAll(html)
                    .map { "$prefix\t${it.groupValues[1]}" }
                    .filter { !it.contains("/..") }
                    .toList()
            }
        }.getOrElse { emptyList() }
    }

    private fun findBestMatch(candidates: List<String>, entries: List<IndexEntry>): IndexEntry? {
        // Pass 1: Instant O(1) exact map lookup
        for (candidate in candidates) {
            val fullNormalized = normalize(candidate.substringBefore(" (").ifBlank { candidate })
            if (fullNormalized.isBlank()) continue

            synchronized(indexLock) { exactIndexMap[fullNormalized] }?.let { return it }
            entries.firstOrNull { it.normalized == fullNormalized }?.let { return it }
        }

        // Pass 2: Token similarity
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
                    if (score >= 0.95) return best
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
