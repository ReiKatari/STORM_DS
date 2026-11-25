// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using System.IO;
using System.Linq;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Layout;
using Avalonia.Media;
using Storm.AuroraFluid.Kit.Controls;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Services;
using StormDs.Core.Configuration;
using StormDs.Core.Library;
using StormDs.Core.Paths;
using StormDs.Core.Subsystems;
using StormDs.UI.Common;

namespace StormDs.UI.Views.Modals;

/// <summary>
/// 4-Tab ROM Details and Management Modal enforcing Law 16 (ESC dismissal).
/// Wired to real PerRomProfile, CheatService, RetroAchievementsService, and .sav/.st save files.
/// </summary>
public class RomDetailsModal : AuroraGlassCard
{
    private readonly RomMetadataRecord _rom;
    private readonly StackPanel _tabBar;
    private readonly ContentControl _tabContent;
    private readonly TextBlock _headerTitleText;
    private int _selectedTab;

    public event Action? CloseRequested;

    public RomDetailsModal(RomMetadataRecord rom, int initialTab = 0)
    {
        _rom = rom;
        _selectedTab = initialTab;
        Width = 650;
        Height = 510;
        Padding = new Thickness(20);
        SpotlightEnabled = true;

        var mainGrid = new Grid { RowDefinitions = new RowDefinitions("Auto,Auto,*") };

        // 1. Header with Close Button
        var header = new Grid { ColumnDefinitions = new ColumnDefinitions("Auto,*,Auto"), Margin = new Thickness(0, 0, 0, 10) };
        var titleStack = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 8, VerticalAlignment = VerticalAlignment.Center };
        titleStack.Children.Add(new AuroraVectorIcon { Kind = AuroraIconKind.RomCartridge, Size = 20, VerticalAlignment = VerticalAlignment.Center });
        _headerTitleText = new TextBlock
        {
            Text = $"{rom.GetDisplayTitle(StormDsUiState.Instance.AppConfig.Language)} ({rom.GameCode})",
            FontSize = 13.5,
            FontWeight = FontWeight.Bold,
            VerticalAlignment = VerticalAlignment.Center,
            TextTrimming = TextTrimming.CharacterEllipsis,
            MaxWidth = 500
        };
        titleStack.Children.Add(_headerTitleText);
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
        closeBtn.Click += (_, _) => CloseRequested?.Invoke();
        header.Children.Add(closeBtn);
        Grid.SetColumn(closeBtn, 2);

        mainGrid.Children.Add(header);
        Grid.SetRow(header, 0);

        // 2. 4 Tab Headers Row
        _tabBar = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 6, Margin = new Thickness(0, 0, 0, 12) };
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

        StormThemeBrushes.BindTheme(this, () =>
        {
            _headerTitleText.Foreground = StormThemeBrushes.Accent;
            LoadTab(_selectedTab);
        });

        LoadTab(_selectedTab);
    }

    private void AddTabHeader(int index, AuroraIconKind icon, string title)
    {
        var btn = new Border
        {
            Height = 32,
            Padding = new Thickness(10, 4),
            CornerRadius = new CornerRadius(8),
            BorderThickness = new Thickness(1),
            Cursor = new Cursor(StandardCursorType.Hand)
        };

        var stack = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 6, VerticalAlignment = VerticalAlignment.Center };
        stack.Children.Add(new AuroraVectorIcon { Kind = icon, Size = 14, VerticalAlignment = VerticalAlignment.Center });
        stack.Children.Add(new TextBlock { Text = title, FontSize = 11, FontWeight = FontWeight.Medium, VerticalAlignment = VerticalAlignment.Center });
        btn.Child = stack;

        btn.PointerPressed += (_, _) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            LoadTab(index);
        };

        _tabBar.Children.Add(btn);
    }

    private void LoadTab(int index)
    {
        _selectedTab = index;
        var accentColor = StormThemeBrushes.AccentPrimaryColor;

        for (int i = 0; i < _tabBar.Children.Count; i++)
        {
            if (_tabBar.Children[i] is Border b)
            {
                bool isSel = i == index;
                b.Background = isSel ? StormThemeBrushes.HoverSurface : Brushes.Transparent;
                b.BorderBrush = isSel ? new SolidColorBrush(accentColor) : StormThemeBrushes.SubtleBorder;
                if (b.Child is StackPanel sp && sp.Children.Count > 1 && sp.Children[1] is TextBlock tb)
                {
                    tb.Foreground = isSel ? StormThemeBrushes.PrimaryText : StormThemeBrushes.BodyText;
                }
            }
        }

        var scroll = new ScrollViewer { Padding = new Thickness(0, 0, 8, 0) };
        var stack = new StackPanel { Spacing = 10 };

        switch (index)
        {
            case 0:
                BuildConfigTab(stack);
                break;
            case 1:
                BuildCheatsTab(stack);
                break;
            case 2:
                BuildAchievementsTab(stack);
                break;
            case 3:
                BuildSavesTab(stack);
                break;
        }

        scroll.Content = stack;
        _tabContent.Content = scroll;
    }

    private void BuildConfigTab(StackPanel stack)
    {
        var profile = StormDsUiState.Instance.LoadRomProfile(_rom.GameCode);
        stack.Children.Add(CreateMetaRow("Путь к файлу:", _rom.FilePath));
        stack.Children.Add(CreateMetaRow("Размер ROM:", $"{_rom.FileSizeBytes / (1024.0 * 1024.0):0.2} MB ({_rom.FileSizeBytes} байт)"));
        stack.Children.Add(CreateMetaRow("CRC32 заголовка:", _rom.Crc32Hex));
        stack.Children.Add(CreateMetaRow("Код картриджа:", _rom.GameCode));
        stack.Children.Add(CreateMetaRow("Код производителя:", _rom.MakerCode));
        stack.Children.Add(CreateMetaRow("Тип устройства:", _rom.UnitCode.ToString()));

        var profileStatus = new TextBlock { FontSize = 11, Foreground = StormThemeBrushes.AccentSecondary };

        var slot2Row = new Grid { ColumnDefinitions = new ColumnDefinitions("180,*"), Margin = new Thickness(0, 4) };
        slot2Row.Children.Add(new TextBlock { Text = "Профиль Slot-2 игры:", FontSize = 11.5, Foreground = StormThemeBrushes.SecondaryText, VerticalAlignment = VerticalAlignment.Center });
        var slot2Combo = new ComboBox
        {
            HorizontalAlignment = HorizontalAlignment.Stretch,
            ItemsSource = new[]
            {
                "Использовать глобальный",
                "Отсутствует (None)",
                "Картридж GBA",
                "Расширение памяти RAM",
                "Rumble Pak (Вибрация)",
                "Солнечный датчик Boktai",
                "Guitar Hero Grip",
                "Motion Pak (Акселерометр)",
                "Шагомер (Pedometer)"
            },
            SelectedIndex = profile.Slot2AddonType.HasValue ? ((int)profile.Slot2AddonType.Value + 1) : 0
        };
        slot2Row.Children.Add(slot2Combo);
        Grid.SetColumn(slot2Combo, 1);
        stack.Children.Add(slot2Row);

        var cheatsCb = new AuroraNeonCheckBox
        {
            Label = "Разрешить читы ActionReplay для этого картриджа",
            IsChecked = profile.CheatsEnabled ?? StormDsUiState.Instance.AppConfig.CheatsEnabled
        };
        stack.Children.Add(cheatsCb);

        var saveBtn = new AuroraVolumetricButton { Height = 32, Width = 200, HorizontalAlignment = HorizontalAlignment.Left };
        saveBtn.Content = new TextBlock { Text = "Сохранить профиль игры", FontSize = 11.5, FontWeight = FontWeight.SemiBold, Foreground = Brushes.White, VerticalAlignment = VerticalAlignment.Center, HorizontalAlignment = HorizontalAlignment.Center };
        saveBtn.Click += (_, _) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            int sel = slot2Combo.SelectedIndex;
            profile.GameCode = _rom.GameCode;
            profile.Slot2AddonType = sel <= 0 ? null : (Slot2AddonType)(sel - 1);
            profile.CheatsEnabled = cheatsCb.IsChecked;
            StormDsUiState.Instance.SaveRomProfile(profile);
            StormDsUiState.Instance.ApplyLiveCheats();
            StormDsUiState.Instance.SaveConfig();
            profileStatus.Text = "Профиль игры сохранен и применен.";
        };
        stack.Children.Add(saveBtn);
        stack.Children.Add(profileStatus);
    }

    private void BuildCheatsTab(StackPanel stack)
    {
        var cheatService = StormDsUiState.Instance.CheatService;
        cheatService.LoadCheatsForGame(_rom.GameCode);

        stack.Children.Add(new TextBlock
        {
            Text = $"ЧИТ-КОДЫ ACTIONREPLAY ДЛЯ {_rom.GameCode}",
            FontSize = 11,
            FontWeight = FontWeight.Bold,
            Foreground = StormThemeBrushes.Accent
        });

        var listPanel = new StackPanel { Spacing = 6 };
        void RebuildCheatRows()
        {
            listPanel.Children.Clear();
            var list = cheatService.Cheats;
            if (list.Count == 0)
            {
                listPanel.Children.Add(new TextBlock
                {
                    Text = "Для этой игры еще нет сохраненных читов. Добавьте код ниже.",
                    FontSize = 11.5,
                    Foreground = StormThemeBrushes.SecondaryText
                });
                return;
            }

            for (int i = 0; i < list.Count; i++)
            {
                int idx = i;
                var cheat = list[idx];
                var row = new Border
                {
                    Padding = new Thickness(10, 6),
                    CornerRadius = new CornerRadius(8),
                    Background = StormThemeBrushes.RowSurface,
                    BorderBrush = StormThemeBrushes.SubtleBorder,
                    BorderThickness = new Thickness(1)
                };
                var rg = new Grid { ColumnDefinitions = new ColumnDefinitions("*,Auto") };
                var cb = new AuroraNeonCheckBox { Label = $"{cheat.Name} ({cheat.CodeLines.Count} строк)", IsChecked = cheat.Enabled };
                cb.IsCheckedChanged += (_, _) =>
                {
                    cheatService.ToggleCheat(idx, _rom.GameCode);
                    StormDsUiState.Instance.ApplyLiveCheats();
                };
                rg.Children.Add(cb);

                var del = new Button { Width = 28, Height = 28, Background = Brushes.Transparent, BorderThickness = new Thickness(0), Cursor = new Cursor(StandardCursorType.Hand) };
                del.Content = new AuroraVectorIcon { Kind = AuroraIconKind.TrashClean, Size = 13 };
                del.Click += (_, _) =>
                {
                    cheatService.RemoveCheat(idx, _rom.GameCode);
                    StormDsUiState.Instance.ApplyLiveCheats();
                    RebuildCheatRows();
                };
                rg.Children.Add(del);
                Grid.SetColumn(del, 1);

                row.Child = rg;
                listPanel.Children.Add(row);
            }
        }
        RebuildCheatRows();
        stack.Children.Add(listPanel);

        // Add new cheat form
        var nameBox = new TextBox { PlaceholderText = "Название чита (например: 999999 Gold)", Height = 32 };
        var codeBox = new TextBox { PlaceholderText = "ActionReplay HEX строки, например:\n02001234 000F423F", Height = 64, AcceptsReturn = true, TextWrapping = TextWrapping.Wrap };
        var statusMsg = new TextBlock { FontSize = 11, Foreground = StormThemeBrushes.AccentSecondary };

        var addBtn = new AuroraVolumetricButton { Height = 30, Width = 190, HorizontalAlignment = HorizontalAlignment.Left };
        addBtn.Content = new TextBlock { Text = "Добавить чит-код", FontSize = 11.5, FontWeight = FontWeight.SemiBold, Foreground = Brushes.White, HorizontalAlignment = HorizontalAlignment.Center, VerticalAlignment = VerticalAlignment.Center };
        addBtn.Click += (_, _) =>
        {
            string title = (nameBox.Text ?? string.Empty).Trim();
            string rawLines = codeBox.Text ?? string.Empty;
            var lines = rawLines.Split(new[] { '\r', '\n' }, StringSplitOptions.RemoveEmptyEntries | StringSplitOptions.TrimEntries).ToList();
            if (string.IsNullOrWhiteSpace(title) || lines.Count == 0)
            {
                statusMsg.Text = "Введите название и хотя бы одну строку HEX кода.";
                return;
            }
            cheatService.AddCheat(new ActionReplayCheat { Name = title, Enabled = true, CodeLines = lines }, _rom.GameCode);
            StormDsUiState.Instance.ApplyLiveCheats();
            nameBox.Text = string.Empty;
            codeBox.Text = string.Empty;
            statusMsg.Text = $"Добавлено: {title}";
            RebuildCheatRows();
        };

        stack.Children.Add(new TextBlock { Text = "ДОБАВИТЬ НОВЫЙ КОД", FontSize = 10.5, FontWeight = FontWeight.Bold, Foreground = StormThemeBrushes.SecondaryText, Margin = new Thickness(0, 6, 0, 0) });
        stack.Children.Add(nameBox);
        stack.Children.Add(codeBox);
        stack.Children.Add(addBtn);
        stack.Children.Add(statusMsg);
    }

    private void BuildAchievementsTab(StackPanel stack)
    {
        var ra = StormDsUiState.Instance.RetroAchievementsService;
        stack.Children.Add(new TextBlock { Text = "ДОСТИЖЕНИЯ RETROACHIEVEMENTS", FontSize = 11, FontWeight = FontWeight.Bold, Foreground = StormThemeBrushes.Accent });
        stack.Children.Add(CreateMetaRow("Аккаунт RA:", ra.IsLoggedIn ? ra.Username : "Не настроен (укажите в Настройках -> Сеть)"));
        stack.Children.Add(CreateMetaRow("Идентификатор:", $"{_rom.GameCode} (CRC32: {_rom.Crc32Hex})"));
        stack.Children.Add(CreateMetaRow("Хардкор режим:", ra.IsHardcoreMode ? "Включен (без загрузки состояний и читов)" : "Обычный"));
        stack.Children.Add(CreateMetaRow("Rich Presence:", ra.IsRichPresenceEnabled ? "Активен" : "Отключен"));

        var openSettingsBtn = new AuroraVolumetricButton { Height = 32, Width = 240, HorizontalAlignment = HorizontalAlignment.Left, Margin = new Thickness(0, 6, 0, 0) };
        openSettingsBtn.Content = new TextBlock { Text = "Открыть настройки RetroAchievements", FontSize = 11.5, FontWeight = FontWeight.SemiBold, Foreground = Brushes.White, HorizontalAlignment = HorizontalAlignment.Center, VerticalAlignment = VerticalAlignment.Center };
        openSettingsBtn.Click += (_, _) =>
        {
            CloseRequested?.Invoke();
            StormDsUiState.Instance.SetNavSection(NavSectionKind.Achievements);
        };
        stack.Children.Add(openSettingsBtn);
    }

    private void BuildSavesTab(StackPanel stack)
    {
        string savPath = StormDsPlatformPaths.GetSaveFilePath(_rom.GameCode);
        stack.Children.Add(CreateMetaRow("Картриджное сохранение (.sav):", savPath));
        bool savExists = File.Exists(savPath);
        stack.Children.Add(CreateMetaRow("Размер .sav на диске:", savExists ? $"{new FileInfo(savPath).Length / 1024.0:0.1} KB" : "Сохранение еще не создано"));

        stack.Children.Add(new TextBlock { Text = "БЫСТРЫЕ СЛОТЫ СОХРАНЕНИЙ (.st0 - .st3)", FontSize = 10.5, FontWeight = FontWeight.Bold, Foreground = StormThemeBrushes.Accent, Margin = new Thickness(0, 8, 0, 0) });
        for (int i = 0; i < 4; i++)
        {
            int slot = i;
            string slotPath = StormDsPlatformPaths.GetSaveStateFilePath(_rom.GameCode, slot);
            bool exists = File.Exists(slotPath);
            string detail = exists
                ? $"{new FileInfo(slotPath).Length / 1024.0:0.1} KB | {File.GetLastWriteTime(slotPath):dd.MM.yyyy HH:mm}"
                : "Слот пуст";

            var row = new Border
            {
                Padding = new Thickness(10, 6),
                CornerRadius = new CornerRadius(8),
                Background = StormThemeBrushes.RowSurface,
                BorderBrush = StormThemeBrushes.SubtleBorder,
                BorderThickness = new Thickness(1)
            };
            var g = new Grid { ColumnDefinitions = new ColumnDefinitions("90,*,Auto") };
            g.Children.Add(new TextBlock { Text = $"Слот {slot + 1}", FontSize = 11.5, FontWeight = FontWeight.Bold, Foreground = StormThemeBrushes.PrimaryText, VerticalAlignment = VerticalAlignment.Center });
            var dt = new TextBlock { Text = detail, FontSize = 11, Foreground = StormThemeBrushes.SecondaryText, VerticalAlignment = VerticalAlignment.Center };
            g.Children.Add(dt);
            Grid.SetColumn(dt, 1);

            if (exists)
            {
                var delBtn = new Button { Width = 28, Height = 28, Background = Brushes.Transparent, BorderThickness = new Thickness(0), Cursor = new Cursor(StandardCursorType.Hand) };
                delBtn.Content = new AuroraVectorIcon { Kind = AuroraIconKind.TrashClean, Size = 13 };
                delBtn.Click += (_, _) =>
                {
                    try { File.Delete(slotPath); } catch { }
                    LoadTab(3);
                };
                g.Children.Add(delBtn);
                Grid.SetColumn(delBtn, 2);
            }
            row.Child = g;
            stack.Children.Add(row);
        }
    }

    private static Grid CreateMetaRow(string label, string val)
    {
        var g = new Grid { ColumnDefinitions = new ColumnDefinitions("190,*"), Margin = new Thickness(0, 2) };
        g.Children.Add(new TextBlock { Text = label, FontSize = 11, Foreground = StormThemeBrushes.SecondaryText });
        var vt = new TextBlock { Text = val, FontSize = 11, FontWeight = FontWeight.SemiBold, Foreground = StormThemeBrushes.PrimaryText, TextTrimming = TextTrimming.CharacterEllipsis };
        g.Children.Add(vt);
        Grid.SetColumn(vt, 1);
        return g;
    }
}
