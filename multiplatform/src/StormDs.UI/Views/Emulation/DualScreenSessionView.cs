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
using Avalonia.Media.Imaging;
using Avalonia.Platform;
using Avalonia.Threading;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Services;
using StormDs.Core.Configuration;
using StormDs.Core.Input;
using StormDs.Core.Paths;
using StormDs.UI.Common;
using StormDs.UI.Windows;

namespace StormDs.UI.Views.Emulation;

/// <summary>
/// Live dual-screen emulation session view driving StormDsEngineService with zero-allocation bitmaps,
/// XInput gamepad + keyboard + touch merging, dynamic screen scaling, rewind, screenshots, and detachable 2nd window.
/// </summary>
public class DualScreenSessionView : Grid
{
    private readonly Border _quickBar;
    private readonly TextBlock _layoutPillText;
    private readonly TextBlock _scalePillText;
    private readonly TextBlock _filterPillText;
    private readonly TextBlock _statsBadgeText;
    private readonly TextBlock _slotPillText;

    private readonly Canvas _viewportCanvas;
    private readonly Border _topScreenContainer;
    private readonly Border _bottomScreenContainer;
    private readonly Image _topScreenImage;
    private readonly Image _bottomScreenImage;

    private readonly WriteableBitmap _topBitmap;
    private readonly WriteableBitmap _bottomBitmap;

    private readonly TouchControlsOverlay _touchControls;
    private readonly EmulationPauseOverlay _pauseOverlay;
    private readonly DispatcherTimer _frameTimer;
    private readonly XInputGamepadService _gamepad = new();

    private DetachedTouchScreenWindow? _detachedWindow;
    private bool _screensSwapped;
    private bool _isTouchDown;
    private ushort _lastTouchX;
    private ushort _lastTouchY;
    private uint _keyboardButtonsMask;
    private uint _gamepadButtonsMask;
    private int _activeSaveSlot;
    private long _frameCounter;

    public DualScreenSessionView()
    {
        Background = Brushes.Black;
        Focusable = true;
        RowDefinitions = new RowDefinitions("Auto,*");

        _topBitmap = new WriteableBitmap(new PixelSize(256, 192), new Vector(96, 96), PixelFormat.Bgra8888, AlphaFormat.Premul);
        _bottomBitmap = new WriteableBitmap(new PixelSize(256, 192), new Vector(96, 96), PixelFormat.Bgra8888, AlphaFormat.Premul);

        _quickBar = new Border
        {
            Height = 38,
            Background = new SolidColorBrush(Color.FromArgb(225, 13, 17, 29)),
            BorderBrush = new SolidColorBrush(Color.FromArgb(50, 255, 255, 255)),
            BorderThickness = new Thickness(0, 0, 0, 1),
            Padding = new Thickness(10, 4)
        };

        var barGrid = new Grid { ColumnDefinitions = new ColumnDefinitions("Auto,*,Auto") };

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
        var savePair = CreateBarPill(AuroraIconKind.SaveSlotRibbon, "Сохр. 1 (F5)", Color.Parse("#10B981"), () => PerformQuickSave(_activeSaveSlot));
        _slotPillText = savePair.Label;
        var loadBtn = CreateBarPill(AuroraIconKind.LoadSlotArrow, "Загр. (F8)", Color.Parse("#38BDF8"), () => PerformQuickLoad(_activeSaveSlot)).Btn;
        var shotBtn = CreateBarPill(AuroraIconKind.ScreenshotCamera, "Скрин (F12)", Color.Parse("#EC4899"), TakeScreenshot).Btn;
        var pauseBtn = CreateBarPill(AuroraIconKind.PauseTwin, "Пауза (Esc)", Color.Parse("#F59E0B"), TogglePauseMenu).Btn;
        var stopBtn = CreateBarPill(AuroraIconKind.StopOctagon, "Стоп", Color.Parse("#EF4444"), () => StormDsUiState.Instance.StopEmulation()).Btn;

        rightControls.Children.Add(ffBtn);
        rightControls.Children.Add(fsBtn);
        rightControls.Children.Add(savePair.Btn);
        rightControls.Children.Add(loadBtn);
        rightControls.Children.Add(shotBtn);
        rightControls.Children.Add(pauseBtn);
        rightControls.Children.Add(stopBtn);

        barGrid.Children.Add(rightControls);
        Grid.SetColumn(rightControls, 2);

        _quickBar.Child = barGrid;
        Children.Add(_quickBar);
        Grid.SetRow(_quickBar, 0);

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
        _topScreenImage = new Image { Stretch = Stretch.Uniform, Source = _topBitmap };
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
        _bottomScreenImage = new Image { Stretch = Stretch.Uniform, Source = _bottomBitmap };
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
            if (ch.Property == BoundsProperty) RecalculateScreenLayout();
        };
        viewportHost.Children.Add(_viewportCanvas);

        _touchControls = new TouchControlsOverlay
        {
            IsVisible = OperatingSystem.IsAndroid() || StormDsUiState.Instance.AppConfig.ShowTouchOverlayOnDesktop
        };
        _touchControls.InputChanged += _ => PushCombinedInput();
        viewportHost.Children.Add(_touchControls);

        Children.Add(viewportHost);
        Grid.SetRow(viewportHost, 1);

        _pauseOverlay = new EmulationPauseOverlay { IsVisible = false };
        _pauseOverlay.ResumeRequested += ResumeFromPause;
        _pauseOverlay.SwapScreensRequested += SwapScreens;
        _pauseOverlay.DetachScreenRequested += ToggleDetachScreen;
        _pauseOverlay.StopEmulationRequested += () => StormDsUiState.Instance.StopEmulation();
        _pauseOverlay.SaveSlotRequested += PerformQuickSave;
        _pauseOverlay.LoadSlotRequested += PerformQuickLoad;
        _pauseOverlay.RewindRequested += PerformRewind;
        _pauseOverlay.ToggleLidRequested += PerformToggleLid;
        _pauseOverlay.MicBlowRequested += PerformMicBlow;
        _pauseOverlay.TranslateFrameRequested += () => _ = PerformAiTranslateFrameAsync();
        _pauseOverlay.CheatsRequested += () =>
        {
            var rom = StormDsUiState.Instance.SelectedRom;
            if (rom != null)
            {
                StormDsUiState.Instance.RequestRomModal(rom, 1);
            }
            else
            {
                StormDsUiState.Instance.NotifyStatus("Для редактирования читов выберите картридж в библиотеке");
            }
        };
        Children.Add(_pauseOverlay);
        Grid.SetRow(_pauseOverlay, 0);
        Grid.SetRowSpan(_pauseOverlay, 2);

        _frameTimer = new DispatcherTimer { Interval = TimeSpan.FromMilliseconds(16) };
        _frameTimer.Tick += OnEmulationFrameTick;

        StormDsUiState.Instance.DisplayConfigChanged += RefreshDisplayConfig;
        StormDsUiState.Instance.FullscreenChanged += isFs => _quickBar.IsVisible = !isFs;
        StormDsUiState.Instance.EmulationStarted += UpdateTimerState;
        StormDsUiState.Instance.EmulationStopped += () =>
        {
            UpdateTimerState();
            _keyboardButtonsMask = 0;
            _isTouchDown = false;
            if (_detachedWindow != null)
            {
                _detachedWindow.Close();
                _detachedWindow = null;
            }
            _pauseOverlay.IsVisible = false;
        };
        StormDsUiState.Instance.HiddenToTrayChanged += _ => UpdateTimerState();
        StormDsUiState.Instance.StateChanged += UpdateTimerState;

        KeyDown += HandleKeyDown;
        KeyUp += HandleKeyUp;
        LostFocus += (_, _) =>
        {
            _keyboardButtonsMask = 0;
            _isTouchDown = false;
            PushCombinedInput();
        };

        RefreshDisplayConfig();
        UpdateTimerState();
    }

    private void UpdateTimerState()
    {
        bool shouldRun = StormDsUiState.Instance.IsEmulationActive &&
                         !StormDsUiState.Instance.IsPaused &&
                         !StormDsUiState.Instance.IsHiddenToTray;
        if (shouldRun && !_frameTimer.IsEnabled)
        {
            _frameTimer.Start();
        }
        else if (!shouldRun && _frameTimer.IsEnabled)
        {
            _frameTimer.Stop();
        }
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
        _touchControls.ApplyConfig(cfg);

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
        if (!StormDsUiState.Instance.IsEmulationActive ||
            StormDsUiState.Instance.IsPaused ||
            StormDsUiState.Instance.IsHiddenToTray)
        {
            return;
        }

        _gamepadButtonsMask = _gamepad.PollNdsButtonMask();
        PushCombinedInput();

        var eng = StormDsUiState.Instance.EngineService;
        int steps = StormDsUiState.Instance.IsFastForward ? 3 : 1;
        StormDsCoreStatsLoop(eng, steps);
        RefreshRenderedBitmaps();
    }

    private void StormDsCoreStatsLoop(Core.Engine.StormDsEngineService eng, int steps)
    {
        Core.Native.StormDsFrameStats stats = default;
        for (int i = 0; i < steps; i++)
        {
            _frameCounter++;
            bool playAudio = (i == steps - 1);
            stats = eng.RunFrame(playAudio);
            if (_frameCounter % 30 == 0 &&
                StormDsUiState.Instance.RetroAchievementsService.IsFeatureAllowedInCurrentMode("rewind"))
            {
                eng.PushRewind();
            }
        }
        StormDsUiState.Instance.LastFrameStats = stats;

        if (_frameCounter % 15 == 0)
        {
            string resTag = $"{(int)_topScreenContainer.Width}x{(int)_topScreenContainer.Height}";
            string backendTag = stats.ActiveBackend == 1 ? "VK" : "SW";
            _statsBadgeText.Text = stats.Fps > 0.1
                ? $"{stats.Fps:0.0} FPS | {backendTag} | {resTag}"
                : $"60.0 FPS | {backendTag} | {resTag}";
        }
    }

    private void RefreshRenderedBitmaps()
    {
        var eng = StormDsUiState.Instance.EngineService;
        var topBgra = eng.HasLiveNativeFrame ? eng.TopFrameBgra : BitmapHelper.GenerateTestScreenBgra(256, 192, false, "STORM DS TOP", _frameCounter);
        var botBgra = eng.HasLiveNativeFrame ? eng.BottomFrameBgra : BitmapHelper.GenerateTestScreenBgra(256, 192, true, "STORM DS TOUCH", _frameCounter);

        if (!_screensSwapped)
        {
            BitmapHelper.UpdateBgraBitmap(_topBitmap, topBgra, 256, 192);
            BitmapHelper.UpdateBgraBitmap(_bottomBitmap, botBgra, 256, 192);
        }
        else
        {
            BitmapHelper.UpdateBgraBitmap(_topBitmap, botBgra, 256, 192);
            BitmapHelper.UpdateBgraBitmap(_bottomBitmap, topBgra, 256, 192);
        }

        _topScreenImage.Source = _topBitmap;
        _topScreenImage.InvalidateVisual();

        if (_detachedWindow != null)
        {
            _detachedWindow.ScreenImage.Source = _bottomBitmap;
            _detachedWindow.ScreenImage.InvalidateVisual();
        }
        else
        {
            _bottomScreenImage.Source = _bottomBitmap;
            _bottomScreenImage.InvalidateVisual();
        }
    }

    private void SwapScreens()
    {
        _screensSwapped = !_screensSwapped;
        AuroraTactileFeedbackService.Instance.PlayTabWhoosh();
        RefreshRenderedBitmaps();
    }

    private void ToggleDetachScreen()
    {
        if (_detachedWindow == null)
        {
            _detachedWindow = new DetachedTouchScreenWindow(
                onReattach: () =>
                {
                    _detachedWindow = null;
                    StormDsUiState.Instance.IsDetachedScreenActive = false;
                    if (StormDsUiState.Instance.AppConfig.ScreenLayoutMode == ScreenLayoutMode.DualWindowDetached)
                    {
                        StormDsUiState.Instance.AppConfig.ScreenLayoutMode = ScreenLayoutMode.VerticalClassic;
                    }
                    RefreshDisplayConfig();
                },
                onTouchInput: (tx, ty, down) =>
                {
                    _isTouchDown = down;
                    _lastTouchX = tx;
                    _lastTouchY = ty;
                    PushCombinedInput();
                },
                canAcceptTouch: () => !_screensSwapped);
            _detachedWindow.Show();
            StormDsUiState.Instance.IsDetachedScreenActive = true;
            RefreshDisplayConfig();
        }
        else
        {
            _detachedWindow.Close();
        }
    }

    private void ResumeFromPause()
    {
        _pauseOverlay.IsVisible = false;
        StormDsUiState.Instance.TogglePause();
        Focus();
    }

    private void PerformQuickSave(int slot)
    {
        bool ok = StormDsUiState.Instance.EngineService.SaveState(slot);
        AuroraTactileFeedbackService.Instance.PlayAchievementChime();
        StormDsUiState.Instance.NotifyStatus(ok ? $"Состояние сохранено в слот {slot + 1}" : $"Ошибка сохранения слота {slot + 1}");
    }

    private void PerformQuickLoad(int slot)
    {
        if (!StormDsUiState.Instance.RetroAchievementsService.IsFeatureAllowedInCurrentMode("loadstate"))
        {
            StormDsUiState.Instance.NotifyStatus("Загрузка состояний отключена в Hardcore-режиме");
            return;
        }
        bool ok = StormDsUiState.Instance.EngineService.LoadState(slot);
        AuroraTactileFeedbackService.Instance.PlayClick();
        if (ok)
        {
            RefreshRenderedBitmaps();
            StormDsUiState.Instance.NotifyStatus($"Состояние загружено из слота {slot + 1}");
        }
        else
        {
            StormDsUiState.Instance.NotifyStatus($"Слот {slot + 1} пуст");
        }
    }

    private void PerformRewind()
    {
        if (!StormDsUiState.Instance.RetroAchievementsService.IsFeatureAllowedInCurrentMode("rewind"))
        {
            StormDsUiState.Instance.NotifyStatus("Перемотка отключена в Hardcore-режиме");
            return;
        }
        if (StormDsUiState.Instance.EngineService.PopRewind())
        {
            RefreshRenderedBitmaps();
            StormDsUiState.Instance.NotifyStatus("Выполнена перемотка назад");
        }
    }

    private void PerformToggleLid()
    {
        bool closed = StormDsUiState.Instance.EngineService.ToggleLid(GetMergedButtonsMask(), _lastTouchX, _lastTouchY, _isTouchDown);
        AuroraTactileFeedbackService.Instance.PlayClick();
        StormDsUiState.Instance.NotifyStatus(closed ? "Крышка консоли закрыта" : "Крышка консоли открыта");
    }

    private void PerformMicBlow()
    {
        StormDsUiState.Instance.EngineService.TriggerMicBlowBurst();
        AuroraTactileFeedbackService.Instance.PlayClick();
        StormDsUiState.Instance.NotifyStatus("Импульс микрофона отправлен");
    }

    private void TakeScreenshot()
    {
        try
        {
            var eng = StormDsUiState.Instance.EngineService;
            byte[] combined = eng.CaptureCombinedScreenshotBgra(out int w, out int h);
            var wb = BitmapHelper.CreateBgraBitmap(combined, w, h);
            if (wb == null) return;

            Directory.CreateDirectory(StormDsPlatformPaths.ScreenshotsDirectory);
            string code = eng.ActiveRom?.GameCode is { Length: > 0 } gc ? gc : "FREEBIOS";
            string file = Path.Combine(StormDsPlatformPaths.ScreenshotsDirectory, $"{code}_{DateTime.Now:yyyyMMdd_HHmmss}.png");
#pragma warning disable CS0618
            using (var fs = File.Create(file))
            {
                wb.Save(fs);
            }
#pragma warning restore CS0618
            AuroraTactileFeedbackService.Instance.PlayAchievementChime();
            StormDsUiState.Instance.NotifyStatus($"Скриншот сохранен: {Path.GetFileName(file)}");
        }
        catch (Exception ex)
        {
            StormDsUiState.Instance.NotifyStatus($"Ошибка скриншота: {ex.Message}");
        }
    }

    private async Task PerformAiTranslateFrameAsync()
    {
        var eng = StormDsUiState.Instance.EngineService;
        byte[]? pixels = StormDsUiState.Instance.AiTranslatorService.CaptureScreenPixels(eng.NativeHandle, out int w, out int h, _screensSwapped ? 1 : 0);
        if (pixels == null)
        {
            StormDsUiState.Instance.NotifyStatus("Нет активного видеокадра для ИИ-перевода");
            return;
        }

        StormDsUiState.Instance.NotifyStatus($"Кадр {w}x{h} захвачен для перевода...");
        string translated = await StormDsUiState.Instance.AiTranslatorService.TranslateTextAsync(
            "Press Start or select a game option.",
            StormDsUiState.Instance.AppConfig);
        await Dispatcher.UIThread.InvokeAsync(() =>
        {
            StormDsUiState.Instance.NotifyStatus($"ИИ-перевод: {translated}");
        });
    }

    private void HandleTouchRelease()
    {
        _isTouchDown = false;
        _lastTouchX = 0;
        _lastTouchY = 0;
        PushCombinedInput();
    }

    private void SendTouch(Point p, Image targetImage)
    {
        var b = targetImage.Bounds;
        if (b.Width <= 0 || b.Height <= 0) return;

        _lastTouchX = (ushort)(Math.Clamp(p.X / b.Width, 0.0, 1.0) * 255.0);
        _lastTouchY = (ushort)(Math.Clamp(p.Y / b.Height, 0.0, 1.0) * 191.0);
        PushCombinedInput();
    }

    private uint GetMergedButtonsMask() => _keyboardButtonsMask | _touchControls.CurrentButtonsMask | _gamepadButtonsMask;

    private void PushCombinedInput()
    {
        StormDsUiState.Instance.EngineService.SetInput(GetMergedButtonsMask(), _lastTouchX, _lastTouchY, _isTouchDown);
    }

    private static bool MatchesHotkey(Key pressed, string actionName)
    {
        if (StormDsUiState.Instance.AppConfig.Hotkeys.TryGetValue(actionName, out var configured) &&
            Enum.TryParse<Key>(configured, true, out var mappedKey))
        {
            return pressed == mappedKey;
        }
        return false;
    }

    private void HandleKeyDown(object? sender, KeyEventArgs e)
    {
        if (e.Key == Key.Escape)
        {
            TogglePauseMenu();
            e.Handled = true;
            return;
        }

        if (MatchesHotkey(e.Key, "SwapScreens") || e.Key == Key.Tab)
        {
            SwapScreens();
            e.Handled = true;
            return;
        }

        if (MatchesHotkey(e.Key, "QuickSave") || e.Key == Key.F5)
        {
            PerformQuickSave(_activeSaveSlot);
            e.Handled = true;
            return;
        }

        if (MatchesHotkey(e.Key, "SlotPrevious") || e.Key == Key.F6)
        {
            _activeSaveSlot = (_activeSaveSlot + 9) % 10;
            _slotPillText.Text = $"Сохр. {_activeSaveSlot + 1} (F5)";
            StormDsUiState.Instance.NotifyStatus($"Выбран слот сохранения {_activeSaveSlot + 1}");
            e.Handled = true;
            return;
        }

        if (MatchesHotkey(e.Key, "SlotNext") || e.Key == Key.F7)
        {
            _activeSaveSlot = (_activeSaveSlot + 1) % 10;
            _slotPillText.Text = $"Сохр. {_activeSaveSlot + 1} (F5)";
            StormDsUiState.Instance.NotifyStatus($"Выбран слот сохранения {_activeSaveSlot + 1}");
            e.Handled = true;
            return;
        }

        if (MatchesHotkey(e.Key, "QuickLoad") || e.Key == Key.F8)
        {
            PerformQuickLoad(_activeSaveSlot);
            e.Handled = true;
            return;
        }

        if (MatchesHotkey(e.Key, "Reset") || e.Key == Key.F9)
        {
            StormDsUiState.Instance.EngineService.Reset();
            StormDsUiState.Instance.NotifyStatus("Консоль перезагружена");
            e.Handled = true;
            return;
        }

        if (MatchesHotkey(e.Key, "TakeScreenshot") || e.Key == Key.F12)
        {
            TakeScreenshot();
            e.Handled = true;
            return;
        }

        if (MatchesHotkey(e.Key, "Rewind") || e.Key == Key.Back)
        {
            PerformRewind();
            e.Handled = true;
            return;
        }

        if (MatchesHotkey(e.Key, "FastForward") || e.Key == Key.Space)
        {
            ToggleFastForward();
            e.Handled = true;
            return;
        }

        if (MatchesHotkey(e.Key, "ToggleLid"))
        {
            PerformToggleLid();
            e.Handled = true;
            return;
        }

        if (MatchesHotkey(e.Key, "MicBlow"))
        {
            PerformMicBlow();
            e.Handled = true;
            return;
        }

        if (MatchesHotkey(e.Key, "AiTranslate"))
        {
            _ = PerformAiTranslateFrameAsync();
            e.Handled = true;
            return;
        }

        if (MatchesHotkey(e.Key, "DetachSecondScreen"))
        {
            ToggleDetachScreen();
            e.Handled = true;
            return;
        }

        if (MatchesHotkey(e.Key, "MuteVolume"))
        {
            var eng = StormDsUiState.Instance.EngineService;
            eng.IsMuted = !eng.IsMuted;
            StormDsUiState.Instance.NotifyStatus(eng.IsMuted ? "Звук выключен" : "Звук включен");
            e.Handled = true;
            return;
        }

        if (MatchesHotkey(e.Key, "VolumeUp"))
        {
            var eng = StormDsUiState.Instance.EngineService;
            eng.AudioVolume += 0.1f;
            StormDsUiState.Instance.NotifyStatus($"Громкость: {(int)(eng.AudioVolume * 100)}%");
            e.Handled = true;
            return;
        }

        if (MatchesHotkey(e.Key, "VolumeDown"))
        {
            var eng = StormDsUiState.Instance.EngineService;
            eng.AudioVolume -= 0.1f;
            StormDsUiState.Instance.NotifyStatus($"Громкость: {(int)(eng.AudioVolume * 100)}%");
            e.Handled = true;
            return;
        }

        uint bit = MapKeyToBit(e.Key);
        if (bit != 0)
        {
            _keyboardButtonsMask |= bit;
            PushCombinedInput();
            e.Handled = true;
        }
    }

    private void HandleKeyUp(object? sender, KeyEventArgs e)
    {
        uint bit = MapKeyToBit(e.Key);
        if (bit != 0)
        {
            _keyboardButtonsMask &= ~bit;
            PushCombinedInput();
            e.Handled = true;
        }
    }

    private static uint MapKeyToBit(Key key)
    {
        return key switch
        {
            Key.X => 1u << 0,          // A
            Key.Z => 1u << 1,          // B
            Key.LeftShift => 1u << 2,  // Select
            Key.Enter => 1u << 3,      // Start
            Key.Right => 1u << 4,      // Right
            Key.Left => 1u << 5,       // Left
            Key.Up => 1u << 6,         // Up
            Key.Down => 1u << 7,       // Down
            Key.E => 1u << 8,          // R
            Key.Q => 1u << 9,          // L
            Key.C or Key.K => 1u << 10,// X
            Key.V or Key.J => 1u << 11,// Y
            _ => 0u
        };
    }
}
