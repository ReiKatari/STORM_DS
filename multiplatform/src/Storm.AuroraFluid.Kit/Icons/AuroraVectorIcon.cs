using System;
using System.Collections.Concurrent;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Media;

namespace Storm.AuroraFluid.Kit.Icons;

/// <summary>
/// Universal multi-layered colored vector icon control rendering crisp SVG geometry with dual gradients and specular highlights.
/// </summary>
public class AuroraVectorIcon : Control
{
    private static readonly ConcurrentDictionary<string, StreamGeometry> s_geometryCache = new();

    public static readonly StyledProperty<AuroraIconKind> KindProperty =
        AvaloniaProperty.Register<AuroraVectorIcon, AuroraIconKind>(nameof(Kind), AuroraIconKind.LibraryGrid);

    public static readonly StyledProperty<double> SizeProperty =
        AvaloniaProperty.Register<AuroraVectorIcon, double>(nameof(Size), 24.0);

    public static readonly StyledProperty<bool> GlowEnabledProperty =
        AvaloniaProperty.Register<AuroraVectorIcon, bool>(nameof(GlowEnabled), false);

    public static readonly StyledProperty<IBrush?> CustomColorOverrideProperty =
        AvaloniaProperty.Register<AuroraVectorIcon, IBrush?>(nameof(CustomColorOverride), null);

    public AuroraIconKind Kind
    {
        get => GetValue(KindProperty);
        set => SetValue(KindProperty, value);
    }

    public double Size
    {
        get => GetValue(SizeProperty);
        set => SetValue(SizeProperty, value);
    }

    public bool GlowEnabled
    {
        get => GetValue(GlowEnabledProperty);
        set => SetValue(GlowEnabledProperty, value);
    }

    public IBrush? CustomColorOverride
    {
        get => GetValue(CustomColorOverrideProperty);
        set => SetValue(CustomColorOverrideProperty, value);
    }

    static AuroraVectorIcon()
    {
        AffectsRender<AuroraVectorIcon>(KindProperty, SizeProperty, GlowEnabledProperty, CustomColorOverrideProperty);
        AffectsMeasure<AuroraVectorIcon>(SizeProperty);
    }

    protected override Size MeasureOverride(Size availableSize)
    {
        var s = Math.Max(8.0, Size);
        return new Size(s, s);
    }

    private static StreamGeometry GetOrCreateGeometry(string pathData)
    {
        return s_geometryCache.GetOrAdd(pathData, static path =>
        {
            var geom = StreamGeometry.Parse(path);
            return geom;
        });
    }

    public override void Render(DrawingContext context)
    {
        var entry = AuroraIconCatalog.GetEntry(Kind);
        var primaryGeom = GetOrCreateGeometry(entry.PrimaryPath);
        var secondaryGeom = GetOrCreateGeometry(entry.SecondaryPath);

        var bounds = Bounds;
        if (bounds.Width <= 0 || bounds.Height <= 0) return;

        var scaleX = bounds.Width / 24.0;
        var scaleY = bounds.Height / 24.0;

        using (context.PushTransform(Matrix.CreateScale(scaleX, scaleY)))
        {
            // Optional Ambient Glow
            if (GlowEnabled)
            {
                var glowBrush = new RadialGradientBrush
                {
                    Center = new RelativePoint(0.5, 0.5, RelativeUnit.Relative),
                    GradientOrigin = new RelativePoint(0.5, 0.5, RelativeUnit.Relative),
                    RadiusX = new RelativeScalar(0.7, RelativeUnit.Relative),
                    RadiusY = new RelativeScalar(0.7, RelativeUnit.Relative),
                    GradientStops =
                    {
                        new GradientStop(Color.FromArgb(70, entry.StartColor.R, entry.StartColor.G, entry.StartColor.B), 0.0),
                        new GradientStop(Color.FromArgb(0, entry.StartColor.R, entry.StartColor.G, entry.StartColor.B), 1.0)
                    }
                };
                context.DrawRectangle(glowBrush, null, new Rect(0, 0, 24, 24));
            }

            // Primary Geometry with Multi-Stop Linear Gradient
            IBrush primaryBrush = CustomColorOverride ?? new LinearGradientBrush
            {
                StartPoint = new RelativePoint(0, 0, RelativeUnit.Relative),
                EndPoint = new RelativePoint(1, 1, RelativeUnit.Relative),
                GradientStops =
                {
                    new GradientStop(entry.StartColor, 0.0),
                    new GradientStop(entry.EndColor, 1.0)
                }
            };

            // Specular Rim Highlight Pen (Law 15 / Elevated Visuals)
            var specularPen = new Pen(new SolidColorBrush(Color.FromArgb(50, 255, 255, 255)), 0.6);

            context.DrawGeometry(primaryBrush, specularPen, primaryGeom);

            // Secondary Layer Geometry (Accent Detail / High-Tech Core)
            var secColor = entry.SecondaryColor;
            IBrush secondaryBrush = CustomColorOverride != null
                ? CustomColorOverride
                : new SolidColorBrush(Color.FromArgb(230, secColor.R, secColor.G, secColor.B));

            context.DrawGeometry(secondaryBrush, null, secondaryGeom);
        }
    }
}
