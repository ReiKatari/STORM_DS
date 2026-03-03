package me.magnum.melonds.ui.common.achievements.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ensureActive
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.domain.model.retroachievements.RAUserAchievement
import me.magnum.melonds.domain.repositories.RetroAchievementsRepository
import me.magnum.melonds.domain.repositories.SettingsRepository
import me.magnum.melonds.ui.romdetails.model.AchievementBucketUiModel
import me.magnum.melonds.ui.romdetails.model.AchievementSetUiModel
import me.magnum.melonds.ui.romdetails.model.RomAchievementsSummary
import me.magnum.melonds.ui.romdetails.model.RomRetroAchievementsUiState
import me.magnum.rcheevosapi.model.RAAchievement

abstract class RetroAchievementsViewModel (
    private val retroAchievementsRepository: RetroAchievementsRepository,
    private val settingsRepository: SettingsRepository,
) : ViewModel() {

    private val _uiState = MutableStateFlow<RomRetroAchievementsUiState>(RomRetroAchievementsUiState.Loading)
    val uiState by lazy {
        loadAchievements()
        _uiState.asStateFlow()
    }

    private val _viewAchievementEvent = MutableSharedFlow<String>(extraBufferCapacity = 1, onBufferOverflow = BufferOverflow.DROP_OLDEST)
    val viewAchievementEvent = _viewAchievementEvent.asSharedFlow()

    private var achievementLoadJob: Job? = null

    protected abstract fun getRom(): Rom
    protected open suspend fun getPendingLedgerAchievementIds(rom: Rom): Set<Long> = emptySet()
    protected open suspend fun getRuntimeBucketByAchievementId(rom: Rom): Map<Long, AchievementBucketUiModel.Bucket> = emptyMap()
    protected open suspend fun getRuntimeSubsetOrder(rom: Rom): Map<Long, Int> = emptyMap()

    protected abstract suspend fun buildAchievementBuckets(
        achievements: List<RAUserAchievement>,
        runtimeBucketByAchievementId: Map<Long, AchievementBucketUiModel.Bucket>,
    ): List<AchievementBucketUiModel>

    private fun loadAchievements() {
        achievementLoadJob?.cancel()
        achievementLoadJob = viewModelScope.launch {
            if (retroAchievementsRepository.isUserAuthenticated()) {
                val rom = getRom()
                val forHardcoreMode = settingsRepository.isRetroAchievementsHardcoreEnabled()
                val runtimeBucketByAchievementId = withContext(Dispatchers.Default) {
                    getRuntimeBucketByAchievementId(rom)
                }
                val runtimeSubsetOrder = withContext(Dispatchers.Default) {
                    getRuntimeSubsetOrder(rom)
                }
                retroAchievementsRepository.getUserGameData(rom.retroAchievementsHash, forHardcoreMode).fold(
                    onSuccess = { userGameData ->
                        val sets = userGameData?.sets?.map { set ->
                            AchievementSetUiModel(
                                setId = set.id.id,
                                setTitle = set.title,
                                setType = set.type,
                                setIcon = set.iconUrl,
                                setSummary = buildAchievementsSummary(forHardcoreMode, set.achievements),
                                buckets = buildAchievementBuckets(set.achievements, runtimeBucketByAchievementId),
                            )
                        }.orEmpty()
                        val orderedSets = if (runtimeSubsetOrder.isNotEmpty()) {
                            sets.sortedWith(
                                compareBy<AchievementSetUiModel> { runtimeSubsetOrder[it.setId] ?: Int.MAX_VALUE }
                                    .thenBy { it.setId }
                            )
                        } else {
                            sets
                        }
                        val pendingLedgerAchievementIds = withContext(Dispatchers.IO) {
                            getPendingLedgerAchievementIds(rom)
                        }
                        _uiState.value = RomRetroAchievementsUiState.Ready(
                            sets = orderedSets,
                            pendingLedgerAchievementIds = pendingLedgerAchievementIds,
                        )
                    },
                    onFailure = {
                        ensureActive()
                        _uiState.value = RomRetroAchievementsUiState.AchievementLoadError
                    },
                )
            } else {
                _uiState.value = RomRetroAchievementsUiState.LoggedOut
            }
        }
    }

    fun login(username: String, password: String) {
        _uiState.value = RomRetroAchievementsUiState.Loading
        viewModelScope.launch {
            val result = retroAchievementsRepository.login(username, password)
            if (result.isSuccess) {
                loadAchievements()
            } else {
                _uiState.value = RomRetroAchievementsUiState.LoginError
            }
        }
    }

    fun retryLoadAchievements() {
        _uiState.value = RomRetroAchievementsUiState.Loading
        loadAchievements()
    }

    fun viewAchievement(achievement: RAAchievement) {
        val achievementUrl = "https://retroachievements.org/achievement/${achievement.id}"
        _viewAchievementEvent.tryEmit(achievementUrl)
    }

    private fun buildAchievementsSummary(forHardcoreMode: Boolean, userAchievements: List<RAUserAchievement>): RomAchievementsSummary {
        return RomAchievementsSummary(
            forHardcoreMode = forHardcoreMode,
            totalAchievements = userAchievements.size,
            completedAchievements = userAchievements.count { it.isUnlocked },
            totalPoints = userAchievements.sumOf { it.userPointsWorth() },
        )
    }
}
