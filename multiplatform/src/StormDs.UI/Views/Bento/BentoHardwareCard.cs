// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Controls.Primitives;
using Avalonia.Layout;
using Avalonia.Media;
using Storm.AuroraFluid.Kit.Controls;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Themes;
using StormDs.UI.Common;

namespace StormDs.UI.Views.Bento;

/// <summary>
/// Hardware & Vulkan Compatibility Monitor Bento Card.
/// Live diagnostics for probed GPU, Vulkan API tier, shader pipeline,
/// and instant "Тест прошивки FreeBIOS" button.
/// </summary>
public class BentoHardwareCard : AuroraGlassCard
{
    public BentoHardwareCard()
    {
        Height = 175;
        Margin = new Thickness(0, 0, 0, 8);
        SpotlightEnabled = true;

        var stack = new StackPanel
        {
            Margin = new Thickness(14),
            Spacing = 8
        };

        // Header with icon
        var headerRow = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 8,
            VerticalAlignment = VerticalAlignment.Center
        };

        headerRow.Children.Add(new AuroraVectorIcon
        {
            Kind = AuroraIconKind.VulkanFlame,
            Size = 18,
            VerticalAlignment = VerticalAlignment.Center
        });

        headerRow.Children.Add(new TextBlock
        {
            Text = "АППАРАТНЫЙ VULKAN МОНИТОР",
            FontSize = 10.5,
            FontWeight = FontWeight.Bold,
            Foreground = new SolidColorBrush(Color.Parse("#F59E0B")),
            VerticalAlignment = VerticalAlignment.Center
        });

        stack.Children.Add(headerRow);

        // GPU Device Name & Tier
        var gpuText = new TextBlock
        {
            Text = StormDsUiState.Instance.ProbedGpuName,
            FontSize = 13,
            FontWeight = FontWeight.SemiBold,
            Foreground = new SolidColorBrush(Color.Parse("#F8FAFC")),
            TextTrimming = TextTrimming.CharacterEllipsis
        };
        stack.Children.Add(gpuText);

        // Hardware details
        var detailsGrid = new UniformGrid
        {
            Columns = 2,
            Rows = 2
        };

        detailsGrid.Children.Add(CreateStatRow("Профиль:", StormDsUiState.Instance.VulkanTierBadge, "#10B981"));
        detailsGrid.Children.Add(CreateStatRow("Шейдеры:", "SPIR-V Ready", "#38BDF8"));
        detailsGrid.Children.Add(CreateStatRow("Память:", "Zero-Copy 4MB VRAM", "#818CF8"));
        detailsGrid.Children.Add(CreateStatRow("Задержка:", $"{StormDsUiState.Instance.AppConfig.AudioLatency} мс DSP", "#A855F7"));

        stack.Children.Add(detailsGrid);

        // FreeBIOS test button
        var testBtn = new AuroraVolumetricButton
        {
            Height = 32,
            HorizontalAlignment = HorizontalAlignment.Stretch,
            Padding = new Thickness(8, 2)
        };
        var btnStack = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 6,
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Center
        };
        btnStack.Children.Add(new AuroraVectorIcon
        {
            Kind = AuroraIconKind.SpeedGauge,
            Size = 14,
            VerticalAlignment = VerticalAlignment.Center
        });
        btnStack.Children.Add(new TextBlock
        {
            Text = "Тест прошивки FreeBIOS",
            FontSize = 11.5,
            FontWeight = FontWeight.SemiBold,
            Foreground = Brushes.White,
            VerticalAlignment = VerticalAlignment.Center
        });
        testBtn.Content = btnStack;
        testBtn.Click += (s, e) =>
        {
            StormDsUiState.Instance.StartEmulation(bootBios: true);
        };
        stack.Children.Add(testBtn);

        Content = stack;
    }

    private static StackPanel CreateStatRow(string label, string val, string hexColor)
    {
        var row = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 4,
            Margin = new Thickness(0, 2)
        };

        row.Children.Add(new TextBlock
        {
            Text = label,
            FontSize = 10.5,
            Foreground = new SolidColorBrush(Color.Parse("#94A3B8"))
        });

        row.Children.Add(new TextBlock
        {
            Text = val,
            FontSize = 10.5,
            FontWeight = FontWeight.SemiBold,
            Foreground = new SolidColorBrush(Color.Parse(hexColor)),
            TextTrimming = TextTrimming.CharacterEllipsis
        });

        return row;
    }
}
