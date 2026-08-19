package me.magnum.melonds.impl

import android.content.Context
import android.os.Build
import me.magnum.melonds.R
import java.io.File

object AdrenoVulkanDriverSupport {
    fun isSupported(context: Context): Boolean {
        return context.resources.getBoolean(R.bool.adrenotools_enabled) &&
            Build.VERSION.SDK_INT >= Build.VERSION_CODES.P &&
            Build.SUPPORTED_64_BIT_ABIS.any { it.equals("arm64-v8a", ignoreCase = true) } &&
            isAdrenoDevice()
    }

    fun isAdrenoDevice(): Boolean {
        if (readGpuModel().contains("adreno", ignoreCase = true)) {
            return true
        }

        if (File("/sys/class/kgsl/kgsl-3d0").exists()) {
            return true
        }

        return Build.HARDWARE.equals("qcom", ignoreCase = true)
    }

    private fun readGpuModel(): String {
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
        }.orEmpty()
    }
    enum class GpuSeries(val displayName: String) {
        ADRENO_8XX("Adreno 8xx (Snapdragon 8 Elite / Gen 4)"),
        ADRENO_7XX("Adreno 7xx (Snapdragon 8 Gen 1/2/3, 7+ Gen 2)"),
        ADRENO_6XX("Adreno 6xx (Snapdragon 865/870/888, 778G)"),
        ADRENO_OTHER("Qualcomm Adreno (Legacy/Other)"),
        NON_ADRENO("Не-Adreno GPU")
    }

    fun getGpuSeries(): GpuSeries {
        val model = readGpuModel().lowercase()
        return when {
            model.contains("830") || model.contains("adreno 8") || model.contains("adreno8") -> GpuSeries.ADRENO_8XX
            model.contains("750") || model.contains("740") || model.contains("730") || model.contains("725") ||
                model.contains("720") || model.contains("710") || model.contains("702") ||
                model.contains("adreno 7") || model.contains("adreno7") -> GpuSeries.ADRENO_7XX
            model.contains("690") || model.contains("680") || model.contains("660") || model.contains("650") ||
                model.contains("642") || model.contains("640") || model.contains("630") || model.contains("620") ||
                model.contains("619") || model.contains("618") || model.contains("616") || model.contains("615") ||
                model.contains("612") || model.contains("610") || model.contains("adreno 6") || model.contains("adreno6") -> GpuSeries.ADRENO_6XX
            isAdrenoDevice() -> GpuSeries.ADRENO_7XX // default modern Qualcomm Adreno
            else -> GpuSeries.NON_ADRENO
        }
    }

    fun getDeviceGpuDescription(): String {
        val model = readGpuModel()
        if (model.isNotBlank()) return model.trim()
        val soc = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            Build.SOC_MODEL.takeIf { !it.isNullOrBlank() } ?: Build.HARDWARE
        } else {
            Build.HARDWARE
        }
        if (Build.HARDWARE.contains("qcom", ignoreCase = true) || isAdrenoDevice()) {
            return "Qualcomm Adreno ($soc)"
        }
        return "GPU: $soc (${Build.BOARD})"
    }
}
