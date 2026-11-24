// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Controls.Primitives;
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
/// Translucent Aurora Pause & Live-Tuning Overlay (ESC).
/// Instant live sliders and toggles right over the paused frame.
/// </summary>
public class EmulationPauseOverlay : Border
{
    public event Action? ResumeRequested;
    public event Action? SwapScreensRequested;
    public event Action? DetachScreenRequested;
    public event Action? StopEmulationRequested;
    public event Action? TranslateFrameRequested;
    public event Action? CheatsRequested;

    public EmulationPauseOverlay()
    {
        Background = new SolidColorBrush(Color.FromArgb(210, 10, 12, 20));
        HorizontalAlignment = HorizontalAlignment.Stretch;
        VerticalAlignment = VerticalAlignment.Stretch;

        var centerCard = new AuroraGlassCard
        {
            Width = 520,
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Center,
            Padding = new Thickness(24, 20),
            SpotlightEnabled = true
        };

        var stack = new StackPanel
        {
            Spacing = 14
        };

        // Header
        var headerRow = new Grid
        {
            ColumnDefinitions = new ColumnDefinitions("*,Auto")
        };

        var titleStack = new StackPanel { Spacing = 2 };
        titleStack.Children.Add(new TextBlock
        {
            Text = "ПАУЗА ЭМУЛЯЦИИ",
            FontSize = 16,
            FontWeight = FontWeight.Bold,
            Foreground = new SolidColorBrush(Color.Parse("#38BDF8"))
        });
        titleStack.Children.Add(new TextBlock
        {
            Text = "Нажмите ESC для быстрого возврата в игру",
            FontSize = 11,
            Foreground = new SolidColorBrush(Color.Parse("#94A3B8"))
        });
        headerRow.Children.Add(titleStack);
        Grid.SetColumn(titleStack, 0);

        var resumeBtn = new AuroraVolumetricButton
        {
            IsHero = true,
            Height = 36,
            Width = 140
        };
        var resContent = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 6,
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Center
        };
        resContent.Children.Add(new AuroraVectorIcon { Kind = AuroraIconKind.PlayPrism, Size = 14, VerticalAlignment = VerticalAlignment.Center });
        resContent.Children.Add(new TextBlock { Text = "Продолжить", FontSize = 12, FontWeight = FontWeight.Bold, Foreground = Brushes.White, VerticalAlignment = VerticalAlignment.Center });
        resumeBtn.Content = resContent;
        resumeBtn.Click += (s, e) => ResumeRequested?.Invoke();
        headerRow.Children.Add(resumeBtn);
        Grid.SetColumn(resumeBtn, 1);

        stack.Children.Add(headerRow);

        // Separator
        stack.Children.Add(new Border { Height = 1, Background = new SolidColorBrush(Color.FromArgb(40, 255, 255, 255)) });

        // Save / Load Slots Row (Slots 1..4)
        var slotsLabel = new TextBlock
        {
            Text = "БЫСТРЫЕ СОХРАНЕНИЯ (СЛОТЫ 1..4)",
            FontSize = 10,
            FontWeight = FontWeight.Bold,
            Foreground = new SolidColorBrush(Color.Parse("#CBD5E1"))
        };
        stack.Children.Add(slotsLabel);

        var slotsGrid = new UniformGrid { Columns = 4 };
        for (int i = 0; i < 4; i++)
        {
            int slot = i;
            var slotBtn = new Button
            {
                Margin = new Thickness(3),
                Padding = new Thickness(6, 6),
                Background = new SolidColorBrush(Color.FromArgb(50, 255, 255, 255)),
                BorderBrush = new SolidColorBrush(Color.FromArgb(80, 255, 255, 255)),
                BorderThickness = new Thickness(1),
                CornerRadius = new CornerRadius(8),
                Cursor = new Cursor(StandardCursorType.Hand),
                HorizontalContentAlignment = HorizontalAlignment.Center
            };
            var sPanel = new StackPanel { Spacing = 2, HorizontalAlignment = HorizontalAlignment.Center };
            sPanel.Children.Add(new TextBlock { Text = $"Слот {slot + 1}", FontSize = 11, FontWeight = FontWeight.Bold, Foreground = Brushes.White, HorizontalAlignment = HorizontalAlignment.Center });
            sPanel.Children.Add(new TextBlock { Text = "Сохранить", FontSize = 9, Foreground = new SolidColorBrush(Color.Parse("#38BDF8")), HorizontalAlignment = HorizontalAlignment.Center });
            slotBtn.Content = sPanel;
            slotBtn.Click += (s, e) =>
            {
                AuroraTactileFeedbackService.Instance.PlayClick();
                StormDsUiState.Instance.EngineService.SaveState(slot);
            };
            slotsGrid.Children.Add(slotBtn);
        }
        stack.Children.Add(slotsGrid);

        // Live Tuning Controls Grid (2 columns)
        var tuningGrid = new UniformGrid { Columns = 2 };

        // 1. Swap Screens
        tuningGrid.Children.Add(CreateActionTile(AuroraIconKind.SwapScreens, "Сменить экраны (Tab)", "Поменять местами верх и низ", () => SwapScreensRequested?.Invoke()));

        // 2. Detach 2nd Screen
        tuningGrid.Children.Add(CreateActionTile(AuroraIconKind.DetachWindow, "Открепить 2-й экран", "Полноэкранный сенсор в окно", () => DetachScreenRequested?.Invoke()));

        // 3. Simulated Mic Blow
        tuningGrid.Children.Add(CreateActionTile(AuroraIconKind.MicPulse, "Дунуть в микрофон", "Имитировать поток воздуха", () =>
        {
            StormDsUiState.Instance.EngineService.SetMicState(MicMode.SimulatedBlow);
            AuroraTactileFeedbackService.Instance.PlayClick();
        }));

        // 4. Lid Hinge Close/Open
        tuningGrid.Children.Add(CreateActionTile(AuroraIconKind.LidHinge, "Закрыть/открыть крышку", "Спящий режим NDS", () =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
        }));

        // 5. AI Translation
        tuningGrid.Children.Add(CreateActionTile(AuroraIconKind.AiTranslatorSpark, "ИИ-перевод кадра", "OCR экрана и моментальный перевод", () => TranslateFrameRequested?.Invoke()));

        // 6. Cheats
        tuningGrid.Children.Add(CreateActionTile(AuroraIconKind.CheatMatrix, "Читы ActionReplay", "Активация чит-кодов", () => CheatsRequested?.Invoke()));

        stack.Children.Add(tuningGrid);

        // Bottom Exit Row
        var bottomRow = new Grid
        {
            ColumnDefinitions = new ColumnDefinitions("*,Auto"),
            Margin = new Thickness(0, 6, 0, 0)
        };

        var rewindBtn = new Button
        {
            Background = Brushes.Transparent,
            BorderThickness = new Thickness(0),
            Cursor = new Cursor(StandardCursorType.Hand)
        };
        var rwStack = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 6 };
        rwStack.Children.Add(new AuroraVectorIcon { Kind = AuroraIconKind.RewindVortex, Size = 15, VerticalAlignment = VerticalAlignment.Center });
        rwStack.Children.Add(new TextBlock { Text = "Перемотка назад (Backspace)", FontSize = 11, Foreground = new SolidColorBrush(Color.Parse("#94A3B8")), VerticalAlignment = VerticalAlignment.Center });
        rewindBtn.Content = rwStack;
        rewindBtn.Click += (s, e) => StormDsUiState.Instance.EngineService.PopRewind();
        bottomRow.Children.Add(rewindBtn);
        Grid.SetColumn(rewindBtn, 0);

        var exitBtn = new AuroraVolumetricButton
        {
            Height = 32,
            Width = 160,
            Padding = new Thickness(8, 2)
        };
        var exStack = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 6,
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Center
        };
        exStack.Children.Add(new AuroraVectorIcon { Kind = AuroraIconKind.StopOctagon, Size = 13, VerticalAlignment = VerticalAlignment.Center });
        exStack.Children.Add(new TextBlock { Text = "Выйти в библиотеку", FontSize = 11, FontWeight = FontWeight.SemiBold, Foreground = new SolidColorBrush(Color.Parse("#EF4444")), VerticalAlignment = VerticalAlignment.Center });
        exitBtn.Content = exStack;
        exitBtn.Click += (s, e) => StopEmulationRequested?.Invoke();
        bottomRow.Children.Add(exitBtn);
        Grid.SetColumn(exitBtn, 1);

        stack.Children.Add(bottomRow);

        centerCard.Content = stack;
        Child = centerCard;
    }

    private static Border CreateActionTile(AuroraIconKind icon, string title, string sub, Action onClick)
    {
        var border = new Border
        {
            Margin = new Thickness(4),
            Padding = new Thickness(8, 6),
            CornerRadius = new CornerRadius(8),
            Background = new SolidColorBrush(Color.FromArgb(40, 255, 255, 255)),
            BorderBrush = new SolidColorBrush(Color.FromArgb(60, 255, 255, 255)),
            BorderThickness = new Thickness(1),
            Cursor = new Cursor(StandardCursorType.Hand)
        };

        var row = new Grid
        {
            ColumnDefinitions = new ColumnDefinitions("Auto,*")
        };

        row.Children.Add(new AuroraVectorIcon
        {
            Kind = icon,
            Size = 18,
            VerticalAlignment = VerticalAlignment.Center,
            Margin = new Thickness(0, 0, 8, 0)
        });

        var textStack = new StackPanel { VerticalAlignment = VerticalAlignment.Center };
        textStack.Children.Add(new TextBlock { Text = title, FontSize = 11, FontWeight = FontWeight.Bold, Foreground = Brushes.White });
        textStack.Children.Add(new TextBlock { Text = sub, FontSize = 9.5, Foreground = new SolidColorBrush(Color.Parse("#94A3B8")), TextTrimming = TextTrimming.CharacterEllipsis });
        row.Children.Add(textStack);
        Grid.SetColumn(textStack, 1);

        border.Child = row;
        border.PointerPressed += (s, e) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            onClick();
        };

        return border;
    }
}
