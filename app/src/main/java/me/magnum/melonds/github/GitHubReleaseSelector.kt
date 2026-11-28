package me.magnum.melonds.github

import me.magnum.melonds.domain.model.Version
import me.magnum.melonds.github.dtos.AssetDto
import me.magnum.melonds.github.dtos.ReleaseDto
import kotlin.time.Instant

data class ReleaseMirrorCandidate(
    val source: UpdateDownloadSource,
    val release: ReleaseDto,
    val asset: AssetDto,
    val publishedAt: Instant,
)

data class GitHubReleaseCandidate(
    val release: ReleaseDto,
    val asset: AssetDto,
    val version: Version,
    val publishedAt: Instant,
    val mirrorSources: Map<UpdateDownloadSource, ReleaseMirrorCandidate> = emptyMap(),
)

object GitHubReleaseSelector {
    fun detectSource(htmlUrl: String, downloadUrl: String): UpdateDownloadSource {
        val combined = "$htmlUrl $downloadUrl"
        return if (combined.contains("stormgamesworld.ru", ignoreCase = true) ||
            combined.contains("storm-games.world", ignoreCase = true)
        ) {
            UpdateDownloadSource.STORM_GAMES_WORLD
        } else {
            UpdateDownloadSource.GITHUB
        }
    }

    fun selectProduction(
        releases: List<ReleaseDto>,
        currentVersion: Version,
        channel: GitHubUpdateChannel,
        skippedVersion: Version?,
        preferLegacyApk: Boolean = false,
        preferredSource: UpdateDownloadSource = UpdateDownloadSource.GITHUB,
    ): GitHubReleaseCandidate? {
        val eligible = releases.asSequence()
            .filter(::belongsToConfiguredRepository)
            .filterNot { it.draft }
            .filter { channel == GitHubUpdateChannel.STABLE_AND_PRERELEASE || !it.prerelease }
            .mapNotNull { release ->
                val cleanTag = release.tagName.trim().removePrefix("v").removePrefix("V")
                val version = Version.parseOrNull(cleanTag) ?: Version.parseOrNull(release.tagName) ?: return@mapNotNull null
                if (version.type == Version.ReleaseType.NIGHTLY || version <= currentVersion) {
                    return@mapNotNull null
                }
                if (skippedVersion != null && version == skippedVersion) {
                    return@mapNotNull null
                }
                val matchingAssets = release.assets.filter(::isProductionApk)
                val asset = matchingAssets.firstOrNull { isLegacyApk(it) == preferLegacyApk }
                    ?: matchingAssets.firstOrNull()
                    ?: return@mapNotNull null
                val published = parsePublishedAt(release) ?: Instant.fromEpochMilliseconds(0L)
                GitHubReleaseCandidate(release, asset, version, published)
            }
            .toList()

        val winningVersion = eligible.maxOfOrNull { it.version } ?: return null
        val sameVersion = eligible.filter { it.version == winningVersion }
        val sourcesMap = linkedMapOf<UpdateDownloadSource, ReleaseMirrorCandidate>()
        sameVersion
            .sortedByDescending { it.publishedAt }
            .forEach { cand ->
                val src = detectSource(cand.release.htmlUrl, cand.asset.url)
                sourcesMap.putIfAbsent(src, ReleaseMirrorCandidate(src, cand.release, cand.asset, cand.publishedAt))
            }

        val primary = when (preferredSource) {
            UpdateDownloadSource.STORM_GAMES_WORLD -> sourcesMap[UpdateDownloadSource.STORM_GAMES_WORLD] ?: sourcesMap[UpdateDownloadSource.GITHUB]
            UpdateDownloadSource.GITHUB -> sourcesMap[UpdateDownloadSource.GITHUB] ?: sourcesMap[UpdateDownloadSource.STORM_GAMES_WORLD]
            UpdateDownloadSource.ASK -> sourcesMap[UpdateDownloadSource.GITHUB] ?: sourcesMap[UpdateDownloadSource.STORM_GAMES_WORLD]
        } ?: sameVersion.maxByOrNull { it.publishedAt }?.let {
            val src = detectSource(it.release.htmlUrl, it.asset.url)
            ReleaseMirrorCandidate(src, it.release, it.asset, it.publishedAt)
        } ?: return null

        return GitHubReleaseCandidate(
            release = primary.release,
            asset = primary.asset,
            version = winningVersion,
            publishedAt = primary.publishedAt,
            mirrorSources = sourcesMap.toMap(),
        )
    }

    fun selectNightly(releases: List<ReleaseDto>): GitHubReleaseCandidate? {
        return releases.asSequence()
            .filter(::belongsToConfiguredRepository)
            .filterNot { it.draft }
            .mapNotNull { release ->
                val asset = release.assets.firstOrNull(::isNightlyApk) ?: return@mapNotNull null
                val published = parsePublishedAt(release) ?: return@mapNotNull null
                GitHubReleaseCandidate(release, asset, Version.Nightly, published)
            }
            .maxByOrNull { it.publishedAt }
    }

    fun isProductionApk(asset: AssetDto): Boolean {
        val lowerName = asset.name.lowercase()
        return isRepositoryDownload(asset) &&
            (asset.contentType == APK_CONTENT_TYPE || asset.contentType == "application/octet-stream" || asset.contentType.isEmpty()) &&
            lowerName.endsWith(".apk") &&
            ("storm" in lowerName || "melondualds" in lowerName || "app" in lowerName) &&
            "nightly" !in lowerName
    }

    fun isNightlyApk(asset: AssetDto): Boolean {
        val lowerName = asset.name.lowercase()
        return isRepositoryDownload(asset) &&
            (asset.contentType == APK_CONTENT_TYPE || asset.contentType == "application/octet-stream" || asset.contentType.isEmpty()) &&
            lowerName.endsWith(".apk") &&
            ("storm" in lowerName || "melondualds" in lowerName || "app" in lowerName) &&
            "nightly" in lowerName
    }

    private fun isLegacyApk(asset: AssetDto): Boolean {
        return "legacy" in asset.name.lowercase()
    }

    private fun belongsToConfiguredRepository(release: ReleaseDto): Boolean {
        return release.htmlUrl.startsWith("${GITHUB_RELEASE_URL_PREFIX}tag/") ||
            release.htmlUrl.startsWith(STORM_GAMES_WORLD_RELEASE_URL_PREFIX) ||
            release.htmlUrl.startsWith(STORM_GAMES_WORLD_ALT_RELEASE_URL_PREFIX)
    }

    private fun isRepositoryDownload(asset: AssetDto): Boolean {
        return asset.id > 0 &&
            asset.size >= 0 &&
            (asset.url.startsWith("${GITHUB_RELEASE_URL_PREFIX}download/") ||
                asset.url.startsWith(STORM_GAMES_WORLD_DOWNLOAD_URL_PREFIX) ||
                asset.url.startsWith(STORM_GAMES_WORLD_ALT_DOWNLOAD_URL_PREFIX))
    }

    private fun parsePublishedAt(release: ReleaseDto): Instant? {
        return (release.publishedAt ?: release.createdAt)
            ?.let { runCatching { Instant.parse(it) }.getOrNull() }
    }
}
