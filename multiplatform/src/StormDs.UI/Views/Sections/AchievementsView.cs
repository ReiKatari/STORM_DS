// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using System.Linq;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Layout;
using Avalonia.Media;
using Storm.AuroraFluid.Kit.Controls;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Services;
using StormDs.UI.Common;

namespace StormDs.UI.Views.Sections;

/// <summary>
/// RetroAchievements live dashboard section.
/// Displays account sign-in status, Hardcore mode, library summary, and offline queue flushing.
/// </summary>
public class AchievementsView : ScrollViewer
{
    private readonly StackPanel _rootStack;
    private readonly TextBlock _accountStatusText;
    private readonly TextBlock _hardcoreStatusText;
    private readonly TextBlock _flushResultText;
    private readonly StackPanel _gamesListStack;

    public AchievementsView()
    {
        Margin = new Thickness(16, 8, 16, 8);
        Padding = new Thickness(0, 0, 14, 0);

        _rootStack = new StackPanel { Spacing = 14 };

        var headerCard = new AuroraGlassCard { Padding = new Thickness(18), SpotlightEnabled = true };
        var hStack = new StackPanel { Spacing = 10 };

        var titleRow = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 8, VerticalAlignment = VerticalAlignment.Center };
        titleRow.Children.Add(new AuroraVectorIcon { Kind = AuroraIconKind.TrophyCrown, Size = 22, VerticalAlignment = VerticalAlignment.Center });
        var titleBlock = new TextBlock { Text = "ДОСТИЖЕНИЯ RETROACHIEVEMENTS", FontSize = 15, FontWeight = FontWeight.Bold };
        titleRow.Children.Add(titleBlock);
        hStack.Children.Add(titleRow);

        _accountStatusText = new TextBlock { FontSize = 12.5 };
        _hardcoreStatusText = new TextBlock { FontSize = 12 };
        _flushResultText = new TextBlock { FontSize = 11.5 };
        hStack.Children.Add(_accountStatusText);
        hStack.Children.Add(_hardcoreStatusText);

        var actionsRow = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 10 };
        var flushBtn = CreateBtn(AuroraIconKind.SyncDevices, "Синхронизировать очередь", async () =>
        {
            _flushResultText.Text = "Выполняется отправка отложенных достижений...";
            int sent = await StormDsUiState.Instance.RetroAchievementsService.FlushOfflineQueueAsync();
            _flushResultText.Text = $"Отправлено достижений из очереди: {sent}";
        });
        var settingsBtn = CreateBtn(AuroraIconKind.SettingsCore, "Настройки аккаунта", () =>
        {
            StormDsUiState.Instance.SetNavSection(NavSectionKind.Settings);
        });
        actionsRow.Children.Add(flushBtn);
        actionsRow.Children.Add(settingsBtn);
        hStack.Children.Add(actionsRow);
        hStack.Children.Add(_flushResultText);

        headerCard.Content = hStack;
        _rootStack.Children.Add(headerCard);

        var listCard = new AuroraGlassCard { Padding = new Thickness(16), SpotlightEnabled = true };
        var listRoot = new StackPanel { Spacing = 10 };
        var subHeader = new TextBlock { Text = "ИГРЫ БИБЛИОТЕКИ С ХЭШАМИ RETROACHIEVEMENTS", FontSize = 11, FontWeight = FontWeight.Bold };
        listRoot.Children.Add(subHeader);
        _gamesListStack = new StackPanel { Spacing = 6 };
        listRoot.Children.Add(_gamesListStack);
        listCard.Content = listRoot;
        _rootStack.Children.Add(listCard);

        Content = _rootStack;

        StormThemeBrushes.BindTheme(this, () =>
        {
            titleBlock.Foreground = StormThemeBrushes.Accent;
            _accountStatusText.Foreground = StormThemeBrushes.PrimaryText;
            _hardcoreStatusText.Foreground = StormThemeBrushes.SecondaryText;
            _flushResultText.Foreground = StormThemeBrushes.AccentSecondary;
            subHeader.Foreground = StormThemeBrushes.SecondaryText;
            RefreshData();
        });

        StormDsUiState.Instance.StateChanged += RefreshData;
        StormDsUiState.Instance.SettingsSaved += RefreshData;
        RefreshData();
    }

    public void RefreshData()
    {
        var ra = StormDsUiState.Instance.RetroAchievementsService;
        _accountStatusText.Text = ra.IsLoggedIn
            ? $"Профиль активен: {ra.Username}"
            : "Профиль не настроен - укажите логин и Web API Token в разделе настроек";
        _hardcoreStatusText.Text = ra.IsHardcoreMode
            ? "Режим: Хардкорный (загрузка состояний, перемотка и читы заблокированы)"
            : "Режим: Обычный (достижения отслеживаются без ограничений)";

        _gamesListStack.Children.Clear();
        var roms = StormDsUiState.Instance.LibraryService.AllRoms.Take(24).ToList();
        if (roms.Count == 0)
        {
            _gamesListStack.Children.Add(new TextBlock
            {
                Text = "В библиотеке пока нет ROM-образов для сопоставления",
                FontSize = 12,
                Foreground = StormThemeBrushes.SecondaryText
            });
            return;
        }

        string lang = StormDsUiState.Instance.AppConfig.Language;
        foreach (var rom in roms)
        {
            var row = new Border
            {
                Padding = new Thickness(12, 8),
                CornerRadius = new CornerRadius(8),
                Background = StormThemeBrushes.RowSurface,
                BorderBrush = StormThemeBrushes.SubtleBorder,
                BorderThickness = new Thickness(1),
                Cursor = new Cursor(StandardCursorType.Hand)
            };

            var g = new Grid { ColumnDefinitions = new ColumnDefinitions("Auto,*,Auto") };
            g.Children.Add(new AuroraVectorIcon { Kind = AuroraIconKind.ShieldVerified, Size = 16, VerticalAlignment = VerticalAlignment.Center, Margin = new Thickness(0, 0, 10, 0) });

            var info = new StackPanel { Spacing = 2, VerticalAlignment = VerticalAlignment.Center };
            info.Children.Add(new TextBlock { Text = rom.GetDisplayTitle(lang), FontSize = 12.5, FontWeight = FontWeight.SemiBold, Foreground = StormThemeBrushes.PrimaryText });
            info.Children.Add(new TextBlock { Text = $"{rom.GameCode} | CRC32: {rom.Crc32Hex}", FontSize = 10.5, Foreground = StormThemeBrushes.SecondaryText });
            g.Children.Add(info);
            Grid.SetColumn(info, 1);

            var openBtn = new TextBlock { Text = "Подробнее", FontSize = 11, FontWeight = FontWeight.SemiBold, Foreground = StormThemeBrushes.Accent, VerticalAlignment = VerticalAlignment.Center };
            g.Children.Add(openBtn);
            Grid.SetColumn(openBtn, 2);

            row.Child = g;
            row.PointerPressed += (_, _) =>
            {
                AuroraTactileFeedbackService.Instance.PlayClick();
                StormDsUiState.Instance.SelectRom(rom);
                StormDsUiState.Instance.RequestRomModal(rom, 2);
            };
            _gamesListStack.Children.Add(row);
        }
    }

    private static AuroraVolumetricButton CreateBtn(AuroraIconKind icon, string text, Action onClick)
    {
        var btn = new AuroraVolumetricButton { Height = 32, Padding = new Thickness(12, 2) };
        var sp = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 6, VerticalAlignment = VerticalAlignment.Center };
        sp.Children.Add(new AuroraVectorIcon { Kind = icon, Size = 14, VerticalAlignment = VerticalAlignment.Center });
        sp.Children.Add(new TextBlock { Text = text, FontSize = 11.5, FontWeight = FontWeight.SemiBold, Foreground = Brushes.White, VerticalAlignment = VerticalAlignment.Center });
        btn.Content = sp;
        btn.Click += (_, _) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            onClick();
        };
        return btn;
    }
}
