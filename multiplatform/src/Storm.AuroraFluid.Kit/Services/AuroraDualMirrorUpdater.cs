using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
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

    [JsonPropertyName("html_url")]
    public string HtmlUrl { get; set; } = string.Empty;

    [JsonPropertyName("published_at")]
    public string PublishedAt { get; set; } = string.Empty;

    [JsonPropertyName("created_at")]
    public string CreatedAt { get; set; } = string.Empty;

    [JsonPropertyName("draft")]
    public bool Draft { get; set; }

    [JsonPropertyName("prerelease")]
    public bool Prerelease { get; set; }

    [JsonPropertyName("assets")]
    public List<GitHubAssetInfo>? Assets { get; set; }
}

public sealed class StormMirrorAssetItem
{
    [JsonPropertyName("name")]
    public string Name { get; set; } = string.Empty;

    [JsonPropertyName("downloadUrl")]
    public string DownloadUrl { get; set; } = string.Empty;

    [JsonPropertyName("size")]
    public long Size { get; set; }

    [JsonPropertyName("contentType")]
    public string ContentType { get; set; } = string.Empty;
}

public sealed class StormMirrorReleaseItem
{
    [JsonPropertyName("version")]
    public string Version { get; set; } = string.Empty;

    [JsonPropertyName("title")]
    public string Title { get; set; } = string.Empty;

    [JsonPropertyName("notes")]
    public string Notes { get; set; } = string.Empty;

    [JsonPropertyName("createdAt")]
    public string CreatedAt { get; set; } = string.Empty;

    [JsonPropertyName("publishedAt")]
    public string PublishedAt { get; set; } = string.Empty;

    [JsonPropertyName("isPrerelease")]
    public bool IsPrerelease { get; set; }

    [JsonPropertyName("assets")]
    public List<StormMirrorAssetItem>? Assets { get; set; }
}

public sealed class StormMirrorRepositoryBlock
{
    [JsonPropertyName("releases")]
    public List<StormMirrorReleaseItem>? Releases { get; set; }
}

public sealed class StormMirrorReleasesResponse
{
    [JsonPropertyName("success")]
    public bool Success { get; set; }

    [JsonPropertyName("releases")]
    public List<StormMirrorReleaseItem>? Releases { get; set; }

    [JsonPropertyName("repository")]
    public StormMirrorRepositoryBlock? Repository { get; set; }

    // Legacy single-release mirror payload fields
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
[JsonSerializable(typeof(List<GitHubReleaseResponse>))]
[JsonSerializable(typeof(StormMirrorReleasesResponse))]
[JsonSerializable(typeof(StormMirrorRepositoryBlock))]
[JsonSerializable(typeof(StormMirrorReleaseItem))]
[JsonSerializable(typeof(StormMirrorAssetItem))]
internal partial class AuroraUpdateJsonContext : JsonSerializerContext
{
}

public enum AuroraUpdateDownloadSource
{
    AskEachTime = 0,
    GitHub = 1,
    StormGamesWorld = 2
}

public sealed record AuroraUpdateSourceOption(
    AuroraUpdateDownloadSource Source,
    string SourceLabel,
    string DownloadUrl,
    string ReleasePageUrl,
    string AssetName,
    long AssetSizeBytes,
    string? ExpectedSha256 = null
);

public sealed record AuroraDownloadProgress(
    long DownloadedBytes,
    long TotalBytes,
    double SpeedMbPerSec
);

public sealed record AuroraUpdateCheckResult(
    bool IsUpdateAvailable,
    Version CurrentVersion,
    Version LatestVersion,
    string DownloadUrl,
    string Changelog,
    string? ExpectedSha256,
    string SourceMirror,
    string ReleasePageUrl = "",
    string AssetName = "",
    long AssetSizeBytes = 0,
    DateTimeOffset? PublishedAtUtc = null,
    bool CheckSucceeded = false,
    string? ErrorMessage = null,
    AuroraUpdateSourceOption? GitHubSource = null,
    AuroraUpdateSourceOption? StormMirrorSource = null
)
{
    public AuroraUpdateCheckResult WithSelectedSource(AuroraUpdateDownloadSource source)
    {
        var opt = source switch
        {
            AuroraUpdateDownloadSource.GitHub => GitHubSource,
            AuroraUpdateDownloadSource.StormGamesWorld => StormMirrorSource,
            _ => null
        };
        if (opt == null) return this;
        return this with
        {
            DownloadUrl = opt.DownloadUrl,
            SourceMirror = opt.SourceLabel,
            ReleasePageUrl = opt.ReleasePageUrl,
            AssetName = opt.AssetName,
            AssetSizeBytes = opt.AssetSizeBytes,
            ExpectedSha256 = opt.ExpectedSha256 ?? ExpectedSha256
        };
    }
}

/// <summary>
/// Dual-mirror resilient auto-updater engine (GitHub Releases API + STORM GAMES WORLD mirror).
/// Enforces Law 9 (Assembly version compare, MZ/PK header magic verification, SHA-256 integrity, ESC cancel).
/// </summary>
public sealed class AuroraDualMirrorUpdater
{
    private static readonly HttpClient s_httpClient = new()
    {
        Timeout = TimeSpan.FromSeconds(30)
    };

    static AuroraDualMirrorUpdater()
    {
        s_httpClient.DefaultRequestHeaders.UserAgent.ParseAdd("STORM-AuroraFluid-Updater/8.9.7 (Windows; Android; Linux)");
    }

    public static bool TryParseSemanticVersion(string? raw, out Version version)
    {
        version = new Version(0, 0, 0);
        if (string.IsNullOrWhiteSpace(raw)) return false;

        string clean = raw.Trim().TrimStart('v', 'V').Trim();
        int dashIdx = clean.IndexOf('-');
        if (dashIdx > 0) clean = clean[..dashIdx];
        int plusIdx = clean.IndexOf('+');
        if (plusIdx > 0) clean = clean[..plusIdx];

        if (clean.Count(c => c == '.') == 1)
        {
            clean += ".0";
        }

        return Version.TryParse(clean, out version!);
    }

    private static bool IsNonWindowsAssetName(string name)
    {
        if (string.IsNullOrWhiteSpace(name)) return true;
        string lower = name.Trim().ToLowerInvariant();
        if (!(lower.EndsWith(".exe", StringComparison.Ordinal) ||
              lower.EndsWith(".msi", StringComparison.Ordinal) ||
              lower.EndsWith(".zip", StringComparison.Ordinal)))
        {
            return true;
        }

        if (lower.EndsWith(".zip", StringComparison.Ordinal))
        {
            string[] nonWinMarkers =
            [
                "android", "linux", "macos", "osx", "darwin", "ubuntu",
                "debian", "fedora", "appimage", "arm64-v8a", "armeabi",
                "ios", "flatpak", "snap", "source", "src"
            ];
            foreach (var marker in nonWinMarkers)
            {
                if (lower.Contains(marker, StringComparison.Ordinal))
                {
                    return true;
                }
            }
        }

        return false;
    }

    public static GitHubAssetInfo? SelectBestWindowsAsset(IReadOnlyList<GitHubAssetInfo>? assets)
    {
        if (assets == null || assets.Count == 0) return null;

        var windowsAssets = assets
            .Where(a => !string.IsNullOrWhiteSpace(a.Name) &&
                        !string.IsNullOrWhiteSpace(a.DownloadUrl) &&
                        !IsNonWindowsAssetName(a.Name))
            .ToList();

        if (windowsAssets.Count == 0) return null;

        return windowsAssets.FirstOrDefault(a =>
                   a.Name.Contains("setup", StringComparison.OrdinalIgnoreCase) &&
                   a.Name.EndsWith(".exe", StringComparison.OrdinalIgnoreCase))
               ?? windowsAssets.FirstOrDefault(a =>
                   a.Name.Contains("windows", StringComparison.OrdinalIgnoreCase) &&
                   a.Name.EndsWith(".zip", StringComparison.OrdinalIgnoreCase))
               ?? windowsAssets.FirstOrDefault(a => a.Name.EndsWith(".exe", StringComparison.OrdinalIgnoreCase))
               ?? windowsAssets.FirstOrDefault(a => a.Name.EndsWith(".zip", StringComparison.OrdinalIgnoreCase));
    }

    /// <summary>
    /// Checks GitHub Releases API and STORM GAMES WORLD mirrors in parallel and selects the newest Windows release.
    /// </summary>
    public async Task<AuroraUpdateCheckResult> CheckForUpdateAsync(
        string githubOwner,
        string githubRepo,
        Version currentVersion,
        CancellationToken cancellationToken = default,
        AuroraUpdateDownloadSource preferredSource = AuroraUpdateDownloadSource.AskEachTime)
    {
        var ghTask = TryCheckGitHubAsync(githubOwner, githubRepo, currentVersion, cancellationToken);
        var mirrorTask = TryCheckStormMirrorAsync(githubRepo, currentVersion, cancellationToken);

        await Task.WhenAll(ghTask, mirrorTask).ConfigureAwait(false);

        var (ghOk, ghBest) = await ghTask.ConfigureAwait(false);
        var (mirrorOk, mirrorBest) = await mirrorTask.ConfigureAwait(false);

        bool anySucceeded = ghOk || mirrorOk;

        AuroraUpdateSourceOption? ghOpt = ghBest == null
            ? null
            : new AuroraUpdateSourceOption(
                AuroraUpdateDownloadSource.GitHub,
                "GitHub",
                ghBest.DownloadUrl,
                ghBest.ReleasePageUrl,
                ghBest.AssetName,
                ghBest.AssetSizeBytes,
                ghBest.ExpectedSha256);

        AuroraUpdateSourceOption? sgwOpt = mirrorBest == null
            ? null
            : new AuroraUpdateSourceOption(
                AuroraUpdateDownloadSource.StormGamesWorld,
                "STORM GAMES WORLD",
                mirrorBest.DownloadUrl,
                mirrorBest.ReleasePageUrl,
                mirrorBest.AssetName,
                mirrorBest.AssetSizeBytes,
                mirrorBest.ExpectedSha256);

        AuroraUpdateCheckResult? bestCandidate = null;
        if (ghBest != null && mirrorBest != null)
        {
            if (mirrorBest.LatestVersion > ghBest.LatestVersion)
            {
                bestCandidate = mirrorBest;
            }
            else if (ghBest.LatestVersion > mirrorBest.LatestVersion)
            {
                bestCandidate = ghBest;
            }
            else
            {
                bestCandidate = preferredSource == AuroraUpdateDownloadSource.StormGamesWorld ? mirrorBest : ghBest;
            }

            bestCandidate = bestCandidate with
            {
                GitHubSource = ghOpt,
                StormMirrorSource = sgwOpt,
                Changelog = !string.IsNullOrWhiteSpace(bestCandidate.Changelog)
                    ? bestCandidate.Changelog
                    : (!string.IsNullOrWhiteSpace(ghBest.Changelog) ? ghBest.Changelog : mirrorBest.Changelog)
            };
        }
        else if (ghBest != null || mirrorBest != null)
        {
            bestCandidate = (ghBest ?? mirrorBest)! with
            {
                GitHubSource = ghOpt,
                StormMirrorSource = sgwOpt
            };
        }

        if (bestCandidate != null && bestCandidate.LatestVersion > currentVersion)
        {
            return bestCandidate with { CheckSucceeded = true };
        }

        if (!anySucceeded)
        {
            return new AuroraUpdateCheckResult(
                IsUpdateAvailable: false,
                CurrentVersion: currentVersion,
                LatestVersion: currentVersion,
                DownloadUrl: string.Empty,
                Changelog: string.Empty,
                ExpectedSha256: null,
                SourceMirror: "None",
                CheckSucceeded: false,
                ErrorMessage: "Не удалось подключиться ни к GitHub Releases, ни к зеркалу STORM GAMES WORLD."
            );
        }

        string sourceLabel = preferredSource == AuroraUpdateDownloadSource.StormGamesWorld
            ? (mirrorOk ? "STORM GAMES WORLD" : "GitHub")
            : (ghOk ? "GitHub" : "STORM GAMES WORLD");
        return new AuroraUpdateCheckResult(
            IsUpdateAvailable: false,
            CurrentVersion: currentVersion,
            LatestVersion: currentVersion,
            DownloadUrl: string.Empty,
            Changelog: string.Empty,
            ExpectedSha256: null,
            SourceMirror: sourceLabel,
            ReleasePageUrl: $"https://github.com/{githubOwner}/{githubRepo}/releases",
            CheckSucceeded: true
        );
    }

    private static async Task<(bool Succeeded, AuroraUpdateCheckResult? Best)> TryCheckGitHubAsync(
        string githubOwner,
        string githubRepo,
        Version currentVersion,
        CancellationToken ct)
    {
        bool ok = false;
        var candidates = new List<AuroraUpdateCheckResult>();

        try
        {
            var listUrl = $"https://api.github.com/repos/{githubOwner}/{githubRepo}/releases?per_page=10";
            using var req = new HttpRequestMessage(HttpMethod.Get, listUrl);
            using var resp = await s_httpClient.SendAsync(req, HttpCompletionOption.ResponseHeadersRead, ct).ConfigureAwait(false);

            if (resp.IsSuccessStatusCode)
            {
                ok = true;
                await using var stream = await resp.Content.ReadAsStreamAsync(ct).ConfigureAwait(false);
                var releases = await JsonSerializer.DeserializeAsync(stream, AuroraUpdateJsonContext.Default.ListGitHubReleaseResponse, ct).ConfigureAwait(false);
                if (releases != null)
                {
                    foreach (var rel in releases.Where(r => !r.Draft && !r.Prerelease))
                    {
                        var mapped = MapGitHubRelease(rel, githubOwner, githubRepo, currentVersion);
                        if (mapped != null) candidates.Add(mapped);
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
            // Fallback to /releases/latest
        }

        if (candidates.Count == 0)
        {
            try
            {
                var latestUrl = $"https://api.github.com/repos/{githubOwner}/{githubRepo}/releases/latest";
                using var req = new HttpRequestMessage(HttpMethod.Get, latestUrl);
                using var resp = await s_httpClient.SendAsync(req, HttpCompletionOption.ResponseHeadersRead, ct).ConfigureAwait(false);
                if (resp.IsSuccessStatusCode)
                {
                    ok = true;
                    await using var stream = await resp.Content.ReadAsStreamAsync(ct).ConfigureAwait(false);
                    var rel = await JsonSerializer.DeserializeAsync(stream, AuroraUpdateJsonContext.Default.GitHubReleaseResponse, ct).ConfigureAwait(false);
                    if (rel != null && !rel.Draft)
                    {
                        var mapped = MapGitHubRelease(rel, githubOwner, githubRepo, currentVersion);
                        if (mapped != null) candidates.Add(mapped);
                    }
                }
            }
            catch (OperationCanceledException)
            {
                throw;
            }
            catch
            {
                // Ignore and rely on mirror
            }
        }

        var best = candidates.OrderByDescending(c => c.LatestVersion).FirstOrDefault();
        return (ok, best);
    }

    private static AuroraUpdateCheckResult? MapGitHubRelease(
        GitHubReleaseResponse rel,
        string owner,
        string repo,
        Version currentVersion)
    {
        if (!TryParseSemanticVersion(rel.TagName, out var remoteVersion) || remoteVersion <= currentVersion)
        {
            return null;
        }

        var asset = SelectBestWindowsAsset(rel.Assets);
        if (asset == null) return null;

        DateTimeOffset? published = DateTimeOffset.TryParse(
            !string.IsNullOrWhiteSpace(rel.PublishedAt) ? rel.PublishedAt : rel.CreatedAt,
            out var dto)
            ? dto
            : null;

        string pageUrl = !string.IsNullOrWhiteSpace(rel.HtmlUrl)
            ? rel.HtmlUrl
            : $"https://github.com/{owner}/{repo}/releases/tag/{rel.TagName}";

        return new AuroraUpdateCheckResult(
            IsUpdateAvailable: true,
            CurrentVersion: currentVersion,
            LatestVersion: remoteVersion,
            DownloadUrl: asset.DownloadUrl,
            Changelog: rel.Body ?? string.Empty,
            ExpectedSha256: null,
            SourceMirror: "GitHub",
            ReleasePageUrl: pageUrl,
            AssetName: asset.Name,
            AssetSizeBytes: asset.Size,
            PublishedAtUtc: published,
            CheckSucceeded: true
        );
    }

    private static async Task<(bool Succeeded, AuroraUpdateCheckResult? Best)> TryCheckStormMirrorAsync(
        string githubRepo,
        Version currentVersion,
        CancellationToken ct)
    {
        string[] mirrorUrls =
        {
            $"https://stormgamesworld.ru/api/programs/releases?repo={githubRepo}",
            $"https://stormgamesworld.ru/api/programs?repo={githubRepo}",
            $"https://storm-games.world/api/programs/releases?repo={githubRepo}",
            $"https://storm-games.world/api/programs?repo={githubRepo}"
        };

        bool anyOk = false;
        var candidates = new List<AuroraUpdateCheckResult>();

        foreach (var mirrorUrl in mirrorUrls)
        {
            try
            {
                bool isAlt = mirrorUrl.Contains("storm-games.world", StringComparison.OrdinalIgnoreCase);
                string host = isAlt ? "https://storm-games.world" : "https://stormgamesworld.ru";

                using var req = new HttpRequestMessage(HttpMethod.Get, mirrorUrl);
                using var resp = await s_httpClient.SendAsync(req, HttpCompletionOption.ResponseHeadersRead, ct).ConfigureAwait(false);
                if (!resp.IsSuccessStatusCode) continue;

                anyOk = true;
                await using var stream = await resp.Content.ReadAsStreamAsync(ct).ConfigureAwait(false);
                var data = await JsonSerializer.DeserializeAsync(stream, AuroraUpdateJsonContext.Default.StormMirrorReleasesResponse, ct).ConfigureAwait(false);
                if (data == null) continue;

                var list = data.Repository?.Releases ?? data.Releases;
                if (list != null && list.Count > 0)
                {
                    foreach (var item in list.Where(r => !r.IsPrerelease))
                    {
                        if (!TryParseSemanticVersion(item.Version, out var remoteVer) || remoteVer <= currentVersion) continue;

                        var mappedAssets = (item.Assets ?? []).Select(a => new GitHubAssetInfo
                        {
                            Name = a.Name,
                            DownloadUrl = NormalizeMirrorDownloadUrl(a.DownloadUrl, a.Name, host, githubRepo),
                            Size = a.Size
                        }).ToList();

                        var asset = SelectBestWindowsAsset(mappedAssets);
                        if (asset == null)
                        {
                            if (mappedAssets.Count > 0)
                            {
                                continue;
                            }
                            string verStr = remoteVer.ToString();
                            string setupName = $"{githubRepo}_{verStr}_Setup.exe";
                            asset = new GitHubAssetInfo
                            {
                                Name = setupName,
                                DownloadUrl = $"{host}/uploads/programs/{githubRepo}/{setupName}",
                                Size = 0
                            };
                        }

                        DateTimeOffset? published = DateTimeOffset.TryParse(
                            !string.IsNullOrWhiteSpace(item.PublishedAt) ? item.PublishedAt : item.CreatedAt,
                            out var dto)
                            ? dto
                            : null;

                        candidates.Add(new AuroraUpdateCheckResult(
                            IsUpdateAvailable: true,
                            CurrentVersion: currentVersion,
                            LatestVersion: remoteVer,
                            DownloadUrl: asset.DownloadUrl,
                            Changelog: item.Notes ?? string.Empty,
                            ExpectedSha256: null,
                            SourceMirror: "STORM GAMES WORLD",
                            ReleasePageUrl: $"{host}/programs?repo={githubRepo}&tag={item.Version}",
                            AssetName: asset.Name,
                            AssetSizeBytes: asset.Size,
                            PublishedAtUtc: published,
                            CheckSucceeded: true
                        ));
                    }
                }
                else if (TryParseSemanticVersion(data.Version, out var singleVer) && singleVer > currentVersion && !string.IsNullOrWhiteSpace(data.DownloadUrl))
                {
                    string normUrl = NormalizeMirrorDownloadUrl(data.DownloadUrl, Path.GetFileName(data.DownloadUrl), host, githubRepo);
                    string singleFileName = Path.GetFileName(normUrl);
                    if (!IsNonWindowsAssetName(singleFileName))
                    {
                        candidates.Add(new AuroraUpdateCheckResult(
                            IsUpdateAvailable: true,
                            CurrentVersion: currentVersion,
                            LatestVersion: singleVer,
                            DownloadUrl: normUrl,
                            Changelog: data.Changelog ?? string.Empty,
                            ExpectedSha256: string.IsNullOrWhiteSpace(data.Sha256) ? null : data.Sha256,
                            SourceMirror: "STORM GAMES WORLD",
                            ReleasePageUrl: $"{host}/programs?repo={githubRepo}",
                            AssetName: singleFileName,
                            AssetSizeBytes: 0,
                            PublishedAtUtc: null,
                            CheckSucceeded: true
                        ));
                    }
                }

                bool validPrimaryPayload = (list != null && list.Count > 0) || TryParseSemanticVersion(data.Version, out _);
                if (candidates.Count > 0 || validPrimaryPayload) break;
            }
            catch (OperationCanceledException)
            {
                throw;
            }
            catch
            {
                // Try next mirror URL
            }
        }

        var best = candidates.OrderByDescending(c => c.LatestVersion).FirstOrDefault();
        return (anyOk, best);
    }

    private static string NormalizeMirrorDownloadUrl(string rawUrl, string fileName, string host, string repo)
    {
        string trimmed = (rawUrl ?? string.Empty).Trim();
        if (string.IsNullOrEmpty(trimmed))
        {
            return $"{host}/uploads/programs/{repo}/{fileName}";
        }
        if (trimmed.StartsWith("http://", StringComparison.OrdinalIgnoreCase) ||
            trimmed.StartsWith("https://", StringComparison.OrdinalIgnoreCase))
        {
            return trimmed;
        }
        if (trimmed.StartsWith('/'))
        {
            return $"{host}{trimmed}";
        }
        return trimmed.Contains('/')
            ? $"{host}/{trimmed}"
            : $"{host}/uploads/programs/{repo}/{trimmed}";
    }

    /// <summary>
    /// Simple overload retaining 0..1 normalized progress callbacks.
    /// </summary>
    public Task<bool> DownloadAndVerifyAsync(
        string downloadUrl,
        string destinationFilePath,
        string? expectedSha256 = null,
        IProgress<double>? progress = null,
        CancellationToken cancellationToken = default)
    {
        IProgress<AuroraDownloadProgress>? detailed = progress == null
            ? null
            : new Progress<AuroraDownloadProgress>(p =>
            {
                if (p.TotalBytes > 0)
                {
                    progress.Report((double)p.DownloadedBytes / p.TotalBytes);
                }
            });

        return DownloadAndVerifyAsync(downloadUrl, destinationFilePath, expectedSha256, detailed, cancellationToken);
    }

    /// <summary>
    /// Downloads the update package with live EMA MB/s progress, magic binary verification, and SHA-256 check.
    /// </summary>
    public async Task<bool> DownloadAndVerifyAsync(
        string downloadUrl,
        string destinationFilePath,
        string? expectedSha256,
        IProgress<AuroraDownloadProgress>? detailedProgress,
        CancellationToken cancellationToken = default,
        string? githubRepo = null)
    {
        if (string.IsNullOrWhiteSpace(downloadUrl)) return false;

        Directory.CreateDirectory(Path.GetDirectoryName(destinationFilePath) ?? Path.GetTempPath());
        var candidateUrls = new List<string> { downloadUrl };
        string fileName = Path.GetFileName(destinationFilePath);
        if (!string.IsNullOrWhiteSpace(githubRepo) && !string.IsNullOrWhiteSpace(fileName))
        {
            if (!downloadUrl.Contains("stormgamesworld.ru", StringComparison.OrdinalIgnoreCase))
            {
                string sgw1 = $"https://stormgamesworld.ru/uploads/programs/{githubRepo}/{fileName}";
                if (!candidateUrls.Any(u => string.Equals(u, sgw1, StringComparison.OrdinalIgnoreCase))) candidateUrls.Add(sgw1);
            }
            if (!downloadUrl.Contains("storm-games.world", StringComparison.OrdinalIgnoreCase))
            {
                string sgw2 = $"https://storm-games.world/uploads/programs/{githubRepo}/{fileName}";
                if (!candidateUrls.Any(u => string.Equals(u, sgw2, StringComparison.OrdinalIgnoreCase))) candidateUrls.Add(sgw2);
            }
            if (!downloadUrl.Contains("github.com", StringComparison.OrdinalIgnoreCase))
            {
                var verMatch = System.Text.RegularExpressions.Regex.Match(fileName, @"(\d+\.\d+\.\d+)");
                if (verMatch.Success)
                {
                    string verTag = verMatch.Groups[1].Value;
                    string ghFallback = $"https://github.com/ReiKatari/{githubRepo}/releases/download/{verTag}/{fileName}";
                    if (!candidateUrls.Any(u => string.Equals(u, ghFallback, StringComparison.OrdinalIgnoreCase))) candidateUrls.Add(ghFallback);
                }
            }
        }

        var tempPath = destinationFilePath + ".tmp";

        foreach (var url in candidateUrls)
        {
            try
            {
                if (File.Exists(tempPath)) File.Delete(tempPath);

                using var resp = await s_httpClient.GetAsync(url, HttpCompletionOption.ResponseHeadersRead, cancellationToken).ConfigureAwait(false);
                if (!resp.IsSuccessStatusCode) continue;

                long totalBytes = resp.Content.Headers.ContentLength ?? -1L;
                await using var inStream = await resp.Content.ReadAsStreamAsync(cancellationToken).ConfigureAwait(false);
                await using (var outStream = new FileStream(tempPath, FileMode.Create, FileAccess.Write, FileShare.None))
                {
                    var buffer = new byte[81920];
                    long bytesReadTotal = 0;
                    long lastSampleBytes = 0;
                    long lastSampleTicks = Environment.TickCount64;
                    double emaSpeed = 0.0;

                    detailedProgress?.Report(new AuroraDownloadProgress(0, totalBytes, 0.0));

                    int read;
                    while ((read = await inStream.ReadAsync(buffer, cancellationToken).ConfigureAwait(false)) > 0)
                    {
                        await outStream.WriteAsync(buffer.AsMemory(0, read), cancellationToken).ConfigureAwait(false);
                        bytesReadTotal += read;

                        long nowTicks = Environment.TickCount64;
                        long dtMs = nowTicks - lastSampleTicks;
                        if (dtMs >= 250 || (totalBytes > 0 && bytesReadTotal >= totalBytes))
                        {
                            if (dtMs > 0)
                            {
                                double instant = ((bytesReadTotal - lastSampleBytes) / (1024.0 * 1024.0)) / (dtMs / 1000.0);
                                emaSpeed = emaSpeed <= 0.01 ? instant : (emaSpeed * 0.65 + instant * 0.35);
                                lastSampleTicks = nowTicks;
                                lastSampleBytes = bytesReadTotal;
                            }
                            detailedProgress?.Report(new AuroraDownloadProgress(bytesReadTotal, totalBytes, emaSpeed));
                        }
                    }

                    await outStream.FlushAsync(cancellationToken).ConfigureAwait(false);
                }

                if (!VerifyBinaryMagicHeader(tempPath))
                {
                    File.Delete(tempPath);
                    continue;
                }

                if (!string.IsNullOrEmpty(expectedSha256))
                {
                    using var sha = SHA256.Create();
                    await using var verifyStream = File.OpenRead(tempPath);
                    var hashBytes = await sha.ComputeHashAsync(verifyStream, cancellationToken).ConfigureAwait(false);
                    var computedHash = Convert.ToHexString(hashBytes);

                    if (!string.Equals(computedHash, expectedSha256, StringComparison.OrdinalIgnoreCase))
                    {
                        File.Delete(tempPath);
                        continue;
                    }
                }

                if (File.Exists(destinationFilePath))
                {
                    File.Delete(destinationFilePath);
                }
                File.Move(tempPath, destinationFilePath);
                return true;
            }
            catch (OperationCanceledException)
            {
                if (File.Exists(tempPath))
                {
                    try { File.Delete(tempPath); } catch { }
                }
                throw;
            }
            catch
            {
                if (File.Exists(tempPath))
                {
                    try { File.Delete(tempPath); } catch { }
                }
            }
        }

        return false;
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

            if (header[0] == 0x4D && header[1] == 0x5A)
            {
                return true;
            }

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
