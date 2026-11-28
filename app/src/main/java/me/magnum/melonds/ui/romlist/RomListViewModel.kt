package me.magnum.melonds.ui.romlist

import android.content.Context
import android.net.Uri
import android.provider.DocumentsContract
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.sync.Semaphore
import kotlinx.coroutines.sync.withPermit
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import me.magnum.melonds.common.DirectoryAccessValidator
import me.magnum.melonds.common.Permission
import me.magnum.melonds.common.UriPermissionManager
import me.magnum.melonds.domain.model.RomFilter
import me.magnum.melonds.domain.model.RomViewMode
import me.magnum.melonds.domain.model.SortingMode
import me.magnum.melonds.domain.model.SortingOrder
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.domain.model.rom.RomDirectoryScanStatus
import me.magnum.melonds.domain.repositories.RetroAchievementsRepository
import me.magnum.melonds.domain.repositories.RomsRepository
import me.magnum.melonds.domain.repositories.SettingsRepository
import me.magnum.melonds.impl.RomIconProvider
import me.magnum.melonds.ui.quickresume.QuickResumeStore
import me.magnum.melonds.utils.EventSharedFlow
import me.magnum.melonds.utils.SubjectSharedFlow
import java.text.Normalizer
import java.util.Calendar
import javax.inject.Inject

@HiltViewModel
class RomListViewModel @Inject constructor(
    @param:ApplicationContext private val context: Context,
    private val romsRepository: RomsRepository,
    private val settingsRepository: SettingsRepository,
    private val romIconProvider: RomIconProvider,
    private val uriPermissionManager: UriPermissionManager,
    private val directoryAccessValidator: DirectoryAccessValidator,
    private val retroAchievementsRepository: RetroAchievementsRepository,
    private val boxArtRepository: me.magnum.melonds.ui.romlist.boxart.BoxArtRepository,
    private val dsiStorageTitlesScanner: me.magnum.melonds.impl.dsinand.DsiStorageTitlesScanner,
    private val saveStatesRepository: me.magnum.melonds.domain.repositories.SaveStatesRepository,
    private val romSaveFileManager: me.magnum.melonds.impl.RomSaveFileManager,
    private val sgwCatalogRepository: me.magnum.melonds.sgw.SgwCatalogRepository,
) : ViewModel() {

    val sgwUpdatesByUri: StateFlow<Map<String, me.magnum.melonds.sgw.SgwUpdateCandidate>> =
        sgwCatalogRepository.snapshot
            .map { snap -> snap.updates.associateBy { it.localRom.uri.toString() } }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyMap())

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    private val _boxArtByUri = MutableStateFlow<Map<String, String>>(emptyMap())

    init {
        QuickResumeStore.ensureQuickSavesLoaded(context)
        viewModelScope.launch(Dispatchers.IO) {
            val cached = runCatching { boxArtRepository.getAllCachedMatches() }.getOrDefault(emptyMap())
            if (cached.isNotEmpty()) {
                _boxArtByUri.update { current -> cached + current.filterValues { it.isNotEmpty() } }
            }
            boxArtRepository.coverUpdates.collect { (uri, url) ->
                _boxArtByUri.update { current ->
                    if (url != null) current + (uri to url) else current - uri
                }
            }
        }
        viewModelScope.launch(Dispatchers.IO) {
            boxArtRepository.indexReady
                .collect { ready ->
                    if (ready && pendingBoxArtRoms.isNotEmpty()) {
                        val toRetry = pendingBoxArtRoms.keys.toList().mapNotNull { pendingBoxArtRoms.remove(it) }
                        toRetry.forEach { requestBoxArt(it) }
                    }
                }
        }
    }

    val isRaCoverEnabled: StateFlow<Boolean> = settingsRepository.observeRaCoverEnabled()
        .stateIn(viewModelScope, SharingStarted.Eagerly, settingsRepository.isRaCoverEnabled())

    val boxArtByUri: StateFlow<Map<String, String>> = _boxArtByUri.asStateFlow()

    private val boxArtRequestsInFlight = mutableSetOf<String>()
    private val pendingBoxArtRoms = java.util.concurrent.ConcurrentHashMap<String, Rom>()
    private val raCoverRequestsInFlight = mutableSetOf<String>()
    private val raCoverAttemptedHashes = mutableSetOf<String>()
    private val boxArtSemaphore = Semaphore(12)

    fun requestBoxArt(rom: Rom) {
        val isRaEnabled = settingsRepository.isRaCoverEnabled()
        val isScraperEnabled = settingsRepository.isGameTdbCoversEnabled()
        val is2dEnabled = settingsRepository.isGameTdb2dCoversEnabled()
        val is3dEnabled = settingsRepository.isGameTdb3dCoversEnabled()

        if (!isRaEnabled && !isScraperEnabled && !is2dEnabled && !is3dEnabled) return

        if (isRaEnabled && rom.retroAchievementsHash.isNotBlank()) {
            val raHash = rom.retroAchievementsHash
            if (!raCoverByHash.value.containsKey(raHash)) {
                val shouldFetchRa: Boolean
                synchronized(raCoverRequestsInFlight) {
                    shouldFetchRa = !raCoverAttemptedHashes.contains(raHash) && raCoverRequestsInFlight.add(raHash)
                }
                if (shouldFetchRa) {
                    viewModelScope.launch(Dispatchers.IO) {
                        try {
                            retroAchievementsRepository.getUserGameData(raHash, false)
                            synchronized(raCoverRequestsInFlight) {
                                raCoverAttemptedHashes.add(raHash)
                            }
                        } catch (e: kotlinx.coroutines.CancellationException) {
                            throw e
                        } catch (_: Throwable) {
                            synchronized(raCoverRequestsInFlight) {
                                raCoverAttemptedHashes.add(raHash)
                            }
                        } finally {
                            synchronized(raCoverRequestsInFlight) {
                                raCoverRequestsInFlight.remove(raHash)
                            }
                        }
                    }
                }
            }
        }

        if (isScraperEnabled) {
            val key = rom.uri.toString()
            if (!_boxArtByUri.value.containsKey(key)) {
                val shouldFetchBoxArt: Boolean
                synchronized(boxArtRequestsInFlight) {
                    shouldFetchBoxArt = boxArtRequestsInFlight.add(key)
                }
                if (shouldFetchBoxArt) {
                    viewModelScope.launch(Dispatchers.IO) {
                        try {
                            val result = boxArtSemaphore.withPermit {
                                runCatching { boxArtRepository.resolveBoxArt(rom) }.getOrNull()
                            }
                            when (result) {
                                is me.magnum.melonds.ui.romlist.boxart.BoxArtRepository.BoxArtResult.Found -> {
                                    pendingBoxArtRoms.remove(key)
                                    _boxArtByUri.update { it + (key to result.url) }
                                }
                                me.magnum.melonds.ui.romlist.boxart.BoxArtRepository.BoxArtResult.NotFound -> {
                                    pendingBoxArtRoms.remove(key)
                                    _boxArtByUri.update { it + (key to "") }
                                }
                                me.magnum.melonds.ui.romlist.boxart.BoxArtRepository.BoxArtResult.IndexPending, null -> {
                                    if (!boxArtRepository.indexReady.value) {
                                        pendingBoxArtRoms[key] = rom
                                        if (boxArtRepository.indexReady.value) {
                                            pendingBoxArtRoms.remove(key)?.let { requestBoxArt(it) }
                                        }
                                    }
                                }
                            }
                        } finally {
                            synchronized(boxArtRequestsInFlight) {
                                boxArtRequestsInFlight.remove(key)
                            }
                        }
                    }
                }
            }
        }
    }

    private val _sortingMode = MutableStateFlow(settingsRepository.getRomSortingMode())
    private val _sortingOrder = MutableStateFlow(settingsRepository.getRomSortingOrder())
    private val _filter = MutableStateFlow(RomFilter.ALL)

    val viewMode: StateFlow<RomViewMode> = settingsRepository.observeRomViewMode()
        .stateIn(viewModelScope, SharingStarted.Eagerly, settingsRepository.getRomViewMode())

    val confirmedAchievementHashes: StateFlow<Set<String>> = retroAchievementsRepository.observeKnownAchievementHashes()
        .map { it.toSet() }
        .stateIn(viewModelScope, SharingStarted.Eagerly, emptySet())

    /** True when the user is logged into RetroAchievements. Badge is hidden when false. */
    private val _isRaAuthenticated = MutableStateFlow(retroAchievementsRepository.isUserAuthenticatedSync())
    val isRaAuthenticated: StateFlow<Boolean> = _isRaAuthenticated.asStateFlow()

    fun refreshAuthenticationState() {
        viewModelScope.launch {
            _isRaAuthenticated.value = retroAchievementsRepository.isUserAuthenticated()
        }
    }

    init {
        refreshAuthenticationState()
    }

    /**
     * (rom.retroAchievementsHash -> RA badge URL) for every game whose RA data is cached locally.
     * Returns an empty map when the user has disabled RA covers in settings or when the game is
     * known to have no achievements - that way every ROM falls back to its embedded cartridge icon.
     */
    val raCoverByHash: StateFlow<Map<String, String>> = combine(
        retroAchievementsRepository.observeRomCoverIcons(),
        settingsRepository.observeRaCoverEnabled(),
    ) { covers, enabled ->
        if (!enabled) {
            emptyMap()
        } else {
            covers.mapNotNull { (hash, icon) ->
                icon.url.takeIf { icon.hasAchievements != false }?.let { hash to it }
            }.toMap()
        }
    }.stateIn(viewModelScope, SharingStarted.Eagerly, emptyMap())

    private val _hasSearchDirectories = SubjectSharedFlow<Boolean>()
    val hasSearchDirectories: Flow<Boolean> = _hasSearchDirectories

    private val _invalidDirectoryAccessEvent = EventSharedFlow<Unit>()
    val invalidDirectoryAccessEvent: Flow<Unit> = _invalidDirectoryAccessEvent

    val onRomIconFilteringChanged = settingsRepository.observeRomIconFiltering()

    val romScanningStatus = romsRepository.getRomScanningStatus()

    private val romsWithParents = MutableStateFlow<List<RomWithParent>>(emptyList())
    private val _romsWithSavesUris = MutableStateFlow<Set<String>>(emptySet())
    private val savesRefreshTrigger = MutableStateFlow(0)
    private val rootDirectories = MutableStateFlow<List<RootDirectory>>(emptyList())
    private val _browserState = MutableStateFlow(
        RomBrowserUiState(
            entries = emptyList(),
            breadcrumbs = emptyList(),
            canNavigateUp = false,
            isSearchActive = false,
            isAtVirtualRoot = true
        )
    )
    val browserState = _browserState.asStateFlow()
    private val _directoryStatusUi = MutableStateFlow<List<DirectoryCacheStatusUi>>(emptyList())
    val directoryStatusUi = _directoryStatusUi.asStateFlow()

    init {
        viewModelScope.launch {
            settingsRepository.observeRomSearchDirectories()
                .distinctUntilChanged()
                .collect { directories ->
                    val roots = directories.map { directory ->
                        val treeDocId = runCatching { DocumentsContract.getTreeDocumentId(directory) }.getOrNull()
                        val docId = treeDocId
                            ?: runCatching { DocumentsContract.getDocumentId(directory) }.getOrNull()
                            ?: directory.path
                            ?: directory.toString()
                        val displayName = if (treeDocId != null) {
                            extractDirectoryDisplayName(treeDocId)
                        } else {
                            directory.lastPathSegment?.substringAfterLast('/')?.ifBlank { null }
                                ?: directory.path?.substringAfterLast('/')?.ifBlank { null }
                                ?: docId
                        }
                        val relativePath = if (treeDocId != null) {
                            extractRelativePath(treeDocId)
                        } else {
                            directory.path ?: displayName
                        }
                        RootDirectory(
                            uri = directory,
                            docId = docId,
                            displayName = displayName,
                            relativePath = relativePath,
                        )
                    }

                    rootDirectories.value = roots
                    _hasSearchDirectories.tryEmit(roots.isNotEmpty())
                }
        }

        viewModelScope.launch(Dispatchers.IO) {
            dsiStorageTitlesScanner.refreshStorageTitles()
        }

        viewModelScope.launch {
            combine(
                romsRepository.getRoms(),
                RomDisplayNameManager.modeFlow,
            ) { romList, _ ->
                romList
            }.collect { romList ->
                val romsWithDocIds = withContext(Dispatchers.Default) {
                    romList.map { rom ->
                        val parentDocId = rom.parentTreeUri?.let { uri ->
                            runCatching { DocumentsContract.getDocumentId(uri) }.getOrNull()
                                ?: runCatching { DocumentsContract.getTreeDocumentId(uri) }.getOrNull()
                                ?: uri.lastPathSegment
                        }
                        buildRomWithParent(rom, parentDocId)
                    }
                }
                romsWithParents.value = romsWithDocIds
                if (romList.isNotEmpty()) {
                    viewModelScope.launch(Dispatchers.IO) {
                        sgwCatalogRepository.refreshCatalog(romList, forceRefresh = false)
                    }
                }
            }
        }

        viewModelScope.launch(Dispatchers.IO) {
            combine(romsWithParents, _filter, savesRefreshTrigger) { roms, filter, _ ->
                roms to filter
            }.collectLatest { (roms, filter) ->
                if (filter == RomFilter.HAS_SAVES) {
                    _romsWithSavesUris.value = computeRomsWithSaves(roms.map { it.rom })
                }
            }
        }

        // Compute sorted list once and cache it, so changes in filters (e.g. clicking "Favorites")
        // or typing in the search bar doesn't re-sort the entire 15k+ ROM library each keystroke.
        val sortedRomsFlow = combine(
            romsWithParents,
            _sortingMode,
            _sortingOrder,
            RomDisplayNameManager.modeFlow,
        ) { roms, mode, order, _ ->
            withContext(Dispatchers.Default) {
                Triple(sortRoms(roms, mode, order), mode, order)
            }
        }.stateIn(viewModelScope, SharingStarted.Eagerly, Triple(emptyList<RomWithParent>(), _sortingMode.value, _sortingOrder.value))

        @OptIn(FlowPreview::class)
        val debouncedQuery = _searchQuery
            .debounce(200L)
            .distinctUntilChanged()

        viewModelScope.launch {
            combine(
                sortedRomsFlow,
                debouncedQuery,
                rootDirectories,
                _filter,
                viewMode,
                _sortingOrder,
                _romsWithSavesUris,
                QuickResumeStore.quickSaveTimestampsFlow,
            ) { values: Array<Any?> ->
                @Suppress("UNCHECKED_CAST")
                val sortedTriple = values[0] as Triple<List<RomWithParent>, SortingMode, SortingOrder>
                @Suppress("UNCHECKED_CAST")
                val roots = values[2] as List<RootDirectory>
                @Suppress("UNCHECKED_CAST")
                val romsWithSaves = values[6] as Set<String>
                @Suppress("UNCHECKED_CAST")
                val quickSaveTimestamps = values[7] as Map<String, Long>
                buildBrowserState(
                    sortedRoms = sortedTriple.first,
                    query = values[1] as String,
                    roots = roots,
                    sortingMode = sortedTriple.second,
                    sortingOrder = values[5] as SortingOrder,
                    filter = values[3] as RomFilter,
                    viewMode = values[4] as RomViewMode,
                    romsWithSavesUris = romsWithSaves,
                    quickSaveTimestamps = quickSaveTimestamps,
                )
            }.collect { state ->
                _browserState.value = state
            }
        }

        viewModelScope.launch {
            combine(
                rootDirectories,
                romsRepository.observeRomDirectoryScanStatuses()
            ) { roots, statuses ->
                buildDirectoryStatusUi(roots, statuses)
            }.collect { statusUi ->
                _directoryStatusUi.value = statusUi
            }
        }
    }

    fun refreshRoms() {
        viewModelScope.launch(Dispatchers.IO) {
            dsiStorageTitlesScanner.refreshStorageTitles()
        }
        refreshSavesStatus()
        romsRepository.rescanRoms()
    }

    fun refreshSavesStatus() {
        savesRefreshTrigger.value++
    }

    fun setRomLastPlayedNow(rom: Rom) {
        romsRepository.setRomLastPlayed(rom, Calendar.getInstance().time)
    }

    fun setRomSearchQuery(query: String?) {
        _searchQuery.value = query.orEmpty()
    }

    fun setRomSorting(sortingMode: SortingMode) {
        if (sortingMode == _sortingMode.value) {
            val newSortingOrder = if (_sortingOrder.value == SortingOrder.ASCENDING)
                SortingOrder.DESCENDING
            else
                SortingOrder.ASCENDING

            settingsRepository.setRomSortingOrder(newSortingOrder)
            _sortingOrder.value = newSortingOrder
        } else {
            settingsRepository.setRomSortingMode(sortingMode)
            settingsRepository.setRomSortingOrder(sortingMode.defaultOrder)

            _sortingMode.value = sortingMode
            _sortingOrder.value = sortingMode.defaultOrder
        }
    }

    fun setFilter(filter: RomFilter) {
        _filter.value = filter
    }

    fun cycleFilter(forward: Boolean) {
        val order = RomFilter.values()
        val idx = order.indexOf(_filter.value).coerceAtLeast(0)
        val next = if (forward) (idx + 1) % order.size else (idx - 1 + order.size) % order.size
        _filter.value = order[next]
    }

    fun toggleViewMode() {
        val next = when (viewMode.value) {
            RomViewMode.GRID -> RomViewMode.LIST
            RomViewMode.LIST -> RomViewMode.GRID
        }
        settingsRepository.setRomViewMode(next)
    }

    fun toggleFavorite(rom: Rom) {
        romsRepository.setRomFavorite(rom, !rom.isFavorite)
    }

    fun addRomSearchDirectory(directoryUri: Uri) {
        val accessValidationResult = directoryAccessValidator.getDirectoryAccessForPermission(directoryUri, Permission.READ_WRITE)

        if (accessValidationResult == DirectoryAccessValidator.DirectoryAccessResult.OK) {
            uriPermissionManager.persistDirectoryPermissions(directoryUri, Permission.READ_WRITE)
            settingsRepository.addRomSearchDirectory(directoryUri)
        } else {
            _invalidDirectoryAccessEvent.tryEmit(Unit)
        }
    }

    suspend fun getRomIcon(rom: Rom): RomIcon {
        val romIconBitmap = romIconProvider.getRomIcon(rom)
        val iconFiltering = settingsRepository.getRomIconFiltering()
        return RomIcon(romIconBitmap, iconFiltering)
    }

    private suspend fun buildBrowserState(
        sortedRoms: List<RomWithParent>,
        query: String,
        roots: List<RootDirectory>,
        sortingMode: SortingMode,
        sortingOrder: SortingOrder,
        filter: RomFilter,
        viewMode: RomViewMode,
        romsWithSavesUris: Set<String>,
        quickSaveTimestamps: Map<String, Long>,
    ): RomBrowserUiState = withContext(Dispatchers.Default) {
        val continuePlaying = sortedRoms
            .mapNotNull { it.rom.takeIf { rom -> rom.lastPlayed != null } }
            .sortedByDescending { it.lastPlayed }
            .take(10)

        val quickResumeTimestamp = continuePlaying.firstOrNull()?.let { topRom ->
            quickSaveTimestamps[topRom.uri.toString()]?.takeIf { it > 0L }
        }
        val quickResumeHasSave = quickResumeTimestamp != null && quickResumeTimestamp > 0L

        if (roots.isEmpty()) {
            return@withContext RomBrowserUiState(
                entries = emptyList(),
                breadcrumbs = emptyList(),
                canNavigateUp = false,
                isSearchActive = query.isNotEmpty(),
                isAtVirtualRoot = true,
                searchQuery = query,
                viewMode = viewMode,
                filter = filter,
                sortingMode = sortingMode,
                sortingOrder = sortingOrder,
                continuePlaying = continuePlaying,
                quickResumeHasSaveState = quickResumeHasSave,
                quickResumeSaveTimestamp = quickResumeTimestamp,
                alphabetIndex = emptyMap(),
            )
        }

        if (query.isNotEmpty()) {
            val filtered = filterRoms(sortedRoms, query).filter { matchesFilter(it.rom, filter, romsWithSavesUris) }
            val romEntries = filtered.map { RomBrowserEntry.RomItem(it.rom) }
            return@withContext RomBrowserUiState(
                entries = romEntries,
                breadcrumbs = emptyList(),
                canNavigateUp = false,
                isSearchActive = true,
                isAtVirtualRoot = false,
                searchQuery = query,
                viewMode = viewMode,
                filter = filter,
                sortingMode = sortingMode,
                sortingOrder = sortingOrder,
                continuePlaying = continuePlaying,
                quickResumeHasSaveState = quickResumeHasSave,
                quickResumeSaveTimestamp = quickResumeTimestamp,
                alphabetIndex = computeAlphabetIndex(romEntries, sortingMode),
            )
        }

        val entries = sortedRoms
            .filter { matchesFilter(it.rom, filter, romsWithSavesUris) }
            .map { RomBrowserEntry.RomItem(it.rom) }

        RomBrowserUiState(
            entries = entries,
            breadcrumbs = emptyList(),
            canNavigateUp = false,
            isSearchActive = false,
            isAtVirtualRoot = true,
            searchQuery = query,
            viewMode = viewMode,
            filter = filter,
            sortingMode = sortingMode,
            sortingOrder = sortingOrder,
            continuePlaying = continuePlaying,
            quickResumeHasSaveState = quickResumeHasSave,
            quickResumeSaveTimestamp = quickResumeTimestamp,
            alphabetIndex = computeAlphabetIndex(entries, sortingMode),
        )
    }

    private suspend fun computeRomsWithSaves(roms: List<Rom>): Set<String> = withContext(Dispatchers.IO) {
        val semaphore = Semaphore(8)
        coroutineScope {
            roms.map { rom ->
                async {
                    semaphore.withPermit {
                        val hasSaves = romSaveFileManager.hasSaveFile(rom) ||
                            runCatching { saveStatesRepository.getRomQuickSaveStateSlot(rom).exists }.getOrDefault(false) ||
                            runCatching { saveStatesRepository.getPeriodicAutoSaveSlot(rom).exists }.getOrDefault(false) ||
                            runCatching { saveStatesRepository.getRomSaveStates(rom).any { it.exists } }.getOrDefault(false)
                        if (hasSaves) rom.uri.toString() else null
                    }
                }
            }.awaitAll().filterNotNullTo(HashSet())
        }
    }

    private fun isRomAllowedByDsiStorage(rom: Rom): Boolean {
        // Universal visibility: All ROMs placed by user in their folders must be fully visible and accessible
        return true
    }

    private fun matchesFilter(rom: Rom, filter: RomFilter, romsWithSavesUris: Set<String> = _romsWithSavesUris.value): Boolean {
        if (!isRomAllowedByDsiStorage(rom)) {
            return false
        }
        return when (filter) {
            RomFilter.ALL -> true
            RomFilter.FAVORITES -> rom.isFavorite
            RomFilter.DS_ONLY -> !rom.isDsiWareTitle && !rom.isInstalledDsiWareShortcut && !rom.isDsiEnhanced
            RomFilter.DSI_ENHANCED_ONLY -> rom.isDsiEnhanced
            RomFilter.DSIWARE_ONLY -> rom.isDsiWareTitle || rom.isInstalledDsiWareShortcut
            RomFilter.WITH_RETRO_ACHIEVEMENTS -> rom.retroAchievementsHash.isNotEmpty()
            RomFilter.RECENTLY_PLAYED -> rom.lastPlayed != null
            RomFilter.UNPLAYED -> rom.lastPlayed == null && rom.totalPlayTime.inWholeSeconds <= 0L
            RomFilter.HAS_SAVES -> rom.uri.toString() in romsWithSavesUris
        }
    }

    private fun computeAlphabetIndex(entries: List<RomBrowserEntry>, sortingMode: SortingMode): Map<Char, Int> {
        if (sortingMode != SortingMode.ALPHABETICALLY) return emptyMap()
        val map = LinkedHashMap<Char, Int>()
        var firstRomIndex = -1

        entries.forEachIndexed { index, entry ->
            // Folders aren't part of the alphabet; they get a dedicated folder icon at the top.
            if (entry !is RomBrowserEntry.RomItem) return@forEachIndexed
            if (firstRomIndex == -1) firstRomIndex = index
            val rawName = me.magnum.melonds.ui.romlist.composables.romDisplayName(entry.rom).trim()
            val normalized = java.text.Normalizer.normalize(rawName, java.text.Normalizer.Form.NFKD)
                .replace(Regex("\\p{Mn}+"), "")
            val firstRaw = normalized.firstOrNull() ?: return@forEachIndexed
            val asciiUpper = when {
                firstRaw in 'a'..'z' -> ('A' + (firstRaw - 'a'))
                firstRaw in 'A'..'Z' -> firstRaw
                else -> firstRaw.uppercaseChar()
            }
            val key = when {
                asciiUpper in 'A'..'Z' -> asciiUpper
                asciiUpper.isLetter() -> asciiUpper
                else -> '#'
            }
            map.putIfAbsent(key, index)
        }

        if (firstRomIndex != -1) {
            val resultMap = LinkedHashMap<Char, Int>()
            resultMap['#'] = firstRomIndex
            map.forEach { (k, v) ->
                if (k != '#') resultMap[k] = v
            }
            return resultMap
        }
        return map
    }

    private fun sortRoms(roms: List<RomWithParent>, sortingMode: SortingMode, sortingOrder: SortingOrder): List<RomWithParent> {
        return runCatching {
            val comparator = when (sortingMode) {
                SortingMode.ALPHABETICALLY -> buildAlphabeticalRomComparator(sortingOrder)
                SortingMode.RECENTLY_PLAYED -> buildRecentlyPlayedRomComparator(sortingOrder)
                SortingMode.MOST_PLAYED -> buildMostPlayedRomComparator(sortingOrder)
            }
            roms.sortedWith { o1, o2 -> comparator.compare(o1.rom, o2.rom) }
        }.getOrElse {
            roms
        }
    }

    private fun filterRoms(roms: List<RomWithParent>, query: String): List<RomWithParent> {
        val normalizedQuery = normalizeForSearch(query)
        if (normalizedQuery.isEmpty()) return roms
        return roms.filter { it.searchKey.contains(normalizedQuery) }
    }

    private fun buildRomWithParent(rom: Rom, parentDocId: String?): RomWithParent {
        val searchKey = normalizeForSearch(me.magnum.melonds.ui.romlist.composables.romDisplayName(rom)) +
            "\u0000" + normalizeForSearch(rom.name) +
            "\u0000" + normalizeForSearch(rom.fileName) +
            "\u0000" + normalizeForSearch(rom.developerName) +
            "\u0000" + normalizeForSearch(rom.gameCode) +
            (rom.config.customName?.let { "\u0000" + normalizeForSearch(it) } ?: "")
        return RomWithParent(rom, parentDocId, searchKey)
    }

    private fun extractDirectoryDisplayName(docId: String): String {
        val path = extractRelativePath(docId)
        val segment = path.substringAfterLast('/', path)
        return segment.ifEmpty { path.ifEmpty { docId } }
    }

    private fun extractRelativePath(docId: String): String {
        return Uri.decode(docId.substringAfter(':', docId))
    }

    private fun buildAlphabeticalRomComparator(sortingOrder: SortingOrder): Comparator<Rom> {
        return Comparator { o1: Rom, o2: Rom ->
            val name1 = me.magnum.melonds.ui.romlist.composables.romDisplayName(o1)
            val name2 = me.magnum.melonds.ui.romlist.composables.romDisplayName(o2)
            val result = name1.compareTo(name2, ignoreCase = true).takeIf { it != 0 }
                ?: o1.fileName.compareTo(o2.fileName, ignoreCase = true).takeIf { it != 0 }
                ?: o1.uri.toString().compareTo(o2.uri.toString())
            if (sortingOrder == SortingOrder.ASCENDING) result else -result
        }
    }

    private fun buildRecentlyPlayedRomComparator(sortingOrder: SortingOrder): Comparator<Rom> {
        val nameComparator = buildAlphabeticalRomComparator(SortingOrder.ASCENDING)
        return Comparator { o1: Rom, o2: Rom ->
            val date1 = o1.lastPlayed
            val date2 = o2.lastPlayed
            val dateComparison = when {
                date1 == null && date2 == null -> 0
                date1 == null -> 1
                date2 == null -> -1
                else -> if (sortingOrder == SortingOrder.ASCENDING) date1.compareTo(date2) else date2.compareTo(date1)
            }
            if (dateComparison != 0) dateComparison else nameComparator.compare(o1, o2)
        }
    }

    private fun buildMostPlayedRomComparator(sortingOrder: SortingOrder): Comparator<Rom> {
        val nameComparator = buildAlphabeticalRomComparator(SortingOrder.ASCENDING)
        return Comparator { o1, o2 ->
            val playTimeComparison = if (sortingOrder == SortingOrder.ASCENDING) {
                o1.totalPlayTime.compareTo(o2.totalPlayTime)
            } else {
                o2.totalPlayTime.compareTo(o1.totalPlayTime)
            }
            if (playTimeComparison != 0) playTimeComparison else nameComparator.compare(o1, o2)
        }
    }


    private fun buildDirectoryStatusUi(
        roots: List<RootDirectory>,
        statuses: List<RomDirectoryScanStatus>
    ): List<DirectoryCacheStatusUi> {
        val statusMap = statuses.associateBy { it.directoryUri.toString() }
        return roots.map { root ->
            val status = statusMap[root.uri.toString()]
            DirectoryCacheStatusUi(
                directoryName = root.displayName,
                lastScanTimestamp = status?.lastScanTimestamp,
                result = status?.result ?: RomDirectoryScanStatus.ScanResult.NOT_SCANNED
            )
        }
    }

    private data class RomWithParent(
        val rom: Rom,
        val parentDocId: String?,
        // Pre-computed (NFD, ASCII-only, lowercase) name + filename for fast search.
        // Avoids re-normalizing 15k+ ROMs on every search keystroke.
        val searchKey: String,
    )

    companion object {
        private val combiningMarksRegex = "\\p{M}".toRegex()

        fun normalizeForSearch(input: String): String {
            val eReplaced = input.replace('ё', 'е').replace('Ё', 'е')
            return Normalizer.normalize(eReplaced, Normalizer.Form.NFD)
                .replace(combiningMarksRegex, "")
                .lowercase()
                .trim()
        }
    }

    private data class RootDirectory(
        val uri: Uri,
        val docId: String,
        val displayName: String,
        val relativePath: String
    )

    fun getRandomRom(): Rom? {
        val currentRomEntries = _browserState.value.entries.filterIsInstance<RomBrowserEntry.RomItem>().map { it.rom }
        if (currentRomEntries.isNotEmpty()) {
            return currentRomEntries.random()
        }
        val allMatching = romsWithParents.value.map { it.rom }.filter { matchesFilter(it, _filter.value) }
        return allMatching.randomOrNull()
    }

    suspend fun getRomAtUri(uri: Uri): Rom? {
        return romsRepository.getRomAtUri(uri)
    }

    data class DirectoryCacheStatusUi(
        val directoryName: String,
        val lastScanTimestamp: Long?,
        val result: RomDirectoryScanStatus.ScanResult
    )
}
