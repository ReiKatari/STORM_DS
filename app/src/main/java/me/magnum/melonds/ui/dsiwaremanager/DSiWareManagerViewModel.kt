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
                    val activeRomsList = romsRepository.getRoms().firstOrNull() ?: emptyList()
                    val initialEnhanced = activeRomsList.filter { it.isDsiEnhanced }
                    val filteredTitles = filterActiveTitles(titles, activeRomsList)
                    _state.value = DSiWareManagerUiState.Ready(filteredTitles, initialEnhanced)
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
                val activeRomsList = romsRepository.getRoms().firstOrNull() ?: emptyList()
                val initialEnhanced = activeRomsList.filter { it.isDsiEnhanced }
                val filteredTitles = filterActiveTitles(titles, activeRomsList)
                _state.value = DSiWareManagerUiState.Ready(filteredTitles, initialEnhanced)
            }
        }
    }

    fun renameTitle(title: DSiWareTitle, newName: String) {
        viewModelScope.launch {
            withContext(Dispatchers.Default) {
                dsiWareTitlesMetadataStore.setCustomName(title.titleId, newName)
                val titles = dsiNandManager.listTitles()
                val activeRomsList = romsRepository.getRoms().firstOrNull() ?: emptyList()
                val initialEnhanced = activeRomsList.filter { it.isDsiEnhanced }
                val filteredTitles = filterActiveTitles(titles, activeRomsList)
                _state.value = DSiWareManagerUiState.Ready(filteredTitles, initialEnhanced)
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

    private val titleIconCache = java.util.concurrent.ConcurrentHashMap<Long, RomIcon>()
    private val romIconCache = java.util.concurrent.ConcurrentHashMap<Uri, RomIcon>()
    private val importedRomUriCache = java.util.concurrent.ConcurrentHashMap.newKeySet<String>()

    fun getTitleIcon(title: DSiWareTitle): RomIcon {
        return titleIconCache.getOrPut(title.titleId) {
            val bitmap = createBitmap(32, 32).apply {
                copyPixelsFromBuffer(ByteBuffer.wrap(title.icon))
            }
            val iconFiltering = settingsRepository.getRomIconFiltering()
            RomIcon(bitmap, iconFiltering)
        }
    }

    suspend fun getRomIcon(rom: me.magnum.melonds.domain.model.rom.Rom): RomIcon {
        return romIconCache.getOrPut(rom.uri) {
            val bitmap = romIconProvider.getRomIcon(rom)
            val iconFiltering = settingsRepository.getRomIconFiltering()
            RomIcon(bitmap, iconFiltering)
        }
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
        return titles
    }

    private fun loadDSiWareData() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                val openNandResult = dsiNandManager.openNand()
                if (openNandResult.isSuccess()) {
                    romsRepository.getRoms().collectLatest { activeRomsList ->
                        val initialEnhanced = activeRomsList.filter { it.isDsiEnhanced }

                        val dsiRoms = activeRomsList.filter {
                            (it.isDsiWareTitle || it.fileName.endsWith(".dsi", ignoreCase = true) || it.uri.path?.endsWith(".dsi", ignoreCase = true) == true) &&
                                !it.isInstalledDsiWareShortcut && !it.isDsiEnhanced
                        }

                        var nandUpdated = false
                        for (rom in dsiRoms) {
                            val uriStr = rom.uri.toString()
                            if (importedRomUriCache.contains(uriStr)) continue

                            val res = dsiNandManager.importTitle(rom.uri)
                            if (res == ImportDSiWareTitleResult.SUCCESS) {
                                importedRomUriCache.add(uriStr)
                                nandUpdated = true
                            } else if (res == ImportDSiWareTitleResult.TITLE_ALREADY_IMPORTED) {
                                importedRomUriCache.add(uriStr)
                            }
                        }

                        val finalTitles = dsiNandManager.listTitles()
                        val filteredTitles = filterActiveTitles(finalTitles, activeRomsList)
                        withContext(Dispatchers.Main) {
                            _state.value = DSiWareManagerUiState.Ready(filteredTitles, initialEnhanced)
                        }
                    }
                } else {
                    val dsiConfiguration = configurationDirectoryVerifier.checkDsiConfigurationDirectory()
                    withContext(Dispatchers.Main) {
                        _state.value = DSiWareManagerUiState.DSiSetupInvalid(dsiConfiguration.status)
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