// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Layout;
using Avalonia.Media;
using Avalonia.Media.Imaging;
using Avalonia.Platform.Storage;
using Avalonia.Threading;
using Storm.AuroraFluid.Kit.Controls;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Services;
using Storm.AuroraFluid.Kit.Themes;
using StormDs.Core.Library;
using StormDs.UI.Common;

namespace StormDs.UI.Views.Bento;

/// <summary>
/// Hero Featured Game Bento Card.
/// Displays genuine 128x128 nearest-neighbor icon/art, game details,
/// and a prominent 3D AuroraVolumetricButton "Запустить игру".
/// </summary>
public class BentoHeroCard : AuroraGlassCard
{
    private readonly Image _iconImage;
    private readonly TextBlock _titleText;
    private readonly TextBlock _metaText;
    private readonly TextBlock _descText;
    private readonly AuroraVolumetricButton _launchButton;
    private readonly AuroraVolumetricButton _biosButton;
    private readonly Border _favButton;
    private readonly AuroraVectorIcon _favIcon;
    private RomMetadataRecord? _currentRom;

    public BentoHeroCard()
    {
        Height = 175;
        Margin = new Thickness(0, 0, 8, 8);
        SpotlightEnabled = true;

        var grid = new Grid
        {
            ColumnDefinitions = new ColumnDefinitions("150,*,Auto")
        };

        // 1. Icon / Cover Area
        var iconBorder = new Border
        {
            Width = 128,
            Height = 128,
            CornerRadius = new CornerRadius(12),
            BorderThickness = new Thickness(1),
            Margin = new Thickness(12),
            VerticalAlignment = VerticalAlignment.Center,
            HorizontalAlignment = HorizontalAlignment.Center
        };

        _iconImage = new Image
        {
            Width = 128,
            Height = 128,
            Stretch = Stretch.Uniform
        };
        RenderOptions.SetBitmapInterpolationMode(_iconImage, BitmapInterpolationMode.None); // Nearest-Neighbor 100% crisp

        iconBorder.Child = _iconImage;
        grid.Children.Add(iconBorder);
        Grid.SetColumn(iconBorder, 0);

        // 2. Info Area
        var infoStack = new StackPanel
        {
            VerticalAlignment = VerticalAlignment.Center,
            Margin = new Thickness(8, 0, 16, 0),
            Spacing = 4
        };

        var tagStack = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 6
        };

        var featuredBadge = new Border
        {
            Background = new SolidColorBrush(Color.FromArgb(50, 14, 165, 233)),
            BorderBrush = new SolidColorBrush(Color.Parse("#38BDF8")),
            BorderThickness = new Thickness(1),
            CornerRadius = new CornerRadius(6),
            Padding = new Thickness(6, 2)
        };
        featuredBadge.Child = new TextBlock
        {
            Text = "ИЗБРАННАЯ ИГРА",
            FontSize = 9.5,
            FontWeight = FontWeight.Bold,
            Foreground = new SolidColorBrush(Color.Parse("#38BDF8"))
        };
        tagStack.Children.Add(featuredBadge);

        _metaText = new TextBlock
        {
            Text = "NDS • NTR-001 • 128 MB",
            FontSize = 11,
            Foreground = new SolidColorBrush(Color.Parse("#94A3B8")),
            VerticalAlignment = VerticalAlignment.Center
        };
        tagStack.Children.Add(_metaText);
        infoStack.Children.Add(tagStack);

        _titleText = new TextBlock
        {
            Text = "Выберите игру из библиотеки или перетащите ROM",
            FontSize = 17,
            FontWeight = FontWeight.Bold,
            Foreground = new SolidColorBrush(Color.Parse("#F8FAFC")),
            TextTrimming = TextTrimming.CharacterEllipsis,
            MaxWidth = 450
        };
        infoStack.Children.Add(_titleText);

        _descText = new TextBlock
        {
            Text = "Быстрый запуск с аппаратным рендерингом Vulkan 1.4 и мгновенным нулевым откликом.",
            FontSize = 12,
            Foreground = new SolidColorBrush(Color.Parse("#94A3B8")),
            TextWrapping = TextWrapping.Wrap,
            MaxWidth = 450,
            MaxLines = 2
        };
        infoStack.Children.Add(_descText);

        grid.Children.Add(infoStack);
        Grid.SetColumn(infoStack, 1);

        // 3. Actions Area
        var actionStack = new StackPanel
        {
            VerticalAlignment = VerticalAlignment.Center,
            Margin = new Thickness(0, 0, 16, 0),
            Spacing = 8
        };

        // Big 3D Hero Launch Button
        _launchButton = new AuroraVolumetricButton
        {
            IsHero = true,
            Height = 44,
            Width = 180,
            Padding = new Thickness(12, 6)
        };
        var btnContent = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 8,
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Center
        };
        btnContent.Children.Add(new AuroraVectorIcon
        {
            Kind = AuroraIconKind.PlayPrism,
            Size = 18,
            VerticalAlignment = VerticalAlignment.Center
        });
        btnContent.Children.Add(new TextBlock
        {
            Text = "Запустить игру",
            FontSize = 13.5,
            FontWeight = FontWeight.Bold,
            Foreground = Brushes.White,
            VerticalAlignment = VerticalAlignment.Center
        });
        _launchButton.Content = btnContent;
        _launchButton.Click += async (s, e) =>
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
        actionStack.Children.Add(_launchButton);

        // Sub Actions (Firmware + Favorite)
        var subActionRow = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 6,
            HorizontalAlignment = HorizontalAlignment.Center
        };

        _biosButton = new AuroraVolumetricButton
        {
            Height = 32,
            Width = 136,
            Padding = new Thickness(6, 2)
        };
        var biosContent = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 5,
            VerticalAlignment = VerticalAlignment.Center
        };
        biosContent.Children.Add(new AuroraVectorIcon
        {
            Kind = AuroraIconKind.ResetCycle,
            Size = 13,
            VerticalAlignment = VerticalAlignment.Center
        });
        var biosBtnText = new TextBlock
        {
            Text = "Меню FreeBIOS",
            FontSize = 11,
            FontWeight = FontWeight.Medium,
            VerticalAlignment = VerticalAlignment.Center
        };
        biosContent.Children.Add(biosBtnText);
        _biosButton.Content = biosContent;
        _biosButton.Click += (s, e) =>
        {
            StormDsUiState.Instance.StartEmulation(bootBios: true);
        };
        subActionRow.Children.Add(_biosButton);

        _favButton = new Border
        {
            Width = 36,
            Height = 32,
            CornerRadius = new CornerRadius(8),
            BorderThickness = new Thickness(1),
            Cursor = new Cursor(StandardCursorType.Hand)
        };

        StormThemeBrushes.BindTheme(this, () =>
        {
            iconBorder.Background = StormThemeBrushes.CardSurface;
            iconBorder.BorderBrush = StormThemeBrushes.SubtleBorder;
            _metaText.Foreground = StormThemeBrushes.SecondaryText;
            _titleText.Foreground = StormThemeBrushes.PrimaryText;
            _descText.Foreground = StormThemeBrushes.SecondaryText;
            biosBtnText.Foreground = StormThemeBrushes.PrimaryText;
            UpdateFavoriteVisual();
        });
        _favIcon = new AuroraVectorIcon
        {
            Kind = AuroraIconKind.StarFavorite,
            Size = 15,
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Center
        };
        _favButton.Child = _favIcon;
        _favButton.PointerPressed += (s, e) =>
        {
            if (_currentRom != null)
            {
                StormDsUiState.Instance.ToggleFavorite(_currentRom);
                UpdateFavoriteVisual();
            }
        };
        subActionRow.Children.Add(_favButton);

        actionStack.Children.Add(subActionRow);

        grid.Children.Add(actionStack);
        Grid.SetColumn(actionStack, 2);

        Content = grid;

        StormDsUiState.Instance.RomSelected += UpdateWithRom;
        UpdateWithRom(StormDsUiState.Instance.SelectedRom);
    }

    private void UpdateWithRom(RomMetadataRecord? rom)
    {
        if (!Dispatcher.UIThread.CheckAccess())
        {
            Dispatcher.UIThread.Post(() => UpdateWithRom(rom));
            return;
        }

        _currentRom = rom;
        if (rom == null)
        {
            _titleText.Text = $"STORM DS {StormDs.Core.Localization.StormDsLoc.AppVersion} - Готов к запуску";
            _metaText.Text = $"FreeBIOS • {StormDsUiState.Instance.VulkanTierBadge} • 60 FPS";
            _descText.Text = "Нажмите «Запустить игру» для выбора файла или перетащите .nds, .dsi, .srl, .zip.";
            _iconImage.Source = null;
            UpdateFavoriteVisual();
            return;
        }

        string lang = StormDsUiState.Instance.AppConfig.Language;
        _titleText.Text = rom.GetDisplayTitle(lang);
        _metaText.Text = $"{rom.UnitCode} • {rom.GameCode} • {rom.FileSizeBytes / (1024.0 * 1024.0):0.1} MB • CRC {rom.Crc32Hex}";
        _descText.Text = $"Запусков: {rom.PlayCount} | Контрольная сумма заголовка проверена | Сохранение: {rom.GameCode}.sav";

        var bgra = StormDsUiState.Instance.LibraryService.GetIconBgra128(rom.GameCode);
        if (bgra != null)
        {
            _iconImage.Source = BitmapHelper.CreateBgraBitmap(bgra, 128, 128);
        }
        else
        {
            _iconImage.Source = null;
        }

        UpdateFavoriteVisual();
    }

    private void UpdateFavoriteVisual()
    {
        bool isFav = _currentRom?.IsFavorite == true;
        _favButton.Background = isFav
            ? new SolidColorBrush(Color.FromArgb(90, 245, 158, 11))
            : StormThemeBrushes.CardSurface;
        _favButton.BorderBrush = isFav
            ? new SolidColorBrush(Color.Parse("#F59E0B"))
            : StormThemeBrushes.StrongBorder;
    }
}
