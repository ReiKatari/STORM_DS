// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using Avalonia;
using Avalonia.Controls;
using Avalonia.Layout;
using Avalonia.Media;
using Storm.AuroraFluid.Kit.Icons;

namespace StormDs.UI.Views.Modals;

/// <summary>
/// Glowing drop overlay indicating active Everywhere Drag-and-Drop file import.
/// </summary>
public class DropImportOverlay : Border
{
    public DropImportOverlay()
    {
        Background = new SolidColorBrush(Color.FromArgb(200, 10, 15, 25));
        HorizontalAlignment = HorizontalAlignment.Stretch;
        VerticalAlignment = VerticalAlignment.Stretch;
        IsHitTestVisible = false;

        var centerBorder = new Border
        {
            Width = 400,
            Height = 220,
            CornerRadius = new CornerRadius(16),
            Background = new SolidColorBrush(Color.FromArgb(80, 56, 189, 248)),
            BorderBrush = new SolidColorBrush(Color.Parse("#38BDF8")),
            BorderThickness = new Thickness(2),
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Center
        };

        var stack = new StackPanel
        {
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Center,
            Spacing = 10
        };

        stack.Children.Add(new AuroraVectorIcon
        {
            Kind = AuroraIconKind.ImportBox,
            Size = 48,
            HorizontalAlignment = HorizontalAlignment.Center
        });

        stack.Children.Add(new TextBlock
        {
            Text = "ОТПУСТИТЕ ФАЙЛЫ ДЛЯ ИМПОРТА",
            FontSize = 14,
            FontWeight = FontWeight.Bold,
            Foreground = Brushes.White,
            HorizontalAlignment = HorizontalAlignment.Center
        });

        stack.Children.Add(new TextBlock
        {
            Text = "Поддерживаются .nds, .dsi, .srl, .zip и папки с играми",
            FontSize = 11,
            Foreground = new SolidColorBrush(Color.Parse("#CBD5E1")),
            HorizontalAlignment = HorizontalAlignment.Center
        });

        centerBorder.Child = stack;
        Child = centerBorder;
    }
}
