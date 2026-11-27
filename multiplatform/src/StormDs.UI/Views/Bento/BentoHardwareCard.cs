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
            Foreground = new SolidColorBrush(Color.Parse("#D97706")),
            VerticalAlignment = VerticalAlignment.Center
        });

        stack.Children.Add(headerRow);

        // GPU Device Name & Tier
        var gpuText = new TextBlock
        {
            Text = StormDsUiState.Instance.ProbedGpuName,
            FontSize = 13,
            FontWeight = FontWeight.SemiBold,
            TextTrimming = TextTrimming.CharacterEllipsis
        };
        stack.Children.Add(gpuText);

        // Hardware details
        var detailsGrid = new UniformGrid
        {
            Columns = 2,
            Rows = 2
        };

        var statLabels = new List<TextBlock>();
        var profileValText = new TextBlock
        {
            Text = StormDsUiState.Instance.VulkanTierBadge,
            FontSize = 10.5,
            FontWeight = FontWeight.SemiBold,
            Foreground = new SolidColorBrush(Color.Parse("#10B981")),
            TextTrimming = TextTrimming.CharacterEllipsis
        };
        var latValText = new TextBlock
        {
            Text = $"{StormDsUiState.Instance.AppConfig.AudioLatency} мс DSP",
            FontSize = 10.5,
            FontWeight = FontWeight.SemiBold,
            Foreground = new SolidColorBrush(Color.Parse("#A855F7")),
            TextTrimming = TextTrimming.CharacterEllipsis
        };
        detailsGrid.Children.Add(CreateStatRow("Профиль:", profileValText, statLabels));
        detailsGrid.Children.Add(CreateStatRow("Шейдеры:", new TextBlock { Text = "SPIR-V Ready", FontSize = 10.5, FontWeight = FontWeight.SemiBold, Foreground = new SolidColorBrush(Color.Parse("#0284C7")) }, statLabels));
        detailsGrid.Children.Add(CreateStatRow("Память:", new TextBlock { Text = "Zero-Copy 4MB VRAM", FontSize = 10.5, FontWeight = FontWeight.SemiBold, Foreground = new SolidColorBrush(Color.Parse("#6366F1")) }, statLabels));
        detailsGrid.Children.Add(CreateStatRow("Задержка:", latValText, statLabels));

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
        var testBtnText = new TextBlock
        {
            Text = "Тест прошивки FreeBIOS",
            FontSize = 11.5,
            FontWeight = FontWeight.SemiBold,
            VerticalAlignment = VerticalAlignment.Center
        };
        btnStack.Children.Add(testBtnText);
        testBtn.Content = btnStack;
        testBtn.Click += (s, e) =>
        {
            StormDsUiState.Instance.StartEmulation(bootBios: true);
        };
        stack.Children.Add(testBtn);

        Content = stack;

        void RefreshStats()
        {
            profileValText.Text = StormDsUiState.Instance.VulkanTierBadge;
            latValText.Text = $"{StormDsUiState.Instance.AppConfig.AudioLatency} мс DSP";
        }

        StormDsUiState.Instance.SettingsSaved += RefreshStats;
        StormDsUiState.Instance.DisplayConfigChanged += RefreshStats;

        StormThemeBrushes.BindTheme(this, () =>
        {
            gpuText.Foreground = StormThemeBrushes.PrimaryText;
            testBtnText.Foreground = StormThemeBrushes.PrimaryText;
            foreach (var lbl in statLabels)
            {
                lbl.Foreground = StormThemeBrushes.SecondaryText;
            }
        });
    }

    private static StackPanel CreateStatRow(string label, TextBlock valueBlock, List<TextBlock> statLabels)
    {
        var row = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 4,
            Margin = new Thickness(0, 2)
        };

        var lbl = new TextBlock
        {
            Text = label,
            FontSize = 10.5,
            Foreground = StormThemeBrushes.SecondaryText
        };
        statLabels.Add(lbl);
        row.Children.Add(lbl);
        row.Children.Add(valueBlock);
        return row;
    }
}
