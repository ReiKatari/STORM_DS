package me.magnum.melonds.sgw

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
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

    suspend fun refreshCatalog(localRoms: List<Rom>, forceRefresh: Boolean = false): SgwCatalogSnapshot {
        val current = _snapshot.value
        val now = System.currentTimeMillis()
        if (!forceRefresh && current.fetchedAtEpochMs > 0L && now - current.fetchedAtEpochMs < 15 * 60_000L) {
            val updated = current.copy(
                updates = SgwVersionMatcher.findUpdates(
                    localRoms,
                    current.ndsGames + current.dsiGames,
                    current.translations,
                )
            )
            _snapshot.value = updated
            return updated
        }

        _isLoading.value = true
        return try {
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
                    val dsi = dsiRes.getOrDefault(emptyList())
                    val translations = (ndsTransRes.getOrDefault(emptyList()) + dsiTransRes.getOrDefault(emptyList()))
                        .distinctBy { "${it.platform.platformId}_${it.id}" }

                    val err = listOfNotNull(
                        ndsRes.exceptionOrNull()?.message,
                        dsiRes.exceptionOrNull()?.message,
                        ndsTransRes.exceptionOrNull()?.message,
                        dsiTransRes.exceptionOrNull()?.message,
                    ).takeIf { nds.isEmpty() && dsi.isEmpty() && translations.isEmpty() }?.firstOrNull()

                    val updates = SgwVersionMatcher.findUpdates(localRoms, nds + dsi, translations)
                    SgwCatalogSnapshot(
                        ndsGames = nds,
                        dsiGames = dsi,
                        translations = translations,
                        updates = updates,
                        fetchedAtEpochMs = if (err == null) System.currentTimeMillis() else 0L,
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

    fun recomputeUpdates(localRoms: List<Rom>) {
        val current = _snapshot.value
        if (current.ndsGames.isEmpty() && current.dsiGames.isEmpty() && current.translations.isEmpty()) {
            return
        }
        _snapshot.value = current.copy(
            updates = SgwVersionMatcher.findUpdates(
                localRoms,
                current.ndsGames + current.dsiGames,
                current.translations,
            )
        )
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
