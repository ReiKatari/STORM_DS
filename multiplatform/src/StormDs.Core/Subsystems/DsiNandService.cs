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
    public string Name { get; set; } = string.Empty;
    public long SizeBytes { get; set; }
    public byte Category { get; set; }
    public byte Version { get; set; }
}

public sealed class DsiNandSummaryModel
{
    public ulong TotalCapacityBytes { get; set; }
    public ulong FreeSpaceBytes { get; set; }
    public int InstalledTitleCount { get; set; }
    public string SystemVersion { get; set; } = "1.4.5";
    public bool NeedsRepair { get; set; }
}

/// <summary>
/// Service managing DSiWare NAND filesystem images, title installation, deletion,
/// and automated save signature repair per 7.7.4+ standards.
/// </summary>
public sealed class DsiNandService
{
    public unsafe (DsiNandSummaryModel Summary, List<DsiTitleMetadata> Titles) ScanNand(string? nandPath = null)
    {
        string targetPath = !string.IsNullOrWhiteSpace(nandPath) ? nandPath : StormDsPlatformPaths.NandDirectory;
        var summary = new DsiNandSummaryModel();
        var titles = new List<DsiTitleMetadata>();

        if (StormDsNative.IsAvailable && File.Exists(targetPath))
        {
            byte[] pathBytes = Encoding.UTF8.GetBytes(targetPath + "\0");
            fixed (byte* pPath = pathBytes)
            {
                StormDsNandSummary nativeSummary = default;
                const int maxTitles = 64;
                StormDsNandTitleInfo* nativeTitles = stackalloc StormDsNandTitleInfo[maxTitles];
                nuint outCount = 0;

                int res = StormDsNative.storm_ds_nand_scan(pPath, &nativeSummary, nativeTitles, maxTitles, &outCount);
                if (res == 0)
                {
                    summary.TotalCapacityBytes = nativeSummary.TotalCapacityBytes;
                    summary.FreeSpaceBytes = nativeSummary.FreeSpaceBytes;
                    summary.InstalledTitleCount = (int)nativeSummary.InstalledTitleCount;
                    summary.SystemVersion = $"{nativeSummary.SystemVersionMajor}.{nativeSummary.SystemVersionMinor}";
                    summary.NeedsRepair = nativeSummary.NeedsRepair != 0;

                    for (nuint i = 0; i < outCount; i++)
                    {
                        titles.Add(new DsiTitleMetadata
                        {
                            TitleId = nativeTitles[i].TitleId,
                            Name = nativeTitles[i].GetName(),
                            SizeBytes = (long)nativeTitles[i].SizeBytes,
                            Category = nativeTitles[i].Category,
                            Version = (byte)nativeTitles[i].Version
                        });
                    }
                    return (summary, titles);
                }
            }
        }

        // Managed folder fallback
        string titleDir = Path.Combine(targetPath, "title");
        if (Directory.Exists(titleDir))
        {
            var appFiles = Directory.EnumerateFiles(titleDir, "*.app", SearchOption.AllDirectories);
            ulong fakeId = 0x0003000400000001;
            foreach (string app in appFiles)
            {
                var fi = new FileInfo(app);
                titles.Add(new DsiTitleMetadata
                {
                    TitleId = fakeId++,
                    Name = Path.GetFileNameWithoutExtension(app),
                    SizeBytes = fi.Length,
                    Category = 4,
                    Version = 1
                });
            }
            summary.InstalledTitleCount = titles.Count;
            summary.TotalCapacityBytes = 256 * 1024 * 1024; // 256 MB standard DSi NAND
            summary.FreeSpaceBytes = 120 * 1024 * 1024;
        }

        return (summary, titles);
    }

    public unsafe bool ImportTitle(string nandPath, string appOrNdsPath)
    {
        if (StormDsNative.IsAvailable && File.Exists(nandPath) && File.Exists(appOrNdsPath))
        {
            byte[] nandBytes = Encoding.UTF8.GetBytes(nandPath + "\0");
            byte[] appBytes = Encoding.UTF8.GetBytes(appOrNdsPath + "\0");
            fixed (byte* pNand = nandBytes)
            fixed (byte* pApp = appBytes)
            {
                return StormDsNative.storm_ds_nand_import_title(pNand, pApp) == 0;
            }
        }
        return false;
    }

    public unsafe bool DeleteTitle(string nandPath, ulong titleId)
    {
        if (StormDsNative.IsAvailable && File.Exists(nandPath))
        {
            byte[] nandBytes = Encoding.UTF8.GetBytes(nandPath + "\0");
            fixed (byte* pNand = nandBytes)
            {
                return StormDsNative.storm_ds_nand_delete_title(pNand, titleId) == 0;
            }
        }
        return false;
    }

    public unsafe bool RepairSaves(string nandPath)
    {
        if (StormDsNative.IsAvailable && File.Exists(nandPath))
        {
            byte[] nandBytes = Encoding.UTF8.GetBytes(nandPath + "\0");
            fixed (byte* pNand = nandBytes)
            {
                return StormDsNative.storm_ds_nand_repair_saves(pNand) == 0;
            }
        }
        return false;
    }
}
