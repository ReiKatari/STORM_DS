// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System.Text.Json;
using StormDs.Core.Configuration;
using StormDs.Core.Paths;

namespace StormDs.Core.Subsystems;

public sealed class RetroAchievementsQueueItem
{
    public int AchievementId { get; set; }
    public string GameCode { get; set; } = string.Empty;
    public string Username { get; set; } = string.Empty;
    public DateTime TimestampUtc { get; set; } = DateTime.UtcNow;
    public string SubmissionType { get; set; } = "unlock";
}

/// <summary>
/// Service managing RetroAchievements integration, hardcore mode rules, rich presence,
/// and persistent offline submission queues.
/// </summary>
public sealed class RetroAchievementsService
{
    private readonly HttpClient _httpClient;
    private readonly List<RetroAchievementsQueueItem> _offlineQueue = [];
    private readonly object _lock = new();

    public string Username { get; set; } = string.Empty;
    public string Token { get; set; } = string.Empty;
    public bool IsHardcoreMode { get; set; }
    public bool IsRichPresenceEnabled { get; set; } = true;
    public bool IsLoggedIn => !string.IsNullOrWhiteSpace(Username) && !string.IsNullOrWhiteSpace(Token);

    public RetroAchievementsService(HttpClient? httpClient = null)
    {
        _httpClient = httpClient ?? new HttpClient { Timeout = TimeSpan.FromSeconds(10) };
        LoadOfflineQueue();
    }

    /// <summary>
    /// Validates whether hardcore mode allows save states, rewind, or cheats.
    /// </summary>
    public bool IsFeatureAllowedInCurrentMode(string featureName)
    {
        if (!IsHardcoreMode) return true;

        return featureName.ToLowerInvariant() switch
        {
            "savestate_load" or "loadstate" => false,
            "rewind" => false,
            "cheat" or "cheats" => false,
            "slowdown" => false,
            _ => true
        };
    }

    /// <summary>
    /// Submits achievement unlock or enqueues it if offline.
    /// </summary>
    public async Task<bool> UnlockAchievementAsync(int achievementId, string gameCode, CancellationToken ct = default)
    {
        if (!IsLoggedIn) return false;

        var item = new RetroAchievementsQueueItem
        {
            AchievementId = achievementId,
            GameCode = gameCode,
            Username = Username,
            TimestampUtc = DateTime.UtcNow,
            SubmissionType = "unlock"
        };

        try
        {
            // Submit to RetroAchievements API
            string url = $"https://retroachievements.org/dorequest.php?r=awardachievement&u={Uri.EscapeDataString(Username)}&t={Uri.EscapeDataString(Token)}&a={achievementId}&h={(IsHardcoreMode ? 1 : 0)}";
            using var response = await _httpClient.GetAsync(url, ct);
            if (response.IsSuccessStatusCode)
            {
                return true;
            }
        }
        catch (Exception ex)
        {
            Console.Error.WriteLine($"[RetroAchievementsService] Offline: Queueing unlock {achievementId}: {ex.Message}");
        }

        // Enqueue offline
        lock (_lock)
        {
            _offlineQueue.Add(item);
            SaveOfflineQueue();
        }

        return false;
    }

    /// <summary>
    /// Flushes queued offline achievements when network becomes available.
    /// </summary>
    public async Task<int> FlushOfflineQueueAsync(CancellationToken ct = default)
    {
        if (!IsLoggedIn) return 0;

        List<RetroAchievementsQueueItem> toProcess;
        lock (_lock)
        {
            if (_offlineQueue.Count == 0) return 0;
            toProcess = _offlineQueue.ToList();
        }

        int submittedCount = 0;
        var remaining = new List<RetroAchievementsQueueItem>();

        foreach (var item in toProcess)
        {
            if (ct.IsCancellationRequested) break;
            try
            {
                string url = $"https://retroachievements.org/dorequest.php?r=awardachievement&u={Uri.EscapeDataString(item.Username)}&t={Uri.EscapeDataString(Token)}&a={item.AchievementId}&h={(IsHardcoreMode ? 1 : 0)}";
                using var response = await _httpClient.GetAsync(url, ct);
                if (response.IsSuccessStatusCode)
                {
                    submittedCount++;
                    continue;
                }
            }
            catch
            {
                // Network still failing
            }
            remaining.Add(item);
        }

        lock (_lock)
        {
            _offlineQueue.Clear();
            _offlineQueue.AddRange(remaining);
            SaveOfflineQueue();
        }

        return submittedCount;
    }

    private void LoadOfflineQueue()
    {
        string path = StormDsPlatformPaths.RetroAchievementsQueuePath;
        if (File.Exists(path))
        {
            try
            {
                string json = File.ReadAllText(path);
                var items = JsonSerializer.Deserialize(json, StormDsJsonContext.Default.ListRetroAchievementsQueueItem);
                if (items != null)
                {
                    lock (_lock)
                    {
                        _offlineQueue.Clear();
                        _offlineQueue.AddRange(items);
                    }
                }
            }
            catch
            {
                // Corrupt queue fallback
            }
        }
    }

    private void SaveOfflineQueue()
    {
        try
        {
            string path = StormDsPlatformPaths.RetroAchievementsQueuePath;
            Directory.CreateDirectory(Path.GetDirectoryName(path)!);
            lock (_lock)
            {
                string json = JsonSerializer.Serialize(_offlineQueue, StormDsJsonContext.Default.ListRetroAchievementsQueueItem);
                File.WriteAllText(path, json);
            }
        }
        catch
        {
            // Non-fatal
        }
    }
}
