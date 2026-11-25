// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using System.Collections.Generic;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Layout;
using Avalonia.Media;
using Avalonia.Platform.Storage;
using Storm.AuroraFluid.Kit.Controls;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Services;
using Storm.AuroraFluid.Kit.Themes;
using StormDs.Core.Library;
using StormDs.UI.Common;

namespace StormDs.UI.Views.Bento;

/// <summary>
/// Center Aurora Bento Command Workspace.
/// Features Filter Chips row (0% duplicate icons), View Mode Toggle,
/// Hero Featured Game Card + Vulkan Hardware Card, and Responsive Bento ROM Grid / Collector Table.
/// </summary>
public class BentoWorkspaceView : Grid
{
    private readonly WrapPanel _chipsPanel;
    private readonly WrapPanel _romsWrapPanel;
    private readonly ScrollViewer _cardsScrollViewer;
    private readonly CollectorTableView _collectorTable;
    private readonly List<(RomFilter Filter, Border Chip)> _chips = [];
    private readonly Border _viewModeToggle;
    private readonly AuroraVectorIcon _viewModeIcon;

    public BentoWorkspaceView()
    {
        Margin = new Thickness(16, 0, 16, 0);
        RowDefinitions = new RowDefinitions("Auto,Auto,*");

        // 1. Controls Bar: Wrapping Filter Chips + View Toggle + ROM Folder
        var controlsBar = new Grid
        {
            Margin = new Thickness(0, 8, 0, 6),
            ColumnDefinitions = new ColumnDefinitions("*,Auto")
        };

        _chipsPanel = new WrapPanel
        {
            Orientation = Orientation.Horizontal,
            VerticalAlignment = VerticalAlignment.Center
        };

        AddChip(RomFilter.All, AuroraIconKind.FilterFunnel, "Все игры", Color.Parse("#38BDF8"));
        AddChip(RomFilter.NdsOnly, AuroraIconKind.RomCartridge, "Картриджи NDS", Color.Parse("#10B981"));
        AddChip(RomFilter.DsiEnhanced, AuroraIconKind.DsiWareBadge, "DSi Enhanced", Color.Parse("#F59E0B"));
        AddChip(RomFilter.DsiWare, AuroraIconKind.ImportBox, "DSiWare", Color.Parse("#A855F7"));
        AddChip(RomFilter.Favorites, AuroraIconKind.ShieldVerified, "Избранное", Color.Parse("#EF4444"));
        AddChip(RomFilter.WithAchievements, AuroraIconKind.SpeedGauge, "С достижениями", Color.Parse("#06B6D4"));

        controlsBar.Children.Add(_chipsPanel);
        Grid.SetColumn(_chipsPanel, 0);

        var rightStack = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 8,
            VerticalAlignment = VerticalAlignment.Center
        };

        // View Mode Toggle (Bento Cards <-> Collector Table)
        _viewModeToggle = new Border
        {
            Height = 32,
            Padding = new Thickness(10, 4),
            CornerRadius = new CornerRadius(8),
            Background = new SolidColorBrush(Color.FromArgb(40, 255, 255, 255)),
            BorderBrush = new SolidColorBrush(Color.FromArgb(70, 255, 255, 255)),
            BorderThickness = new Thickness(1),
            Cursor = new Cursor(StandardCursorType.Hand)
        };
        var vmStack = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 6,
            VerticalAlignment = VerticalAlignment.Center
        };
        _viewModeIcon = new AuroraVectorIcon
        {
            Kind = AuroraIconKind.LibraryGrid,
            Size = 14,
            VerticalAlignment = VerticalAlignment.Center
        };
        vmStack.Children.Add(_viewModeIcon);
        vmStack.Children.Add(new TextBlock
        {
            Text = "Вид",
            FontSize = 11.5,
            FontWeight = FontWeight.Medium,
            Foreground = new SolidColorBrush(Color.Parse("#E2E8F0")),
            VerticalAlignment = VerticalAlignment.Center
        });
        _viewModeToggle.Child = vmStack;
        _viewModeToggle.PointerPressed += (s, e) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            var next = StormDsUiState.Instance.ActiveViewMode == BentoViewMode.BentoCards
                ? BentoViewMode.CollectorTable
                : BentoViewMode.BentoCards;
            StormDsUiState.Instance.SetViewMode(next);
            UpdateViewModeVisual();
        };
        rightStack.Children.Add(_viewModeToggle);

        // Scan Folder Button
        var scanFolderBtn = new Border
        {
            Height = 32,
            Padding = new Thickness(10, 4),
            CornerRadius = new CornerRadius(8),
            Background = new SolidColorBrush(Color.FromArgb(40, 255, 255, 255)),
            BorderBrush = new SolidColorBrush(Color.FromArgb(70, 255, 255, 255)),
            BorderThickness = new Thickness(1),
            Cursor = new Cursor(StandardCursorType.Hand)
        };
        var sfStack = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 6,
            VerticalAlignment = VerticalAlignment.Center
        };
        sfStack.Children.Add(new AuroraVectorIcon
        {
            Kind = AuroraIconKind.FolderVault,
            Size = 14,
            VerticalAlignment = VerticalAlignment.Center
        });
        sfStack.Children.Add(new TextBlock
        {
            Text = "Папка ROM",
            FontSize = 11.5,
            FontWeight = FontWeight.Medium,
            Foreground = new SolidColorBrush(Color.Parse("#E2E8F0")),
            VerticalAlignment = VerticalAlignment.Center
        });
        scanFolderBtn.Child = sfStack;
        scanFolderBtn.PointerPressed += async (s, e) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            var top = TopLevel.GetTopLevel(this);
            if (top?.StorageProvider != null)
            {
                var folders = await top.StorageProvider.OpenFolderPickerAsync(new FolderPickerOpenOptions
                {
                    Title = StormDs.Core.Localization.StormDsLoc.T("RomFolderBtn"),
                    AllowMultiple = false
                });
                string? folderPath = folders.Count > 0 ? folders[0].TryGetLocalPath() : null;
                if (!string.IsNullOrWhiteSpace(folderPath))
                {
                    if (!StormDsUiState.Instance.AppConfig.RomDirectories.Contains(folderPath))
                    {
                        StormDsUiState.Instance.AppConfig.RomDirectories.Add(folderPath);
                        StormDsUiState.Instance.SaveConfig();
                    }
                    await StormDsUiState.Instance.LibraryService.ScanDirectoriesAsync(new[] { folderPath });
                    StormDsUiState.Instance.NotifyStatus(folderPath);
                    return;
                }
            }
            await StormDsUiState.Instance.LibraryService.ScanDirectoriesAsync();
        };
        rightStack.Children.Add(scanFolderBtn);

        controlsBar.Children.Add(rightStack);
        Grid.SetColumn(rightStack, 1);

        Children.Add(controlsBar);
        Grid.SetRow(controlsBar, 0);

        // 2. Top Bento Cards Row: Hero Card + Hardware Card (stacks responsively below 800 DIP)
        var topBentoGrid = new Grid
        {
            Margin = new Thickness(0, 0, 0, 10),
            ColumnDefinitions = new ColumnDefinitions("*,320"),
            RowDefinitions = new RowDefinitions("Auto")
        };

        var heroCard = new BentoHeroCard();
        topBentoGrid.Children.Add(heroCard);
        Grid.SetColumn(heroCard, 0);
        Grid.SetRow(heroCard, 0);

        var hwCard = new BentoHardwareCard();
        topBentoGrid.Children.Add(hwCard);
        Grid.SetColumn(hwCard, 1);
        Grid.SetRow(hwCard, 0);

        PropertyChanged += (_, ch) =>
        {
            if (ch.Property == BoundsProperty)
            {
                double w = Bounds.Width;
                if (w <= 0) return;
                if (w < 800)
                {
                    topBentoGrid.ColumnDefinitions = new ColumnDefinitions("*");
                    topBentoGrid.RowDefinitions = new RowDefinitions("Auto,Auto");
                    Grid.SetColumn(heroCard, 0);
                    Grid.SetRow(heroCard, 0);
                    heroCard.Margin = new Thickness(0, 0, 0, 8);
                    Grid.SetColumn(hwCard, 0);
                    Grid.SetRow(hwCard, 1);
                }
                else
                {
                    topBentoGrid.ColumnDefinitions = new ColumnDefinitions("*,320");
                    topBentoGrid.RowDefinitions = new RowDefinitions("Auto");
                    Grid.SetColumn(heroCard, 0);
                    Grid.SetRow(heroCard, 0);
                    heroCard.Margin = new Thickness(0, 0, 8, 8);
                    Grid.SetColumn(hwCard, 1);
                    Grid.SetRow(hwCard, 0);
                }
            }
        };

        Children.Add(topBentoGrid);
        Grid.SetRow(topBentoGrid, 1);

        // 3. Lower Content: Bento ROM Grid OR Collector Table
        // Notice Law 12: ScrollViewer with right clearance Padding="0,0,18,0"
        _cardsScrollViewer = new ScrollViewer
        {
            Padding = new Thickness(0, 0, 18, 0),
            HorizontalScrollBarVisibility = Avalonia.Controls.Primitives.ScrollBarVisibility.Disabled,
            VerticalScrollBarVisibility = Avalonia.Controls.Primitives.ScrollBarVisibility.Auto
        };

        _romsWrapPanel = new WrapPanel
        {
            Orientation = Orientation.Horizontal,
            HorizontalAlignment = HorizontalAlignment.Left
        };
        _cardsScrollViewer.Content = _romsWrapPanel;

        _collectorTable = new CollectorTableView
        {
            IsVisible = false
        };

        var contentContainer = new Grid();
        contentContainer.Children.Add(_cardsScrollViewer);
        contentContainer.Children.Add(_collectorTable);

        Children.Add(contentContainer);
        Grid.SetRow(contentContainer, 2);

        StormDsUiState.Instance.FilterChanged += RefreshGrid;
        StormDsUiState.Instance.StateChanged += RefreshGrid;

        UpdateChipStyles();
        RefreshGrid();
    }

    private void AddChip(RomFilter filter, AuroraIconKind icon, string label, Color accent)
    {
        var chip = new Border
        {
            Height = 32,
            Padding = new Thickness(10, 4),
            Margin = new Thickness(0, 0, 8, 6),
            CornerRadius = new CornerRadius(16),
            Background = Brushes.Transparent,
            BorderBrush = new SolidColorBrush(Color.FromArgb(70, 255, 255, 255)),
            BorderThickness = new Thickness(1),
            Cursor = new Cursor(StandardCursorType.Hand)
        };

        var stack = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 6,
            VerticalAlignment = VerticalAlignment.Center
        };

        stack.Children.Add(new AuroraVectorIcon
        {
            Kind = icon,
            Size = 14,
            VerticalAlignment = VerticalAlignment.Center
        });

        stack.Children.Add(new TextBlock
        {
            Text = label,
            FontSize = 11.5,
            FontWeight = FontWeight.Medium,
            Foreground = new SolidColorBrush(Color.Parse("#E2E8F0")),
            VerticalAlignment = VerticalAlignment.Center
        });

        chip.Child = stack;

        chip.PointerPressed += (s, e) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            StormDsUiState.Instance.SetFilter(filter);
            UpdateChipStyles();
        };

        _chipsPanel.Children.Add(chip);
        _chips.Add((filter, chip));
    }

    private void UpdateChipStyles()
    {
        var active = StormDsUiState.Instance.ActiveFilter;
        var theme = AuroraThemeManager.Instance.CurrentTheme;
        var (primary, _) = AuroraThemeManager.ResolveAccentColors(theme, AuroraThemeManager.Instance.CurrentAccentOverride);

        foreach (var item in _chips)
        {
            bool isSelected = item.Filter == active;
            if (isSelected)
            {
                item.Chip.Background = new SolidColorBrush(Color.FromArgb(80, primary.R, primary.G, primary.B));
                item.Chip.BorderBrush = new SolidColorBrush(primary);
            }
            else
            {
                item.Chip.Background = Brushes.Transparent;
                item.Chip.BorderBrush = new SolidColorBrush(Color.FromArgb(50, 255, 255, 255));
            }
        }
    }

    private void UpdateViewModeVisual()
    {
        bool isTable = StormDsUiState.Instance.ActiveViewMode == BentoViewMode.CollectorTable;
        _cardsScrollViewer.IsVisible = !isTable;
        _collectorTable.IsVisible = isTable;
        if (isTable) _collectorTable.RefreshRows();
    }

    private void RefreshGrid()
    {
        UpdateViewModeVisual();

        if (StormDsUiState.Instance.ActiveViewMode == BentoViewMode.BentoCards)
        {
            _romsWrapPanel.Children.Clear();
            var roms = StormDsUiState.Instance.GetFilteredRoms();

            foreach (var rom in roms)
            {
                var card = new BentoRomCard(rom);
                _romsWrapPanel.Children.Add(card);
            }
        }
        else
        {
            _collectorTable.RefreshRows();
        }
    }
}
