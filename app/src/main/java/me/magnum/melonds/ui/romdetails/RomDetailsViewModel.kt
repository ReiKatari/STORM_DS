package me.magnum.melonds.ui.romdetails

import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.preference.PreferenceManager
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.common.Permission
import me.magnum.melonds.common.UriPermissionManager
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.domain.model.rom.config.RomConfig
import me.magnum.melonds.domain.model.rom.config.RomInputMode
import me.magnum.melonds.domain.model.rom.config.RomGbaSlotConfig
import me.magnum.melonds.domain.repositories.RetroAchievementsRepository
import me.magnum.melonds.domain.repositories.RomsRepository
import me.magnum.melonds.domain.repositories.SettingsRepository
import me.magnum.melonds.impl.RomIconProvider
import me.magnum.melonds.parcelables.RomParcelable
import me.magnum.melonds.ui.romdetails.model.RomConfigUiState
import me.magnum.melonds.ui.romdetails.model.RomConfigUpdateEvent
import me.magnum.melonds.ui.romdetails.model.RomGbaSlotConfigUiModel
import me.magnum.melonds.ui.romlist.RomIcon
import javax.inject.Inject

@HiltViewModel
class RomDetailsViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val romDetailsUiMapper: RomDetailsUiMapper,
    private val romsRepository: RomsRepository,
    private val settingsRepository: SettingsRepository,
    private val retroAchievementsRepository: RetroAchievementsRepository,
    private val romIconProvider: RomIconProvider,
    private val uriPermissionManager: UriPermissionManager,
    savedStateHandle: SavedStateHandle,
) : ViewModel() {

    private data class GlobalVideoConfig(
        val renderer: me.magnum.melonds.domain.model.VideoRenderer,
        val threadedRendering: Boolean,
        val internalResolutionScaling: Int,
        val filtering: me.magnum.melonds.domain.model.VideoFiltering,
        val retroArchShaderPresetPath: String?,
        val retroArchShaderParameters: String?,
        val hasValidRetroArchShaderRoot: Boolean,
    )

    private val _rom = MutableStateFlow(savedStateHandle.get<RomParcelable>(RomDetailsActivity.KEY_ROM)!!.rom)
    val rom = _rom.asStateFlow()

    private val _romConfig = MutableStateFlow(_rom.value.config)

    val raCoverUrl: StateFlow<String?> = combine(
        _rom,
        retroAchievementsRepository.observeRomCoverIcons(),
        settingsRepository.observeRaCoverEnabled(),
    ) { rom, covers, enabled ->
        if (!enabled) {
            null
        } else {
            covers[rom.retroAchievementsHash]
                ?.takeIf { it.hasAchievements != false }
                ?.url
        }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), null)

    init {
        refreshRom()
    }

    val romConfigUiState by lazy {
        val uiStateFlow = MutableStateFlow<RomConfigUiState>(RomConfigUiState.Loading)
        viewModelScope.launch {
            val globalCoreVideoConfig = combine(
                settingsRepository.getVideoRenderer(),
                settingsRepository.isThreadedRenderingEnabled(),
                settingsRepository.getVideoInternalResolutionScaling(),
                settingsRepository.getVideoFiltering(),
            ) { renderer, threadedRendering, internalResolutionScaling, filtering ->
                GlobalVideoConfig(
                    renderer = renderer,
                    threadedRendering = threadedRendering,
                    internalResolutionScaling = internalResolutionScaling,
                    filtering = filtering,
                    retroArchShaderPresetPath = null,
                    retroArchShaderParameters = null,
                    hasValidRetroArchShaderRoot = false,
                )
            }
            val globalShaderConfig = combine(
                settingsRepository.observeRetroArchShaderPresetPath(),
                settingsRepository.observeRetroArchShaderParametersText(),
                settingsRepository.observeRetroArchShaderRootValid(),
            ) { presetPath, parameters, hasValidRoot ->
                Triple(presetPath, parameters, hasValidRoot)
            }
            val globalRuntimeConfig = combine(
                settingsRepository.observeDefaultConsoleType(),
                settingsRepository.observeMicSource(),
                observeGlobalRuntimeOverrides(),
            ) { consoleType, micSource, overrides ->
                Triple(consoleType, micSource, overrides)
            }
            combine(
                _romConfig,
                globalRuntimeConfig,
                globalCoreVideoConfig,
                globalShaderConfig,
                settingsRepository.observeRetroAchievementsEnabled(),
            ) { romConfig, globalRuntimeWithOverrides, globalVideoConfig, shaderConfig, globalRetroAchievementsEnabled ->
                val (globalConsoleType, globalMicSource, overrides) = globalRuntimeWithOverrides
                romDetailsUiMapper.mapRomConfigToUi(
                    romConfig = romConfig,
                    globalRuntimeConsoleType = globalConsoleType,
                    globalRuntimeMicSource = globalMicSource,
                    globalVideoRenderer = globalVideoConfig.renderer,
                    globalThreadedRendering = globalVideoConfig.threadedRendering,
                    globalInternalResolutionScaling = globalVideoConfig.internalResolutionScaling,
                    globalVideoFiltering = globalVideoConfig.filtering,
                    globalRetroArchShaderPresetPath = shaderConfig.first,
                    globalRetroArchShaderParameters = shaderConfig.second,
                    hasValidRetroArchShaderRoot = shaderConfig.third,
                    globalRetroAchievementsEnabled = globalRetroAchievementsEnabled,
                    globalArm9Overclock = overrides.arm9Overclock,
                    globalFastForwardSpeedMultiplier = overrides.fastForwardSpeedMultiplier,
                    globalVulkanDriverDisplayName = overrides.activeVulkanDriverLabel,
                    availableVulkanDrivers = overrides.availableVulkanDrivers,
                    isCustomVulkanDriverSupported = overrides.isCustomVulkanSupported,
                    isLiteModeActive = overrides.isLiteModeActive,
                    globalDualScreenPreset = overrides.dualScreenPreset,
                    globalDualScreenKeepAspectRatio = overrides.dualScreenKeepAspectRatio,
                    globalDualScreenIntegerScale = overrides.dualScreenIntegerScale,
                    globalTranslatorSourceLang = overrides.translatorSourceLang,
                )
            }.collect {
                uiStateFlow.value = RomConfigUiState.Ready(it)
            }
        }

        uiStateFlow.asStateFlow()
    }

    fun onRomConfigUpdateEvent(event: RomConfigUpdateEvent) {
        val currentRomConfig = _romConfig.value
        val newRomConfig = when(event) {
            is RomConfigUpdateEvent.RuntimeConsoleUpdate -> currentRomConfig.copy(runtimeConsoleType = event.newRuntimeConsole)
            is RomConfigUpdateEvent.RuntimeMicSourceUpdate -> currentRomConfig.copy(runtimeMicSource = event.newRuntimeMicSource)
            is RomConfigUpdateEvent.UseHgEngineFixUpdate -> currentRomConfig.copy(useHgEngineFix = event.enabled)
            is RomConfigUpdateEvent.InputModeUpdate -> currentRomConfig.copy(
                inputMode = event.inputMode,
                customControllerConfiguration = when {
                    event.inputMode != RomInputMode.CUSTOM -> currentRomConfig.customControllerConfiguration
                    currentRomConfig.customControllerConfiguration != null -> currentRomConfig.customControllerConfiguration
                    else -> settingsRepository.getControllerConfiguration().copy()
                },
            )
            is RomConfigUpdateEvent.LayoutUpdate -> currentRomConfig.copy(layoutId = event.newLayoutId)
            is RomConfigUpdateEvent.GbaSlotTypeUpdated -> currentRomConfig.let {
                val newGbaSlotConfig = when (event.type) {
                    RomGbaSlotConfigUiModel.Type.None -> RomGbaSlotConfig.None
                    RomGbaSlotConfigUiModel.Type.GbaRom -> RomGbaSlotConfig.GbaRom(null, null)
                    RomGbaSlotConfigUiModel.Type.RumblePak -> RomGbaSlotConfig.RumblePak
                    RomGbaSlotConfigUiModel.Type.MemoryExpansion -> RomGbaSlotConfig.MemoryExpansion
                    RomGbaSlotConfigUiModel.Type.AnalogInput -> RomGbaSlotConfig.AnalogInput
                    RomGbaSlotConfigUiModel.Type.MotionPakHomebrew -> RomGbaSlotConfig.MotionPakHomebrew
                    RomGbaSlotConfigUiModel.Type.MotionPakRetail -> RomGbaSlotConfig.MotionPakRetail
                }
                it.copy(gbaSlotConfig = newGbaSlotConfig)
            }
            is RomConfigUpdateEvent.GbaRomPathUpdate -> currentRomConfig.let {
                (currentRomConfig.gbaSlotConfig as? RomGbaSlotConfig.GbaRom)?.let { gbaConfig ->
                    it.copy(gbaSlotConfig = gbaConfig.copy(romPath = event.gbaRomPath))
                }
            }
            is RomConfigUpdateEvent.GbaSavePathUpdate -> currentRomConfig.let {
                (currentRomConfig.gbaSlotConfig as? RomGbaSlotConfig.GbaRom)?.let { gbaConfig ->
                    it.copy(gbaSlotConfig = gbaConfig.copy(savePath = event.gbaSavePath))
                }
            }
            is RomConfigUpdateEvent.CustomNameUpdate -> currentRomConfig.copy(customName = event.customName)
            is RomConfigUpdateEvent.VideoRendererUpdate -> {
                val targetRenderer = event.videoRenderer
                val targetFiltering = currentRomConfig.videoFiltering
                currentRomConfig.copy(
                    videoRenderer = targetRenderer,
                    videoFiltering = targetFiltering?.takeIf { filtering ->
                        targetRenderer == null || filtering.isSupportedByRenderer(targetRenderer)
                    },
                )
            }
            is RomConfigUpdateEvent.ThreadedRenderingUpdate -> currentRomConfig.copy(threadedRendering = event.threadedRendering)
            is RomConfigUpdateEvent.InternalResolutionScalingUpdate -> currentRomConfig.copy(internalResolutionScaling = event.internalResolutionScaling)
            is RomConfigUpdateEvent.VideoFilteringUpdate -> currentRomConfig.copy(videoFiltering = event.videoFiltering)
            is RomConfigUpdateEvent.RetroArchShaderPresetPathUpdate -> currentRomConfig.copy(retroArchShaderPresetPath = event.presetPath)
            is RomConfigUpdateEvent.RetroArchShaderParametersUpdate -> currentRomConfig.copy(retroArchShaderParameters = event.parameters)
            is RomConfigUpdateEvent.RetroAchievementsEnabledUpdate -> currentRomConfig.copy(retroAchievementsEnabled = event.enabled)
            is RomConfigUpdateEvent.DualScreenPresetUpdate -> currentRomConfig.copy(dualScreenPreset = event.preset)
            is RomConfigUpdateEvent.DualScreenKeepAspectRatioUpdate -> currentRomConfig.copy(dualScreenKeepAspectRatio = event.enabled)
            is RomConfigUpdateEvent.DualScreenIntegerScaleUpdate -> currentRomConfig.copy(dualScreenIntegerScale = event.enabled)
            is RomConfigUpdateEvent.TranslatorSourceLangUpdate -> currentRomConfig.copy(translatorSourceLang = event.sourceLang)
            is RomConfigUpdateEvent.Arm9OverclockUpdate -> currentRomConfig.copy(arm9Overclock = event.arm9Overclock)
            is RomConfigUpdateEvent.FastForwardSpeedMultiplierUpdate -> currentRomConfig.copy(fastForwardSpeedMultiplier = event.speedMultiplier)
            is RomConfigUpdateEvent.CustomVulkanDriverUpdate -> currentRomConfig.copy(customVulkanDriverName = event.customVulkanDriverName)
            is RomConfigUpdateEvent.ResetToDefaults -> {
                val base = if (_rom.value.isDsiWareTitle) RomConfig.forDsiWareTitle() else RomConfig.default()
                if (event.preserveCustomName) {
                    base.copy(customName = currentRomConfig.customName)
                } else {
                    base
                }
            }
        }

        newRomConfig?.let { newConfig ->
            _romConfig.value = newConfig
            _rom.update { it.copy(config = newConfig) }
            saveRomConfig(newConfig)
        }
    }

    fun refreshRom() {
        viewModelScope.launch {
            val refreshedRom = withContext(Dispatchers.IO) {
                romsRepository.getRomAtUri(_rom.value.uri)
            } ?: return@launch
            val currentConfig = _romConfig.value
            val refreshedConfig = if (isDefaultConfig(refreshedRom) && !isDefaultConfig(_rom.value.copy(config = currentConfig))) {
                currentConfig
            } else {
                refreshedRom.config
            }
            _rom.value = refreshedRom.copy(config = refreshedConfig)
            _romConfig.value = refreshedConfig
        }
    }

    suspend fun getRomIcon(rom: Rom): RomIcon {
        val romIconBitmap = romIconProvider.getRomIcon(rom)
        val iconFiltering = settingsRepository.getRomIconFiltering()
        return RomIcon(romIconBitmap, iconFiltering)
    }

    private fun saveRomConfig(newConfig: RomConfig) {
        val currentRom = _rom.value
        viewModelScope.launch(Dispatchers.IO) {
            if (newConfig.gbaSlotConfig is RomGbaSlotConfig.GbaRom) {
                newConfig.gbaSlotConfig.romPath?.let { uriPermissionManager.persistFilePermissions(it, Permission.READ) }
                newConfig.gbaSlotConfig.savePath?.let { uriPermissionManager.persistFilePermissions(it, Permission.READ_WRITE) }
            }
            romsRepository.updateRomConfig(currentRom, newConfig)
        }
    }

    private data class GlobalRuntimeOverrides(
        val arm9Overclock: Int,
        val fastForwardSpeedMultiplier: Float,
        val activeVulkanDriverLabel: String,
        val availableVulkanDrivers: List<Pair<String?, String>>,
        val isCustomVulkanSupported: Boolean,
        val isLiteModeActive: Boolean,
        val dualScreenPreset: me.magnum.melonds.domain.model.DualScreenPreset,
        val dualScreenKeepAspectRatio: Boolean,
        val dualScreenIntegerScale: Boolean,
        val translatorSourceLang: String?,
    )

    private fun readGlobalRuntimeOverrides(): GlobalRuntimeOverrides {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        val customVulkanSupported = me.magnum.melonds.impl.AdrenoVulkanDriverSupport.isSupported(context)
        val systemLabel = context.getString(me.magnum.melonds.R.string.rom_config_vulkan_driver_system)
        val globalLabel = context.getString(me.magnum.melonds.R.string.rom_config_vulkan_driver_global)
        val activeDriverLabel = if (customVulkanSupported &&
            settingsRepository.getVulkanDriverMode() == me.magnum.melonds.domain.model.VulkanDriverMode.CUSTOM
        ) {
            settingsRepository.getCustomVulkanDriverDisplayName() ?: systemLabel
        } else {
            systemLabel
        }
        val driverOptions = if (customVulkanSupported) {
            listOf(Pair(null, globalLabel), Pair("__SYSTEM__", systemLabel)) +
                settingsRepository.getInstalledVulkanDrivers().map { Pair(it.id, it.displayName) }
        } else {
            listOf(Pair(null, systemLabel))
        }
        return GlobalRuntimeOverrides(
            arm9Overclock = settingsRepository.getArm9Overclock(),
            fastForwardSpeedMultiplier = settingsRepository.getFastForwardSpeedMultiplier(),
            activeVulkanDriverLabel = activeDriverLabel,
            availableVulkanDrivers = driverOptions,
            isCustomVulkanSupported = customVulkanSupported,
            isLiteModeActive = settingsRepository.isLiteModeActive(),
            dualScreenPreset = settingsRepository.getDualScreenPreset(),
            dualScreenKeepAspectRatio = settingsRepository.isExternalDisplayKeepAspectRationEnabled(),
            dualScreenIntegerScale = settingsRepository.isDualScreenIntegerScaleEnabled(),
            translatorSourceLang = prefs.getString("translator_source_lang", "auto") ?: "auto",
        )
    }

    private fun observeGlobalRuntimeOverrides(): Flow<GlobalRuntimeOverrides> = callbackFlow {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        val watchedKeys = setOf(
            "performance_mode",
            "arm9_overclock",
            "fast_forward_speed_multiplier",
            "video_vulkan_driver_mode",
            "video_vulkan_selected_driver_id",
            "video_vulkan_custom_drivers",
            "video_vulkan_custom_driver_name",
            "video_vulkan_custom_driver_dir",
            "video_vulkan_custom_driver_display_name",
            "dual_screen_preset",
            "dual_screen_integer_scale",
            "external_display_keep_ratio",
            "translator_source_lang",
        )
        trySend(readGlobalRuntimeOverrides())
        val listener = SharedPreferences.OnSharedPreferenceChangeListener { _, key ->
            if (key == null || key in watchedKeys) {
                trySend(readGlobalRuntimeOverrides())
            }
        }
        prefs.registerOnSharedPreferenceChangeListener(listener)
        awaitClose {
            prefs.unregisterOnSharedPreferenceChangeListener(listener)
        }
    }

    private fun isDefaultConfig(rom: Rom): Boolean {
        val defaultConfig = if (rom.isDsiWareTitle) {
            RomConfig.forDsiWareTitle()
        } else {
            RomConfig.default()
        }
        return rom.config == defaultConfig
    }
}
