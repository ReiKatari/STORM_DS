// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System.Text.Json;
using StormDs.Core.Paths;

namespace StormDs.Core.Configuration;

public sealed class VulkanCompatProfileEntry
{
    public string Id { get; set; } = string.Empty;
    public string Title { get; set; } = string.Empty;
    public List<string> GameCodes { get; set; } = [];
    public List<string> TitleKeywords { get; set; } = [];
    public string CompositorMode { get; set; } = "fast";
    public bool? ThickEdges { get; set; }
    public string Notes { get; set; } = string.Empty;
}

public sealed class VulkanCompatDatabase
{
    public int Version { get; set; } = 1;
    public List<VulkanCompatProfileEntry> Profiles { get; set; } = [];

    public VulkanCompatProfileEntry? FindProfile(string gameCode, string? title = null)
    {
        if (string.IsNullOrWhiteSpace(gameCode) && string.IsNullOrWhiteSpace(title))
        {
            return null;
        }

        string cleanCode = gameCode?.Trim().ToUpperInvariant() ?? string.Empty;

        // 1. Direct GameCode exact or prefix match
        foreach (var profile in Profiles)
        {
            foreach (var code in profile.GameCodes)
            {
                if (cleanCode.StartsWith(code, StringComparison.OrdinalIgnoreCase) ||
                    code.StartsWith(cleanCode, StringComparison.OrdinalIgnoreCase))
                {
                    return profile;
                }
            }
        }

        // 2. Title keywords match
        if (!string.IsNullOrWhiteSpace(title))
        {
            string cleanTitle = title.Trim();
            foreach (var profile in Profiles)
            {
                foreach (var kw in profile.TitleKeywords)
                {
                    if (cleanTitle.Contains(kw, StringComparison.OrdinalIgnoreCase))
                    {
                        return profile;
                    }
                }
            }
        }

        return null;
    }

    public static VulkanCompatDatabase LoadDefault()
    {
        string[] candidates =
        [
            StormDsPlatformPaths.VulkanCompatFilePath,
            Path.Combine(AppContext.BaseDirectory, "assets", "vulkan_compat.json"),
            Path.Combine(AppContext.BaseDirectory, "vulkan_compat.json"),
            Path.Combine(AppContext.BaseDirectory, "..", "assets", "vulkan_compat.json"),
            @"F:\STORM DS\multiplatform\assets\vulkan_compat.json"
        ];

        foreach (string candidate in candidates)
        {
            try
            {
                if (File.Exists(candidate))
                {
                    string json = File.ReadAllText(candidate);
                    var db = JsonSerializer.Deserialize(json, StormDsJsonContext.Default.VulkanCompatDatabase);
                    if (db != null && db.Profiles.Count > 0)
                    {
                        return db;
                    }
                }
            }
            catch (Exception ex)
            {
                Console.Error.WriteLine($"[VulkanCompatDatabase] Notice: Reading {candidate}: {ex.Message}");
            }
        }

        // Fallback with built-in reference profiles
        return CreateBuiltinDatabase();
    }

    private static VulkanCompatDatabase CreateBuiltinDatabase()
    {
        return new VulkanCompatDatabase
        {
            Version = 1,
            Profiles =
            [
                new VulkanCompatProfileEntry
                {
                    Id = "alphabounce_kale",
                    Title = "AlphaBounce",
                    GameCodes = ["KAL", "KALE", "KALP"],
                    TitleKeywords = ["alphabounce"],
                    CompositorMode = "precise",
                    ThickEdges = true,
                    Notes = "Preserves clean direct boot DSiWare UI geometry and eliminates bottom screen startup flicker"
                },
                new VulkanCompatProfileEntry
                {
                    Id = "mario_vs_dk_minis",
                    Title = "Mario vs. Donkey Kong: Minis March Again!",
                    GameCodes = ["KDM", "KDME", "KDMP", "KDMJ"],
                    TitleKeywords = ["mario vs. donkey kong", "minis march again"],
                    CompositorMode = "precise",
                    ThickEdges = false,
                    Notes = "Eliminates mini-Mario sprite seams and sprite alpha blending artifacts in Vulkan"
                },
                new VulkanCompatProfileEntry
                {
                    Id = "yugioh_wc_5ds",
                    Title = "Yu-Gi-Oh! World Championship 2007 / 2008 / 5D's",
                    GameCodes = ["AY7", "YG8", "Y5D", "BYX", "BYG", "AY9", "YF4", "BYY"],
                    TitleKeywords = ["yu-gi-oh! world championship", "yu-gi-oh! 5d's"],
                    CompositorMode = "precise",
                    ThickEdges = false,
                    Notes = "Fixes dual-screen 3D card field, monster hologram alpha blending, and 2D/3D priority ordering"
                },
                new VulkanCompatProfileEntry
                {
                    Id = "golden_sun_dark_dawn",
                    Title = "Golden Sun: Dark Dawn",
                    GameCodes = ["B6Z", "B6ZE", "B6ZP", "B6ZJ"],
                    TitleKeywords = ["golden sun: dark dawn", "golden sun dark dawn"],
                    CompositorMode = "precise",
                    ThickEdges = false,
                    Notes = "Fixes Djinn summon 2D/3D layer blending, shadow overlays, and psynergy effects"
                },
                new VulkanCompatProfileEntry
                {
                    Id = "okamiden",
                    Title = "Okamiden",
                    GameCodes = ["B3T", "B3TE", "B3TP", "B3TJ"],
                    TitleKeywords = ["okamiden"],
                    CompositorMode = "precise",
                    ThickEdges = false,
                    Notes = "Fixes celestial brush canvas layer overlay, ink opacity, and dual-pass 3D terrain"
                }
            ]
        };
    }
}
