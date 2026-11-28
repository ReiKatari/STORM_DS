package me.magnum.melonds.ui.sgw

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.launch
import me.magnum.melonds.R
import me.magnum.melonds.domain.repositories.RomsRepository
import me.magnum.melonds.sgw.SgwCatalogRepository
import me.magnum.melonds.sgw.SgwCatalogSnapshot
import me.magnum.melonds.sgw.SgwDownloadProgress
import me.magnum.melonds.sgw.SgwGameEntry
import me.magnum.melonds.sgw.SgwReplaceResult
import me.magnum.melonds.sgw.SgwUpdateCandidate
import java.util.concurrent.atomic.AtomicBoolean
import javax.inject.Inject

enum class SgwStoreTab {
    NDS,
    DSI,
    TRANSLATIONS,
    UPDATES,
}

@HiltViewModel
class StormGamesWorldViewModel @Inject constructor(
    @param:ApplicationContext private val context: Context,
    private val sgwCatalogRepository: SgwCatalogRepository,
    private val romsRepository: RomsRepository,
) : ViewModel() {

    val snapshot: StateFlow<SgwCatalogSnapshot> = sgwCatalogRepository.snapshot
    val isLoading: StateFlow<Boolean> = sgwCatalogRepository.isLoading

    private val _selectedTab = MutableStateFlow(SgwStoreTab.NDS)
    val selectedTab: StateFlow<SgwStoreTab> = _selectedTab.asStateFlow()

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    private val _downloadProgress = MutableStateFlow<SgwDownloadProgress?>(null)
    val downloadProgress: StateFlow<SgwDownloadProgress?> = _downloadProgress.asStateFlow()

    private val _lastReplaceResult = MutableStateFlow<SgwReplaceResult?>(null)
    val lastReplaceResult: StateFlow<SgwReplaceResult?> = _lastReplaceResult.asStateFlow()

    private var activeJob: Job? = null
    private val cancelRequested = AtomicBoolean(false)

    init {
        refreshCatalog(force = false)
    }

    fun selectTab(tab: SgwStoreTab) {
        _selectedTab.value = tab
    }

    fun updateSearchQuery(query: String) {
        _searchQuery.value = query
    }

    fun clearLastResult() {
        _lastReplaceResult.value = null
    }

    fun refreshCatalog(force: Boolean = true) {
        viewModelScope.launch {
            val localRoms = romsRepository.getRoms().firstOrNull().orEmpty()
            sgwCatalogRepository.refreshCatalog(localRoms, forceRefresh = force)
        }
    }

    fun downloadGame(entry: SgwGameEntry) {
        if (activeJob?.isActive == true) return
        cancelRequested.set(false)
        activeJob = viewModelScope.launch {
            _downloadProgress.value = SgwDownloadProgress(
                entryId = entry.id,
                title = entry.title,
                downloadedBytes = 0L,
                totalBytes = entry.fileSizeBytes,
                statusText = context.getString(R.string.sgw_downloading_status),
            )
            val result = sgwCatalogRepository.downloadEntry(
                entry = entry,
                onProgress = { dl, total ->
                    _downloadProgress.value = SgwDownloadProgress(
                        entryId = entry.id,
                        title = entry.title,
                        downloadedBytes = dl,
                        totalBytes = total,
                        statusText = context.getString(R.string.sgw_downloading_status),
                    )
                },
                isCancelled = { cancelRequested.get() },
            )
            _downloadProgress.value = null
            _lastReplaceResult.value = result
            if (result.success) {
                val localRoms = romsRepository.getRoms().firstOrNull().orEmpty()
                sgwCatalogRepository.recomputeUpdates(localRoms)
            }
        }
    }

    fun updateInstalledRom(candidate: SgwUpdateCandidate) {
        if (activeJob?.isActive == true) return
        cancelRequested.set(false)
        activeJob = viewModelScope.launch {
            _downloadProgress.value = SgwDownloadProgress(
                entryId = candidate.remoteEntry.id,
                title = candidate.remoteEntry.title,
                downloadedBytes = 0L,
                totalBytes = candidate.remoteEntry.fileSizeBytes,
                statusText = context.getString(R.string.sgw_updating_migrating_status),
            )
            val result = sgwCatalogRepository.updateLocalRom(
                candidate = candidate,
                onProgress = { dl, total ->
                    _downloadProgress.value = SgwDownloadProgress(
                        entryId = candidate.remoteEntry.id,
                        title = candidate.remoteEntry.title,
                        downloadedBytes = dl,
                        totalBytes = total,
                        statusText = context.getString(R.string.sgw_updating_migrating_status),
                    )
                },
                isCancelled = { cancelRequested.get() },
            )
            _downloadProgress.value = null
            _lastReplaceResult.value = result
            if (result.success) {
                val localRoms = romsRepository.getRoms().firstOrNull().orEmpty()
                sgwCatalogRepository.recomputeUpdates(localRoms)
            }
        }
    }

    fun cancelDownload() {
        cancelRequested.set(true)
        activeJob?.cancel()
        _downloadProgress.value = null
    }
}
