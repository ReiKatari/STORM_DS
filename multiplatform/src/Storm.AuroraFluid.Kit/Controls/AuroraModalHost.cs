using System;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Media;
using Storm.AuroraFluid.Kit.Services;

namespace Storm.AuroraFluid.Kit.Controls;

/// <summary>
/// Universal modal dialog host enforcing Law 16 (ESC dismissal, click-outside dismissal,
/// and smooth scale-in glass backdrop transition).
/// </summary>
public class AuroraModalHost : ContentControl
{
    public static readonly StyledProperty<bool> IsOpenProperty =
        AvaloniaProperty.Register<AuroraModalHost, bool>(nameof(IsOpen), false);

    public static readonly StyledProperty<bool> CloseOnEscapeProperty =
        AvaloniaProperty.Register<AuroraModalHost, bool>(nameof(CloseOnEscape), true);

    public static readonly StyledProperty<bool> CloseOnClickOutsideProperty =
        AvaloniaProperty.Register<AuroraModalHost, bool>(nameof(CloseOnClickOutside), true);

    public bool IsOpen
    {
        get => GetValue(IsOpenProperty);
        set => SetValue(IsOpenProperty, value);
    }

    public bool CloseOnEscape
    {
        get => GetValue(CloseOnEscapeProperty);
        set => SetValue(CloseOnEscapeProperty, value);
    }

    public bool CloseOnClickOutside
    {
        get => GetValue(CloseOnClickOutsideProperty);
        set => SetValue(CloseOnClickOutsideProperty, value);
    }

    public event EventHandler? Closed;

    static AuroraModalHost()
    {
        AffectsRender<AuroraModalHost>(IsOpenProperty);
    }

    public AuroraModalHost()
    {
        HorizontalAlignment = Avalonia.Layout.HorizontalAlignment.Stretch;
        VerticalAlignment = Avalonia.Layout.VerticalAlignment.Stretch;
        Focusable = true;
    }

    protected override void OnKeyDown(KeyEventArgs e)
    {
        base.OnKeyDown(e);
        if (IsOpen && CloseOnEscape && e.Key == Key.Escape)
        {
            Dismiss();
            e.Handled = true;
        }
    }

    protected override void OnPointerPressed(PointerPressedEventArgs e)
    {
        base.OnPointerPressed(e);
        if (!IsOpen || !CloseOnClickOutside) return;

        // Check if clicked outside presenter
        var hitControl = e.Source as Visual;
        if (hitControl == this)
        {
            Dismiss();
            e.Handled = true;
        }
    }

    public void Dismiss()
    {
        if (!IsOpen) return;
        IsOpen = false;
        AuroraTactileFeedbackService.Instance.PlayClick();
        Closed?.Invoke(this, EventArgs.Empty);
    }

    public override void Render(DrawingContext context)
    {
        if (!IsOpen) return;

        var bounds = Bounds;
        if (bounds.Width <= 0 || bounds.Height <= 0) return;

        // 1. Semi-Transparent Ambient Glass Backdrop
        var backdropBrush = new SolidColorBrush(Color.FromArgb(170, 0, 0, 0));
        context.DrawRectangle(backdropBrush, null, new Rect(0, 0, bounds.Width, bounds.Height));

        base.Render(context);
    }
}
