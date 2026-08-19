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
        // --- 2026 RELEASES: MrPurple, whitebelyash, Upstream Turnip & Qualcomm ---

        OnlineVulkanDriver(
            id = "turnip-mrpurple-26-3-0-t30",
            name = "Turnip Mesa (MrPurple Build v26.3.0-devel T-30 / Vulkan 1.4.359)",
            version = "26.3.0-devel-T30",
            releaseDate = "2026-08-18",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_8XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_6XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "👑 Новейшая сборка от MrPurple (18 августа 2026) на базе Mesa 26.3-devel с полной поддержкой спецификаций Vulkan 1.4.359, оптимизацией конвейеров и увеличенными лимитами дескрипторов для Adreno 6xx/7xx/8xx.",
            downloadUrl = "https://github.com/MrPurple666/Turnip-Drivers/releases/download/v26.3.0-devel-T30/turnip_mesa_v26.3.0-devel_T30_mrpurple.zip",
            fileSizeMb = 5.4,
            isRecommended = true
        ),
        OnlineVulkanDriver(
            id = "turnip-whitebelyash-26-3-0-v14359",
            name = "Turnip Mesa (whitebelyash Build v26.3.0-devel / Vulkan 1.4.359)",
            version = "26.3.0-devel-wb",
            releaseDate = "2026-08-17",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_8XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_6XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "⚡ Экстремально оптимизированная сборка от whitebelyash (17 августа 2026) с тонкой настройкой кэширования пайплайнов, низким инпут-лагом и увеличенным FPS на Snapdragon 8 Gen 1/2/3/Elite.",
            downloadUrl = "https://github.com/whitebelyash/Turnip-Drivers/releases/download/v26.3.0-devel/turnip_mesa_v26.3.0-devel_whitebelyash.zip",
            fileSizeMb = 5.3,
            isRecommended = true
        ),
        OnlineVulkanDriver(
            id = "turnip-mrpurple-26-2-0-r28",
            name = "Turnip Mesa (MrPurple Build v26.2.0-r28 — Август 2026)",
            version = "26.2.0-r28-MrP",
            releaseDate = "2026-08-16",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_8XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_6XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "Оптимизированная ревизия от MrPurple с агрессивным шейдерным компилятором и стабильными 60 FPS в 3D.",
            downloadUrl = "https://github.com/MrPurple666/Turnip-Drivers/releases/download/v26.2.0-r28/turnip_mesa_v26.2.0-r28_mrpurple.zip",
            fileSizeMb = 5.3,
            isRecommended = false
        ),
        OnlineVulkanDriver(
            id = "turnip-mesa-26-2-0-r28",
            name = "Turnip Mesa v26.2.0 (Revision 28 — Август 2026)",
            version = "26.2.0-r28",
            releaseDate = "2026-08-12",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_8XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_6XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "Официальный апстрим-релиз Turnip Mesa (Август 2026) с поддержкой Vulkan 1.3/1.4 и dynamic rendering.",
            downloadUrl = "https://github.com/K11MCH1/AdrenoToolsDrivers/releases/download/v26.2.0-r28/turnip_mesa_v26.2.0-r28.zip",
            fileSizeMb = 5.2,
            isRecommended = false
        ),
        OnlineVulkanDriver(
            id = "turnip-whitebelyash-26-2-0",
            name = "Turnip Mesa (whitebelyash Build v26.2.0 — Август 2026)",
            version = "26.2.0-wb",
            releaseDate = "2026-08-10",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_6XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_8XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "Сборка от whitebelyash с исправлением тайлинга текстур и консервативной растеризации.",
            downloadUrl = "https://github.com/whitebelyash/Turnip-Drivers/releases/download/v26.2.0/turnip_mesa_v26.2.0_whitebelyash.zip",
            fileSizeMb = 5.1,
            isRecommended = false
        ),
        OnlineVulkanDriver(
            id = "qualcomm-v830-0",
            name = "Qualcomm Adreno Driver v830.0 (Июль 2026)",
            version = "v830.0",
            releaseDate = "2026-07-28",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_8XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "Официальный проприетарный драйвер Qualcomm 2026 года с нативной оптимизацией под Snapdragon 8 Elite / 8 Gen 4 и Adreno 830/840.",
            downloadUrl = "https://github.com/K11MCH1/AdrenoToolsDrivers/releases/download/v830.0/qualcomm_v830.0.zip",
            fileSizeMb = 4.4,
            isRecommended = true
        ),
        OnlineVulkanDriver(
            id = "turnip-mrpurple-26-1-0-r26",
            name = "Turnip Mesa (MrPurple Build v26.1.0-r26 — Июнь 2026)",
            version = "26.1.0-r26-MrP",
            releaseDate = "2026-06-25",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_6XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_8XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "Сборка MrPurple с кастомными оптимизациями буферов команд и сниженным энергопотреблением в тяжелых 3D играх.",
            downloadUrl = "https://github.com/MrPurple666/Turnip-Drivers/releases/download/v26.1.0-r26/turnip_mesa_v26.1.0-r26_mrpurple.zip",
            fileSizeMb = 5.1,
            isRecommended = false
        ),
        OnlineVulkanDriver(
            id = "turnip-whitebelyash-26-1-0",
            name = "Turnip Mesa (whitebelyash Build v26.1.0 — Июнь 2026)",
            version = "26.1.0-wb",
            releaseDate = "2026-06-18",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_6XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_8XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "Июньский релиз whitebelyash для стабильной эмуляции 3D слоев.",
            downloadUrl = "https://github.com/whitebelyash/Turnip-Drivers/releases/download/v26.1.0/turnip_mesa_v26.1.0_whitebelyash.zip",
            fileSizeMb = 5.0,
            isRecommended = false
        ),
        OnlineVulkanDriver(
            id = "turnip-mrpurple-25-3-0-r24",
            name = "Turnip Mesa (MrPurple Build v25.3.0-r24 — Март 2026)",
            version = "25.3.0-r24-MrP",
            releaseDate = "2026-03-20",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_6XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "Популярная сборка MrPurple с минимальным тепловыделением и оптимизацией памяти для Snapdragon 8 Gen 1/2/3.",
            downloadUrl = "https://github.com/MrPurple666/Turnip-Drivers/releases/download/v25.3.0-r24/turnip_mesa_v25.3.0-r24_mrpurple.zip",
            fileSizeMb = 5.0,
            isRecommended = false
        ),
        OnlineVulkanDriver(
            id = "qualcomm-v790-10",
            name = "Qualcomm Adreno Driver v790.10 (Январь 2026)",
            version = "v790.10",
            releaseDate = "2026-01-18",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_8XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "Зимний релиз официального драйвера Qualcomm с оптимизацией энергопотребления на флагманских чипсетах.",
            downloadUrl = "https://github.com/K11MCH1/AdrenoToolsDrivers/releases/download/v790.10/qualcomm_v790.10.zip",
            fileSizeMb = 4.1,
            isRecommended = false
        ),
        OnlineVulkanDriver(
            id = "turnip-mrpurple-24-3-0-r20",
            name = "Turnip Mesa (MrPurple Build v24.3.0-r20)",
            version = "24.3.0-r20-MrP",
            releaseDate = "2024-11-20",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_6XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "Проверенный временем драйвер Turnip от MrPurple.",
            downloadUrl = "https://github.com/MrPurple666/Turnip-Drivers/releases/download/v24.3.0-r20/turnip_mesa_v24.3.0-r20_mrpurple.zip",
            fileSizeMb = 4.9,
            isRecommended = false
        ),
        OnlineVulkanDriver(
            id = "turnip-mesa-24-3-0-r20",
            name = "Turnip Mesa v24.3.0 (Revision 20)",
            version = "24.3.0-r20",
            releaseDate = "2024-11-15",
            supportedGpuSeries = setOf(
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_7XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_6XX,
                AdrenoVulkanDriverSupport.GpuSeries.ADRENO_OTHER
            ),
            description = "Классический проверенный драйвер Turnip Mesa с поддержкой Vulkan 1.3.",
            downloadUrl = "https://github.com/K11MCH1/AdrenoToolsDrivers/releases/download/v24.3.0-r20/turnip_mesa_v24.3.0-r20.zip",
            fileSizeMb = 4.8,
            isRecommended = false
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
            description = "Проприетарный драйвер Qualcomm для Snapdragon 8 Gen 3.",
            downloadUrl = "https://github.com/K11MCH1/AdrenoToolsDrivers/releases/download/v762.0/qualcomm_v762.0.zip",
            fileSizeMb = 3.9,
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
