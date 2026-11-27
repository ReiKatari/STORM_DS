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
using Avalonia.Platform.Storage;
using Avalonia.Threading;
using Storm.AuroraFluid.Kit.Controls;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Services;
using Storm.AuroraFluid.Kit.Themes;
using StormDs.Core.Configuration;
using StormDs.Core.Input;
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
    private readonly TextBlock _savedFeedbackText;
    private readonly List<(int Index, AuroraIconKind Icon, string Title, Border Button)> _tabButtons = [];
    private int _activeTabIndex;
    private string _filterQuery = string.Empty;
    private string? _listeningBindTarget;
    private bool _listeningIsHotkey;
    private Button? _listeningButton;

    public void FocusSearchBox() => _searchBox.Focus();
    public void SelectTab(int index) => LoadTab(Math.Clamp(index, 0, Math.Max(0, _tabButtons.Count - 1)));

    public SettingsView()
    {
        Margin = new Thickness(16, 8, 16, 12);
        RowDefinitions = new RowDefinitions("Auto,*");
        ColumnDefinitions = new ColumnDefinitions("268,*");

        // 1. Full-Width Top Bar: Stretched Search Box + Save Configuration Pill
        var topBar = new Grid
        {
            ColumnDefinitions = new ColumnDefinitions("*,Auto"),
            ColumnSpacing = 14,
            Margin = new Thickness(0, 0, 0, 12)
        };

        _searchBox = new AuroraSearchBox
        {
            PlaceholderText = "Поиск настроек (Ctrl+F)...",
            HotkeyHint = "Ctrl+F",
            Height = 36,
            HorizontalAlignment = HorizontalAlignment.Stretch
        };
        _searchBox.TextChanged += (s, e) =>
        {
            _filterQuery = _searchBox.Text ?? string.Empty;
            LoadTab(_activeTabIndex);
        };
        topBar.Children.Add(_searchBox);
        Grid.SetColumn(_searchBox, 0);

        var topRight = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            Spacing = 12,
            HorizontalAlignment = HorizontalAlignment.Right,
            VerticalAlignment = VerticalAlignment.Center
        };

        _savedFeedbackText = new TextBlock
        {
            Text = string.Empty,
            FontSize = 11.5,
            FontWeight = FontWeight.SemiBold,
            Foreground = new SolidColorBrush(Color.Parse("#10B981")),
            VerticalAlignment = VerticalAlignment.Center,
            IsVisible = false
        };
        topRight.Children.Add(_savedFeedbackText);

        var savePill = new Border
        {
            Height = 36,
            CornerRadius = new CornerRadius(8),
            Background = new SolidColorBrush(Color.FromArgb(40, 16, 185, 129)),
            BorderBrush = new SolidColorBrush(Color.Parse("#10B981")),
            BorderThickness = new Thickness(1),
            Padding = new Thickness(14, 0),
            Cursor = new Cursor(StandardCursorType.Hand)
        };
        var spStack = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 6, VerticalAlignment = VerticalAlignment.Center };
        spStack.Children.Add(new AuroraVectorIcon { Kind = AuroraIconKind.CheckSuccess, Size = 14, VerticalAlignment = VerticalAlignment.Center });
        spStack.Children.Add(new TextBlock { Text = "Сохранить конфигурацию", FontSize = 11.5, FontWeight = FontWeight.Bold, Foreground = new SolidColorBrush(Color.Parse("#10B981")), VerticalAlignment = VerticalAlignment.Center });
        savePill.Child = spStack;
        savePill.PointerPressed += (s, e) =>
        {
            AuroraTactileFeedbackService.Instance.PlayAchievementChime();
            CommitSave(showBanner: true);
        };
        topRight.Children.Add(savePill);
        topBar.Children.Add(topRight);
        Grid.SetColumn(topRight, 1);

        Children.Add(topBar);
        Grid.SetRow(topBar, 0);
        Grid.SetColumn(topBar, 0);
        Grid.SetColumnSpan(topBar, 2);

        // 2. Left Tabs List (Full-Word Category Titles, Zero Ellipsis Clipping)
        var tabsScroll = new ScrollViewer
        {
            Padding = new Thickness(0, 0, 10, 0),
            HorizontalScrollBarVisibility = Avalonia.Controls.Primitives.ScrollBarVisibility.Disabled
        };

        _tabsRail = new StackPanel { Spacing = 4 };

        AddTabHeader(0, AuroraIconKind.VulkanFlame, "Графика и Vulkan");
        AddTabHeader(1, AuroraIconKind.AudioWaveDsp, "Звук и микрофон");
        AddTabHeader(2, AuroraIconKind.GamepadController, "Управление и геймпад");
        AddTabHeader(3, AuroraIconKind.DualScreenLayout, "Экраны и масштабирование");
        AddTabHeader(4, AuroraIconKind.Slot2Gba, "Система, BIOS и Slot-2");
        AddTabHeader(5, AuroraIconKind.LanMesh, "Сеть, WFC и награды");
        AddTabHeader(6, AuroraIconKind.VoiceTts, "ИИ-перевод и синтез");
        AddTabHeader(7, AuroraIconKind.ThemePalette, "Темы, шрифты и обновления");

        tabsScroll.Content = _tabsRail;
        Children.Add(tabsScroll);
        Grid.SetRow(tabsScroll, 1); Grid.SetColumn(tabsScroll, 0);

        PropertyChanged += (_, ch) =>
        {
            if (ch.Property == BoundsProperty && Bounds.Width > 0)
            {
                ColumnDefinitions = new ColumnDefinitions(Bounds.Width < 780 ? "230,*" : "268,*");
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

        StormThemeBrushes.BindTheme(this, () => LoadTab(_activeTabIndex));
        LoadTab(0);
    }

    private void CommitSave(bool showBanner = false)
    {
        StormDsUiState.Instance.SaveConfig(showBanner);
        _savedFeedbackText.Text = StormDsLoc.T("SettingsSavedMsg");
        _savedFeedbackText.IsVisible = true;
        DispatcherTimer.RunOnce(() => _savedFeedbackText.IsVisible = false, TimeSpan.FromSeconds(2));
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
            Foreground = StormThemeBrushes.SecondaryText,
            VerticalAlignment = VerticalAlignment.Center
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

        var primaryColor = StormThemeBrushes.AccentPrimaryColor;

        foreach (var item in _tabButtons)
        {
            bool isSel = item.Index == index;
            item.Button.Background = isSel ? new SolidColorBrush(Color.FromArgb(50, primaryColor.R, primaryColor.G, primaryColor.B)) : Brushes.Transparent;
            item.Button.BorderBrush = isSel ? new SolidColorBrush(primaryColor) : Brushes.Transparent;
            item.Button.BorderThickness = new Thickness(isSel ? 1 : 0);
            if (item.Button.Child is Grid g && g.Children.Count > 1 && g.Children[1] is TextBlock tb)
            {
                tb.Foreground = isSel ? StormThemeBrushes.PrimaryText : StormThemeBrushes.SecondaryText;
            }
        }

        var scroll = new ScrollViewer
        {
            Padding = new Thickness(18, 16, 26, 16),
            HorizontalScrollBarVisibility = Avalonia.Controls.Primitives.ScrollBarVisibility.Disabled
        };

        var container = new StackPanel { Spacing = 14 };
        string q = _filterQuery.Trim();

        if (q.Length >= 2)
        {
            var allItems = new StackPanel { Spacing = 14 };
            BuildGraphicsTab(allItems);
            BuildAudioTab(allItems);
            BuildInputTab(allItems);
            BuildScreenTab(allItems);
            BuildSystemTab(allItems);
            BuildNetplayTab(allItems);
            BuildAiTab(allItems);
            BuildThemesTab(allItems);

            var list = allItems.Children.ToList();
            allItems.Children.Clear();
            foreach (var child in list)
            {
                if (ControlContainsText(child, q))
                {
                    container.Children.Add(child);
                }
            }

            if (container.Children.Count == 0)
            {
                container.Children.Add(new TextBlock
                {
                    Text = $"По запросу '{q}' настройки не найдены.",
                    FontSize = 12,
                    Foreground = StormThemeBrushes.SecondaryText
                });
            }
        }
        else
        {
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
        }

        scroll.Content = container;
        _contentPresenter.Content = scroll;
    }

    private static bool ControlContainsText(Control control, string query)
    {
        if (control is TextBlock tb && tb.Text?.Contains(query, StringComparison.OrdinalIgnoreCase) == true) return true;
        if (control is AuroraNeonCheckBox cb && cb.Label?.Contains(query, StringComparison.OrdinalIgnoreCase) == true) return true;
        if (control is Panel panel)
        {
            foreach (var child in panel.Children)
            {
                if (ControlContainsText(child, query)) return true;
            }
        }
        if (control is Border border && border.Child is Control bc && ControlContainsText(bc, query)) return true;
        if (control is ContentControl cc && cc.Content is Control contentCtrl && ControlContainsText(contentCtrl, query)) return true;
        return false;
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

        p.Children.Add(CreatePathSettingRow("Пользовательский Vulkan драйвер:", cfg.CustomTurnipDriverPath, new[] { "*.adpkg", "*.zip", "*.so", "*.dll" }, (txt) => { cfg.CustomTurnipDriverPath = txt; CommitSave(); }));
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
        p.Children.Add(CreateCheckBoxRow("Тактильный звуковой отклик интерфейса STORM", cfg.UiTactileAudioEnabled, (v) =>
        {
            cfg.UiTactileAudioEnabled = v;
            AuroraTactileFeedbackService.Instance.Enabled = v;
            CommitSave();
        }));
        p.Children.Add(CreateSliderRow("Громкость тактильных звуков интерфейса:", 0.0, 1.0, cfg.UiTactileVolume, "%", (v) => cfg.UiTactileVolume = (float)v, displayScale: 100.0));

        p.Children.Add(CreateComboBoxRow(
            "Режим микрофона:",
            new[] { "Реальный микрофон ОС", "Имитация дуновения", "Белый шум", "Датчик движения" },
            (int)cfg.MicMode,
            (idx) => cfg.MicMode = (MicMode)idx));
    }

    // --- Tab 3: Desktop Keyboard, XInput Gamepad, Touch & Gyro ---
    private void BuildInputTab(StackPanel p)
    {
        var cfg = StormDsUiState.Instance.AppConfig;
        p.Children.Add(CreateSectionTitle("Геймпад XInput и управление с клавиатуры"));

        bool padConnected = new XInputGamepadService().IsControllerConnected(0);
        p.Children.Add(new Border
        {
            Padding = new Thickness(12, 8),
            CornerRadius = new CornerRadius(8),
            Background = StormThemeBrushes.BadgeFill(padConnected ? Color.Parse("#10B981") : Color.Parse("#64748B")),
            BorderBrush = StormThemeBrushes.BadgeBorder(padConnected ? Color.Parse("#10B981") : Color.Parse("#64748B")),
            BorderThickness = new Thickness(1),
            Child = new TextBlock
            {
                Text = padConnected
                    ? "Геймпад XInput (контроллер 0): подключен и готов (схема Nintendo A/B/X/Y)"
                    : "Геймпад XInput: не обнаружен (подключите Xbox/XInput геймпад или используйте клавиатуру)",
                FontSize = 11.5,
                FontWeight = FontWeight.Medium,
                Foreground = StormThemeBrushes.PrimaryText,
                TextWrapping = TextWrapping.Wrap
            }
        });

        p.Children.Add(CreateSectionTitle("Назначение кнопок Nintendo DS (нажмите и выберите клавишу)"));
        var dsGrid = new UniformGrid { Columns = 2 };
        var dsBindings = new (string Id, string Label)[]
        {
            ("Up", "Крестовина: Вверх"), ("Down", "Крестовина: Вниз"),
            ("Left", "Крестовина: Влево"), ("Right", "Крестовина: Вправо"),
            ("A", "Кнопка A (Восток)"), ("B", "Кнопка B (Юг)"),
            ("X", "Кнопка X (Север)"), ("Y", "Кнопка Y (Запад)"),
            ("L", "Шифт L"), ("R", "Шифт R"),
            ("Start", "Кнопка Start"), ("Select", "Кнопка Select")
        };
        foreach (var (id, lbl) in dsBindings)
        {
            dsGrid.Children.Add(CreateKeyBindRow(lbl, id, isHotkey: false, cfg.KeyMap));
        }
        p.Children.Add(dsGrid);

        p.Children.Add(CreateSectionTitle("Горячие клавиши эмулятора"));
        var hkGrid = new UniformGrid { Columns = 2 };
        var hotkeyBindings = new (string Id, string Label)[]
        {
            ("PauseResume", "Пауза / Продолжить"), ("FastForward", "Ускорение (Fast Forward)"),
            ("QuickSave", "Быстрое сохранение"), ("QuickLoad", "Быстрая загрузка"),
            ("SwapScreens", "Поменять экраны"), ("RotateScreens", "Повернуть экраны (90°)"),
            ("Fullscreen", "Полноэкранный режим"), ("TakeScreenshot", "Скриншот PNG"),
            ("MuteVolume", "Включить / выключить звук"), ("ToggleFps", "Счётчик FPS (HUD)")
        };
        foreach (var (id, lbl) in hotkeyBindings)
        {
            hkGrid.Children.Add(CreateKeyBindRow(lbl, id, isHotkey: true, cfg.Hotkeys));
        }
        p.Children.Add(hkGrid);

        var resetKeysBtn = new AuroraVolumetricButton { Height = 32, Width = 240, HorizontalAlignment = HorizontalAlignment.Left, Margin = new Thickness(0, 4, 0, 8) };
        resetKeysBtn.Content = new TextBlock { Text = "Сбросить клавиши по умолчанию", FontSize = 11.5, FontWeight = FontWeight.SemiBold, VerticalAlignment = VerticalAlignment.Center, HorizontalAlignment = HorizontalAlignment.Center };
        resetKeysBtn.Click += (_, _) =>
        {
            cfg.KeyMap = StormDsAppConfig.GetDefaultKeyMap();
            cfg.Hotkeys = StormDsAppConfig.GetDefaultHotkeys();
            _listeningBindTarget = null;
            CommitSave(showBanner: true);
            LoadTab(_activeTabIndex);
        };
        p.Children.Add(resetKeysBtn);

        p.Children.Add(CreateSectionTitle("Сенсорный оверлей и гироскоп"));

        p.Children.Add(CreateComboBoxRow(
            "Стиль экранных кнопок:",
            new[] { "Aurora 3D Glass", "Cyber Neon", "Минимальный контур" },
            (int)cfg.TouchOverlayPreset,
            (idx) => cfg.TouchOverlayPreset = (TouchOverlayPreset)idx));

        p.Children.Add(CreateSliderRow("Прозрачность экранных кнопок:", 0.1, 1.0, cfg.TouchOverlayOpacity, "%", (v) => cfg.TouchOverlayOpacity = (float)v, displayScale: 100.0));
        p.Children.Add(CreateSliderRow("Масштаб экранных кнопок:", 0.5, 2.0, cfg.TouchOverlayScale, "x", (v) => cfg.TouchOverlayScale = (float)v));
        p.Children.Add(CreateSliderRow("Интенсивность виброотклика (Haptic):", 0.0, 1.0, cfg.HapticIntensity, "%", (v) => cfg.HapticIntensity = (float)v, displayScale: 100.0));

        p.Children.Add(CreateSliderRow("Чувствительность гироскопа:", 0.1, 3.0, cfg.GyroSensitivity, "x", (v) => cfg.GyroSensitivity = (float)v));
        p.Children.Add(CreateCheckBoxRow("Инвертировать гироскоп по оси X", cfg.GyroInvertX, (v) => cfg.GyroInvertX = v));
        p.Children.Add(CreateCheckBoxRow("Инвертировать гироскоп по оси Y", cfg.GyroInvertY, (v) => cfg.GyroInvertY = v));
    }

    private Border CreateKeyBindRow(string label, string actionId, bool isHotkey, Dictionary<string, string> targetDict)
    {
        string curKey = targetDict.TryGetValue(actionId, out var val) ? val : "-";
        var row = new Grid
        {
            ColumnDefinitions = new ColumnDefinitions("*,Auto"),
            Margin = new Thickness(6, 4)
        };
        row.Children.Add(new TextBlock
        {
            Text = label,
            FontSize = 11,
            Foreground = StormThemeBrushes.BodyText,
            VerticalAlignment = VerticalAlignment.Center,
            TextTrimming = TextTrimming.CharacterEllipsis,
            Margin = new Thickness(0, 0, 8, 0)
        });

        var keyBtn = new Button
        {
            MinWidth = 96,
            Height = 28,
            Padding = new Thickness(8, 2),
            CornerRadius = new CornerRadius(6),
            Background = StormThemeBrushes.CardSurface,
            BorderBrush = StormThemeBrushes.StrongBorder,
            BorderThickness = new Thickness(1),
            Cursor = new Cursor(StandardCursorType.Hand),
            Content = new TextBlock
            {
                Text = curKey,
                FontSize = 11,
                FontWeight = FontWeight.SemiBold,
                Foreground = StormThemeBrushes.PrimaryText,
                HorizontalAlignment = HorizontalAlignment.Center,
                VerticalAlignment = VerticalAlignment.Center
            }
        };

        keyBtn.Click += (_, _) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            if (_listeningButton != null && _listeningButton != keyBtn)
            {
                LoadTab(_activeTabIndex);
            }
            _listeningBindTarget = actionId;
            _listeningIsHotkey = isHotkey;
            _listeningButton = keyBtn;
            keyBtn.BorderBrush = StormThemeBrushes.Accent;
            if (keyBtn.Content is TextBlock tb)
            {
                tb.Text = "Нажмите...";
                tb.Foreground = StormThemeBrushes.Accent;
            }
            keyBtn.Focus();
        };

        keyBtn.KeyDown += (_, e) =>
        {
            if (_listeningBindTarget != actionId || _listeningIsHotkey != isHotkey) return;
            e.Handled = true;
            if (e.Key == Key.Escape)
            {
                _listeningBindTarget = null;
                _listeningButton = null;
                LoadTab(_activeTabIndex);
                return;
            }

            string keyName = e.Key.ToString();
            targetDict[actionId] = keyName;
            _listeningBindTarget = null;
            _listeningButton = null;
            AuroraTactileFeedbackService.Instance.PlayAchievementChime();
            CommitSave();
            LoadTab(_activeTabIndex);
        };

        row.Children.Add(keyBtn);
        Grid.SetColumn(keyBtn, 1);

        return new Border
        {
            Margin = new Thickness(2),
            CornerRadius = new CornerRadius(7),
            Background = StormThemeBrushes.RowSurface,
            BorderBrush = StormThemeBrushes.SubtleBorder,
            BorderThickness = new Thickness(1),
            Child = row
        };
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
        p.Children.Add(CreateCheckBoxRow("Включить JIT компилятор ARM для максимальной скорости", cfg.JitEnable, (v) => cfg.JitEnable = v));
        p.Children.Add(CreateCheckBoxRow("Разрешить читы ActionReplay глобально", cfg.CheatsEnabled, (v) => { cfg.CheatsEnabled = v; StormDsUiState.Instance.ApplyLiveCheats(); CommitSave(); }));
        p.Children.Add(CreateCheckBoxRow("Использовать внешние дампы BIOS и Firmware", cfg.UseExternalBios, (v) => { cfg.UseExternalBios = v; CommitSave(); }));
        p.Children.Add(CreatePathSettingRow("Путь BIOS ARM9 (bios9.bin):", cfg.Bios9Path, new[] { "*.bin" }, t => { cfg.Bios9Path = t; CommitSave(); }));
        p.Children.Add(CreatePathSettingRow("Путь BIOS ARM7 (bios7.bin):", cfg.Bios7Path, new[] { "*.bin" }, t => { cfg.Bios7Path = t; CommitSave(); }));
        p.Children.Add(CreatePathSettingRow("Путь Firmware (firmware.bin):", cfg.FirmwarePath, new[] { "*.bin" }, t => { cfg.FirmwarePath = t; CommitSave(); }));
        p.Children.Add(CreatePathSettingRow("DSi BIOS ARM9 (dsi_bios9.bin):", cfg.DsiBios9Path, new[] { "*.bin" }, t => { cfg.DsiBios9Path = t; CommitSave(); }));
        p.Children.Add(CreatePathSettingRow("DSi BIOS ARM7 (dsi_bios7.bin):", cfg.DsiBios7Path, new[] { "*.bin" }, t => { cfg.DsiBios7Path = t; CommitSave(); }));
        p.Children.Add(CreatePathSettingRow("DSi Firmware (dsi_firmware.bin):", cfg.DsiFirmwarePath, new[] { "*.bin" }, t => { cfg.DsiFirmwarePath = t; CommitSave(); }));
        p.Children.Add(CreatePathSettingRow("Образ DSiWare NAND (.bin / .nand):", cfg.DsiNandPath, new[] { "*.bin", "*.img", "*.nand" }, t => { cfg.DsiNandPath = t; CommitSave(); }));

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

        p.Children.Add(CreatePathSettingRow("Образ картриджа GBA Slot-2 (.gba):", cfg.GbaRomPath, new[] { "*.gba" }, t => { cfg.GbaRomPath = t; CommitSave(); }));
        p.Children.Add(CreatePathSettingRow("Сохранение GBA Slot-2 (.sav):", cfg.GbaSavePath, new[] { "*.sav" }, t => { cfg.GbaSavePath = t; CommitSave(); }));
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
        p.Children.Add(CreateTextSettingRow("Целевой язык перевода (ru, en, de...):", cfg.AiTranslatorTargetLanguage, (t) => cfg.AiTranslatorTargetLanguage = string.IsNullOrWhiteSpace(t) ? "ru" : t.Trim()));
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
            bool isSel = string.Equals(AuroraThemeManager.Instance.CurrentTheme.Id, t.Item1, StringComparison.OrdinalIgnoreCase);
            var btn = new Button
            {
                Margin = new Thickness(4),
                Padding = new Thickness(8, 6),
                Background = isSel ? StormThemeBrushes.HoverSurface : StormThemeBrushes.CardSurface,
                BorderBrush = isSel ? StormThemeBrushes.Accent : StormThemeBrushes.SubtleBorder,
                BorderThickness = new Thickness(1),
                CornerRadius = new CornerRadius(8),
                Cursor = new Cursor(StandardCursorType.Hand),
                HorizontalContentAlignment = HorizontalAlignment.Center
            };
            var s = new StackPanel { Spacing = 2, HorizontalAlignment = HorizontalAlignment.Center };
            s.Children.Add(new TextBlock { Text = t.Item1, FontSize = 11, FontWeight = FontWeight.Bold, Foreground = StormThemeBrushes.PrimaryText, HorizontalAlignment = HorizontalAlignment.Center });
            s.Children.Add(new TextBlock { Text = t.Item2, FontSize = 9, Foreground = StormThemeBrushes.SecondaryText, HorizontalAlignment = HorizontalAlignment.Center });
            btn.Content = s;
            btn.Click += (sender, e) =>
            {
                AuroraTactileFeedbackService.Instance.PlayClick();
                AuroraThemeManager.Instance.ApplyTheme(t.Item1);
                StormDsUiState.Instance.AppConfig.Theme = "STORM " + t.Item1;
                CommitSave();
            };
            themesGrid.Children.Add(btn);
        }
        p.Children.Add(themesGrid);

        p.Children.Add(CreateSectionTitle("Акцентные цвета интерфейса (14 вариантов)"));
        var accentsWrap = new WrapPanel { Orientation = Orientation.Horizontal };
        foreach (var kind in Enum.GetValues<AuroraAccentKind>())
        {
            var (swatchColor, _) = AuroraThemeManager.ResolveAccentColors(AuroraThemeManager.Instance.CurrentTheme, kind);
            bool activeAccent = AuroraThemeManager.Instance.CurrentAccentOverride == kind;
            var swatchBtn = new Button
            {
                Margin = new Thickness(0, 0, 6, 6),
                Padding = new Thickness(8, 5),
                CornerRadius = new CornerRadius(8),
                Background = activeAccent ? StormThemeBrushes.HoverSurface : StormThemeBrushes.CardSurface,
                BorderBrush = activeAccent ? new SolidColorBrush(swatchColor) : StormThemeBrushes.SubtleBorder,
                BorderThickness = new Thickness(1),
                Cursor = new Cursor(StandardCursorType.Hand)
            };
            var row = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 6, VerticalAlignment = VerticalAlignment.Center };
            row.Children.Add(new Border
            {
                Width = 12,
                Height = 12,
                CornerRadius = new CornerRadius(6),
                Background = new SolidColorBrush(swatchColor),
                VerticalAlignment = VerticalAlignment.Center
            });
            row.Children.Add(new TextBlock
            {
                Text = kind == AuroraAccentKind.DefaultThemeAccent ? "По теме" : kind.ToString(),
                FontSize = 10.5,
                Foreground = StormThemeBrushes.PrimaryText,
                VerticalAlignment = VerticalAlignment.Center
            });
            swatchBtn.Content = row;
            swatchBtn.Click += (_, _) =>
            {
                AuroraTactileFeedbackService.Instance.PlayClick();
                AuroraThemeManager.Instance.ApplyTheme(AuroraThemeManager.Instance.CurrentTheme.Id, kind);
                StormDsUiState.Instance.AppConfig.AccentName = kind.ToString();
                CommitSave();
                LoadTab(_activeTabIndex);
            };
            accentsWrap.Children.Add(swatchBtn);
        }
        p.Children.Add(accentsWrap);

        p.Children.Add(CreateSectionTitle("Типографика и системные шрифты (10 пресетов)"));
        var fontsGrid = new UniformGrid { Columns = 2 };
        foreach (var preset in Enum.GetValues<AuroraTypographyPreset>())
        {
            bool activeFont = AuroraThemeManager.Instance.CurrentTypography == preset;
            var fBtn = new Button
            {
                Margin = new Thickness(3),
                Padding = new Thickness(8, 5),
                CornerRadius = new CornerRadius(6),
                Background = activeFont ? StormThemeBrushes.HoverSurface : StormThemeBrushes.CardSurface,
                BorderBrush = activeFont ? StormThemeBrushes.Accent : StormThemeBrushes.SubtleBorder,
                BorderThickness = new Thickness(1),
                Cursor = new Cursor(StandardCursorType.Hand),
                HorizontalContentAlignment = HorizontalAlignment.Center
            };
            fBtn.Content = new TextBlock
            {
                Text = preset.ToString(),
                FontSize = 11,
                FontFamily = AuroraThemeManager.ResolveFontFamily(preset),
                Foreground = StormThemeBrushes.PrimaryText
            };
            fBtn.Click += (_, _) =>
            {
                AuroraTactileFeedbackService.Instance.PlayClick();
                AuroraThemeManager.Instance.ApplyTheme(AuroraThemeManager.Instance.CurrentTheme.Id, null, preset);
                StormDsUiState.Instance.AppConfig.TypographyName = preset.ToString();
                CommitSave();
                LoadTab(_activeTabIndex);
            };
            fontsGrid.Children.Add(fBtn);
        }
        p.Children.Add(fontsGrid);

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
            bool activeLang = string.Equals(StormDsLoc.CurrentLanguage, l.Item1, StringComparison.OrdinalIgnoreCase);
            var btn = new Button
            {
                Margin = new Thickness(3),
                Padding = new Thickness(6, 4),
                Background = activeLang ? StormThemeBrushes.HoverSurface : StormThemeBrushes.CardSurface,
                BorderBrush = activeLang ? StormThemeBrushes.Accent : StormThemeBrushes.SubtleBorder,
                BorderThickness = new Thickness(1),
                CornerRadius = new CornerRadius(6),
                Cursor = new Cursor(StandardCursorType.Hand)
            };
            btn.Content = new TextBlock { Text = l.Item2, FontSize = 11, HorizontalAlignment = HorizontalAlignment.Center, Foreground = StormThemeBrushes.PrimaryText };
            btn.Click += (sender, e) =>
            {
                AuroraTactileFeedbackService.Instance.PlayClick();
                StormDsLoc.CurrentLanguage = l.Item1;
                StormDsUiState.Instance.AppConfig.Language = l.Item1;
                CommitSave();
                LoadTab(_activeTabIndex);
            };
            langGrid.Children.Add(btn);
        }
        p.Children.Add(langGrid);

        p.Children.Add(CreateSectionTitle("Двухзеркальный апдейтер (Dual-Mirror)"));
        var updateCard = new Border
        {
            Padding = new Thickness(12),
            CornerRadius = new CornerRadius(8),
            Background = StormThemeBrushes.RowSurface,
            BorderBrush = StormThemeBrushes.SubtleBorder,
            BorderThickness = new Thickness(1)
        };
        var uStack = new StackPanel { Spacing = 8 };
        var updateStatusText = new TextBlock
        {
            Text = $"Текущая версия: {StormDsLoc.AppVersion}. Зеркала: GitHub Releases API + STORM GAMES WORLD",
            FontSize = 11.5,
            Foreground = StormThemeBrushes.BodyText,
            TextWrapping = TextWrapping.Wrap
        };
        uStack.Children.Add(updateStatusText);

        uStack.Children.Add(CreateCheckBoxRow(
            "Автоматически проверять обновления при запуске",
            StormDsUiState.Instance.AppConfig.AutoCheckUpdates,
            v =>
            {
                StormDsUiState.Instance.AppConfig.AutoCheckUpdates = v;
                CommitSave();
            }));

        uStack.Children.Add(CreateCheckBoxRow(
            "Сворачивать в системный трей вместо выхода при нажатии закрытия окна",
            StormDsUiState.Instance.AppConfig.MinimizeToTrayOnClose,
            v =>
            {
                StormDsUiState.Instance.AppConfig.MinimizeToTrayOnClose = v;
                CommitSave();
            }));

        var checkBtn = new AuroraVolumetricButton
        {
            Height = 32,
            Width = 220,
            HorizontalAlignment = HorizontalAlignment.Left
        };
        var cbStack = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 6, HorizontalAlignment = HorizontalAlignment.Center, VerticalAlignment = VerticalAlignment.Center };
        cbStack.Children.Add(new AuroraVectorIcon { Kind = AuroraIconKind.UpdateRocket, Size = 14, VerticalAlignment = VerticalAlignment.Center });
        cbStack.Children.Add(new TextBlock { Text = "Проверить обновления", FontSize = 11, FontWeight = FontWeight.Bold, VerticalAlignment = VerticalAlignment.Center });
        checkBtn.Content = cbStack;
        checkBtn.Click += (s, e) =>
        {
            updateStatusText.Text = $"Открыто окно проверки обновлений ({StormDsLoc.AppVersion})";
            StormDsUiState.Instance.RequestUpdateCheck(true);
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
            Foreground = StormThemeBrushes.Accent,
            Margin = new Thickness(0, 6, 0, 2)
        };
    }

    private Control CreateCheckBoxRow(string label, bool initial, Action<bool> onChange)
    {
        var cb = new AuroraNeonCheckBox
        {
            Label = label,
            IsChecked = initial,
            Margin = new Thickness(0, 2)
        };
        cb.IsCheckedChanged += (s, chk) =>
        {
            onChange(chk);
            CommitSave();
        };
        return cb;
    }

    private Grid CreateSliderRow(string label, double min, double max, double initial, string unit, Action<double> onChange, double displayScale = 1.0)
    {
        var g = new Grid
        {
            Margin = new Thickness(0, 4),
            RowDefinitions = new RowDefinitions("Auto,Auto")
        };

        string FormatVal(double v) => unit == "%"
            ? $"{label} {Math.Round(v * displayScale):0}%"
            : $"{label} {(v * displayScale):0.##} {unit}".TrimEnd();

        var labelText = new TextBlock { Text = FormatVal(initial), FontSize = 11, Foreground = StormThemeBrushes.BodyText, Margin = new Thickness(0, 0, 0, 2) };
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
            labelText.Text = FormatVal(val);
            onChange(val);
            CommitSave();
        };
        g.Children.Add(slider);
        Grid.SetRow(slider, 1);

        return g;
    }

    private Grid CreateComboBoxRow(string label, string[] options, int selectedIndex, Action<int> onSelect)
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
            Foreground = StormThemeBrushes.BodyText,
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
            if (combo.SelectedIndex >= 0)
            {
                onSelect(combo.SelectedIndex);
                CommitSave();
            }
        };
        g.Children.Add(combo);
        Grid.SetColumn(combo, 1);

        return g;
    }

    private Grid CreateTextSettingRow(string label, string initial, Action<string> onChange)
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
            Foreground = StormThemeBrushes.BodyText,
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
        tb.LostFocus += (s, e) =>
        {
            onChange(tb.Text ?? string.Empty);
            CommitSave();
        };
        tb.KeyDown += (s, e) =>
        {
            if (e.Key == Key.Enter)
            {
                onChange(tb.Text ?? string.Empty);
                CommitSave(showBanner: true);
            }
        };
        g.Children.Add(tb);
        Grid.SetColumn(tb, 1);

        return g;
    }

    private Grid CreatePathSettingRow(string label, string initial, string[] patterns, Action<string> onChange)
    {
        var g = new Grid
        {
            ColumnDefinitions = new ColumnDefinitions("*,210,Auto"),
            Margin = new Thickness(0, 4)
        };

        g.Children.Add(new TextBlock
        {
            Text = label,
            FontSize = 11.5,
            Foreground = StormThemeBrushes.BodyText,
            VerticalAlignment = VerticalAlignment.Center,
            TextWrapping = TextWrapping.Wrap,
            Margin = new Thickness(0, 0, 12, 0)
        });

        var tb = new TextBox
        {
            Text = initial,
            Height = 30
        };
        tb.LostFocus += (_, _) => onChange(tb.Text ?? string.Empty);
        g.Children.Add(tb);
        Grid.SetColumn(tb, 1);

        var browseBtn = new Button
        {
            Content = "...",
            Width = 34,
            Height = 30,
            Margin = new Thickness(6, 0, 0, 0),
            Cursor = new Cursor(StandardCursorType.Hand),
            HorizontalContentAlignment = HorizontalAlignment.Center,
            VerticalContentAlignment = VerticalAlignment.Center
        };
        browseBtn.Click += async (_, _) =>
        {
            var top = TopLevel.GetTopLevel(this);
            if (top?.StorageProvider == null) return;
            var files = await top.StorageProvider.OpenFilePickerAsync(new FilePickerOpenOptions
            {
                Title = label,
                AllowMultiple = false,
                FileTypeFilter = new[]
                {
                    new FilePickerFileType(label) { Patterns = patterns },
                    FilePickerFileTypes.All
                }
            });
            string? path = files.Count > 0 ? files[0].TryGetLocalPath() : null;
            if (!string.IsNullOrWhiteSpace(path))
            {
                tb.Text = path;
                onChange(path);
            }
        };
        g.Children.Add(browseBtn);
        Grid.SetColumn(browseBtn, 2);

        return g;
    }
}
