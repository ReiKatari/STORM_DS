package me.magnum.melonds.ui.diagnostics

import android.app.ActivityManager
import android.content.ClipData
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Environment
import android.os.Process
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.FileProvider
import androidx.lifecycle.lifecycleScope
import androidx.preference.PreferenceManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.impl.AdrenoVulkanDriverSupport
import me.magnum.melonds.ui.quickresume.QuickResumeStore
import org.json.JSONObject
import java.io.BufferedInputStream
import java.io.BufferedOutputStream
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.concurrent.TimeUnit
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

object ProblemReportGenerator {

    private const val APP_VERSION_FALLBACK = "7.7.2"
    private const val MAX_LOG_ATTACHMENT_BYTES = 512 * 1024L

    private val SENSITIVE_KEY_TOKENS = listOf(
        "token",
        "password",
        "passwd",
        "secret",
        "auth",
        "username",
        "user_name",
        "cookie",
        "session",
        "api_key",
        "apikey",
        "credential",
        "email",
        "ra_user",
        "ra_token",
        "rcheevos",
    )

    fun showDialogAndShare(activity: AppCompatActivity, lastRom: Rom? = null) {
        AlertDialog.Builder(activity)
            .setTitle(R.string.feature_problem_report_dialog_title)
            .setMessage(R.string.feature_problem_report_dialog_message)
            .setPositiveButton(R.string.feature_problem_report_create_action) { _, _ ->
                generateAndShare(activity, lastRom)
            }
            .setNegativeButton(R.string.cancel, null)
            .show()
    }

    fun generateAndShare(activity: AppCompatActivity, lastRom: Rom? = null) {
        Toast.makeText(activity, R.string.feature_problem_report_generating, Toast.LENGTH_SHORT).show()
        activity.lifecycleScope.launch {
            val zipResult = runCatching {
                withContext(Dispatchers.IO) {
                    buildProblemReportZip(activity.applicationContext, lastRom)
                }
            }
            val zipFile = zipResult.getOrNull()
            if (zipFile == null || !zipFile.isFile) {
                Toast.makeText(activity, R.string.feature_problem_report_failed, Toast.LENGTH_LONG).show()
                return@launch
            }

            runCatching {
                val uri = FileProvider.getUriForFile(
                    activity,
                    "${activity.packageName}.fileprovider",
                    zipFile,
                )
                val shareIntent = Intent(Intent.ACTION_SEND).apply {
                    type = "application/zip"
                    putExtra(Intent.EXTRA_STREAM, uri)
                    putExtra(Intent.EXTRA_SUBJECT, "STORM DS ${getAppVersion(activity)} — Problem report")
                    putExtra(Intent.EXTRA_TITLE, zipFile.name)
                    addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                    clipData = ClipData.newUri(activity.contentResolver, zipFile.name, uri)
                }
                val chooser = Intent.createChooser(
                    shareIntent,
                    activity.getString(R.string.feature_problem_report_share_chooser),
                )
                activity.startActivity(chooser)
            }.onFailure {
                Toast.makeText(activity, R.string.feature_problem_report_failed, Toast.LENGTH_LONG).show()
            }
        }
    }

    fun buildProblemReportZip(context: Context, lastRom: Rom? = null): File {
        val reportsDir = File(context.cacheDir, "problem_reports").apply { mkdirs() }
        // Clean up old report archives
        reportsDir.listFiles()?.forEach { old ->
            runCatching { old.delete() }
        }

        val timestampTag = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(Date())
        val zipFile = File(reportsDir, "STORM_DS_Report_$timestampTag.zip")

        ZipOutputStream(BufferedOutputStream(FileOutputStream(zipFile))).use { zos ->
            writeTextEntry(zos, "device_and_app_info.txt", buildDeviceAndAppInfoText(context, lastRom))
            writeTextEntry(zos, "emulator_settings.json", buildSanitizedSettingsJson(context))
            writeTextEntry(zos, "logcat_tail.txt", captureLogcatTail())

            val rootStormDir = File(Environment.getExternalStorageDirectory(), "STORM DS")
            val candidateFiles = listOf(
                "STORM_INFO.txt" to File(rootStormDir, "logs/!STORM_INFO.txt"),
                "STORM_INFO_alt.txt" to File(rootStormDir, "logs/STORM_INFO.txt"),
                "STORM_INFO_root.txt" to File(rootStormDir, "STORM_INFO.txt"),
                "vulkan_debug_report.json" to File(rootStormDir, "debug/vulkan_debug_report.json"),
                "vulkan_debug_report_logs.json" to File(rootStormDir, "logs/vulkan_debug_report.json"),
                "vulkan_debug_report_internal.json" to File(context.filesDir, "vulkan_debug_report.json"),
                "STORM_DS.opts" to File(rootStormDir, "settings/STORM_DS.opts"),
                "STORM_DS.log" to File(rootStormDir, "logs/STORM_DS.log"),
            )

            val addedEntryNames = mutableSetOf<String>()
            for ((entryName, file) in candidateFiles) {
                if (file.isFile && file.canRead() && file.length() > 0L && addedEntryNames.add(entryName)) {
                    runCatching {
                        writeFileTailEntry(zos, entryName, file, MAX_LOG_ATTACHMENT_BYTES)
                    }
                }
            }
        }

        return zipFile
    }

    private fun buildDeviceAndAppInfoText(context: Context, lastRom: Rom?): String {
        val displayDateFormat = SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.US)
        val versionName = getAppVersion(context)
        val lastEntry = QuickResumeStore.getLastRomEntry(context)
        val effectiveGameName = lastRom?.name?.takeIf { it.isNotBlank() } ?: lastEntry?.displayName ?: "none"
        val effectiveGameCode = lastRom?.gameCode?.takeIf { it.isNotBlank() }
            ?: lastEntry?.gameCode?.takeIf { it.isNotBlank() }
            ?: "unknown"

        val socManufacturer = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) Build.SOC_MANUFACTURER else "N/A"
        val socModel = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) Build.SOC_MODEL else Build.HARDWARE
        val gpuDescription = runCatching { AdrenoVulkanDriverSupport.getDeviceGpuDescription() }.getOrDefault("unknown")
        val gpuSeries = runCatching { AdrenoVulkanDriverSupport.getGpuSeries().displayName }.getOrDefault("unknown")

        val memInfo = ActivityManager.MemoryInfo()
        runCatching {
            val am = context.getSystemService(Context.ACTIVITY_SERVICE) as? ActivityManager
            am?.getMemoryInfo(memInfo)
        }

        return buildString {
            appendLine("=== STORM DS DIAGNOSTIC REPORT ===")
            appendLine("Generated: ${displayDateFormat.format(Date())}")
            appendLine("App Name: STORM DS")
            appendLine("App Version: $versionName")
            appendLine("Process PID: ${Process.myPid()}")
            appendLine()
            appendLine("=== DEVICE & SOC & GPU ===")
            appendLine("Manufacturer: ${Build.MANUFACTURER}")
            appendLine("Brand: ${Build.BRAND}")
            appendLine("Model: ${Build.MODEL}")
            appendLine("Device: ${Build.DEVICE}")
            appendLine("Product: ${Build.PRODUCT}")
            appendLine("Board: ${Build.BOARD}")
            appendLine("Hardware: ${Build.HARDWARE}")
            appendLine("SoC Manufacturer: $socManufacturer")
            appendLine("SoC Model: $socModel")
            appendLine("GPU Description: $gpuDescription")
            appendLine("GPU Series: $gpuSeries")
            appendLine("Supported ABIs: ${Build.SUPPORTED_ABIS.joinToString(", ")}")
            appendLine()
            appendLine("=== ANDROID & MEMORY ===")
            appendLine("Android Release: ${Build.VERSION.RELEASE} (API ${Build.VERSION.SDK_INT})")
            appendLine("Build Display: ${Build.DISPLAY}")
            appendLine("Total RAM (MB): ${memInfo.totalMem / (1024 * 1024)}")
            appendLine("Available RAM (MB): ${memInfo.availMem / (1024 * 1024)}")
            appendLine("Low Memory Flag: ${memInfo.lowMemory}")
            appendLine()
            appendLine("=== LAST PLAYED GAME ===")
            appendLine("Game Title: $effectiveGameName")
            appendLine("Game Code: $effectiveGameCode")
            if (lastEntry != null && lastEntry.lastPlayedEpochMs > 0L) {
                appendLine("Last Played: ${displayDateFormat.format(Date(lastEntry.lastPlayedEpochMs))}")
            }
        }
    }

    private fun buildSanitizedSettingsJson(context: Context): String {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        val root = JSONObject()
        val sortedEntries = prefs.all.entries.sortedBy { it.key }
        for ((key, value) in sortedEntries) {
            if (isSensitiveKey(key)) {
                root.put(key, "<redacted>")
            } else {
                when (value) {
                    is Set<*> -> root.put(key, value.map { it.toString() }.sorted().joinToString("; "))
                    else -> root.put(key, value?.toString() ?: JSONObject.NULL)
                }
            }
        }
        return root.toString(2)
    }

    private fun isSensitiveKey(key: String): Boolean {
        val lower = key.lowercase(Locale.ROOT)
        return SENSITIVE_KEY_TOKENS.any { token -> lower.contains(token) }
    }

    private fun captureLogcatTail(): String {
        val pid = Process.myPid()
        val primary = runLogcatCommand(listOf("logcat", "-d", "-v", "threadtime", "-t", "500", "--pid=$pid"))
        if (primary.isNotBlank()) {
            return primary
        }
        return runLogcatCommand(listOf("logcat", "-d", "-v", "threadtime", "-t", "500"))
    }

    private fun runLogcatCommand(command: List<String>): String {
        return runCatching {
            val process = ProcessBuilder(command)
                .redirectErrorStream(true)
                .start()
            val output = process.inputStream.bufferedReader(Charsets.UTF_8).use { it.readText() }
            process.waitFor(3, TimeUnit.SECONDS)
            process.destroy()
            output
        }.getOrDefault("")
    }

    private fun writeTextEntry(zos: ZipOutputStream, entryName: String, content: String) {
        val entry = ZipEntry(entryName)
        zos.putNextEntry(entry)
        val bytes = content.toByteArray(Charsets.UTF_8)
        zos.write(bytes)
        zos.closeEntry()
    }

    private fun writeFileTailEntry(zos: ZipOutputStream, entryName: String, file: File, maxBytes: Long) {
        val entry = ZipEntry(entryName)
        zos.putNextEntry(entry)
        val length = file.length()
        FileInputStream(file).use { fis ->
            if (length > maxBytes) {
                val skipBytes = length - maxBytes
                runCatching { fis.skip(skipBytes) }
            }
            BufferedInputStream(fis).use { bis ->
                val buffer = ByteArray(8192)
                var read: Int
                while (bis.read(buffer).also { read = it } != -1) {
                    zos.write(buffer, 0, read)
                }
            }
        }
        zos.closeEntry()
    }

    private fun getAppVersion(context: Context): String {
        return runCatching {
            context.packageManager.getPackageInfo(context.packageName, 0).versionName
                ?.removePrefix("v")
                ?.removePrefix("V")
                ?.takeIf { it.isNotBlank() }
        }.getOrNull() ?: APP_VERSION_FALLBACK
    }
}
