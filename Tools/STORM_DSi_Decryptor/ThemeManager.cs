using System;
using System.Collections.Generic;
using System.Windows;
using System.Windows.Media;

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

public static class ThemeManager
{
    public static readonly List<ThemeDefinition> Themes = new()
    {
        new() {
            Name = "STORM DARK", DisplayName = "STORM DARK",
            Background = Color.FromRgb(0x0F, 0x11, 0x17),
            CardBackground = Color.FromRgb(0x18, 0x1B, 0x24),
            CardBorder = Color.FromArgb(0x35, 0x00, 0xD2, 0xFF),
            Accent = Color.FromRgb(0x00, 0xD2, 0xFF),
            TextPrimary = Color.FromRgb(0xF1, 0xF5, 0xF9),
            TextSecondary = Color.FromRgb(0x94, 0xA3, 0xB8),
            Success = Color.FromRgb(0x10, 0xB9, 0x81),
            Warning = Color.FromRgb(0xF5, 0x9E, 0x0B)
        },
        new() {
            Name = "STORM NIGHT", DisplayName = "STORM NIGHT",
            Background = Color.FromRgb(0x06, 0x07, 0x0A),
            CardBackground = Color.FromRgb(0x0F, 0x10, 0x16),
            CardBorder = Color.FromArgb(0x30, 0x00, 0xF0, 0xFF),
            Accent = Color.FromRgb(0x00, 0xF0, 0xFF),
            TextPrimary = Color.FromRgb(0xFF, 0xFF, 0xFF),
            TextSecondary = Color.FromRgb(0x8B, 0x94, 0x9E),
            Success = Color.FromRgb(0x00, 0xE6, 0x76),
            Warning = Color.FromRgb(0xFF, 0xB3, 0x00)
        },
        new() {
            Name = "STORM DAY", DisplayName = "STORM DAY",
            Background = Color.FromRgb(0xF1, 0xF5, 0xF9),
            CardBackground = Color.FromRgb(0xFF, 0xFF, 0xFF),
            CardBorder = Color.FromArgb(0x30, 0x02, 0x84, 0xC7),
            Accent = Color.FromRgb(0x02, 0x84, 0xC7),
            TextPrimary = Color.FromRgb(0x0F, 0x17, 0x2A),
            TextSecondary = Color.FromRgb(0x64, 0x74, 0x8B),
            Success = Color.FromRgb(0x05, 0x96, 0x69),
            Warning = Color.FromRgb(0xD9, 0x77, 0x06)
        },
        new() {
            Name = "STORM MIDNIGHT", DisplayName = "STORM MIDNIGHT",
            Background = Color.FromRgb(0x12, 0x0E, 0x24),
            CardBackground = Color.FromRgb(0x1C, 0x16, 0x38),
            CardBorder = Color.FromArgb(0x35, 0xA8, 0x55, 0xF7),
            Accent = Color.FromRgb(0xA8, 0x55, 0xF7),
            TextPrimary = Color.FromRgb(0xF8, 0xFA, 0xFC),
            TextSecondary = Color.FromRgb(0xC0, 0x84, 0xFC),
            Success = Color.FromRgb(0x34, 0xD3, 0x99),
            Warning = Color.FromRgb(0xFB, 0xBF, 0x24)
        },
        new() {
            Name = "STORM MATRIX", DisplayName = "STORM MATRIX",
            Background = Color.FromRgb(0x0A, 0x14, 0x0E),
            CardBackground = Color.FromRgb(0x10, 0x22, 0x16),
            CardBorder = Color.FromArgb(0x35, 0x00, 0xFF, 0x66),
            Accent = Color.FromRgb(0x00, 0xFF, 0x66),
            TextPrimary = Color.FromRgb(0xDC, 0xFC, 0xE7),
            TextSecondary = Color.FromRgb(0x86, 0xEF, 0xAC),
            Success = Color.FromRgb(0x00, 0xFF, 0x66),
            Warning = Color.FromRgb(0xFA, 0xCC, 0x15)
        },
        new() {
            Name = "STORM CYBERPUNK", DisplayName = "STORM CYBERPUNK",
            Background = Color.FromRgb(0x16, 0x0A, 0x22),
            CardBackground = Color.FromRgb(0x24, 0x12, 0x36),
            CardBorder = Color.FromArgb(0x35, 0xFF, 0x00, 0x7F),
            Accent = Color.FromRgb(0xFF, 0x00, 0x7F),
            TextPrimary = Color.FromRgb(0xFF, 0xFB, 0xFE),
            TextSecondary = Color.FromRgb(0xF4, 0x72, 0xB6),
            Success = Color.FromRgb(0x00, 0xF0, 0xFF),
            Warning = Color.FromRgb(0xFB, 0xE2, 0x48)
        },
        new() {
            Name = "STORM FANTASY", DisplayName = "STORM FANTASY",
            Background = Color.FromRgb(0x13, 0x11, 0x0B),
            CardBackground = Color.FromRgb(0x20, 0x1B, 0x11),
            CardBorder = Color.FromArgb(0x35, 0xF5, 0x9E, 0x0B),
            Accent = Color.FromRgb(0xF5, 0x9E, 0x0B),
            TextPrimary = Color.FromRgb(0xFE, 0xF3, 0xC7),
            TextSecondary = Color.FromRgb(0xFB, 0xBF, 0x24),
            Success = Color.FromRgb(0x10, 0xB9, 0x81),
            Warning = Color.FromRgb(0xF5, 0x9E, 0x0B)
        },
        new() {
            Name = "STORM WARHAMMER 40K", DisplayName = "STORM WARHAMMER 40K",
            Background = Color.FromRgb(0x11, 0x13, 0x16),
            CardBackground = Color.FromRgb(0x1C, 0x1F, 0x24),
            CardBorder = Color.FromArgb(0x35, 0xD4, 0xAF, 0x37),
            Accent = Color.FromRgb(0xD4, 0xAF, 0x37),
            TextPrimary = Color.FromRgb(0xFD, 0xFC, 0xFA),
            TextSecondary = Color.FromRgb(0xAA, 0xB2, 0xBF),
            Success = Color.FromRgb(0x22, 0xC5, 0x5E),
            Warning = Color.FromRgb(0xE1, 0x1D, 0x48)
        }
    };

    public static ThemeDefinition CurrentTheme { get; private set; } = Themes[0];

    public static void ApplyTheme(string themeName)
    {
        var found = Themes.Find(t => t.Name.Equals(themeName, StringComparison.OrdinalIgnoreCase));
        if (found != null)
        {
            CurrentTheme = found;
            ApplyToResources(Application.Current.Resources, found);
        }
    }

    private static void ApplyToResources(ResourceDictionary dict, ThemeDefinition theme)
    {
        dict["ThemeBg"] = new SolidColorBrush(theme.Background);
        dict["ThemeCardBg"] = new SolidColorBrush(theme.CardBackground);
        dict["ThemeCardBorder"] = new SolidColorBrush(theme.CardBorder);
        dict["ThemeAccent"] = new SolidColorBrush(theme.Accent);
        dict["ThemeTextPrimary"] = new SolidColorBrush(theme.TextPrimary);
        dict["ThemeTextSecondary"] = new SolidColorBrush(theme.TextSecondary);
        dict["ThemeSuccess"] = new SolidColorBrush(theme.Success);
        dict["ThemeWarning"] = new SolidColorBrush(theme.Warning);
    }
}
