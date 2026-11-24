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
/// Left vertical navigation rail (72px) for Landscape/Desktop layouts.
/// Hosts 8 sections, each with a unique colored AuroraVectorIcon (0% duplicates).
/// </summary>
public class NavRailView : Border
{
    private readonly List<(NavSectionKind Kind, AuroraIconKind Icon, string Label, Border Container)> _items = [];

    public NavRailView()
    {
        Width = 72;
        HorizontalAlignment = HorizontalAlignment.Left;
        VerticalAlignment = VerticalAlignment.Stretch;

        // Subtle glass background with 1px right border
        Background = new SolidColorBrush(Color.FromArgb(140, 15, 18, 28));
        BorderBrush = new SolidColorBrush(Color.FromArgb(50, 255, 255, 255));
        BorderThickness = new Thickness(0, 0, 1, 0);

        var rootGrid = new Grid
        {
            RowDefinitions = new RowDefinitions("*,Auto")
        };

        var topStack = new StackPanel
        {
            Spacing = 6,
            Margin = new Thickness(0, 12, 0, 0)
        };

        // 7 top items
        AddItem(topStack, NavSectionKind.Library, AuroraIconKind.LibraryGrid, "Библиотека");
        AddItem(topStack, NavSectionKind.Favorites, AuroraIconKind.StarFavorite, "Избранное");
        AddItem(topStack, NavSectionKind.Recent, AuroraIconKind.RecentClock, "Недавние");
        AddItem(topStack, NavSectionKind.DsiNand, AuroraIconKind.DsiNandChip, "NAND");
        AddItem(topStack, NavSectionKind.Achievements, AuroraIconKind.TrophyCrown, "Награды");
        AddItem(topStack, NavSectionKind.Netplay, AuroraIconKind.WifiGlobe, "Сеть");
        AddItem(topStack, NavSectionKind.AiTranslator, AuroraIconKind.AiTranslatorSpark, "ИИ");

        rootGrid.Children.Add(topStack);
        Grid.SetRow(topStack, 0);

        // Bottom Settings item
        var bottomStack = new StackPanel
        {
            Margin = new Thickness(0, 0, 0, 14)
        };
        AddItem(bottomStack, NavSectionKind.Settings, AuroraIconKind.SettingsCore, "Опции");
        rootGrid.Children.Add(bottomStack);
        Grid.SetRow(bottomStack, 1);

        Child = rootGrid;

        StormDsUiState.Instance.NavSectionChanged += (k) => UpdateActiveStyles();
        UpdateActiveStyles();
    }

    private void AddItem(StackPanel panel, NavSectionKind kind, AuroraIconKind icon, string label)
    {
        var container = new Border
        {
            Width = 56,
            Height = 56,
            CornerRadius = new CornerRadius(12),
            Background = Brushes.Transparent,
            Cursor = new Cursor(StandardCursorType.Hand),
            HorizontalAlignment = HorizontalAlignment.Center
        };

        var stack = new StackPanel
        {
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Center,
            Spacing = 3
        };

        var vectorIcon = new AuroraVectorIcon
        {
            Kind = icon,
            Size = 22,
            HorizontalAlignment = HorizontalAlignment.Center
        };

        var text = new TextBlock
        {
            Text = label,
            FontSize = 9.5,
            FontWeight = FontWeight.Medium,
            Foreground = new SolidColorBrush(Color.Parse("#94A3B8")),
            HorizontalAlignment = HorizontalAlignment.Center
        };

        stack.Children.Add(vectorIcon);
        stack.Children.Add(text);
        container.Child = stack;

        container.PointerEntered += (s, e) =>
        {
            if (StormDsUiState.Instance.ActiveNavSection != kind)
            {
                container.Background = new SolidColorBrush(Color.FromArgb(25, 255, 255, 255));
                AuroraTactileFeedbackService.Instance.PlayHoverTick();
            }
        };

        container.PointerExited += (s, e) =>
        {
            if (StormDsUiState.Instance.ActiveNavSection != kind)
            {
                container.Background = Brushes.Transparent;
            }
        };

        container.PointerPressed += (s, e) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            StormDsUiState.Instance.SetNavSection(kind);
        };

        panel.Children.Add(container);
        _items.Add((kind, icon, label, container));
    }

    private void UpdateActiveStyles()
    {
        var active = StormDsUiState.Instance.ActiveNavSection;
        var theme = AuroraThemeManager.Instance.CurrentTheme;
        var (primary, sec) = AuroraThemeManager.ResolveAccentColors(theme, AuroraThemeManager.Instance.CurrentAccentOverride);

        foreach (var item in _items)
        {
            bool isSelected = item.Kind == active;
            if (isSelected)
            {
                item.Container.Background = new LinearGradientBrush
                {
                    StartPoint = new RelativePoint(0, 0, RelativeUnit.Relative),
                    EndPoint = new RelativePoint(1, 1, RelativeUnit.Relative),
                    GradientStops =
                    {
                        new GradientStop(Color.FromArgb(70, primary.R, primary.G, primary.B), 0.0),
                        new GradientStop(Color.FromArgb(30, sec.R, sec.G, sec.B), 1.0)
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
