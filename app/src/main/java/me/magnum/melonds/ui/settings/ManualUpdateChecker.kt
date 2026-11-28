package me.magnum.melonds.ui.settings

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.content.ContextWrapper
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.provider.Settings
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import androidx.preference.PreferenceManager
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.components.SingletonComponent
import io.noties.markwon.Markwon
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.DownloadProgress
import me.magnum.melonds.domain.model.Version
import me.magnum.melonds.domain.model.appupdate.AppUpdate
import me.magnum.melonds.domain.model.appupdate.UpdateSourceOption
import me.magnum.melonds.domain.services.UpdateInstallManager
import me.magnum.melonds.github.GitHubReleaseCandidate
import me.magnum.melonds.github.GitHubReleaseSelector
import me.magnum.melonds.github.GitHubUpdateChannel
import me.magnum.melonds.github.PREF_KEY_GITHUB_UPDATE_CHANNEL
import me.magnum.melonds.github.PREF_KEY_UPDATE_DOWNLOAD_SOURCE
import me.magnum.melonds.github.StormUpdateMirrorClient
import me.magnum.melonds.github.UpdateDownloadSource
import me.magnum.melonds.github.services.GitHubUpdateInstallManager
import me.magnum.melonds.ui.updates.showStormUpdateAvailableDialog
import me.magnum.melonds.ui.updates.showStormUpdateInfoDialog
import me.magnum.melonds.ui.updates.showStormUpdateProgressDialog
import java.io.File

object ManualUpdateChecker {

    @EntryPoint
    @InstallIn(SingletonComponent::class)
    interface UpdateEntryPoint {
        fun updateInstallManager(): UpdateInstallManager
        fun markwon(): Markwon
    }

    private const val FALLBACK_VERSION = "8.9.6"

    private val backgroundScope = CoroutineScope(Dispatchers.Main + SupervisorJob())
    private var activeCheckJob: Job? = null
    private var activeDownloadJob: Job? = null
    private var activeUpdateDialog: Dialog? = null
    private var activeProgressDialog: Dialog? = null
    private var sessionSkippedVersion: Version? = null
    private val progressFlow = MutableStateFlow<DownloadProgress?>(null)

    internal fun unwrapActivity(context: Context?): Activity? {
        var current: Context? = context
        var hops = 0
        while (current is ContextWrapper && hops < 16) {
            if (current is Activity) {
                return current
            }
            current = current.baseContext
            hops++
        }
        return current as? Activity
    }

    private tailrec fun findLifecycleOwner(context: Context?): LifecycleOwner? = when (context) {
        is LifecycleOwner -> context
        is ContextWrapper -> findLifecycleOwner(context.baseContext)
        else -> null
    }

    private fun resolveCurrentVersionStr(appContext: Context): String {
        return (runCatching {
            appContext.packageManager.getPackageInfo(appContext.packageName, 0).versionName
        }.getOrNull() ?: FALLBACK_VERSION).removePrefix("v").removePrefix("V")
    }

    fun checkNow(context: Context) {
        val appContext = context.applicationContext
        val defaultPrefs = PreferenceManager.getDefaultSharedPreferences(appContext)
        defaultPrefs.edit()
            .remove("github_updates_skip_version")
            .remove("github_updates_last_check")
            .apply()

        runCatching {
            appContext.getSharedPreferences("preferences-github", Context.MODE_PRIVATE)
                .edit()
                .remove("github_updates_skip_version")
                .remove("github_updates_last_check")
                .apply()
        }

        Toast.makeText(appContext, R.string.v800_checking_updates, Toast.LENGTH_SHORT).show()

        val owner = findLifecycleOwner(context)
        val launchScope = owner?.lifecycleScope ?: backgroundScope

        activeCheckJob?.cancel()
        activeCheckJob = launchScope.launch {
            try {
                val currentVersionStr = resolveCurrentVersionStr(appContext)
                val fetchResult = StormUpdateMirrorClient.fetchReleasesWithStatus()
                if (!fetchResult.anySourceSucceeded && fetchResult.releases.isEmpty()) {
                    val activity = unwrapActivity(context)
                    if (activity != null && !activity.isFinishing && !activity.isDestroyed) {
                        activeUpdateDialog?.dismiss()
                        activeUpdateDialog = showStormUpdateInfoDialog(
                            context = activity,
                            title = appContext.getString(R.string.v800_update_error),
                            message = appContext.getString(R.string.v800_update_error),
                            isError = true,
                            onRetry = { checkNow(activity) },
                        )
                    } else {
                        Toast.makeText(appContext, R.string.v800_update_error, Toast.LENGTH_SHORT).show()
                    }
                    return@launch
                }

                val activity = unwrapActivity(context)
                if (activity == null || activity.isFinishing || activity.isDestroyed) {
                    return@launch
                }

                val currentVersion = Version.parseOrNull(currentVersionStr) ?: Version.fromString(FALLBACK_VERSION)
                val channel = GitHubUpdateChannel.fromPreference(
                    defaultPrefs.getString(PREF_KEY_GITHUB_UPDATE_CHANNEL, GitHubUpdateChannel.STABLE.preferenceValue)
                )
                val preferLegacyApk = !runCatching {
                    appContext.resources.getBoolean(R.bool.adrenotools_enabled)
                }.getOrDefault(true)

                val preferredSource = UpdateDownloadSource.fromPreference(
                    defaultPrefs.getString(PREF_KEY_UPDATE_DOWNLOAD_SOURCE, UpdateDownloadSource.ASK.preferenceValue)
                )

                val candidate = GitHubReleaseSelector.selectProduction(
                    releases = fetchResult.releases,
                    currentVersion = currentVersion,
                    channel = channel,
                    skippedVersion = null,
                    preferLegacyApk = preferLegacyApk,
                    preferredSource = preferredSource,
                )

                if (candidate != null) {
                    showStyledUpdateDialog(activity, owner, candidate, currentVersionStr, preferredSource)
                } else {
                    activeUpdateDialog?.dismiss()
                    activeUpdateDialog = showStormUpdateInfoDialog(
                        context = activity,
                        title = appContext.getString(R.string.v800_update_up_to_date_title),
                        message = appContext.getString(R.string.v800_update_up_to_date_msg, currentVersionStr),
                        versionBadge = currentVersionStr,
                    )
                }
            } catch (_: Throwable) {
                val activity = unwrapActivity(context)
                if (activity != null && !activity.isFinishing && !activity.isDestroyed) {
                    activeUpdateDialog?.dismiss()
                    activeUpdateDialog = showStormUpdateInfoDialog(
                        context = activity,
                        title = appContext.getString(R.string.v800_update_error),
                        message = appContext.getString(R.string.v800_update_error),
                        isError = true,
                        onRetry = { checkNow(activity) },
                    )
                } else {
                    Toast.makeText(appContext, R.string.v800_update_error, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun showStyledUpdateDialog(
        activity: Activity,
        owner: LifecycleOwner?,
        candidate: GitHubReleaseCandidate,
        currentVersionStr: String,
        preferredSource: UpdateDownloadSource,
    ) {
        val remoteVersion = candidate.release.tagName.removePrefix("v").removePrefix("V")
        val rawBody = candidate.release.body.ifBlank { candidate.release.name }
        val options = candidate.mirrorSources.mapValues { (src, item) ->
            UpdateSourceOption(
                source = src,
                id = item.asset.id,
                downloadUri = Uri.parse(item.asset.url),
                binarySize = item.asset.size,
                sourceReleaseUrl = item.release.htmlUrl,
                releaseTag = item.release.tagName,
            )
        }

        activeUpdateDialog?.dismiss()
        activeUpdateDialog = showStormUpdateAvailableDialog(
            context = activity,
            currentVersion = currentVersionStr,
            newVersion = remoteVersion,
            changelogMd = rawBody,
            binarySizeBytes = candidate.asset.size,
            publishedEpochMillis = candidate.publishedAt.toEpochMilliseconds(),
            sourceReleaseUrl = candidate.release.htmlUrl,
            downloadUrl = candidate.asset.url,
            mirrorSources = options,
            defaultSource = preferredSource,
            onUpdateNow = { selectedSource -> startVerifiedUpdateDownload(activity, owner, candidate, options, selectedSource) },
            onRemindLater = {},
            onSkipVersion = {
                sessionSkippedVersion = candidate.version
                runCatching {
                    activity.applicationContext.getSharedPreferences("preferences-github", Context.MODE_PRIVATE)
                        .edit()
                        .putString("github_updates_skip_version", candidate.version.toString())
                        .apply()
                }
            },
        )
    }

    private fun startVerifiedUpdateDownload(
        activity: Activity,
        owner: LifecycleOwner?,
        candidate: GitHubReleaseCandidate,
        mirrorSources: Map<UpdateDownloadSource, UpdateSourceOption>,
        selectedSource: UpdateDownloadSource,
    ) {
        if (activity.isFinishing || activity.isDestroyed) return
        if (activeDownloadJob?.isActive == true) return
        val appContext = activity.applicationContext

        val appUpdate = AppUpdate(
            type = AppUpdate.Type.PRODUCTION,
            id = candidate.asset.id,
            downloadUri = Uri.parse(candidate.asset.url),
            newVersion = candidate.version,
            description = candidate.release.body,
            binarySize = candidate.asset.size,
            updateDate = candidate.publishedAt,
            releaseTag = candidate.release.tagName,
            sourceReleaseUrl = candidate.release.htmlUrl,
            mirrorSources = mirrorSources,
        ).withSelectedSource(selectedSource)

        val installManager = runCatching {
            EntryPointAccessors.fromApplication(appContext, UpdateEntryPoint::class.java).updateInstallManager()
        }.getOrElse {
            GitHubUpdateInstallManager(appContext)
        }

        progressFlow.value = DownloadProgress.DownloadUpdate(candidate.asset.size.coerceAtLeast(0L), 0L)
        activeProgressDialog?.dismiss()
        activeProgressDialog = showStormUpdateProgressDialog(
            context = activity,
            versionLabel = candidate.release.tagName,
            progressFlow = progressFlow,
            onMoveToBackground = { activeProgressDialog = null },
        )

        // Use application backgroundScope so leaving Settings after moving download to background does not cancel it
        activeDownloadJob = backgroundScope.launch {
            try {
                installManager.downloadAndInstallUpdate(appUpdate).collectLatest { progress ->
                    when (progress) {
                        is DownloadProgress.DownloadUpdate -> {
                            progressFlow.value = progress
                        }
                        is DownloadProgress.DownloadComplete -> {
                            progressFlow.value = progress
                            runCatching { activeProgressDialog?.dismiss() }
                            activeProgressDialog = null
                        }
                        is DownloadProgress.DownloadFailed -> {
                            progressFlow.value = progress
                            runCatching { activeProgressDialog?.dismiss() }
                            activeProgressDialog = null
                            Toast.makeText(appContext, R.string.update_download_failed, Toast.LENGTH_LONG).show()
                        }
                        is DownloadProgress.InstallPermissionRequired -> {
                            progressFlow.value = progress
                            runCatching { activeProgressDialog?.dismiss() }
                            activeProgressDialog = null
                            Toast.makeText(appContext, R.string.update_install_permission_required, Toast.LENGTH_LONG).show()
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O && !activity.isFinishing && !activity.isDestroyed) {
                                if (owner != null) {
                                    val pendingFile = File(progress.apkPath)
                                    val resumeObserver = object : LifecycleEventObserver {
                                        override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
                                            if (event == Lifecycle.Event.ON_RESUME) {
                                                val concreteMgr = (installManager as? GitHubUpdateInstallManager)
                                                    ?: GitHubUpdateInstallManager(appContext)
                                                if (concreteMgr.canRequestPackageInstalls()) {
                                                    source.lifecycle.removeObserver(this)
                                                    if (!concreteMgr.openInstaller(pendingFile)) {
                                                        Toast.makeText(appContext, R.string.update_download_failed, Toast.LENGTH_LONG).show()
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    owner.lifecycle.addObserver(resumeObserver)
                                }
                                runCatching {
                                    activity.startActivity(
                                        Intent(
                                            Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES,
                                            Uri.parse("package:${appContext.packageName}"),
                                        )
                                    )
                                }.onFailure {
                                    Toast.makeText(appContext, R.string.update_download_failed, Toast.LENGTH_LONG).show()
                                }
                            }
                        }
                    }
                }
            } catch (_: Throwable) {
                runCatching { activeProgressDialog?.dismiss() }
                activeProgressDialog = null
                Toast.makeText(appContext, R.string.update_download_failed, Toast.LENGTH_LONG).show()
            }
        }
    }
}
