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

                    // Purge legacy internal system directories so deleted files are NEVER resurrected
                    listOf(
                        File(context.filesDir, "bios"),
                        File(context.filesDir, "quicksaves"),
                        File(context.filesDir, "cheats"),
                        File(context.filesDir, "textures"),
                        File(context.filesDir, "dldi"),
                        File(context.filesDir, "saves"),
                        File(context.filesDir, "dsi_sd"),
                        File(context.filesDir, "boxart"),
                    ).forEach { legacyDir ->
                        runCatching { if (legacyDir.exists()) legacyDir.deleteRecursively() }
                    }
                    context.getExternalFilesDir(null)?.let { extFiles ->
                        listOf(
                            File(extFiles, "bios"),
                            File(extFiles, "quicksaves"),
                            File(extFiles, "cheats"),
                            File(extFiles, "textures"),
                            File(extFiles, "dldi"),
                            File(extFiles, "saves"),
                            File(extFiles, "dsi_sd"),
                            File(extFiles, "boxart"),
                        ).forEach { legacyDir ->
                            runCatching { if (legacyDir.exists()) legacyDir.deleteRecursively() }
                        }
                    }

                    // Migrate legacy custom covers from internal storage to /STORM DS/covers/
                    val coversDir = File(rootBase, "covers").apply { mkdirs() }
                    val internalCustomCovers = File(context.filesDir, "custom_covers")
                    if (internalCustomCovers.exists() && internalCustomCovers.isDirectory) {
                        internalCustomCovers.listFiles()?.forEach { f ->
                            if (f.isFile && f.length() > 0L && f.name.endsWith(".png", ignoreCase = true)) {
                                val target = File(coversDir, f.name)
                                runCatching { f.copyTo(target, overwrite = true) }
                            }
                        }
                        runCatching { internalCustomCovers.deleteRecursively() }
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

                    // Extract embedded BIOS files from assets directly into /storage/emulated/0/STORM DS/bios/
                    val copyAssetFile = { assetPath: String, targetFile: File ->
                        if (!targetFile.exists() || targetFile.length() == 0L) {
                            runCatching {
                                context.assets.open(assetPath).use { input ->
                                    targetFile.outputStream().use { output ->
                                        input.copyTo(output)
                                    }
                                }
                            }
                        }
                    }

                    copyAssetFile("bios/ds/bios7.bin", File(dsDir, "bios7.bin"))
                    copyAssetFile("bios/ds/bios9.bin", File(dsDir, "bios9.bin"))
                    copyAssetFile("bios/ds/firmware.bin", File(dsDir, "firmware.bin"))

                    copyAssetFile("bios/dsi/bios7.bin", File(dsiDir, "bios7.bin"))
                    copyAssetFile("bios/dsi/bios9.bin", File(dsiDir, "bios9.bin"))
                    copyAssetFile("bios/dsi/firmware.bin", File(dsiDir, "firmware.bin"))

                    val nandFile = File(dsiDir, "nand.bin")
                    if (!nandFile.exists() || nandFile.length() < 1024 * 1024L) {
                        createCleanDsiNand(nandFile)
                    }

                    // Ensure preferences point exclusively to root paths
                    val prefs = androidx.preference.PreferenceManager.getDefaultSharedPreferences(context)
                    val currentDs = prefs.getStringSet("bios_dir", null)?.firstOrNull()
                    if (currentDs == null || currentDs.contains("data/user/0") || currentDs.contains("files/bios")) {
                        prefs.edit().putStringSet("bios_dir", setOf(android.net.Uri.fromFile(dsDir).toString())).apply()
                    }
                    val currentDsi = prefs.getStringSet("dsi_bios_dir", null)?.firstOrNull()
                    if (currentDsi == null || currentDsi.contains("data/user/0") || currentDsi.contains("files/bios")) {
                        prefs.edit().putStringSet("dsi_bios_dir", setOf(android.net.Uri.fromFile(dsiDir).toString())).apply()
                    }
                    if (!prefs.contains("use_custom_bios")) {
                        prefs.edit().putBoolean("use_custom_bios", true).apply()
                    }
                    lastMigrationTime = System.currentTimeMillis()
                } catch (e: Throwable) {
                    Log.w("MelonDSApplication", "Failed to complete root storage migration", e)
                } finally {
                    isMigrating = false
                }
            }
        }

        private fun createCleanDsiNand(nandFile: File) {
            try {
                java.io.RandomAccessFile(nandFile, "rw").use { raf ->
                    raf.setLength(251658240L) // 240 MB

                    // 1. Write MBR at sector 0
                    val mbr = ByteArray(512)
                    mbr[0x1BE] = 0x80.toByte()
                    mbr[0x1C2] = 0x06.toByte() // FAT16
                    mbr[0x1C6] = 0x00.toByte(); mbr[0x1C7] = 0x08.toByte(); mbr[0x1C8] = 0x00.toByte(); mbr[0x1C9] = 0x00.toByte()
                    mbr[0x1CA] = 0x00.toByte(); mbr[0x1CB] = 0x00.toByte(); mbr[0x1CC] = 0x06.toByte(); mbr[0x1CD] = 0x00.toByte()
                    mbr[0x1FE] = 0x55.toByte(); mbr[0x1FF] = 0xAA.toByte()

                    raf.seek(0)
                    raf.write(mbr)

                    // 2. Write Partition 1 FAT16 Boot Sector at offset 0x100000 (1 MB)
                    val vbr = ByteArray(512)
                    vbr[0] = 0xEB.toByte(); vbr[1] = 0x3C.toByte(); vbr[2] = 0x90.toByte()
                    System.arraycopy("MSDOS5.0".toByteArray(Charsets.US_ASCII), 0, vbr, 3, 8)
                    vbr[11] = 0x00.toByte(); vbr[12] = 0x02.toByte() // 512 bytes/sector
                    vbr[13] = 0x08.toByte() // 8 sectors/cluster (4KB)
                    vbr[14] = 0x04.toByte(); vbr[15] = 0x00.toByte() // 4 reserved sectors
                    vbr[16] = 0x02.toByte() // 2 FATs
                    vbr[17] = 0x00.toByte(); vbr[18] = 0x02.toByte() // 512 root entries
                    vbr[21] = 0xF8.toByte() // Media descriptor
                    vbr[22] = 0x00.toByte(); vbr[23] = 0x01.toByte() // 256 sectors per FAT
                    vbr[24] = 0x20.toByte(); vbr[25] = 0x00.toByte()
                    vbr[26] = 0x40.toByte(); vbr[27] = 0x00.toByte()
                    vbr[28] = 0x00.toByte(); vbr[29] = 0x08.toByte(); vbr[30] = 0x00.toByte(); vbr[31] = 0x00.toByte()
                    vbr[32] = 0x00.toByte(); vbr[33] = 0x00.toByte(); vbr[34] = 0x06.toByte(); vbr[35] = 0x00.toByte()
                    vbr[38] = 0x29.toByte()
                    System.arraycopy("DSi NAND   ".toByteArray(Charsets.US_ASCII), 0, vbr, 43, 11)
                    System.arraycopy("FAT16   ".toByteArray(Charsets.US_ASCII), 0, vbr, 54, 8)
                    vbr[510] = 0x55.toByte(); vbr[511] = 0xAA.toByte()

                    raf.seek(0x100000L)
                    raf.write(vbr)

                    val fatHeader = byteArrayOf(0xF8.toByte(), 0xFF.toByte(), 0xFF.toByte(), 0xFF.toByte())
                    raf.seek(0x100800L)
                    raf.write(fatHeader)
                    raf.seek(0x120800L)
                    raf.write(fatHeader)

                    // 3. Write NOCASH footer at offset 0x000FF800 AND at end of file
                    val footer = ByteArray(64)
                    val magic = "DSi eMMC CID/CPU".toByteArray(Charsets.US_ASCII)
                    System.arraycopy(magic, 0, footer, 0, magic.size)
                    val cid = byteArrayOf(
                        0x15.toByte(), 0x00.toByte(), 0x00.toByte(), 0x00.toByte(),
                        0x00.toByte(), 0x00.toByte(), 0x00.toByte(), 0x00.toByte(),
                        0x00.toByte(), 0x00.toByte(), 0x00.toByte(), 0x00.toByte(),
                        0x00.toByte(), 0x00.toByte(), 0x00.toByte(), 0x01.toByte()
                    )
                    System.arraycopy(cid, 0, footer, 16, 16)
                    footer[32] = 0x01.toByte(); footer[36] = 0x01.toByte()

                    raf.seek(0x000FF800L)
                    raf.write(footer)

                    raf.seek(251658240L - 0x40L)
                    raf.write(footer)
                }
            } catch (_: Throwable) {}
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
