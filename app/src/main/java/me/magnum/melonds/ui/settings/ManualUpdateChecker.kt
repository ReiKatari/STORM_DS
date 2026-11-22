package me.magnum.melonds.ui.settings

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.net.Uri
import android.view.LayoutInflater
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import androidx.preference.PreferenceManager
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.DownloadProgress
import me.magnum.melonds.domain.model.Version
import me.magnum.melonds.domain.model.appupdate.AppUpdate
import me.magnum.melonds.domain.services.UpdateInstallManager
import me.magnum.melonds.github.GitHubReleaseCandidate
import me.magnum.melonds.github.GitHubReleaseSelector
import me.magnum.melonds.github.GitHubUpdateChannel
import me.magnum.melonds.github.PREF_KEY_GITHUB_UPDATE_CHANNEL
import me.magnum.melonds.github.StormUpdateMirrorClient
import me.magnum.melonds.github.services.GitHubUpdateInstallManager

object ManualUpdateChecker {

    @EntryPoint
    @InstallIn(SingletonComponent::class)
    interface UpdateEntryPoint {
        fun updateInstallManager(): UpdateInstallManager
    }

    fun checkNow(context: Context) {
        val appContext = context.applicationContext
        val lifecycleOwner = findLifecycleOwner(context) ?: return

        // Clear skip version and last update check timestamp so skipped updates are always shown on manual check
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

        lifecycleOwner.lifecycleScope.launch {
            try {
                val currentVersionStr = (runCatching {
                    appContext.packageManager.getPackageInfo(appContext.packageName, 0).versionName
                }.getOrNull() ?: "8.6.0").removePrefix("v").removePrefix("V")

                val releases = StormUpdateMirrorClient.fetchReleasesWithMirror()
                if (releases.isEmpty()) {
                    Toast.makeText(appContext, R.string.v800_update_error, Toast.LENGTH_SHORT).show()
                    return@launch
                }

                val activity = findActivity(context)
                if (activity == null || activity.isFinishing || activity.isDestroyed) {
                    return@launch
                }

                val currentVersion = Version.parseOrNull(currentVersionStr) ?: Version.fromString("8.6.0")
                val channel = GitHubUpdateChannel.fromPreference(
                    defaultPrefs.getString(PREF_KEY_GITHUB_UPDATE_CHANNEL, GitHubUpdateChannel.STABLE.preferenceValue)
                )
                val preferLegacyApk = !runCatching {
                    appContext.resources.getBoolean(R.bool.adrenotools_enabled)
                }.getOrDefault(false)

                val candidate = GitHubReleaseSelector.selectProduction(
                    releases = releases,
                    currentVersion = currentVersion,
                    channel = channel,
                    skippedVersion = null,
                    preferLegacyApk = preferLegacyApk,
                )

                if (candidate != null) {
                    val remoteVersion = candidate.release.tagName.removePrefix("v").removePrefix("V")
                    MaterialAlertDialogBuilder(activity)
                        .setTitle(appContext.getString(R.string.v800_update_available_title, remoteVersion))
                        .setMessage(candidate.release.body.ifBlank { candidate.release.name })
                        .setPositiveButton(R.string.v800_update_download) { _, _ ->
                            startVerifiedUpdateDownload(
                                context = context,
                                lifecycleOwner = lifecycleOwner,
                                candidate = candidate,
                            )
                        }
                        .setNegativeButton(R.string.v800_update_later, null)
                        .show()
                } else {
                    MaterialAlertDialogBuilder(activity)
                        .setTitle(R.string.v800_update_up_to_date_title)
                        .setMessage(appContext.getString(R.string.v800_update_up_to_date_msg, currentVersionStr))
                        .setPositiveButton(android.R.string.ok, null)
                        .show()
                }
            } catch (_: Exception) {
                Toast.makeText(appContext, R.string.v800_update_error, Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun startVerifiedUpdateDownload(
        context: Context,
        lifecycleOwner: LifecycleOwner,
        candidate: GitHubReleaseCandidate,
    ) {
        val appContext = context.applicationContext
        val activity = findActivity(context)
        if (activity == null || activity.isFinishing || activity.isDestroyed) {
            return
        }

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
        )

        val installManager = runCatching {
            EntryPointAccessors.fromApplication(
                appContext,
                UpdateEntryPoint::class.java,
            ).updateInstallManager()
        }.getOrElse {
            GitHubUpdateInstallManager(appContext)
        }

        val progressView = LayoutInflater.from(activity).inflate(R.layout.dialog_layout_update_download_progress, null)
        val progressBar = progressView.findViewById<ProgressBar>(R.id.progress_bar_download_progress)
        val progressText = progressView.findViewById<TextView>(R.id.text_download_progress)

        var progressDialog: androidx.appcompat.app.AlertDialog? = null
        progressDialog = MaterialAlertDialogBuilder(activity)
            .setTitle(R.string.downloading_update)
            .setView(progressView)
            .setPositiveButton(R.string.move_to_background) { _, _ ->
                progressDialog = null
            }
            .setCancelable(false)
            .show()

        lifecycleOwner.lifecycleScope.launch {
            try {
                installManager.downloadAndInstallUpdate(appUpdate).collectLatest { progress ->
                    when (progress) {
                        is DownloadProgress.DownloadUpdate -> {
                            val totalSize = progress.totalSize
                            if (totalSize > 0L) {
                                val pct = ((progress.downloadedBytes.toDouble() / totalSize) * 100).toInt().coerceIn(0, 100)
                                val downloadedMb = progress.downloadedBytes.toDouble() / (1024.0 * 1024.0)
                                val totalMb = totalSize.toDouble() / (1024.0 * 1024.0)
                                progressBar.isIndeterminate = false
                                progressBar.progress = pct
                                progressText.text = appContext.getString(R.string.download_progress_sizes, downloadedMb, totalMb)
                            } else {
                                progressBar.isIndeterminate = true
                                progressText.text = ""
                            }
                        }
                        is DownloadProgress.DownloadComplete -> {
                            runCatching { progressDialog?.dismiss() }
                            progressDialog = null
                        }
                        is DownloadProgress.DownloadFailed -> {
                            runCatching { progressDialog?.dismiss() }
                            progressDialog = null
                            Toast.makeText(appContext, R.string.update_download_failed, Toast.LENGTH_LONG).show()
                        }
                    }
                }
            } catch (_: Exception) {
                runCatching { progressDialog?.dismiss() }
                progressDialog = null
                Toast.makeText(appContext, R.string.update_download_failed, Toast.LENGTH_LONG).show()
            }
        }
    }

    private tailrec fun findActivity(context: Context): Activity? = when (context) {
        is Activity -> context
        is ContextWrapper -> findActivity(context.baseContext)
        else -> null
    }

    private tailrec fun findLifecycleOwner(context: Context): LifecycleOwner? = when (context) {
        is LifecycleOwner -> context
        is ContextWrapper -> findLifecycleOwner(context.baseContext)
        else -> null
    }
}
