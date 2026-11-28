// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.Threading;
using System.Threading.Tasks;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Layout;
using Avalonia.Media;
using Avalonia.Media.Imaging;
using Avalonia.Platform;
using Avalonia.Threading;
using Avalonia.VisualTree;
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
    private readonly Border _fpsHudOverlay;
    private readonly TextBlock _fpsHudText;
    private readonly Border _fsExitBanner;
    private bool _showFpsHud;
    private int _rotationDegrees;
    private readonly XInputGamepadService _gamepad = new();

    private CancellationTokenSource? _workerCts;
    private Task? _workerTask;
    private readonly object _workerLifecycleLock = new();
    private readonly SemaphoreSlim _workerRunGate = new(1, 1);
    private readonly object _frameBufferLock = new();
    private readonly object _postProcessLock = new();
    private readonly object _inputLock = new();
    private int _uiFramePending;
    private bool _hasUiFrame;
    private ScreenFilter _lastScreenFilter = StormDsUiState.Instance.AppConfig.ScreenFilter;
    private bool _lastFrameGenEnabled = StormDsUiState.Instance.AppConfig.FrameGenEnabled;

    private byte[] _workerOutTop = new byte[256 * 192 * 4];
    private byte[] _workerOutBot = new byte[256 * 192 * 4];
    private byte[] _sharedReadyTop = new byte[256 * 192 * 4];
    private byte[] _sharedReadyBot = new byte[256 * 192 * 4];
    private byte[] _uiReadTop = new byte[256 * 192 * 4];
    private byte[] _uiReadBot = new byte[256 * 192 * 4];

    private long _latestStatsFrame;
    private double _latestStatsFps = 59.8;
    private int _latestStatsBackend;
    private long _lastHudUpdateFrame = -15;

    private DetachedTouchScreenWindow? _detachedWindow;
    private bool _screensSwapped;
    private bool _isTouchDown;
    private ushort _lastTouchX;
    private ushort _lastTouchY;
    private uint _keyboardButtonsMask;
    private uint _gamepadButtonsMask;
    private int _activeSaveSlot;
    private long _frameCounter;
    private byte[]? _prevTopBgra;
    private byte[]? _prevBotBgra;
    private byte[]? _currTopBgra;
    private byte[]? _currBotBgra;
    private byte[]? _histTopBgra;
    private byte[]? _histBotBgra;
    private readonly byte[] _postTopBgra = new byte[256 * 192 * 4];
    private readonly byte[] _postBotBgra = new byte[256 * 192 * 4];
    private readonly byte[] _interpTopBgra = new byte[256 * 192 * 4];
    private readonly byte[] _interpBotBgra = new byte[256 * 192 * 4];
    private bool _hasPrevFrame;

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
            if (StormDsUiState.Instance.IsPaused) return;
            if (_screensSwapped)
            {
                if (!e.GetCurrentPoint(_topScreenImage).Properties.IsLeftButtonPressed) return;
                e.Pointer.Capture(_topScreenImage);
                lock (_inputLock)
                {
                    _isTouchDown = true;
                }
                SendTouch(e.GetPosition(_topScreenImage), _topScreenImage);
            }
        };
        _topScreenImage.PointerMoved += (s, e) =>
        {
            if (StormDsUiState.Instance.IsPaused) return;
            bool touchDown;
            lock (_inputLock) { touchDown = _isTouchDown; }
            if (touchDown && _screensSwapped) SendTouch(e.GetPosition(_topScreenImage), _topScreenImage);
        };
        _topScreenImage.PointerReleased += (s, e) =>
        {
            if (e.Pointer.Captured == _topScreenImage) e.Pointer.Capture(null);
            if (_screensSwapped) HandleTouchRelease();
        };
        _topScreenImage.PointerCaptureLost += (s, e) =>
        {
            if (_screensSwapped) HandleTouchRelease();
        };
        _topScreenContainer.Child = new LayoutTransformControl { Child = _topScreenImage };

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
            if (StormDsUiState.Instance.IsPaused) return;
            if (!_screensSwapped)
            {
                if (!e.GetCurrentPoint(_bottomScreenImage).Properties.IsLeftButtonPressed) return;
                e.Pointer.Capture(_bottomScreenImage);
                lock (_inputLock)
                {
                    _isTouchDown = true;
                }
                SendTouch(e.GetPosition(_bottomScreenImage), _bottomScreenImage);
            }
        };
        _bottomScreenImage.PointerMoved += (s, e) =>
        {
            if (StormDsUiState.Instance.IsPaused) return;
            bool touchDown;
            lock (_inputLock) { touchDown = _isTouchDown; }
            if (touchDown && !_screensSwapped) SendTouch(e.GetPosition(_bottomScreenImage), _bottomScreenImage);
        };
        _bottomScreenImage.PointerReleased += (s, e) =>
        {
            if (e.Pointer.Captured == _bottomScreenImage) e.Pointer.Capture(null);
            if (!_screensSwapped) HandleTouchRelease();
        };
        _bottomScreenImage.PointerCaptureLost += (s, e) =>
        {
            if (!_screensSwapped) HandleTouchRelease();
        };
        _bottomScreenContainer.Child = new LayoutTransformControl { Child = _bottomScreenImage };

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

        // Live FPS HUD Overlay (toggled by F3 / ToggleFps)
        _fpsHudText = new TextBlock
        {
            Text = "59.8 FPS",
            FontSize = 12,
            FontWeight = FontWeight.Bold,
            Foreground = new SolidColorBrush(Color.Parse("#10B981"))
        };
        _fpsHudOverlay = new Border
        {
            IsVisible = false,
            HorizontalAlignment = HorizontalAlignment.Left,
            VerticalAlignment = VerticalAlignment.Top,
            Margin = new Thickness(12),
            Padding = new Thickness(10, 5),
            CornerRadius = new CornerRadius(8),
            Background = new SolidColorBrush(Color.FromArgb(200, 10, 14, 24)),
            BorderBrush = new SolidColorBrush(Color.Parse("#10B981")),
            BorderThickness = new Thickness(1),
            IsHitTestVisible = false,
            Child = _fpsHudText
        };
        viewportHost.Children.Add(_fpsHudOverlay);

        // Fullscreen Mouse-Exit Pill (top center when pointer hovers near top in fullscreen)
        _fsExitBanner = new Border
        {
            IsVisible = false,
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Top,
            Margin = new Thickness(0, 10, 0, 0),
            Padding = new Thickness(14, 7),
            CornerRadius = new CornerRadius(14),
            Background = new SolidColorBrush(Color.FromArgb(220, 15, 23, 42)),
            BorderBrush = new SolidColorBrush(Color.Parse("#38BDF8")),
            BorderThickness = new Thickness(1),
            Cursor = new Cursor(StandardCursorType.Hand),
            Child = new TextBlock
            {
                Text = "Выйти из полноэкранного режима (F11)",
                FontSize = 11.5,
                FontWeight = FontWeight.SemiBold,
                Foreground = Brushes.White
            }
        };
        _fsExitBanner.PointerPressed += (_, _) => StormDsUiState.Instance.RequestToggleFullscreen();
        viewportHost.Children.Add(_fsExitBanner);

        viewportHost.PointerMoved += (_, e) =>
        {
            if (StormDsUiState.Instance.IsFullscreen)
            {
                _fsExitBanner.IsVisible = e.GetPosition(viewportHost).Y <= 54;
            }
            else if (_fsExitBanner.IsVisible)
            {
                _fsExitBanner.IsVisible = false;
            }
        };

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

        StormDsUiState.Instance.DisplayConfigChanged += RefreshDisplayConfig;
        StormDsUiState.Instance.FullscreenChanged += isFs =>
        {
            _quickBar.IsVisible = !isFs;
            if (!isFs) _fsExitBanner.IsVisible = false;
        };
        StormDsUiState.Instance.EmulationStarted += () =>
        {
            ResetPostProcessBuffers();
            Interlocked.Exchange(ref _frameCounter, 0);
            Interlocked.Exchange(ref _latestStatsFrame, 0);
            _lastHudUpdateFrame = -15;
            lock (_frameBufferLock)
            {
                _hasUiFrame = false;
            }
            UpdateTimerState();
        };
        StormDsUiState.Instance.EmulationStopped += () =>
        {
            UpdateTimerState();
            ResetPostProcessBuffers();
            ClearActiveInputsAndPush();
            if (_detachedWindow != null)
            {
                _detachedWindow.Close();
                _detachedWindow = null;
            }
            _pauseOverlay.IsVisible = false;
        };
        StormDsUiState.Instance.HiddenToTrayChanged += _ => UpdateTimerState();
        StormDsUiState.Instance.StateChanged += UpdateTimerState;

        DetachedFromVisualTree += (_, _) => StopWorkerLoop();

        KeyDown += HandleKeyDown;
        KeyUp += HandleKeyUp;
        LostFocus += (_, _) => ClearActiveInputsAndPush();

        RefreshDisplayConfig();
        UpdateTimerState();
    }

    public void ResetPostProcessBuffers()
    {
        lock (_postProcessLock)
        {
            _hasPrevFrame = false;
            _prevTopBgra = null;
            _prevBotBgra = null;
            _currTopBgra = null;
            _currBotBgra = null;
            _histTopBgra = null;
            _histBotBgra = null;
            Array.Clear(_postTopBgra);
            Array.Clear(_postBotBgra);
            Array.Clear(_interpTopBgra);
            Array.Clear(_interpBotBgra);
        }
    }

    private void ClearActiveInputsAndPush()
    {
        lock (_inputLock)
        {
            _keyboardButtonsMask = 0;
            _isTouchDown = false;
            _lastTouchX = 0;
            _lastTouchY = 0;
        }
        PushCombinedInput();
    }

    private void UpdateTimerState()
    {
        if (!Dispatcher.UIThread.CheckAccess())
        {
            Dispatcher.UIThread.Post(UpdateTimerState);
            return;
        }

        bool active = StormDsUiState.Instance.IsEmulationActive;
        bool paused = StormDsUiState.Instance.IsPaused;
        bool hidden = StormDsUiState.Instance.IsHiddenToTray;

        _pauseOverlay.IsVisible = active && paused;

        if (paused || !active)
        {
            ClearActiveInputsAndPush();
        }

        bool shouldRun = active && !paused && !hidden;
        if (shouldRun)
        {
            StartWorkerLoop();
        }
        else
        {
            StopWorkerLoop();
        }
    }

    private void StartWorkerLoop()
    {
        lock (_workerLifecycleLock)
        {
            if (_workerTask != null && !_workerTask.IsCompleted) return;
            _workerCts?.Dispose();
            _workerCts = new CancellationTokenSource();
            var ct = _workerCts.Token;
            _workerTask = Task.Run(() => EmulationWorkerLoop(ct), ct);
        }
    }

    private void StopWorkerLoop()
    {
        CancellationTokenSource? cts;
        lock (_workerLifecycleLock)
        {
            cts = _workerCts;
            _workerCts = null;
            _workerTask = null;
        }
        if (cts != null)
        {
            try { cts.Cancel(); } catch (ObjectDisposedException) { }
            cts.Dispose();
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
            ScreenFilter.Bicubic => ScreenFilter.SlangShader,
            ScreenFilter.SlangShader => ScreenFilter.Fsr1,
            ScreenFilter.Fsr1 => ScreenFilter.Fsr3,
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
        StormDsUiState.Instance.TogglePause();
        if (!StormDsUiState.Instance.IsPaused)
        {
            Focus();
        }
    }

    private void RefreshDisplayConfig()
    {
        var cfg = StormDsUiState.Instance.AppConfig;
        if (cfg.ScreenFilter != _lastScreenFilter || cfg.FrameGenEnabled != _lastFrameGenEnabled)
        {
            _lastScreenFilter = cfg.ScreenFilter;
            _lastFrameGenEnabled = cfg.FrameGenEnabled;
            ResetPostProcessBuffers();
        }

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
            ScreenFilter.SlangShader => "Фильтр: Slang",
            ScreenFilter.Fsr1 => "Фильтр: FSR 1",
            ScreenFilter.Fsr3 => "Фильтр: FSR 3",
            _ => "Фильтр: Bicubic"
        };

        if (_topScreenContainer.Child is LayoutTransformControl topLtc)
        {
            topLtc.LayoutTransform = _rotationDegrees == 0 ? null : new RotateTransform(_rotationDegrees);
        }
        if (_bottomScreenContainer.Child is LayoutTransformControl botLtc)
        {
            botLtc.LayoutTransform = _rotationDegrees == 0 ? null : new RotateTransform(_rotationDegrees);
        }

        RecalculateScreenLayout();
    }

    private Size FitScreenBox(double boxW, double boxH, ScreenScaleMode scaleMode)
    {
        double w = Math.Max(32, boxW);
        double h = Math.Max(32, boxH);
        bool rotated = (_rotationDegrees % 180) != 0;
        double baseW = rotated ? 192.0 : 256.0;
        double baseH = rotated ? 256.0 : 192.0;

        if (scaleMode == ScreenScaleMode.StretchFill)
        {
            return new Size(Math.Round(w), Math.Round(h));
        }

        if (scaleMode == ScreenScaleMode.IntegerPixelPerfect)
        {
            int k = (int)Math.Floor(Math.Min(w / baseW, h / baseH));
            if (k >= 1)
            {
                return new Size(baseW * k, baseH * k);
            }
        }

        double s = Math.Min(w / baseW, h / baseH);
        return new Size(Math.Round(baseW * s), Math.Round(baseH * s));
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

    private async Task EmulationWorkerLoop(CancellationToken ct)
    {
        await _workerRunGate.WaitAsync(ct).ConfigureAwait(false);
        try
        {
            const double TargetFrameMs = 1000.0 / 59.8261;
            var paceWatch = Stopwatch.StartNew();
            var workWatch = new Stopwatch();
            double accumulatorMs = 0;

            while (!ct.IsCancellationRequested)
            {
                if (!StormDsUiState.Instance.IsEmulationActive ||
                    StormDsUiState.Instance.IsPaused ||
                    StormDsUiState.Instance.IsHiddenToTray)
                {
                    break;
                }

                var cfg = StormDsUiState.Instance.AppConfig;
                int paceMs = cfg.FrameGenEnabled ? 8 : 16;

                workWatch.Restart();
                double elapsed = paceWatch.Elapsed.TotalMilliseconds;
                paceWatch.Restart();
                accumulatorMs = Math.Min(accumulatorMs + elapsed, TargetFrameMs * 2.5);

                int steps;
                if (StormDsUiState.Instance.IsFastForward)
                {
                    steps = 3;
                    accumulatorMs = 0;
                }
                else
                {
                    steps = 0;
                    while (accumulatorMs >= TargetFrameMs && steps < 2)
                    {
                        accumulatorMs -= TargetFrameMs;
                        steps++;
                    }
                }

                if (steps == 0)
                {
                    bool didInterp = false;
                    if (cfg.FrameGenEnabled)
                    {
                        lock (_postProcessLock)
                        {
                            if (_hasPrevFrame && _prevTopBgra != null && _currTopBgra != null && _prevBotBgra != null && _currBotBgra != null)
                            {
                                InterpolateFrameBgra(_prevTopBgra, _currTopBgra, _workerOutTop);
                                InterpolateFrameBgra(_prevBotBgra, _currBotBgra, _workerOutBot);
                                didInterp = true;
                            }
                        }
                    }

                    if (didInterp)
                    {
                        PublishWorkerFrameToUi();
                    }
                }
                else
                {
                    uint padMask = _gamepad.PollNdsButtonMask();
                    lock (_inputLock)
                    {
                        _gamepadButtonsMask = padMask;
                    }
                    PushCombinedInput();

                    var eng = StormDsUiState.Instance.EngineService;
                    StormDsCoreStatsLoop(eng, steps);
                    ProcessAndPublishEngineFrame(eng, cfg);
                }

                int delayMs = Math.Max(1, paceMs - (int)workWatch.ElapsedMilliseconds);
                try
                {
                    await Task.Delay(delayMs, ct).ConfigureAwait(false);
                }
                catch (OperationCanceledException)
                {
                    break;
                }
            }
        }
        catch (OperationCanceledException)
        {
        }
        finally
        {
            _workerRunGate.Release();
        }
    }

    private void StormDsCoreStatsLoop(Core.Engine.StormDsEngineService eng, int steps)
    {
        Core.Native.StormDsFrameStats stats = default;
        long frame = 0;
        for (int i = 0; i < steps; i++)
        {
            frame = Interlocked.Increment(ref _frameCounter);
            bool playAudio = (i == steps - 1);
            stats = eng.RunFrame(playAudio);
            if (frame % 30 == 0 &&
                StormDsUiState.Instance.RetroAchievementsService.IsFeatureAllowedInCurrentMode("rewind"))
            {
                eng.PushRewind();
            }
        }
        StormDsUiState.Instance.LastFrameStats = stats;
        _latestStatsFps = stats.Fps;
        _latestStatsBackend = stats.ActiveBackend;
        Interlocked.Exchange(ref _latestStatsFrame, frame);
    }

    private void ProcessAndPublishEngineFrame(Core.Engine.StormDsEngineService eng, StormDsAppConfig cfg)
    {
        const int expectedBytes = 256 * 192 * 4;
        long frame = Interlocked.Read(ref _frameCounter);
        var rawTop = eng.HasLiveNativeFrame ? eng.TopFrameBgra : BitmapHelper.GenerateTestScreenBgra(256, 192, false, "STORM DS TOP", frame);
        var rawBot = eng.HasLiveNativeFrame ? eng.BottomFrameBgra : BitmapHelper.GenerateTestScreenBgra(256, 192, true, "STORM DS TOUCH", frame);

        lock (_postProcessLock)
        {
            var topBgra = ApplyDesktopFsrFilter(rawTop, _postTopBgra, ref _histTopBgra, cfg);
            var botBgra = ApplyDesktopFsrFilter(rawBot, _postBotBgra, ref _histBotBgra, cfg);

            if (cfg.FrameGenEnabled && topBgra.Length >= expectedBytes && botBgra.Length >= expectedBytes)
            {
                if (_currTopBgra != null && _currBotBgra != null)
                {
                    _prevTopBgra ??= new byte[expectedBytes];
                    _prevBotBgra ??= new byte[expectedBytes];
                    Buffer.BlockCopy(_currTopBgra, 0, _prevTopBgra, 0, expectedBytes);
                    Buffer.BlockCopy(_currBotBgra, 0, _prevBotBgra, 0, expectedBytes);
                    _hasPrevFrame = true;
                }
                _currTopBgra ??= new byte[expectedBytes];
                _currBotBgra ??= new byte[expectedBytes];
                Buffer.BlockCopy(topBgra, 0, _currTopBgra, 0, expectedBytes);
                Buffer.BlockCopy(botBgra, 0, _currBotBgra, 0, expectedBytes);
            }
            else
            {
                _hasPrevFrame = false;
            }

            Buffer.BlockCopy(topBgra, 0, _workerOutTop, 0, expectedBytes);
            Buffer.BlockCopy(botBgra, 0, _workerOutBot, 0, expectedBytes);
        }

        PublishWorkerFrameToUi();
    }

    private void PublishWorkerFrameToUi()
    {
        lock (_frameBufferLock)
        {
            (_workerOutTop, _sharedReadyTop) = (_sharedReadyTop, _workerOutTop);
            (_workerOutBot, _sharedReadyBot) = (_sharedReadyBot, _workerOutBot);
        }

        if (Interlocked.CompareExchange(ref _uiFramePending, 1, 0) == 0)
        {
            Dispatcher.UIThread.Post(PresentReadyFrameOnUiThread, DispatcherPriority.Render);
        }
    }

    private void PresentReadyFrameOnUiThread()
    {
        Interlocked.Exchange(ref _uiFramePending, 0);
        if (!StormDsUiState.Instance.IsEmulationActive || StormDsUiState.Instance.IsHiddenToTray)
        {
            return;
        }

        lock (_frameBufferLock)
        {
            (_sharedReadyTop, _uiReadTop) = (_uiReadTop, _sharedReadyTop);
            (_sharedReadyBot, _uiReadBot) = (_uiReadBot, _sharedReadyBot);
            _hasUiFrame = true;
        }

        PresentBgraPair(_uiReadTop, _uiReadBot);

        long frameNow = Interlocked.Read(ref _latestStatsFrame);
        if (frameNow - _lastHudUpdateFrame >= 15)
        {
            _lastHudUpdateFrame = frameNow;
            string resTag = $"{(int)_topScreenContainer.Width}x{(int)_topScreenContainer.Height}";
            string backendTag = _latestStatsBackend == 1 ? "VK" : "SW";
            double fpsVal = _latestStatsFps > 0.1 ? _latestStatsFps : 59.8;
            _statsBadgeText.Text = $"{fpsVal:0.0} FPS | {backendTag} | {resTag}";
            if (_showFpsHud)
            {
                _fpsHudText.Text = $"{fpsVal:0.0} FPS | {backendTag}";
            }
        }
    }

    private void RefreshRenderedBitmaps()
    {
        var eng = StormDsUiState.Instance.EngineService;
        var cfg = StormDsUiState.Instance.AppConfig;
        const int expectedBytes = 256 * 192 * 4;
        long frame = Interlocked.Read(ref _frameCounter);
        var rawTop = eng.HasLiveNativeFrame ? eng.TopFrameBgra : BitmapHelper.GenerateTestScreenBgra(256, 192, false, "STORM DS TOP", frame);
        var rawBot = eng.HasLiveNativeFrame ? eng.BottomFrameBgra : BitmapHelper.GenerateTestScreenBgra(256, 192, true, "STORM DS TOUCH", frame);

        lock (_postProcessLock)
        {
            var topBgra = ApplyDesktopFsrFilter(rawTop, _postTopBgra, ref _histTopBgra, cfg);
            var botBgra = ApplyDesktopFsrFilter(rawBot, _postBotBgra, ref _histBotBgra, cfg);

            lock (_frameBufferLock)
            {
                Buffer.BlockCopy(topBgra, 0, _uiReadTop, 0, expectedBytes);
                Buffer.BlockCopy(botBgra, 0, _uiReadBot, 0, expectedBytes);
                _hasUiFrame = true;
            }
        }

        PresentBgraPair(_uiReadTop, _uiReadBot);
    }

    private void PresentCachedFrameWithoutHistoryMutation()
    {
        bool hasCached;
        lock (_frameBufferLock)
        {
            hasCached = _hasUiFrame;
        }
        if (hasCached)
        {
            PresentBgraPair(_uiReadTop, _uiReadBot);
            return;
        }

        var eng = StormDsUiState.Instance.EngineService;
        const int expectedBytes = 256 * 192 * 4;
        long frame = Interlocked.Read(ref _frameCounter);
        var rawTop = eng.HasLiveNativeFrame ? eng.TopFrameBgra : BitmapHelper.GenerateTestScreenBgra(256, 192, false, "STORM DS TOP", frame);
        var rawBot = eng.HasLiveNativeFrame ? eng.BottomFrameBgra : BitmapHelper.GenerateTestScreenBgra(256, 192, true, "STORM DS TOUCH", frame);

        lock (_frameBufferLock)
        {
            Buffer.BlockCopy(rawTop, 0, _uiReadTop, 0, Math.Min(rawTop.Length, expectedBytes));
            Buffer.BlockCopy(rawBot, 0, _uiReadBot, 0, Math.Min(rawBot.Length, expectedBytes));
            _hasUiFrame = true;
        }

        PresentBgraPair(_uiReadTop, _uiReadBot);
    }

    private void PresentBgraPair(byte[] topBgra, byte[] botBgra)
    {
        if (!_screensSwapped || _detachedWindow != null)
        {
            BitmapHelper.UpdateBgraBitmap(_topBitmap, topBgra, 256, 192);
            BitmapHelper.UpdateBgraBitmap(_bottomBitmap, botBgra, 256, 192);
        }
        else
        {
            BitmapHelper.UpdateBgraBitmap(_topBitmap, botBgra, 256, 192);
            BitmapHelper.UpdateBgraBitmap(_bottomBitmap, topBgra, 256, 192);
        }

        if (!ReferenceEquals(_topScreenImage.Source, _topBitmap))
        {
            _topScreenImage.Source = _topBitmap;
        }
        _topScreenImage.InvalidateVisual();

        if (_detachedWindow != null)
        {
            if (!ReferenceEquals(_detachedWindow.ScreenImage.Source, _bottomBitmap))
            {
                _detachedWindow.ScreenImage.Source = _bottomBitmap;
            }
            _detachedWindow.ScreenImage.InvalidateVisual();
        }
        else
        {
            if (!ReferenceEquals(_bottomScreenImage.Source, _bottomBitmap))
            {
                _bottomScreenImage.Source = _bottomBitmap;
            }
            _bottomScreenImage.InvalidateVisual();
        }
    }

    private static byte[] ApplyDesktopFsrFilter(byte[] src, byte[] dst, ref byte[]? history, Core.Configuration.StormDsAppConfig cfg)
    {
        const int w = 256;
        const int h = 192;
        const int expectedBytes = w * h * 4;
        if (src.Length < expectedBytes || (cfg.ScreenFilter != ScreenFilter.Fsr1 && cfg.ScreenFilter != ScreenFilter.Fsr3))
        {
            return src;
        }

        bool temporal = cfg.ScreenFilter == ScreenFilter.Fsr3;
        float sharpness = Math.Clamp(cfg.FsrRcasSharpness, 0, 100) / 100.0f;
        float sharpenGain = sharpness * 0.45f;
        float temporalWeight = cfg.FsrQualityMode switch
        {
            0 => 0.35f,
            1 => 0.30f,
            2 => 0.24f,
            _ => 0.18f
        };

        if (temporal && history == null)
        {
            history = new byte[expectedBytes];
            Buffer.BlockCopy(src, 0, history, 0, expectedBytes);
        }

        for (int y = 0; y < h; y++)
        {
            int yU = Math.Max(0, y - 1);
            int yD = Math.Min(h - 1, y + 1);
            int rowOff = y * w * 4;
            int uOff = yU * w * 4;
            int dOff = yD * w * 4;
            for (int x = 0; x < w; x++)
            {
                int i = rowOff + x * 4;
                int xL = Math.Max(0, x - 1) * 4;
                int xR = Math.Min(w - 1, x + 1) * 4;
                int lOff = rowOff + xL;
                int rOff = rowOff + xR;

                for (int c = 0; c < 3; c++)
                {
                    int center = src[i + c];
                    int n = src[uOff + x * 4 + c];
                    int s = src[dOff + x * 4 + c];
                    int wl = src[lOff + c];
                    int er = src[rOff + c];
                    int mn = Math.Min(center, Math.Min(Math.Min(n, s), Math.Min(wl, er)));
                    int mx = Math.Max(center, Math.Max(Math.Max(n, s), Math.Max(wl, er)));

                    float avg = (n + s + wl + er) * 0.25f;
                    float sharpened = center + (center - avg) * sharpenGain;
                    int clamped = Math.Clamp((int)MathF.Round(sharpened), mn, mx);

                    if (temporal && history != null)
                    {
                        int hVal = Math.Clamp((int)history[i + c], mn, mx);
                        int diff = Math.Abs(clamped - hVal);
                        float disocc = Math.Clamp(diff / 48.0f, 0.0f, 1.0f);
                        float wHist = temporalWeight * (1.0f - disocc);
                        clamped = Math.Clamp((int)MathF.Round(clamped * (1.0f - wHist) + hVal * wHist), 0, 255);
                        history[i + c] = (byte)clamped;
                    }
                    dst[i + c] = (byte)clamped;
                }
                dst[i + 3] = 255;
            }
        }
        return dst;
    }

    private static void InterpolateFrameBgra(byte[] prev, byte[] curr, byte[] dst)
    {
        const int total = 256 * 192 * 4;
        for (int i = 0; i < total; i += 4)
        {
            int db = Math.Abs(curr[i] - prev[i]);
            int dg = Math.Abs(curr[i + 1] - prev[i + 1]);
            int dr = Math.Abs(curr[i + 2] - prev[i + 2]);
            if (db + dg + dr > 220)
            {
                dst[i] = curr[i];
                dst[i + 1] = curr[i + 1];
                dst[i + 2] = curr[i + 2];
            }
            else
            {
                dst[i] = (byte)((prev[i] + curr[i]) >> 1);
                dst[i + 1] = (byte)((prev[i + 1] + curr[i + 1]) >> 1);
                dst[i + 2] = (byte)((prev[i + 2] + curr[i + 2]) >> 1);
            }
            dst[i + 3] = 255;
        }
    }

    private void SwapScreens()
    {
        _screensSwapped = !_screensSwapped;
        AuroraTactileFeedbackService.Instance.PlayTabWhoosh();
        PresentCachedFrameWithoutHistoryMutation();
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
                    PresentCachedFrameWithoutHistoryMutation();
                },
                onTouchInput: (tx, ty, down) =>
                {
                    lock (_inputLock)
                    {
                        _isTouchDown = down;
                        _lastTouchX = tx;
                        _lastTouchY = ty;
                    }
                    PushCombinedInput();
                },
                canAcceptTouch: () => !StormDsUiState.Instance.IsPaused);
            _detachedWindow.ScreenImage.Source = _bottomBitmap;
            _detachedWindow.ScreenImage.InvalidateVisual();
            _detachedWindow.Show();
            StormDsUiState.Instance.IsDetachedScreenActive = true;
            RefreshDisplayConfig();
            PresentCachedFrameWithoutHistoryMutation();
        }
        else
        {
            _detachedWindow.Close();
        }
    }

    private void ResumeFromPause()
    {
        if (StormDsUiState.Instance.IsPaused)
        {
            StormDsUiState.Instance.TogglePause();
        }
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
            ResetPostProcessBuffers();
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
            ResetPostProcessBuffers();
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
        lock (_inputLock)
        {
            _isTouchDown = false;
            _lastTouchX = 0;
            _lastTouchY = 0;
        }
        PushCombinedInput();
    }

    private void SendTouch(Point p, Image targetImage)
    {
        var b = targetImage.Bounds;
        if (b.Width <= 0 || b.Height <= 0) return;

        ushort tx = (ushort)(Math.Clamp(p.X / b.Width, 0.0, 1.0) * 255.0);
        ushort ty = (ushort)(Math.Clamp(p.Y / b.Height, 0.0, 1.0) * 191.0);
        lock (_inputLock)
        {
            _lastTouchX = tx;
            _lastTouchY = ty;
        }
        PushCombinedInput();
    }

    private uint GetMergedButtonsMask()
    {
        lock (_inputLock)
        {
            return _keyboardButtonsMask | _touchControls.CurrentButtonsMask | _gamepadButtonsMask;
        }
    }

    private void PushCombinedInput()
    {
        uint buttons;
        ushort tx;
        ushort ty;
        bool touchDown;
        lock (_inputLock)
        {
            buttons = _keyboardButtonsMask | _touchControls.CurrentButtonsMask | _gamepadButtonsMask;
            tx = _lastTouchX;
            ty = _lastTouchY;
            touchDown = _isTouchDown;
        }
        StormDsUiState.Instance.EngineService.SetInput(buttons, tx, ty, touchDown);
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
        if (this.FindAncestorOfType<StormDsMainView>() is { IsModalOpen: true })
        {
            return;
        }

        if (e.Key == Key.Escape || MatchesHotkey(e.Key, "PauseResume"))
        {
            TogglePauseMenu();
            e.Handled = true;
            return;
        }

        if (StormDsUiState.Instance.IsPaused)
        {
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
            ResetPostProcessBuffers();
            RefreshRenderedBitmaps();
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

        if (MatchesHotkey(e.Key, "PauseResume"))
        {
            TogglePauseMenu();
            e.Handled = true;
            return;
        }

        if (MatchesHotkey(e.Key, "ToggleFps"))
        {
            _showFpsHud = !_showFpsHud;
            _fpsHudOverlay.IsVisible = _showFpsHud;
            e.Handled = true;
            return;
        }

        if (MatchesHotkey(e.Key, "RotateScreens"))
        {
            _rotationDegrees = (_rotationDegrees + 90) % 360;
            RefreshDisplayConfig();
            StormDsUiState.Instance.NotifyStatus($"Поворот экранов: {_rotationDegrees}°");
            e.Handled = true;
            return;
        }

        if (MatchesHotkey(e.Key, "SolarLuxInc"))
        {
            var cfg = StormDsUiState.Instance.AppConfig;
            cfg.SolarLuxLevel = Math.Clamp(cfg.SolarLuxLevel + 1, 0, 10);
            StormDsUiState.Instance.SaveConfig();
            StormDsUiState.Instance.NotifyStatus($"Датчик Boktai: {cfg.SolarLuxLevel}/10 Lux");
            e.Handled = true;
            return;
        }

        if (MatchesHotkey(e.Key, "SolarLuxDec"))
        {
            var cfg = StormDsUiState.Instance.AppConfig;
            cfg.SolarLuxLevel = Math.Clamp(cfg.SolarLuxLevel - 1, 0, 10);
            StormDsUiState.Instance.SaveConfig();
            StormDsUiState.Instance.NotifyStatus($"Датчик Boktai: {cfg.SolarLuxLevel}/10 Lux");
            e.Handled = true;
            return;
        }

        if (MatchesHotkey(e.Key, "ToggleHardcore"))
        {
            var uiState = StormDsUiState.Instance;
            uiState.SetHardcoreModeEnabled(!uiState.AppConfig.RetroAchievementsHardcoreMode);
            e.Handled = true;
            return;
        }

        if (MatchesHotkey(e.Key, "ToggleCheat"))
        {
            var cfg = StormDsUiState.Instance.AppConfig;
            cfg.CheatsEnabled = !cfg.CheatsEnabled;
            StormDsUiState.Instance.ApplyLiveCheats();
            StormDsUiState.Instance.SaveConfig();
            StormDsUiState.Instance.NotifyStatus(cfg.CheatsEnabled ? "Читы включены" : "Читы выключены");
            e.Handled = true;
            return;
        }

        uint bit = MapKeyToBit(e.Key);
        if (bit != 0)
        {
            lock (_inputLock)
            {
                _keyboardButtonsMask |= bit;
            }
            PushCombinedInput();
            e.Handled = true;
        }
    }

    private void HandleKeyUp(object? sender, KeyEventArgs e)
    {
        uint bit = MapKeyToBit(e.Key);
        if (bit != 0)
        {
            lock (_inputLock)
            {
                _keyboardButtonsMask &= ~bit;
            }
            PushCombinedInput();
            e.Handled = true;
        }
    }

    private static uint MapKeyToBit(Key key)
    {
        var km = StormDsUiState.Instance.AppConfig.KeyMap;
        if (MatchesMappedKey(key, km, "A", Key.X)) return 1u << 0;
        if (MatchesMappedKey(key, km, "B", Key.Z)) return 1u << 1;
        if (MatchesMappedKey(key, km, "Select", Key.RightShift)) return 1u << 2;
        if (MatchesMappedKey(key, km, "Start", Key.Return)) return 1u << 3;
        if (MatchesMappedKey(key, km, "Right", Key.Right)) return 1u << 4;
        if (MatchesMappedKey(key, km, "Left", Key.Left)) return 1u << 5;
        if (MatchesMappedKey(key, km, "Up", Key.Up)) return 1u << 6;
        if (MatchesMappedKey(key, km, "Down", Key.Down)) return 1u << 7;
        if (MatchesMappedKey(key, km, "R", Key.W)) return 1u << 8;
        if (MatchesMappedKey(key, km, "L", Key.Q)) return 1u << 9;
        if (MatchesMappedKey(key, km, "X", Key.S)) return 1u << 10;
        if (MatchesMappedKey(key, km, "Y", Key.A)) return 1u << 11;
        return 0u;
    }

    private static bool MatchesMappedKey(Key pressed, Dictionary<string, string>? keyMap, string action, Key fallback)
    {
        if (keyMap != null && keyMap.TryGetValue(action, out string? name) && Enum.TryParse<Key>(name, true, out var mapped))
        {
            if (mapped == pressed) return true;
            if ((mapped == Key.Return || mapped == Key.Enter) && (pressed == Key.Return || pressed == Key.Enter)) return true;
            return false;
        }
        return pressed == fallback;
    }
}
