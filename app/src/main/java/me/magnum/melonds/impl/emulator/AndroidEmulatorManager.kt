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
import me.magnum.melonds.impl.NusDSiWareMetadataRepository
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
                val isInstalledShortcut = rom.isInstalledDsiWareShortcut ||
                    rom.uri.scheme == Rom.INSTALLED_DSIWARE_URI_SCHEME

                if (isInstalledShortcut) {
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

                if (emulatorConfiguration.consoleType == ConsoleType.DSi && (rom.isDsiWareTitle || isRealDsiWareTitle(rom))) {
                    try {
                        val titleId = extractDsiWareTitleId(rom)
                        if (titleId != null) {
                            val headerBytes = context.contentResolver.openInputStream(rom.uri)?.use { stream ->
                                val buf = ByteArray(0x1000)
                                var read = 0
                                while (read < 0x1000) {
                                    val count = stream.read(buf, read, 0x1000 - read)
                                    if (count <= 0) break
                                    read += count
                                }
                                if (read >= 0x160) buf else null
                            }
                            if (headerBytes != null && dsiNandManager.openNand().isSuccess()) {
                                try {
                                    val pubSav = ((headerBytes[0x238].toInt() and 0xFF) or
                                        ((headerBytes[0x239].toInt() and 0xFF) shl 8) or
                                        ((headerBytes[0x23A].toInt() and 0xFF) shl 16) or
                                        ((headerBytes[0x23B].toInt() and 0xFF) shl 24)).toUInt()
                                    val privSav = ((headerBytes[0x23C].toInt() and 0xFF) or
                                        ((headerBytes[0x23D].toInt() and 0xFF) shl 8) or
                                        ((headerBytes[0x23E].toInt() and 0xFF) shl 16) or
                                        ((headerBytes[0x23F].toInt() and 0xFF) shl 24)).toUInt()
                                    val romVersion = (headerBytes[0x01E].toInt() and 0xFF).toUShort()
                                    val tmd = NusDSiWareMetadataRepository.createTmd(
                                        categoryId = 0x00030004u,
                                        titleId = titleId.toUInt(),
                                        publicSaveSize = pubSav,
                                        privateSaveSize = privSav,
                                        titleVersion = romVersion,
                                    )
                                    dsiNandManager.ensureTitleSaveStructure(titleId, headerBytes, tmd)
                                } finally {
                                    dsiNandManager.closeNand()
                                }
                            }
                        }
                    } catch (e: Throwable) {
                        Log.w(TAG, "loadRom: safety NAND structure preparation error", e)
                    }
                }

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

        val isDirectRomFile = !rom.isInstalledDsiWareShortcut && rom.uri.scheme != Rom.INSTALLED_DSIWARE_URI_SCHEME
        val openNandResult = dsiNandManager.openNand()
        if (openNandResult.isFailure()) {
            Log.w(TAG, "loadDsiWare: failed to open NAND title=$titleIdHex result=$openNandResult")
            writeGameExecutionLog(rom, titleIdHex, false, "Failed to open NAND: $openNandResult", "loadDsiWare")
            return@withContext RomLaunchResult.LaunchFailed(MelonEmulator.LoadResult.BIOS_FAILED)
        }

        if (isDirectRomFile) {
            try {
                val headerBytes = context.contentResolver.openInputStream(rom.uri)?.use { stream ->
                    val buf = ByteArray(0x1000)
                    var read = 0
                    while (read < 0x1000) {
                        val count = stream.read(buf, read, 0x1000 - read)
                        if (count <= 0) break
                        read += count
                    }
                    if (read >= 0x160) buf else null
                }
                if (headerBytes != null) {
                    val pubSav = ((headerBytes[0x238].toInt() and 0xFF) or
                        ((headerBytes[0x239].toInt() and 0xFF) shl 8) or
                        ((headerBytes[0x23A].toInt() and 0xFF) shl 16) or
                        ((headerBytes[0x23B].toInt() and 0xFF) shl 24)).toUInt()
                    val privSav = ((headerBytes[0x23C].toInt() and 0xFF) or
                        ((headerBytes[0x23D].toInt() and 0xFF) shl 8) or
                        ((headerBytes[0x23E].toInt() and 0xFF) shl 16) or
                        ((headerBytes[0x23F].toInt() and 0xFF) shl 24)).toUInt()
                    val romVersion = (headerBytes[0x01E].toInt() and 0xFF).toUShort()
                    val tmdMetadata = runCatching {
                        NusDSiWareMetadataRepository.createTmd(
                            categoryId = 0x00030004u,
                            titleId = titleId.toUInt(),
                            publicSaveSize = pubSav,
                            privateSaveSize = privSav,
                            titleVersion = romVersion,
                            contentSize = 0L,
                            contentSha1 = null,
                        )
                    }.getOrNull()

                    dsiNandManager.ensureTitleSaveStructure(titleId, headerBytes, tmdMetadata)

                    // If user has existing .sav in their save folder, sync it into NAND before launching;
                    // otherwise or if corrupted/empty, repair NAND and export valid FAT12 public.sav so user storage immediately has valid FAT12 save
                    try {
                        val expectedSize = if (pubSav > 0u) pubSav.toInt() else 64 * 1024
                        val sramDoc = DocumentFile.fromSingleUri(context, sram)
                        var isUserSaveValid = false
                        if (sramDoc != null && sramDoc.exists() && sramDoc.length() >= 512L) {
                            val sramBytes = context.contentResolver.openInputStream(sram)?.use { it.readBytes() }
                            val isSizeMatching = sramBytes != null && (sramBytes.size == expectedSize || pubSav == 0u)
                            if (isSizeMatching && isValidDsiWareFatSave(sramBytes)) {
                                isUserSaveValid = true
                                dsiNandManager.importTitleFile(titleId, DSiWareTitleFileType.PUBLIC_SAV, sram)
                                Log.i(TAG, "loadDsiWare: successfully synced valid user FAT12 save (${sramBytes?.size} B) into NAND title=$titleIdHex")
                            } else {
                                Log.w(TAG, "loadDsiWare: existing save file is corrupt, mismatched size, or invalid FAT12 (${sramDoc.name}, size=${sramDoc.length()}, expected=$expectedSize), auto-repairing...")
                            }
                        }

                        if (!isUserSaveValid) {
                            // User save is missing, mismatched size, or corrupted:
                            // 1. Generate a valid FAT12 filesystem matching pubSav (or default 64KB)
                            val validFatBytes = createFormattedFat12(expectedSize)

                            // 2. Directly write valid FAT12 into user sramUri
                            val openStream = runCatching { context.contentResolver.openOutputStream(sram, "rwt") }.getOrNull()
                                ?: runCatching { context.contentResolver.openOutputStream(sram, "w") }.getOrNull()
                            openStream?.use { output -> output.write(validFatBytes) }
                            Log.i(TAG, "loadDsiWare: wrote valid formatted FAT12 save (${validFatBytes.size} B) directly to user sram=$sram")

                            // 3. Format and sync into NAND
                            dsiNandManager.importTitleFile(titleId, DSiWareTitleFileType.PUBLIC_SAV, sram)
                        }
                    } catch (e: Throwable) {
                        Log.w(TAG, "loadDsiWare: error syncing user save into NAND", e)
                    }
                }
            } catch (e: Throwable) {
                Log.w(TAG, "loadDsiWare: error preparing NAND title save structure", e)
            } finally {
                dsiNandManager.closeNand()
            }

            val emulatorConfiguration = getRomEmulatorConfiguration(rom)
                .copy(
                    consoleType = ConsoleType.DSi,
                    useCustomBios = true,
                    showBootScreen = false,
                    dsiWareAutoloadTitleId = 0L,
                )
                .withPreparedDldiConfiguration()

            setupEmulator(emulatorConfiguration)

            Log.i(TAG, "loadDsiWare: direct booting title $titleIdHex in DSi mode directly from ${rom.fileName}")
            MelonEmulator.startBootDiagnosticCapture()
            val loadResult = MelonEmulator.loadRom(
                romUri = rom.uri,
                sramUri = sram,
                gbaSlotType = MelonEmulator.GbaSlotType.NONE,
                gbaRomUri = null,
                gbaSramUri = null,
            )
            if (loadResult.isTerminal || !isActive) {
                Log.w(TAG, "loadDsiWare: DSi direct launch failed ($loadResult), falling back to standard DS launch for '${rom.name}'")
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
                        val diag = MelonEmulator.stopAndGetBootDiagnostic()
                        cameraManager.stopCurrentCameraSource()
                        MelonEmulator.stopEmulation()
                        messageQueue.stop()
                        writeGameExecutionLog(rom, titleIdHex, false, "Vulkan pipeline precompilation failed\n--- Native Boot Diagnostic ---\n$diag", "loadDsiWare (DS Fallback)")
                        return@withContext RomLaunchResult.LaunchFailed(MelonEmulator.LoadResult.NDS_FAILED)
                    }
                    MelonEmulator.setupCheats(cheats.toTypedArray())
                    activeDsiWareSession = null
                    MelonEmulator.startEmulation(startPaused = true)
                    delay(500)
                    val nativeDiag = MelonEmulator.stopAndGetBootDiagnostic()
                    val cpuDiag = MelonEmulator.getDetailedEmulationDiagnostic()
                    val fullDiag = "--- Native Boot Diagnostic ---\n$nativeDiag\n--- Emulation CPU & Hardware Diagnostic ---\n$cpuDiag"
                    writeGameExecutionLog(rom, titleIdHex, true, "Fallback boot successful in standard DS mode\n$fullDiag", "loadDsiWare (DS Fallback)")
                    return@withContext RomLaunchResult.LaunchSuccessful(true)
                }

                val diag = MelonEmulator.stopAndGetBootDiagnostic()
                cameraManager.stopCurrentCameraSource()
                MelonEmulator.stopEmulation()
                writeGameExecutionLog(rom, titleIdHex, false, "loadRom returned terminal error: $loadResult\n--- Native Boot Diagnostic ---\n$diag", "loadDsiWare")
                return@withContext RomLaunchResult.LaunchFailed(loadResult)
            }

            messageQueue.start()
            if (!precompileVulkanPipelines(emulatorConfiguration)) {
                val diag = MelonEmulator.stopAndGetBootDiagnostic()
                cameraManager.stopCurrentCameraSource()
                MelonEmulator.stopEmulation()
                messageQueue.stop()
                writeGameExecutionLog(rom, titleIdHex, false, "Vulkan pipeline precompilation failed\n--- Native Boot Diagnostic ---\n$diag", "loadDsiWare")
                return@withContext RomLaunchResult.LaunchFailed(MelonEmulator.LoadResult.NDS_FAILED)
            }

            MelonEmulator.setupCheats(cheats.toTypedArray())
            activeDsiWareSession = ActiveDsiWareSession(
                rom = rom,
                titleId = titleId,
                titleIdHex = titleIdHex,
                sramUri = sram,
                cachePublicSaveFile = null,
                isTemporaryInjected = false,
                fileType = DSiWareTitleFileType.PUBLIC_SAV,
            )
            MelonEmulator.startEmulation(startPaused = true)
            delay(500)
            val nativeDiag = MelonEmulator.stopAndGetBootDiagnostic()
            writeGameExecutionLog(rom, titleIdHex, true, "DSiWare direct boot successful in DSi mode (NAND-synced)\n--- Native Boot Diagnostic ---\n$nativeDiag", "loadDsiWare")
            return@withContext RomLaunchResult.LaunchSuccessful(isGbaLoadSuccessful = true)
        }

        val shortcutCacheDir = File(context.cacheDir, "installed_dsiware").apply { mkdirs() }
        val executableFile = File(shortcutCacheDir, "$titleIdHex.app")
        val saveFile = File(shortcutCacheDir, "$titleIdHex.public.sav")

        var isTemp = false
        var hasPublicSave = false
        var hasPrivateSave = false
        var primaryFileType: DSiWareTitleFileType? = null
        val dsiWareBootMode = settingsRepository.getDsiWareBootMode()

        try {
            val installedTitle = dsiNandManager.listTitles().firstOrNull { it.titleId == titleId }
            if (installedTitle != null) {
                dsiNandManager.repairTitleSaves(titleId)

                // If user has existing .sav in their save folder, sync it into NAND before launching
                try {
                    val sramDoc = DocumentFile.fromSingleUri(context, sram)
                    var isUserSaveValid = false
                    if (sramDoc != null && sramDoc.exists() && sramDoc.length() >= 512L) {
                        val sramBytes = context.contentResolver.openInputStream(sram)?.use { it.readBytes() }
                        if (isValidDsiWareFatSave(sramBytes)) {
                            isUserSaveValid = true
                            dsiNandManager.importTitleFile(titleId, DSiWareTitleFileType.PUBLIC_SAV, sram)
                            Log.i(TAG, "loadDsiWare: successfully synced valid user FAT12 save (${sramBytes?.size} B) into NAND title=$titleIdHex")
                        } else {
                            Log.w(TAG, "loadDsiWare: installed title user save is corrupt/invalid FAT12 (${sramDoc.name}), auto-repairing...")
                        }
                    }
                    if (!isUserSaveValid) {
                        dsiNandManager.repairTitleSaves(titleId)
                        dsiNandManager.exportTitleFile(titleId, DSiWareTitleFileType.PUBLIC_SAV, sram)
                    }
                } catch (e: Throwable) {
                    Log.w(TAG, "loadDsiWare: error syncing user public save with NAND", e)
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
                if (!exportedSave || saveFile.length() == 0L) {
                    runCatching { saveFile.delete() }
                }
            } else {
                runCatching { saveFile.delete() }
            }
        } finally {
            dsiNandManager.closeNand()
        }

        val (showBootScreen, autoloadTitleId) = when (dsiWareBootMode) {
            me.magnum.melonds.domain.model.dsinand.DSiWareBootMode.SYSTEM_MENU -> true to 0L
            me.magnum.melonds.domain.model.dsinand.DSiWareBootMode.AUTOLOAD -> false to titleId
            me.magnum.melonds.domain.model.dsinand.DSiWareBootMode.DIRECT -> false to 0L
        }

        val emulatorConfiguration = getRomEmulatorConfiguration(rom)
            .copy(
                consoleType = ConsoleType.DSi,
                useCustomBios = true,
                showBootScreen = showBootScreen,
                dsiWareAutoloadTitleId = autoloadTitleId,
            )
            .withPreparedDldiConfiguration()

        val targetRomUri = if (executableFile.exists() && executableFile.length() > 0L) {
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
            writeGameExecutionLog(rom, titleIdHex, false, "loadRom/bootFirmware returned terminal error: $loadResult\n--- Native Boot Diagnostic ---\n$diag", "loadDsiWare")
            return@withContext RomLaunchResult.LaunchFailed(loadResult)
        }

        messageQueue.start()
        if (!precompileVulkanPipelines(emulatorConfiguration)) {
            val diag = MelonEmulator.stopAndGetBootDiagnostic()
            cameraManager.stopCurrentCameraSource()
            MelonEmulator.stopEmulation()
            messageQueue.stop()
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

    private fun isValidDsiWareFatSave(sramBytes: ByteArray?): Boolean {
        if (sramBytes == null || sramBytes.size < 512) return false
        val boot0 = sramBytes[0].toInt() and 0xFF
        val sig0 = sramBytes[0x1FE].toInt() and 0xFF
        val sig1 = sramBytes[0x1FF].toInt() and 0xFF
        if (sig0 != 0x55 || sig1 != 0xAA) return false
        if (boot0 != 0xEB && boot0 != 0xE9) return false
        val numFats = sramBytes[0x10].toInt() and 0xFF
        if (numFats < 1) return false
        if (sramBytes.size > 0x200) {
            val mediaDesc = sramBytes[0x200].toInt() and 0xFF
            if (mediaDesc != 0xF8) return false
        }
        val firstByte = sramBytes[0]
        return sramBytes.any { it != firstByte }
    }

    private fun createFormattedFat12(size: Int): ByteArray {
        val targetSize = if (size < 0x200) 64 * 1024 else size
        val buf = ByteArray(targetSize)
        val bytesPerSector = 512
        val totalSectors = targetSize / bytesPerSector
        val sectorsPerCluster = 1
        val reservedSectors = 1
        val numFats = 2
        val rootDirEntries = if (targetSize <= 0x20000) 64 else 128
        val sectorsPerFat = if (targetSize <= 0x80000) 1 else 2

        buf[0x00] = 0xEB.toByte()
        buf[0x01] = 0x3C.toByte()
        buf[0x02] = 0x90.toByte()
        System.arraycopy("MSDOS5.0".toByteArray(java.nio.charset.StandardCharsets.US_ASCII), 0, buf, 0x03, 8)
        buf[0x0B] = (bytesPerSector and 0xFF).toByte()
        buf[0x0C] = ((bytesPerSector shr 8) and 0xFF).toByte()
        buf[0x0D] = sectorsPerCluster.toByte()
        buf[0x0E] = (reservedSectors and 0xFF).toByte()
        buf[0x0F] = ((reservedSectors shr 8) and 0xFF).toByte()
        buf[0x10] = numFats.toByte()
        buf[0x11] = (rootDirEntries and 0xFF).toByte()
        buf[0x12] = ((rootDirEntries shr 8) and 0xFF).toByte()
        if (totalSectors < 0x10000) {
            buf[0x13] = (totalSectors and 0xFF).toByte()
            buf[0x14] = ((totalSectors shr 8) and 0xFF).toByte()
        } else {
            buf[0x20] = (totalSectors and 0xFF).toByte()
            buf[0x21] = ((totalSectors shr 8) and 0xFF).toByte()
            buf[0x22] = ((totalSectors shr 16) and 0xFF).toByte()
            buf[0x23] = ((totalSectors shr 24) and 0xFF).toByte()
        }
        buf[0x15] = 0xF8.toByte()
        buf[0x16] = (sectorsPerFat and 0xFF).toByte()
        buf[0x17] = ((sectorsPerFat shr 8) and 0xFF).toByte()
        buf[0x24] = 0x80.toByte()
        buf[0x26] = 0x29.toByte()
        buf[0x1FE] = 0x55.toByte()
        buf[0x1FF] = 0xAA.toByte()

        val fat1Offset = reservedSectors * bytesPerSector
        if (fat1Offset + 3 <= targetSize) {
            buf[fat1Offset + 0] = 0xF8.toByte()
            buf[fat1Offset + 1] = 0xFF.toByte()
            buf[fat1Offset + 2] = 0xFF.toByte()
            if (targetSize > 0x80000 && fat1Offset + 4 <= targetSize) {
                buf[fat1Offset + 3] = 0xFF.toByte()
            }
        }

        val fat2Offset = (reservedSectors + sectorsPerFat) * bytesPerSector
        if (fat2Offset + 3 <= targetSize) {
            buf[fat2Offset + 0] = 0xF8.toByte()
            buf[fat2Offset + 1] = 0xFF.toByte()
            buf[fat2Offset + 2] = 0xFF.toByte()
            if (targetSize > 0x80000 && fat2Offset + 4 <= targetSize) {
                buf[fat2Offset + 3] = 0xFF.toByte()
            }
        }

        return buf
    }

    override suspend fun loadFirmware(consoleType: ConsoleType): FirmwareLaunchResult {
        return withContext(Dispatchers.IO) {
            try {
                val emulatorConfiguration = getFirmwareEmulatorConfiguration(consoleType)
                    .withPreparedDldiConfiguration()
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
        cameraManager.stopCurrentCameraSource()
        messageQueue.stop()
    }

    private fun syncDsiWareSessionSaveAndCleanup() {
        val session = activeDsiWareSession ?: return
        activeDsiWareSession = null

        val cacheSave = session.cachePublicSaveFile
        runBlocking(Dispatchers.IO) {
            // Step 1: Copy the emulated .sav from cache to user's save folder
            if (cacheSave != null && cacheSave.exists() && cacheSave.length() > 0L) {
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
                if (cacheSave != null && cacheSave.exists() && cacheSave.length() > 0L) {
                    val imported = dsiNandManager.importTitleFileFromPath(
                        titleId = session.titleId,
                        fileType = session.fileType,
                        filePath = cacheSave.absolutePath,
                    )
                    Log.i(TAG, "DSiWare session: synced save into NAND title=${session.titleIdHex} fileType=${session.fileType} result=$imported")
                } else if (cacheSave == null) {
                    val exported = dsiNandManager.exportTitleFile(
                        titleId = session.titleId,
                        fileType = session.fileType,
                        fileUri = session.sramUri,
                    )
                    Log.i(TAG, "DSiWare session: exported NAND save to user sramUri result=$exported")
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
        val isDsiTitle = rom.isInstalledDsiWareShortcut || isRealDsiWareTitle(rom) || rom.isDsiWareTitle || rom.isDsiEnhanced
        val consoleType = if (isDsiTitle) ConsoleType.DSi else ConsoleType.DS
        val mustUseCustomBios = (consoleType == ConsoleType.DSi) || baseConfiguration.useCustomBios

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
        return copy(dldiSdCardConfiguration = dldiSdCardConfiguration.copy(enabled = false))
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
