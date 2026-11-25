// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Media;
using Storm.AuroraFluid.Kit.Themes;

namespace StormDs.UI.Common;

/// <summary>
/// Provides live theme-aware brushes supporting both all 8 dark palettes and the light STORM DAY theme.
/// </summary>
public static class StormThemeBrushes
{
    public static bool IsDark => AuroraThemeManager.Instance.CurrentTheme.IsDark;

    public static IBrush PrimaryText => new SolidColorBrush(
        IsDark ? Color.Parse("#F8FAFC") : Color.Parse("#0F172A"));

    public static IBrush SecondaryText => new SolidColorBrush(
        IsDark ? Color.Parse("#94A3B8") : Color.Parse("#475569"));

    public static IBrush BodyText => new SolidColorBrush(
        IsDark ? Color.Parse("#CBD5E1") : Color.Parse("#1E293B"));

    public static Color AccentPrimaryColor =>
        AuroraThemeManager.ResolveAccentColors(
            AuroraThemeManager.Instance.CurrentTheme,
            AuroraThemeManager.Instance.CurrentAccentOverride).Primary;

    public static Color AccentSecondaryColor =>
        AuroraThemeManager.ResolveAccentColors(
            AuroraThemeManager.Instance.CurrentTheme,
            AuroraThemeManager.Instance.CurrentAccentOverride).Secondary;

    public static IBrush Accent => new SolidColorBrush(AccentPrimaryColor);
    public static IBrush AccentSecondary => new SolidColorBrush(AccentSecondaryColor);

    public static IBrush ChromeSurface
    {
        get
        {
            var hc = AuroraThemeManager.Instance.CurrentTheme.HeaderColor;
            return new SolidColorBrush(Color.FromArgb(IsDark ? (byte)175 : (byte)220, hc.R, hc.G, hc.B));
        }
    }

    public static IBrush GlassPanel
    {
        get
        {
            var cc = AuroraThemeManager.Instance.CurrentTheme.CardColor;
            return new SolidColorBrush(Color.FromArgb(IsDark ? (byte)160 : (byte)215, cc.R, cc.G, cc.B));
        }
    }

    public static IBrush CardSurface => new SolidColorBrush(
        IsDark ? Color.FromArgb(40, 255, 255, 255) : Color.FromArgb(200, 255, 255, 255));

    public static IBrush RowSurface => new SolidColorBrush(
        IsDark ? Color.FromArgb(28, 255, 255, 255) : Color.FromArgb(170, 241, 245, 249));

    public static IBrush HoverSurface => new SolidColorBrush(
        Color.FromArgb(IsDark ? (byte)55 : (byte)45, AccentPrimaryColor.R, AccentPrimaryColor.G, AccentPrimaryColor.B));

    public static IBrush SubtleBorder => new SolidColorBrush(
        IsDark ? Color.FromArgb(65, 255, 255, 255) : Color.FromArgb(70, 15, 23, 42));

    public static IBrush StrongBorder => new SolidColorBrush(
        IsDark ? Color.FromArgb(100, 255, 255, 255) : Color.FromArgb(110, 15, 23, 42));

    public static IBrush BadgeFill(Color accent) => new SolidColorBrush(
        Color.FromArgb(IsDark ? (byte)36 : (byte)28, accent.R, accent.G, accent.B));

    public static IBrush BadgeBorder(Color accent) => new SolidColorBrush(
        Color.FromArgb(IsDark ? (byte)95 : (byte)120, accent.R, accent.G, accent.B));

    public static void BindTheme(Control control, Action apply)
    {
        apply();

        void OnThemeChanged(AuroraThemeDefinition _) => apply();

        control.AttachedToVisualTree += (_, _) =>
        {
            AuroraThemeManager.Instance.ThemeChanged -= OnThemeChanged;
            AuroraThemeManager.Instance.ThemeChanged += OnThemeChanged;
            apply();
        };

        control.DetachedFromVisualTree += (_, _) =>
        {
            AuroraThemeManager.Instance.ThemeChanged -= OnThemeChanged;
        };
    }
}
