package me.magnum.melonds.sgw

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.isActive
import kotlinx.coroutines.withContext
import okhttp3.Call
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONArray
import org.json.JSONObject
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicReference
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SgwApiClient @Inject constructor() {
    companion object {
        const val BASE_URL = "https://stormgamesworld.ru"
        private const val USER_AGENT = "STORM-DS/8.9.7 (Android)"
    }

    private val jsonClient: OkHttpClient by lazy {
        SgwSmartDns.createHttpClient()
            .newBuilder()
            .callTimeout(25, TimeUnit.SECONDS)
            .build()
    }

    private val downloadClient: OkHttpClient by lazy { SgwSmartDns.createHttpClient() }

    private data class ParsedTranslationRelease(
        val release: SgwTranslationRelease,
        val isCurrent: Boolean,
        val internalBuild: Int,
    )

    suspend fun fetchGames(platform: SgwPlatform): Result<List<SgwGameEntry>> = withContext(Dispatchers.IO) {
        runCatching {
            val url = "$BASE_URL/api/games?platformId=${platform.platformId}"
            val body = executeGetString(url)
            parseGamesResponse(body, platform, SgwSourceKind.MAIN_CATALOG)
        }
    }

    suspend fun fetchTranslatedGames(platform: SgwPlatform): Result<List<SgwGameEntry>> = withContext(Dispatchers.IO) {
        runCatching {
            val url = "$BASE_URL/api/translations?mode=games&platformId=${platform.platformId}&onlyTranslated=true"
            val body = executeGetString(url)
            val arr = extractArray(body, "games", "items", "data")
            val out = ArrayList<SgwGameEntry>(arr.length())
            for (i in 0 until arr.length()) {
                val o = arr.optJSONObject(i) ?: continue
                val baseGame = parseGameObject(o, platform, SgwSourceKind.TRANSLATION) ?: continue
                val best = pickBestTranslationRelease(o.optJSONArray("translationReleases"), baseGame.id)
                val resolvedEntry = if (best != null) {
                    val primaryDl = resolveUrl(best.fileUrl)
                    val fallbackDl = "$BASE_URL/api/games/${baseGame.id}/download"
                    baseGame.copy(
                        version = best.version.ifBlank { baseGame.version },
                        fileSizeBytes = if (best.fileSizeBytes > 0L) best.fileSizeBytes else baseGame.fileSizeBytes,
                        downloadUrl = primaryDl,
                        fallbackDownloadUrl = fallbackDl.takeIf { it != primaryDl },
                        hasTranslation = true,
                        translatorTeam = best.translatorTeam.ifBlank { baseGame.translatorTeam.orEmpty() }
                            .takeIf { it.isNotBlank() },
                        translationReleaseId = best.id.takeIf { it > 0 } ?: baseGame.translationReleaseId,
                        isStormTeam = best.translatorTeam.contains("STORM", ignoreCase = true) || baseGame.isStormTeam,
                    )
                } else {
                    baseGame
                }
                out.add(resolvedEntry)
            }
            out
        }
    }

    private fun pickBestTranslationRelease(arr: JSONArray?, gameId: Int): SgwTranslationRelease? {
        if (arr == null || arr.length() == 0) return null
        val candidates = ArrayList<ParsedTranslationRelease>(arr.length())
        for (i in 0 until arr.length()) {
            val o = arr.optJSONObject(i) ?: continue
            if (o.optBoolean("isDeleted", false) || o.optCleanString("deletedAt").isNotBlank()) {
                continue
            }
            val fileUrl = o.optCleanString("fileUrl").ifBlank { o.optCleanString("url") }
            if (fileUrl.isBlank()) continue

            val id = o.optInt("id", 0)
            val version = o.optCleanString("version")
            val author = o.optCleanString("author")
                .ifBlank { o.optCleanString("translator") }
                .ifBlank { o.optCleanString("team") }
            val notes = listOf(
                o.optCleanString("changelog"),
                o.optCleanString("fixes"),
                o.optCleanString("notes"),
                o.optCleanString("description"),
            ).firstOrNull { it.isNotBlank() }.orEmpty()
            val sizeBytes = o.optLong("fileSizeBytes", 0L).takeIf { it > 0L }
                ?: o.optLong("fileSize", 0L).takeIf { it > 0L }
                ?: o.optLong("sizeBytes", 0L)
            val updatedAt = o.optCleanString("updatedAt").ifBlank { o.optCleanString("createdAt") }
            val isCurrent = o.optBoolean("isCurrent", false)
            val internalBuild = o.optInt("internalBuild", 0)

            candidates.add(
                ParsedTranslationRelease(
                    release = SgwTranslationRelease(
                        id = id,
                        gameId = o.optInt("gameId", gameId),
                        version = version,
                        translatorTeam = author,
                        notes = notes,
                        fileUrl = fileUrl,
                        fileSizeBytes = sizeBytes,
                        updatedAt = updatedAt,
                    ),
                    isCurrent = isCurrent,
                    internalBuild = internalBuild,
                )
            )
        }
        return candidates.maxWithOrNull { a, b ->
            val currentCmp = a.isCurrent.compareTo(b.isCurrent)
            if (currentCmp != 0) return@maxWithOrNull currentCmp
            val verCmp = SgwVersionMatcher.compareVersions(a.release.version, b.release.version)
            if (verCmp != 0) return@maxWithOrNull verCmp
            val buildCmp = a.internalBuild.compareTo(b.internalBuild)
            if (buildCmp != 0) return@maxWithOrNull buildCmp
            a.release.id.compareTo(b.release.id)
        }?.release
    }

    data class DownloadOutcome(
        val success: Boolean,
        val file: File? = null,
        val suggestedFileName: String? = null,
        val httpStatusCode: Int? = null,
        val errorMessage: String? = null,
    )

    suspend fun downloadWithResume(
        entry: SgwGameEntry,
        partFile: File,
        onProgress: (downloadedBytes: Long, totalBytes: Long) -> Unit,
        isCancelled: () -> Boolean,
    ): DownloadOutcome {
        val urls = listOfNotNull(
            entry.downloadUrl.takeIf { it.isNotBlank() },
            entry.fallbackDownloadUrl?.takeIf { it.isNotBlank() },
        ).distinct()
        var lastError = "Download failed"
        var lastStatus: Int? = null
        val activeCall = AtomicReference<Call?>(null)
        val completionHandle = currentCoroutineContext()[Job]?.invokeOnCompletion {
            activeCall.get()?.cancel()
        }

        try {
            for ((urlIndex, targetUrl) in urls.withIndex()) {
                if (urlIndex > 0) {
                    partFile.delete()
                }
                var useRange = true
                for (attempt in 0..1) {
                    if (isCancelled() || !currentCoroutineContext().isActive) {
                        activeCall.get()?.cancel()
                        return DownloadOutcome(success = false, errorMessage = "Cancelled by user")
                    }

                    var existingBytes = if (useRange && partFile.exists()) partFile.length() else 0L
                    val reqBuilder = Request.Builder()
                        .url(targetUrl)
                        .header("User-Agent", USER_AGENT)
                        .header("Accept", "*/*")
                    if (existingBytes > 0L) {
                        reqBuilder.header("Range", "bytes=$existingBytes-")
                    }

                    val call = downloadClient.newCall(reqBuilder.build())
                    activeCall.set(call)
                    if (isCancelled() || !currentCoroutineContext().isActive) {
                        call.cancel()
                        return DownloadOutcome(success = false, errorMessage = "Cancelled by user")
                    }

                    var retryWithoutRange = false
                    try {
                        call.execute().use { response ->
                            lastStatus = response.code
                            if (response.code == 416) {
                                partFile.delete()
                                existingBytes = 0L
                                if (useRange) {
                                    useRange = false
                                    retryWithoutRange = true
                                    return@use
                                }
                                lastError = "HTTP 416"
                                return@use
                            }
                            if (!response.isSuccessful && response.code != 206) {
                                lastError = "HTTP ${response.code}"
                                return@use
                            }

                            val body = response.body ?: run {
                                lastError = "Empty response body"
                                return@use
                            }

                            val contentType = (response.header("Content-Type") ?: body.contentType()?.toString())
                                .orEmpty()
                                .lowercase()
                            if (contentType.contains("text/html") || contentType.contains("application/json")) {
                                partFile.delete()
                                lastError = "Unexpected response type: $contentType"
                                return@use
                            }

                            val appendMode = response.code == 206 && existingBytes > 0L
                            if (!appendMode && existingBytes > 0L) {
                                partFile.delete()
                                existingBytes = 0L
                            }

                            val contentLength = body.contentLength()
                            val totalBytes = if (contentLength > 0L) existingBytes + contentLength else entry.fileSizeBytes
                            val dispName = parseContentDispositionFilename(response.header("Content-Disposition"))
                                ?: inferFilenameFromUrl(response.request.url.toString(), entry)

                            partFile.parentFile?.mkdirs()
                            body.byteStream().use { input ->
                                FileOutputStream(partFile, appendMode).use { output ->
                                    val buf = ByteArray(64 * 1024)
                                    var copied = existingBytes
                                    onProgress(copied, totalBytes)
                                    while (true) {
                                        if (isCancelled() || !currentCoroutineContext().isActive) {
                                            call.cancel()
                                            throw CancellationException("Cancelled by user")
                                        }
                                        val read = input.read(buf)
                                        if (read < 0) break
                                        output.write(buf, 0, read)
                                        copied += read
                                        onProgress(copied, totalBytes)
                                    }
                                    output.flush()
                                }
                            }

                            if (partFile.length() <= 0L) {
                                lastError = "Downloaded file is empty"
                                return@use
                            }

                            return DownloadOutcome(
                                success = true,
                                file = partFile,
                                suggestedFileName = dispName,
                                httpStatusCode = response.code,
                            )
                        }
                    } catch (e: CancellationException) {
                        call.cancel()
                        return DownloadOutcome(success = false, errorMessage = "Cancelled by user")
                    } catch (t: Throwable) {
                        lastError = t.message ?: t::class.java.simpleName
                        if (isCancelled() || !currentCoroutineContext().isActive) {
                            call.cancel()
                            return DownloadOutcome(success = false, errorMessage = "Cancelled by user")
                        }
                    } finally {
                        activeCall.compareAndSet(call, null)
                    }

                    if (!retryWithoutRange) {
                        break
                    }
                }
            }
        } finally {
            completionHandle?.dispose()
        }

        return DownloadOutcome(
            success = false,
            httpStatusCode = lastStatus,
            errorMessage = lastError,
        )
    }

    private suspend fun executeGetString(url: String): String {
        val request = Request.Builder()
            .url(url)
            .header("User-Agent", USER_AGENT)
            .header("Accept", "application/json")
            .build()
        val call = jsonClient.newCall(request)
        val completionHandle = currentCoroutineContext()[Job]?.invokeOnCompletion {
            call.cancel()
        }
        return try {
            call.execute().use { response ->
                if (!response.isSuccessful) {
                    throw IOException("HTTP ${response.code} for $url")
                }
                response.body?.string().orEmpty()
            }
        } finally {
            completionHandle?.dispose()
        }
    }

    private fun parseGamesResponse(raw: String, platform: SgwPlatform, sourceKind: SgwSourceKind): List<SgwGameEntry> {
        val arr = extractArray(raw, "games", "items", "data")
        val out = ArrayList<SgwGameEntry>(arr.length())
        for (i in 0 until arr.length()) {
            val o = arr.optJSONObject(i) ?: continue
            parseGameObject(o, platform, sourceKind)?.let(out::add)
        }
        return out
    }

    private fun parseGameObject(o: JSONObject, platform: SgwPlatform, sourceKind: SgwSourceKind): SgwGameEntry? {
        if (sourceKind == SgwSourceKind.MAIN_CATALOG && o.has("fileExists") && !o.optBoolean("fileExists", true)) {
            return null
        }
        val id = o.optInt("id", 0)
        val title = o.optCleanString("title").ifBlank { o.optCleanString("name") }
        if (id <= 0 || title.isBlank()) return null

        val rawCover = o.optCleanString("cover")
            .ifBlank { o.optCleanString("coverUrl") }
            .ifBlank { o.optCleanString("boxArtUrl") }
        val coverUrl = rawCover.takeIf { it.isNotBlank() }?.let(::resolveUrl)
        val version = o.optCleanString("version")
            .ifBlank { o.optCleanString("rusVersion") }
            .ifBlank { o.optCleanString("translationVersion") }
        val size = o.optLong("fileSize", 0L).takeIf { it > 0L }
            ?: o.optLong("sizeBytes", 0L).takeIf { it > 0L }
            ?: o.optLong("fileSizeBytes", 0L)
        val translator = o.optCleanString("translator")
            .ifBlank { o.optCleanString("team") }
            .ifBlank { o.optCleanString("author") }
            .takeIf { it.isNotBlank() }
        val hasTrans = o.optBoolean("hasTranslation", sourceKind == SgwSourceKind.TRANSLATION || translator != null)
        val releaseId = o.optInt("latestReleaseId", o.optInt("releaseId", 0)).takeIf { it > 0 }
        val fallbackStatic = o.optCleanString("fileUrl")
            .ifBlank { o.optCleanString("url") }
            .takeIf { it.isNotBlank() }
            ?.let(::resolveUrl)
        val primaryDl = if (sourceKind == SgwSourceKind.TRANSLATION && releaseId != null) {
            "$BASE_URL/dl/$releaseId"
        } else {
            "$BASE_URL/api/games/$id/download"
        }
        val fallbackDl = when {
            sourceKind == SgwSourceKind.TRANSLATION && fallbackStatic != null && fallbackStatic != primaryDl -> fallbackStatic
            sourceKind == SgwSourceKind.TRANSLATION && primaryDl != "$BASE_URL/api/games/$id/download" -> "$BASE_URL/api/games/$id/download"
            else -> fallbackStatic?.takeIf { it != primaryDl }
        }

        return SgwGameEntry(
            id = id,
            title = title,
            normalizedTitle = SgwVersionMatcher.normalizeTitle(title),
            platform = platform,
            version = version,
            releaseYear = o.optInt("year", 0).takeIf { it > 1990 },
            fileSizeBytes = size,
            coverUrl = coverUrl,
            downloadUrl = primaryDl,
            fallbackDownloadUrl = fallbackDl,
            sourceKind = sourceKind,
            hasTranslation = hasTrans,
            translatorTeam = translator,
            translationReleaseId = releaseId,
            isStormTeam = translator?.contains("STORM", ignoreCase = true) == true,
        )
    }

    private fun JSONObject.optCleanString(key: String, fallback: String = ""): String {
        if (!has(key) || isNull(key)) return fallback
        val value = optString(key, "").trim()
        return if (value.isEmpty() || value.equals("null", ignoreCase = true)) fallback else value
    }

    private fun resolveUrl(raw: String): String {
        val trimmed = raw.trim()
        return if (trimmed.startsWith("http://", ignoreCase = true) || trimmed.startsWith("https://", ignoreCase = true)) {
            trimmed
        } else {
            "$BASE_URL${if (trimmed.startsWith("/")) trimmed else "/$trimmed"}"
        }
    }

    private fun extractArray(raw: String, vararg keys: String): JSONArray {
        val trimmed = raw.trim()
        if (trimmed.startsWith("[")) return JSONArray(trimmed)
        if (trimmed.startsWith("{")) {
            val obj = JSONObject(trimmed)
            for (k in keys) {
                val arr = obj.optJSONArray(k)
                if (arr != null) return arr
            }
            return JSONArray()
        }
        throw IOException("Unexpected non-JSON SGW response")
    }

    private fun parseContentDispositionFilename(header: String?): String? {
        if (header.isNullOrBlank()) return null
        val match = Regex("""filename\*?=(?:UTF-8'')?"?([^";\r\n]+)"?""", RegexOption.IGNORE_CASE).find(header)
        return match?.groupValues?.getOrNull(1)?.trim()?.takeIf { it.isNotBlank() }
    }

    private fun inferFilenameFromUrl(url: String, entry: SgwGameEntry): String {
        val tail = url.substringBefore('?').substringAfterLast('/').trim()
        if (
            tail.endsWith(".nds", true) ||
            tail.endsWith(".dsi", true) ||
            tail.endsWith(".srl", true) ||
            tail.endsWith(".zip", true) ||
            tail.endsWith(".7z", true) ||
            tail.endsWith(".rar", true)
        ) {
            return tail
        }
        val safeBase = entry.title.replace(Regex("""[\\/:*?"<>|]"""), "_").trim().ifBlank { "game_${entry.id}" }
        val ext = if (entry.platform == SgwPlatform.DSI) "dsi" else "nds"
        return "$safeBase.$ext"
    }
}
