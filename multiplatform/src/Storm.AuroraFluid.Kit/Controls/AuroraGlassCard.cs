using System;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Media;
using Storm.AuroraFluid.Kit.Themes;

namespace Storm.AuroraFluid.Kit.Controls;

/// <summary>
/// Spatial translucent glass card with crisp 1px border, inner top specular rim,
/// and interactive cursor-tracking spotlight illumination.
/// </summary>
public class AuroraGlassCard : ContentControl
{
    public static readonly StyledProperty<bool> SpotlightEnabledProperty =
        AvaloniaProperty.Register<AuroraGlassCard, bool>(nameof(SpotlightEnabled), true);

    public bool SpotlightEnabled
    {
        get => GetValue(SpotlightEnabledProperty);
        set => SetValue(SpotlightEnabledProperty, value);
    }

    private bool _isPointerOver;
    private Point _pointerPos;

    static AuroraGlassCard()
    {
        AffectsRender<AuroraGlassCard>(SpotlightEnabledProperty, CornerRadiusProperty);
    }

    public AuroraGlassCard()
    {
        CornerRadius = new CornerRadius(10);
        Padding = new Thickness(16);
    }

    protected override void OnPointerEntered(PointerEventArgs e)
    {
        base.OnPointerEntered(e);
        _isPointerOver = true;
        _pointerPos = e.GetPosition(this);
        InvalidateVisual();
    }

    protected override void OnPointerExited(PointerEventArgs e)
    {
        base.OnPointerExited(e);
        _isPointerOver = false;
        InvalidateVisual();
    }

    protected override void OnPointerMoved(PointerEventArgs e)
    {
        base.OnPointerMoved(e);
        _pointerPos = e.GetPosition(this);
        InvalidateVisual();
    }

    public override void Render(DrawingContext context)
    {
        var bounds = Bounds;
        if (bounds.Width <= 0 || bounds.Height <= 0) return;

        var rect = new Rect(0, 0, bounds.Width, bounds.Height);
        var cr = CornerRadius.TopLeft;

        var theme = AuroraThemeManager.Instance.CurrentTheme;
        var (accentPrimary, _) = AuroraThemeManager.ResolveAccentColors(theme, AuroraThemeManager.Instance.CurrentAccentOverride);

        // 1. Translucent Glass Fill
        var cardColor = theme.CardColor;
        var glassBrush = new SolidColorBrush(Color.FromArgb(theme.IsDark ? (byte)195 : (byte)235, cardColor.R, cardColor.G, cardColor.B));
        context.DrawRectangle(glassBrush, null, rect, (float)cr, (float)cr);

        // 2. Cursor-Tracking Spotlight (Radial Accent Illumination)
        if (SpotlightEnabled && _isPointerOver)
        {
            var spotlightBrush = new RadialGradientBrush
            {
                Center = new RelativePoint(_pointerPos.X, _pointerPos.Y, RelativeUnit.Absolute),
                GradientOrigin = new RelativePoint(_pointerPos.X, _pointerPos.Y, RelativeUnit.Absolute),
                RadiusX = new RelativeScalar(140, RelativeUnit.Absolute),
                RadiusY = new RelativeScalar(140, RelativeUnit.Absolute),
                GradientStops =
                {
                    new GradientStop(Color.FromArgb(40, accentPrimary.R, accentPrimary.G, accentPrimary.B), 0.0),
                    new GradientStop(Color.FromArgb(0, accentPrimary.R, accentPrimary.G, accentPrimary.B), 1.0)
                }
            };
            context.DrawRectangle(spotlightBrush, null, rect, (float)cr, (float)cr);
        }

        // 3. Top Specular Rim (Inner Glow)
        var specularPen = new Pen(new SolidColorBrush(Color.FromArgb(theme.IsDark ? (byte)35 : (byte)70, 255, 255, 255)), 1.0);
        context.DrawLine(specularPen, new Point(cr, 1), new Point(bounds.Width - cr, 1));

        // 4. Perimeter Border (1px)
        var borderPen = new Pen(new SolidColorBrush(theme.BorderColor), 1.0);
        context.DrawRectangle(null, borderPen, rect, (float)cr, (float)cr);

        // Render Child Content
        base.Render(context);
    }
}
