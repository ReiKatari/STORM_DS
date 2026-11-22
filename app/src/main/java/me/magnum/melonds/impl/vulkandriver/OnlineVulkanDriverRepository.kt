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
            VulkanDriverRepoSpec(
                id = "malisx2",
                displayName = "malisx2 (Arm Mali PanVK)",
                repoPath = "bmdhacks/malisx2",
                category = DriverRepoCategory.ALL,
                useTagName = true,
                sortByPublishTime = true,
            ),
        )

        fun getRecommendedDriverDisplayTitle(
            subFamily: AdrenoVulkanDriverSupport.AdrenoSubFamily,
            malisx2Supported: Boolean = false,
        ): String? {
            if (subFamily == AdrenoVulkanDriverSupport.AdrenoSubFamily.NON_ADRENO && malisx2Supported) {
                return "malisx2 (Arm Mali PanVK)"
            }
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

        private val ADRENO_710_TOKEN_REGEX = Regex("(^|[^a-z0-9])(a?710|a?720|a?722|adreno[_\\s-]*(710|720|722))([^a-z0-9]|$)")
        private val ADRENO_8XX_TOKEN_REGEX = Regex("(^|[^a-z0-9])(825|829|830|840|845|850|a830|a840|a8xx|gen8|8elite|sm8750|sm8850)([^a-z0-9]|$)")

        fun isRepoSupportedOnDevice(
            repoId: String,
            subFamily: AdrenoVulkanDriverSupport.AdrenoSubFamily,
            malisx2Supported: Boolean = false,
        ): Boolean {
            if (repoId == "malisx2") {
                return malisx2Supported && subFamily == AdrenoVulkanDriverSupport.AdrenoSubFamily.NON_ADRENO
            }
            return when (subFamily) {
                AdrenoVulkanDriverSupport.AdrenoSubFamily.NON_ADRENO,
                AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_LEGACY_OR_UNKNOWN,
                -> false

                AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_840_PLUS,
                AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_8XX_ELITE,
                -> repoId != "vauzi_710"

                AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_710_720 ->
                    repoId != "crueter_8elite"

                AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_7XX_MODERN,
                AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_6XX,
                -> repoId != "crueter_8elite" && repoId != "vauzi_710"
            }
        }

        fun isAssetSupportedOnDevice(
            repoId: String,
            releaseTitle: String,
            releaseNotes: String,
            tagName: String,
            assetName: String,
            subFamily: AdrenoVulkanDriverSupport.AdrenoSubFamily,
            malisx2Supported: Boolean = false,
        ): Boolean {
            if (!isRepoSupportedOnDevice(repoId, subFamily, malisx2Supported)) {
                return false
            }
            if (repoId == "malisx2") {
                val lowerAsset = assetName.lowercase(Locale.ROOT)
                return lowerAsset.startsWith("malisx2-") &&
                    lowerAsset.endsWith(".zip") &&
                    !lowerAsset.endsWith(".sha256.zip")
            }
            if (repoId == "storm_driver") {
                return true
            }
            val titleAndAsset = "$releaseTitle $tagName $assetName".lowercase(Locale.ROOT)

            val hasUnifiedTag = titleAndAsset.contains("a6xx") ||
                titleAndAsset.contains("a7xx") ||
                titleAndAsset.contains("6xx") ||
                titleAndAsset.contains("7xx") ||
                titleAndAsset.contains("unified") ||
                titleAndAsset.contains("all adreno")

            val has710OnlyTag = ADRENO_710_TOKEN_REGEX.containsMatchIn(titleAndAsset) &&
                !titleAndAsset.contains("a7xx") &&
                !titleAndAsset.contains("6xx")

            return when (subFamily) {
                AdrenoVulkanDriverSupport.AdrenoSubFamily.NON_ADRENO,
                AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_LEGACY_OR_UNKNOWN,
                -> false

                AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_840_PLUS -> {
                    if (has710OnlyTag) return false
                    if (repoId == "crueter_8elite") {
                        return !titleAndAsset.contains("a7xx") && !titleAndAsset.contains("a6xx")
                    }
                    titleAndAsset.contains("840") ||
                        titleAndAsset.contains("8850") ||
                        titleAndAsset.contains("gen 5") ||
                        titleAndAsset.contains("gen5") ||
                        titleAndAsset.contains("a840") ||
                        titleAndAsset.contains("gamehub") ||
                        titleAndAsset.contains("adreno 8") ||
                        titleAndAsset.contains("adreno8") ||
                        titleAndAsset.contains("8 elite") ||
                        titleAndAsset.contains("a8xx") ||
                        titleAndAsset.contains("849.") ||
                        titleAndAsset.contains("842.")
                }

                AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_8XX_ELITE -> {
                    if (has710OnlyTag) return false
                    if (repoId == "crueter_8elite") {
                        return !titleAndAsset.contains("a7xx") && !titleAndAsset.contains("a6xx")
                    }
                    ADRENO_8XX_TOKEN_REGEX.containsMatchIn(titleAndAsset) ||
                        titleAndAsset.contains("adreno 8") ||
                        titleAndAsset.contains("adreno8") ||
                        titleAndAsset.contains("8 elite") ||
                        titleAndAsset.contains("gamehub") ||
                        titleAndAsset.contains("842.8") ||
                        titleAndAsset.contains("849.")
                }

                AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_710_720 -> {
                    val is8xxOnly = (ADRENO_8XX_TOKEN_REGEX.containsMatchIn(titleAndAsset) ||
                        titleAndAsset.contains("adreno 8") ||
                        titleAndAsset.contains("adreno8") ||
                        titleAndAsset.contains("8 elite") ||
                        titleAndAsset.contains("849.") ||
                        titleAndAsset.contains("842.")) && !hasUnifiedTag
                    !is8xxOnly
                }

                AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_7XX_MODERN,
                AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_6XX,
                -> {
                    if (has710OnlyTag) return false
                    val is8xxOnly = (ADRENO_8XX_TOKEN_REGEX.containsMatchIn(titleAndAsset) ||
                        titleAndAsset.contains("adreno 8") ||
                        titleAndAsset.contains("adreno8") ||
                        titleAndAsset.contains("8 elite") ||
                        titleAndAsset.contains("849.") ||
                        titleAndAsset.contains("842.")) && !hasUnifiedTag
                    !is8xxOnly
                }
            }
        }

        fun filterCompatibleGroups(
            groups: List<VulkanDriverRepoGroup>,
            subFamily: AdrenoVulkanDriverSupport.AdrenoSubFamily,
            malisx2Supported: Boolean = false,
        ): List<VulkanDriverRepoGroup> {
            val recommendedIds = getRecommendedRepoIdsFor(subFamily, malisx2Supported)
            val compatible = groups.mapNotNull { group ->
                if (!isRepoSupportedOnDevice(group.spec.id, subFamily, malisx2Supported)) {
                    return@mapNotNull null
                }
                if (group.releases.isEmpty()) {
                    return@mapNotNull if (group.isLoading) group else null
                }
                val filteredReleases = group.releases.mapNotNull { release ->
                    val compatAssets = release.assets.filter { asset ->
                        isAssetSupportedOnDevice(
                            repoId = group.spec.id,
                            releaseTitle = release.title,
                            releaseNotes = release.releaseNotes,
                            tagName = release.tagName,
                            assetName = asset.name,
                            subFamily = subFamily,
                            malisx2Supported = malisx2Supported,
                        )
                    }
                    if (compatAssets.isEmpty()) null else release.copy(assets = compatAssets)
                }
                if (filteredReleases.isEmpty() && !group.isLoading) {
                    null
                } else {
                    group.copy(releases = filteredReleases)
                }
            }

            return compatible.sortedWith(
                compareBy<VulkanDriverRepoGroup> { group ->
                    val recIndex = recommendedIds.indexOf(group.spec.id)
                    if (recIndex >= 0) recIndex else Int.MAX_VALUE
                }
            )
        }

        fun getAvailableCategories(groups: List<VulkanDriverRepoGroup>): List<DriverRepoCategory> {
            return buildList {
                add(DriverRepoCategory.ALL)
                DriverRepoCategory.entries.forEach { category ->
                    if (category != DriverRepoCategory.ALL && groups.any { it.spec.category == category }) {
                        add(category)
                    }
                }
            }
        }

        fun getRecommendedRepoIdsFor(
            subFamily: AdrenoVulkanDriverSupport.AdrenoSubFamily,
            malisx2Supported: Boolean = false,
        ): List<String> {
            if (subFamily == AdrenoVulkanDriverSupport.AdrenoSubFamily.NON_ADRENO && malisx2Supported) {
                return listOf("malisx2")
            }
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
    }

    private val cacheRoot: File
        get() = File(context.cacheDir, "vulkan_driver_repos").apply { mkdirs() }

    private fun cacheJsonFile(repoId: String): File = File(cacheRoot, "$repoId.json")
    private fun cacheEtagFile(repoId: String): File = File(cacheRoot, "$repoId.etag")

    fun getCachedRepositoryGroups(
        subFamily: AdrenoVulkanDriverSupport.AdrenoSubFamily = AdrenoVulkanDriverSupport.getSubFamily(),
        malisx2Supported: Boolean = AdrenoVulkanDriverSupport.isMalisx2Supported(),
    ): List<VulkanDriverRepoGroup> {
        val raw = ALL_REPOSITORIES
            .filter { isRepoSupportedOnDevice(it.id, subFamily, malisx2Supported) }
            .map { spec ->
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
        return filterCompatibleGroups(raw, subFamily, malisx2Supported)
    }

    suspend fun fetchAllRepositories(
        forceRefresh: Boolean = false,
        subFamily: AdrenoVulkanDriverSupport.AdrenoSubFamily = AdrenoVulkanDriverSupport.getSubFamily(),
        malisx2Supported: Boolean = AdrenoVulkanDriverSupport.isMalisx2Supported(),
    ): List<VulkanDriverRepoGroup> = withContext(Dispatchers.IO) {
        val supportedSpecs = ALL_REPOSITORIES.filter { isRepoSupportedOnDevice(it.id, subFamily, malisx2Supported) }
        if (supportedSpecs.isEmpty()) {
            return@withContext emptyList()
        }
        val semaphore = Semaphore(MAX_CONCURRENT_REQUESTS)
        val raw = coroutineScope {
            supportedSpecs.map { spec ->
                async {
                    semaphore.withPermit {
                        fetchSingleRepository(spec, forceRefresh)
                    }
                }
            }.awaitAll()
        }
        filterCompatibleGroups(raw, subFamily, malisx2Supported)
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

    fun getRecommendedRepoIds(
        subFamily: AdrenoVulkanDriverSupport.AdrenoSubFamily,
        malisx2Supported: Boolean = AdrenoVulkanDriverSupport.isMalisx2Supported(),
    ): List<String> {
        return getRecommendedRepoIdsFor(subFamily, malisx2Supported)
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
                if (!isSupportedDriverArchiveName(assetName, spec.id)) continue

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

    private fun isSupportedDriverArchiveName(name: String, repoId: String? = null): Boolean {
        val lower = name.lowercase(Locale.ROOT)
        if (repoId == "malisx2") {
            return lower.startsWith("malisx2-") &&
                lower.endsWith(".zip") &&
                !lower.endsWith(".sha256.zip") &&
                !lower.contains("source")
        }
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
