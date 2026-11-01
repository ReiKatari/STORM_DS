package me.magnum.melonds.ui.romlist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import me.magnum.melonds.domain.model.DownloadProgress
import me.magnum.melonds.domain.model.appupdate.AppUpdate
import me.magnum.melonds.domain.repositories.UpdatesRepository
import me.magnum.melonds.domain.services.UpdateInstallManager
import javax.inject.Inject

sealed class ManualUpdateResult {
    object Checking : ManualUpdateResult()
    data class UpdateAvailable(val update: AppUpdate) : ManualUpdateResult()
    object UpToDate : ManualUpdateResult()
    data class Error(val message: String?) : ManualUpdateResult()
}

@HiltViewModel
class UpdatesViewModel @Inject constructor(
    private val updatesRepository: UpdatesRepository,
    private val updateInstallManager: UpdateInstallManager,
) : ViewModel() {

    private val _appUpdate = Channel<AppUpdate>(Channel.CONFLATED)
    val appUpdate = _appUpdate.receiveAsFlow()

    private val _updateDownloadProgressEvent = Channel<DownloadProgress>(Channel.CONFLATED)
    val updateDownloadProgressEvent = _updateDownloadProgressEvent.receiveAsFlow()

    private val _manualUpdateResult = MutableSharedFlow<ManualUpdateResult>(extraBufferCapacity = 1)
    val manualUpdateResult: SharedFlow<ManualUpdateResult> = _manualUpdateResult.asSharedFlow()

    init {
        viewModelScope.launch {
            updatesRepository.checkNewUpdate().map {
                if (it != null) {
                    _appUpdate.send(it)
                }
            }
        }
    }

    fun checkForUpdatesManually() {
        viewModelScope.launch {
            _manualUpdateResult.emit(ManualUpdateResult.Checking)
            val result = updatesRepository.checkNewUpdateManually()
            result.onSuccess { update ->
                if (update != null) {
                    _manualUpdateResult.emit(ManualUpdateResult.UpdateAvailable(update))
                    _appUpdate.send(update)
                } else {
                    _manualUpdateResult.emit(ManualUpdateResult.UpToDate)
                }
            }.onFailure { e ->
                _manualUpdateResult.emit(ManualUpdateResult.Error(e.message))
            }
        }
    }

    fun downloadUpdate(update: AppUpdate) {
        viewModelScope.launch {
            updateInstallManager.downloadAndInstallUpdate(update).collectLatest {
                _updateDownloadProgressEvent.send(it)
                if (it is DownloadProgress.DownloadComplete) {
                    updatesRepository.notifyUpdateDownloaded(update)
                }
            }
        }
    }

    fun skipUpdate(update: AppUpdate) {
        updatesRepository.skipUpdate(update)
    }
}
