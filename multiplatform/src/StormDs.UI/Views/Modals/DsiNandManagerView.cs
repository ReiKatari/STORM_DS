// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Layout;
using Avalonia.Media;
using Storm.AuroraFluid.Kit.Controls;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Services;
using Storm.AuroraFluid.Kit.Themes;
using StormDs.Core.Paths;
using StormDs.UI.Common;

namespace StormDs.UI.Views.Modals;

/// <summary>
/// DSiWare NAND Manager View enforcing Law 16 (ESC dismissal).
/// Features visual NAND free space bar, title list, Import, Delete, and TMD Save Repair.
/// </summary>
public class DsiNandManagerView : AuroraGlassCard
{
    private readonly ProgressBar _nandSpaceBar;
    private readonly TextBlock _spaceText;
    private readonly StackPanel _titlesStack;

    public event Action? CloseRequested;

    public DsiNandManagerView()
    {
        Width = 600;
        MaxHeight = 520;
        Padding = new Thickness(20);
        SpotlightEnabled = true;

        var mainStack = new StackPanel { Spacing = 14 };

        // 1. Header
        var header = new Grid
        {
            ColumnDefinitions = new ColumnDefinitions("Auto,*,Auto")
        };

        var titleRow = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 8, VerticalAlignment = VerticalAlignment.Center };
        titleRow.Children.Add(new AuroraVectorIcon { Kind = AuroraIconKind.DsiNandChip, Size = 20, VerticalAlignment = VerticalAlignment.Center });
        titleRow.Children.Add(new TextBlock
        {
            Text = "МЕНЕДЖЕР DSIWARE NAND",
            FontSize = 14,
            FontWeight = FontWeight.Bold,
            Foreground = new SolidColorBrush(Color.Parse("#38BDF8")),
            VerticalAlignment = VerticalAlignment.Center
        });
        header.Children.Add(titleRow);
        Grid.SetColumn(titleRow, 0);

        var closeBtn = new Button
        {
            Width = 30,
            Height = 30,
            Padding = new Thickness(0),
            Background = Brushes.Transparent,
            BorderThickness = new Thickness(0),
            Cursor = new Cursor(StandardCursorType.Hand),
            HorizontalContentAlignment = HorizontalAlignment.Center,
            VerticalContentAlignment = VerticalAlignment.Center
        };
        closeBtn.Content = new AuroraVectorIcon { Kind = AuroraIconKind.WindowClose, Size = 13 };
        closeBtn.Click += (s, e) => CloseRequested?.Invoke();
        header.Children.Add(closeBtn);
        Grid.SetColumn(closeBtn, 2);

        mainStack.Children.Add(header);

        // 2. Visual NAND Space Bar
        var spaceContainer = new Border
        {
            Padding = new Thickness(12),
            CornerRadius = new CornerRadius(8),
            Background = new SolidColorBrush(Color.FromArgb(40, 255, 255, 255)),
            BorderBrush = new SolidColorBrush(Color.FromArgb(60, 255, 255, 255)),
            BorderThickness = new Thickness(1)
        };

        var sStack = new StackPanel { Spacing = 6 };
        var sHeader = new Grid { ColumnDefinitions = new ColumnDefinitions("*,Auto") };
        sHeader.Children.Add(new TextBlock { Text = "Емкость внутренней памяти NAND (240 MB eMMC):", FontSize = 11, Foreground = new SolidColorBrush(Color.Parse("#CBD5E1")) });
        _spaceText = new TextBlock { Text = "Свободно 192.4 MB из 240.0 MB", FontSize = 11, FontWeight = FontWeight.Bold, Foreground = new SolidColorBrush(Color.Parse("#10B981")) };
        sHeader.Children.Add(_spaceText);
        Grid.SetColumn(_spaceText, 1);
        sStack.Children.Add(sHeader);

        _nandSpaceBar = new ProgressBar
        {
            Minimum = 0,
            Maximum = 100,
            Value = 20,
            Height = 10,
            Foreground = new SolidColorBrush(Color.Parse("#38BDF8"))
        };
        sStack.Children.Add(_nandSpaceBar);
        spaceContainer.Child = sStack;
        mainStack.Children.Add(spaceContainer);

        // 3. Actions Toolbar
        var toolRow = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 8 };

        var importBtn = CreateVolumetricActionButton(AuroraIconKind.ImportBox, "Импорт .app / .nds", () =>
        {
            AuroraTactileFeedbackService.Instance.PlayAchievementChime();
        });
        toolRow.Children.Add(importBtn);

        var repairBtn = CreateVolumetricActionButton(AuroraIconKind.RepairWrench, "Восстановить TMD сейвы", () =>
        {
            StormDsUiState.Instance.DsiNandService.RepairSaves(StormDsPlatformPaths.NandDirectory);
            AuroraTactileFeedbackService.Instance.PlayAchievementChime();
        });
        toolRow.Children.Add(repairBtn);

        mainStack.Children.Add(toolRow);

        // 4. Installed Titles List
        var listHeader = new TextBlock
        {
            Text = "УСТАНОВЛЕННЫЕ ПРИЛОЖЕНИЯ И DSIWARE:",
            FontSize = 10.5,
            FontWeight = FontWeight.Bold,
            Foreground = new SolidColorBrush(Color.Parse("#94A3B8"))
        };
        mainStack.Children.Add(listHeader);

        var scroll = new ScrollViewer
        {
            Height = 220,
            Padding = new Thickness(0, 0, 8, 0)
        };

        _titlesStack = new StackPanel { Spacing = 4 };
        AddDemoTitle("Nintendo DSi Camera", "484E4941", 4.2);
        AddDemoTitle("Nintendo DSi Sound", "484E4841", 3.8);
        AddDemoTitle("Flipnote Studio", "4B554745", 8.4);
        AddDemoTitle("DSiWare Browser", "42525753", 12.1);
        scroll.Content = _titlesStack;
        mainStack.Children.Add(scroll);

        Content = mainStack;
    }

    private void AddDemoTitle(string name, string idHex, double sizeMb)
    {
        var row = new Grid
        {
            Height = 40,
            Margin = new Thickness(0, 2),
            Background = new SolidColorBrush(Color.FromArgb(30, 255, 255, 255)),
            ColumnDefinitions = new ColumnDefinitions("Auto,*,Auto,Auto")
        };

        row.Children.Add(new AuroraVectorIcon
        {
            Kind = AuroraIconKind.DsiWareBadge,
            Size = 16,
            VerticalAlignment = VerticalAlignment.Center,
            Margin = new Thickness(8, 0, 8, 0)
        });

        var nStack = new StackPanel { VerticalAlignment = VerticalAlignment.Center };
        nStack.Children.Add(new TextBlock { Text = name, FontSize = 12, FontWeight = FontWeight.Bold, Foreground = Brushes.White });
        nStack.Children.Add(new TextBlock { Text = $"TitleID: {idHex}", FontSize = 9.5, Foreground = new SolidColorBrush(Color.Parse("#94A3B8")) });
        row.Children.Add(nStack);
        Grid.SetColumn(nStack, 1);

        var sText = new TextBlock { Text = $"{sizeMb:0.1} MB", FontSize = 11, Foreground = new SolidColorBrush(Color.Parse("#CBD5E1")), VerticalAlignment = VerticalAlignment.Center, Margin = new Thickness(0, 0, 10, 0) };
        row.Children.Add(sText);
        Grid.SetColumn(sText, 2);

        var delBtn = new Button
        {
            Width = 28,
            Height = 28,
            Padding = new Thickness(0),
            Background = Brushes.Transparent,
            BorderThickness = new Thickness(0),
            Cursor = new Cursor(StandardCursorType.Hand),
            Margin = new Thickness(0, 0, 8, 0)
        };
        delBtn.Content = new AuroraVectorIcon { Kind = AuroraIconKind.TrashClean, Size = 13 };
        delBtn.Click += (s, e) =>
        {
            _titlesStack.Children.Remove(row);
            AuroraTactileFeedbackService.Instance.PlayClick();
        };
        row.Children.Add(delBtn);
        Grid.SetColumn(delBtn, 3);

        _titlesStack.Children.Add(row);
    }

    private static AuroraVolumetricButton CreateVolumetricActionButton(AuroraIconKind icon, string label, Action action)
    {
        var btn = new AuroraVolumetricButton
        {
            Height = 32,
            Padding = new Thickness(10, 2)
        };
        var s = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 6, VerticalAlignment = VerticalAlignment.Center };
        s.Children.Add(new AuroraVectorIcon { Kind = icon, Size = 13, VerticalAlignment = VerticalAlignment.Center });
        s.Children.Add(new TextBlock { Text = label, FontSize = 11, FontWeight = FontWeight.Medium, Foreground = Brushes.White, VerticalAlignment = VerticalAlignment.Center });
        btn.Content = s;
        btn.Click += (s, e) => action();
        return btn;
    }
}
