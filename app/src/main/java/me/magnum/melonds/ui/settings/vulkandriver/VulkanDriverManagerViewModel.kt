package me.magnum.melonds.ui.settings.vulkandriver

import android.app.Application
import android.net.Uri
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.R
import me.magnum.melonds.VulkanGpuHardwareInfo
import me.magnum.melonds.domain.model.VulkanDriverInfo
import me.magnum.melonds.domain.model.VulkanDriverMode
import me.magnum.melonds.domain.repositories.SettingsRepository
import me.magnum.melonds.impl.AdrenoVulkanDriverManager
import me.magnum.melonds.impl.AdrenoVulkanDriverSupport
import me.magnum.melonds.impl.vulkandriver.DriverRepoCategory
import me.magnum.melonds.impl.vulkandriver.OnlineVulkanDriverRepository
import me.magnum.melonds.impl.vulkandriver.VulkanDriverAsset
import me.magnum.melonds.impl.vulkandriver.VulkanDriverRelease
import me.magnum.melonds.impl.vulkandriver.VulkanDriverRepoGroup
import me.magnum.melonds.impl.vulkandriver.VulkanDriverRepoSpec
import java.io.File
import java.util.Locale
import javax.inject.Inject

@HiltViewModel
class VulkanDriverManagerViewModel @Inject constructor(
    application: Application,
    private val settingsRepository: SettingsRepository,
    private val onlineDriverRepository: OnlineVulkanDriverRepository,
) : AndroidViewModel(application) {

    private val driverManager = AdrenoVulkanDriverManager(application, settingsRepository)

    data class PendingInstallRequest(
        val downloadKey: String,
        val displayName: String,
        val urls: List<String>,
        val sourceRepo: String,
        val assetFileName: String,
    )

    data class UiState(
        val supportStatus: AdrenoVulkanDriverSupport.SupportStatus =
            AdrenoVulkanDriverSupport.SupportStatus.UNSUPPORTED_GPU,
        val isSupported: Boolean = false,
        val gpuDescription: String = "",
        val gpuHardwareInfo: VulkanGpuHardwareInfo? = null,
        val gpuSeries: AdrenoVulkanDriverSupport.GpuSeries =
            AdrenoVulkanDriverSupport.GpuSeries.NON_ADRENO,
        val gpuSubFamily: AdrenoVulkanDriverSupport.AdrenoSubFamily =
            AdrenoVulkanDriverSupport.AdrenoSubFamily.NON_ADRENO,
        val gpuVendorFamily: AdrenoVulkanDriverSupport.GpuVendorFamily =
            AdrenoVulkanDriverSupport.GpuVendorFamily.OTHER,
        val isAdrenoTurnipCapable: Boolean = false,
        val hasPanfrostKernel: Boolean = false,
        val driverMode: VulkanDriverMode = VulkanDriverMode.SYSTEM,
        val selectedDriverId: String? = null,
        val installedDrivers: List<VulkanDriverInfo> = emptyList(),
        val installedDriverSizes: Map<String, String> = emptyMap(),
        val compatibleInstalledDrivers: Map<String, Boolean> = emptyMap(),
        val repoGroups: List<VulkanDriverRepoGroup> = emptyList(),
        val recommendedRepoIds: List<String> = emptyList(),
        val availableCategories: List<DriverRepoCategory> = listOf(DriverRepoCategory.ALL),
        val isSyncingRepos: Boolean = false,
        val isImportingLocal: Boolean = false,
        val searchQuery: String = "",
        val selectedCategory: DriverRepoCategory = DriverRepoCategory.ALL,
        val activeDownloadKey: String? = null,
        val activeDownloadName: String? = null,
        val downloadBytesRead: Long = 0L,
        val downloadTotalBytes: Long = -1L,
        val downloadPercent: Int = -1,
        val pendingAdreno8xxInstall: PendingInstallRequest? = null,
        val pendingDeleteDriver: VulkanDriverInfo? = null,
        val snackbarMessage: String? = null,
    )

    private val _uiState = MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()
    private var refreshJob: Job? = null
    private var isImportingUri = false

    init {
        loadInitialState()
    }

    private fun loadInitialState() {
        viewModelScope.launch {
            val snapshot = withContext(Dispatchers.IO) {
                readLocalHardwareAndDriverSnapshot()
            }
            val cachedRepos = if (snapshot.supportStatus == AdrenoVulkanDriverSupport.SupportStatus.SUPPORTED) {
                withContext(Dispatchers.IO) {
                    onlineDriverRepository.getCachedRepositoryGroups(snapshot.gpuSubFamily)
                }
            } else {
                emptyList()
            }
            val availCategories = OnlineVulkanDriverRepository.getAvailableCategories(cachedRepos)
            _uiState.update { current ->
                current.copy(
                    supportStatus = snapshot.supportStatus,
                    isSupported = snapshot.supportStatus == AdrenoVulkanDriverSupport.SupportStatus.SUPPORTED,
                    gpuDescription = snapshot.gpuDescription,
                    gpuHardwareInfo = snapshot.gpuHardwareInfo,
                    gpuSeries = snapshot.gpuSeries,
                    gpuSubFamily = snapshot.gpuSubFamily,
                    gpuVendorFamily = snapshot.gpuVendorFamily,
                    isAdrenoTurnipCapable = snapshot.isAdrenoTurnipCapable,
                    hasPanfrostKernel = snapshot.hasPanfrostKernel,
                    driverMode = snapshot.driverMode,
                    selectedDriverId = snapshot.selectedDriverId,
                    installedDrivers = snapshot.installedDrivers,
                    installedDriverSizes = snapshot.installedDriverSizes,
                    compatibleInstalledDrivers = snapshot.compatibleInstalledDrivers,
                    recommendedRepoIds = onlineDriverRepository.getRecommendedRepoIds(snapshot.gpuSubFamily),
                    availableCategories = availCategories,
                    selectedCategory = if (current.selectedCategory in availCategories) current.selectedCategory else DriverRepoCategory.ALL,
                    repoGroups = cachedRepos,
                )
            }
            if (snapshot.supportStatus == AdrenoVulkanDriverSupport.SupportStatus.SUPPORTED &&
                snapshot.isAdrenoTurnipCapable
            ) {
                refreshRepositories(forceRefresh = false)
            }
        }
    }

    private data class LocalSnapshot(
        val supportStatus: AdrenoVulkanDriverSupport.SupportStatus,
        val gpuDescription: String,
        val gpuHardwareInfo: VulkanGpuHardwareInfo?,
        val gpuSeries: AdrenoVulkanDriverSupport.GpuSeries,
        val gpuSubFamily: AdrenoVulkanDriverSupport.AdrenoSubFamily,
        val gpuVendorFamily: AdrenoVulkanDriverSupport.GpuVendorFamily,
        val isAdrenoTurnipCapable: Boolean,
        val hasPanfrostKernel: Boolean,
        val driverMode: VulkanDriverMode,
        val selectedDriverId: String?,
        val installedDrivers: List<VulkanDriverInfo>,
        val installedDriverSizes: Map<String, String>,
        val compatibleInstalledDrivers: Map<String, Boolean>,
    )

    private fun readLocalHardwareAndDriverSnapshot(): LocalSnapshot {
        val ctx = getApplication<Application>()
        val status = AdrenoVulkanDriverSupport.getSupportStatus(ctx)
        val hwInfo = AdrenoVulkanDriverSupport.getVulkanHardwareInfo()
        val series = AdrenoVulkanDriverSupport.getGpuSeries()
        val subFamily = AdrenoVulkanDriverSupport.getSubFamily()
        val vendorFamily = AdrenoVulkanDriverSupport.getGpuVendorFamily()
        val turnipCapable = AdrenoVulkanDriverSupport.isAdrenoTurnipCapable(subFamily)
        val panfrostKernel = AdrenoVulkanDriverSupport.hasPanfrostOrPanthorKernel()
        val gpuDesc = AdrenoVulkanDriverSupport.getDeviceGpuDescription()
        val installed = settingsRepository.getInstalledVulkanDrivers()
        val selectedId = settingsRepository.getSelectedVulkanDriverId()
        val effectiveMode = if (status == AdrenoVulkanDriverSupport.SupportStatus.SUPPORTED &&
            settingsRepository.getVulkanDriverMode() == VulkanDriverMode.CUSTOM &&
            selectedId != null &&
            installed.any { it.id == selectedId }
        ) {
            VulkanDriverMode.CUSTOM
        } else {
            VulkanDriverMode.SYSTEM
        }
        val sizes = installed.mapNotNull { driver ->
            computeInstalledDriverSize(driver)?.let { driver.id to it }
        }.toMap()
        val compatibilityMap = installed.associate { driver ->
            driver.id to AdrenoVulkanDriverSupport.isDriverCompatibleWithCurrentGpu(
                driverName = "${driver.displayName} ${driver.driverName}",
                description = driver.description,
                version = driver.driverVersion,
                sourceRepo = driver.sourceRepo ?: driver.assetFileName,
                subFamily = subFamily,
                vendorFamily = vendorFamily,
            )
        }
        return LocalSnapshot(
            supportStatus = status,
            gpuDescription = gpuDesc,
            gpuHardwareInfo = hwInfo,
            gpuSeries = series,
            gpuSubFamily = subFamily,
            gpuVendorFamily = vendorFamily,
            isAdrenoTurnipCapable = turnipCapable,
            hasPanfrostKernel = panfrostKernel,
            driverMode = effectiveMode,
            selectedDriverId = selectedId,
            installedDrivers = installed,
            installedDriverSizes = sizes,
            compatibleInstalledDrivers = compatibilityMap,
        )
    }

    fun refreshLocalState() {
        viewModelScope.launch {
            val snapshot = withContext(Dispatchers.IO) {
                readLocalHardwareAndDriverSnapshot()
            }
            _uiState.update {
                it.copy(
                    supportStatus = snapshot.supportStatus,
                    isSupported = snapshot.supportStatus == AdrenoVulkanDriverSupport.SupportStatus.SUPPORTED,
                    gpuDescription = snapshot.gpuDescription,
                    gpuHardwareInfo = snapshot.gpuHardwareInfo,
                    gpuSeries = snapshot.gpuSeries,
                    gpuSubFamily = snapshot.gpuSubFamily,
                    gpuVendorFamily = snapshot.gpuVendorFamily,
                    isAdrenoTurnipCapable = snapshot.isAdrenoTurnipCapable,
                    hasPanfrostKernel = snapshot.hasPanfrostKernel,
                    driverMode = snapshot.driverMode,
                    selectedDriverId = snapshot.selectedDriverId,
                    installedDrivers = snapshot.installedDrivers,
                    installedDriverSizes = snapshot.installedDriverSizes,
                    compatibleInstalledDrivers = snapshot.compatibleInstalledDrivers,
                    recommendedRepoIds = onlineDriverRepository.getRecommendedRepoIds(snapshot.gpuSubFamily),
                )
            }
        }
    }

    fun refreshRepositories(forceRefresh: Boolean = true) {
        val currentState = _uiState.value
        if (!currentState.isSupported) return
        if (!currentState.isAdrenoTurnipCapable) {
            _uiState.update {
                it.copy(
                    repoGroups = emptyList(),
                    availableCategories = listOf(DriverRepoCategory.ALL),
                    selectedCategory = DriverRepoCategory.ALL,
                    isSyncingRepos = false,
                )
            }
            return
        }
        if (currentState.isSyncingRepos && !forceRefresh) return

        refreshJob?.cancel()
        _uiState.update { it.copy(isSyncingRepos = true) }
        refreshJob = viewModelScope.launch {
            val fetched = onlineDriverRepository.fetchAllRepositories(
                forceRefresh = forceRefresh,
                subFamily = _uiState.value.gpuSubFamily,
            )
            val availCategories = OnlineVulkanDriverRepository.getAvailableCategories(fetched)
            _uiState.update { state ->
                state.copy(
                    repoGroups = fetched,
                    availableCategories = availCategories,
                    selectedCategory = if (state.selectedCategory in availCategories) state.selectedCategory else DriverRepoCategory.ALL,
                    isSyncingRepos = false,
                )
            }
        }
    }

    fun updateSearchQuery(query: String) {
        _uiState.update { it.copy(searchQuery = query) }
    }

    fun selectCategory(category: DriverRepoCategory) {
        _uiState.update { it.copy(selectedCategory = category) }
    }

    fun setSystemDriver() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                driverManager.setSystemDriver()
            }
            refreshLocalState()
        }
    }

    fun selectDriver(id: String) {
        if (!_uiState.value.isSupported) return
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                driverManager.selectDriver(id)
            }
            refreshLocalState()
        }
    }

    fun requestDeleteDriver(driver: VulkanDriverInfo) {
        _uiState.update { it.copy(pendingDeleteDriver = driver) }
    }

    fun dismissDeleteDriver() {
        _uiState.update { it.copy(pendingDeleteDriver = null) }
    }

    fun confirmDeleteDriver() {
        val target = _uiState.value.pendingDeleteDriver ?: return
        _uiState.update { it.copy(pendingDeleteDriver = null) }
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                driverManager.removeDriver(target.id)
            }
            val msg = getApplication<Application>().getString(R.string.video_vulkan_driver_removed, target.displayName)
            _uiState.update { it.copy(snackbarMessage = msg) }
            refreshLocalState()
        }
    }

    fun installStormDriver() {
        if (!_uiState.value.isSupported || !_uiState.value.isAdrenoTurnipCapable || _uiState.value.activeDownloadKey != null || _uiState.value.isImportingLocal) return

        val liveStormRelease = _uiState.value.repoGroups
            .firstOrNull { it.spec.id == "storm_driver" }
            ?.releases
            ?.firstOrNull()
        val liveAsset = liveStormRelease?.assets?.firstOrNull()

        val urls = if (liveAsset != null) {
            if (liveAsset.name.equals("STORM_DRIVER_12.0.0.zip", ignoreCase = true)) {
                (liveAsset.allUrls() + OnlineVulkanDriverRepository.STORM_DRIVER_MIRRORS).distinct()
            } else {
                liveAsset.allUrls()
            }
        } else {
            OnlineVulkanDriverRepository.STORM_DRIVER_MIRRORS
        }
        val displayName = liveStormRelease?.title ?: "STORM DRIVER 12.0.0"
        val assetName = liveAsset?.name ?: "STORM_DRIVER_12.0.0.zip"

        executeInstallRequest(
            PendingInstallRequest(
                downloadKey = "storm_quick",
                displayName = displayName,
                urls = urls,
                sourceRepo = "storm_driver",
                assetFileName = assetName,
            )
        )
    }

    fun requestInstallAsset(
        repo: VulkanDriverRepoSpec,
        release: VulkanDriverRelease,
        asset: VulkanDriverAsset,
    ) {
        if (!_uiState.value.isSupported || _uiState.value.activeDownloadKey != null || _uiState.value.isImportingLocal) return

        val cleanAssetName = asset.name
            .removeSuffix(".adpkg.zip")
            .removeSuffix(".zip")
            .removeSuffix(".adpkg")
        val displayName = if (release.assets.size > 1) {
            "${release.title} - $cleanAssetName"
        } else {
            release.title
        }

        val request = PendingInstallRequest(
            downloadKey = asset.downloadUrl,
            displayName = displayName,
            urls = asset.allUrls(),
            sourceRepo = repo.id,
            assetFileName = asset.name,
        )

        val warn8xx = AdrenoVulkanDriverSupport.isDriverPotentiallyIncompatibleWithAdreno8xx(
            driverName = "$displayName ${asset.name}",
            description = "${repo.displayName} ${release.releaseNotes}",
            version = release.tagName,
        )
        if (warn8xx) {
            _uiState.update { it.copy(pendingAdreno8xxInstall = request) }
        } else {
            executeInstallRequest(request)
        }
    }

    fun dismissAdreno8xxInstall() {
        _uiState.update { it.copy(pendingAdreno8xxInstall = null) }
    }

    fun confirmAdreno8xxInstall() {
        val pending = _uiState.value.pendingAdreno8xxInstall ?: return
        _uiState.update { it.copy(pendingAdreno8xxInstall = null) }
        executeInstallRequest(pending)
    }

    private fun executeInstallRequest(request: PendingInstallRequest) {
        _uiState.update {
            it.copy(
                activeDownloadKey = request.downloadKey,
                activeDownloadName = request.displayName,
                downloadBytesRead = 0L,
                downloadTotalBytes = -1L,
                downloadPercent = -1,
            )
        }

        viewModelScope.launch {
            val result = driverManager.downloadAndInstallFromUrls(
                urls = request.urls,
                fallbackDisplayName = request.displayName,
                sourceRepo = request.sourceRepo,
                assetFileName = request.assetFileName,
            ) { bytesRead, totalBytes, percent ->
                _uiState.update {
                    it.copy(
                        downloadBytesRead = bytesRead,
                        downloadTotalBytes = totalBytes,
                        downloadPercent = percent,
                    )
                }
            }

            val ctx = getApplication<Application>()
            result.onSuccess { imported ->
                _uiState.update {
                    it.copy(
                        activeDownloadKey = null,
                        activeDownloadName = null,
                        downloadPercent = -1,
                        snackbarMessage = ctx.getString(R.string.video_vulkan_driver_import_success, imported.displayName),
                    )
                }
                refreshLocalState()
            }.onFailure { throwable ->
                val errorText = mapErrorMessage(ctx, throwable)
                _uiState.update {
                    it.copy(
                        activeDownloadKey = null,
                        activeDownloadName = null,
                        downloadPercent = -1,
                        snackbarMessage = errorText,
                    )
                }
            }
        }
    }

    fun importFromUri(uri: Uri) {
        if (!_uiState.value.isSupported || _uiState.value.activeDownloadKey != null || isImportingUri || _uiState.value.isImportingLocal) return
        isImportingUri = true
        _uiState.update { it.copy(isImportingLocal = true) }
        viewModelScope.launch {
            try {
                val result = withContext(Dispatchers.IO) {
                    runCatching { driverManager.importDriver(uri) }
                }
                val ctx = getApplication<Application>()
                result.onSuccess { imported ->
                    val currentSnap = _uiState.value
                    val installedInfo = settingsRepository.getInstalledVulkanDrivers().firstOrNull { it.id == imported.id }
                    val isCompatible = AdrenoVulkanDriverSupport.isDriverCompatibleWithCurrentGpu(
                        driverName = "${imported.displayName} ${installedInfo?.driverName.orEmpty()}",
                        description = installedInfo?.description,
                        version = installedInfo?.driverVersion,
                        sourceRepo = installedInfo?.sourceRepo ?: installedInfo?.assetFileName,
                        subFamily = currentSnap.gpuSubFamily,
                        vendorFamily = currentSnap.gpuVendorFamily,
                    )
                    val message = if (!isCompatible) {
                        ctx.getString(
                            R.string.vulkan_driver_imported_incompatible_notice,
                            imported.displayName,
                            currentSnap.gpuVendorFamily.displayName,
                        )
                    } else {
                        ctx.getString(R.string.video_vulkan_driver_import_success, imported.displayName)
                    }
                    _uiState.update {
                        it.copy(snackbarMessage = message)
                    }
                    refreshLocalState()
                }.onFailure { throwable ->
                    _uiState.update {
                        it.copy(snackbarMessage = mapErrorMessage(ctx, throwable))
                    }
                }
            } finally {
                isImportingUri = false
                _uiState.update { it.copy(isImportingLocal = false) }
            }
        }
    }

    fun clearPipelineCaches() {
        viewModelScope.launch {
            val count = withContext(Dispatchers.IO) {
                driverManager.clearDriverPipelineCaches()
            }
            val msg = getApplication<Application>().getString(R.string.vulkan_driver_caches_cleared, count)
            _uiState.update { it.copy(snackbarMessage = msg) }
        }
    }

    fun clearMessage() {
        _uiState.update { it.copy(snackbarMessage = null) }
    }

    private fun mapErrorMessage(ctx: Application, throwable: Throwable): String {
        val importEx = throwable as? AdrenoVulkanDriverManager.ImportException
        return when (importEx?.reason) {
            AdrenoVulkanDriverManager.ImportException.Reason.ApiTooLow ->
                ctx.getString(R.string.vulkan_driver_import_min_api, importEx.detailInt)
            AdrenoVulkanDriverManager.ImportException.Reason.InvalidArchive ->
                ctx.getString(R.string.vulkan_driver_import_invalid_archive)
            AdrenoVulkanDriverManager.ImportException.Reason.NotZip ->
                ctx.getString(R.string.video_vulkan_driver_import_not_zip)
            AdrenoVulkanDriverManager.ImportException.Reason.NoDriver ->
                ctx.getString(R.string.video_vulkan_driver_import_no_driver)
            AdrenoVulkanDriverManager.ImportException.Reason.AmbiguousDriver ->
                ctx.getString(R.string.video_vulkan_driver_import_ambiguous)
            AdrenoVulkanDriverManager.ImportException.Reason.UnsupportedBuild ->
                ctx.getString(R.string.video_vulkan_driver_unsupported)
            AdrenoVulkanDriverManager.ImportException.Reason.InvalidZip ->
                ctx.getString(R.string.video_vulkan_driver_import_failed)
            null ->
                ctx.getString(
                    R.string.vulkan_driver_download_error,
                    throwable.localizedMessage ?: throwable.message ?: "Unknown",
                )
        }
    }

    private fun computeInstalledDriverSize(driver: VulkanDriverInfo): String? {
        return runCatching {
            val dir = File(driver.driverDir)
            if (!dir.exists()) return null
            val totalBytes = dir.walkTopDown().filter { it.isFile }.sumOf { it.length() }
            if (totalBytes <= 0L) return null
            if (totalBytes >= 1024L * 1024L) {
                String.format(Locale.US, "%.1f MB", totalBytes / (1024.0 * 1024.0))
            } else {
                String.format(Locale.US, "%d KB", (totalBytes / 1024L).coerceAtLeast(1L))
            }
        }.getOrNull()
    }
}
