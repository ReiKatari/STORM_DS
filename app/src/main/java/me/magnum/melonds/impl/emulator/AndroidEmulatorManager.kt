package me.magnum.melonds.impl.emulator

import android.content.Context
import android.os.ParcelFileDescriptor
import android.os.SystemClock
import android.net.Uri
import android.util.Log
import androidx.documentfile.provider.DocumentFile
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import me.magnum.melonds.MelonDSAndroidInterface
import me.magnum.melonds.MelonEmulator
import me.magnum.melonds.MelonRomDecryptor
import me.magnum.melonds.impl.StormDeviceSystemInfoReporter
import me.magnum.melonds.common.PermissionHandler
import me.magnum.melonds.common.romprocessors.RomFileProcessorFactory
import me.magnum.melonds.common.runtime.ScreenshotFrameBufferProvider
import me.magnum.melonds.domain.model.Cheat
import me.magnum.melonds.domain.model.ConsoleType
import me.magnum.melonds.domain.model.EmulatorConfiguration
import me.magnum.melonds.domain.model.MicSource
import me.magnum.melonds.domain.model.VideoRenderer
import me.magnum.melonds.domain.model.ConfigurationDirResult
import me.magnum.melonds.domain.model.dsinand.DSiWareTitleFileType
import me.magnum.melonds.domain.model.dsinand.ImportDSiWareTitleResult
import me.magnum.melonds.domain.model.dsinand.OpenDSiNandResult
import me.magnum.melonds.domain.model.emulator.EmulatorEvent
import me.magnum.melonds.domain.model.emulator.FirmwareLaunchResult
import me.magnum.melonds.domain.model.emulator.RomLaunchResult
import me.magnum.melonds.domain.model.retroachievements.GameAchievementData
import me.magnum.melonds.domain.model.retroachievements.RAEvent
import me.magnum.melonds.domain.model.retroachievements.RaNativePendingRetryResult
import me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.domain.model.rom.config.RomGbaSlotConfig
import me.magnum.melonds.domain.model.rom.config.RuntimeConsoleType
import me.magnum.melonds.domain.model.rom.config.RuntimeEnum
import me.magnum.melonds.domain.services.DSiNandManager
import me.magnum.melonds.domain.repositories.SettingsRepository
import me.magnum.melonds.domain.services.EmulatorManager
import me.magnum.melonds.impl.ShaderCompileTimeStore
import me.magnum.melonds.impl.camera.DSiCameraSourceMultiplexer
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState
import me.magnum.melonds.ui.emulator.rewind.model.RewindWindow
import java.io.File
import java.nio.ByteBuffer

class AndroidEmulatorManager(
    private val context: Context,
    private val settingsRepository: SettingsRepository,
    private val sramProvider: SramProvider,
    private val screenshotFrameBufferProvider: ScreenshotFrameBufferProvider,
    private val romFileProcessorFactory: RomFileProcessorFactory,
    private val permissionHandler: PermissionHandler,
    private val cameraManager: DSiCameraSourceMultiplexer,
    private val emulatorSession: EmulatorSession,
    private val dsiNandManager: DSiNandManager,
    private val shaderCompileTimeStore: ShaderCompileTimeStore,
    private val configurationDirectoryVerifier: me.magnum.melonds.domain.services.ConfigurationDirectoryVerifier,
) : EmulatorManager {
    private companion object {
        private const val TAG = "AndroidEmulatorManager"
        private const val RA_SUBMISSION_TAG = "RASubmission"
        private const val GBAModeNotSupported = 2
        private const val BadExceptionRegion = 3
        private const val PowerOff = 4
    }

    private class RetroAchievementsSetupException : RuntimeException("RetroAchievements runtime setup failed")
    private data class ActiveDsiWareSession(
        val rom: Rom,
        val titleId: Long,
        val titleIdHex: String,
        val sramUri: Uri,
        val cachePublicSaveFile: File?,
        val isTemporaryInjected: Boolean,
        val fileType: DSiWareTitleFileType = DSiWareTitleFileType.PUBLIC_SAV,
    )

    private val coroutineScope = CoroutineScope(Dispatchers.IO + SupervisorJob())
    private val _emulatorEvents = MutableSharedFlow<EmulatorEvent>(extraBufferCapacity = Int.MAX_VALUE)
    override val emulatorEvents: Flow<EmulatorEvent> = _emulatorEvents.asSharedFlow()

    private val achievementsSharedFlow = MutableSharedFlow<RAEvent>(replay = 0, extraBufferCapacity = Int.MAX_VALUE)
    private val dldiFolderSyncManager = DldiFolderSyncManager(context, settingsRepository)
    private var activeDsiWareSession: ActiveDsiWareSession? = null
    @Volatile private var leaderboardDiagnosticsEnabled = false
    private val leaderboardTrackerUpdateLogLimiter = LeaderboardTrackerUpdateLogLimiter()

    private val messageQueue = EmulatorMessageQueue { type, data ->
        when (type) {
            EmulatorEventType.EventRumbleStart -> _emulatorEvents.tryEmit(EmulatorEvent.RumbleStart(data.getInt()))
            EmulatorEventType.EventRumbleStop -> _emulatorEvents.tryEmit(EmulatorEvent.RumbleStop)
            EmulatorEventType.EventEmulatorStop -> getStopReason(data.getInt())?.let { _emulatorEvents.tryEmit(EmulatorEvent.Stop(it)) }
            EmulatorEventType.EventRendererInitFailed -> getRenderer(data.getInt())?.let { _emulatorEvents.tryEmit(EmulatorEvent.RendererInitFailed(it)) }
            EmulatorEventType.EventVulkanCompileProgress -> _emulatorEvents.tryEmit(
                EmulatorEvent.VulkanCompileProgress(
                    stageId = data.getInt(),
                    current = data.getInt(),
                    total = data.getInt(),
                )
            )
            EmulatorEventType.EventRAAchievementPrimed -> achievementsSharedFlow.tryEmit(RAEvent.OnAchievementPrimed(data.getLong()))
            EmulatorEventType.EventRAAchievementTriggered -> achievementsSharedFlow.tryEmit(RAEvent.OnAchievementTriggered(data.getLong()))
            EmulatorEventType.EventRAAchievementUnprimed -> achievementsSharedFlow.tryEmit(RAEvent.OnAchievementUnPrimed(data.getLong()))
            EmulatorEventType.EventRAAchievementProgressUpdated -> {
                val event = RAEvent.OnAchievementProgressUpdated(
                    achievementId = data.getLong(),
                    current = data.getInt(),
                    target = data.getInt(),
                    progress = RetroAchievementsEventDecoder.readFixedSlotString(
                        data,
                        RetroAchievementsEventDecoder.DISPLAY_SLOT_BYTES,
                    ),
                )
                achievementsSharedFlow.tryEmit(event)
            }
            EmulatorEventType.EventRAGameCompleted -> achievementsSharedFlow.tryEmit(RAEvent.OnGameCompleted(data.getLong()))
            EmulatorEventType.EventRASubsetCompleted -> achievementsSharedFlow.tryEmit(RAEvent.OnSubsetCompleted(data.getLong()))
            EmulatorEventType.EventRAServerError -> {
                val event = RAEvent.OnServerError(
                    relatedId = data.getLong(),
                    resultCode = data.getInt(),
                    api = RetroAchievementsEventDecoder.readFixedSlotString(
                        data,
                        RetroAchievementsEventDecoder.DISPLAY_SLOT_BYTES,
                    ),
                    message = RetroAchievementsEventDecoder.readFixedSlotString(
                        data,
                        RetroAchievementsEventDecoder.SERVER_MESSAGE_SLOT_BYTES,
                    ),
                )
                achievementsSharedFlow.tryEmit(event)
            }
            EmulatorEventType.EventRADisconnected -> achievementsSharedFlow.tryEmit(RAEvent.OnDisconnected)
            EmulatorEventType.EventRAReconnected -> achievementsSharedFlow.tryEmit(RAEvent.OnReconnected)
            EmulatorEventType.EventRALeaderboardAttemptStarted -> {
                val event = RAEvent.OnLeaderboardAttemptStarted(
                    leaderboardId = data.long,
                    attemptId = data.long,
                    eventSequence = data.long,
                )
                leaderboardTrackerUpdateLogLimiter.reset(event.leaderboardId, event.attemptId)
                logLeaderboardJni("STARTED", event.leaderboardId, event.attemptId, event.eventSequence)
                achievementsSharedFlow.tryEmit(event)
            }
            EmulatorEventType.EventRALeaderboardAttemptUpdated -> {
                val leaderboardId = data.long
                val attemptId = data.long
                val eventSequence = data.long
                val trackerShown = data.int != 0
                val event = RAEvent.OnLeaderboardAttemptUpdated(
                    leaderboardId = leaderboardId,
                    attemptId = attemptId,
                    eventSequence = eventSequence,
                    formattedValue = RetroAchievementsEventDecoder.readFixedSlotString(
                        data,
                        RetroAchievementsEventDecoder.DISPLAY_SLOT_BYTES,
                    ),
                    trackerShown = trackerShown,
                )
                if (event.trackerShown) {
                    leaderboardTrackerUpdateLogLimiter.reset(event.leaderboardId, event.attemptId)
                    logLeaderboardJni(
                        "TRACKER_SHOW",
                        event.leaderboardId,
                        event.attemptId,
                        event.eventSequence,
                        "tracker_display=${event.formattedValue}",
                    )
                } else {
                    val logDecision = leaderboardTrackerUpdateLogLimiter.observe(event.leaderboardId, event.attemptId)
                    if (logDecision.shouldLog) {
                        logLeaderboardJni(
                            "TRACKER_UPDATE",
                            event.leaderboardId,
                            event.attemptId,
                            event.eventSequence,
                            "tracker_display=${event.formattedValue} " +
                                "tracker_update_index=${logDecision.updateIndex} " +
                                "suppressed_updates=${logDecision.suppressedUpdates}",
                        )
                    }
                }
                achievementsSharedFlow.tryEmit(event)
            }
            EmulatorEventType.EventRALeaderboardAttemptCanceled -> {
                val event = RAEvent.OnLeaderboardAttemptCancelled(data.long, data.long, data.long)
                leaderboardTrackerUpdateLogLimiter.reset(event.leaderboardId, event.attemptId)
                logLeaderboardJni("CANCELED", event.leaderboardId, event.attemptId, event.eventSequence)
                achievementsSharedFlow.tryEmit(event)
            }
            EmulatorEventType.EventRALeaderboardAttemptCompleted -> {
                val event = RAEvent.OnLeaderboardAttemptCompleted(
                    leaderboardId = data.getLong(),
                    value = data.getInt(),
                    formattedValue = RetroAchievementsEventDecoder.readFixedSlotString(
                        data,
                        RetroAchievementsEventDecoder.DISPLAY_SLOT_BYTES,
                    ),
                )
                achievementsSharedFlow.tryEmit(event)
            }
            EmulatorEventType.EventRAAchievementProgressIndicatorHidden -> achievementsSharedFlow.tryEmit(RAEvent.OnAchievementProgressHidden(data.getLong()))
            EmulatorEventType.EventRALeaderboardTrackerHidden -> {
                val event = RAEvent.OnLeaderboardTrackerHidden(data.long, data.long, data.long)
                leaderboardTrackerUpdateLogLimiter.reset(event.leaderboardId, event.attemptId)
                logLeaderboardJni("TRACKER_HIDE", event.leaderboardId, event.attemptId, event.eventSequence)
                achievementsSharedFlow.tryEmit(event)
            }
            EmulatorEventType.EventRALeaderboardAttemptSubmitted -> {
                val event = RAEvent.OnLeaderboardAttemptSubmitted(
                    leaderboardId = data.long,
                    attemptId = data.long,
                    eventSequence = data.long,
                    trackerDisplay = RetroAchievementsEventDecoder.readFixedSlotString(
                        data,
                        RetroAchievementsEventDecoder.DISPLAY_SLOT_BYTES,
                    ),
                )
                logLeaderboardJni("SUBMITTED", event.leaderboardId, event.attemptId, event.eventSequence, "tracker_display=${event.trackerDisplay}")
                achievementsSharedFlow.tryEmit(event)
            }
            EmulatorEventType.EventRALeaderboardScoreboard -> {
                val event = RAEvent.OnLeaderboardScoreboard(
                    leaderboardId = data.long,
                    attemptId = data.long,
                    eventSequence = data.long,
                    newRank = Integer.toUnsignedLong(data.int),
                    numEntries = Integer.toUnsignedLong(data.int),
                    submittedScore = RetroAchievementsEventDecoder.readFixedSlotString(
                        data,
                        RetroAchievementsEventDecoder.DISPLAY_SLOT_BYTES,
                    ),
                    bestScore = RetroAchievementsEventDecoder.readFixedSlotString(
                        data,
                        RetroAchievementsEventDecoder.DISPLAY_SLOT_BYTES,
                    ),
                )
                leaderboardTrackerUpdateLogLimiter.reset(event.leaderboardId, event.attemptId)
                logLeaderboardJni(
                    "SCOREBOARD",
                    event.leaderboardId,
                    event.attemptId,
                    event.eventSequence,
                    "submitted_score=${event.submittedScore} best_score=${event.bestScore} rank=${event.newRank} num_entries=${event.numEntries}",
                )
                achievementsSharedFlow.tryEmit(event)
            }
            EmulatorEventType.EventRALeaderboardSubmissionFailed -> {
                val event = RAEvent.OnLeaderboardSubmissionFailed(
                    leaderboardId = data.long,
                    attemptId = data.long,
                    eventSequence = data.long,
                    resultCode = data.int,
                    message = RetroAchievementsEventDecoder.readFixedSlotString(
                        data,
                        RetroAchievementsEventDecoder.LEADERBOARD_ERROR_MESSAGE_SLOT_BYTES,
                    ),
                )
                leaderboardTrackerUpdateLogLimiter.reset(event.leaderboardId, event.attemptId)
                logLeaderboardJni("SERVER_ERROR", event.leaderboardId, event.attemptId, event.eventSequence, "result=${event.resultCode}")
                achievementsSharedFlow.tryEmit(event)
            }
            EmulatorEventType.EventRALeaderboardRuntimeReset -> {
                val event = RAEvent.OnLeaderboardRuntimeReset(attemptFloor = data.long)
                leaderboardTrackerUpdateLogLimiter.resetAll()
                if (leaderboardDiagnosticsEnabled) {
                    Log.i(
                        RA_SUBMISSION_TAG,
                        "event_type=jni_event_received jni_event=RUNTIME_RESET attempt_floor=${event.attemptFloor}",
                    )
                }
                achievementsSharedFlow.tryEmit(event)
            }
            EmulatorEventType.EventRAPendingSubmissionAdded -> {
                RetroAchievementsEventDecoder.readPendingSubmissionAdded(data)?.let {
                    achievementsSharedFlow.tryEmit(it)
                }
            }
            EmulatorEventType.EventRAPendingSubmissionResolved -> {
                RetroAchievementsEventDecoder.readPendingSubmissionResolved(data)?.let {
                    achievementsSharedFlow.tryEmit(it)
                }
            }
            EmulatorEventType.EventRAPendingSubmissionBarrier -> {
                RetroAchievementsEventDecoder.readPendingSubmissionBarrier(data)?.let {
                    achievementsSharedFlow.tryEmit(it)
                }
            }
        }
    }

    private fun isRealDsiWareTitle(rom: Rom): Boolean {
        if (rom.isInstalledDsiWareShortcut || rom.installedDsiWareTitleId != null || rom.uri.scheme == Rom.INSTALLED_DSIWARE_URI_SCHEME || rom.fileName.endsWith(".dsi", ignoreCase = true) || rom.uri.path?.endsWith(".dsi", ignoreCase = true) == true) {
            return true
        }
        if (rom.isDsiEnhanced) {
            return false
        }
        return runCatching {
            context.contentResolver.openInputStream(rom.uri)?.use { stream ->
                val header = ByteArray(0x240)
                var read = 0
                while (read < 0x240) {
                    val count = stream.read(header, read, 0x240 - read)
                    if (count <= 0) break
                    read += count
                }
                if (read >= 0x160) {
                    val gameCode = String(header, 0x0C, 4, java.nio.charset.StandardCharsets.US_ASCII)
                    val gc0 = gameCode.getOrNull(0)
                    val unitCode = header[0x012].toInt() and 0xFF
                    (unitCode == 0x03) || (gc0 != null && (gc0 == 'K' || gc0 == 'H' || gc0 == '4' || gc0 == 'D' || gc0 == 'V' || gc0 == 'T' || gc0 == 'Z'))
                } else false
            }
        }.getOrNull() ?: false
    }

    override suspend fun loadRom(rom: Rom, cheats: List<Cheat>): RomLaunchResult {
        return withContext(Dispatchers.IO) {
            try {
                if (rom.isInstalledDsiWareShortcut || rom.uri.scheme == Rom.INSTALLED_DSIWARE_URI_SCHEME) {
                    val dsiBiosResult = configurationDirectoryVerifier.checkConsoleConfigurationDirectory(ConsoleType.DSi)
                    if (dsiBiosResult.status == ConfigurationDirResult.Status.VALID) {
                        Log.i(TAG, "loadRom: Routing installed DSiWare shortcut '${rom.name}' to DSi NAND launch environment")
                        return@withContext loadDsiWare(rom, cheats)
                    }
                }

                // Fast-path: If the ROM is a standard NDS/DSi file (not an archive), bypass slow DocumentFile SAF queries
                val isArchive = rom.fileName.endsWith(".zip", ignoreCase = true) || rom.fileName.endsWith(".7z", ignoreCase = true)
                val romUri = if (isArchive) {
                    val fileRomDocument = DocumentFile.fromSingleUri(context, rom.uri) ?: return@withContext RomLaunchResult.LaunchFailedRomNotFound
                    val fileRomProcessor = romFileProcessorFactory.getFileRomProcessorForDocument(fileRomDocument)
                    fileRomProcessor?.getRealRomUri(rom) ?: return@withContext RomLaunchResult.LaunchFailedRomNotSupported
                } else {
                    rom.uri
                }
                val sram = try {
                    sramProvider.getSramForRom(rom)
                } catch (exception: SramLoadException) {
                    return@withContext RomLaunchResult.LaunchFailedSramProblem(exception)
                }

                val emulatorConfiguration = getRomEmulatorConfiguration(rom)
                    .withPreparedDldiConfiguration()
                setupEmulator(emulatorConfiguration)

                val gbaSlotRomConfig = rom.config.gbaSlotConfig
                val gbaSlotType = when (gbaSlotRomConfig) {
                    RomGbaSlotConfig.None -> MelonEmulator.GbaSlotType.NONE
                    is RomGbaSlotConfig.GbaRom -> MelonEmulator.GbaSlotType.GBA_ROM
                    RomGbaSlotConfig.MemoryExpansion -> MelonEmulator.GbaSlotType.MEMORY_EXPANSION
                    RomGbaSlotConfig.RumblePak -> MelonEmulator.GbaSlotType.RUMBLE_PAK
                    RomGbaSlotConfig.AnalogInput -> MelonEmulator.GbaSlotType.ANALOG_INPUT
                }
                Log.w(TAG, "loadRom: rom='${rom.name}' gbaSlotType=${gbaSlotType.name}")

                MelonEmulator.startBootDiagnosticCapture()
                var loadResult = MelonEmulator.loadRom(
                    romUri = romUri,
                    sramUri = sram,
                    gbaSlotType = gbaSlotType,
                    gbaRomUri = (gbaSlotRomConfig as? RomGbaSlotConfig.GbaRom)?.romPath,
                    gbaSramUri = (gbaSlotRomConfig as? RomGbaSlotConfig.GbaRom)?.savePath
                )

                // Fallback: If loading failed in DSi mode, retry immediately in standard DS mode
                if ((loadResult.isTerminal || !isActive) && emulatorConfiguration.consoleType == ConsoleType.DSi) {
                    Log.w(TAG, "Loading ROM '${rom.name}' in DSi mode failed ($loadResult), attempting fallback in DS mode")
                    val fallbackConfig = emulatorConfiguration.copy(
                        consoleType = ConsoleType.DS,
                        useCustomBios = false,
                        showBootScreen = false
                    )
                    setupEmulator(fallbackConfig)
                    val retryResult = MelonEmulator.loadRom(
                        romUri = romUri,
                        sramUri = sram,
                        gbaSlotType = gbaSlotType,
                        gbaRomUri = (gbaSlotRomConfig as? RomGbaSlotConfig.GbaRom)?.romPath,
                        gbaSramUri = (gbaSlotRomConfig as? RomGbaSlotConfig.GbaRom)?.savePath
                    )
                    if (!retryResult.isTerminal && isActive) {
                        messageQueue.start()
                        if (!precompileVulkanPipelines(fallbackConfig)) {
                            cameraManager.stopCurrentCameraSource()
                            MelonEmulator.stopEmulation()
                            messageQueue.stop()
                            dldiFolderSyncManager.syncBackIfNeeded()
                            return@withContext RomLaunchResult.LaunchFailed(MelonEmulator.LoadResult.NDS_FAILED)
                        }
                        MelonEmulator.setupCheats(cheats.toTypedArray())
                        MelonEmulator.startEmulation(startPaused = true)
                        delay(10)
                        val nativeDiag = MelonEmulator.stopAndGetBootDiagnostic()
                        val cpuDiag = MelonEmulator.getDetailedEmulationDiagnostic()
                        val fullDiag = "--- Native Boot Diagnostic ---\n$nativeDiag\n--- Emulation CPU & Hardware Diagnostic ---\n$cpuDiag"
                        writeGameExecutionLog(rom, rom.fileName, true, "Fallback boot successful in standard DS FreeBIOS mode\n$fullDiag", "loadRom (DS Fallback)")
                        return@withContext RomLaunchResult.LaunchSuccessful(retryResult != MelonEmulator.LoadResult.SUCCESS_GBA_FAILED)
                    }
                }

                if (loadResult.isTerminal || !isActive) {
                    val nativeDiag = MelonEmulator.stopAndGetBootDiagnostic()
                    val cpuDiag = MelonEmulator.getDetailedEmulationDiagnostic()
                    val fullDiag = "--- Native Boot Diagnostic ---\n$nativeDiag\n--- Emulation CPU & Hardware Diagnostic ---\n$cpuDiag"
                    cameraManager.stopCurrentCameraSource()
                    MelonEmulator.stopEmulation()
                    dldiFolderSyncManager.syncBackIfNeeded()
                    writeGameExecutionLog(rom, rom.fileName, false, "loadRom returned terminal error: $loadResult\n$fullDiag", "loadRom")
                    RomLaunchResult.LaunchFailed(loadResult)
                } else {
                    messageQueue.start()
                    if (!precompileVulkanPipelines(emulatorConfiguration)) {
                        val nativeDiag = MelonEmulator.stopAndGetBootDiagnostic()
                        val cpuDiag = MelonEmulator.getDetailedEmulationDiagnostic()
                        val fullDiag = "--- Native Boot Diagnostic ---\n$nativeDiag\n--- Emulation CPU & Hardware Diagnostic ---\n$cpuDiag"
                        cameraManager.stopCurrentCameraSource()
                        MelonEmulator.stopEmulation()
                        messageQueue.stop()
                        dldiFolderSyncManager.syncBackIfNeeded()
                        writeGameExecutionLog(rom, rom.fileName, false, "Vulkan pipeline precompilation failed\n$fullDiag", "loadRom")
                        return@withContext RomLaunchResult.LaunchFailed(MelonEmulator.LoadResult.NDS_FAILED)
                    }
                    MelonEmulator.setupCheats(cheats.toTypedArray())
                    MelonEmulator.startEmulation(startPaused = true)
                    delay(10)
                    val nativeDiag = MelonEmulator.stopAndGetBootDiagnostic()
                    val initialCpuDiag = MelonEmulator.getDetailedEmulationDiagnostic()

                    // Single log write: capture initial + live diagnostic after 2s
                    coroutineScope.launch {
                        delay(2000)
                        val liveCpuDiag = MelonEmulator.getDetailedEmulationDiagnostic()
                        val fullDiag = "--- Native Boot Diagnostic ---\n$nativeDiag\n--- Emulation CPU & Hardware Diagnostic (Live After 2s) ---\n$liveCpuDiag"
                        writeGameExecutionLog(rom, rom.fileName, true, "ROM launch successful in ${emulatorConfiguration.consoleType} mode\n$fullDiag", "loadRom (Live)")
                    }

                    RomLaunchResult.LaunchSuccessful(loadResult != MelonEmulator.LoadResult.SUCCESS_GBA_FAILED)
                }
            } catch (exception: Throwable) {
                if (exception is CancellationException) {
                    throw exception
                }
                Log.e(TAG, "Failed to load ROM '${rom.name}'", exception)
                cameraManager.stopCurrentCameraSource()
                MelonEmulator.stopEmulation()
                messageQueue.stop()
                dldiFolderSyncManager.syncBackIfNeeded()
                writeGameExecutionLog(rom, rom.fileName, false, "Exception during launch: ${exception.message}", "loadRom Exception")
                RomLaunchResult.LaunchFailed(MelonEmulator.LoadResult.NDS_FAILED)
            }
        }
    }

    private fun extractDsiWareTitleId(rom: Rom): Long? {
        if (rom.installedDsiWareTitleId != null && rom.installedDsiWareTitleId > 0L) {
            return rom.installedDsiWareTitleId
        }
        return runCatching {
            context.contentResolver.openInputStream(rom.uri)?.use { stream ->
                val header = ByteArray(0x240)
                var read = 0
                while (read < 0x240) {
                    val count = stream.read(header, read, 0x240 - read)
                    if (count <= 0) break
                    read += count
                }
                if (read >= 0x10) {
                    // Read GameCode from offset 0x0C (4 bytes) — same as JNI importTitle
                    // JNI builds titleId as: (GameCode[0]<<24 | GameCode[1]<<16 | GameCode[2]<<8 | GameCode[3])
                    val gc0 = (header[0x0C].toInt() and 0xFF).toLong()
                    val gc1 = (header[0x0D].toInt() and 0xFF).toLong()
                    val gc2 = (header[0x0E].toInt() and 0xFF).toLong()
                    val gc3 = (header[0x0F].toInt() and 0xFF).toLong()
                    val titleId = ((gc0 shl 24) or (gc1 shl 16) or (gc2 shl 8) or gc3) and 0xFFFFFFFFL
                    if (titleId != 0L) titleId else null
                } else null
            }
        }.getOrNull()
    }

    private suspend fun loadDsiWare(rom: Rom, cheats: List<Cheat>): RomLaunchResult = withContext(Dispatchers.IO) {
        val dsiStatus = configurationDirectoryVerifier.checkConsoleConfigurationDirectory(ConsoleType.DSi)
        if (dsiStatus.status != ConfigurationDirResult.Status.VALID) {
            writeGameExecutionLog(rom, rom.fileName, false, "DSi custom BIOS/Firmware/NAND configuration is invalid: ${dsiStatus.status}", "loadDsiWare")
            return@withContext RomLaunchResult.LaunchFailed(MelonEmulator.LoadResult.BIOS_FAILED)
        }

        val titleId = extractDsiWareTitleId(rom) ?: return@withContext RomLaunchResult.LaunchFailedRomNotFound
        val titleIdHex = titleId.toDsiWareTitleIdHex()

        val sram = try {
            sramProvider.getSramForRom(rom)
        } catch (exception: SramLoadException) {
            writeGameExecutionLog(rom, titleIdHex, false, "SRAM Load Exception: ${exception.message}", "loadDsiWare")
            return@withContext RomLaunchResult.LaunchFailedSramProblem(exception)
        }

        val shortcutCacheDir = File(context.cacheDir, "installed_dsiware").apply { mkdirs() }
        val executableFile = File(shortcutCacheDir, "$titleIdHex.app")
        val saveFile = File(shortcutCacheDir, "$titleIdHex.public.sav")

        val openNandResult = dsiNandManager.openNand()
        if (openNandResult.isFailure()) {
            Log.w(TAG, "loadDsiWare: failed to open NAND title=$titleIdHex result=$openNandResult")
            writeGameExecutionLog(rom, titleIdHex, false, "Failed to open NAND: $openNandResult", "loadDsiWare")
            return@withContext RomLaunchResult.LaunchFailed(MelonEmulator.LoadResult.BIOS_FAILED)
        }

        var isTemp = false
        var hasPublicSave = false
        var hasPrivateSave = false
        var primaryFileType: DSiWareTitleFileType? = null
        val dsiWareBootMode = settingsRepository.getDsiWareBootMode()
        val isDirectRomFile = !rom.isInstalledDsiWareShortcut && rom.uri.scheme != Rom.INSTALLED_DSIWARE_URI_SCHEME

        try {
            val installedTitles = dsiNandManager.listTitles()
            Log.i(TAG, "loadDsiWare: titleId=0x$titleIdHex, NAND has ${installedTitles.size} titles: [${installedTitles.joinToString { "0x${(it.titleId and 0xFFFFFFFFL).toString(16).padStart(8, '0')} (${it.name})" }}]")
            val alreadyInstalled = installedTitles.any { it.titleId == titleId }
            if (!alreadyInstalled) {
                Log.i(TAG, "loadDsiWare: title 0x$titleIdHex not in NAND, importing from ${rom.fileName}...")
                val importResult = dsiNandManager.importTitle(rom.uri)
                Log.i(TAG, "loadDsiWare: auto-import result: $importResult")
            } else {
                Log.i(TAG, "loadDsiWare: title 0x$titleIdHex already in NAND, skipping import")
            }

            val installedTitle = dsiNandManager.listTitles().firstOrNull { it.titleId == titleId }
            if (installedTitle != null) {
                dsiNandManager.repairTitleSaves(titleId)

                // If user has existing .sav in their save folder, sync it into NAND before launching
                try {
                    val sramDoc = DocumentFile.fromSingleUri(context, sram)
                    if (sramDoc != null && sramDoc.exists() && sramDoc.length() >= 512L) {
                        val sramBytes = context.contentResolver.openInputStream(sram)?.use { it.readBytes() }
                        if (sramBytes != null && sramBytes.size >= 512 &&
                            sramBytes[0x1FE] == 0x55.toByte() && sramBytes[0x1FF] == 0xAA.toByte() &&
                            (sramBytes[0] == 0xEB.toByte() || sramBytes[0] == 0xE9.toByte())) {
                            dsiNandManager.importTitleFile(titleId, DSiWareTitleFileType.PUBLIC_SAV, sram)
                        }
                    }
                } catch (e: Throwable) {
                    Log.w(TAG, "loadDsiWare: error importing user public save into NAND", e)
                }
            }

            // Export executable from NAND for direct boot or copy direct ROM
            executableFile.delete()
            dsiNandManager.exportTitleExecutable(titleId, executableFile.absolutePath)
            if (!executableFile.exists() || executableFile.length() == 0L) {
                Log.i(TAG, "loadDsiWare: copying direct ROM file as executable fallback for title=$titleIdHex")
                runCatching {
                    context.contentResolver.openInputStream(rom.uri)?.use { input ->
                        executableFile.outputStream().use { output ->
                            input.copyTo(output)
                        }
                    }
                }
            }

            if (!executableFile.exists() || executableFile.length() == 0L) {
                Log.w(TAG, "loadDsiWare: failed to prepare executable title=$titleIdHex")
                writeGameExecutionLog(rom, titleIdHex, false, "Failed to prepare executable for title", "loadDsiWare")
                return@withContext RomLaunchResult.LaunchFailed(MelonEmulator.LoadResult.NDS_FAILED)
            }

            val titleNow = dsiNandManager.listTitles().firstOrNull { it.titleId == titleId }
            hasPublicSave = titleNow?.hasPublicSavFile() ?: false
            hasPrivateSave = titleNow?.hasPrivateSavFile() ?: false
            primaryFileType = if (hasPublicSave) DSiWareTitleFileType.PUBLIC_SAV else if (hasPrivateSave) DSiWareTitleFileType.PRIVATE_SAV else null

            if (primaryFileType != null) {
                val exportedSave = dsiNandManager.exportTitleFileToPath(
                    titleId = titleId,
                    fileType = primaryFileType,
                    filePath = saveFile.absolutePath,
                )
                if (!exportedSave) {
                    saveFile.writeBytes(ByteArray(0))
                }
            } else {
                saveFile.writeBytes(ByteArray(0))
            }
        } finally {
            dsiNandManager.closeNand()
        }

        val (showBootScreen, autoloadTitleId) = when (dsiWareBootMode) {
            me.magnum.melonds.domain.model.dsinand.DSiWareBootMode.SYSTEM_MENU -> true to 0L
            me.magnum.melonds.domain.model.dsinand.DSiWareBootMode.AUTOLOAD,
            me.magnum.melonds.domain.model.dsinand.DSiWareBootMode.DIRECT -> false to titleId
        }

        val emulatorConfiguration = getRomEmulatorConfiguration(rom)
            .copy(
                consoleType = ConsoleType.DSi,
                useCustomBios = true,
                showBootScreen = showBootScreen,
                dsiWareAutoloadTitleId = autoloadTitleId,
            )
            .withPreparedDldiConfiguration()

        val targetRomUri = if (isDirectRomFile) {
            rom.uri
        } else if (executableFile.exists() && executableFile.length() > 0L) {
            Uri.fromFile(executableFile)
        } else {
            rom.uri
        }

        setupEmulator(emulatorConfiguration)

        Log.i(TAG, "loadDsiWare: booting title $titleIdHex in full DSi mode (isDirectRomFile=$isDirectRomFile)")
        MelonEmulator.startBootDiagnosticCapture()
        val loadResult = MelonEmulator.loadRom(
            romUri = targetRomUri,
            sramUri = Uri.fromFile(saveFile),
            gbaSlotType = MelonEmulator.GbaSlotType.NONE,
            gbaRomUri = null,
            gbaSramUri = null,
        )
        if (loadResult.isTerminal || !isActive) {
            Log.w(TAG, "loadDsiWare: DSi launch failed ($loadResult), falling back to standard DS launch for '${rom.name}'")
            val fallbackConfig = emulatorConfiguration.copy(
                consoleType = ConsoleType.DS,
                useCustomBios = false,
                showBootScreen = false,
                dsiWareAutoloadTitleId = 0L,
            )
            setupEmulator(fallbackConfig)
            val retryResult = MelonEmulator.loadRom(
                romUri = rom.uri,
                sramUri = sram,
                gbaSlotType = MelonEmulator.GbaSlotType.NONE,
                gbaRomUri = null,
                gbaSramUri = null,
            )
            if (!retryResult.isTerminal && isActive) {
                messageQueue.start()
                if (!precompileVulkanPipelines(fallbackConfig)) {
                    cameraManager.stopCurrentCameraSource()
                    MelonEmulator.stopEmulation()
                    messageQueue.stop()
                    dldiFolderSyncManager.syncBackIfNeeded()
                    return@withContext RomLaunchResult.LaunchFailed(MelonEmulator.LoadResult.NDS_FAILED)
                }
                MelonEmulator.setupCheats(cheats.toTypedArray())
                MelonEmulator.startEmulation(startPaused = true)
                delay(10)
                val nativeDiag = MelonEmulator.stopAndGetBootDiagnostic()
                val cpuDiag = MelonEmulator.getDetailedEmulationDiagnostic()
                val fullDiag = "--- Native Boot Diagnostic ---\n$nativeDiag\n--- Emulation CPU & Hardware Diagnostic ---\n$cpuDiag"
                writeGameExecutionLog(rom, titleIdHex, true, "Fallback boot successful in standard DS mode\n$fullDiag", "loadDsiWare (DS Fallback)")
                return@withContext RomLaunchResult.LaunchSuccessful(true)
            }

            val diag = MelonEmulator.stopAndGetBootDiagnostic()
            cameraManager.stopCurrentCameraSource()
            MelonEmulator.stopEmulation()
            dldiFolderSyncManager.syncBackIfNeeded()
            writeGameExecutionLog(rom, titleIdHex, false, "loadRom/bootFirmware returned terminal error: $loadResult\n--- Native Boot Diagnostic ---\n$diag", "loadDsiWare")
            return@withContext RomLaunchResult.LaunchFailed(loadResult)
        }

        messageQueue.start()
        if (!precompileVulkanPipelines(emulatorConfiguration)) {
            val diag = MelonEmulator.stopAndGetBootDiagnostic()
            cameraManager.stopCurrentCameraSource()
            MelonEmulator.stopEmulation()
            messageQueue.stop()
            dldiFolderSyncManager.syncBackIfNeeded()
            writeGameExecutionLog(rom, titleIdHex, false, "Vulkan pipeline precompilation failed\n--- Native Boot Diagnostic ---\n$diag", "loadDsiWare")
            return@withContext RomLaunchResult.LaunchFailed(MelonEmulator.LoadResult.NDS_FAILED)
        }

        MelonEmulator.setupCheats(cheats.toTypedArray())
        activeDsiWareSession = ActiveDsiWareSession(
            rom = rom,
            titleId = titleId,
            titleIdHex = titleIdHex,
            sramUri = sram,
            cachePublicSaveFile = if (hasPublicSave || hasPrivateSave) saveFile else null,
            isTemporaryInjected = false,
            fileType = primaryFileType ?: DSiWareTitleFileType.PUBLIC_SAV,
        )
        MelonEmulator.startEmulation(startPaused = true)
        // Wait for emulation thread to complete SetupDirectBoot + DecryptModcryptArea
        delay(500)
        val nativeDiag = MelonEmulator.stopAndGetBootDiagnostic()
        writeGameExecutionLog(rom, titleIdHex, true, "DSiWare direct boot successful in DSi mode (NAND-synced)\n--- Native Boot Diagnostic ---\n$nativeDiag", "loadDsiWare")
        return@withContext RomLaunchResult.LaunchSuccessful(isGbaLoadSuccessful = true)
    }

    private fun writeGameExecutionLog(
        rom: Rom,
        gameCodeOrTitleId: String,
        success: Boolean,
        details: String,
        bootMethod: String = "loadRom",
    ) {
        coroutineScope.launch(Dispatchers.IO) {
            try {
                val dsBiosResult = configurationDirectoryVerifier.checkConsoleConfigurationDirectory(ConsoleType.DS)
                val dsiBiosResult = configurationDirectoryVerifier.checkConsoleConfigurationDirectory(ConsoleType.DSi)
                val renderer = settingsRepository.getCurrentVideoRenderer().name
                val jitEnabled = settingsRepository.isJitEnabled()
                val customBios = settingsRepository.useCustomBios()
                val dsiWareMode = if (rom.isDsiWareTitle || rom.isInstalledDsiWareShortcut) {
                    when (settingsRepository.getDsiWareBootMode()) {
                        me.magnum.melonds.domain.model.dsinand.DSiWareBootMode.DIRECT -> "DIRECT"
                        me.magnum.melonds.domain.model.dsinand.DSiWareBootMode.AUTOLOAD -> "AUTO"
                        me.magnum.melonds.domain.model.dsinand.DSiWareBootMode.SYSTEM_MENU -> "NAND"
                    }
                } else {
                    "DIRECT"
                }

                // 1. Save unified system report (!STORM_INFO.txt)
                StormDeviceSystemInfoReporter.saveUnifiedReport(
                    context = context,
                    rom = rom,
                    gameCodeOrTitleId = gameCodeOrTitleId,
                    success = success,
                    details = details,
                    bootMethod = bootMethod,
                    dsBiosStatus = dsBiosResult.status.name,
                    dsiBiosStatus = dsiBiosResult.status.name,
                    videoRenderer = renderer,
                    jitEnabled = jitEnabled,
                    customBiosEnabled = customBios,
                    dsiWareBootMode = dsiWareMode,
                )

                // 2. Save dedicated game log (<filename>.txt)
                StormDeviceSystemInfoReporter.saveGameLog(
                    context = context,
                    rom = rom,
                    mode = dsiWareMode,
                    success = success,
                    details = details,
                    bootMethod = bootMethod,
                    dsBiosStatus = dsBiosResult.status.name,
                    dsiBiosStatus = dsiBiosResult.status.name,
                    videoRenderer = renderer,
                    jitEnabled = jitEnabled,
                    customBiosEnabled = customBios,
                )
            } catch (e: Throwable) {
                Log.w(TAG, "writeGameExecutionLog async error", e)
            }
        }
    }

    private fun Long.toDsiWareTitleIdHex(): String {
        return (this and 0xFFFFFFFFL).toString(16).padStart(8, '0')
    }

    override suspend fun loadFirmware(consoleType: ConsoleType): FirmwareLaunchResult {
        return withContext(Dispatchers.IO) {
            try {
                val emulatorConfiguration = getFirmwareEmulatorConfiguration(consoleType)
                setupEmulator(emulatorConfiguration)
                val result = MelonEmulator.bootFirmware()
                if (result != MelonEmulator.FirmwareLoadResult.SUCCESS) {
                    cameraManager.stopCurrentCameraSource()
                    MelonEmulator.stopEmulation()
                    FirmwareLaunchResult.LaunchFailed(result)
                } else {
                    messageQueue.start()
                    MelonEmulator.startEmulation(startPaused = true)
                    FirmwareLaunchResult.LaunchSuccessful
                }
            } catch (exception: Throwable) {
                if (exception is CancellationException) {
                    throw exception
                }
                Log.e(TAG, "Failed to load firmware", exception)
                cameraManager.stopCurrentCameraSource()
                MelonEmulator.stopEmulation()
                messageQueue.stop()
                FirmwareLaunchResult.LaunchFailed(MelonEmulator.FirmwareLoadResult.FIRMWARE_BAD)
            }
        }
    }

    override suspend fun updateRomEmulatorConfiguration(rom: Rom) {
        val configuration = getRomEmulatorConfiguration(rom)
        MelonEmulator.updateEmulatorConfiguration(configuration)
    }

    private fun logRetroArchShaderLaunchState(configuration: EmulatorConfiguration) {
        val renderer = configuration.rendererConfiguration
        val retroShader = renderer.retroArchShader
        Log.i(
            TAG,
            "RetroArchShaderLaunch: renderer=${renderer.renderer} " +
                "filter=${renderer.videoFiltering} " +
                "preset=${retroShader.presetPath ?: "<none>"} " +
                "source=${retroShader.sourceResolution} " +
                "passes=${retroShader.passCount} " +
                "sourceBytes=${retroShader.sourceBytes} " +
                "clearHistory=${retroShader.clearHistory}",
        )
    }

    private fun precompileVulkanPipelines(configuration: EmulatorConfiguration): Boolean {
        logRetroArchShaderLaunchState(configuration)
        if (configuration.rendererConfiguration.renderer != VideoRenderer.VULKAN) {
            return true
        }

        val retroShader = configuration.rendererConfiguration.retroArchShader
        val startedAt = SystemClock.elapsedRealtime()
        val succeeded = MelonEmulator.precompileVulkanPipelines(
            videoFilteringOrdinal = configuration.rendererConfiguration.videoFiltering.ordinal,
            retroShaderPresetPath = retroShader.presetPath,
            retroShaderSourceResolution = retroShader.sourceResolution.name.lowercase(),
            retroShaderPassCount = retroShader.passCount,
            retroShaderParameterOverrides = retroShader.parameterOverrides,
        )
        val presetPath = retroShader.presetPath
        if (succeeded && presetPath != null) {
            shaderCompileTimeStore.record(
                presetPath = presetPath,
                backend = ShaderCompileTimeStore.Backend.VULKAN,
                millis = SystemClock.elapsedRealtime() - startedAt,
            )
        }
        return succeeded
    }

    override suspend fun updateFirmwareEmulatorConfiguration(consoleType: ConsoleType) {
        val configuration = getFirmwareEmulatorConfiguration(consoleType)
        MelonEmulator.updateEmulatorConfiguration(configuration)
    }

    override suspend fun getRewindWindow(): RewindWindow {
        return MelonEmulator.getRewindWindow()
    }

    override fun getFps(): Float {
        return MelonEmulator.getFPS()
    }

    override suspend fun pauseEmulator() {
        MelonEmulator.pauseEmulation()
    }

    override suspend fun resumeEmulator() {
        MelonEmulator.resumeEmulation()
    }

    override suspend fun debugStepFrame(): Boolean = withContext(Dispatchers.Default) {
        MelonEmulator.debugStepFrame()
    }

    override suspend fun resetEmulator() = withContext(Dispatchers.Default) {
        MelonEmulator.resetEmulation()
    }

    override suspend fun updateCheats(cheats: List<Cheat>) {
        MelonEmulator.setupCheats(cheats.toTypedArray())
    }

    override suspend fun setupRetroAchievements(achievementData: GameAchievementData, runtimeConfig: RARuntimeBridgeConfig?) {
        leaderboardTrackerUpdateLogLimiter.resetAll()
        leaderboardDiagnosticsEnabled = settingsRepository.isRendererDebugToolsEnabled().firstOrNull() == true
        val richPresencePath = if (settingsRepository.isRetroAchievementsRichPresenceEnabled()) {
            achievementData.richPresencePatch
        } else {
            null
        }

        withContext(Dispatchers.Default) {
            val setupSucceeded = MelonEmulator.setupAchievements(
                achievements = achievementData.lockedAchievements.toTypedArray(),
                leaderboards = achievementData.leaderboards.toTypedArray(),
                richPresenceScript = richPresencePath,
                runtimeConfig = runtimeConfig,
            )
            if (!setupSucceeded) {
                throw RetroAchievementsSetupException()
            }
        }
    }

    override suspend fun retryPendingRetroAchievementsSubmissions(
        expectedNativeSubmissionIds: List<Long>,
    ): RaNativePendingRetryResult {
        return withContext(Dispatchers.Default) {
            RetroAchievementsEventDecoder.readPendingRetryResult(
                MelonEmulator.retryPendingRetroAchievementsSubmissions(
                    expectedNativeSubmissionIds.toLongArray(),
                ),
            )
        }
    }

    override suspend fun refreshPendingRetroAchievementsSubmissions(): Long {
        return withContext(Dispatchers.Default) {
            MelonEmulator.refreshPendingRetroAchievementsSubmissions()
        }
    }

    override suspend fun discardPendingRetroAchievementsSubmissions(
        expectedNativeSubmissionIds: List<Long>,
    ): Int {
        return withContext(Dispatchers.Default) {
            MelonEmulator.discardPendingRetroAchievementsSubmissions(
                expectedNativeSubmissionIds.toLongArray(),
            )
        }
    }

    override suspend fun setRetroAchievementsSubmissionTransportSuspended(suspended: Boolean) {
        withContext(Dispatchers.Default) {
            MelonEmulator.setRetroAchievementsSubmissionTransportSuspended(suspended)
        }
    }

    override fun unloadRetroAchievementsData() {
        leaderboardDiagnosticsEnabled = false
        leaderboardTrackerUpdateLogLimiter.resetAll()
        MelonEmulator.unloadRetroAchievementsData()
    }

    override suspend fun loadRewindState(rewindSaveState: RewindSaveState): Boolean {
        return MelonEmulator.loadRewindState(rewindSaveState)
    }

    override suspend fun saveState(saveStateFileUri: Uri): Boolean = withContext(Dispatchers.IO) {
        MelonEmulator.saveState(saveStateFileUri)
    }

    override suspend fun loadState(saveStateFileUri: Uri): Boolean = withContext(Dispatchers.IO) {
        MelonEmulator.loadState(saveStateFileUri)
    }

    override suspend fun takeScreenshot(): Boolean = withContext(Dispatchers.IO) {
        MelonEmulator.takeScreenshot()
    }

    override fun stopEmulator() {
        MelonEmulator.stopEmulation()
        syncDsiWareSessionSaveAndCleanup()
        dldiFolderSyncManager.syncBackIfNeeded()
        cameraManager.stopCurrentCameraSource()
        messageQueue.stop()
    }

    private fun syncDsiWareSessionSaveAndCleanup() {
        val session = activeDsiWareSession ?: return
        activeDsiWareSession = null

        val cacheSave = session.cachePublicSaveFile
        runBlocking(Dispatchers.IO) {
            // Step 1: Copy the emulated .sav from cache to user's save folder
            if (cacheSave != null && cacheSave.exists()) {
                runCatching {
                    context.contentResolver.openOutputStream(session.sramUri, "wt")?.use { output ->
                        cacheSave.inputStream().use { input ->
                            input.copyTo(output)
                        }
                    }
                    Log.i(TAG, "DSiWare session: synced save to user save folder (${session.sramUri})")
                }.onFailure {
                    Log.w(TAG, "DSiWare session: failed to sync save to user save folder", it)
                }
            }

            // Step 2: Sync save back into NAND and cleanup
            val openNandResult = dsiNandManager.openNand()
            if (openNandResult.isFailure()) {
                Log.w(TAG, "DSiWare session: failed to reopen NAND for save sync title=${session.titleIdHex} result=$openNandResult")
                return@runBlocking
            }

            try {
                if (cacheSave != null && cacheSave.exists()) {
                    val imported = dsiNandManager.importTitleFileFromPath(
                        titleId = session.titleId,
                        fileType = session.fileType,
                        filePath = cacheSave.absolutePath,
                    )
                    Log.i(TAG, "DSiWare session: synced save into NAND title=${session.titleIdHex} fileType=${session.fileType} result=$imported")
                }
            } catch (e: Throwable) {
                Log.w(TAG, "DSiWare session: error during save sync title=${session.titleIdHex}", e)
            } finally {
                dsiNandManager.closeNand()
            }
        }
    }

    override fun cleanEmulator() {
        cameraManager.dispose()
        messageQueue.cleanup()
    }

    override fun observeRetroAchievementEvents(): Flow<RAEvent> {
        return achievementsSharedFlow.asSharedFlow()
    }

    private fun setupEmulator(emulatorConfiguration: EmulatorConfiguration) {
        if (emulatorConfiguration.rendererConfiguration.renderer == VideoRenderer.VULKAN) {
            MelonDSAndroidInterface.configureVulkanDriver(
                settingsRepository.getVulkanDriverConfiguration(context.applicationInfo.nativeLibraryDir)
            )
        }
        MelonEmulator.setupEmulator(
            emulatorConfiguration = emulatorConfiguration,
            dsiCameraSource = cameraManager,
            screenshotBuffer = screenshotFrameBufferProvider.frameBuffer(),
        )
    }

    private suspend fun getRomEmulatorConfiguration(rom: Rom): EmulatorConfiguration {
        val baseConfiguration = settingsRepository.getEmulatorConfiguration(rom.config)
        val isDsiTitle = rom.isInstalledDsiWareShortcut || isRealDsiWareTitle(rom) || rom.isDsiWareTitle
        val dsiStatus = configurationDirectoryVerifier.checkConsoleConfigurationDirectory(ConsoleType.DSi)
        val canRunDsi = isDsiTitle && dsiStatus.status == ConfigurationDirResult.Status.VALID
        val consoleType = when {
            rom.config.runtimeConsoleType == RuntimeConsoleType.DSi -> ConsoleType.DSi
            rom.config.runtimeConsoleType == RuntimeConsoleType.DS -> ConsoleType.DS
            canRunDsi -> ConsoleType.DSi
            else -> baseConfiguration.consoleType
        }
        val mustUseCustomBios = (consoleType == ConsoleType.DSi) || baseConfiguration.useCustomBios || rom.config.runtimeConsoleType != RuntimeConsoleType.DEFAULT

        return baseConfiguration.copy(
            useCustomBios = mustUseCustomBios,
            showBootScreen = if (consoleType == ConsoleType.DSi) false else baseConfiguration.showBootScreen && mustUseCustomBios,
            frameLimitSpeedMultiplier = if (emulatorSession.isRetroAchievementsHardcoreModeEnabled) 1.0f else baseConfiguration.frameLimitSpeedMultiplier,
            hgEngineFixEnabled = rom.config.useHgEngineFix,
            consoleType = consoleType,
            micSource = getRomOptionOrDefault(rom.config.runtimeMicSource, baseConfiguration.micSource),
            dsiWareAutoloadTitleId = 0L,
        ).run { getPermissionAdjustedConfiguration(this) }
    }

    private suspend fun getFirmwareEmulatorConfiguration(consoleType: ConsoleType): EmulatorConfiguration {
        return settingsRepository.getEmulatorConfiguration().copy(
            consoleType = consoleType,
            useCustomBios = true,
            showBootScreen = true,
            dsiWareAutoloadTitleId = 0L,
        ).run { getPermissionAdjustedConfiguration(this) }
    }

    private fun <T, U> getRomOptionOrDefault(romOption: T, default: U): U where T : RuntimeEnum<T, U> {
        return if (romOption.getDefault() == romOption) {
            default
        } else {
            romOption.getValue()
        }
    }

    private suspend fun getPermissionAdjustedConfiguration(originalConfiguration: EmulatorConfiguration): EmulatorConfiguration {
        if (originalConfiguration.micSource == MicSource.DEVICE) {
            if (!permissionHandler.checkPermission(android.Manifest.permission.RECORD_AUDIO)) {
                return originalConfiguration.copy(micSource = MicSource.NONE)
            }
        }

        return originalConfiguration
    }

    private fun EmulatorConfiguration.withPreparedDldiConfiguration(): EmulatorConfiguration {
        val preparedConfiguration = dldiFolderSyncManager.prepareConfiguration(dldiSdCardConfiguration)
        return if (preparedConfiguration != null) {
            copy(dldiSdCardConfiguration = preparedConfiguration)
        } else {
            Log.w(TAG, "withPreparedDldiConfiguration: failed to prepare DLDI SD Card, falling back to disabled SD Card")
            copy(dldiSdCardConfiguration = dldiSdCardConfiguration.copy(enabled = false))
        }
    }

    private fun logLeaderboardJni(
        eventType: String,
        leaderboardId: Long,
        attemptId: Long,
        eventSequence: Long,
        details: String = "",
    ) {
        if (!leaderboardDiagnosticsEnabled) return

        Log.i(
            RA_SUBMISSION_TAG,
            "event_type=jni_event_received jni_event=$eventType leaderboard_id=$leaderboardId " +
                "attempt_id=$attemptId event_sequence=$eventSequence ${details.trim()}",
        )
    }

    private fun getStopReason(internalReason: Int): EmulatorEvent.Stop.Reason? {
        return when (internalReason) {
            GBAModeNotSupported -> EmulatorEvent.Stop.Reason.GBAModeNotSupported
            BadExceptionRegion -> EmulatorEvent.Stop.Reason.BadExceptionRegion
            PowerOff -> EmulatorEvent.Stop.Reason.PowerOff
            else -> null
        }
    }

    private fun getRenderer(internalRenderer: Int): VideoRenderer? {
        return VideoRenderer.entries.firstOrNull { it.renderer == internalRenderer }
    }
}
