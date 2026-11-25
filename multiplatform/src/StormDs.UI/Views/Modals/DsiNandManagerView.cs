// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using System.IO;
using System.Threading.Tasks;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Layout;
using Avalonia.Media;
using Avalonia.Platform.Storage;
using Storm.AuroraFluid.Kit.Controls;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Services;
using StormDs.Core.Paths;
using StormDs.Core.Subsystems;
using StormDs.UI.Common;

namespace StormDs.UI.Views.Modals;

/// <summary>
/// Real DSiWare NAND Manager View wired to DsiNandService.
/// Supports image browsing, live scanning, DSiWare .app/.nds import, deletion, and TMD save repair.
/// </summary>
public class DsiNandManagerView : AuroraGlassCard
{
    private readonly ProgressBar _nandSpaceBar;
    private readonly TextBlock _titleHeaderText;
    private readonly TextBlock _spaceTitleText;
    private readonly TextBlock _spaceText;
    private readonly TextBlock _nandPathText;
    private readonly TextBlock _statusText;
    private readonly TextBlock _listHeaderText;
    private readonly StackPanel _titlesStack;
    private string _activeNandPath = string.Empty;
    private uint? _selectedTitleLow;

    public event Action? CloseRequested;

    public DsiNandManagerView()
    {
        Width = 640;
        MaxHeight = 560;
        Padding = new Thickness(20);
        SpotlightEnabled = true;

        var mainStack = new StackPanel { Spacing = 12 };

        // 1. Header
        var header = new Grid { ColumnDefinitions = new ColumnDefinitions("Auto,*,Auto") };
        var titleRow = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 8, VerticalAlignment = VerticalAlignment.Center };
        titleRow.Children.Add(new AuroraVectorIcon { Kind = AuroraIconKind.DsiNandChip, Size = 20, VerticalAlignment = VerticalAlignment.Center });
        _titleHeaderText = new TextBlock
        {
            Text = "МЕНЕДЖЕР DSIWARE NAND",
            FontSize = 14,
            FontWeight = FontWeight.Bold,
            VerticalAlignment = VerticalAlignment.Center
        };
        titleRow.Children.Add(_titleHeaderText);
        header.Children.Add(titleRow);
        Grid.SetColumn(titleRow, 0);

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
        mainStack.Children.Add(header);

        // 2. Active NAND Image & Space Bar
        var spaceContainer = new Border
        {
            Padding = new Thickness(12),
            CornerRadius = new CornerRadius(8),
            BorderThickness = new Thickness(1)
        };
        var sStack = new StackPanel { Spacing = 6 };
        var sHeader = new Grid { ColumnDefinitions = new ColumnDefinitions("*,Auto") };
        _spaceTitleText = new TextBlock { Text = "Емкость внутренней памяти NAND:", FontSize = 11 };
        _spaceText = new TextBlock { Text = "Образ не выбран", FontSize = 11, FontWeight = FontWeight.Bold };
        sHeader.Children.Add(_spaceTitleText);
        sHeader.Children.Add(_spaceText);
        Grid.SetColumn(_spaceText, 1);
        sStack.Children.Add(sHeader);

        _nandSpaceBar = new ProgressBar { Minimum = 0, Maximum = 100, Value = 0, Height = 10 };
        sStack.Children.Add(_nandSpaceBar);

        _nandPathText = new TextBlock { FontSize = 10.5, TextTrimming = TextTrimming.CharacterEllipsis };
        sStack.Children.Add(_nandPathText);
        spaceContainer.Child = sStack;
        mainStack.Children.Add(spaceContainer);

        // 3. Actions Toolbar
        var toolRow = new WrapPanel { Orientation = Orientation.Horizontal };
        var browseBtn = CreateVolumetricActionButton(AuroraIconKind.FolderVault, "Выбрать NAND...", () => _ = BrowseNandImageAsync());
        browseBtn.Margin = new Thickness(0, 0, 8, 4);
        toolRow.Children.Add(browseBtn);

        var scanBtn = CreateVolumetricActionButton(AuroraIconKind.ResetCycle, "Сканировать", RefreshNandList);
        scanBtn.Margin = new Thickness(0, 0, 8, 4);
        toolRow.Children.Add(scanBtn);

        var importBtn = CreateVolumetricActionButton(AuroraIconKind.ImportBox, "Импорт .app / .nds", () => _ = ImportTitleAsync());
        importBtn.Margin = new Thickness(0, 0, 8, 4);
        toolRow.Children.Add(importBtn);

        var repairBtn = CreateVolumetricActionButton(AuroraIconKind.RepairWrench, "Восстановить TMD сейвы", RepairSelectedOrAllSaves);
        repairBtn.Margin = new Thickness(0, 0, 8, 4);
        toolRow.Children.Add(repairBtn);

        mainStack.Children.Add(toolRow);

        _statusText = new TextBlock { FontSize = 11 };
        mainStack.Children.Add(_statusText);

        // 4. Installed Titles List
        _listHeaderText = new TextBlock { Text = "УСТАНОВЛЕННЫЕ ПРИЛОЖЕНИЯ И DSIWARE:", FontSize = 10.5, FontWeight = FontWeight.Bold };
        mainStack.Children.Add(_listHeaderText);

        var scroll = new ScrollViewer { Height = 230, Padding = new Thickness(0, 0, 8, 0) };
        _titlesStack = new StackPanel { Spacing = 4 };
        scroll.Content = _titlesStack;
        mainStack.Children.Add(scroll);

        Content = mainStack;

        StormThemeBrushes.BindTheme(this, () =>
        {
            _titleHeaderText.Foreground = StormThemeBrushes.Accent;
            spaceContainer.Background = StormThemeBrushes.CardSurface;
            spaceContainer.BorderBrush = StormThemeBrushes.SubtleBorder;
            _spaceTitleText.Foreground = StormThemeBrushes.BodyText;
            _spaceText.Foreground = StormThemeBrushes.AccentSecondary;
            _nandSpaceBar.Foreground = StormThemeBrushes.Accent;
            _nandPathText.Foreground = StormThemeBrushes.SecondaryText;
            _statusText.Foreground = StormThemeBrushes.Accent;
            _listHeaderText.Foreground = StormThemeBrushes.SecondaryText;
            RefreshNandList();
        });

        RefreshNandList();
    }

    public void RefreshNandList()
    {
        _titlesStack.Children.Clear();
        string? configured = StormDsUiState.Instance.AppConfig.DsiNandPath;
        var (summary, titles) = StormDsUiState.Instance.DsiNandService.ScanNand(configured);
        _activeNandPath = summary.ResolvedNandPath;

        if (!summary.IsImageValid || string.IsNullOrWhiteSpace(summary.ResolvedNandPath))
        {
            _spaceText.Text = "NAND не найден";
            _nandSpaceBar.Value = 0;
            _nandPathText.Text = $"Поместите dsi_nand.bin в {StormDsPlatformPaths.NandDirectory} или выберите файл вручную";
            _titlesStack.Children.Add(new TextBlock
            {
                Text = "Образ DSi NAND не загружен. Нажмите 'Выбрать NAND...' для подключения реального дампа.",
                FontSize = 12,
                Foreground = StormThemeBrushes.SecondaryText,
                TextWrapping = TextWrapping.Wrap,
                Margin = new Thickness(4, 12)
            });
            return;
        }

        double totalMb = Math.Max(1.0, summary.TotalCapacityBytes / (1024.0 * 1024.0));
        double freeMb = summary.FreeSpaceBytes / (1024.0 * 1024.0);
        double usedPct = Math.Clamp((totalMb - freeMb) / totalMb * 100.0, 0.0, 100.0);

        _spaceText.Text = $"Свободно {freeMb:0.1} MB из {totalMb:0.1} MB ({titles.Count} прил.)";
        _nandSpaceBar.Value = usedPct;
        _nandPathText.Text = summary.ResolvedNandPath;

        if (titles.Count == 0)
        {
            _titlesStack.Children.Add(new TextBlock
            {
                Text = "В выбранном образе NAND не найдено установленных приложений DSiWare.",
                FontSize = 12,
                Foreground = StormThemeBrushes.SecondaryText,
                Margin = new Thickness(4, 12)
            });
            return;
        }

        foreach (var t in titles)
        {
            AddTitleRow(t);
        }
    }

    private void AddTitleRow(DsiTitleMetadata title)
    {
        bool selected = _selectedTitleLow == title.TitleIdLow;
        var row = new Border
        {
            CornerRadius = new CornerRadius(8),
            Background = selected ? StormThemeBrushes.HoverSurface : StormThemeBrushes.RowSurface,
            BorderBrush = selected ? StormThemeBrushes.Accent : StormThemeBrushes.SubtleBorder,
            BorderThickness = new Thickness(1),
            Padding = new Thickness(8, 6),
            Cursor = new Cursor(StandardCursorType.Hand)
        };

        var grid = new Grid { ColumnDefinitions = new ColumnDefinitions("Auto,*,Auto,Auto") };
        grid.Children.Add(new AuroraVectorIcon { Kind = AuroraIconKind.DsiWareBadge, Size = 16, VerticalAlignment = VerticalAlignment.Center, Margin = new Thickness(0, 0, 8, 0) });

        var nStack = new StackPanel { VerticalAlignment = VerticalAlignment.Center };
        string displayName = string.IsNullOrWhiteSpace(title.Name) ? title.GameCode : title.Name;
        nStack.Children.Add(new TextBlock { Text = displayName, FontSize = 12, FontWeight = FontWeight.Bold, Foreground = StormThemeBrushes.PrimaryText });
        nStack.Children.Add(new TextBlock
        {
            Text = $"TitleID: {title.TitleIdHex} | Код: {title.GameCode} | {(title.PublicSavExists ? "public.sav OK" : "без public.sav")}",
            FontSize = 9.5,
            Foreground = StormThemeBrushes.SecondaryText
        });
        grid.Children.Add(nStack);
        Grid.SetColumn(nStack, 1);

        double sizeMb = title.SizeBytes / (1024.0 * 1024.0);
        var sText = new TextBlock
        {
            Text = $"{sizeMb:0.1} MB",
            FontSize = 11,
            Foreground = StormThemeBrushes.BodyText,
            VerticalAlignment = VerticalAlignment.Center,
            Margin = new Thickness(8, 0)
        };
        grid.Children.Add(sText);
        Grid.SetColumn(sText, 2);

        var delBtn = new Button
        {
            Width = 28,
            Height = 28,
            Padding = new Thickness(0),
            Background = Brushes.Transparent,
            BorderThickness = new Thickness(0),
            Cursor = new Cursor(StandardCursorType.Hand)
        };
        delBtn.Content = new AuroraVectorIcon { Kind = AuroraIconKind.TrashClean, Size = 13 };
        delBtn.Click += (_, _) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            bool ok = StormDsUiState.Instance.DsiNandService.DeleteTitle(_activeNandPath, title.TitleId);
            _statusText.Text = ok
                ? $"Удалено приложение: {displayName} ({title.TitleIdHex})"
                : $"Не удалось удалить {title.TitleIdHex}";
            if (_selectedTitleLow == title.TitleIdLow) _selectedTitleLow = null;
            RefreshNandList();
        };
        grid.Children.Add(delBtn);
        Grid.SetColumn(delBtn, 3);

        row.Child = grid;
        row.PointerPressed += (_, _) =>
        {
            _selectedTitleLow = title.TitleIdLow;
            RefreshNandList();
        };
        _titlesStack.Children.Add(row);
    }

    private async Task BrowseNandImageAsync()
    {
        var topLevel = TopLevel.GetTopLevel(this);
        if (topLevel?.StorageProvider == null) return;

        var files = await topLevel.StorageProvider.OpenFilePickerAsync(new FilePickerOpenOptions
        {
            Title = "Выберите файл образа DSi NAND (.bin / .img / .nand)",
            AllowMultiple = false,
            FileTypeFilter = new[]
            {
                new FilePickerFileType("DSi NAND Image") { Patterns = new[] { "*.bin", "*.img", "*.nand" } },
                FilePickerFileTypes.All
            }
        });

        string? chosen = files.Count > 0 ? files[0].TryGetLocalPath() : null;
        if (string.IsNullOrWhiteSpace(chosen) || !File.Exists(chosen)) return;

        StormDsUiState.Instance.AppConfig.DsiNandPath = chosen;
        StormDsUiState.Instance.SaveConfig();
        _statusText.Text = $"Подключен образ NAND: {Path.GetFileName(chosen)}";
        RefreshNandList();
    }

    private async Task ImportTitleAsync()
    {
        if (string.IsNullOrWhiteSpace(_activeNandPath) || !File.Exists(_activeNandPath))
        {
            _statusText.Text = "Сначала выберите рабочий образ DSi NAND.";
            return;
        }

        var topLevel = TopLevel.GetTopLevel(this);
        if (topLevel?.StorageProvider == null) return;

        var files = await topLevel.StorageProvider.OpenFilePickerAsync(new FilePickerOpenOptions
        {
            Title = "Импорт DSiWare (.nds / .dsi / .app)",
            AllowMultiple = false,
            FileTypeFilter = new[]
            {
                new FilePickerFileType("DSiWare / NDS") { Patterns = new[] { "*.nds", "*.dsi", "*.app", "*.cia" } },
                FilePickerFileTypes.All
            }
        });

        string? chosen = files.Count > 0 ? files[0].TryGetLocalPath() : null;
        if (string.IsNullOrWhiteSpace(chosen) || !File.Exists(chosen)) return;

        bool ok = StormDsUiState.Instance.DsiNandService.ImportTitle(_activeNandPath, chosen);
        if (ok) AuroraTactileFeedbackService.Instance.PlayAchievementChime();
        _statusText.Text = ok
            ? $"Успешно импортировано в NAND: {Path.GetFileName(chosen)}"
            : $"Ошибка импорта {Path.GetFileName(chosen)} (проверьте корректность заголовка и свободное место)";
        RefreshNandList();
    }

    private void RepairSelectedOrAllSaves()
    {
        if (string.IsNullOrWhiteSpace(_activeNandPath) || !File.Exists(_activeNandPath))
        {
            _statusText.Text = "Сначала выберите образ DSi NAND.";
            return;
        }

        bool ok = StormDsUiState.Instance.DsiNandService.RepairSaves(_activeNandPath, _selectedTitleLow ?? 0);
        if (ok) AuroraTactileFeedbackService.Instance.PlayAchievementChime();
        _statusText.Text = ok
            ? "Сигнатуры TMD и public.sav успешно проверены и восстановлены."
            : "Не удалось восстановить TMD/сейвы в этом образе NAND.";
        RefreshNandList();
    }

    private static AuroraVolumetricButton CreateVolumetricActionButton(AuroraIconKind icon, string label, Action action)
    {
        var btn = new AuroraVolumetricButton { Height = 32, Padding = new Thickness(10, 2) };
        var s = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 6, VerticalAlignment = VerticalAlignment.Center };
        s.Children.Add(new AuroraVectorIcon { Kind = icon, Size = 13, VerticalAlignment = VerticalAlignment.Center });
        s.Children.Add(new TextBlock { Text = label, FontSize = 11, FontWeight = FontWeight.Medium, Foreground = Brushes.White, VerticalAlignment = VerticalAlignment.Center });
        btn.Content = s;
        btn.Click += (_, _) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            action();
        };
        return btn;
    }
}
