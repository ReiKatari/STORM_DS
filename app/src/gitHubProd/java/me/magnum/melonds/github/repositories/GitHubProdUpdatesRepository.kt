package me.magnum.melonds.github.repositories

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import androidx.core.net.toUri
import me.magnum.melonds.common.suspendMapCatching
import me.magnum.melonds.common.suspendRunCatching
import me.magnum.melonds.domain.model.Version
import me.magnum.melonds.domain.model.appupdate.AppUpdate
import me.magnum.melonds.domain.repositories.UpdatesRepository
import me.magnum.melonds.github.GitHubApi
import me.magnum.melonds.github.GitHubReleaseSelector
import me.magnum.melonds.github.GitHubUpdateChannel
import me.magnum.melonds.github.GitHubUpdateCheckPolicy
import me.magnum.melonds.github.PREF_KEY_GITHUB_CHECK_FOR_UPDATES
import me.magnum.melonds.github.PREF_KEY_GITHUB_UPDATE_CHANNEL
import me.magnum.melonds.utils.PackageManagerCompat

class GitHubProdUpdatesRepository(
    private val context: Context,
    private val api: GitHubApi,
    private val settingsPreferences: SharedPreferences,
    private val statePreferences: SharedPreferences,
    private val nowMillis: () -> Long = System::currentTimeMillis,
) : UpdatesRepository {
    companion object {
        private const val KEY_SKIP_VERSION = "github_updates_skip_version"
        private const val KEY_LAST_UPDATE_CHECK = "github_updates_last_check"
        private const val UPDATE_CHECK_DELAY_HOURS = 22
    }

    override suspend fun checkNewUpdate(): Result<AppUpdate?> {
        if (!shouldCheckUpdates()) {
            return Result.success(null)
        }

        return suspendRunCatching { api.getReleases() }.suspendMapCatching { releases ->
            updateLastUpdateCheckTime()
            val packageInfo = PackageManagerCompat.getPackageInfo(
                context.packageManager,
                context.packageName,
                0,
            )
            val currentVersion = Version.fromString(
                requireNotNull(packageInfo.versionName) { "Installed versionName is missing" },
            )
            val skippedVersion = Version.parseOrNull(
                statePreferences.getString(KEY_SKIP_VERSION, null),
            )
            val channel = GitHubUpdateChannel.fromPreference(
                settingsPreferences.getString(
                    PREF_KEY_GITHUB_UPDATE_CHANNEL,
                    GitHubUpdateChannel.STABLE.preferenceValue,
                ),
            )

            GitHubReleaseSelector.selectProduction(
                releases = releases,
                currentVersion = currentVersion,
                channel = channel,
                skippedVersion = skippedVersion,
            )?.let { candidate ->
                AppUpdate(
                    type = AppUpdate.Type.PRODUCTION,
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
    }

    override fun skipUpdate(update: AppUpdate) {
        statePreferences.edit {
            putString(KEY_SKIP_VERSION, update.newVersion.toString())
        }
    }

    override fun notifyUpdateDownloaded(update: AppUpdate) = Unit

    private fun shouldCheckUpdates(): Boolean {
        return GitHubUpdateCheckPolicy.shouldCheckProduction(
            enabled = settingsPreferences.getBoolean(PREF_KEY_GITHUB_CHECK_FOR_UPDATES, true),
            lastCheckMillis = statePreferences.getLong(KEY_LAST_UPDATE_CHECK, -1L),
            nowMillis = nowMillis(),
            delayHours = UPDATE_CHECK_DELAY_HOURS.toLong(),
        )
    }

    private fun updateLastUpdateCheckTime() {
        statePreferences.edit {
            putLong(KEY_LAST_UPDATE_CHECK, nowMillis())
        }
    }
}
