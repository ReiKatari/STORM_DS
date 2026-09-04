using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.IO;
using System.Linq;
using System.Text.Encodings.Web;
using System.Text.Json;

namespace StormDsiDecryptor;

public static class HistoryManager
{
    private static readonly string HistoryDir = Path.Combine(
        Environment.GetFolderPath(Environment.SpecialFolder.ApplicationData),
        "STORM DSi Decryptor");

    private static readonly string HistoryFile = Path.Combine(HistoryDir, "history.json");

    private static readonly JsonSerializerOptions JsonOptions = new()
    {
        WriteIndented = true,
        Encoder = JavaScriptEncoder.UnsafeRelaxedJsonEscaping
    };

    public static ObservableCollection<HistoryItem> Items { get; } = new();

    public static void Load()
    {
        try
        {
            Items.Clear();
            if (File.Exists(HistoryFile))
            {
                string json = File.ReadAllText(HistoryFile);
                var list = JsonSerializer.Deserialize<List<HistoryItem>>(json, JsonOptions);
                if (list != null)
                {
                    foreach (var item in list.OrderByDescending(x => x.ProcessedAt))
                    {
                        Items.Add(item);
                    }
                }
            }
        }
        catch { }
    }

    public static void Save()
    {
        try
        {
            Directory.CreateDirectory(HistoryDir);
            string json = JsonSerializer.Serialize(Items.ToList(), JsonOptions);
            File.WriteAllText(HistoryFile, json);
        }
        catch { }
    }

    public static void Add(HistoryItem item)
    {
        try
        {
            var existing = Items.FirstOrDefault(x =>
                x.FilePath.Equals(item.FilePath, StringComparison.OrdinalIgnoreCase) ||
                (!string.IsNullOrEmpty(x.GameCode) && x.GameCode != "-" && x.GameCode.Equals(item.GameCode, StringComparison.OrdinalIgnoreCase)));
            if (existing != null)
            {
                Items.Remove(existing);
            }

            Items.Insert(0, item);
            Save();
        }
        catch { }
    }

    public static void Remove(HistoryItem item)
    {
        try
        {
            if (Items.Remove(item))
            {
                Save();
            }
        }
        catch { }
    }

    public static void Clear()
    {
        try
        {
            Items.Clear();
            Save();
        }
        catch { }
    }

    public static HistoryItem? FindPrevious(string filePath, string gameCode)
    {
        return Items.FirstOrDefault(x =>
            x.FilePath.Equals(filePath, StringComparison.OrdinalIgnoreCase) ||
            (!string.IsNullOrEmpty(gameCode) && gameCode != "-" && x.GameCode.Equals(gameCode, StringComparison.OrdinalIgnoreCase)));
    }
}
