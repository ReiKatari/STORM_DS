using System;
using System.Collections.Generic;
using System.Globalization;

namespace Storm.AuroraFluid.Kit.Services;

/// <summary>
/// Predefined canonical languages supported across the STORM ecosystem.
/// </summary>
public enum AuroraLanguage
{
    Russian,     // ru
    English,     // en
    German,      // de
    French,      // fr
    Chinese,     // zh
    Korean,      // ko
    Japanese,    // ja
    Spanish,     // es
    Italian,     // it
    Portuguese,  // pt
    Hindi        // hi
}

/// <summary>
/// Universal multi-language localization service for STORM applications.
/// Supports 11 languages, OS Culture auto-detection, strict dd.MM.yyyy / HH:mm formatting,
/// and Russian 3-form pluralization.
/// </summary>
public sealed class AuroraLocalizationService
{
    private static readonly Lazy<AuroraLocalizationService> s_lazyInstance = new(() => new AuroraLocalizationService());
    public static AuroraLocalizationService Instance => s_lazyInstance.Value;

    public AuroraLanguage CurrentLanguage { get; private set; }

    public event Action<AuroraLanguage>? LanguageChanged;

    private readonly Dictionary<AuroraLanguage, Dictionary<string, string>> _stringTables = new();

    private AuroraLocalizationService()
    {
        InitializeStringTables();
        CurrentLanguage = DetectSystemLanguage();
    }

    private static AuroraLanguage DetectSystemLanguage()
    {
        var twoLetter = CultureInfo.CurrentUICulture.TwoLetterISOLanguageName.ToLowerInvariant();
        return twoLetter switch
        {
            "ru" => AuroraLanguage.Russian,
            "de" => AuroraLanguage.German,
            "fr" => AuroraLanguage.French,
            "zh" => AuroraLanguage.Chinese,
            "ko" => AuroraLanguage.Korean,
            "ja" => AuroraLanguage.Japanese,
            "es" => AuroraLanguage.Spanish,
            "it" => AuroraLanguage.Italian,
            "pt" => AuroraLanguage.Portuguese,
            "hi" => AuroraLanguage.Hindi,
            _ => AuroraLanguage.English
        };
    }

    public void SetLanguage(AuroraLanguage language)
    {
        if (CurrentLanguage != language)
        {
            CurrentLanguage = language;
            LanguageChanged?.Invoke(CurrentLanguage);
        }
    }

    public string GetString(string key, string? defaultValue = null)
    {
        if (_stringTables.TryGetValue(CurrentLanguage, out var table) && table.TryGetValue(key, out var val))
        {
            return val;
        }

        // Fallback to English
        if (CurrentLanguage != AuroraLanguage.English &&
            _stringTables.TryGetValue(AuroraLanguage.English, out var enTable) &&
            enTable.TryGetValue(key, out var enVal))
        {
            return enVal;
        }

        return defaultValue ?? key;
    }

    /// <summary>
    /// Strict Rule 5.2 Date Formatter (dd.MM.yyyy).
    /// </summary>
    public static string FormatDate(DateTime date) => date.ToString("dd.MM.yyyy", CultureInfo.InvariantCulture);

    /// <summary>
    /// Strict Rule 5.2 Time Formatter (HH:mm 24-hour format).
    /// </summary>
    public static string FormatTime(DateTime time) => time.ToString("HH:mm", CultureInfo.InvariantCulture);

    /// <summary>
    /// Russian grammatical 3-form pluralizer (1 файл, 2 файла, 5 файлов).
    /// </summary>
    public static string GetRussianPlural(int count, string one, string few, string many)
    {
        int n = Math.Abs(count);
        int rem100 = n % 100;
        int rem10 = n % 10;

        if (rem100 >= 11 && rem100 <= 19)
        {
            return many;
        }

        if (rem10 == 1)
        {
            return one;
        }

        if (rem10 >= 2 && rem10 <= 4)
        {
            return few;
        }

        return many;
    }

    private void InitializeStringTables()
    {
        // 1. Russian (ru)
        _stringTables[AuroraLanguage.Russian] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["AppTitle"] = "STORM DS",
            ["Play"] = "Играть",
            ["Pause"] = "Пауза",
            ["Stop"] = "Остановить",
            ["Settings"] = "Настройки",
            ["Library"] = "Библиотека",
            ["Favorites"] = "Избранное",
            ["Recent"] = "Недавние игры",
            ["Search"] = "Поиск по библиотеке...",
            ["UpdateAvailable"] = "Доступно обновление",
            ["Exit"] = "Выход"
        };

        // 2. English (en)
        _stringTables[AuroraLanguage.English] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["AppTitle"] = "STORM DS",
            ["Play"] = "Play",
            ["Pause"] = "Pause",
            ["Stop"] = "Stop",
            ["Settings"] = "Settings",
            ["Library"] = "Library",
            ["Favorites"] = "Favorites",
            ["Recent"] = "Recent games",
            ["Search"] = "Search library...",
            ["UpdateAvailable"] = "Update available",
            ["Exit"] = "Exit"
        };

        // 3. German (de)
        _stringTables[AuroraLanguage.German] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["AppTitle"] = "STORM DS",
            ["Play"] = "Spielen",
            ["Pause"] = "Pause",
            ["Stop"] = "Stoppen",
            ["Settings"] = "Einstellungen",
            ["Library"] = "Bibliothek",
            ["Favorites"] = "Favoriten",
            ["Recent"] = "Zuletzt gespielt",
            ["Search"] = "Bibliothek durchsuchen...",
            ["UpdateAvailable"] = "Aktualisierung verfügbar",
            ["Exit"] = "Beenden"
        };

        // 4. French (fr)
        _stringTables[AuroraLanguage.French] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["AppTitle"] = "STORM DS",
            ["Play"] = "Jouer",
            ["Pause"] = "Pause",
            ["Stop"] = "Arrêter",
            ["Settings"] = "Paramètres",
            ["Library"] = "Bibliothèque",
            ["Favorites"] = "Favoris",
            ["Recent"] = "Jeux récents",
            ["Search"] = "Rechercher...",
            ["UpdateAvailable"] = "Mise à jour disponible",
            ["Exit"] = "Quitter"
        };

        // 5. Chinese (zh)
        _stringTables[AuroraLanguage.Chinese] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["AppTitle"] = "STORM DS",
            ["Play"] = "运行",
            ["Pause"] = "暂停",
            ["Stop"] = "停止",
            ["Settings"] = "设置",
            ["Library"] = "游戏库",
            ["Favorites"] = "收藏夹",
            ["Recent"] = "最近运行",
            ["Search"] = "搜索游戏库...",
            ["UpdateAvailable"] = "有可用更新",
            ["Exit"] = "退出"
        };

        // 6. Korean (ko)
        _stringTables[AuroraLanguage.Korean] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["AppTitle"] = "STORM DS",
            ["Play"] = "플레이",
            ["Pause"] = "일시정지",
            ["Stop"] = "정지",
            ["Settings"] = "설정",
            ["Library"] = "라이브러리",
            ["Favorites"] = "즐겨찾기",
            ["Recent"] = "최근 게임",
            ["Search"] = "라이브러리 검색...",
            ["UpdateAvailable"] = "업데이트 가능",
            ["Exit"] = "종료"
        };

        // 7. Japanese (ja)
        _stringTables[AuroraLanguage.Japanese] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["AppTitle"] = "STORM DS",
            ["Play"] = "起動",
            ["Pause"] = "一時停止",
            ["Stop"] = "停止",
            ["Settings"] = "設定",
            ["Library"] = "ライブラリ",
            ["Favorites"] = "お気に入り",
            ["Recent"] = "最近プレイ",
            ["Search"] = "ライブラリを検索...",
            ["UpdateAvailable"] = "アップデート可能",
            ["Exit"] = "終了"
        };

        // 8. Spanish (es)
        _stringTables[AuroraLanguage.Spanish] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["AppTitle"] = "STORM DS",
            ["Play"] = "Jugar",
            ["Pause"] = "Pausar",
            ["Stop"] = "Detener",
            ["Settings"] = "Configuración",
            ["Library"] = "Biblioteca",
            ["Favorites"] = "Favoritos",
            ["Recent"] = "Juegos recientes",
            ["Search"] = "Buscar...",
            ["UpdateAvailable"] = "Actualización disponible",
            ["Exit"] = "Salir"
        };

        // 9. Italian (it)
        _stringTables[AuroraLanguage.Italian] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["AppTitle"] = "STORM DS",
            ["Play"] = "Gioca",
            ["Pause"] = "Pausa",
            ["Stop"] = "Ferma",
            ["Settings"] = "Impostazioni",
            ["Library"] = "Libreria",
            ["Favorites"] = "Preferiti",
            ["Recent"] = "Giochi recenti",
            ["Search"] = "Cerca...",
            ["UpdateAvailable"] = "Aggiornamento disponibile",
            ["Exit"] = "Esci"
        };

        // 10. Portuguese (pt)
        _stringTables[AuroraLanguage.Portuguese] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["AppTitle"] = "STORM DS",
            ["Play"] = "Jogar",
            ["Pause"] = "Pausar",
            ["Stop"] = "Parar",
            ["Settings"] = "Configurações",
            ["Library"] = "Biblioteca",
            ["Favorites"] = "Favoritos",
            ["Recent"] = "Jogos recentes",
            ["Search"] = "Pesquisar...",
            ["UpdateAvailable"] = "Atualização disponível",
            ["Exit"] = "Sair"
        };

        // 11. Hindi (hi)
        _stringTables[AuroraLanguage.Hindi] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["AppTitle"] = "STORM DS",
            ["Play"] = "खेलें",
            ["Pause"] = "रोकें",
            ["Stop"] = "समाप्त करें",
            ["Settings"] = "सेटिंग्स",
            ["Library"] = "लाइब्रेरी",
            ["Favorites"] = "पसंदीदा",
            ["Recent"] = "हाल के खेल",
            ["Search"] = "खोजें...",
            ["UpdateAvailable"] = "अपडेट उपलब्ध है",
            ["Exit"] = "बाहर निकलें"
        };
    }
}
