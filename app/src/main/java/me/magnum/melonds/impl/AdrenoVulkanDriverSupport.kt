package me.magnum.melonds.impl

import android.content.Context
import android.os.Build
import me.magnum.melonds.MelonDSAndroidInterface
import me.magnum.melonds.R
import me.magnum.melonds.VulkanGpuHardwareInfo
import java.io.File

object AdrenoVulkanDriverSupport {
    private const val VENDOR_ID_QUALCOMM = 0x5143
    private const val VENDOR_ID_ARM_MALI = 0x13B5
    private const val VENDOR_ID_AMD_XCLIPSE = 0x1002
    private const val VENDOR_ID_POWERVR = 0x1010
    private const val VENDOR_ID_HUAWEI_MALEOON = 0x19E5
    private const val VENDOR_ID_INTEL = 0x8086
    private const val VENDOR_ID_NVIDIA = 0x10DE
    private const val VENDOR_ID_SWIFTSHADER = 0x1AE0

    enum class SupportStatus {
        SUPPORTED,
        UNSUPPORTED_LEGACY_BUILD,
        UNSUPPORTED_ANDROID_OR_ABI,
        UNSUPPORTED_GPU,
    }

    enum class AdrenoSubFamily {
        ADRENO_840_PLUS,
        ADRENO_8XX_ELITE,
        ADRENO_7XX_MODERN,
        ADRENO_710_720,
        ADRENO_6XX,
        ADRENO_LEGACY_OR_UNKNOWN,
        NON_ADRENO,
    }

    enum class GpuSeries(val displayName: String) {
        ADRENO_8XX("Adreno 8xx (Snapdragon 8 Elite / Gen 4 / Gen 5)"),
        ADRENO_7XX("Adreno 7xx (Snapdragon 8 Gen 1/2/3, 7+ Gen 2/3, 7s Gen 3)"),
        ADRENO_6XX("Adreno 6xx (Snapdragon 865/870/888, 778G, 695)"),
        ADRENO_OTHER("Qualcomm Adreno (Legacy/Other)"),
        NON_ADRENO("Non-Adreno GPU"),
    }

    fun getSupportStatus(context: Context): SupportStatus {
        if (!context.resources.getBoolean(R.bool.adrenotools_enabled)) {
            return SupportStatus.UNSUPPORTED_LEGACY_BUILD
        }
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.P ||
            Build.SUPPORTED_64_BIT_ABIS.none { it.equals("arm64-v8a", ignoreCase = true) }
        ) {
            return SupportStatus.UNSUPPORTED_ANDROID_OR_ABI
        }
        val subFamily = getSubFamily()
        if (subFamily == AdrenoSubFamily.NON_ADRENO || subFamily == AdrenoSubFamily.ADRENO_LEGACY_OR_UNKNOWN) {
            return SupportStatus.UNSUPPORTED_GPU
        }
        return SupportStatus.SUPPORTED
    }

    fun isSupported(context: Context): Boolean {
        return getSupportStatus(context) == SupportStatus.SUPPORTED
    }

    fun getVulkanHardwareInfo(): VulkanGpuHardwareInfo? {
        return MelonDSAndroidInterface.getVulkanGpuInfo()
    }

    fun readSysfsGpuModel(): String {
        return listOf(
            "/sys/class/kgsl/kgsl-3d0/gpu_model",
            "/sys/class/kgsl/kgsl-3d0/gpu_model_name",
            "/proc/gpuinfo",
        ).firstNotNullOfOrNull { path ->
            runCatching {
                File(path)
                    .takeIf { it.isFile }
                    ?.readText()
                    ?.takeIf { it.isNotBlank() }
            }.getOrNull()
        }.orEmpty().trim()
    }

    private fun readSocModel(): String {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            Build.SOC_MODEL.orEmpty()
        } else {
            ""
        }
    }

    fun isAdrenoDevice(): Boolean {
        val hwInfo = getVulkanHardwareInfo()
        if (hwInfo != null) {
            when (hwInfo.vendorId) {
                VENDOR_ID_QUALCOMM -> return true
                VENDOR_ID_ARM_MALI,
                VENDOR_ID_AMD_XCLIPSE,
                VENDOR_ID_POWERVR,
                VENDOR_ID_HUAWEI_MALEOON,
                VENDOR_ID_INTEL,
                VENDOR_ID_NVIDIA,
                VENDOR_ID_SWIFTSHADER,
                -> return false
            }
            val vkName = hwInfo.deviceName.lowercase()
            if (isKnownNonAdrenoName(vkName)) return false
            if (vkName.contains("adreno")) return true
        }

        val sysfsModel = readSysfsGpuModel().lowercase()
        if (isKnownNonAdrenoName(sysfsModel)) return false
        if (sysfsModel.contains("adreno")) return true

        val hardware = Build.HARDWARE.lowercase()
        val soc = readSocModel().lowercase()
        if (hardware.startsWith("mt") ||
            hardware.contains("exynos") ||
            hardware.contains("samsung") ||
            hardware.contains("kirin") ||
            hardware.contains("s5e") ||
            hardware.contains("tensor") ||
            hardware.contains("ranchu") ||
            hardware.contains("goldfish")
        ) {
            return false
        }

        if (File("/sys/class/kgsl/kgsl-3d0").exists()) {
            return true
        }

        return hardware == "qcom" ||
            hardware.contains("qualcomm") ||
            soc.startsWith("sm") ||
            soc.startsWith("sdm") ||
            soc.startsWith("qcm") ||
            soc.startsWith("qcs")
    }

    private fun isKnownNonAdrenoName(nameLower: String): Boolean {
        if (nameLower.isBlank()) return false
        return nameLower.contains("mali") ||
            nameLower.contains("immortalis") ||
            nameLower.contains("xclipse") ||
            nameLower.contains("powervr") ||
            nameLower.contains("rogue") ||
            nameLower.contains("b-series") ||
            nameLower.contains("maleoon") ||
            nameLower.contains("swiftshader") ||
            nameLower.contains("llvmpipe") ||
            nameLower.contains("virgl") ||
            nameLower.contains("tegra") ||
            nameLower.contains("nvidia") ||
            nameLower.contains("radeon") ||
            nameLower.contains("intel")
    }

    fun getSubFamily(): AdrenoSubFamily {
        if (!isAdrenoDevice()) {
            return AdrenoSubFamily.NON_ADRENO
        }

        val vkDevice = getVulkanHardwareInfo()?.deviceName.orEmpty().lowercase()
        val sysfs = readSysfsGpuModel().lowercase()
        val combinedModel = "$vkDevice $sysfs".trim()
        val soc = readSocModel().lowercase()
        val hardware = Build.HARDWARE.lowercase()
        val board = Build.BOARD.lowercase()

        // Adreno 810 (Snapdragon 7s Gen 3 / SM7635 / volcano) uses 7xx Turnip architecture, NOT Gen8/8xx
        if (soc.contains("7635") ||
            hardware.contains("volcano") ||
            board.contains("volcano") ||
            combinedModel.contains("810")
        ) {
            return AdrenoSubFamily.ADRENO_710_720
        }

        // Adreno 840+ (Snapdragon 8 Elite Gen 5 / SM8850 / SM8845 / SM8835 / canoe)
        if (soc.contains("8850") ||
            soc.contains("8845") ||
            soc.contains("8835") ||
            hardware.contains("canoe") ||
            board.contains("canoe") ||
            combinedModel.contains("840") ||
            combinedModel.contains("845") ||
            combinedModel.contains("850") ||
            combinedModel.contains("adreno (tm) 84") ||
            combinedModel.contains("adreno 84") ||
            combinedModel.contains("adreno (tm) 9") ||
            combinedModel.contains("adreno 9")
        ) {
            return AdrenoSubFamily.ADRENO_840_PLUS
        }

        // Adreno 825 / 829 / 830 (Snapdragon 8 Elite / SM8750 / 8s Gen 4 / X1)
        if (soc.contains("8750") ||
            soc.contains("8735") ||
            combinedModel.contains("830") ||
            combinedModel.contains("829") ||
            combinedModel.contains("825") ||
            combinedModel.contains("adreno 8") ||
            combinedModel.contains("adreno8") ||
            combinedModel.contains("adreno (tm) 8") ||
            combinedModel.contains("adreno x1")
        ) {
            return AdrenoSubFamily.ADRENO_8XX_ELITE
        }

        // Adreno 710 / 720 / 722
        if (combinedModel.contains("710") ||
            combinedModel.contains("720") ||
            combinedModel.contains("722")
        ) {
            return AdrenoSubFamily.ADRENO_710_720
        }

        // Modern Adreno 7xx (725 / 730 / 732 / 735 / 740 / 750 / 702)
        if (combinedModel.contains("750") ||
            combinedModel.contains("740") ||
            combinedModel.contains("735") ||
            combinedModel.contains("732") ||
            combinedModel.contains("730") ||
            combinedModel.contains("725") ||
            combinedModel.contains("702") ||
            combinedModel.contains("adreno 7") ||
            combinedModel.contains("adreno7") ||
            combinedModel.contains("adreno (tm) 7")
        ) {
            return AdrenoSubFamily.ADRENO_7XX_MODERN
        }

        // Adreno 6xx (610..690, including 619 on Snapdragon 695 / 750G)
        if (combinedModel.contains("adreno 6") ||
            combinedModel.contains("adreno6") ||
            combinedModel.contains("adreno (tm) 6") ||
            Regex("\\b6[0-9]{2}\\b").containsMatchIn(combinedModel)
        ) {
            return AdrenoSubFamily.ADRENO_6XX
        }

        // Explicitly block legacy Adreno 3xx/4xx/5xx (custom Turnip/Adrenotools drivers do not support A5xx and older)
        val modelNumberMatch = Regex("adreno[^0-9]*([0-9]{3})").find(combinedModel)
        val modelNumber = modelNumberMatch?.groupValues?.getOrNull(1)?.toIntOrNull()
        if (modelNumber != null && modelNumber < 600) {
            return AdrenoSubFamily.ADRENO_LEGACY_OR_UNKNOWN
        }

        // If Qualcomm SoC/Vulkan device didn't expose numeric model string cleanly, allow modern 64-bit QCOM default
        return AdrenoSubFamily.ADRENO_7XX_MODERN
    }

    fun getGpuSeries(): GpuSeries {
        return when (getSubFamily()) {
            AdrenoSubFamily.ADRENO_840_PLUS,
            AdrenoSubFamily.ADRENO_8XX_ELITE,
            -> GpuSeries.ADRENO_8XX
            AdrenoSubFamily.ADRENO_7XX_MODERN,
            AdrenoSubFamily.ADRENO_710_720,
            -> GpuSeries.ADRENO_7XX
            AdrenoSubFamily.ADRENO_6XX -> GpuSeries.ADRENO_6XX
            AdrenoSubFamily.ADRENO_LEGACY_OR_UNKNOWN -> GpuSeries.ADRENO_OTHER
            AdrenoSubFamily.NON_ADRENO -> GpuSeries.NON_ADRENO
        }
    }

    fun isAdreno8xx(): Boolean {
        val sub = getSubFamily()
        return sub == AdrenoSubFamily.ADRENO_8XX_ELITE || sub == AdrenoSubFamily.ADRENO_840_PLUS
    }

    fun isAdreno840OrNewer(): Boolean {
        return getSubFamily() == AdrenoSubFamily.ADRENO_840_PLUS
    }

    fun isAdreno710Family(): Boolean {
        return getSubFamily() == AdrenoSubFamily.ADRENO_710_720
    }

    fun isDriverPotentiallyIncompatibleWithAdreno8xx(
        driverName: String,
        description: String? = null,
        version: String? = null,
    ): Boolean {
        if (!isAdreno8xx()) return false
        val combined = listOfNotNull(driverName, description, version).joinToString(" ").lowercase()

        if (isAdreno840OrNewer()) {
            val isExplicitly840Ready = combined.contains("840") ||
                combined.contains("8850") ||
                combined.contains("gen 5") ||
                combined.contains("gen5") ||
                combined.contains("a840") ||
                combined.contains("storm") ||
                combined.contains("gamehub") ||
                combined.contains("elite gen")
            return !isExplicitly840Ready
        }

        // Adreno 825 / 830 (8 Elite)
        val hasGen8Tag = combined.contains("830") ||
            combined.contains("829") ||
            combined.contains("825") ||
            combined.contains("adreno 8") ||
            combined.contains("adreno8") ||
            combined.contains("8 elite") ||
            combined.contains("gen8") ||
            combined.contains("gamehub") ||
            combined.contains("aurora") ||
            combined.contains("842.8") ||
            combined.contains("849.") ||
            combined.contains("storm")
        return !hasGen8Tag
    }

    fun getDeviceGpuDescription(): String {
        val vkName = getVulkanHardwareInfo()?.deviceName?.trim().orEmpty()
        val sysfsModel = readSysfsGpuModel()
        val bestName = when {
            vkName.isNotBlank() -> vkName
            sysfsModel.isNotBlank() -> sysfsModel
            else -> ""
        }
        val soc = readSocModel().takeIf { it.isNotBlank() } ?: Build.HARDWARE
        if (bestName.isNotBlank()) {
            return if (soc.isNotBlank() && !bestName.contains(soc, ignoreCase = true)) {
                "$bestName ($soc)"
            } else {
                bestName
            }
        }
        if (Build.HARDWARE.contains("qcom", ignoreCase = true) || isAdrenoDevice()) {
            return "Qualcomm Adreno ($soc)"
        }
        return "$soc (${Build.BOARD})"
    }
}
