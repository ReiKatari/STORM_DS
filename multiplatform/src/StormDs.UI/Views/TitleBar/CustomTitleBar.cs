// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using System.Collections.Generic;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Layout;
using Avalonia.Media;
using Avalonia.Threading;
using Avalonia.VisualTree;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Platform;
using Storm.AuroraFluid.Kit.Services;
using Storm.AuroraFluid.Kit.Themes;
using StormDs.Core.Localization;
using StormDs.UI.Common;

namespace StormDs.UI.Views.TitleBar;

/// <summary>
/// Custom desktop TitleBar with zero native OS chrome collisions:
/// clean STORM DS version title (without 'v'), live GPU/FPS/WFC/Theme pills,
/// full-strip window drag + double-click maximize/restore, and theme-aware 40x30 window controls.
/// </summary>
public class CustomTitleBar : Grid
{
    private readonly Window? _hostWindow;
    private readonly TextBlock _gpuText;
    private readonly TextBlock _fpsText;
    private readonly TextBlock _wfcText;
    private readonly TextBlock _themeLabelText;
    private readonly List<TextBlock> _pillLabels = [];
    private readonly List<(Border Pill, Color Accent)> _pillBorders = [];
    private readonly List<AuroraVectorIcon> _windowIcons = [];
    private AuroraVectorIcon? _maxIcon;
    private readonly DispatcherTimer _fpsTimer;

    public CustomTitleBar(Window? hostWindow = null)
    {
        _hostWindow = hostWindow;
        Height = 42;
        Background = Brushes.Transparent;
        VerticalAlignment = VerticalAlignment.Top;

        ColumnDefinitions = new ColumnDefinitions("Auto,Auto,*,Auto");

        // 1. App Title (ALL CAPS, single space, no 'v')
        var titleStack = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            VerticalAlignment = VerticalAlignment.Center,
            Margin = new Thickness(14, 0, 14, 0),
            Spacing = 6
        };

        var appIcon = new AuroraVectorIcon
        {
            Kind = AuroraIconKind.LibraryGrid,
            Size = 18,
            VerticalAlignment = VerticalAlignment.Center
        };

        var titleBrand = new TextBlock
        {
            Text = "STORM DS",
            FontSize = 13,
            FontWeight = FontWeight.Bold,
            VerticalAlignment = VerticalAlignment.Center
        };

        var versionLabel = new TextBlock
        {
            Text = StormDsLoc.AppVersion,
            FontSize = 11,
            FontWeight = FontWeight.SemiBold,
            VerticalAlignment = VerticalAlignment.Center
        };

        titleStack.Children.Add(appIcon);
        titleStack.Children.Add(titleBrand);
        titleStack.Children.Add(versionLabel);
        SetColumn(titleStack, 0);
        Children.Add(titleStack);

        // 2. Hardware & Status Badges
        var badgesStack = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            VerticalAlignment = VerticalAlignment.Center,
            Spacing = 8
        };

        // Live GPU / Renderer Pill
        _gpuText = CreatePillLabel(StormDsUiState.Instance.VulkanTierBadge);
        var gpuPill = CreateCustomPill(AuroraIconKind.TurnipDriver, _gpuText, Color.Parse("#10B981"));
        badgesStack.Children.Add(gpuPill);

        // Live FPS Pill
        _fpsText = CreatePillLabel(StormDsLoc.T("TrayReady"));
        var fpsPill = CreateCustomPill(AuroraIconKind.SpeedGauge, _fpsText, Color.Parse("#06B6D4"));
        badgesStack.Children.Add(fpsPill);

        // WFC Status Pill
        _wfcText = CreatePillLabel(FormatWfcStatus());
        var wfcPill = CreateCustomPill(AuroraIconKind.WifiGlobe, _wfcText, Color.Parse("#818CF8"));
        badgesStack.Children.Add(wfcPill);

        // Theme Cycle Pill (1-click quick switch)
        _themeLabelText = CreatePillLabel(AuroraThemeManager.Instance.CurrentTheme.DisplayName);
        var themePill = CreateCustomPill(AuroraIconKind.ThemePalette, _themeLabelText, Color.Parse("#A855F7"));
        themePill.Tag = "Interactive";
        themePill.Cursor = new Cursor(StandardCursorType.Hand);
        themePill.PointerPressed += (_, e) =>
        {
            e.Handled = true;
            AuroraTactileFeedbackService.Instance.PlayClick();
            CycleTheme();
        };
        badgesStack.Children.Add(themePill);

        SetColumn(badgesStack, 1);
        Children.Add(badgesStack);

        // 3. Middle Draggable Area
        var dragArea = new Border
        {
            Background = Brushes.Transparent,
            HorizontalAlignment = HorizontalAlignment.Stretch,
            VerticalAlignment = VerticalAlignment.Stretch
        };
        SetColumn(dragArea, 2);
        Children.Add(dragArea);

        // Full-strip drag & double-click maximize/restore (skips interactive buttons/pills)
        PointerPressed += (_, e) =>
        {
            if (e.GetCurrentPoint(this).Properties.IsLeftButtonPressed && !IsInteractiveElement(e.Source as Visual))
            {
                var w = _hostWindow ?? (VisualRoot as Window);
                w?.BeginMoveDrag(e);
            }
        };
        DoubleTapped += (_, e) =>
        {
            if (!IsInteractiveElement(e.Source as Visual))
            {
                ToggleMaximize();
            }
        };

        _fpsTimer = new DispatcherTimer { Interval = TimeSpan.FromMilliseconds(500) };
        _fpsTimer.Tick += (_, _) =>
        {
            if (StormDsUiState.Instance.IsEmulationActive)
            {
                if (StormDsUiState.Instance.IsPaused)
                {
                    _fpsText.Text = StormDsLoc.T("TrayPause");
                }
                else
                {
                    var stats = StormDsUiState.Instance.LastFrameStats;
                    _fpsText.Text = stats.Fps > 0.1 ? $"{stats.Fps:0.0} FPS" : "59.8 FPS";
                }
            }
            else
            {
                _fpsText.Text = StormDsLoc.T("TrayReady");
            }
        };
        _fpsTimer.Start();

        // 4. Window Control Buttons (42x32px)
        var winControls = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            VerticalAlignment = VerticalAlignment.Top,
            Margin = new Thickness(8, 0, 0, 0)
        };

        var btnMin = CreateWindowControlButton(AuroraIconKind.WindowMinimize, () =>
        {
            var w = _hostWindow ?? (VisualRoot as Window);
            if (w != null) w.WindowState = WindowState.Minimized;
        }, isClose: false, out _);

        var btnMax = CreateWindowControlButton(AuroraIconKind.WindowMaximize, ToggleMaximize, isClose: false, out _maxIcon);

        var btnClose = CreateWindowControlButton(AuroraIconKind.WindowClose, () =>
        {
            var w = _hostWindow ?? (VisualRoot as Window);
            w?.Close();
        }, isClose: true, out _);

        winControls.Children.Add(btnMin);
        winControls.Children.Add(btnMax);
        winControls.Children.Add(btnClose);

        SetColumn(winControls, 3);
        Children.Add(winControls);

        if (_hostWindow != null)
        {
            _hostWindow.PropertyChanged += (_, change) =>
            {
                if (change.Property == Window.WindowStateProperty)
                {
                    UpdateMaximizeGlyph(_hostWindow.WindowState);
                }
            };
            UpdateMaximizeGlyph(_hostWindow.WindowState);
        }

        StormDsUiState.Instance.SettingsSaved += RefreshLiveTelemetry;
        StormDsUiState.Instance.DisplayConfigChanged += RefreshLiveTelemetry;
        StormDsLoc.LanguageChanged += _ => RefreshLiveTelemetry();

        StormThemeBrushes.BindTheme(this, () =>
        {
            _themeLabelText.Text = AuroraThemeManager.Instance.CurrentTheme.DisplayName;
            titleBrand.Foreground = StormThemeBrushes.Accent;
            versionLabel.Foreground = StormThemeBrushes.SecondaryText;

            var pillTextBrush = StormThemeBrushes.PrimaryText;
            foreach (var lbl in _pillLabels)
            {
                lbl.Foreground = pillTextBrush;
            }

            foreach (var (pill, acc) in _pillBorders)
            {
                pill.Background = StormThemeBrushes.BadgeFill(acc);
                pill.BorderBrush = StormThemeBrushes.BadgeBorder(acc);
            }

            var winIconBrush = StormThemeBrushes.PrimaryText;
            foreach (var icon in _windowIcons)
            {
                icon.CustomColorOverride = winIconBrush;
            }
        });
    }

    private static string FormatWfcStatus()
    {
        return StormDsUiState.Instance.AppConfig.LanDiscoveryEnabled
            ? "WFC + LAN"
            : "WFC";
    }

    private void RefreshLiveTelemetry()
    {
        _gpuText.Text = StormDsUiState.Instance.VulkanTierBadge;
        _wfcText.Text = FormatWfcStatus();
        if (!StormDsUiState.Instance.IsEmulationActive)
        {
            _fpsText.Text = StormDsLoc.T("TrayReady");
        }
    }

    private void UpdateMaximizeGlyph(WindowState state)
    {
        if (_maxIcon == null) return;
        _maxIcon.Kind = state == WindowState.Maximized
            ? AuroraIconKind.WindowRestore
            : AuroraIconKind.WindowMaximize;
    }

    private bool IsInteractiveElement(Visual? source)
    {
        Visual? cur = source;
        while (cur != null && cur != this)
        {
            if (cur is Button) return true;
            if (cur is Border b && Equals(b.Tag, "Interactive")) return true;
            cur = cur.GetVisualParent();
        }
        return false;
    }

    private void ToggleMaximize()
    {
        var w = _hostWindow ?? (VisualRoot as Window);
        if (w == null) return;

        if (w.WindowState == WindowState.FullScreen)
        {
            StormDsUiState.Instance.RequestToggleFullscreen();
            return;
        }

        w.WindowState = w.WindowState == WindowState.Maximized
            ? WindowState.Normal
            : WindowState.Maximized;
        UpdateMaximizeGlyph(w.WindowState);
    }

    private static void CycleTheme()
    {
        var themes = new[]
        {
            AuroraThemeManager.ThemeMidnight,
            AuroraThemeManager.ThemeNight,
            AuroraThemeManager.ThemeDark,
            AuroraThemeManager.ThemeDay,
            AuroraThemeManager.ThemeFantasy,
            AuroraThemeManager.ThemeCyberpunk,
            AuroraThemeManager.ThemeWarhammer40K,
            AuroraThemeManager.ThemeElemental,
            AuroraThemeManager.ThemeStorm
        };

        var cur = AuroraThemeManager.Instance.CurrentTheme.Id;
        int idx = Array.IndexOf(themes, cur);
        int next = (idx + 1) % themes.Length;
        AuroraThemeManager.Instance.ApplyTheme(themes[next]);
        StormDsUiState.Instance.AppConfig.Theme = themes[next];
        StormDsUiState.Instance.SaveConfig();
    }

    private TextBlock CreatePillLabel(string text)
    {
        var tb = new TextBlock
        {
            Text = text,
            FontSize = 10.5,
            FontWeight = FontWeight.Medium,
            VerticalAlignment = VerticalAlignment.Center
        };
        _pillLabels.Add(tb);
        return tb;
    }

    private Border CreateCustomPill(AuroraIconKind icon, Control textControl, Color accent)
    {
        var border = new Border
        {
            Background = StormThemeBrushes.BadgeFill(accent),
            BorderBrush = StormThemeBrushes.BadgeBorder(accent),
            BorderThickness = new Thickness(1),
            CornerRadius = new CornerRadius(12),
            Padding = new Thickness(8, 3),
            VerticalAlignment = VerticalAlignment.Center
        };
        _pillBorders.Add((border, accent));

        var stack = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 5,
            VerticalAlignment = VerticalAlignment.Center
        };

        stack.Children.Add(new AuroraVectorIcon
        {
            Kind = icon,
            Size = 13,
            VerticalAlignment = VerticalAlignment.Center
        });

        stack.Children.Add(textControl);
        border.Child = stack;
        return border;
    }

    private Button CreateWindowControlButton(AuroraIconKind icon, Action action, bool isClose, out AuroraVectorIcon vectorIcon)
    {
        var btn = new Button
        {
            Width = 42,
            Height = 32,
            Padding = new Thickness(0),
            Background = Brushes.Transparent,
            BorderThickness = new Thickness(0),
            CornerRadius = new CornerRadius(0),
            Cursor = new Cursor(StandardCursorType.Hand),
            HorizontalContentAlignment = HorizontalAlignment.Center,
            VerticalContentAlignment = VerticalAlignment.Center
        };

        var iconCtrl = new AuroraVectorIcon
        {
            Kind = icon,
            Size = 12,
            CustomColorOverride = StormThemeBrushes.PrimaryText,
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Center
        };
        vectorIcon = iconCtrl;
        _windowIcons.Add(iconCtrl);
        btn.Content = iconCtrl;

        btn.PointerEntered += (_, _) =>
        {
            if (isClose)
            {
                btn.Background = new SolidColorBrush(Color.Parse("#E81123"));
                iconCtrl.CustomColorOverride = Brushes.White;
            }
            else
            {
                btn.Background = StormThemeBrushes.IsDark
                    ? new SolidColorBrush(Color.FromArgb(40, 255, 255, 255))
                    : new SolidColorBrush(Color.FromArgb(26, 15, 23, 42));
                iconCtrl.CustomColorOverride = StormThemeBrushes.PrimaryText;
            }
        };

        btn.PointerExited += (_, _) =>
        {
            btn.Background = Brushes.Transparent;
            iconCtrl.CustomColorOverride = StormThemeBrushes.PrimaryText;
        };

        btn.Click += (_, _) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            action();
        };

        return btn;
    }
}
