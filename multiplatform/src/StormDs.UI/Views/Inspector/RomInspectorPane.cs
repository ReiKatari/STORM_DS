// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using System.IO;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Controls.Primitives;
using Avalonia.Input;
using Avalonia.Layout;
using Avalonia.Media;
using Avalonia.Media.Imaging;
using Avalonia.Platform.Storage;
using Storm.AuroraFluid.Kit.Controls;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Services;
using Storm.AuroraFluid.Kit.Themes;
using StormDs.Core.Configuration;
using StormDs.Core.Library;
using StormDs.Core.Paths;
using StormDs.UI.Common;

namespace StormDs.UI.Views.Inspector;

/// <summary>
/// Right Fixed Glass Inspector Pane (330px).
/// Auto-selects 1st/last ROM in under 100ms per Law 21.
/// Displays genuine 128x128 Nearest-Neighbor art, 3D Hero Launch, FreeBIOS boot,
/// interactive Save Slots 1..4, and Per-ROM quick settings.
/// </summary>
public class RomInspectorPane : Border
{
    private readonly Image _coverImage;
    private readonly TextBlock _titleText;
    private readonly TextBlock _codeText;
    private readonly TextBlock _crcText;
    private readonly TextBlock _sizeText;
    private readonly AuroraVolumetricButton _playBtn;
    private readonly AuroraVolumetricButton _biosBtn;
    private readonly UniformGrid _saveSlotsGrid;
    private readonly TextBlock _headerLabel;
    private readonly TextBlock _playBtnText;
    private readonly TextBlock _biosBtnText;
    private readonly TextBlock _saveHeaderText;
    private readonly TextBlock _controlsHeaderText;
    private readonly TextBlock _rendererValText;
    private readonly TextBlock _scaleValText;
    private readonly TextBlock _compositorValText;
    private readonly TextBlock _slot2ValText;
    private readonly Border _imgBorder;
    private readonly Action<RomMetadataRecord, int>? _onOpenModalTab;

    private RomMetadataRecord? _currentRom;

    public RomInspectorPane(Action<RomMetadataRecord, int>? onOpenModalTab = null)
    {
        _onOpenModalTab = onOpenModalTab;
        Width = 330;
        HorizontalAlignment = HorizontalAlignment.Right;
        VerticalAlignment = VerticalAlignment.Stretch;
        BorderThickness = new Thickness(1, 0, 0, 0);

        var scroll = new ScrollViewer
        {
            Padding = new Thickness(14, 12, 14, 12),
            HorizontalScrollBarVisibility = Avalonia.Controls.Primitives.ScrollBarVisibility.Disabled
        };

        var stack = new StackPanel
        {
            Spacing = 10
        };

        // Header Title
        _headerLabel = new TextBlock
        {
            Text = StormDs.Core.Localization.StormDsLoc.T("CartridgeInspector"),
            FontSize = 10,
            FontWeight = FontWeight.Bold,
            HorizontalAlignment = HorizontalAlignment.Center
        };
        stack.Children.Add(_headerLabel);

        // 1. Genuine 128x128 Nearest-Neighbor Cover / Icon
        _imgBorder = new Border
        {
            Width = 128,
            Height = 128,
            CornerRadius = new CornerRadius(12),
            Background = StormThemeBrushes.CardSurface,
            BorderThickness = new Thickness(1),
            HorizontalAlignment = HorizontalAlignment.Center,
            ClipToBounds = true
        };

        _coverImage = new Image
        {
            Width = 128,
            Height = 128,
            Stretch = Stretch.Uniform
        };
        RenderOptions.SetBitmapInterpolationMode(_coverImage, BitmapInterpolationMode.None);
        _imgBorder.Child = _coverImage;
        stack.Children.Add(_imgBorder);

        // 2. Titles & Metadata
        _titleText = new TextBlock
        {
            Text = "Выберите игру",
            FontSize = 14,
            FontWeight = FontWeight.Bold,
            TextAlignment = TextAlignment.Center,
            TextWrapping = TextWrapping.Wrap,
            MaxLines = 2
        };
        stack.Children.Add(_titleText);

        var badgeRow = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            HorizontalAlignment = HorizontalAlignment.Center,
            Spacing = 6
        };

        _codeText = new TextBlock { Text = "NTR-XXXX", FontSize = 11, FontWeight = FontWeight.SemiBold };
        _sizeText = new TextBlock { Text = "0.0 MB", FontSize = 11 };
        _crcText = new TextBlock { Text = "CRC32: -", FontSize = 11 };

        badgeRow.Children.Add(_codeText);
        badgeRow.Children.Add(new TextBlock { Text = "|", Foreground = StormThemeBrushes.SecondaryText });
        badgeRow.Children.Add(_sizeText);
        badgeRow.Children.Add(new TextBlock { Text = "|", Foreground = StormThemeBrushes.SecondaryText });
        badgeRow.Children.Add(_crcText);
        stack.Children.Add(badgeRow);

        // 3. Big 3D Hero Launch Button
        _playBtn = new AuroraVolumetricButton
        {
            IsHero = true,
            Height = 42,
            HorizontalAlignment = HorizontalAlignment.Stretch
        };
        var playStack = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 8,
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Center
        };
        playStack.Children.Add(new AuroraVectorIcon { Kind = AuroraIconKind.PlayPrism, Size = 16, VerticalAlignment = VerticalAlignment.Center });
        _playBtnText = new TextBlock
        {
            Text = StormDs.Core.Localization.StormDsLoc.T("LaunchGame"),
            FontSize = 13,
            FontWeight = FontWeight.Bold,
            Foreground = Brushes.White,
            VerticalAlignment = VerticalAlignment.Center
        };
        playStack.Children.Add(_playBtnText);
        _playBtn.Content = playStack;
        _playBtn.Click += async (s, e) =>
        {
            if (_currentRom != null)
            {
                StormDsUiState.Instance.StartEmulation(_currentRom);
                return;
            }

            var top = TopLevel.GetTopLevel(this);
            if (top?.StorageProvider != null)
            {
                var files = await top.StorageProvider.OpenFilePickerAsync(new Avalonia.Platform.Storage.FilePickerOpenOptions
                {
                    Title = "Выберите ROM-файл (.nds, .dsi, .zip)",
                    AllowMultiple = false,
                    FileTypeFilter = new[]
                    {
                        new Avalonia.Platform.Storage.FilePickerFileType("Nintendo DS / DSi ROM") { Patterns = new[] { "*.nds", "*.srl", "*.dsi", "*.ids", "*.zip" } }
                    }
                });
                if (files.Count > 0)
                {
                    string? localPath = files[0].TryGetLocalPath();
                    if (!string.IsNullOrWhiteSpace(localPath))
                    {
                        StormDsUiState.Instance.StartRomEmulationFromPath(localPath);
                    }
                }
            }
        };
        stack.Children.Add(_playBtn);

        // 4. Secondary Action: Launch Console Menu (FreeBIOS)
        _biosBtn = new AuroraVolumetricButton
        {
            Height = 32,
            HorizontalAlignment = HorizontalAlignment.Stretch
        };
        var biosStack = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 6,
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Center
        };
        biosStack.Children.Add(new AuroraVectorIcon { Kind = AuroraIconKind.ResetCycle, Size = 14, VerticalAlignment = VerticalAlignment.Center });
        _biosBtnText = new TextBlock
        {
            Text = StormDs.Core.Localization.StormDsLoc.T("LaunchBios"),
            FontSize = 11.5,
            FontWeight = FontWeight.Medium,
            VerticalAlignment = VerticalAlignment.Center
        };
        biosStack.Children.Add(_biosBtnText);
        _biosBtn.Content = biosStack;
        _biosBtn.Click += (s, e) =>
        {
            StormDsUiState.Instance.StartEmulation(bootBios: true);
        };
        stack.Children.Add(_biosBtn);

        // Separator
        stack.Children.Add(CreateSeparator());

        // 5. Interactive Save State Slots (Slot 1..4)
        _saveHeaderText = new TextBlock
        {
            Text = StormDs.Core.Localization.StormDsLoc.T("SaveSlotsHeader"),
            FontSize = 10,
            FontWeight = FontWeight.Bold
        };
        stack.Children.Add(_saveHeaderText);

        _saveSlotsGrid = new UniformGrid { Columns = 2, Rows = 2 };
        stack.Children.Add(_saveSlotsGrid);

        // Separator
        stack.Children.Add(CreateSeparator());

        // 6. Instant Per-ROM Quick Controls
        _controlsHeaderText = new TextBlock
        {
            Text = StormDs.Core.Localization.StormDsLoc.T("CartridgeProfile"),
            FontSize = 10,
            FontWeight = FontWeight.Bold
        };
        stack.Children.Add(_controlsHeaderText);

        stack.Children.Add(CreateQuickSettingRow("Рендерер:", out _rendererValText));
        stack.Children.Add(CreateQuickSettingRow("Масштаб 3D:", out _scaleValText));
        stack.Children.Add(CreateQuickSettingRow("Композитор:", out _compositorValText));
        stack.Children.Add(CreateQuickSettingRow("Slot-2 слот:", out _slot2ValText));

        // 7. Modal Open Buttons: ROM Properties, Cheats, Achievements
        var tabsRow = new UniformGrid { Columns = 3, Margin = new Thickness(0, 6, 0, 0) };
        tabsRow.Children.Add(CreateTabButton(AuroraIconKind.InfoCrystal, StormDs.Core.Localization.StormDsLoc.T("PropsBtn"), 0));
        tabsRow.Children.Add(CreateTabButton(AuroraIconKind.CheatMatrix, StormDs.Core.Localization.StormDsLoc.T("CheatsBtn"), 1));
        tabsRow.Children.Add(CreateTabButton(AuroraIconKind.TrophyCrown, StormDs.Core.Localization.StormDsLoc.T("AwardsBtn"), 2));
        stack.Children.Add(tabsRow);

        scroll.Content = stack;
        Child = scroll;

        StormThemeBrushes.BindTheme(this, ApplyThemeAndLocalization);
        StormDs.Core.Localization.StormDsLoc.LanguageChanged += _ => ApplyThemeAndLocalization();
        StormDsUiState.Instance.SettingsSaved += () => UpdatePane(_currentRom);
        StormDsUiState.Instance.RomSelected += UpdatePane;
        UpdatePane(StormDsUiState.Instance.SelectedRom);
    }

    private void ApplyThemeAndLocalization()
    {
        Background = StormThemeBrushes.GlassPanel;
        BorderBrush = StormThemeBrushes.SubtleBorder;
        _headerLabel.Foreground = StormThemeBrushes.Accent;
        _headerLabel.Text = StormDs.Core.Localization.StormDsLoc.T("CartridgeInspector");
        _imgBorder.Background = StormThemeBrushes.CardSurface;
        _imgBorder.BorderBrush = StormThemeBrushes.StrongBorder;
        _titleText.Foreground = StormThemeBrushes.PrimaryText;
        _codeText.Foreground = StormThemeBrushes.Accent;
        _sizeText.Foreground = StormThemeBrushes.SecondaryText;
        _crcText.Foreground = StormThemeBrushes.AccentSecondary;
        _playBtnText.Text = StormDs.Core.Localization.StormDsLoc.T("LaunchGame");
        _biosBtnText.Foreground = StormThemeBrushes.PrimaryText;
        _biosBtnText.Text = StormDs.Core.Localization.StormDsLoc.T("LaunchBios");
        _saveHeaderText.Foreground = StormThemeBrushes.SecondaryText;
        _saveHeaderText.Text = StormDs.Core.Localization.StormDsLoc.T("SaveSlotsHeader");
        _controlsHeaderText.Foreground = StormThemeBrushes.SecondaryText;
        _controlsHeaderText.Text = StormDs.Core.Localization.StormDsLoc.T("CartridgeProfile");
        _rendererValText.Foreground = StormThemeBrushes.BodyText;
        _scaleValText.Foreground = StormThemeBrushes.BodyText;
        _compositorValText.Foreground = StormThemeBrushes.BodyText;
        _slot2ValText.Foreground = StormThemeBrushes.BodyText;
        UpdatePane(_currentRom);
    }

    private Control CreateSlotCard(int slotIdx)
    {
        var border = new Border
        {
            Margin = new Thickness(3),
            Padding = new Thickness(6, 5),
            CornerRadius = new CornerRadius(8),
            Background = StormThemeBrushes.RowSurface,
            BorderBrush = StormThemeBrushes.SubtleBorder,
            BorderThickness = new Thickness(1),
            Cursor = new Cursor(StandardCursorType.Hand)
        };

        var row = new Grid
        {
            ColumnDefinitions = new ColumnDefinitions("*,Auto")
        };

        var slotInfo = new StackPanel
        {
            Spacing = 2
        };
        slotInfo.Children.Add(new TextBlock
        {
            Text = $"Слот {slotIdx + 1}",
            FontSize = 10.5,
            FontWeight = FontWeight.Bold,
            Foreground = StormThemeBrushes.PrimaryText
        });

        string timeText = "Пусто";
        bool hasFile = false;
        if (_currentRom != null)
        {
            string path = StormDsPlatformPaths.GetSaveStateFilePath(_currentRom.GameCode, slotIdx);
            if (File.Exists(path))
            {
                hasFile = true;
                var fi = new FileInfo(path);
                timeText = $"{fi.LastWriteTime:HH:mm dd.MM}";
            }
        }

        slotInfo.Children.Add(new TextBlock
        {
            Text = timeText,
            FontSize = 9,
            Foreground = StormThemeBrushes.SecondaryText
        });
        row.Children.Add(slotInfo);
        Grid.SetColumn(slotInfo, 0);

        var saveIcon = new AuroraVectorIcon
        {
            Kind = hasFile ? AuroraIconKind.LoadSlotArrow : AuroraIconKind.SaveSlotRibbon,
            Size = 13,
            VerticalAlignment = VerticalAlignment.Center
        };
        row.Children.Add(saveIcon);
        Grid.SetColumn(saveIcon, 1);

        border.Child = row;
        border.PointerPressed += (s, e) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            if (!StormDsUiState.Instance.IsEmulationActive)
            {
                if (_currentRom == null) return;
                StormDsUiState.Instance.StartEmulation(_currentRom);
                if (hasFile && StormDsUiState.Instance.RetroAchievementsService.IsFeatureAllowedInCurrentMode("loadstate"))
                {
                    StormDsUiState.Instance.EngineService.LoadState(slotIdx);
                }
                return;
            }

            bool isRight = e.GetCurrentPoint(border).Properties.IsRightButtonPressed;
            if (hasFile && !isRight)
            {
                if (StormDsUiState.Instance.RetroAchievementsService.IsFeatureAllowedInCurrentMode("loadstate"))
                {
                    StormDsUiState.Instance.EngineService.LoadState(slotIdx);
                }
            }
            else
            {
                StormDsUiState.Instance.EngineService.SaveState(slotIdx);
                UpdatePane(_currentRom);
            }
        };

        return border;
    }

    private Button CreateTabButton(AuroraIconKind icon, string title, int tabIndex)
    {
        var btn = new Button
        {
            Margin = new Thickness(2),
            Padding = new Thickness(4, 6),
            Background = StormThemeBrushes.RowSurface,
            BorderBrush = StormThemeBrushes.SubtleBorder,
            BorderThickness = new Thickness(1),
            CornerRadius = new CornerRadius(8),
            Cursor = new Cursor(StandardCursorType.Hand),
            HorizontalContentAlignment = HorizontalAlignment.Center
        };

        var stack = new StackPanel
        {
            Spacing = 3,
            HorizontalAlignment = HorizontalAlignment.Center
        };
        stack.Children.Add(new AuroraVectorIcon
        {
            Kind = icon,
            Size = 14,
            HorizontalAlignment = HorizontalAlignment.Center
        });
        stack.Children.Add(new TextBlock
        {
            Text = title,
            FontSize = 10,
            FontWeight = FontWeight.Medium,
            Foreground = StormThemeBrushes.BodyText,
            HorizontalAlignment = HorizontalAlignment.Center
        });

        btn.Content = stack;
        btn.Click += (s, e) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            if (_currentRom != null)
            {
                _onOpenModalTab?.Invoke(_currentRom, tabIndex);
            }
        };

        return btn;
    }

    private static Border CreateSeparator()
    {
        return new Border
        {
            Height = 1,
            Background = StormThemeBrushes.SubtleBorder,
            Margin = new Thickness(0, 4)
        };
    }

    private static Grid CreateQuickSettingRow(string label, out TextBlock valText)
    {
        var g = new Grid
        {
            ColumnDefinitions = new ColumnDefinitions("Auto,*"),
            Margin = new Thickness(0, 2)
        };

        g.Children.Add(new TextBlock
        {
            Text = label,
            FontSize = 11,
            Foreground = StormThemeBrushes.SecondaryText
        });

        valText = new TextBlock
        {
            Text = "-",
            FontSize = 11,
            FontWeight = FontWeight.SemiBold,
            Foreground = StormThemeBrushes.BodyText,
            HorizontalAlignment = HorizontalAlignment.Right
        };
        g.Children.Add(valText);
        Grid.SetColumn(valText, 1);

        return g;
    }

    private void UpdatePane(RomMetadataRecord? rom)
    {
        _currentRom = rom;
        var cfg = StormDsUiState.Instance.AppConfig;
        var profile = rom != null ? StormDsUiState.Instance.LoadRomProfile(rom.GameCode) : null;

        _rendererValText.Text = (profile?.RendererBackend ?? cfg.RendererBackend).ToString();
        _scaleValText.Text = $"{profile?.InternalResolutionScale ?? cfg.InternalResolutionScale}x Native";
        _compositorValText.Text = (profile?.VulkanCompositorMode ?? cfg.VulkanCompositorMode).ToString();
        _slot2ValText.Text = (profile?.Slot2AddonType ?? cfg.Slot2AddonType).ToString();

        _saveSlotsGrid.Children.Clear();
        for (int i = 0; i < 4; i++)
        {
            _saveSlotsGrid.Children.Add(CreateSlotCard(i));
        }

        if (rom == null)
        {
            _titleText.Text = $"STORM DS {StormDs.Core.Localization.StormDsLoc.AppVersion}";
            _codeText.Text = "NTR-001";
            _sizeText.Text = "0 MB";
            _crcText.Text = "CRC32: -";
            _coverImage.Source = null;
            return;
        }

        string lang = cfg.Language;
        _titleText.Text = rom.GetDisplayTitle(lang);
        _codeText.Text = rom.GameCode;
        _sizeText.Text = $"{rom.FileSizeBytes / (1024.0 * 1024.0):0.1} MB";
        _crcText.Text = $"CRC {rom.Crc32Hex}";

        var bgra = StormDsUiState.Instance.LibraryService.GetIconBgra128(rom.GameCode);
        if (bgra != null)
        {
            _coverImage.Source = BitmapHelper.CreateBgraBitmap(bgra, 128, 128);
        }
        else
        {
            _coverImage.Source = null;
        }
    }
}
