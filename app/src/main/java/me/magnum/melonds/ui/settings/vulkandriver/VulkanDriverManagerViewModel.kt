package me.magnum.melonds.ui.settings.vulkandriver

import android.app.Application
import android.net.Uri
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
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
        val supported = driverManager.isSupported
        val series = AdrenoVulkanDriverSupport.getGpuSeries()
        val gpuDesc = AdrenoVulkanDriverSupport.getDeviceGpuDescription()
        val mode = settingsRepository.getVulkanDriverMode()
        val selectedId = settingsRepository.getSelectedVulkanDriverId()
        val installed = settingsRepository.getInstalledVulkanDrivers()
        val online = onlineDriverRepository.getDriversForGpu(series)
        val recommended = onlineDriverRepository.getRecommendedDriver(series)

        _uiState.update {
            it.copy(
                isSupported = supported,
                gpuDescription = gpuDesc,
                gpuSeries = series,
                driverMode = mode,
                selectedDriverId = selectedId,
                installedDrivers = installed,
                onlineDrivers = online,
                recommendedDriver = recommended
            )
        }
    }

    fun setSystemDriver() {
        settingsRepository.setVulkanDriverMode(VulkanDriverMode.SYSTEM)
        refresh()
    }

    fun selectDriver(id: String) {
        settingsRepository.setSelectedVulkanDriver(id)
        settingsRepository.setVulkanDriverMode(VulkanDriverMode.CUSTOM)
        refresh()
    }

    fun deleteDriver(id: String) {
        driverManager.removeDriver(id)
        refresh()
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
        runCatching {
            driverManager.importDriver(uri)
        }.onSuccess {
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

    fun clearMessage() {
        _uiState.update { it.copy(message = null) }
    }
}
