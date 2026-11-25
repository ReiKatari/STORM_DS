// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using System.Collections.Generic;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Layout;
using Avalonia.Media;
using Avalonia.Media.Imaging;
using Storm.AuroraFluid.Kit.Controls;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Services;
using Storm.AuroraFluid.Kit.Themes;
using StormDs.Core.Library;
using StormDs.UI.Common;

namespace StormDs.UI.Views.Bento;

/// <summary>
/// Collector Table View for ROM collection enthusiasts.
/// Visible vertical and horizontal grid lines (#25FFFFFF) and Nearest-Neighbor
/// 32x32 -> 48x48 game icon in column 1.
/// </summary>
public class CollectorTableView : Border
{
    private readonly StackPanel _rowsStack;

    public CollectorTableView()
    {
        BorderThickness = new Thickness(1);
        CornerRadius = new CornerRadius(12);
        ClipToBounds = true;

        var mainStack = new StackPanel();

        // 1. Table Header Row
        var header = new Grid
        {
            Height = 36,
            ColumnDefinitions = new ColumnDefinitions("60,*,100,80,90,100,80,120")
        };

        header.Children.Add(CreateHeaderCell("ИКОНКА", 0));
        header.Children.Add(CreateHeaderCell("НАЗВАНИЕ ИГРЫ", 1));
        header.Children.Add(CreateHeaderCell("GAMECODE", 2));
        header.Children.Add(CreateHeaderCell("ТИП", 3));
        header.Children.Add(CreateHeaderCell("РАЗМЕР", 4));
        header.Children.Add(CreateHeaderCell("CRC32", 5));
        header.Children.Add(CreateHeaderCell("ЗАПУСКОВ", 6));
        header.Children.Add(CreateHeaderCell("ДАТА ЗАПУСКА", 7));

        mainStack.Children.Add(header);

        // 2. Rows Stack
        _rowsStack = new StackPanel();
        mainStack.Children.Add(_rowsStack);

        Child = mainStack;

        StormDsUiState.Instance.FilterChanged += RefreshRows;
        StormDsUiState.Instance.StateChanged += RefreshRows;
        StormThemeBrushes.BindTheme(this, () =>
        {
            Background = StormThemeBrushes.GlassPanel;
            BorderBrush = StormThemeBrushes.SubtleBorder;
            header.Background = StormThemeBrushes.CardSurface;
            RefreshRows();
        });
        RefreshRows();
    }

    private static Border CreateHeaderCell(string title, int col)
    {
        var border = new Border
        {
            BorderBrush = new SolidColorBrush(Color.Parse("#25FFFFFF")),
            BorderThickness = new Thickness(col > 0 ? 1 : 0, 0, 0, 1),
            Padding = new Thickness(8, 0),
            VerticalAlignment = VerticalAlignment.Stretch
        };

        var text = new TextBlock
        {
            Text = title,
            FontSize = 10,
            FontWeight = FontWeight.Bold,
            Foreground = new SolidColorBrush(Color.Parse("#94A3B8")),
            VerticalAlignment = VerticalAlignment.Center
        };

        border.Child = text;
        Grid.SetColumn(border, col);
        return border;
    }

    public void RefreshRows()
    {
        _rowsStack.Children.Clear();
        var roms = StormDsUiState.Instance.GetFilteredRoms();
        string lang = StormDsUiState.Instance.AppConfig.Language;
        var selected = StormDsUiState.Instance.SelectedRom;

        foreach (var rom in roms)
        {
            bool isSelected = selected?.FilePath == rom.FilePath;
            var row = new Grid
            {
                Height = 48,
                Background = isSelected
                    ? new SolidColorBrush(Color.FromArgb(60, 56, 189, 248))
                    : Brushes.Transparent,
                Cursor = new Cursor(StandardCursorType.Hand),
                ColumnDefinitions = new ColumnDefinitions("60,*,100,80,90,100,80,120")
            };

            // Col 0: 32x32 -> 48x48 icon (Nearest-Neighbor)
            var iconCell = new Border
            {
                BorderBrush = new SolidColorBrush(Color.Parse("#25FFFFFF")),
                BorderThickness = new Thickness(0, 0, 0, 1),
                VerticalAlignment = VerticalAlignment.Stretch,
                HorizontalAlignment = HorizontalAlignment.Stretch
            };
            var img = new Image
            {
                Width = 40,
                Height = 40,
                Stretch = Stretch.Uniform,
                HorizontalAlignment = HorizontalAlignment.Center,
                VerticalAlignment = VerticalAlignment.Center
            };
            RenderOptions.SetBitmapInterpolationMode(img, BitmapInterpolationMode.None);
            var bgra = StormDsUiState.Instance.LibraryService.GetIconBgra128(rom.GameCode);
            if (bgra != null) img.Source = BitmapHelper.CreateBgraBitmap(bgra, 128, 128);
            iconCell.Child = img;
            row.Children.Add(iconCell);
            Grid.SetColumn(iconCell, 0);

            // Col 1: Title
            row.Children.Add(CreateDataCell(rom.GetDisplayTitle(lang), 1, true));

            // Col 2: GameCode
            row.Children.Add(CreateDataCell(rom.GameCode, 2, false, "#38BDF8"));

            // Col 3: UnitCode
            row.Children.Add(CreateDataCell(rom.UnitCode.ToString(), 3, false, "#10B981"));

            // Col 4: Size
            row.Children.Add(CreateDataCell($"{rom.FileSizeBytes / (1024.0 * 1024.0):0.1} MB", 4));

            // Col 5: CRC32
            row.Children.Add(CreateDataCell(rom.Crc32Hex, 5, false, "#A855F7"));

            // Col 6: PlayCount
            row.Children.Add(CreateDataCell(rom.PlayCount.ToString(), 6));

            // Col 7: LastPlayedUtc
            string lastPlayed = rom.LastPlayedUtc.HasValue
                ? $"{rom.LastPlayedUtc.Value:dd.MM.yyyy HH:mm}"
                : "-";
            row.Children.Add(CreateDataCell(lastPlayed, 7));

            row.PointerEntered += (s, e) =>
            {
                if (StormDsUiState.Instance.SelectedRom?.FilePath != rom.FilePath)
                {
                    row.Background = new SolidColorBrush(Color.FromArgb(25, 255, 255, 255));
                }
            };
            row.PointerExited += (s, e) =>
            {
                if (StormDsUiState.Instance.SelectedRom?.FilePath != rom.FilePath)
                {
                    row.Background = Brushes.Transparent;
                }
            };

            row.PointerPressed += (s, e) =>
            {
                AuroraTactileFeedbackService.Instance.PlayClick();
                StormDsUiState.Instance.SelectRom(rom);
            };

            row.DoubleTapped += (s, e) =>
            {
                StormDsUiState.Instance.StartEmulation(rom);
            };

            _rowsStack.Children.Add(row);
        }
    }

    private static Border CreateDataCell(string text, int col, bool bold = false, string? hexColor = null)
    {
        var border = new Border
        {
            BorderBrush = new SolidColorBrush(Color.Parse("#25FFFFFF")),
            BorderThickness = new Thickness(col > 0 ? 1 : 0, 0, 0, 1),
            Padding = new Thickness(8, 0),
            VerticalAlignment = VerticalAlignment.Stretch
        };

        var tb = new TextBlock
        {
            Text = text,
            FontSize = 11.5,
            FontWeight = bold ? FontWeight.Bold : FontWeight.Normal,
            Foreground = hexColor != null
                ? new SolidColorBrush(Color.Parse(hexColor))
                : StormThemeBrushes.BodyText,
            VerticalAlignment = VerticalAlignment.Center,
            TextTrimming = TextTrimming.CharacterEllipsis
        };

        border.Child = tb;
        Grid.SetColumn(border, col);
        return border;
    }
}
