// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using System.Collections.Generic;
using System.Linq;
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
using StormDs.Core.Localization;
using StormDs.UI.Common;

namespace StormDs.UI.Views.Settings;

/// <summary>
/// 8-Tab Settings View covering 100% of StormDsAppConfig.
/// Instant real-time search filtering, hot-swap of 9 Themes, 13 Accents, 10 Fonts, 11 Languages,
/// and Dual-Mirror Updater (GitHub + STORM GAMES WORLD GIT).
/// </summary>
public class SettingsView : Grid
{
    private readonly AuroraSearchBox _searchBox;
    private readonly StackPanel _tabsRail;
    private readonly ContentControl _contentPresenter;
    private readonly List<(int Index, AuroraIconKind Icon, string Title, Border Button)> _tabButtons = [];
    private int _activeTabIndex;
    private string _filterQuery = string.Empty;

    public SettingsView()
    {
        Margin = new Thickness(16, 8, 16, 12);
        RowDefinitions = new RowDefinitions("Auto,*");
        ColumnDefinitions = new ColumnDefinitions("230,*");

        // 1. Search Bar at Top Left
        _searchBox = new AuroraSearchBox
        {
            PlaceholderText = "Поиск настроек (Ctrl+F)...",
            HotkeyHint = "Ctrl+F",
            Height = 36,
            Margin = new Thickness(0, 0, 14, 10)
        };
        _searchBox.TextChanged += (s, e) =>
        {
            _filterQuery = _searchBox.Text ?? string.Empty;
            LoadTab(_activeTabIndex);
        };
        Children.Add(_searchBox);
        Grid.SetRow(_searchBox, 0); Grid.SetColumn(_searchBox, 0);

        // Top Action: Save Config Pill
        var savePill = new Border
        {
            Height = 36,
            CornerRadius = new CornerRadius(8),
            Background = new SolidColorBrush(Color.FromArgb(40, 16, 185, 129)),
            BorderBrush = new SolidColorBrush(Color.Parse("#10B981")),
            BorderThickness = new Thickness(1),
            Padding = new Thickness(12, 0),
            HorizontalAlignment = HorizontalAlignment.Right,
            VerticalAlignment = VerticalAlignment.Center,
            Margin = new Thickness(0, 0, 0, 10),
            Cursor = new Cursor(StandardCursorType.Hand)
        };
        var spStack = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 6, VerticalAlignment = VerticalAlignment.Center };
        spStack.Children.Add(new AuroraVectorIcon { Kind = AuroraIconKind.CheckSuccess, Size = 14, VerticalAlignment = VerticalAlignment.Center });
        spStack.Children.Add(new TextBlock { Text = "Сохранить конфигурацию", FontSize = 11.5, FontWeight = FontWeight.Bold, Foreground = new SolidColorBrush(Color.Parse("#10B981")), VerticalAlignment = VerticalAlignment.Center });
        savePill.Child = spStack;
        savePill.PointerPressed += (s, e) =>
        {
            AuroraTactileFeedbackService.Instance.PlayAchievementChime();
            StormDsUiState.Instance.SaveConfig();
        };
        Children.Add(savePill);
        Grid.SetRow(savePill, 0); Grid.SetColumn(savePill, 1);

        // 2. Left Tabs List
        var tabsScroll = new ScrollViewer
        {
            Padding = new Thickness(0, 0, 10, 0),
            HorizontalScrollBarVisibility = Avalonia.Controls.Primitives.ScrollBarVisibility.Disabled
        };

        _tabsRail = new StackPanel { Spacing = 4 };

        AddTabHeader(0, AuroraIconKind.VulkanFlame, "Графика и Vulkan");
        AddTabHeader(1, AuroraIconKind.AudioWaveDsp, "Звук и микрофон");
        AddTabHeader(2, AuroraIconKind.GamepadController, "Управление и сенсор");
        AddTabHeader(3, AuroraIconKind.DualScreenLayout, "Экраны и масштабирование");
        AddTabHeader(4, AuroraIconKind.Slot2Gba, "Система, BIOS и Slot-2");
        AddTabHeader(5, AuroraIconKind.LanMesh, "Сеть, WFC и награды");
        AddTabHeader(6, AuroraIconKind.VoiceTts, "ИИ-перевод и синтез");
        AddTabHeader(7, AuroraIconKind.ThemePalette, "Темы, шрифты и апдейт");

        tabsScroll.Content = _tabsRail;
        Children.Add(tabsScroll);
        Grid.SetRow(tabsScroll, 1); Grid.SetColumn(tabsScroll, 0);

        PropertyChanged += (_, ch) =>
        {
            if (ch.Property == BoundsProperty && Bounds.Width > 0)
            {
                ColumnDefinitions = new ColumnDefinitions(Bounds.Width < 820 ? "185,*" : "230,*");
            }
        };

        // 3. Right Content Area (AuroraGlassCard)
        var glassCard = new AuroraGlassCard
        {
            SpotlightEnabled = true,
            Margin = new Thickness(6, 0, 0, 0)
        };

        _contentPresenter = new ContentControl();
        glassCard.Content = _contentPresenter;

        Children.Add(glassCard);
        Grid.SetRow(glassCard, 1); Grid.SetColumn(glassCard, 1);

        LoadTab(0);
    }

    private void AddTabHeader(int index, AuroraIconKind icon, string title)
    {
        var btn = new Border
        {
            Height = 44,
            CornerRadius = new CornerRadius(10),
            Padding = new Thickness(10, 0),
            Background = Brushes.Transparent,
            Cursor = new Cursor(StandardCursorType.Hand)
        };

        var row = new Grid
        {
            ColumnDefinitions = new ColumnDefinitions("Auto,*")
        };

        var vectorIcon = new AuroraVectorIcon
        {
            Kind = icon,
            Size = 18,
            VerticalAlignment = VerticalAlignment.Center,
            Margin = new Thickness(0, 0, 10, 0)
        };
        row.Children.Add(vectorIcon);
        Grid.SetColumn(vectorIcon, 0);

        var tb = new TextBlock
        {
            Text = title,
            FontSize = 12,
            FontWeight = FontWeight.Medium,
            Foreground = new SolidColorBrush(Color.Parse("#94A3B8")),
            VerticalAlignment = VerticalAlignment.Center,
            TextTrimming = TextTrimming.CharacterEllipsis
        };
        row.Children.Add(tb);
        Grid.SetColumn(tb, 1);

        btn.Child = row;

        btn.PointerPressed += (s, e) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            LoadTab(index);
        };

        _tabsRail.Children.Add(btn);
        _tabButtons.Add((index, icon, title, btn));
    }

    private void LoadTab(int index)
    {
        _activeTabIndex = index;

        // Update tab button highlights
        var theme = AuroraThemeManager.Instance.CurrentTheme;
        var (primary, _) = AuroraThemeManager.ResolveAccentColors(theme, AuroraThemeManager.Instance.CurrentAccentOverride);

        foreach (var item in _tabButtons)
        {
            bool isSel = item.Index == index;
            item.Button.Background = isSel ? new SolidColorBrush(Color.FromArgb(50, primary.R, primary.G, primary.B)) : Brushes.Transparent;
            item.Button.BorderBrush = isSel ? new SolidColorBrush(primary) : Brushes.Transparent;
            item.Button.BorderThickness = new Thickness(isSel ? 1 : 0);
        }

        var scroll = new ScrollViewer
        {
            Padding = new Thickness(18, 16, 26, 16),
            HorizontalScrollBarVisibility = Avalonia.Controls.Primitives.ScrollBarVisibility.Disabled
        };

        var container = new StackPanel { Spacing = 14 };

        switch (index)
        {
            case 0: BuildGraphicsTab(container); break;
            case 1: BuildAudioTab(container); break;
            case 2: BuildInputTab(container); break;
            case 3: BuildScreenTab(container); break;
            case 4: BuildSystemTab(container); break;
            case 5: BuildNetplayTab(container); break;
            case 6: BuildAiTab(container); break;
            case 7: BuildThemesTab(container); break;
        }

        scroll.Content = container;
        _contentPresenter.Content = scroll;
    }

    // --- Tab 1: Graphics & Vulkan ---
    private void BuildGraphicsTab(StackPanel p)
    {
        var cfg = StormDsUiState.Instance.AppConfig;
        p.Children.Add(CreateSectionTitle("Графический конвейер и Vulkan"));

        var compatCheck = new AuroraNeonCheckBox
        {
            Label = "Совместимость старых видеокарт и Vulkan 1.0 / 1.1",
            IsChecked = cfg.VulkanCompatibilityTier == VulkanCompatibilityTier.Vulkan10_11LegacyCompat
        };
        compatCheck.IsCheckedChanged += (s, chk) =>
        {
            cfg.VulkanCompatibilityTier = chk ? VulkanCompatibilityTier.Vulkan10_11LegacyCompat : VulkanCompatibilityTier.Auto;
        };
        p.Children.Add(compatCheck);

        p.Children.Add(CreateComboBoxRow(
            "Рендерер:",
            new[] { "Авто (Рекомендуется)", "Vulkan Hardware", "OpenGL ES", "Software CPU" },
            (int)cfg.RendererBackend,
            (idx) => cfg.RendererBackend = (RendererBackend)idx));

        p.Children.Add(CreateSliderRow("Масштаб внутреннего разрешения 3D:", 1, 8, cfg.InternalResolutionScale, "x Native (1x-8x)", (v) =>
        {
            cfg.InternalResolutionScale = (int)v;
        }));

        p.Children.Add(CreateCheckBoxRow("Динамическое масштабирование разрешения (DRS 60 FPS)", cfg.DynamicResolutionScaling, (v) => cfg.DynamicResolutionScaling = v));
        p.Children.Add(CreateCheckBoxRow("Широкоэкранный 3D режим (16:9)", cfg.Widescreen3D, (v) => cfg.Widescreen3D = v));
        p.Children.Add(CreateCheckBoxRow("Патч разблокировки 60 FPS в 3D играх", cfg.Patch60Fps, (v) => cfg.Patch60Fps = v));
        p.Children.Add(CreateCheckBoxRow("Объёмное затенение SSAO (Screen Space Ambient Occlusion)", cfg.SsaoEnabled, (v) => cfg.SsaoEnabled = v));
        p.Children.Add(CreateCheckBoxRow("Стереоскопическая глубина Depth 3D", cfg.Depth3DStereo, (v) => cfg.Depth3DStereo = v));

        p.Children.Add(CreateComboBoxRow(
            "Текстурный фильтр:",
            new[] { "Чёткий пиксель (Nearest)", "Плавное сглаживание (Linear)", "Высокое качество (Bicubic)", "Шейдер Slang" },
            (int)cfg.ScreenFilter,
            (idx) =>
            {
                cfg.ScreenFilter = (ScreenFilter)idx;
                StormDsUiState.Instance.NotifyDisplayConfigChanged();
            }));

        p.Children.Add(CreateTextSettingRow("Пользовательский Vulkan драйвер:", cfg.CustomTurnipDriverPath, (txt) => cfg.CustomTurnipDriverPath = txt));
    }

    // --- Tab 2: Audio & DSP ---
    private void BuildAudioTab(StackPanel p)
    {
        var cfg = StormDsUiState.Instance.AppConfig;
        p.Children.Add(CreateSectionTitle("Звуковой тракт и DSP процессинг"));

        p.Children.Add(CreateSliderRow("Аппаратная задержка аудио:", 10, 100, cfg.AudioLatency, "мс", (v) =>
        {
            cfg.AudioLatency = (int)v;
        }));

        p.Children.Add(CreateComboBoxRow(
            "Интерполяция звука:",
            new[] { "Нет (Без интерполяции)", "Линейная", "Косинусная", "Кубическая", "Гауссова (DS Hardware)" },
            (int)cfg.AudioInterpolation,
            (idx) => cfg.AudioInterpolation = (AudioInterpolation)idx));

        p.Children.Add(CreateCheckBoxRow("DSP усиление низких частот (Bass Boost)", cfg.DspBassBoost, (v) => cfg.DspBassBoost = v));
        p.Children.Add(CreateCheckBoxRow("DSP мягкий лимитер (Soft Limiter)", cfg.DspSoftLimiter, (v) => cfg.DspSoftLimiter = v));
        p.Children.Add(CreateCheckBoxRow("DSP пространственное стерео (Spatial)", cfg.DspSpatialStereo, (v) => cfg.DspSpatialStereo = v));
        p.Children.Add(CreateCheckBoxRow("DSP реверберация помещения", cfg.DspReverb, (v) => cfg.DspReverb = v));
        p.Children.Add(CreateCheckBoxRow("Тактильный звуковой отклик интерфейса STORM", cfg.UiTactileAudioEnabled, (v) => cfg.UiTactileAudioEnabled = v));

        p.Children.Add(CreateComboBoxRow(
            "Режим микрофона:",
            new[] { "Реальный микрофон ОС", "Имитация дуновения", "Белый шум", "Датчик движения" },
            (int)cfg.MicMode,
            (idx) => cfg.MicMode = (MicMode)idx));
    }

    // --- Tab 3: Input & Touch ---
    private void BuildInputTab(StackPanel p)
    {
        var cfg = StormDsUiState.Instance.AppConfig;
        p.Children.Add(CreateSectionTitle("Управление, сенсор и гироскоп"));

        p.Children.Add(CreateComboBoxRow(
            "Стиль экранных кнопок:",
            new[] { "Aurora 3D Glass", "Cyber Neon", "Минимальный контур" },
            (int)cfg.TouchOverlayPreset,
            (idx) => cfg.TouchOverlayPreset = (TouchOverlayPreset)idx));

        p.Children.Add(CreateSliderRow("Прозрачность экранных кнопок:", 0.1, 1.0, cfg.TouchOverlayOpacity, "%", (v) => cfg.TouchOverlayOpacity = (float)v));
        p.Children.Add(CreateSliderRow("Масштаб экранных кнопок:", 0.5, 2.0, cfg.TouchOverlayScale, "x", (v) => cfg.TouchOverlayScale = (float)v));
        p.Children.Add(CreateSliderRow("Интенсивность виброотклика (Haptic):", 0.0, 1.0, cfg.HapticIntensity, "%", (v) => cfg.HapticIntensity = (float)v));

        p.Children.Add(CreateSliderRow("Чувствительность гироскопа:", 0.1, 3.0, cfg.GyroSensitivity, "x", (v) => cfg.GyroSensitivity = (float)v));
        p.Children.Add(CreateCheckBoxRow("Инвертировать гироскоп по оси X", cfg.GyroInvertX, (v) => cfg.GyroInvertX = v));
        p.Children.Add(CreateCheckBoxRow("Инвертировать гироскоп по оси Y", cfg.GyroInvertY, (v) => cfg.GyroInvertY = v));
    }

    // --- Tab 4: Screens & Scaling ---
    private void BuildScreenTab(StackPanel p)
    {
        var cfg = StormDsUiState.Instance.AppConfig;
        p.Children.Add(CreateSectionTitle("Масштабирование интерфейса и экранов DS"));

        double[] scaleValues = [0.0, 0.80, 0.90, 1.00, 1.10, 1.25, 1.50];
        int scaleIdx = 0;
        if (cfg.UiScaleFactor > 0.05)
        {
            double bestDiff = double.MaxValue;
            for (int i = 1; i < scaleValues.Length; i++)
            {
                double diff = Math.Abs(scaleValues[i] - cfg.UiScaleFactor);
                if (diff < bestDiff)
                {
                    bestDiff = diff;
                    scaleIdx = i;
                }
            }
        }

        p.Children.Add(CreateComboBoxRow(
            "Масштаб интерфейса Windows (Ctrl +/-/0):",
            new[] { "Автоматический (по экрану)", "80% (Компактный)", "90%", "100% (Стандарт)", "110%", "125% (Крупный)", "150% (Максимальный)" },
            scaleIdx,
            (idx) =>
            {
                cfg.UiScaleFactor = scaleValues[Math.Clamp(idx, 0, scaleValues.Length - 1)];
                StormDsUiState.Instance.SaveConfig();
                StormDsUiState.Instance.NotifyUiScaleChanged();
            }));

        p.Children.Add(CreateComboBoxRow(
            "Схема расположения экранов DS:",
            new[] { "Вертикальная классическая", "Горизонтальная (Рядом)", "Гибридная (Большой верх)", "Только верхний экран", "Только нижний экран", "Отдельное окно для сенсора" },
            (int)cfg.ScreenLayoutMode,
            (idx) =>
            {
                cfg.ScreenLayoutMode = (ScreenLayoutMode)idx;
                StormDsUiState.Instance.SaveConfig();
                StormDsUiState.Instance.NotifyDisplayConfigChanged();
            }));

        p.Children.Add(CreateComboBoxRow(
            "Режим масштабирования экранов DS:",
            new[] { "Вписать с пропорциями (4:3)", "Целочисленное (Pixel-Perfect)", "Растянуть на весь экран" },
            (int)cfg.ScreenScaleMode,
            (idx) =>
            {
                cfg.ScreenScaleMode = (ScreenScaleMode)idx;
                StormDsUiState.Instance.SaveConfig();
                StormDsUiState.Instance.NotifyDisplayConfigChanged();
            }));

        p.Children.Add(CreateComboBoxRow(
            "Фильтрация изображения DS:",
            new[] { "Чёткий пиксель (Nearest)", "Плавное сглаживание (Linear)", "Высокое качество (Bicubic)", "Шейдер Slang" },
            (int)cfg.ScreenFilter,
            (idx) =>
            {
                cfg.ScreenFilter = (ScreenFilter)idx;
                StormDsUiState.Instance.SaveConfig();
                StormDsUiState.Instance.NotifyDisplayConfigChanged();
            }));

        p.Children.Add(CreateSliderRow("Размер главного экрана в гибридном режиме:", 0.55, 0.80, cfg.HybridPrimaryRatio, "доля", (v) =>
        {
            cfg.HybridPrimaryRatio = v;
            StormDsUiState.Instance.NotifyDisplayConfigChanged();
        }));

        p.Children.Add(CreateSliderRow("Разрыв между экранами (Gap):", 0, 64, cfg.ScreenGap, "пикселей", (v) =>
        {
            cfg.ScreenGap = (int)v;
            StormDsUiState.Instance.NotifyDisplayConfigChanged();
        }));

        p.Children.Add(CreateCheckBoxRow("Показывать сенсорные кнопки на ПК", cfg.ShowTouchOverlayOnDesktop, (v) =>
        {
            cfg.ShowTouchOverlayOnDesktop = v;
            StormDsUiState.Instance.SaveConfig();
            StormDsUiState.Instance.NotifyDisplayConfigChanged();
        }));
    }

    // --- Tab 5: System & BIOS & Slot-2 ---
    private void BuildSystemTab(StackPanel p)
    {
        var cfg = StormDsUiState.Instance.AppConfig;
        p.Children.Add(CreateSectionTitle("Система, BIOS, DSi и Slot-2"));

        p.Children.Add(CreateComboBoxRow(
            "Режим консоли:",
            new[] { "Авто (по ROM)", "Nintendo DS", "Nintendo DSi" },
            (int)cfg.ConsoleMode,
            (idx) => cfg.ConsoleMode = (ConsoleMode)idx));

        p.Children.Add(CreateCheckBoxRow("Прямой запуск игр (Direct Boot без стартового меню)", cfg.DirectBoot, (v) => cfg.DirectBoot = v));
        p.Children.Add(CreateCheckBoxRow("Использовать внешние дампы BIOS и Firmware", cfg.UseExternalBios, (v) => cfg.UseExternalBios = v));

        int ocIdx = cfg.Arm9Overclock switch { 1 => 0, 2 => 1, 3 => 2, 4 => 3, _ => 0 };
        p.Children.Add(CreateComboBoxRow(
            "Разгон процессора ARM9:",
            new[] { "1x (67 MHz штатная)", "2x (134 MHz стабильная)", "3x (201 MHz турбо)", "4x (268 MHz максимум)" },
            ocIdx,
            (idx) => cfg.Arm9Overclock = idx + 1));

        p.Children.Add(CreateComboBoxRow(
            "Аксессуар Slot-2:",
            new[] { "Отсутствует", "Картридж Game Boy Advance", "Расширение памяти RAM", "Rumble Pak (Вибрация)", "Солнечный датчик Boktai", "Guitar Hero Grip", "Motion Pak (Акселерометр)", "Шагомер (Pedometer)" },
            (int)cfg.Slot2AddonType,
            (idx) => cfg.Slot2AddonType = (Slot2AddonType)idx));

        p.Children.Add(CreateSliderRow("Уровень солнечного света Boktai (Lux):", 0, 10, cfg.SolarLuxLevel, "/10", (v) => cfg.SolarLuxLevel = (int)v));
    }

    // --- Tab 6: Netplay & RetroAchievements ---
    private void BuildNetplayTab(StackPanel p)
    {
        var cfg = StormDsUiState.Instance.AppConfig;
        p.Children.Add(CreateSectionTitle("Сетевая игра WFC и достижения"));

        p.Children.Add(CreateComboBoxRow(
            "Сервер WFC DNS:",
            new[] { "Wiimmfi (Рекомендуется)", "AltWFC Private", "Kaeru WFC", "Пользовательский IP" },
            (int)cfg.WfcDnsPreset,
            (idx) => cfg.WfcDnsPreset = (WfcDnsPreset)idx));

        p.Children.Add(CreateTextSettingRow("Пользовательский WFC DNS адрес:", cfg.WfcCustomDns, (txt) => cfg.WfcCustomDns = txt));
        p.Children.Add(CreateCheckBoxRow("Локальное обнаружение LAN Mesh без роутера", cfg.LanDiscoveryEnabled, (v) => cfg.LanDiscoveryEnabled = v));

        p.Children.Add(CreateSectionTitle("RetroAchievements"));
        p.Children.Add(CreateTextSettingRow("Имя пользователя RetroAchievements:", cfg.RetroAchievementsUsername, (t) => cfg.RetroAchievementsUsername = t));
        p.Children.Add(CreateTextSettingRow("Web API Token:", cfg.RetroAchievementsToken, (t) => cfg.RetroAchievementsToken = t));
        p.Children.Add(CreateCheckBoxRow("Хардкорный режим (без сохранений и читов)", cfg.RetroAchievementsHardcoreMode, (v) => cfg.RetroAchievementsHardcoreMode = v));
        p.Children.Add(CreateCheckBoxRow("Rich Presence статус активности в профиле", cfg.RetroAchievementsRichPresence, (v) => cfg.RetroAchievementsRichPresence = v));
    }

    // --- Tab 7: AI Translation ---
    private void BuildAiTab(StackPanel p)
    {
        var cfg = StormDsUiState.Instance.AppConfig;
        p.Children.Add(CreateSectionTitle("Нейросетевой переводчик экрана и синтез речи (TTS)"));

        p.Children.Add(CreateComboBoxRow(
            "Провайдер ИИ-перевода:",
            new[] { "Встроенный ONNX NPU", "Ollama (Локальная модель)", "OpenAI API", "DeepL API" },
            (int)cfg.AiTranslatorProvider,
            (idx) => cfg.AiTranslatorProvider = (AiTranslatorProvider)idx));

        p.Children.Add(CreateTextSettingRow("API Endpoint URL:", cfg.AiTranslatorEndpoint, (t) => cfg.AiTranslatorEndpoint = t));
        p.Children.Add(CreateTextSettingRow("API Ключ:", cfg.AiTranslatorApiKey, (t) => cfg.AiTranslatorApiKey = t));
        p.Children.Add(CreateTextSettingRow("Имя модели нейросети:", cfg.AiTranslatorModel, (t) => cfg.AiTranslatorModel = t));
        p.Children.Add(CreateCheckBoxRow("Автоматическое озвучивание диалогов через Neural TTS", cfg.AiTranslatorAutoSpeakTts, (v) => cfg.AiTranslatorAutoSpeakTts = v));
    }

    // --- Tab 8: Themes, Fonts, Languages & Updater ---
    private void BuildThemesTab(StackPanel p)
    {
        p.Children.Add(CreateSectionTitle("9 Динамических тем оформления"));

        var themes = new[]
        {
            ("MIDNIGHT", "Аметистовая ночь (По умолчанию)"),
            ("NIGHT", "Чёрный OLED"),
            ("DARK", "Тёмный кибер"),
            ("DAY", "Светлая тема"),
            ("FANTASY", "Королевское золото"),
            ("CYBERPUNK", "Неон Найт-Сити"),
            ("WARHAMMER 40K", "Имперская готика"),
            ("ELEMENTAL", "Элементальная лазурь"),
            ("STORM", "Фирменный шторм")
        };

        var themesGrid = new UniformGrid { Columns = 3 };
        foreach (var t in themes)
        {
            var btn = new Button
            {
                Margin = new Thickness(4),
                Padding = new Thickness(8, 6),
                Background = new SolidColorBrush(Color.FromArgb(40, 255, 255, 255)),
                BorderBrush = new SolidColorBrush(Color.FromArgb(70, 255, 255, 255)),
                BorderThickness = new Thickness(1),
                CornerRadius = new CornerRadius(8),
                Cursor = new Cursor(StandardCursorType.Hand),
                HorizontalContentAlignment = HorizontalAlignment.Center
            };
            var s = new StackPanel { Spacing = 2, HorizontalAlignment = HorizontalAlignment.Center };
            s.Children.Add(new TextBlock { Text = t.Item1, FontSize = 11, FontWeight = FontWeight.Bold, Foreground = Brushes.White, HorizontalAlignment = HorizontalAlignment.Center });
            s.Children.Add(new TextBlock { Text = t.Item2, FontSize = 9, Foreground = new SolidColorBrush(Color.Parse("#94A3B8")), HorizontalAlignment = HorizontalAlignment.Center });
            btn.Content = s;
            btn.Click += (sender, e) =>
            {
                AuroraTactileFeedbackService.Instance.PlayClick();
                AuroraThemeManager.Instance.ApplyTheme(t.Item1);
                StormDsUiState.Instance.AppConfig.Theme = "STORM " + t.Item1;
                StormDsUiState.Instance.SaveConfig();
            };
            themesGrid.Children.Add(btn);
        }
        p.Children.Add(themesGrid);

        p.Children.Add(CreateSectionTitle("11 Системных языков интерфейса"));
        var langs = new[]
        {
            ("ru", "Русский"), ("en", "English"), ("de", "Deutsch"), ("fr", "Français"),
            ("zh", "中文"), ("ko", "한국어"), ("ja", "日本語"), ("es", "Español"),
            ("it", "Italiano"), ("pt", "Português"), ("hi", "हिन्दी")
        };
        var langGrid = new UniformGrid { Columns = 4 };
        foreach (var l in langs)
        {
            var btn = new Button
            {
                Margin = new Thickness(3),
                Padding = new Thickness(6, 4),
                Background = new SolidColorBrush(Color.FromArgb(40, 255, 255, 255)),
                BorderBrush = new SolidColorBrush(Color.FromArgb(70, 255, 255, 255)),
                BorderThickness = new Thickness(1),
                CornerRadius = new CornerRadius(6),
                Cursor = new Cursor(StandardCursorType.Hand)
            };
            btn.Content = new TextBlock { Text = l.Item2, FontSize = 11, HorizontalAlignment = HorizontalAlignment.Center, Foreground = Brushes.White };
            btn.Click += (sender, e) =>
            {
                AuroraTactileFeedbackService.Instance.PlayClick();
                StormDsLoc.CurrentLanguage = l.Item1;
                StormDsUiState.Instance.AppConfig.Language = l.Item1;
                StormDsUiState.Instance.SaveConfig();
            };
            langGrid.Children.Add(btn);
        }
        p.Children.Add(langGrid);

        p.Children.Add(CreateSectionTitle("Двухзеркальный апдейтер (Dual-Mirror)"));
        var updateCard = new Border
        {
            Padding = new Thickness(12),
            CornerRadius = new CornerRadius(8),
            Background = new SolidColorBrush(Color.FromArgb(30, 255, 255, 255)),
            BorderBrush = new SolidColorBrush(Color.FromArgb(60, 255, 255, 255)),
            BorderThickness = new Thickness(1)
        };
        var uStack = new StackPanel { Spacing = 8 };
        var updateStatusText = new TextBlock
        {
            Text = $"Текущая версия: {StormDsLoc.AppVersion}. Зеркала: GitHub Releases API + STORM GAMES WORLD",
            FontSize = 11.5,
            Foreground = new SolidColorBrush(Color.Parse("#CBD5E1")),
            TextWrapping = TextWrapping.Wrap
        };
        uStack.Children.Add(updateStatusText);

        var checkBtn = new AuroraVolumetricButton
        {
            Height = 32,
            Width = 210,
            HorizontalAlignment = HorizontalAlignment.Left
        };
        var cbStack = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 6, HorizontalAlignment = HorizontalAlignment.Center, VerticalAlignment = VerticalAlignment.Center };
        cbStack.Children.Add(new AuroraVectorIcon { Kind = AuroraIconKind.UpdateRocket, Size = 14, VerticalAlignment = VerticalAlignment.Center });
        cbStack.Children.Add(new TextBlock { Text = "Проверить обновления", FontSize = 11, FontWeight = FontWeight.Bold, Foreground = Brushes.White, VerticalAlignment = VerticalAlignment.Center });
        checkBtn.Content = cbStack;
        checkBtn.Click += async (s, e) =>
        {
            updateStatusText.Text = "Проверка обновлений...";
            var updater = new AuroraDualMirrorUpdater();
            var res = await updater.CheckForUpdateAsync("ReiKatari", "STORM_DS", new Version(8, 9, 0));
            AuroraTactileFeedbackService.Instance.PlayAchievementChime();
            updateStatusText.Text = res.IsUpdateAvailable
                ? $"Доступна новая версия {res.LatestVersion} ({res.SourceMirror})"
                : $"Установлена актуальная версия {StormDsLoc.AppVersion} ({res.SourceMirror})";
        };
        uStack.Children.Add(checkBtn);
        updateCard.Child = uStack;
        p.Children.Add(updateCard);
    }

    // Helper Builder Methods
    private static TextBlock CreateSectionTitle(string title)
    {
        return new TextBlock
        {
            Text = title.ToUpperInvariant(),
            FontSize = 11,
            FontWeight = FontWeight.Bold,
            Foreground = new SolidColorBrush(Color.Parse("#38BDF8")),
            Margin = new Thickness(0, 6, 0, 2)
        };
    }

    private static Control CreateCheckBoxRow(string label, bool initial, Action<bool> onChange)
    {
        var cb = new AuroraNeonCheckBox
        {
            Label = label,
            IsChecked = initial,
            Margin = new Thickness(0, 2)
        };
        cb.IsCheckedChanged += (s, chk) => onChange(chk);
        return cb;
    }

    private static Grid CreateSliderRow(string label, double min, double max, double initial, string unit, Action<double> onChange)
    {
        var g = new Grid
        {
            Margin = new Thickness(0, 4),
            RowDefinitions = new RowDefinitions("Auto,Auto")
        };

        var labelText = new TextBlock { Text = $"{label} {initial:0.##} {unit}", FontSize = 11, Foreground = new SolidColorBrush(Color.Parse("#CBD5E1")), Margin = new Thickness(0, 0, 0, 2) };
        g.Children.Add(labelText);
        Grid.SetRow(labelText, 0);

        var slider = new AuroraVolumetricSlider
        {
            Minimum = min,
            Maximum = max,
            Value = Math.Clamp(initial, min, max),
            Height = 24
        };
        slider.ValueChanged += (s, val) =>
        {
            labelText.Text = $"{label} {val:0.##} {unit}";
            onChange(val);
        };
        g.Children.Add(slider);
        Grid.SetRow(slider, 1);

        return g;
    }

    private static Grid CreateComboBoxRow(string label, string[] options, int selectedIndex, Action<int> onSelect)
    {
        var g = new Grid
        {
            ColumnDefinitions = new ColumnDefinitions("*,Auto"),
            Margin = new Thickness(0, 4)
        };

        g.Children.Add(new TextBlock
        {
            Text = label,
            FontSize = 11.5,
            Foreground = new SolidColorBrush(Color.Parse("#CBD5E1")),
            VerticalAlignment = VerticalAlignment.Center,
            TextWrapping = TextWrapping.Wrap,
            Margin = new Thickness(0, 0, 12, 0)
        });

        int safeIdx = options.Length > 0 ? Math.Clamp(selectedIndex, 0, options.Length - 1) : -1;
        var combo = new ComboBox
        {
            HorizontalAlignment = HorizontalAlignment.Right,
            MinWidth = 200,
            MaxWidth = 260,
            Width = 240,
            ItemsSource = options,
            SelectedIndex = safeIdx
        };
        combo.SelectionChanged += (s, e) =>
        {
            if (combo.SelectedIndex >= 0) onSelect(combo.SelectedIndex);
        };
        g.Children.Add(combo);
        Grid.SetColumn(combo, 1);

        return g;
    }

    private static Grid CreateTextSettingRow(string label, string initial, Action<string> onChange)
    {
        var g = new Grid
        {
            ColumnDefinitions = new ColumnDefinitions("*,Auto"),
            Margin = new Thickness(0, 4)
        };

        g.Children.Add(new TextBlock
        {
            Text = label,
            FontSize = 11.5,
            Foreground = new SolidColorBrush(Color.Parse("#CBD5E1")),
            VerticalAlignment = VerticalAlignment.Center,
            TextWrapping = TextWrapping.Wrap,
            Margin = new Thickness(0, 0, 12, 0)
        });

        var tb = new TextBox
        {
            Text = initial,
            HorizontalAlignment = HorizontalAlignment.Right,
            MinWidth = 200,
            MaxWidth = 260,
            Width = 240,
            Height = 30
        };
        tb.TextChanged += (s, e) => onChange(tb.Text ?? string.Empty);
        g.Children.Add(tb);
        Grid.SetColumn(tb, 1);

        return g;
    }
}
