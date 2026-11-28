package me.magnum.melonds.github

import me.magnum.melonds.domain.model.Version
import me.magnum.melonds.github.dtos.AssetDto
import me.magnum.melonds.github.dtos.ReleaseDto
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test
import java.util.concurrent.TimeUnit

class GitHubUpdatePolicyAndSelectorTest {

    @Test
    fun checkPolicy_respectsEnabledFlagAndOneHourCooldown() {
        val now = 10_000_000L
        assertFalse(GitHubUpdateCheckPolicy.shouldCheckProduction(enabled = false, lastCheckMillis = -1L, nowMillis = now))
        assertTrue(GitHubUpdateCheckPolicy.shouldCheckProduction(enabled = true, lastCheckMillis = -1L, nowMillis = now))

        val thirtyMinutesAgo = now - TimeUnit.MINUTES.toMillis(30)
        assertFalse(GitHubUpdateCheckPolicy.shouldCheckProduction(enabled = true, lastCheckMillis = thirtyMinutesAgo, nowMillis = now))

        val twoHoursAgo = now - TimeUnit.HOURS.toMillis(2)
        assertTrue(GitHubUpdateCheckPolicy.shouldCheckProduction(enabled = true, lastCheckMillis = twoHoursAgo, nowMillis = now))
    }

    @Test
    fun selector_respectsSkippedVersionUntilCleared() {
        val candidateVersion = Version(Version.ReleaseType.FINAL, 8, 9, 7)
        val installedVersion = Version(Version.ReleaseType.FINAL, 8, 9, 6)
        val release = ReleaseDto(
            tagName = "8.9.7",
            name = "STORM DS 8.9.7",
            body = "Release notes",
            prerelease = false,
            createdAt = "2026-11-28T10:00:00Z",
            publishedAt = "2026-11-28T10:00:00Z",
            htmlUrl = "https://github.com/ReiKatari/STORM_DS/releases/tag/8.9.7",
            assets = listOf(
                AssetDto(
                    id = 1L,
                    url = "https://github.com/ReiKatari/STORM_DS/releases/download/8.9.7/STORM_DS_8.9.7.apk",
                    name = "STORM_DS_8.9.7.apk",
                    contentType = "application/vnd.android.package-archive",
                    size = 75_000_000L,
                ),
            ),
        )

        val skippedResult = GitHubReleaseSelector.selectProduction(
            releases = listOf(release),
            currentVersion = installedVersion,
            channel = GitHubUpdateChannel.STABLE,
            skippedVersion = candidateVersion,
            preferLegacyApk = false,
        )
        assertNull(skippedResult)

        val clearedResult = GitHubReleaseSelector.selectProduction(
            releases = listOf(release),
            currentVersion = installedVersion,
            channel = GitHubUpdateChannel.STABLE,
            skippedVersion = null,
            preferLegacyApk = false,
        )
        assertNotNull(clearedResult)
        assertEquals(candidateVersion, clearedResult?.version)
    }
}
