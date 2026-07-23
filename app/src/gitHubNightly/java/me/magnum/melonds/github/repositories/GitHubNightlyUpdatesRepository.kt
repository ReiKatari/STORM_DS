package me.magnum.melonds.github.repositories

import android.content.SharedPreferences
import androidx.core.content.edit
import androidx.core.net.toUri
import me.magnum.melonds.common.suspendMapCatching
import me.magnum.melonds.common.suspendRunCatching
import me.magnum.melonds.domain.model.appupdate.AppUpdate
import me.magnum.melonds.domain.repositories.UpdatesRepository
import me.magnum.melonds.github.GitHubApi
import me.magnum.melonds.github.GitHubReleaseSelector
import me.magnum.melonds.github.PREF_KEY_GITHUB_CHECK_FOR_UPDATES
import kotlin.time.Clock
import kotlin.time.Duration.Companion.days

class GitHubNightlyUpdatesRepository(
    private val api: GitHubApi,
    private val settingsPreferences: SharedPreferences,
    private val statePreferences: SharedPreferences,
) : UpdatesRepository {
    companion object {
        private const val KEY_NEXT_CHECK_DATE = "github_updates_nightly_next_check_date"
        private const val KEY_LAST_RELEASE_DATE = "github_updates_nightly_last_release_date"
    }

    override suspend fun checkNewUpdate(): Result<AppUpdate?> {
        if (!shouldCheckUpdates()) {
            return Result.success(null)
        }

        return suspendRunCatching { api.getReleases() }.suspendMapCatching { releases ->
            val candidate = GitHubReleaseSelector.selectNightly(releases) ?: return@suspendMapCatching null
            if (!shouldUpdate(candidate.publishedAt.toEpochMilliseconds())) {
                return@suspendMapCatching null
            }

            AppUpdate(
                type = AppUpdate.Type.NIGHTLY,
                id = candidate.asset.id,
                downloadUri = candidate.asset.url.toUri(),
                newVersion = candidate.version,
                description = candidate.release.body,
                binarySize = candidate.asset.size,
                updateDate = candidate.publishedAt,
                releaseTag = candidate.release.tagName,
                sourceReleaseUrl = candidate.release.htmlUrl,
            )
        }
    }

    override fun skipUpdate(update: AppUpdate) = scheduleNextUpdate()

    override fun notifyUpdateDownloaded(update: AppUpdate) {
        statePreferences.edit {
            putLong(KEY_LAST_RELEASE_DATE, update.updateDate.toEpochMilliseconds())
        }
    }

    private fun shouldCheckUpdates(): Boolean {
        if (!settingsPreferences.getBoolean(PREF_KEY_GITHUB_CHECK_FOR_UPDATES, true)) {
            return false
        }
        val nextCheck = statePreferences.getLong(KEY_NEXT_CHECK_DATE, -1L)
        return nextCheck == -1L || Clock.System.now().toEpochMilliseconds() > nextCheck
    }

    private fun scheduleNextUpdate() {
        statePreferences.edit {
            putLong(KEY_NEXT_CHECK_DATE, (Clock.System.now() + 1.days).toEpochMilliseconds())
        }
    }

    private fun shouldUpdate(releaseDateMillis: Long): Boolean {
        val lastReleaseDate = statePreferences.getLong(KEY_LAST_RELEASE_DATE, -1L)
        if (lastReleaseDate == -1L) {
            statePreferences.edit { putLong(KEY_LAST_RELEASE_DATE, releaseDateMillis) }
            scheduleNextUpdate()
            return false
        }
        return releaseDateMillis > lastReleaseDate
    }
}
