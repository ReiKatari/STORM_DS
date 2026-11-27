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
using StormDs.UI.Common;

namespace StormDs.UI.Views.Emulation;

/// <summary>
/// Translucent Aurora Pause & Live-Tuning Overlay (ESC).
/// Supports Save/Load per slot, lid hinge toggle, mic blow, rewind, AI translation, and cheats.
/// </summary>
public class EmulationPauseOverlay : Border
{
    public event Action? ResumeRequested;
    public event Action? SwapScreensRequested;
    public event Action? DetachScreenRequested;
    public event Action? StopEmulationRequested;
    public event Action? TranslateFrameRequested;
    public event Action? CheatsRequested;
    public event Action? ToggleLidRequested;
    public event Action? MicBlowRequested;
    public event Action<int>? SaveSlotRequested;
    public event Action<int>? LoadSlotRequested;
    public event Action? RewindRequested;

    public EmulationPauseOverlay()
    {
        Background = new SolidColorBrush(Color.FromArgb(210, 10, 12, 20));
        HorizontalAlignment = HorizontalAlignment.Stretch;
        VerticalAlignment = VerticalAlignment.Stretch;

        var centerCard = new AuroraGlassCard
        {
            Width = 540,
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Center,
            Padding = new Thickness(24, 20),
            SpotlightEnabled = true
        };

        var stack = new StackPanel { Spacing = 14 };

        var headerRow = new Grid { ColumnDefinitions = new ColumnDefinitions("*,Auto") };
        var titleStack = new StackPanel { Spacing = 2 };
        var titleBlock = new TextBlock
        {
            Text = "ПАУЗА ЭМУЛЯЦИИ",
            FontSize = 16,
            FontWeight = FontWeight.Bold,
            Foreground = StormThemeBrushes.Accent
        };
        var subBlock = new TextBlock
        {
            Text = "Нажмите ESC для быстрого возврата в игру",
            FontSize = 11,
            Foreground = StormThemeBrushes.SecondaryText
        };
        titleStack.Children.Add(titleBlock);
        titleStack.Children.Add(subBlock);
        headerRow.Children.Add(titleStack);

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
        stack.Children.Add(new Border { Height = 1, Background = StormThemeBrushes.SubtleBorder });

        var slotsLabel = new TextBlock
        {
            Text = "БЫСТРЫЕ СОХРАНЕНИЯ И ЗАГРУЗКА (СЛОТЫ 1..4)",
            FontSize = 10,
            FontWeight = FontWeight.Bold,
            Foreground = StormThemeBrushes.BodyText
        };
        stack.Children.Add(slotsLabel);

        var slotsGrid = new UniformGrid { Columns = 4 };
        for (int i = 0; i < 4; i++)
        {
            int slot = i;
            var card = new Border
            {
                Margin = new Thickness(3),
                Padding = new Thickness(6),
                Background = StormThemeBrushes.RowSurface,
                BorderBrush = StormThemeBrushes.SubtleBorder,
                BorderThickness = new Thickness(1),
                CornerRadius = new CornerRadius(8)
            };

            var sPanel = new StackPanel { Spacing = 4 };
            sPanel.Children.Add(new TextBlock
            {
                Text = $"Слот {slot + 1}",
                FontSize = 11,
                FontWeight = FontWeight.Bold,
                Foreground = StormThemeBrushes.PrimaryText,
                HorizontalAlignment = HorizontalAlignment.Center
            });

            var btnRow = new Grid { ColumnDefinitions = new ColumnDefinitions("*,*"), ColumnSpacing = 4 };
            var saveBtn = CreateMiniSlotButton("Сохр.", Color.Parse("#10B981"), () =>
            {
                if (SaveSlotRequested != null) SaveSlotRequested(slot);
                else StormDsUiState.Instance.EngineService.SaveState(slot);
            });
            var loadBtn = CreateMiniSlotButton("Загр.", Color.Parse("#38BDF8"), () =>
            {
                if (!StormDsUiState.Instance.RetroAchievementsService.IsFeatureAllowedInCurrentMode("loadstate"))
                {
                    StormDsUiState.Instance.NotifyStatus("Загрузка состояний заблокирована в Hardcore-режиме");
                    return;
                }
                if (LoadSlotRequested != null) LoadSlotRequested(slot);
                else StormDsUiState.Instance.EngineService.LoadState(slot);
            });
            btnRow.Children.Add(saveBtn);
            btnRow.Children.Add(loadBtn);
            Grid.SetColumn(loadBtn, 1);

            sPanel.Children.Add(btnRow);
            card.Child = sPanel;
            slotsGrid.Children.Add(card);
        }
        stack.Children.Add(slotsGrid);

        var tuningGrid = new UniformGrid { Columns = 2 };
        tuningGrid.Children.Add(CreateActionTile(AuroraIconKind.SwapScreens, "Сменить экраны (Tab)", "Поменять местами верх и низ", () => SwapScreensRequested?.Invoke()));
        tuningGrid.Children.Add(CreateActionTile(AuroraIconKind.DetachWindow, "Открепить 2-й экран", "Полноэкранный сенсор в окно", () => DetachScreenRequested?.Invoke()));
        tuningGrid.Children.Add(CreateActionTile(AuroraIconKind.MicPulse, "Дунуть в микрофон", "Имитировать поток воздуха (M)", () =>
        {
            if (MicBlowRequested != null) MicBlowRequested();
            else StormDsUiState.Instance.EngineService.TriggerMicBlowBurst();
        }));
        tuningGrid.Children.Add(CreateActionTile(AuroraIconKind.LidHinge, "Закрыть/открыть крышку", "Спящий режим NDS (L)", () =>
        {
            ToggleLidRequested?.Invoke();
        }));
        tuningGrid.Children.Add(CreateActionTile(AuroraIconKind.AiTranslatorSpark, "ИИ-перевод кадра", "Захват экрана и перевод (T)", () => TranslateFrameRequested?.Invoke()));
        tuningGrid.Children.Add(CreateActionTile(AuroraIconKind.CheatMatrix, "Читы ActionReplay", "Активация чит-кодов", () => CheatsRequested?.Invoke()));

        stack.Children.Add(tuningGrid);

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
        rwStack.Children.Add(new TextBlock { Text = "Перемотка назад", FontSize = 11, Foreground = new SolidColorBrush(Color.Parse("#94A3B8")), VerticalAlignment = VerticalAlignment.Center });
        rewindBtn.Content = rwStack;
        rewindBtn.Click += (s, e) =>
        {
            if (!StormDsUiState.Instance.RetroAchievementsService.IsFeatureAllowedInCurrentMode("rewind"))
            {
                StormDsUiState.Instance.NotifyStatus("Перемотка недоступна в Hardcore-режиме");
                return;
            }
            if (RewindRequested != null) RewindRequested();
            else StormDsUiState.Instance.EngineService.PopRewind();
        };
        bottomRow.Children.Add(rewindBtn);

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

    private static Button CreateMiniSlotButton(string text, Color accent, Action onClick)
    {
        var btn = new Button
        {
            Height = 24,
            Padding = new Thickness(4, 1),
            Background = new SolidColorBrush(Color.FromArgb(45, accent.R, accent.G, accent.B)),
            BorderBrush = new SolidColorBrush(Color.FromArgb(120, accent.R, accent.G, accent.B)),
            BorderThickness = new Thickness(1),
            CornerRadius = new CornerRadius(5),
            Cursor = new Cursor(StandardCursorType.Hand),
            HorizontalAlignment = HorizontalAlignment.Stretch,
            HorizontalContentAlignment = HorizontalAlignment.Center,
            VerticalContentAlignment = VerticalAlignment.Center,
            Content = new TextBlock { Text = text, FontSize = 9.5, FontWeight = FontWeight.Bold, Foreground = StormThemeBrushes.PrimaryText }
        };
        btn.Click += (s, e) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            onClick();
        };
        return btn;
    }

    private static Border CreateActionTile(AuroraIconKind icon, string title, string sub, Action onClick)
    {
        var border = new Border
        {
            Margin = new Thickness(4),
            Padding = new Thickness(8, 6),
            CornerRadius = new CornerRadius(8),
            Background = StormThemeBrushes.RowSurface,
            BorderBrush = StormThemeBrushes.SubtleBorder,
            BorderThickness = new Thickness(1),
            Cursor = new Cursor(StandardCursorType.Hand)
        };

        var row = new Grid { ColumnDefinitions = new ColumnDefinitions("Auto,*") };
        row.Children.Add(new AuroraVectorIcon
        {
            Kind = icon,
            Size = 18,
            VerticalAlignment = VerticalAlignment.Center,
            Margin = new Thickness(0, 0, 8, 0)
        });

        var textStack = new StackPanel { VerticalAlignment = VerticalAlignment.Center };
        textStack.Children.Add(new TextBlock { Text = title, FontSize = 11, FontWeight = FontWeight.Bold, Foreground = StormThemeBrushes.PrimaryText });
        textStack.Children.Add(new TextBlock { Text = sub, FontSize = 9.5, Foreground = StormThemeBrushes.SecondaryText, TextTrimming = TextTrimming.CharacterEllipsis });
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
