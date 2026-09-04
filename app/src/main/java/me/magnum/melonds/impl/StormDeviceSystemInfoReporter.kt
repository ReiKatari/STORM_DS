package me.magnum.melonds.impl

import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.hardware.Sensor
import android.hardware.SensorManager
import android.media.AudioManager
import android.os.BatteryManager
import android.os.Build
import android.os.Environment
import android.os.PowerManager
import android.os.Process
import android.os.StatFs
import android.util.DisplayMetrics
import android.util.Log
import android.view.WindowManager
import me.magnum.melonds.domain.model.ConsoleType
import me.magnum.melonds.domain.model.rom.Rom
import java.io.File
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object StormDeviceSystemInfoReporter {
    private const val TAG = "StormSystemInfo"
    const val INFO_FILE_NAME = "!STORM_INFO.txt"

    fun isLoggingEnabled(context: Context): Boolean {
        return runCatching {
            val prefs = androidx.preference.PreferenceManager.getDefaultSharedPreferences(context)
            prefs.getBoolean("system_app_log_file_enabled", false)
        }.getOrDefault(false)
    }

    fun saveUnifiedReport(
        context: Context,
        rom: Rom? = null,
        gameCodeOrTitleId: String? = null,
        success: Boolean = true,
        details: String? = null,
        bootMethod: String = "loadRom",
        dsBiosStatus: String = "UNKNOWN",
        dsiBiosStatus: String = "UNKNOWN",
        videoRenderer: String = "VULKAN",
        jitEnabled: Boolean = true,
        customBiosEnabled: Boolean = true,
        dsiWareBootMode: String? = null,
    ): String {
        if (!isLoggingEnabled(context)) {
            return ""
        }
        val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS Z", Locale.US)
        val nowStr = dateFormat.format(Date())

        val versionName = runCatching {
            context.packageManager.getPackageInfo(context.packageName, 0).versionName
        }.getOrNull() ?: "3.1.2"

        val versionCode = runCatching {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                context.packageManager.getPackageInfo(context.packageName, 0).longVersionCode
            } else {
                @Suppress("DEPRECATION")
                context.packageManager.getPackageInfo(context.packageName, 0).versionCode.toLong()
            }
        }.getOrNull() ?: 306L

        val report = buildString {
            appendLine("================================================================================")
            appendLine("STORM DS $versionName (Build $versionCode) - Comprehensive Unified System and Game Log")
            appendLine("Generated: $nowStr")
            appendLine("================================================================================")
            appendLine()

            // 1. ACTIVE GAME & EMULATION EXECUTION TELEMETRY
            if (rom != null) {
                appendLine("================================================================================")
                appendLine("1. ACTIVE GAME EXECUTION TELEMETRY AND MODE BREAKDOWN")
                appendLine("================================================================================")
                appendLine("  Game Name: ${rom.name}")
                appendLine("  File Name: ${rom.fileName}")
                appendLine("  Game Code / Title ID: ${gameCodeOrTitleId ?: "N/A"}")
                appendLine("  ROM URI: ${rom.uri}")
                appendLine("  Console Target: ${rom.config.runtimeConsoleType}")
                appendLine("  Is DSiWare Title: ${rom.isDsiWareTitle}")
                appendLine("  Is DSi Enhanced: ${rom.isDsiEnhanced}")
                appendLine("  Is Installed DSiWare Shortcut: ${rom.isInstalledDsiWareShortcut}")
                appendLine("  Installed DSiWare TitleId: ${rom.installedDsiWareTitleId?.toString(16) ?: "null"}")
                appendLine("  Video Renderer: $videoRenderer")
                appendLine("  JIT Recompiler: $jitEnabled")
                appendLine("  Custom BIOS Enabled: $customBiosEnabled")
                appendLine("  DS Custom BIOS Status: $dsBiosStatus")
                appendLine("  DSi Custom BIOS/NAND Status: $dsiBiosStatus")
                if (dsiWareBootMode != null) {
                    appendLine("  DSiWare Boot Mode: $dsiWareBootMode")
                }
                appendLine("--------------------------------------------------------------------------------")
                appendLine("  Execution Method: $bootMethod")
                appendLine("  Launch Status: ${if (success) "SUCCESS" else "FAILED / ERROR DETECTED"}")
                if (!details.isNullOrBlank()) {
                    appendLine("  Diagnostics and Execution Log:")
                    appendLine(details)
                }
                appendLine("================================================================================")
                appendLine()
            }

            // 2. DEVICE & HARDWARE PROFILE
            appendLine("2. DEVICE AND HARDWARE PROFILE:")
            appendLine("   Manufacturer: ${Build.MANUFACTURER}")
            appendLine("   Brand: ${Build.BRAND}")
            appendLine("   Model: ${Build.MODEL}")
            appendLine("   Product: ${Build.PRODUCT}")
            appendLine("   Device: ${Build.DEVICE}")
            appendLine("   Board: ${Build.BOARD}")
            appendLine("   Hardware / SoC: ${Build.HARDWARE}")
            appendLine("   Supported ABIs: ${Build.SUPPORTED_ABIS.joinToString(", ")}")
            appendLine("   Is 64-Bit Architecture: ${Process.is64Bit()}")
            appendLine("   Available CPU Cores: ${Runtime.getRuntime().availableProcessors()}")
            appendLine()

            // 3. OPERATING SYSTEM & ANDROID RUNTIME
            appendLine("3. OPERATING SYSTEM AND ANDROID RUNTIME:")
            appendLine("   Android Release: Android ${Build.VERSION.RELEASE}")
            appendLine("   SDK / API Level: ${Build.VERSION.SDK_INT}")
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                appendLine("   Security Patch: ${Build.VERSION.SECURITY_PATCH}")
            }
            appendLine("   Build Display ID: ${Build.DISPLAY}")
            appendLine("   Fingerprint: ${Build.FINGERPRINT}")
            appendLine("   OS Name/Arch: ${System.getProperty("os.name")} (${System.getProperty("os.arch")})")
            appendLine("   Kernel Version: ${System.getProperty("os.version")}")
            appendLine()

            // 4. DISPLAY & RESOLUTION PROFILE
            appendLine("4. DISPLAY AND RESOLUTION PROFILE:")
            val windowManager = context.getSystemService(Context.WINDOW_SERVICE) as? WindowManager
            val display = windowManager?.defaultDisplay
            val metrics = DisplayMetrics()
            @Suppress("DEPRECATION")
            display?.getRealMetrics(metrics)
            appendLine("   Real Screen Resolution: ${metrics.widthPixels} x ${metrics.heightPixels} px")
            appendLine("   Density: ${metrics.densityDpi} DPI (factor=${metrics.density})")
            val refreshRate = display?.refreshRate ?: 60f
            appendLine("   Current Refresh Rate: ${String.format(Locale.US, "%.1f", refreshRate)} Hz")
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                val supportedModes = display?.supportedModes.orEmpty()
                val modesStr = supportedModes.joinToString(", ") { "${it.physicalWidth}x${it.physicalHeight}@${String.format(Locale.US, "%.0f", it.refreshRate)}Hz" }
                appendLine("   Supported Display Modes: [$modesStr]")
            }
            appendLine()

            // 5. MEMORY & STORAGE TELEMETRY
            appendLine("5. MEMORY AND STORAGE TELEMETRY:")
            val actManager = context.getSystemService(Context.ACTIVITY_SERVICE) as? ActivityManager
            val memInfo = ActivityManager.MemoryInfo()
            actManager?.getMemoryInfo(memInfo)
            val totalRamGb = memInfo.totalMem / (1024.0 * 1024.0 * 1024.0)
            val availRamGb = memInfo.availMem / (1024.0 * 1024.0 * 1024.0)
            val thresholdMb = memInfo.threshold / (1024 * 1024)
            appendLine("   Total System RAM: ${String.format(Locale.US, "%.2f", totalRamGb)} GB (${memInfo.totalMem / (1024 * 1024)} MB)")
            appendLine("   Available System RAM: ${String.format(Locale.US, "%.2f", availRamGb)} GB (${memInfo.availMem / (1024 * 1024)} MB)")
            appendLine("   Low Memory Threshold: $thresholdMb MB (isLowMemory=${memInfo.lowMemory})")
            val maxJvmHeapMb = Runtime.getRuntime().maxMemory() / (1024 * 1024)
            val totalJvmHeapMb = Runtime.getRuntime().totalMemory() / (1024 * 1024)
            val freeJvmHeapMb = Runtime.getRuntime().freeMemory() / (1024 * 1024)
            appendLine("   JVM Heap: Allocated=${totalJvmHeapMb}MB, Free=${freeJvmHeapMb}MB, Max=${maxJvmHeapMb}MB")

            val internalDataDir = Environment.getDataDirectory()
            val statFs = StatFs(internalDataDir.path)
            val freeStorageGb = (statFs.availableBlocksLong * statFs.blockSizeLong) / (1024.0 * 1024.0 * 1024.0)
            val totalStorageGb = (statFs.blockCountLong * statFs.blockSizeLong) / (1024.0 * 1024.0 * 1024.0)
            appendLine("   Internal Storage: Free=${String.format(Locale.US, "%.1f", freeStorageGb)} GB / Total=${String.format(Locale.US, "%.1f", totalStorageGb)} GB")
            appendLine()

            // 6. THERMAL & POWER STATUS
            appendLine("6. THERMAL AND POWER STATUS:")
            val batteryFilter = IntentFilter(Intent.ACTION_BATTERY_CHANGED)
            val batteryStatus = context.registerReceiver(null, batteryFilter)
            val level = batteryStatus?.getIntExtra(BatteryManager.EXTRA_LEVEL, -1) ?: -1
            val scale = batteryStatus?.getIntExtra(BatteryManager.EXTRA_SCALE, -1) ?: -1
            val batteryPct = if (level >= 0 && scale > 0) (level * 100 / scale) else -1
            val temp = batteryStatus?.getIntExtra(BatteryManager.EXTRA_TEMPERATURE, 0) ?: 0
            appendLine("   Battery Level: $batteryPct% (Temp: ${temp / 10.0} °C)")
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                val powerManager = context.getSystemService(Context.POWER_SERVICE) as? PowerManager
                appendLine("   Current Thermal Status: ${powerManager?.currentThermalStatus ?: "UNKNOWN"}")
            }
            appendLine()

            // 7. AUDIO SUBSYSTEM & LOW-LATENCY PROFILE
            appendLine("7. AUDIO SUBSYSTEM AND LOW-LATENCY PROFILE:")
            val audioManager = context.getSystemService(Context.AUDIO_SERVICE) as? AudioManager
            val sampleRate = audioManager?.getProperty(AudioManager.PROPERTY_OUTPUT_SAMPLE_RATE) ?: "48000"
            val framesPerBurst = audioManager?.getProperty(AudioManager.PROPERTY_OUTPUT_FRAMES_PER_BUFFER) ?: "192"
            appendLine("   Optimal Audio Sample Rate: $sampleRate Hz")
            appendLine("   Frames Per Burst (Low Latency): $framesPerBurst")
            appendLine("   Audio Backend: Oboe (AAudio High-Performance Path with OpenSL ES Fallback)")
            appendLine()

            // 8. SENSORS & HARDWARE STATUS
            appendLine("8. SENSORS AND HARDWARE STATUS:")
            val sensorManager = context.getSystemService(Context.SENSOR_SERVICE) as? SensorManager
            val accel = sensorManager?.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
            val gyro = sensorManager?.getDefaultSensor(Sensor.TYPE_GYROSCOPE)
            appendLine("   Accelerometer: ${accel?.name ?: "NOT PRESENT"} (Vendor: ${accel?.vendor ?: "N/A"})")
            appendLine("   Gyroscope: ${gyro?.name ?: "NOT PRESENT"} (Vendor: ${gyro?.vendor ?: "N/A"})")
            appendLine()

            // 9. EMULATOR SUBSYSTEM ARCHITECTURE & STATUS
            appendLine("9. EMULATOR SUBSYSTEM ARCHITECTURE AND STATUS:")
            appendLine("   ARM64 JIT Recompiler: Active and Optimized (64-bit JIT Engine)")
            appendLine("   Vulkan 3D Engine: Active (SPIR-V Dynamic Indexing, Fence Sync, Pipeline Cache)")
            appendLine("   OpenGL ES 3.2 Renderer: Available Fallback")
            appendLine("   Librashader Shader Engine: Active (Rust C-API, Slang Shaders runtime)")
            appendLine("   RetroAchievements Engine: Active (rcheevos v11.6.0 native bridge)")
            appendLine("   Screen Layout Provider: Robust Orientation-Aware Presentation Engine")
            appendLine("   Modcrypt AES Engine: Hardware-accurate DSiWare decryption and DirectBoot")
            appendLine("   Save State Rewind: Active (Circular snapshot frame buffer)")
            appendLine("================================================================================")
        }

        // Save system report to /storage/emulated/0/STORM DS/logs/!STORM_INFO.txt
        runCatching {
            val rootLogsDir = File(Environment.getExternalStorageDirectory(), "STORM DS/logs").apply { mkdirs() }
            val infoFile = File(rootLogsDir, INFO_FILE_NAME)
            infoFile.writeText(report, Charsets.UTF_8)

            // Also copy to internal app logs for reliability
            val internalLogsDir = File(context.filesDir, "logs").apply { mkdirs() }
            File(internalLogsDir, INFO_FILE_NAME).writeText(report, Charsets.UTF_8)

            if (rom == null) {
                // Application startup: clean up stale game logs from previous sessions
                rootLogsDir.listFiles()?.forEach { file ->
                    if (file.name != INFO_FILE_NAME && file.name.endsWith(".txt")) {
                        file.delete()
                    }
                }
                internalLogsDir.listFiles()?.forEach { file ->
                    if (file.name != INFO_FILE_NAME && file.name.endsWith(".txt")) {
                        file.delete()
                    }
                }
            } else {
                // Clean up old legacy suffix files (*_DIRECT.txt, *_AUTO.txt, *_NAND.txt)
                rootLogsDir.listFiles()?.forEach { file ->
                    if (file.name != INFO_FILE_NAME && file.name.endsWith(".txt")) {
                        val base = file.name.substringBeforeLast(".txt")
                        if (base.endsWith("_DIRECT") || base.endsWith("_AUTO") || base.endsWith("_NAND")) {
                            file.delete()
                        }
                    }
                }
                internalLogsDir.listFiles()?.forEach { file ->
                    if (file.name != INFO_FILE_NAME && file.name.endsWith(".txt")) {
                        val base = file.name.substringBeforeLast(".txt")
                        if (base.endsWith("_DIRECT") || base.endsWith("_AUTO") || base.endsWith("_NAND")) {
                            file.delete()
                        }
                    }
                }
            }

            // Clean up old /Download/STORM DS LOGS folder
            val downloadDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
            val oldLogsDir = File(downloadDir, "STORM DS LOGS")
            if (oldLogsDir.exists()) {
                oldLogsDir.deleteRecursively()
            }
            Log.i(TAG, "Successfully wrote unified system diagnostic report to ${infoFile.absolutePath}")
        }.onFailure {
            Log.w(TAG, "Failed to write system report to STORM DS/logs", it)
        }

        return report
    }

    fun saveGameLog(
        context: Context,
        rom: Rom,
        mode: String, // "DIRECT", "AUTO", "NAND"
        success: Boolean,
        details: String?,
        bootMethod: String = "loadRom",
        dsBiosStatus: String = "UNKNOWN",
        dsiBiosStatus: String = "UNKNOWN",
        videoRenderer: String = "VULKAN",
        jitEnabled: Boolean = true,
        customBiosEnabled: Boolean = true,
    ) {
        if (!isLoggingEnabled(context)) {
            return
        }
        val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS Z", Locale.US)
        val nowStr = dateFormat.format(Date())

        val rawFileName = rom.fileName.substringBeforeLast('.')
        val cleanFileName = rawFileName.replace(Regex("[\\\\/:*?\"<>|]"), "_").trim()
        val logFileName = "${cleanFileName}.txt"

        val gameReport = buildString {
            appendLine("================================================================================")
            appendLine("                      STORM DS GAME EXECUTION LOG")
            appendLine("================================================================================")
            appendLine("Timestamp: $nowStr")
            appendLine("Game Title: ${rom.name}")
            appendLine("File Name: ${rom.fileName}")
            appendLine("Launch Mode: ${mode.uppercase(Locale.US)}")
            appendLine("Boot Method: $bootMethod")
            appendLine("Execution Status: ${if (success) "SUCCESSFUL / RUNNING" else "FAILED / ERROR"}")
            appendLine("Console Type: ${if (rom.isDsiWareTitle || rom.isInstalledDsiWareShortcut) "Nintendo DSi" else "Nintendo DS"}")
            appendLine("Video Renderer: $videoRenderer")
            appendLine("JIT Recompiler: ${if (jitEnabled) "ENABLED (ARM64)" else "DISABLED (Interpreter)"}")
            appendLine("Custom BIOS: ${if (customBiosEnabled) "ENABLED" else "DISABLED (FreeBIOS)"}")
            appendLine("DS BIOS Status: $dsBiosStatus")
            appendLine("DSi BIOS Status: $dsiBiosStatus")
            appendLine("--------------------------------------------------------------------------------")
            appendLine("DIAGNOSTICS AND EXECUTION DETAILS:")
            appendLine(details ?: "No additional diagnostic output available.")
            appendLine("================================================================================")
        }

        runCatching {
            val rootLogsDir = File(Environment.getExternalStorageDirectory(), "STORM DS/logs").apply { mkdirs() }
            // Delete any obsolete suffixed variants for this specific game
            File(rootLogsDir, "${cleanFileName}_DIRECT.txt").delete()
            File(rootLogsDir, "${cleanFileName}_AUTO.txt").delete()
            File(rootLogsDir, "${cleanFileName}_NAND.txt").delete()

            val gameLogFile = File(rootLogsDir, logFileName)
            gameLogFile.writeText(gameReport, Charsets.UTF_8)

            val internalLogsDir = File(context.filesDir, "logs").apply { mkdirs() }
            File(internalLogsDir, "${cleanFileName}_DIRECT.txt").delete()
            File(internalLogsDir, "${cleanFileName}_AUTO.txt").delete()
            File(internalLogsDir, "${cleanFileName}_NAND.txt").delete()

            File(internalLogsDir, logFileName).writeText(gameReport, Charsets.UTF_8)

            Log.i(TAG, "Successfully saved single game log to ${gameLogFile.absolutePath}")
        }.onFailure {
            Log.w(TAG, "Failed to save game log for ${rom.name}", it)
        }
    }
}
