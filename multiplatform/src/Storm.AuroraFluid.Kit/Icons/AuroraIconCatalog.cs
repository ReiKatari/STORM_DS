using System;
using System.Collections.Generic;
using Avalonia.Media;

namespace Storm.AuroraFluid.Kit.Icons;

public sealed record AuroraIconEntry(
    AuroraIconKind Kind,
    string PrimaryPath,
    string SecondaryPath,
    Color StartColor,
    Color EndColor,
    Color SecondaryColor
);

/// <summary>
/// Central catalog of all 72 colored vector icons with zero duplicates validation.
/// </summary>
public static class AuroraIconCatalog
{
    private static readonly Dictionary<AuroraIconKind, AuroraIconEntry> s_entries = new();

    static AuroraIconCatalog()
    {
        s_entries[AuroraIconKind.LibraryGrid] = new AuroraIconEntry(
            AuroraIconKind.LibraryGrid,
            "M 3 3 H 9 V 9 H 3 Z M 15 3 H 21 V 9 H 15 Z M 3 15 H 9 V 21 H 3 Z",
            "M 15 15 H 21 V 21 H 15 Z M 5 5 H 7 V 7 H 5 Z",
            Color.Parse("#8B5CF6"),
            Color.Parse("#A78BFA"),
            Color.Parse("#C4B5FD")
        );
        s_entries[AuroraIconKind.StarFavorite] = new AuroraIconEntry(
            AuroraIconKind.StarFavorite,
            "M 12 2 L 15.09 8.26 L 22 9.27 L 17 14.14 L 18.18 21.02 L 12 17.77 L 5.82 21.02 L 7 14.14 L 2 9.27 L 8.91 8.26 Z",
            "M 12 6 L 13.8 9.8 L 18 10.4 L 15 13.3 L 15.7 17.5 L 12 15.5 Z",
            Color.Parse("#F59E0B"),
            Color.Parse("#FCD34D"),
            Color.Parse("#FFFBEB")
        );
        s_entries[AuroraIconKind.RecentClock] = new AuroraIconEntry(
            AuroraIconKind.RecentClock,
            "M 12 2 A 10 10 0 1 0 22 12 A 10 10 0 0 0 12 2 M 12 4 A 8 8 0 1 1 4 12 A 8 8 0 0 1 12 4",
            "M 12 6 V 12 L 16 14",
            Color.Parse("#06B6D4"),
            Color.Parse("#38BDF8"),
            Color.Parse("#E0F2FE")
        );
        s_entries[AuroraIconKind.DsiNandChip] = new AuroraIconEntry(
            AuroraIconKind.DsiNandChip,
            "M 5 5 H 19 V 19 H 5 Z M 7 2 V 5 M 12 2 V 5 M 17 2 V 5 M 7 19 V 22 M 12 19 V 22 M 17 19 V 22",
            "M 8 8 H 16 V 16 H 8 Z M 10 10 H 14 V 14 H 10 Z",
            Color.Parse("#3B82F6"),
            Color.Parse("#60A5FA"),
            Color.Parse("#93C5FD")
        );
        s_entries[AuroraIconKind.TrophyCrown] = new AuroraIconEntry(
            AuroraIconKind.TrophyCrown,
            "M 3 17 L 5 7 L 9 11 L 12 5 L 15 11 L 19 7 L 21 17 Z",
            "M 5 19 H 19 V 21 H 5 Z M 12 8 L 13 10 H 11 Z",
            Color.Parse("#EAB308"),
            Color.Parse("#FDE047"),
            Color.Parse("#FEF08A")
        );
        s_entries[AuroraIconKind.WifiGlobe] = new AuroraIconEntry(
            AuroraIconKind.WifiGlobe,
            "M 12 2 A 10 10 0 1 0 22 12 A 10 10 0 0 0 12 2 M 2 12 H 22 M 12 2 A 15 15 0 0 1 12 22 A 15 15 0 0 1 12 2",
            "M 8 12 A 8 8 0 0 1 16 12",
            Color.Parse("#0284C7"),
            Color.Parse("#38BDF8"),
            Color.Parse("#BAE6FD")
        );
        s_entries[AuroraIconKind.LanMesh] = new AuroraIconEntry(
            AuroraIconKind.LanMesh,
            "M 12 3 L 19 7 V 15 L 12 19 L 5 15 V 7 Z",
            "M 12 7 L 16 9.5 V 13.5 L 12 15.5 L 8 13.5 V 9.5 Z M 12 3 V 7 M 19 7 L 16 9.5 M 19 15 L 16 13.5 M 12 19 V 15.5 M 5 15 L 8 13.5 M 5 7 L 8 9.5",
            Color.Parse("#10B981"),
            Color.Parse("#34D399"),
            Color.Parse("#A7F3D0")
        );
        s_entries[AuroraIconKind.AiTranslatorSpark] = new AuroraIconEntry(
            AuroraIconKind.AiTranslatorSpark,
            "M 12 1 L 14.5 8.5 L 22 11 L 14.5 13.5 L 12 21 L 9.5 13.5 L 2 11 L 9.5 8.5 Z",
            "M 18 2 L 19 5 L 22 6 L 19 7 L 18 10 L 17 7 L 14 6 L 17 5 Z",
            Color.Parse("#A855F7"),
            Color.Parse("#00F0FF"),
            Color.Parse("#F0ABFC")
        );
        s_entries[AuroraIconKind.DualScreenLayout] = new AuroraIconEntry(
            AuroraIconKind.DualScreenLayout,
            "M 4 2 H 20 V 10 H 4 Z M 4 14 H 20 V 22 H 4 Z",
            "M 7 11 H 17 V 13 H 7 Z M 6 4 H 18 V 8 H 6 Z M 6 16 H 18 V 20 H 6 Z",
            Color.Parse("#6366F1"),
            Color.Parse("#818CF8"),
            Color.Parse("#C7D2FE")
        );
        s_entries[AuroraIconKind.SettingsCore] = new AuroraIconEntry(
            AuroraIconKind.SettingsCore,
            "M 12 8 A 4 4 0 1 0 16 12 A 4 4 0 0 0 12 8 M 12 1 A 2 2 0 0 1 14 3 V 4.1 A 8 8 0 0 1 16.9 5.3 L 17.7 4.5 A 2 2 0 0 1 20.5 4.5 L 20.5 4.5 A 2 2 0 0 1 20.5 7.3 L 19.7 8.1 A 8 8 0 0 1 20.9 11 H 22 A 2 2 0 0 1 24 13 V 13 A 2 2 0 0 1 22 15 H 20.9 A 8 8 0 0 1 19.7 17.9 L 20.5 18.7 A 2 2 0 0 1 20.5 21.5 L 20.5 21.5 A 2 2 0 0 1 17.7 21.5 L 16.9 20.7 A 8 8 0 0 1 14 21.9 V 23 A 2 2 0 0 1 12 25",
            "M 12 10 A 2 2 0 1 0 14 12 A 2 2 0 0 0 12 10 Z",
            Color.Parse("#64748B"),
            Color.Parse("#94A3B8"),
            Color.Parse("#CBD5E1")
        );
        s_entries[AuroraIconKind.PlayPrism] = new AuroraIconEntry(
            AuroraIconKind.PlayPrism,
            "M 6 4 L 20 12 L 6 20 Z",
            "M 8 8 L 15 12 L 8 16 Z",
            Color.Parse("#22C55E"),
            Color.Parse("#4ADE80"),
            Color.Parse("#BBF7D0")
        );
        s_entries[AuroraIconKind.PauseTwin] = new AuroraIconEntry(
            AuroraIconKind.PauseTwin,
            "M 6 4 H 10 V 20 H 6 Z M 14 4 H 18 V 20 H 14 Z",
            "M 7 6 H 9 V 18 H 7 Z M 15 6 H 17 V 18 H 15 Z",
            Color.Parse("#F59E0B"),
            Color.Parse("#FBBF24"),
            Color.Parse("#FDE68A")
        );
        s_entries[AuroraIconKind.StopOctagon] = new AuroraIconEntry(
            AuroraIconKind.StopOctagon,
            "M 7.8 2 H 16.2 L 22 7.8 V 16.2 L 16.2 22 H 7.8 L 2 16.2 V 7.8 Z",
            "M 9 9 H 15 V 15 H 9 Z",
            Color.Parse("#EF4444"),
            Color.Parse("#F87171"),
            Color.Parse("#FECACA")
        );
        s_entries[AuroraIconKind.ResetCycle] = new AuroraIconEntry(
            AuroraIconKind.ResetCycle,
            "M 12 4 A 8 8 0 1 0 20 12 H 17 A 5 5 0 1 1 12 7 V 10 L 16 6 L 12 2 Z",
            "M 11 11 H 13 V 15 H 11 Z M 11 16 H 13 V 17 H 11 Z",
            Color.Parse("#06B6D4"),
            Color.Parse("#22D3EE"),
            Color.Parse("#A5F3FC")
        );
        s_entries[AuroraIconKind.FastForwardBolt] = new AuroraIconEntry(
            AuroraIconKind.FastForwardBolt,
            "M 4 4 L 12 12 L 4 20 Z M 12 4 L 20 12 L 12 20 Z",
            "M 11 1 L 5 13 H 11 L 9 23 L 19 10 H 13 Z",
            Color.Parse("#EAB308"),
            Color.Parse("#FACC15"),
            Color.Parse("#FEF08A")
        );
        s_entries[AuroraIconKind.RewindVortex] = new AuroraIconEntry(
            AuroraIconKind.RewindVortex,
            "M 20 4 L 12 12 L 20 20 Z M 12 4 L 4 12 L 12 20 Z",
            "M 12 6 A 6 6 0 1 0 18 12 H 15 A 3 3 0 1 1 12 9",
            Color.Parse("#8B5CF6"),
            Color.Parse("#A78BFA"),
            Color.Parse("#DDD6FE")
        );
        s_entries[AuroraIconKind.SwapScreens] = new AuroraIconEntry(
            AuroraIconKind.SwapScreens,
            "M 8 7 H 19 M 19 7 L 15 3 M 19 7 L 15 11 M 16 17 H 5 M 5 17 L 9 13 M 5 17 L 9 21",
            "M 3 6 H 6 V 9 H 3 Z M 18 15 H 21 V 18 H 18 Z",
            Color.Parse("#3B82F6"),
            Color.Parse("#60A5FA"),
            Color.Parse("#BFDBFE")
        );
        s_entries[AuroraIconKind.DetachWindow] = new AuroraIconEntry(
            AuroraIconKind.DetachWindow,
            "M 3 3 H 13 V 13 H 3 Z M 9 15 H 21 V 21 H 9 Z",
            "M 14 3 H 21 V 10 M 21 3 L 13 11",
            Color.Parse("#14B8A6"),
            Color.Parse("#2DD4BF"),
            Color.Parse("#99F6E4")
        );
        s_entries[AuroraIconKind.SaveSlotRibbon] = new AuroraIconEntry(
            AuroraIconKind.SaveSlotRibbon,
            "M 5 3 H 19 V 21 L 12 17 L 5 21 Z",
            "M 9 6 H 15 V 12 H 9 Z M 12 7 V 11 M 10 9 H 14",
            Color.Parse("#10B981"),
            Color.Parse("#34D399"),
            Color.Parse("#A7F3D0")
        );
        s_entries[AuroraIconKind.LoadSlotArrow] = new AuroraIconEntry(
            AuroraIconKind.LoadSlotArrow,
            "M 4 14 V 19 H 20 V 14 M 12 3 V 15 M 12 15 L 7 10 M 12 15 L 17 10",
            "M 6 17 H 18 V 18 H 6 Z",
            Color.Parse("#6366F1"),
            Color.Parse("#818CF8"),
            Color.Parse("#C7D2FE")
        );
        s_entries[AuroraIconKind.TimelineFilm] = new AuroraIconEntry(
            AuroraIconKind.TimelineFilm,
            "M 3 4 H 21 V 20 H 3 Z M 6 4 V 20 M 18 4 V 20 M 3 8 H 6 M 3 12 H 6 M 3 16 H 6 M 18 8 H 21 M 18 12 H 21 M 18 16 H 21",
            "M 8 7 H 16 V 17 H 8 Z",
            Color.Parse("#EC4899"),
            Color.Parse("#F472B6"),
            Color.Parse("#FBCFE8")
        );
        s_entries[AuroraIconKind.CheatMatrix] = new AuroraIconEntry(
            AuroraIconKind.CheatMatrix,
            "M 4 4 H 20 V 20 H 4 Z M 8 8 H 10 V 10 H 8 Z M 14 8 H 16 V 10 H 14 Z M 8 14 H 10 V 16 H 8 Z M 14 14 H 16 V 16 H 14 Z",
            "M 11 11 H 13 V 13 H 11 Z M 11 8 H 13 V 9 H 11 Z M 11 15 H 13 V 16 H 11 Z",
            Color.Parse("#00F0FF"),
            Color.Parse("#38BDF8"),
            Color.Parse("#BAE6FD")
        );
        s_entries[AuroraIconKind.VulkanFlame] = new AuroraIconEntry(
            AuroraIconKind.VulkanFlame,
            "M 12 2 C 12 2 16 6 16 11 C 16 13.5 14.5 15.5 13 16 C 13.5 14.5 13 13 12 12 C 10.5 14 9.5 16 10 18 C 6.5 16 6 12 8 8 C 8 8 8.5 7 9 6 C 9 6 8.5 10 10.5 10 C 11.5 8 12 2 12 2 Z",
            "M 12 12 C 13 14 13 16 12 19 C 11 17 11 15 12 12 Z",
            Color.Parse("#EF4444"),
            Color.Parse("#F97316"),
            Color.Parse("#FED7AA")
        );
        s_entries[AuroraIconKind.OpenGlCube] = new AuroraIconEntry(
            AuroraIconKind.OpenGlCube,
            "M 12 2 L 21 7 V 17 L 12 22 L 3 17 V 7 Z M 12 2 V 12 M 21 7 L 12 12 M 3 7 L 12 12 M 12 12 V 22",
            "M 7 9.5 L 12 6.5 L 17 9.5 L 12 12.5 Z",
            Color.Parse("#3B82F6"),
            Color.Parse("#06B6D4"),
            Color.Parse("#CFFAFE")
        );
        s_entries[AuroraIconKind.SoftwareCpu] = new AuroraIconEntry(
            AuroraIconKind.SoftwareCpu,
            "M 6 6 H 18 V 18 H 6 Z M 9 2 V 6 M 15 2 V 6 M 9 18 V 22 M 15 18 V 22 M 2 9 H 6 M 2 15 H 6 M 18 9 H 22 M 18 15 H 22",
            "M 8 8 H 16 V 16 H 8 Z M 11 11 H 13 V 13 H 11 Z",
            Color.Parse("#64748B"),
            Color.Parse("#94A3B8"),
            Color.Parse("#E2E8F0")
        );
        s_entries[AuroraIconKind.ShaderPrism] = new AuroraIconEntry(
            AuroraIconKind.ShaderPrism,
            "M 12 3 L 21 19 H 3 Z",
            "M 12 7 L 17 17 H 7 Z M 12 10 V 14",
            Color.Parse("#A855F7"),
            Color.Parse("#EC4899"),
            Color.Parse("#FDF4FF")
        );
        s_entries[AuroraIconKind.TurnipDriver] = new AuroraIconEntry(
            AuroraIconKind.TurnipDriver,
            "M 12 4 C 8 4 6 8 6 12 C 6 16 9 20 12 22 C 15 20 18 16 18 12 C 18 8 16 4 12 4 Z",
            "M 12 2 V 4 M 10 2 L 11 4 M 14 2 L 13 4 M 9 11 H 15 V 13 H 9 Z",
            Color.Parse("#10B981"),
            Color.Parse("#06B6D4"),
            Color.Parse("#CCFBF1")
        );
        s_entries[AuroraIconKind.AudioWaveDsp] = new AuroraIconEntry(
            AuroraIconKind.AudioWaveDsp,
            "M 2 12 H 5 L 8 4 L 11 20 L 14 8 L 17 16 L 20 12 H 22",
            "M 8 12 H 14 M 2 20 H 22 M 2 4 H 22",
            Color.Parse("#F59E0B"),
            Color.Parse("#F43F5E"),
            Color.Parse("#FFE4E6")
        );
        s_entries[AuroraIconKind.MicPulse] = new AuroraIconEntry(
            AuroraIconKind.MicPulse,
            "M 9 4 A 3 3 0 0 1 15 4 V 11 A 3 3 0 0 1 9 11 Z M 5 10 V 11 A 7 7 0 0 0 19 11 V 10 M 12 18 V 22 M 8 22 H 16",
            "M 11 6 H 13 V 9 H 11 Z",
            Color.Parse("#06B6D4"),
            Color.Parse("#3B82F6"),
            Color.Parse("#DBEAFE")
        );
        s_entries[AuroraIconKind.GamepadController] = new AuroraIconEntry(
            AuroraIconKind.GamepadController,
            "M 3 8 C 3 6 5 5 7 5 H 17 C 19 5 21 6 21 8 V 15 C 21 18 18 20 16 18 L 14 16 H 10 L 8 18 C 6 20 3 18 3 15 Z",
            "M 6 10 H 8 V 8 H 9 V 10 H 11 V 11 H 9 V 13 H 8 V 11 H 6 Z M 16 9 A 1 1 0 1 1 16 11 A 1 1 0 0 1 16 9 M 18 11 A 1 1 0 1 1 18 13 A 1 1 0 0 1 18 11",
            Color.Parse("#8B5CF6"),
            Color.Parse("#6366F1"),
            Color.Parse("#EDE9FE")
        );
        s_entries[AuroraIconKind.TouchStylus] = new AuroraIconEntry(
            AuroraIconKind.TouchStylus,
            "M 21 3 L 19 1 L 6 14 L 3 21 L 10 18 Z",
            "M 17 3 L 20 6 M 6 14 L 10 18 M 4 20 L 6 16",
            Color.Parse("#14B8A6"),
            Color.Parse("#06B6D4"),
            Color.Parse("#E0F2FE")
        );
        s_entries[AuroraIconKind.GyroCompass] = new AuroraIconEntry(
            AuroraIconKind.GyroCompass,
            "M 12 2 A 10 10 0 1 0 22 12 A 10 10 0 0 0 12 2 M 12 2 V 4 M 12 20 V 22 M 2 12 H 4 M 20 12 H 22",
            "M 12 6 L 15 12 L 12 10 L 9 12 Z M 12 18 L 9 12 L 12 14 L 15 12 Z",
            Color.Parse("#F59E0B"),
            Color.Parse("#EAB308"),
            Color.Parse("#FEF9C3")
        );
        s_entries[AuroraIconKind.Slot2Gba] = new AuroraIconEntry(
            AuroraIconKind.Slot2Gba,
            "M 3 5 H 21 V 19 H 3 Z M 3 9 H 21 M 8 13 H 16 V 16 H 8 Z",
            "M 6 14 H 7 V 15 H 6 Z M 17 14 H 18 V 15 H 17 Z",
            Color.Parse("#7C3AED"),
            Color.Parse("#A855F7"),
            Color.Parse("#F3E8FF")
        );
        s_entries[AuroraIconKind.Slot2Solar] = new AuroraIconEntry(
            AuroraIconKind.Slot2Solar,
            "M 12 7 A 5 5 0 1 0 17 12 A 5 5 0 0 0 12 7 M 12 1 V 4 M 12 20 V 23 M 1 12 H 4 M 20 12 H 23 M 4.2 4.2 L 6.4 6.4 M 17.6 17.6 L 19.8 19.8 M 4.2 19.8 L 6.4 17.6 M 17.6 6.4 L 19.8 4.2",
            "M 12 9 A 3 3 0 1 0 15 12 A 3 3 0 0 0 12 9 Z",
            Color.Parse("#F59E0B"),
            Color.Parse("#EF4444"),
            Color.Parse("#FFEDD5")
        );
        s_entries[AuroraIconKind.Slot2Guitar] = new AuroraIconEntry(
            AuroraIconKind.Slot2Guitar,
            "M 4 8 H 20 V 16 H 4 Z",
            "M 6 10 H 8 V 14 H 6 Z M 10 10 H 12 V 14 H 10 Z M 14 10 H 16 V 14 H 14 Z M 18 10 H 19 V 14 H 18 Z",
            Color.Parse("#EF4444"),
            Color.Parse("#10B981"),
            Color.Parse("#3B82F6")
        );
        s_entries[AuroraIconKind.Slot2Rumble] = new AuroraIconEntry(
            AuroraIconKind.Slot2Rumble,
            "M 7 6 H 17 V 18 H 7 Z M 4 9 H 5 V 15 H 4 Z M 19 9 H 20 V 15 H 19 Z M 2 11 H 3 V 13 H 2 Z M 21 11 H 22 V 13 H 21 Z",
            "M 10 9 H 14 V 15 H 10 Z",
            Color.Parse("#6366F1"),
            Color.Parse("#A855F7"),
            Color.Parse("#EDE9FE")
        );
        s_entries[AuroraIconKind.Slot2Motion] = new AuroraIconEntry(
            AuroraIconKind.Slot2Motion,
            "M 12 3 A 9 9 0 0 1 21 12 H 18 A 6 6 0 0 0 12 6 Z M 12 21 A 9 9 0 0 1 3 12 H 6 A 6 6 0 0 0 12 18 Z",
            "M 10 12 A 2 2 0 1 1 14 12 A 2 2 0 0 1 10 12 Z",
            Color.Parse("#06B6D4"),
            Color.Parse("#10B981"),
            Color.Parse("#E6FFFA")
        );
        s_entries[AuroraIconKind.Slot2Pedometer] = new AuroraIconEntry(
            AuroraIconKind.Slot2Pedometer,
            "M 6 4 H 18 V 20 H 6 Z M 8 7 H 16 V 11 H 8 Z",
            "M 10 14 H 14 V 17 H 10 Z M 9 18 H 15 V 19 H 9 Z",
            Color.Parse("#10B981"),
            Color.Parse("#84CC16"),
            Color.Parse("#F7FEE7")
        );
        s_entries[AuroraIconKind.Slot2Ram] = new AuroraIconEntry(
            AuroraIconKind.Slot2Ram,
            "M 2 7 H 22 V 17 H 2 Z M 5 17 V 20 M 8 17 V 20 M 11 17 V 20 M 14 17 V 20 M 17 17 V 20 M 20 17 V 20",
            "M 5 10 H 9 V 14 H 5 Z M 11 10 H 15 V 14 H 11 Z M 17 10 H 19 V 14 H 17 Z",
            Color.Parse("#3B82F6"),
            Color.Parse("#8B5CF6"),
            Color.Parse("#DBEAFE")
        );
        s_entries[AuroraIconKind.FolderVault] = new AuroraIconEntry(
            AuroraIconKind.FolderVault,
            "M 3 4 H 9 L 11 6 H 21 V 20 H 3 Z",
            "M 3 8 H 21 V 20 H 3 Z M 11 12 H 13 V 16 H 11 Z",
            Color.Parse("#F59E0B"),
            Color.Parse("#FCD34D"),
            Color.Parse("#FEF3C7")
        );
        s_entries[AuroraIconKind.SearchSpotlight] = new AuroraIconEntry(
            AuroraIconKind.SearchSpotlight,
            "M 10 3 A 7 7 0 1 0 17 10 A 7 7 0 0 0 10 3 M 15 15 L 21 21",
            "M 8 6 A 4 4 0 0 1 12 6",
            Color.Parse("#06B6D4"),
            Color.Parse("#38BDF8"),
            Color.Parse("#BAE6FD")
        );
        s_entries[AuroraIconKind.FilterFunnel] = new AuroraIconEntry(
            AuroraIconKind.FilterFunnel,
            "M 3 4 H 21 L 14 13 V 19 L 10 21 V 13 Z",
            "M 6 6 H 18 L 13 12 H 11 Z",
            Color.Parse("#8B5CF6"),
            Color.Parse("#A78BFA"),
            Color.Parse("#EDE9FE")
        );
        s_entries[AuroraIconKind.SortOrder] = new AuroraIconEntry(
            AuroraIconKind.SortOrder,
            "M 4 6 H 14 M 4 12 H 11 M 4 18 H 8",
            "M 17 8 L 20 5 L 23 8 M 20 5 V 19",
            Color.Parse("#6366F1"),
            Color.Parse("#818CF8"),
            Color.Parse("#E0E7FF")
        );
        s_entries[AuroraIconKind.ThemePalette] = new AuroraIconEntry(
            AuroraIconKind.ThemePalette,
            "M 12 2 A 10 10 0 0 0 2 12 C 2 17 6 21 11 21 C 12 21 13 20 13 19 C 13 18.5 12.8 18 12.5 17.5 C 12.2 17 12 16.5 12 16 C 12 14.9 12.9 14 14 14 H 16 C 19.3 14 22 11.3 22 8 C 22 4.7 17.5 2 12 2 Z",
            "M 6.5 11 A 1.5 1.5 0 1 1 6.5 12.5 A 1.5 1.5 0 0 1 6.5 11 M 9.5 7 A 1.5 1.5 0 1 1 9.5 8.5 A 1.5 1.5 0 0 1 9.5 7 M 14.5 7 A 1.5 1.5 0 1 1 14.5 8.5 A 1.5 1.5 0 0 1 14.5 7 M 17.5 11 A 1.5 1.5 0 1 1 17.5 12.5 A 1.5 1.5 0 0 1 17.5 11",
            Color.Parse("#EC4899"),
            Color.Parse("#A855F7"),
            Color.Parse("#FDF4FF")
        );
        s_entries[AuroraIconKind.LanguageWorld] = new AuroraIconEntry(
            AuroraIconKind.LanguageWorld,
            "M 12 2 A 10 10 0 1 0 22 12 A 10 10 0 0 0 12 2 M 12 2 V 22 M 2 12 H 22",
            "M 5 7 H 19 M 5 17 H 19",
            Color.Parse("#0284C7"),
            Color.Parse("#38BDF8"),
            Color.Parse("#E0F2FE")
        );
        s_entries[AuroraIconKind.UpdateRocket] = new AuroraIconEntry(
            AuroraIconKind.UpdateRocket,
            "M 12 2.5 C 15 4.5 17 8 17 12 L 19 16 L 15 15 L 12 18 L 9 15 L 5 16 L 7 12 C 7 8 9 4.5 12 2.5 Z",
            "M 12 7 A 2 2 0 1 1 10 9 A 2 2 0 0 1 12 7 M 10 20 L 12 23 L 14 20",
            Color.Parse("#F97316"),
            Color.Parse("#EF4444"),
            Color.Parse("#FFEDD5")
        );
        s_entries[AuroraIconKind.ShieldVerified] = new AuroraIconEntry(
            AuroraIconKind.ShieldVerified,
            "M 12 2 L 20 5 V 11 C 20 16.5 16.5 21 12 22 C 7.5 21 4 16.5 4 11 V 5 Z",
            "M 8 11 L 11 14 L 16 9",
            Color.Parse("#10B981"),
            Color.Parse("#34D399"),
            Color.Parse("#D1FAE5")
        );
        s_entries[AuroraIconKind.SyncDevices] = new AuroraIconEntry(
            AuroraIconKind.SyncDevices,
            "M 21 12 A 9 9 0 0 0 6 5.5 L 3 8 M 3 2 V 8 H 9",
            "M 3 12 A 9 9 0 0 0 18 18.5 L 21 16 M 21 22 V 16 H 15",
            Color.Parse("#06B6D4"),
            Color.Parse("#3B82F6"),
            Color.Parse("#CFFAFE")
        );
        s_entries[AuroraIconKind.ScreenshotCamera] = new AuroraIconEntry(
            AuroraIconKind.ScreenshotCamera,
            "M 4 7 H 7 L 9 5 H 15 L 17 7 H 20 C 21 7 22 8 22 9 V 19 C 22 20 21 21 20 21 H 4 C 3 21 2 20 2 19 V 9 C 2 8 3 7 4 7 Z",
            "M 12 10 A 4 4 0 1 0 16 14 A 4 4 0 0 0 12 10 Z",
            Color.Parse("#6366F1"),
            Color.Parse("#8B5CF6"),
            Color.Parse("#DDD6FE")
        );
        s_entries[AuroraIconKind.RepairWrench] = new AuroraIconEntry(
            AuroraIconKind.RepairWrench,
            "M 14.7 3.3 A 6 6 0 0 0 7.8 10.2 L 2.3 15.7 A 2 2 0 0 0 2.3 18.5 L 5.5 21.7 A 2 2 0 0 0 8.3 21.7 L 13.8 16.2 A 6 6 0 0 0 20.7 9.3 L 17.5 12.5 L 14.5 12.5 L 11.5 9.5 L 11.5 6.5 Z",
            "M 4.5 17.5 L 6.5 19.5",
            Color.Parse("#F59E0B"),
            Color.Parse("#D97706"),
            Color.Parse("#FEF3C7")
        );
        s_entries[AuroraIconKind.ImportBox] = new AuroraIconEntry(
            AuroraIconKind.ImportBox,
            "M 4 4 H 20 V 20 H 4 Z M 4 10 H 9 L 10 12 H 14 L 15 10 H 20",
            "M 12 2 V 9 M 9 6 L 12 9 L 15 6",
            Color.Parse("#3B82F6"),
            Color.Parse("#60A5FA"),
            Color.Parse("#DBEAFE")
        );
        s_entries[AuroraIconKind.ExportBox] = new AuroraIconEntry(
            AuroraIconKind.ExportBox,
            "M 4 5 H 20 V 20 H 4 Z M 4 11 H 9 L 10 13 H 14 L 15 11 H 20",
            "M 12 14 V 5 M 9 8 L 12 5 L 15 8",
            Color.Parse("#10B981"),
            Color.Parse("#34D399"),
            Color.Parse("#D1FAE5")
        );
        s_entries[AuroraIconKind.TrashClean] = new AuroraIconEntry(
            AuroraIconKind.TrashClean,
            "M 4 6 H 20 M 10 3 H 14 M 6 6 L 7 20 H 17 L 18 6",
            "M 10 10 V 16 M 14 10 V 16",
            Color.Parse("#EF4444"),
            Color.Parse("#F87171"),
            Color.Parse("#FEE2E2")
        );
        s_entries[AuroraIconKind.InfoCrystal] = new AuroraIconEntry(
            AuroraIconKind.InfoCrystal,
            "M 12 2 L 20 7 V 17 L 12 22 L 4 17 V 7 Z",
            "M 12 7 H 12.01 M 11 10 H 13 V 16 H 11",
            Color.Parse("#06B6D4"),
            Color.Parse("#38BDF8"),
            Color.Parse("#E0F2FE")
        );
        s_entries[AuroraIconKind.WarningAmber] = new AuroraIconEntry(
            AuroraIconKind.WarningAmber,
            "M 12 3 L 22 20 H 2 Z",
            "M 12 8 V 13 M 12 16 H 12.01",
            Color.Parse("#F59E0B"),
            Color.Parse("#FBBF24"),
            Color.Parse("#FEF3C7")
        );
        s_entries[AuroraIconKind.CheckSuccess] = new AuroraIconEntry(
            AuroraIconKind.CheckSuccess,
            "M 12 2 A 10 10 0 1 0 22 12 A 10 10 0 0 0 12 2",
            "M 7 12 L 10.5 15.5 L 17 8.5",
            Color.Parse("#10B981"),
            Color.Parse("#34D399"),
            Color.Parse("#ECFDF5")
        );
        s_entries[AuroraIconKind.WindowMinimize] = new AuroraIconEntry(
            AuroraIconKind.WindowMinimize,
            "M 4 18 H 20",
            "M 4 19 H 20",
            Color.Parse("#94A3B8"),
            Color.Parse("#CBD5E1"),
            Color.Parse("#F1F5F9")
        );
        s_entries[AuroraIconKind.WindowMaximize] = new AuroraIconEntry(
            AuroraIconKind.WindowMaximize,
            "M 4 4 H 20 V 20 H 4 Z",
            "M 6 6 H 18 V 18 H 6 Z",
            Color.Parse("#94A3B8"),
            Color.Parse("#CBD5E1"),
            Color.Parse("#F1F5F9")
        );
        s_entries[AuroraIconKind.WindowRestore] = new AuroraIconEntry(
            AuroraIconKind.WindowRestore,
            "M 8 4 H 20 V 16 H 8 Z",
            "M 4 8 H 16 V 20 H 4 Z",
            Color.Parse("#94A3B8"),
            Color.Parse("#CBD5E1"),
            Color.Parse("#F1F5F9")
        );
        s_entries[AuroraIconKind.WindowClose] = new AuroraIconEntry(
            AuroraIconKind.WindowClose,
            "M 5 5 L 19 19",
            "M 19 5 L 5 19",
            Color.Parse("#E81123"),
            Color.Parse("#F87171"),
            Color.Parse("#FECACA")
        );
        s_entries[AuroraIconKind.HamburgerMenu] = new AuroraIconEntry(
            AuroraIconKind.HamburgerMenu,
            "M 3 6 H 21 M 3 12 H 21",
            "M 3 18 H 21",
            Color.Parse("#8B5CF6"),
            Color.Parse("#A78BFA"),
            Color.Parse("#DDD6FE")
        );
        s_entries[AuroraIconKind.ChevronRight] = new AuroraIconEntry(
            AuroraIconKind.ChevronRight,
            "M 9 5 L 16 12 L 9 19",
            "M 8 6 L 14 12 L 8 18",
            Color.Parse("#94A3B8"),
            Color.Parse("#CBD5E1"),
            Color.Parse("#F1F5F9")
        );
        s_entries[AuroraIconKind.ChevronDown] = new AuroraIconEntry(
            AuroraIconKind.ChevronDown,
            "M 5 9 L 12 16 L 19 9",
            "M 6 8 L 12 14 L 18 8",
            Color.Parse("#94A3B8"),
            Color.Parse("#CBD5E1"),
            Color.Parse("#F1F5F9")
        );
        s_entries[AuroraIconKind.LockHardcore] = new AuroraIconEntry(
            AuroraIconKind.LockHardcore,
            "M 5 11 H 19 V 21 H 5 Z",
            "M 8 11 V 7 A 4 4 0 0 1 16 7 V 11 M 12 14 V 17",
            Color.Parse("#F59E0B"),
            Color.Parse("#D97706"),
            Color.Parse("#FEF3C7")
        );
        s_entries[AuroraIconKind.VoiceTts] = new AuroraIconEntry(
            AuroraIconKind.VoiceTts,
            "M 3 9 H 7 L 12 4 V 20 L 7 15 H 3 Z",
            "M 16 8 A 5 5 0 0 1 16 16 M 19 5 A 9 9 0 0 1 19 19",
            Color.Parse("#A855F7"),
            Color.Parse("#EC4899"),
            Color.Parse("#FDF4FF")
        );
        s_entries[AuroraIconKind.SpeedGauge] = new AuroraIconEntry(
            AuroraIconKind.SpeedGauge,
            "M 3 14 A 9 9 0 0 1 21 14 H 18 A 6 6 0 0 0 6 14 Z",
            "M 12 14 L 16 9 M 10 14 A 2 2 0 1 1 14 14",
            Color.Parse("#10B981"),
            Color.Parse("#3B82F6"),
            Color.Parse("#BAE6FD")
        );
        s_entries[AuroraIconKind.BatteryPower] = new AuroraIconEntry(
            AuroraIconKind.BatteryPower,
            "M 2 7 H 18 V 17 H 2 Z M 18 10 H 21 V 14 H 18",
            "M 5 10 H 15 V 14 H 5 Z",
            Color.Parse("#10B981"),
            Color.Parse("#22C55E"),
            Color.Parse("#DCFCE7")
        );
        s_entries[AuroraIconKind.MemoryRam] = new AuroraIconEntry(
            AuroraIconKind.MemoryRam,
            "M 4 5 H 20 V 19 H 4 Z",
            "M 7 8 H 10 V 16 H 7 Z M 14 8 H 17 V 16 H 14 Z M 2 12 H 4 M 20 12 H 22",
            Color.Parse("#3B82F6"),
            Color.Parse("#6366F1"),
            Color.Parse("#DBEAFE")
        );
        s_entries[AuroraIconKind.FullScreenExpand] = new AuroraIconEntry(
            AuroraIconKind.FullScreenExpand,
            "M 3 8 V 3 H 8 M 21 8 V 3 H 16 M 3 16 V 21 H 8 M 21 16 V 21 H 16",
            "M 4 4 L 9 9 M 20 4 L 15 9 M 4 20 L 9 15 M 20 20 L 15 15",
            Color.Parse("#00F0FF"),
            Color.Parse("#38BDF8"),
            Color.Parse("#E0F2FE")
        );
        s_entries[AuroraIconKind.LidHinge] = new AuroraIconEntry(
            AuroraIconKind.LidHinge,
            "M 4 3 H 20 V 9 H 4 Z M 4 15 H 20 V 21 H 4 Z",
            "M 2 11 H 22 V 13 H 2 Z M 6 11 H 10 V 13 H 6 Z M 14 11 H 18 V 13 H 14 Z",
            Color.Parse("#64748B"),
            Color.Parse("#94A3B8"),
            Color.Parse("#CBD5E1")
        );
        s_entries[AuroraIconKind.RomCartridge] = new AuroraIconEntry(
            AuroraIconKind.RomCartridge,
            "M 4 3 H 18 L 20 5 V 21 H 4 Z",
            "M 7 7 H 17 V 13 H 7 Z M 7 16 H 17 V 19 H 7 Z",
            Color.Parse("#06B6D4"),
            Color.Parse("#0284C7"),
            Color.Parse("#BAE6FD")
        );
        s_entries[AuroraIconKind.DsiWareBadge] = new AuroraIconEntry(
            AuroraIconKind.DsiWareBadge,
            "M 3 4 H 21 V 16 H 15 L 12 20 L 9 16 H 3 Z",
            "M 6 8 H 18 V 12 H 6 Z M 11 14 H 13 V 15 H 11 Z",
            Color.Parse("#8B5CF6"),
            Color.Parse("#D946EF"),
            Color.Parse("#F5D0FE")
        );
        VerifyZeroDuplicates();
    }

    public static IReadOnlyDictionary<AuroraIconKind, AuroraIconEntry> Entries => s_entries;

    public static AuroraIconEntry GetEntry(AuroraIconKind kind)
    {
        if (s_entries.TryGetValue(kind, out var entry)) return entry;
        return s_entries[AuroraIconKind.LibraryGrid];
    }

    /// <summary>
    /// Rigorously validates that all 72 icon definitions possess strictly unique geometries without any duplicates.
    /// </summary>
    public static void VerifyZeroDuplicates()
    {
        var primarySet = new HashSet<string>(StringComparer.Ordinal);
        var secondarySet = new HashSet<string>(StringComparer.Ordinal);
        var kindSet = new HashSet<AuroraIconKind>();

        foreach (var (kind, entry) in s_entries)
        {
            if (!kindSet.Add(kind))
                throw new InvalidOperationException($"Duplicate AuroraIconKind: {kind}");
            if (!primarySet.Add(entry.PrimaryPath))
                throw new InvalidOperationException($"Duplicate primary path for {kind}");
            if (!secondarySet.Add(entry.SecondaryPath))
                throw new InvalidOperationException($"Duplicate secondary path for {kind}");
        }

        if (s_entries.Count < 72)
            throw new InvalidOperationException($"Expected at least 72 icons, found {s_entries.Count}");
    }
}