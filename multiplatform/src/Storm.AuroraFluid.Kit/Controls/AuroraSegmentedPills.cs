using System;
using System.Collections.Generic;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Media;
using Storm.AuroraFluid.Kit.Services;
using Storm.AuroraFluid.Kit.Themes;

namespace Storm.AuroraFluid.Kit.Controls;

/// <summary>
/// Modern segmented pill control with smooth active capsule highlight and tactile feedback.
/// </summary>
public class AuroraSegmentedPills : Control
{
    public static readonly StyledProperty<int> SelectedIndexProperty =
        AvaloniaProperty.Register<AuroraSegmentedPills, int>(nameof(SelectedIndex), 0);

    public int SelectedIndex
    {
        get => GetValue(SelectedIndexProperty);
        set => SetValue(SelectedIndexProperty, value);
    }

    public List<string> Items { get; } = new();

    public event EventHandler<int>? SelectionChanged;

    private int _hoveredIndex = -1;

    static AuroraSegmentedPills()
    {
        AffectsRender<AuroraSegmentedPills>(SelectedIndexProperty);
    }

    public AuroraSegmentedPills()
    {
        Cursor = new Cursor(StandardCursorType.Hand);
    }

    protected override Size MeasureOverride(Size availableSize)
    {
        double totalWidth = Math.Max(60, Items.Count * 90.0);
        return new Size(totalWidth, 36.0);
    }

    protected override void OnPointerMoved(PointerEventArgs e)
    {
        base.OnPointerMoved(e);
        if (Items.Count == 0 || Bounds.Width <= 0) return;

        double itemWidth = Bounds.Width / Items.Count;
        int idx = (int)(e.GetPosition(this).X / itemWidth);
        idx = Math.Clamp(idx, 0, Items.Count - 1);

        if (idx != _hoveredIndex)
        {
            _hoveredIndex = idx;
            InvalidateVisual();
        }
    }

    protected override void OnPointerExited(PointerEventArgs e)
    {
        base.OnPointerExited(e);
        _hoveredIndex = -1;
        InvalidateVisual();
    }

    protected override void OnPointerPressed(PointerPressedEventArgs e)
    {
        base.OnPointerPressed(e);
        if (Items.Count == 0 || Bounds.Width <= 0) return;

        double itemWidth = Bounds.Width / Items.Count;
        int idx = (int)(e.GetPosition(this).X / itemWidth);
        idx = Math.Clamp(idx, 0, Items.Count - 1);

        if (idx != SelectedIndex)
        {
            SelectedIndex = idx;
            AuroraTactileFeedbackService.Instance.PlayTabWhoosh();
            SelectionChanged?.Invoke(this, SelectedIndex);
            InvalidateVisual();
        }
    }

    public override void Render(DrawingContext context)
    {
        var bounds = Bounds;
        if (bounds.Width <= 0 || bounds.Height <= 0 || Items.Count == 0) return;

        var theme = AuroraThemeManager.Instance.CurrentTheme;
        var (accentPrimary, accentSec) = AuroraThemeManager.ResolveAccentColors(theme, AuroraThemeManager.Instance.CurrentAccentOverride);

        float cr = (float)(bounds.Height / 2.0);
        var containerRect = new Rect(0, 0, bounds.Width, bounds.Height);

        // 1. Recessed Container Fill
        var containerBrush = new SolidColorBrush(Color.FromArgb(180, 16, 18, 26));
        var containerBorderPen = new Pen(new SolidColorBrush(theme.BorderColor), 1.0);
        context.DrawRectangle(containerBrush, containerBorderPen, containerRect, cr, cr);

        double itemWidth = bounds.Width / Items.Count;

        // 2. Active Selected Pill
        if (SelectedIndex >= 0 && SelectedIndex < Items.Count)
        {
            var pillRect = new Rect(SelectedIndex * itemWidth + 2.0, 2.0, itemWidth - 4.0, bounds.Height - 4.0);
            var pillCr = (float)(pillRect.Height / 2.0);

            var activeBrush = new LinearGradientBrush
            {
                StartPoint = new RelativePoint(0, 0, RelativeUnit.Relative),
                EndPoint = new RelativePoint(1, 1, RelativeUnit.Relative),
                GradientStops =
                {
                    new GradientStop(accentPrimary, 0.0),
                    new GradientStop(accentSec, 1.0)
                }
            };
            context.DrawRectangle(activeBrush, null, pillRect, pillCr, pillCr);

            // Specular Top Rim
            var specPen = new Pen(new SolidColorBrush(Color.FromArgb(90, 255, 255, 255)), 0.8);
            context.DrawLine(specPen, new Point(pillRect.Left + pillCr, pillRect.Top + 1), new Point(pillRect.Right - pillCr, pillRect.Top + 1));
        }

        // 3. Render Item Texts
        for (int i = 0; i < Items.Count; i++)
        {
            bool isSelected = (i == SelectedIndex);
            bool isHovered = (i == _hoveredIndex && !isSelected);

            var textBrush = isSelected
                ? (theme.IsDark ? Brushes.White : Brushes.White)
                : (isHovered ? theme.TextPrimaryBrush : theme.TextSecondaryBrush);

            var formattedText = new FormattedText(
                Items[i],
                System.Globalization.CultureInfo.CurrentUICulture,
                FlowDirection.LeftToRight,
                new Typeface(AuroraThemeManager.ResolveFontFamily(AuroraThemeManager.Instance.CurrentTypography)),
                12.5,
                textBrush
            );

            double textX = i * itemWidth + (itemWidth - formattedText.Width) / 2.0;
            double textY = (bounds.Height - formattedText.Height) / 2.0;
            context.DrawText(formattedText, new Point(textX, textY));
        }
    }
}
