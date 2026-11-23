package me.magnum.melonds.impl

import android.app.ActivityManager
import android.content.Context
import android.os.Build
import android.os.Process
import me.magnum.melonds.domain.model.DevicePerformanceProfile
import me.magnum.melonds.domain.model.LiteRecommendationReason
import java.io.File

data class CpuCoreSignature(
    val implementer: Int,
    val part: Int,
)

data class DeviceHardwareSnapshot(
    val is64BitProcess: Boolean,
    val gpuModel: String,
    val socModel: String,
    val glEsMajor: Int,
    val glEsMinor: Int,
    val totalRamMb: Long,
    val isLowRamDevice: Boolean,
    val sdkInt: Int,
    val cpuCoreCount: Int,
    val cpuCores: List<CpuCoreSignature> = emptyList(),
)

object DevicePerformanceProfiler {
    private val POWERVR_GPU_REGEX = Regex(
        """powervr|power\s*vr|imgtec|imagination|\bge8\d{3}\b|\bg6\d{3}\b|\bgm9\d{3}\b|\brogue\b""",
        RegexOption.IGNORE_CASE,
    )
    private val MALI_LEGACY_GPU_REGEX = Regex(
        """mali[-\s]*(400|450|t6\d{2}|t7\d{2}|t8\d{2}|g31|g51)\b""",
        RegexOption.IGNORE_CASE,
    )
    private val ADRENO_MODEL_REGEX = Regex(
        """adreno[^0-9]*([0-9]{3})""",
        RegexOption.IGNORE_CASE,
    )
    private val LOW_END_SOC_REGEX = Regex(
        """(?<![a-z0-9])(mt6735|mt6737|mt6739|mt6750|mt6752|mt6753|mt6755|mt6757|mt6761|mt6762|mt6765|mt6795|mt6797|helio\s*g25|helio\s*g35|helio\s*g36|helio\s*g37|helio\s*a22|helio\s*a25|helio\s*p22|helio\s*p35|helio\s*x20|helio\s*x25|sc9863|sc9832|msm8917|msm8937|msm8940|msm8953|sdm429|sdm439|sdm450|exynos\s*7570|exynos\s*7870|exynos\s*7880|exynos\s*7884|exynos\s*7885|kirin\s*650|kirin\s*655|kirin\s*658|kirin\s*659)(?![0-9])""",
        RegexOption.IGNORE_CASE,
    )
    private val ARM_LITTLE_PARTS = setOf(0xd03, 0xd04, 0xd05, 0xc07, 0xc05, 0xc09)

    @Volatile
    private var cachedProfile: DevicePerformanceProfile? = null

    fun inspectDevice(context: Context): DevicePerformanceProfile {
        cachedProfile?.let { return it }
        val appContext = context.applicationContext
        val snapshot = captureSnapshot(appContext)
        val evaluated = evaluateDevice(snapshot)
        cachedProfile = evaluated
        return evaluated
    }

    fun evaluateDevice(snapshot: DeviceHardwareSnapshot): DevicePerformanceProfile {
        val gpuNormalized = snapshot.gpuModel.trim()
        val gpuLower = gpuNormalized.lowercase()
        val socNormalized = snapshot.socModel.trim()
        val socLower = socNormalized.lowercase()
        val recommendedSoftThreaded = snapshot.cpuCoreCount >= 4

        val adrenoModelNumber = ADRENO_MODEL_REGEX.find(gpuLower)
            ?.groupValues
            ?.getOrNull(1)
            ?.toIntOrNull()

        val allCoresArmLittle = snapshot.cpuCores.isNotEmpty() &&
            snapshot.cpuCores.all { it.implementer == 0x41 && it.part in ARM_LITTLE_PARTS }

        val reason = when {
            !snapshot.is64BitProcess -> LiteRecommendationReason.ABI_32_BIT_NO_JIT
            POWERVR_GPU_REGEX.containsMatchIn(gpuLower) -> LiteRecommendationReason.LEGACY_GPU_POWERVR
            MALI_LEGACY_GPU_REGEX.containsMatchIn(gpuLower) -> LiteRecommendationReason.LEGACY_GPU_MALI_MIDGARD
            adrenoModelNumber != null && adrenoModelNumber < 612 -> LiteRecommendationReason.LEGACY_GPU_ADRENO
            snapshot.glEsMajor < 3 || (snapshot.glEsMajor == 3 && snapshot.glEsMinor < 2) ->
                LiteRecommendationReason.GLES_BELOW_32
            LOW_END_SOC_REGEX.containsMatchIn(socLower) -> LiteRecommendationReason.LOW_END_SOC
            allCoresArmLittle -> LiteRecommendationReason.WEAK_CPU_ALL_LITTLE
            (snapshot.isLowRamDevice || (snapshot.totalRamMb in 1L..2560L)) && snapshot.sdkInt <= 29 ->
                LiteRecommendationReason.LOW_RAM_LEGACY_DEVICE
            else -> LiteRecommendationReason.NONE
        }

        val cpuSummary = buildString {
            append(if (snapshot.is64BitProcess) "64-bit" else "32-bit")
            append(" / ")
            append(snapshot.cpuCoreCount)
            append("c")
            if (socNormalized.isNotEmpty()) {
                append(" (")
                append(socNormalized)
                append(")")
            }
        }

        return DevicePerformanceProfile(
            recommendsLiteMode = reason != LiteRecommendationReason.NONE,
            reasonCode = reason,
            cpuSummary = cpuSummary,
            gpuSummary = gpuNormalized.ifBlank { "unknown" },
            is64Bit = snapshot.is64BitProcess,
            totalRamMb = snapshot.totalRamMb,
            glEsVersionMajor = snapshot.glEsMajor,
            glEsVersionMinor = snapshot.glEsMinor,
            cpuCoreCount = snapshot.cpuCoreCount,
            recommendedSoftThreaded = recommendedSoftThreaded,
        )
    }

    private fun captureSnapshot(context: Context): DeviceHardwareSnapshot {
        val is64Bit = runCatching {
            Process.is64Bit() && Build.SUPPORTED_64_BIT_ABIS.orEmpty().isNotEmpty()
        }.getOrDefault(Build.SUPPORTED_64_BIT_ABIS.orEmpty().isNotEmpty())

        val gpuCandidates = listOfNotNull(
            runCatching { AdrenoVulkanDriverSupport.getVulkanHardwareInfo()?.deviceName }.getOrNull(),
            runCatching { AdrenoVulkanDriverSupport.readSysfsGpuModel() }.getOrNull(),
            readFirstReadableText(
                listOf(
                    "/sys/class/misc/mali0/device/gpuinfo",
                    "/sys/devices/platform/mali.0/gpuinfo",
                    "/sys/kernel/gpu/gpu_model",
                ),
            ),
        ).map { it.trim() }.filter { it.isNotEmpty() }.distinct()
        val gpuModel = gpuCandidates.joinToString(" | ")

        val socParts = listOfNotNull(
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) runCatching { Build.SOC_MODEL }.getOrNull() else null,
            readSystemProperty("ro.board.platform"),
            readSystemProperty("ro.mediatek.platform"),
            readSystemProperty("ro.soc.model"),
            readSystemProperty("ro.hardware"),
            Build.HARDWARE,
            Build.BOARD,
            Build.MODEL,
        ).map { it.trim() }.filter { it.isNotEmpty() && !it.equals("unknown", ignoreCase = true) }.distinct()
        val socModel = socParts.joinToString(" ")

        val activityManager = context.getSystemService(ActivityManager::class.java)
        val reqGlEsVersion = activityManager?.deviceConfigurationInfo?.reqGlEsVersion ?: 0x00030002
        val glEsMajor = (reqGlEsVersion ushr 16) and 0xffff
        val glEsMinor = reqGlEsVersion and 0xffff

        val memInfo = ActivityManager.MemoryInfo()
        val totalRamMb = runCatching {
            activityManager?.getMemoryInfo(memInfo)
            memInfo.totalMem / (1024L * 1024L)
        }.getOrDefault(0L)
        val isLowRamDevice = runCatching {
            activityManager?.isLowRamDevice == true
        }.getOrDefault(false)

        val coreCount = runCatching { Runtime.getRuntime().availableProcessors().coerceAtLeast(1) }.getOrDefault(1)
        val cpuCores = readProcCpuInfoSignatures()

        return DeviceHardwareSnapshot(
            is64BitProcess = is64Bit,
            gpuModel = gpuModel,
            socModel = socModel,
            glEsMajor = glEsMajor,
            glEsMinor = glEsMinor,
            totalRamMb = totalRamMb,
            isLowRamDevice = isLowRamDevice,
            sdkInt = Build.VERSION.SDK_INT,
            cpuCoreCount = coreCount,
            cpuCores = cpuCores,
        )
    }

    internal fun parseProcCpuInfoSignatures(cpuInfoText: String): List<CpuCoreSignature> {
        val result = ArrayList<CpuCoreSignature>(8)
        var currentImplementer: Int? = null
        var currentPart: Int? = null

        fun flushPending() {
            val impl = currentImplementer
            val part = currentPart
            if (impl != null && part != null) {
                result.add(CpuCoreSignature(impl, part))
            }
            currentImplementer = null
            currentPart = null
        }

        cpuInfoText.lineSequence().forEach { rawLine ->
            val line = rawLine.trim()
            if (line.isEmpty()) {
                flushPending()
                return@forEach
            }
            val colonIdx = line.indexOf(':')
            if (colonIdx <= 0) return@forEach
            val key = line.substring(0, colonIdx).trim().lowercase()
            val value = line.substring(colonIdx + 1).trim()
            when (key) {
                "processor" -> {
                    if (currentImplementer != null && currentPart != null) {
                        flushPending()
                    }
                }
                "cpu implementer" -> currentImplementer = parseHexOrInt(value)
                "cpu part" -> currentPart = parseHexOrInt(value)
            }
        }
        flushPending()
        return result
    }

    private fun readProcCpuInfoSignatures(): List<CpuCoreSignature> {
        return runCatching {
            val file = File("/proc/cpuinfo")
            if (!file.canRead()) return emptyList()
            parseProcCpuInfoSignatures(file.readText())
        }.getOrDefault(emptyList())
    }

    private fun parseHexOrInt(raw: String): Int? {
        val trimmed = raw.trim().lowercase()
        return if (trimmed.startsWith("0x")) {
            trimmed.removePrefix("0x").toIntOrNull(16)
        } else {
            trimmed.toIntOrNull()
        }
    }

    private fun readFirstReadableText(paths: List<String>): String? {
        for (path in paths) {
            val text = runCatching {
                val f = File(path)
                if (f.canRead()) f.readText().trim() else null
            }.getOrNull()
            if (!text.isNullOrBlank()) return text
        }
        return null
    }

    private fun readSystemProperty(prop: String): String {
        return runCatching {
            val sysPropsClass = Class.forName("android.os.SystemProperties")
            val getMethod = sysPropsClass.getMethod("get", String::class.java, String::class.java)
            (getMethod.invoke(null, prop, "") as? String).orEmpty().trim()
        }.getOrDefault("")
    }
}
