package me.magnum.melonds.impl.emulator

import android.content.Context
import android.os.ParcelFileDescriptor
import android.os.SystemClock
import android.net.Uri
import android.util.Log
import androidx.documentfile.provider.DocumentFile
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
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
import me.magnum.melonds.domain.model.dsinand.DSiWareTitleFileType
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
) : EmulatorManager {
    private companion object {
        private const val TAG = "AndroidEmulatorManager"
        private const val RA_SUBMISSION_TAG = "RASubmission"
        private const val GBAModeNotSupported = 2
        private const val BadExceptionRegion = 3
        private const val PowerOff = 4
    }

    private class RetroAchievementsSetupException : RuntimeException("RetroAchievements runtime setup failed")
    private data class InstalledDsiWareShortcutSession(
        val titleId: Long,
        val titleIdHex: String,
        val publicSaveFile: File?,
    )

    private val _emulatorEvents = MutableSharedFlow<EmulatorEvent>(extraBufferCapacity = Int.MAX_VALUE)
    override val emulatorEvents: Flow<EmulatorEvent> = _emulatorEvents.asSharedFlow()

    private val achievementsSharedFlow = MutableSharedFlow<RAEvent>(replay = 0, extraBufferCapacity = Int.MAX_VALUE)
    private val dldiFolderSyncManager = DldiFolderSyncManager(context, settingsRepository)
    private var activeInstalledDsiWareShortcutSession: InstalledDsiWareShortcutSession? = null
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

    override suspend fun loadRom(rom: Rom, cheats: List<Cheat>): RomLaunchResult {
        return withContext(Dispatchers.IO) {
            try {
                if (rom.isInstalledDsiWareShortcut || rom.installedDsiWareTitleId != null) {
                    return@withContext loadInstalledDsiWareShortcut(rom, cheats)
                }

                val fileRomDocument = DocumentFile.fromSingleUri(context, rom.uri) ?: return@withContext RomLaunchResult.LaunchFailedRomNotFound
                val fileRomProcessor = romFileProcessorFactory.getFileRomProcessorForDocument(fileRomDocument)
                val romUri = fileRomProcessor?.getRealRomUri(rom) ?: return@withContext RomLaunchResult.LaunchFailedRomNotSupported
                val sram = try {
                    sramProvider.getSramForRom(rom)
                } catch (exception: SramLoadException) {
                    return@withContext RomLaunchResult.LaunchFailedSramProblem(exception)
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

                val loadResult = MelonEmulator.loadRom(
                    romUri = romUri,
                    sramUri = sram,
                    gbaSlotType = gbaSlotType,
                    gbaRomUri = (gbaSlotRomConfig as? RomGbaSlotConfig.GbaRom)?.romPath,
                    gbaSramUri = (gbaSlotRomConfig as? RomGbaSlotConfig.GbaRom)?.savePath
                )
                if (loadResult.isTerminal || !isActive) {
                    cameraManager.stopCurrentCameraSource()
                    MelonEmulator.stopEmulation()
                    dldiFolderSyncManager.syncBackIfNeeded()
                    RomLaunchResult.LaunchFailed(loadResult)
                } else {
                    messageQueue.start()
                    if (!precompileVulkanPipelines(emulatorConfiguration)) {
                        cameraManager.stopCurrentCameraSource()
                        MelonEmulator.stopEmulation()
                        messageQueue.stop()
                        dldiFolderSyncManager.syncBackIfNeeded()
                        return@withContext RomLaunchResult.LaunchFailed(MelonEmulator.LoadResult.NDS_FAILED)
                    }
                    MelonEmulator.setupCheats(cheats.toTypedArray())
                    MelonEmulator.startEmulation(startPaused = true)

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
                RomLaunchResult.LaunchFailed(MelonEmulator.LoadResult.NDS_FAILED)
            }
        }
    }

    private suspend fun loadInstalledDsiWareShortcut(rom: Rom, cheats: List<Cheat>): RomLaunchResult = withContext(Dispatchers.IO) {
        val titleId = rom.installedDsiWareTitleId ?: return@withContext RomLaunchResult.LaunchFailedRomNotFound
        val titleIdHex = titleId.toDsiWareTitleIdHex()
        val cacheDir = File(context.cacheDir, "dsiware_cache").apply { mkdirs() }
        val cacheRomFile = File(cacheDir, "${titleIdHex}.nds")

        // 1. Auto-provision, repair FAT12 NAND save files, and export fresh app
        val openResult = dsiNandManager.openNand()
        if (openResult == OpenDSiNandResult.SUCCESS || openResult == OpenDSiNandResult.NAND_ALREADY_OPEN) {
            try {
                if (rom.uri.scheme != "dsiware-installed") {
                    dsiNandManager.importTitle(rom.uri)
                }
                dsiNandManager.repairTitleSaves(titleId)
                dsiNandManager.exportTitleExecutable(titleId, cacheRomFile.absolutePath)
            } catch (e: Throwable) {
                Log.w(TAG, "dsiNandManager repairTitleSaves warning: ${e.message}")
            } finally {
                dsiNandManager.closeNand()
            }
        }

        // 2. Modcrypt decryption for cached app
        try {
            if (cacheRomFile.exists() && cacheRomFile.length() > 0L) {
                me.magnum.melonds.MelonRomDecryptor.decryptRom(cacheRomFile.absolutePath)
            }
        } catch (e: Throwable) {
            Log.w(TAG, "cacheRomFile decrypt warning: ${e.message}")
        }

        // Primary: Direct DSi NAND autoload via TLNC warmboot (Full DSi mode, memory maps, and NAND access)
        Log.i(TAG, "DSiWareShortcut: booting title $titleIdHex via DSi firmware TLNC warmboot")
        val firmwareConfiguration = getRomEmulatorConfiguration(rom)
            .copy(
                consoleType = ConsoleType.DSi,
                useCustomBios = true,
                showBootScreen = true,
                dsiWareAutoloadTitleId = titleId,
            )
            .withPreparedDldiConfiguration()
            ?: run {
                writeDsiExecutionLog(rom, titleIdHex, false, "Failed to prepare firmware autoload configuration")
                return@withContext RomLaunchResult.LaunchFailed(MelonEmulator.LoadResult.NDS_FAILED)
            }

        setupEmulator(firmwareConfiguration)
        val firmwareLoadResult = MelonEmulator.bootFirmware()
        if (firmwareLoadResult == MelonEmulator.FirmwareLoadResult.SUCCESS && isActive) {
            messageQueue.start()
            if (!precompileVulkanPipelines(firmwareConfiguration)) {
                cameraManager.stopCurrentCameraSource()
                MelonEmulator.stopEmulation()
                messageQueue.stop()
                dldiFolderSyncManager.syncBackIfNeeded()
                writeDsiExecutionLog(rom, titleIdHex, false, "Firmware Vulkan pipeline precompilation failed")
                return@withContext RomLaunchResult.LaunchFailed(MelonEmulator.LoadResult.NDS_FAILED)
            }
            MelonEmulator.setupCheats(cheats.toTypedArray())
            MelonEmulator.startEmulation(startPaused = true)
            writeDsiExecutionLog(rom, titleIdHex, true, "DSi firmware TLNC warmboot successful with repaired FAT12 saves for title $titleIdHex")
            return@withContext RomLaunchResult.LaunchSuccessful(true)
        }

        // Fallback: Direct loadRom boot
        Log.w(TAG, "DSiWareShortcut: firmware boot failed ($firmwareLoadResult), attempting fallback direct loadRom for $titleIdHex")
        val targetRomFile = if (cacheRomFile.exists() && cacheRomFile.length() > 0L) cacheRomFile else null
        val romUri = if (targetRomFile != null) Uri.fromFile(targetRomFile) else rom.uri
        val sram = try {
            sramProvider.getSramForRom(rom)
        } catch (exception: SramLoadException) {
            writeDsiExecutionLog(rom, titleIdHex, false, "SRAM Load Exception: ${exception.message}")
            return@withContext RomLaunchResult.LaunchFailedSramProblem(exception)
        }

        val directConfiguration = getRomEmulatorConfiguration(rom)
            .copy(
                consoleType = ConsoleType.DSi,
                useCustomBios = true,
                showBootScreen = false,
                dsiWareAutoloadTitleId = 0L,
            )
            .withPreparedDldiConfiguration()
            ?: run {
                writeDsiExecutionLog(rom, titleIdHex, false, "Failed to prepare DLDI configuration")
                return@withContext RomLaunchResult.LaunchFailed(MelonEmulator.LoadResult.NDS_FAILED)
            }

        setupEmulator(directConfiguration)
        val loadResult = MelonEmulator.loadRom(
            romUri = romUri,
            sramUri = sram,
            gbaSlotType = MelonEmulator.GbaSlotType.NONE,
            gbaRomUri = null,
            gbaSramUri = null
        )

        if (!loadResult.isTerminal && isActive) {
            messageQueue.start()
            if (!precompileVulkanPipelines(directConfiguration)) {
                cameraManager.stopCurrentCameraSource()
                MelonEmulator.stopEmulation()
                messageQueue.stop()
                dldiFolderSyncManager.syncBackIfNeeded()
                writeDsiExecutionLog(rom, titleIdHex, false, "Direct loadRom Vulkan pipeline precompilation failed")
                return@withContext RomLaunchResult.LaunchFailed(MelonEmulator.LoadResult.NDS_FAILED)
            }
            MelonEmulator.setupCheats(cheats.toTypedArray())
            MelonEmulator.startEmulation(startPaused = true)
            writeDsiExecutionLog(rom, titleIdHex, true, "Fallback direct loadRom boot successful for title $titleIdHex")
            return@withContext RomLaunchResult.LaunchSuccessful(true)
        }

        cameraManager.stopCurrentCameraSource()
        MelonEmulator.stopEmulation()
        dldiFolderSyncManager.syncBackIfNeeded()
        writeDsiExecutionLog(rom, titleIdHex, false, "Both firmware warmboot and direct loadRom failed: firmwareLoadResult=$firmwareLoadResult, loadResult=$loadResult")
        return@withContext RomLaunchResult.LaunchFailed(MelonEmulator.LoadResult.NDS_FAILED)
    }

    private fun writeDsiExecutionLog(rom: Rom, titleIdHex: String, success: Boolean, details: String) {
        try {
            val downloadDir = android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOWNLOADS)
            val logsDir = File(downloadDir, "STORM DS LOGS").apply { mkdirs() }
            val safeName = rom.name.replace(Regex("[^a-zA-Z0-9_-]"), "_")
            val logFile = File(logsDir, "STORM_DS_${safeName}_${titleIdHex}.log")
            val timestamp = java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.US).format(java.util.Date())
            val logText = buildString {
                appendLine("==================================================")
                appendLine("STORM DS v2.3.0 - DSi Execution Diagnostic Log")
                appendLine("Timestamp: $timestamp")
                appendLine("Game Name: ${rom.name}")
                appendLine("Game Code / Title ID: $titleIdHex")
                appendLine("ROM URI: ${rom.uri}")
                appendLine("Is DSiWare Shortcut: ${rom.isInstalledDsiWareShortcut}")
                appendLine("Execution Status: ${if (success) "SUCCESS" else "FAILED"}")
                appendLine("Details: $details")
                appendLine("==================================================")
            }
            logFile.writeText(logText, Charsets.UTF_8)
            Log.i(TAG, "Wrote DSi diagnostic log to: ${logFile.absolutePath}")
        } catch (e: Throwable) {
            Log.e(TAG, "Failed to write diagnostic log for ${rom.name}", e)
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
        syncInstalledDsiWareShortcutSaveBackIfNeeded()
        dldiFolderSyncManager.syncBackIfNeeded()
        cameraManager.stopCurrentCameraSource()
        messageQueue.stop()
    }

    private fun syncInstalledDsiWareShortcutSaveBackIfNeeded() {
        val session = activeInstalledDsiWareShortcutSession ?: return
        activeInstalledDsiWareShortcutSession = null

        val saveFile = session.publicSaveFile ?: return
        if (!saveFile.exists()) {
            Log.w(TAG, "DSiWareShortcut: public save missing during sync title=${session.titleIdHex}")
            return
        }

        runBlocking(Dispatchers.IO) {
            val openNandResult = dsiNandManager.openNand()
            if (openNandResult.isFailure()) {
                Log.w(TAG, "DSiWareShortcut: failed to reopen NAND for save sync title=${session.titleIdHex} result=$openNandResult")
                return@runBlocking
            }

            try {
                val imported = dsiNandManager.importTitleFileFromPath(
                    titleId = session.titleId,
                    fileType = DSiWareTitleFileType.PUBLIC_SAV,
                    filePath = saveFile.absolutePath,
                )
                Log.i(TAG, "DSiWareShortcut: synced public save title=${session.titleIdHex} imported=$imported bytes=${saveFile.length()}")
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
        val isDsi = rom.isInstalledDsiWareShortcut || rom.isDsiWareTitle
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
