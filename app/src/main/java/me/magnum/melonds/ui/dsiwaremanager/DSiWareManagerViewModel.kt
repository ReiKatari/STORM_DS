package me.magnum.melonds.ui.dsiwaremanager

import android.net.Uri
import androidx.core.graphics.createBitmap
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.domain.model.ConfigurationDirResult
import me.magnum.melonds.domain.model.DSiWareTitle
import me.magnum.melonds.domain.model.dsinand.ImportDSiWareTitleResult
import me.magnum.melonds.domain.model.dsinand.OpenDSiNandResult
import me.magnum.melonds.domain.repositories.SettingsRepository
import me.magnum.melonds.domain.services.ConfigurationDirectoryVerifier
import me.magnum.melonds.domain.services.DSiNandManager
import me.magnum.melonds.impl.DSiWareTitlesMetadataStore
import me.magnum.melonds.ui.dsiwaremanager.model.DSiWareManagerUiState
import me.magnum.melonds.domain.model.dsinand.DSiWareTitleFileType
import me.magnum.melonds.ui.dsiwaremanager.model.ImportExportDSiWareTitleFileEvent
import me.magnum.melonds.ui.romlist.RomIcon
import java.nio.ByteBuffer
import javax.inject.Inject

@HiltViewModel
class DSiWareManagerViewModel @Inject constructor(
    private val dsiNandManager: DSiNandManager,
    private val settingsRepository: SettingsRepository,
    private val configurationDirectoryVerifier: ConfigurationDirectoryVerifier,
    private val dsiWareTitlesMetadataStore: DSiWareTitlesMetadataStore,
    private val romsRepository: me.magnum.melonds.domain.repositories.RomsRepository,
) : ViewModel() {

    private val _state = MutableStateFlow<DSiWareManagerUiState>(DSiWareManagerUiState.Loading)
    val state: StateFlow<DSiWareManagerUiState> = _state

    private val _importingTitle = MutableStateFlow(false)
    val importingTitle: StateFlow<Boolean> = _importingTitle.asStateFlow()

    private val _importTitleError = MutableSharedFlow<ImportDSiWareTitleResult>(extraBufferCapacity = 1, onBufferOverflow = BufferOverflow.DROP_OLDEST)
    val importTitleError: SharedFlow<ImportDSiWareTitleResult> = _importTitleError.asSharedFlow()

    private val _importExportFileEvent = MutableSharedFlow<ImportExportDSiWareTitleFileEvent>(extraBufferCapacity = 1, onBufferOverflow = BufferOverflow.DROP_OLDEST)
    val importExportFileEvent: SharedFlow<ImportExportDSiWareTitleFileEvent> = _importExportFileEvent.asSharedFlow()

    init {
        loadDSiWareData()
    }

    fun importTitleToNand(titleUri: Uri) {
        _importingTitle.value = true

        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                val result = dsiNandManager.importTitle(titleUri)
                if (result == ImportDSiWareTitleResult.SUCCESS) {
                    val titles = dsiNandManager.listTitles()
                    val justImported = titles.maxByOrNull { it.titleId }
                    if (justImported != null) {
                        dsiWareTitlesMetadataStore.setAutoImported(justImported.titleId, false)
                    }
                    _state.value = DSiWareManagerUiState.Ready(titles)
                } else {
                    _importTitleError.tryEmit(result)
                }
                _importingTitle.value = false
            }
        }
    }

    fun deleteTitle(title: DSiWareTitle) {
        viewModelScope.launch {
            withContext(Dispatchers.Default) {
                dsiNandManager.deleteTitle(title)
                val titles = dsiNandManager.listTitles()
                _state.value = DSiWareManagerUiState.Ready(titles)
            }
        }
    }

    fun renameTitle(title: DSiWareTitle, newName: String) {
        viewModelScope.launch {
            withContext(Dispatchers.Default) {
                dsiWareTitlesMetadataStore.setCustomName(title.titleId, newName)
                val titles = dsiNandManager.listTitles()
                _state.value = DSiWareManagerUiState.Ready(titles)
            }
        }
    }

    fun importDSiWareTitleFile(title: DSiWareTitle, fileType: DSiWareTitleFileType, fileUri: Uri) {
        _importingTitle.value = true

        viewModelScope.launch {
            withContext(Dispatchers.Default) {
                val success = dsiNandManager.importTitleFile(title, fileType, fileUri)
                if (success) {
                    _importExportFileEvent.tryEmit(ImportExportDSiWareTitleFileEvent.ImportSuccess(fileType.fileName))
                } else {
                    _importExportFileEvent.tryEmit(ImportExportDSiWareTitleFileEvent.ImportError)
                }
                _importingTitle.value = false
            }
        }
    }

    fun exportDSiWareTitleFile(title: DSiWareTitle, fileType: DSiWareTitleFileType, destinationFileUri: Uri) {
        _importingTitle.value = true

        viewModelScope.launch {
            withContext(Dispatchers.Default) {
                val success = dsiNandManager.exportTitleFile(title, fileType, destinationFileUri)
                if (success) {
                    _importExportFileEvent.tryEmit(ImportExportDSiWareTitleFileEvent.ExportSuccess(fileType.fileName))
                } else {
                    _importExportFileEvent.tryEmit(ImportExportDSiWareTitleFileEvent.ExportError)
                }
                _importingTitle.value = false
            }
        }
    }

    fun getTitleIcon(title: DSiWareTitle): RomIcon {
        val bitmap = createBitmap(32, 32).apply {
            copyPixelsFromBuffer(ByteBuffer.wrap(title.icon))
        }
        val iconFiltering = settingsRepository.getRomIconFiltering()
        return RomIcon(bitmap, iconFiltering)
    }

    fun revalidateBiosConfiguration() {
        _state.value = DSiWareManagerUiState.Loading
        loadDSiWareData()
    }

    private fun loadDSiWareData() {
        val dsiConfiguration = configurationDirectoryVerifier.checkDsiConfigurationDirectory()
        if (dsiConfiguration.status != ConfigurationDirResult.Status.VALID) {
            _state.value = DSiWareManagerUiState.DSiSetupInvalid(dsiConfiguration.status)
        } else {
            viewModelScope.launch {
                withContext(Dispatchers.IO) {
                    val openNandResult = dsiNandManager.openNand()
                    if (openNandResult.isSuccess()) {
                        runCatching {
                            val activeRoms = romsRepository.getRoms().first()
                            val dsiRoms = activeRoms.filter {
                                (it.isDsiWareTitle || it.fileName.endsWith(".dsi", ignoreCase = true) || it.uri.path?.endsWith(".dsi", ignoreCase = true) == true) &&
                                    !it.isInstalledDsiWareShortcut
                            }
                            val existingTitles = dsiNandManager.listTitles()
                            for (rom in dsiRoms) {
                                val cleanName = rom.name.lowercase().trim()
                                val cleanFileName = rom.fileName.substringBeforeLast('.').lowercase().trim()
                                val isInstalled = existingTitles.any { title ->
                                    val titleIdHex = (title.titleId and 0xFFFFFFFFL).toString(16).padStart(8, '0').lowercase()
                                    val storedSourceUri = dsiWareTitlesMetadataStore.getSourceUri(titleIdHex)
                                    val storedOrigFile = dsiWareTitlesMetadataStore.getOriginalFileName(titleIdHex)

                                    storedSourceUri == rom.uri.toString() ||
                                        (storedOrigFile != null && (storedOrigFile.equals(cleanFileName, true) || storedOrigFile.equals(cleanName, true))) ||
                                        title.name.equals(cleanName, true) ||
                                        title.name.equals(cleanFileName, true) ||
                                        titleIdHex == cleanFileName
                                }
                                if (!isInstalled) {
                                    val res = dsiNandManager.importTitle(rom.uri)
                                    if (res == ImportDSiWareTitleResult.SUCCESS) {
                                        val updatedTitles = dsiNandManager.listTitles()
                                        val importedTitle = updatedTitles.find { it.name.equals(cleanName, true) || it.name.equals(cleanFileName, true) }
                                            ?: updatedTitles.maxByOrNull { it.titleId }
                                        if (importedTitle != null) {
                                            dsiWareTitlesMetadataStore.setAutoImported(importedTitle.titleId, true)
                                            dsiWareTitlesMetadataStore.setParentFolderUri(importedTitle.titleId, rom.parentTreeUri?.toString())
                                        }
                                    }
                                }
                            }
                        }
                        val titles = dsiNandManager.listTitles()
                        withContext(Dispatchers.Main) {
                            _state.value = DSiWareManagerUiState.Ready(titles)
                        }
                    } else {
                        withContext(Dispatchers.Main) {
                            _state.value = DSiWareManagerUiState.Error
                        }
                    }
                }
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        dsiNandManager.closeNand()
    }
}