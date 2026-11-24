// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using StormDs.Core.Configuration;

namespace StormDs.Core.Subsystems;

/// <summary>
/// Service managing Nintendo DS Slot-2 peripherals including GBA cartridges, RAM expansion paks,
/// Rumble Paks, Boktai solar sensors, Guitar Hero grips, and motion packs.
/// </summary>
public sealed class Slot2PeripheralService
{
    public Slot2AddonType ActiveAddon { get; set; } = Slot2AddonType.None;
    public string GbaRomPath { get; set; } = string.Empty;
    public string GbaSavePath { get; set; } = string.Empty;
    public int SolarLuxLevel { get; set; } = 5; // 0 (dark) to 10 (intense sunlight)
    public byte GuitarHeroButtons { get; set; } // Bit 0: Green, 1: Red, 2: Yellow, 3: Blue
    public int PedometerSteps { get; set; }

    public bool IsGbaRomValid => !string.IsNullOrWhiteSpace(GbaRomPath) && File.Exists(GbaRomPath);

    public void SetSolarLevel(int level)
    {
        SolarLuxLevel = Math.Clamp(level, 0, 10);
    }

    public void StepSolarLevel(int delta)
    {
        SolarLuxLevel = Math.Clamp(SolarLuxLevel + delta, 0, 10);
    }

    public void SetGuitarHeroButton(int buttonIndex, bool pressed)
    {
        if (buttonIndex < 0 || buttonIndex > 3) return;
        byte mask = (byte)(1 << buttonIndex);
        if (pressed)
            GuitarHeroButtons |= mask;
        else
            GuitarHeroButtons &= (byte)~mask;
    }

    public void AddPedometerSteps(int steps)
    {
        PedometerSteps = Math.Max(0, PedometerSteps + steps);
    }
}
