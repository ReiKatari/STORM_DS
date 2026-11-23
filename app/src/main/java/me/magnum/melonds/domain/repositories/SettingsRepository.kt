package me.magnum.melonds.domain.repositories

import android.net.Uri
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import me.magnum.melonds.domain.model.*
import me.magnum.melonds.domain.model.camera.DSiCameraSourceType
import me.magnum.melonds.domain.model.input.SoftInputBehaviour
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.domain.model.rom.config.RomConfig
import me.magnum.melonds.domain.model.retroachievements.RetroAchievementsOfflineBackend
import me.magnum.melonds.ui.Theme
import java.util.UUID

interface SettingsRepository {
    suspend fun getEmulatorConfiguration(dsiProfile: DSiProfile? = getDsiProfile()): EmulatorConfiguration
    suspend fun getEmulatorConfiguration(romConfig: RomConfig, dsiProfile: DSiProfile? = getDsiProfile()): EmulatorConfiguration
    fun getDsiProfileSettings(): DSiProfileSettings
    fun observeDsiProfileSettings(): Flow<DSiProfileSettings>
    fun getDsiProfile(profileId: String? = null): DSiProfile? = getDsiProfileSettings().resolve(profileId)
    fun saveDsiProfile(profile: DSiProfile)
    fun removeDsiProfile(profileId: String)
    fun setDefaultDsiProfile(profileId: String?)

    fun getTheme(): Theme
    fun getFastForwardSpeedMultiplier(): Float
    fun getFrameLimitSpeedMultiplier(): Float
    fun isMuteOnFastForwardEnabled(): Boolean
    fun isDrsEnabled(): Boolean
    fun getFrameskipConfiguration(): FrameskipConfiguration
    fun observeFrameskipConfiguration(): Flow<FrameskipConfiguration>
    fun isVulkanDrsEnabled(): Boolean
    fun observeVulkanDrsEnabled(): Flow<Boolean>
    fun isVulkanDrsActive(): Boolean
    fun isRewindEnabled(): Boolean
    fun isSustainedPerformanceModeEnabled(): Boolean
    fun isAppLogFileEnabled(): Boolean
    fun observeAppLogFileEnabled(): Flow<Boolean>
    fun isTouchScreenSystemGestureExclusionEnabled(): Boolean
    fun observeTouchScreenSystemGestureExclusionEnabled(): Flow<Boolean>
    fun shouldIgnoreDisplayCutoutInLayouts(): Boolean

    fun getRomSearchDirectories(): Array<Uri>
    fun clearRomSearchDirectories()
    fun getRomIconFiltering(): RomIconFiltering
    fun getRomCacheMaxSize(): SizeUnit

    fun getRomViewMode(): RomViewMode
    fun setRomViewMode(viewMode: RomViewMode)
    fun observeRomViewMode(): Flow<RomViewMode>

    fun isRaCoverEnabled(): Boolean
    fun observeRaCoverEnabled(): Flow<Boolean>


    fun getDefaultConsoleType(): ConsoleType
    fun observeDefaultConsoleType(): Flow<ConsoleType>
    fun getFirmwareConfiguration(): FirmwareConfiguration
    fun useCustomBios(): Boolean
    fun getDsBiosDirectory(): Uri?
    fun getDsiBiosDirectory(): Uri?
    fun clearBiosDirectories()
    fun isDldiSdCardEnabled(): Boolean
    fun getDldiSdCardDirectory(): Uri?
    fun getDldiSdCardImageSize(): Int
    fun isDsiSdCardEnabled(): Boolean
    fun getDsiSdCardDirectory(): Uri?
    fun getDsiSdCardImageSize(): Int
    fun showBootScreen(): Boolean
    fun isJitEnabled(): Boolean
    fun isStormCompilerEnabled(): Boolean
    fun getDsiWareBootMode(): me.magnum.melonds.domain.model.dsinand.DSiWareBootMode
    fun setDsiWareBootMode(mode: me.magnum.melonds.domain.model.dsinand.DSiWareBootMode)

    fun getCurrentVideoRenderer(): VideoRenderer
    fun getEffectiveVideoRenderer(romConfig: RomConfig): VideoRenderer
    fun setCurrentVideoRenderer(renderer: VideoRenderer)
    fun getVideoRenderer(): Flow<VideoRenderer>
    fun getVulkanDriverConfiguration(nativeLibraryDir: String): VulkanDriverConfiguration
    fun getVulkanDriverMode(): VulkanDriverMode
    fun setVulkanDriverMode(mode: VulkanDriverMode)
    fun getInstalledVulkanDrivers(): List<VulkanDriverInfo>
    fun getSelectedVulkanDriverId(): String?
    fun setSelectedVulkanDriver(id: String)
    fun getCustomVulkanDriverDisplayName(): String?
    fun setCustomVulkanDriver(
        id: String,
        driverDir: String,
        driverName: String,
        displayName: String,
        author: String? = null,
        vendor: String? = null,
        driverVersion: String? = null,
        description: String? = null,
        minApi: Int? = null,
        sourceRepo: String? = null,
        assetFileName: String? = null,
        installedAtEpochMs: Long = System.currentTimeMillis(),
    )
    fun removeCustomVulkanDriver(id: String)
    fun clearCustomVulkanDrivers()
    fun getVideoInternalResolutionScaling(): Flow<Int>
    fun getCurrentVideoFiltering(): VideoFiltering
    fun getEffectiveVideoFiltering(romConfig: RomConfig): VideoFiltering
    fun getVideoFiltering(): Flow<VideoFiltering>
    fun isThreadedRenderingEnabled(): Flow<Boolean>
    fun isVulkanFastPathEnabled(): Flow<Boolean>
    fun isRendererDebugToolsEnabled(): Flow<Boolean>
    fun isRendererDebugBgObjEnabled(): Flow<Boolean>
    fun isRendererDebugLatchTraceEnabled(): Flow<Boolean>
    fun getFpsCounterPosition(): FpsCounterPosition
    fun getRenderedIrPosition(): FpsCounterPosition
    fun observeRetroArchShaderRootValid(): Flow<Boolean>
    fun observeRetroArchShaderPresetPath(): Flow<String?>
    fun observeRetroArchShaderParametersText(): Flow<String?>
    fun getExternalDisplayMode(): ExternalDisplayMode
    fun observeExternalDisplayMode(): Flow<ExternalDisplayMode>

    fun isExternalDisplayKeepAspectRationEnabled(): Boolean
    fun observeExternalDisplayKeepAspectRationEnabled(): Flow<Boolean>

    fun getDualScreenPreset(): DualScreenPreset
    fun observeDualScreenPreset(): Flow<DualScreenPreset>
    fun isDualScreenIntegerScaleEnabled(): Boolean
    fun observeDualScreenIntegerScaleEnabled(): Flow<Boolean>
    fun isDualScreenInternalFillHeightEnabled(): Boolean
    fun observeDualScreenInternalFillHeightEnabled(): Flow<Boolean>
    fun isDualScreenInternalFillWidthEnabled(): Boolean
    fun observeDualScreenInternalFillWidthEnabled(): Flow<Boolean>
    fun isDualScreenExternalFillHeightEnabled(): Boolean
    fun observeDualScreenExternalFillHeightEnabled(): Flow<Boolean>
    fun isDualScreenExternalFillWidthEnabled(): Boolean
    fun observeDualScreenExternalFillWidthEnabled(): Flow<Boolean>
    fun getDualScreenInternalVerticalAlignmentOverride(): ScreenAlignment?
    fun observeDualScreenInternalVerticalAlignmentOverride(): Flow<ScreenAlignment?>
    fun getDualScreenExternalVerticalAlignmentOverride(): ScreenAlignment?
    fun observeDualScreenExternalVerticalAlignmentOverride(): Flow<ScreenAlignment?>
    fun getDSiCameraSource(): DSiCameraSourceType
    fun getDSiCameraStaticImage(): Uri?

    fun isSoundEnabled(): Boolean
    fun getAudioLatency(): AudioLatency
    fun getMicSource(): MicSource
    fun observeMicSource(): Flow<MicSource>
    fun getMicGain(): Int

    fun getRomSortingMode(): SortingMode
    fun getRomSortingOrder(): SortingOrder
    fun saveNextToRomFile(): Boolean
    fun useSrmExtensionForSaveFiles(): Boolean
    fun isAutoSaveStateOnExitEnabled(): Boolean
    fun isAutoLoadStateOnLaunchEnabled(): Boolean
    fun getPeriodicAutoSaveIntervalMinutes(): Int
    fun getActiveQuickSlot(): Int
    fun setActiveQuickSlot(slot: Int)
    fun setRetroAchievementsHardcoreEnabled(enabled: Boolean)
    fun getSaveFileDirectory(): Uri?
    fun getSaveFileDirectory(rom: Rom): Uri
    fun getSaveStateLocation(rom: Rom): SaveStateLocation
    fun getSaveStateCustomDirectory(): Uri?
    fun getSaveStateDirectory(rom: Rom): Uri?

    fun getControllerConfiguration(): ControllerConfiguration
    fun observeControllerConfiguration(): StateFlow<ControllerConfiguration>
    fun getLayoutCycleIds(): Set<UUID>?
    fun getSelectedLayoutId(): UUID
    fun getSoftInputBehaviour(): Flow<SoftInputBehaviour>
    fun isTouchHapticFeedbackEnabled(): Flow<Boolean>
    fun getTouchHapticFeedbackStrength(): Int
    fun getSoftInputOpacity(): Flow<Int>

    fun isRetroAchievementsRichPresenceEnabled(): Boolean
    fun isRetroAchievementsEnabled(): Boolean
    fun observeRetroAchievementsEnabled(): Flow<Boolean>
    fun isRetroAchievementsHardcoreEnabled(): Boolean
    fun isRetroAchievementsOfflineSoftcoreEnabled(): Boolean
    fun getRetroAchievementsOfflineBackend(): RetroAchievementsOfflineBackend
    fun observeRetroAchievementsOfflineBackend(): Flow<RetroAchievementsOfflineBackend>
    fun areRetroAchievementsUnofficialAchievementsEnabled(): Boolean
    fun isRetroAchievementsEncoreModeEnabled(): Boolean
    fun areRetroAchievementsActiveChallengeIndicatorsEnabled(): Boolean
    fun areRetroAchievementsProgressIndicatorsEnabled(): Boolean
    fun areRetroAchievementsLeaderboardIndicatorsEnabled(): Boolean
    fun getRetroAchievementsNotificationPosition(): String
    fun observeRetroAchievementsNotificationPosition(): Flow<String>
    fun getRetroAchievementsNotificationStyle(): String
    fun observeRetroAchievementsNotificationStyle(): Flow<String>
    fun getRetroAchievementsNotificationSound(): String
    fun observeRetroAchievementsNotificationSound(): Flow<String>

    fun areCheatsEnabled(): Boolean
    fun setCheatsEnabled(enabled: Boolean)

    fun observeTheme(): Flow<Theme>
    fun observeRomIconFiltering(): Flow<RomIconFiltering>
    fun observeRomSearchDirectories(): Flow<Array<Uri>>
    fun observeSelectedLayoutId(): Flow<UUID>
    fun observeDSiCameraSource(): Flow<DSiCameraSourceType>
    fun observeDSiCameraStaticImage(): Flow<Uri?>

    fun setDsBiosDirectory(directoryUri: Uri)
    fun setDsiBiosDirectory(directoryUri: Uri)
    fun setUseCustomBios(useCustomBios: Boolean)
    fun addRomSearchDirectory(directoryUri: Uri)
    fun setControllerConfiguration(controllerConfiguration: ControllerConfiguration)
    fun setRomSortingMode(sortingMode: SortingMode)
    fun setRomSortingOrder(sortingOrder: SortingOrder)
    fun setSelectedLayoutId(layoutId: UUID)

    fun setExternalDisplayKeepAspectRatioEnabled(enabled: Boolean)
    fun setDualScreenPreset(preset: DualScreenPreset)
    fun setDualScreenIntegerScaleEnabled(enabled: Boolean)
    fun setDualScreenInternalFillHeightEnabled(enabled: Boolean)
    fun setDualScreenInternalFillWidthEnabled(enabled: Boolean)
    fun setDualScreenExternalFillHeightEnabled(enabled: Boolean)
    fun setDualScreenExternalFillWidthEnabled(enabled: Boolean)
    fun setDualScreenInternalVerticalAlignmentOverride(alignment: ScreenAlignment?)
    fun setDualScreenExternalVerticalAlignmentOverride(alignment: ScreenAlignment?)

    fun observeRenderConfiguration(): Flow<RendererConfiguration>
    fun observeRenderConfiguration(romConfig: RomConfig): Flow<RendererConfiguration>

    fun getThemeAccentColor(): String
    fun getRomCardStyle(): String
    fun getArm9Overclock(): Int
    fun isGameTdbCoversEnabled(): Boolean
    fun isGameTdb2dCoversEnabled(): Boolean
    fun observeGameTdb2dCoversEnabled(): Flow<Boolean>
    fun isGameTdb3dCoversEnabled(): Boolean
    fun observeGameTdb3dCoversEnabled(): Flow<Boolean>
    fun is3dWidescreenEnabled(): Boolean
    fun is60FpsPatchEnabled(): Boolean
    fun isDualScreenCastEnabled(): Boolean
    fun setDualScreenCastEnabled(enabled: Boolean)
    fun isTurboMacrosEnabled(): Boolean
    fun isGyroMicEnabled(): Boolean
    fun getVulkanCompositorMode(): Int
    fun isVulkanThickHighResEdgesEnabled(): Boolean
    fun isVulkanCompatAutoselectEnabled(): Boolean

    /**
     * Registers the ROM that is currently being launched/running so that runtime controls
     * (per-game Vulkan compatibility profiles) are resolved for it. Pass nulls to clear.
     */
    fun setActiveRomContext(gameCode: String?, romName: String?, fileName: String?)
    fun getVulkan3dDepthMode(): Int
    fun setVulkan3dDepthMode(mode: Int)
    fun getVulkan3dDepthStrength(): Int
    fun setVulkan3dDepthStrength(strength: Int)
    fun isVulkanSsaoEnabled(): Boolean
    fun setVulkanSsaoEnabled(enabled: Boolean)
    fun getDisplayColorProfile(): Int
    fun setDisplayColorProfile(profile: Int)
    fun getDisplayLcdGridMode(): Int
    fun setDisplayLcdGridMode(mode: Int)
    fun getActiveAiUpscalePresetName(): String?
    fun getHingeGapPixels(): Int
    fun setHingeGapPixels(pixels: Int)
    fun isExtendedPauseMenuEnabled(): Boolean
    fun setExtendedPauseMenuEnabled(enabled: Boolean)
    fun getSlowMotionSpeed(): Float
    fun setSlowMotionSpeed(speed: Float)
    fun getPerformanceMode(): PerformanceMode = PerformanceMode.AUTO
    fun setPerformanceMode(mode: PerformanceMode) {}
    fun getDevicePerformanceProfile(): DevicePerformanceProfile? = null
    fun isLiteModeActive(): Boolean = false
    fun syncLiteModePreferencesIfNeeded(): Boolean = false
}
