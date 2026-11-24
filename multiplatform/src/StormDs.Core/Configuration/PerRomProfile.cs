// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

namespace StormDs.Core.Configuration;

/// <summary>
/// Individual game profile providing granular per-ROM overrides for video, audio, slot-2, and input.
/// Persisted to %APPDATA%\STORM DS\config\profiles\{gameCode}.json or Android storage.
/// </summary>
public sealed class PerRomProfile
{
    public string GameCode { get; set; } = string.Empty;
    public string Title { get; set; } = string.Empty;

    // Overrides (null means inherit global config)
    public RendererBackend? RendererBackend { get; set; }
    public VulkanCompositorMode? VulkanCompositorMode { get; set; }
    public int? InternalResolutionScale { get; set; }
    public bool? Widescreen3D { get; set; }
    public bool? Patch60Fps { get; set; }
    public bool? ThickEdges { get; set; }
    public AudioInterpolation? AudioInterpolation { get; set; }
    public int? Arm9Overclock { get; set; }
    public Slot2AddonType? Slot2AddonType { get; set; }
    public string? GbaRomPath { get; set; }
    public int? SolarLuxLevel { get; set; }
    public ScreenLayoutMode? ScreenLayoutMode { get; set; }
    public bool? CheatsEnabled { get; set; }
    public string CustomNotes { get; set; } = string.Empty;
}
