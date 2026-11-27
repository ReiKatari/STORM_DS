// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using System.IO;
using System.Linq;
using System.Threading.Tasks;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Layout;
using Avalonia.Media;
using Avalonia.Platform.Storage;
using Avalonia.Threading;
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
using StormDs.UI.Views.Sections;
using StormDs.UI.Views.Settings;
using StormDs.UI.Views.StatusBar;
using StormDs.UI.Views.TitleBar;

namespace StormDs.UI.Views;

/// <summary>
/// Root view for Variant 1 (01 - Aurora Bento Command).
/// Implements responsive layout (Landscape NavRail <-> Portrait Bottom Dock),
/// Custom TitleBar, Top Command & Menu Strip, Hero Bento Workspace,
/// Fixed Right Glass Inspector (330px), Dual-Screen Emulation, and Everywhere Drag-and-Drop.
/// </summary>
public class StormDsMainView : Grid
{
    private readonly Window? _hostWindow;
    private readonly CustomTitleBar? _titleBar;
    private readonly Grid _bodyHeaderGrid;
    private readonly NavRailView _navRail;
    private readonly NavDockView _navDock;
    private readonly BentoWorkspaceView _bentoWorkspace;
    private readonly AchievementsView _achievementsView;
    private readonly NetplayView _netplayView;
    private readonly AiTranslatorView _aiTranslatorView;
    private readonly RomInspectorPane _inspectorPane;
    private readonly DualScreenSessionView _emulationView;
    private readonly SettingsView _settingsView;
    private readonly DsiNandManagerView _nandManagerView;
    private readonly StormStatusBar _statusBar;
    private readonly DropImportOverlay _dropOverlay;
    private readonly AuroraModalHost _modalHost;
    private readonly Grid _centerContentGrid;

    public void SelectSettingsTab(int index) => _settingsView.SelectTab(index);

    private Button? _fileMenuBtn;
    private Button? _emuMenuBtn;
    private Button? _toolsMenuBtn;
    private Button? _configMenuBtn;
    private Button? _nandMenuBtn;
    private Button? _helpMenuBtn;
    private AuroraSearchBox? _globalSearchBox;
    private TextBlock? _dsTitleText;
    private TextBlock? _subTitleText;
    private TextBlock? _stormTitleText;

    public StormDsMainView(Window? hostWindow = null, bool includeTitleBar = true)
    {
        _hostWindow = hostWindow;
        ClipToBounds = true;
        Focusable = true;

        int rowOffset = includeTitleBar ? 1 : 0;
        int totalRows = includeTitleBar ? 4 : 3;
        RowDefinitions = includeTitleBar
            ? new RowDefinitions("Auto,Auto,*,Auto")
            : new RowDefinitions("Auto,*,Auto");

        // 1. Optional embedded Custom TitleBar (disabled on desktop where StormDsMainWindow hosts it unscaled)
        if (includeTitleBar)
        {
            _titleBar = new CustomTitleBar(_hostWindow);
            Children.Add(_titleBar);
            Grid.SetRow(_titleBar, 0);
        }

        // 2. Top Command & Menu Strip + Body Header
        _bodyHeaderGrid = BuildTopCommandAndHeader();
        Children.Add(_bodyHeaderGrid);
        Grid.SetRow(_bodyHeaderGrid, rowOffset);

        // 3. Main Center Workspace: Left NavRail (Col 0), Content (Col 1), Right Inspector (Col 2)
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
        _achievementsView = new AchievementsView { IsVisible = false };
        _netplayView = new NetplayView { IsVisible = false };
        _aiTranslatorView = new AiTranslatorView { IsVisible = false };
        _emulationView = new DualScreenSessionView { IsVisible = false };

        _nandManagerView.CloseRequested += () => StormDsUiState.Instance.SetNavSection(NavSectionKind.Library);

        _centerContentGrid.Children.Add(_bentoWorkspace);
        _centerContentGrid.Children.Add(_settingsView);
        _centerContentGrid.Children.Add(_nandManagerView);
        _centerContentGrid.Children.Add(_achievementsView);
        _centerContentGrid.Children.Add(_netplayView);
        _centerContentGrid.Children.Add(_aiTranslatorView);
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
        Grid.SetRow(workspaceGrid, rowOffset + 1);

        // 4. Bottom Spatial Glass Dock (Floating, visible only on compact screens)
        _navDock = new NavDockView { IsVisible = false };
        Children.Add(_navDock);
        Grid.SetRow(_navDock, rowOffset + 1);

        // 5. Localized Bottom Status Bar
        _statusBar = new StormStatusBar();
        Children.Add(_statusBar);
        Grid.SetRow(_statusBar, rowOffset + 2);

        // 6. Everywhere Drag-and-Drop Overlay
        _dropOverlay = new DropImportOverlay { IsVisible = false };
        Children.Add(_dropOverlay);
        Grid.SetRowSpan(_dropOverlay, totalRows);

        // 7. Modal Host for ESC dismissal (Law 16)
        _modalHost = new AuroraModalHost { IsOpen = false };
        Children.Add(_modalHost);
        Grid.SetRowSpan(_modalHost, totalRows);

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
        StormDsUiState.Instance.UpdateCheckRequested += manual => _ = CheckAndShowUpdateModalAsync(manual);
        StormDsUiState.Instance.RomModalRequested += ShowRomModal;
        StormDsLoc.LanguageChanged += _ => ApplyHeaderTextsAndTheme();
        StormThemeBrushes.BindTheme(this, ApplyHeaderTextsAndTheme);

        // Auto-scan default + user ROM directories in background
        _ = StormDsUiState.Instance.LibraryService.ScanDirectoriesAsync(StormDsUiState.Instance.AppConfig.RomDirectories);

        // Non-blocking startup update check
        if (StormDsUiState.Instance.AppConfig.AutoCheckUpdates)
        {
            DispatcherTimer.RunOnce(() => _ = CheckAndShowUpdateModalAsync(manual: false), TimeSpan.FromMilliseconds(1200));
        }
    }

    private Grid BuildTopCommandAndHeader()
    {
        var root = new Grid
        {
            RowDefinitions = new RowDefinitions("Auto,Auto"),
            Background = new SolidColorBrush(Color.FromArgb(120, 15, 18, 28)),
            Margin = new Thickness(0, 0, 0, 4)
        };

        // Top Menu Bar
        var menuStrip = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 4,
            Margin = new Thickness(14, 2, 14, 2)
        };

        _fileMenuBtn = CreateMenuButton(StormDsLoc.T("MenuFile"), btn => ShowFileMenu(btn));
        _emuMenuBtn = CreateMenuButton(StormDsLoc.T("MenuEmulation"), btn => ShowEmulationMenu(btn));
        _toolsMenuBtn = CreateMenuButton(StormDsLoc.T("MenuTools"), btn => ShowToolsMenu(btn));
        _configMenuBtn = CreateMenuButton(StormDsLoc.T("MenuSettings"), _ => StormDsUiState.Instance.SetNavSection(NavSectionKind.Settings));
        _nandMenuBtn = CreateMenuButton("DSiWare NAND", _ => StormDsUiState.Instance.SetNavSection(NavSectionKind.DsiNand));
        _helpMenuBtn = CreateMenuButton(StormDsLoc.T("MenuHelp"), btn => ShowHelpMenu(btn));

        menuStrip.Children.Add(_fileMenuBtn);
        menuStrip.Children.Add(_emuMenuBtn);
        menuStrip.Children.Add(_toolsMenuBtn);
        menuStrip.Children.Add(_configMenuBtn);
        menuStrip.Children.Add(_nandMenuBtn);
        menuStrip.Children.Add(_helpMenuBtn);

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

        _stormTitleText = new TextBlock
        {
            Text = "STORM",
            FontSize = 18,
            FontWeight = FontWeight.Black,
            Foreground = StormThemeBrushes.Accent,
            VerticalAlignment = VerticalAlignment.Center
        };

        _dsTitleText = new TextBlock
        {
            Text = "DS",
            FontSize = 18,
            FontWeight = FontWeight.Black,
            Foreground = StormThemeBrushes.PrimaryText,
            VerticalAlignment = VerticalAlignment.Center
        };

        _subTitleText = new TextBlock
        {
            Text = "- " + StormDsLoc.T("AppSubtitle"),
            FontSize = 12,
            FontWeight = FontWeight.Normal,
            Foreground = StormThemeBrushes.SecondaryText,
            VerticalAlignment = VerticalAlignment.Center,
            Margin = new Thickness(4, 0, 0, 0)
        };

        brandStack.Children.Add(_stormTitleText);
        brandStack.Children.Add(_dsTitleText);
        brandStack.Children.Add(_subTitleText);
        headerBar.Children.Add(brandStack);
        Grid.SetColumn(brandStack, 0);

        // Global Search & Command Box (live library search + Ctrl+K Command Palette)
        _globalSearchBox = new AuroraSearchBox
        {
            PlaceholderText = "Поиск игр или команды (Ctrl+K)...",
            HotkeyHint = "Ctrl+K",
            MinWidth = 200,
            MaxWidth = 320,
            HorizontalAlignment = HorizontalAlignment.Right,
            VerticalAlignment = VerticalAlignment.Center
        };
        _globalSearchBox.TextChanged += (_, _) =>
        {
            StormDsUiState.Instance.SetSearchQuery(_globalSearchBox.Text ?? string.Empty);
        };
        headerBar.Children.Add(_globalSearchBox);
        Grid.SetColumn(_globalSearchBox, 2);

        headerBar.PropertyChanged += (_, ch) =>
        {
            if (ch.Property == BoundsProperty)
            {
                double hw = headerBar.Bounds.Width;
                if (hw > 0)
                {
                    _subTitleText.IsVisible = hw >= 880;
                    _globalSearchBox.Width = hw >= 980 ? 320 : Math.Max(200, hw * 0.34);
                }
            }
        };

        root.Children.Add(headerBar);
        Grid.SetRow(headerBar, 1);

        return root;
    }

    private void ApplyHeaderTextsAndTheme()
    {
        _bodyHeaderGrid.Background = StormThemeBrushes.ChromeSurface;
        if (_stormTitleText != null) _stormTitleText.Foreground = StormThemeBrushes.Accent;
        if (_dsTitleText != null) _dsTitleText.Foreground = StormThemeBrushes.PrimaryText;
        if (_subTitleText != null)
        {
            _subTitleText.Foreground = StormThemeBrushes.SecondaryText;
            _subTitleText.Text = "- " + StormDsLoc.T("AppSubtitle");
        }
        SetMenuButtonText(_fileMenuBtn, StormDsLoc.T("MenuFile"));
        SetMenuButtonText(_emuMenuBtn, StormDsLoc.T("MenuEmulation"));
        SetMenuButtonText(_toolsMenuBtn, StormDsLoc.T("MenuTools"));
        SetMenuButtonText(_configMenuBtn, StormDsLoc.T("MenuSettings"));
        SetMenuButtonText(_nandMenuBtn, StormDsLoc.T("MenuDsiNand"));
        SetMenuButtonText(_helpMenuBtn, StormDsLoc.T("MenuHelp"));
    }

    private static void SetMenuButtonText(Button? btn, string label)
    {
        if (btn?.Content is TextBlock tb)
        {
            tb.Text = label;
            tb.Foreground = StormThemeBrushes.BodyText;
        }
    }

    private Button CreateMenuButton(string text, Action<Button> onClick)
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
            Foreground = StormThemeBrushes.BodyText
        };
        btn.Content = tb;

        btn.PointerEntered += (s, e) => btn.Background = StormThemeBrushes.HoverSurface;
        btn.PointerExited += (s, e) => btn.Background = Brushes.Transparent;
        btn.Click += (s, e) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            onClick(btn);
        };

        return btn;
    }

    private static MenuItem CreateMenuItem(string header, Action action, bool enabled = true)
    {
        var item = new MenuItem { Header = header, IsEnabled = enabled };
        item.Click += (_, _) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            action();
        };
        return item;
    }

    private void ShowFileMenu(Button anchor)
    {
        var flyout = new MenuFlyout();
        flyout.Items.Add(CreateMenuItem(StormDsLoc.T("MenuOpenRom"), () => _ = PickAndOpenRomAsync()));
        flyout.Items.Add(CreateMenuItem(StormDsLoc.T("MenuScanFolder"), () => _ = PickAndScanFolderAsync()));
        flyout.Items.Add(CreateMenuItem(StormDsLoc.T("MenuRescanLibrary"), () => _ = StormDsUiState.Instance.LibraryService.ScanDirectoriesAsync()));
        flyout.Items.Add(new Separator());
        flyout.Items.Add(CreateMenuItem(StormDsLoc.T("MenuExit"), () => AuroraTrayManager.Instance.RequestExit()));
        flyout.ShowAt(anchor, true);
    }

    private void ShowEmulationMenu(Button anchor)
    {
        bool active = StormDsUiState.Instance.IsEmulationActive;
        bool paused = StormDsUiState.Instance.IsPaused;
        var flyout = new MenuFlyout();
        flyout.Items.Add(CreateMenuItem(
            active ? (paused ? StormDsLoc.T("MenuResume") : StormDsLoc.T("MenuPause")) : StormDsLoc.T("LaunchGame"),
            () =>
            {
                if (active) StormDsUiState.Instance.TogglePause();
                else StormDsUiState.Instance.StartEmulation();
            }));
        flyout.Items.Add(CreateMenuItem(StormDsLoc.T("LaunchBios"), () => StormDsUiState.Instance.StartEmulation(bootBios: true)));
        flyout.Items.Add(new Separator());
        flyout.Items.Add(CreateMenuItem(StormDsLoc.T("MenuReset"), () => StormDsUiState.Instance.EngineService.Reset(), active));
        flyout.Items.Add(CreateMenuItem(StormDsLoc.T("MenuQuickSave"), () => StormDsUiState.Instance.EngineService.SaveState(0), active));
        flyout.Items.Add(CreateMenuItem(StormDsLoc.T("MenuQuickLoad"), () =>
        {
            if (StormDsUiState.Instance.RetroAchievementsService.IsFeatureAllowedInCurrentMode("loadstate"))
                StormDsUiState.Instance.EngineService.LoadState(0);
        }, active));
        flyout.ShowAt(anchor, true);
    }

    private void ShowToolsMenu(Button anchor)
    {
        var flyout = new MenuFlyout();
        flyout.Items.Add(CreateMenuItem(StormDsLoc.T("MenuDsiNand"), () => StormDsUiState.Instance.SetNavSection(NavSectionKind.DsiNand)));
        flyout.Items.Add(CreateMenuItem(StormDsLoc.T("MenuAchievements"), () => StormDsUiState.Instance.SetNavSection(NavSectionKind.Achievements)));
        flyout.Items.Add(CreateMenuItem(StormDsLoc.T("MenuNetplay"), () => StormDsUiState.Instance.SetNavSection(NavSectionKind.Netplay)));
        flyout.Items.Add(CreateMenuItem(StormDsLoc.T("MenuAiTranslator"), () => StormDsUiState.Instance.SetNavSection(NavSectionKind.AiTranslator)));
        flyout.Items.Add(new Separator());
        flyout.Items.Add(CreateMenuItem(StormDsLoc.T("MenuCommandPalette"), ShowCommandPalette));
        flyout.ShowAt(anchor, true);
    }

    private void ShowHelpMenu(Button anchor)
    {
        var flyout = new MenuFlyout();
        flyout.Items.Add(CreateMenuItem(StormDsLoc.T("MenuCheckUpdates"), () => StormDsUiState.Instance.RequestUpdateCheck(true)));
        flyout.Items.Add(CreateMenuItem(StormDsLoc.T("MenuAbout"), ShowAboutModal));
        flyout.ShowAt(anchor, true);
    }

    private void ShowAboutModal()
    {
        var card = new AuroraGlassCard
        {
            Width = 500,
            Padding = new Thickness(22),
            SpotlightEnabled = true
        };
        var sp = new StackPanel { Spacing = 10 };
        sp.Children.Add(new TextBlock
        {
            Text = $"STORM DS {StormDsLoc.AppVersion}",
            FontSize = 18,
            FontWeight = FontWeight.Black,
            Foreground = StormThemeBrushes.Accent
        });
        sp.Children.Add(new TextBlock
        {
            Text = StormDsLoc.T("AppSubtitle"),
            FontSize = 12.5,
            Foreground = StormThemeBrushes.PrimaryText,
            TextWrapping = TextWrapping.Wrap
        });
        sp.Children.Add(new TextBlock
        {
            Text = $"{StormDsLoc.T("GpuDeviceLabel")}: {StormDsUiState.Instance.ProbedGpuName} ({StormDsUiState.Instance.VulkanTierBadge})",
            FontSize = 11.5,
            Foreground = StormThemeBrushes.SecondaryText,
            TextWrapping = TextWrapping.Wrap
        });
        sp.Children.Add(new TextBlock
        {
            Text = StormDsLoc.T("AboutCreditsTitle"),
            FontSize = 13,
            FontWeight = FontWeight.Bold,
            Foreground = StormThemeBrushes.Accent,
            Margin = new Thickness(0, 4, 0, 0)
        });
        var creditsScroll = new ScrollViewer
        {
            MaxHeight = 200,
            Content = new TextBlock
            {
                Text = StormDsLoc.T("AboutCreditsBody"),
                FontSize = 11,
                LineHeight = 16,
                Foreground = StormThemeBrushes.SecondaryText,
                TextWrapping = TextWrapping.Wrap
            }
        };
        sp.Children.Add(creditsScroll);
        var closeBtn = new AuroraVolumetricButton { Height = 32, Width = 140, HorizontalAlignment = HorizontalAlignment.Right };
        closeBtn.Content = new TextBlock { Text = StormDsLoc.T("ActionClose"), FontWeight = FontWeight.SemiBold, HorizontalAlignment = HorizontalAlignment.Center, VerticalAlignment = VerticalAlignment.Center };
        closeBtn.Click += (_, _) => _modalHost.Dismiss();
        sp.Children.Add(closeBtn);
        card.Content = sp;
        _modalHost.Content = card;
        _modalHost.IsOpen = true;
    }

    private async Task PickAndOpenRomAsync()
    {
        var top = TopLevel.GetTopLevel(this);
        if (top?.StorageProvider == null) return;
        var files = await top.StorageProvider.OpenFilePickerAsync(new FilePickerOpenOptions
        {
            Title = StormDsLoc.T("MenuOpenRom"),
            AllowMultiple = false,
            FileTypeFilter = new[]
            {
                new FilePickerFileType("Nintendo DS ROMs") { Patterns = new[] { "*.nds", "*.dsi", "*.srl", "*.ids", "*.zip" } },
                FilePickerFileTypes.All
            }
        });
        string? localPath = files.Count > 0 ? files[0].TryGetLocalPath() : null;
        if (!string.IsNullOrWhiteSpace(localPath) && File.Exists(localPath))
        {
            StormDsUiState.Instance.StartRomEmulationFromPath(localPath);
            AuroraTactileFeedbackService.Instance.PlayLaunchChord();
        }
    }

    private async Task PickAndScanFolderAsync()
    {
        var top = TopLevel.GetTopLevel(this);
        if (top?.StorageProvider == null) return;
        var folders = await top.StorageProvider.OpenFolderPickerAsync(new FolderPickerOpenOptions
        {
            Title = StormDsLoc.T("MenuScanFolder"),
            AllowMultiple = false
        });
        string? folderPath = folders.Count > 0 ? folders[0].TryGetLocalPath() : null;
        if (!string.IsNullOrWhiteSpace(folderPath) && Directory.Exists(folderPath))
        {
            if (!StormDsUiState.Instance.AppConfig.RomDirectories.Contains(folderPath))
            {
                StormDsUiState.Instance.AppConfig.RomDirectories.Add(folderPath);
                StormDsUiState.Instance.SaveConfig();
            }
            await StormDsUiState.Instance.LibraryService.ScanDirectoriesAsync(new[] { folderPath });
            StormDsUiState.Instance.NotifyStatus(folderPath);
        }
    }

    private async Task CheckAndShowUpdateModalAsync(bool manual)
    {
        StormUpdateModal? modal = null;
        if (manual)
        {
            modal = new StormUpdateModal(
                StormUpdateModal.UpdateModalMode.Checking,
                onRetry: () => _ = CheckAndShowUpdateModalAsync(true));
            modal.CloseRequested += () => _modalHost.Dismiss();
            _modalHost.Content = modal;
            _modalHost.IsOpen = true;
        }

        try
        {
            var curVer = AuroraDualMirrorUpdater.TryParseSemanticVersion(StormDsLoc.AppVersion, out var parsed)
                ? parsed
                : new Version(8, 9, 0);

            var updater = new AuroraDualMirrorUpdater();
            var res = await updater.CheckForUpdateAsync("ReiKatari", "STORM_DS", curVer);

            await Dispatcher.UIThread.InvokeAsync(() =>
            {
                if (res.IsUpdateAvailable)
                {
                    string cleanNew = res.LatestVersion.ToString().TrimStart('v', 'V');
                    if (!manual && string.Equals(StormDsUiState.Instance.AppConfig.SkippedUpdateVersion, cleanNew, StringComparison.OrdinalIgnoreCase))
                    {
                        return;
                    }

                    AuroraTactileFeedbackService.Instance.PlayAchievementChime();
                    if (modal == null)
                    {
                        modal = new StormUpdateModal(
                            StormUpdateModal.UpdateModalMode.UpdateAvailable,
                            res,
                            onRetry: () => _ = CheckAndShowUpdateModalAsync(true));
                        modal.CloseRequested += () => _modalHost.Dismiss();
                        _modalHost.Content = modal;
                        _modalHost.IsOpen = true;
                    }
                    else
                    {
                        modal.UpdateState(StormUpdateModal.UpdateModalMode.UpdateAvailable, res);
                    }
                }
                else if (manual && modal != null)
                {
                    var mode = res.CheckSucceeded
                        ? StormUpdateModal.UpdateModalMode.UpToDate
                        : StormUpdateModal.UpdateModalMode.Error;
                    modal.UpdateState(mode, res);
                }
            });
        }
        catch (Exception ex)
        {
            if (manual && modal != null)
            {
                var curVer = AuroraDualMirrorUpdater.TryParseSemanticVersion(StormDsLoc.AppVersion, out var parsed)
                    ? parsed
                    : new Version(8, 9, 0);
                var errRes = new AuroraUpdateCheckResult(
                    IsUpdateAvailable: false,
                    CurrentVersion: curVer,
                    LatestVersion: curVer,
                    DownloadUrl: string.Empty,
                    Changelog: string.Empty,
                    ExpectedSha256: null,
                    SourceMirror: "None",
                    CheckSucceeded: false,
                    ErrorMessage: ex.Message);

                await Dispatcher.UIThread.InvokeAsync(() =>
                {
                    modal.UpdateState(StormUpdateModal.UpdateModalMode.Error, errRes);
                });
            }
        }
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
        _achievementsView.IsVisible = section == NavSectionKind.Achievements;
        _netplayView.IsVisible = section == NavSectionKind.Netplay;
        _aiTranslatorView.IsVisible = section == NavSectionKind.AiTranslator;

        if (_nandManagerView.IsVisible) _nandManagerView.RefreshNandList();
        if (_achievementsView.IsVisible) _achievementsView.RefreshData();
        if (_netplayView.IsVisible) _netplayView.RefreshData();
        if (_aiTranslatorView.IsVisible) _aiTranslatorView.RefreshConfig();

        if (section == NavSectionKind.Favorites)
        {
            StormDsUiState.Instance.SetFilter(RomFilter.Favorites);
        }
        else if (section is NavSectionKind.Library or NavSectionKind.Recent)
        {
            StormDsUiState.Instance.SetFilter(RomFilter.All);
        }

        UpdateResponsiveChrome();
    }

    private void SwitchToEmulation(bool active)
    {
        var sec = StormDsUiState.Instance.ActiveNavSection;
        _emulationView.IsVisible = active;
        _bodyHeaderGrid.IsVisible = !active;
        _bentoWorkspace.IsVisible = !active && sec is NavSectionKind.Library or NavSectionKind.Favorites or NavSectionKind.Recent;
        _settingsView.IsVisible = !active && sec == NavSectionKind.Settings;
        _nandManagerView.IsVisible = !active && sec == NavSectionKind.DsiNand;
        _achievementsView.IsVisible = !active && sec == NavSectionKind.Achievements;
        _netplayView.IsVisible = !active && sec == NavSectionKind.Netplay;
        _aiTranslatorView.IsVisible = !active && sec == NavSectionKind.AiTranslator;
        UpdateResponsiveChrome();

        if (active)
        {
            _emulationView.Focus();
        }
    }

    private void OnFullscreenChanged(bool isFullscreen)
    {
        if (_titleBar != null) _titleBar.IsVisible = !isFullscreen;
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
        bool isLibrarySection = StormDsUiState.Instance.ActiveNavSection is NavSectionKind.Library or NavSectionKind.Favorites or NavSectionKind.Recent;
        _inspectorPane.IsVisible = !emulating && isDesktop && w >= 1120 && isLibrarySection;
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

        // Ctrl+F -> Focus Settings search bar or Library global search bar
        if (e.Key == Key.F && (e.KeyModifiers & KeyModifiers.Control) != 0)
        {
            if (_settingsView.IsVisible)
            {
                _settingsView.FocusSearchBox();
            }
            else
            {
                _globalSearchBox?.Focus();
            }
            e.Handled = true;
            return;
        }

        // ESC -> dismiss modal (Law 16)
        if (e.Key == Key.Escape && _modalHost.IsOpen)
        {
            if (_modalHost.Content is StormUpdateModal updModal)
            {
                updModal.RequestSafeClose();
            }
            else
            {
                _modalHost.Dismiss();
            }
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
                // Dropped a ROM folder - persist cleanly and scan
                if (!StormDsUiState.Instance.AppConfig.RomDirectories.Contains(localPath))
                {
                    StormDsUiState.Instance.AppConfig.RomDirectories.Add(localPath);
                    StormDsUiState.Instance.SaveConfig();
                }
                _ = StormDsUiState.Instance.LibraryService.ScanDirectoriesAsync(new[] { localPath });
                AuroraTactileFeedbackService.Instance.PlayAchievementChime();
            }
            else if (File.Exists(localPath))
            {
                // Dropped a single ROM or .zip archive
                StormDsUiState.Instance.StartRomEmulationFromPath(localPath);
                AuroraTactileFeedbackService.Instance.PlayLaunchChord();
                break;
            }
        }
    }
}
