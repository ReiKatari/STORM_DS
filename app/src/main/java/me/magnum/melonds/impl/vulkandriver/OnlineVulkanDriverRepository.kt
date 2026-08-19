package me.magnum.melonds.impl.vulkandriver

import me.magnum.melonds.impl.AdrenoVulkanDriverSupport
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class OnlineVulkanDriverRepository @Inject constructor() {

    private val allDrivers = listOf(
        OnlineVulkanDriver(
            id = "turnip-mesa-24-3-0-r20",
            name = "Turnip Mesa v24.3.0 (Revision 20)",
            version = "24.3.0-r20",
            releaseDate = "2024-11-15",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_6XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_8XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "Последний релиз Turnip Mesa с поддержкой расширений Vulkan 1.3, оптимизированной компиляцией шейдеров и максимальной производительностью в 3D эмуляции.",
            downloadUrl = "https://github.com/K11MCH1/AdrenoToolsDrivers/releases/download/v24.3.0-r20/turnip_mesa_v24.3.0-r20.zip",
            fileSizeMb = 4.8,
            isRecommended = true
        ),
        OnlineVulkanDriver(
            id = "qualcomm-v762-0",
            name = "Qualcomm Adreno Driver v762.0",
            version = "v762.0",
            releaseDate = "2024-10-05",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_8XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "Официальный проприетарный драйвер Qualcomm с оптимизацией для новейших процессоров Snapdragon 8 Gen 3 и Snapdragon 8 Elite.",
            downloadUrl = "https://github.com/K11MCH1/AdrenoToolsDrivers/releases/download/v762.0/qualcomm_v762.0.zip",
            fileSizeMb = 3.9,
            isRecommended = false
        ),
        OnlineVulkanDriver(
            id = "turnip-mesa-24-2-0-r19",
            name = "Turnip Mesa v24.2.0 (Revision 19)",
            version = "24.2.0-r19",
            releaseDate = "2024-09-28",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_6XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "Стабильная ветка Mesa 24.2 с исправлением графических аномалий на чипсетах Snapdragon 8 Gen 1/2.",
            downloadUrl = "https://github.com/K11MCH1/AdrenoToolsDrivers/releases/download/v24.2.0-r19/turnip_mesa_v24.2.0-r19.zip",
            fileSizeMb = 4.5,
            isRecommended = false
        ),
        OnlineVulkanDriver(
            id = "turnip-mesa-24-1-0-r18",
            name = "Turnip Mesa v24.1.0 (Revision 18)",
            version = "24.1.0-r18",
            releaseDate = "2024-07-10",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_6XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "Проверенная стабильная сборка Turnip с высокой энергоэффективностью для чипсетов Adreno 6xx (Snapdragon 865/870/888).",
            downloadUrl = "https://github.com/K11MCH1/AdrenoToolsDrivers/releases/download/v24.1.0-r18/turnip_mesa_v24.1.0-r18.zip",
            fileSizeMb = 4.3,
            isRecommended = false
        ),
        OnlineVulkanDriver(
            id = "qualcomm-v744-19",
            name = "Qualcomm Adreno Driver v744.19",
            version = "v744.19",
            releaseDate = "2024-06-12",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "Проприетарный драйвер для Snapdragon 8+ Gen 1 с пониженным тепловыделением.",
            downloadUrl = "https://github.com/K11MCH1/AdrenoToolsDrivers/releases/download/v744.19/qualcomm_v744.19.zip",
            fileSizeMb = 3.7,
            isRecommended = false
        ),
        OnlineVulkanDriver(
            id = "qualcomm-v615-77",
            name = "Qualcomm Adreno Driver v615.77",
            version = "v615.77",
            releaseDate = "2024-03-20",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_6XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "OEM-ревизия драйвера Qualcomm для Adreno 6xx (Snapdragon 865, 870, 778G).",
            downloadUrl = "https://github.com/K11MCH1/AdrenoToolsDrivers/releases/download/v615.77/qualcomm_v615.77.zip",
            fileSizeMb = 3.2,
            isRecommended = false
        )
    )

    fun getDriversForGpu(gpuSeries: AdrenoVulkanDriverSupport.GpuSeries): List<OnlineVulkanDriver> {
        return allDrivers
            .filter { it.supportedGpuSeries.contains(gpuSeries) || it.supportedGpuSeries.contains(AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER) }
            .sortedByDescending { it.releaseDate }
    }

    fun getRecommendedDriver(gpuSeries: AdrenoVulkanDriverSupport.GpuSeries): OnlineVulkanDriver? {
        val compatible = getDriversForGpu(gpuSeries)
        return when (gpuSeries) {
            AdrenoVulkanDriverSupport.GpuSeries.ADRENO_8XX -> {
                compatible.firstOrNull { it.id == "qualcomm-v762-0" } ?: compatible.firstOrNull()
            }
            else -> {
                compatible.firstOrNull { it.id == "turnip-mesa-24-3-0-r20" } ?: compatible.firstOrNull()
            }
        }
    }

    fun checkForNewerDriver(
        currentInstalledDriverDisplayName: String?,
        gpuSeries: AdrenoVulkanDriverSupport.GpuSeries
    ): OnlineVulkanDriver? {
        val recommended = getRecommendedDriver(gpuSeries) ?: return null
        if (currentInstalledDriverDisplayName == null) {
            // User is on system driver -> recommended is an upgrade
            return recommended
        }
        if (!currentInstalledDriverDisplayName.contains(recommended.version, ignoreCase = true)) {
            return recommended
        }
        return null
    }
}
