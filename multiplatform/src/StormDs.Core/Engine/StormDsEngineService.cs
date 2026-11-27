// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System.Diagnostics;
using System.IO.Compression;
using StormDs.Core.Audio;
using StormDs.Core.Configuration;
using StormDs.Core.Library;
using StormDs.Core.Native;
using StormDs.Core.Paths;

namespace StormDs.Core.Engine;

/// <summary>
/// High-level orchestration engine encapsulating the lifecycle, frame rendering loop,
/// 48 kHz winmm audio output, .zip ROM extraction, battery .sav persistence,
/// rewind ring buffering, mic blow burst, and native save states.
/// </summary>
public sealed class StormDsEngineService : IDisposable
{
    private nint _nativeHandle = nint.Zero;
    private bool _isDisposed;
    private readonly object _engineLock = new();

    private RomMetadataRecord? _activeRom;
    private long _frameCounter;
    private WinMmAudioOutput? _audioOutput;
    private readonly short[] _audioFrameBuffer = new short[2048 * 2];
    private int _micBurstFramesRemaining;

    public byte[] TopFrameBgra { get; } = new byte[256 * 192 * 4];
    public byte[] BottomFrameBgra { get; } = new byte[256 * 192 * 4];
    public bool HasLiveNativeFrame { get; private set; }
    public bool IsLidClosed { get; private set; }
    private bool _isMuted;
    public bool IsMuted
    {
        get => _isMuted;
        set
        {
            _isMuted = value;
            if (_audioOutput != null) _audioOutput.IsMuted = value;
        }
    }

    private float _audioVolume = 1.0f;
    public float AudioVolume
    {
        get => _audioVolume;
        set
        {
            _audioVolume = Math.Clamp(value, 0.0f, 1.0f);
            if (_audioOutput != null) _audioOutput.Volume = _audioVolume;
        }
    }

    public nint NativeHandle => _nativeHandle;
    public bool IsRunning => _nativeHandle != nint.Zero || _activeRom != null;
    public RomMetadataRecord? ActiveRom => _activeRom;
    public long FrameCounter => _frameCounter;

    /// <summary>
    /// Initializes an emulation core session with the given application configuration and optional overrides.
    /// </summary>
    public bool Initialize(StormDsAppConfig config, PerRomProfile? profile = null, VulkanCompatProfileEntry? compat = null)
    {
        lock (_engineLock)
        {
            Shutdown();

            _audioOutput = new WinMmAudioOutput(config.AudioLatency) { Volume = _audioVolume, IsMuted = _isMuted };
            IsLidClosed = false;
            _micBurstFramesRemaining = 0;

            if (StormDsNative.IsAvailable)
            {
                StormDsConfig nativeConfig = config.ToNativeConfig(profile, compat);
                _nativeHandle = StormDsNative.storm_ds_create(in nativeConfig, config);
                return _nativeHandle != nint.Zero;
            }

            return true;
        }
    }

    /// <summary>
    /// Loads a Nintendo DS / DSi cartridge ROM or .zip archive into the engine with .sav persistence.
    /// </summary>
    public unsafe bool LoadRom(string romPath, StormDsAppConfig config, PerRomProfile? profile = null)
    {
        lock (_engineLock)
        {
            if (!File.Exists(romPath)) return false;

            _activeRom = NdsCartridgeParser.ParseFile(romPath, out _);
            if (_activeRom == null) return false;

            byte[] romData = ReadRomPayloadBytes(romPath);
            if (romData.Length < 512) return false;

            string saveKey = !string.IsNullOrWhiteSpace(_activeRom.GameCode)
                ? _activeRom.GameCode.Trim()
                : Path.GetFileNameWithoutExtension(romPath);
            string savePath = StormDsPlatformPaths.GetSaveFilePath(saveKey);
            Directory.CreateDirectory(StormDsPlatformPaths.SavesDirectory);
            byte[] saveData = File.Exists(savePath) ? File.ReadAllBytes(savePath) : [];

            if (StormDsNative.IsAvailable && _nativeHandle != nint.Zero)
            {
                fixed (byte* pRom = romData)
                fixed (byte* pSave = saveData.Length > 0 ? saveData : [0])
                {
                    nuint saveCapacity = (nuint)Math.Max(saveData.Length, 1024 * 1024);
                    nuint outSaveSize = 0;
                    int res = StormDsNative.storm_ds_load_rom(
                        _nativeHandle,
                        pRom,
                        (nuint)romData.Length,
                        pSave,
                        saveCapacity,
                        &outSaveSize,
                        romPath,
                        savePath);
                    return res == 0;
                }
            }

            return true;
        }
    }

    private static byte[] ReadRomPayloadBytes(string romPath)
    {
        if (romPath.EndsWith(".zip", StringComparison.OrdinalIgnoreCase))
        {
            using var archive = ZipFile.OpenRead(romPath);
            var romEntry = archive.Entries.FirstOrDefault(e =>
                e.Length > 0 &&
                Path.GetExtension(e.Name).ToLowerInvariant() is ".nds" or ".srl" or ".dsi" or ".ids" or ".app");
            if (romEntry == null) return [];

            using var entryStream = romEntry.Open();
            using var ms = new MemoryStream((int)Math.Min(romEntry.Length, 512 * 1024 * 1024));
            entryStream.CopyTo(ms);
            return ms.ToArray();
        }

        return File.ReadAllBytes(romPath);
    }

    /// <summary>
    /// Boots the original DS/DSi firmware menu.
    /// </summary>
    public bool BootFirmware(ConsoleMode consoleMode)
    {
        lock (_engineLock)
        {
            if (StormDsNative.IsAvailable && _nativeHandle != nint.Zero)
            {
                return StormDsNative.storm_ds_boot_firmware(_nativeHandle, (int)consoleMode) == 0;
            }
            return true;
        }
    }

    /// <summary>
    /// Resets the emulation instance.
    /// </summary>
    public void Reset()
    {
        lock (_engineLock)
        {
            _audioOutput?.ResetQueue();
            if (StormDsNative.IsAvailable && _nativeHandle != nint.Zero)
            {
                StormDsNative.storm_ds_reset(_nativeHandle);
            }
            _frameCounter = 0;
        }
    }

    public void UpdateRuntimeConfig(StormDsAppConfig config, PerRomProfile? profile = null, VulkanCompatProfileEntry? compat = null)
    {
        lock (_engineLock)
        {
            if (StormDsNative.IsAvailable && _nativeHandle != nint.Zero)
            {
                var nativeConfig = config.ToNativeConfig(profile, compat);
                StormDsNative.storm_ds_update_config(_nativeHandle, in nativeConfig, config);
            }
        }
    }

    /// <summary>
    /// Updates controller buttons, touch coordinates, and lid state.
    /// </summary>
    public void SetInput(uint buttonsBitmask, ushort touchX, ushort touchY, bool touchDown, bool? lidClosed = null)
    {
        lock (_engineLock)
        {
            if (lidClosed.HasValue) IsLidClosed = lidClosed.Value;
            if (StormDsNative.IsAvailable && _nativeHandle != nint.Zero)
            {
                StormDsNative.storm_ds_set_input(_nativeHandle, buttonsBitmask, touchX, touchY, (byte)(touchDown ? 1 : 0), IsLidClosed ? 1 : 0);
            }
        }
    }

    public bool ToggleLid(uint currentButtons, ushort touchX, ushort touchY, bool touchDown)
    {
        lock (_engineLock)
        {
            IsLidClosed = !IsLidClosed;
            SetInput(currentButtons, touchX, touchY, touchDown, IsLidClosed);
            return IsLidClosed;
        }
    }

    /// <summary>
    /// Updates motion sensors and Slot-2 peripheral inputs.
    /// </summary>
    public void SetMotionAndSlot2(float gyroX, float gyroY, float gyroZ, float accelX, float accelY, float accelZ, int slot2Type, int solarLux, uint guitarMask = 0, uint pedometerSteps = 0)
    {
        lock (_engineLock)
        {
            if (StormDsNative.IsAvailable && _nativeHandle != nint.Zero)
            {
                StormDsNative.storm_ds_set_motion_and_slot2_full(_nativeHandle, slot2Type, solarLux, guitarMask, gyroX, gyroY, gyroZ, pedometerSteps);
            }
        }
    }

    /// <summary>
    /// Updates microphone input state.
    /// </summary>
    public unsafe void SetMicState(MicMode micMode, byte[]? pcmSamples = null)
    {
        lock (_engineLock)
        {
            if (StormDsNative.IsAvailable && _nativeHandle != nint.Zero)
            {
                if (pcmSamples != null && pcmSamples.Length > 0)
                {
                    fixed (byte* pPcm = pcmSamples)
                    {
                        StormDsNative.storm_ds_set_mic_state(_nativeHandle, (int)micMode, pPcm, (nuint)pcmSamples.Length);
                    }
                }
                else
                {
                    StormDsNative.storm_ds_set_mic_state(_nativeHandle, (int)micMode, null, 0);
                }
            }
        }
    }

    public void TriggerMicBlowBurst(int frames = 30)
    {
        _micBurstFramesRemaining = Math.Max(1, frames);
        SetMicState(MicMode.SimulatedBlow);
    }

    /// <summary>
    /// Executes one frame of emulation, submits PCM samples to WinMM audio output, and returns diagnostics.
    /// </summary>
    public unsafe StormDsFrameStats RunFrame(bool submitAudio = true)
    {
        lock (_engineLock)
        {
            _frameCounter++;
            StormDsFrameStats stats = default;

            if (_micBurstFramesRemaining > 0)
            {
                _micBurstFramesRemaining--;
                if (_micBurstFramesRemaining == 0)
                {
                    SetMicState(MicMode.RealMicrophone);
                }
            }

            if (StormDsNative.IsAvailable && _nativeHandle != nint.Zero)
            {
                HasLiveNativeFrame = StormDsNative.storm_ds_run_frame_with_buffers(
                    _nativeHandle,
                    TopFrameBgra,
                    BottomFrameBgra,
                    &stats,
                    _audioFrameBuffer,
                    2048) == 0;

                if (submitAudio && stats.AudioFramesWritten > 0)
                {
                    _audioOutput?.SubmitSamples(_audioFrameBuffer, stats.AudioFramesWritten);
                }
                return stats;
            }

            stats.Fps = 60.0;
            stats.FrameTimeMs = 16.6;
            stats.ActiveBackend = 3;
            return stats;
        }
    }

    /// <summary>
    /// Builds a combined 256x384 BGRA8888 screenshot buffer (Top + Bottom).
    /// </summary>
    public byte[] CaptureCombinedScreenshotBgra(out int width, out int height)
    {
        width = 256;
        height = 384;
        byte[] combined = new byte[256 * 384 * 4];
        lock (_engineLock)
        {
            Buffer.BlockCopy(TopFrameBgra, 0, combined, 0, 256 * 192 * 4);
            Buffer.BlockCopy(BottomFrameBgra, 0, combined, 256 * 192 * 4, 256 * 192 * 4);
        }
        return combined;
    }

    /// <summary>
    /// Saves the emulation state to a slot index (0..9) on disk.
    /// </summary>
    public unsafe bool SaveState(int slotIndex)
    {
        string key = _activeRom?.GameCode ?? "FREEBIOS";
        string statePath = StormDsPlatformPaths.GetSaveStateFilePath(key, slotIndex);

        lock (_engineLock)
        {
            if (StormDsNative.IsAvailable && _nativeHandle != nint.Zero)
            {
                const int stateCapacity = 16 * 1024 * 1024;
                byte[] buffer = new byte[stateCapacity];
                fixed (byte* pBuf = buffer)
                {
                    nuint written = 0;
                    int res = StormDsNative.storm_ds_save_state(_nativeHandle, slotIndex, pBuf, (nuint)stateCapacity, &written);
                    if (res == 0 && written > 0)
                    {
                        Directory.CreateDirectory(Path.GetDirectoryName(statePath)!);
                        File.WriteAllBytes(statePath, buffer.AsSpan(0, (int)written).ToArray());
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /// <summary>
    /// Loads the emulation state from a slot index (0..9) on disk and refreshes frame buffers.
    /// </summary>
    public unsafe bool LoadState(int slotIndex)
    {
        string key = _activeRom?.GameCode ?? "FREEBIOS";
        string statePath = StormDsPlatformPaths.GetSaveStateFilePath(key, slotIndex);
        if (!File.Exists(statePath)) return false;

        lock (_engineLock)
        {
            if (StormDsNative.IsAvailable && _nativeHandle != nint.Zero)
            {
                byte[] stateData = File.ReadAllBytes(statePath);
                fixed (byte* pBuf = stateData)
                {
                    if (StormDsNative.storm_ds_load_state(_nativeHandle, slotIndex, pBuf, (nuint)stateData.Length) == 0)
                    {
                        _audioOutput?.ResetQueue();
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public bool PushRewind()
    {
        lock (_engineLock)
        {
            if (StormDsNative.IsAvailable && _nativeHandle != nint.Zero)
            {
                return StormDsNative.storm_ds_rewind_push(_nativeHandle) == 0;
            }
            return true;
        }
    }

    public bool PopRewind()
    {
        lock (_engineLock)
        {
            if (StormDsNative.IsAvailable && _nativeHandle != nint.Zero)
            {
                if (StormDsNative.storm_ds_rewind_pop(_nativeHandle) == 0)
                {
                    _audioOutput?.ResetQueue();
                    return true;
                }
                return false;
            }
            return true;
        }
    }

    public void Shutdown()
    {
        lock (_engineLock)
        {
            if (_nativeHandle != nint.Zero)
            {
                if (StormDsNative.IsAvailable)
                {
                    StormDsNative.storm_ds_destroy(_nativeHandle);
                }
                _nativeHandle = nint.Zero;
            }
            _audioOutput?.Dispose();
            _audioOutput = null;
            _activeRom = null;
            HasLiveNativeFrame = false;
            IsLidClosed = false;
            _frameCounter = 0;
        }
    }

    public void Dispose()
    {
        if (!_isDisposed)
        {
            Shutdown();
            _isDisposed = true;
        }
    }
}
