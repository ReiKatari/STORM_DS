// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text.Json;
using StormDs.Core.Configuration;
using StormDs.Core.Engine;
using StormDs.Core.Library;
using StormDs.Core.Native;
using StormDs.Core.Paths;
using StormDs.Core.Subsystems;

namespace StormDs.UI.Common;

public enum NavSectionKind
{
    Library = 0,
    Favorites = 1,
    Recent = 2,
    DsiNand = 3,
    Achievements = 4,
    Netplay = 5,
    AiTranslator = 6,
    Settings = 7
}

public enum BentoViewMode
{
    BentoCards = 0,
    CollectorTable = 1
}

/// <summary>
/// Central thread-safe UI state service holding loaded configuration, active ROM selection,
/// engine session state, navigation tabs, and live multiplatform services.
/// </summary>
public sealed class StormDsUiState
{
    private static readonly Lazy<StormDsUiState> s_instance = new(() => new StormDsUiState());
    public static StormDsUiState Instance => s_instance.Value;

    public StormDsAppConfig AppConfig { get; private set; }
    public RomLibraryService LibraryService { get; }
    public StormDsEngineService EngineService { get; }
    public GameTdbArtService ArtService { get; }
    public CheatService CheatService { get; }
    public DsiNandService DsiNandService { get; }
    public NetplayWfcService NetplayService { get; }
    public RetroAchievementsService RetroAchievementsService { get; }
    public AiTranslatorService AiTranslatorService { get; }
    public Slot2PeripheralService Slot2Service { get; }

    public NavSectionKind ActiveNavSection { get; private set; } = NavSectionKind.Library;
    public RomFilter ActiveFilter { get; private set; } = RomFilter.All;
    public SortingMode ActiveSorting { get; private set; } = SortingMode.Title;
    public BentoViewMode ActiveViewMode { get; private set; } = BentoViewMode.BentoCards;
    public string SearchQuery { get; private set; } = string.Empty;

    public RomMetadataRecord? SelectedRom { get; private set; }
    public bool IsEmulationActive { get; private set; }
    public bool IsPaused { get; private set; }
    public bool IsHiddenToTray { get; private set; }
    public bool IsDetachedScreenActive { get; set; }
    public bool IsFastForward { get; set; }
    public bool IsFullscreen { get; private set; }
    public string StatusBannerText { get; private set; } = string.Empty;
    public StormDsFrameStats LastFrameStats { get; set; }
    public string ProbedGpuName { get; private set; } = StormDs.Core.Localization.StormDsLoc.T("GpuProbePending");
    public string VulkanTierBadge { get; private set; } = "Software 3D";
    public uint VulkanApiVersion { get; private set; } = 0x00401000;
    private bool _vulkanProbedOk;
    private bool _vulkanSupportsZeroCopy;

    public event Action? StateChanged;
    public event Action<RomMetadataRecord?>? RomSelected;
    public event Action? EmulationStarted;
    public event Action? EmulationStopped;
    public event Action<NavSectionKind>? NavSectionChanged;
    public event Action? FilterChanged;
    public event Action? DisplayConfigChanged;
    public event Action? UiScaleChanged;
    public event Action<bool>? FullscreenChanged;
    public event Action? FullscreenToggled;
    public event Action<bool>? UpdateCheckRequested;
    public event Action<RomMetadataRecord, int>? RomModalRequested;
    public event Action<bool>? HiddenToTrayChanged;
    public event Action? SettingsSaved;
    public event Action<string>? StatusNotification;

    private StormDsUiState()
    {
        AppConfig = LoadConfig();
        LibraryService = new RomLibraryService();
        EngineService = new StormDsEngineService();
        ArtService = new GameTdbArtService();
        CheatService = new CheatService();
        DsiNandService = new DsiNandService();
        NetplayService = new NetplayWfcService();
        RetroAchievementsService = new RetroAchievementsService();
        AiTranslatorService = new AiTranslatorService();
        Slot2Service = new Slot2PeripheralService();

        SyncServicesFromConfig();
        ProbeVulkanHardware();

        LibraryService.LibraryChanged += () =>
        {
            if (SelectedRom == null && LibraryService.AllRoms.Count > 0)
            {
                SelectRom(LibraryService.AllRoms[0]);
            }
            StateChanged?.Invoke();
        };
    }

    public void SyncServicesFromConfig()
    {
        RetroAchievementsService.Username = AppConfig.RetroAchievementsUsername;
        RetroAchievementsService.Token = AppConfig.RetroAchievementsToken;
        RetroAchievementsService.IsHardcoreMode = AppConfig.RetroAchievementsHardcoreMode;
        RetroAchievementsService.IsRichPresenceEnabled = AppConfig.RetroAchievementsRichPresence;

        Slot2Service.ActiveAddon = AppConfig.Slot2AddonType;
        Slot2Service.GbaRomPath = AppConfig.GbaRomPath;
        Slot2Service.GbaSavePath = AppConfig.GbaSavePath;
        Slot2Service.SolarLuxLevel = AppConfig.SolarLuxLevel;

        if (AppConfig.LanDiscoveryEnabled)
        {
            NetplayService.StartLanDiscovery(AppConfig.LanPort > 0 ? AppConfig.LanPort : NetplayWfcService.DefaultLanPort);
        }
        else
        {
            NetplayService.StopLanDiscovery();
        }
    }

    public PerRomProfile LoadRomProfile(string gameCode)
    {
        if (string.IsNullOrWhiteSpace(gameCode)) return new PerRomProfile();
        string path = StormDsPlatformPaths.GetRomProfileFilePath(gameCode);
        if (File.Exists(path))
        {
            try
            {
                string json = File.ReadAllText(path);
                var p = JsonSerializer.Deserialize(json, StormDsJsonContext.Default.PerRomProfile);
                if (p != null) return p;
            }
            catch
            {
            }
        }
        return new PerRomProfile { GameCode = gameCode.Trim() };
    }

    public void SaveRomProfile(PerRomProfile profile)
    {
        if (profile == null || string.IsNullOrWhiteSpace(profile.GameCode)) return;
        try
        {
            Directory.CreateDirectory(StormDsPlatformPaths.ProfilesDirectory);
            string path = StormDsPlatformPaths.GetRomProfileFilePath(profile.GameCode);
            string json = JsonSerializer.Serialize(profile, StormDsJsonContext.Default.PerRomProfile);
            File.WriteAllText(path, json);
        }
        catch (Exception ex)
        {
            Console.Error.WriteLine($"[StormDsUiState] Error saving ROM profile: {ex.Message}");
        }
    }

    private unsafe void ProbeVulkanHardware()
    {
        try
        {
            if (StormDsNative.IsAvailable)
            {
                StormDsVulkanCaps caps = default;
                int res = StormDsNative.storm_ds_probe_vulkan(&caps);
                if (res == 0)
                {
                    string devName = caps.GetDeviceName();
                    ProbedGpuName = !string.IsNullOrWhiteSpace(devName) ? devName : "Vulkan Universal Device";
                    VulkanApiVersion = caps.ApiVersion;
                    _vulkanProbedOk = true;
                    _vulkanSupportsZeroCopy = caps.SupportsZeroCopy == 1;
                    RefreshVulkanTierBadge();
                    return;
                }
            }
        }
        catch (Exception ex)
        {
            Console.Error.WriteLine($"[StormDsUiState] Notice: Vulkan probe: {ex.Message}");
        }

        _vulkanProbedOk = false;
        _vulkanSupportsZeroCopy = false;
        ProbedGpuName = StormDs.Core.Localization.StormDsLoc.T("SoftwareRendererCpu");
        RefreshVulkanTierBadge();
    }

    public void RefreshVulkanTierBadge()
    {
        if (AppConfig.RendererBackend == RendererBackend.Software)
        {
            VulkanTierBadge = "Software 3D";
            return;
        }

        if (_vulkanProbedOk && VulkanApiVersion > 0)
        {
            uint maj = (VulkanApiVersion >> 22) & 0x3FF;
            uint min = (VulkanApiVersion >> 12) & 0x3FF;
            VulkanTierBadge = _vulkanSupportsZeroCopy
                ? $"Vulkan {maj}.{min} Zero-Copy"
                : $"Vulkan {maj}.{min}";
            return;
        }

        VulkanTierBadge = AppConfig.RendererBackend == RendererBackend.Vulkan
            ? "Vulkan 1.1"
            : "Software 3D";
    }

    private static StormDsAppConfig LoadConfig()
    {
        string cfgPath = Path.Combine(StormDsPlatformPaths.ConfigDirectory, "config.json");
        if (File.Exists(cfgPath))
        {
            try
            {
                string json = File.ReadAllBytes(cfgPath).Length > 0 ? File.ReadAllText(cfgPath) : string.Empty;
                var loaded = JsonSerializer.Deserialize(json, StormDsJsonContext.Default.StormDsAppConfig);
                if (loaded != null) return loaded;
            }
            catch (Exception ex)
            {
                Console.Error.WriteLine($"[StormDsUiState] Notice: Config read error: {ex.Message}");
            }
        }
        return new StormDsAppConfig();
    }

    public void SaveConfig(bool notifyUser = false)
    {
        try
        {
            Directory.CreateDirectory(StormDsPlatformPaths.ConfigDirectory);
            string cfgPath = Path.Combine(StormDsPlatformPaths.ConfigDirectory, "config.json");
            string json = JsonSerializer.Serialize(AppConfig, StormDsJsonContext.Default.StormDsAppConfig);
            File.WriteAllText(cfgPath, json);
            RefreshVulkanTierBadge();
            SyncServicesFromConfig();
            if (IsEmulationActive)
            {
                var profile = SelectedRom != null ? LoadRomProfile(SelectedRom.GameCode) : null;
                EngineService.UpdateRuntimeConfig(AppConfig, profile);
                EngineService.SetMotionAndSlot2(
                    0f, 0f, 0f, 0f, 0f, 0f,
                    (int)(profile?.Slot2AddonType ?? Slot2Service.ActiveAddon),
                    profile?.SolarLuxLevel ?? Slot2Service.SolarLuxLevel,
                    Slot2Service.GuitarHeroButtons,
                    (uint)Slot2Service.PedometerSteps);
            }
            SettingsSaved?.Invoke();
            if (notifyUser)
            {
                NotifyStatus("Конфигурация сохранена");
            }
        }
        catch (Exception ex)
        {
            Console.Error.WriteLine($"[StormDsUiState] Notice: Config save error: {ex.Message}");
        }
    }

    public void NotifyStatus(string text)
    {
        StatusBannerText = text ?? string.Empty;
        StatusNotification?.Invoke(StatusBannerText);
    }

    public void SelectRom(RomMetadataRecord? rom)
    {
        SelectedRom = rom;
        RomSelected?.Invoke(rom);
        StateChanged?.Invoke();
    }

    public void SetNavSection(NavSectionKind section)
    {
        ActiveNavSection = section;
        NavSectionChanged?.Invoke(section);
        StateChanged?.Invoke();
    }

    public void SetFilter(RomFilter filter)
    {
        ActiveFilter = filter;
        FilterChanged?.Invoke();
        StateChanged?.Invoke();
    }

    public void SetSorting(SortingMode sorting)
    {
        ActiveSorting = sorting;
        FilterChanged?.Invoke();
        StateChanged?.Invoke();
    }

    public void SetViewMode(BentoViewMode mode)
    {
        ActiveViewMode = mode;
        StateChanged?.Invoke();
    }

    public void SetSearchQuery(string query)
    {
        SearchQuery = query ?? string.Empty;
        FilterChanged?.Invoke();
        StateChanged?.Invoke();
    }

    public void ToggleFavorite(RomMetadataRecord rom)
    {
        rom.IsFavorite = !rom.IsFavorite;
        if (rom.IsFavorite)
        {
            if (!AppConfig.FavoriteRoms.Contains(rom.FilePath))
            {
                AppConfig.FavoriteRoms.Add(rom.FilePath);
            }
        }
        else
        {
            AppConfig.FavoriteRoms.Remove(rom.FilePath);
        }
        SaveConfig();
        StateChanged?.Invoke();
    }

    public bool StartEmulation(RomMetadataRecord? rom = null, bool bootBios = false)
    {
        var targetRom = rom ?? SelectedRom;
        PerRomProfile? profile = targetRom != null ? LoadRomProfile(targetRom.GameCode) : null;

        EngineService.Initialize(AppConfig, profile);

        bool success = false;
        if (bootBios)
        {
            success = EngineService.BootFirmware(AppConfig.ConsoleMode);
        }
        else if (targetRom != null)
        {
            success = EngineService.LoadRom(targetRom.FilePath, AppConfig, profile);
            if (success)
            {
                targetRom.PlayCount++;
                targetRom.LastPlayedUtc = DateTime.UtcNow;
                if (!AppConfig.RecentRoms.Contains(targetRom.FilePath))
                {
                    AppConfig.RecentRoms.Insert(0, targetRom.FilePath);
                    if (AppConfig.RecentRoms.Count > 30) AppConfig.RecentRoms.RemoveAt(AppConfig.RecentRoms.Count - 1);
                }
                SaveConfig();

                CheatService.LoadCheatsForGame(targetRom.GameCode);
                bool cheatsAllowed = (profile?.CheatsEnabled ?? AppConfig.CheatsEnabled) &&
                                     RetroAchievementsService.IsFeatureAllowedInCurrentMode("cheats");
                CheatService.ApplyCheatsToNative(EngineService.NativeHandle, cheatsAllowed);

                EngineService.SetMotionAndSlot2(
                    0f, 0f, 0f, 0f, 0f, 0f,
                    (int)(profile?.Slot2AddonType ?? Slot2Service.ActiveAddon),
                    profile?.SolarLuxLevel ?? Slot2Service.SolarLuxLevel,
                    Slot2Service.GuitarHeroButtons,
                    (uint)Slot2Service.PedometerSteps);
            }
        }
        else
        {
            success = EngineService.BootFirmware(ConsoleMode.Nds);
        }

        IsEmulationActive = true;
        IsPaused = false;
        EmulationStarted?.Invoke();
        StateChanged?.Invoke();
        return success;
    }

    public void StopEmulation()
    {
        EngineService.Shutdown();
        IsEmulationActive = false;
        IsPaused = false;
        EmulationStopped?.Invoke();
        StateChanged?.Invoke();
    }

    public void TogglePause()
    {
        IsPaused = !IsPaused;
        StateChanged?.Invoke();
    }

    public void SetHiddenToTray(bool hidden)
    {
        if (IsHiddenToTray == hidden) return;
        IsHiddenToTray = hidden;
        HiddenToTrayChanged?.Invoke(hidden);
        StateChanged?.Invoke();
    }

    public void ApplyLiveCheats()
    {
        if (!IsEmulationActive || EngineService.NativeHandle == nint.Zero) return;
        var profile = SelectedRom != null ? LoadRomProfile(SelectedRom.GameCode) : null;
        bool cheatsAllowed = (profile?.CheatsEnabled ?? AppConfig.CheatsEnabled) &&
                             RetroAchievementsService.IsFeatureAllowedInCurrentMode("cheats");
        CheatService.ApplyCheatsToNative(EngineService.NativeHandle, cheatsAllowed);
    }

    public void NotifyDisplayConfigChanged()
    {
        DisplayConfigChanged?.Invoke();
        StateChanged?.Invoke();
    }

    public void NotifyUiScaleChanged()
    {
        UiScaleChanged?.Invoke();
        StateChanged?.Invoke();
    }

    public void RequestToggleFullscreen()
    {
        FullscreenToggled?.Invoke();
    }

    public void SetFullscreen(bool active)
    {
        IsFullscreen = active;
        FullscreenChanged?.Invoke(active);
    }

    public void RequestUpdateCheck(bool manual = true)
    {
        UpdateCheckRequested?.Invoke(manual);
    }

    public void RequestRomModal(RomMetadataRecord rom, int tabIdx = 0)
    {
        RomModalRequested?.Invoke(rom, tabIdx);
    }

    public IReadOnlyList<RomMetadataRecord> GetFilteredRoms()
    {
        var roms = LibraryService.Query(SearchQuery, ActiveFilter, ActiveSorting, AppConfig.Language);

        if (ActiveNavSection == NavSectionKind.Favorites)
        {
            roms = roms.Where(r => r.IsFavorite).ToList();
        }
        else if (ActiveNavSection == NavSectionKind.Recent)
        {
            roms = roms.Where(r => r.PlayCount > 0).OrderByDescending(r => r.LastPlayedUtc).ToList();
        }
        else if (ActiveNavSection == NavSectionKind.DsiNand)
        {
            roms = roms.Where(r => r.UnitCode == NdsUnitCode.DsiWare).ToList();
        }

        return roms;
    }

    public void StartRomEmulationFromPath(string romPath)
    {
        if (string.IsNullOrWhiteSpace(romPath) || !File.Exists(romPath)) return;
        var rom = LibraryService.ImportSingleRomFile(romPath);
        if (rom != null)
        {
            SelectRom(rom);
            StartEmulation(rom);
        }
    }
}
