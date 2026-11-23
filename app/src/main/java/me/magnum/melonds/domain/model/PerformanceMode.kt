package me.magnum.melonds.domain.model

enum class PerformanceMode(val prefValue: String) {
    AUTO("auto"),
    STANDARD("standard"),
    LITE("lite");

    companion object {
        fun fromPrefValue(value: String?): PerformanceMode {
            return when (value?.trim()?.lowercase()) {
                STANDARD.prefValue -> STANDARD
                LITE.prefValue -> LITE
                else -> AUTO
            }
        }
    }
}

enum class LiteRecommendationReason {
    NONE,
    ABI_32_BIT_NO_JIT,
    LEGACY_GPU_POWERVR,
    LEGACY_GPU_MALI_MIDGARD,
    LEGACY_GPU_ADRENO,
    GLES_BELOW_32,
    LOW_END_SOC,
    WEAK_CPU_ALL_LITTLE,
    LOW_RAM_LEGACY_DEVICE,
}

data class DevicePerformanceProfile(
    val recommendsLiteMode: Boolean,
    val reasonCode: LiteRecommendationReason,
    val cpuSummary: String,
    val gpuSummary: String,
    val is64Bit: Boolean,
    val totalRamMb: Long,
    val glEsVersionMajor: Int,
    val glEsVersionMinor: Int,
    val cpuCoreCount: Int,
    val recommendedSoftThreaded: Boolean,
)
