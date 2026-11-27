// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Layout;
using Avalonia.Media;
using Avalonia.Threading;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Services;
using StormDs.UI.Common;

namespace StormDs.UI.Views.StatusBar;

/// <summary>
/// Canonical localized Bottom Status Bar enforcing Law 13 and Law 20.
/// Displays 3-form Russian pluralization of game count, GPU tier, audio latency,
/// and live dd.MM.yyyy HH:mm clock (never repeats 8.0.0).
/// </summary>
public class StormStatusBar : Border
{
    private readonly TextBlock _countText;
    private readonly TextBlock _gpuTierText;
    private readonly TextBlock _latencyText;
    private readonly TextBlock _wfcText;
    private readonly TextBlock _clockText;
    private readonly DispatcherTimer _timer;

    public StormStatusBar()
    {
        Height = 28;
        Background = new SolidColorBrush(Color.FromArgb(180, 15, 18, 28));
        BorderBrush = new SolidColorBrush(Color.FromArgb(40, 255, 255, 255));
        BorderThickness = new Thickness(0, 1, 0, 0);
        Padding = new Thickness(14, 0);

        var grid = new Grid
        {
            ColumnDefinitions = new ColumnDefinitions("Auto,*,Auto")
        };

        // 1. Left: Game Count with 3-form Russian Pluralization
        var leftStack = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 6,
            VerticalAlignment = VerticalAlignment.Center
        };
        leftStack.Children.Add(new AuroraVectorIcon
        {
            Kind = AuroraIconKind.LibraryGrid,
            Size = 13,
            VerticalAlignment = VerticalAlignment.Center
        });
        _countText = new TextBlock
        {
            Text = "0 игр",
            FontSize = 11,
            Foreground = new SolidColorBrush(Color.Parse("#CBD5E1")),
            VerticalAlignment = VerticalAlignment.Center
        };
        leftStack.Children.Add(_countText);
        grid.Children.Add(leftStack);
        Grid.SetColumn(leftStack, 0);

        // 2. Middle: GPU Tier, Latency, WFC status
        var middleStack = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 16,
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Center
        };

        // GPU Tier
        var gpuStack = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 4 };
        gpuStack.Children.Add(new AuroraVectorIcon { Kind = AuroraIconKind.VulkanFlame, Size = 13, VerticalAlignment = VerticalAlignment.Center });
        _gpuTierText = new TextBlock { Text = StormDsUiState.Instance.VulkanTierBadge, FontSize = 10.5, Foreground = new SolidColorBrush(Color.Parse("#10B981")) };
        gpuStack.Children.Add(_gpuTierText);
        middleStack.Children.Add(gpuStack);

        // Latency
        var latStack = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 4 };
        latStack.Children.Add(new AuroraVectorIcon { Kind = AuroraIconKind.AudioWaveDsp, Size = 13, VerticalAlignment = VerticalAlignment.Center });
        _latencyText = new TextBlock { Text = FormatLatencyText(), FontSize = 10.5, Foreground = new SolidColorBrush(Color.Parse("#0284C7")) };
        latStack.Children.Add(_latencyText);
        middleStack.Children.Add(latStack);

        // Live Session / Sync State
        var wfcStack = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 4 };
        wfcStack.Children.Add(new AuroraVectorIcon { Kind = AuroraIconKind.WifiGlobe, Size = 13, VerticalAlignment = VerticalAlignment.Center });
        _wfcText = new TextBlock { Text = FormatLiveStatusText(), FontSize = 10.5, Foreground = new SolidColorBrush(Color.Parse("#9333EA")) };
        wfcStack.Children.Add(_wfcText);
        middleStack.Children.Add(wfcStack);

        grid.Children.Add(middleStack);
        Grid.SetColumn(middleStack, 1);

        // 3. Right: Date/Time (dd.MM.yyyy HH:mm)
        _clockText = new TextBlock
        {
            Text = $"{DateTime.Now:dd.MM.yyyy HH:mm}",
            FontSize = 11,
            Foreground = StormThemeBrushes.SecondaryText,
            VerticalAlignment = VerticalAlignment.Center
        };
        grid.Children.Add(_clockText);
        Grid.SetColumn(_clockText, 2);

        Child = grid;

        _timer = new DispatcherTimer { Interval = TimeSpan.FromMilliseconds(500) };
        _timer.Tick += (s, e) =>
        {
            _clockText.Text = $"{DateTime.Now:dd.MM.yyyy HH:mm}";
            if (!_hasTransientNotification)
            {
                _wfcText.Text = FormatLiveStatusText();
            }
            _latencyText.Text = FormatLatencyText();
        };
        _timer.Start();

        StormDsUiState.Instance.LibraryService.LibraryChanged += UpdateCount;
        StormDsUiState.Instance.FilterChanged += UpdateCount;
        StormDsUiState.Instance.SettingsSaved += RefreshLiveIndicators;
        StormDsUiState.Instance.DisplayConfigChanged += RefreshLiveIndicators;
        StormDsUiState.Instance.EmulationStarted += RefreshLiveIndicators;
        StormDsUiState.Instance.EmulationStopped += RefreshLiveIndicators;
        StormDsUiState.Instance.StatusNotification += msg =>
        {
            if (!string.IsNullOrWhiteSpace(msg))
            {
                _hasTransientNotification = true;
                _wfcText.Text = msg;
                DispatcherTimer.RunOnce(() =>
                {
                    _hasTransientNotification = false;
                    _wfcText.Text = FormatLiveStatusText();
                }, TimeSpan.FromSeconds(4));
            }
        };
        StormThemeBrushes.BindTheme(this, () =>
        {
            Background = StormThemeBrushes.ChromeSurface;
            BorderBrush = StormThemeBrushes.SubtleBorder;
            _countText.Foreground = StormThemeBrushes.BodyText;
            _latencyText.Foreground = StormThemeBrushes.Accent;
            _wfcText.Foreground = StormThemeBrushes.AccentSecondary;
            _clockText.Foreground = StormThemeBrushes.SecondaryText;
            RefreshLiveIndicators();
        });
        UpdateCount();
    }

    private bool _hasTransientNotification;

    private static string FormatLatencyText()
    {
        return StormDsUiState.Instance.EngineService.IsMuted
            ? "Звук выкл."
            : $"{StormDsUiState.Instance.AppConfig.AudioLatency} мс DSP";
    }

    private static string FormatLiveStatusText()
    {
        if (StormDsUiState.Instance.IsEmulationActive)
        {
            if (StormDsUiState.Instance.IsPaused) return "Пауза";
            var fps = StormDsUiState.Instance.LastFrameStats.Fps;
            return fps > 0.1 ? $"Эмуляция: {fps:0.0} FPS" : "Эмуляция: 59.8 FPS";
        }
        return StormDsUiState.Instance.AppConfig.LanDiscoveryEnabled ? "Готов (WFC + LAN)" : "Готов";
    }

    private void RefreshLiveIndicators()
    {
        _gpuTierText.Text = StormDsUiState.Instance.VulkanTierBadge;
        _latencyText.Text = FormatLatencyText();
        if (!_hasTransientNotification)
        {
            _wfcText.Text = FormatLiveStatusText();
        }
    }

    private void UpdateCount()
    {
        int count = StormDsUiState.Instance.GetFilteredRoms().Count;
        string plural = AuroraLocalizationService.GetRussianPlural(count, "игра", "игры", "игр");
        _countText.Text = $"{count} {plural}";
    }
}
