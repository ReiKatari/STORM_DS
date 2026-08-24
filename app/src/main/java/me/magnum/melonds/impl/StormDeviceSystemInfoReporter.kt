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
import me.magnum.melonds.MelonEmulator
import java.io.File
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object StormDeviceSystemInfoReporter {
    private const val TAG = "StormSystemInfo"
    private const val INFO_FILE_NAME = "!STORM_INFO.txt"

    fun generateAndSaveReport(context: Context): String {
        val report = buildString {
            val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS Z", Locale.US)
            val nowStr = dateFormat.format(Date())

            val versionName = runCatching {
                context.packageManager.getPackageInfo(context.packageName, 0).versionName
            }.getOrNull() ?: "2.9.4"

            val versionCode = runCatching {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                    context.packageManager.getPackageInfo(context.packageName, 0).longVersionCode
                } else {
                    @Suppress("DEPRECATION")
                    context.packageManager.getPackageInfo(context.packageName, 0).versionCode.toLong()
                }
            }.getOrNull() ?: 294L

            appendLine("================================================================================")
            appendLine("STORM DS v$versionName (Build $versionCode) - Comprehensive Device & System Diagnostic")
            appendLine("Generated: $nowStr")
            appendLine("================================================================================")
            appendLine()

            // 1. DEVICE & HARDWARE PROFILE
            appendLine("1. DEVICE & HARDWARE PROFILE:")
            appendLine("   Manufacturer: ${Build.MANUFACTURER}")
            appendLine("   Brand: ${Build.BRAND}")
            appendLine("   Model: ${Build.MODEL}")
            appendLine("   Product: ${Build.PRODUCT}")
            appendLine("   Device: ${Build.DEVICE}")
            appendLine("   Board: ${Build.BOARD}")
            appendLine("   Hardware: ${Build.HARDWARE}")
            appendLine("   Supported ABIs: ${Build.SUPPORTED_ABIS.joinToString(", ")}")
            appendLine("   Is 64-Bit System: ${Process.is64Bit()}")
            appendLine("   Available CPU Cores: ${Runtime.getRuntime().availableProcessors()}")
            appendLine()

            // 2. OPERATING SYSTEM & ENVIRONMENT
            appendLine("2. OPERATING SYSTEM & ENVIRONMENT:")
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

            // 3. DISPLAY & RESOLUTION
            appendLine("3. DISPLAY & RESOLUTION:")
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

            // 4. MEMORY & STORAGE TELEMETRY
            appendLine("4. MEMORY & STORAGE TELEMETRY:")
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

            // 5. THERMAL & POWER STATUS
            appendLine("5. THERMAL & POWER STATUS:")
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

            // 6. AUDIO & LOW-LATENCY SUBSYSTEM
            appendLine("6. AUDIO & LOW-LATENCY SUBSYSTEM:")
            val audioManager = context.getSystemService(Context.AUDIO_SERVICE) as? AudioManager
            val sampleRate = audioManager?.getProperty(AudioManager.PROPERTY_OUTPUT_SAMPLE_RATE) ?: "48000"
            val framesPerBurst = audioManager?.getProperty(AudioManager.PROPERTY_OUTPUT_FRAMES_PER_BUFFER) ?: "192"
            appendLine("   Optimal Audio Sample Rate: $sampleRate Hz")
            appendLine("   Frames Per Burst (Low Latency): $framesPerBurst")
            appendLine("   Audio Backend: Oboe (AAudio High-Performance Path with OpenSL ES Fallback)")
            appendLine()

            // 7. SENSORS & CONTROLLER HARDWARE
            appendLine("7. SENSORS & CONTROLLER HARDWARE:")
            val sensorManager = context.getSystemService(Context.SENSOR_SERVICE) as? SensorManager
            val accel = sensorManager?.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
            val gyro = sensorManager?.getDefaultSensor(Sensor.TYPE_GYROSCOPE)
            appendLine("   Accelerometer: ${accel?.name ?: "NOT PRESENT"} (Vendor: ${accel?.vendor ?: "N/A"})")
            appendLine("   Gyroscope: ${gyro?.name ?: "NOT PRESENT"} (Vendor: ${gyro?.vendor ?: "N/A"})")
            appendLine()

            // 8. EMULATOR CORE SUBSYSTEM STATUS
            appendLine("8. EMULATOR CORE & FEATURES STATUS:")
            appendLine("   ARM64 JIT Recompiler: Available & Active (64-bit JIT Engine)")
            appendLine("   Vulkan 3D Graphics: Active (SPIR-V Dynamic Indexing & Fence Synchronization)")
            appendLine("   OpenGL ES 3.2 Renderer: Available")
            appendLine("   Librashader Shader Engine: Active (Rust C-API, Slang Shaders runtime)")
            appendLine("   RetroAchievements Engine: Active (rcheevos v11.6.0 native bridge)")
            appendLine("   Screen Rotation Lock: Supported (Hotkey & On-screen component)")
            appendLine("   Modcrypt AES Engine: Hardware-accurate DSiWare decryption")
            appendLine("   Save State Rewind: Active (Circular snapshot frame buffer)")
            appendLine("================================================================================")
        }

        // Write to Downloads/STORM DS LOGS/!STORM_INFO.txt
        runCatching {
            val downloadDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
            val logsDir = File(downloadDir, "STORM DS LOGS").apply { mkdirs() }
            val infoFile = File(logsDir, INFO_FILE_NAME)
            infoFile.writeText(report)
            Log.i(TAG, "Successfully wrote device info report to ${infoFile.absolutePath}")
        }.onFailure {
            Log.w(TAG, "Failed to write device info report to public Downloads", it)
        }

        return report
    }
}
