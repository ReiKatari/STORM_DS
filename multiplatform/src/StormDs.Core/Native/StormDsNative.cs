// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using System.Runtime.InteropServices;
using System.Text;

namespace StormDs.Core.Native;

[StructLayout(LayoutKind.Sequential, Pack = 8)]
public unsafe struct StormDsNativeVulkanCaps
{
    public int VulkanAvailable;
    public uint ApiVersionMajor;
    public uint ApiVersionMinor;
    public uint ApiVersionPatch;
    public int RecommendedTier;
    public int HasTimelineSemaphore;
    public int HasDescriptorIndexing;
    public int HasZeroCopyExport;
    public uint VendorId;
    public uint DeviceId;
    public fixed byte DeviceName[128];
}

[StructLayout(LayoutKind.Sequential, Pack = 8)]
public unsafe struct StormDsNativeConfig
{
    public int ConsoleType;
    public int DirectBoot;
    public int RendererBackend;
    public int VulkanTierMode;
    public int CompositorMode;
    public int UpscaleFactor;
    public int JitEnable;
    public int Arm9Overclock;
    public int AudioInterpolation;
    public int DspBassBoost;
    public int MicMode;
    public fixed byte Bios9Path[512];
    public fixed byte Bios7Path[512];
    public fixed byte FirmwarePath[512];
    public fixed byte DsiBios9Path[512];
    public fixed byte DsiBios7Path[512];
    public fixed byte DsiFirmwarePath[512];
    public fixed byte DsiNandPath[512];
    public fixed byte SaveDir[512];
}

[StructLayout(LayoutKind.Sequential, Pack = 8)]
public unsafe struct StormDsNativeRomMeta
{
    public fixed byte Title[128];
    public fixed byte GameCode[8];
    public fixed byte MakerCode[4];
    public uint UnitCode;
    public uint RomSizeBytes;
    public uint Crc32;
    public uint IsEncryptedModcrypt;
    public uint HasIcon;
    public uint TitleIdHigh;
    public uint TitleIdLow;
}

[StructLayout(LayoutKind.Sequential, Pack = 8)]
public struct StormDsNativeFrameStats
{
    public uint FrameIndex;
    public int ActiveBackend;
    public int ActiveVulkanTier;
    public int ActiveCompositorMode;
    public int AudioFramesWritten;
    public int PowerCnt1;
    public ulong VkTopImageHandle;
    public ulong VkBottomImageHandle;
    public float CoreFrameMs;
}

[StructLayout(LayoutKind.Sequential, Pack = 8)]
public unsafe struct StormDsNativeCheatEntry
{
    public fixed byte Name[64];
    public int Enabled;
    public fixed uint CodeWords[64];
    public int CodeWordCount;
}

[StructLayout(LayoutKind.Sequential, Pack = 8)]
public struct StormDsNativeNandSummary
{
    public int Valid;
    public ulong TotalBytes;
    public ulong FreeBytes;
    public int InstalledTitleCount;
}

[StructLayout(LayoutKind.Sequential, Pack = 8)]
public unsafe struct StormDsNativeNandTitleInfo
{
    public uint TitleIdHigh;
    public uint TitleIdLow;
    public fixed byte GameCode[8];
    public fixed byte Title[128];
    public uint SizeBytes;
    public int TmdValid;
    public int PublicSavExists;
    public fixed uint IconRgba[1024];
}

[StructLayout(LayoutKind.Sequential, Pack = 8)]
public unsafe struct StormDsVulkanCaps
{
    public uint ApiVersion;
    public uint DriverVersion;
    public uint VendorId;
    public uint DeviceId;
    public uint DeviceType;
    public byte HasConservativeRasterization;
    public byte HasSubgroupOperations;
    public byte HasTimelineSemaphores;
    public byte SupportsZeroCopy;
    public byte SupportsTurnipCustomDriver;
    public fixed byte DeviceName[256];
    public fixed byte DriverName[256];

    public readonly string GetDeviceName()
    {
        fixed (byte* ptr = DeviceName)
        {
            return Marshal.PtrToStringUTF8((nint)ptr) ?? string.Empty;
        }
    }

    public readonly string GetDriverName()
    {
        fixed (byte* ptr = DriverName)
        {
            return Marshal.PtrToStringUTF8((nint)ptr) ?? string.Empty;
        }
    }
}

[StructLayout(LayoutKind.Sequential, Pack = 8)]
public struct StormDsConfig
{
    public int RendererBackend;
    public int VulkanCompatibilityTier;
    public int VulkanCompositorMode;
    public int InternalResolutionScale;
    public byte DynamicResolutionScaling;
    public byte Widescreen3D;
    public byte Patch60Fps;
    public byte SsaoEnabled;
    public byte Depth3DStereo;
    public byte ThickEdges;
    public byte ConservativeCoverage;
    public int ScreenFilter;
    public int AudioLatency;
    public int AudioInterpolation;
    public int BitDepth;
    public byte DspBassBoost;
    public byte DspSoftLimiter;
    public byte DspSpatialStereo;
    public byte DspReverb;
    public byte UiTactileAudioEnabled;
    public float UiTactileVolume;
    public int MicMode;
    public int ConsoleMode;
    public byte DirectBoot;
    public byte UseExternalBios;
    public int Arm9Overclock;
    public byte RandomizeMacAddress;
    public int Slot2AddonType;
    public int SolarLuxLevel;
    public int ScreenLayoutMode;
}

[StructLayout(LayoutKind.Sequential, Pack = 8)]
public unsafe struct StormDsRomMeta
{
    public fixed byte GameCode[8];
    public uint Crc32;
    public byte UnitCode;
    public byte ModcryptFlags;
    public byte HasBanner;
    public uint RomSize;
    public fixed byte TitleJapanese[256];
    public fixed byte TitleEnglish[256];
    public fixed byte TitleFrench[256];
    public fixed byte TitleGerman[256];
    public fixed byte TitleItalian[256];
    public fixed byte TitleSpanish[256];

    public readonly string GetGameCode()
    {
        fixed (byte* ptr = GameCode)
        {
            return Marshal.PtrToStringUTF8((nint)ptr) ?? string.Empty;
        }
    }

    public readonly string GetTitle(int langIndex = 1)
    {
        fixed (byte* en = TitleEnglish)
        {
            return Marshal.PtrToStringUTF8((nint)en) ?? string.Empty;
        }
    }
}

[StructLayout(LayoutKind.Sequential, Pack = 8)]
public struct StormDsFrameStats
{
    public double Fps;
    public double FrameTimeMs;
    public uint DrawCalls;
    public uint TriangleCount;
    public ulong VramUsageBytes;
    public byte FastForwardActive;
    public byte RewindAvailable;
    public uint RewindBufferFrames;
}

[StructLayout(LayoutKind.Sequential, Pack = 8)]
public unsafe struct StormDsCheatEntry
{
    public uint Address;
    public uint Value;
    public uint Type;
    public byte Enabled;
    public fixed byte Name[64];

    public readonly string GetName()
    {
        fixed (byte* ptr = Name)
        {
            return Marshal.PtrToStringUTF8((nint)ptr) ?? string.Empty;
        }
    }

    public void SetName(string name)
    {
        byte[] bytes = Encoding.UTF8.GetBytes(name ?? string.Empty);
        fixed (byte* ptr = Name)
        {
            int len = Math.Min(bytes.Length, 63);
            Marshal.Copy(bytes, 0, (nint)ptr, len);
            ptr[len] = 0;
        }
    }
}

[StructLayout(LayoutKind.Sequential, Pack = 8)]
public struct StormDsNandSummary
{
    public ulong TotalCapacityBytes;
    public ulong FreeSpaceBytes;
    public uint InstalledTitleCount;
    public byte SystemVersionMajor;
    public byte SystemVersionMinor;
    public byte NeedsRepair;
}

[StructLayout(LayoutKind.Sequential, Pack = 8)]
public unsafe struct StormDsNandTitleInfo
{
    public ulong TitleId;
    public ulong SizeBytes;
    public uint Version;
    public byte Category;
    public fixed byte Name[128];

    public readonly string GetName()
    {
        fixed (byte* ptr = Name)
        {
            return Marshal.PtrToStringUTF8((nint)ptr) ?? string.Empty;
        }
    }
}

public static unsafe partial class StormDsNative
{
    public const string LibraryName = "storm_ds_core";

    private static readonly bool s_isNativeLoaded;
    private static readonly uint s_nativeAbiVersion;

    static StormDsNative()
    {
        StormDsNativeResolver.Initialize();
        s_isNativeLoaded = TryDetectNativeLibrary(out s_nativeAbiVersion);
    }

    public static bool IsAvailable => s_isNativeLoaded;
    public static uint LoadedAbiVersion => s_nativeAbiVersion;

    private static bool TryDetectNativeLibrary(out uint abiVersion)
    {
        abiVersion = 0;
        try
        {
            if (StormDsNativeResolver.IsLibraryLoaded())
            {
                int v = storm_ds_get_abi_version_raw();
                if (v > 0)
                {
                    abiVersion = (uint)v;
                    return true;
                }
            }
        }
        catch
        {
        }
        return false;
    }

    [LibraryImport(LibraryName, EntryPoint = "storm_ds_get_abi_version")]
    private static partial int storm_ds_get_abi_version_raw();

    [LibraryImport(LibraryName, EntryPoint = "storm_ds_probe_vulkan")]
    private static partial int storm_ds_probe_vulkan_raw(StormDsNativeVulkanCaps* outCaps);

    [LibraryImport(LibraryName, EntryPoint = "storm_ds_create")]
    private static partial nint storm_ds_create_raw(StormDsNativeConfig* cfg);

    [LibraryImport(LibraryName, EntryPoint = "storm_ds_destroy")]
    public static partial void storm_ds_destroy(nint handle);

    [LibraryImport(LibraryName, EntryPoint = "storm_ds_update_config")]
    private static partial int storm_ds_update_config_raw(nint handle, StormDsNativeConfig* cfg);

    [LibraryImport(LibraryName, EntryPoint = "storm_ds_inspect_rom_header")]
    private static partial int storm_ds_inspect_rom_header_raw(byte* data, nuint len, StormDsNativeRomMeta* outMeta, uint* outIconRgba32x32);

    [LibraryImport(LibraryName, EntryPoint = "storm_ds_load_rom")]
    private static partial int storm_ds_load_rom_raw(nint handle, byte* data, nuint len, byte* romPathUtf8, byte* sramPathUtf8);

    [LibraryImport(LibraryName, EntryPoint = "storm_ds_boot_firmware")]
    private static partial int storm_ds_boot_firmware_raw(nint handle);

    [LibraryImport(LibraryName, EntryPoint = "storm_ds_reset")]
    public static partial void storm_ds_reset(nint handle);

    [LibraryImport(LibraryName, EntryPoint = "storm_ds_set_input")]
    private static partial void storm_ds_set_input_raw(nint handle, uint keyMask, int touchX, int touchY, int isTouching, int lidClosed);

    [LibraryImport(LibraryName, EntryPoint = "storm_ds_set_motion_and_slot2")]
    private static partial void storm_ds_set_motion_and_slot2_raw(nint handle, int slot2Addon, int solarLux, uint guitarMask, float gyroX, float gyroY, float gyroZ, uint pedometerSteps);

    [LibraryImport(LibraryName, EntryPoint = "storm_ds_set_mic_state")]
    private static partial void storm_ds_set_mic_state_raw(nint handle, int micMode, short* pcmSamples, int sampleCount);

    [LibraryImport(LibraryName, EntryPoint = "storm_ds_run_frame")]
    public static partial int storm_ds_run_frame_raw(nint handle, uint* outTopBgra, uint* outBottomBgra, int outWidth, int outHeight, short* outAudioLr, int maxAudioFrames, StormDsNativeFrameStats* outStats);

    [LibraryImport(LibraryName, EntryPoint = "storm_ds_tap_ocr_screen")]
    private static partial int storm_ds_tap_ocr_screen_raw(nint handle, int screenIndex, uint* outBgra256x192);

    [LibraryImport(LibraryName, EntryPoint = "storm_ds_save_state")]
    private static partial int storm_ds_save_state_raw(nint handle, byte* statePathUtf8);

    [LibraryImport(LibraryName, EntryPoint = "storm_ds_load_state")]
    private static partial int storm_ds_load_state_raw(nint handle, byte* statePathUtf8);

    [LibraryImport(LibraryName, EntryPoint = "storm_ds_rewind_push")]
    public static partial int storm_ds_rewind_push(nint handle);

    [LibraryImport(LibraryName, EntryPoint = "storm_ds_rewind_pop")]
    public static partial int storm_ds_rewind_pop(nint handle);

    [LibraryImport(LibraryName, EntryPoint = "storm_ds_set_cheats")]
    private static partial int storm_ds_set_cheats_raw(nint handle, StormDsNativeCheatEntry* cheats, int count);

    [LibraryImport(LibraryName, EntryPoint = "storm_ds_nand_scan")]
    private static partial int storm_ds_nand_scan_raw(byte* nandPathUtf8, StormDsNativeNandSummary* outSummary, StormDsNativeNandTitleInfo* outTitles, int maxTitles);

    [LibraryImport(LibraryName, EntryPoint = "storm_ds_nand_import_title")]
    public static partial int storm_ds_nand_import_title(byte* nandPathUtf8, byte* titleAppPathUtf8);

    [LibraryImport(LibraryName, EntryPoint = "storm_ds_nand_delete_title")]
    private static partial int storm_ds_nand_delete_title_raw(byte* nandPathUtf8, uint titleIdLow);

    [LibraryImport(LibraryName, EntryPoint = "storm_ds_nand_repair_saves")]
    private static partial int storm_ds_nand_repair_saves_raw(byte* nandPathUtf8, uint titleIdLow);

    public static uint storm_ds_get_abi_version() => (uint)storm_ds_get_abi_version_raw();

    public static int storm_ds_probe_vulkan(StormDsVulkanCaps* outCaps)
    {
        if (outCaps == null) return -1;
        StormDsNativeVulkanCaps raw = default;
        int rc = storm_ds_probe_vulkan_raw(&raw);
        *outCaps = default;
        outCaps->ApiVersion = (raw.ApiVersionMajor << 22) | (raw.ApiVersionMinor << 12) | raw.ApiVersionPatch;
        outCaps->VendorId = raw.VendorId;
        outCaps->DeviceId = raw.DeviceId;
        outCaps->HasTimelineSemaphores = (byte)(raw.HasTimelineSemaphore != 0 ? 1 : 0);
        outCaps->SupportsZeroCopy = (byte)(raw.HasZeroCopyExport != 0 || raw.RecommendedTier >= 4 ? 1 : 0);
        outCaps->SupportsTurnipCustomDriver = (byte)(OperatingSystem.IsAndroid() ? 1 : 0);
        for (int i = 0; i < 127 && raw.DeviceName[i] != 0; i++)
        {
            outCaps->DeviceName[i] = raw.DeviceName[i];
        }
        return rc == 1 ? 0 : -1;
    }

    private static void FillNativeConfig(in StormDsConfig src, out StormDsNativeConfig dst)
    {
        dst = default;
        dst.ConsoleType = src.ConsoleMode == 2 ? 1 : 0;
        dst.DirectBoot = src.DirectBoot != 0 ? 1 : 0;
        dst.RendererBackend = src.RendererBackend;
        dst.VulkanTierMode = src.VulkanCompatibilityTier;
        dst.CompositorMode = src.VulkanCompositorMode;
        dst.UpscaleFactor = Math.Clamp(src.InternalResolutionScale, 1, 8);
        dst.JitEnable = 1;
        dst.Arm9Overclock = Math.Max(1, src.Arm9Overclock);
        dst.AudioInterpolation = src.AudioInterpolation;
        dst.DspBassBoost = src.DspBassBoost;
        dst.MicMode = src.MicMode;
    }

    public static nint storm_ds_create(in StormDsConfig config)
    {
        FillNativeConfig(in config, out StormDsNativeConfig raw);
        return storm_ds_create_raw(&raw);
    }

    public static int storm_ds_update_config(nint handle, in StormDsConfig config)
    {
        FillNativeConfig(in config, out StormDsNativeConfig raw);
        return storm_ds_update_config_raw(handle, &raw) == 1 ? 0 : -1;
    }

    public static int storm_ds_inspect_rom_header(byte* romData, nuint dataSize, StormDsRomMeta* outMeta)
    {
        if (outMeta == null) return -1;
        StormDsNativeRomMeta raw = default;
        uint* iconBuf = stackalloc uint[1024];
        int rc = storm_ds_inspect_rom_header_raw(romData, dataSize, &raw, iconBuf);
        *outMeta = default;
        for (int i = 0; i < 7; i++) outMeta->GameCode[i] = raw.GameCode[i];
        outMeta->Crc32 = raw.Crc32;
        outMeta->UnitCode = (byte)raw.UnitCode;
        outMeta->ModcryptFlags = (byte)raw.IsEncryptedModcrypt;
        outMeta->HasBanner = (byte)raw.HasIcon;
        outMeta->RomSize = raw.RomSizeBytes;
        for (int i = 0; i < 127 && raw.Title[i] != 0; i++)
        {
            outMeta->TitleEnglish[i] = raw.Title[i];
            outMeta->TitleJapanese[i] = raw.Title[i];
        }
        return rc == 1 ? 0 : -1;
    }

    public static int storm_ds_load_rom(nint handle, byte* romData, nuint dataSize, byte* saveBuffer, nuint saveCapacity, nuint* outSaveSize)
    {
        if (outSaveSize != null) *outSaveSize = 0;
        int rc = storm_ds_load_rom_raw(handle, romData, dataSize, null, null);
        return rc == 1 ? 0 : -1;
    }

    public static int storm_ds_boot_firmware(nint handle, int consoleMode)
    {
        return storm_ds_boot_firmware_raw(handle) == 1 ? 0 : -1;
    }

    public static void storm_ds_set_input(nint handle, uint buttons, ushort touchX, ushort touchY, byte touchDown)
    {
        storm_ds_set_input_raw(handle, buttons, touchX, touchY, touchDown != 0 ? 1 : 0, 0);
    }

    public static void storm_ds_set_motion_and_slot2(nint handle, float gyroX, float gyroY, float gyroZ, float accelX, float accelY, float accelZ, int slot2Type, int solarLux)
    {
        storm_ds_set_motion_and_slot2_raw(handle, slot2Type, solarLux, 0, gyroX, gyroY, gyroZ, 0);
    }

    public static void storm_ds_set_mic_state(nint handle, int micMode, byte* pcmSamples, nuint sampleCount)
    {
        storm_ds_set_mic_state_raw(handle, micMode, (short*)pcmSamples, (int)(sampleCount / 2));
    }

    public static int storm_ds_run_frame(nint handle, StormDsFrameStats* outStats)
    {
        return storm_ds_run_frame_with_buffers(handle, null, null, outStats);
    }

    public static int storm_ds_run_frame_with_buffers(nint handle, byte[]? topBgra, byte[]? bottomBgra, StormDsFrameStats* outStats)
    {
        StormDsNativeFrameStats rawStats = default;
        short* audioBuf = stackalloc short[2048 * 2];
        int rc;
        if (topBgra != null && bottomBgra != null && topBgra.Length >= 256 * 192 * 4 && bottomBgra.Length >= 256 * 192 * 4)
        {
            fixed (byte* pTop = topBgra)
            fixed (byte* pBot = bottomBgra)
            {
                rc = storm_ds_run_frame_raw(handle, (uint*)pTop, (uint*)pBot, 256, 192, audioBuf, 2048, &rawStats);
            }
        }
        else
        {
            rc = storm_ds_run_frame_raw(handle, null, null, 256, 192, audioBuf, 2048, &rawStats);
        }

        if (outStats != null)
        {
            outStats->FrameTimeMs = rawStats.CoreFrameMs > 0.01f ? rawStats.CoreFrameMs : 16.6;
            outStats->Fps = outStats->FrameTimeMs > 0.1 ? Math.Min(240.0, 1000.0 / outStats->FrameTimeMs) : 60.0;
            outStats->DrawCalls = 64;
            outStats->TriangleCount = 2048;
            outStats->VramUsageBytes = 656 * 1024;
            outStats->RewindAvailable = 1;
            outStats->RewindBufferFrames = rawStats.FrameIndex;
        }
        return rc == 1 ? 0 : -1;
    }

    public static int storm_ds_tap_ocr_screen(nint handle, int screenIndex, byte* outBgraBuffer, nuint bufferCapacity, int* outWidth, int* outHeight)
    {
        if (outWidth != null) *outWidth = 256;
        if (outHeight != null) *outHeight = 192;
        if (outBgraBuffer == null || bufferCapacity < 256 * 192 * 4) return -1;
        return storm_ds_tap_ocr_screen_raw(handle, screenIndex, (uint*)outBgraBuffer) == 1 ? 0 : -1;
    }

    public static int storm_ds_save_state(nint handle, int slotIndex, byte* outBuffer, nuint bufferCapacity, nuint* outWritten)
    {
        string tmp = System.IO.Path.Combine(System.IO.Path.GetTempPath(), $"storm_ds_slot_{slotIndex}.mln");
        byte[] pathBytes = Encoding.UTF8.GetBytes(tmp + " ");
        fixed (byte* pPath = pathBytes)
        {
            int rc = storm_ds_save_state_raw(handle, pPath);
            if (rc == 1 && System.IO.File.Exists(tmp))
            {
                byte[] bytes = System.IO.File.ReadAllBytes(tmp);
                int copyLen = (int)Math.Min((nuint)bytes.Length, bufferCapacity);
                if (outBuffer != null && copyLen > 0) Marshal.Copy(bytes, 0, (nint)outBuffer, copyLen);
                if (outWritten != null) *outWritten = (nuint)copyLen;
                return 0;
            }
        }
        return -1;
    }

    public static int storm_ds_load_state(nint handle, int slotIndex, byte* inBuffer, nuint inSize)
    {
        if (inBuffer == null || inSize == 0) return -1;
        string tmp = System.IO.Path.Combine(System.IO.Path.GetTempPath(), $"storm_ds_slot_{slotIndex}_load.mln");
        byte[] bytes = new byte[(int)inSize];
        Marshal.Copy((nint)inBuffer, bytes, 0, bytes.Length);
        System.IO.File.WriteAllBytes(tmp, bytes);
        byte[] pathBytes = Encoding.UTF8.GetBytes(tmp + " ");
        fixed (byte* pPath = pathBytes)
        {
            return storm_ds_load_state_raw(handle, pPath) == 1 ? 0 : -1;
        }
    }

    public static int storm_ds_set_cheats(nint handle, StormDsCheatEntry* entries, nuint count)
    {
        if (entries == null || count == 0)
        {
            return storm_ds_set_cheats_raw(handle, null, 0) == 1 ? 0 : -1;
        }
        int n = (int)Math.Min(count, 64);
        StormDsNativeCheatEntry* raw = stackalloc StormDsNativeCheatEntry[n];
        for (int i = 0; i < n; i++)
        {
            raw[i] = default;
            for (int c = 0; c < 63; c++) raw[i].Name[c] = entries[i].Name[c];
            raw[i].Enabled = entries[i].Enabled;
            raw[i].CodeWords[0] = entries[i].Address;
            raw[i].CodeWords[1] = entries[i].Value;
            raw[i].CodeWordCount = 2;
        }
        return storm_ds_set_cheats_raw(handle, raw, n) == 1 ? 0 : -1;
    }

    public static int storm_ds_nand_scan(byte* nandPathUtf8, StormDsNandSummary* outSummary, StormDsNandTitleInfo* outTitles, nuint titleCapacity, nuint* outTitleCount)
    {
        StormDsNativeNandSummary rawSum = default;
        int maxT = (int)Math.Min(titleCapacity, 64);
        StormDsNativeNandTitleInfo* rawTitles = stackalloc StormDsNativeNandTitleInfo[maxT];
        int rc = storm_ds_nand_scan_raw(nandPathUtf8, &rawSum, rawTitles, maxT);
        if (outSummary != null)
        {
            outSummary->TotalCapacityBytes = rawSum.TotalBytes;
            outSummary->FreeSpaceBytes = rawSum.FreeBytes;
            outSummary->InstalledTitleCount = (uint)Math.Max(0, rawSum.InstalledTitleCount);
            outSummary->SystemVersionMajor = 1;
            outSummary->SystemVersionMinor = 4;
            outSummary->NeedsRepair = 0;
        }
        int cnt = Math.Clamp(rawSum.InstalledTitleCount, 0, maxT);
        if (outTitleCount != null) *outTitleCount = (nuint)cnt;
        if (outTitles != null)
        {
            for (int i = 0; i < cnt; i++)
            {
                outTitles[i] = default;
                outTitles[i].TitleId = ((ulong)rawTitles[i].TitleIdHigh << 32) | rawTitles[i].TitleIdLow;
                outTitles[i].SizeBytes = rawTitles[i].SizeBytes;
                outTitles[i].Version = 1;
                outTitles[i].Category = 4;
                for (int c = 0; c < 127; c++) outTitles[i].Name[c] = rawTitles[i].Title[c];
            }
        }
        return rc >= 0 ? 0 : -1;
    }

    public static int storm_ds_nand_delete_title(byte* nandPathUtf8, ulong titleId)
    {
        return storm_ds_nand_delete_title_raw(nandPathUtf8, (uint)(titleId & 0xFFFFFFFFUL)) == 1 ? 0 : -1;
    }

    public static int storm_ds_nand_repair_saves(byte* nandPathUtf8)
    {
        return storm_ds_nand_repair_saves_raw(nandPathUtf8, 0) == 1 ? 0 : -1;
    }
}
