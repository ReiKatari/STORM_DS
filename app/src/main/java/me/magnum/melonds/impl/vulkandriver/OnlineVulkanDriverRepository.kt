package me.magnum.melonds.impl.vulkandriver

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import me.magnum.melonds.impl.AdrenoVulkanDriverSupport
import org.json.JSONArray
import java.net.HttpURLConnection
import java.net.URL
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class OnlineVulkanDriverRepository @Inject constructor() {

    companion object {
        const val REMOTE_CATALOG_URL = "https://raw.githubusercontent.com/K11MCH1/AdrenoToolsDrivers/main/drivers_catalog_v2.json"
    }

    private val staticDrivers = listOf(
        // --- 2026 RELEASES: The412Banner, whitebelyash, Qualcomm Adreno, Upstream Turnip ---

        OnlineVulkanDriver(
            id = "turnip-banner-26-3-0-r17",
            name = "Turnip Mesa (The412Banner Build v26.3.0 R17 — 18.08.2026)",
            version = "26.3.0-r17-Banner",
            releaseDate = "2026-08-18",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_8XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_6XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "👑 Новейшая сборка от The412Banner (18 августа 2026) на базе Mesa 26.3 с поддержкой Vulkan 1.4, расширенными лимитами дескрипторов и нулевым инпут-лагом для Adreno 6xx/7xx/8xx.",
            downloadUrl = "https://github.com/The412Banner/Banners-Turnip/releases/download/v26.3.0-20260818-r17/Turnip-v26.3.0-20260818-r17.zip",
            fileSizeMb = 2.55,
            isRecommended = true
        ),
        OnlineVulkanDriver(
            id = "turnip-banner-26-3-0-r17-a8xx",
            name = "Turnip Mesa (The412Banner v26.3.0 R17 for Adreno 8xx / Snapdragon 8 Elite)",
            version = "26.3.0-r17-A8xx",
            releaseDate = "2026-08-18",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_8XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "⚡ Специализированная сборка The412Banner для новейших GPU Adreno 830 / 840 (Snapdragon 8 Elite / 8 Gen 4) с максимальным FPS.",
            downloadUrl = "https://github.com/The412Banner/Banners-Turnip/releases/download/v26.3.0-20260818-r17/Turnip-v26.3.0-20260818-r17-A8xx.zip",
            fileSizeMb = 2.55,
            isRecommended = true
        ),
        OnlineVulkanDriver(
            id = "turnip-whitebelyash-v31",
            name = "Turnip Mesa (whitebelyash Build v31 / Mainline — 17.08.2026)",
            version = "v31-wb",
            releaseDate = "2026-08-17",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_8XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_6XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "⚡ Экстремально оптимизированная сборка от whitebelyash (17 августа 2026) с тонкой настройкой кэширования пайплайнов и увеличенным FPS.",
            downloadUrl = "https://github.com/whitebelyash/AdrenoToolsDrivers/releases/download/tu_v31/mainline-turnip-V31.zip",
            fileSizeMb = 2.55,
            isRecommended = true
        ),
        OnlineVulkanDriver(
            id = "turnip-whitebelyash-v31-sync",
            name = "Turnip Mesa (whitebelyash Build v31 Sync — 17.08.2026)",
            version = "v31-sync-wb",
            releaseDate = "2026-08-17",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_8XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_6XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "Сборка от whitebelyash с синхронизацией командного буфера GPU для стабильной частоты кадров без разрывов.",
            downloadUrl = "https://github.com/whitebelyash/AdrenoToolsDrivers/releases/download/tu_v31/mainline-turnip-sync-V31.zip",
            fileSizeMb = 2.55,
            isRecommended = false
        ),
        OnlineVulkanDriver(
            id = "turnip-whitebelyash-v30",
            name = "Turnip Mesa (whitebelyash Build v30 — 10.08.2026)",
            version = "v30-wb",
            releaseDate = "2026-08-10",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_6XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_8XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "Сборка от whitebelyash с оптимизацией тайлинга текстур и консервативной растеризации.",
            downloadUrl = "https://github.com/whitebelyash/AdrenoToolsDrivers/releases/download/tu_v30/mainline-turnip-V30.zip",
            fileSizeMb = 2.55,
            isRecommended = false
        ),
        OnlineVulkanDriver(
            id = "qualcomm-v849",
            name = "Qualcomm Adreno Driver v849 (Июль 2026)",
            version = "v849",
            releaseDate = "2026-07-25",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_8XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "Официальный проприетарный пакет Qualcomm (Июль 2026) с нативной поддержкой Vulkan 1.3/1.4 и Snapdragon 8 Elite / 8 Gen 3.",
            downloadUrl = "https://github.com/K11MCH1/AdrenoToolsDrivers/releases/download/v849/Qualcomm_849_adpkg.zip",
            fileSizeMb = 22.58,
            isRecommended = true
        ),
        OnlineVulkanDriver(
            id = "qualcomm-v842-6",
            name = "Qualcomm Adreno Driver v842.6 (Июнь 2026)",
            version = "v842.6",
            releaseDate = "2026-06-20",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_8XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "Официальный драйвер Qualcomm для чипсетов Snapdragon 8 Gen 2 / 8 Gen 3 / 8 Elite.",
            downloadUrl = "https://github.com/K11MCH1/AdrenoToolsDrivers/releases/download/v842.6/8Elite2-842.6.zip",
            fileSizeMb = 23.4,
            isRecommended = false
        ),
        OnlineVulkanDriver(
            id = "turnip-v26-0-0-rc6-gmem",
            name = "Turnip Mesa v26.0.0 RC6 (GMEM — Май 2026)",
            version = "v26.0.0-rc06-gmem",
            releaseDate = "2026-05-15",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_6XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_8XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "Сборка Turnip Mesa с оптимизацией скоростной локальной памяти GMEM для Adreno 6xx/7xx.",
            downloadUrl = "https://github.com/K11MCH1/AdrenoToolsDrivers/releases/download/v26.0.0-rc06/Turnip_v26.0.0_R6_Gmem.zip",
            fileSizeMb = 3.38,
            isRecommended = false
        ),
        OnlineVulkanDriver(
            id = "turnip-v26-0-0-rc6-sysmem",
            name = "Turnip Mesa v26.0.0 RC6 (Sysmem — Май 2026)",
            version = "v26.0.0-rc06-sysmem",
            releaseDate = "2026-05-15",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_6XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_8XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "Сборка Turnip Mesa с прямой адресацией системной памяти Sysmem для максимальной стабильности.",
            downloadUrl = "https://github.com/K11MCH1/AdrenoToolsDrivers/releases/download/v26.0.0-rc06/Turnip_v26.0.0_R6_Sysmem.zip",
            fileSizeMb = 3.38,
            isRecommended = false
        ),
        OnlineVulkanDriver(
            id = "turnip-v26-0-0-rc5",
            name = "Turnip Mesa v26.0.0 RC5 (Апрель 2026)",
            version = "v26.0.0-rc05",
            releaseDate = "2026-04-10",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_6XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "Стабильный релиз Turnip Mesa с поддержкой динамического рендеринга и исправлением артефактов текстур.",
            downloadUrl = "https://github.com/K11MCH1/AdrenoToolsDrivers/releases/download/v26.0.0-rc05/Turnip_v26.0.0_R5.zip",
            fileSizeMb = 3.35,
            isRecommended = false
        ),
        OnlineVulkanDriver(
            id = "turnip-v25-3-0-rc11",
            name = "Turnip Mesa v25.3.0 R11 (Февраль 2026)",
            version = "v25.3.0-rc11",
            releaseDate = "2026-02-18",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_6XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "Популярный релиз Turnip Mesa с оптимизацией тепловыделения на Snapdragon 8 Gen 1/2/3.",
            downloadUrl = "https://github.com/K11MCH1/AdrenoToolsDrivers/releases/download/v25.3.0-rc.11/Turnip_v25.3.0_R11.zip",
            fileSizeMb = 3.30,
            isRecommended = false
        ),
        OnlineVulkanDriver(
            id = "qualcomm-v819-2",
            name = "Qualcomm Adreno Driver v819.2 (Январь 2026)",
            version = "v819.2",
            releaseDate = "2026-01-20",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_8XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_6XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "Проприетарный пакет Qualcomm для стабильной работы на Adreno 6xx/7xx/8xx.",
            downloadUrl = "https://github.com/K11MCH1/AdrenoToolsDrivers/releases/download/v819.2/Qualcomm_819.2_adpkg.zip",
            fileSizeMb = 21.8,
            isRecommended = false
        )
    )

    private var cachedRemoteDrivers: List<OnlineVulkanDriver>? = null

    suspend fun refreshCatalog(): List<OnlineVulkanDriver> = withContext(Dispatchers.IO) {
        try {
            val url = URL(REMOTE_CATALOG_URL)
            val connection = url.openConnection() as HttpURLConnection
            connection.connectTimeout = 8000
            connection.readTimeout = 10000
            connection.connect()

            if (connection.responseCode in 200..299) {
                val jsonText = connection.inputStream.bufferedReader().use { it.readText() }
                val parsed = parseDriversJson(jsonText)
                if (parsed.isNotEmpty()) {
                    cachedRemoteDrivers = parsed
                    return@withContext parsed
                }
            }
        } catch (_: Throwable) {}

        staticDrivers
    }

    private fun parseDriversJson(jsonText: String): List<OnlineVulkanDriver> {
        val list = mutableListOf<OnlineVulkanDriver>()
        val jsonArray = JSONArray(jsonText)
        for (i in 0 until jsonArray.length()) {
            val obj = jsonArray.getJSONObject(i)
            val id = obj.getString("id")
            val name = obj.getString("name")
            val version = obj.getString("version")
            val releaseDate = obj.getString("releaseDate")
            val description = obj.optString("description", "")
            val downloadUrl = obj.getString("downloadUrl")
            val fileSizeMb = obj.optDouble("fileSizeMb", 4.5)
            val isRecommended = obj.optBoolean("isRecommended", false)

            val seriesArray = obj.optJSONArray("supportedGpuSeries")
            val supportedSeries = mutableSetOf<AdrenoVulkanDriverSupport.GpuSeries>()
            if (seriesArray != null) {
                for (j in 0 until seriesArray.length()) {
                    val sName = seriesArray.getString(j)
                    val match = AdrenoVulkanDriverSupport.GpuSeries.entries.find { it.name.equals(sName, ignoreCase = true) }
                    if (match != null) supportedSeries.add(match)
                }
            }
            if (supportedSeries.isEmpty()) {
                supportedSeries.add(AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER)
            }

            list.add(
                OnlineVulkanDriver(
                    id = id,
                    name = name,
                    version = version,
                    releaseDate = releaseDate,
                    supportedGpuSeries = supportedSeries,
                    description = description,
                    downloadUrl = downloadUrl,
                    fileSizeMb = fileSizeMb,
                    isRecommended = isRecommended
                )
            )
        }
        return list
    }

    fun getDriversForGpu(gpuSeries: AdrenoVulkanDriverSupport.GpuSeries): List<OnlineVulkanDriver> {
        val source = cachedRemoteDrivers ?: staticDrivers
        return source
            .filter { it.supportedGpuSeries.contains(gpuSeries) || it.supportedGpuSeries.contains(AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER) }
            .sortedByDescending { it.releaseDate }
    }

    fun getRecommendedDriver(gpuSeries: AdrenoVulkanDriverSupport.GpuSeries): OnlineVulkanDriver? {
        val compatible = getDriversForGpu(gpuSeries)
        return when (gpuSeries) {
            AdrenoVulkanDriverSupport.GpuSeries.ADRENO_8XX -> {
                compatible.firstOrNull { it.id == "qualcomm-v830-0" || it.id == "turnip-mrpurple-26-3-0-t30" || it.id == "turnip-whitebelyash-26-3-0-v14359" } ?: compatible.firstOrNull()
            }
            else -> {
                compatible.firstOrNull { it.id == "turnip-mrpurple-26-3-0-t30" }
                    ?: compatible.firstOrNull { it.id == "turnip-whitebelyash-26-3-0-v14359" }
                    ?: compatible.firstOrNull { it.id == "turnip-mrpurple-26-2-0-r28" }
                    ?: compatible.firstOrNull()
            }
        }
    }

    fun checkForNewerDriver(
        currentInstalledDriverDisplayName: String?,
        gpuSeries: AdrenoVulkanDriverSupport.GpuSeries
    ): OnlineVulkanDriver? {
        val recommended = getRecommendedDriver(gpuSeries) ?: return null
        if (currentInstalledDriverDisplayName == null) {
            return recommended
        }
        if (!currentInstalledDriverDisplayName.contains(recommended.version, ignoreCase = true)) {
            return recommended
        }
        return null
    }
}
