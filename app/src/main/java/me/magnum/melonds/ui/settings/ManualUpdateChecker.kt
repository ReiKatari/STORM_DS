package me.magnum.melonds.ui.settings

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.preference.PreferenceManager
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.Version
import me.magnum.melonds.github.GitHubReleaseSelector
import me.magnum.melonds.github.GitHubUpdateChannel
import me.magnum.melonds.github.PREF_KEY_GITHUB_UPDATE_CHANNEL
import me.magnum.melonds.github.StormUpdateMirrorClient

object ManualUpdateChecker {

    private val scope = CoroutineScope(Dispatchers.Main + SupervisorJob())

    fun checkNow(context: Context) {
        // Clear skip version and last update check timestamp so skipped updates are always shown on manual check
        val defaultPrefs = PreferenceManager.getDefaultSharedPreferences(context)
        defaultPrefs.edit()
            .remove("github_updates_skip_version")
            .remove("github_updates_last_check")
            .apply()

        runCatching {
            context.getSharedPreferences("preferences-github", Context.MODE_PRIVATE)
                .edit()
                .remove("github_updates_skip_version")
                .remove("github_updates_last_check")
                .apply()
        }

        Toast.makeText(context, R.string.v800_checking_updates, Toast.LENGTH_SHORT).show()

        scope.launch {
            try {
                val currentVersionStr = (runCatching {
                    context.packageManager.getPackageInfo(context.packageName, 0).versionName
                }.getOrNull() ?: "8.6.0").removePrefix("v").removePrefix("V")

                val releases = StormUpdateMirrorClient.fetchReleasesWithMirror()
                if (releases.isEmpty()) {
                    Toast.makeText(context, R.string.v800_update_error, Toast.LENGTH_SHORT).show()
                    return@launch
                }

                val activity = context as? android.app.Activity
                if (activity == null || activity.isFinishing || activity.isDestroyed) {
                    return@launch
                }

                val currentVersion = Version.parseOrNull(currentVersionStr) ?: Version.fromString("8.6.0")
                val channel = GitHubUpdateChannel.fromPreference(
                    defaultPrefs.getString(PREF_KEY_GITHUB_UPDATE_CHANNEL, GitHubUpdateChannel.STABLE.preferenceValue)
                )
                val preferLegacyApk = !runCatching {
                    context.resources.getBoolean(R.bool.adrenotools_enabled)
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
                        .setTitle(context.getString(R.string.v800_update_available_title, remoteVersion))
                        .setMessage(candidate.release.body.ifBlank { candidate.release.name })
                        .setPositiveButton(R.string.v800_update_download) { _, _ ->
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(candidate.asset.url)).apply {
                                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                            }
                            runCatching {
                                context.startActivity(intent)
                            }.onFailure {
                                Toast.makeText(context, R.string.v800_update_error, Toast.LENGTH_SHORT).show()
                            }
                        }
                        .setNegativeButton(R.string.v800_update_later, null)
                        .show()
                } else {
                    MaterialAlertDialogBuilder(activity)
                        .setTitle(R.string.v800_update_up_to_date_title)
                        .setMessage(context.getString(R.string.v800_update_up_to_date_msg, currentVersionStr))
                        .setPositiveButton(android.R.string.ok, null)
                        .show()
                }
            } catch (e: Exception) {
                Toast.makeText(context, R.string.v800_update_error, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
