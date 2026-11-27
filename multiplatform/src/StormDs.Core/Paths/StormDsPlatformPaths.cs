// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System.Runtime.InteropServices;

namespace StormDs.Core.Paths;

/// <summary>
/// Provides unified cross-platform path resolution adhering to STORM Ecosystem Law 5 and 100% 7.7.4+ conventions.
/// Supports Android (/storage/emulated/0/STORM DS), Windows (%APPDATA%\STORM DS or portable), Linux (XDG), and macOS.
/// </summary>
public static class StormDsPlatformPaths
{
    private const string AppFolderName = "STORM DS";
    private const string PortableMarkerFileName = "portable.txt";
    private const string AndroidStorageRoot = "/storage/emulated/0/STORM DS";

    private static readonly Lazy<string> RootDirectoryLazy = new(ResolveRootDirectory);

    public static string RootDirectory => RootDirectoryLazy.Value;

    public static string RomsDirectory => Path.Combine(RootDirectory, "roms");
    public static string SavesDirectory => Path.Combine(RootDirectory, "saves");
    public static string StatesDirectory => Path.Combine(RootDirectory, "states");
    public static string BiosDirectory => Path.Combine(RootDirectory, "bios");
    public static string NandDirectory => Path.Combine(RootDirectory, "nand");
    public static string ShadersDirectory => Path.Combine(RootDirectory, "shaders");
    public static string CheatsDirectory => Path.Combine(RootDirectory, "cheats");
    public static string DriversDirectory => Path.Combine(RootDirectory, "drivers");
    public static string ConfigDirectory => Path.Combine(RootDirectory, "config");
    public static string ProfilesDirectory => Path.Combine(ConfigDirectory, "profiles");
    public static string CacheDirectory => Path.Combine(RootDirectory, "cache");
    public static string CoversDirectory => Path.Combine(CacheDirectory, "covers");
    public static string ScreenshotsDirectory => Path.Combine(RootDirectory, "screenshots");
    public static string LogsDirectory => Path.Combine(RootDirectory, "logs");

    public static string SettingsFilePath => Path.Combine(ConfigDirectory, "settings.json");
    public static string VulkanCompatFilePath => Path.Combine(ConfigDirectory, "vulkan_compat.json");
    public static string RetroAchievementsQueuePath => Path.Combine(ConfigDirectory, "ra_offline_queue.json");

    /// <summary>
    /// Creates all standard subdirectories if they do not already exist.
    /// </summary>
    public static void EnsureDirectories()
    {
        try
        {
            Directory.CreateDirectory(RootDirectory);
            Directory.CreateDirectory(RomsDirectory);
            Directory.CreateDirectory(SavesDirectory);
            Directory.CreateDirectory(StatesDirectory);
            Directory.CreateDirectory(BiosDirectory);
            Directory.CreateDirectory(NandDirectory);
            Directory.CreateDirectory(ShadersDirectory);
            Directory.CreateDirectory(CheatsDirectory);
            Directory.CreateDirectory(DriversDirectory);
            Directory.CreateDirectory(ConfigDirectory);
            Directory.CreateDirectory(ProfilesDirectory);
            Directory.CreateDirectory(CacheDirectory);
            Directory.CreateDirectory(CoversDirectory);
            Directory.CreateDirectory(ScreenshotsDirectory);
            Directory.CreateDirectory(LogsDirectory);
        }
        catch (Exception ex)
        {
            Console.Error.WriteLine($"[StormDsPlatformPaths] Warning: Failed to create directories: {ex.Message}");
        }
    }

    /// <summary>
    /// Returns the save file path corresponding to a given ROM path or game code.
    /// </summary>
    public static string GetSaveFilePath(string romPathOrGameCode)
    {
        string name = Path.GetFileNameWithoutExtension(romPathOrGameCode);
        return Path.Combine(SavesDirectory, $"{name}.sav");
    }

    /// <summary>
    /// Returns the save state file path corresponding to a ROM path and slot index (0..9).
    /// </summary>
    public static string GetSaveStateFilePath(string romPathOrGameCode, int slotIndex)
    {
        string name = Path.GetFileNameWithoutExtension(romPathOrGameCode);
        return Path.Combine(StatesDirectory, $"{name}.st{slotIndex}");
    }

    /// <summary>
    /// Returns the per-ROM profile path for a given game code.
    /// </summary>
    public static string GetRomProfileFilePath(string gameCode)
    {
        return Path.Combine(ProfilesDirectory, $"{gameCode.Trim()}.json");
    }

    /// <summary>
    /// Auto-discovers common ROM directories across Windows, Linux, and Android.
    /// </summary>
    public static IReadOnlyList<string> DiscoverRomDirectories()
    {
        var discovered = new List<string> { RomsDirectory };

        if (OperatingSystem.IsWindows())
        {
            string userProfile = Environment.GetFolderPath(Environment.SpecialFolder.UserProfile);
            string documents = Environment.GetFolderPath(Environment.SpecialFolder.MyDocuments);
            string downloads = Path.Combine(userProfile, "Downloads");
            string desktop = Environment.GetFolderPath(Environment.SpecialFolder.Desktop);

            string[] candidates =
            [
                Path.Combine(downloads, "NDS"),
                Path.Combine(downloads, "Nintendo DS"),
                Path.Combine(documents, "NDS"),
                Path.Combine(documents, "ROMs", "NDS"),
                Path.Combine(userProfile, "Emulation", "roms", "nds"),
                Path.Combine(userProfile, "Games", "ROMs", "NDS"),
                Path.Combine(desktop, "NDS"),
                @"D:\ROMs\NDS",
                @"D:\Games\NDS",
                @"E:\ROMs\NDS",
                @"E:\Games\NDS",
                @"F:\ROMs\NDS"
            ];

            foreach (string candidate in candidates)
            {
                if (Directory.Exists(candidate) && !discovered.Contains(candidate, StringComparer.OrdinalIgnoreCase))
                {
                    discovered.Add(candidate);
                }
            }
        }
        else if (OperatingSystem.IsAndroid())
        {
            string[] androidCandidates =
            [
                "/storage/emulated/0/Download/NDS",
                "/storage/emulated/0/Download",
                "/storage/emulated/0/ROMs/NDS",
                "/storage/emulated/0/Roms/nds"
            ];

            foreach (string candidate in androidCandidates)
            {
                if (Directory.Exists(candidate) && !discovered.Contains(candidate, StringComparer.Ordinal))
                {
                    discovered.Add(candidate);
                }
            }
        }
        else if (OperatingSystem.IsLinux() || OperatingSystem.IsMacOS())
        {
            string home = Environment.GetFolderPath(Environment.SpecialFolder.UserProfile);
            string[] unixCandidates =
            [
                Path.Combine(home, "Games", "ROMs", "NDS"),
                Path.Combine(home, "ROMs", "NDS"),
                Path.Combine(home, "Downloads", "NDS")
            ];

            foreach (string candidate in unixCandidates)
            {
                if (Directory.Exists(candidate) && !discovered.Contains(candidate, StringComparer.Ordinal))
                {
                    discovered.Add(candidate);
                }
            }
        }

        return discovered;
    }

    private static string ResolveRootDirectory()
    {
        if (OperatingSystem.IsAndroid())
        {
            return AndroidStorageRoot;
        }

        string baseDirectory = AppContext.BaseDirectory;
        if (File.Exists(Path.Combine(baseDirectory, ".portable")))
        {
            return Path.Combine(baseDirectory, "data");
        }

        string portableMarker = Path.Combine(baseDirectory, PortableMarkerFileName);
        if (File.Exists(portableMarker))
        {
            return baseDirectory;
        }

        if (OperatingSystem.IsWindows())
        {
            string appData = Environment.GetFolderPath(Environment.SpecialFolder.ApplicationData);
            return Path.Combine(appData, AppFolderName);
        }

        if (OperatingSystem.IsLinux())
        {
            string? xdgConfig = Environment.GetEnvironmentVariable("XDG_CONFIG_HOME");
            if (!string.IsNullOrWhiteSpace(xdgConfig))
            {
                return Path.Combine(xdgConfig, AppFolderName);
            }
            string home = Environment.GetFolderPath(Environment.SpecialFolder.UserProfile);
            return Path.Combine(home, ".config", AppFolderName);
        }

        if (OperatingSystem.IsMacOS())
        {
            string home = Environment.GetFolderPath(Environment.SpecialFolder.UserProfile);
            return Path.Combine(home, "Library", "Application Support", AppFolderName);
        }

        return Path.Combine(baseDirectory, AppFolderName);
    }
}
