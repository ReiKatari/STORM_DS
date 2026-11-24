using System;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Media;
using Storm.AuroraFluid.Kit.Services;
using Storm.AuroraFluid.Kit.Themes;

namespace Storm.AuroraFluid.Kit.Controls;

/// <summary>
/// Canonical STORM volumetric neon checkbox.
/// Solid rounded square (CornerRadius=4) with glowing neon gradient fill when enabled,
/// and strictly ZERO checkmarks (enforcing AGENTS.md Rule 5.4).
/// </summary>
public class AuroraNeonCheckBox : Control
{
    public static readonly StyledProperty<bool> IsCheckedProperty =
        AvaloniaProperty.Register<AuroraNeonCheckBox, bool>(nameof(IsChecked), false);

    public static readonly StyledProperty<string?> LabelProperty =
        AvaloniaProperty.Register<AuroraNeonCheckBox, string?>(nameof(Label), null);

    public bool IsChecked
    {
        get => GetValue(IsCheckedProperty);
        set => SetValue(IsCheckedProperty, value);
    }

    public string? Label
    {
        get => GetValue(LabelProperty);
        set => SetValue(LabelProperty, value);
    }

    public event EventHandler<bool>? IsCheckedChanged;

    private bool _isPointerOver;
    private bool _isPressed;

    static AuroraNeonCheckBox()
    {
        AffectsRender<AuroraNeonCheckBox>(IsCheckedProperty, LabelProperty);
        AffectsMeasure<AuroraNeonCheckBox>(LabelProperty);
    }

    public AuroraNeonCheckBox()
    {
        Cursor = new Cursor(StandardCursorType.Hand);
    }

    protected override void OnPointerEntered(PointerEventArgs e)
    {
        base.OnPointerEntered(e);
        _isPointerOver = true;
        AuroraTactileFeedbackService.Instance.PlayHoverTick();
        InvalidateVisual();
    }

    protected override void OnPointerExited(PointerEventArgs e)
    {
        base.OnPointerExited(e);
        _isPointerOver = false;
        _isPressed = false;
        InvalidateVisual();
    }

    protected override void OnPointerPressed(PointerPressedEventArgs e)
    {
        base.OnPointerPressed(e);
        _isPressed = true;
        InvalidateVisual();
    }

    protected override void OnPointerReleased(PointerReleasedEventArgs e)
    {
        base.OnPointerReleased(e);
        if (_isPressed)
        {
            _isPressed = false;
            IsChecked = !IsChecked;
            AuroraTactileFeedbackService.Instance.PlayClick();
            IsCheckedChanged?.Invoke(this, IsChecked);
            InvalidateVisual();
        }
    }

    protected override Size MeasureOverride(Size availableSize)
    {
        double boxSize = 20.0;
        double textWidth = 0;
        if (!string.IsNullOrEmpty(Label))
        {
            textWidth = Label.Length * 8.5 + 10.0;
        }
        return new Size(boxSize + textWidth, Math.Max(boxSize, 24.0));
    }

    public override void Render(DrawingContext context)
    {
        var theme = AuroraThemeManager.Instance.CurrentTheme;
        var (accentPrimary, accentSec) = AuroraThemeManager.ResolveAccentColors(theme, AuroraThemeManager.Instance.CurrentAccentOverride);

        double boxSize = 18.0;
        double topOffset = (Bounds.Height - boxSize) / 2.0;
        var boxRect = new Rect(1, topOffset, boxSize, boxSize);
        float cr = 4.0f; // Exact Law CornerRadius=4

        // 1. Box Rendering (Strictly ZERO checkmarks per Rule 5.4)
        if (IsChecked)
        {
            // Glowing Neon Gradient Fill
            var neonBrush = new LinearGradientBrush
            {
                StartPoint = new RelativePoint(0, 0, RelativeUnit.Relative),
                EndPoint = new RelativePoint(1, 1, RelativeUnit.Relative),
                GradientStops =
                {
                    new GradientStop(accentPrimary, 0.0),
                    new GradientStop(accentSec, 1.0)
                }
            };

            // Outer Soft Neon Glow
            var glowBrush = new SolidColorBrush(Color.FromArgb(90, accentPrimary.R, accentPrimary.G, accentPrimary.B));
            context.DrawRectangle(glowBrush, null, new Rect(0, topOffset - 1, boxSize + 2, boxSize + 2), cr + 1, cr + 1);

            // Solid Neon Block Fill
            context.DrawRectangle(neonBrush, null, boxRect, cr, cr);

            // Specular Top Rim Highlight
            var specPen = new Pen(new SolidColorBrush(Color.FromArgb(120, 255, 255, 255)), 0.8);
            context.DrawLine(specPen, new Point(boxRect.Left + 2, boxRect.Top + 1), new Point(boxRect.Right - 2, boxRect.Top + 1));
        }
        else
        {
            // Unchecked: Sleek Dark Card Background
            var bgCol = theme.CardColor;
            var uncheckBg = new SolidColorBrush(Color.FromArgb(220, bgCol.R, bgCol.G, bgCol.B));
            var borderPen = new Pen(new SolidColorBrush(_isPointerOver ? accentPrimary : theme.BorderColor), 1.2);

            context.DrawRectangle(uncheckBg, borderPen, boxRect, cr, cr);
        }

        // 2. Text Label Rendering (if specified)
        if (!string.IsNullOrEmpty(Label))
        {
            var formattedText = new FormattedText(
                Label,
                System.Globalization.CultureInfo.CurrentUICulture,
                FlowDirection.LeftToRight,
                new Typeface(AuroraThemeManager.ResolveFontFamily(AuroraThemeManager.Instance.CurrentTypography)),
                13.0,
                theme.TextPrimaryBrush
            );

            double textY = (Bounds.Height - formattedText.Height) / 2.0;
            context.DrawText(formattedText, new Point(boxSize + 10.0, textY));
        }
    }
}
