using System;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Media;
using Storm.AuroraFluid.Kit.Services;
using Storm.AuroraFluid.Kit.Themes;

namespace Storm.AuroraFluid.Kit.Controls;

/// <summary>
/// Volumetric 3D slider with recessed track, glowing neon fill,
/// and luminous Thumb with specular highlights (AGENTS.md Rule 5.4).
/// </summary>
public class AuroraVolumetricSlider : Control
{
    public static readonly StyledProperty<double> MinimumProperty =
        AvaloniaProperty.Register<AuroraVolumetricSlider, double>(nameof(Minimum), 0.0);

    public static readonly StyledProperty<double> MaximumProperty =
        AvaloniaProperty.Register<AuroraVolumetricSlider, double>(nameof(Maximum), 100.0);

    public static readonly StyledProperty<double> ValueProperty =
        AvaloniaProperty.Register<AuroraVolumetricSlider, double>(nameof(Value), 50.0);

    public double Minimum
    {
        get => GetValue(MinimumProperty);
        set => SetValue(MinimumProperty, value);
    }

    public double Maximum
    {
        get => GetValue(MaximumProperty);
        set => SetValue(MaximumProperty, value);
    }

    public double Value
    {
        get => GetValue(ValueProperty);
        set => SetValue(ValueProperty, Math.Clamp(value, Minimum, Maximum));
    }

    public event EventHandler<double>? ValueChanged;

    private bool _isDragging;
    private int _lastTickValue = -1;

    static AuroraVolumetricSlider()
    {
        AffectsRender<AuroraVolumetricSlider>(MinimumProperty, MaximumProperty, ValueProperty);
    }

    public AuroraVolumetricSlider()
    {
        Cursor = new Cursor(StandardCursorType.Hand);
    }

    protected override Size MeasureOverride(Size availableSize)
    {
        return new Size(Math.Max(120, availableSize.Width), 28.0);
    }

    private void UpdateValueFromPoint(Point p)
    {
        double thumbRadius = 9.0;
        double usableWidth = Math.Max(10.0, Bounds.Width - thumbRadius * 2);
        double relX = Math.Clamp(p.X - thumbRadius, 0.0, usableWidth);
        double ratio = relX / usableWidth;
        double newVal = Minimum + ratio * (Maximum - Minimum);

        if (Math.Abs(newVal - Value) > 0.001)
        {
            Value = newVal;
            ValueChanged?.Invoke(this, Value);

            int currentInt = (int)Math.Round(Value);
            if (currentInt != _lastTickValue)
            {
                _lastTickValue = currentInt;
                AuroraTactileFeedbackService.Instance.PlayHoverTick();
            }
        }
    }

    protected override void OnPointerPressed(PointerPressedEventArgs e)
    {
        base.OnPointerPressed(e);
        _isDragging = true;
        UpdateValueFromPoint(e.GetPosition(this));
        InvalidateVisual();
    }

    protected override void OnPointerMoved(PointerEventArgs e)
    {
        base.OnPointerMoved(e);
        if (_isDragging)
        {
            UpdateValueFromPoint(e.GetPosition(this));
            InvalidateVisual();
        }
    }

    protected override void OnPointerReleased(PointerReleasedEventArgs e)
    {
        base.OnPointerReleased(e);
        _isDragging = false;
        InvalidateVisual();
    }

    public override void Render(DrawingContext context)
    {
        var bounds = Bounds;
        if (bounds.Width <= 0 || bounds.Height <= 0) return;

        var theme = AuroraThemeManager.Instance.CurrentTheme;
        var (accentPrimary, accentSec) = AuroraThemeManager.ResolveAccentColors(theme, AuroraThemeManager.Instance.CurrentAccentOverride);

        double trackHeight = 6.0;
        double thumbRadius = 9.0;
        double trackY = (bounds.Height - trackHeight) / 2.0;

        double usableWidth = Math.Max(10.0, bounds.Width - thumbRadius * 2);
        double range = Math.Max(0.0001, Maximum - Minimum);
        double progress = Math.Clamp((Value - Minimum) / range, 0.0, 1.0);
        double thumbX = thumbRadius + progress * usableWidth;
        double thumbY = bounds.Height / 2.0;

        // 1. Recessed Track Background
        var trackRect = new Rect(thumbRadius, trackY, usableWidth, trackHeight);
        var trackBg = new SolidColorBrush(Color.FromArgb(160, 20, 22, 32));
        var trackBorderPen = new Pen(new SolidColorBrush(theme.BorderColor), 1.0);
        context.DrawRectangle(trackBg, trackBorderPen, trackRect, 3.0f, 3.0f);

        // 2. Active Track Neon Fill
        if (progress > 0)
        {
            var activeRect = new Rect(thumbRadius, trackY, progress * usableWidth, trackHeight);
            var activeBrush = new LinearGradientBrush
            {
                StartPoint = new RelativePoint(0, 0, RelativeUnit.Relative),
                EndPoint = new RelativePoint(1, 0, RelativeUnit.Relative),
                GradientStops =
                {
                    new GradientStop(accentPrimary, 0.0),
                    new GradientStop(accentSec, 1.0)
                }
            };
            context.DrawRectangle(activeBrush, null, activeRect, 3.0f, 3.0f);
        }

        // 3. Thumb Drop Shadow
        var shadowBrush = new SolidColorBrush(Color.FromArgb(90, 0, 0, 0));
        context.DrawEllipse(shadowBrush, null, new Point(thumbX, thumbY + 2.0), thumbRadius, thumbRadius);

        // 4. Thumb Outer Neon Ring
        var thumbOuterPen = new Pen(new SolidColorBrush(accentPrimary), 2.2);
        var thumbFill = new SolidColorBrush(theme.IsDark ? Color.Parse("#1A1630") : Color.Parse("#FFFFFF"));
        context.DrawEllipse(thumbFill, thumbOuterPen, new Point(thumbX, thumbY), thumbRadius, thumbRadius);

        // 5. Thumb Inner Specular Core
        var innerCoreBrush = new SolidColorBrush(accentSec);
        context.DrawEllipse(innerCoreBrush, null, new Point(thumbX, thumbY), 3.5, 3.5);

        // 6. Thumb Specular Rim Highlight
        var specPen = new Pen(new SolidColorBrush(Color.FromArgb(160, 255, 255, 255)), 0.8);
        context.DrawEllipse(null, specPen, new Point(thumbX, thumbY - 1.0), 5.5, 3.0);
    }
}
