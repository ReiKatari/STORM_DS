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

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import me.magnum.melonds.impl.RomIconProvider

@HiltViewModel
class DSiWareManagerViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val dsiNandManager: DSiNandManager,
    private val settingsRepository: SettingsRepository,
    private val configurationDirectoryVerifier: ConfigurationDirectoryVerifier,
    private val dsiWareTitlesMetadataStore: DSiWareTitlesMetadataStore,
    private val romsRepository: me.magnum.melonds.domain.repositories.RomsRepository,
    private val romIconProvider: RomIconProvider,
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

    suspend fun getRomIcon(rom: me.magnum.melonds.domain.model.rom.Rom): RomIcon {
        val bitmap = romIconProvider.getRomIcon(rom)
        val iconFiltering = settingsRepository.getRomIconFiltering()
        return RomIcon(bitmap, iconFiltering)
    }

    fun renameEnhancedRomFile(rom: me.magnum.melonds.domain.model.rom.Rom, newBaseName: String) {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                val doc = androidx.documentfile.provider.DocumentFile.fromSingleUri(context, rom.uri)
                val ext = rom.fileName.substringAfterLast('.', "nds")
                doc?.renameTo("$newBaseName.$ext")
                romsRepository.invalidateRoms()
                romsRepository.rescanRoms()
            }
        }
    }

    fun deleteEnhancedRomFile(rom: me.magnum.melonds.domain.model.rom.Rom) {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                val doc = androidx.documentfile.provider.DocumentFile.fromSingleUri(context, rom.uri)
                doc?.delete()
                romsRepository.invalidateRoms()
                romsRepository.rescanRoms()
            }
        }
    }

    fun revalidateBiosConfiguration() {
        _state.value = DSiWareManagerUiState.Loading
        loadDSiWareData()
    }

    private fun filterActiveTitles(titles: List<DSiWareTitle>, activeRoms: List<me.magnum.melonds.domain.model.rom.Rom>? = null): List<DSiWareTitle> {
        val currentRoms = activeRoms ?: emptyList()
        val activeUris = currentRoms.map { it.uri.toString() }.toSet()
        val activeNames = currentRoms.map { it.name.lowercase().trim() }.toSet()
        val activeFileNames = currentRoms.map { it.fileName.substringBeforeLast('.').lowercase().trim() }.toSet()
        val enhancedNames = currentRoms.filter { it.isDsiEnhanced }.map { it.name.lowercase().trim() }.toSet()
        val enhancedFileNames = currentRoms.filter { it.isDsiEnhanced }.map { it.fileName.substringBeforeLast('.').lowercase().trim() }.toSet()

        return titles.filter { title ->
            val titleIdHex = (title.titleId and 0xFFFFFFFFL).toString(16).padStart(8, '0').lowercase()
            val sourceUri = dsiWareTitlesMetadataStore.getSourceUri(titleIdHex)
            val origFile = dsiWareTitlesMetadataStore.getOriginalFileName(titleIdHex)?.lowercase()?.trim()
            val titleName = title.name.lowercase().trim()
            val isEnhanced = titleName in enhancedNames || titleName in enhancedFileNames

            val existsInFolders = (sourceUri != null && sourceUri in activeUris) ||
                (origFile != null && (origFile in activeFileNames || origFile in activeNames)) ||
                (titleName in activeFileNames || titleName in activeNames)

            !isEnhanced && existsInFolders
        }
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
                        val activeRomsList = romsRepository.getRoms().first()
                        val initialTitles = filterActiveTitles(dsiNandManager.listTitles(), activeRomsList)
                        val initialEnhanced = activeRomsList.filter { it.isDsiEnhanced }
                        withContext(Dispatchers.Main) {
                            _state.value = DSiWareManagerUiState.Ready(initialTitles, initialEnhanced)
                        }

                        runCatching {
                            romsRepository.getRoms().collectLatest { activeRoms ->
                                val dsiRoms = activeRoms.filter {
                                    (it.isDsiWareTitle || it.fileName.endsWith(".dsi", ignoreCase = true) || it.uri.path?.endsWith(".dsi", ignoreCase = true) == true) &&
                                        !it.isInstalledDsiWareShortcut && !it.isDsiEnhanced
                                }
                                for (rom in dsiRoms) {
                                    val cleanName = rom.name.lowercase().trim()
                                    val cleanFileName = rom.fileName.substringBeforeLast('.').lowercase().trim()
                                    val exactFileName = rom.fileName.substringBeforeLast('.')

                                    val res = dsiNandManager.importTitle(rom.uri)
                                    if (res == ImportDSiWareTitleResult.SUCCESS || res == ImportDSiWareTitleResult.TITLE_ALREADY_IMPORTED) {
                                        val updatedTitles = dsiNandManager.listTitles()
                                        val matchingTitle = updatedTitles.find {
                                            it.name.equals(cleanName, true) ||
                                            it.name.equals(cleanFileName, true) ||
                                            cleanName.contains(it.name.lowercase()) ||
                                            it.name.lowercase().contains(cleanName)
                                        } ?: updatedTitles.maxByOrNull { it.titleId }

                                        if (matchingTitle != null) {
                                            dsiWareTitlesMetadataStore.setAutoImported(matchingTitle.titleId, true)
                                            dsiWareTitlesMetadataStore.setParentFolderUri(matchingTitle.titleId, rom.parentTreeUri?.toString())
                                            dsiWareTitlesMetadataStore.setSourceUri(matchingTitle.titleId, rom.uri.toString())
                                            dsiWareTitlesMetadataStore.setOriginalFileName(matchingTitle.titleId, exactFileName)
                                        }
                                    }
                                }
                                val finalTitles = filterActiveTitles(dsiNandManager.listTitles(), activeRoms)
                                val finalEnhanced = activeRoms.filter { it.isDsiEnhanced }
                                withContext(Dispatchers.Main) {
                                    _state.value = DSiWareManagerUiState.Ready(finalTitles, finalEnhanced)
                                }
                            }
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