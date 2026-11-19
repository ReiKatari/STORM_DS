package me.magnum.melonds.ui.settings.vulkandriver

import android.app.Application
import android.net.Uri
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.domain.model.VulkanDriverInfo
import me.magnum.melonds.domain.model.VulkanDriverMode
import me.magnum.melonds.domain.repositories.SettingsRepository
import me.magnum.melonds.impl.AdrenoVulkanDriverManager
import me.magnum.melonds.impl.AdrenoVulkanDriverSupport
import me.magnum.melonds.impl.vulkandriver.OnlineVulkanDriver
import me.magnum.melonds.impl.vulkandriver.OnlineVulkanDriverRepository
import javax.inject.Inject

@HiltViewModel
class VulkanDriverManagerViewModel @Inject constructor(
    application: Application,
    private val settingsRepository: SettingsRepository,
    private val onlineDriverRepository: OnlineVulkanDriverRepository,
) : AndroidViewModel(application) {

    private val driverManager = AdrenoVulkanDriverManager(application, settingsRepository)

    data class UiState(
        val isSupported: Boolean = false,
        val gpuDescription: String = "",
        val gpuSeries: AdrenoVulkanDriverSupport.GpuSeries = AdrenoVulkanDriverSupport.GpuSeries.NON_ADRENO,
        val driverMode: VulkanDriverMode = VulkanDriverMode.SYSTEM,
        val selectedDriverId: String? = null,
        val installedDrivers: List<VulkanDriverInfo> = emptyList(),
        val installedDriverSizes: Map<String, String> = emptyMap(),
        val onlineDrivers: List<OnlineVulkanDriver> = emptyList(),
        val recommendedDriver: OnlineVulkanDriver? = null,
        val downloadProgress: Map<String, Int> = emptyMap(),
        val activeDownloadingId: String? = null,
        val message: String? = null,
    )

    private val _uiState = MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    init {
        refresh()
    }

    fun refresh() {
        viewModelScope.launch {
            val snapshot = withContext(Dispatchers.IO) {
                val supported = driverManager.isSupported
                val series = AdrenoVulkanDriverSupport.getGpuSeries()
                val gpuDesc = AdrenoVulkanDriverSupport.getDeviceGpuDescription()
                val mode = settingsRepository.getVulkanDriverMode()
                val selectedId = settingsRepository.getSelectedVulkanDriverId()
                val installed = settingsRepository.getInstalledVulkanDrivers()
                val sizes = installed.mapNotNull { driver ->
                    computeInstalledDriverSize(driver)?.let { driver.id to it }
                }.toMap()
                val online = onlineDriverRepository.getDriversForGpu(series)
                val recommended = onlineDriverRepository.getRecommendedDriver(series)
                Triple(
                    Triple(supported, series, gpuDesc),
                    Triple(mode, selectedId, installed),
                    Triple(sizes, online, recommended),
                )
            }

            _uiState.update {
                it.copy(
                    isSupported = snapshot.first.first,
                    gpuSeries = snapshot.first.second,
                    gpuDescription = snapshot.first.third,
                    driverMode = snapshot.second.first,
                    selectedDriverId = snapshot.second.second,
                    installedDrivers = snapshot.second.third,
                    installedDriverSizes = snapshot.third.first,
                    onlineDrivers = snapshot.third.second,
                    recommendedDriver = snapshot.third.third,
                )
            }
        }
    }

    private fun computeInstalledDriverSize(driver: VulkanDriverInfo): String? {
        return runCatching {
            val dir = java.io.File(driver.driverDir)
            if (!dir.exists()) return null
            val totalBytes = dir.walkTopDown().filter { it.isFile }.sumOf { it.length() }
            if (totalBytes <= 0L) return null
            if (totalBytes >= 1024 * 1024) {
                String.format(java.util.Locale.US, "%.1f MB", totalBytes / (1024.0 * 1024.0))
            } else {
                String.format(java.util.Locale.US, "%d KB", totalBytes / 1024)
            }
        }.getOrNull()
    }

    fun setSystemDriver() {
        viewModelScope.launch(Dispatchers.IO) {
            driverManager.setSystemDriver()
            refresh()
        }
    }

    fun selectDriver(id: String) {
        viewModelScope.launch(Dispatchers.IO) {
            driverManager.selectDriver(id)
            refresh()
        }
    }

    fun deleteDriver(id: String) {
        viewModelScope.launch(Dispatchers.IO) {
            driverManager.removeDriver(id)
            refresh()
        }
    }

    fun downloadAndInstall(driver: OnlineVulkanDriver) {
        if (_uiState.value.activeDownloadingId != null) return

        _uiState.update {
            it.copy(
                activeDownloadingId = driver.id,
                message = "Скачивание ${driver.name}..."
            )
        }

        viewModelScope.launch {
            val result = driverManager.downloadAndInstallDriver(driver) { progress ->
                _uiState.update {
                    it.copy(downloadProgress = it.downloadProgress + (driver.id to progress))
                }
            }

            result.onSuccess { importResult ->
                _uiState.update {
                    it.copy(
                        activeDownloadingId = null,
                        message = "Драйвер ${importResult.displayName} успешно установлен и активирован!"
                    )
                }
                refresh()
            }.onFailure { error ->
                _uiState.update {
                    it.copy(
                        activeDownloadingId = null,
                        message = "Ошибка загрузки: ${error.localizedMessage ?: error.message}"
                    )
                }
            }
        }
    }

    fun importFromUri(uri: Uri) {
        viewModelScope.launch {
            val result = withContext(Dispatchers.IO) {
                runCatching { driverManager.importDriver(uri) }
            }
            result.onSuccess {
                _uiState.update { state ->
                    state.copy(message = "Драйвер ${it.displayName} успешно импортирован!")
                }
                refresh()
            }.onFailure {
                _uiState.update { state ->
                    state.copy(message = "Не удалось импортировать драйвер из ZIP")
                }
            }
        }
    }

    fun clearMessage() {
        _uiState.update { it.copy(message = null) }
    }
}
