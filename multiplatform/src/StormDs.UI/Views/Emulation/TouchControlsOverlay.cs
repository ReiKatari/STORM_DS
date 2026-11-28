// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using System.Collections.Generic;
using System.Threading;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Layout;
using Avalonia.Media;
using Storm.AuroraFluid.Kit.Controls;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Services;
using Storm.AuroraFluid.Kit.Themes;
using StormDs.Core.Configuration;
using StormDs.UI.Common;

namespace StormDs.UI.Views.Emulation;

/// <summary>
/// 3D Volumetric / Neon On-Screen Touch Controls.
/// Provides glowing D-Pad, A/B/X/Y, L/R shoulders, and system triggers.
/// </summary>
public class TouchControlsOverlay : Grid
{
    private readonly List<(Border Box, TextBlock Label, Color Accent)> _padButtons = [];
    private readonly Dictionary<Border, IBrush> _idleBackgrounds = [];
    private uint _buttonsMask;
    public uint CurrentButtonsMask => Volatile.Read(ref _buttonsMask);

    public event Action<uint>? InputChanged;

    public TouchControlsOverlay()
    {
        IsHitTestVisible = true;
        HorizontalAlignment = HorizontalAlignment.Stretch;
        VerticalAlignment = VerticalAlignment.Stretch;

        ColumnDefinitions = new ColumnDefinitions("Auto,*,Auto");

        // 1. Left Controls: L Shoulder + D-Pad + FastForward
        var leftStack = new StackPanel
        {
            VerticalAlignment = VerticalAlignment.Bottom,
            HorizontalAlignment = HorizontalAlignment.Left,
            Margin = new Thickness(24, 0, 0, 24),
            Spacing = 16
        };

        // L Shoulder Button
        var btnL = CreateNeonPadButton("L", 1 << 9, 72, 36);
        leftStack.Children.Add(btnL);

        // D-Pad Grid
        var dpad = new Grid
        {
            Width = 144,
            Height = 144,
            RowDefinitions = new RowDefinitions("48,48,48"),
            ColumnDefinitions = new ColumnDefinitions("48,48,48")
        };

        var btnUp = CreateNeonPadButton("▲", 1 << 6, 44, 44);
        var btnDown = CreateNeonPadButton("▼", 1 << 7, 44, 44);
        var btnLeft = CreateNeonPadButton("◀", 1 << 5, 44, 44);
        var btnRight = CreateNeonPadButton("▶", 1 << 4, 44, 44);

        dpad.Children.Add(btnUp);
        Grid.SetRow(btnUp, 0); Grid.SetColumn(btnUp, 1);

        dpad.Children.Add(btnDown);
        Grid.SetRow(btnDown, 2); Grid.SetColumn(btnDown, 1);

        dpad.Children.Add(btnLeft);
        Grid.SetRow(btnLeft, 1); Grid.SetColumn(btnLeft, 0);

        dpad.Children.Add(btnRight);
        Grid.SetRow(btnRight, 1); Grid.SetColumn(btnRight, 2);

        leftStack.Children.Add(dpad);
        Children.Add(leftStack);
        Grid.SetColumn(leftStack, 0);

        // 2. Center: Select, Menu, Start
        var centerStack = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Bottom,
            Margin = new Thickness(0, 0, 0, 16),
            Spacing = 12
        };

        var btnSelect = CreateNeonPadButton("SELECT", 1 << 2, 60, 28, fontSize: 9);
        var btnStart = CreateNeonPadButton("START", 1 << 3, 60, 28, fontSize: 9);

        centerStack.Children.Add(btnSelect);
        centerStack.Children.Add(btnStart);
        Children.Add(centerStack);
        Grid.SetColumn(centerStack, 1);

        // 3. Right Controls: R Shoulder + A/B/X/Y Cluster
        var rightStack = new StackPanel
        {
            VerticalAlignment = VerticalAlignment.Bottom,
            HorizontalAlignment = HorizontalAlignment.Right,
            Margin = new Thickness(0, 0, 24, 24),
            Spacing = 16
        };

        // R Shoulder Button
        var btnR = CreateNeonPadButton("R", 1 << 8, 72, 36);
        btnR.HorizontalAlignment = HorizontalAlignment.Right;
        rightStack.Children.Add(btnR);

        // ABXY Diamond
        var abxyGrid = new Grid
        {
            Width = 144,
            Height = 144,
            RowDefinitions = new RowDefinitions("48,48,48"),
            ColumnDefinitions = new ColumnDefinitions("48,48,48")
        };

        var btnX = CreateNeonPadButton("X", 1 << 10, 44, 44, accentHex: "#38BDF8");
        var btnY = CreateNeonPadButton("Y", 1 << 11, 44, 44, accentHex: "#10B981");
        var btnB = CreateNeonPadButton("B", 1 << 1, 44, 44, accentHex: "#F59E0B");
        var btnA = CreateNeonPadButton("A", 1 << 0, 44, 44, accentHex: "#EF4444");

        abxyGrid.Children.Add(btnX);
        Grid.SetRow(btnX, 0); Grid.SetColumn(btnX, 1);

        abxyGrid.Children.Add(btnY);
        Grid.SetRow(btnY, 1); Grid.SetColumn(btnY, 0);

        abxyGrid.Children.Add(btnA);
        Grid.SetRow(btnA, 1); Grid.SetColumn(btnA, 2);

        abxyGrid.Children.Add(btnB);
        Grid.SetRow(btnB, 2); Grid.SetColumn(btnB, 1);

        rightStack.Children.Add(abxyGrid);
        Children.Add(rightStack);
        Grid.SetColumn(rightStack, 2);
    }

    public void ApplyConfig(StormDsAppConfig cfg)
    {
        Opacity = Math.Clamp(cfg.TouchOverlayOpacity, 0.15f, 1.0f);
        double scale = Math.Clamp(cfg.TouchOverlayScale, 0.65f, 1.50f);
        RenderTransform = Math.Abs(scale - 1.0) > 0.01 ? new ScaleTransform(scale, scale) : null;
        RenderTransformOrigin = RelativePoint.Center;

        foreach (var (box, _, accent) in _padButtons)
        {
            switch (cfg.TouchOverlayPreset)
            {
                case TouchOverlayPreset.CyberNeon:
                    box.Background = new SolidColorBrush(Color.FromArgb(135, 10, 12, 24));
                    box.BorderBrush = new SolidColorBrush(accent);
                    box.BorderThickness = new Thickness(2.0);
                    break;
                case TouchOverlayPreset.MinimalOutline:
                    box.Background = new SolidColorBrush(Color.FromArgb(25, 255, 255, 255));
                    box.BorderBrush = new SolidColorBrush(Color.FromArgb(160, accent.R, accent.G, accent.B));
                    box.BorderThickness = new Thickness(1.0);
                    break;
                default:
                    box.Background = new SolidColorBrush(Color.FromArgb(90, 20, 24, 38));
                    box.BorderBrush = new SolidColorBrush(Color.FromArgb(145, accent.R, accent.G, accent.B));
                    box.BorderThickness = new Thickness(1.5);
                    break;
            }
            _idleBackgrounds[box] = box.Background;
        }
    }

    private Border CreateNeonPadButton(string label, uint maskBit, double w, double h, double fontSize = 12, string? accentHex = null)
    {
        var resolvedAccent = accentHex != null ? Color.Parse(accentHex) : Colors.White;
        var defaultBg = new SolidColorBrush(Color.FromArgb(90, 20, 24, 38));
        var border = new Border
        {
            Width = w,
            Height = h,
            CornerRadius = new CornerRadius(Math.Min(w, h) / 2.0),
            Background = defaultBg,
            BorderBrush = new SolidColorBrush(accentHex != null ? resolvedAccent : Color.FromArgb(120, 255, 255, 255)),
            BorderThickness = new Thickness(1.5),
            Cursor = new Cursor(StandardCursorType.Hand)
        };
        _idleBackgrounds[border] = defaultBg;

        var tb = new TextBlock
        {
            Text = label,
            FontSize = fontSize,
            FontWeight = FontWeight.Bold,
            Foreground = accentHex != null ? new SolidColorBrush(resolvedAccent) : Brushes.White,
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Center
        };
        border.Child = tb;
        _padButtons.Add((border, tb, resolvedAccent));

        void ClearButton()
        {
            uint prev = Volatile.Read(ref _buttonsMask);
            uint next = prev & ~maskBit;
            Volatile.Write(ref _buttonsMask, next);
            border.Background = _idleBackgrounds.TryGetValue(border, out var idleBg)
                ? idleBg
                : new SolidColorBrush(Color.FromArgb(90, 20, 24, 38));
            if (prev != next)
            {
                InputChanged?.Invoke(next);
            }
        }

        border.PointerPressed += (s, e) =>
        {
            if (!e.GetCurrentPoint(border).Properties.IsLeftButtonPressed) return;
            e.Pointer.Capture(border);
            uint next = Volatile.Read(ref _buttonsMask) | maskBit;
            Volatile.Write(ref _buttonsMask, next);
            border.Background = new SolidColorBrush(accentHex != null ? Color.FromArgb(150, resolvedAccent.R, resolvedAccent.G, resolvedAccent.B) : Color.FromArgb(140, 255, 255, 255));
            AuroraTactileFeedbackService.Instance.PlayClick();
            InputChanged?.Invoke(next);
            e.Handled = true;
        };

        border.PointerReleased += (s, e) =>
        {
            if (e.Pointer.Captured == border) e.Pointer.Capture(null);
            ClearButton();
            e.Handled = true;
        };

        border.PointerCaptureLost += (s, e) => ClearButton();
        border.PointerExited += (s, e) => ClearButton();

        return border;
    }
}
