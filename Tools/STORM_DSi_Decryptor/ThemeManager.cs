using System;
using System.Collections.Generic;
using System.Windows;
using System.Windows.Media;
using Color = System.Windows.Media.Color;

namespace StormDsiDecryptor;

public class ThemeDefinition
{
    public string Name { get; set; } = string.Empty;
    public string DisplayName { get; set; } = string.Empty;
    public Color Background { get; set; }
    public Color CardBackground { get; set; }
    public Color CardBorder { get; set; }
    public Color Accent { get; set; }
    public Color TextPrimary { get; set; }
    public Color TextSecondary { get; set; }
    public Color Success { get; set; }
    public Color Warning { get; set; }
}

public record AccentDefinition(string Name, Color Color);
public record FontDefinition(string DisplayName, string FontFamilyString);

public static class ThemeManager
{
    public static readonly List<ThemeDefinition> Themes = new()
    {
        new() {
            Name = "MIDNIGHT", DisplayName = "MIDNIGHT (Фиолетовая)",
            Background = Color.FromRgb(0x0D, 0x0B, 0x18),
            CardBackground = Color.FromRgb(0x17, 0x13, 0x2B),
            CardBorder = Color.FromArgb(0x40, 0x8B, 0x5C, 0xF6),
            Accent = Color.FromRgb(0x8B, 0x5C, 0xF6),
            TextPrimary = Color.FromRgb(0xF8, 0xFA, 0xFC),
            TextSecondary = Color.FromRgb(0xC0, 0x84, 0xFC),
            Success = Color.FromRgb(0x10, 0xB9, 0x81),
            Warning = Color.FromRgb(0xF5, 0x9E, 0x0B)
        },
        new() {
            Name = "NIGHT", DisplayName = "NIGHT (Чёрная OLED)",
            Background = Color.FromRgb(0x00, 0x00, 0x00),
            CardBackground = Color.FromRgb(0x0A, 0x0A, 0x0E),
            CardBorder = Color.FromArgb(0x35, 0x33, 0x33, 0x33),
            Accent = Color.FromRgb(0x00, 0xF0, 0xFF),
            TextPrimary = Color.FromRgb(0xFF, 0xFF, 0xFF),
            TextSecondary = Color.FromRgb(0x8B, 0x94, 0x9E),
            Success = Color.FromRgb(0x00, 0xE6, 0x76),
            Warning = Color.FromRgb(0xFF, 0xB3, 0x00)
        },
        new() {
            Name = "DARK", DisplayName = "DARK (Графитовая)",
            Background = Color.FromRgb(0x11, 0x13, 0x18),
            CardBackground = Color.FromRgb(0x18, 0x1B, 0x24),
            CardBorder = Color.FromArgb(0x35, 0x3B, 0x82, 0xF6),
            Accent = Color.FromRgb(0x3B, 0x82, 0xF6),
            TextPrimary = Color.FromRgb(0xF1, 0xF5, 0xF9),
            TextSecondary = Color.FromRgb(0x94, 0xA3, 0xB8),
            Success = Color.FromRgb(0x10, 0xB9, 0x81),
            Warning = Color.FromRgb(0xF5, 0x9E, 0x0B)
        },
        new() {
            Name = "DAY", DisplayName = "DAY (Светлая)",
            Background = Color.FromRgb(0xF8, 0xFA, 0xFC),
            CardBackground = Color.FromRgb(0xFF, 0xFF, 0xFF),
            CardBorder = Color.FromArgb(0x35, 0xCB, 0xD5, 0xE1),
            Accent = Color.FromRgb(0x63, 0x66, 0xF1),
            TextPrimary = Color.FromRgb(0x0F, 0x17, 0x2A),
            TextSecondary = Color.FromRgb(0x64, 0x74, 0x8B),
            Success = Color.FromRgb(0x05, 0x96, 0x69),
            Warning = Color.FromRgb(0xD9, 0x77, 0x06)
        },
        new() {
            Name = "FANTASY", DisplayName = "FANTASY (Астрал & Золото)",
            Background = Color.FromRgb(0x0E, 0x13, 0x24),
            CardBackground = Color.FromRgb(0x17, 0x1F, 0x38),
            CardBorder = Color.FromArgb(0x40, 0xD4, 0xAF, 0x37),
            Accent = Color.FromRgb(0xD4, 0xAF, 0x37),
            TextPrimary = Color.FromRgb(0xFE, 0xF9, 0xC3),
            TextSecondary = Color.FromRgb(0xFD, 0xE0, 0x47),
            Success = Color.FromRgb(0x34, 0xD3, 0x99),
            Warning = Color.FromRgb(0xF5, 0x9E, 0x0B)
        },
        new() {
            Name = "CYBERPUNK", DisplayName = "CYBERPUNK 2077",
            Background = Color.FromRgb(0x0B, 0x0A, 0x10),
            CardBackground = Color.FromRgb(0x1A, 0x16, 0x26),
            CardBorder = Color.FromArgb(0x40, 0xFC, 0xEE, 0x09),
            Accent = Color.FromRgb(0xFC, 0xEE, 0x09),
            TextPrimary = Color.FromRgb(0xFF, 0xFF, 0xFF),
            TextSecondary = Color.FromRgb(0x00, 0xF0, 0xFF),
            Success = Color.FromRgb(0x00, 0xF0, 0xFF),
            Warning = Color.FromRgb(0xFF, 0x00, 0x3C)
        },
        new() {
            Name = "WARHAMMER 40K", DisplayName = "WARHAMMER 40K (Когитатор)",
            Background = Color.FromRgb(0x0C, 0x0A, 0x08),
            CardBackground = Color.FromRgb(0x1A, 0x16, 0x12),
            CardBorder = Color.FromArgb(0x40, 0xCA, 0x8A, 0x04),
            Accent = Color.FromRgb(0xCA, 0x8A, 0x04),
            TextPrimary = Color.FromRgb(0xFD, 0xFA, 0xF0),
            TextSecondary = Color.FromRgb(0xA8, 0xA2, 0x9E),
            Success = Color.FromRgb(0x22, 0xC5, 0x5E),
            Warning = Color.FromRgb(0x99, 0x1B, 0x1B)
        },
        new() {
            Name = "ELEMENTAL", DisplayName = "ELEMENTAL (Стихии)",
            Background = Color.FromRgb(0x09, 0x13, 0x18),
            CardBackground = Color.FromRgb(0x10, 0x20, 0x28),
            CardBorder = Color.FromArgb(0x40, 0x0E, 0xA5, 0xE9),
            Accent = Color.FromRgb(0x0E, 0xA5, 0xE9),
            TextPrimary = Color.FromRgb(0xF0, 0xFD, 0xF4),
            TextSecondary = Color.FromRgb(0x38, 0xBD, 0xF8),
            Success = Color.FromRgb(0x10, 0xB9, 0x81),
            Warning = Color.FromRgb(0xF9, 0x73, 0x16)
        },
        new() {
            Name = "STORM", DisplayName = "STORM (Плазменный Шторм)",
            Background = Color.FromRgb(0x07, 0x05, 0x10),
            CardBackground = Color.FromRgb(0x14, 0x0E, 0x28),
            CardBorder = Color.FromArgb(0x45, 0x8B, 0x5C, 0xF6),
            Accent = Color.FromRgb(0x8B, 0x5C, 0xF6),
            TextPrimary = Color.FromRgb(0xFF, 0xFF, 0xFF),
            TextSecondary = Color.FromRgb(0xA7, 0x8B, 0xFA),
            Success = Color.FromRgb(0x06, 0xB6, 0xD4),
            Warning = Color.FromRgb(0xF4, 0x3F, 0x5E)
        }
    };

    public static readonly AccentDefinition[] Accents = new AccentDefinition[]
    {
        new("Violet (#8B5CF6)", Color.FromRgb(139, 92, 246)),
        new("Cyan (#06B6D4)", Color.FromRgb(6, 182, 212)),
        new("Electric Blue (#3B82F6)", Color.FromRgb(59, 130, 246)),
        new("Royal Indigo (#6366F1)", Color.FromRgb(99, 102, 241)),
        new("Teal Mint (#14B8A6)", Color.FromRgb(20, 184, 166)),
        new("Emerald Green (#10B981)", Color.FromRgb(16, 185, 129)),
        new("Neon Lime (#84CC16)", Color.FromRgb(132, 204, 22)),
        new("Amber Gold (#F59E0B)", Color.FromRgb(245, 158, 11)),
        new("Solar Orange (#F97316)", Color.FromRgb(249, 115, 22)),
        new("Crimson Red (#EF4444)", Color.FromRgb(239, 68, 68)),
        new("Rose Pink (#F43F5E)", Color.FromRgb(244, 63, 94)),
        new("Magenta Fuchsia (#EC4899)", Color.FromRgb(236, 72, 153)),
        new("Platinum Silver (#E2E8F0)", Color.FromRgb(226, 232, 240))
    };

    public static readonly FontDefinition[] Fonts = new FontDefinition[]
    {
        new("Inter Variable", "Inter Variable, Inter, Segoe UI, sans-serif"),
        new("Plus Jakarta Sans", "Plus Jakarta Sans, Segoe UI, sans-serif"),
        new("Geist Sans", "Geist Sans, Segoe UI, sans-serif"),
        new("Manrope", "Manrope, Segoe UI, sans-serif"),
        new("Outfit", "Outfit, Segoe UI, sans-serif"),
        new("Montserrat", "Montserrat, Segoe UI, sans-serif"),
        new("Rubik", "Rubik, Segoe UI, sans-serif"),
        new("Orbitron", "Orbitron, Rajdhani, Segoe UI, sans-serif"),
        new("JetBrains Mono", "JetBrains Mono, Consolas, monospace"),
        new("Fira Code", "Fira Code, Cascadia Code, Consolas, monospace")
    };

    public static ThemeDefinition CurrentTheme { get; private set; } = Themes[0];
    public static Color CurrentAccent { get; private set; } = Accents[0].Color;
    public static string CurrentFont { get; private set; } = Fonts[0].FontFamilyString;

    public static void ApplyTheme(string themeName)
    {
        var found = Themes.Find(t => t.Name.Equals(themeName, StringComparison.OrdinalIgnoreCase)
                                  || t.DisplayName.StartsWith(themeName, StringComparison.OrdinalIgnoreCase));
        if (found != null)
        {
            CurrentTheme = found;
            ApplyToResources(Application.Current.Resources, found, CurrentAccent);
        }
    }

    public static void ApplyAccent(int index)
    {
        if (index >= 0 && index < Accents.Length)
        {
            CurrentAccent = Accents[index].Color;
            ApplyToResources(Application.Current.Resources, CurrentTheme, CurrentAccent);
        }
    }

    public static void ApplyFont(int index)
    {
        if (index >= 0 && index < Fonts.Length)
        {
            CurrentFont = Fonts[index].FontFamilyString;
            Application.Current.Resources["StormFontFamily"] = new System.Windows.Media.FontFamily(CurrentFont);
        }
    }

    private static void ApplyToResources(ResourceDictionary dict, ThemeDefinition theme, Color accent)
    {
        dict["ThemeBg"] = new SolidColorBrush(theme.Background);
        dict["ThemeCardBg"] = new SolidColorBrush(theme.CardBackground);
        dict["ThemeCardBorder"] = new SolidColorBrush(Color.FromArgb(0x40, accent.R, accent.G, accent.B));
        dict["ThemeAccent"] = new SolidColorBrush(accent);
        dict["ThemeAccentGlow"] = new SolidColorBrush(Color.FromArgb(0x50, accent.R, accent.G, accent.B));
        dict["ThemeAccentSoft"] = new SolidColorBrush(Color.FromArgb(0x20, accent.R, accent.G, accent.B));
        dict["ThemeTextPrimary"] = new SolidColorBrush(theme.TextPrimary);
        dict["ThemeTextSecondary"] = new SolidColorBrush(theme.TextSecondary);
        dict["ThemeSuccess"] = new SolidColorBrush(theme.Success);
        dict["ThemeWarning"] = new SolidColorBrush(theme.Warning);
    }
}
