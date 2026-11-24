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
using Avalonia.Platform.Storage;
using Storm.AuroraFluid.Kit.Controls;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Platform;
using Storm.AuroraFluid.Kit.Services;
using Storm.AuroraFluid.Kit.Themes;
using StormDs.Core.Library;
using StormDs.Core.Localization;
using StormDs.Core.Paths;
using StormDs.UI.Common;
using StormDs.UI.Views.Bento;
using StormDs.UI.Views.Emulation;
using StormDs.UI.Views.Inspector;
using StormDs.UI.Views.Modals;
using StormDs.UI.Views.Navigation;
using StormDs.UI.Views.Settings;
using StormDs.UI.Views.StatusBar;
using StormDs.UI.Views.TitleBar;

namespace StormDs.UI.Views;

/// <summary>
/// Root view for Variant 1 (01 - Aurora Bento Command).
/// Implements responsive layout (Landscape NavRail ↔ Portrait Bottom Dock),
/// Custom TitleBar, Top Command & Menu Strip, Hero Bento Workspace,
/// Fixed Right Glass Inspector (330px), Dual-Screen Emulation, and Everywhere Drag-and-Drop.
/// </summary>
public class StormDsMainView : Grid
{
    private readonly Window? _hostWindow;
    private readonly CustomTitleBar _titleBar;
    private readonly Grid _bodyHeaderGrid;
    private readonly NavRailView _navRail;
    private readonly NavDockView _navDock;
    private readonly BentoWorkspaceView _bentoWorkspace;
    private readonly RomInspectorPane _inspectorPane;
    private readonly DualScreenSessionView _emulationView;
    private readonly SettingsView _settingsView;
    private readonly DsiNandManagerView _nandManagerView;
    private readonly StormStatusBar _statusBar;
    private readonly DropImportOverlay _dropOverlay;
    private readonly AuroraModalHost _modalHost;
    private readonly Grid _centerContentGrid;

    public StormDsMainView(Window? hostWindow = null)
    {
        _hostWindow = hostWindow;
        ClipToBounds = true;
        Focusable = true;

        // Overall Window Grid: TitleBar (Row 0), Body Header (Row 1), Main Workspace (Row 2), StatusBar (Row 3)
        RowDefinitions = new RowDefinitions("Auto,Auto,*,Auto");

        // 1. Desktop Custom TitleBar (Row 0)
        _titleBar = new CustomTitleBar(_hostWindow);
        Children.Add(_titleBar);
        Grid.SetRow(_titleBar, 0);

        // 2. Top Command & Menu Strip + Body Header (Row 1)
        _bodyHeaderGrid = BuildTopCommandAndHeader();
        Children.Add(_bodyHeaderGrid);
        Grid.SetRow(_bodyHeaderGrid, 1);

        // 3. Main Center Workspace (Row 2): Left NavRail (Col 0), Content (Col 1), Right Inspector (Col 2)
        var workspaceGrid = new Grid
        {
            ColumnDefinitions = new ColumnDefinitions("Auto,*,Auto")
        };

        // Left Navigation Rail
        _navRail = new NavRailView();
        workspaceGrid.Children.Add(_navRail);
        Grid.SetColumn(_navRail, 0);

        // Content Area Container
        _centerContentGrid = new Grid();

        _bentoWorkspace = new BentoWorkspaceView();
        _settingsView = new SettingsView { IsVisible = false };
        _nandManagerView = new DsiNandManagerView { IsVisible = false, HorizontalAlignment = HorizontalAlignment.Center, VerticalAlignment = VerticalAlignment.Center };
        _emulationView = new DualScreenSessionView { IsVisible = false };

        _centerContentGrid.Children.Add(_bentoWorkspace);
        _centerContentGrid.Children.Add(_settingsView);
        _centerContentGrid.Children.Add(_nandManagerView);
        _centerContentGrid.Children.Add(_emulationView);

        workspaceGrid.Children.Add(_centerContentGrid);
        Grid.SetColumn(_centerContentGrid, 1);

        // Right Fixed Glass Inspector (330px)
        _inspectorPane = new RomInspectorPane(onOpenModalTab: (rom, tabIdx) =>
        {
            ShowRomModal(rom, tabIdx);
        });
        workspaceGrid.Children.Add(_inspectorPane);
        Grid.SetColumn(_inspectorPane, 2);

        Children.Add(workspaceGrid);
        Grid.SetRow(workspaceGrid, 2);

        // 4. Bottom Spatial Glass Dock (Floating, visible only on compact screens)
        _navDock = new NavDockView { IsVisible = false };
        Children.Add(_navDock);
        Grid.SetRow(_navDock, 2);

        // 5. Localized Bottom Status Bar (Row 3)
        _statusBar = new StormStatusBar();
        Children.Add(_statusBar);
        Grid.SetRow(_statusBar, 3);

        // 6. Everywhere Drag-and-Drop Overlay
        _dropOverlay = new DropImportOverlay { IsVisible = false };
        Children.Add(_dropOverlay);
        Grid.SetRowSpan(_dropOverlay, 4);

        // 7. Modal Host for ESC dismissal (Law 16)
        _modalHost = new AuroraModalHost { IsOpen = false };
        Children.Add(_modalHost);
        Grid.SetRowSpan(_modalHost, 4);

        // Wire Everywhere Drag-and-Drop
        DragDrop.SetAllowDrop(this, true);
        AddHandler(DragDrop.DragEnterEvent, OnDragEnter);
        AddHandler(DragDrop.DragLeaveEvent, OnDragLeave);
        AddHandler(DragDrop.DropEvent, OnDrop);

        // Wire Hotkeys & Navigation
        KeyDown += OnRootKeyDown;
        StormDsUiState.Instance.NavSectionChanged += OnNavSectionChanged;
        StormDsUiState.Instance.EmulationStarted += () => SwitchToEmulation(true);
        StormDsUiState.Instance.EmulationStopped += () => SwitchToEmulation(false);
        StormDsUiState.Instance.FullscreenChanged += OnFullscreenChanged;

        // Auto-scan default ROM directory in background
        _ = StormDsUiState.Instance.LibraryService.ScanDirectoriesAsync();
    }

    private Grid BuildTopCommandAndHeader()
    {
        var root = new Grid
        {
            RowDefinitions = new RowDefinitions("Auto,Auto"),
            Background = new SolidColorBrush(Color.FromArgb(120, 15, 18, 28)),
            Margin = new Thickness(0, 0, 0, 4)
        };

        // Top Menu Bar: Файл, Эмуляция, Инструменты, Конфигурация, DSiWare NAND, Справка
        var menuStrip = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 4,
            Margin = new Thickness(14, 2, 14, 2)
        };

        menuStrip.Children.Add(CreateMenuButton("Файл", () => ShowFileMenu()));
        menuStrip.Children.Add(CreateMenuButton("Эмуляция", () => ShowEmulationMenu()));
        menuStrip.Children.Add(CreateMenuButton("Инструменты", () => ShowToolsMenu()));
        menuStrip.Children.Add(CreateMenuButton("Конфигурация", () => StormDsUiState.Instance.SetNavSection(NavSectionKind.Settings)));
        menuStrip.Children.Add(CreateMenuButton("DSiWare NAND", () => StormDsUiState.Instance.SetNavSection(NavSectionKind.DsiNand)));
        menuStrip.Children.Add(CreateMenuButton("Справка", () => ShowHelpMenu()));

        root.Children.Add(menuStrip);
        Grid.SetRow(menuStrip, 0);

        // Body Header: Accented "STORM DS" + Subtitle + Ctrl+K Search Box
        var headerBar = new Grid
        {
            Margin = new Thickness(16, 6, 16, 6),
            ColumnDefinitions = new ColumnDefinitions("Auto,*,Auto")
        };

        var brandStack = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 8,
            VerticalAlignment = VerticalAlignment.Center
        };

        var stormText = new TextBlock
        {
            Text = "STORM",
            FontSize = 18,
            FontWeight = FontWeight.Black,
            Foreground = new SolidColorBrush(Color.Parse("#38BDF8")),
            VerticalAlignment = VerticalAlignment.Center
        };

        var dsText = new TextBlock
        {
            Text = "DS",
            FontSize = 18,
            FontWeight = FontWeight.Black,
            Foreground = new SolidColorBrush(Color.Parse("#F8FAFC")),
            VerticalAlignment = VerticalAlignment.Center
        };

        var subText = new TextBlock
        {
            Text = "- Эмулятор Nintendo DS и DSi нового поколения",
            FontSize = 12,
            FontWeight = FontWeight.Normal,
            Foreground = new SolidColorBrush(Color.Parse("#94A3B8")),
            VerticalAlignment = VerticalAlignment.Center,
            Margin = new Thickness(4, 0, 0, 0)
        };

        brandStack.Children.Add(stormText);
        brandStack.Children.Add(dsText);
        brandStack.Children.Add(subText);
        headerBar.Children.Add(brandStack);
        Grid.SetColumn(brandStack, 0);

        // Global Ctrl+K Search & Command Box
        var searchBox = new AuroraSearchBox
        {
            PlaceholderText = "Быстрый поиск или команда (Ctrl+K)...",
            HotkeyHint = "Ctrl+K",
            MinWidth = 200,
            MaxWidth = 320,
            HorizontalAlignment = HorizontalAlignment.Right,
            VerticalAlignment = VerticalAlignment.Center
        };
        searchBox.PointerPressed += (s, e) => ShowCommandPalette();
        headerBar.Children.Add(searchBox);
        Grid.SetColumn(searchBox, 2);

        headerBar.PropertyChanged += (_, ch) =>
        {
            if (ch.Property == BoundsProperty)
            {
                double hw = headerBar.Bounds.Width;
                if (hw > 0)
                {
                    subText.IsVisible = hw >= 880;
                    searchBox.Width = hw >= 980 ? 320 : Math.Max(200, hw * 0.34);
                }
            }
        };

        root.Children.Add(headerBar);
        Grid.SetRow(headerBar, 1);

        return root;
    }

    private Button CreateMenuButton(string text, Action onClick)
    {
        var btn = new Button
        {
            Padding = new Thickness(8, 4),
            Background = Brushes.Transparent,
            BorderThickness = new Thickness(0),
            CornerRadius = new CornerRadius(6),
            Cursor = new Cursor(StandardCursorType.Hand)
        };

        var tb = new TextBlock
        {
            Text = text,
            FontSize = 11.5,
            FontWeight = FontWeight.Medium,
            Foreground = new SolidColorBrush(Color.Parse("#CBD5E1"))
        };
        btn.Content = tb;

        btn.PointerEntered += (s, e) => btn.Background = new SolidColorBrush(Color.FromArgb(40, 255, 255, 255));
        btn.PointerExited += (s, e) => btn.Background = Brushes.Transparent;
        btn.Click += (s, e) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            onClick();
        };

        return btn;
    }

    private void ShowFileMenu()
    {
        _ = StormDsUiState.Instance.LibraryService.ScanDirectoriesAsync();
    }

    private void ShowEmulationMenu()
    {
        if (StormDsUiState.Instance.IsEmulationActive)
        {
            StormDsUiState.Instance.TogglePause();
        }
        else
        {
            StormDsUiState.Instance.StartEmulation();
        }
    }

    private void ShowToolsMenu()
    {
        StormDsUiState.Instance.SetNavSection(NavSectionKind.DsiNand);
    }

    private void ShowHelpMenu()
    {
        StormDsUiState.Instance.SetNavSection(NavSectionKind.Settings);
    }

    private void ShowCommandPalette()
    {
        var palette = new CommandPaletteModal();
        palette.CloseRequested += () => _modalHost.Dismiss();
        _modalHost.Content = palette;
        _modalHost.IsOpen = true;
    }

    private void ShowRomModal(RomMetadataRecord rom, int tabIdx)
    {
        var modal = new RomDetailsModal(rom, tabIdx);
        modal.CloseRequested += () => _modalHost.Dismiss();
        _modalHost.Content = modal;
        _modalHost.IsOpen = true;
    }

    private void OnNavSectionChanged(NavSectionKind section)
    {
        if (StormDsUiState.Instance.IsEmulationActive) return;

        _bentoWorkspace.IsVisible = section is NavSectionKind.Library or NavSectionKind.Favorites or NavSectionKind.Recent;
        _settingsView.IsVisible = section == NavSectionKind.Settings;
        _nandManagerView.IsVisible = section == NavSectionKind.DsiNand;

        if (section == NavSectionKind.Favorites)
        {
            StormDsUiState.Instance.SetFilter(RomFilter.Favorites);
        }
        else if (section == NavSectionKind.Library)
        {
            StormDsUiState.Instance.SetFilter(RomFilter.All);
        }
    }

    private void SwitchToEmulation(bool active)
    {
        _emulationView.IsVisible = active;
        _bodyHeaderGrid.IsVisible = !active;
        _bentoWorkspace.IsVisible = !active && StormDsUiState.Instance.ActiveNavSection is NavSectionKind.Library or NavSectionKind.Favorites or NavSectionKind.Recent;
        _settingsView.IsVisible = !active && StormDsUiState.Instance.ActiveNavSection == NavSectionKind.Settings;
        _nandManagerView.IsVisible = !active && StormDsUiState.Instance.ActiveNavSection == NavSectionKind.DsiNand;
        UpdateResponsiveChrome();

        if (active)
        {
            _emulationView.Focus();
        }
    }

    private void OnFullscreenChanged(bool isFullscreen)
    {
        _titleBar.IsVisible = !isFullscreen;
        _statusBar.IsVisible = !isFullscreen;
        if (!isFullscreen)
        {
            _bodyHeaderGrid.IsVisible = !StormDsUiState.Instance.IsEmulationActive;
            UpdateResponsiveChrome();
        }
    }

    private void UpdateResponsiveChrome()
    {
        double w = Bounds.Width;
        if (w <= 0) return;

        bool emulating = StormDsUiState.Instance.IsEmulationActive;
        bool isDesktop = w >= 840;

        _navRail.IsVisible = !emulating && isDesktop;
        _navDock.IsVisible = !emulating && !isDesktop;
        _inspectorPane.IsVisible = !emulating && w >= 1120;
    }

    protected override void OnPropertyChanged(AvaloniaPropertyChangedEventArgs change)
    {
        base.OnPropertyChanged(change);

        if (change.Property == BoundsProperty)
        {
            UpdateResponsiveChrome();
        }
    }

    private void OnRootKeyDown(object? sender, KeyEventArgs e)
    {
        // Ctrl+K -> Command Palette
        if (e.Key == Key.K && (e.KeyModifiers & KeyModifiers.Control) != 0)
        {
            ShowCommandPalette();
            e.Handled = true;
            return;
        }

        // ESC -> dismiss modal (Law 16)
        if (e.Key == Key.Escape && _modalHost.IsOpen)
        {
            _modalHost.Dismiss();
            e.Handled = true;
            return;
        }
    }

    private void OnDragEnter(object? sender, DragEventArgs e)
    {
        _dropOverlay.IsVisible = true;
    }

    private void OnDragLeave(object? sender, DragEventArgs e)
    {
        _dropOverlay.IsVisible = false;
    }

    private void OnDrop(object? sender, DragEventArgs e)
    {
        _dropOverlay.IsVisible = false;
        var files = e.DataTransfer?.TryGetFiles();
        if (files == null) return;

        foreach (var item in files)
        {
            string? localPath = item.TryGetLocalPath();
            if (string.IsNullOrWhiteSpace(localPath)) continue;

            if (Directory.Exists(localPath))
            {
                // Dropped a ROM folder
                _ = StormDsUiState.Instance.LibraryService.ScanDirectoriesAsync(new[] { localPath });
                AuroraTactileFeedbackService.Instance.PlayAchievementChime();
            }
            else if (File.Exists(localPath))
            {
                // Dropped a single ROM or archive
                var rec = NdsCartridgeParser.ParseFile(localPath, out byte[]? iconBgra);
                if (rec != null)
                {
                    StormDsUiState.Instance.SelectRom(rec);
                    StormDsUiState.Instance.StartEmulation(rec);
                    AuroraTactileFeedbackService.Instance.PlayLaunchChord();
                    break;
                }
            }
        }
    }
}
