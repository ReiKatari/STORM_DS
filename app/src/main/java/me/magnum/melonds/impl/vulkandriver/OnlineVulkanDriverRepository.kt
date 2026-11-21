package me.magnum.melonds.impl.vulkandriver

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.sync.Semaphore
import kotlinx.coroutines.sync.withPermit
import kotlinx.coroutines.withContext
import me.magnum.melonds.common.network.SharedOkHttpClient
import me.magnum.melonds.impl.AdrenoVulkanDriverSupport
import okhttp3.Request
import org.json.JSONArray
import java.io.File
import java.text.SimpleDateFormat
import java.util.Locale
import java.util.TimeZone
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class OnlineVulkanDriverRepository @Inject constructor(
    @ApplicationContext private val context: Context,
) {
    companion object {
        private const val CACHE_TTL_MS = 30L * 60L * 1000L
        private const val RELEASES_PER_PAGE = 12
        private const val MAX_CONCURRENT_REQUESTS = 4
        private const val USER_AGENT =
            "Mozilla/5.0 (Linux; Android 14; STORM DS) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Mobile Safari/537.36"

        val STORM_DRIVER_MIRRORS: List<String> = listOf(
            "https://stormgamesworld.ru/uploads/programs/STORM_DRIVER/STORM_DRIVER_12.0.0.zip",
            "https://github.com/ReiKatari/STORM_DRIVER/releases/download/12.0.0/STORM_DRIVER_12.0.0.zip",
            "https://media.githubusercontent.com/media/ReiKatari/STORM_GAMES_WORLD/main/Files/STORM_DRIVER_12.0.0.zip",
            "https://github.com/ReiKatari/STORM_GAMES_WORLD/raw/main/Files/STORM_DRIVER_12.0.0.zip",
        )

        val ALL_REPOSITORIES: List<VulkanDriverRepoSpec> = listOf(
            VulkanDriverRepoSpec(
                id = "storm_driver",
                displayName = "STORM DRIVER",
                repoPath = "ReiKatari/STORM_DRIVER",
                category = DriverRepoCategory.STORM,
                useTagName = true,
                sortByPublishTime = true,
            ),
            VulkanDriverRepoSpec(
                id = "kimchi",
                displayName = "KIMCHI Turnip Drivers",
                repoPath = "K11MCH1/AdrenoToolsDrivers",
                category = DriverRepoCategory.TURNIP,
                useTagName = true,
                sortByPublishTime = true,
            ),
            VulkanDriverRepoSpec(
                id = "balemuni",
                displayName = "Balemuni Turnip (Apex)",
                repoPath = "Balemuni/Balemunis-Aurora",
                category = DriverRepoCategory.TURNIP,
                useTagName = false,
                sortByPublishTime = false,
            ),
            VulkanDriverRepoSpec(
                id = "mrpurple",
                displayName = "Mr. Purple Turnip",
                repoPath = "MrPurple666/purple-turnip",
                category = DriverRepoCategory.TURNIP,
                useTagName = false,
                sortByPublishTime = false,
            ),
            VulkanDriverRepoSpec(
                id = "weabchan",
                displayName = "Weab-Chan Freedreno CI",
                repoPath = "Weab-chan/freedreno_turnip-CI",
                category = DriverRepoCategory.TURNIP,
                useTagName = false,
                sortByPublishTime = false,
            ),
            VulkanDriverRepoSpec(
                id = "whitebelyash",
                displayName = "Whitebelyash Turnip Hub",
                repoPath = "whitebelyash/freedreno_turnip-CI",
                category = DriverRepoCategory.TURNIP,
                useTagName = false,
                sortByPublishTime = true,
            ),
            VulkanDriverRepoSpec(
                id = "crueter_8elite",
                displayName = "GameHub Adreno 8xx",
                repoPath = "crueter/GameHub-8Elite-Drivers",
                category = DriverRepoCategory.QUALCOMM_8XX,
                useTagName = false,
                sortByPublishTime = false,
            ),
            VulkanDriverRepoSpec(
                id = "amaral",
                displayName = "Amaral Adreno Tools",
                repoPath = "rickamaral94/Amaral-Adreno-Tools",
                category = DriverRepoCategory.TURNIP,
                useTagName = true,
                sortByPublishTime = true,
            ),
            VulkanDriverRepoSpec(
                id = "winnative",
                displayName = "WinNative Drivers",
                repoPath = "WinNative-Emu/Drivers",
                category = DriverRepoCategory.TURNIP,
                useTagName = true,
                sortByPublishTime = true,
            ),
            VulkanDriverRepoSpec(
                id = "ak_turnip",
                displayName = "AK-Turnip (Mesa Unified)",
                repoPath = "aydar-kamaltdinov/mesa-unified",
                category = DriverRepoCategory.TURNIP,
                useTagName = true,
                sortByPublishTime = true,
            ),
            VulkanDriverRepoSpec(
                id = "stevenmx_ci",
                displayName = "StevenMX Turnip CI",
                repoPath = "StevenMXZ/freedreno_turnip-CI",
                category = DriverRepoCategory.TURNIP,
                useTagName = true,
                sortByPublishTime = true,
            ),
            VulkanDriverRepoSpec(
                id = "the412banner",
                displayName = "The412Banner Nightly Turnip",
                repoPath = "The412Banner/Banners-Turnip",
                category = DriverRepoCategory.TURNIP,
                useTagName = true,
                sortByPublishTime = true,
            ),
            VulkanDriverRepoSpec(
                id = "vauzi_710",
                displayName = "Vauzi-17 Adreno 710 / 720 / 722 Turnip",
                repoPath = "Vauzi-17/710",
                category = DriverRepoCategory.ADRENO_710,
                useTagName = true,
                sortByPublishTime = true,
            ),
            VulkanDriverRepoSpec(
                id = "stevenmx_tools",
                displayName = "StevenMXZ Adreno Tools",
                repoPath = "StevenMXZ/Adreno-Tools-Drivers",
                category = DriverRepoCategory.TURNIP,
                useTagName = true,
                sortByPublishTime = true,
            ),
        )

        fun getRecommendedDriverDisplayTitle(subFamily: AdrenoVulkanDriverSupport.AdrenoSubFamily): String? {
            return when (subFamily) {
                AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_840_PLUS -> "STORM DRIVER 12.0.0 / GameHub 8xx"
                AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_8XX_ELITE -> "STORM DRIVER 12.0.0 / GameHub 8xx"
                AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_710_720 -> "STORM DRIVER 12.0.0 / Vauzi-17 Turnip"
                AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_7XX_MODERN,
                AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_6XX,
                -> "STORM DRIVER 12.0.0 / KIMCHI Turnip"
                AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_LEGACY_OR_UNKNOWN,
                AdrenoVulkanDriverSupport.AdrenoSubFamily.NON_ADRENO,
                -> null
            }
        }
    }

    private val cacheRoot: File
        get() = File(context.cacheDir, "vulkan_driver_repos").apply { mkdirs() }

    private fun cacheJsonFile(repoId: String): File = File(cacheRoot, "$repoId.json")
    private fun cacheEtagFile(repoId: String): File = File(cacheRoot, "$repoId.etag")

    fun getCachedRepositoryGroups(): List<VulkanDriverRepoGroup> {
        return ALL_REPOSITORIES.map { spec ->
            val file = cacheJsonFile(spec.id)
            if (file.isFile && file.length() >= 2L) {
                val parsed = runCatching { parseReleasesJson(spec, file.readText(Charsets.UTF_8), isOfflineFallback = false) }
                    .getOrNull()
                if (parsed != null) {
                    return@map VulkanDriverRepoGroup(
                        spec = spec,
                        releases = parsed.ifEmpty { getOfflineFallbackForRepo(spec) },
                        isLoading = false,
                        fromCache = true,
                    )
                }
            }
            VulkanDriverRepoGroup(
                spec = spec,
                releases = getOfflineFallbackForRepo(spec),
                isLoading = true,
                fromCache = false,
            )
        }
    }

    suspend fun fetchAllRepositories(forceRefresh: Boolean = false): List<VulkanDriverRepoGroup> = withContext(Dispatchers.IO) {
        val semaphore = Semaphore(MAX_CONCURRENT_REQUESTS)
        coroutineScope {
            ALL_REPOSITORIES.map { spec ->
                async {
                    semaphore.withPermit {
                        fetchSingleRepository(spec, forceRefresh)
                    }
                }
            }.awaitAll()
        }
    }

    suspend fun fetchSingleRepository(
        spec: VulkanDriverRepoSpec,
        forceRefresh: Boolean = false,
    ): VulkanDriverRepoGroup = withContext(Dispatchers.IO) {
        val jsonFile = cacheJsonFile(spec.id)
        val etagFile = cacheEtagFile(spec.id)
        val now = System.currentTimeMillis()

        if (!forceRefresh && jsonFile.isFile && (now - jsonFile.lastModified() < CACHE_TTL_MS)) {
            val cached = runCatching { parseReleasesJson(spec, jsonFile.readText(Charsets.UTF_8), isOfflineFallback = false) }
                .getOrNull()
            if (cached != null) {
                return@withContext VulkanDriverRepoGroup(
                    spec = spec,
                    releases = cached.ifEmpty { getOfflineFallbackForRepo(spec) },
                    isLoading = false,
                    fromCache = true,
                )
            }
        }

        val apiUrl = "https://api.github.com/repos/${spec.repoPath}/releases?per_page=$RELEASES_PER_PAGE"
        val requestBuilder = Request.Builder()
            .url(apiUrl)
            .header("Accept", "application/vnd.github.v3+json")
            .header("User-Agent", USER_AGENT)

        if (!forceRefresh && etagFile.isFile && jsonFile.isFile) {
            val etag = etagFile.readText(Charsets.UTF_8).trim()
            if (etag.isNotEmpty()) {
                requestBuilder.header("If-None-Match", etag)
            }
        }

        val networkAttempt = runCatching {
            SharedOkHttpClient.instance.newCall(requestBuilder.build()).execute().use { response ->
                if (response.code == 304 && jsonFile.isFile) {
                    jsonFile.setLastModified(now)
                    val cached = parseReleasesJson(spec, jsonFile.readText(Charsets.UTF_8), isOfflineFallback = false)
                    return@use VulkanDriverRepoGroup(
                        spec = spec,
                        releases = if (cached.isNotEmpty()) cached else getOfflineFallbackForRepo(spec),
                        isLoading = false,
                        fromCache = true,
                    )
                }

                if (!response.isSuccessful) {
                    throw IllegalStateException("HTTP ${response.code}")
                }

                val bodyText = response.body?.string().orEmpty()
                if (bodyText.isBlank()) {
                    throw IllegalStateException("Empty JSON")
                }

                val parsed = parseReleasesJson(spec, bodyText, isOfflineFallback = false)
                jsonFile.writeText(bodyText, Charsets.UTF_8)
                response.header("ETag")?.takeIf { it.isNotBlank() }?.let { etag ->
                    etagFile.writeText(etag, Charsets.UTF_8)
                }
                VulkanDriverRepoGroup(
                    spec = spec,
                    releases = parsed,
                    isLoading = false,
                    fromCache = false,
                )
            }
        }

        networkAttempt.getOrElse { err ->
            // Fall back to stale cache if present, else curated offline release entry
            val staleCached = if (jsonFile.isFile) {
                runCatching { parseReleasesJson(spec, jsonFile.readText(Charsets.UTF_8), isOfflineFallback = false) }
                    .getOrNull()
                    ?.takeIf { it.isNotEmpty() }
            } else {
                null
            }
            val fallbackReleases = staleCached ?: getOfflineFallbackForRepo(spec)
            VulkanDriverRepoGroup(
                spec = spec,
                releases = fallbackReleases,
                isLoading = false,
                fromCache = staleCached != null,
                error = if (fallbackReleases.isEmpty()) err.message else null,
            )
        }
    }

    fun getRecommendedRepoIds(subFamily: AdrenoVulkanDriverSupport.AdrenoSubFamily): List<String> {
        return when (subFamily) {
            AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_840_PLUS ->
                listOf("storm_driver", "crueter_8elite", "balemuni")
            AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_8XX_ELITE ->
                listOf("storm_driver", "crueter_8elite", "kimchi", "balemuni")
            AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_710_720 ->
                listOf("storm_driver", "vauzi_710", "kimchi", "mrpurple")
            AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_7XX_MODERN ->
                listOf("storm_driver", "kimchi", "mrpurple", "weabchan", "whitebelyash")
            AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_6XX ->
                listOf("storm_driver", "kimchi", "mrpurple", "stevenmx_tools", "weabchan")
            AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_LEGACY_OR_UNKNOWN,
            AdrenoVulkanDriverSupport.AdrenoSubFamily.NON_ADRENO,
            -> emptyList()
        }
    }

    private fun parseReleasesJson(
        spec: VulkanDriverRepoSpec,
        jsonText: String,
        isOfflineFallback: Boolean,
    ): List<VulkanDriverRelease> {
        val array = JSONArray(jsonText)
        val rawList = mutableListOf<Pair<Long, VulkanDriverRelease>>()

        for (i in 0 until array.length()) {
            val obj = array.optJSONObject(i) ?: continue
            if (obj.optBoolean("draft", false)) continue

            val tagName = obj.optString("tag_name").trim()
            val releaseName = obj.optString("name").trim()
            val title = if (spec.useTagName) {
                tagName.ifEmpty { releaseName }
            } else {
                releaseName.ifEmpty { tagName }
            }.ifEmpty { spec.displayName }

            val publishedRaw = obj.optString("published_at").trim()
            val publishedEpoch = parseIsoDateEpoch(publishedRaw)
            val publishedDate = publishedRaw.take(10)
            val notes = obj.optString("body").trim()

            val assetsJson = obj.optJSONArray("assets") ?: continue
            val assets = mutableListOf<VulkanDriverAsset>()
            for (j in 0 until assetsJson.length()) {
                val assetObj = assetsJson.optJSONObject(j) ?: continue
                val assetName = assetObj.optString("name").trim()
                val downloadUrl = assetObj.optString("browser_download_url").trim()
                val sizeBytes = assetObj.optLong("size", 0L)
                if (assetName.isEmpty() || downloadUrl.isEmpty()) continue
                if (!isSupportedDriverArchiveName(assetName)) continue

                val extraMirrors = if (spec.id == "storm_driver" && assetName.equals("STORM_DRIVER_12.0.0.zip", ignoreCase = true)) {
                    STORM_DRIVER_MIRRORS
                } else {
                    emptyList()
                }
                assets.add(
                    VulkanDriverAsset(
                        name = assetName,
                        downloadUrl = downloadUrl,
                        sizeBytes = sizeBytes,
                        mirrorUrls = extraMirrors,
                    )
                )
            }

            if (assets.isEmpty()) continue

            rawList.add(
                publishedEpoch to VulkanDriverRelease(
                    id = "${spec.id}:${obj.optLong("id", i.toLong())}",
                    repoId = spec.id,
                    repoDisplayName = spec.displayName,
                    title = title,
                    tagName = tagName,
                    publishedAt = publishedDate,
                    releaseNotes = notes,
                    assets = assets,
                    isFromOfflineFallback = isOfflineFallback,
                )
            )
        }

        return if (spec.sortByPublishTime) {
            rawList.sortedByDescending { it.first }.map { it.second }
        } else {
            rawList.map { it.second }
        }
    }

    private fun isSupportedDriverArchiveName(name: String): Boolean {
        val lower = name.lowercase(Locale.ROOT)
        if (!lower.endsWith(".zip") && !lower.endsWith(".adpkg.zip") && !lower.endsWith(".adpkg")) {
            return false
        }
        return !lower.endsWith(".sha256.zip") && !lower.contains("source")
    }

    private fun parseIsoDateEpoch(isoDate: String): Long {
        if (isoDate.isBlank()) return 0L
        return runCatching {
            val fmt = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US)
            fmt.timeZone = TimeZone.getTimeZone("UTC")
            fmt.parse(isoDate)?.time ?: 0L
        }.getOrDefault(0L)
    }

    private fun getOfflineFallbackForRepo(spec: VulkanDriverRepoSpec): List<VulkanDriverRelease> {
        return when (spec.id) {
            "storm_driver" -> listOf(
                VulkanDriverRelease(
                    id = "offline:storm_driver:12.0.0",
                    repoId = spec.id,
                    repoDisplayName = spec.displayName,
                    title = "STORM DRIVER 12.0.0",
                    tagName = "12.0.0",
                    publishedAt = "2026",
                    releaseNotes = "Qualcomm Adreno 6xx/7xx/8xx unified multi-SO package (STORM GAMES WORLD + GitHub mirrors).",
                    assets = listOf(
                        VulkanDriverAsset(
                            name = "STORM_DRIVER_12.0.0.zip",
                            downloadUrl = STORM_DRIVER_MIRRORS.first(),
                            sizeBytes = 0L,
                            mirrorUrls = STORM_DRIVER_MIRRORS.drop(1),
                        )
                    ),
                    isFromOfflineFallback = true,
                )
            )
            else -> emptyList()
        }
    }
}
