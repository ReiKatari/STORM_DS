// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using StormDs.Core.Paths;

namespace StormDs.Core.Library;

public enum CoverArtType
{
    Cover2D = 0,
    Cover3D = 1
}

/// <summary>
/// Asynchronous service for resolving and caching official 2D and 3D Nintendo DS cover art from GameTDB.
/// </summary>
public sealed class GameTdbArtService
{
    private static readonly string[] Regions = ["US", "EN", "JA", "FR", "DE", "IT", "ES", "ZH", "KO", "RU"];
    private readonly HttpClient _httpClient;

    public GameTdbArtService(HttpClient? httpClient = null)
    {
        _httpClient = httpClient ?? new HttpClient { Timeout = TimeSpan.FromSeconds(8) };
    }

    /// <summary>
    /// Returns the local cached path to the cover image, downloading it from GameTDB if necessary.
    /// </summary>
    public async Task<string?> GetOrDownloadCoverAsync(
        string gameCode,
        CoverArtType type = CoverArtType.Cover2D,
        CancellationToken cancellationToken = default)
    {
        if (string.IsNullOrWhiteSpace(gameCode) || gameCode.Length < 3)
        {
            return null;
        }

        string cleanCode = gameCode.Trim().ToUpperInvariant();
        string typeKey = type == CoverArtType.Cover3D ? "cover3D" : "coverM";
        string localFileName = $"{cleanCode}_{typeKey}.png";
        string localPath = Path.Combine(StormDsPlatformPaths.CoversDirectory, localFileName);

        if (File.Exists(localPath) && new FileInfo(localPath).Length > 1024)
        {
            return localPath;
        }

        Directory.CreateDirectory(StormDsPlatformPaths.CoversDirectory);

        // Try standard GameTDB region URLs
        foreach (string region in Regions)
        {
            if (cancellationToken.IsCancellationRequested) break;

            string url = $"https://art.gametdb.com/ds/{typeKey}/{region}/{cleanCode}.png";
            try
            {
                using var response = await _httpClient.GetAsync(url, HttpCompletionOption.ResponseHeadersRead, cancellationToken);
                if (response.IsSuccessStatusCode)
                {
                    byte[] data = await response.Content.ReadAsByteArrayAsync(cancellationToken);
                    if (data.Length > 1024)
                    {
                        await File.WriteAllBytesAsync(localPath, data, cancellationToken);
                        return localPath;
                    }
                }
            }
            catch
            {
                // Try next region URL
            }
        }

        return null;
    }
}
