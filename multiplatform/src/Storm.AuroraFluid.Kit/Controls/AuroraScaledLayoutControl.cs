// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Media;

namespace Storm.AuroraFluid.Kit.Controls;

/// <summary>
/// High-precision DPI/layout scaler that scales child layout coordinates without clipping
/// at sub-1.0 scales and preserves crisp pointer hit-testing across all Avalonia panels.
/// </summary>
public class AuroraScaledLayoutControl : Decorator
{
    public static readonly StyledProperty<double> ScaleProperty =
        AvaloniaProperty.Register<AuroraScaledLayoutControl, double>(nameof(Scale), 1.0);

    public double Scale
    {
        get => GetValue(ScaleProperty);
        set => SetValue(ScaleProperty, value);
    }

    static AuroraScaledLayoutControl()
    {
        AffectsMeasure<AuroraScaledLayoutControl>(ScaleProperty);
        AffectsArrange<AuroraScaledLayoutControl>(ScaleProperty);
        AffectsRender<AuroraScaledLayoutControl>(ScaleProperty);
    }

    private readonly ScaleTransform _scaleTransform = new(1.0, 1.0);

    public AuroraScaledLayoutControl()
    {
        ClipToBounds = true;
    }

    protected override void OnPropertyChanged(AvaloniaPropertyChangedEventArgs change)
    {
        base.OnPropertyChanged(change);
        if (change.Property == ScaleProperty)
        {
            ApplyTransformToChild(Child);
        }
        else if (change.Property == ChildProperty)
        {
            if (change.OldValue is Control oldChild && ReferenceEquals(oldChild.RenderTransform, _scaleTransform))
            {
                oldChild.RenderTransform = null;
            }
            ApplyTransformToChild(change.NewValue as Control);
        }
    }

    private void ApplyTransformToChild(Control? child)
    {
        double s = Math.Clamp(Scale, 0.70, 2.00);
        _scaleTransform.ScaleX = s;
        _scaleTransform.ScaleY = s;
        if (child != null)
        {
            child.RenderTransformOrigin = new RelativePoint(0, 0, RelativeUnit.Relative);
            if (!ReferenceEquals(child.RenderTransform, _scaleTransform))
            {
                child.RenderTransform = _scaleTransform;
            }
        }
    }

    protected override Size MeasureOverride(Size availableSize)
    {
        var child = Child;
        if (child == null) return new Size(0, 0);

        ApplyTransformToChild(child);
        double s = Math.Clamp(Scale, 0.70, 2.00);
        var unscaledAvail = new Size(
            double.IsInfinity(availableSize.Width) ? double.PositiveInfinity : availableSize.Width / s,
            double.IsInfinity(availableSize.Height) ? double.PositiveInfinity : availableSize.Height / s);

        child.Measure(unscaledAvail);
        return new Size(child.DesiredSize.Width * s, child.DesiredSize.Height * s);
    }

    protected override Size ArrangeOverride(Size finalSize)
    {
        var child = Child;
        if (child == null) return finalSize;

        ApplyTransformToChild(child);
        double s = Math.Clamp(Scale, 0.70, 2.00);
        var unscaledFinal = new Size(finalSize.Width / s, finalSize.Height / s);
        child.Arrange(new Rect(0, 0, unscaledFinal.Width, unscaledFinal.Height));
        return finalSize;
    }
}
