package me.magnum.melonds.github

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import me.magnum.melonds.github.dtos.AssetDto
import me.magnum.melonds.github.dtos.ReleaseDto
import org.json.JSONArray
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

object StormUpdateMirrorClient {
    private const val USER_AGENT = "STORM-DS-Updater"
    private const val DEFAULT_PUBLISHED_AT = "2026-01-01T00:00:00Z"

    suspend fun fetchReleasesWithMirror(
        primaryFetcher: (suspend () -> List<ReleaseDto>)? = null,
    ): List<ReleaseDto> = withContext(Dispatchers.IO) {
        val combined = mutableListOf<ReleaseDto>()

        // 1. Primary GitHub API (Retrofit if provided, otherwise HttpURLConnection)
        val primaryReleases = runCatching {
            if (primaryFetcher != null) {
                primaryFetcher()
            } else {
                fetchGitHubApiReleases()
            }
        }.getOrDefault(emptyList())
        combined.addAll(primaryReleases)

        // 2. Official STORM GAMES WORLD GIT mirror (https://stormgamesworld.ru/programs?repo=STORM_DS)
        val mirrorReleases = fetchStormGamesWorldReleases()
        combined.addAll(mirrorReleases)

        // 3. Fallback if GitHub API was rate-limited and mirror is temporarily unreachable: GitHub HTML redirect
        if (combined.isEmpty()) {
            fetchGitHubLatestRedirectRelease()?.let(combined::add)
        }

        combined
    }

    fun fetchStormGamesWorldReleases(): List<ReleaseDto> {
        for (apiUrl in listOf(STORM_GAMES_WORLD_API_URL, STORM_GAMES_WORLD_ALT_API_URL)) {
            val releases = runCatching { fetchStormGamesWorldReleasesFromUrl(apiUrl) }.getOrDefault(emptyList())
            if (releases.isNotEmpty()) {
                return releases
            }
        }
        return emptyList()
    }

    private fun fetchStormGamesWorldReleasesFromUrl(apiUrl: String): List<ReleaseDto> {
        val body = httpGetText(apiUrl) ?: return emptyList()
        val root = JSONObject(body)
        val repoObj = root.optJSONObject("repository") ?: root
        val releasesArr = repoObj.optJSONArray("releases") ?: return emptyList()
        val isAltHost = apiUrl.contains("storm-games.world")
        val releaseUrlPrefix = if (isAltHost) STORM_GAMES_WORLD_ALT_RELEASE_URL_PREFIX else STORM_GAMES_WORLD_RELEASE_URL_PREFIX
        val downloadUrlPrefix = if (isAltHost) STORM_GAMES_WORLD_ALT_DOWNLOAD_URL_PREFIX else STORM_GAMES_WORLD_DOWNLOAD_URL_PREFIX

        val results = mutableListOf<ReleaseDto>()
        for (i in 0 until releasesArr.length()) {
            val relObj = releasesArr.optJSONObject(i) ?: continue
            val rawVersion = relObj.optString("version", "").trim().removePrefix("v").removePrefix("V").trim()
            if (rawVersion.isEmpty()) continue

            val title = relObj.optString("title", "STORM DS $rawVersion").ifBlank { "STORM DS $rawVersion" }
            val notes = relObj.optString("notes", "")
            val createdAt = relObj.optString("createdAt", DEFAULT_PUBLISHED_AT).ifBlank { DEFAULT_PUBLISHED_AT }
            val isPrerelease = relObj.optBoolean("isPrerelease", false)

            val assets = mutableListOf<AssetDto>()
            val assetsArr = relObj.optJSONArray("assets")
            if (assetsArr != null && assetsArr.length() > 0) {
                for (j in 0 until assetsArr.length()) {
                    val assetObj = assetsArr.optJSONObject(j) ?: continue
                    val name = assetObj.optString("name", "").trim()
                    if (name.isEmpty()) continue
                    val rawDownloadUrl = assetObj.optString("downloadUrl", "").trim()
                    val resolvedUrl = if (rawDownloadUrl.isNotEmpty()) {
                        rawDownloadUrl
                    } else {
                        "$downloadUrlPrefix$name"
                    }
                    val size = assetObj.optLong("size", 0L)
                    val contentType = assetObj.optString("contentType", APK_CONTENT_TYPE).ifBlank { APK_CONTENT_TYPE }
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
                val legacyName = "STORM_DS_${rawVersion}_LEGACY.apk"
                assets.add(
                    AssetDto(
                        id = (i * 100L) + 1L,
                        url = "$downloadUrlPrefix$mainName",
                        name = mainName,
                        size = 0L,
                        contentType = APK_CONTENT_TYPE,
                    )
                )
                assets.add(
                    AssetDto(
                        id = (i * 100L) + 2L,
                        url = "$downloadUrlPrefix$legacyName",
                        name = legacyName,
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
        return results
    }

    private fun fetchGitHubApiReleases(): List<ReleaseDto> {
        val body = httpGetText(GITHUB_API_RELEASES_URL) ?: return emptyList()
        val arr = JSONArray(body)
        val results = mutableListOf<ReleaseDto>()
        for (i in 0 until arr.length()) {
            val relObj = arr.optJSONObject(i) ?: continue
            val tagName = relObj.optString("tag_name", "").trim()
            if (tagName.isEmpty()) continue
            val assetsArr = relObj.optJSONArray("assets")
            val assets = mutableListOf<AssetDto>()
            if (assetsArr != null) {
                for (j in 0 until assetsArr.length()) {
                    val aObj = assetsArr.optJSONObject(j) ?: continue
                    assets.add(
                        AssetDto(
                            id = aObj.optLong("id", (j + 1).toLong()),
                            url = aObj.optString("browser_download_url", ""),
                            name = aObj.optString("name", ""),
                            size = aObj.optLong("size", 0L),
                            contentType = aObj.optString("content_type", APK_CONTENT_TYPE),
                        )
                    )
                }
            }
            results.add(
                ReleaseDto(
                    tagName = tagName,
                    name = relObj.optString("name", "STORM DS $tagName"),
                    body = relObj.optString("body", ""),
                    createdAt = relObj.optString("created_at", DEFAULT_PUBLISHED_AT),
                    publishedAt = relObj.optString("published_at", DEFAULT_PUBLISHED_AT),
                    htmlUrl = relObj.optString("html_url", "${GITHUB_RELEASE_URL_PREFIX}tag/$tagName"),
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
            var currentUrl = GITHUB_LATEST_REDIRECT_URL
            var redirects = 0
            while (redirects < 6) {
                val conn = (URL(currentUrl).openConnection() as HttpURLConnection).apply {
                    instanceFollowRedirects = false
                    connectTimeout = 10_000
                    readTimeout = 10_000
                    setRequestProperty("User-Agent", USER_AGENT)
                }
                val code = conn.responseCode
                val location = conn.getHeaderField("Location")
                conn.disconnect()
                if (code in 300..399 && !location.isNullOrBlank()) {
                    currentUrl = URL(URL(currentUrl), location).toString()
                    redirects++
                } else {
                    break
                }
            }
            val match = Regex("/releases/tag/(v?[0-9]+\\.[0-9]+(?:\\.[0-9]+)*)").find(currentUrl)
                ?: return@runCatching null
            val rawTag = match.groupValues[1]
            val cleanVer = rawTag.removePrefix("v").removePrefix("V")
            val mainName = "STORM_DS_$cleanVer.apk"
            val legacyName = "STORM_DS_${cleanVer}_LEGACY.apk"
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
                    AssetDto(
                        id = 2L,
                        url = "${GITHUB_RELEASE_URL_PREFIX}download/$rawTag/$legacyName",
                        name = legacyName,
                        size = 0L,
                        contentType = APK_CONTENT_TYPE,
                    ),
                ),
            )
        }.getOrNull()
    }

    private fun httpGetText(url: String): String? {
        var currentUrl = url
        var redirects = 0
        while (redirects < 6) {
            val conn = (URL(currentUrl).openConnection() as HttpURLConnection).apply {
                instanceFollowRedirects = false
                connectTimeout = 12_000
                readTimeout = 15_000
                setRequestProperty("User-Agent", USER_AGENT)
                setRequestProperty("Accept", "application/json")
            }
            val code = conn.responseCode
            if (code in 300..399) {
                val location = conn.getHeaderField("Location")
                conn.disconnect()
                if (location.isNullOrBlank()) return null
                currentUrl = URL(URL(currentUrl), location).toString()
                redirects++
                continue
            }
            return try {
                if (code in 200..299) {
                    conn.inputStream.bufferedReader(Charsets.UTF_8).use { it.readText() }
                } else {
                    null
                }
            } finally {
                conn.disconnect()
            }
        }
        return null
    }
}
