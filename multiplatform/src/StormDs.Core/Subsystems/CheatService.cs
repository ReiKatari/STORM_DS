// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System.Globalization;
using System.Text.Json;
using StormDs.Core.Configuration;
using StormDs.Core.Native;
using StormDs.Core.Paths;

namespace StormDs.Core.Subsystems;

public sealed class ActionReplayCheat
{
    public string Name { get; set; } = string.Empty;
    public string Note { get; set; } = string.Empty;
    public bool Enabled { get; set; } = true;
    public List<string> CodeLines { get; set; } = [];

    /// <summary>
    /// Compiles full multi-line ActionReplay code words without masking top opcode nibble.
    /// </summary>
    public unsafe StormDsCheatEntry? CompileToNativeEntry()
    {
        var words = new List<uint>(64);
        foreach (string rawLine in CodeLines)
        {
            string line = rawLine.Trim();
            if (string.IsNullOrWhiteSpace(line) || line.StartsWith('#') || line.StartsWith("//") || line.StartsWith(';'))
            {
                continue;
            }

            string[] parts = line.Split([' ', '\t'], StringSplitOptions.RemoveEmptyEntries);
            foreach (string part in parts)
            {
                if (uint.TryParse(part, NumberStyles.HexNumber, CultureInfo.InvariantCulture, out uint word))
                {
                    words.Add(word);
                    if (words.Count >= 64) break;
                }
            }
            if (words.Count >= 64) break;
        }

        if (words.Count < 2) return null;

        var entry = new StormDsCheatEntry
        {
            CodeWordCount = Math.Min(words.Count, 64),
            Enabled = (byte)(Enabled ? 1 : 0)
        };
        for (int i = 0; i < entry.CodeWordCount; i++)
        {
            entry.CodeWords[i] = words[i];
        }
        entry.SetName(Name);
        return entry;
    }
}

/// <summary>
/// Service for loading, parsing, and applying ActionReplay and raw cheats to the active emulation instance.
/// </summary>
public sealed class CheatService
{
    private readonly List<ActionReplayCheat> _cheats = [];
    private readonly object _lock = new();

    public IReadOnlyList<ActionReplayCheat> Cheats
    {
        get
        {
            lock (_lock) return _cheats.ToList();
        }
    }

    public void LoadCheatsForGame(string gameCode)
    {
        if (string.IsNullOrWhiteSpace(gameCode)) return;

        string cheatFilePath = Path.Combine(StormDsPlatformPaths.CheatsDirectory, $"{gameCode.Trim()}.json");
        lock (_lock)
        {
            _cheats.Clear();
            if (File.Exists(cheatFilePath))
            {
                try
                {
                    string json = File.ReadAllText(cheatFilePath);
                    var list = JsonSerializer.Deserialize(json, StormDsJsonContext.Default.ListActionReplayCheat);
                    if (list != null)
                    {
                        _cheats.AddRange(list);
                    }
                }
                catch (Exception ex)
                {
                    Console.Error.WriteLine($"[CheatService] Notice: Failed loading cheats for {gameCode}: {ex.Message}");
                }
            }
        }
    }

    public void SaveCheatsForGame(string gameCode)
    {
        if (string.IsNullOrWhiteSpace(gameCode)) return;

        try
        {
            Directory.CreateDirectory(StormDsPlatformPaths.CheatsDirectory);
            string cheatFilePath = Path.Combine(StormDsPlatformPaths.CheatsDirectory, $"{gameCode.Trim()}.json");
            lock (_lock)
            {
                string json = JsonSerializer.Serialize(_cheats, StormDsJsonContext.Default.ListActionReplayCheat);
                File.WriteAllText(cheatFilePath, json);
            }
        }
        catch (Exception ex)
        {
            Console.Error.WriteLine($"[CheatService] Error saving cheats for {gameCode}: {ex.Message}");
        }
    }

    public void AddCheat(ActionReplayCheat cheat, string gameCode)
    {
        lock (_lock)
        {
            _cheats.Add(cheat);
        }
        SaveCheatsForGame(gameCode);
    }

    public void RemoveCheat(int index, string gameCode)
    {
        lock (_lock)
        {
            if (index >= 0 && index < _cheats.Count)
            {
                _cheats.RemoveAt(index);
            }
        }
        SaveCheatsForGame(gameCode);
    }

    public void ToggleCheat(int index, string gameCode)
    {
        lock (_lock)
        {
            if (index >= 0 && index < _cheats.Count)
            {
                _cheats[index].Enabled = !_cheats[index].Enabled;
            }
        }
        SaveCheatsForGame(gameCode);
    }

    /// <summary>
    /// Compiles all active cheats and pushes them to the native emulation core.
    /// </summary>
    public unsafe bool ApplyCheatsToNative(nint nativeHandle, bool cheatsAllowed = true)
    {
        if (nativeHandle == nint.Zero || !StormDsNative.IsAvailable) return false;

        if (!cheatsAllowed)
        {
            StormDsNative.storm_ds_set_cheats(nativeHandle, null, 0);
            return true;
        }

        List<StormDsCheatEntry> nativeEntries = [];
        lock (_lock)
        {
            foreach (var cheat in _cheats.Where(c => c.Enabled))
            {
                var compiled = cheat.CompileToNativeEntry();
                if (compiled.HasValue)
                {
                    nativeEntries.Add(compiled.Value);
                }
            }
        }

        if (nativeEntries.Count == 0)
        {
            StormDsNative.storm_ds_set_cheats(nativeHandle, null, 0);
            return true;
        }

        fixed (StormDsCheatEntry* ptr = nativeEntries.ToArray())
        {
            return StormDsNative.storm_ds_set_cheats(nativeHandle, ptr, (nuint)nativeEntries.Count) == 0;
        }
    }
}
