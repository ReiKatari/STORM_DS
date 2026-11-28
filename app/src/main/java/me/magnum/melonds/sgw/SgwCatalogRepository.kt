package me.magnum.melonds.sgw

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import me.magnum.melonds.domain.model.rom.Rom
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SgwCatalogRepository @Inject constructor(
    private val apiClient: SgwApiClient,
    private val replacementManager: RomFileReplacementManager,
) {
    private val _snapshot = MutableStateFlow(SgwCatalogSnapshot())
    val snapshot: StateFlow<SgwCatalogSnapshot> = _snapshot.asStateFlow()

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading.asStateFlow()

    private val refreshMutex = Mutex()

    suspend fun refreshCatalog(localRoms: List<Rom>, forceRefresh: Boolean = false): SgwCatalogSnapshot {
        return refreshMutex.withLock {
            val current = _snapshot.value
            val now = System.currentTimeMillis()
            val hasCachedCatalog = current.ndsGames.isNotEmpty() ||
                current.dsiGames.isNotEmpty() ||
                current.translations.isNotEmpty()
            if (!forceRefresh && current.fetchedAtEpochMs > 0L && hasCachedCatalog && now - current.fetchedAtEpochMs < 15 * 60_000L) {
                val updates = withContext(Dispatchers.Default) {
                    SgwVersionMatcher.findUpdates(
                        localRoms,
                        current.ndsGames + current.dsiGames,
                        current.translations,
                    )
                }
                val updated = current.copy(updates = updates)
                _snapshot.value = updated
                return@withLock updated
            }

            _isLoading.value = true
            try {
                val fetched = withContext(Dispatchers.IO) {
                    coroutineScope {
                        val ndsDeferred = async { apiClient.fetchGames(SgwPlatform.NDS) }
                        val dsiDeferred = async { apiClient.fetchGames(SgwPlatform.DSI) }
                        val ndsTransDeferred = async { apiClient.fetchTranslatedGames(SgwPlatform.NDS) }
                        val dsiTransDeferred = async { apiClient.fetchTranslatedGames(SgwPlatform.DSI) }

                        val ndsRes = ndsDeferred.await()
                        val dsiRes = dsiDeferred.await()
                        val ndsTransRes = ndsTransDeferred.await()
                        val dsiTransRes = dsiTransDeferred.await()

                        val nds = ndsRes.getOrDefault(emptyList())
                            .distinctBy { it.platform to it.id }
                        val dsi = dsiRes.getOrDefault(emptyList())
                            .distinctBy { it.platform to it.id }
                        val translations = (ndsTransRes.getOrDefault(emptyList()) + dsiTransRes.getOrDefault(emptyList()))
                            .distinctBy { it.platform to it.id }

                        val errors = listOfNotNull(
                            ndsRes.exceptionOrNull()?.message,
                            dsiRes.exceptionOrNull()?.message,
                            ndsTransRes.exceptionOrNull()?.message,
                            dsiTransRes.exceptionOrNull()?.message,
                        )
                        val err = errors.takeIf { nds.isEmpty() && dsi.isEmpty() && translations.isEmpty() }?.firstOrNull()

                        val updates = withContext(Dispatchers.Default) {
                            SgwVersionMatcher.findUpdates(localRoms, nds + dsi, translations)
                        }
                        SgwCatalogSnapshot(
                            ndsGames = nds,
                            dsiGames = dsi,
                            translations = translations,
                            updates = updates,
                            fetchedAtEpochMs = if (errors.isEmpty()) System.currentTimeMillis() else 0L,
                            errorMessage = err,
                        )
                    }
                }
                _snapshot.value = fetched
                fetched
            } finally {
                _isLoading.value = false
            }
        }
    }

    suspend fun recomputeUpdates(localRoms: List<Rom>) {
        val current = _snapshot.value
        if (current.ndsGames.isEmpty() && current.dsiGames.isEmpty() && current.translations.isEmpty()) {
            return
        }
        val updates = withContext(Dispatchers.Default) {
            SgwVersionMatcher.findUpdates(
                localRoms,
                current.ndsGames + current.dsiGames,
                current.translations,
            )
        }
        _snapshot.value = current.copy(updates = updates)
    }

    suspend fun downloadEntry(
        entry: SgwGameEntry,
        onProgress: (downloadedBytes: Long, totalBytes: Long) -> Unit,
        isCancelled: () -> Boolean,
    ): SgwReplaceResult {
        return replacementManager.downloadNewRom(entry, onProgress, isCancelled)
    }

    suspend fun updateLocalRom(
        candidate: SgwUpdateCandidate,
        onProgress: (downloadedBytes: Long, totalBytes: Long) -> Unit,
        isCancelled: () -> Boolean,
    ): SgwReplaceResult {
        return replacementManager.downloadAndReplaceRom(
            oldRom = candidate.localRom,
            entry = candidate.remoteEntry,
            onProgress = onProgress,
            isCancelled = isCancelled,
        )
    }
}
