package me.magnum.melonds.impl

import android.content.Context
import android.net.Uri
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Toast
import androidx.core.net.toUri
import androidx.documentfile.provider.DocumentFile
import android.provider.DocumentsContract
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.sync.Semaphore
import kotlinx.coroutines.sync.withPermit
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import me.magnum.melonds.R
import me.magnum.melonds.common.romprocessors.RomFileProcessorFactory
import me.magnum.melonds.common.uridelegates.UriHandler
import me.magnum.melonds.domain.model.RomScanningStatus
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.domain.model.rom.config.RomConfig
import me.magnum.melonds.domain.repositories.RomsRepository
import me.magnum.melonds.domain.repositories.SettingsRepository
import me.magnum.melonds.impl.dtos.rom.RomConfigDto
import me.magnum.melonds.impl.dtos.rom.RomDto
import me.magnum.melonds.impl.dtos.rom.RomDirectoryFileDto
import me.magnum.melonds.impl.dtos.rom.RomDirectoryStateDto
import me.magnum.melonds.domain.model.rom.RomDirectoryScanStatus
import me.magnum.melonds.utils.FileUtils
import me.magnum.melonds.utils.SubjectSharedFlow
import java.io.File
import java.io.FileOutputStream
import java.io.FileReader
import java.io.OutputStreamWriter
import java.lang.reflect.Type
import java.security.MessageDigest
import java.util.Date
import java.util.concurrent.atomic.AtomicBoolean
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds

class FileSystemRomsRepository(
        private val context: Context,
        private val gson: Gson,
        private val settingsRepository: SettingsRepository,
        private val romFileProcessorFactory: RomFileProcessorFactory,
        private val uriHandler: UriHandler,
        private val settingsBackupManager: SettingsBackupManager,
) : RomsRepository {

    companion object {
        private const val TAG = "FSRomsRepository"
        private const val EXTERNAL_STORAGE_PROVIDER_AUTHORITY = "com.android.externalstorage.documents"
        private const val ROM_DATA_FILE = "rom_data.json"
        private const val ROM_METADATA_MIRROR_FILE = "rom_metadata_mirror.json"
        private const val ROM_DIRECTORY_STATE_FILE = "rom_directory_state.json"
    }

    private val mainHandler = Handler(Looper.getMainLooper())
    private val coroutineScope = CoroutineScope(Dispatchers.IO)
    private val romListType: Type = object : TypeToken<List<RomDto>>(){}.type
    private val romMetadataMirrorListType: Type = object : TypeToken<List<RomMetadataMirrorDto>>(){}.type
    private val directoryStateListType: Type = object : TypeToken<List<RomDirectoryStateDto>>(){}.type
    private val romsChannel = SubjectSharedFlow<List<Rom>>()
    private val scanningStatusSubject = MutableStateFlow(RomScanningStatus.NOT_SCANNING)
    private val roms: java.util.concurrent.CopyOnWriteArrayList<Rom> = java.util.concurrent.CopyOnWriteArrayList()
    private var areRomsLoaded = AtomicBoolean(false)
    private val directoryStatesLock = Any()
    private val directoryStates: MutableMap<String, DirectoryCacheState> = mutableMapOf()
    private val directoryScanStatuses: MutableMap<String, RomDirectoryScanStatus> = mutableMapOf()
    private val directoryScanStatusFlow = MutableStateFlow<List<RomDirectoryScanStatus>>(emptyList())
    private val romOptionsReadErrorNotifications: MutableSet<String> = mutableSetOf()
    @Volatile private var currentDirectoryUris: Map<String, Uri> = emptyMap()
    @Volatile private var hasUnavailableSearchDirectories = false
    private val skipNextRomDataSave = AtomicBoolean(false)

    init {
        loadDirectoryStates()

        coroutineScope.launch {
            romsChannel.collect {
                if (skipNextRomDataSave.compareAndSet(true, false)) {
                    return@collect
                }
                saveRomData(it)
            }
        }

        coroutineScope.launch {
            settingsRepository.observeRomSearchDirectories().collectLatest { directories ->
                onRomSearchDirectoriesChanged(directories)
            }
        }
    }

    private fun onRomSearchDirectoriesChanged(searchDirectories: Array<Uri>) {
        val newDirectoryMap = searchDirectories.associateBy { it.toString() }
        val previousDirectoryMap = currentDirectoryUris
        currentDirectoryUris = newDirectoryMap

        removeStaleDirectoryStates(newDirectoryMap.keys)

        val removedDirectoryKeys = previousDirectoryMap.keys - newDirectoryMap.keys
        val addedDirectoryKeys = newDirectoryMap.keys - previousDirectoryMap.keys

        val removedDirectoryUris = removedDirectoryKeys.mapNotNull { previousDirectoryMap[it] }.toSet()
        val addedDirectoryStrings = addedDirectoryKeys.toSet()

        if (!areRomsLoaded.get()) {
            return
        }

        if (removedDirectoryUris.isNotEmpty()) {
            removeRomsForDirectories(removedDirectoryUris)
        }

        if (addedDirectoryStrings.isNotEmpty()) {
            coroutineScope.launch {
                scanningStatusSubject.emit(RomScanningStatus.SCANNING)
                val buffer = mutableListOf<Rom>()
                scanForNewRoms(targetDirectories = addedDirectoryStrings).collect {
                    buffer.add(it)
                    if (buffer.size >= 25) {
                        addRoms(buffer)
                        buffer.clear()
                    }
                }
                if (buffer.isNotEmpty()) {
                    addRoms(buffer)
                    buffer.clear()
                }
                scanningStatusSubject.emit(RomScanningStatus.NOT_SCANNING)
            }
        }
    }

    override fun getRoms(): Flow<List<Rom>> = flow {
        if (areRomsLoaded.compareAndSet(false, true)) {
            coroutineScope.launch {
                loadCachedRoms()
            }
        }
        emitAll(romsChannel)
    }

    override fun getRomScanningStatus(): StateFlow<RomScanningStatus> {
        return scanningStatusSubject.asStateFlow()
    }

    override fun observeRomDirectoryScanStatuses(): Flow<List<RomDirectoryScanStatus>> {
        return directoryScanStatusFlow.asStateFlow()
    }

    override suspend fun getRomAtPath(path: String): Rom? {
        return getRoms().first().find { rom ->
            val romPath = FileUtils.getAbsolutePathFromSAFUri(context, rom.uri)
            romPath == path
        }?.let { refreshRomConfigFromOptions(it) }
    }

    override suspend fun getRomAtUri(uri: Uri): Rom? {
        val allRoms = getRoms().first()

        // Quick exact URI match first (no filename needed)
        allRoms.find { rom -> rom.uri == uri }?.let { return refreshRomConfigFromOptions(it) }

        // Pre-filter by filename for performance
        val incomingFileName = DocumentFile.fromSingleUri(context, uri)?.name
        val candidateRoms = if (incomingFileName != null) {
            allRoms.filter { it.fileName == incomingFileName }
        } else {
            allRoms
        }

        // Try to find matching ROM by path, then by size (filename already pre-filtered)
        val cachedRom = findRomByPath(candidateRoms, uri)
            ?: findRomBySize(candidateRoms, uri)

        if (cachedRom != null)
            return refreshRomConfigFromOptions(cachedRom)

        // ROM is not known. Create a new ROM from the URI
        return romFileProcessorFactory.getFileRomProcessorForDocument(uri)
            ?.getRomFromUri(uri, null)
            ?.let { rom ->
                applyRestoredRomMetadata(rom, readRomOptionsConfig(rom))
            }
    }

    private fun findRomByPath(roms: List<Rom>, uri: Uri): Rom? {
        val incomingPath = FileUtils.getAbsolutePathFromSingleUri(context, uri) ?: return null
        return roms.find { rom ->
            FileUtils.getAbsolutePathFromSingleUri(context, rom.uri) == incomingPath
        }
    }

    private fun findRomBySize(roms: List<Rom>, uri: Uri): Rom? {
        val incomingDoc = DocumentFile.fromSingleUri(context, uri)?.takeIf { it.exists() } ?: return null
        val incomingSize = incomingDoc.length()

        return roms.find { rom ->
            val romDoc = DocumentFile.fromSingleUri(context, rom.uri)
            romDoc?.length() == incomingSize
        }
    }

    override fun updateRomConfig(rom: Rom, romConfig: RomConfig) {
        val romIndex = roms.indexOfFirst { it.hasSameFileAsRom(rom) }
        if (romIndex < 0)
            return

        roms[romIndex].config = romConfig
        syncRomOptionsFile(roms[romIndex])
        onRomsChanged()
    }

    override fun setRomLastPlayed(rom: Rom, lastPlayed: Date) {
        val romIndex = roms.indexOfFirst { it.hasSameFileAsRom(rom) }
        if (romIndex < 0)
            return

        rom.lastPlayed = lastPlayed
        roms[romIndex] = rom
        onRomsChanged()
    }

    override fun addRomPlayTime(rom: Rom, playTime: Duration) {
        val romIndex = roms.indexOfFirst { it.hasSameFileAsRom(rom) }
        if (romIndex < 0)
            return

        val romInList = roms[romIndex]
        val updatedRom = romInList.copy(totalPlayTime = romInList.totalPlayTime + playTime)
        roms[romIndex] = updatedRom
        onRomsChanged()
    }

    override fun setRomFavorite(rom: Rom, favorite: Boolean) {
        val romIndex = roms.indexOfFirst { it.hasSameFileAsRom(rom) }
        if (romIndex < 0)
            return

        val romInList = roms[romIndex]
        if (romInList.isFavorite == favorite)
            return

        roms[romIndex] = romInList.copy(isFavorite = favorite)
        onRomsChanged()
    }

    override fun rescanRoms() {
        synchronized(directoryStatesLock) {
            directoryStates.clear()
            directoryScanStatuses.clear()
            emitDirectoryScanStatusesLocked()
        }
        val directoryCacheFile = File(context.filesDir, ROM_DIRECTORY_STATE_FILE)
        if (directoryCacheFile.isFile) {
            directoryCacheFile.delete()
        }

        coroutineScope.launch {
            scanningStatusSubject.emit(RomScanningStatus.SCANNING)
            val buffer = mutableListOf<Rom>()
            scanForNewRoms().collect {
                buffer.add(it)
                if (buffer.size >= 25) {
                    addRoms(buffer)
                    buffer.clear()
                }
            }
            if (buffer.isNotEmpty()) {
                addRoms(buffer)
                buffer.clear()
            }
            scanningStatusSubject.emit(RomScanningStatus.NOT_SCANNING)
        }
    }

    override fun invalidateRoms() {
        if (areRomsLoaded.compareAndSet(true, false)) {
            roms.clear()
        }

        val cacheFile = File(context.filesDir, ROM_DATA_FILE)
        if (cacheFile.isFile) {
            cacheFile.delete()
        }

        val directoryCacheFile = File(context.filesDir, ROM_DIRECTORY_STATE_FILE)
        if (directoryCacheFile.isFile) {
            directoryCacheFile.delete()
        }

        synchronized(directoryStatesLock) {
            directoryStates.clear()
            directoryScanStatuses.clear()
        }

        directoryScanStatusFlow.value = emptyList()
    }

    private fun addRom(rom: Rom) {
        addRoms(listOf(rom))
    }

    private fun addRoms(newRoms: List<Rom>) {
        if (newRoms.isEmpty()) return
        val restoredMetadata = loadRestoredRomMetadata()
        var hasChanges = false

        for (rom in newRoms) {
            val optionsConfig = readRomOptionsConfig(rom)
            val incomingRom = applyRestoredRomMetadataWithCachedMirror(rom, optionsConfig, restoredMetadata)
            val existingRom = roms.find { it.hasSameFileAsRom(rom) }
            if (existingRom == incomingRom) continue

            if (existingRom != null) {
                val updatedRom = existingRom.copy(
                    name = incomingRom.name,
                    developerName = incomingRom.developerName,
                    isDsiWareTitle = incomingRom.isDsiWareTitle,
                    isDsiEnhanced = incomingRom.isDsiEnhanced,
                    retroAchievementsHash = incomingRom.retroAchievementsHash,
                    config = optionsConfig ?: existingRom.config,
                    gameCode = incomingRom.gameCode.takeIf { it.isNotEmpty() } ?: existingRom.gameCode,
                    installedDsiWareTitleId = incomingRom.installedDsiWareTitleId ?: existingRom.installedDsiWareTitleId,
                )
                roms.remove(existingRom)
                roms.add(updatedRom)
                hasChanges = true
            } else {
                roms.add(incomingRom)
                hasChanges = true
            }
        }

        if (hasChanges) {
            onRomsChanged()
        }
    }

    private fun refreshRomConfigFromOptions(rom: Rom): Rom {
        val optionsConfig = readRomOptionsConfig(rom) ?: return rom
        val updatedRom = applyRestoredRomMetadata(rom, optionsConfig)
        if (updatedRom == rom) {
            return rom
        }

        val romIndex = roms.indexOfFirst { it.hasSameFileAsRom(rom) }
        if (romIndex >= 0) {
            roms[romIndex] = updatedRom
            onRomsChanged()
        }
        return updatedRom
    }

    private fun applyRestoredRomMetadata(rom: Rom, optionsConfig: RomConfig?): Rom {
        val metadata = loadRestoredRomMetadata()
        return applyRestoredRomMetadataWithCachedMirror(rom, optionsConfig, metadata)
    }

    private fun applyRestoredRomMetadataWithCachedMirror(rom: Rom, optionsConfig: RomConfig?, metadata: List<RomMetadataMirrorDto>): Rom {
        val found = metadata.firstOrNull {
            rom.retroAchievementsHash.isNotBlank() && it.retroAchievementsHash == rom.retroAchievementsHash
        } ?: metadata.firstOrNull {
            it.fileName == rom.fileName && it.isDsiWareTitle == rom.isDsiWareTitle
        }
        return if (found != null) {
            rom.copy(
                config = optionsConfig ?: found.config.toModel(),
                lastPlayed = found.lastPlayed,
                totalPlayTime = found.totalPlayTime.milliseconds,
                isFavorite = found.isFavorite,
            )
        } else {
            optionsConfig?.let { rom.copy(config = it) } ?: rom
        }
    }

    private fun loadRestoredRomMetadata(): List<RomMetadataMirrorDto> {
        val metadataFile = File(context.filesDir, ROM_METADATA_MIRROR_FILE)
        if (!metadataFile.isFile) {
            return emptyList()
        }

        return runCatching {
            gson.fromJson<List<RomMetadataMirrorDto>>(FileReader(metadataFile), romMetadataMirrorListType).orEmpty()
        }.onFailure {
            Log.w(TAG, "Failed to parse restored ROM metadata", it)
        }.getOrElse { emptyList() }
    }

    private fun syncRomOptionsFile(rom: Rom) {
        if (shouldPersistRomOptions(rom)) {
            writeRomOptions(rom)
        } else {
            deleteRomOptions(rom)
        }
    }

    private fun shouldPersistRomOptions(rom: Rom): Boolean {
        val defaultConfig = if (rom.isDsiWareTitle) {
            RomConfig.forDsiWareTitle()
        } else {
            RomConfig.default()
        }
        return rom.config != defaultConfig
    }

    private fun readRomOptionsConfig(rom: Rom): RomConfig? {
        val optionsDocument = getRomOptionsDocument(rom) ?: return null
        return runCatching {
            val reader = context.contentResolver.openInputStream(optionsDocument.uri)?.bufferedReader()
                ?: throw IllegalStateException("Could not open ${optionsDocument.uri}")
            reader.use {
                val options = gson.fromJson(it, RomOptionsDto::class.java)
                    ?: throw IllegalStateException("Empty ROM options")
                options.config.toModel()
            }
        }.onFailure { throwable ->
            Log.w(TAG, "Failed to read ROM options for ${rom.fileName}", throwable)
            notifyRomOptionsReadError(optionsDocument)
            rewriteRomOptionsFromCachedConfig(rom)
        }.getOrNull()
    }

    private fun rewriteRomOptionsFromCachedConfig(rom: Rom) {
        if (!shouldPersistRomOptions(rom)) {
            return
        }

        Log.i(TAG, "Rewriting unreadable ROM options from cached config for ${rom.fileName}")
        writeRomOptions(rom)
    }

    private fun writeRomOptions(rom: Rom) {
        val rootDocument = getRomOptionsRootDocument(rom) ?: return
        val optionsFileName = getRomOptionsFileName(rom)
        val optionsDocument = rootDocument.findFile(optionsFileName)
            ?: rootDocument.createFile("application/octet-stream", optionsFileName)
            ?: rootDocument.findFile(optionsFileName)
            ?: return

        runCatching {
            val outputStream = context.contentResolver.openOutputStream(optionsDocument.uri, "wt")
                ?: throw IllegalStateException("Could not open ${optionsDocument.uri}")
            OutputStreamWriter(outputStream).use {
                it.write(gson.toJson(RomOptionsDto(config = RomConfigDto.fromModel(rom.config))))
            }
        }.onFailure {
            Log.w(TAG, "Failed to write ROM options for ${rom.fileName}", it)
        }
    }

    private fun deleteRomOptions(rom: Rom) {
        getRomOptionsDocument(rom)?.let { document ->
            runCatching { document.delete() }.onFailure {
                Log.w(TAG, "Failed to delete ROM options for ${rom.fileName}", it)
            }
        }
    }

    private fun getRomOptionsDocument(rom: Rom): DocumentFile? {
        return getRomOptionsRootDocument(rom)?.findFile(getRomOptionsFileName(rom))
    }

    private fun getRomOptionsRootDocument(rom: Rom): DocumentFile? {
        return runCatching {
            uriHandler.getUriTreeDocument(settingsRepository.getSaveFileDirectory(rom))
        }.onFailure {
            Log.w(TAG, "Failed to resolve ROM options directory for ${rom.fileName}", it)
        }.getOrNull()
    }

    private fun getRomOptionsFileName(rom: Rom): String {
        val romFileName = rom.fileName.ifBlank {
            uriHandler.getUriDocument(rom.uri)?.name ?: rom.name
        }
        return romFileName.replaceAfterLast('.', "opts", "$romFileName.opts")
    }

    private fun notifyRomOptionsReadError(optionsDocument: DocumentFile) {
        val notificationKey = optionsDocument.uri.toString()
        val shouldNotify = synchronized(romOptionsReadErrorNotifications) {
            romOptionsReadErrorNotifications.add(notificationKey)
        }
        if (!shouldNotify) {
            return
        }

        mainHandler.post {
            Toast.makeText(context, R.string.rom_options_read_error, Toast.LENGTH_SHORT).show()
        }
    }

    private fun removeRom(rom: Rom, notifyChanged: Boolean = true) {
        if (roms.removeAll { it.hasSameFileAsRom(rom) } && notifyChanged) {
            onRomsChanged()
        }
    }

    private fun removeAllRoms() {
        roms.clear()
        onRomsChanged()
    }

    private fun removeRomsForDirectories(directoryUris: Set<Uri>) {
        if (directoryUris.isEmpty()) {
            return
        }

        val directoryDocIds = directoryUris.mapNotNull { uri ->
            runCatching { DocumentsContract.getTreeDocumentId(uri) }.getOrNull()
        }

        if (directoryDocIds.isEmpty()) {
            return
        }

        val removed = roms.removeAll { rom ->
            val parentUri = rom.parentTreeUri ?: return@removeAll false
            val parentDocId = runCatching { DocumentsContract.getDocumentId(parentUri) }.getOrNull() ?: return@removeAll false
            directoryDocIds.any { parentDocId.startsWith(it) }
        }

        if (removed) {
            onRomsChanged()
        }
    }

    private fun onRomsChanged(persist: Boolean = true) {
        if (!persist || hasUnavailableSearchDirectories) {
            skipNextRomDataSave.set(true)
        }
        romsChannel.tryEmit(roms.toList())
    }

    private suspend fun loadCachedRoms() {
        scanningStatusSubject.emit(RomScanningStatus.SCANNING)
        try {
            val prefs = context.getSharedPreferences("fs_roms_repo_meta", Context.MODE_PRIVATE)
            val appCacheVersion = prefs.getInt("rom_cache_schema_version", 0)
            if (appCacheVersion < 260) {
                prefs.edit().putInt("rom_cache_schema_version", 260).apply()
                synchronized(directoryStatesLock) {
                    directoryStates.clear()
                    directoryScanStatuses.clear()
                    emitDirectoryScanStatusesLocked()
                }
                saveDirectoryStates()
            }

            val searchDirectories = settingsRepository.getRomSearchDirectories()
            val unavailableDirectories = updateUnavailableSearchDirectories(searchDirectories)
            val cacheReadResult = getCachedRoms()
            val cachedRoms = if (unavailableDirectories.isEmpty()) {
                cacheReadResult.roms
            } else {
                cacheReadResult.roms.filterNot { rom ->
                    unavailableDirectories.any { directoryUri -> isRomInDirectory(rom, directoryUri) }
                }
            }

            val validCachedRoms = if (searchDirectories.isNotEmpty()) {
                cachedRoms.filter { rom ->
                    searchDirectories.any { directoryUri -> isRomInDirectory(rom, directoryUri) }
                }
            } else {
                emptyList()
            }

            if (validCachedRoms.isEmpty() && searchDirectories.isNotEmpty() && unavailableDirectories.isEmpty()) {
                Log.w(TAG, "ROM cache is empty but search directories exist; forcing full rescan")
                synchronized(directoryStatesLock) {
                    directoryStates.clear()
                    directoryScanStatuses.clear()
                    emitDirectoryScanStatusesLocked()
                }
                saveDirectoryStates()
            }

            val fixedCachedRoms = validCachedRoms.map { rom ->
                if (!rom.isDsiWareTitle && (rom.fileName.endsWith(".dsi", ignoreCase = true) || rom.uri.path?.endsWith(".dsi", ignoreCase = true) == true)) {
                    rom.copy(isDsiWareTitle = true, config = RomConfig.forDsiWareTitle())
                } else {
                    rom
                }
            }

            roms.addAll(fixedCachedRoms)
            if (fixedCachedRoms.isNotEmpty() || cacheReadResult.isValid) {
                onRomsChanged(persist = unavailableDirectories.isEmpty())
            }

            var scannedRom = false
            try {
                val buffer = mutableListOf<Rom>()
                scanForNewRoms().collect {
                    scannedRom = true
                    buffer.add(it)
                    if (buffer.size >= 25) {
                        addRoms(buffer)
                        buffer.clear()
                    }
                }
                if (buffer.isNotEmpty()) {
                    addRoms(buffer)
                    buffer.clear()
                }
            } catch (e: Exception) {
                Log.e(TAG, "Error during scanForNewRoms", e)
            }
            if (!cacheReadResult.isValid && !scannedRom) {
                onRomsChanged(persist = false)
            }
        } catch (e: Exception) {
            Log.e(TAG, "Error in loadCachedRoms", e)
        } finally {
            scanningStatusSubject.emit(RomScanningStatus.NOT_SCANNING)
        }
    }

    private fun scanForNewRoms(targetDirectories: Set<String>? = null): Flow<Rom> = flow {
        val directories = settingsRepository.getRomSearchDirectories()
        updateUnavailableSearchDirectories(directories)
        for (directory in directories) {
            val directoryString = directory.toString()
            if (targetDirectories != null && !targetDirectories.contains(directoryString)) {
                continue
            }
            if (!hasPersistedReadPermission(directory)) {
                Log.w(TAG, "ROM directory permission is missing; reauthorization required for $directory")
                markDirectoryNotScanned(directory, getDirectoryState(directory)?.lastScanned)
                continue
            }
            val documentFile = DocumentFile.fromTreeUri(context, directory)
            if (documentFile != null) {
                processDirectory(directory, documentFile, this)
            } else {
                markDirectoryNotScanned(directory, null)
            }
        }
    }

    private suspend fun processDirectory(directoryUri: Uri, directoryDocument: DocumentFile, collector: FlowCollector<Rom>) {
        val cachedState = getDirectoryState(directoryUri)
        val fileStates = collectDirectoryFileStates(directoryDocument)
        if (fileStates == null) {
            if (!directoryDocument.exists() || !directoryDocument.canRead()) {
                Log.w(TAG, "ROM directory is not readable; preserving cached ROM data for $directoryUri")
            } else {
                Log.w(TAG, "ROM directory scan failed; preserving cached ROM data for $directoryUri")
            }
            markDirectoryNotScanned(directoryUri, cachedState?.lastScanned)
            return
        }

        val directoryHash = computeDirectoryHash(fileStates)
        val now = System.currentTimeMillis()

        val hasRomsForDirectory = roms.any { isRomInDirectory(it, directoryUri) }
        if (cachedState != null && cachedState.hash == directoryHash && hasRomsForDirectory) {
            val refreshedState = cachedState.copy(lastScanned = now)
            updateDirectoryState(refreshedState, RomDirectoryScanStatus.ScanResult.UNCHANGED)
            return
        }

        val cachedFiles = cachedState?.files ?: emptyMap()
        val currentFiles = fileStates.associateBy { it.uri.toString() }
        val currentRomUris = roms.map { it.uri.toString() }.toSet()

        val directoryMetadataChanged = cachedState != null &&
            cachedState.hash != directoryHash &&
            cachedFiles.keys == currentFiles.keys &&
            currentFiles.all { (uri, fileState) ->
                cachedFiles[uri]?.let { cachedFile ->
                    cachedFile.lastModified == fileState.lastModified && cachedFile.size == fileState.size
                } == true
            }
        val updatedFiles = if (directoryMetadataChanged) {
            fileStates
        } else {
            fileStates.filter { fileState ->
                val uriStr = fileState.uri.toString()
                val cachedFile = cachedFiles[uriStr]
                cachedFile == null ||
                    cachedFile.lastModified != fileState.lastModified ||
                    cachedFile.size != fileState.size ||
                    uriStr !in currentRomUris
            }
        }

        val removedFiles = cachedFiles.keys - currentFiles.keys
        removeRomsByUriStrings(removedFiles)

        val updatedExistingUris = updatedFiles.mapNotNull { fileState ->
            fileState.uri.toString().takeIf { cachedFiles.containsKey(it) }
        }.toSet()
        removeRomsByUriStrings(updatedExistingUris)

        val updatedFileUris = updatedFiles.map { it.uri.toString() }.toSet()
        val processedUpdatedFileUris = java.util.concurrent.ConcurrentHashMap.newKeySet<String>()

        val parallelism = (Runtime.getRuntime().availableProcessors() * 2).coerceIn(4, 16)
        val semaphore = Semaphore(parallelism)

        val scannedRoms = coroutineScope {
            updatedFiles.map { fileState ->
                async(Dispatchers.IO) {
                    semaphore.withPermit {
                        runCatching {
                            val fileName = fileState.documentFile.name ?: fileState.uri.lastPathSegment?.substringAfterLast('/') ?: ""
                            val fileRomProcessor = romFileProcessorFactory.getFileRomProcessorForFileName(fileName)
                                ?: romFileProcessorFactory.getFileRomProcessorForDocument(fileState.documentFile)
                                ?: return@runCatching null
                            val rom = fileRomProcessor.getRomFromUri(fileState.uri, fileState.parentUri)
                                ?: return@runCatching null

                            processedUpdatedFileUris.add(fileState.uri.toString())
                            rom
                        }.getOrElse {
                            Log.e(TAG, "Failed to process file at ${fileState.uri}", it)
                            null
                        }
                    }
                }
            }.awaitAll().filterNotNull()
        }

        for (rom in scannedRoms) {
            collector.emit(rom)
        }

        val cacheableFiles = currentFiles.filterKeys { uri ->
            !updatedFileUris.contains(uri) || processedUpdatedFileUris.contains(uri)
        }

        val newCacheState = DirectoryCacheState(
            directoryUri = directoryUri,
            hash = computeDirectoryHash(cacheableFiles.values.toList()),
            lastScanned = now,
            files = cacheableFiles.mapValues { (_, fileState) ->
                DirectoryCacheFile(
                    uri = fileState.uri,
                    lastModified = fileState.lastModified,
                    size = fileState.size
                )
            }
        )

        val scanResult = if (updatedFiles.isEmpty() && removedFiles.isEmpty()) {
            RomDirectoryScanStatus.ScanResult.UNCHANGED
        } else {
            RomDirectoryScanStatus.ScanResult.UPDATED
        }

        updateDirectoryState(newCacheState, scanResult)
    }

    private fun collectDirectoryFileStates(rootDirectory: DocumentFile): List<DirectoryFileState>? {
        val files = mutableListOf<DirectoryFileState>()
        if (collectDirectoryFileStatesFromSaf(rootDirectory.uri, files) && files.isNotEmpty()) {
            return files
        }
        files.clear()
        if (!collectDirectoryFileStatesRecursive(rootDirectory, files)) {
            return null
        }
        return files
    }

    private fun collectDirectoryFileStatesFromSaf(directoryUri: Uri, accumulator: MutableList<DirectoryFileState>): Boolean {
        return try {
            val treeDocumentId = DocumentsContract.getTreeDocumentId(directoryUri)
            val parentDocumentId = if (DocumentsContract.isDocumentUri(context, directoryUri)) {
                DocumentsContract.getDocumentId(directoryUri)
            } else {
                treeDocumentId
            }
            collectDirectoryFileStatesFromSafRecursive(directoryUri, parentDocumentId, accumulator)
        } catch (e: Exception) {
            Log.w(TAG, "Fast SAF scan failed, falling back to DocumentFile", e)
            false
        }
    }

    private fun collectDirectoryFileStatesFromSafRecursive(directoryUri: Uri, parentDocId: String, accumulator: MutableList<DirectoryFileState>): Boolean {
        val childrenUri = DocumentsContract.buildChildDocumentsUriUsingTree(directoryUri, parentDocId)
        val projection = arrayOf(
            DocumentsContract.Document.COLUMN_DOCUMENT_ID,
            DocumentsContract.Document.COLUMN_DISPLAY_NAME,
            DocumentsContract.Document.COLUMN_MIME_TYPE,
            DocumentsContract.Document.COLUMN_LAST_MODIFIED,
            DocumentsContract.Document.COLUMN_SIZE
        )
        context.contentResolver.query(childrenUri, projection, null, null, null)?.use { cursor ->
            val idIndex = cursor.getColumnIndex(DocumentsContract.Document.COLUMN_DOCUMENT_ID)
            val nameIndex = cursor.getColumnIndex(DocumentsContract.Document.COLUMN_DISPLAY_NAME)
            val mimeIndex = cursor.getColumnIndex(DocumentsContract.Document.COLUMN_MIME_TYPE)
            val modIndex = cursor.getColumnIndex(DocumentsContract.Document.COLUMN_LAST_MODIFIED)
            val sizeIndex = cursor.getColumnIndex(DocumentsContract.Document.COLUMN_SIZE)

            if (idIndex < 0) return false

            while (cursor.moveToNext()) {
                val docId = cursor.getString(idIndex) ?: continue
                val displayName = if (nameIndex >= 0) cursor.getString(nameIndex) ?: "" else ""
                val mimeType = if (mimeIndex >= 0) cursor.getString(mimeIndex) else null
                val lastModified = if (modIndex >= 0) cursor.getLong(modIndex).coerceAtLeast(0) else 0L
                val size = if (sizeIndex >= 0) cursor.getLong(sizeIndex).coerceAtLeast(0) else 0L

                val fileUri = DocumentsContract.buildDocumentUriUsingTree(directoryUri, docId)
                val parentUri = DocumentsContract.buildDocumentUriUsingTree(directoryUri, parentDocId)

                if (DocumentsContract.Document.MIME_TYPE_DIR == mimeType) {
                    if (!collectDirectoryFileStatesFromSafRecursive(directoryUri, docId, accumulator)) {
                        return false
                    }
                } else {
                    val processor = romFileProcessorFactory.getFileRomProcessorForFileName(displayName)

                    if (processor != null) {
                        val docFile = DocumentFile.fromTreeUri(context, fileUri)
                            ?: DocumentFile.fromFile(java.io.File(displayName))
                        accumulator.add(
                            DirectoryFileState(
                                uri = fileUri,
                                parentUri = parentUri,
                                lastModified = lastModified,
                                size = size,
                                documentFile = docFile
                            )
                        )
                    }
                }
            }
        } ?: return false
        return true
    }

    private fun collectDirectoryFileStatesRecursive(currentDirectory: DocumentFile, accumulator: MutableList<DirectoryFileState>): Boolean {
        if (!currentDirectory.exists() || !currentDirectory.canRead()) {
            Log.w(TAG, "Cannot read ROM directory ${currentDirectory.uri}")
            return false
        }

        val files = try {
            currentDirectory.listFiles()
        } catch (e: Exception) {
            Log.w(TAG, "Failed to list files for directory ${currentDirectory.uri}", e)
            return false
        }
        for (file in files) {
            if (file.isDirectory) {
                if (!collectDirectoryFileStatesRecursive(file, accumulator)) {
                    return false
                }
                continue
            }

            val fileProcessor = romFileProcessorFactory.getFileRomProcessorForDocument(file)
                ?: file.name?.let { romFileProcessorFactory.getFileRomProcessorForFileName(it) }
            if (fileProcessor != null) {
                accumulator.add(
                    DirectoryFileState(
                        uri = file.uri,
                        parentUri = currentDirectory.uri,
                        lastModified = file.lastModified().coerceAtLeast(0),
                        size = file.length().coerceAtLeast(0),
                        documentFile = file
                    )
                )
            }
        }
        return true
    }

    private fun computeDirectoryHash(fileStates: List<DirectoryFileState>): String {
        val digest = MessageDigest.getInstance("SHA-256")
        digest.update("rom-directory-cache-v7".toByteArray())
        fileStates.sortedBy { it.uri.toString() }.forEach { state ->
            val entry = "${state.uri}|${state.lastModified}|${state.size}"
            digest.update(entry.toByteArray())
        }
        return digest.digest().joinToString("") { "%02x".format(it) }
    }

    private fun getDirectoryState(directoryUri: Uri): DirectoryCacheState? {
        return synchronized(directoryStatesLock) {
            directoryStates[directoryUri.toString()]
        }
    }

    private fun updateDirectoryState(state: DirectoryCacheState, scanResult: RomDirectoryScanStatus.ScanResult) {
        synchronized(directoryStatesLock) {
            directoryStates[state.directoryUri.toString()] = state
            directoryScanStatuses[state.directoryUri.toString()] = RomDirectoryScanStatus(
                directoryUri = state.directoryUri,
                lastScanTimestamp = state.lastScanned,
                result = scanResult
            )
            emitDirectoryScanStatusesLocked()
        }
        saveDirectoryStates()
    }

    private fun markDirectoryNotScanned(directoryUri: Uri, lastScanTimestamp: Long?) {
        synchronized(directoryStatesLock) {
            directoryScanStatuses[directoryUri.toString()] = RomDirectoryScanStatus(
                directoryUri = directoryUri,
                lastScanTimestamp = lastScanTimestamp,
                result = RomDirectoryScanStatus.ScanResult.NOT_SCANNED
            )
            emitDirectoryScanStatusesLocked()
        }
    }

    private fun removeRomsByUriStrings(uriStrings: Set<String>) {
        if (uriStrings.isEmpty()) {
            return
        }

        if (roms.removeAll { uriStrings.contains(it.uri.toString()) }) {
            onRomsChanged()
        }
    }

    private fun removeStaleDirectoryStates(validDirectoryUris: Set<String>) {
        var hasChanged = false
        synchronized(directoryStatesLock) {
            val iterator = directoryStates.keys.iterator()
            while (iterator.hasNext()) {
                val key = iterator.next()
                if (!validDirectoryUris.contains(key)) {
                    iterator.remove()
                    directoryScanStatuses.remove(key)
                    hasChanged = true
                }
            }
            if (hasChanged) {
                emitDirectoryScanStatusesLocked()
            }
        }

        if (hasChanged) {
            saveDirectoryStates()
        }
    }

    private fun updateUnavailableSearchDirectories(searchDirectories: Array<Uri>): List<Uri> {
        val unavailableDirectories = searchDirectories.filterNot { hasPersistedReadPermission(it) }
        hasUnavailableSearchDirectories = unavailableDirectories.isNotEmpty()
        unavailableDirectories.forEach { directoryUri ->
            Log.w(TAG, "ROM search directory has no persisted read permission; cache will not be trusted for $directoryUri")
            markDirectoryNotScanned(directoryUri, getDirectoryState(directoryUri)?.lastScanned)
        }
        return unavailableDirectories
    }

    private fun hasPersistedReadPermission(directoryUri: Uri): Boolean {
        if (directoryUri.scheme != "content") {
            return true
        }
        val document = DocumentFile.fromTreeUri(context, directoryUri)
        if (document?.canRead() == true) {
            return true
        }
        return context.contentResolver.persistedUriPermissions.any { permission ->
            permission.isReadPermission && (permission.uri == directoryUri || permission.uri.toString() == directoryUri.toString())
        }
    }

    private fun isRomInDirectory(rom: Rom, directoryUri: Uri): Boolean {
        val parentUri = rom.parentTreeUri
        val directoryDocId = runCatching { DocumentsContract.getTreeDocumentId(directoryUri) }.getOrNull()
        if (directoryDocId != null) {
            val parentDocId = parentUri?.let {
                runCatching { DocumentsContract.getDocumentId(it) }.getOrNull()
                    ?: runCatching { DocumentsContract.getTreeDocumentId(it) }.getOrNull()
                    ?: it.lastPathSegment
            }
            if (parentDocId != null && parentDocId.startsWith(directoryDocId)) {
                return true
            }
            val romDocId = runCatching { DocumentsContract.getDocumentId(rom.uri) }.getOrNull()
                ?: rom.uri.lastPathSegment
            if (romDocId != null && romDocId.startsWith(directoryDocId)) {
                return true
            }
        }
        val dirSegment = directoryUri.lastPathSegment ?: directoryUri.toString()
        return rom.uri.toString().contains(dirSegment) || rom.parentTreeUri?.toString() == directoryUri.toString()
    }

    private fun loadDirectoryStates() {
        val cacheFile = File(context.filesDir, ROM_DIRECTORY_STATE_FILE)
        if (!cacheFile.isFile) {
            return
        }

        runCatching {
            java.io.BufferedReader(java.io.InputStreamReader(java.io.FileInputStream(cacheFile), Charsets.UTF_8), 65536).use { reader ->
                gson.fromJson<List<RomDirectoryStateDto>>(reader, directoryStateListType)
            }
        }.onSuccess { stateDtos ->
            if (stateDtos != null) {
                synchronized(directoryStatesLock) {
                    directoryStates.clear()
                    directoryScanStatuses.clear()
                    stateDtos.forEach { dto ->
                        val state = dto.toCacheState()
                        directoryStates[state.directoryUri.toString()] = state
                        directoryScanStatuses[state.directoryUri.toString()] = RomDirectoryScanStatus(
                            directoryUri = state.directoryUri,
                            lastScanTimestamp = state.lastScanned.takeIf { it > 0 },
                            result = RomDirectoryScanStatus.ScanResult.UNCHANGED
                        )
                    }
                    emitDirectoryScanStatusesLocked()
                }
            }
        }.onFailure {
            Log.w(TAG, "Failed to load ROM directory cache", it)
        }
    }

    private fun emitDirectoryScanStatusesLocked() {
        directoryScanStatusFlow.value = directoryScanStatuses.values.sortedBy { it.directoryUri.toString() }
    }

    private fun saveDirectoryStates() {
        val directoryStateDtos = synchronized(directoryStatesLock) {
            directoryStates.values.map { it.toDto() }
        }

        val cacheFile = File(context.filesDir, ROM_DIRECTORY_STATE_FILE)
        try {
            val json = gson.toJson(directoryStateDtos)
            writeTextAtomically(cacheFile, json)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to save ROM directory cache", e)
        }
    }

    private fun getCachedRoms(): RomCacheReadResult {
        val cacheFile = File(context.filesDir, ROM_DATA_FILE)
        if (!cacheFile.isFile) {
            return RomCacheReadResult(emptyList(), true)
        }

        return runCatching {
            java.io.BufferedReader(java.io.InputStreamReader(java.io.FileInputStream(cacheFile), Charsets.UTF_8), 65536).use { reader ->
                gson.fromJson<List<RomDto>>(reader, romListType).orEmpty().map {
                    it.toModel()
                }
            }
        }.map {
            RomCacheReadResult(it, true)
        }.onFailure {
            Log.w(TAG, "Failed to parse cached ROM data; cache will be rebuilt", it)
        }.getOrElse { RomCacheReadResult(emptyList(), false) }
    }

    private fun saveRomData(romData: List<Rom>) {
        val cacheFile = File(context.filesDir, ROM_DATA_FILE)

        try {
            val romDtos = romData.map {
                RomDto.fromModel(it)
            }
            val romsJson = gson.toJson(romDtos)

            writeTextAtomically(cacheFile, romsJson)
            saveRomMetadataMirror(romData)
            settingsBackupManager.requestMirrorWrite()
        } catch (e: Exception) {
            Log.e(TAG, "Failed to save ROM data", e)
        }
    }

    private fun saveRomMetadataMirror(romData: List<Rom>) {
        val metadataFile = File(context.filesDir, ROM_METADATA_MIRROR_FILE)
        val metadata = romData.map {
            RomMetadataMirrorDto(
                name = it.name,
                developerName = it.developerName,
                fileName = it.fileName,
                config = RomConfigDto.fromModel(it.config),
                lastPlayed = it.lastPlayed,
                isDsiWareTitle = it.isDsiWareTitle,
                isDsiEnhanced = it.isDsiEnhanced,
                retroAchievementsHash = it.retroAchievementsHash,
                totalPlayTime = it.totalPlayTime.inWholeMilliseconds,
                isFavorite = it.isFavorite,
            )
        }
        writeTextAtomically(metadataFile, gson.toJson(metadata))
    }

    private fun writeTextAtomically(file: File, text: String) {
        val tempFile = File(file.parentFile, "${file.name}.tmp")
        FileOutputStream(tempFile).use { stream ->
            val writer = OutputStreamWriter(stream)
            writer.write(text)
            writer.flush()
            runCatching { stream.fd.sync() }
        }

        if (!tempFile.renameTo(file)) {
            if (file.exists() && !file.delete()) {
                throw IllegalStateException("Could not replace ${file.absolutePath}")
            }
            if (!tempFile.renameTo(file)) {
                throw IllegalStateException("Could not move ${tempFile.absolutePath} to ${file.absolutePath}")
            }
        }
    }

    private data class RomCacheReadResult(
        val roms: List<Rom>,
        val isValid: Boolean,
    )

    private data class DirectoryCacheState(
        val directoryUri: Uri,
        val hash: String,
        val lastScanned: Long,
        val files: Map<String, DirectoryCacheFile>
    ) {
        fun toDto(): RomDirectoryStateDto {
            return RomDirectoryStateDto(
                directoryUri = directoryUri.toString(),
                hash = hash,
                lastScanned = lastScanned,
                files = files.values.map {
                    RomDirectoryFileDto(
                        uri = it.uri.toString(),
                        lastModified = it.lastModified,
                        size = it.size
                    )
                }
            )
        }
    }

    private data class DirectoryCacheFile(
        val uri: Uri,
        val lastModified: Long,
        val size: Long
    )

    private data class DirectoryFileState(
        val uri: Uri,
        val parentUri: Uri,
        val lastModified: Long,
        val size: Long,
        val documentFile: DocumentFile
    )

    private data class RomMetadataMirrorDto(
        val name: String,
        val developerName: String,
        val fileName: String,
        val config: RomConfigDto,
        val lastPlayed: Date? = null,
        val isDsiWareTitle: Boolean,
        val isDsiEnhanced: Boolean = false,
        val retroAchievementsHash: String,
        val totalPlayTime: Long = 0,
        val isFavorite: Boolean = false,
    )

    private data class RomOptionsDto(
        val version: Int = 1,
        val config: RomConfigDto,
    )

    private fun RomDirectoryStateDto.toCacheState(): DirectoryCacheState {
        val fileEntries = files.associateBy({ it.uri }) {
            DirectoryCacheFile(
                uri = it.uri.toUri(),
                lastModified = it.lastModified,
                size = it.size
            )
        }
        return DirectoryCacheState(
            directoryUri = directoryUri.toUri(),
            hash = hash,
            lastScanned = lastScanned,
            files = fileEntries
        )
    }
}
