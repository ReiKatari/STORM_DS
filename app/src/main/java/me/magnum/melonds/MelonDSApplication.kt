package me.magnum.melonds

import android.Manifest
import android.app.Application
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import androidx.core.app.NotificationChannelCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.hilt.work.HiltWorkerFactory
import androidx.work.Configuration
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import me.magnum.melonds.common.UriFileHandler
import me.magnum.melonds.common.uridelegates.UriHandler
import me.magnum.melonds.domain.repositories.SettingsRepository
import me.magnum.melonds.ui.common.views.ButtonThemeManager
import me.magnum.melonds.ui.romlist.RomDisplayNameManager
import me.magnum.melonds.ui.theme.AppThemeManager
import me.magnum.melonds.impl.AppLogFileRecorder
import me.magnum.melonds.impl.SettingsBackupManager
import me.magnum.melonds.impl.retroachievements.offline.HardcoreOfflineLossTracker
import android.system.Os
import android.util.Log
import java.io.File
import me.magnum.melonds.migrations.Migrator
import javax.inject.Inject

@HiltAndroidApp
class MelonDSApplication : Application(), Configuration.Provider, coil.ImageLoaderFactory {
    companion object {
        const val NOTIFICATION_CHANNEL_ID_BACKGROUND_TASKS = "channel_cheat_importing"
        private const val NOTIFICATION_ID_HARDCORE_OFFLINE_LOSS = 2002
        private var isMigrating = false
        private var lastMigrationTime = 0L

        fun migrateStorageToRoot(context: Context, force: Boolean = false) {
            val now = System.currentTimeMillis()
            if (!force && (isMigrating || (now - lastMigrationTime < 30_000L))) return
            isMigrating = true

            kotlinx.coroutines.CoroutineScope(kotlinx.coroutines.Dispatchers.IO).launch {
                try {
                    val rootBase = File(android.os.Environment.getExternalStorageDirectory(), "STORM DS")
                    if (!rootBase.exists()) rootBase.mkdirs()
                    val dsDir = File(rootBase, "bios/ds").apply { mkdirs() }
                    val dsiDir = File(rootBase, "bios/dsi").apply { mkdirs() }
                    val biosDir = File(rootBase, "bios").apply { mkdirs() }
                    val savesDir = File(rootBase, "saves").apply { mkdirs() }
                    val quicksavesDir = File(rootBase, "quicksaves").apply { mkdirs() }
                    val texturesDir = File(rootBase, "textures").apply { mkdirs() }
                    val logsDir = File(rootBase, "logs").apply { mkdirs() }
                    val cheatsDir = File(rootBase, "cheats").apply { mkdirs() }
                    val screenshotsDir = File(rootBase, "screenshots").apply { mkdirs() }
                    val dldiDir = File(rootBase, "dldi").apply { mkdirs() }

                    // Clean up old /Download/STORM DS LOGS folder
                    val downloadDir = android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOWNLOADS)
                    val oldLogsDir = File(downloadDir, "STORM DS LOGS")
                    if (oldLogsDir.exists()) {
                        oldLogsDir.deleteRecursively()
                    }

                    val copyDir = { src: File, dst: File ->
                        if (src.exists() && src.isDirectory) {
                            src.listFiles()?.forEach { file ->
                                // Clean up duplicate SAF artifact files like "firmware (1).bin"
                                if (file.name.contains(" (") && file.name.endsWith(").bin")) {
                                    file.delete()
                                    return@forEach
                                }
                                // Skip 0-byte corrupt files
                                if (file.isFile && file.length() == 0L) {
                                    file.delete()
                                    return@forEach
                                }
                                val target = File(dst, file.name)
                                if (!target.exists() || (target.length() == 0L && file.length() > 0L) || (target.length() > 0L && file.length() > 0L && target.lastModified() < file.lastModified())) {
                                    runCatching { file.copyTo(target, overwrite = true) }
                                }
                            }
                        }
                    }

                    // Clean up duplicate/stray files in all bios directories
                    listOf(dsDir, dsiDir, biosDir).forEach { bDir ->
                        if (bDir.exists() && bDir.isDirectory) {
                            bDir.listFiles()?.forEach { f ->
                                if (f.name.contains(" (") && f.name.endsWith(").bin")) {
                                    f.delete()
                                }
                            }
                        }
                    }

                    // Internal app files to root storage (excluding saves to prevent resurrecting deleted saves)
                    copyDir(File(context.filesDir, "bios/ds"), dsDir)
                    copyDir(File(context.filesDir, "bios/dsi"), dsiDir)
                    copyDir(File(context.filesDir, "quicksaves"), quicksavesDir)
                    copyDir(File(context.filesDir, "cheats"), cheatsDir)
                    copyDir(File(context.filesDir, "textures"), texturesDir)
                    copyDir(File(context.filesDir, "dldi"), dldiDir)

                    // External app files to root storage
                    context.getExternalFilesDir(null)?.let { extFiles ->
                        copyDir(File(extFiles, "bios/ds"), dsDir)
                        copyDir(File(extFiles, "bios/dsi"), dsiDir)
                        copyDir(File(extFiles, "quicksaves"), quicksavesDir)
                        copyDir(File(extFiles, "cheats"), cheatsDir)
                        copyDir(File(extFiles, "textures"), texturesDir)
                        copyDir(File(extFiles, "dldi"), dldiDir)
                    }

                    // One-time migration for legacy saves from internal storage, then purge internal copy to prevent ghost saves
                    val prefs = androidx.preference.PreferenceManager.getDefaultSharedPreferences(context)
                    val legacySavesMigrated = prefs.getBoolean("storm_legacy_saves_migrated_v416", false)
                    val legacySaveDirs = listOf(
                        File(context.filesDir, "saves"),
                        File(context.getExternalFilesDir(null), "saves"),
                    )

                    if (!legacySavesMigrated) {
                        val existingSaves = savesDir.listFiles()?.filter { it.isFile && it.length() > 0L }
                        if (existingSaves.isNullOrEmpty()) {
                            legacySaveDirs.forEach { legacyDir ->
                                if (legacyDir.exists() && legacyDir.isDirectory) {
                                    legacyDir.listFiles()?.forEach { f ->
                                        if (f.isFile && f.length() > 0L && (f.name.endsWith(".sav", ignoreCase = true) || f.name.endsWith(".srm", ignoreCase = true))) {
                                            val target = File(savesDir, f.name)
                                            runCatching { f.copyTo(target, overwrite = true) }
                                        }
                                    }
                                }
                            }
                        }
                        legacySaveDirs.forEach { legacyDir ->
                            runCatching { if (legacyDir.exists()) legacyDir.deleteRecursively() }
                        }
                        prefs.edit().putBoolean("storm_legacy_saves_migrated_v416", true).apply()
                    } else {
                        // Ensure legacy internal save folders are purged so deleted saves are never resurrected
                        legacySaveDirs.forEach { legacyDir ->
                            runCatching { if (legacyDir.exists()) legacyDir.deleteRecursively() }
                        }
                    }

                    // Auto-cleanup corrupted save files in root saves folder (0-byte stubs, .bak clutter, stray 0-byte public saves)
                    if (savesDir.exists() && savesDir.isDirectory) {
                        savesDir.listFiles()?.forEach { f ->
                            if (!f.isFile) return@forEach
                            if (f.length() == 0L) {
                                Log.i("MelonDSApplication", "Auto-cleaned 0-byte corrupt save artifact: ${f.name}")
                                f.delete()
                                return@forEach
                            }
                            if (f.name.endsWith(".sav.bak", ignoreCase = true) || f.name.endsWith(".srm.bak", ignoreCase = true)) {
                                f.delete()
                                return@forEach
                            }
                            if (f.name.endsWith(".public.sav", ignoreCase = true) && f.length() == 0L) {
                                f.delete()
                                return@forEach
                            }
                        }
                    }

                    // Auto-cleanup stale nds-bootstrap error/offset caches on external storage without touching saves
                    val externalStorage = android.os.Environment.getExternalStorageDirectory()
                    val ndsBootstrapDir = File(externalStorage, "_nds/nds-bootstrap")
                    if (ndsBootstrapDir.exists() && ndsBootstrapDir.isDirectory) {
                        listOf(File(ndsBootstrapDir, "fatTableCache"), File(ndsBootstrapDir, "patchOffsetCache"), File(ndsBootstrapDir, "ramDumps")).forEach { cacheFolder ->
                            if (cacheFolder.exists() && cacheFolder.isDirectory) {
                                cacheFolder.listFiles()?.forEach { cFile ->
                                    if (cFile.isFile && (cFile.length() == 0L || cFile.lastModified() < now - 86_400_000L)) {
                                        cFile.delete()
                                    }
                                }
                            }
                        }
                    }

                    // Root storage back to internal app files (backup/sync for bios, cheats, textures, dldi, logs)
                    // Note: savesDir is NOT mirrored back to filesDir to ensure user deletions are respected 100%
                    copyDir(dsDir, File(context.filesDir, "bios/ds").apply { mkdirs() })
                    copyDir(dsiDir, File(context.filesDir, "bios/dsi").apply { mkdirs() })
                    copyDir(quicksavesDir, File(context.filesDir, "quicksaves").apply { mkdirs() })
                    copyDir(cheatsDir, File(context.filesDir, "cheats").apply { mkdirs() })
                    copyDir(texturesDir, File(context.filesDir, "textures").apply { mkdirs() })
                    copyDir(logsDir, File(context.filesDir, "logs").apply { mkdirs() })
                    copyDir(dldiDir, File(context.filesDir, "dldi").apply { mkdirs() })

                    // Ensure preferences point to root paths
                    val currentDs = prefs.getStringSet("bios_dir", null)?.firstOrNull()
                    if (currentDs == null || currentDs.contains("data/user/0") || currentDs.contains("files/bios")) {
                        prefs.edit().putStringSet("bios_dir", setOf(android.net.Uri.fromFile(dsDir).toString())).apply()
                    }
                    val currentDsi = prefs.getStringSet("dsi_bios_dir", null)?.firstOrNull()
                    if (currentDsi == null || currentDsi.contains("data/user/0") || currentDsi.contains("files/bios")) {
                        prefs.edit().putStringSet("dsi_bios_dir", setOf(android.net.Uri.fromFile(dsiDir).toString())).apply()
                    }
                    lastMigrationTime = System.currentTimeMillis()
                } catch (e: Throwable) {
                    Log.w("MelonDSApplication", "Failed to complete root storage migration", e)
                } finally {
                    isMigrating = false
                }
            }
        }
    }

    override fun newImageLoader(): coil.ImageLoader {
        return coil.ImageLoader.Builder(this)
            .memoryCache {
                coil.memory.MemoryCache.Builder(this)
                    .maxSizePercent(0.25)
                    .build()
            }
            .diskCache {
                coil.disk.DiskCache.Builder()
                    .directory(File(cacheDir, "covers_cache"))
                    .maxSizeBytes(256L * 1024 * 1024)
                    .build()
            }
            .crossfade(true)
            .build()
    }

    @Inject lateinit var workerFactory: HiltWorkerFactory
    @Inject lateinit var settingsRepository: SettingsRepository
    @Inject lateinit var migrator: Migrator
    @Inject lateinit var uriHandler: UriHandler
    @Inject lateinit var hardcoreOfflineLossTracker: HardcoreOfflineLossTracker
    @Inject lateinit var settingsBackupManager: SettingsBackupManager
    @Inject lateinit var appLogFileRecorder: AppLogFileRecorder

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        NativeCoreLoader.load()
    }

    override fun onCreate() {
        super.onCreate()
        runCatching { System.setProperty("http.agent", "melonDS/0.9.5") }
        installCrashHandler()
        runCatching { giveLibrashaderACacheDirectory() }
        runCatching { ButtonThemeManager.init(this) }
        runCatching { AppThemeManager.init(this) }
        runCatching { RomDisplayNameManager.init(this) }
        runCatching { me.magnum.melonds.impl.StormDeviceSystemInfoReporter.saveUnifiedReport(this) }
        runCatching { createNotificationChannels() }
        runCatching { applyTheme() }
        runCatching { performMigrations() }
        runCatching { migrateStorageToRoot(this) }
        runCatching { File(cacheDir, "installed_dsiware").deleteRecursively() }
        runCatching { settingsBackupManager.initializeMirror() }
        runCatching { appLogFileRecorder.start() }
        runCatching { recoverUnexpectedHardcoreOfflineLossIfNeeded() }
        runCatching {
            MelonDSAndroidInterface.setup(
                UriFileHandler(this, uriHandler),
                settingsRepository.getVulkanDriverConfiguration(applicationInfo.nativeLibraryDir),
            )
        }
    }

    private fun installCrashHandler() {
        val previousHandler = Thread.getDefaultUncaughtExceptionHandler()
        Thread.setDefaultUncaughtExceptionHandler { thread, throwable ->
            runCatching {
                val report = buildString {
                    appendLine("================ STORM DS CRASH REPORT ================")
                    appendLine("Time: ${java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS Z", java.util.Locale.US).format(java.util.Date())}")
                    appendLine("Device: ${Build.MANUFACTURER} ${Build.MODEL} (Android ${Build.VERSION.RELEASE}, API ${Build.VERSION.SDK_INT})")
                    appendLine("Thread: ${thread.name} (id=${thread.id})")
                    appendLine("Exception: ${throwable.javaClass.name}: ${throwable.message}")
                    appendLine("Stacktrace:")
                    appendLine(Log.getStackTraceString(throwable))
                    appendLine("========================================================")
                }

                // Write crash report into /storage/emulated/0/STORM DS/logs/!STORM_INFO.txt
                runCatching {
                    val rootBase = File(android.os.Environment.getExternalStorageDirectory(), "STORM DS/logs").apply { mkdirs() }
                    val crashFile = File(rootBase, "!STORM_INFO.txt")
                    crashFile.appendText("\n\n$report")

                    val internalLogs = File(filesDir, "logs").apply { mkdirs() }
                    File(internalLogs, "!STORM_INFO.txt").appendText("\n\n$report")
                }
            }
            previousHandler?.uncaughtException(thread, throwable)
        }
    }

    private fun giveLibrashaderACacheDirectory() {
        runCatching {
            Os.setenv("HOME", filesDir.absolutePath, false)
            Os.setenv("XDG_CACHE_HOME", File(filesDir, "cache").absolutePath, false)
        }.onFailure {
            Log.w("MelonDSApplication", "Could not point librashader at a cache directory", it)
        }
    }

    private fun createNotificationChannels() {
        val defaultChannel = NotificationChannelCompat.Builder(NOTIFICATION_CHANNEL_ID_BACKGROUND_TASKS, NotificationManagerCompat.IMPORTANCE_LOW)
            .setName(getString(R.string.notification_channel_background_tasks))
            .build()

        val notificationManager = NotificationManagerCompat.from(this)
        notificationManager.createNotificationChannel(defaultChannel)
    }

    @OptIn(DelicateCoroutinesApi::class)
    private fun applyTheme() {
        GlobalScope.launch(Dispatchers.Main) {
            settingsRepository.observeTheme().collect {
                AppCompatDelegate.setDefaultNightMode(it.nightMode)
            }
        }
    }

    private fun performMigrations() {
        migrator.performMigrations()
    }

    private fun recoverUnexpectedHardcoreOfflineLossIfNeeded() {
        if (
            Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU &&
            ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.POST_NOTIFICATIONS,
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            return
        }
        val pendingLoss = hardcoreOfflineLossTracker.consumePendingUnlocks() ?: return
        if (pendingLoss.totalCount <= 0) return

        val notification = NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID_BACKGROUND_TASKS)
            .setSmallIcon(R.drawable.ic_melon_small)
            .setContentTitle(getString(R.string.offline_ra_hardcore_loss_notification_title))
            .setContentText(
                getString(
                    R.string.ra_pending_process_loss_notification_message,
                    pendingLoss.totalCount,
                    pendingLoss.achievementCount,
                    pendingLoss.leaderboardCount,
                    pendingLoss.gameTitle,
                )
            )
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setAutoCancel(true)
            .build()

        try {
            NotificationManagerCompat.from(this).notify(
                NOTIFICATION_ID_HARDCORE_OFFLINE_LOSS,
                notification,
            )
        } catch (_: SecurityException) {
            hardcoreOfflineLossTracker.markPendingSubmissions(
                userId = pendingLoss.userId,
                contentId = pendingLoss.contentId,
                gameTitle = pendingLoss.gameTitle,
                achievementCount = pendingLoss.achievementCount,
                leaderboardCount = pendingLoss.leaderboardCount,
            )
        }
    }

    override fun onTerminate() {
        super.onTerminate()
        appLogFileRecorder.stop()
        MelonDSAndroidInterface.cleanup()
    }

    override val workManagerConfiguration: Configuration get() {
        return Configuration.Builder()
            .setWorkerFactory(workerFactory)
            .build()
    }
}
