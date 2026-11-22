package me.magnum.melonds.impl

import android.content.Context
import android.os.Build
import android.os.Process
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

    private val MALI_MODEL_REGEX = Regex("(?:mali|immortalis)?[^a-z0-9]*(t\\d{2,4}|g\\d{2,3}(?:ae)?)")

    enum class SupportStatus {
        SUPPORTED,
        UNSUPPORTED_LEGACY_BUILD,
        UNSUPPORTED_ANDROID_OR_ABI,
        UNSUPPORTED_GPU,
    }

    enum class GpuVendorFamily(val displayName: String) {
        ADRENO("Qualcomm Adreno"),
        ARM_MALI("ARM Mali / Immortalis"),
        SAMSUNG_XCLIPSE("Samsung Xclipse (RDNA)"),
        POWERVR("Imagination PowerVR"),
        OTHER("Other / Unknown GPU"),
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

    enum class MaliArchFamily(val displayName: String) {
        V7_BIFROST("Arm Mali Bifrost v7 (G31/G51/G52/G76)"),
        V9_VALHALL("Arm Mali Valhall v9 (G57/G68/G77/G78)"),
        V10_VALHALL("Arm Mali Valhall v10 (G310/G510/G610/G710)"),
        V11_VALHALL("Arm Mali Valhall v11 (G615/G715)"),
        V12_FIFTH_GEN("Arm Mali 5th Gen v12 (G620/G720)"),
        UNSUPPORTED_MIDGARD_OR_V6("Unsupported Mali Midgard / Bifrost v6 (T*/G71/G72)"),
        UNSUPPORTED_V13_PLUS("Unsupported Mali 5th Gen v13+ (G925)"),
        UNKNOWN_MALI("Unknown Arm Mali GPU"),
        NON_MALI("Non-Mali GPU");

        fun isSupportedByMalisx2(): Boolean {
            return when (this) {
                V7_BIFROST,
                V9_VALHALL,
                V10_VALHALL,
                V11_VALHALL,
                V12_FIFTH_GEN,
                -> true

                UNSUPPORTED_MIDGARD_OR_V6,
                UNSUPPORTED_V13_PLUS,
                UNKNOWN_MALI,
                NON_MALI,
                -> false
            }
        }
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
        if (!isLoaderAvailable(
                buildEnabled = true,
                sdkInt = Build.VERSION.SDK_INT,
                supported64BitAbis = Build.SUPPORTED_64_BIT_ABIS.orEmpty(),
                is64BitProcess = is64BitArmProcess(),
            )
        ) {
            return SupportStatus.UNSUPPORTED_ANDROID_OR_ABI
        }
        return SupportStatus.SUPPORTED
    }

    fun isSupported(context: Context): Boolean {
        return supportsCustomDrivers(context)
    }

    fun supportsCustomDrivers(context: Context): Boolean {
        return getSupportStatus(context) == SupportStatus.SUPPORTED
    }

    fun supportsFreedreno(context: Context): Boolean {
        return supportsCustomDrivers(context) && isAdrenoDevice()
    }

    internal fun isAdrenoGpu(gpuModel: String?): Boolean {
        return gpuModel?.trim()?.startsWith("Adreno", ignoreCase = true) == true
    }

    internal fun isLoaderAvailable(
        buildEnabled: Boolean,
        sdkInt: Int,
        supported64BitAbis: Array<out String>,
        is64BitProcess: Boolean,
    ): Boolean {
        return buildEnabled && is64BitProcess &&
            sdkInt >= Build.VERSION_CODES.P &&
            supported64BitAbis.any { it.equals("arm64-v8a", ignoreCase = true) }
    }

    fun getVulkanHardwareInfo(): VulkanGpuHardwareInfo? {
        return runCatching { MelonDSAndroidInterface.getVulkanGpuInfo() }.getOrNull()
    }

    fun readSysfsGpuModel(): String {
        return listOf(
            "/sys/class/kgsl/kgsl-3d0/gpu_model",
            "/sys/class/kgsl/kgsl-3d0/gpu_model_name",
            "/sys/class/misc/mali0/device/gpuinfo",
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

    fun hasMaliKbaseKernel(): Boolean {
        return File("/dev/mali0").exists() || File("/sys/class/misc/mali0").exists()
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

        val hardware = Build.HARDWARE.orEmpty().lowercase()
        val soc = readSocModel().lowercase()
        if (hardware.startsWith("mt") ||
            hardware.contains("exynos") ||
            hardware.contains("samsung") ||
            hardware.contains("kirin") ||
            hardware.contains("s5e") ||
            hardware.contains("tensor") ||
            hardware.contains("ranchu") ||
            hardware.contains("goldfish") ||
            soc.startsWith("mt") ||
            soc.contains("dimensity") ||
            soc.contains("exynos") ||
            soc.contains("tensor") ||
            soc.contains("kirin") ||
            hasMaliKbaseKernel()
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
        val hardware = Build.HARDWARE.orEmpty().lowercase()
        val board = Build.BOARD.orEmpty().lowercase()

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

    fun classifyMaliArchFamily(gpuModelText: String?): MaliArchFamily {
        val text = gpuModelText.orEmpty().trim().lowercase()
        if (text.isBlank()) return MaliArchFamily.NON_MALI
        if (text.contains("adreno") || text.contains("xclipse") || text.contains("powervr") ||
            text.contains("rogue") || text.contains("maleoon") || text.contains("nvidia") ||
            text.contains("tegra") || text.contains("swiftshader")
        ) {
            return MaliArchFamily.NON_MALI
        }

        val tokens = MALI_MODEL_REGEX.findAll(text).mapNotNull { it.groupValues.getOrNull(1) }.toList()
        for (token in tokens) {
            when (token) {
                "g31", "g51", "g52", "g76" -> return MaliArchFamily.V7_BIFROST
                "g57", "g68", "g77", "g78", "g78ae" -> return MaliArchFamily.V9_VALHALL
                "g310", "g510", "g610", "g710" -> return MaliArchFamily.V10_VALHALL
                "g615", "g715" -> return MaliArchFamily.V11_VALHALL
                "g620", "g720" -> return MaliArchFamily.V12_FIFTH_GEN
                "g71", "g72" -> return MaliArchFamily.UNSUPPORTED_MIDGARD_OR_V6
                "g925" -> return MaliArchFamily.UNSUPPORTED_V13_PLUS
            }
            if (token.startsWith("t") && token.drop(1).all { it.isDigit() }) {
                return MaliArchFamily.UNSUPPORTED_MIDGARD_OR_V6
            }
        }

        if (text.contains("mali") || text.contains("immortalis")) {
            return MaliArchFamily.UNKNOWN_MALI
        }
        return MaliArchFamily.NON_MALI
    }

    fun getMaliArchFamily(): MaliArchFamily {
        if (getGpuVendorFamily() != GpuVendorFamily.ARM_MALI) {
            return MaliArchFamily.NON_MALI
        }
        val vkDevice = getVulkanHardwareInfo()?.deviceName.orEmpty()
        val sysfs = readSysfsGpuModel()
        val classified = classifyMaliArchFamily("$vkDevice $sysfs")
        return if (classified != MaliArchFamily.NON_MALI) {
            classified
        } else {
            MaliArchFamily.UNKNOWN_MALI
        }
    }

    fun isMalisx2Supported(
        maliArch: MaliArchFamily = getMaliArchFamily(),
        sdkInt: Int = Build.VERSION.SDK_INT,
        is64BitProcess: Boolean = is64BitArmProcess(),
        hasKbaseKernel: Boolean = hasMaliKbaseKernel(),
    ): Boolean {
        return maliArch.isSupportedByMalisx2() &&
            sdkInt >= Build.VERSION_CODES.Q &&
            is64BitProcess &&
            hasKbaseKernel
    }

    private fun is64BitArmProcess(): Boolean {
        val is64 = runCatching { Process.is64Bit() }.getOrDefault(false)
        return is64 &&
            Build.SUPPORTED_64_BIT_ABIS.orEmpty().any { it.equals("arm64-v8a", ignoreCase = true) }
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

    fun isAdrenoTurnipCapable(subFamily: AdrenoSubFamily = getSubFamily()): Boolean {
        return subFamily != AdrenoSubFamily.NON_ADRENO &&
            subFamily != AdrenoSubFamily.ADRENO_LEGACY_OR_UNKNOWN
    }

    fun hasPanfrostOrPanthorKernel(): Boolean {
        if (File("/dev/panfrost").exists() ||
            File("/dev/panthor").exists() ||
            File("/sys/module/panfrost").exists() ||
            File("/sys/module/panthor").exists()
        ) {
            return true
        }
        val drmDrivers = runCatching {
            File("/sys/class/drm")
                .listFiles()
                ?.mapNotNull { entry ->
                    runCatching { File(entry, "device/driver").canonicalFile.name.lowercase() }.getOrNull()
                }
                .orEmpty()
        }.getOrDefault(emptyList())
        return drmDrivers.any { it.contains("panfrost") || it.contains("panthor") }
    }

    fun getGpuVendorFamily(): GpuVendorFamily {
        if (isAdrenoDevice()) {
            return GpuVendorFamily.ADRENO
        }
        val hwInfo = getVulkanHardwareInfo()
        when (hwInfo?.vendorId) {
            VENDOR_ID_ARM_MALI -> return GpuVendorFamily.ARM_MALI
            VENDOR_ID_AMD_XCLIPSE -> return GpuVendorFamily.SAMSUNG_XCLIPSE
            VENDOR_ID_POWERVR -> return GpuVendorFamily.POWERVR
        }
        val vkName = hwInfo?.deviceName.orEmpty().lowercase()
        val sysfs = readSysfsGpuModel().lowercase()
        val soc = readSocModel().lowercase()
        val hardware = Build.HARDWARE.orEmpty().lowercase()
        val combined = "$vkName $sysfs $soc $hardware"
        return when {
            combined.contains("xclipse") || (hwInfo?.vendorId == null && (combined.contains("s5e") || combined.contains("exynos"))) ->
                GpuVendorFamily.SAMSUNG_XCLIPSE
            combined.contains("powervr") || combined.contains("rogue") || combined.contains("b-series") ->
                GpuVendorFamily.POWERVR
            combined.contains("mali") || combined.contains("immortalis") || hardware.startsWith("mt") ||
                soc.startsWith("mt") || combined.contains("dimensity") || hasMaliKbaseKernel() ->
                GpuVendorFamily.ARM_MALI
            else -> GpuVendorFamily.OTHER
        }
    }

    fun isDriverLikelyAdrenoTurnipPackage(
        driverName: String,
        description: String? = null,
        version: String? = null,
        sourceRepo: String? = null,
    ): Boolean {
        val combined = listOfNotNull(driverName, description, version, sourceRepo).joinToString(" ").lowercase()
        return combined.contains("turnip") ||
            combined.contains("freedreno") ||
            combined.contains("adreno") ||
            combined.contains("kimchi") ||
            combined.contains("storm_driver") ||
            combined.contains("storm driver") ||
            combined.contains("mrpurple") ||
            combined.contains("purple") ||
            combined.contains("weab") ||
            combined.contains("whitebelyash") ||
            combined.contains("gamehub") ||
            combined.contains("crueter") ||
            combined.contains("vauzi") ||
            combined.contains("balemuni") ||
            combined.contains("gen8") ||
            combined.contains("a7xx") ||
            combined.contains("a6xx")
    }

    fun isDriverLikelyMalisx2Package(
        driverName: String,
        description: String? = null,
        version: String? = null,
        sourceRepo: String? = null,
    ): Boolean {
        val combined = listOfNotNull(driverName, description, version, sourceRepo).joinToString(" ").lowercase()
        return combined.contains("malisx2") ||
            combined.contains("panvk") ||
            combined.contains("panfrost") ||
            combined.contains("panthor") ||
            combined.contains("libvulkan_panfrost")
    }

    fun isDriverCompatibleWithCurrentGpu(
        driverName: String,
        description: String? = null,
        version: String? = null,
        sourceRepo: String? = null,
        subFamily: AdrenoSubFamily = getSubFamily(),
        vendorFamily: GpuVendorFamily = getGpuVendorFamily(),
        maliArch: MaliArchFamily = getMaliArchFamily(),
        malisx2Supported: Boolean = isMalisx2Supported(maliArch = maliArch),
    ): Boolean {
        val combined = listOfNotNull(driverName, description, version, sourceRepo).joinToString(" ").lowercase()
        val isAdrenoPkg = isDriverLikelyAdrenoTurnipPackage(driverName, description, version, sourceRepo)
        val isPanvkOrMalisx2Pkg = isDriverLikelyMalisx2Package(driverName, description, version, sourceRepo)

        if (isAdrenoTurnipCapable(subFamily)) {
            if (isPanvkOrMalisx2Pkg || combined.contains("mali") || combined.contains("xclipse") || combined.contains("powervr")) {
                return false
            }
            if (subFamily == AdrenoSubFamily.ADRENO_840_PLUS || subFamily == AdrenoSubFamily.ADRENO_8XX_ELITE) {
                if (sourceRepo in setOf("storm_driver", "crueter_8elite")) {
                    return true
                }
                return !isDriverPotentiallyIncompatibleWithAdreno8xx(
                    driverName = driverName,
                    description = description,
                    version = version,
                    subFamily = subFamily,
                )
            }
            return true
        }

        if (isAdrenoPkg) {
            return false
        }
        if (vendorFamily == GpuVendorFamily.ARM_MALI) {
            if (isPanvkOrMalisx2Pkg) {
                return malisx2Supported && maliArch.isSupportedByMalisx2()
            }
            return combined.contains("mali") || (!combined.contains("xclipse") && !combined.contains("powervr"))
        }
        if (isPanvkOrMalisx2Pkg || combined.contains("mali")) {
            return false
        }
        return true
    }

    fun isDriverPotentiallyIncompatibleWithAdreno8xx(
        driverName: String,
        description: String? = null,
        version: String? = null,
        subFamily: AdrenoSubFamily = getSubFamily(),
    ): Boolean {
        if (subFamily != AdrenoSubFamily.ADRENO_8XX_ELITE && subFamily != AdrenoSubFamily.ADRENO_840_PLUS) {
            return false
        }
        val combined = listOfNotNull(driverName, description, version).joinToString(" ").lowercase()

        if (subFamily == AdrenoSubFamily.ADRENO_840_PLUS) {
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
        val soc = readSocModel().takeIf { it.isNotBlank() } ?: Build.HARDWARE.orEmpty()
        if (bestName.isNotBlank()) {
            return if (soc.isNotBlank() && !bestName.contains(soc, ignoreCase = true)) {
                "$bestName ($soc)"
            } else {
                bestName
            }
        }
        if (Build.HARDWARE.orEmpty().contains("qcom", ignoreCase = true) || isAdrenoDevice()) {
            return "Qualcomm Adreno ($soc)"
        }
        val board = Build.BOARD.orEmpty()
        return if (board.isNotBlank()) "$soc ($board)" else soc
    }
}
