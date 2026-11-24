using System;
using Avalonia.Media;

namespace Storm.AuroraFluid.Kit.Themes;

/// <summary>
/// Immutable definition of a canonical STORM theme.
/// </summary>
public sealed record AuroraThemeDefinition(
    string Id,
    string DisplayName,
    Color BackgroundColor,
    Color HeaderColor,
    Color CardColor,
    Color BorderColor,
    Color DefaultAccentColor,
    Color DefaultAccentSecondaryColor,
    Color TextPrimaryColor,
    Color TextSecondaryColor,
    Color GlowColor,
    bool IsDark = true
)
{
    public IBrush BackgroundBrush { get; } = new SolidColorBrush(BackgroundColor);
    public IBrush HeaderBrush { get; } = new SolidColorBrush(HeaderColor);
    public IBrush CardBrush { get; } = new SolidColorBrush(CardColor);
    public IBrush GlassBrush { get; } = new SolidColorBrush(Color.FromArgb(190, CardColor.R, CardColor.G, CardColor.B));
    public IBrush BorderBrush { get; } = new SolidColorBrush(BorderColor);
    public IBrush TextPrimaryBrush { get; } = new SolidColorBrush(TextPrimaryColor);
    public IBrush TextSecondaryBrush { get; } = new SolidColorBrush(TextSecondaryColor);
}

/// <summary>
/// Predefined canonical accent color overrides.
/// </summary>
public enum AuroraAccentKind
{
    DefaultThemeAccent,
    Violet,
    Cyan,
    ElectricBlue,
    RoyalIndigo,
    TealMint,
    EmeraldGreen,
    NeonLime,
    AmberGold,
    SolarOrange,
    CrimsonRed,
    RosePink,
    MagentaFuchsia,
    PlatinumSilver
}

/// <summary>
/// Predefined typography presets for STORM applications.
/// </summary>
public enum AuroraTypographyPreset
{
    Inter,
    PlusJakartaSans,
    GeistSans,
    Manrope,
    Outfit,
    Montserrat,
    Rubik,
    Orbitron,
    JetBrainsMono,
    CascadiaCode
}
