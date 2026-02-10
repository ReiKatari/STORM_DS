package me.magnum.melonds.ui.emulator

import android.net.Uri
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.Job
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.MelonEmulator
import me.magnum.melonds.common.romprocessors.RomFileProcessorFactory
import me.magnum.melonds.common.runtime.ScreenshotFrameBufferProvider
import me.magnum.melonds.database.daos.RetroAchievementsDao
import me.magnum.melonds.database.entities.retroachievements.RAUserAchievementEntity
import me.magnum.melonds.domain.model.Cheat
import me.magnum.melonds.domain.model.ConsoleType
import me.magnum.melonds.domain.model.DualScreenPreset
import me.magnum.melonds.domain.model.FpsCounterPosition
import me.magnum.melonds.domain.model.RomInfo
import me.magnum.melonds.domain.model.RuntimeBackground
import me.magnum.melonds.domain.model.Rect
import me.magnum.melonds.domain.model.SaveStateSlot
import me.magnum.melonds.domain.model.SCREEN_HEIGHT
import me.magnum.melonds.domain.model.SCREEN_WIDTH
import me.magnum.melonds.domain.model.ScreenAlignment
import me.magnum.melonds.domain.model.defaultExternalAlignment
import me.magnum.melonds.domain.model.defaultInternalAlignment
import me.magnum.melonds.domain.model.emulator.EmulatorSessionUpdateAction
import me.magnum.melonds.domain.model.emulator.FirmwareLaunchResult
import me.magnum.melonds.domain.model.emulator.RomLaunchResult
import me.magnum.melonds.domain.model.layout.BackgroundMode
import me.magnum.melonds.domain.model.layout.LayoutConfiguration
import me.magnum.melonds.domain.model.layout.LayoutDisplayPair
import me.magnum.melonds.domain.model.layout.PositionedLayoutComponent
import me.magnum.melonds.domain.model.layout.ScreenFold
import me.magnum.melonds.domain.model.layout.ScreenLayout
import me.magnum.melonds.domain.model.layout.UILayout
import me.magnum.melonds.domain.model.layout.UILayoutVariant
import me.magnum.melonds.domain.model.retroachievements.GameAchievementData
import me.magnum.melonds.domain.model.retroachievements.RAEvent
import me.magnum.melonds.domain.model.retroachievements.RASimpleAchievement
import me.magnum.melonds.domain.model.input.SoftInputBehaviour
import me.magnum.melonds.domain.model.retroachievements.RASimpleLeaderboard
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.domain.model.ui.Orientation
import me.magnum.melonds.domain.repositories.BackgroundRepository
import me.magnum.melonds.domain.repositories.CheatsRepository
import me.magnum.melonds.domain.repositories.LayoutsRepository
import me.magnum.melonds.domain.repositories.RetroAchievementsRepository
import me.magnum.melonds.domain.repositories.RomsRepository
import me.magnum.melonds.domain.repositories.SaveStatesRepository
import me.magnum.melonds.domain.repositories.SettingsRepository
import me.magnum.melonds.domain.services.EmulatorManager
import me.magnum.melonds.impl.emulator.EmulatorSession
import me.magnum.melonds.impl.retroachievements.offline.OfflineLedgerIntegrity
import me.magnum.melonds.impl.retroachievements.offline.OfflineLedgerRepository
import me.magnum.melonds.impl.retroachievements.offline.OfflinePrefetchCacheAchievement
import me.magnum.melonds.impl.retroachievements.offline.OfflinePrefetchCacheFile
import me.magnum.melonds.impl.retroachievements.offline.OfflinePrefetchCacheLeaderboard
import me.magnum.melonds.impl.retroachievements.offline.OfflinePrefetchCacheRepository
import me.magnum.melonds.impl.retroachievements.offline.OfflineUnlockMode
import me.magnum.melonds.impl.retroachievements.offline.OfflineUnlockType
import me.magnum.melonds.impl.retroachievements.offline.HardcoreOfflineLossTracker
import me.magnum.melonds.impl.retroachievements.offline.RetroAchievementsImageCacheWarmer
import me.magnum.melonds.impl.retroachievements.offline.SmartSyncSkipReason
import me.magnum.melonds.impl.retroachievements.offline.SmartSyncEngine
import me.magnum.melonds.impl.layout.UILayoutProvider
import me.magnum.melonds.impl.system.NetworkStatusProvider
import me.magnum.melonds.ui.emulator.firmware.FirmwarePauseMenuOption
import me.magnum.melonds.ui.emulator.model.EmulatorState
import me.magnum.melonds.ui.emulator.model.EmulatorUiEvent
import me.magnum.melonds.ui.emulator.model.HardcorePendingExitChoice
import me.magnum.melonds.ui.emulator.model.OfflineAchievementsSyncChoice
import me.magnum.melonds.ui.emulator.model.LaunchArgs
import me.magnum.melonds.ui.emulator.model.PauseMenu
import me.magnum.melonds.ui.emulator.model.RAEventUi
import me.magnum.melonds.ui.emulator.model.RAIntegrationEvent
import me.magnum.melonds.ui.emulator.model.RuntimeInputLayoutConfiguration
import me.magnum.melonds.ui.emulator.model.RuntimeRendererConfiguration
import me.magnum.melonds.ui.emulator.model.ToastEvent
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState
import me.magnum.melonds.ui.emulator.rom.RomPauseMenuOption
import me.magnum.melonds.utils.EventSharedFlow
import me.magnum.rcheevosapi.model.RAAchievementSet
import me.magnum.rcheevosapi.model.RASetId
import java.util.UUID
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.math.min
import kotlin.math.roundToInt
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

@OptIn(ExperimentalCoroutinesApi::class)
@HiltViewModel
class EmulatorViewModel @Inject constructor(
    private val settingsRepository: SettingsRepository,
    private val romsRepository: RomsRepository,
    private val cheatsRepository: CheatsRepository,
    private val retroAchievementsRepository: RetroAchievementsRepository,
    private val retroAchievementsDao: RetroAchievementsDao,
    private val offlineLedgerRepository: OfflineLedgerRepository,
    private val offlinePrefetchCacheRepository: OfflinePrefetchCacheRepository,
    private val retroAchievementsImageCacheWarmer: RetroAchievementsImageCacheWarmer,
    private val smartSyncEngine: SmartSyncEngine,
    private val hardcoreOfflineLossTracker: HardcoreOfflineLossTracker,
    private val networkStatusProvider: NetworkStatusProvider,
    private val romFileProcessorFactory: RomFileProcessorFactory,
    private val layoutsRepository: LayoutsRepository,
    private val backgroundsRepository: BackgroundRepository,
    private val saveStatesRepository: SaveStatesRepository,
    private val screenshotFrameBufferProvider: ScreenshotFrameBufferProvider,
    private val uiLayoutProvider: UILayoutProvider,
    private val emulatorManager: EmulatorManager,
    private val emulatorSession: EmulatorSession,
    savedStateHandle: SavedStateHandle,
) : ViewModel() {

    private val sessionCoroutineScope = EmulatorSessionCoroutineScope()
    private var raSessionJob: Job? = null

    private enum class RetroAchievementsNetworkMode {
        ONLINE_LIVE,
        OFFLINE_ACCUMULATING,
    }

    private enum class RetroAchievementsSessionMode {
        SOFTCORE,
        HARDCORE,
    }

    private data class RetroAchievementsLaunchDecision(
        val networkMode: RetroAchievementsNetworkMode,
        val sessionMode: RetroAchievementsSessionMode,
        val initialOfflineType: OfflineUnlockType?,
        val isHardcoreEligibleAfterOnlineStart: Boolean,
        val offlineDueToNoInternetAtStart: Boolean,
    )

    private data class OfflineRetroAchievementsSession(
        val userId: String,
        val contentId: String,
        val gameId: Long,
        val unlockMode: OfflineUnlockMode,
        val offlineType: OfflineUnlockType,
        val sessionId: String,
        val startedAtEpochMs: Long,
        var nextOrderIndex: Long,
    )

    private var retroAchievementsNetworkMode: RetroAchievementsNetworkMode = RetroAchievementsNetworkMode.ONLINE_LIVE
    private var retroAchievementsSessionMode: RetroAchievementsSessionMode = RetroAchievementsSessionMode.SOFTCORE
    private var isHardcoreEligibleAfterOnlineStart = false
    private var startedSessionOnlineLive = false
    private var currentRetroAchievementsGameId: Long? = null
    private var offlineRetroAchievementsSession: OfflineRetroAchievementsSession? = null

    private var offlineSyncChoiceDeferred: CompletableDeferred<OfflineAchievementsSyncChoice>? = null
    private var hardcoreExitChoiceDeferred: CompletableDeferred<HardcorePendingExitChoice>? = null

    private val _emulatorState = MutableStateFlow<EmulatorState>(EmulatorState.Uninitialized)
    val emulatorState = _emulatorState.asStateFlow()

    private val _layout = MutableStateFlow<LayoutConfiguration?>(null)

    private val _runtimeLayout = MutableStateFlow<RuntimeInputLayoutConfiguration?>(null)
    val runtimeLayout = _runtimeLayout.asStateFlow()

    val controllerConfiguration = settingsRepository.observeControllerConfiguration()

    private val _runtimeRendererConfiguration = MutableStateFlow<RuntimeRendererConfiguration?>(null)
    val runtimeRendererConfiguration = _runtimeRendererConfiguration.asStateFlow()

    private val _mainScreenBackground = MutableStateFlow(RuntimeBackground.None)
    val mainScreenBackground = _mainScreenBackground.asStateFlow()

    private val _secondaryScreenBackground = MutableStateFlow(RuntimeBackground.None)
    val secondaryScreenBackground = _secondaryScreenBackground.asStateFlow()

    val emulatorEvents = emulatorManager.emulatorEvents

    private val _achievementsEvent = MutableSharedFlow<RAEventUi>(extraBufferCapacity = 5, onBufferOverflow = BufferOverflow.SUSPEND)
    val achievementsEvent = _achievementsEvent.asSharedFlow()

    private val _currentFps = MutableStateFlow<Int?>(null)
    val currentFps = _currentFps.asStateFlow()

    private val _toastEvent = EventSharedFlow<ToastEvent>()
    val toastEvent = _toastEvent.asSharedFlow()

    private val _raIntegrationEvent = EventSharedFlow<RAIntegrationEvent>()
    val integrationEvent = _raIntegrationEvent.asSharedFlow()

    private val _uiEvent = EventSharedFlow<EmulatorUiEvent>()
    val uiEvent = _uiEvent.asSharedFlow()

    private val _externalDisplayKeepAspectRatioEnabled = MutableStateFlow(settingsRepository.isExternalDisplayKeepAspectRationEnabled())
    val externalDisplayKeepAspectRatioEnabled = _externalDisplayKeepAspectRatioEnabled.asStateFlow()

    private val _dualScreenPreset = MutableStateFlow(settingsRepository.getDualScreenPreset())
    val dualScreenPreset = _dualScreenPreset.asStateFlow()

    private val _dualScreenIntegerScaleEnabled = MutableStateFlow(settingsRepository.isDualScreenIntegerScaleEnabled())
    val dualScreenIntegerScaleEnabled = _dualScreenIntegerScaleEnabled.asStateFlow()

    private val _dualScreenInternalFillHeightEnabled = MutableStateFlow(settingsRepository.isDualScreenInternalFillHeightEnabled())
    val dualScreenInternalFillHeightEnabled = _dualScreenInternalFillHeightEnabled.asStateFlow()

    private val _dualScreenInternalFillWidthEnabled = MutableStateFlow(settingsRepository.isDualScreenInternalFillWidthEnabled())
    val dualScreenInternalFillWidthEnabled = _dualScreenInternalFillWidthEnabled.asStateFlow()

    private val _dualScreenExternalFillHeightEnabled = MutableStateFlow(settingsRepository.isDualScreenExternalFillHeightEnabled())
    val dualScreenExternalFillHeightEnabled = _dualScreenExternalFillHeightEnabled.asStateFlow()

    private val _dualScreenExternalFillWidthEnabled = MutableStateFlow(settingsRepository.isDualScreenExternalFillWidthEnabled())
    val dualScreenExternalFillWidthEnabled = _dualScreenExternalFillWidthEnabled.asStateFlow()

    private val _dualScreenInternalVerticalAlignmentOverride = MutableStateFlow(settingsRepository.getDualScreenInternalVerticalAlignmentOverride())
    val dualScreenInternalVerticalAlignmentOverride = _dualScreenInternalVerticalAlignmentOverride.asStateFlow()

    private val _dualScreenExternalVerticalAlignmentOverride = MutableStateFlow(settingsRepository.getDualScreenExternalVerticalAlignmentOverride())
    val dualScreenExternalVerticalAlignmentOverride = _dualScreenExternalVerticalAlignmentOverride.asStateFlow()

    private var currentRom: Rom? = null

    init {
        viewModelScope.launch {
            _layout.filterNotNull().collect {
                uiLayoutProvider.setCurrentLayoutConfiguration(it)
            }
        }

        viewModelScope.launch {
            settingsRepository.observeExternalDisplayKeepAspectRationEnabled().collectLatest {
                _externalDisplayKeepAspectRatioEnabled.value = it
            }
        }
        viewModelScope.launch {
            settingsRepository.observeDualScreenPreset().collectLatest {
                _dualScreenPreset.value = it
            }
        }
        viewModelScope.launch {
            settingsRepository.observeDualScreenIntegerScaleEnabled().collectLatest {
                _dualScreenIntegerScaleEnabled.value = it
            }
        }
        viewModelScope.launch {
            settingsRepository.observeDualScreenInternalFillHeightEnabled().collectLatest {
                _dualScreenInternalFillHeightEnabled.value = it
            }
        }
        viewModelScope.launch {
            settingsRepository.observeDualScreenInternalFillWidthEnabled().collectLatest {
                _dualScreenInternalFillWidthEnabled.value = it
            }
        }
        viewModelScope.launch {
            settingsRepository.observeDualScreenExternalFillHeightEnabled().collectLatest {
                _dualScreenExternalFillHeightEnabled.value = it
            }
        }
        viewModelScope.launch {
            settingsRepository.observeDualScreenExternalFillWidthEnabled().collectLatest {
                _dualScreenExternalFillWidthEnabled.value = it
            }
        }
        viewModelScope.launch {
            settingsRepository.observeDualScreenInternalVerticalAlignmentOverride().collectLatest {
                _dualScreenInternalVerticalAlignmentOverride.value = it
            }
        }
        viewModelScope.launch {
            settingsRepository.observeDualScreenExternalVerticalAlignmentOverride().collectLatest {
                _dualScreenExternalVerticalAlignmentOverride.value = it
            }
        }

        val launchArgs = LaunchArgs.fromSavedStateHandle(savedStateHandle)
        if (launchArgs != null) {
            launchEmulator(launchArgs)
        } else {
            _uiEvent.tryEmit(EmulatorUiEvent.CloseEmulator)
        }
    }

    fun relaunchWithNewArgs(args: LaunchArgs) {
        if (!_emulatorState.value.isRunning()) {
            launchEmulator(args)
            return
        }

        sessionCoroutineScope.launch {
            val runningRom = _emulatorState.value as? EmulatorState.RunningRom
            if (runningRom != null) {
                val userAuth = retroAchievementsRepository.getUserAuthentication()
                if (userAuth != null) {
                    val userId = userAuth.username
                    val contentId = runningRom.rom.retroAchievementsHash
                    val ledgerStatus = withContext(Dispatchers.IO) {
                        offlineLedgerRepository.getStatus(userId, contentId)
                    }

                    if (ledgerStatus.integrity == OfflineLedgerIntegrity.OK) {
                        if (ledgerStatus.hasPendingHardcoreUnlocks) {
                            val shouldExit = handleHardcorePendingBeforeExit(userId, contentId)
                            if (!shouldExit) {
                                emulatorManager.resumeEmulator()
                                return@launch
                            }
                        } else {
                            hardcoreOfflineLossTracker.clearPendingUnlocks(userId, contentId)
                            if (ledgerStatus.pendingSoftcoreUnlockCount > 0) {
                                _toastEvent.tryEmit(
                                    ToastEvent.OfflineSoftcorePendingNotice(ledgerStatus.pendingSoftcoreUnlockCount)
                                )
                            }
                        }
                    }
                }
            }

            stopEmulator()
            launchEmulator(args)
        }
    }

    private fun launchEmulator(args: LaunchArgs) {
        when (args) {
            is LaunchArgs.RomObject -> loadRom(args.rom)
            is LaunchArgs.RomUri -> loadRom(args.uri)
            is LaunchArgs.RomPath -> loadRom(args.path)
            is LaunchArgs.Firmware -> loadFirmware(args.consoleType)
        }
    }

    private fun loadRom(rom: Rom) {
        viewModelScope.launch {
            resetEmulatorState(EmulatorState.LoadingRom)
            sessionCoroutineScope.launch {
                launchRom(rom)
            }
        }
    }

    private fun loadRom(romUri: Uri) {
        viewModelScope.launch {
            resetEmulatorState(EmulatorState.LoadingRom)
            sessionCoroutineScope.launch {
                val rom = romsRepository.getRomAtUri(romUri)
                if (rom != null) {
                    launchRom(rom)
                } else {
                    _emulatorState.value = EmulatorState.RomNotFoundError(romUri.toString())
                }
            }
        }
    }

    private fun loadRom(romPath: String) {
        viewModelScope.launch {
            resetEmulatorState(EmulatorState.LoadingRom)
            sessionCoroutineScope.launch {
                val rom = romsRepository.getRomAtPath(romPath)
                if (rom != null) {
                    launchRom(rom)
                } else {
                    _emulatorState.value = EmulatorState.RomNotFoundError(romPath)
                }
            }
        }
    }

    private suspend fun launchRom(rom: Rom) = coroutineScope {
        currentRom = rom
        val launchDecision = decideRetroAchievementsLaunchDecision(rom)

        retroAchievementsNetworkMode = launchDecision.networkMode
        retroAchievementsSessionMode = launchDecision.sessionMode
        isHardcoreEligibleAfterOnlineStart = launchDecision.isHardcoreEligibleAfterOnlineStart
        startedSessionOnlineLive = launchDecision.networkMode == RetroAchievementsNetworkMode.ONLINE_LIVE

        startEmulatorSession(
            sessionType = EmulatorSession.SessionType.RomSession(rom),
            isRetroAchievementsHardcoreModeEnabled = launchDecision.sessionMode == RetroAchievementsSessionMode.HARDCORE,
        )
        startObservingMainScreenBackground()
        startObservingSecondaryScreenBackground()
        startObservingRuntimeInputLayoutConfiguration()
        startObservingRendererConfiguration()
        startObservingAchievementEvents()
        startObservingLayoutForRom(rom)
        startRetroAchievementsSession(rom, launchDecision)

        val cheats = getRomInfo(rom)?.let { getRomEnabledCheats(it) } ?: emptyList()
        val result = emulatorManager.loadRom(rom, cheats)
        when (result) {
            is RomLaunchResult.LaunchFailedRomNotFound,
            is RomLaunchResult.LaunchFailedSramProblem,
            is RomLaunchResult.LaunchFailed -> {
                _emulatorState.value = EmulatorState.RomLoadError
            }
            is RomLaunchResult.LaunchSuccessful -> {
                if (!result.isGbaLoadSuccessful) {
                    _toastEvent.tryEmit(ToastEvent.GbaLoadFailed)
                }
                _emulatorState.value = EmulatorState.RunningRom(rom)
                startTrackingFps()
                startTrackingPlayTime(rom)
            }
        }
    }

    fun submitOfflineAchievementsSyncChoice(choice: OfflineAchievementsSyncChoice) {
        offlineSyncChoiceDeferred?.complete(choice)
    }

    fun submitHardcorePendingExitChoice(choice: HardcorePendingExitChoice) {
        hardcoreExitChoiceDeferred?.complete(choice)
    }

    private suspend fun decideRetroAchievementsLaunchDecision(rom: Rom): RetroAchievementsLaunchDecision {
        val startedOnline = networkStatusProvider.isOnline()
        val hardcoreSettingEnabled = settingsRepository.isRetroAchievementsHardcoreEnabled()
        val userAuth = retroAchievementsRepository.getUserAuthentication()

        if (userAuth == null) {
            return RetroAchievementsLaunchDecision(
                networkMode = RetroAchievementsNetworkMode.ONLINE_LIVE,
                sessionMode = RetroAchievementsSessionMode.SOFTCORE,
                initialOfflineType = null,
                isHardcoreEligibleAfterOnlineStart = false,
                offlineDueToNoInternetAtStart = false,
            )
        }

        val userId = userAuth.username
        val contentId = rom.retroAchievementsHash

        var ledgerStatus = withContext(Dispatchers.IO) {
            offlineLedgerRepository.getStatus(userId, contentId)
        }
        var ignoreLedgerForThisLaunch = false

        if (ledgerStatus.integrity != OfflineLedgerIntegrity.OK && ledgerStatus.integrity != OfflineLedgerIntegrity.EMPTY) {
            _toastEvent.tryEmit(ToastEvent.OfflineAchievementsLedgerTampered)

            val resetResult = withContext(Dispatchers.IO) {
                offlineLedgerRepository.resetLedger(userId, contentId)
            }
            if (resetResult.isSuccess) {
                hardcoreOfflineLossTracker.clearPendingUnlocks(userId, contentId)
                ledgerStatus = withContext(Dispatchers.IO) {
                    offlineLedgerRepository.getStatus(userId, contentId)
                }
            } else {
                ignoreLedgerForThisLaunch = true
            }
        }

        if (ledgerStatus.integrity == OfflineLedgerIntegrity.OK && ledgerStatus.hasPendingHardcoreUnlocks) {
            hardcoreOfflineLossTracker.markPendingUnlocks(
                userId = userId,
                contentId = contentId,
                gameTitle = rom.name,
            )
        }

        if (!startedOnline) {
            return RetroAchievementsLaunchDecision(
                networkMode = RetroAchievementsNetworkMode.OFFLINE_ACCUMULATING,
                sessionMode = RetroAchievementsSessionMode.SOFTCORE,
                initialOfflineType = OfflineUnlockType.OFFLINE_FROM_START,
                isHardcoreEligibleAfterOnlineStart = false,
                offlineDueToNoInternetAtStart = true,
            )
        }

        if (ignoreLedgerForThisLaunch || ledgerStatus.integrity != OfflineLedgerIntegrity.OK || ledgerStatus.pendingSoftcoreUnlockCount <= 0) {
            return RetroAchievementsLaunchDecision(
                networkMode = RetroAchievementsNetworkMode.ONLINE_LIVE,
                sessionMode = if (hardcoreSettingEnabled) RetroAchievementsSessionMode.HARDCORE else RetroAchievementsSessionMode.SOFTCORE,
                initialOfflineType = null,
                isHardcoreEligibleAfterOnlineStart = hardcoreSettingEnabled,
                offlineDueToNoInternetAtStart = false,
            )
        }

        val choice = awaitOfflineAchievementsSyncChoice(ledgerStatus.pendingSoftcoreUnlockCount)
        return when (choice) {
            OfflineAchievementsSyncChoice.CONTINUE_OFFLINE -> RetroAchievementsLaunchDecision(
                networkMode = RetroAchievementsNetworkMode.OFFLINE_ACCUMULATING,
                sessionMode = RetroAchievementsSessionMode.SOFTCORE,
                initialOfflineType = OfflineUnlockType.OFFLINE_FROM_START,
                isHardcoreEligibleAfterOnlineStart = false,
                offlineDueToNoInternetAtStart = false,
            )
            OfflineAchievementsSyncChoice.SYNC_NOW -> {
                if (syncPendingOfflineAchievements(userId, contentId, ledgerStatus.pendingSoftcoreUnlockCount)) {
                    RetroAchievementsLaunchDecision(
                        networkMode = RetroAchievementsNetworkMode.ONLINE_LIVE,
                        sessionMode = if (hardcoreSettingEnabled) RetroAchievementsSessionMode.HARDCORE else RetroAchievementsSessionMode.SOFTCORE,
                        initialOfflineType = null,
                        isHardcoreEligibleAfterOnlineStart = hardcoreSettingEnabled,
                        offlineDueToNoInternetAtStart = false,
                    )
                } else {
                    RetroAchievementsLaunchDecision(
                        networkMode = RetroAchievementsNetworkMode.OFFLINE_ACCUMULATING,
                        sessionMode = RetroAchievementsSessionMode.SOFTCORE,
                        initialOfflineType = OfflineUnlockType.OFFLINE_FROM_START,
                        isHardcoreEligibleAfterOnlineStart = false,
                        offlineDueToNoInternetAtStart = false,
                    )
                }
            }
        }
    }

    private suspend fun syncPendingOfflineAchievements(
        userId: String,
        contentId: String,
        pendingUnlockCount: Int,
    ): Boolean {
        if (!networkStatusProvider.isOnline()) {
            return false
        }
        _uiEvent.emit(EmulatorUiEvent.ShowOfflineAchievementsSyncProgress(pendingUnlockCount))
        val syncResult = smartSyncEngine.syncSoftcoreNow(userId, contentId)
        _uiEvent.emit(EmulatorUiEvent.HideOfflineAchievementsSyncProgress)
        if (syncResult.isSuccess) {
            val skipped = syncResult.getOrNull()?.skipped.orEmpty()
            emitOfflineAchievementsNotSyncedToasts(skipped)
            return true
        }
        return false
    }

    private suspend fun awaitOfflineAchievementsSyncChoice(
        pendingUnlockCount: Int,
    ): OfflineAchievementsSyncChoice {
        offlineSyncChoiceDeferred?.cancel()
        val deferred = CompletableDeferred<OfflineAchievementsSyncChoice>()
        offlineSyncChoiceDeferred = deferred
        _uiEvent.emit(
            EmulatorUiEvent.ShowOfflineAchievementsSyncChoice(
                pendingUnlockCount = pendingUnlockCount,
            )
        )
        return deferred.await().also {
            if (offlineSyncChoiceDeferred === deferred) {
                offlineSyncChoiceDeferred = null
            }
        }
    }

    private suspend fun awaitHardcorePendingExitChoice(
        pendingHardcoreCount: Int,
    ): HardcorePendingExitChoice {
        hardcoreExitChoiceDeferred?.cancel()
        val deferred = CompletableDeferred<HardcorePendingExitChoice>()
        hardcoreExitChoiceDeferred = deferred
        _uiEvent.emit(EmulatorUiEvent.ShowHardcorePendingExitWarning(pendingHardcoreCount))
        return deferred.await().also {
            if (hardcoreExitChoiceDeferred === deferred) {
                hardcoreExitChoiceDeferred = null
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
                SmartSyncSkipReason.MISSING_FROM_CURRENT_SET -> ToastEvent.OfflineAchievementNotSyncedReason.MISSING_FROM_CURRENT_SET
                SmartSyncSkipReason.DEFINITION_CHANGED -> ToastEvent.OfflineAchievementNotSyncedReason.DEFINITION_CHANGED
                SmartSyncSkipReason.NOT_IN_PREFETCH_CACHE -> ToastEvent.OfflineAchievementNotSyncedReason.NOT_IN_PREFETCH_CACHE
            }

            _toastEvent.tryEmit(ToastEvent.OfflineAchievementNotSynced(title = title, reason = reason))
        }

        val remaining = skipped.size - individual.size
        if (remaining > 0) {
            _toastEvent.tryEmit(ToastEvent.OfflineAchievementsNotSyncedSummary(skippedCount = remaining))
        }
    }

    private fun loadFirmware(consoleType: ConsoleType) {
        viewModelScope.launch {
            resetEmulatorState(EmulatorState.LoadingFirmware)
            startEmulatorSession(EmulatorSession.SessionType.FirmwareSession(consoleType))
            sessionCoroutineScope.launch {
                startObservingMainScreenBackground()
                startObservingSecondaryScreenBackground()
                startObservingRuntimeInputLayoutConfiguration()
                startObservingRendererConfiguration()
                startObservingLayoutForFirmware()

                val result = emulatorManager.loadFirmware(consoleType)
                when (result) {
                    is FirmwareLaunchResult.LaunchFailed -> {
                        _emulatorState.value = EmulatorState.FirmwareLoadError(result.reason)
                    }
                    FirmwareLaunchResult.LaunchSuccessful -> {
                        _emulatorState.value = EmulatorState.RunningFirmware(consoleType)
                        startTrackingFps()
                    }
                }
            }
        }
    }

    fun setSystemOrientation(orientation: Orientation) {
        uiLayoutProvider.updateCurrentOrientation(orientation)
    }

    fun setUiSize(width: Int, height: Int) {
        uiLayoutProvider.updateUiSize(width, height)
    }

    fun setScreenFolds(folds: List<ScreenFold>) {
        uiLayoutProvider.updateFolds(folds)
    }

    fun setConnectedDisplays(displays: LayoutDisplayPair) {
        uiLayoutProvider.updateDisplays(displays)
    }

    fun setExternalDisplayKeepAspectRatioEnabled(enabled: Boolean) {
        _externalDisplayKeepAspectRatioEnabled.value = enabled
        settingsRepository.setExternalDisplayKeepAspectRatioEnabled(enabled)
    }

    fun setDualScreenPreset(preset: DualScreenPreset) {
        _dualScreenPreset.value = preset
        settingsRepository.setDualScreenPreset(preset)
    }

    fun setDualScreenIntegerScaleEnabled(enabled: Boolean) {
        _dualScreenIntegerScaleEnabled.value = enabled
        settingsRepository.setDualScreenIntegerScaleEnabled(enabled)
    }

    fun setDualScreenInternalFillHeightEnabled(enabled: Boolean) {
        _dualScreenInternalFillHeightEnabled.value = enabled
        settingsRepository.setDualScreenInternalFillHeightEnabled(enabled)
    }

    fun setDualScreenInternalFillWidthEnabled(enabled: Boolean) {
        _dualScreenInternalFillWidthEnabled.value = enabled
        settingsRepository.setDualScreenInternalFillWidthEnabled(enabled)
    }

    fun setDualScreenExternalFillHeightEnabled(enabled: Boolean) {
        _dualScreenExternalFillHeightEnabled.value = enabled
        settingsRepository.setDualScreenExternalFillHeightEnabled(enabled)
    }

    fun setDualScreenExternalFillWidthEnabled(enabled: Boolean) {
        _dualScreenExternalFillWidthEnabled.value = enabled
        settingsRepository.setDualScreenExternalFillWidthEnabled(enabled)
    }

    fun setDualScreenInternalVerticalAlignmentOverride(alignment: ScreenAlignment?) {
        _dualScreenInternalVerticalAlignmentOverride.value = alignment
        settingsRepository.setDualScreenInternalVerticalAlignmentOverride(alignment)
    }

    fun setDualScreenExternalVerticalAlignmentOverride(alignment: ScreenAlignment?) {
        _dualScreenExternalVerticalAlignmentOverride.value = alignment
        settingsRepository.setDualScreenExternalVerticalAlignmentOverride(alignment)
    }

    fun onAppMovedToBackground() {
        sessionCoroutineScope.launch {
            val runningRom = _emulatorState.value as? EmulatorState.RunningRom ?: return@launch
            val userAuth = retroAchievementsRepository.getUserAuthentication() ?: return@launch
            val ledgerStatus = withContext(Dispatchers.IO) {
                offlineLedgerRepository.getStatus(userAuth.username, runningRom.rom.retroAchievementsHash)
            }
            if (ledgerStatus.integrity == OfflineLedgerIntegrity.OK && ledgerStatus.hasPendingHardcoreUnlocks) {
                _toastEvent.tryEmit(ToastEvent.HardcoreOfflineUnsyncedWarning(ledgerStatus.pendingHardcoreUnlockCount))
            }
        }
    }

    fun onSettingsChanged() {
        val currentState = _emulatorState.value
        sessionCoroutineScope.launch {
            val sessionUpdateActions = emulatorSession.updateRetroAchievementsSettings(
                retroAchievementsRepository.isUserAuthenticated(),
                settingsRepository.isRetroAchievementsHardcoreEnabled(),
            )

            when (currentState) {
                is EmulatorState.RunningRom -> emulatorManager.updateRomEmulatorConfiguration(currentState.rom)
                is EmulatorState.RunningFirmware -> emulatorManager.updateFirmwareEmulatorConfiguration(currentState.console)
                else -> {
                    // Do nothing
                }
            }

            dispatchSessionUpdateActions(sessionUpdateActions)
        }
    }

    fun onCheatsChanged() {
        val rom = (_emulatorState.value as? EmulatorState.RunningRom)?.rom ?: return

        getRomInfo(rom)?.let {
            sessionCoroutineScope.launch {
                val cheats = getRomEnabledCheats(it)
                emulatorManager.updateCheats(cheats)
            }
        }
    }

    fun pauseEmulator(showPauseMenu: Boolean) {
        sessionCoroutineScope.launch {
            emulatorManager.pauseEmulator()
            if (showPauseMenu) {
                val pauseOptions = when (_emulatorState.value) {
                    is EmulatorState.RunningRom -> {
                        RomPauseMenuOption.entries.filter {
                            filterRomPauseMenuOption(it)
                        }
                    }
                    is EmulatorState.RunningFirmware -> {
                        FirmwarePauseMenuOption.entries
                    }
                    else -> null
                }

                if (pauseOptions != null) {
                    _uiEvent.emit(EmulatorUiEvent.ShowPauseMenu(PauseMenu(pauseOptions)))
                }
            }
        }
    }

    fun resumeEmulator() {
        sessionCoroutineScope.launch {
            emulatorManager.resumeEmulator()
        }
    }

    fun resetEmulator() {
        if (_emulatorState.value.isRunning()) {
            sessionCoroutineScope.launch {
                emulatorManager.resetEmulator()
                _achievementsEvent.emit(RAEventUi.Reset)
            }
        }
    }

    fun stopEmulator() {
        viewModelScope.launch {
            _achievementsEvent.emit(RAEventUi.Reset)
        }
        finalizeOfflineRetroAchievementsSessionIfNeeded()
        emulatorManager.stopEmulator()
        screenshotFrameBufferProvider.clearBuffer()
    }

    private fun finalizeOfflineRetroAchievementsSessionIfNeeded() {
        val offlineSession = offlineRetroAchievementsSession ?: return
        offlineRetroAchievementsSession = null

        val endedAtEpochMs = System.currentTimeMillis()
        val estimatedPlayDurationMs = (endedAtEpochMs - offlineSession.startedAtEpochMs).coerceAtLeast(0L)

        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                offlineLedgerRepository.appendSessionEnd(
                    userId = offlineSession.userId,
                    contentId = offlineSession.contentId,
                    gameId = offlineSession.gameId,
                    sessionId = offlineSession.sessionId,
                    endedAtEpochMs = endedAtEpochMs,
                    estimatedPlayDurationMs = estimatedPlayDurationMs,
                    isHardcore = offlineSession.unlockMode == OfflineUnlockMode.HARDCORE,
                    unlockMode = offlineSession.unlockMode,
                    offlineType = offlineSession.offlineType,
                )
            }
        }
    }

    private fun requestExitRom() {
        sessionCoroutineScope.launch {
            val runningRom = _emulatorState.value as? EmulatorState.RunningRom
            if (runningRom == null) {
                stopEmulator()
                _uiEvent.emit(EmulatorUiEvent.CloseEmulator)
                return@launch
            }

            val userAuth = retroAchievementsRepository.getUserAuthentication()
            if (userAuth == null) {
                stopEmulator()
                _uiEvent.emit(EmulatorUiEvent.CloseEmulator)
                return@launch
            }

            val userId = userAuth.username
            val contentId = runningRom.rom.retroAchievementsHash
            val ledgerStatus = withContext(Dispatchers.IO) {
                offlineLedgerRepository.getStatus(userId, contentId)
            }

            if (ledgerStatus.integrity == OfflineLedgerIntegrity.OK) {
                if (ledgerStatus.hasPendingHardcoreUnlocks) {
                    val shouldExit = handleHardcorePendingBeforeExit(userId, contentId)
                    if (!shouldExit) {
                        emulatorManager.resumeEmulator()
                        return@launch
                    }
                } else {
                    hardcoreOfflineLossTracker.clearPendingUnlocks(userId, contentId)
                    if (ledgerStatus.pendingSoftcoreUnlockCount > 0) {
                        _toastEvent.tryEmit(
                            ToastEvent.OfflineSoftcorePendingNotice(ledgerStatus.pendingSoftcoreUnlockCount)
                        )
                    }
                }
            }

            stopEmulator()
            _uiEvent.emit(EmulatorUiEvent.CloseEmulator)
        }
    }

    private suspend fun handleHardcorePendingBeforeExit(
        userId: String,
        contentId: String,
    ): Boolean {
        while (true) {
            val ledgerStatus = withContext(Dispatchers.IO) {
                offlineLedgerRepository.getStatus(userId, contentId)
            }
            if (ledgerStatus.integrity != OfflineLedgerIntegrity.OK || !ledgerStatus.hasPendingHardcoreUnlocks) {
                return true
            }

            val choice = awaitHardcorePendingExitChoice(ledgerStatus.pendingHardcoreUnlockCount)
            when (choice) {
                HardcorePendingExitChoice.CONTINUE_PLAYING -> return false
                HardcorePendingExitChoice.EXIT_ANYWAY -> {
                    val discardResult = withContext(Dispatchers.IO) {
                        offlineLedgerRepository.discardPendingHardcoreUnlocks(userId, contentId)
                    }
                    if (discardResult.isFailure) {
                        _toastEvent.tryEmit(ToastEvent.OfflineAchievementsSyncFailed)
                    } else {
                        hardcoreOfflineLossTracker.clearPendingUnlocks(userId, contentId)
                        return true
                    }
                }
            }
        }
    }

    private fun startTrackingPlayTime(rom: Rom) {
        sessionCoroutineScope.launch {
            var lastTime = System.currentTimeMillis()
            while (isActive) {
                delay(1000)
                val now = System.currentTimeMillis()
                romsRepository.addRomPlayTime(rom, (now - lastTime).milliseconds)
                lastTime = now
            }
        }
    }

    fun onPauseMenuOptionSelected(option: PauseMenuOption) {
        when (option) {
            is RomPauseMenuOption -> {
                when (option) {
                    RomPauseMenuOption.SETTINGS -> _uiEvent.tryEmit(EmulatorUiEvent.OpenScreen.SettingsScreen)
                    RomPauseMenuOption.SAVE_STATE -> {
                        (_emulatorState.value as? EmulatorState.RunningRom)?.let {
                            val saveStateSlots = getRomSaveStateSlots(it.rom)
                            _uiEvent.tryEmit(EmulatorUiEvent.ShowRomSaveStates(saveStateSlots, EmulatorUiEvent.ShowRomSaveStates.Reason.SAVING))
                        }
                    }
                    RomPauseMenuOption.LOAD_STATE -> {
                        (_emulatorState.value as? EmulatorState.RunningRom)?.let {
                            val saveStateSlots = getRomSaveStateSlots(it.rom)
                            _uiEvent.tryEmit(EmulatorUiEvent.ShowRomSaveStates(saveStateSlots, EmulatorUiEvent.ShowRomSaveStates.Reason.LOADING))
                        }
                    }
                    RomPauseMenuOption.REWIND -> {
                        sessionCoroutineScope.launch {
                            val rewindWindow = emulatorManager.getRewindWindow()
                            _uiEvent.emit(EmulatorUiEvent.ShowRewindWindow(rewindWindow))
                        }
                    }
                    RomPauseMenuOption.CHEATS -> {
                        (_emulatorState.value as? EmulatorState.RunningRom)?.let {
                            getRomInfo(it.rom)?.let { romInfo ->
                                _uiEvent.tryEmit(EmulatorUiEvent.OpenScreen.CheatsScreen(romInfo))
                            }
                        }
                    }
                    RomPauseMenuOption.VIEW_ACHIEVEMENTS -> _uiEvent.tryEmit(EmulatorUiEvent.ShowAchievementList)
                    RomPauseMenuOption.PRESETS -> _uiEvent.tryEmit(EmulatorUiEvent.ShowDualScreenPresets)
                    RomPauseMenuOption.RESET -> resetEmulator()
                    RomPauseMenuOption.EXIT -> {
                        requestExitRom()
                    }
                }
            }
            is FirmwarePauseMenuOption -> {
                when (option) {
                    FirmwarePauseMenuOption.SETTINGS -> _uiEvent.tryEmit(EmulatorUiEvent.OpenScreen.SettingsScreen)
                    FirmwarePauseMenuOption.RESET -> resetEmulator()
                    FirmwarePauseMenuOption.EXIT -> {
                        stopEmulator()
                        _uiEvent.tryEmit(EmulatorUiEvent.CloseEmulator)
                    }
                }
            }
        }
    }

    fun onOpenRewind() {
        if (!settingsRepository.isRewindEnabled()) {
            _toastEvent.tryEmit(ToastEvent.RewindNotEnabled)
            return
        }

        if (!emulatorSession.areSaveStateLoadsAllowed()) {
            _toastEvent.tryEmit(ToastEvent.RewindNotAvailableWhileRAHardcoreModeEnabled)
            return
        }

        sessionCoroutineScope.launch {
            emulatorManager.pauseEmulator()
            val rewindWindow = emulatorManager.getRewindWindow()
            _uiEvent.emit(EmulatorUiEvent.ShowRewindWindow(rewindWindow))
        }
    }

    fun rewindToState(rewindSaveState: RewindSaveState) {
        sessionCoroutineScope.launch {
            emulatorManager.loadRewindState(rewindSaveState)
        }
    }

    fun saveStateToSlot(slot: SaveStateSlot) {
        sessionCoroutineScope.launch(Dispatchers.IO) {
            (_emulatorState.value as? EmulatorState.RunningRom)?.let {
                if (!saveRomState(it.rom, slot)) {
                    _toastEvent.emit(ToastEvent.StateSaveFailed)
                }
                emulatorManager.resumeEmulator()
            }
        }
    }

    fun loadStateFromSlot(slot: SaveStateSlot) {
        if (!slot.exists) {
            _toastEvent.tryEmit(ToastEvent.StateStateDoesNotExist)
        } else {
            sessionCoroutineScope.launch {
                (_emulatorState.value as? EmulatorState.RunningRom)?.let {
                    if (!loadRomState(it.rom, slot)) {
                        _toastEvent.emit(ToastEvent.StateLoadFailed)
                    }
                    emulatorManager.resumeEmulator()
                }
            }
        }
    }

    fun doQuickSave() {
        val currentState = _emulatorState.value
        when (currentState) {
            is EmulatorState.RunningRom -> {
                sessionCoroutineScope.launch {
                    emulatorManager.pauseEmulator()
                    val quickSlot = saveStatesRepository.getRomQuickSaveStateSlot(currentState.rom)
                    if (saveRomState(currentState.rom, quickSlot)) {
                        _toastEvent.emit(ToastEvent.QuickSaveSuccessful)
                    }
                    emulatorManager.resumeEmulator()
                }
            }
            is EmulatorState.RunningFirmware -> {
                _toastEvent.tryEmit(ToastEvent.CannotSaveStateWhenRunningFirmware)
            }
            else -> {
                // Do nothing
            }
        }
    }

    fun doQuickLoad() {
        val currentState = _emulatorState.value
        when (currentState) {
            is EmulatorState.RunningRom -> {
                if (emulatorSession.areSaveStateLoadsAllowed()) {
                    sessionCoroutineScope.launch {
                        emulatorManager.pauseEmulator()
                        val quickSlot = saveStatesRepository.getRomQuickSaveStateSlot(currentState.rom)
                        if (loadRomState(currentState.rom, quickSlot)) {
                            _toastEvent.emit(ToastEvent.QuickLoadSuccessful)
                        }
                        emulatorManager.resumeEmulator()
                    }
                } else {
                    _toastEvent.tryEmit(ToastEvent.CannotUseSaveStatesWhenRAHardcoreIsEnabled)
                }
            }
            is EmulatorState.RunningFirmware -> {
                _toastEvent.tryEmit(ToastEvent.CannotLoadStateWhenRunningFirmware)
            }
            else -> {
                // Do nothing
            }
        }
    }

    fun deleteSaveStateSlot(slot: SaveStateSlot): List<SaveStateSlot>? {
        return (_emulatorState.value as? EmulatorState.RunningRom)?.let {
            saveStatesRepository.deleteRomSaveState(it.rom, slot)
            getRomSaveStateSlots(it.rom)
        }
    }

    private suspend fun saveRomState(rom: Rom, slot: SaveStateSlot): Boolean {
        val slotUri = saveStatesRepository.getRomSaveStateUri(rom, slot)
        return if (emulatorManager.saveState(slotUri)) {
            val screenshot = screenshotFrameBufferProvider.getScreenshot()
            saveStatesRepository.setRomSaveStateScreenshot(rom, slot, screenshot)
            true
        } else {
            false
        }
    }

    private suspend fun loadRomState(rom: Rom, slot: SaveStateSlot): Boolean {
        if (!slot.exists) {
            return false
        }

        val slotUri = saveStatesRepository.getRomSaveStateUri(rom, slot)
        val success = emulatorManager.loadState(slotUri)
        if (success) {
            _achievementsEvent.emit(RAEventUi.Reset)
        }

        return success
    }

    private fun startObservingRuntimeInputLayoutConfiguration() {
        sessionCoroutineScope.launch {
            val dualScreenPresetConfiguration = combine(
                _dualScreenPreset,
                _dualScreenIntegerScaleEnabled,
                _externalDisplayKeepAspectRatioEnabled,
                _dualScreenInternalFillHeightEnabled,
                _dualScreenInternalFillWidthEnabled,
                _dualScreenExternalFillHeightEnabled,
                _dualScreenExternalFillWidthEnabled,
                _dualScreenInternalVerticalAlignmentOverride,
                _dualScreenExternalVerticalAlignmentOverride,
            ) { values: Array<Any?> ->
                @Suppress("UNCHECKED_CAST")
                DualScreenPresetConfiguration(
                    preset = values[0] as DualScreenPreset,
                    integerScale = values[1] as Boolean,
                    keepAspectRatio = values[2] as Boolean,
                    internalFillHeight = values[3] as Boolean,
                    internalFillWidth = values[4] as Boolean,
                    externalFillHeight = values[5] as Boolean,
                    externalFillWidth = values[6] as Boolean,
                    internalAlignmentOverride = values[7] as ScreenAlignment?,
                    externalAlignmentOverride = values[8] as ScreenAlignment?,
                )
            }

            val layoutConfiguration = combine(
                _layout,
                uiLayoutProvider.currentLayout,
                settingsRepository.getSoftInputBehaviour(),
                settingsRepository.isTouchHapticFeedbackEnabled(),
                settingsRepository.getSoftInputOpacity(),
            ) { globalLayoutConfiguration, variant, softInputBehaviour, isHapticFeedbackEnabled, inputOpacity ->
                RuntimeLayoutConfiguration(
                    layoutConfiguration = globalLayoutConfiguration,
                    layoutVariant = variant,
                    softInputBehaviour = softInputBehaviour,
                    isHapticFeedbackEnabled = isHapticFeedbackEnabled,
                    inputOpacity = inputOpacity,
                )
            }

            combine(layoutConfiguration, dualScreenPresetConfiguration) { config, dualScreenConfig ->
                val currentLayoutConfiguration = config.layoutConfiguration
                val currentLayoutVariant = config.layoutVariant
                val currentVariant = currentLayoutVariant?.first
                val currentLayout = currentLayoutVariant?.second
                if (currentLayoutConfiguration == null || currentLayout == null || currentVariant == null) {
                    null
                } else {
                    val opacity = if (currentLayoutConfiguration.useCustomOpacity) {
                        currentLayoutConfiguration.opacity
                    } else {
                        config.inputOpacity
                    }

                    val adjustedLayout = applyDualScreenPresetLayoutOverrides(currentLayout, currentVariant, dualScreenConfig)
                    RuntimeInputLayoutConfiguration(
                        softInputBehaviour = config.softInputBehaviour,
                        softInputOpacity = opacity,
                        isHapticFeedbackEnabled = config.isHapticFeedbackEnabled,
                        layoutOrientation = currentLayoutConfiguration.orientation,
                        layout = adjustedLayout,
                    )
                }
            }.collect(_runtimeLayout)
        }
    }

    private data class RuntimeLayoutConfiguration(
        val layoutConfiguration: LayoutConfiguration?,
        val layoutVariant: Pair<UILayoutVariant, UILayout>?,
        val softInputBehaviour: SoftInputBehaviour,
        val isHapticFeedbackEnabled: Boolean,
        val inputOpacity: Int,
    )

    private data class DualScreenPresetConfiguration(
        val preset: DualScreenPreset,
        val integerScale: Boolean,
        val keepAspectRatio: Boolean,
        val internalFillHeight: Boolean,
        val internalFillWidth: Boolean,
        val externalFillHeight: Boolean,
        val externalFillWidth: Boolean,
        val internalAlignmentOverride: ScreenAlignment?,
        val externalAlignmentOverride: ScreenAlignment?,
    )

    private fun applyDualScreenPresetLayoutOverrides(layout: UILayout, variant: UILayoutVariant, config: DualScreenPresetConfiguration): UILayout {
        if (config.preset == DualScreenPreset.OFF || variant.displays.secondaryScreenDisplay == null) {
            return layout
        }

        val canFill = config.integerScale || config.keepAspectRatio
        val internalAlignment = config.internalAlignmentOverride ?: config.preset.defaultInternalAlignment()
        val externalAlignment = config.externalAlignmentOverride ?: config.preset.defaultExternalAlignment()

        val adjustedInternalLayout = applyScreenScaleToLayout(
            screenLayout = layout.mainScreenLayout,
            availableWidth = variant.uiSize.x,
            availableHeight = variant.uiSize.y,
            integerScale = config.integerScale,
            keepAspectRatio = config.keepAspectRatio,
            fillHeight = config.internalFillHeight && canFill,
            fillWidth = config.internalFillWidth && canFill,
            alignment = internalAlignment,
        )

        val secondaryDisplay = variant.displays.secondaryScreenDisplay
        val adjustedSecondaryLayout = applyScreenScaleToLayout(
            screenLayout = layout.secondaryScreenLayout,
            availableWidth = secondaryDisplay.width,
            availableHeight = secondaryDisplay.height,
            integerScale = config.integerScale,
            keepAspectRatio = config.keepAspectRatio,
            fillHeight = config.externalFillHeight && canFill,
            fillWidth = config.externalFillWidth && canFill,
            alignment = externalAlignment,
        )

        return layout.copy(
            mainScreenLayout = adjustedInternalLayout,
            secondaryScreenLayout = adjustedSecondaryLayout,
        )
    }

    private fun applyScreenScaleToLayout(
        screenLayout: ScreenLayout,
        availableWidth: Int,
        availableHeight: Int,
        integerScale: Boolean,
        keepAspectRatio: Boolean,
        fillHeight: Boolean,
        fillWidth: Boolean,
        alignment: ScreenAlignment,
    ): ScreenLayout {
        val currentComponents = screenLayout.components ?: return screenLayout
        val screenComponents = currentComponents.filter { it.isScreen() }
        if (screenComponents.size != 1) {
            return screenLayout
        }
        if (availableWidth <= 0 || availableHeight <= 0) {
            return screenLayout
        }

        val screenComponent = screenComponents.single()
        val scaledRect = computeScaledScreenRect(
            availableWidth = availableWidth,
            availableHeight = availableHeight,
            integerScale = integerScale,
            keepAspectRatio = keepAspectRatio,
            fillHeight = fillHeight,
            fillWidth = fillWidth,
            alignment = alignment,
        )

        val updatedComponents = currentComponents.map {
            if (it == screenComponent) {
                it.copy(rect = scaledRect)
            } else {
                it
            }
        }
        return screenLayout.copy(components = updatedComponents)
    }

    private fun computeScaledScreenRect(
        availableWidth: Int,
        availableHeight: Int,
        integerScale: Boolean,
        keepAspectRatio: Boolean,
        fillHeight: Boolean,
        fillWidth: Boolean,
        alignment: ScreenAlignment,
    ): Rect {
        val (baseWidth, baseHeight) = when {
            integerScale -> computeIntegerScaleDimensions(availableWidth, availableHeight)
            keepAspectRatio -> computeAspectRatioDimensions(availableWidth, availableHeight)
            else -> availableWidth to availableHeight
        }

        val scaledWidth = if (fillWidth) availableWidth else baseWidth
        val scaledHeight = if (fillHeight) availableHeight else baseHeight

        val left = ((availableWidth - scaledWidth) / 2f).roundToInt().coerceAtLeast(0)
        val top = when (alignment) {
            ScreenAlignment.TOP -> 0
            ScreenAlignment.CENTER -> ((availableHeight - scaledHeight) / 2f).roundToInt().coerceAtLeast(0)
            ScreenAlignment.BOTTOM -> (availableHeight - scaledHeight).coerceAtLeast(0)
        }

        return Rect(left, top, scaledWidth.coerceAtLeast(1), scaledHeight.coerceAtLeast(1))
    }

    private fun computeIntegerScaleDimensions(availableWidth: Int, availableHeight: Int): Pair<Int, Int> {
        val widthScale = availableWidth / SCREEN_WIDTH
        val heightScale = availableHeight / SCREEN_HEIGHT
        val maxIntegerScale = min(widthScale, heightScale)
        val scale = if (maxIntegerScale <= 0) {
            min(
                availableWidth.toFloat() / SCREEN_WIDTH,
                availableHeight.toFloat() / SCREEN_HEIGHT,
            )
        } else {
            maxIntegerScale.toFloat()
        }
        val width = (SCREEN_WIDTH * scale).roundToInt().coerceAtLeast(1).coerceAtMost(availableWidth)
        val height = (SCREEN_HEIGHT * scale).roundToInt().coerceAtLeast(1).coerceAtMost(availableHeight)
        return width to height
    }

    private fun computeAspectRatioDimensions(availableWidth: Int, availableHeight: Int): Pair<Int, Int> {
        val widthRatio = availableWidth.toFloat() / SCREEN_WIDTH
        val heightRatio = availableHeight.toFloat() / SCREEN_HEIGHT
        val scale = min(widthRatio, heightRatio)
        val width = (SCREEN_WIDTH * scale).roundToInt().coerceAtLeast(1).coerceAtMost(availableWidth)
        val height = (SCREEN_HEIGHT * scale).roundToInt().coerceAtLeast(1).coerceAtMost(availableHeight)
        return width to height
    }

    private fun resetEmulatorState(newState: EmulatorState) {
        finalizeOfflineRetroAchievementsSessionIfNeeded()
        sessionCoroutineScope.notifyNewSessionStarted()
        emulatorSession.reset()
        raSessionJob = null
        _currentFps.value = null
        _emulatorState.value = newState
        _mainScreenBackground.value = RuntimeBackground.None
        _secondaryScreenBackground.value = RuntimeBackground.None
        _layout.value = null
        currentRom = null
        currentRetroAchievementsGameId = null
        offlineSyncChoiceDeferred?.cancel()
        offlineSyncChoiceDeferred = null
        hardcoreExitChoiceDeferred?.cancel()
        hardcoreExitChoiceDeferred = null
        retroAchievementsNetworkMode = RetroAchievementsNetworkMode.ONLINE_LIVE
        retroAchievementsSessionMode = RetroAchievementsSessionMode.SOFTCORE
        isHardcoreEligibleAfterOnlineStart = false
        startedSessionOnlineLive = false
    }

    private fun startObservingAchievementEvents() {
        sessionCoroutineScope.launch {
            emulatorManager.observeRetroAchievementEvents().collect {
                when (it) {
                    is RAEvent.OnAchievementPrimed -> onAchievementPrimed(it.achievementId)
                    is RAEvent.OnAchievementUnPrimed -> onAchievementUnPrimed(it.achievementId)
                    is RAEvent.OnAchievementTriggered -> onAchievementTriggered(it.achievementId)
                    is RAEvent.OnAchievementProgressUpdated -> onAchievementProgressUpdated(it)
                    is RAEvent.OnLeaderboardAttemptStarted -> onLeaderboardAttemptStarted(it)
                    is RAEvent.OnLeaderboardAttemptUpdated -> onLeaderboardAttemptUpdated(it)
                    is RAEvent.OnLeaderboardAttemptCompleted -> onLeaderboardAttemptCompleted(it)
                    is RAEvent.OnLeaderboardAttemptCancelled -> onLeaderboardAttemptCancelled(it)
                }
            }
        }
    }

    private fun startObservingMainScreenBackground() {
        sessionCoroutineScope.launch {
            combine(uiLayoutProvider.currentLayout, ensureEmulatorIsRunning()) { variant, _ ->
                val layout = variant?.second
                if (layout == null) {
                    RuntimeBackground.None
                } else {
                    loadBackground(layout.mainScreenLayout.backgroundId, layout.mainScreenLayout.backgroundMode)
                }
            }.collect(_mainScreenBackground)
        }
    }

    private fun startObservingSecondaryScreenBackground() {
        sessionCoroutineScope.launch {
            combine(uiLayoutProvider.currentLayout, ensureEmulatorIsRunning()) { variant, _ ->
                val layout = variant?.second
                if (layout == null) {
                    RuntimeBackground.None
                } else {
                    loadBackground(layout.secondaryScreenLayout.backgroundId, layout.secondaryScreenLayout.backgroundMode)
                }
            }.collect(_secondaryScreenBackground)
        }
    }

    private fun startObservingLayoutForRom(rom: Rom) {
        val romLayoutId = rom.config.layoutId
        val layoutFlow = if (romLayoutId == null) {
            getGlobalLayoutFlow()
        } else {
            // Load and observe ROM layout but switch to global layout if the ROM layout stops existing
            layoutsRepository.observeLayout(romLayoutId)
                .onCompletion {
                    emitAll(getGlobalLayoutFlow())
                }
        }

        sessionCoroutineScope.launch {
            combine(layoutFlow, ensureEmulatorIsRunning()) { layout, _ ->
                layout
            }.collect(_layout)
        }
    }

    private fun startObservingRendererConfiguration() {
        sessionCoroutineScope.launch {
            settingsRepository.observeRenderConfiguration().collectLatest {
                _runtimeRendererConfiguration.value = RuntimeRendererConfiguration(it.videoFiltering, it.resolutionScaling, it.customShader)
            }
        }
    }

    private fun startObservingLayoutForFirmware() {
        _layout.value = null

        sessionCoroutineScope.launch {
            combine(getGlobalLayoutFlow(), ensureEmulatorIsRunning()) { layout, _ ->
                layout
            }.collect(_layout)
        }
    }

    private suspend fun loadBackground(backgroundId: UUID?, mode: BackgroundMode): RuntimeBackground {
        return if (backgroundId == null) {
            RuntimeBackground(null, mode)
        } else {
            val background = backgroundsRepository.getBackground(backgroundId)
            RuntimeBackground(background, mode)
        }
    }

    private fun getGlobalLayoutFlow(): Flow<LayoutConfiguration> {
        return settingsRepository.observeSelectedLayoutId()
            .flatMapLatest {
                layoutsRepository.observeLayout(it)
                    .onCompletion {
                        emitAll(layoutsRepository.observeLayout(LayoutConfiguration.DEFAULT_ID))
                    }
            }
    }

    private fun getRomInfo(rom: Rom): RomInfo? {
        val fileRomProcessor = romFileProcessorFactory.getFileRomProcessorForDocument(rom.uri)
        return fileRomProcessor?.getRomInfo(rom)
    }

    private fun getRomSaveStateSlots(rom: Rom): List<SaveStateSlot> {
        return saveStatesRepository.getRomSaveStates(rom)
    }

    fun isSustainedPerformanceModeEnabled(): Boolean {
        return settingsRepository.isSustainedPerformanceModeEnabled()
    }

    fun getFpsCounterPosition(): FpsCounterPosition {
        return settingsRepository.getFpsCounterPosition()
    }

    private suspend fun getRomEnabledCheats(romInfo: RomInfo): List<Cheat> {
        if (!settingsRepository.areCheatsEnabled() || !emulatorSession.areCheatsEnabled()) {
            return emptyList()
        }

        return cheatsRepository.getRomEnabledCheats(romInfo)
    }

    private suspend fun getRomAchievementData(rom: Rom): GameAchievementData {
        val userAuth = retroAchievementsRepository.getUserAuthentication()
        if (userAuth == null) {
            return GameAchievementData.withDisabledRetroAchievementsIntegration(GameAchievementData.IntegrationStatus.DISABLED_NOT_LOGGED_IN)
        }

        return retroAchievementsRepository.getUserGameData(rom.retroAchievementsHash, emulatorSession.isRetroAchievementsHardcoreModeEnabled).fold(
            onSuccess = { userGameData ->
                val gameSummary = retroAchievementsRepository.getGameSummary(rom.retroAchievementsHash)

                if (userGameData != null) {
                    currentRetroAchievementsGameId = userGameData.id.id
                    maybeWritePrefetchCache(
                        userId = userAuth.username,
                        contentId = rom.retroAchievementsHash,
                        userGameData = userGameData,
                    )

                    val achievements = userGameData.sets.flatMap { it.achievements }
                    val leaderboards = userGameData.sets.flatMap { it.leaderboards }
                    val hasLeaderboards = leaderboards.isNotEmpty() && emulatorSession.areLeaderboardsEnabled()

                    if (achievements.isEmpty() && !hasLeaderboards) {
                        GameAchievementData.withLimitedRetroAchievementsIntegration(
                            richPresencePatch = gameSummary?.richPresencePatch,
                            icon = gameSummary?.icon,
                        )
                    } else {
                        val lockedAchievements = achievements.filter { !it.isUnlocked }.map { RASimpleAchievement(it.achievement.id, it.achievement.memoryAddress) }
                        val leaderboards = if (hasLeaderboards) {
                            leaderboards.map { RASimpleLeaderboard(it.id, it.mem, it.format) }
                        } else {
                            emptyList()
                        }

                        GameAchievementData.withFullRetroAchievementsIntegration(
                            lockedAchievements = lockedAchievements,
                            leaderboards = leaderboards,
                            totalAchievementCount = achievements.size,
                            richPresencePatch = gameSummary?.richPresencePatch,
                            icon = gameSummary?.icon,
                        )
                    }
                } else {
                    currentRetroAchievementsGameId = null
                    GameAchievementData.withDisabledRetroAchievementsIntegration(
                        status = GameAchievementData.IntegrationStatus.DISABLED_GAME_NOT_FOUND,
                        icon = gameSummary?.icon,
                    )
                }
            },
            onFailure = {
                currentRetroAchievementsGameId = null
                // Maybe we have the game summary cached. Could allow the icon to be displayed, which looks better
                val gameSummary = retroAchievementsRepository.getGameSummary(rom.retroAchievementsHash)
                GameAchievementData.withDisabledRetroAchievementsIntegration(GameAchievementData.IntegrationStatus.DISABLED_LOAD_ERROR, gameSummary?.icon)
            }
        )
    }

    private suspend fun maybeWritePrefetchCache(
        userId: String,
        contentId: String,
        userGameData: me.magnum.melonds.domain.model.retroachievements.RAUserGameData,
    ) {
        if (!networkStatusProvider.isOnline()) return

        val achievements = userGameData.sets
            .asSequence()
            .flatMap { it.achievements.asSequence() }
            .map { OfflinePrefetchCacheAchievement(it.achievement.id, it.achievement.memoryAddress) }
            .distinctBy { it.id }
            .toList()

        val leaderboards = userGameData.sets
            .asSequence()
            .flatMap { it.leaderboards.asSequence() }
            .map { OfflinePrefetchCacheLeaderboard(it.id, it.mem, it.format) }
            .distinctBy { it.id }
            .toList()

        val cacheFile = OfflinePrefetchCacheFile(
            romHash = contentId,
            gameId = userGameData.id.id,
            achievements = achievements,
            leaderboards = leaderboards,
            richPresencePatch = userGameData.richPresencePatch,
            iconUrl = userGameData.icon.toString(),
            fetchedAtEpochMs = System.currentTimeMillis(),
        )

        try {
            withContext(Dispatchers.IO) {
                offlinePrefetchCacheRepository.write(userId, contentId, cacheFile)
            }
        } catch (_: Exception) {
            // Best-effort cache write. Achievements should still work online even if caching fails.
        }

        // Best-effort: warm icon/badge images so offline popups and lists can render without network.
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val urls = buildList {
                    add(userGameData.icon.toString())
                    userGameData.sets.forEach { set ->
                        add(set.iconUrl.toString())
                        set.achievements.forEach { userAchievement ->
                            add(userAchievement.achievement.badgeUrlLocked.toString())
                            add(userAchievement.achievement.badgeUrlUnlocked.toString())
                        }
                    }
                }
                retroAchievementsImageCacheWarmer.warm(urls)
            } catch (_: Exception) {
                // Best-effort only.
            }
        }
    }

    private fun onAchievementTriggered(achievementId: Long) {
        sessionCoroutineScope.launch {
            val achievement = retroAchievementsRepository.getAchievement(achievementId).getOrNull()
            if (retroAchievementsNetworkMode == RetroAchievementsNetworkMode.ONLINE_LIVE && !networkStatusProvider.isOnline()) {
                transitionToOfflineAccumulationIfNeeded()
            }

            if (retroAchievementsNetworkMode == RetroAchievementsNetworkMode.OFFLINE_ACCUMULATING) {
                handleOfflineAchievementTriggered(achievementId, achievement)
                return@launch
            }

            if (achievement != null) {
                val isHardcoreModeEnabled = emulatorSession.isRetroAchievementsHardcoreModeEnabled
                if (isHardcoreModeEnabled) {
                    attemptSilentHardcoreReplayBeforeOnlineSubmission()
                }
                retroAchievementsRepository.awardAchievement(achievement, isHardcoreModeEnabled).onSuccess {
                    if (it.achievementAwarded) {
                        _achievementsEvent.emit(RAEventUi.AchievementTriggered(achievement))

                        if (it.isSetMastered()) {
                            showSetMastery(achievement.setId, isHardcoreModeEnabled)
                        }
                    }
                }
            }
        }
    }

    private suspend fun transitionToOfflineAccumulationIfNeeded() {
        if (retroAchievementsNetworkMode == RetroAchievementsNetworkMode.OFFLINE_ACCUMULATING) {
            return
        }

        retroAchievementsNetworkMode = RetroAchievementsNetworkMode.OFFLINE_ACCUMULATING
        val unlockMode = if (isHardcoreEligibleAfterOnlineStart) {
            OfflineUnlockMode.HARDCORE
        } else {
            OfflineUnlockMode.SOFTCORE
        }

        val offlineSession = ensureOfflineAccumulationSession(
            unlockMode = unlockMode,
            offlineType = OfflineUnlockType.OFFLINE_AFTER_START,
        )
        if (offlineSession != null && unlockMode == OfflineUnlockMode.HARDCORE) {
            hardcoreOfflineLossTracker.markPendingUnlocks(
                userId = offlineSession.userId,
                contentId = offlineSession.contentId,
                gameTitle = currentRom?.name ?: offlineSession.contentId,
            )
            _toastEvent.tryEmit(ToastEvent.HardcoreOfflineUnsyncedWarning(1))
        }
    }

    private suspend fun ensureOfflineAccumulationSession(
        unlockMode: OfflineUnlockMode,
        offlineType: OfflineUnlockType,
    ): OfflineRetroAchievementsSession? {
        val existing = offlineRetroAchievementsSession
        if (existing != null) {
            return existing
        }

        val userAuth = retroAchievementsRepository.getUserAuthentication() ?: return null
        val rom = currentRom ?: return null
        val gameId = currentRetroAchievementsGameId ?: run {
            val offlineContext = buildOfflineRetroAchievementsContext(rom)
            if (offlineContext?.missingCache == true) {
                return null
            }
            offlineContext?.cache?.gameId
        } ?: return null

        val startedAtEpochMs = System.currentTimeMillis()
        val sessionId = UUID.randomUUID().toString()
        val created = OfflineRetroAchievementsSession(
            userId = userAuth.username,
            contentId = rom.retroAchievementsHash,
            gameId = gameId,
            unlockMode = unlockMode,
            offlineType = offlineType,
            sessionId = sessionId,
            startedAtEpochMs = startedAtEpochMs,
            nextOrderIndex = 0L,
        )

        val appendResult = withContext(Dispatchers.IO) {
            offlineLedgerRepository.appendSessionStart(
                userId = created.userId,
                contentId = created.contentId,
                gameId = created.gameId,
                sessionId = created.sessionId,
                startedAtEpochMs = startedAtEpochMs,
                isHardcore = unlockMode == OfflineUnlockMode.HARDCORE,
                unlockMode = unlockMode,
                offlineType = offlineType,
            )
        }

        if (appendResult.isFailure) {
            return null
        }

        offlineRetroAchievementsSession = created
        return created
    }

    private suspend fun handleOfflineAchievementTriggered(achievementId: Long, achievement: me.magnum.rcheevosapi.model.RAAchievement?) {
        val offlineSession = offlineRetroAchievementsSession ?: run {
            val offlineType = if (startedSessionOnlineLive) {
                OfflineUnlockType.OFFLINE_AFTER_START
            } else {
                OfflineUnlockType.OFFLINE_FROM_START
            }
            val unlockMode = if (offlineType == OfflineUnlockType.OFFLINE_AFTER_START && isHardcoreEligibleAfterOnlineStart) {
                OfflineUnlockMode.HARDCORE
            } else {
                OfflineUnlockMode.SOFTCORE
            }
            ensureOfflineAccumulationSession(unlockMode = unlockMode, offlineType = offlineType)
        }
        if (offlineSession != null) {
            val now = System.currentTimeMillis()
            val offsetMs = (now - offlineSession.startedAtEpochMs).coerceAtLeast(0L)
            val orderIndex = offlineSession.nextOrderIndex
            offlineSession.nextOrderIndex = orderIndex + 1L

            withContext(Dispatchers.IO) {
                retroAchievementsDao.addUserAchievement(
                    RAUserAchievementEntity(
                        gameId = offlineSession.gameId,
                        achievementId = achievementId,
                        isUnlocked = true,
                        isHardcore = offlineSession.unlockMode == OfflineUnlockMode.HARDCORE,
                    )
                )

                offlineLedgerRepository.appendAchievementUnlock(
                    userId = offlineSession.userId,
                    contentId = offlineSession.contentId,
                    gameId = offlineSession.gameId,
                    achievementId = achievementId,
                    isHardcore = offlineSession.unlockMode == OfflineUnlockMode.HARDCORE,
                    sessionId = offlineSession.sessionId,
                    localTimestampEpochMs = now,
                    offsetFromSessionStartMs = offsetMs,
                    orderIndex = orderIndex,
                    unlockMode = offlineSession.unlockMode,
                    offlineType = offlineSession.offlineType,
                )
            }

            if (offlineSession.unlockMode == OfflineUnlockMode.HARDCORE) {
                hardcoreOfflineLossTracker.markPendingUnlocks(
                    userId = offlineSession.userId,
                    contentId = offlineSession.contentId,
                    gameTitle = currentRom?.name ?: offlineSession.contentId,
                )
            }
        }

        if (achievement != null) {
            _achievementsEvent.emit(RAEventUi.AchievementTriggered(achievement))
        }
    }

    private fun onAchievementPrimed(achievementId: Long) {
        if (settingsRepository.areRetroAchievementsActiveChallengeIndicatorsEnabled()) {
            sessionCoroutineScope.launch {
                retroAchievementsRepository.getAchievement(achievementId).onSuccess { achievement ->
                    if (achievement != null) {
                        _achievementsEvent.emit(RAEventUi.AchievementPrimed(achievement))
                    }
                }
            }
        }
    }

    private fun onAchievementUnPrimed(achievementId: Long) {
        sessionCoroutineScope.launch {
            retroAchievementsRepository.getAchievement(achievementId).onSuccess { achievement ->
                if (achievement != null) {
                    _achievementsEvent.emit(RAEventUi.AchievementUnPrimed(achievement))
                }
            }
        }
    }

    private fun onAchievementProgressUpdated(progressEvent: RAEvent.OnAchievementProgressUpdated) {
        if (settingsRepository.areRetroAchievementsProgressIndicatorsEnabled()) {
            sessionCoroutineScope.launch {
                retroAchievementsRepository.getAchievement(progressEvent.achievementId).onSuccess { achievement ->
                    if (achievement != null) {
                        _achievementsEvent.emit(RAEventUi.AchievementProgressUpdated(achievement, progressEvent.current, progressEvent.target, progressEvent.progress))
                    }
                }
            }
        }
    }

    private fun onLeaderboardAttemptStarted(startEvent: RAEvent.OnLeaderboardAttemptStarted) {
        sessionCoroutineScope.launch {
            if (settingsRepository.areRetroAchievementsLeaderboardIndicatorsEnabled()) {
                val leaderboard = retroAchievementsRepository.getLeaderboard(startEvent.leaderboardId)
                if (leaderboard != null) {
                    val setSummary = retroAchievementsRepository.getAchievementSetSummary(leaderboard.setId)
                    if (setSummary != null) {
                        _achievementsEvent.emit(RAEventUi.LeaderboardAttemptStarted(leaderboard, setSummary.iconUrl))
                    }
                }
            }
        }
    }

    private fun onLeaderboardAttemptUpdated(updateEvent: RAEvent.OnLeaderboardAttemptUpdated) {
        sessionCoroutineScope.launch {
            if (settingsRepository.areRetroAchievementsLeaderboardIndicatorsEnabled()) {
                _achievementsEvent.emit(RAEventUi.LeaderboardAttemptUpdated(updateEvent.leaderboardId, updateEvent.formattedValue))
            }
        }
    }

    private fun onLeaderboardAttemptCompleted(completionEvent: RAEvent.OnLeaderboardAttemptCompleted) {
        sessionCoroutineScope.launch {
            if (retroAchievementsNetworkMode == RetroAchievementsNetworkMode.ONLINE_LIVE && !networkStatusProvider.isOnline()) {
                transitionToOfflineAccumulationIfNeeded()
            }

            if (retroAchievementsNetworkMode == RetroAchievementsNetworkMode.OFFLINE_ACCUMULATING) {
                // Offline mode: avoid server submission (no Smart Sync support for leaderboards in this POC).
                _achievementsEvent.emit(RAEventUi.LeaderboardAttemptCancelled(completionEvent.leaderboardId))
                return@launch
            }

            if (emulatorSession.isRetroAchievementsHardcoreModeEnabled) {
                attemptSilentHardcoreReplayBeforeOnlineSubmission()
            }

            retroAchievementsRepository.submitLeaderboardEntry(completionEvent.leaderboardId, completionEvent.value).fold(
                onSuccess = { submissionResponse ->
                    retroAchievementsRepository.getLeaderboard(completionEvent.leaderboardId)?.let { leaderboard ->
                        retroAchievementsRepository.getAchievementSetSummary(leaderboard.setId)?.let { setSummary ->
                            val submissionEvent = RAEventUi.LeaderboardEntrySubmitted(
                                leaderboardId = completionEvent.leaderboardId,
                                title = submissionResponse.title,
                                gameIcon = setSummary.iconUrl,
                                formattedScore = submissionResponse.formattedScore,
                                rank = submissionResponse.rank,
                                numberOfEntries = submissionResponse.numEntries,
                            )
                            _achievementsEvent.emit(submissionEvent)
                        }
                    }
                },
                onFailure = {
                    // Submission failed. Submit a cancellation event anyway to ensure the attempt indicator is dismissed
                    _achievementsEvent.emit(RAEventUi.LeaderboardAttemptCancelled(completionEvent.leaderboardId))
                },
            )
        }
    }

    private suspend fun attemptSilentHardcoreReplayBeforeOnlineSubmission() {
        if (!networkStatusProvider.isOnline()) return

        val rom = currentRom ?: return
        val userAuth = retroAchievementsRepository.getUserAuthentication() ?: return
        val userId = userAuth.username
        val contentId = rom.retroAchievementsHash

        val statusBefore = withContext(Dispatchers.IO) {
            offlineLedgerRepository.getStatus(userId, contentId)
        }
        if (statusBefore.integrity != OfflineLedgerIntegrity.OK || !statusBefore.hasPendingHardcoreUnlocks) {
            return
        }

        withContext(Dispatchers.IO) {
            smartSyncEngine.syncHardcoreNow(userId, contentId)
        }

        val statusAfter = withContext(Dispatchers.IO) {
            offlineLedgerRepository.getStatus(userId, contentId)
        }
        if (statusAfter.integrity == OfflineLedgerIntegrity.OK && !statusAfter.hasPendingHardcoreUnlocks) {
            hardcoreOfflineLossTracker.clearPendingUnlocks(userId, contentId)
        }
    }

    private fun onLeaderboardAttemptCancelled(cancelEvent: RAEvent.OnLeaderboardAttemptCancelled) {
        sessionCoroutineScope.launch {
            _achievementsEvent.emit(RAEventUi.LeaderboardAttemptCancelled(cancelEvent.leaderboardId))
        }
    }

    private suspend fun showSetMastery(setId: RASetId, forHardcoreMode: Boolean) {
        val rom = (emulatorSession.currentSessionType() as? EmulatorSession.SessionType.RomSession)?.rom
        if (rom != null) {
            val setSummary = retroAchievementsRepository.getAchievementSetSummary(setId)
            val raUserName = retroAchievementsRepository.getUserAuthentication()?.username
            val romPlayTime = romsRepository.getRomAtUri(rom.uri)?.totalPlayTime

            if (setSummary != null) {
                val title = if (setSummary.type == RAAchievementSet.Type.Core) {
                    val gameSummary = retroAchievementsRepository.getGameSummary(rom.retroAchievementsHash)
                    gameSummary?.title.orEmpty()
                } else {
                    setSummary.title.orEmpty()
                }

                val masteryEvent = RAEventUi.GameMastered(
                    gameTitle = title,
                    gameIcon = setSummary.iconUrl,
                    userName = raUserName,
                    playTime = romPlayTime,
                    forHardcodeMode = forHardcoreMode,
                )
                _achievementsEvent.emit(masteryEvent)
            }
        }
    }

    private fun startRetroAchievementsSession(rom: Rom, launchDecision: RetroAchievementsLaunchDecision) {
        sessionCoroutineScope.launch {
            offlineRetroAchievementsSession = null

            val networkMode = launchDecision.networkMode
            val offlineContext = if (networkMode == RetroAchievementsNetworkMode.OFFLINE_ACCUMULATING) {
                buildOfflineRetroAchievementsContext(rom)
            } else {
                null
            }

            val achievementData = when (networkMode) {
                RetroAchievementsNetworkMode.ONLINE_LIVE -> getRomAchievementData(rom)
                RetroAchievementsNetworkMode.OFFLINE_ACCUMULATING -> offlineContext?.achievementData
                    ?: GameAchievementData.withDisabledRetroAchievementsIntegration(GameAchievementData.IntegrationStatus.DISABLED_LOAD_ERROR)
            }

            emulatorSession.updateRetroAchievementsIntegrationStatus(achievementData.retroAchievementsIntegrationStatus)
            if (!achievementData.isRetroAchievementsIntegrationEnabled) {
                if (networkMode == RetroAchievementsNetworkMode.OFFLINE_ACCUMULATING && offlineContext?.missingCache == true) {
                    _raIntegrationEvent.tryEmit(RAIntegrationEvent.OfflineDisabledNoCache(achievementData.icon))
                } else if (achievementData.retroAchievementsIntegrationStatus == GameAchievementData.IntegrationStatus.DISABLED_LOAD_ERROR) {
                    _raIntegrationEvent.tryEmit(RAIntegrationEvent.Failed(achievementData.icon))
                }

                return@launch
            }

            raSessionJob = launch {
                // Wait until the emulator has actually started
                ensureEmulatorIsRunning().firstOrNull()

                    when (networkMode) {
                        RetroAchievementsNetworkMode.ONLINE_LIVE -> {
                            val startResult = retroAchievementsRepository.startSession(rom.retroAchievementsHash)
                            if (startResult.isFailure) {
                            _raIntegrationEvent.tryEmit(RAIntegrationEvent.Failed(achievementData.icon))
                            return@launch
                        }

                            emulatorManager.setupRetroAchievements(achievementData)
                            emitRetroAchievementsModeToast(
                                status = if (launchDecision.sessionMode == RetroAchievementsSessionMode.HARDCORE) {
                                    ToastEvent.RetroAchievementsModeStatus.HARDCORE
                                } else {
                                    ToastEvent.RetroAchievementsModeStatus.SOFTCORE
                                }
                            )
                            emitRetroAchievementsLoadedPopup(achievementData)

                            while (isActive) {
                                // TODO: Should we pause the session if the app goes to background? If so, how?
                                delay(2.minutes)
                            val richPresenceDescription = MelonEmulator.getRichPresenceStatus()
                            retroAchievementsRepository.sendSessionHeartbeat(rom.retroAchievementsHash, richPresenceDescription)
                        }
                    }
                    RetroAchievementsNetworkMode.OFFLINE_ACCUMULATING -> {
                        val context = offlineContext ?: return@launch
                        currentRetroAchievementsGameId = context.cache.gameId

                        val startedAtEpochMs = System.currentTimeMillis()
                        val sessionId = UUID.randomUUID().toString()
                        val unlockMode = if (launchDecision.sessionMode == RetroAchievementsSessionMode.HARDCORE) {
                            OfflineUnlockMode.HARDCORE
                        } else {
                            OfflineUnlockMode.SOFTCORE
                        }
                        val offlineType = launchDecision.initialOfflineType ?: OfflineUnlockType.OFFLINE_FROM_START

                        offlineRetroAchievementsSession = OfflineRetroAchievementsSession(
                            userId = context.userId,
                            contentId = context.contentId,
                            gameId = context.cache.gameId,
                            unlockMode = unlockMode,
                            offlineType = offlineType,
                            sessionId = sessionId,
                            startedAtEpochMs = startedAtEpochMs,
                            nextOrderIndex = 0L,
                        )

                        withContext(Dispatchers.IO) {
                            offlineLedgerRepository.appendSessionStart(
                                userId = context.userId,
                                contentId = context.contentId,
                                gameId = context.cache.gameId,
                                sessionId = sessionId,
                                startedAtEpochMs = startedAtEpochMs,
                                isHardcore = unlockMode == OfflineUnlockMode.HARDCORE,
                                unlockMode = unlockMode,
                                offlineType = offlineType,
                            )
                        }

                        if (unlockMode == OfflineUnlockMode.HARDCORE) {
                            hardcoreOfflineLossTracker.markPendingUnlocks(
                                userId = context.userId,
                                contentId = context.contentId,
                                gameTitle = rom.name,
                            )
                        }

                        emulatorManager.setupRetroAchievements(achievementData)
                        emitRetroAchievementsModeToast(
                            status = ToastEvent.RetroAchievementsModeStatus.SOFTCORE_OFFLINE,
                            offlineNoInternetAtStart = launchDecision.offlineDueToNoInternetAtStart,
                        )
                        emitRetroAchievementsLoadedPopup(achievementData)
                    }
                }
            }
        }
    }

    private fun emitRetroAchievementsModeToast(
        status: ToastEvent.RetroAchievementsModeStatus,
        offlineNoInternetAtStart: Boolean = false,
    ) {
        _toastEvent.tryEmit(
            ToastEvent.RetroAchievementsMode(
                status = status,
                offlineNoInternetAtStart = offlineNoInternetAtStart,
            )
        )
    }

    private fun emitRetroAchievementsLoadedPopup(achievementData: GameAchievementData) {
        if (achievementData.hasAchievements) {
            _raIntegrationEvent.tryEmit(
                RAIntegrationEvent.Loaded(
                    icon = achievementData.icon,
                    unlockedAchievements = achievementData.unlockedAchievementCount,
                    totalAchievements = achievementData.totalAchievementCount,
                )
            )
        } else {
            _raIntegrationEvent.tryEmit(RAIntegrationEvent.LoadedNoAchievements(achievementData.icon))
        }
    }

    private data class OfflineRetroAchievementsContext(
        val userId: String,
        val contentId: String,
        val cache: OfflinePrefetchCacheFile,
        val achievementData: GameAchievementData,
        val missingCache: Boolean,
    )

    private suspend fun buildOfflineRetroAchievementsContext(rom: Rom): OfflineRetroAchievementsContext? {
        val userAuth = retroAchievementsRepository.getUserAuthentication() ?: return null
        val userId = userAuth.username
        val contentId = rom.retroAchievementsHash

        val cache = try {
            withContext(Dispatchers.IO) {
                offlinePrefetchCacheRepository.readValid(userId, contentId)
            }
        } catch (_: Exception) {
            null
        }

        val gameSummary = retroAchievementsRepository.getGameSummary(rom.retroAchievementsHash)

        if (cache == null) {
            return OfflineRetroAchievementsContext(
                userId = userId,
                contentId = contentId,
                cache = OfflinePrefetchCacheFile(),
                achievementData = GameAchievementData.withDisabledRetroAchievementsIntegration(
                    status = GameAchievementData.IntegrationStatus.DISABLED_LOAD_ERROR,
                    icon = gameSummary?.icon,
                ),
                missingCache = true,
            )
        }

        val isHardcoreModeEnabled = emulatorSession.isRetroAchievementsHardcoreModeEnabled
        val unlockedIds = try {
            withContext(Dispatchers.IO) {
                retroAchievementsDao.getGameUserUnlockedAchievements(cache.gameId, isHardcoreModeEnabled).map { it.achievementId }.toSet()
            }
        } catch (_: Exception) {
            emptySet()
        }

        val lockedAchievements = cache.achievements
            .asSequence()
            .filterNot { unlockedIds.contains(it.id) }
            .map { RASimpleAchievement(it.id, it.memoryAddress) }
            .toList()

        val achievementData = if (cache.achievements.isEmpty()) {
            GameAchievementData.withLimitedRetroAchievementsIntegration(
                richPresencePatch = cache.richPresencePatch,
                icon = gameSummary?.icon,
            )
        } else {
            GameAchievementData.withFullRetroAchievementsIntegration(
                lockedAchievements = lockedAchievements,
                leaderboards = emptyList(), // Leaderboards are disabled in offline mode (POC).
                totalAchievementCount = cache.achievements.size,
                richPresencePatch = cache.richPresencePatch,
                icon = gameSummary?.icon,
            )
        }

        return OfflineRetroAchievementsContext(
            userId = userId,
            contentId = contentId,
            cache = cache,
            achievementData = achievementData,
            missingCache = false,
        )
    }

    private fun startTrackingFps() {
        sessionCoroutineScope.launch {
            while (isActive) {
                delay(1.seconds)
                _currentFps.value = emulatorManager.getFps()
            }
        }
    }

    private fun filterRomPauseMenuOption(option: RomPauseMenuOption): Boolean {
        return when (option) {
            RomPauseMenuOption.REWIND -> settingsRepository.isRewindEnabled() && emulatorSession.areSaveStateLoadsAllowed()
            RomPauseMenuOption.LOAD_STATE -> emulatorSession.areSaveStateLoadsAllowed()
            RomPauseMenuOption.CHEATS -> emulatorSession.areCheatsEnabled()
            RomPauseMenuOption.VIEW_ACHIEVEMENTS -> emulatorSession.isRetroAchievementsEnabledForSession()
            else -> true
        }
    }

    private fun ensureEmulatorIsRunning(): Flow<Unit> {
        return _emulatorState.filter { it.isRunning() }.take(1).map { }
    }

    private suspend fun startEmulatorSession(
        sessionType: EmulatorSession.SessionType,
        isRetroAchievementsHardcoreModeEnabled: Boolean = settingsRepository.isRetroAchievementsHardcoreEnabled(),
    ) {
        val isUserAuthenticatedInRetroAchievements = retroAchievementsRepository.isUserAuthenticated()
        emulatorSession.startSession(
            areRetroAchievementsEnabled = isUserAuthenticatedInRetroAchievements,
            isRetroAchievementsHardcoreModeEnabled = isRetroAchievementsHardcoreModeEnabled,
            sessionType = sessionType,
        )
    }

    private fun dispatchSessionUpdateActions(actions: List<EmulatorSessionUpdateAction>) {
        actions.forEach {
            when (it) {
                EmulatorSessionUpdateAction.DisableRetroAchievements -> {
                    _achievementsEvent.tryEmit(RAEventUi.Reset)
                    emulatorManager.unloadRetroAchievementsData()
                    raSessionJob?.cancel()
                    raSessionJob = null
                }
                EmulatorSessionUpdateAction.EnableRetroAchievements -> {
                    (emulatorSession.currentSessionType() as? EmulatorSession.SessionType.RomSession)?.rom?.let { currentRom ->
                        startRetroAchievementsSession(
                            rom = currentRom,
                            launchDecision = RetroAchievementsLaunchDecision(
                                networkMode = retroAchievementsNetworkMode,
                                sessionMode = retroAchievementsSessionMode,
                                initialOfflineType = if (retroAchievementsNetworkMode == RetroAchievementsNetworkMode.OFFLINE_ACCUMULATING) {
                                    if (startedSessionOnlineLive) {
                                        OfflineUnlockType.OFFLINE_AFTER_START
                                    } else {
                                        OfflineUnlockType.OFFLINE_FROM_START
                                    }
                                } else {
                                    null
                                },
                                isHardcoreEligibleAfterOnlineStart = isHardcoreEligibleAfterOnlineStart,
                                offlineDueToNoInternetAtStart = !startedSessionOnlineLive && retroAchievementsNetworkMode == RetroAchievementsNetworkMode.OFFLINE_ACCUMULATING,
                            ),
                        )
                    }
                }
                EmulatorSessionUpdateAction.NotifyRetroAchievementsModeSwitch -> {
                    _toastEvent.tryEmit(ToastEvent.CannotSwitchRetroAchievementsMode)
                }
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        sessionCoroutineScope.cancel()
        emulatorManager.cleanEmulator()
    }

    private class EmulatorSessionCoroutineScope : CoroutineScope {
        private var currentCoroutineContext: CoroutineContext = EmptyCoroutineContext

        override val coroutineContext: CoroutineContext get() = currentCoroutineContext

        fun notifyNewSessionStarted() {
            cancel()
            currentCoroutineContext = SupervisorJob() + Dispatchers.Main.immediate
        }

        fun cancel() {
            currentCoroutineContext.cancel()
        }
    }
}
