package me.magnum.melonds.sgw

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONArray
import org.json.JSONObject
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SgwApiClient @Inject constructor() {
    companion object {
        const val BASE_URL = "https://stormgamesworld.ru"
        private const val USER_AGENT = "STORM-DS/8.9.6 (Android)"
    }

    private val client: OkHttpClient by lazy { SgwSmartDns.createHttpClient() }

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
            val baseGames = parseGamesResponse(body, platform, SgwSourceKind.TRANSLATION)
            baseGames.map { game ->
                val releases = runCatching { fetchTranslationReleases(game.id) }.getOrDefault(emptyList())
                val best = releases.firstOrNull()
                if (best != null) {
                    val primaryDl = "$BASE_URL/dl/${best.id}"
                    val fallbackDl = best.fileUrl.takeIf { it.isNotBlank() }?.let { raw ->
                        if (raw.startsWith("http")) raw else "$BASE_URL${if (raw.startsWith("/")) raw else "/$raw"}"
                    }
                    game.copy(
                        version = best.version.ifBlank { game.version },
                        fileSizeBytes = if (best.fileSizeBytes > 0L) best.fileSizeBytes else game.fileSizeBytes,
                        downloadUrl = primaryDl,
                        fallbackDownloadUrl = fallbackDl ?: game.downloadUrl,
                        hasTranslation = true,
                        translatorTeam = best.translatorTeam.ifBlank { game.translatorTeam },
                        translationReleaseId = best.id,
                        isStormTeam = best.translatorTeam.contains("STORM", ignoreCase = true),
                    )
                } else {
                    game
                }
            }
        }
    }

    fun fetchTranslationReleases(gameId: Int): List<SgwTranslationRelease> {
        val url = "$BASE_URL/api/translations/releases?gameId=$gameId"
        val body = executeGetString(url)
        val arr = extractArray(body, "releases", "items", "data")
        val out = ArrayList<SgwTranslationRelease>(arr.length())
        for (i in 0 until arr.length()) {
            val o = arr.optJSONObject(i) ?: continue
            val id = o.optInt("id", 0)
            if (id <= 0) continue
            out.add(
                SgwTranslationRelease(
                    id = id,
                    gameId = o.optInt("gameId", gameId),
                    version = o.optString("version", "").trim(),
                    translatorTeam = o.optString("translator", o.optString("team", "")).trim(),
                    notes = o.optString("notes", o.optString("description", "")).trim(),
                    fileUrl = o.optString("fileUrl", o.optString("url", "")).trim(),
                    fileSizeBytes = o.optLong("fileSize", o.optLong("sizeBytes", 0L)),
                    updatedAt = o.optString("updatedAt", o.optString("createdAt", "")).trim(),
                )
            )
        }
        return out
    }

    data class DownloadOutcome(
        val success: Boolean,
        val file: File? = null,
        val suggestedFileName: String? = null,
        val httpStatusCode: Int? = null,
        val errorMessage: String? = null,
    )

    fun downloadWithResume(
        entry: SgwGameEntry,
        partFile: File,
        onProgress: (downloadedBytes: Long, totalBytes: Long) -> Unit,
        isCancelled: () -> Boolean,
    ): DownloadOutcome {
        val urls = listOfNotNull(entry.downloadUrl, entry.fallbackDownloadUrl).distinct()
        var lastError = "Download failed"
        var lastStatus: Int? = null

        for (targetUrl in urls) {
            var existingBytes = if (partFile.exists()) partFile.length() else 0L
            val reqBuilder = Request.Builder()
                .url(targetUrl)
                .header("User-Agent", USER_AGENT)
                .header("Accept", "*/*")
            if (existingBytes > 0L) {
                reqBuilder.header("Range", "bytes=$existingBytes-")
            }

            try {
                client.newCall(reqBuilder.build()).execute().use { response ->
                    lastStatus = response.code
                    if (response.code == 416) {
                        partFile.delete()
                        existingBytes = 0L
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
                                if (isCancelled()) {
                                    throw IOException("Cancelled by user")
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
            } catch (t: Throwable) {
                lastError = t.message ?: t::class.java.simpleName
                if (isCancelled()) {
                    return DownloadOutcome(success = false, errorMessage = lastError)
                }
            }
        }

        return DownloadOutcome(
            success = false,
            httpStatusCode = lastStatus,
            errorMessage = lastError,
        )
    }

    private fun executeGetString(url: String): String {
        val request = Request.Builder()
            .url(url)
            .header("User-Agent", USER_AGENT)
            .header("Accept", "application/json")
            .build()
        client.newCall(request).execute().use { response ->
            if (!response.isSuccessful) {
                throw IOException("HTTP ${response.code} for $url")
            }
            return response.body?.string().orEmpty()
        }
    }

    private fun parseGamesResponse(raw: String, platform: SgwPlatform, sourceKind: SgwSourceKind): List<SgwGameEntry> {
        val arr = extractArray(raw, "games", "items", "data")
        val out = ArrayList<SgwGameEntry>(arr.length())
        for (i in 0 until arr.length()) {
            val o = arr.optJSONObject(i) ?: continue
            val id = o.optInt("id", 0)
            val title = o.optString("title", o.optString("name", "")).trim()
            if (id <= 0 || title.isBlank()) continue

            val rawCover = o.optString("coverUrl", o.optString("cover", o.optString("boxArtUrl", ""))).trim()
            val coverUrl = rawCover.takeIf { it.isNotBlank() }?.let {
                if (it.startsWith("http")) it else "$BASE_URL${if (it.startsWith("/")) it else "/$it"}"
            }
            val version = o.optString("version", o.optString("rusVersion", o.optString("translationVersion", "1.0"))).trim()
            val size = o.optLong("fileSize", o.optLong("sizeBytes", 0L))
            val translator = o.optString("translator", o.optString("team", "")).trim().takeIf { it.isNotBlank() }
            val hasTrans = o.optBoolean("hasTranslation", sourceKind == SgwSourceKind.TRANSLATION || translator != null)
            val releaseId = o.optInt("latestReleaseId", o.optInt("releaseId", 0)).takeIf { it > 0 }
            val fallbackStatic = o.optString("fileUrl", "").trim().takeIf { it.isNotBlank() }?.let {
                if (it.startsWith("http")) it else "$BASE_URL${if (it.startsWith("/")) it else "/$it"}"
            }
            val primaryDl = if (sourceKind == SgwSourceKind.TRANSLATION && releaseId != null) {
                "$BASE_URL/dl/$releaseId"
            } else {
                "$BASE_URL/api/games/$id/download"
            }

            out.add(
                SgwGameEntry(
                    id = id,
                    title = title,
                    normalizedTitle = SgwVersionMatcher.normalizeTitle(title),
                    platform = platform,
                    version = version.ifBlank { "1.0" },
                    releaseYear = o.optInt("year", 0).takeIf { it > 1990 },
                    fileSizeBytes = size,
                    coverUrl = coverUrl,
                    downloadUrl = primaryDl,
                    fallbackDownloadUrl = fallbackStatic,
                    sourceKind = sourceKind,
                    hasTranslation = hasTrans,
                    translatorTeam = translator,
                    translationReleaseId = releaseId,
                    isStormTeam = translator?.contains("STORM", ignoreCase = true) == true,
                )
            )
        }
        return out
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
        }
        return JSONArray()
    }

    private fun parseContentDispositionFilename(header: String?): String? {
        if (header.isNullOrBlank()) return null
        val match = Regex("""filename\*?=(?:UTF-8'')?"?([^";\r\n]+)"?""", RegexOption.IGNORE_CASE).find(header)
        return match?.groupValues?.getOrNull(1)?.trim()?.takeIf { it.isNotBlank() }
    }

    private fun inferFilenameFromUrl(url: String, entry: SgwGameEntry): String {
        val tail = url.substringBefore('?').substringAfterLast('/').trim()
        if (tail.endsWith(".nds", true) || tail.endsWith(".dsi", true) || tail.endsWith(".srl", true) || tail.endsWith(".zip", true)) {
            return tail
        }
        val safeBase = entry.title.replace(Regex("""[\\/:*?"<>|]"""), "_").trim().ifBlank { "game_${entry.id}" }
        val ext = if (entry.platform == SgwPlatform.DSI) "dsi" else "nds"
        return "$safeBase.$ext"
    }
}
