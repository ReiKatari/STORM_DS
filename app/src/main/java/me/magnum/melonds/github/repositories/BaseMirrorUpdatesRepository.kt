package me.magnum.melonds.github.repositories

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import androidx.core.net.toUri
import me.magnum.melonds.R
import me.magnum.melonds.common.suspendMapCatching
import me.magnum.melonds.common.suspendRunCatching
import me.magnum.melonds.domain.model.Version
import me.magnum.melonds.domain.model.appupdate.AppUpdate
import me.magnum.melonds.domain.repositories.UpdatesRepository
import me.magnum.melonds.github.GitHubReleaseSelector
import me.magnum.melonds.github.GitHubUpdateChannel
import me.magnum.melonds.github.GitHubUpdateCheckPolicy
import me.magnum.melonds.github.PREF_KEY_GITHUB_CHECK_FOR_UPDATES
import me.magnum.melonds.github.PREF_KEY_GITHUB_UPDATE_CHANNEL
import me.magnum.melonds.github.StormUpdateMirrorClient
import me.magnum.melonds.github.dtos.ReleaseDto
import me.magnum.melonds.utils.PackageManagerCompat

open class BaseMirrorUpdatesRepository(
    private val context: Context,
    private val settingsPreferences: SharedPreferences,
    private val statePreferences: SharedPreferences,
    private val defaultAdrenotoolsEnabled: Boolean,
    private val primaryFetcher: (suspend () -> List<ReleaseDto>)? = null,
    private val nowMillis: () -> Long = System::currentTimeMillis,
) : UpdatesRepository {
    companion object {
        private const val KEY_SKIP_VERSION = "github_updates_skip_version"
        private const val KEY_LAST_UPDATE_CHECK = "github_updates_last_check"
    }

    private var sessionSkippedVersion: Version? = null

    override suspend fun checkNewUpdate(ignorePreferences: Boolean): Result<AppUpdate?> {
        if (ignorePreferences) {
            sessionSkippedVersion = null
        }

        val updatesEnabled = ignorePreferences || settingsPreferences.getBoolean(PREF_KEY_GITHUB_CHECK_FOR_UPDATES, true)
        if (!ignorePreferences) {
            val lastCheckMillis = statePreferences.getLong(KEY_LAST_UPDATE_CHECK, -1L)
            if (!GitHubUpdateCheckPolicy.shouldCheckProduction(updatesEnabled, lastCheckMillis, nowMillis())) {
                return Result.success(null)
            }
        }

        return suspendRunCatching {
            StormUpdateMirrorClient.fetchReleasesWithMirror(primaryFetcher)
        }.suspendMapCatching { releases ->
            updateLastUpdateCheckTime()
            if (releases.isEmpty()) {
                return@suspendMapCatching null
            }
            val packageInfo = PackageManagerCompat.getPackageInfo(
                context.packageManager,
                context.packageName,
                0,
            )
            val currentVersion = Version.fromString(
                requireNotNull(packageInfo.versionName) { "Installed versionName is missing" },
            )
            val channel = GitHubUpdateChannel.fromPreference(
                settingsPreferences.getString(
                    PREF_KEY_GITHUB_UPDATE_CHANNEL,
                    GitHubUpdateChannel.STABLE.preferenceValue,
                ),
            )
            val persistedSkip = if (!ignorePreferences) {
                runCatching {
                    statePreferences.getString(KEY_SKIP_VERSION, null)?.let(Version::fromString)
                }.getOrNull()
            } else {
                null
            }
            val effectiveSkip = sessionSkippedVersion ?: persistedSkip
            val preferLegacyApk = !runCatching {
                context.resources.getBoolean(R.bool.adrenotools_enabled)
            }.getOrDefault(defaultAdrenotoolsEnabled)

            GitHubReleaseSelector.selectProduction(
                releases = releases,
                currentVersion = currentVersion,
                channel = channel,
                skippedVersion = effectiveSkip,
                preferLegacyApk = preferLegacyApk,
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

    override suspend fun checkNewUpdateManually(): Result<AppUpdate?> {
        sessionSkippedVersion = null
        statePreferences.edit {
            remove(KEY_SKIP_VERSION)
            remove(KEY_LAST_UPDATE_CHECK)
        }
        return checkNewUpdate(ignorePreferences = true)
    }

    override fun skipUpdate(update: AppUpdate) {
        sessionSkippedVersion = update.newVersion
        statePreferences.edit {
            putString(KEY_SKIP_VERSION, update.newVersion.toString())
        }
    }

    override fun notifyUpdateDownloaded(update: AppUpdate) = Unit

    private fun updateLastUpdateCheckTime() {
        statePreferences.edit {
            putLong(KEY_LAST_UPDATE_CHECK, nowMillis())
        }
    }
}
