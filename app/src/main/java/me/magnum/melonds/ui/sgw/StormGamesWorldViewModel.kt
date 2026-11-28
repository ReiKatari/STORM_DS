package me.magnum.melonds.ui.sgw

import android.content.Context
import android.os.SystemClock
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withTimeoutOrNull
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

    private val _isBusy = MutableStateFlow(false)
    val isBusy: StateFlow<Boolean> = _isBusy.asStateFlow()

    private val _highlightedRomUri = MutableStateFlow<String?>(null)
    val highlightedRomUri: StateFlow<String?> = _highlightedRomUri.asStateFlow()

    private val _lastReplaceResult = MutableStateFlow<SgwReplaceResult?>(null)
    val lastReplaceResult: StateFlow<SgwReplaceResult?> = _lastReplaceResult.asStateFlow()

    private var activeJob: Job? = null
    private val operationMutex = Mutex()
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

    fun setHighlightedRomUri(uri: String?) {
        _highlightedRomUri.value = uri
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
        if (_isBusy.value || operationMutex.isLocked || activeJob?.isActive == true) return
        cancelRequested.set(false)
        activeJob = viewModelScope.launch {
            operationMutex.withLock {
                _isBusy.value = true
                try {
                    val statusText = context.getString(R.string.sgw_downloading_status)
                    _downloadProgress.value = SgwDownloadProgress(
                        entryId = entry.id,
                        title = entry.title,
                        downloadedBytes = 0L,
                        totalBytes = entry.fileSizeBytes,
                        statusText = statusText,
                    )
                    var lastProgressMs = 0L
                    val result = sgwCatalogRepository.downloadEntry(
                        entry = entry,
                        onProgress = { dl, total ->
                            val now = SystemClock.elapsedRealtime()
                            if ((total > 0L && dl >= total) || now - lastProgressMs >= 100L) {
                                lastProgressMs = now
                                _downloadProgress.value = SgwDownloadProgress(
                                    entryId = entry.id,
                                    title = entry.title,
                                    downloadedBytes = dl,
                                    totalBytes = total,
                                    statusText = statusText,
                                )
                            }
                        },
                        isCancelled = { cancelRequested.get() },
                    )
                    _downloadProgress.value = null
                    _lastReplaceResult.value = result
                    if (result.success) {
                        val localRoms = awaitRefreshedRomList(result.newRomUri)
                        sgwCatalogRepository.recomputeUpdates(localRoms)
                    }
                } finally {
                    _downloadProgress.value = null
                    _isBusy.value = false
                }
            }
        }
    }

    fun updateInstalledRom(candidate: SgwUpdateCandidate) {
        if (_isBusy.value || operationMutex.isLocked || activeJob?.isActive == true) return
        cancelRequested.set(false)
        activeJob = viewModelScope.launch {
            operationMutex.withLock {
                _isBusy.value = true
                try {
                    val statusText = context.getString(R.string.sgw_updating_migrating_status)
                    _downloadProgress.value = SgwDownloadProgress(
                        entryId = candidate.remoteEntry.id,
                        title = candidate.remoteEntry.title,
                        downloadedBytes = 0L,
                        totalBytes = candidate.remoteEntry.fileSizeBytes,
                        statusText = statusText,
                    )
                    var lastProgressMs = 0L
                    val result = sgwCatalogRepository.updateLocalRom(
                        candidate = candidate,
                        onProgress = { dl, total ->
                            val now = SystemClock.elapsedRealtime()
                            if ((total > 0L && dl >= total) || now - lastProgressMs >= 100L) {
                                lastProgressMs = now
                                _downloadProgress.value = SgwDownloadProgress(
                                    entryId = candidate.remoteEntry.id,
                                    title = candidate.remoteEntry.title,
                                    downloadedBytes = dl,
                                    totalBytes = total,
                                    statusText = statusText,
                                )
                            }
                        },
                        isCancelled = { cancelRequested.get() },
                    )
                    _downloadProgress.value = null
                    _lastReplaceResult.value = result
                    if (result.success) {
                        val localRoms = awaitRefreshedRomList(result.newRomUri)
                        sgwCatalogRepository.recomputeUpdates(localRoms)
                    }
                } finally {
                    _downloadProgress.value = null
                    _isBusy.value = false
                }
            }
        }
    }

    private suspend fun awaitRefreshedRomList(expectedUri: android.net.Uri?): List<me.magnum.melonds.domain.model.rom.Rom> {
        if (expectedUri != null) {
            val matched = withTimeoutOrNull(4_000L) {
                romsRepository.getRoms().first { list ->
                    list.any { it.uri == expectedUri }
                }
            }
            if (matched != null) return matched
        }
        return romsRepository.getRoms().firstOrNull().orEmpty()
    }

    fun cancelDownload() {
        cancelRequested.set(true)
        activeJob?.cancel()
        _downloadProgress.value = null
    }

    override fun onCleared() {
        cancelRequested.set(true)
        activeJob?.cancel()
        super.onCleared()
    }
}
