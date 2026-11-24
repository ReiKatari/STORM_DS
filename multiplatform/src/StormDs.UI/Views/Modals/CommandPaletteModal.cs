// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using System.Collections.Generic;
using System.Linq;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Layout;
using Avalonia.Media;
using Storm.AuroraFluid.Kit.Controls;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Services;
using Storm.AuroraFluid.Kit.Themes;
using StormDs.UI.Common;

namespace StormDs.UI.Views.Modals;

/// <summary>
/// Global Ctrl+K Command & Search Palette Modal.
/// Provides instant action execution and ROM search, fully dismissible via ESC (Law 16).
/// </summary>
public class CommandPaletteModal : AuroraGlassCard
{
    private readonly AuroraSearchBox _searchBox;
    private readonly StackPanel _resultsStack;
    private readonly List<(AuroraIconKind Icon, string Title, string Sub, Action Action)> _allActions = [];

    public event Action? CloseRequested;

    public CommandPaletteModal()
    {
        Width = 560;
        MaxHeight = 440;
        Padding = new Thickness(16);
        SpotlightEnabled = true;

        var mainStack = new StackPanel { Spacing = 10 };

        // 1. Search Box
        _searchBox = new AuroraSearchBox
        {
            PlaceholderText = "Введите команду или название игры...",
            HotkeyHint = "ESC для закрытия",
            Height = 40
        };
        _searchBox.TextChanged += (s, e) => FilterActions(_searchBox.Text ?? string.Empty);
        mainStack.Children.Add(_searchBox);

        // 2. Results Scroll
        var scroll = new ScrollViewer
        {
            Height = 320,
            Padding = new Thickness(0, 0, 6, 0)
        };
        _resultsStack = new StackPanel { Spacing = 4 };
        scroll.Content = _resultsStack;
        mainStack.Children.Add(scroll);

        Content = mainStack;

        RegisterActions();
        FilterActions(string.Empty);
    }

    private void RegisterActions()
    {
        _allActions.Add((AuroraIconKind.PlayPrism, "Запустить выбранную игру", "Мгновенный запуск активного картриджа NDS", () =>
        {
            CloseRequested?.Invoke();
            StormDsUiState.Instance.StartEmulation();
        }));

        _allActions.Add((AuroraIconKind.ResetCycle, "Запустить меню FreeBIOS", "Эмуляция оригинального меню Nintendo DS", () =>
        {
            CloseRequested?.Invoke();
            StormDsUiState.Instance.StartEmulation(bootBios: true);
        }));

        _allActions.Add((AuroraIconKind.SettingsCore, "Открыть настройки эмулятора", "Конфигурация графики, звука, управления и сети", () =>
        {
            CloseRequested?.Invoke();
            StormDsUiState.Instance.SetNavSection(NavSectionKind.Settings);
        }));

        _allActions.Add((AuroraIconKind.DsiNandChip, "Менеджер DSiWare NAND", "Управление встроенной памятью и заголовками DSi", () =>
        {
            CloseRequested?.Invoke();
            StormDsUiState.Instance.SetNavSection(NavSectionKind.DsiNand);
        }));

        _allActions.Add((AuroraIconKind.FolderVault, "Сканировать папки ROM", "Поиск новых игр в каталоге roms/ и на дисках", async () =>
        {
            CloseRequested?.Invoke();
            await StormDsUiState.Instance.LibraryService.ScanDirectoriesAsync();
        }));

        _allActions.Add((AuroraIconKind.ThemePalette, "Сменить тему оформления", "Циклическое переключение 9 тем STORM", () =>
        {
            CloseRequested?.Invoke();
            CycleTheme();
        }));

        _allActions.Add((AuroraIconKind.UpdateRocket, "Проверить обновления", "Двухзеркальный запрос GitHub и STORM Official Git", () =>
        {
            CloseRequested?.Invoke();
            StormDsUiState.Instance.SetNavSection(NavSectionKind.Settings);
        }));
    }

    private static void CycleTheme()
    {
        var themes = new[]
        {
            AuroraThemeManager.ThemeMidnight,
            AuroraThemeManager.ThemeNight,
            AuroraThemeManager.ThemeDark,
            AuroraThemeManager.ThemeDay,
            AuroraThemeManager.ThemeFantasy,
            AuroraThemeManager.ThemeCyberpunk,
            AuroraThemeManager.ThemeWarhammer40K,
            AuroraThemeManager.ThemeElemental,
            AuroraThemeManager.ThemeStorm
        };
        var cur = AuroraThemeManager.Instance.CurrentTheme.Id;
        int idx = Array.IndexOf(themes, cur);
        int next = (idx + 1) % themes.Length;
        AuroraThemeManager.Instance.ApplyTheme(themes[next]);
        StormDsUiState.Instance.AppConfig.Theme = themes[next];
        StormDsUiState.Instance.SaveConfig();
    }

    private void FilterActions(string q)
    {
        _resultsStack.Children.Clear();
        string clean = q.Trim().ToLowerInvariant();

        var matches = string.IsNullOrWhiteSpace(clean)
            ? _allActions
            : _allActions.Where(a => a.Title.ToLowerInvariant().Contains(clean) || a.Sub.ToLowerInvariant().Contains(clean)).ToList();

        foreach (var action in matches)
        {
            var row = new Border
            {
                Height = 44,
                Padding = new Thickness(10, 4),
                CornerRadius = new CornerRadius(8),
                Background = new SolidColorBrush(Color.FromArgb(30, 255, 255, 255)),
                Cursor = new Cursor(StandardCursorType.Hand)
            };

            var g = new Grid { ColumnDefinitions = new ColumnDefinitions("Auto,*") };
            g.Children.Add(new AuroraVectorIcon { Kind = action.Icon, Size = 18, VerticalAlignment = VerticalAlignment.Center, Margin = new Thickness(0, 0, 10, 0) });

            var s = new StackPanel { VerticalAlignment = VerticalAlignment.Center };
            s.Children.Add(new TextBlock { Text = action.Title, FontSize = 12, FontWeight = FontWeight.Bold, Foreground = Brushes.White });
            s.Children.Add(new TextBlock { Text = action.Sub, FontSize = 9.5, Foreground = new SolidColorBrush(Color.Parse("#94A3B8")) });
            g.Children.Add(s);
            Grid.SetColumn(s, 1);

            row.Child = g;

            row.PointerEntered += (sender, e) => row.Background = new SolidColorBrush(Color.FromArgb(60, 56, 189, 248));
            row.PointerExited += (sender, e) => row.Background = new SolidColorBrush(Color.FromArgb(30, 255, 255, 255));
            row.PointerPressed += (sender, e) =>
            {
                AuroraTactileFeedbackService.Instance.PlayClick();
                action.Action();
            };

            _resultsStack.Children.Add(row);
        }
    }
}
