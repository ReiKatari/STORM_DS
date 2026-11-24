// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System.Globalization;

namespace StormDs.Core.Localization;

public sealed record LanguageInfo(string Code, string NativeName, string EnglishName);

/// <summary>
/// 11-Language localization dictionary for STORM DS adhering to Sentence case, 0% '&' (always 'и' / 'and'),
/// and version '8.9.0' without 'v' per ecosystem laws.
/// Supported languages: ru, en, de, fr, zh, ko, ja, es, it, pt, hi.
/// </summary>
public static class StormDsLoc
{
    public const string AppVersion = "8.9.0";

    public static readonly IReadOnlyList<LanguageInfo> SupportedLanguages =
    [
        new("ru", "Русский", "Russian"),
        new("en", "English", "English"),
        new("de", "Deutsch", "German"),
        new("fr", "Français", "French"),
        new("zh", "简体中文", "Chinese"),
        new("ko", "한국어", "Korean"),
        new("ja", "日本語", "Japanese"),
        new("es", "Español", "Spanish"),
        new("it", "Italiano", "Italian"),
        new("pt", "Português", "Portuguese"),
        new("hi", "हिन्दी", "Hindi")
    ];

    private static string s_currentLanguage = DetectInitialLanguage();

    public static string CurrentLanguage
    {
        get => s_currentLanguage;
        set
        {
            if (SupportedLanguages.Any(l => string.Equals(l.Code, value, StringComparison.OrdinalIgnoreCase)))
            {
                s_currentLanguage = value.ToLowerInvariant();
            }
        }
    }

    public static string Get(string key, string? lang = null)
    {
        string targetLang = lang?.ToLowerInvariant() ?? s_currentLanguage;
        if (s_translations.TryGetValue(targetLang, out var dict) && dict.TryGetValue(key, out var text))
        {
            return text;
        }

        // Fallback to Russian, then English
        if (s_translations.TryGetValue("ru", out var ruDict) && ruDict.TryGetValue(key, out var ruText))
        {
            return ruText;
        }
        if (s_translations.TryGetValue("en", out var enDict) && enDict.TryGetValue(key, out var enText))
        {
            return enText;
        }

        return key;
    }

    private static string DetectInitialLanguage()
    {
        string twoLetter = CultureInfo.CurrentUICulture.TwoLetterISOLanguageName.ToLowerInvariant();
        return SupportedLanguages.Any(l => l.Code == twoLetter) ? twoLetter : "ru";
    }

    private static readonly Dictionary<string, Dictionary<string, string>> s_translations = new(StringComparer.OrdinalIgnoreCase)
    {
        ["ru"] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["AppTitle"] = "STORM DS",
            ["AppSubtitle"] = "Эмулятор Nintendo DS и DSi нового поколения",
            ["NavLibrary"] = "Библиотека игр",
            ["NavEmulation"] = "Эмуляция",
            ["NavSettings"] = "Параметры и конфигурация",
            ["NavTools"] = "Инструменты и сервисы",
            ["NavAbout"] = "О программе",

            // Actions
            ["ActionLaunch"] = "Запустить",
            ["ActionPause"] = "Приостановить",
            ["ActionResume"] = "Возобновить",
            ["ActionReset"] = "Сброс",
            ["ActionQuickSave"] = "Быстрое сохранение",
            ["ActionQuickLoad"] = "Быстрая загрузка",
            ["ActionRewind"] = "Перемотка назад",
            ["ActionFastForward"] = "Ускорение",
            ["ActionFullscreen"] = "Полноэкранный режим",
            ["ActionFavorite"] = "В избранное",
            ["ActionUnfavorite"] = "Убрать из избранного",
            ["ActionApply"] = "Применить",
            ["ActionCancel"] = "Отмена",
            ["ActionClose"] = "Закрыть",
            ["ActionSave"] = "Сохранить",
            ["ActionDelete"] = "Удалить",
            ["ActionRefresh"] = "Обновить",
            ["ActionBrowse"] = "Обзор...",

            // Video
            ["VideoSettings"] = "Настройки графики",
            ["RendererBackend"] = "Графический бэкенд",
            ["VulkanTier"] = "Уровень совместимости Vulkan",
            ["VulkanCompositor"] = "Режим композитора Vulkan",
            ["InternalResolution"] = "Масштаб внутреннего разрешения",
            ["Widescreen3D"] = "Широкоформатный 3D экран (16:9)",
            ["Patch60Fps"] = "Патч 60 кадров в секунду",
            ["SsaoLighting"] = "Объёмное затенение SSAO",
            ["Depth3DStereo"] = "Стереоскопический 3D эффект",
            ["ThickEdges"] = "Сглаживание контуров геометрии",
            ["ScreenFilter"] = "Фильтр масштабирования экрана",
            ["SlangShader"] = "Шейдерная постобработка Slang",
            ["TurnipDriver"] = "Пользовательский драйвер Turnip",

            // Audio
            ["AudioSettings"] = "Настройки звука и микрофона",
            ["AudioLatency"] = "Задержка вывода звука",
            ["AudioInterpolation"] = "Интерполяция аудиопотока",
            ["BitDepth"] = "Битовая глубина звука",
            ["BassBoost"] = "Усиление низких частот",
            ["SoftLimiter"] = "Мягкий динамический лимитер",
            ["SpatialStereo"] = "Пространственное стереозвучание",
            ["ReverbEffect"] = "Эффект реверберации окружения",
            ["TactileAudio"] = "Тактильный звуковой отклик интерфейса",
            ["MicMode"] = "Режим эмуляции микрофона",

            // Input and Dual-Screen
            ["InputSettings"] = "Управление и экраны",
            ["ScreenLayout"] = "Расположение двух экранов",
            ["VerticalClassic"] = "Вертикальное классическое",
            ["HorizontalSideBySide"] = "Горизонтальное рядом",
            ["HybridLargeFocus"] = "Гибридный фокусный экран",
            ["DualWindowDetached"] = "Два раздельных окна",
            ["FoldableClamshell"] = "Складной экран раскладушки",
            ["ScreenGap"] = "Расстояние между экранами",
            ["TouchOverlay"] = "Сенсорный оверлей управления",
            ["HapticFeedback"] = "Тактильная виброотдача",
            ["GyroSens"] = "Чувствительность гироскопа",
            ["Hotkeys"] = "Горячие клавиши",

            // System and BIOS
            ["SystemSettings"] = "Система и BIOS",
            ["ConsoleMode"] = "Режим консоли",
            ["DirectBoot"] = "Прямой запуск без меню BIOS",
            ["UseExternalBios"] = "Использовать внешние дампы BIOS",
            ["OverclockArm9"] = "Разгон процессора ARM9",
            ["RandomMac"] = "Случайный MAC-адрес сети",
            ["Slot2Addon"] = "Периферийное устройство Slot-2",
            ["SolarSensor"] = "Датчик солнечного света Boktai",

            // Services
            ["Cheats"] = "Коды и читы ActionReplay",
            ["RetroAchievements"] = "Достижения RetroAchievements",
            ["HardcoreMode"] = "Хардкорный режим соревнований",
            ["NetworkWfc"] = "Сетевая игра и Nintendo WFC",
            ["AiTranslator"] = "ИИ-переводчик экрана на лету",
            ["DsiWareNand"] = "Управление памятью DSiWare NAND",

            // Status and Dialogs
            ["StatusReady"] = "Готов к работе",
            ["StatusEmulating"] = "Эмуляция активна",
            ["StatusPaused"] = "Эмуляция приостановлена",
            ["NativeCoreLoaded"] = "Нативное ядро Vulkan загружено",
            ["ManagedFallback"] = "Активен режим совместимости",
            ["StateSaved"] = "Состояние успешно сохранено",
            ["StateLoaded"] = "Состояние успешно восстановлено",
            ["AchievementUnlocked"] = "Достижение разблокировано!",
            ["VersionLabel"] = "Версия 8.9.0"
        },
        ["en"] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["AppTitle"] = "STORM DS",
            ["AppSubtitle"] = "Next-generation Nintendo DS and DSi emulator",
            ["NavLibrary"] = "Game library",
            ["NavEmulation"] = "Emulation",
            ["NavSettings"] = "Settings and configuration",
            ["NavTools"] = "Tools and services",
            ["NavAbout"] = "About",

            ["ActionLaunch"] = "Launch",
            ["ActionPause"] = "Pause",
            ["ActionResume"] = "Resume",
            ["ActionReset"] = "Reset",
            ["ActionQuickSave"] = "Quick save",
            ["ActionQuickLoad"] = "Quick load",
            ["ActionRewind"] = "Rewind",
            ["ActionFastForward"] = "Fast forward",
            ["ActionFullscreen"] = "Fullscreen",
            ["ActionFavorite"] = "Add to favorites",
            ["ActionUnfavorite"] = "Remove from favorites",
            ["ActionApply"] = "Apply",
            ["ActionCancel"] = "Cancel",
            ["ActionClose"] = "Close",
            ["ActionSave"] = "Save",
            ["ActionDelete"] = "Delete",
            ["ActionRefresh"] = "Refresh",
            ["ActionBrowse"] = "Browse...",

            ["VideoSettings"] = "Video settings",
            ["RendererBackend"] = "Renderer backend",
            ["VulkanTier"] = "Vulkan compatibility tier",
            ["VulkanCompositor"] = "Vulkan compositor mode",
            ["InternalResolution"] = "Internal resolution scale",
            ["Widescreen3D"] = "Widescreen 3D display (16:9)",
            ["Patch60Fps"] = "60 frames per second patch",
            ["SsaoLighting"] = "SSAO ambient occlusion",
            ["Depth3DStereo"] = "Stereoscopic 3D depth",
            ["ThickEdges"] = "Thick edge smoothing",
            ["ScreenFilter"] = "Screen filter",
            ["SlangShader"] = "Slang shader post-processing",
            ["TurnipDriver"] = "Custom Turnip driver",

            ["AudioSettings"] = "Audio and microphone settings",
            ["AudioLatency"] = "Audio output latency",
            ["AudioInterpolation"] = "Audio interpolation",
            ["BitDepth"] = "Audio bit depth",
            ["BassBoost"] = "Bass boost",
            ["SoftLimiter"] = "Soft dynamic limiter",
            ["SpatialStereo"] = "Spatial stereo expansion",
            ["ReverbEffect"] = "Environmental reverb",
            ["TactileAudio"] = "Tactile UI sound feedback",
            ["MicMode"] = "Microphone emulation mode",

            ["InputSettings"] = "Input and screens",
            ["ScreenLayout"] = "Dual-screen layout",
            ["VerticalClassic"] = "Vertical classic",
            ["HorizontalSideBySide"] = "Horizontal side-by-side",
            ["HybridLargeFocus"] = "Hybrid focus screen",
            ["DualWindowDetached"] = "Two separate windows",
            ["FoldableClamshell"] = "Foldable clamshell display",
            ["ScreenGap"] = "Screen gap distance",
            ["TouchOverlay"] = "Touch controls overlay",
            ["HapticFeedback"] = "Haptic vibration feedback",
            ["GyroSens"] = "Gyroscope sensitivity",
            ["Hotkeys"] = "Hotkeys",

            ["SystemSettings"] = "System and BIOS",
            ["ConsoleMode"] = "Console mode",
            ["DirectBoot"] = "Direct boot without BIOS menu",
            ["UseExternalBios"] = "Use external BIOS dumps",
            ["OverclockArm9"] = "ARM9 processor overclock",
            ["RandomMac"] = "Randomized network MAC address",
            ["Slot2Addon"] = "Slot-2 peripheral device",
            ["SolarSensor"] = "Boktai solar light sensor",

            ["Cheats"] = "ActionReplay cheats",
            ["RetroAchievements"] = "RetroAchievements",
            ["HardcoreMode"] = "Hardcore competitive mode",
            ["NetworkWfc"] = "Netplay and Nintendo WFC",
            ["AiTranslator"] = "Real-time AI screen translator",
            ["DsiWareNand"] = "DSiWare NAND storage manager",

            ["StatusReady"] = "Ready",
            ["StatusEmulating"] = "Emulating",
            ["StatusPaused"] = "Emulation paused",
            ["NativeCoreLoaded"] = "Native Vulkan core loaded",
            ["ManagedFallback"] = "Compatibility mode active",
            ["StateSaved"] = "State saved successfully",
            ["StateLoaded"] = "State restored successfully",
            ["AchievementUnlocked"] = "Achievement unlocked!",
            ["VersionLabel"] = "Version 8.9.0"
        },
        ["de"] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["AppTitle"] = "STORM DS",
            ["AppSubtitle"] = "Nintendo DS und DSi Emulator der nächsten Generation",
            ["NavLibrary"] = "Spielebibliothek",
            ["NavEmulation"] = "Emulation",
            ["NavSettings"] = "Einstellungen und Konfiguration",
            ["NavTools"] = "Werkzeuge und Dienste",
            ["NavAbout"] = "Über das Programm",
            ["ActionLaunch"] = "Starten",
            ["ActionPause"] = "Pause",
            ["ActionResume"] = "Fortsetzen",
            ["ActionReset"] = "Zurücksetzen",
            ["VideoSettings"] = "Grafikeinstellungen",
            ["AudioSettings"] = "Ton- und Mikrofoneinstellungen",
            ["InputSettings"] = "Steuerung und Bildschirme",
            ["SystemSettings"] = "System und BIOS",
            ["VersionLabel"] = "Version 8.9.0"
        },
        ["fr"] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["AppTitle"] = "STORM DS",
            ["AppSubtitle"] = "Émulateur Nintendo DS et DSi nouvelle génération",
            ["NavLibrary"] = "Bibliothèque de jeux",
            ["NavEmulation"] = "Émulation",
            ["NavSettings"] = "Paramètres et configuration",
            ["NavTools"] = "Outils et services",
            ["NavAbout"] = "À propos",
            ["ActionLaunch"] = "Lancer",
            ["ActionPause"] = "Pause",
            ["ActionResume"] = "Reprendre",
            ["ActionReset"] = "Réinitialiser",
            ["VideoSettings"] = "Paramètres vidéo",
            ["AudioSettings"] = "Paramètres audio et microphone",
            ["InputSettings"] = "Contrôles et affichage",
            ["SystemSettings"] = "Système et BIOS",
            ["VersionLabel"] = "Version 8.9.0"
        },
        ["zh"] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["AppTitle"] = "STORM DS",
            ["AppSubtitle"] = "新一代任天堂 DS 和 DSi 模拟器",
            ["NavLibrary"] = "游戏库",
            ["NavEmulation"] = "模拟运行",
            ["NavSettings"] = "设置和配置",
            ["NavTools"] = "工具和服务",
            ["NavAbout"] = "关于",
            ["ActionLaunch"] = "启动",
            ["ActionPause"] = "暂停",
            ["ActionResume"] = "继续",
            ["ActionReset"] = "重置",
            ["VideoSettings"] = "图像设置",
            ["AudioSettings"] = "音频和麦克风设置",
            ["InputSettings"] = "控制和双屏布局",
            ["SystemSettings"] = "系统和 BIOS",
            ["VersionLabel"] = "版本 8.9.0"
        },
        ["ko"] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["AppTitle"] = "STORM DS",
            ["AppSubtitle"] = "차세대 닌텐도 DS 및 DSi 에뮬레이터",
            ["NavLibrary"] = "게임 라이브러리",
            ["NavEmulation"] = "에뮬레이션",
            ["NavSettings"] = "설정 및 구성",
            ["NavTools"] = "도구 및 서비스",
            ["NavAbout"] = "정보",
            ["ActionLaunch"] = "실행",
            ["ActionPause"] = "일시 정지",
            ["ActionResume"] = "다시 시작",
            ["ActionReset"] = "초기화",
            ["VideoSettings"] = "비디오 설정",
            ["AudioSettings"] = "오디오 및 마이크 설정",
            ["InputSettings"] = "입력 및 듀얼 스크린",
            ["SystemSettings"] = "시스템 및 BIOS",
            ["VersionLabel"] = "버전 8.9.0"
        },
        ["ja"] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["AppTitle"] = "STORM DS",
            ["AppSubtitle"] = "次世代ニンテンドーDSおよびDSiエミュレータ",
            ["NavLibrary"] = "ゲームライブラリ",
            ["NavEmulation"] = "エミュレーション",
            ["NavSettings"] = "設定と構成",
            ["NavTools"] = "ツールとサービス",
            ["NavAbout"] = "アプリについて",
            ["ActionLaunch"] = "起動",
            ["ActionPause"] = "一時停止",
            ["ActionResume"] = "再開",
            ["ActionReset"] = "リセット",
            ["VideoSettings"] = "画面とグラフィック設定",
            ["AudioSettings"] = "サウンドとマイク設定",
            ["InputSettings"] = "操作とデュアル画面",
            ["SystemSettings"] = "システムとBIOS",
            ["VersionLabel"] = "バージョン 8.9.0"
        },
        ["es"] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["AppTitle"] = "STORM DS",
            ["AppSubtitle"] = "Emulador de Nintendo DS y DSi de nueva generación",
            ["NavLibrary"] = "Biblioteca de juegos",
            ["NavEmulation"] = "Emulación",
            ["NavSettings"] = "Ajustes y configuración",
            ["NavTools"] = "Herramientas y servicios",
            ["NavAbout"] = "Acerca de",
            ["ActionLaunch"] = "Iniciar",
            ["ActionPause"] = "Pausar",
            ["ActionResume"] = "Reanudar",
            ["ActionReset"] = "Reiniciar",
            ["VideoSettings"] = "Ajustes de vídeo",
            ["AudioSettings"] = "Ajustes de audio y micrófono",
            ["InputSettings"] = "Controles y pantallas",
            ["SystemSettings"] = "Sistema y BIOS",
            ["VersionLabel"] = "Versión 8.9.0"
        },
        ["it"] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["AppTitle"] = "STORM DS",
            ["AppSubtitle"] = "Emulatore Nintendo DS e DSi di nuova generazione",
            ["NavLibrary"] = "Libreria giochi",
            ["NavEmulation"] = "Emulazione",
            ["NavSettings"] = "Impostazioni e configurazione",
            ["NavTools"] = "Strumenti e servizi",
            ["NavAbout"] = "Informazioni",
            ["ActionLaunch"] = "Avvia",
            ["ActionPause"] = "Pausa",
            ["ActionResume"] = "Riprendi",
            ["ActionReset"] = "Ripristina",
            ["VideoSettings"] = "Impostazioni video",
            ["AudioSettings"] = "Impostazioni audio e microfono",
            ["InputSettings"] = "Controlli e schermi",
            ["SystemSettings"] = "Sistema e BIOS",
            ["VersionLabel"] = "Versione 8.9.0"
        },
        ["pt"] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["AppTitle"] = "STORM DS",
            ["AppSubtitle"] = "Emulador Nintendo DS e DSi de última geração",
            ["NavLibrary"] = "Biblioteca de jogos",
            ["NavEmulation"] = "Emulação",
            ["NavSettings"] = "Configurações e ajustes",
            ["NavTools"] = "Ferramentas e serviços",
            ["NavAbout"] = "Sobre",
            ["ActionLaunch"] = "Iniciar",
            ["ActionPause"] = "Pausar",
            ["ActionResume"] = "Retomar",
            ["ActionReset"] = "Reiniciar",
            ["VideoSettings"] = "Configurações de vídeo",
            ["AudioSettings"] = "Configurações de áudio e microfone",
            ["InputSettings"] = "Controles e telas",
            ["SystemSettings"] = "Sistema e BIOS",
            ["VersionLabel"] = "Versão 8.9.0"
        },
        ["hi"] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["AppTitle"] = "STORM DS",
            ["AppSubtitle"] = "अगली पीढ़ी का Nintendo DS और DSi एमुलेटर",
            ["NavLibrary"] = "गेम लाइब्रेरी",
            ["NavEmulation"] = "एमुलेशन",
            ["NavSettings"] = "सेटिंग्स और कॉन्फ़िगरेशन",
            ["NavTools"] = "उपकरण और सेवाएं",
            ["NavAbout"] = "परिचय",
            ["ActionLaunch"] = "शुरू करें",
            ["ActionPause"] = "रोकें",
            ["ActionResume"] = "फिर शुरू करें",
            ["ActionReset"] = "रीसेट",
            ["VideoSettings"] = "वीडियो सेटिंग्स",
            ["AudioSettings"] = "ऑडियो और माइक्रोफ़ोन सेटिंग्स",
            ["InputSettings"] = "नियंत्रण और स्क्रीन लेआउट",
            ["SystemSettings"] = "सिस्टम और BIOS",
            ["VersionLabel"] = "संस्करण 8.9.0"
        }
    };
}
