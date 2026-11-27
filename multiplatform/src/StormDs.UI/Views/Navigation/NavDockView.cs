// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using System.Collections.Generic;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Layout;
using Avalonia.Media;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Services;
using Storm.AuroraFluid.Kit.Themes;
using StormDs.UI.Common;

namespace StormDs.UI.Views.Navigation;

/// <summary>
/// Bottom Spatial Glass Dock for compact screens and mobile (Width < 880).
/// Translucent floating pill dock with 8 colored vector icons.
/// </summary>
public class NavDockView : Border
{
    private readonly List<(NavSectionKind Kind, Border Container, TextBlock LabelText)> _items = [];

    public NavDockView()
    {
        Height = 64;
        HorizontalAlignment = HorizontalAlignment.Center;
        VerticalAlignment = VerticalAlignment.Bottom;
        Margin = new Thickness(12, 0, 12, 10);
        CornerRadius = new CornerRadius(20);

        // Spatial Glass Blur styling
        Background = new SolidColorBrush(Color.FromArgb(200, 15, 18, 28));
        BorderBrush = new SolidColorBrush(Color.FromArgb(70, 255, 255, 255));
        BorderThickness = new Thickness(1);
        Padding = new Thickness(8, 4);

        var stack = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Center,
            Spacing = 4
        };

        AddItem(stack, NavSectionKind.Library, AuroraIconKind.LibraryGrid, "Игры");
        AddItem(stack, NavSectionKind.Favorites, AuroraIconKind.StarFavorite, "Топ");
        AddItem(stack, NavSectionKind.Recent, AuroraIconKind.RecentClock, "История");
        AddItem(stack, NavSectionKind.DsiNand, AuroraIconKind.DsiNandChip, "NAND");
        AddItem(stack, NavSectionKind.Achievements, AuroraIconKind.TrophyCrown, "Награды");
        AddItem(stack, NavSectionKind.Netplay, AuroraIconKind.WifiGlobe, "Сеть");
        AddItem(stack, NavSectionKind.AiTranslator, AuroraIconKind.AiTranslatorSpark, "ИИ");
        AddItem(stack, NavSectionKind.Settings, AuroraIconKind.SettingsCore, "Опции");

        Child = stack;

        StormDsUiState.Instance.NavSectionChanged += (k) => UpdateActiveStyles();
        StormThemeBrushes.BindTheme(this, () =>
        {
            Background = StormThemeBrushes.GlassPanel;
            BorderBrush = StormThemeBrushes.StrongBorder;
            UpdateActiveStyles();
        });
        UpdateActiveStyles();
    }

    private void AddItem(StackPanel panel, NavSectionKind kind, AuroraIconKind icon, string label)
    {
        var container = new Border
        {
            Width = 44,
            Height = 48,
            CornerRadius = new CornerRadius(12),
            Background = Brushes.Transparent,
            Cursor = new Cursor(StandardCursorType.Hand),
            HorizontalAlignment = HorizontalAlignment.Center
        };

        var stack = new StackPanel
        {
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Center,
            Spacing = 2
        };

        var vectorIcon = new AuroraVectorIcon
        {
            Kind = icon,
            Size = 20,
            HorizontalAlignment = HorizontalAlignment.Center
        };

        var text = new TextBlock
        {
            Text = label,
            FontSize = 8.5,
            FontWeight = FontWeight.Medium,
            Foreground = StormThemeBrushes.SecondaryText,
            HorizontalAlignment = HorizontalAlignment.Center
        };

        stack.Children.Add(vectorIcon);
        stack.Children.Add(text);
        container.Child = stack;

        container.PointerPressed += (s, e) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            StormDsUiState.Instance.SetNavSection(kind);
        };

        panel.Children.Add(container);
        _items.Add((kind, container, text));
    }

    private void UpdateActiveStyles()
    {
        var active = StormDsUiState.Instance.ActiveNavSection;
        var theme = AuroraThemeManager.Instance.CurrentTheme;
        var (primary, sec) = AuroraThemeManager.ResolveAccentColors(theme, AuroraThemeManager.Instance.CurrentAccentOverride);

        foreach (var item in _items)
        {
            bool isSelected = item.Kind == active;
            item.LabelText.Foreground = isSelected
                ? StormThemeBrushes.PrimaryText
                : StormThemeBrushes.SecondaryText;
            if (isSelected)
            {
                item.Container.Background = new LinearGradientBrush
                {
                    StartPoint = new RelativePoint(0, 0, RelativeUnit.Relative),
                    EndPoint = new RelativePoint(1, 1, RelativeUnit.Relative),
                    GradientStops =
                    {
                        new GradientStop(Color.FromArgb(theme.IsDark ? (byte)80 : (byte)45, primary.R, primary.G, primary.B), 0.0),
                        new GradientStop(Color.FromArgb(theme.IsDark ? (byte)40 : (byte)22, sec.R, sec.G, sec.B), 1.0)
                    }
                };
                item.Container.BorderBrush = new SolidColorBrush(Color.FromArgb(140, primary.R, primary.G, primary.B));
                item.Container.BorderThickness = new Thickness(1);
            }
            else
            {
                item.Container.Background = Brushes.Transparent;
                item.Container.BorderBrush = Brushes.Transparent;
                item.Container.BorderThickness = new Thickness(0);
            }
        }
    }
}
