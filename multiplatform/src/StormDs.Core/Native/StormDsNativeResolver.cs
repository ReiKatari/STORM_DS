// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System.Reflection;
using System.Runtime.InteropServices;

namespace StormDs.Core.Native;

/// <summary>
/// NativeAOT dynamic library resolver for storm_ds_core.
/// Safely searches AppContext.BaseDirectory, runtime RID directories, Android app native directories,
/// and falls back gracefully without crashing when native binaries are absent in test or managed-only environments.
/// </summary>
public static class StormDsNativeResolver
{
    private static nint s_loadedHandle = nint.Zero;
    private static bool s_initialized;
    private static readonly object s_lock = new();

    public static void Initialize()
    {
        if (s_initialized) return;

        lock (s_lock)
        {
            if (s_initialized) return;

            try
            {
                NativeLibrary.SetDllImportResolver(typeof(StormDsNative).Assembly, ResolveDll);
            }
            catch (Exception ex)
            {
                Console.Error.WriteLine($"[StormDsNativeResolver] Notice: DllImportResolver registration: {ex.Message}");
            }
            finally
            {
                s_initialized = true;
            }
        }
    }

    public static bool IsLibraryLoaded()
    {
        Initialize();
        if (s_loadedHandle != nint.Zero) return true;

        // Attempt on-demand load
        s_loadedHandle = ResolveDll(StormDsNative.LibraryName, typeof(StormDsNative).Assembly, null);
        return s_loadedHandle != nint.Zero;
    }

    private static nint ResolveDll(string libraryName, Assembly assembly, DllImportSearchPath? searchPath)
    {
        if (!string.Equals(libraryName, StormDsNative.LibraryName, StringComparison.OrdinalIgnoreCase))
        {
            return nint.Zero;
        }

        if (s_loadedHandle != nint.Zero)
        {
            return s_loadedHandle;
        }

        string nativeFileName = GetPlatformLibraryFileName(libraryName);
        string baseDir = AppContext.BaseDirectory;
        string rid = GetCurrentRuntimeIdentifier();

        string[] candidatePaths =
        [
            Path.Combine(baseDir, nativeFileName),
            Path.Combine(baseDir, "runtimes", rid, "native", nativeFileName),
            Path.Combine(baseDir, "..", "native", "build", "Release", nativeFileName),
            Path.Combine(baseDir, "..", "native", "build", nativeFileName),
            Path.Combine(Directory.GetCurrentDirectory(), nativeFileName),
            nativeFileName
        ];

        foreach (string candidate in candidatePaths)
        {
            try
            {
                if (File.Exists(candidate) && NativeLibrary.TryLoad(candidate, out nint handle))
                {
                    s_loadedHandle = handle;
                    return handle;
                }
            }
            catch
            {
                // Ignore candidate failure and try next
            }
        }

        // Try standard OS lookup
        if (NativeLibrary.TryLoad(nativeFileName, assembly, searchPath, out nint sysHandle))
        {
            s_loadedHandle = sysHandle;
            return sysHandle;
        }

        // Android fallback lookup in package lib directory
        if (OperatingSystem.IsAndroid())
        {
            string[] androidLibPaths =
            [
                $"/data/data/com.storm.ds/lib/{nativeFileName}",
                $"/data/data/com.storm.ds.debug/lib/{nativeFileName}"
            ];

            foreach (string androidPath in androidLibPaths)
            {
                if (File.Exists(androidPath) && NativeLibrary.TryLoad(androidPath, out nint androidHandle))
                {
                    s_loadedHandle = androidHandle;
                    return androidHandle;
                }
            }
        }

        return nint.Zero;
    }

    private static string GetPlatformLibraryFileName(string baseName)
    {
        if (OperatingSystem.IsWindows())
        {
            return $"{baseName}.dll";
        }
        if (OperatingSystem.IsMacOS())
        {
            return $"lib{baseName}.dylib";
        }
        return $"lib{baseName}.so";
    }

    private static string GetCurrentRuntimeIdentifier()
    {
        string arch = RuntimeInformation.ProcessArchitecture switch
        {
            Architecture.X64 => "x64",
            Architecture.Arm64 => "arm64",
            Architecture.X86 => "x86",
            Architecture.Arm => "arm",
            _ => "x64"
        };

        if (OperatingSystem.IsWindows()) return $"win-{arch}";
        if (OperatingSystem.IsAndroid()) return $"android-{arch}";
        if (OperatingSystem.IsLinux()) return $"linux-{arch}";
        if (OperatingSystem.IsMacOS()) return $"osx-{arch}";

        return $"win-{arch}";
    }
}
