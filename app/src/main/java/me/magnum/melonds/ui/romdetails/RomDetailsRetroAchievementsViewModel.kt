package me.magnum.melonds.ui.romdetails

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.domain.model.retroachievements.RAUserAchievement
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
import me.magnum.melonds.ui.common.achievements.ui.model.AchievementUiModel
import me.magnum.melonds.ui.common.achievements.viewmodel.RetroAchievementsViewModel
import me.magnum.melonds.ui.romdetails.model.AchievementBucketUiModel
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
    private companion object {
        private const val RC_CLIENT_ACHIEVEMENT_BUCKET_LOCKED = 1
        private const val RC_CLIENT_ACHIEVEMENT_BUCKET_UNLOCKED = 2
        private const val RC_CLIENT_ACHIEVEMENT_BUCKET_UNSUPPORTED = 3
        private const val RC_CLIENT_ACHIEVEMENT_BUCKET_UNOFFICIAL = 4
        private const val RC_CLIENT_ACHIEVEMENT_BUCKET_RECENTLY_UNLOCKED = 5
        private const val RC_CLIENT_ACHIEVEMENT_BUCKET_ACTIVE_CHALLENGE = 6
        private const val RC_CLIENT_ACHIEVEMENT_BUCKET_ALMOST_THERE = 7
        private const val RC_CLIENT_ACHIEVEMENT_BUCKET_UNSYNCED = 8
    }

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

            if (!networkStatusProvider.isLikelyOnline()) {
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
                SmartSyncSkipReason.SERVER_REJECTED -> RomDetailsToastEvent.OfflineAchievementNotSyncedReason.SERVER_REJECTED
            }

            _toastEvent.tryEmit(
                RomDetailsToastEvent.OfflineAchievementNotSynced(
                    title = title,
                    reason = reason,
                    reasonDetail = skip.reasonDetail,
                )
            )
        }

        val remaining = skipped.size - individual.size
        if (remaining > 0) {
            _toastEvent.tryEmit(RomDetailsToastEvent.OfflineAchievementsNotSyncedSummary(skippedCount = remaining))
        }
    }

    private suspend fun buildOfflineAchievementsUiState(isSyncing: Boolean): OfflineAchievementsUiState {
        val isOnline = networkStatusProvider.isLikelyOnline()
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

        val ledgerOk = ledgerStatus.integrity == OfflineLedgerIntegrity.OK
        return OfflineAchievementsUiState(
            availability = availability,
            pendingSoftcoreUnlockCount = if (ledgerOk) ledgerStatus.pendingSoftcoreUnlockCount else 0,
            pendingLedgerUnlockCount = if (ledgerOk) ledgerStatus.pendingSoftcoreUnlockCount else 0,
            ledgerIntegrity = ledgerStatus.integrity,
            ledgerExpiresInMs = if (ledgerOk) ledgerStatus.ledgerExpiresInMs else null,
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

    override suspend fun buildAchievementBuckets(
        achievements: List<RAUserAchievement>,
        runtimeBucketByAchievementId: Map<Long, AchievementBucketUiModel.Bucket>,
    ): List<AchievementBucketUiModel> {
        return retroAchievementsRepository.getRuntimeUserAchievements(achievements).groupingBy { runtimeAchievement ->
            runtimeBucketByAchievementId[runtimeAchievement.userAchievement.achievement.id] ?: if (runtimeAchievement.userAchievement.isUnlocked) {
                AchievementBucketUiModel.Bucket.Unlocked
            } else {
                AchievementBucketUiModel.Bucket.Locked
            }
        }.aggregate { _, accumulator: MutableList<AchievementUiModel>?, element, _ ->
            val achievementUiModel = AchievementUiModel.RuntimeAchievementUiModel(element)
            accumulator?.apply {
                add(achievementUiModel)
            } ?: mutableListOf(achievementUiModel)
        }.map {
            AchievementBucketUiModel(it.key, it.value)
        }.sortedBy {
            it.bucket.displayOrder
        }
    }

    override suspend fun getRuntimeBucketByAchievementId(rom: Rom): Map<Long, AchievementBucketUiModel.Bucket> {
        return retroAchievementsRepository.getRuntimeAchievementBuckets()
            .associate { it.achievementId to mapRuntimeBucketType(it.bucketType) }
    }

    override suspend fun getRuntimeSubsetOrder(rom: Rom): Map<Long, Int> {
        return retroAchievementsRepository.getRuntimeSubsetIds()
            .withIndex()
            .associate { it.value to it.index }
    }

    private fun mapRuntimeBucketType(runtimeBucketType: Int): AchievementBucketUiModel.Bucket {
        return when (runtimeBucketType) {
            RC_CLIENT_ACHIEVEMENT_BUCKET_LOCKED -> AchievementBucketUiModel.Bucket.Locked
            RC_CLIENT_ACHIEVEMENT_BUCKET_UNLOCKED -> AchievementBucketUiModel.Bucket.Unlocked
            RC_CLIENT_ACHIEVEMENT_BUCKET_UNSUPPORTED -> AchievementBucketUiModel.Bucket.Unsupported
            RC_CLIENT_ACHIEVEMENT_BUCKET_UNOFFICIAL -> AchievementBucketUiModel.Bucket.Unofficial
            RC_CLIENT_ACHIEVEMENT_BUCKET_RECENTLY_UNLOCKED -> AchievementBucketUiModel.Bucket.RecentlyUnlocked
            RC_CLIENT_ACHIEVEMENT_BUCKET_ACTIVE_CHALLENGE -> AchievementBucketUiModel.Bucket.ActiveChallenges
            RC_CLIENT_ACHIEVEMENT_BUCKET_ALMOST_THERE -> AchievementBucketUiModel.Bucket.AlmostThere
            RC_CLIENT_ACHIEVEMENT_BUCKET_UNSYNCED -> AchievementBucketUiModel.Bucket.Unsynced
            else -> AchievementBucketUiModel.Bucket.Locked
        }
    }
}
