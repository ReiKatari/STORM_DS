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
import kotlinx.coroutines.withContext
import me.magnum.melonds.R
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

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
                val currentVersion = (runCatching {
                    context.packageManager.getPackageInfo(context.packageName, 0).versionName
                }.getOrNull() ?: "8.0.0").removePrefix("v").removePrefix("V")

                val result = withContext(Dispatchers.IO) {
                    val url = URL("https://api.github.com/repos/ReiKatari/STORM_DS/releases/latest")
                    val conn = url.openConnection() as HttpURLConnection
                    try {
                        conn.connectTimeout = 10000
                        conn.readTimeout = 10000
                        conn.requestMethod = "GET"
                        conn.setRequestProperty("Accept", "application/vnd.github+json")
                        conn.setRequestProperty("User-Agent", "STORM-DS-App")

                        if (conn.responseCode in 200..299) {
                            val body = conn.inputStream.bufferedReader().use { it.readText() }
                            val json = JSONObject(body)
                            val tagName = json.optString("tag_name", "").trim()
                            val releaseName = json.optString("name", tagName).trim()
                            val releaseBody = json.optString("body", "").trim()
                            var downloadUrl = json.optString("html_url", "https://github.com/ReiKatari/STORM_DS/releases/latest")

                            val assets = json.optJSONArray("assets")
                            if (assets != null) {
                                for (i in 0 until assets.length()) {
                                    val asset = assets.optJSONObject(i) ?: continue
                                    val assetName = asset.optString("name", "")
                                    if (assetName.endsWith(".apk", ignoreCase = true)) {
                                        val browserUrl = asset.optString("browser_download_url", "")
                                        if (browserUrl.isNotBlank()) {
                                            downloadUrl = browserUrl
                                            break
                                        }
                                    }
                                }
                            }
                            ReleaseInfo(tagName, releaseName, releaseBody, downloadUrl)
                        } else {
                            null
                        }
                    } finally {
                        conn.disconnect()
                    }
                }

                if (result == null) {
                    Toast.makeText(context, R.string.v800_update_error, Toast.LENGTH_SHORT).show()
                    return@launch
                }

                val remoteVersion = result.tagName.removePrefix("v").removePrefix("V")
                if (isNewer(remoteVersion, currentVersion)) {
                    MaterialAlertDialogBuilder(context)
                        .setTitle(context.getString(R.string.v800_update_available_title, remoteVersion))
                        .setMessage(result.body.ifBlank { result.name })
                        .setPositiveButton(R.string.v800_update_download) { _, _ ->
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(result.downloadUrl)).apply {
                                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                            }
                            context.startActivity(intent)
                        }
                        .setNegativeButton(R.string.v800_update_later, null)
                        .show()
                } else {
                    MaterialAlertDialogBuilder(context)
                        .setTitle(R.string.v800_update_up_to_date_title)
                        .setMessage(context.getString(R.string.v800_update_up_to_date_msg, currentVersion))
                        .setPositiveButton(android.R.string.ok, null)
                        .show()
                }
            } catch (e: Exception) {
                Toast.makeText(context, R.string.v800_update_error, Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun parseVersion(versionStr: String): List<Int> {
        val clean = versionStr.trim().removePrefix("v").removePrefix("V")
        return clean.split('.').map { segment ->
            segment.takeWhile { it.isDigit() }.toIntOrNull() ?: 0
        }
    }

    private fun isNewer(remote: String, current: String): Boolean {
        val rParts = parseVersion(remote)
        val cParts = parseVersion(current)
        val maxLen = maxOf(rParts.size, cParts.size)
        for (i in 0 until maxLen) {
            val r = rParts.getOrElse(i) { 0 }
            val c = cParts.getOrElse(i) { 0 }
            if (r > c) return true
            if (r < c) return false
        }
        return false
    }

    private data class ReleaseInfo(
        val tagName: String,
        val name: String,
        val body: String,
        val downloadUrl: String,
    )
}
