// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using System.Runtime.InteropServices;

namespace StormDs.Core.Audio;

/// <summary>
/// NativeAOT-compatible Win32 Multimedia (winmm.dll) waveOut stereo PCM audio streamer
/// running at 48000 Hz, 16-bit signed stereo without external dependencies.
/// </summary>
public sealed unsafe partial class WinMmAudioOutput : IDisposable
{
    private const int SampleRate = 48000;
    private const int Channels = 2;
    private const int BitsPerSample = 16;
    private const int MaxFramesPerBuffer = 2048;
    private const uint WHDR_DONE = 0x00000001;
    private const uint WHDR_PREPARED = 0x00000002;
    private const uint CALLBACK_NULL = 0x00000000;

    [StructLayout(LayoutKind.Sequential, Pack = 1)]
    private struct WAVEFORMATEX
    {
        public ushort wFormatTag;
        public ushort nChannels;
        public uint nSamplesPerSec;
        public uint nAvgBytesPerSec;
        public ushort nBlockAlign;
        public ushort wBitsPerSample;
        public ushort cbSize;
    }

    [StructLayout(LayoutKind.Sequential)]
    private struct WAVEHDR
    {
        public nint lpData;
        public uint dwBufferLength;
        public uint dwBytesRecorded;
        public nuint dwUser;
        public uint dwFlags;
        public uint dwLoops;
        public nint lpNext;
        public nuint reserved;
    }

    [LibraryImport("winmm.dll")]
    private static partial uint waveOutOpen(
        out nint phwo,
        uint uDeviceID,
        WAVEFORMATEX* pwfx,
        nuint dwCallback,
        nuint dwInstance,
        uint fdwOpen);

    [LibraryImport("winmm.dll")]
    private static partial uint waveOutPrepareHeader(nint hwo, WAVEHDR* pwh, uint cbwh);

    [LibraryImport("winmm.dll")]
    private static partial uint waveOutUnprepareHeader(nint hwo, WAVEHDR* pwh, uint cbwh);

    [LibraryImport("winmm.dll")]
    private static partial uint waveOutWrite(nint hwo, WAVEHDR* pwh, uint cbwh);

    [LibraryImport("winmm.dll")]
    private static partial uint waveOutReset(nint hwo);

    [LibraryImport("winmm.dll")]
    private static partial uint waveOutClose(nint hwo);

    private readonly object _lock = new();
    private nint _hWaveOut;
    private readonly int _poolCount;
    private readonly nint[] _headers;
    private readonly nint[] _pcmBuffers;
    private readonly bool[] _inFlight;
    private int _nextSlot;
    private bool _disposed;

    public bool IsMuted { get; set; }
    public float Volume { get; set; } = 1.0f;
    public bool IsOpened => _hWaveOut != nint.Zero;

    public WinMmAudioOutput(int targetLatencyMs = 30)
    {
        _poolCount = Math.Clamp((int)Math.Ceiling(targetLatencyMs / 16.0) + 4, 6, 20);
        _headers = new nint[_poolCount];
        _pcmBuffers = new nint[_poolCount];
        _inFlight = new bool[_poolCount];

        if (!OperatingSystem.IsWindows()) return;

        try
        {
            var fmt = new WAVEFORMATEX
            {
                wFormatTag = 1, // WAVE_FORMAT_PCM
                nChannels = Channels,
                nSamplesPerSec = SampleRate,
                nBlockAlign = (ushort)(Channels * (BitsPerSample / 8)),
                nAvgBytesPerSec = SampleRate * Channels * (BitsPerSample / 8),
                wBitsPerSample = BitsPerSample,
                cbSize = 0
            };

            uint rc = waveOutOpen(out _hWaveOut, 0xFFFFFFFFu /* WAVE_MAPPER */, &fmt, 0, 0, CALLBACK_NULL);
            if (rc != 0 || _hWaveOut == nint.Zero)
            {
                _hWaveOut = nint.Zero;
                return;
            }

            nuint bufBytes = (nuint)(MaxFramesPerBuffer * Channels * sizeof(short));
            for (int i = 0; i < _poolCount; i++)
            {
                _pcmBuffers[i] = (nint)NativeMemory.Alloc(bufBytes);
                var hdr = (WAVEHDR*)NativeMemory.AllocZeroed((nuint)sizeof(WAVEHDR));
                hdr->lpData = _pcmBuffers[i];
                hdr->dwBufferLength = (uint)bufBytes;
                _headers[i] = (nint)hdr;
            }
        }
        catch
        {
            CloseResources();
        }
    }

    public void SubmitSamples(ReadOnlySpan<short> interleavedStereo, int frameCount)
    {
        if (!OperatingSystem.IsWindows() || _hWaveOut == nint.Zero || _disposed || frameCount <= 0) return;

        int frames = Math.Min(frameCount, MaxFramesPerBuffer);
        int sampleCount = frames * Channels;
        if (interleavedStereo.Length < sampleCount) return;

        lock (_lock)
        {
            if (_hWaveOut == nint.Zero || _disposed) return;

            // Reclaim finished buffers
            for (int i = 0; i < _poolCount; i++)
            {
                if (_inFlight[i] && _headers[i] != nint.Zero)
                {
                    var h = (WAVEHDR*)_headers[i];
                    if ((h->dwFlags & WHDR_DONE) != 0)
                    {
                        waveOutUnprepareHeader(_hWaveOut, h, (uint)sizeof(WAVEHDR));
                        _inFlight[i] = false;
                    }
                }
            }

            // Find an idle slot
            int chosen = -1;
            for (int step = 0; step < _poolCount; step++)
            {
                int idx = (_nextSlot + step) % _poolCount;
                if (!_inFlight[idx])
                {
                    chosen = idx;
                    _nextSlot = (idx + 1) % _poolCount;
                    break;
                }
            }
            if (chosen < 0) return;

            var hdr = (WAVEHDR*)_headers[chosen];
            var dst = new Span<short>((void*)_pcmBuffers[chosen], sampleCount);

            float gain = IsMuted ? 0.0f : Math.Clamp(Volume, 0.0f, 1.0f);
            if (gain <= 0.001f)
            {
                dst.Clear();
            }
            else if (Math.Abs(gain - 1.0f) < 0.001f)
            {
                interleavedStereo[..sampleCount].CopyTo(dst);
            }
            else
            {
                for (int i = 0; i < sampleCount; i++)
                {
                    dst[i] = (short)Math.Clamp((int)(interleavedStereo[i] * gain), short.MinValue, short.MaxValue);
                }
            }

            hdr->lpData = _pcmBuffers[chosen];
            hdr->dwBufferLength = (uint)(sampleCount * sizeof(short));
            hdr->dwFlags = 0;

            if (waveOutPrepareHeader(_hWaveOut, hdr, (uint)sizeof(WAVEHDR)) == 0)
            {
                if (waveOutWrite(_hWaveOut, hdr, (uint)sizeof(WAVEHDR)) == 0)
                {
                    _inFlight[chosen] = true;
                }
                else
                {
                    waveOutUnprepareHeader(_hWaveOut, hdr, (uint)sizeof(WAVEHDR));
                }
            }
        }
    }

    public void ResetQueue()
    {
        if (!OperatingSystem.IsWindows() || _hWaveOut == nint.Zero) return;
        lock (_lock)
        {
            if (_hWaveOut == nint.Zero) return;
            waveOutReset(_hWaveOut);
            for (int i = 0; i < _poolCount; i++)
            {
                if (_inFlight[i] && _headers[i] != nint.Zero)
                {
                    var hdr = (WAVEHDR*)_headers[i];
                    if ((hdr->dwFlags & WHDR_PREPARED) != 0)
                    {
                        waveOutUnprepareHeader(_hWaveOut, hdr, (uint)sizeof(WAVEHDR));
                    }
                    _inFlight[i] = false;
                }
            }
        }
    }

    private void CloseResources()
    {
        lock (_lock)
        {
            if (_hWaveOut != nint.Zero)
            {
                try
                {
                    waveOutReset(_hWaveOut);
                    for (int i = 0; i < _poolCount; i++)
                    {
                        if (_headers[i] != nint.Zero)
                        {
                            var hdr = (WAVEHDR*)_headers[i];
                            if ((hdr->dwFlags & WHDR_PREPARED) != 0)
                            {
                                waveOutUnprepareHeader(_hWaveOut, hdr, (uint)sizeof(WAVEHDR));
                            }
                        }
                    }
                    waveOutClose(_hWaveOut);
                }
                catch
                {
                }
                _hWaveOut = nint.Zero;
            }

            for (int i = 0; i < _poolCount; i++)
            {
                _inFlight[i] = false;
                if (_headers[i] != nint.Zero)
                {
                    NativeMemory.Free((void*)_headers[i]);
                    _headers[i] = nint.Zero;
                }
                if (_pcmBuffers[i] != nint.Zero)
                {
                    NativeMemory.Free((void*)_pcmBuffers[i]);
                    _pcmBuffers[i] = nint.Zero;
                }
            }
        }
    }

    public void Dispose()
    {
        if (_disposed) return;
        _disposed = true;
        CloseResources();
    }
}
