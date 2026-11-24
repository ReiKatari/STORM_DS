using System;
using System.Collections.Generic;
using Avalonia;
using Avalonia.Media;

namespace Storm.AuroraFluid.Kit.Themes;

/// <summary>
/// Universal dynamic theme manager for STORM applications.
/// Governs all 9 canonical themes, 13 accent overrides, and 10 typography presets with live resource propagation.
/// </summary>
public sealed class AuroraThemeManager
{
    private static readonly Lazy<AuroraThemeManager> s_lazyInstance = new(() => new AuroraThemeManager());
    public static AuroraThemeManager Instance => s_lazyInstance.Value;

    public const string ThemeMidnight = "MIDNIGHT";
    public const string ThemeNight = "NIGHT";
    public const string ThemeDark = "DARK";
    public const string ThemeDay = "DAY";
    public const string ThemeFantasy = "FANTASY";
    public const string ThemeCyberpunk = "CYBERPUNK";
    public const string ThemeWarhammer40K = "WARHAMMER 40K";
    public const string ThemeElemental = "ELEMENTAL";
    public const string ThemeStorm = "STORM";

    private readonly Dictionary<string, AuroraThemeDefinition> _themes = new(StringComparer.OrdinalIgnoreCase);

    public AuroraThemeDefinition CurrentTheme { get; private set; } = null!;
    public AuroraAccentKind CurrentAccentOverride { get; private set; } = AuroraAccentKind.DefaultThemeAccent;
    public AuroraTypographyPreset CurrentTypography { get; private set; } = AuroraTypographyPreset.Inter;

    public event Action<AuroraThemeDefinition>? ThemeChanged;

    private AuroraThemeManager()
    {
        RegisterCanonicalThemes();
        CurrentTheme = _themes[ThemeMidnight];
    }

    private void RegisterCanonicalThemes()
    {
        // 1. MIDNIGHT (Default - Dark Amethyst & Neon Violet)
        _themes[ThemeMidnight] = new AuroraThemeDefinition(
            Id: ThemeMidnight,
            DisplayName: "STORM MIDNIGHT",
            BackgroundColor: Color.Parse("#0D0B18"),
            HeaderColor: Color.Parse("#130F24"),
            CardColor: Color.Parse("#1A1630"),
            BorderColor: Color.Parse("#2E2850"),
            DefaultAccentColor: Color.Parse("#8B5CF6"),
            DefaultAccentSecondaryColor: Color.Parse("#A78BFA"),
            TextPrimaryColor: Color.Parse("#F8FAFC"),
            TextSecondaryColor: Color.Parse("#94A3B8"),
            GlowColor: Color.Parse("#8B5CF6"),
            IsDark: true
        );

        // 2. NIGHT (Pure Black OLED & Electric Cyan)
        _themes[ThemeNight] = new AuroraThemeDefinition(
            Id: ThemeNight,
            DisplayName: "STORM NIGHT",
            BackgroundColor: Color.Parse("#000000"),
            HeaderColor: Color.Parse("#08080C"),
            CardColor: Color.Parse("#0F1015"),
            BorderColor: Color.Parse("#1E2028"),
            DefaultAccentColor: Color.Parse("#00F0FF"),
            DefaultAccentSecondaryColor: Color.Parse("#38BDF8"),
            TextPrimaryColor: Color.Parse("#FFFFFF"),
            TextSecondaryColor: Color.Parse("#94A3B8"),
            GlowColor: Color.Parse("#00F0FF"),
            IsDark: true
        );

        // 3. DARK (Slate Cyber & Cyan)
        _themes[ThemeDark] = new AuroraThemeDefinition(
            Id: ThemeDark,
            DisplayName: "STORM DARK",
            BackgroundColor: Color.Parse("#111318"),
            HeaderColor: Color.Parse("#161A22"),
            CardColor: Color.Parse("#1D222E"),
            BorderColor: Color.Parse("#2C3446"),
            DefaultAccentColor: Color.Parse("#00D2FF"),
            DefaultAccentSecondaryColor: Color.Parse("#38BDF8"),
            TextPrimaryColor: Color.Parse("#F1F5F9"),
            TextSecondaryColor: Color.Parse("#94A3B8"),
            GlowColor: Color.Parse("#00D2FF"),
            IsDark: true
        );

        // 4. DAY (High-Contrast Light & Ocean Blue)
        _themes[ThemeDay] = new AuroraThemeDefinition(
            Id: ThemeDay,
            DisplayName: "STORM DAY",
            BackgroundColor: Color.Parse("#F8FAFC"),
            HeaderColor: Color.Parse("#EDF2F7"),
            CardColor: Color.Parse("#FFFFFF"),
            BorderColor: Color.Parse("#E2E8F0"),
            DefaultAccentColor: Color.Parse("#0284C7"),
            DefaultAccentSecondaryColor: Color.Parse("#0EA5E9"),
            TextPrimaryColor: Color.Parse("#0F172A"),
            TextSecondaryColor: Color.Parse("#475569"),
            GlowColor: Color.Parse("#0284C7"),
            IsDark: false
        );

        // 5. FANTASY (Royal Gold & Deep Midnight Blue)
        _themes[ThemeFantasy] = new AuroraThemeDefinition(
            Id: ThemeFantasy,
            DisplayName: "STORM FANTASY",
            BackgroundColor: Color.Parse("#0E1324"),
            HeaderColor: Color.Parse("#141A33"),
            CardColor: Color.Parse("#1B2342"),
            BorderColor: Color.Parse("#2A3563"),
            DefaultAccentColor: Color.Parse("#D4AF37"),
            DefaultAccentSecondaryColor: Color.Parse("#F59E0B"),
            TextPrimaryColor: Color.Parse("#FFFBEB"),
            TextSecondaryColor: Color.Parse("#CBD5E1"),
            GlowColor: Color.Parse("#D4AF37"),
            IsDark: true
        );

        // 6. CYBERPUNK (Neon Night City - Yellow & Hot Pink)
        _themes[ThemeCyberpunk] = new AuroraThemeDefinition(
            Id: ThemeCyberpunk,
            DisplayName: "STORM CYBERPUNK",
            BackgroundColor: Color.Parse("#0B0A10"),
            HeaderColor: Color.Parse("#13111C"),
            CardColor: Color.Parse("#1B1829"),
            BorderColor: Color.Parse("#2B2542"),
            DefaultAccentColor: Color.Parse("#FCEE09"),
            DefaultAccentSecondaryColor: Color.Parse("#FF007F"),
            TextPrimaryColor: Color.Parse("#FFFFFF"),
            TextSecondaryColor: Color.Parse("#A3A0B5"),
            GlowColor: Color.Parse("#FCEE09"),
            IsDark: true
        );

        // 7. WARHAMMER 40K (Imperial Gothic Gold & Dark Titanium)
        _themes[ThemeWarhammer40K] = new AuroraThemeDefinition(
            Id: ThemeWarhammer40K,
            DisplayName: "STORM WARHAMMER 40K",
            BackgroundColor: Color.Parse("#0C0A08"),
            HeaderColor: Color.Parse("#15120E"),
            CardColor: Color.Parse("#1E1A14"),
            BorderColor: Color.Parse("#322B22"),
            DefaultAccentColor: Color.Parse("#CA8A04"),
            DefaultAccentSecondaryColor: Color.Parse("#D4AF37"),
            TextPrimaryColor: Color.Parse("#FDF6E2"),
            TextSecondaryColor: Color.Parse("#A8A29E"),
            GlowColor: Color.Parse("#CA8A04"),
            IsDark: true
        );

        // 8. ELEMENTAL (Matrix Emerald & Forest Cyber)
        _themes[ThemeElemental] = new AuroraThemeDefinition(
            Id: ThemeElemental,
            DisplayName: "STORM ELEMENTAL",
            BackgroundColor: Color.Parse("#091318"),
            HeaderColor: Color.Parse("#0E1C24"),
            CardColor: Color.Parse("#142732"),
            BorderColor: Color.Parse("#203D4E"),
            DefaultAccentColor: Color.Parse("#10B981"),
            DefaultAccentSecondaryColor: Color.Parse("#34D399"),
            TextPrimaryColor: Color.Parse("#ECFDF5"),
            TextSecondaryColor: Color.Parse("#94A3B8"),
            GlowColor: Color.Parse("#10B981"),
            IsDark: true
        );

        // 9. STORM (Aurora Plasma - Deep Void & Electric Magenta-Violet)
        _themes[ThemeStorm] = new AuroraThemeDefinition(
            Id: ThemeStorm,
            DisplayName: "STORM AURORA",
            BackgroundColor: Color.Parse("#090714"),
            HeaderColor: Color.Parse("#100E24"),
            CardColor: Color.Parse("#181533"),
            BorderColor: Color.Parse("#282254"),
            DefaultAccentColor: Color.Parse("#A855F7"),
            DefaultAccentSecondaryColor: Color.Parse("#EC4899"),
            TextPrimaryColor: Color.Parse("#FAF5FF"),
            TextSecondaryColor: Color.Parse("#A8A29E"),
            GlowColor: Color.Parse("#A855F7"),
            IsDark: true
        );
    }

    public IReadOnlyCollection<AuroraThemeDefinition> GetAvailableThemes() => _themes.Values;

    public void ApplyTheme(string themeId, AuroraAccentKind? accentOverride = null, AuroraTypographyPreset? typography = null)
    {
        if (_themes.TryGetValue(themeId, out var foundTheme))
        {
            CurrentTheme = foundTheme;
        }

        if (accentOverride.HasValue)
        {
            CurrentAccentOverride = accentOverride.Value;
        }

        if (typography.HasValue)
        {
            CurrentTypography = typography.Value;
        }

        UpdateApplicationResources();
        ThemeChanged?.Invoke(CurrentTheme);
    }

    public static (Color Primary, Color Secondary) ResolveAccentColors(AuroraThemeDefinition theme, AuroraAccentKind overrideKind)
    {
        return overrideKind switch
        {
            AuroraAccentKind.Violet => (Color.Parse("#8B5CF6"), Color.Parse("#A78BFA")),
            AuroraAccentKind.Cyan => (Color.Parse("#06B6D4"), Color.Parse("#22D3EE")),
            AuroraAccentKind.ElectricBlue => (Color.Parse("#00F0FF"), Color.Parse("#38BDF8")),
            AuroraAccentKind.RoyalIndigo => (Color.Parse("#6366F1"), Color.Parse("#818CF8")),
            AuroraAccentKind.TealMint => (Color.Parse("#14B8A6"), Color.Parse("#2DD4BF")),
            AuroraAccentKind.EmeraldGreen => (Color.Parse("#10B981"), Color.Parse("#34D399")),
            AuroraAccentKind.NeonLime => (Color.Parse("#84CC16"), Color.Parse("#A3E635")),
            AuroraAccentKind.AmberGold => (Color.Parse("#F59E0B"), Color.Parse("#FBBF24")),
            AuroraAccentKind.SolarOrange => (Color.Parse("#F97316"), Color.Parse("#FB923C")),
            AuroraAccentKind.CrimsonRed => (Color.Parse("#EF4444"), Color.Parse("#F87171")),
            AuroraAccentKind.RosePink => (Color.Parse("#F43F5E"), Color.Parse("#FB7185")),
            AuroraAccentKind.MagentaFuchsia => (Color.Parse("#D946EF"), Color.Parse("#E879F9")),
            AuroraAccentKind.PlatinumSilver => (Color.Parse("#94A3B8"), Color.Parse("#CBD5E1")),
            _ => (theme.DefaultAccentColor, theme.DefaultAccentSecondaryColor)
        };
    }

    public static FontFamily ResolveFontFamily(AuroraTypographyPreset preset)
    {
        return preset switch
        {
            AuroraTypographyPreset.Inter => new FontFamily("Inter, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, sans-serif"),
            AuroraTypographyPreset.PlusJakartaSans => new FontFamily("'Plus Jakarta Sans', Inter, 'Segoe UI', sans-serif"),
            AuroraTypographyPreset.GeistSans => new FontFamily("'Geist Sans', Inter, 'Segoe UI', sans-serif"),
            AuroraTypographyPreset.Manrope => new FontFamily("Manrope, Inter, 'Segoe UI', sans-serif"),
            AuroraTypographyPreset.Outfit => new FontFamily("Outfit, Inter, 'Segoe UI', sans-serif"),
            AuroraTypographyPreset.Montserrat => new FontFamily("Montserrat, Inter, 'Segoe UI', sans-serif"),
            AuroraTypographyPreset.Rubik => new FontFamily("Rubik, Inter, 'Segoe UI', sans-serif"),
            AuroraTypographyPreset.Orbitron => new FontFamily("Orbitron, Inter, 'Segoe UI', sans-serif"),
            AuroraTypographyPreset.JetBrainsMono => new FontFamily("'JetBrains Mono', 'Cascadia Code', Consolas, monospace"),
            AuroraTypographyPreset.CascadiaCode => new FontFamily("'Cascadia Code', 'JetBrains Mono', Consolas, monospace"),
            _ => new FontFamily("Inter, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, sans-serif")
        };
    }

    public void UpdateApplicationResources()
    {
        var app = Application.Current;
        if (app == null) return;

        var res = app.Resources;
        var theme = CurrentTheme;
        var (accentPrimary, accentSecondary) = ResolveAccentColors(theme, CurrentAccentOverride);

        // Core Brushes
        res["StormBgBrush"] = theme.BackgroundBrush;
        res["StormHeaderBrush"] = theme.HeaderBrush;
        res["StormGlassBrush"] = theme.GlassBrush;
        res["StormCardBrush"] = theme.CardBrush;
        res["StormBorderBrush"] = theme.BorderBrush;

        // Accent Brushes
        res["StormAccentBrush"] = new SolidColorBrush(accentPrimary);
        res["StormAccentSecondaryBrush"] = new SolidColorBrush(accentSecondary);
        res["StormAccentGlowColor"] = accentPrimary;
        res["StormAccentGlowBrush"] = new SolidColorBrush(Color.FromArgb(90, accentPrimary.R, accentPrimary.G, accentPrimary.B));

        // Typography Colors (Enforcing Law 10: 0% black text in dark themes)
        var primaryText = theme.IsDark ? (theme.TextPrimaryColor.R < 180 && theme.TextPrimaryColor.G < 180 && theme.TextPrimaryColor.B < 180 ? Color.Parse("#F8FAFC") : theme.TextPrimaryColor) : theme.TextPrimaryColor;
        var secondaryText = theme.IsDark ? (theme.TextSecondaryColor.R < 120 && theme.TextSecondaryColor.G < 120 && theme.TextSecondaryColor.B < 120 ? Color.Parse("#94A3B8") : theme.TextSecondaryColor) : theme.TextSecondaryColor;

        res["StormTextPrimaryBrush"] = new SolidColorBrush(primaryText);
        res["StormTextSecondaryBrush"] = new SolidColorBrush(secondaryText);

        // Gradients
        var heroGradient = new LinearGradientBrush
        {
            StartPoint = new RelativePoint(0, 0, RelativeUnit.Relative),
            EndPoint = new RelativePoint(1, 1, RelativeUnit.Relative),
            GradientStops =
            {
                new GradientStop(accentPrimary, 0.0),
                new GradientStop(accentSecondary, 1.0)
            }
        };
        res["StormHeroGradientBrush"] = heroGradient;

        var plasmaGradient = new LinearGradientBrush
        {
            StartPoint = new RelativePoint(0, 0, RelativeUnit.Relative),
            EndPoint = new RelativePoint(1, 1, RelativeUnit.Relative),
            GradientStops =
            {
                new GradientStop(Color.FromArgb(220, accentPrimary.R, accentPrimary.G, accentPrimary.B), 0.0),
                new GradientStop(Color.FromArgb(180, accentSecondary.R, accentSecondary.G, accentSecondary.B), 0.5),
                new GradientStop(Color.FromArgb(230, theme.CardColor.R, theme.CardColor.G, theme.CardColor.B), 1.0)
            }
        };
        res["StormPlasmaBrush"] = plasmaGradient;

        // Font Family and Metadata
        res["StormFontFamily"] = ResolveFontFamily(CurrentTypography);
        res["StormThemeId"] = theme.Id;
        res["StormIsDarkTheme"] = theme.IsDark;
    }
}
