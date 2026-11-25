// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using System.IO;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Media;
using Storm.AuroraFluid.Kit.Controls;
using Storm.AuroraFluid.Kit.Platform;
using Storm.AuroraFluid.Kit.Themes;
using StormDs.Core.Localization;
using StormDs.UI.Common;
using StormDs.UI.Views;

namespace StormDs.UI.Windows;

/// <summary>
/// Primary desktop window for STORM DS implementing Variant 1 (01 - Aurora Bento Command).
/// Features DPI/WorkArea-aware sizing, live UI scaling (Ctrl+=/- / Auto), fullscreen support (F11),
/// and persisted window geometry.
/// </summary>
public class StormDsMainWindow : Window
{
    private readonly AuroraScaledLayoutControl _scaledHost;
    private readonly StormDsMainView _mainView;
    private double _lastWorkWidth = 1920;
    private double _lastWorkHeight = 1040;
    private WindowState _preFullscreenState = WindowState.Normal;

    public StormDsMainWindow()
    {
        var cfg = StormDsUiState.Instance.AppConfig;
        Title = $"STORM DS {StormDsLoc.AppVersion}";
        MinWidth = 760;
        MinHeight = 520;
        Width = Math.Clamp(cfg.WindowWidth > 0 ? cfg.WindowWidth : 1280, MinWidth, 3840);
        Height = Math.Clamp(cfg.WindowHeight > 0 ? cfg.WindowHeight : 820, MinHeight, 2160);
        WindowStartupLocation = WindowStartupLocation.CenterScreen;

        // Modern frameless window with custom vector title bar
        ExtendClientAreaToDecorationsHint = true;
        ExtendClientAreaTitleBarHeightHint = 42;

        string iconPath = Path.Combine(AppContext.BaseDirectory, "assets", "AppIcon.ico");
        if (File.Exists(iconPath))
        {
            try
            {
                Icon = new WindowIcon(iconPath);
            }
            catch
            {
                // Ignore invalid icon resource
            }
        }

        UpdateThemeBackground();
        AuroraThemeManager.Instance.ThemeChanged += _ => UpdateThemeBackground();

        var rootShell = new Grid
        {
            RowDefinitions = new RowDefinitions("Auto,*")
        };

        var titleBar = new StormDs.UI.Views.TitleBar.CustomTitleBar(this);
        rootShell.Children.Add(titleBar);
        Grid.SetRow(titleBar, 0);

        _mainView = new StormDsMainView(this, includeTitleBar: false);
        _scaledHost = new AuroraScaledLayoutControl { Child = _mainView };
        rootShell.Children.Add(_scaledHost);
        Grid.SetRow(_scaledHost, 1);

        Content = rootShell;

        StormDsUiState.Instance.UiScaleChanged += ApplyUiScale;
        StormDsUiState.Instance.FullscreenToggled += ToggleFullscreen;
        StormDsUiState.Instance.FullscreenChanged += isFs => titleBar.IsVisible = !isFs;

        Opened += OnWindowOpened;
        Closing += OnWindowClosing;
        KeyDown += OnWindowKeyDown;
    }

    private void OnWindowOpened(object? sender, EventArgs e)
    {
        nint hwnd = TryGetPlatformHandle()?.Handle ?? IntPtr.Zero;
        if (hwnd != IntPtr.Zero)
        {
            AuroraWin32Interop.ApplyDwmDarkMode(hwnd, AuroraThemeManager.Instance.CurrentTheme.IsDark, enableMica: true);
            AuroraWin32Interop.EnableElevatedDragDropBypass(hwnd);
        }

        var screen = Screens.ScreenFromWindow(this) ?? Screens.Primary;
        if (screen != null)
        {
            double dpiScale = Math.Max(1.0, screen.Scaling);
            _lastWorkWidth = screen.WorkingArea.Width / dpiScale;
            _lastWorkHeight = screen.WorkingArea.Height / dpiScale;

            var cfg = StormDsUiState.Instance.AppConfig;
            if (cfg.WindowMaximized)
            {
                WindowState = WindowState.Maximized;
            }
            else
            {
                double maxW = Math.Max(MinWidth, _lastWorkWidth * 0.94);
                double maxH = Math.Max(MinHeight, _lastWorkHeight * 0.92);
                if (Width > maxW) Width = maxW;
                if (Height > maxH) Height = maxH;
            }
        }

        ApplyUiScale();
    }

    private void OnWindowClosing(object? sender, WindowClosingEventArgs e)
    {
        var cfg = StormDsUiState.Instance.AppConfig;
        if (WindowState != WindowState.FullScreen)
        {
            cfg.WindowMaximized = WindowState == WindowState.Maximized;
        }
        if (WindowState == WindowState.Normal && Bounds.Width >= MinWidth && Bounds.Height >= MinHeight)
        {
            cfg.WindowWidth = Math.Round(Bounds.Width);
            cfg.WindowHeight = Math.Round(Bounds.Height);
        }
        StormDsUiState.Instance.SaveConfig();
    }

    private void ApplyUiScale()
    {
        double configured = StormDsUiState.Instance.AppConfig.UiScaleFactor;
        double effective;
        if (configured > 0.05)
        {
            effective = Math.Clamp(configured, 0.75, 1.50);
        }
        else
        {
            effective = (_lastWorkWidth < 1100 || _lastWorkHeight < 680)
                ? 0.90
                : (_lastWorkWidth >= 2200 && _lastWorkHeight >= 1200 ? 1.12 : 1.0);
        }

        _scaledHost.Scale = effective;
    }

    private void ToggleFullscreen()
    {
        if (WindowState == WindowState.FullScreen)
        {
            WindowState = _preFullscreenState;
            StormDsUiState.Instance.SetFullscreen(false);
        }
        else
        {
            _preFullscreenState = WindowState == WindowState.Minimized ? WindowState.Normal : WindowState;
            WindowState = WindowState.FullScreen;
            StormDsUiState.Instance.SetFullscreen(true);
        }
    }

    private void OnWindowKeyDown(object? sender, KeyEventArgs e)
    {
        if (e.Key == Key.F11)
        {
            ToggleFullscreen();
            e.Handled = true;
            return;
        }

        if ((e.KeyModifiers & KeyModifiers.Control) != 0)
        {
            if (e.Key is Key.OemPlus or Key.Add)
            {
                double cur = _scaledHost.Scale;
                double next = Math.Clamp(Math.Round((cur + 0.10) * 20.0) / 20.0, 0.75, 1.50);
                StormDsUiState.Instance.AppConfig.UiScaleFactor = next;
                StormDsUiState.Instance.SaveConfig();
                ApplyUiScale();
                e.Handled = true;
            }
            else if (e.Key is Key.OemMinus or Key.Subtract)
            {
                double cur = _scaledHost.Scale;
                double next = Math.Clamp(Math.Round((cur - 0.10) * 20.0) / 20.0, 0.75, 1.50);
                StormDsUiState.Instance.AppConfig.UiScaleFactor = next;
                StormDsUiState.Instance.SaveConfig();
                ApplyUiScale();
                e.Handled = true;
            }
            else if (e.Key is Key.D0 or Key.NumPad0)
            {
                StormDsUiState.Instance.AppConfig.UiScaleFactor = 0.0;
                StormDsUiState.Instance.SaveConfig();
                ApplyUiScale();
                e.Handled = true;
            }
        }
    }

    private void UpdateThemeBackground()
    {
        var theme = AuroraThemeManager.Instance.CurrentTheme;
        Background = theme.BackgroundBrush;
        nint hwnd = TryGetPlatformHandle()?.Handle ?? IntPtr.Zero;
        if (hwnd != IntPtr.Zero)
        {
            AuroraWin32Interop.ApplyDwmDarkMode(hwnd, theme.IsDark, enableMica: true);
        }
    }
}
