// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
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
/// Responsive Bento ROM Card for the main game grid.
/// Renders genuine 128x128 Nearest-Neighbor cartridge icon, Title, GameCode,
/// unit badge, file size, and tactile selection/double-click play.
/// </summary>
public class BentoRomCard : AuroraGlassCard
{
    private readonly RomMetadataRecord _rom;
    private readonly Image _iconImage;
    private readonly TextBlock _titleText;
    private readonly TextBlock _codeText;
    private readonly TextBlock _sizeText;
    private readonly Border _starButton;
    private readonly Border _selectionBorder;

    public RomMetadataRecord Rom => _rom;

    public BentoRomCard(RomMetadataRecord rom)
    {
        _rom = rom;
        Width = 190;
        Height = 230;
        Margin = new Thickness(6);
        SpotlightEnabled = true;
        Cursor = new Cursor(StandardCursorType.Hand);

        var rootGrid = new Grid
        {
            RowDefinitions = new RowDefinitions("130,*,Auto")
        };

        // 1. Icon Container
        var iconContainer = new Border
        {
            Width = 112,
            Height = 112,
            CornerRadius = new CornerRadius(10),
            Background = new SolidColorBrush(Color.FromArgb(50, 0, 0, 0)),
            BorderBrush = new SolidColorBrush(Color.FromArgb(70, 255, 255, 255)),
            BorderThickness = new Thickness(1),
            Margin = new Thickness(0, 10, 0, 0),
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Center
        };

        _iconImage = new Image
        {
            Width = 112,
            Height = 112,
            Stretch = Stretch.Uniform
        };
        RenderOptions.SetBitmapInterpolationMode(_iconImage, BitmapInterpolationMode.None); // Strict Nearest-Neighbor

        var bgra = StormDsUiState.Instance.LibraryService.GetIconBgra128(rom.GameCode);
        if (bgra != null)
        {
            _iconImage.Source = BitmapHelper.CreateBgraBitmap(bgra, 128, 128);
        }

        iconContainer.Child = _iconImage;
        rootGrid.Children.Add(iconContainer);
        Grid.SetRow(iconContainer, 0);

        // Favorite Star in top-right corner
        _starButton = new Border
        {
            Width = 26,
            Height = 26,
            CornerRadius = new CornerRadius(6),
            Background = new SolidColorBrush(Color.FromArgb(80, 0, 0, 0)),
            HorizontalAlignment = HorizontalAlignment.Right,
            VerticalAlignment = VerticalAlignment.Top,
            Margin = new Thickness(0, 8, 8, 0)
        };
        var starIcon = new AuroraVectorIcon
        {
            Kind = AuroraIconKind.StarFavorite,
            Size = 13,
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Center
        };
        _starButton.Child = starIcon;
        _starButton.PointerPressed += (s, e) =>
        {
            e.Handled = true;
            StormDsUiState.Instance.ToggleFavorite(_rom);
            UpdateFavoriteVisual();
        };
        rootGrid.Children.Add(_starButton);
        Grid.SetRow(_starButton, 0);

        // 2. Title Area
        var titleStack = new StackPanel
        {
            Margin = new Thickness(10, 6, 10, 0),
            VerticalAlignment = VerticalAlignment.Top
        };

        string lang = StormDsUiState.Instance.AppConfig.Language;
        _titleText = new TextBlock
        {
            Text = rom.GetDisplayTitle(lang),
            FontSize = 12.5,
            FontWeight = FontWeight.Bold,
            Foreground = new SolidColorBrush(Color.Parse("#F8FAFC")),
            TextTrimming = TextTrimming.CharacterEllipsis,
            MaxLines = 2,
            TextWrapping = TextWrapping.Wrap
        };
        titleStack.Children.Add(_titleText);
        rootGrid.Children.Add(titleStack);
        Grid.SetRow(titleStack, 1);

        // 3. Bottom Badges
        var bottomRow = new Grid
        {
            ColumnDefinitions = new ColumnDefinitions("Auto,*,Auto"),
            Margin = new Thickness(10, 0, 10, 8),
            VerticalAlignment = VerticalAlignment.Bottom
        };

        var unitBadge = new Border
        {
            Background = new SolidColorBrush(Color.FromArgb(40, 56, 189, 248)),
            BorderBrush = new SolidColorBrush(Color.Parse("#38BDF8")),
            BorderThickness = new Thickness(1),
            CornerRadius = new CornerRadius(4),
            Padding = new Thickness(4, 1)
        };
        _codeText = new TextBlock
        {
            Text = rom.UnitCode.ToString(),
            FontSize = 9,
            FontWeight = FontWeight.Bold,
            Foreground = new SolidColorBrush(Color.Parse("#38BDF8"))
        };
        unitBadge.Child = _codeText;
        bottomRow.Children.Add(unitBadge);
        Grid.SetColumn(unitBadge, 0);

        _sizeText = new TextBlock
        {
            Text = $"{rom.FileSizeBytes / (1024.0 * 1024.0):0.1} MB",
            FontSize = 10,
            Foreground = new SolidColorBrush(Color.Parse("#94A3B8")),
            VerticalAlignment = VerticalAlignment.Center,
            HorizontalAlignment = HorizontalAlignment.Right
        };
        bottomRow.Children.Add(_sizeText);
        Grid.SetColumn(_sizeText, 2);

        rootGrid.Children.Add(bottomRow);
        Grid.SetRow(bottomRow, 2);

        // Active selection highlight overlay
        _selectionBorder = new Border
        {
            CornerRadius = CornerRadius,
            BorderThickness = new Thickness(2),
            BorderBrush = Brushes.Transparent,
            IsHitTestVisible = false
        };
        rootGrid.Children.Add(_selectionBorder);
        Grid.SetRowSpan(_selectionBorder, 3);

        Content = rootGrid;

        PointerPressed += (s, e) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            StormDsUiState.Instance.SelectRom(_rom);
        };

        DoubleTapped += (s, e) =>
        {
            StormDsUiState.Instance.StartEmulation(_rom);
        };

        UpdateFavoriteVisual();
        UpdateSelectionVisual();

        StormDsUiState.Instance.RomSelected += (r) => UpdateSelectionVisual();
    }

    private void UpdateFavoriteVisual()
    {
        _starButton.Background = _rom.IsFavorite
            ? new SolidColorBrush(Color.Parse("#F59E0B"))
            : new SolidColorBrush(Color.FromArgb(80, 0, 0, 0));
    }

    private void UpdateSelectionVisual()
    {
        bool isSelected = StormDsUiState.Instance.SelectedRom?.FilePath == _rom.FilePath;
        if (isSelected)
        {
            var theme = AuroraThemeManager.Instance.CurrentTheme;
            var (primary, _) = AuroraThemeManager.ResolveAccentColors(theme, AuroraThemeManager.Instance.CurrentAccentOverride);
            _selectionBorder.BorderBrush = new SolidColorBrush(primary);
        }
        else
        {
            _selectionBorder.BorderBrush = Brushes.Transparent;
        }
    }
}
