// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System.Text;
using StormDs.Core.Native;
using StormDs.Core.Paths;

namespace StormDs.Core.Subsystems;

public sealed class DsiTitleMetadata
{
    public ulong TitleId { get; set; }
    public string TitleIdHex => $"{TitleId:X16}";
    public uint TitleIdLow => (uint)(TitleId & 0xFFFFFFFFUL);
    public string GameCode { get; set; } = string.Empty;
    public string Name { get; set; } = string.Empty;
    public long SizeBytes { get; set; }
    public byte Category { get; set; }
    public byte Version { get; set; }
    public bool PublicSavExists { get; set; }
    public uint[]? IconRgba32 { get; set; }
}

public sealed class DsiNandSummaryModel
{
    public string ResolvedNandPath { get; set; } = string.Empty;
    public bool IsImageValid { get; set; }
    public ulong TotalCapacityBytes { get; set; }
    public ulong FreeSpaceBytes { get; set; }
    public int InstalledTitleCount { get; set; }
    public string SystemVersion { get; set; } = "1.4.5";
    public bool NeedsRepair { get; set; }
}

/// <summary>
/// Service managing DSiWare NAND filesystem images, title installation, deletion,
/// and per-title save signature repair.
/// </summary>
public sealed class DsiNandService
{
    public static string? ResolveNandImageFile(string? explicitPath)
    {
        if (!string.IsNullOrWhiteSpace(explicitPath) && File.Exists(explicitPath))
        {
            return explicitPath;
        }

        string dir = (!string.IsNullOrWhiteSpace(explicitPath) && Directory.Exists(explicitPath))
            ? explicitPath
            : StormDsPlatformPaths.NandDirectory;

        if (!Directory.Exists(dir)) return null;

        return Directory.EnumerateFiles(dir, "*.*", SearchOption.TopDirectoryOnly)
            .FirstOrDefault(f => Path.GetExtension(f).ToLowerInvariant() is ".bin" or ".img" or ".nand");
    }

    public unsafe (DsiNandSummaryModel Summary, List<DsiTitleMetadata> Titles) ScanNand(string? nandPath = null)
    {
        string? imageFile = ResolveNandImageFile(nandPath);
        var summary = new DsiNandSummaryModel
        {
            ResolvedNandPath = imageFile ?? string.Empty
        };
        var titles = new List<DsiTitleMetadata>();

        if (StormDsNative.IsAvailable && !string.IsNullOrWhiteSpace(imageFile) && File.Exists(imageFile))
        {
            byte[] pathBytes = Encoding.UTF8.GetBytes(imageFile + "\0");
            fixed (byte* pPath = pathBytes)
            {
                StormDsNandSummary nativeSummary = default;
                const int maxTitles = 64;
                StormDsNandTitleInfo* nativeTitles = stackalloc StormDsNandTitleInfo[maxTitles];
                nuint outCount = 0;

                int res = StormDsNative.storm_ds_nand_scan(pPath, &nativeSummary, nativeTitles, maxTitles, &outCount);
                if (res == 0)
                {
                    summary.IsImageValid = true;
                    summary.TotalCapacityBytes = nativeSummary.TotalCapacityBytes;
                    summary.FreeSpaceBytes = nativeSummary.FreeSpaceBytes;
                    summary.InstalledTitleCount = (int)nativeSummary.InstalledTitleCount;
                    summary.SystemVersion = $"{nativeSummary.SystemVersionMajor}.{nativeSummary.SystemVersionMinor}";
                    summary.NeedsRepair = nativeSummary.NeedsRepair != 0;

                    for (nuint i = 0; i < outCount; i++)
                    {
                        var icon = new uint[1024];
                        for (int px = 0; px < 1024; px++) icon[px] = nativeTitles[i].IconRgba[px];

                        titles.Add(new DsiTitleMetadata
                        {
                            TitleId = nativeTitles[i].TitleId,
                            GameCode = nativeTitles[i].GetGameCode(),
                            Name = nativeTitles[i].GetName(),
                            SizeBytes = (long)nativeTitles[i].SizeBytes,
                            Category = nativeTitles[i].Category,
                            Version = (byte)nativeTitles[i].Version,
                            PublicSavExists = nativeTitles[i].PublicSavExists != 0,
                            IconRgba32 = icon
                        });
                    }
                    return (summary, titles);
                }
            }
        }

        return (summary, titles);
    }

    public unsafe bool ImportTitle(string nandPath, string appOrNdsPath)
    {
        string? imageFile = ResolveNandImageFile(nandPath);
        if (StormDsNative.IsAvailable && !string.IsNullOrWhiteSpace(imageFile) && File.Exists(imageFile) && File.Exists(appOrNdsPath))
        {
            byte[] nandBytes = Encoding.UTF8.GetBytes(imageFile + "\0");
            byte[] appBytes = Encoding.UTF8.GetBytes(appOrNdsPath + "\0");
            fixed (byte* pNand = nandBytes)
            fixed (byte* pApp = appBytes)
            {
                return StormDsNative.storm_ds_nand_import_title(pNand, pApp) == 1;
            }
        }
        return false;
    }

    public unsafe bool DeleteTitle(string nandPath, ulong titleId)
    {
        string? imageFile = ResolveNandImageFile(nandPath);
        if (StormDsNative.IsAvailable && !string.IsNullOrWhiteSpace(imageFile) && File.Exists(imageFile))
        {
            byte[] nandBytes = Encoding.UTF8.GetBytes(imageFile + "\0");
            fixed (byte* pNand = nandBytes)
            {
                return StormDsNative.storm_ds_nand_delete_title(pNand, titleId) == 0;
            }
        }
        return false;
    }

    public unsafe bool RepairSaves(string nandPath, uint titleIdLow = 0)
    {
        string? imageFile = ResolveNandImageFile(nandPath);
        if (StormDsNative.IsAvailable && !string.IsNullOrWhiteSpace(imageFile) && File.Exists(imageFile))
        {
            byte[] nandBytes = Encoding.UTF8.GetBytes(imageFile + "\0");
            fixed (byte* pNand = nandBytes)
            {
                return StormDsNative.storm_ds_nand_repair_saves(pNand, titleIdLow) == 0;
            }
        }
        return false;
    }
}
