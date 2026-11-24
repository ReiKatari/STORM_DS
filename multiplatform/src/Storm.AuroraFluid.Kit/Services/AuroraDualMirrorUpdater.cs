using System;
using System.Collections.Generic;
using System.IO;
using System.Net.Http;
using System.Security.Cryptography;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.Threading;
using System.Threading.Tasks;

namespace Storm.AuroraFluid.Kit.Services;

public sealed class GitHubAssetInfo
{
    [JsonPropertyName("name")]
    public string Name { get; set; } = string.Empty;

    [JsonPropertyName("browser_download_url")]
    public string DownloadUrl { get; set; } = string.Empty;

    [JsonPropertyName("size")]
    public long Size { get; set; }
}

public sealed class GitHubReleaseResponse
{
    [JsonPropertyName("tag_name")]
    public string TagName { get; set; } = string.Empty;

    [JsonPropertyName("name")]
    public string Name { get; set; } = string.Empty;

    [JsonPropertyName("body")]
    public string Body { get; set; } = string.Empty;

    [JsonPropertyName("assets")]
    public List<GitHubAssetInfo>? Assets { get; set; }
}

public sealed class StormMirrorResponse
{
    [JsonPropertyName("version")]
    public string Version { get; set; } = string.Empty;

    [JsonPropertyName("download_url")]
    public string DownloadUrl { get; set; } = string.Empty;

    [JsonPropertyName("sha256")]
    public string Sha256 { get; set; } = string.Empty;

    [JsonPropertyName("changelog")]
    public string Changelog { get; set; } = string.Empty;
}

[JsonSerializable(typeof(GitHubReleaseResponse))]
[JsonSerializable(typeof(StormMirrorResponse))]
internal partial class AuroraUpdateJsonContext : JsonSerializerContext
{
}

public sealed record AuroraUpdateCheckResult(
    bool IsUpdateAvailable,
    Version CurrentVersion,
    Version LatestVersion,
    string DownloadUrl,
    string Changelog,
    string? ExpectedSha256,
    string SourceMirror
);

/// <summary>
/// Dual-mirror resilient auto-updater engine (GitHub Releases API + STORM GAMES WORLD mirror).
/// Enforces Law 9 (Assembly version compare, MZ/PK header magic verification, SHA-256 integrity, ESC cancel).
/// </summary>
public sealed class AuroraDualMirrorUpdater
{
    private static readonly HttpClient s_httpClient = new()
    {
        Timeout = TimeSpan.FromSeconds(25)
    };

    static AuroraDualMirrorUpdater()
    {
        s_httpClient.DefaultRequestHeaders.UserAgent.ParseAdd("STORM-AuroraFluid-Updater/8.9.0 (Windows; Android; Linux)");
    }

    /// <summary>
    /// Checks for updates against GitHub Releases and fails over to STORM mirror if inaccessible.
    /// </summary>
    public async Task<AuroraUpdateCheckResult> CheckForUpdateAsync(
        string githubOwner,
        string githubRepo,
        Version currentVersion,
        CancellationToken cancellationToken = default)
    {
        // 1. Primary Check: GitHub Releases API
        try
        {
            var ghUrl = $"https://api.github.com/repos/{githubOwner}/{githubRepo}/releases/latest";
            using var req = new HttpRequestMessage(HttpMethod.Get, ghUrl);
            using var resp = await s_httpClient.SendAsync(req, HttpCompletionOption.ResponseHeadersRead, cancellationToken).ConfigureAwait(false);

            if (resp.IsSuccessStatusCode)
            {
                await using var stream = await resp.Content.ReadAsStreamAsync(cancellationToken).ConfigureAwait(false);
                var ghRelease = await JsonSerializer.DeserializeAsync(stream, AuroraUpdateJsonContext.Default.GitHubReleaseResponse, cancellationToken).ConfigureAwait(false);

                if (ghRelease != null)
                {
                    var cleanTag = ghRelease.TagName.TrimStart('v', 'V').Trim();
                    if (Version.TryParse(cleanTag, out var remoteVersion) && remoteVersion > currentVersion)
                    {
                        var downloadUrl = string.Empty;
                        if (ghRelease.Assets != null && ghRelease.Assets.Count > 0)
                        {
                            downloadUrl = ghRelease.Assets[0].DownloadUrl;
                        }

                        return new AuroraUpdateCheckResult(
                            IsUpdateAvailable: true,
                            CurrentVersion: currentVersion,
                            LatestVersion: remoteVersion,
                            DownloadUrl: downloadUrl,
                            Changelog: ghRelease.Body ?? string.Empty,
                            ExpectedSha256: null,
                            SourceMirror: "GitHub Releases"
                        );
                    }
                }
            }
        }
        catch (OperationCanceledException)
        {
            throw;
        }
        catch
        {
            // Failover to secondary mirrors
        }

        // 2. Secondary Failover: STORM GAMES WORLD Mirror
        string[] mirrorUrls =
        {
            $"https://stormgamesworld.ru/api/programs?repo={githubRepo}",
            $"https://storm-games.world/api/programs?repo={githubRepo}"
        };

        foreach (var mirrorUrl in mirrorUrls)
        {
            try
            {
                using var mirrorReq = new HttpRequestMessage(HttpMethod.Get, mirrorUrl);
                using var mirrorResp = await s_httpClient.SendAsync(mirrorReq, HttpCompletionOption.ResponseHeadersRead, cancellationToken).ConfigureAwait(false);

                if (mirrorResp.IsSuccessStatusCode)
                {
                    await using var stream = await mirrorResp.Content.ReadAsStreamAsync(cancellationToken).ConfigureAwait(false);
                    var mirrorData = await JsonSerializer.DeserializeAsync(stream, AuroraUpdateJsonContext.Default.StormMirrorResponse, cancellationToken).ConfigureAwait(false);

                    if (mirrorData != null)
                    {
                        var cleanVer = mirrorData.Version.TrimStart('v', 'V').Trim();
                        if (Version.TryParse(cleanVer, out var remoteVer) && remoteVer > currentVersion)
                        {
                            return new AuroraUpdateCheckResult(
                                IsUpdateAvailable: true,
                                CurrentVersion: currentVersion,
                                LatestVersion: remoteVer,
                                DownloadUrl: mirrorData.DownloadUrl,
                                Changelog: mirrorData.Changelog ?? string.Empty,
                                ExpectedSha256: mirrorData.Sha256,
                                SourceMirror: "STORM GAMES WORLD Mirror"
                            );
                        }
                    }
                }
            }
            catch (OperationCanceledException)
            {
                throw;
            }
            catch
            {
                // Continue to next mirror
            }
        }

        return new AuroraUpdateCheckResult(
            IsUpdateAvailable: false,
            CurrentVersion: currentVersion,
            LatestVersion: currentVersion,
            DownloadUrl: string.Empty,
            Changelog: string.Empty,
            ExpectedSha256: null,
            SourceMirror: "None"
        );
    }

    /// <summary>
    /// Downloads the update package with progress reporting, magic binary verification, and SHA-256 integrity check.
    /// </summary>
    public async Task<bool> DownloadAndVerifyAsync(
        string downloadUrl,
        string destinationFilePath,
        string? expectedSha256 = null,
        IProgress<double>? progress = null,
        CancellationToken cancellationToken = default)
    {
        if (string.IsNullOrWhiteSpace(downloadUrl)) return false;

        var tempPath = destinationFilePath + ".tmp";

        try
        {
            using var resp = await s_httpClient.GetAsync(downloadUrl, HttpCompletionOption.ResponseHeadersRead, cancellationToken).ConfigureAwait(false);
            resp.EnsureSuccessStatusCode();

            long totalBytes = resp.Content.Headers.ContentLength ?? -1L;
            await using var inStream = await resp.Content.ReadAsStreamAsync(cancellationToken).ConfigureAwait(false);
            await using var outStream = new FileStream(tempPath, FileMode.Create, FileAccess.Write, FileShare.None);

            var buffer = new byte[81920];
            long bytesReadTotal = 0;
            int read;

            while ((read = await inStream.ReadAsync(buffer, cancellationToken).ConfigureAwait(false)) > 0)
            {
                await outStream.WriteAsync(buffer.AsMemory(0, read), cancellationToken).ConfigureAwait(false);
                bytesReadTotal += read;

                if (totalBytes > 0 && progress != null)
                {
                    progress.Report((double)bytesReadTotal / totalBytes);
                }
            }

            await outStream.FlushAsync(cancellationToken).ConfigureAwait(false);
            outStream.Close();

            // 1. Magic Binary Verification (Law 9)
            if (!VerifyBinaryMagicHeader(tempPath))
            {
                File.Delete(tempPath);
                return false;
            }

            // 2. SHA-256 Hash Verification (Law 9)
            if (!string.IsNullOrEmpty(expectedSha256))
            {
                using var sha = SHA256.Create();
                await using var verifyStream = File.OpenRead(tempPath);
                var hashBytes = await sha.ComputeHashAsync(verifyStream, cancellationToken).ConfigureAwait(false);
                var computedHash = Convert.ToHexString(hashBytes);

                if (!string.Equals(computedHash, expectedSha256, StringComparison.OrdinalIgnoreCase))
                {
                    File.Delete(tempPath);
                    return false;
                }
            }

            // Safe Atomic Move
            if (File.Exists(destinationFilePath))
            {
                File.Delete(destinationFilePath);
            }
            File.Move(tempPath, destinationFilePath);
            return true;
        }
        catch
        {
            if (File.Exists(tempPath))
            {
                try { File.Delete(tempPath); } catch { }
            }
            throw;
        }
    }

    /// <summary>
    /// Verifies PE 'MZ' magic header for Windows binaries or 'PK' header for ZIP/APK packages.
    /// </summary>
    public static bool VerifyBinaryMagicHeader(string filePath)
    {
        try
        {
            using var fs = File.OpenRead(filePath);
            var header = new byte[4];
            int read = fs.Read(header, 0, 4);
            if (read < 2) return false;

            // Windows Executable MZ check: 0x4D, 0x5A
            if (header[0] == 0x4D && header[1] == 0x5A)
            {
                return true;
            }

            // ZIP / APK check: 0x50, 0x4B, 0x03, 0x04
            if (read >= 4 && header[0] == 0x50 && header[1] == 0x4B && header[2] == 0x03 && header[3] == 0x04)
            {
                return true;
            }

            return false;
        }
        catch
        {
            return false;
        }
    }
}
