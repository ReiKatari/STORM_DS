// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System.Text.Json.Serialization;
using StormDs.Core.Native;
using StormDs.Core.Paths;

namespace StormDs.Core.Configuration;

public enum RendererBackend
{
    Auto = 0,
    Vulkan = 1,
    OpenGl = 2,
    Software = 3
}

public enum VulkanCompatibilityTier
{
    Auto = 0,
    Vulkan14ZeroCopy = 1,
    Vulkan10_11LegacyCompat = 2
}

public enum VulkanCompositorMode
{
    Auto = 0,
    Precise = 1,
    Fast = 2,
    Compatibility = 3
}

public enum ScreenFilter
{
    Nearest = 0,
    Linear = 1,
    Bicubic = 2,
    SlangShader = 3
}

public enum AudioInterpolation
{
    None = 0,
    Linear = 1,
    Cosine = 2,
    Cubic = 3,
    Gaussian = 4
}

public enum AudioBitDepth
{
    Auto = 0,
    Bit10 = 1,
    Bit16 = 2
}

public enum MicMode
{
    RealMicrophone = 0,
    SimulatedBlow = 1,
    WhiteNoise = 2,
    GyroShake = 3
}

public enum ScreenLayoutMode
{
    VerticalClassic = 0,
    HorizontalSideBySide = 1,
    HybridLargeFocus = 2,
    TopScreenOnly = 3,
    BottomScreenOnly = 4,
    DualWindowDetached = 5
}

public enum ScreenScaleMode
{
    AspectFit = 0,
    IntegerPixelPerfect = 1,
    StretchFill = 2
}

public enum TouchOverlayPreset
{
    Aurora3DGlass = 0,
    CyberNeon = 1,
    MinimalOutline = 2
}

public enum ConsoleMode
{
    Auto = 0,
    Nds = 1,
    Dsi = 2
}

public enum Slot2AddonType
{
    None = 0,
    GbaCartridge = 1,
    MemoryExpansionPak = 2,
    RumblePak = 3,
    BoktaiSolarSensor = 4,
    GuitarHeroGrip = 5,
    MotionPack = 6,
    PersonalTrainerPedometer = 7
}

public enum WfcDnsPreset
{
    Wiimmfi = 0,
    AltWfc = 1,
    KaeruWfc = 2,
    CustomDns = 3
}

public enum AiTranslatorProvider
{
    LocalOnnx = 0,
    Ollama = 1,
    OpenAi = 2,
    DeepL = 3
}

/// <summary>
/// Root application configuration encapsulating 100% of STORM DS 7.7.4+ settings.
/// Fully NativeAOT serializable with zero reflection.
/// </summary>
public sealed class StormDsAppConfig
{
    // Video and Compat
    public RendererBackend RendererBackend { get; set; } = RendererBackend.Auto;
    public VulkanCompatibilityTier VulkanCompatibilityTier { get; set; } = VulkanCompatibilityTier.Auto;
    public VulkanCompositorMode VulkanCompositorMode { get; set; } = VulkanCompositorMode.Auto;
    public int InternalResolutionScale { get; set; } = 1;
    public bool DynamicResolutionScaling { get; set; }
    public bool Widescreen3D { get; set; }
    public bool Patch60Fps { get; set; }
    public bool SsaoEnabled { get; set; }
    public bool Depth3DStereo { get; set; }
    public bool ThickEdges { get; set; }
    public bool ConservativeCoverage { get; set; }
    public ScreenFilter ScreenFilter { get; set; } = ScreenFilter.Bicubic;
    public string ActiveSlangPreset { get; set; } = string.Empty;
    public string CustomTurnipDriverPath { get; set; } = string.Empty;

    // Audio and Mic
    public int AudioLatency { get; set; } = 30;
    public AudioInterpolation AudioInterpolation { get; set; } = AudioInterpolation.Gaussian;
    public AudioBitDepth BitDepth { get; set; } = AudioBitDepth.Auto;
    public bool DspBassBoost { get; set; }
    public bool DspSoftLimiter { get; set; } = true;
    public bool DspSpatialStereo { get; set; }
    public bool DspReverb { get; set; }
    public bool UiTactileAudioEnabled { get; set; } = true;
    public float UiTactileVolume { get; set; } = 0.8f;
    public MicMode MicMode { get; set; } = MicMode.SimulatedBlow;

    // Input, Gyro, Layouts, Scaling
    public ScreenLayoutMode ScreenLayoutMode { get; set; } = ScreenLayoutMode.VerticalClassic;
    public ScreenScaleMode ScreenScaleMode { get; set; } = ScreenScaleMode.AspectFit;
    public int ScreenGap { get; set; } = 8;
    public double HybridPrimaryRatio { get; set; } = 0.68;
    public double UiScaleFactor { get; set; } = 0.0;
    public bool ShowTouchOverlayOnDesktop { get; set; } = false;
    public double WindowWidth { get; set; } = 1280.0;
    public double WindowHeight { get; set; } = 820.0;
    public bool WindowMaximized { get; set; } = false;
    public TouchOverlayPreset TouchOverlayPreset { get; set; } = TouchOverlayPreset.Aurora3DGlass;
    public float TouchOverlayOpacity { get; set; } = 0.65f;
    public float TouchOverlayScale { get; set; } = 1.0f;
    public float HapticIntensity { get; set; } = 0.5f;
    public float GyroSensitivity { get; set; } = 1.0f;
    public float GyroDeadzone { get; set; } = 0.05f;
    public bool GyroInvertX { get; set; }
    public bool GyroInvertY { get; set; }
    public Dictionary<string, string> Hotkeys { get; set; } = GetDefaultHotkeys();

    // System and BIOS
    public ConsoleMode ConsoleMode { get; set; } = ConsoleMode.Auto;
    public bool DirectBoot { get; set; } = true;
    public bool UseExternalBios { get; set; }
    public string Bios7Path { get; set; } = string.Empty;
    public string Bios9Path { get; set; } = string.Empty;
    public string FirmwarePath { get; set; } = string.Empty;
    public string DsiBios7Path { get; set; } = string.Empty;
    public string DsiBios9Path { get; set; } = string.Empty;
    public string DsiFirmwarePath { get; set; } = string.Empty;
    public string DsiNandPath { get; set; } = string.Empty;
    public int Arm9Overclock { get; set; } = 1;
    public bool JitEnable { get; set; } = true;
    public bool RandomizeMacAddress { get; set; }

    // Slot-2 Peripherals
    public Slot2AddonType Slot2AddonType { get; set; } = Slot2AddonType.None;
    public string GbaRomPath { get; set; } = string.Empty;
    public string GbaSavePath { get; set; } = string.Empty;
    public int SolarLuxLevel { get; set; } = 5;

    // Cheats and RetroAchievements
    public bool CheatsEnabled { get; set; } = true;
    public string RetroAchievementsUsername { get; set; } = string.Empty;
    public string RetroAchievementsToken { get; set; } = string.Empty;
    public bool RetroAchievementsHardcoreMode { get; set; }
    public bool RetroAchievementsRichPresence { get; set; } = true;

    // Network and WFC
    public WfcDnsPreset WfcDnsPreset { get; set; } = WfcDnsPreset.Wiimmfi;
    public string WfcCustomDns { get; set; } = "95.217.77.151";
    public bool LanDiscoveryEnabled { get; set; } = true;
    public int LanPort { get; set; } = 52774;

    // AI Screen Translator
    public AiTranslatorProvider AiTranslatorProvider { get; set; } = AiTranslatorProvider.Ollama;
    public string AiTranslatorEndpoint { get; set; } = "http://localhost:11434/api/generate";
    public string AiTranslatorApiKey { get; set; } = string.Empty;
    public string AiTranslatorModel { get; set; } = "llama3";
    public string AiTranslatorTargetLanguage { get; set; } = "ru";
    public bool AiTranslatorAutoSpeakTts { get; set; }

    // UI, Updates and Localization
    public string Language { get; set; } = "ru";
    public string Theme { get; set; } = "STORM MIDNIGHT";
    public string AccentName { get; set; } = "DefaultThemeAccent";
    public string TypographyName { get; set; } = "Inter";
    public bool AutoCheckUpdates { get; set; } = true;
    public string SkippedUpdateVersion { get; set; } = string.Empty;
    public bool FirstRomAutoSelect { get; set; } = true;
    public bool MinimizeToTrayOnClose { get; set; } = false;
    public Dictionary<string, string> KeyMap { get; set; } = GetDefaultKeyMap();
    public List<string> RecentRoms { get; set; } = [];
    public List<string> FavoriteRoms { get; set; } = [];
    public List<string> RomDirectories { get; set; } = [];

    public static Dictionary<string, string> GetDefaultKeyMap()
    {
        return new Dictionary<string, string>(StringComparer.OrdinalIgnoreCase)
        {
            ["Up"] = "Up",
            ["Down"] = "Down",
            ["Left"] = "Left",
            ["Right"] = "Right",
            ["A"] = "X",
            ["B"] = "Z",
            ["X"] = "S",
            ["Y"] = "A",
            ["L"] = "Q",
            ["R"] = "W",
            ["Start"] = "Return",
            ["Select"] = "RightShift"
        };
    }

    public static Dictionary<string, string> GetDefaultHotkeys()
    {
        return new Dictionary<string, string>(StringComparer.OrdinalIgnoreCase)
        {
            ["FastForward"] = "Space",
            ["Rewind"] = "R",
            ["SwapScreens"] = "Tab",
            ["QuickSave"] = "F5",
            ["QuickLoad"] = "F8",
            ["ToggleLid"] = "L",
            ["MicBlow"] = "M",
            ["AiTranslate"] = "T",
            ["DetachSecondScreen"] = "D",
            ["Fullscreen"] = "F11",
            ["PauseResume"] = "P",
            ["Reset"] = "F9",
            ["TakeScreenshot"] = "F12",
            ["MuteVolume"] = "OemTilde",
            ["VolumeUp"] = "Add",
            ["VolumeDown"] = "Subtract",
            ["RotateScreens"] = "Home",
            ["ToggleFps"] = "F3",
            ["ToggleMenu"] = "Escape",
            ["SlotPrevious"] = "F6",
            ["SlotNext"] = "F7",
            ["SolarLuxInc"] = "PageUp",
            ["SolarLuxDec"] = "PageDown",
            ["ToggleHardcore"] = "H",
            ["ToggleCheat"] = "C"
        };
    }

    /// <summary>
    /// Converts managed configuration into native StormDsConfig struct, applying per-game profile and vulkan compat overrides.
    /// </summary>
    public StormDsConfig ToNativeConfig(PerRomProfile? profile = null, VulkanCompatProfileEntry? compatEntry = null)
    {
        var config = new StormDsConfig
        {
            RendererBackend = (int)(profile?.RendererBackend ?? RendererBackend),
            VulkanCompatibilityTier = (int)VulkanCompatibilityTier,
            VulkanCompositorMode = (int)(profile?.VulkanCompositorMode ?? ResolveCompositorMode(compatEntry)),
            InternalResolutionScale = Math.Clamp(profile?.InternalResolutionScale ?? InternalResolutionScale, 1, 8),
            DynamicResolutionScaling = (byte)(DynamicResolutionScaling ? 1 : 0),
            Widescreen3D = (byte)((profile?.Widescreen3D ?? Widescreen3D) ? 1 : 0),
            Patch60Fps = (byte)((profile?.Patch60Fps ?? Patch60Fps) ? 1 : 0),
            SsaoEnabled = (byte)(SsaoEnabled ? 1 : 0),
            Depth3DStereo = (byte)(Depth3DStereo ? 1 : 0),
            ThickEdges = (byte)((profile?.ThickEdges ?? compatEntry?.ThickEdges ?? ThickEdges) ? 1 : 0),
            ConservativeCoverage = (byte)(ConservativeCoverage ? 1 : 0),
            ScreenFilter = (int)ScreenFilter,
            AudioLatency = Math.Clamp(AudioLatency, 5, 200),
            AudioInterpolation = (int)(profile?.AudioInterpolation ?? AudioInterpolation),
            BitDepth = (int)BitDepth,
            DspBassBoost = (byte)(DspBassBoost ? 1 : 0),
            DspSoftLimiter = (byte)(DspSoftLimiter ? 1 : 0),
            DspSpatialStereo = (byte)(DspSpatialStereo ? 1 : 0),
            DspReverb = (byte)(DspReverb ? 1 : 0),
            UiTactileAudioEnabled = (byte)(UiTactileAudioEnabled ? 1 : 0),
            UiTactileVolume = Math.Clamp(UiTactileVolume, 0f, 1f),
            MicMode = (int)MicMode,
            ConsoleMode = (int)ConsoleMode,
            DirectBoot = (byte)(DirectBoot ? 1 : 0),
            UseExternalBios = (byte)(UseExternalBios ? 1 : 0),
            Arm9Overclock = Math.Clamp(profile?.Arm9Overclock ?? Arm9Overclock, 1, 4),
            RandomizeMacAddress = (byte)(RandomizeMacAddress ? 1 : 0),
            Slot2AddonType = (int)(profile?.Slot2AddonType ?? Slot2AddonType),
            SolarLuxLevel = Math.Clamp(profile?.SolarLuxLevel ?? SolarLuxLevel, 0, 10),
            ScreenLayoutMode = (int)(profile?.ScreenLayoutMode ?? ScreenLayoutMode),
            JitEnable = (byte)(JitEnable ? 1 : 0)
        };

        return config;
    }

    private VulkanCompositorMode ResolveCompositorMode(VulkanCompatProfileEntry? compatEntry)
    {
        if (VulkanCompositorMode != VulkanCompositorMode.Auto)
        {
            return VulkanCompositorMode;
        }

        if (compatEntry != null && !string.IsNullOrWhiteSpace(compatEntry.CompositorMode))
        {
            if (string.Equals(compatEntry.CompositorMode, "precise", StringComparison.OrdinalIgnoreCase))
                return VulkanCompositorMode.Precise;
            if (string.Equals(compatEntry.CompositorMode, "fast", StringComparison.OrdinalIgnoreCase))
                return VulkanCompositorMode.Fast;
            if (string.Equals(compatEntry.CompositorMode, "compatibility", StringComparison.OrdinalIgnoreCase))
                return VulkanCompositorMode.Compatibility;
        }

        return VulkanCompositorMode.Fast;
    }
}
