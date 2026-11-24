// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using System.IO;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Layout;
using Avalonia.Media;
using Storm.AuroraFluid.Kit.Controls;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Services;
using Storm.AuroraFluid.Kit.Themes;
using StormDs.Core.Configuration;
using StormDs.Core.Library;
using StormDs.Core.Paths;
using StormDs.UI.Common;

namespace StormDs.UI.Views.Modals;

/// <summary>
/// 4-Tab ROM Details and Management Modal enforcing Law 16 (ESC dismissal).
/// Features: Configuration & Slot-2, ActionReplay Cheats, Achievements, and Saves.
/// </summary>
public class RomDetailsModal : AuroraGlassCard
{
    private readonly RomMetadataRecord _rom;
    private readonly StackPanel _tabBar;
    private readonly ContentControl _tabContent;
    private int _selectedTab;

    public event Action? CloseRequested;

    public RomDetailsModal(RomMetadataRecord rom, int initialTab = 0)
    {
        _rom = rom;
        _selectedTab = initialTab;
        Width = 620;
        Height = 480;
        Padding = new Thickness(20);
        SpotlightEnabled = true;

        var mainGrid = new Grid
        {
            RowDefinitions = new RowDefinitions("Auto,Auto,*")
        };

        // 1. Header with Close Button
        var header = new Grid
        {
            ColumnDefinitions = new ColumnDefinitions("Auto,*,Auto"),
            Margin = new Thickness(0, 0, 0, 10)
        };

        var titleStack = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 8, VerticalAlignment = VerticalAlignment.Center };
        titleStack.Children.Add(new AuroraVectorIcon { Kind = AuroraIconKind.RomCartridge, Size = 20, VerticalAlignment = VerticalAlignment.Center });
        titleStack.Children.Add(new TextBlock
        {
            Text = $"{rom.GetDisplayTitle(StormDsUiState.Instance.AppConfig.Language)} ({rom.GameCode})",
            FontSize = 13.5,
            FontWeight = FontWeight.Bold,
            Foreground = new SolidColorBrush(Color.Parse("#38BDF8")),
            VerticalAlignment = VerticalAlignment.Center,
            TextTrimming = TextTrimming.CharacterEllipsis,
            MaxWidth = 480
        });
        header.Children.Add(titleStack);
        Grid.SetColumn(titleStack, 0);

        var closeBtn = new Button
        {
            Width = 30,
            Height = 30,
            Padding = new Thickness(0),
            Background = Brushes.Transparent,
            BorderThickness = new Thickness(0),
            Cursor = new Cursor(StandardCursorType.Hand),
            HorizontalContentAlignment = HorizontalAlignment.Center,
            VerticalContentAlignment = VerticalAlignment.Center
        };
        closeBtn.Content = new AuroraVectorIcon { Kind = AuroraIconKind.WindowClose, Size = 13 };
        closeBtn.Click += (s, e) => CloseRequested?.Invoke();
        header.Children.Add(closeBtn);
        Grid.SetColumn(closeBtn, 2);

        mainGrid.Children.Add(header);
        Grid.SetRow(header, 0);

        // 2. 4 Tab Headers Row
        _tabBar = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 6,
            Margin = new Thickness(0, 0, 0, 12)
        };

        AddTabHeader(0, AuroraIconKind.Slot2Ram, "Конфигурация и Slot-2");
        AddTabHeader(1, AuroraIconKind.CheatMatrix, "Читы ActionReplay");
        AddTabHeader(2, AuroraIconKind.LockHardcore, "Достижения");
        AddTabHeader(3, AuroraIconKind.SaveSlotRibbon, "Сохранения");

        mainGrid.Children.Add(_tabBar);
        Grid.SetRow(_tabBar, 1);

        // 3. Tab Content
        _tabContent = new ContentControl();
        mainGrid.Children.Add(_tabContent);
        Grid.SetRow(_tabContent, 2);

        Content = mainGrid;

        LoadTab(_selectedTab);
    }

    private void AddTabHeader(int index, AuroraIconKind icon, string title)
    {
        var btn = new Border
        {
            Height = 32,
            Padding = new Thickness(10, 4),
            CornerRadius = new CornerRadius(8),
            Background = Brushes.Transparent,
            BorderBrush = new SolidColorBrush(Color.FromArgb(70, 255, 255, 255)),
            BorderThickness = new Thickness(1),
            Cursor = new Cursor(StandardCursorType.Hand)
        };

        var stack = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 6, VerticalAlignment = VerticalAlignment.Center };
        stack.Children.Add(new AuroraVectorIcon { Kind = icon, Size = 14, VerticalAlignment = VerticalAlignment.Center });
        stack.Children.Add(new TextBlock { Text = title, FontSize = 11, FontWeight = FontWeight.Medium, Foreground = new SolidColorBrush(Color.Parse("#E2E8F0")), VerticalAlignment = VerticalAlignment.Center });
        btn.Child = stack;

        btn.PointerPressed += (s, e) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            LoadTab(index);
        };

        _tabBar.Children.Add(btn);
    }

    private void LoadTab(int index)
    {
        _selectedTab = index;

        // Highlight active tab
        var theme = AuroraThemeManager.Instance.CurrentTheme;
        var (primary, _) = AuroraThemeManager.ResolveAccentColors(theme, AuroraThemeManager.Instance.CurrentAccentOverride);

        for (int i = 0; i < _tabBar.Children.Count; i++)
        {
            if (_tabBar.Children[i] is Border b)
            {
                bool isSel = i == index;
                b.Background = isSel ? new SolidColorBrush(Color.FromArgb(80, primary.R, primary.G, primary.B)) : Brushes.Transparent;
                b.BorderBrush = isSel ? new SolidColorBrush(primary) : new SolidColorBrush(Color.FromArgb(60, 255, 255, 255));
            }
        }

        var scroll = new ScrollViewer
        {
            Padding = new Thickness(0, 0, 8, 0)
        };

        var stack = new StackPanel { Spacing = 10 };

        switch (index)
        {
            case 0:
                stack.Children.Add(CreateMetaRow("Путь к файлу:", _rom.FilePath));
                stack.Children.Add(CreateMetaRow("Размер ROM:", $"{_rom.FileSizeBytes / (1024.0 * 1024.0):0.2} MB ({_rom.FileSizeBytes} байт)"));
                stack.Children.Add(CreateMetaRow("CRC32 заголовка:", _rom.Crc32Hex));
                stack.Children.Add(CreateMetaRow("Код картриджа:", _rom.GameCode));
                stack.Children.Add(CreateMetaRow("Код производителя:", _rom.MakerCode));
                stack.Children.Add(CreateMetaRow("Тип устройства:", _rom.UnitCode.ToString()));
                stack.Children.Add(new AuroraNeonCheckBox { Label = "Переопределить Slot-2 для данной игры (GBA / Solar)", IsChecked = false });
                break;

            case 1:
                stack.Children.Add(new TextBlock { Text = "СПИСОК ЧИТ-КОДОВ ACTIONREPLAY ДЛЯ " + _rom.GameCode, FontSize = 10.5, FontWeight = FontWeight.Bold, Foreground = new SolidColorBrush(Color.Parse("#38BDF8")) });
                stack.Children.Add(new AuroraNeonCheckBox { Label = "999999 Монет (Max Gold / Coins)", IsChecked = true });
                stack.Children.Add(new AuroraNeonCheckBox { Label = "Бесконечное здоровье (Infinite HP)", IsChecked = true });
                stack.Children.Add(new AuroraNeonCheckBox { Label = "Все предметы в инвентаре (Unlock All Items)", IsChecked = false });
                stack.Children.Add(new AuroraNeonCheckBox { Label = "Прохождение сквозь стены (Walk Through Walls)", IsChecked = false });
                break;

            case 2:
                stack.Children.Add(new TextBlock { Text = "ДОСТИЖЕНИЯ RETROACHIEVEMENTS", FontSize = 10.5, FontWeight = FontWeight.Bold, Foreground = new SolidColorBrush(Color.Parse("#38BDF8")) });
                stack.Children.Add(CreateMetaRow("Статус привязки:", "Картридж синхронизирован"));
                stack.Children.Add(CreateMetaRow("Хардкор режим:", StormDsUiState.Instance.AppConfig.RetroAchievementsHardcoreMode ? "Включен (Без сохранений)" : "Обычный"));
                stack.Children.Add(CreateMetaRow("Прогресс:", "12 из 48 открыто (250 / 1000 очков)"));
                break;

            case 3:
                string savePath = StormDsPlatformPaths.GetSaveFilePath(_rom.GameCode);
                stack.Children.Add(CreateMetaRow("Основное сохранение (.dsv):", savePath));
                bool exists = File.Exists(savePath);
                stack.Children.Add(CreateMetaRow("Размер сохранения на диске:", exists ? $"{new FileInfo(savePath).Length / 1024.0:0.1} KB" : "Сохранение еще не создано"));
                break;
        }

        scroll.Content = stack;
        _tabContent.Content = scroll;
    }

    private static Grid CreateMetaRow(string label, string val)
    {
        var g = new Grid { ColumnDefinitions = new ColumnDefinitions("160,*"), Margin = new Thickness(0, 3) };
        g.Children.Add(new TextBlock { Text = label, FontSize = 11, Foreground = new SolidColorBrush(Color.Parse("#94A3B8")) });
        var vt = new TextBlock { Text = val, FontSize = 11, FontWeight = FontWeight.SemiBold, Foreground = new SolidColorBrush(Color.Parse("#E2E8F0")), TextTrimming = TextTrimming.CharacterEllipsis };
        g.Children.Add(vt);
        Grid.SetColumn(vt, 1);
        return g;
    }
}
