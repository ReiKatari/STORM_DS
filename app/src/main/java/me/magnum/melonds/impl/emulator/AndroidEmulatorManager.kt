package me.magnum.melonds.impl.emulator

import android.content.Context
import android.os.ParcelFileDescriptor
import android.os.SystemClock
import android.net.Uri
import android.util.Log
import androidx.documentfile.provider.DocumentFile
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.isActive
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import me.magnum.melonds.MelonDSAndroidInterface
import me.magnum.melonds.MelonEmulator
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
        if (rom.isInstalledDsiWareShortcut || rom.isDsiWareTitle || rom.installedDsiWareTitleId != null || rom.uri.scheme == Rom.INSTALLED_DSIWARE_URI_SCHEME || rom.fileName.endsWith(".dsi", ignoreCase = true)) {
            return true
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
                    (unitCode and 0x02) != 0 || unitCode == 0x03 || (gc0 != null && (gc0 == '4' || gc0 == 'H' || gc0 == 'K' || gc0 == 'V' || gc0 == 'Z'))
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
                        return@withContext loadDsiWare(rom, cheats)
                    } else {
                        Log.w(TAG, "DSi custom BIOS/Firmware/NAND not valid (${dsiBiosResult.status}), falling back to standard loader")
                    }
                }

                val fileRomDocument = DocumentFile.fromSingleUri(context, rom.uri) ?: return@withContext RomLaunchResult.LaunchFailedRomNotFound
                val fileRomProcessor = romFileProcessorFactory.getFileRomProcessorForDocument(fileRomDocument)
                val romUri = fileRomProcessor?.getRealRomUri(rom) ?: return@withContext RomLaunchResult.LaunchFailedRomNotSupported
                val sram = try {
                    sramProvider.getSramForRom(rom)
                } catch (exception: SramLoadException) {
                    return@withContext RomLaunchResult.LaunchFailedSramProblem(exception)
                }

                // Auto-decrypt encrypted DSi/DSiWare ROM before launch
                if (rom.isDsiWareTitle || rom.isDsiEnhanced) {
                    runCatching {
                        if (me.magnum.melonds.MelonRomDecryptor.checkEncryption(context, rom.uri) == me.magnum.melonds.MelonRomDecryptor.EncryptionStatus.MODCRYPT_ENCRYPTED) {
                            Log.i(TAG, "loadRom: Auto-decrypting encrypted ROM: ${rom.name}")
                            me.magnum.melonds.MelonRomDecryptor.decryptRom(context, rom.uri)
                        }
                    }
                }

                val emulatorConfiguration = getRomEmulatorConfiguration(rom)
                    .withPreparedDldiConfiguration()
                    ?: return@withContext RomLaunchResult.LaunchFailed(MelonEmulator.LoadResult.NDS_FAILED)
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
                        delay(300)
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
                    delay(300)
                    val nativeDiag = MelonEmulator.stopAndGetBootDiagnostic()
                    val cpuDiag = MelonEmulator.getDetailedEmulationDiagnostic()
                    val fullDiag = "--- Native Boot Diagnostic ---\n$nativeDiag\n--- Emulation CPU & Hardware Diagnostic ---\n$cpuDiag"
                    writeGameExecutionLog(rom, rom.fileName, true, "ROM launch successful in ${emulatorConfiguration.consoleType} mode\n$fullDiag", "loadRom")

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
                if (read >= 0x234) {
                    val rawTitleId = ((header[0x230].toInt() and 0xFF) or
                        ((header[0x231].toInt() and 0xFF) shl 8) or
                        ((header[0x232].toInt() and 0xFF) shl 16) or
                        ((header[0x233].toInt() and 0xFF) shl 24)).toLong() and 0xFFFFFFFFL
                    if (rawTitleId != 0L) rawTitleId else null
                } else null
            }
        }.getOrNull() ?: run {
            val code = rom.name.filter { it.isLetterOrDigit() }.take(4)
            if (code.length == 4) {
                val b0 = code[0].code.toLong()
                val b1 = code[1].code.toLong()
                val b2 = code[2].code.toLong()
                val b3 = code[3].code.toLong()
                (b0 or (b1 shl 8) or (b2 shl 16) or (b3 shl 24)) and 0xFFFFFFFFL
            } else null
        }
    }

    private suspend fun loadDsiWare(rom: Rom, cheats: List<Cheat>): RomLaunchResult = withContext(Dispatchers.IO) {
        val dsiStatus = configurationDirectoryVerifier.checkConsoleConfigurationDirectory(ConsoleType.DSi)
        if (dsiStatus.status != ConfigurationDirResult.Status.VALID) {
            writeGameExecutionLog(rom, rom.fileName, false, "DSi custom BIOS/Firmware/NAND configuration is invalid: ${dsiStatus.status}", "loadDsiWare")
            return@withContext RomLaunchResult.LaunchFailed(MelonEmulator.LoadResult.BIOS_FAILED)
        }

        // Auto-decrypt encrypted DSi/DSiWare ROM before launch
        if (rom.isDsiWareTitle || rom.isDsiEnhanced) {
            runCatching {
                if (me.magnum.melonds.MelonRomDecryptor.checkEncryption(context, rom.uri) == me.magnum.melonds.MelonRomDecryptor.EncryptionStatus.MODCRYPT_ENCRYPTED) {
                    Log.i(TAG, "loadDsiWare: Auto-decrypting encrypted ROM: ${rom.name}")
                    me.magnum.melonds.MelonRomDecryptor.decryptRom(context, rom.uri)
                }
            }
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
        try {
            val installedTitles = dsiNandManager.listTitles()
            val installedTitle = installedTitles.firstOrNull { it.titleId == titleId }
            if (installedTitle == null && !rom.isInstalledDsiWareShortcut && rom.uri.scheme != Rom.INSTALLED_DSIWARE_URI_SCHEME) {
                Log.i(TAG, "loadDsiWare: title $titleIdHex not in NAND; importing to NAND for session")
                val importResult = dsiNandManager.importTitle(rom.uri)
                if (importResult == ImportDSiWareTitleResult.SUCCESS) {
                    isTemp = true
                }
            }

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

            // Export executable from NAND for direct boot
            executableFile.delete()
            val exportResult = dsiNandManager.exportTitleExecutable(titleId, executableFile.absolutePath)
            if (!exportResult || !executableFile.exists() || executableFile.length() == 0L) {
                Log.w(TAG, "loadDsiWare: failed to export executable title=$titleIdHex")
                writeGameExecutionLog(rom, titleIdHex, false, "Failed to export executable from NAND", "loadDsiWare")
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

        val dsiWareBootMode = settingsRepository.getDsiWareBootMode()
        val (showBootScreen, autoloadTitleId) = when (dsiWareBootMode) {
            me.magnum.melonds.domain.model.dsinand.DSiWareBootMode.SYSTEM_MENU -> true to 0L
            me.magnum.melonds.domain.model.dsinand.DSiWareBootMode.AUTOLOAD -> true to titleId
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
            ?: run {
                writeGameExecutionLog(rom, titleIdHex, false, "Failed to prepare DLDI configuration", "loadDsiWare")
                return@withContext RomLaunchResult.LaunchFailed(MelonEmulator.LoadResult.NDS_FAILED)
            }

        val targetRomUri = if (executableFile.exists() && executableFile.length() > 0L) {
            Uri.fromFile(executableFile)
        } else {
            rom.uri
        }

        setupEmulator(emulatorConfiguration)

        Log.i(TAG, "loadDsiWare: booting title $titleIdHex via mode $dsiWareBootMode (targetUri=$targetRomUri, showBootScreen=$showBootScreen)")
        MelonEmulator.startBootDiagnosticCapture()
        val loadResult = MelonEmulator.loadRom(
            romUri = targetRomUri,
            sramUri = Uri.fromFile(saveFile),
            gbaSlotType = MelonEmulator.GbaSlotType.NONE,
            gbaRomUri = null,
            gbaSramUri = null,
        )
        if (loadResult.isTerminal || !isActive) {
            val diag = MelonEmulator.stopAndGetBootDiagnostic()
            cameraManager.stopCurrentCameraSource()
            MelonEmulator.stopEmulation()
            dldiFolderSyncManager.syncBackIfNeeded()
            writeGameExecutionLog(rom, titleIdHex, false, "loadRom returned terminal error: $loadResult\n--- Native Boot Diagnostic ---\n$diag", "loadDsiWare")
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
            isTemporaryInjected = isTemp,
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
        val versionName = runCatching { context.packageManager.getPackageInfo(context.packageName, 0).versionName }.getOrNull() ?: "2.8.6"

        val modeSuffix = if (rom.isDsiWareTitle || rom.isInstalledDsiWareShortcut) {
            "_${settingsRepository.getDsiWareBootMode().name}"
        } else if (rom.isDsiEnhanced) {
            "_DSi_ENHANCED"
        } else {
            "_${rom.config.runtimeConsoleType.name}"
        }

        val baseName = if (rom.fileName.isNotBlank()) {
            rom.fileName.substringBeforeLast('.')
        } else {
            rom.name
        }
        val logFileName = "${baseName}${modeSuffix}.log"
        val timestamp = java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", java.util.Locale.US).format(java.util.Date())

        val dsBiosResult = configurationDirectoryVerifier.checkConsoleConfigurationDirectory(ConsoleType.DS)
        val dsiBiosResult = configurationDirectoryVerifier.checkConsoleConfigurationDirectory(ConsoleType.DSi)
        val renderer = settingsRepository.getCurrentVideoRenderer()
        val jitEnabled = settingsRepository.isJitEnabled()
        val customBios = settingsRepository.useCustomBios()

        val logText = buildString {
            appendLine("==================================================")
            appendLine("STORM DS v$versionName - Game Execution Diagnostic Log")
            appendLine("Timestamp: $timestamp")
            appendLine("Device Model: ${android.os.Build.MANUFACTURER} ${android.os.Build.MODEL} (Android ${android.os.Build.VERSION.RELEASE}, API ${android.os.Build.VERSION.SDK_INT})")
            appendLine("--------------------------------------------------")
            appendLine("GAME INFORMATION:")
            appendLine("  Game Name: ${rom.name}")
            appendLine("  File Name: ${rom.fileName}")
            appendLine("  Game Code / Title ID: $gameCodeOrTitleId")
            appendLine("  ROM URI: ${rom.uri}")
            appendLine("  Is DSiWare Title: ${rom.isDsiWareTitle}")
            appendLine("  Is Installed DSiWare Shortcut: ${rom.isInstalledDsiWareShortcut}")
            appendLine("  Installed DSiWare TitleId: ${rom.installedDsiWareTitleId?.toString(16) ?: "null"}")
            appendLine("--------------------------------------------------")
            appendLine("EMULATION CONFIGURATION:")
            appendLine("  Console Target: ${rom.config.runtimeConsoleType}")
            appendLine("  Video Renderer: $renderer")
            appendLine("  JIT Recompiler: $jitEnabled")
            appendLine("  Custom BIOS Enabled: $customBios")
            appendLine("  DS Custom BIOS Status: ${dsBiosResult.status}")
            appendLine("  DSi Custom BIOS/NAND Status: ${dsiBiosResult.status}")
            if (rom.isDsiWareTitle || rom.isInstalledDsiWareShortcut) {
                appendLine("  DSiWare Boot Mode: ${settingsRepository.getDsiWareBootMode()}")
            }
            appendLine("--------------------------------------------------")
            appendLine("EXECUTION TELEMETRY:")
            appendLine("  Boot Method: $bootMethod")
            appendLine("  Status: ${if (success) "SUCCESS" else "FAILED"}")
            appendLine("  Details: $details")
            appendLine("==================================================")
        }

        // 1. Direct file write in Downloads/STORM DS LOGS (always overwrite)
        var written = false
        try {
            val downloadDir = android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOWNLOADS)
            val logsDir = File(downloadDir, "STORM DS LOGS").apply { mkdirs() }
            val logFile = File(logsDir, logFileName)
            if (logFile.exists()) {
                logFile.delete()
            }
            logFile.writeText(logText, Charsets.UTF_8)
            written = true
            Log.i(TAG, "Wrote diagnostic log to: ${logFile.absolutePath}")
        } catch (e: Throwable) {
            Log.w(TAG, "Direct write to Downloads failed: ${e.message}")
        }

        // 2. MediaStore write for Android 10+
        if (!written && android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
            try {
                // Delete previous MediaStore entry if exists to ensure overwrite
                val relativePath = "${android.os.Environment.DIRECTORY_DOWNLOADS}/STORM DS LOGS/"
                val selection = "${android.provider.MediaStore.MediaColumns.DISPLAY_NAME} = ? AND ${android.provider.MediaStore.MediaColumns.RELATIVE_PATH} = ?"
                val selectionArgs = arrayOf(logFileName, relativePath)
                context.contentResolver.delete(android.provider.MediaStore.Downloads.EXTERNAL_CONTENT_URI, selection, selectionArgs)

                val contentValues = android.content.ContentValues().apply {
                    put(android.provider.MediaStore.MediaColumns.DISPLAY_NAME, logFileName)
                    put(android.provider.MediaStore.MediaColumns.MIME_TYPE, "text/plain")
                    put(android.provider.MediaStore.MediaColumns.RELATIVE_PATH, "${android.os.Environment.DIRECTORY_DOWNLOADS}/STORM DS LOGS")
                }
                val uri = context.contentResolver.insert(android.provider.MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues)
                if (uri != null) {
                    context.contentResolver.openOutputStream(uri, "wt")?.use { os ->
                        os.write(logText.toByteArray(Charsets.UTF_8))
                    }
                    written = true
                    Log.i(TAG, "Wrote diagnostic log via MediaStore to: $uri")
                }
            } catch (e: Throwable) {
                Log.w(TAG, "MediaStore write failed: ${e.message}")
            }
        }

        // 3. Fallback to App External Files Dir
        if (!written) {
            try {
                val fallbackDir = File(context.getExternalFilesDir(null), "STORM DS LOGS").apply { mkdirs() }
                val fallbackFile = File(fallbackDir, logFileName)
                fallbackFile.writeText(logText, Charsets.UTF_8)
                Log.i(TAG, "Wrote diagnostic log to fallback: ${fallbackFile.absolutePath}")
            } catch (e: Throwable) {
                Log.e(TAG, "Failed all log writing attempts", e)
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

                if (session.isTemporaryInjected) {
                    Log.i(TAG, "DSiWare session: cleaning up temporary injected title ${session.titleIdHex} from NAND")
                    dsiNandManager.deleteTitle(session.titleId)
                }
            } catch (e: Throwable) {
                Log.w(TAG, "DSiWare session: error during save sync / cleanup title=${session.titleIdHex}", e)
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
        val isDsi = rom.isInstalledDsiWareShortcut || isRealDsiWareTitle(rom)
        val mustUseCustomBios = isDsi || baseConfiguration.useCustomBios || rom.config.runtimeConsoleType != RuntimeConsoleType.DEFAULT
        val consoleType = if (isDsi) {
            ConsoleType.DSi
        } else if (!baseConfiguration.useCustomBios && rom.config.runtimeConsoleType == RuntimeConsoleType.DEFAULT) {
            ConsoleType.DS
        } else {
            getRomOptionOrDefault(rom.config.runtimeConsoleType, baseConfiguration.consoleType)
        }

        return baseConfiguration.copy(
            useCustomBios = mustUseCustomBios,
            showBootScreen = if (isDsi) false else baseConfiguration.showBootScreen && mustUseCustomBios,
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

    private fun EmulatorConfiguration.withPreparedDldiConfiguration(): EmulatorConfiguration? {
        val preparedConfiguration = dldiFolderSyncManager.prepareConfiguration(dldiSdCardConfiguration) ?: return null
        return copy(dldiSdCardConfiguration = preparedConfiguration)
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
