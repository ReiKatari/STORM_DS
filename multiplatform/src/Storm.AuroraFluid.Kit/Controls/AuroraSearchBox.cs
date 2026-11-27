using System;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Media;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Themes;

namespace Storm.AuroraFluid.Kit.Controls;

/// <summary>
/// High-tech search box with recessed 3D styling, integrated icon,
/// hotkey hint pill (Ctrl+K), and instant clear capability.
/// </summary>
public class AuroraSearchBox : TextBox
{
    protected override Type StyleKeyOverride => typeof(TextBox);

    public static readonly StyledProperty<string> HotkeyHintProperty =
        AvaloniaProperty.Register<AuroraSearchBox, string>(nameof(HotkeyHint), "Ctrl+K");

    public string HotkeyHint
    {
        get => GetValue(HotkeyHintProperty);
        set => SetValue(HotkeyHintProperty, value);
    }

    public AuroraSearchBox()
    {
        PlaceholderText = "Поиск по библиотеке...";
        CornerRadius = new CornerRadius(8);
        UpdateSearchChrome();

        AttachedToVisualTree += (_, _) =>
        {
            AuroraThemeManager.Instance.ThemeChanged -= OnThemeChanged;
            AuroraThemeManager.Instance.ThemeChanged += OnThemeChanged;
            UpdateSearchChrome();
        };
        DetachedFromVisualTree += (_, _) => AuroraThemeManager.Instance.ThemeChanged -= OnThemeChanged;
    }

    private void OnThemeChanged(AuroraThemeDefinition _) => UpdateSearchChrome();

    protected override void OnPropertyChanged(AvaloniaPropertyChangedEventArgs change)
    {
        base.OnPropertyChanged(change);
        if (change.Property == HotkeyHintProperty)
        {
            UpdateSearchChrome();
        }
    }

    private void UpdateSearchChrome()
    {
        var theme = AuroraThemeManager.Instance.CurrentTheme;
        var (accentPrimary, _) = AuroraThemeManager.ResolveAccentColors(theme, AuroraThemeManager.Instance.CurrentAccentOverride);
        Padding = string.IsNullOrWhiteSpace(HotkeyHint)
            ? new Thickness(34, 7, 12, 7)
            : new Thickness(34, 7, 62, 7);
        CaretBrush = new SolidColorBrush(accentPrimary);
        Foreground = theme.TextPrimaryBrush;
        Background = theme.CardBrush;
        BorderBrush = theme.BorderBrush;
        InvalidateVisual();
    }

    protected override void OnKeyDown(KeyEventArgs e)
    {
        base.OnKeyDown(e);
        if (e.Key == Key.Escape)
        {
            Text = string.Empty;
            e.Handled = true;
        }
    }

    public override void Render(DrawingContext context)
    {
        base.Render(context);

        var bounds = Bounds;
        if (bounds.Width <= 0 || bounds.Height <= 0) return;

        var theme = AuroraThemeManager.Instance.CurrentTheme;

        // 1. Prefix Search Icon (Left - crisp stroked magnifying glass)
        var iconGeom = StreamGeometry.Parse("M 10 4 A 6 6 0 1 0 10 16 A 6 6 0 1 0 10 4 Z M 14.5 14.5 L 19.5 19.5");
        using (context.PushTransform(Matrix.CreateTranslation(10, (bounds.Height - 16) / 2.0) * Matrix.CreateScale(16.0 / 24.0, 16.0 / 24.0)))
        {
            var iconPen = new Pen(new SolidColorBrush(theme.TextSecondaryColor), 2.0, lineCap: PenLineCap.Round);
            context.DrawGeometry(null, iconPen, iconGeom);
        }

        // 2. Suffix Hotkey Pill ("Ctrl+K" / "Ctrl+F") (Right)
        if (string.IsNullOrEmpty(Text) && !string.IsNullOrWhiteSpace(HotkeyHint))
        {
            double pillW = 46.0;
            double pillH = 18.0;
            double pillX = bounds.Width - pillW - 10.0;
            double pillY = (bounds.Height - pillH) / 2.0;

            var pillRect = new Rect(pillX, pillY, pillW, pillH);
            var pillBg = new SolidColorBrush(theme.IsDark
                ? Color.FromArgb(45, 255, 255, 255)
                : Color.FromArgb(24, 15, 23, 42));
            var pillBorder = new Pen(new SolidColorBrush(theme.BorderColor), 0.8);
            context.DrawRectangle(pillBg, pillBorder, pillRect, 4.0f, 4.0f);

            var hintText = new FormattedText(
                HotkeyHint,
                System.Globalization.CultureInfo.CurrentUICulture,
                FlowDirection.LeftToRight,
                new Typeface(AuroraThemeManager.ResolveFontFamily(AuroraThemeManager.Instance.CurrentTypography)),
                10.0,
                theme.TextSecondaryBrush
            );
            context.DrawText(hintText, new Point(pillX + (pillW - hintText.Width) / 2.0, pillY + (pillH - hintText.Height) / 2.0));
        }
    }
}
