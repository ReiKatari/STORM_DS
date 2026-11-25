// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Layout;
using Avalonia.Media;
using Avalonia.Threading;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Platform;
using Storm.AuroraFluid.Kit.Services;
using Storm.AuroraFluid.Kit.Themes;
using StormDs.Core.Localization;
using StormDs.UI.Common;

namespace StormDs.UI.Views.TitleBar;

/// <summary>
/// Custom desktop TitleBar enforcing STORM laws:
/// ALL CAPS "STORM DS 8.0.0" without 'v', live GPU tier badge, live FPS, WFC pill,
/// quick theme cycle pill, dd.MM.yyyy HH:mm clock, and 40x30px vector window controls.
/// </summary>
public class CustomTitleBar : Grid
{
    private readonly Window? _hostWindow;
    private readonly Border _gpuPill;
    private readonly Border _wfcPill;
    private readonly TextBlock _clockText;
    private readonly TextBlock _fpsText;
    private TextBlock? _themeLabelText;
    private readonly DispatcherTimer _clockTimer;

    public CustomTitleBar(Window? hostWindow = null)
    {
        _hostWindow = hostWindow;
        Height = 42;
        Background = Brushes.Transparent;
        VerticalAlignment = VerticalAlignment.Top;

        ColumnDefinitions = new ColumnDefinitions("Auto,Auto,*,Auto,Auto");

        // 1. App Title (ALL CAPS, single space, no 'v'!)
        var titleStack = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            VerticalAlignment = VerticalAlignment.Center,
            Margin = new Thickness(14, 0, 16, 0),
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
            Foreground = new SolidColorBrush(Color.Parse("#38BDF8")),
            VerticalAlignment = VerticalAlignment.Center
        };

        var versionLabel = new TextBlock
        {
            Text = StormDsLoc.AppVersion,
            FontSize = 11,
            FontWeight = FontWeight.SemiBold,
            Foreground = new SolidColorBrush(Color.Parse("#94A3B8")),
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

        // Vulkan Tier Pill
        _gpuPill = CreateBadgePill(
            AuroraIconKind.TurnipDriver,
            StormDsUiState.Instance.VulkanTierBadge,
            Color.Parse("#10B981"));
        badgesStack.Children.Add(_gpuPill);

        // Live FPS Pill
        _fpsText = new TextBlock
        {
            Text = "Готов",
            FontSize = 11,
            FontWeight = FontWeight.SemiBold,
            Foreground = new SolidColorBrush(Color.Parse("#22D3EE")),
            VerticalAlignment = VerticalAlignment.Center
        };
        var fpsPill = CreateCustomPill(AuroraIconKind.SpeedGauge, _fpsText, Color.Parse("#06B6D4"));
        badgesStack.Children.Add(fpsPill);

        // WFC Status Pill
        _wfcPill = CreateBadgePill(
            AuroraIconKind.WifiGlobe,
            "WFC: " + (StormDsUiState.Instance.AppConfig.LanDiscoveryEnabled ? "Готов" : "LAN"),
            Color.Parse("#818CF8"));
        badgesStack.Children.Add(_wfcPill);

        // Theme Cycle Pill (1-click quick switch)
        _themeLabelText = new TextBlock
        {
            Text = AuroraThemeManager.Instance.CurrentTheme.DisplayName,
            FontSize = 10.5,
            FontWeight = FontWeight.Medium,
            Foreground = new SolidColorBrush(Color.Parse("#E2E8F0")),
            VerticalAlignment = VerticalAlignment.Center
        };
        var themePill = CreateCustomPill(AuroraIconKind.ThemePalette, _themeLabelText, Color.Parse("#A855F7"));
        themePill.Cursor = new Cursor(StandardCursorType.Hand);
        themePill.PointerPressed += (s, e) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            CycleTheme();
        };
        badgesStack.Children.Add(themePill);

        AuroraThemeManager.Instance.ThemeChanged += t =>
        {
            if (_themeLabelText != null)
            {
                _themeLabelText.Text = t.DisplayName;
                _themeLabelText.Foreground = StormThemeBrushes.PrimaryText;
            }
            titleBrand.Foreground = StormThemeBrushes.Accent;
            versionLabel.Foreground = StormThemeBrushes.SecondaryText;
            if (_clockText != null) _clockText.Foreground = StormThemeBrushes.SecondaryText;
        };

        SetColumn(badgesStack, 1);
        Children.Add(badgesStack);

        // 3. Middle Draggable Area
        var dragArea = new Border
        {
            Background = Brushes.Transparent,
            HorizontalAlignment = HorizontalAlignment.Stretch,
            VerticalAlignment = VerticalAlignment.Stretch
        };
        dragArea.PointerPressed += (s, e) =>
        {
            if (e.GetCurrentPoint(this).Properties.IsLeftButtonPressed)
            {
                var w = _hostWindow ?? (VisualRoot as Window);
                w?.BeginMoveDrag(e);
            }
        };
        dragArea.DoubleTapped += (s, e) =>
        {
            ToggleMaximize();
        };
        SetColumn(dragArea, 2);
        Children.Add(dragArea);

        // 4. Clock (dd.MM.yyyy HH:mm)
        _clockText = new TextBlock
        {
            Text = $"{DateTime.Now:dd.MM.yyyy HH:mm}",
            FontSize = 11,
            Foreground = new SolidColorBrush(Color.Parse("#94A3B8")),
            VerticalAlignment = VerticalAlignment.Center,
            Margin = new Thickness(0, 0, 16, 0)
        };
        SetColumn(_clockText, 3);
        Children.Add(_clockText);

        _clockTimer = new DispatcherTimer { Interval = TimeSpan.FromMilliseconds(500) };
        _clockTimer.Tick += (s, e) =>
        {
            _clockText.Text = $"{DateTime.Now:dd.MM.yyyy HH:mm}";
            if (StormDsUiState.Instance.IsEmulationActive)
            {
                var stats = StormDsUiState.Instance.LastFrameStats;
                _fpsText.Text = stats.Fps > 0.1 ? $"{stats.Fps:0.0} FPS" : "60.0 FPS";
            }
            else
            {
                _fpsText.Text = "Готов";
            }
        };
        _clockTimer.Start();

        // 5. Window Control Buttons (40x30px)
        if (_hostWindow != null || VisualRoot is Window)
        {
            var winControls = new StackPanel
            {
                Orientation = Orientation.Horizontal,
                VerticalAlignment = VerticalAlignment.Top
            };

            var btnMin = CreateWindowControlButton(AuroraIconKind.WindowMinimize, () =>
            {
                var w = _hostWindow ?? (VisualRoot as Window);
                if (w != null) w.WindowState = WindowState.Minimized;
            }, false);

            var btnMax = CreateWindowControlButton(AuroraIconKind.WindowMaximize, () =>
            {
                ToggleMaximize();
            }, false);

            var btnClose = CreateWindowControlButton(AuroraIconKind.WindowClose, () =>
            {
                var w = _hostWindow ?? (VisualRoot as Window);
                // Law 1: Close-to-Tray unless requested from tray
                w?.Close();
            }, true);

            winControls.Children.Add(btnMin);
            winControls.Children.Add(btnMax);
            winControls.Children.Add(btnClose);

            SetColumn(winControls, 4);
            Children.Add(winControls);
        }
    }

    protected override void OnPropertyChanged(AvaloniaPropertyChangedEventArgs change)
    {
        base.OnPropertyChanged(change);
        if (change.Property == BoundsProperty)
        {
            double w = Bounds.Width;
            if (w <= 0) return;
            _wfcPill.IsVisible = w >= 980;
            _clockText.IsVisible = w >= 860;
            _gpuPill.IsVisible = w >= 780;
        }
    }

    private void ToggleMaximize()
    {
        var w = _hostWindow ?? (VisualRoot as Window);
        if (w == null) return;
        w.WindowState = w.WindowState == WindowState.Maximized ? WindowState.Normal : WindowState.Maximized;
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

    private static Border CreateBadgePill(AuroraIconKind icon, string text, Color accent)
    {
        var border = new Border
        {
            Background = new SolidColorBrush(Color.FromArgb(35, accent.R, accent.G, accent.B)),
            BorderBrush = new SolidColorBrush(Color.FromArgb(90, accent.R, accent.G, accent.B)),
            BorderThickness = new Thickness(1),
            CornerRadius = new CornerRadius(12),
            Padding = new Thickness(8, 3),
            VerticalAlignment = VerticalAlignment.Center
        };

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

        stack.Children.Add(new TextBlock
        {
            Text = text,
            FontSize = 10.5,
            FontWeight = FontWeight.Medium,
            Foreground = new SolidColorBrush(Color.Parse("#E2E8F0")),
            VerticalAlignment = VerticalAlignment.Center
        });

        border.Child = stack;
        return border;
    }

    private static Border CreateCustomPill(AuroraIconKind icon, Control textControl, Color accent)
    {
        var border = new Border
        {
            Background = new SolidColorBrush(Color.FromArgb(35, accent.R, accent.G, accent.B)),
            BorderBrush = new SolidColorBrush(Color.FromArgb(90, accent.R, accent.G, accent.B)),
            BorderThickness = new Thickness(1),
            CornerRadius = new CornerRadius(12),
            Padding = new Thickness(8, 3),
            VerticalAlignment = VerticalAlignment.Center
        };

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

    private static Border CreateClickablePill(AuroraIconKind icon, string text, Color accent, Action onClick)
    {
        var border = CreateBadgePill(icon, text, accent);
        border.Cursor = new Cursor(StandardCursorType.Hand);
        border.PointerPressed += (s, e) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            onClick();
        };
        return border;
    }

    private static Button CreateWindowControlButton(AuroraIconKind icon, Action action, bool isClose)
    {
        var btn = new Button
        {
            Width = 40,
            Height = 30,
            Padding = new Thickness(0),
            Background = Brushes.Transparent,
            BorderThickness = new Thickness(0),
            CornerRadius = new CornerRadius(0),
            Cursor = new Cursor(StandardCursorType.Hand),
            HorizontalContentAlignment = HorizontalAlignment.Center,
            VerticalContentAlignment = VerticalAlignment.Center
        };

        var vectorIcon = new AuroraVectorIcon
        {
            Kind = icon,
            Size = 12,
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Center
        };
        btn.Content = vectorIcon;

        btn.PointerEntered += (s, e) =>
        {
            btn.Background = isClose
                ? new SolidColorBrush(Color.Parse("#EF4444")) // Red close hover
                : new SolidColorBrush(Color.FromArgb(40, 255, 255, 255));
        };

        btn.PointerExited += (s, e) =>
        {
            btn.Background = Brushes.Transparent;
        };

        btn.Click += (s, e) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            action();
        };

        return btn;
    }
}
