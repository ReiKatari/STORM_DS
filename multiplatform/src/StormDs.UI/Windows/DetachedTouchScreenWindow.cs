// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using System.IO;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Layout;
using Avalonia.Media;
using Avalonia.Media.Imaging;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Services;
using StormDs.Core.Configuration;
using StormDs.UI.Common;

namespace StormDs.UI.Windows;

/// <summary>
/// Detached 2nd Screen Window for dual-monitor or multi-window emulation.
/// Dynamically scales the screen and forwards touch coordinates through the shared emulation input handler.
/// </summary>
public class DetachedTouchScreenWindow : Window
{
    private readonly Canvas _canvas;
    private readonly Border _screenContainer;
    private readonly Image _screenImage;
    private readonly Action _onReattach;
    private readonly Action<ushort, ushort, bool>? _onTouchInput;
    private readonly Func<bool>? _canAcceptTouch;
    private bool _isTouchDown;
    private bool _reattachInvoked;

    public Image ScreenImage => _screenImage;

    public DetachedTouchScreenWindow(
        Action onReattach,
        Action<ushort, ushort, bool>? onTouchInput = null,
        Func<bool>? canAcceptTouch = null)
    {
        _onReattach = onReattach;
        _onTouchInput = onTouchInput;
        _canAcceptTouch = canAcceptTouch;

        Title = "STORM DS - Сенсорный экран";
        Width = 640;
        Height = 520;
        MinWidth = 280;
        MinHeight = 256;
        WindowStartupLocation = WindowStartupLocation.CenterScreen;
        Background = new SolidColorBrush(Color.Parse("#0F111A"));

        string iconPath = Path.Combine(AppContext.BaseDirectory, "assets", "AppIcon.ico");
        if (File.Exists(iconPath))
        {
            try
            {
                Icon = new WindowIcon(iconPath);
            }
            catch
            {
            }
        }

        var rootGrid = new Grid
        {
            RowDefinitions = new RowDefinitions("36,*")
        };

        var titleBar = new Grid
        {
            Background = new SolidColorBrush(Color.FromArgb(160, 20, 24, 38)),
            ColumnDefinitions = new ColumnDefinitions("Auto,*,Auto")
        };

        var titleStack = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 8,
            Margin = new Thickness(12, 0, 0, 0),
            VerticalAlignment = VerticalAlignment.Center
        };
        titleStack.Children.Add(new AuroraVectorIcon { Kind = AuroraIconKind.TouchStylus, Size = 15, VerticalAlignment = VerticalAlignment.Center });
        var titleText = new TextBlock
        {
            Text = "STORM DS - Сенсорный экран",
            FontSize = 11.5,
            FontWeight = FontWeight.Bold,
            VerticalAlignment = VerticalAlignment.Center
        };
        titleStack.Children.Add(titleText);
        titleBar.Children.Add(titleStack);
        Grid.SetColumn(titleStack, 0);

        var dragArea = new Border { Background = Brushes.Transparent };
        dragArea.PointerPressed += (s, e) =>
        {
            if (e.GetCurrentPoint(this).Properties.IsLeftButtonPressed) BeginMoveDrag(e);
        };
        titleBar.Children.Add(dragArea);
        Grid.SetColumn(dragArea, 1);

        var reattachBtn = new Button
        {
            Height = 26,
            Padding = new Thickness(8, 2),
            Margin = new Thickness(0, 0, 8, 0),
            BorderThickness = new Thickness(1),
            CornerRadius = new CornerRadius(6),
            Cursor = new Cursor(StandardCursorType.Hand),
            VerticalAlignment = VerticalAlignment.Center
        };
        var rStack = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 4 };
        rStack.Children.Add(new AuroraVectorIcon { Kind = AuroraIconKind.SwapScreens, Size = 12, VerticalAlignment = VerticalAlignment.Center });
        var reattachLabel = new TextBlock { Text = "Прикрепить экран", FontSize = 10, FontWeight = FontWeight.Medium, VerticalAlignment = VerticalAlignment.Center };
        rStack.Children.Add(reattachLabel);
        reattachBtn.Content = rStack;
        reattachBtn.Click += (s, e) => Close();
        titleBar.Children.Add(reattachBtn);
        Grid.SetColumn(reattachBtn, 2);

        StormThemeBrushes.BindTheme(rootGrid, () =>
        {
            Background = Storm.AuroraFluid.Kit.Themes.AuroraThemeManager.Instance.CurrentTheme.BackgroundBrush;
            titleBar.Background = StormThemeBrushes.ChromeSurface;
            titleText.Foreground = StormThemeBrushes.Accent;
            reattachBtn.Background = StormThemeBrushes.CardSurface;
            reattachBtn.BorderBrush = StormThemeBrushes.StrongBorder;
            reattachLabel.Foreground = StormThemeBrushes.PrimaryText;
        });
        Grid.SetColumn(reattachBtn, 2);

        rootGrid.Children.Add(titleBar);
        Grid.SetRow(titleBar, 0);

        _canvas = new Canvas
        {
            Background = Brushes.Black,
            ClipToBounds = true
        };

        _screenContainer = new Border
        {
            Background = new SolidColorBrush(Color.Parse("#08090D")),
            BorderBrush = new SolidColorBrush(Color.FromArgb(80, 255, 255, 255)),
            BorderThickness = new Thickness(1),
            CornerRadius = new CornerRadius(6),
            ClipToBounds = true
        };

        _screenImage = new Image
        {
            Stretch = Stretch.Uniform
        };
        ApplyVisualOptions();

        void ReleaseTouch()
        {
            if (!_isTouchDown) return;
            _isTouchDown = false;
            if (_onTouchInput != null)
            {
                _onTouchInput(0, 0, false);
            }
            else
            {
                StormDsUiState.Instance.EngineService.SetInput(0, 0, 0, false);
            }
        }

        _screenImage.PointerPressed += (s, e) =>
        {
            if (_canAcceptTouch != null && !_canAcceptTouch()) return;
            if (!e.GetCurrentPoint(_screenImage).Properties.IsLeftButtonPressed) return;
            _isTouchDown = true;
            e.Pointer.Capture(_screenImage);
            SendTouch(e.GetPosition(_screenImage));
        };
        _screenImage.PointerMoved += (s, e) =>
        {
            if (_isTouchDown && (_canAcceptTouch == null || _canAcceptTouch()))
            {
                SendTouch(e.GetPosition(_screenImage));
            }
        };
        _screenImage.PointerReleased += (s, e) =>
        {
            if (e.Pointer.Captured == _screenImage) e.Pointer.Capture(null);
            ReleaseTouch();
        };
        _screenImage.PointerCaptureLost += (s, e) => ReleaseTouch();

        _screenContainer.Child = _screenImage;
        _canvas.Children.Add(_screenContainer);

        _canvas.PropertyChanged += (_, ch) =>
        {
            if (ch.Property == BoundsProperty)
            {
                RecalculateLayout();
            }
        };

        StormDsUiState.Instance.DisplayConfigChanged += ApplyVisualOptionsAndLayout;

        rootGrid.Children.Add(_canvas);
        Grid.SetRow(_canvas, 1);

        Content = rootGrid;
        Closing += (_, _) =>
        {
            ReleaseTouch();
            StormDsUiState.Instance.DisplayConfigChanged -= ApplyVisualOptionsAndLayout;
            StormDsUiState.Instance.IsDetachedScreenActive = false;
            if (!_reattachInvoked)
            {
                _reattachInvoked = true;
                _onReattach();
            }
        };
    }

    private void ApplyVisualOptionsAndLayout()
    {
        ApplyVisualOptions();
        RecalculateLayout();
    }

    public void ApplyVisualOptions()
    {
        var cfg = StormDsUiState.Instance.AppConfig;
        _screenImage.Stretch = cfg.ScreenScaleMode == ScreenScaleMode.StretchFill ? Stretch.Fill : Stretch.Uniform;
        RenderOptions.SetBitmapInterpolationMode(_screenImage, cfg.ScreenFilter switch
        {
            ScreenFilter.Nearest => BitmapInterpolationMode.None,
            ScreenFilter.Linear => BitmapInterpolationMode.MediumQuality,
            _ => BitmapInterpolationMode.HighQuality
        });
    }

    private void RecalculateLayout()
    {
        double w = _canvas.Bounds.Width;
        double h = _canvas.Bounds.Height;
        if (w <= 8 || h <= 8) return;

        double pad = 8;
        double aw = Math.Max(32, w - pad * 2);
        double ah = Math.Max(32, h - pad * 2);

        var mode = StormDsUiState.Instance.AppConfig.ScreenScaleMode;
        double targetW, targetH;
        if (mode == ScreenScaleMode.StretchFill)
        {
            targetW = aw;
            targetH = ah;
        }
        else if (mode == ScreenScaleMode.IntegerPixelPerfect)
        {
            int k = (int)Math.Floor(Math.Min(aw / 256.0, ah / 192.0));
            if (k >= 1)
            {
                targetW = 256.0 * k;
                targetH = 192.0 * k;
            }
            else
            {
                double s = Math.Min(aw / 256.0, ah / 192.0);
                targetW = 256.0 * s;
                targetH = 192.0 * s;
            }
        }
        else
        {
            double s = Math.Min(aw / 256.0, ah / 192.0);
            targetW = 256.0 * s;
            targetH = 192.0 * s;
        }

        targetW = Math.Round(targetW);
        targetH = Math.Round(targetH);
        _screenContainer.Width = targetW;
        _screenContainer.Height = targetH;
        Canvas.SetLeft(_screenContainer, Math.Round((w - targetW) / 2.0));
        Canvas.SetTop(_screenContainer, Math.Round((h - targetH) / 2.0));
    }

    private void SendTouch(Point p)
    {
        var b = _screenImage.Bounds;
        if (b.Width <= 0 || b.Height <= 0) return;

        ushort tx = (ushort)(Math.Clamp(p.X / b.Width, 0.0, 1.0) * 255.0);
        ushort ty = (ushort)(Math.Clamp(p.Y / b.Height, 0.0, 1.0) * 191.0);

        if (_onTouchInput != null)
        {
            _onTouchInput(tx, ty, true);
        }
        else
        {
            StormDsUiState.Instance.EngineService.SetInput(0, tx, ty, true);
        }
    }
}
