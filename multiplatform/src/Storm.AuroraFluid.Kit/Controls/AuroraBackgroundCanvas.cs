using System;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Media;
using Avalonia.Threading;
using Storm.AuroraFluid.Kit.Themes;

namespace Storm.AuroraFluid.Kit.Controls;

/// <summary>
/// GPU-accelerated animated Aurora Fluid plasma/nebula ambient backdrop.
/// Renders smooth flowing translucent mesh orbs matching the active theme with zero frame stutter.
/// </summary>
public class AuroraBackgroundCanvas : Control
{
    public static readonly StyledProperty<bool> IsAnimatedProperty =
        AvaloniaProperty.Register<AuroraBackgroundCanvas, bool>(nameof(IsAnimated), true);

    public static readonly StyledProperty<double> SpeedProperty =
        AvaloniaProperty.Register<AuroraBackgroundCanvas, double>(nameof(Speed), 1.0);

    public bool IsAnimated
    {
        get => GetValue(IsAnimatedProperty);
        set => SetValue(IsAnimatedProperty, value);
    }

    public double Speed
    {
        get => GetValue(SpeedProperty);
        set => SetValue(SpeedProperty, value);
    }

    private DispatcherTimer? _animTimer;
    private double _time;

    static AuroraBackgroundCanvas()
    {
        AffectsRender<AuroraBackgroundCanvas>(IsAnimatedProperty, SpeedProperty);
    }

    public AuroraBackgroundCanvas()
    {
        ClipToBounds = true;
        IsHitTestVisible = false; // Background should never steal pointer events

        _animTimer = new DispatcherTimer { Interval = TimeSpan.FromMilliseconds(33) }; // ~30 FPS smooth & low battery
        _animTimer.Tick += (s, e) =>
        {
            if (!IsAnimated) return;
            _time += 0.02 * Speed;
            InvalidateVisual();
        };
        _animTimer.Start();
    }

    protected override void OnDetachedFromVisualTree(VisualTreeAttachmentEventArgs e)
    {
        base.OnDetachedFromVisualTree(e);
        _animTimer?.Stop();
    }

    protected override void OnAttachedToVisualTree(VisualTreeAttachmentEventArgs e)
    {
        base.OnAttachedToVisualTree(e);
        if (IsAnimated && _animTimer != null && !_animTimer.IsEnabled)
        {
            _animTimer.Start();
        }
    }

    public override void Render(DrawingContext context)
    {
        var bounds = Bounds;
        if (bounds.Width <= 0 || bounds.Height <= 0) return;

        var theme = AuroraThemeManager.Instance.CurrentTheme;
        var (accentPrimary, accentSec) = AuroraThemeManager.ResolveAccentColors(theme, AuroraThemeManager.Instance.CurrentAccentOverride);

        // 1. Deep Background Canvas Fill
        context.DrawRectangle(theme.BackgroundBrush, null, new Rect(0, 0, bounds.Width, bounds.Height));

        // 2. Flowing Aurora Plasma Mesh Orbs
        double w = bounds.Width;
        double h = bounds.Height;

        // Orb 1: Primary Accent Orb (Top-Right trajectory)
        double orb1X = w * (0.65 + 0.15 * Math.Sin(_time * 0.7));
        double orb1Y = h * (0.25 + 0.12 * Math.Cos(_time * 0.5));
        double orb1R = Math.Max(w, h) * 0.55;

        var orb1Brush = new RadialGradientBrush
        {
            Center = new RelativePoint(orb1X, orb11Y(orb1Y), RelativeUnit.Absolute),
            GradientOrigin = new RelativePoint(orb1X, orb11Y(orb1Y), RelativeUnit.Absolute),
            RadiusX = new RelativeScalar(orb1R, RelativeUnit.Absolute),
            RadiusY = new RelativeScalar(orb1R, RelativeUnit.Absolute),
            GradientStops =
            {
                new GradientStop(Color.FromArgb(theme.IsDark ? (byte)32 : (byte)24, accentPrimary.R, accentPrimary.G, accentPrimary.B), 0.0),
                new GradientStop(Color.FromArgb(0, accentPrimary.R, accentPrimary.G, accentPrimary.B), 1.0)
            }
        };
        context.DrawRectangle(orb1Brush, null, new Rect(0, 0, w, h));

        // Orb 2: Secondary Accent Orb (Bottom-Left trajectory)
        double orb2X = w * (0.30 + 0.18 * Math.Cos(_time * 0.6));
        double orb2Y = h * (0.75 + 0.14 * Math.Sin(_time * 0.8));
        double orb2R = Math.Max(w, h) * 0.50;

        var orb2Brush = new RadialGradientBrush
        {
            Center = new RelativePoint(orb2X, orb2Y, RelativeUnit.Absolute),
            GradientOrigin = new RelativePoint(orb2X, orb2Y, RelativeUnit.Absolute),
            RadiusX = new RelativeScalar(orb2R, RelativeUnit.Absolute),
            RadiusY = new RelativeScalar(orb2R, RelativeUnit.Absolute),
            GradientStops =
            {
                new GradientStop(Color.FromArgb(theme.IsDark ? (byte)26 : (byte)20, accentSec.R, accentSec.G, accentSec.B), 0.0),
                new GradientStop(Color.FromArgb(0, accentSec.R, accentSec.G, accentSec.B), 1.0)
            }
        };
        context.DrawRectangle(orb2Brush, null, new Rect(0, 0, w, h));

        // Orb 3: Deep Amethyst / Card Hue Swirl (Center counter-drift)
        double orb3X = w * (0.50 + 0.12 * Math.Sin(_time * 0.4 + 1.2));
        double orb3Y = h * (0.50 + 0.10 * Math.Cos(_time * 0.4 + 1.2));
        double orb3R = Math.Max(w, h) * 0.65;
        var cardCol = theme.CardColor;

        var orb3Brush = new RadialGradientBrush
        {
            Center = new RelativePoint(orb3X, orb3Y, RelativeUnit.Absolute),
            GradientOrigin = new RelativePoint(orb3X, orb3Y, RelativeUnit.Absolute),
            RadiusX = new RelativeScalar(orb3R, RelativeUnit.Absolute),
            RadiusY = new RelativeScalar(orb3R, RelativeUnit.Absolute),
            GradientStops =
            {
                new GradientStop(Color.FromArgb(theme.IsDark ? (byte)45 : (byte)15, cardCol.R, cardCol.G, cardCol.B), 0.0),
                new GradientStop(Color.FromArgb(0, cardCol.R, cardCol.G, cardCol.B), 1.0)
            }
        };
        context.DrawRectangle(orb3Brush, null, new Rect(0, 0, w, h));
    }

    private static double orb11Y(double y) => y;
}
