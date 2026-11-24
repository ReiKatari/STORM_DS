using System;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Media;
using Avalonia.Threading;
using Storm.AuroraFluid.Kit.Services;
using Storm.AuroraFluid.Kit.Themes;

namespace Storm.AuroraFluid.Kit.Controls;

/// <summary>
/// Next-gen volumetric 3D tactile button with spring hover lift, compression physics,
/// pointer-tracking radial sheen, and expanding click ripple wave.
/// </summary>
public class AuroraVolumetricButton : Button
{
    public static readonly StyledProperty<bool> IsHeroProperty =
        AvaloniaProperty.Register<AuroraVolumetricButton, bool>(nameof(IsHero), false);

    public static readonly StyledProperty<Color?> GlowColorProperty =
        AvaloniaProperty.Register<AuroraVolumetricButton, Color?>(nameof(GlowColor), null);

    public bool IsHero
    {
        get => GetValue(IsHeroProperty);
        set => SetValue(IsHeroProperty, value);
    }

    public Color? GlowColor
    {
        get => GetValue(GlowColorProperty);
        set => SetValue(GlowColorProperty, value);
    }

    private bool _isPointerOver;
    private bool _isPressed;
    private Point _pointerPos;

    // Click Ripple State
    private Point _rippleOrigin;
    private double _rippleRadius;
    private double _rippleOpacity;
    private DispatcherTimer? _rippleTimer;

    static AuroraVolumetricButton()
    {
        AffectsRender<AuroraVolumetricButton>(IsHeroProperty, CornerRadiusProperty, GlowColorProperty);
    }

    public AuroraVolumetricButton()
    {
        CornerRadius = new CornerRadius(8);
        RenderTransformOrigin = new RelativePoint(0.5, 0.5, RelativeUnit.Relative);
        Padding = new Thickness(16, 10);
        HorizontalContentAlignment = Avalonia.Layout.HorizontalAlignment.Center;
        VerticalContentAlignment = Avalonia.Layout.VerticalAlignment.Center;
        ClipToBounds = true;
        UpdateTransform();
    }

    private void UpdateTransform()
    {
        double ty = 0;
        double scale = 1.0;

        if (_isPressed)
        {
            ty = 2.0;
            scale = 0.965;
        }
        else if (_isPointerOver)
        {
            ty = -2.0;
            scale = 1.018;
        }

        var group = new TransformGroup();
        group.Children.Add(new TranslateTransform(0, ty));
        group.Children.Add(new ScaleTransform(scale, scale));
        RenderTransform = group;
    }

    protected override void OnPointerEntered(PointerEventArgs e)
    {
        base.OnPointerEntered(e);
        _isPointerOver = true;
        _pointerPos = e.GetPosition(this);
        UpdateTransform();
        AuroraTactileFeedbackService.Instance.PlayHoverTick();
        InvalidateVisual();
    }

    protected override void OnPointerExited(PointerEventArgs e)
    {
        base.OnPointerExited(e);
        _isPointerOver = false;
        _isPressed = false;
        UpdateTransform();
        InvalidateVisual();
    }

    protected override void OnPointerMoved(PointerEventArgs e)
    {
        base.OnPointerMoved(e);
        _pointerPos = e.GetPosition(this);
        InvalidateVisual();
    }

    protected override void OnPointerPressed(PointerPressedEventArgs e)
    {
        base.OnPointerPressed(e);
        _isPressed = true;
        _rippleOrigin = e.GetPosition(this);
        _rippleRadius = 0;
        _rippleOpacity = 0.5;
        UpdateTransform();
        AuroraTactileFeedbackService.Instance.PlayClick();
        StartRipple();
        InvalidateVisual();
    }

    protected override void OnPointerReleased(PointerReleasedEventArgs e)
    {
        base.OnPointerReleased(e);
        _isPressed = false;
        UpdateTransform();
        InvalidateVisual();
    }

    private void StartRipple()
    {
        _rippleTimer?.Stop();
        _rippleTimer = new DispatcherTimer { Interval = TimeSpan.FromMilliseconds(16) };
        _rippleTimer.Tick += (s, e) =>
        {
            _rippleRadius += 8.0;
            _rippleOpacity -= 0.04;

            if (_rippleOpacity <= 0)
            {
                _rippleTimer.Stop();
                _rippleOpacity = 0;
            }
            InvalidateVisual();
        };
        _rippleTimer.Start();
    }

    public override void Render(DrawingContext context)
    {
        var bounds = Bounds;
        if (bounds.Width <= 0 || bounds.Height <= 0) return;

        var rect = new Rect(0, 0, bounds.Width, bounds.Height);
        var cr = CornerRadius.TopLeft;

        var theme = AuroraThemeManager.Instance.CurrentTheme;
        var (accentPrimary, accentSec) = AuroraThemeManager.ResolveAccentColors(theme, AuroraThemeManager.Instance.CurrentAccentOverride);

        // 1. Outer Volumetric Drop Shadow
        var shadowRect = new Rect(0, 2.5, bounds.Width, bounds.Height);
        var shadowBrush = new SolidColorBrush(Color.FromArgb(50, 0, 0, 0));
        context.DrawRectangle(shadowBrush, null, shadowRect, (float)cr, (float)cr);

        // 2. Base Fill & Hero Glow
        IBrush baseBrush;
        if (IsHero)
        {
            baseBrush = new LinearGradientBrush
            {
                StartPoint = new RelativePoint(0, 0, RelativeUnit.Relative),
                EndPoint = new RelativePoint(1, 1, RelativeUnit.Relative),
                GradientStops =
                {
                    new GradientStop(accentPrimary, 0.0),
                    new GradientStop(accentSec, 1.0)
                }
            };
        }
        else
        {
            var c = theme.CardColor;
            baseBrush = new LinearGradientBrush
            {
                StartPoint = new RelativePoint(0, 0, RelativeUnit.Relative),
                EndPoint = new RelativePoint(0, 1, RelativeUnit.Relative),
                GradientStops =
                {
                    new GradientStop(Color.FromArgb(240, (byte)Math.Min(255, c.R + 15), (byte)Math.Min(255, c.G + 15), (byte)Math.Min(255, c.B + 15)), 0.0),
                    new GradientStop(Color.FromArgb(250, c.R, c.G, c.B), 1.0)
                }
            };
        }

        // Draw Button Body
        context.DrawRectangle(baseBrush, null, rect, (float)cr, (float)cr);

        // 3. Pointer-Tracking Radial Sheen
        if (_isPointerOver)
        {
            var sheenBrush = new RadialGradientBrush
            {
                Center = new RelativePoint(_pointerPos.X, _pointerPos.Y, RelativeUnit.Absolute),
                GradientOrigin = new RelativePoint(_pointerPos.X, _pointerPos.Y, RelativeUnit.Absolute),
                RadiusX = new RelativeScalar(Math.Max(bounds.Width, 90), RelativeUnit.Absolute),
                RadiusY = new RelativeScalar(Math.Max(bounds.Height, 90), RelativeUnit.Absolute),
                GradientStops =
                {
                    new GradientStop(Color.FromArgb(IsHero ? (byte)90 : (byte)45, 255, 255, 255), 0.0),
                    new GradientStop(Color.FromArgb(0, 255, 255, 255), 1.0)
                }
            };
            context.DrawRectangle(sheenBrush, null, rect, (float)cr, (float)cr);
        }

        // 4. Animated Click Ripple Wave
        if (_rippleOpacity > 0)
        {
            var rippleBrush = new RadialGradientBrush
            {
                Center = new RelativePoint(_rippleOrigin.X, _rippleOrigin.Y, RelativeUnit.Absolute),
                GradientOrigin = new RelativePoint(_rippleOrigin.X, _rippleOrigin.Y, RelativeUnit.Absolute),
                RadiusX = new RelativeScalar(_rippleRadius, RelativeUnit.Absolute),
                RadiusY = new RelativeScalar(_rippleRadius, RelativeUnit.Absolute),
                GradientStops =
                {
                    new GradientStop(Color.FromArgb((byte)(_rippleOpacity * 180), 255, 255, 255), 0.8),
                    new GradientStop(Color.FromArgb(0, 255, 255, 255), 1.0)
                }
            };
            context.DrawRectangle(rippleBrush, null, rect, (float)cr, (float)cr);
        }

        // 5. Specular Top Rim Highlight (35% white)
        var topRimPen = new Pen(new SolidColorBrush(Color.FromArgb(90, 255, 255, 255)), 1.2);
        context.DrawLine(topRimPen, new Point(cr, 1), new Point(bounds.Width - cr, 1));

        // 6. Bottom Bevel Edge (40% black)
        var bottomBevelPen = new Pen(new SolidColorBrush(Color.FromArgb(100, 0, 0, 0)), 1.5);
        context.DrawLine(bottomBevelPen, new Point(cr, bounds.Height - 1), new Point(bounds.Width - cr, bounds.Height - 1));

        // 7. Crisp Perimeter Border (1px)
        var borderPen = new Pen(new SolidColorBrush(IsHero ? Color.FromArgb(160, 255, 255, 255) : theme.BorderColor), 1.0);
        context.DrawRectangle(null, borderPen, rect, (float)cr, (float)cr);

        // Content
        base.Render(context);
    }
}
