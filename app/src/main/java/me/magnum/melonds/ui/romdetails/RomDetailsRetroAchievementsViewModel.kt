package me.magnum.melonds.ui.romdetails

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.coroutines.CancellationException
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.domain.repositories.RetroAchievementsRepository
import me.magnum.melonds.domain.repositories.SettingsRepository
import me.magnum.melonds.impl.retroachievements.offline.OfflineLedgerIntegrity
import me.magnum.melonds.impl.retroachievements.offline.OfflineLedgerRepository
import me.magnum.melonds.impl.retroachievements.offline.OfflinePrefetchCacheRepository
import me.magnum.melonds.impl.retroachievements.offline.SmartSyncSkipReason
import me.magnum.melonds.impl.retroachievements.offline.SmartSyncEngine
import me.magnum.melonds.impl.system.NetworkStatusProvider
import me.magnum.melonds.parcelables.RomParcelable
import me.magnum.melonds.ui.common.viewmodel.RetroAchievementsViewModel
import me.magnum.melonds.ui.romdetails.model.OfflineAchievementsUiState
import me.magnum.melonds.ui.romdetails.model.RomDetailsToastEvent
import me.magnum.melonds.utils.EventSharedFlow
import javax.inject.Inject

@HiltViewModel
class RomDetailsRetroAchievementsViewModel @Inject constructor(
    private val retroAchievementsRepository: RetroAchievementsRepository,
    settingsRepository: SettingsRepository,
    private val offlineLedgerRepository: OfflineLedgerRepository,
    private val offlinePrefetchCacheRepository: OfflinePrefetchCacheRepository,
    private val smartSyncEngine: SmartSyncEngine,
    private val networkStatusProvider: NetworkStatusProvider,
    private val savedStateHandle: SavedStateHandle,
) : RetroAchievementsViewModel(retroAchievementsRepository, settingsRepository) {

    private val _offlineAchievementsUiState = MutableStateFlow(OfflineAchievementsUiState())
    val offlineAchievementsUiState = _offlineAchievementsUiState.asStateFlow()

    private val _toastEvent = EventSharedFlow<RomDetailsToastEvent>()
    val toastEvent = _toastEvent.asSharedFlow()

    init {
        refreshOfflineAchievementsStatus()
    }

    override fun getRom(): Rom {
        return savedStateHandle.get<RomParcelable>(RomDetailsActivity.KEY_ROM)!!.rom
    }

    fun refreshOfflineAchievementsStatus() {
        viewModelScope.launch {
            val isSyncing = _offlineAchievementsUiState.value.isSyncing
            _offlineAchievementsUiState.value = buildOfflineAchievementsUiState(isSyncing)
        }
    }

    fun syncOfflineAchievementsNow() {
        if (_offlineAchievementsUiState.value.isSyncing) return

        viewModelScope.launch {
            val userAuth = retroAchievementsRepository.getUserAuthentication() ?: return@launch
            val userId = userAuth.username
            val contentId = getRom().retroAchievementsHash

            if (!networkStatusProvider.isOnline()) {
                refreshOfflineAchievementsStatus()
                return@launch
            }

            _offlineAchievementsUiState.value = _offlineAchievementsUiState.value.copy(isSyncing = true)
            val syncResult = withContext(Dispatchers.IO) {
                smartSyncEngine.syncSoftcoreNow(userId, contentId)
            }
            _offlineAchievementsUiState.value = _offlineAchievementsUiState.value.copy(isSyncing = false)
            refreshOfflineAchievementsStatus()

            if (syncResult.isSuccess) {
                val skipped = syncResult.getOrNull()?.skipped.orEmpty()
                emitOfflineAchievementsNotSyncedToasts(skipped)
            }
        }
    }

    private suspend fun emitOfflineAchievementsNotSyncedToasts(skipped: List<me.magnum.melonds.impl.retroachievements.offline.SmartSyncSkippedAchievement>) {
        if (skipped.isEmpty()) return

        val maxIndividualToasts = 3
        val individual = skipped.take(maxIndividualToasts)

        individual.forEach { skip ->
            val title = retroAchievementsRepository.getAchievement(skip.achievementId).getOrNull()?.getCleanTitle()
                ?: "#${skip.achievementId}"

            val reason = when (skip.reason) {
                SmartSyncSkipReason.MISSING_FROM_CURRENT_SET -> RomDetailsToastEvent.OfflineAchievementNotSyncedReason.MISSING_FROM_CURRENT_SET
                SmartSyncSkipReason.DEFINITION_CHANGED -> RomDetailsToastEvent.OfflineAchievementNotSyncedReason.DEFINITION_CHANGED
                SmartSyncSkipReason.NOT_IN_PREFETCH_CACHE -> RomDetailsToastEvent.OfflineAchievementNotSyncedReason.NOT_IN_PREFETCH_CACHE
            }

            _toastEvent.tryEmit(RomDetailsToastEvent.OfflineAchievementNotSynced(title = title, reason = reason))
        }

        val remaining = skipped.size - individual.size
        if (remaining > 0) {
            _toastEvent.tryEmit(RomDetailsToastEvent.OfflineAchievementsNotSyncedSummary(skippedCount = remaining))
        }
    }

    private suspend fun buildOfflineAchievementsUiState(isSyncing: Boolean): OfflineAchievementsUiState {
        val isOnline = networkStatusProvider.isOnline()
        val userAuth = retroAchievementsRepository.getUserAuthentication()
            ?: return OfflineAchievementsUiState(
                availability = OfflineAchievementsUiState.Availability.DISABLED_NOT_LOGGED_IN,
                pendingSoftcoreUnlockCount = 0,
                pendingLedgerUnlockCount = 0,
                ledgerIntegrity = OfflineLedgerIntegrity.EMPTY,
                isOnline = isOnline,
                isSyncing = isSyncing,
            )

        val userId = userAuth.username
        val contentId = getRom().retroAchievementsHash

        val cacheIsReadable = withContext(Dispatchers.IO) {
            try {
                offlinePrefetchCacheRepository.readValid(userId, contentId) != null
            } catch (e: CancellationException) {
                throw e
            } catch (_: Exception) {
                false
            }
        }
        val availability = if (cacheIsReadable) {
            OfflineAchievementsUiState.Availability.ENABLED
        } else {
            OfflineAchievementsUiState.Availability.DISABLED_NO_CACHE
        }

        val ledgerStatus = withContext(Dispatchers.IO) {
            offlineLedgerRepository.getStatus(userId, contentId)
        }

        val pendingSoftcoreUnlockCount = if (ledgerStatus.integrity == OfflineLedgerIntegrity.OK) {
            ledgerStatus.pendingSoftcoreUnlockCount
        } else {
            0
        }

        return OfflineAchievementsUiState(
            availability = availability,
            pendingSoftcoreUnlockCount = pendingSoftcoreUnlockCount,
            pendingLedgerUnlockCount = if (ledgerStatus.integrity == OfflineLedgerIntegrity.OK) {
                ledgerStatus.pendingUnlockCount
            } else {
                0
            },
            ledgerIntegrity = ledgerStatus.integrity,
            isOnline = isOnline,
            isSyncing = isSyncing,
        )
    }

    override suspend fun getPendingLedgerAchievementIds(rom: Rom): Set<Long> {
        val userAuth = retroAchievementsRepository.getUserAuthentication() ?: return emptySet()
        val status = offlineLedgerRepository.getStatus(userAuth.username, rom.retroAchievementsHash)
        if (status.integrity != OfflineLedgerIntegrity.OK) {
            return emptySet()
        }

        return status.pendingUnlocks
            .map { it.achievementId }
            .toSet()
    }
}
