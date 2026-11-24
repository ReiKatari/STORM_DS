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
        Padding = new Thickness(36, 8, 70, 8);
        CaretBrush = new SolidColorBrush(Color.Parse("#00F0FF"));
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

        // 1. Prefix Search Icon (Left)
        var searchEntry = AuroraIconCatalog.GetEntry(AuroraIconKind.SearchSpotlight);
        var iconGeom = StreamGeometry.Parse(searchEntry.PrimaryPath);
        using (context.PushTransform(Matrix.CreateTranslation(10, (bounds.Height - 16) / 2.0) * Matrix.CreateScale(16.0 / 24.0, 16.0 / 24.0)))
        {
            var iconBrush = new SolidColorBrush(theme.TextSecondaryColor);
            context.DrawGeometry(iconBrush, null, iconGeom);
        }

        // 2. Suffix Hotkey Pill ("Ctrl+K") (Right)
        if (string.IsNullOrEmpty(Text))
        {
            double pillW = 46.0;
            double pillH = 18.0;
            double pillX = bounds.Width - pillW - 10.0;
            double pillY = (bounds.Height - pillH) / 2.0;

            var pillRect = new Rect(pillX, pillY, pillW, pillH);
            var pillBg = new SolidColorBrush(Color.FromArgb(90, 255, 255, 255));
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
