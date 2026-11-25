package me.magnum.melonds.github

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.withContext
import me.magnum.melonds.common.network.HttpRedirectHelper
import me.magnum.melonds.github.dtos.AssetDto
import me.magnum.melonds.github.dtos.ReleaseDto
import org.json.JSONArray
import org.json.JSONObject

object StormUpdateMirrorClient {
    private const val USER_AGENT = "STORM-DS-Updater"
    private const val DEFAULT_PUBLISHED_AT = "2026-01-01T00:00:00Z"

    data class MirrorFetchResult(
        val releases: List<ReleaseDto>,
        val anySourceSucceeded: Boolean,
    )

    private fun JSONObject.optCleanString(key: String, default: String = ""): String {
        if (isNull(key)) return default
        val v = optString(key, default)
        return if (v.equals("null", ignoreCase = true)) default else v
    }

    suspend fun fetchReleasesWithMirror(
        primaryFetcher: (suspend () -> List<ReleaseDto>)? = null,
    ): List<ReleaseDto> = fetchReleasesWithStatus(primaryFetcher).releases

    suspend fun fetchReleasesWithStatus(
        primaryFetcher: (suspend () -> List<ReleaseDto>)? = null,
    ): MirrorFetchResult = withContext(Dispatchers.IO) {
        coroutineScope {
            val ghDeferred = async(Dispatchers.IO) {
                var ghOk = false
                var ghReleases: List<ReleaseDto> = emptyList()
                if (primaryFetcher != null) {
                    val primaryAttempt = runCatching { primaryFetcher() }
                    if (primaryAttempt.isSuccess) {
                        val list = primaryAttempt.getOrDefault(emptyList())
                        if (list.isNotEmpty()) {
                            ghOk = true
                            ghReleases = list
                        }
                    }
                }
                if (!ghOk) {
                    val rawAttempt = runCatching { fetchGitHubApiReleases() }
                    if (rawAttempt.isSuccess) {
                        val list = rawAttempt.getOrDefault(emptyList())
                        if (list.isNotEmpty()) {
                            ghOk = true
                            ghReleases = list
                        }
                    }
                }
                ghReleases to ghOk
            }

            val sgwDeferred = async(Dispatchers.IO) {
                fetchStormGamesWorldReleasesWithStatus()
            }

            val (primaryReleases, primaryOk) = ghDeferred.await()
            val (mirrorReleases, mirrorOk) = sgwDeferred.await()

            val combined = mutableListOf<ReleaseDto>()
            combined.addAll(primaryReleases)
            combined.addAll(mirrorReleases)

            var redirectOk = false
            val hasAnyValidAsset = combined.any { rel ->
                rel.assets.any(GitHubReleaseSelector::isProductionApk)
            }
            if (!hasAnyValidAsset) {
                val redirectRelease = fetchGitHubLatestRedirectRelease()
                if (redirectRelease != null) {
                    redirectOk = true
                    combined.add(redirectRelease)
                }
            }

            MirrorFetchResult(
                releases = combined,
                anySourceSucceeded = primaryOk || mirrorOk || redirectOk,
            )
        }
    }

    fun fetchStormGamesWorldReleases(): List<ReleaseDto> = fetchStormGamesWorldReleasesWithStatus().first

    private fun fetchStormGamesWorldReleasesWithStatus(): Pair<List<ReleaseDto>, Boolean> {
        val urls = listOf(
            STORM_GAMES_WORLD_RELEASES_API_URL to 15_000,
            STORM_GAMES_WORLD_API_URL to 15_000,
            STORM_GAMES_WORLD_ALT_RELEASES_API_URL to 15_000,
            STORM_GAMES_WORLD_ALT_API_URL to 15_000,
        )
        var anyParsed = false
        for ((apiUrl, readTimeoutMs) in urls) {
            val attempt = runCatching { fetchStormGamesWorldReleasesFromUrlWithStatus(apiUrl, readTimeoutMs) }
            if (attempt.isSuccess) {
                val (releases, parsedOk) = attempt.getOrDefault(emptyList<ReleaseDto>() to false)
                if (parsedOk) anyParsed = true
                if (releases.isNotEmpty()) {
                    return releases to true
                }
            }
        }
        return emptyList<ReleaseDto>() to anyParsed
    }

    internal fun normalizeStormGamesWorldDownloadUrl(
        rawDownloadUrl: String,
        fileName: String,
        isAltHost: Boolean,
    ): String {
        val host = if (isAltHost) STORM_GAMES_WORLD_ALT_HOST else STORM_GAMES_WORLD_HOST
        val downloadUrlPrefix = if (isAltHost) STORM_GAMES_WORLD_ALT_DOWNLOAD_URL_PREFIX else STORM_GAMES_WORLD_DOWNLOAD_URL_PREFIX
        val trimmed = rawDownloadUrl.trim()
        if (trimmed.isEmpty()) {
            return "$downloadUrlPrefix$fileName"
        }
        if (trimmed.startsWith("http://", ignoreCase = true) || trimmed.startsWith("https://", ignoreCase = true)) {
            val withoutScheme = trimmed.substringAfter("://")
            val authority = withoutScheme.substringBefore('/').lowercase()
            val hostname = authority.substringBefore(':')
            if (hostname == "0.0.0.0" || hostname == "127.0.0.1" || hostname == "localhost") {
                val path = "/" + withoutScheme.substringAfter('/', "").trimStart('/')
                return if (path.startsWith("/uploads/programs/", ignoreCase = true)) {
                    "$host$path"
                } else {
                    "$downloadUrlPrefix$fileName"
                }
            }
            return trimmed
        }
        if (trimmed.startsWith("/")) {
            return "$host$trimmed"
        }
        return if (!trimmed.contains('/')) {
            "$downloadUrlPrefix$trimmed"
        } else {
            "$host/$trimmed"
        }
    }

    private fun fetchStormGamesWorldReleasesFromUrlWithStatus(
        apiUrl: String,
        readTimeoutMs: Int = 15_000,
    ): Pair<List<ReleaseDto>, Boolean> {
        val body = httpGetText(apiUrl, connectTimeoutMs = 10_000, readTimeoutMs = readTimeoutMs)
            ?: return emptyList<ReleaseDto>() to false
        val root = JSONObject(body)
        val repoObj = root.optJSONObject("repository") ?: root
        val releasesArr = repoObj.optJSONArray("releases")
            ?: return emptyList<ReleaseDto>() to root.optBoolean("success", false)
        val isAltHost = apiUrl.contains("storm-games.world")
        val releaseUrlPrefix = if (isAltHost) STORM_GAMES_WORLD_ALT_RELEASE_URL_PREFIX else STORM_GAMES_WORLD_RELEASE_URL_PREFIX
        val downloadUrlPrefix = if (isAltHost) STORM_GAMES_WORLD_ALT_DOWNLOAD_URL_PREFIX else STORM_GAMES_WORLD_DOWNLOAD_URL_PREFIX

        val results = mutableListOf<ReleaseDto>()
        for (i in 0 until releasesArr.length()) {
            val relObj = releasesArr.optJSONObject(i) ?: continue
            val rawVersion = relObj.optCleanString("version", "").trim().removePrefix("v").removePrefix("V").trim()
            if (rawVersion.isEmpty()) continue

            val title = relObj.optCleanString("title", "STORM DS $rawVersion").ifBlank { "STORM DS $rawVersion" }
            val notes = relObj.optCleanString("notes", "")
            val createdAt = relObj.optCleanString("createdAt", "")
                .ifBlank { relObj.optCleanString("publishedAt", DEFAULT_PUBLISHED_AT) }
                .ifBlank { DEFAULT_PUBLISHED_AT }
            val isPrerelease = relObj.optBoolean("isPrerelease", false)

            val assets = mutableListOf<AssetDto>()
            val assetsArr = relObj.optJSONArray("assets")
            if (assetsArr != null && assetsArr.length() > 0) {
                for (j in 0 until assetsArr.length()) {
                    val assetObj = assetsArr.optJSONObject(j) ?: continue
                    val name = assetObj.optCleanString("name", "").trim()
                    if (name.isEmpty()) continue
                    val rawDownloadUrl = assetObj.optCleanString("downloadUrl", "").trim()
                    val resolvedUrl = normalizeStormGamesWorldDownloadUrl(rawDownloadUrl, name, isAltHost)
                    val size = assetObj.optLong("size", 0L)
                    val contentType = assetObj.optCleanString("contentType", APK_CONTENT_TYPE).ifBlank { APK_CONTENT_TYPE }
                    assets.add(
                        AssetDto(
                            id = (i * 100L) + j + 1L,
                            url = resolvedUrl,
                            name = name,
                            size = size,
                            contentType = contentType,
                        )
                    )
                }
            } else {
                val mainName = "STORM_DS_$rawVersion.apk"
                assets.add(
                    AssetDto(
                        id = (i * 100L) + 1L,
                        url = "$downloadUrlPrefix$mainName",
                        name = mainName,
                        size = 0L,
                        contentType = APK_CONTENT_TYPE,
                    )
                )
            }

            results.add(
                ReleaseDto(
                    tagName = rawVersion,
                    name = title,
                    body = notes,
                    createdAt = createdAt,
                    publishedAt = createdAt,
                    htmlUrl = "$releaseUrlPrefix&tag=$rawVersion",
                    draft = false,
                    prerelease = isPrerelease,
                    assets = assets,
                )
            )
        }
        return results to true
    }

    private fun fetchGitHubApiReleases(): List<ReleaseDto> {
        val body = httpGetText(GITHUB_API_RELEASES_URL, connectTimeoutMs = 10_000, readTimeoutMs = 15_000)
            ?: return emptyList()
        val arr = JSONArray(body)
        val results = mutableListOf<ReleaseDto>()
        for (i in 0 until arr.length()) {
            val relObj = arr.optJSONObject(i) ?: continue
            val tagName = relObj.optCleanString("tag_name", "").trim()
            if (tagName.isEmpty()) continue
            val assetsArr = relObj.optJSONArray("assets")
            val assets = mutableListOf<AssetDto>()
            if (assetsArr != null) {
                for (j in 0 until assetsArr.length()) {
                    val aObj = assetsArr.optJSONObject(j) ?: continue
                    assets.add(
                        AssetDto(
                            id = aObj.optLong("id", (j + 1).toLong()),
                            url = aObj.optCleanString("browser_download_url", ""),
                            name = aObj.optCleanString("name", ""),
                            size = aObj.optLong("size", 0L),
                            contentType = aObj.optCleanString("content_type", APK_CONTENT_TYPE).ifBlank { APK_CONTENT_TYPE },
                        )
                    )
                }
            }
            val createdAt = relObj.optCleanString("created_at", DEFAULT_PUBLISHED_AT).ifBlank { DEFAULT_PUBLISHED_AT }
            val publishedAt = relObj.optCleanString("published_at", createdAt).ifBlank { createdAt }
            results.add(
                ReleaseDto(
                    tagName = tagName,
                    name = relObj.optCleanString("name", "STORM DS $tagName").ifBlank { "STORM DS $tagName" },
                    body = relObj.optCleanString("body", ""),
                    createdAt = createdAt,
                    publishedAt = publishedAt,
                    htmlUrl = relObj.optCleanString("html_url", "${GITHUB_RELEASE_URL_PREFIX}tag/$tagName"),
                    draft = relObj.optBoolean("draft", false),
                    prerelease = relObj.optBoolean("prerelease", false),
                    assets = assets,
                )
            )
        }
        return results
    }

    private fun fetchGitHubLatestRedirectRelease(): ReleaseDto? {
        return runCatching {
            val currentUrl = HttpRedirectHelper.resolveFinalRedirectUrl(
                initialUrl = GITHUB_LATEST_REDIRECT_URL,
                maxRedirects = 6,
                connectTimeoutMs = 10_000,
                readTimeoutMs = 15_000,
                userAgent = USER_AGENT,
            )
            val match = Regex("""/releases/tag/(v?[0-9]+\.[0-9]+(?:\.[0-9]+)*)""").find(currentUrl)
                ?: return@runCatching null
            val rawTag = match.groupValues[1]
            val cleanVer = rawTag.removePrefix("v").removePrefix("V")
            val mainName = "STORM_DS_$cleanVer.apk"
            ReleaseDto(
                tagName = rawTag,
                name = "STORM DS $cleanVer",
                body = "",
                createdAt = DEFAULT_PUBLISHED_AT,
                publishedAt = DEFAULT_PUBLISHED_AT,
                htmlUrl = "${GITHUB_RELEASE_URL_PREFIX}tag/$rawTag",
                draft = false,
                prerelease = false,
                assets = listOf(
                    AssetDto(
                        id = 1L,
                        url = "${GITHUB_RELEASE_URL_PREFIX}download/$rawTag/$mainName",
                        name = mainName,
                        size = 0L,
                        contentType = APK_CONTENT_TYPE,
                    ),
                ),
            )
        }.getOrNull()
    }

    private fun httpGetText(
        url: String,
        connectTimeoutMs: Int = 10_000,
        readTimeoutMs: Int = 15_000,
    ): String? {
        val conn = runCatching {
            HttpRedirectHelper.openConnectionWithRedirects(
                initialUrl = url,
                maxRedirects = 6,
                connectTimeoutMs = connectTimeoutMs,
                readTimeoutMs = readTimeoutMs,
                userAgent = USER_AGENT,
                accept = "application/json",
            )
        }.getOrNull() ?: return null
        return try {
            conn.inputStream.bufferedReader(Charsets.UTF_8).use { it.readText() }
        } finally {
            conn.disconnect()
        }
    }
}
