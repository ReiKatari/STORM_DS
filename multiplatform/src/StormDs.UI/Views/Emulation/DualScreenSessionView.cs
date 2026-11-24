// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Layout;
using Avalonia.Media;
using Avalonia.Media.Imaging;
using Avalonia.Threading;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Services;
using Storm.AuroraFluid.Kit.Themes;
using StormDs.Core.Configuration;
using StormDs.UI.Common;
using StormDs.UI.Windows;

namespace StormDs.UI.Views.Emulation;

/// <summary>
/// Live dual-screen emulation session view driving StormDsEngineService at 60 FPS (or fast-forward).
/// Dynamically scales DS screens across all 6 layout modes and 3 scaling modes (AspectFit / Integer / StretchFill),
/// applies live filtering, provides a compact top quick bar, pixel-accurate touch input, and detachable 2nd window.
/// </summary>
public class DualScreenSessionView : Grid
{
    private readonly Border _quickBar;
    private readonly TextBlock _layoutPillText;
    private readonly TextBlock _scalePillText;
    private readonly TextBlock _filterPillText;
    private readonly TextBlock _statsBadgeText;

    private readonly Canvas _viewportCanvas;
    private readonly Border _topScreenContainer;
    private readonly Border _bottomScreenContainer;
    private readonly Image _topScreenImage;
    private readonly Image _bottomScreenImage;

    private readonly TouchControlsOverlay _touchControls;
    private readonly EmulationPauseOverlay _pauseOverlay;
    private readonly DispatcherTimer _frameTimer;

    private DetachedTouchScreenWindow? _detachedWindow;
    private bool _screensSwapped;
    private bool _isTouchDown;
    private uint _keyboardButtonsMask;
    private long _frameCounter;

    public DualScreenSessionView()
    {
        Background = Brushes.Black;
        Focusable = true;
        RowDefinitions = new RowDefinitions("Auto,*");

        // 1. Sleek Emulation Quick Bar (Row 0, auto-hidden in fullscreen)
        _quickBar = new Border
        {
            Height = 38,
            Background = new SolidColorBrush(Color.FromArgb(225, 13, 17, 29)),
            BorderBrush = new SolidColorBrush(Color.FromArgb(50, 255, 255, 255)),
            BorderThickness = new Thickness(0, 0, 0, 1),
            Padding = new Thickness(10, 4)
        };

        var barGrid = new Grid
        {
            ColumnDefinitions = new ColumnDefinitions("Auto,*,Auto")
        };

        var leftControls = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 6,
            VerticalAlignment = VerticalAlignment.Center
        };

        var layoutPair = CreateBarPill(AuroraIconKind.DualScreenLayout, "", Color.Parse("#38BDF8"), CycleLayoutMode);
        _layoutPillText = layoutPair.Label;
        var scalePair = CreateBarPill(AuroraIconKind.FullScreenExpand, "", Color.Parse("#10B981"), CycleScaleMode);
        _scalePillText = scalePair.Label;
        var filterPair = CreateBarPill(AuroraIconKind.ShaderPrism, "", Color.Parse("#A855F7"), CycleFilterMode);
        _filterPillText = filterPair.Label;
        var swapPair = CreateBarPill(AuroraIconKind.SwapScreens, "Поменять (Tab)", Color.Parse("#818CF8"), SwapScreens);
        var detachPair = CreateBarPill(AuroraIconKind.DetachWindow, "2-е окно", Color.Parse("#06B6D4"), ToggleDetachScreen);

        leftControls.Children.Add(layoutPair.Btn);
        leftControls.Children.Add(scalePair.Btn);
        leftControls.Children.Add(filterPair.Btn);
        leftControls.Children.Add(swapPair.Btn);
        leftControls.Children.Add(detachPair.Btn);

        barGrid.Children.Add(leftControls);
        Grid.SetColumn(leftControls, 0);

        _statsBadgeText = new TextBlock
        {
            Text = "60.0 FPS",
            FontSize = 11,
            FontWeight = FontWeight.SemiBold,
            Foreground = new SolidColorBrush(Color.Parse("#94A3B8")),
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Center
        };
        barGrid.Children.Add(_statsBadgeText);
        Grid.SetColumn(_statsBadgeText, 1);

        var rightControls = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 6,
            VerticalAlignment = VerticalAlignment.Center
        };

        var ffBtn = CreateBarPill(AuroraIconKind.FastForwardBolt, "Ускорить", Color.Parse("#F59E0B"), ToggleFastForward).Btn;
        var fsBtn = CreateBarPill(AuroraIconKind.WindowMaximize, "Полный экран (F11)", Color.Parse("#22D3EE"), () => StormDsUiState.Instance.RequestToggleFullscreen()).Btn;
        var saveBtn = CreateBarPill(AuroraIconKind.SaveSlotRibbon, "Сохр. (F5)", Color.Parse("#10B981"), () => StormDsUiState.Instance.EngineService.SaveState(0)).Btn;
        var loadBtn = CreateBarPill(AuroraIconKind.LoadSlotArrow, "Загр. (F8)", Color.Parse("#38BDF8"), () => StormDsUiState.Instance.EngineService.LoadState(0)).Btn;
        var pauseBtn = CreateBarPill(AuroraIconKind.PauseTwin, "Пауза (Esc)", Color.Parse("#F59E0B"), TogglePauseMenu).Btn;
        var stopBtn = CreateBarPill(AuroraIconKind.StopOctagon, "Стоп", Color.Parse("#EF4444"), () => StormDsUiState.Instance.StopEmulation()).Btn;

        rightControls.Children.Add(ffBtn);
        rightControls.Children.Add(fsBtn);
        rightControls.Children.Add(saveBtn);
        rightControls.Children.Add(loadBtn);
        rightControls.Children.Add(pauseBtn);
        rightControls.Children.Add(stopBtn);

        barGrid.Children.Add(rightControls);
        Grid.SetColumn(rightControls, 2);

        _quickBar.Child = barGrid;
        Children.Add(_quickBar);
        Grid.SetRow(_quickBar, 0);

        // 2. Dynamic Screen Viewport Area (Row 1)
        var viewportHost = new Grid();
        _viewportCanvas = new Canvas
        {
            Background = Brushes.Black,
            HorizontalAlignment = HorizontalAlignment.Stretch,
            VerticalAlignment = VerticalAlignment.Stretch,
            ClipToBounds = true
        };

        _topScreenContainer = new Border
        {
            Background = new SolidColorBrush(Color.Parse("#08090D")),
            BorderBrush = new SolidColorBrush(Color.FromArgb(80, 255, 255, 255)),
            BorderThickness = new Thickness(1),
            CornerRadius = new CornerRadius(6),
            ClipToBounds = true
        };
        _topScreenImage = new Image { Stretch = Stretch.Uniform };
        _topScreenImage.PointerPressed += (s, e) =>
        {
            if (_screensSwapped)
            {
                _isTouchDown = true;
                SendTouch(e.GetPosition(_topScreenImage), _topScreenImage);
            }
        };
        _topScreenImage.PointerMoved += (s, e) =>
        {
            if (_isTouchDown && _screensSwapped) SendTouch(e.GetPosition(_topScreenImage), _topScreenImage);
        };
        _topScreenImage.PointerReleased += (s, e) =>
        {
            if (_screensSwapped) HandleTouchRelease();
        };
        _topScreenContainer.Child = _topScreenImage;

        _bottomScreenContainer = new Border
        {
            Background = new SolidColorBrush(Color.Parse("#08090D")),
            BorderBrush = new SolidColorBrush(Color.FromArgb(80, 255, 255, 255)),
            BorderThickness = new Thickness(1),
            CornerRadius = new CornerRadius(6),
            ClipToBounds = true
        };
        _bottomScreenImage = new Image { Stretch = Stretch.Uniform };
        _bottomScreenImage.PointerPressed += (s, e) =>
        {
            if (!_screensSwapped)
            {
                _isTouchDown = true;
                SendTouch(e.GetPosition(_bottomScreenImage), _bottomScreenImage);
            }
        };
        _bottomScreenImage.PointerMoved += (s, e) =>
        {
            if (_isTouchDown && !_screensSwapped) SendTouch(e.GetPosition(_bottomScreenImage), _bottomScreenImage);
        };
        _bottomScreenImage.PointerReleased += (s, e) =>
        {
            if (!_screensSwapped) HandleTouchRelease();
        };
        _bottomScreenContainer.Child = _bottomScreenImage;

        _viewportCanvas.Children.Add(_topScreenContainer);
        _viewportCanvas.Children.Add(_bottomScreenContainer);
        _viewportCanvas.PropertyChanged += (_, ch) =>
        {
            if (ch.Property == BoundsProperty)
            {
                RecalculateScreenLayout();
            }
        };
        viewportHost.Children.Add(_viewportCanvas);

        // 3. Touch Overlay (shown on Android or explicitly enabled on desktop)
        _touchControls = new TouchControlsOverlay
        {
            IsVisible = OperatingSystem.IsAndroid() || StormDsUiState.Instance.AppConfig.ShowTouchOverlayOnDesktop
        };
        _touchControls.InputChanged += UpdateCombinedInput;
        viewportHost.Children.Add(_touchControls);

        Children.Add(viewportHost);
        Grid.SetRow(viewportHost, 1);

        // 4. Pause & Live Tuning Overlay (covers entire view)
        _pauseOverlay = new EmulationPauseOverlay
        {
            IsVisible = false
        };
        _pauseOverlay.ResumeRequested += ResumeFromPause;
        _pauseOverlay.SwapScreensRequested += SwapScreens;
        _pauseOverlay.DetachScreenRequested += ToggleDetachScreen;
        _pauseOverlay.StopEmulationRequested += () => StormDsUiState.Instance.StopEmulation();
        Children.Add(_pauseOverlay);
        Grid.SetRow(_pauseOverlay, 0);
        Grid.SetRowSpan(_pauseOverlay, 2);

        // 5. Frame Render Loop (~60 FPS)
        _frameTimer = new DispatcherTimer { Interval = TimeSpan.FromMilliseconds(16) };
        _frameTimer.Tick += OnEmulationFrameTick;
        _frameTimer.Start();

        // Subscriptions
        StormDsUiState.Instance.DisplayConfigChanged += RefreshDisplayConfig;
        StormDsUiState.Instance.FullscreenChanged += isFs =>
        {
            _quickBar.IsVisible = !isFs;
        };
        StormDsUiState.Instance.EmulationStopped += () =>
        {
            if (_detachedWindow != null)
            {
                _detachedWindow.Close();
                _detachedWindow = null;
            }
            _pauseOverlay.IsVisible = false;
        };

        KeyDown += HandleKeyDown;
        KeyUp += HandleKeyUp;

        RefreshDisplayConfig();
    }

    private static (TextBlock Label, Button Btn) CreateBarPill(AuroraIconKind icon, string text, Color accent, Action onClick)
    {
        var btn = new Button
        {
            Height = 28,
            Padding = new Thickness(8, 2),
            Background = new SolidColorBrush(Color.FromArgb(40, accent.R, accent.G, accent.B)),
            BorderBrush = new SolidColorBrush(Color.FromArgb(95, accent.R, accent.G, accent.B)),
            BorderThickness = new Thickness(1),
            CornerRadius = new CornerRadius(7),
            Cursor = new Cursor(StandardCursorType.Hand),
            VerticalAlignment = VerticalAlignment.Center
        };

        var stack = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 5,
            VerticalAlignment = VerticalAlignment.Center
        };
        stack.Children.Add(new AuroraVectorIcon { Kind = icon, Size = 13, VerticalAlignment = VerticalAlignment.Center });
        var tb = new TextBlock
        {
            Text = text,
            FontSize = 11,
            FontWeight = FontWeight.Medium,
            Foreground = Brushes.White,
            VerticalAlignment = VerticalAlignment.Center
        };
        stack.Children.Add(tb);
        btn.Content = stack;
        btn.Click += (_, _) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            onClick();
        };
        return (tb, btn);
    }

    private void CycleLayoutMode()
    {
        var cfg = StormDsUiState.Instance.AppConfig;
        cfg.ScreenLayoutMode = cfg.ScreenLayoutMode switch
        {
            ScreenLayoutMode.VerticalClassic => ScreenLayoutMode.HorizontalSideBySide,
            ScreenLayoutMode.HorizontalSideBySide => ScreenLayoutMode.HybridLargeFocus,
            ScreenLayoutMode.HybridLargeFocus => ScreenLayoutMode.TopScreenOnly,
            ScreenLayoutMode.TopScreenOnly => ScreenLayoutMode.BottomScreenOnly,
            _ => ScreenLayoutMode.VerticalClassic
        };
        StormDsUiState.Instance.SaveConfig();
        StormDsUiState.Instance.NotifyDisplayConfigChanged();
        Focus();
    }

    private void CycleScaleMode()
    {
        var cfg = StormDsUiState.Instance.AppConfig;
        cfg.ScreenScaleMode = cfg.ScreenScaleMode switch
        {
            ScreenScaleMode.AspectFit => ScreenScaleMode.IntegerPixelPerfect,
            ScreenScaleMode.IntegerPixelPerfect => ScreenScaleMode.StretchFill,
            _ => ScreenScaleMode.AspectFit
        };
        StormDsUiState.Instance.SaveConfig();
        StormDsUiState.Instance.NotifyDisplayConfigChanged();
        Focus();
    }

    private void CycleFilterMode()
    {
        var cfg = StormDsUiState.Instance.AppConfig;
        cfg.ScreenFilter = cfg.ScreenFilter switch
        {
            ScreenFilter.Nearest => ScreenFilter.Linear,
            ScreenFilter.Linear => ScreenFilter.Bicubic,
            _ => ScreenFilter.Nearest
        };
        StormDsUiState.Instance.SaveConfig();
        StormDsUiState.Instance.NotifyDisplayConfigChanged();
        Focus();
    }

    private void ToggleFastForward()
    {
        StormDsUiState.Instance.IsFastForward = !StormDsUiState.Instance.IsFastForward;
        _frameTimer.Interval = TimeSpan.FromMilliseconds(StormDsUiState.Instance.IsFastForward ? 4 : 16);
        Focus();
    }

    private void TogglePauseMenu()
    {
        _pauseOverlay.IsVisible = !_pauseOverlay.IsVisible;
        StormDsUiState.Instance.TogglePause();
        if (!_pauseOverlay.IsVisible)
        {
            Focus();
        }
    }

    private void RefreshDisplayConfig()
    {
        var cfg = StormDsUiState.Instance.AppConfig;

        _touchControls.IsVisible = OperatingSystem.IsAndroid() || cfg.ShowTouchOverlayOnDesktop;

        var interp = cfg.ScreenFilter switch
        {
            ScreenFilter.Nearest => BitmapInterpolationMode.None,
            ScreenFilter.Linear => BitmapInterpolationMode.MediumQuality,
            _ => BitmapInterpolationMode.HighQuality
        };
        RenderOptions.SetBitmapInterpolationMode(_topScreenImage, interp);
        RenderOptions.SetBitmapInterpolationMode(_bottomScreenImage, interp);

        var stretch = cfg.ScreenScaleMode == ScreenScaleMode.StretchFill ? Stretch.Fill : Stretch.Uniform;
        _topScreenImage.Stretch = stretch;
        _bottomScreenImage.Stretch = stretch;

        _layoutPillText.Text = cfg.ScreenLayoutMode switch
        {
            ScreenLayoutMode.VerticalClassic => "Макет: Верт.",
            ScreenLayoutMode.HorizontalSideBySide => "Макет: Гориз.",
            ScreenLayoutMode.HybridLargeFocus => "Макет: Гибрид",
            ScreenLayoutMode.TopScreenOnly => "Макет: Верх",
            ScreenLayoutMode.BottomScreenOnly => "Макет: Низ",
            ScreenLayoutMode.DualWindowDetached => "Макет: 2 окна",
            _ => "Макет"
        };

        _scalePillText.Text = cfg.ScreenScaleMode switch
        {
            ScreenScaleMode.IntegerPixelPerfect => "Масштаб: Пиксель",
            ScreenScaleMode.StretchFill => "Масштаб: На весь экран",
            _ => "Масштаб: 4:3 Авто"
        };

        _filterPillText.Text = cfg.ScreenFilter switch
        {
            ScreenFilter.Nearest => "Фильтр: Пиксель",
            ScreenFilter.Linear => "Фильтр: Linear",
            _ => "Фильтр: Bicubic"
        };

        RecalculateScreenLayout();
    }

    private static Size FitScreenBox(double boxW, double boxH, ScreenScaleMode scaleMode)
    {
        double w = Math.Max(32, boxW);
        double h = Math.Max(32, boxH);
        if (scaleMode == ScreenScaleMode.StretchFill)
        {
            return new Size(Math.Round(w), Math.Round(h));
        }

        if (scaleMode == ScreenScaleMode.IntegerPixelPerfect)
        {
            int k = (int)Math.Floor(Math.Min(w / 256.0, h / 192.0));
            if (k >= 1)
            {
                return new Size(256.0 * k, 192.0 * k);
            }
        }

        double s = Math.Min(w / 256.0, h / 192.0);
        return new Size(Math.Round(256.0 * s), Math.Round(192.0 * s));
    }

    private void RecalculateScreenLayout()
    {
        double vw = _viewportCanvas.Bounds.Width;
        double vh = _viewportCanvas.Bounds.Height;
        if (vw <= 10 || vh <= 10) return;

        var cfg = StormDsUiState.Instance.AppConfig;
        double pad = 8;
        double availW = Math.Max(64, vw - pad * 2);
        double availH = Math.Max(64, vh - pad * 2);
        double gap = Math.Clamp(cfg.ScreenGap, 0, 64);
        var scaleMode = cfg.ScreenScaleMode;

        var effectiveLayout = (_detachedWindow != null || cfg.ScreenLayoutMode == ScreenLayoutMode.DualWindowDetached)
            ? ScreenLayoutMode.TopScreenOnly
            : cfg.ScreenLayoutMode;

        switch (effectiveLayout)
        {
            case ScreenLayoutMode.TopScreenOnly:
            {
                _topScreenContainer.IsVisible = true;
                _bottomScreenContainer.IsVisible = false;
                var sz = FitScreenBox(availW, availH, scaleMode);
                PlaceScreen(_topScreenContainer, Math.Round((vw - sz.Width) / 2.0), Math.Round((vh - sz.Height) / 2.0), sz);
                break;
            }
            case ScreenLayoutMode.BottomScreenOnly:
            {
                _topScreenContainer.IsVisible = false;
                _bottomScreenContainer.IsVisible = true;
                var sz = FitScreenBox(availW, availH, scaleMode);
                PlaceScreen(_bottomScreenContainer, Math.Round((vw - sz.Width) / 2.0), Math.Round((vh - sz.Height) / 2.0), sz);
                break;
            }
            case ScreenLayoutMode.HorizontalSideBySide:
            {
                _topScreenContainer.IsVisible = true;
                _bottomScreenContainer.IsVisible = true;
                double eachMaxW = Math.Max(64, (availW - gap) / 2.0);
                var sz = FitScreenBox(eachMaxW, availH, scaleMode);
                double totalW = sz.Width * 2 + gap;
                double startX = Math.Round((vw - totalW) / 2.0);
                double y = Math.Round((vh - sz.Height) / 2.0);
                PlaceScreen(_topScreenContainer, startX, y, sz);
                PlaceScreen(_bottomScreenContainer, startX + sz.Width + gap, y, sz);
                break;
            }
            case ScreenLayoutMode.HybridLargeFocus:
            {
                _topScreenContainer.IsVisible = true;
                _bottomScreenContainer.IsVisible = true;
                double ratio = Math.Clamp(cfg.HybridPrimaryRatio, 0.55, 0.80);
                double leftBoxW = Math.Max(64, (availW - gap) * ratio);
                double rightBoxW = Math.Max(48, (availW - gap) - leftBoxW);
                var bigSz = FitScreenBox(leftBoxW, availH, scaleMode);
                var smallSz = scaleMode == ScreenScaleMode.StretchFill
                    ? new Size(Math.Round(rightBoxW), Math.Round(availH * 0.55))
                    : FitScreenBox(rightBoxW, availH, scaleMode);
                double totalW = bigSz.Width + gap + smallSz.Width;
                double startX = Math.Round((vw - totalW) / 2.0);
                double bigY = Math.Round((vh - bigSz.Height) / 2.0);
                double smallY = Math.Round((vh - smallSz.Height) / 2.0);
                PlaceScreen(_topScreenContainer, startX, bigY, bigSz);
                PlaceScreen(_bottomScreenContainer, startX + bigSz.Width + gap, smallY, smallSz);
                break;
            }
            case ScreenLayoutMode.VerticalClassic:
            default:
            {
                _topScreenContainer.IsVisible = true;
                _bottomScreenContainer.IsVisible = true;
                double eachMaxH = Math.Max(48, (availH - gap) / 2.0);
                var sz = FitScreenBox(availW, eachMaxH, scaleMode);
                double x = Math.Round((vw - sz.Width) / 2.0);
                double totalH = sz.Height * 2 + gap;
                double startY = Math.Round((vh - totalH) / 2.0);
                PlaceScreen(_topScreenContainer, x, startY, sz);
                PlaceScreen(_bottomScreenContainer, x, startY + sz.Height + gap, sz);
                break;
            }
        }
    }

    private static void PlaceScreen(Border container, double left, double top, Size size)
    {
        container.Width = size.Width;
        container.Height = size.Height;
        Canvas.SetLeft(container, left);
        Canvas.SetTop(container, top);
    }

    private void OnEmulationFrameTick(object? sender, EventArgs e)
    {
        if (!StormDsUiState.Instance.IsEmulationActive || StormDsUiState.Instance.IsPaused)
        {
            return;
        }

        _frameCounter++;
        var stats = StormDsUiState.Instance.EngineService.RunFrame();
        StormDsUiState.Instance.LastFrameStats = stats;

        if (_frameCounter % 15 == 0)
        {
            string resTag = $"{(int)_topScreenContainer.Width}x{(int)_topScreenContainer.Height}";
            _statsBadgeText.Text = stats.Fps > 0.1
                ? $"{stats.Fps:0.0} FPS | {resTag}"
                : $"60.0 FPS | {resTag}";
        }

        var eng = StormDsUiState.Instance.EngineService;
        var topBgra = eng.HasLiveNativeFrame ? eng.TopFrameBgra : BitmapHelper.GenerateTestScreenBgra(256, 192, false, "STORM DS TOP", _frameCounter);
        var botBgra = eng.HasLiveNativeFrame ? eng.BottomFrameBgra : BitmapHelper.GenerateTestScreenBgra(256, 192, true, "STORM DS TOUCH", _frameCounter);

        var topBmp = BitmapHelper.CreateBgraBitmap(topBgra, 256, 192);
        var botBmp = BitmapHelper.CreateBgraBitmap(botBgra, 256, 192);

        if (!_screensSwapped)
        {
            _topScreenImage.Source = topBmp;
            if (_detachedWindow != null)
            {
                _detachedWindow.ScreenImage.Source = botBmp;
            }
            else
            {
                _bottomScreenImage.Source = botBmp;
            }
        }
        else
        {
            _topScreenImage.Source = botBmp;
            if (_detachedWindow != null)
            {
                _detachedWindow.ScreenImage.Source = topBmp;
            }
            else
            {
                _bottomScreenImage.Source = topBmp;
            }
        }
    }

    private void SwapScreens()
    {
        _screensSwapped = !_screensSwapped;
        AuroraTactileFeedbackService.Instance.PlayTabWhoosh();
    }

    private void ToggleDetachScreen()
    {
        if (_detachedWindow == null)
        {
            _detachedWindow = new DetachedTouchScreenWindow(onReattach: () =>
            {
                _detachedWindow = null;
                StormDsUiState.Instance.IsDetachedScreenActive = false;
                if (StormDsUiState.Instance.AppConfig.ScreenLayoutMode == ScreenLayoutMode.DualWindowDetached)
                {
                    StormDsUiState.Instance.AppConfig.ScreenLayoutMode = ScreenLayoutMode.VerticalClassic;
                }
                RefreshDisplayConfig();
            });
            _detachedWindow.Show();
            StormDsUiState.Instance.IsDetachedScreenActive = true;
            RefreshDisplayConfig();
        }
        else
        {
            _detachedWindow.Close();
            _detachedWindow = null;
            StormDsUiState.Instance.IsDetachedScreenActive = false;
            RefreshDisplayConfig();
        }
    }

    private void ResumeFromPause()
    {
        _pauseOverlay.IsVisible = false;
        StormDsUiState.Instance.TogglePause();
        Focus();
    }

    private void HandleTouchRelease()
    {
        _isTouchDown = false;
        StormDsUiState.Instance.EngineService.SetInput(_keyboardButtonsMask | _touchControls.CurrentButtonsMask, 0, 0, false);
    }

    private void SendTouch(Point p, Image targetImage)
    {
        var b = targetImage.Bounds;
        if (b.Width <= 0 || b.Height <= 0) return;

        ushort tx = (ushort)(Math.Clamp(p.X / b.Width, 0.0, 1.0) * 255.0);
        ushort ty = (ushort)(Math.Clamp(p.Y / b.Height, 0.0, 1.0) * 191.0);

        StormDsUiState.Instance.EngineService.SetInput(_keyboardButtonsMask | _touchControls.CurrentButtonsMask, tx, ty, true);
    }

    private void UpdateCombinedInput(uint touchMask)
    {
        StormDsUiState.Instance.EngineService.SetInput(_keyboardButtonsMask | touchMask, 0, 0, _isTouchDown);
    }

    private void HandleKeyDown(object? sender, KeyEventArgs e)
    {
        if (e.Key == Key.Escape)
        {
            _pauseOverlay.IsVisible = !_pauseOverlay.IsVisible;
            StormDsUiState.Instance.TogglePause();
            e.Handled = true;
            return;
        }

        if (e.Key == Key.Tab)
        {
            SwapScreens();
            e.Handled = true;
            return;
        }

        if (e.Key == Key.F5)
        {
            StormDsUiState.Instance.EngineService.SaveState(0);
            AuroraTactileFeedbackService.Instance.PlayAchievementChime();
            e.Handled = true;
            return;
        }

        if (e.Key is Key.F7 or Key.F8)
        {
            StormDsUiState.Instance.EngineService.LoadState(0);
            AuroraTactileFeedbackService.Instance.PlayClick();
            e.Handled = true;
            return;
        }

        if (e.Key == Key.Back)
        {
            StormDsUiState.Instance.EngineService.PopRewind();
            e.Handled = true;
            return;
        }

        if (e.Key == Key.Space)
        {
            ToggleFastForward();
            e.Handled = true;
            return;
        }

        uint bit = MapKeyToBit(e.Key);
        if (bit != 0)
        {
            _keyboardButtonsMask |= bit;
            UpdateCombinedInput(_touchControls.CurrentButtonsMask);
            e.Handled = true;
        }
    }

    private void HandleKeyUp(object? sender, KeyEventArgs e)
    {
        uint bit = MapKeyToBit(e.Key);
        if (bit != 0)
        {
            _keyboardButtonsMask &= ~bit;
            UpdateCombinedInput(_touchControls.CurrentButtonsMask);
            e.Handled = true;
        }
    }

    private static uint MapKeyToBit(Key key)
    {
        return key switch
        {
            Key.X => 1 << 0,          // A
            Key.Z => 1 << 1,          // B
            Key.LeftShift => 1 << 2,  // Select
            Key.Enter => 1 << 3,      // Start
            Key.Right or Key.D => 1 << 4, // Right
            Key.Left or Key.A => 1 << 5,  // Left
            Key.Up or Key.W => 1 << 6,    // Up
            Key.Down or Key.S => 1 << 7,  // Down
            Key.E or Key.R => 1 << 8,     // R
            Key.Q => 1 << 9,          // L
            Key.C or Key.K => 1 << 10,// X
            Key.V or Key.J => 1 << 11,// Y
            _ => 0
        };
    }
}
