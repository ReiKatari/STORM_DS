using System;
using System.IO;
using System.Runtime.InteropServices;

namespace Storm.AuroraFluid.Kit.Services;

/// <summary>
/// Ultra-low latency (<3 ms) procedural in-memory tactile audio feedback service.
/// Mathematically synthesizes PCM WAV waveforms in RAM with zero disk I/O.
/// </summary>
public sealed class AuroraTactileFeedbackService
{
    private static readonly Lazy<AuroraTactileFeedbackService> s_lazyInstance = new(() => new AuroraTactileFeedbackService());
    public static AuroraTactileFeedbackService Instance => s_lazyInstance.Value;

    public bool Enabled { get; set; } = true;

    private readonly byte[] _hoverTickWav;
    private readonly byte[] _clickWav;
    private readonly byte[] _tabWhooshWav;
    private readonly byte[] _launchChordWav;
    private readonly byte[] _achievementChimeWav;

    public Action<byte[]>? ExternalAudioHook { get; set; }

    private const uint SND_ASYNC = 0x0001;
    private const uint SND_NODEFAULT = 0x0002;
    private const uint SND_MEMORY = 0x0004;

    [DllImport("winmm.dll", EntryPoint = "PlaySoundW", SetLastError = true)]
    private static extern bool Win32PlaySound([In] byte[] pszSound, IntPtr hmod, uint fdwSound);

    private AuroraTactileFeedbackService()
    {
        _hoverTickWav = SynthesizeHoverTick();
        _clickWav = SynthesizeClick();
        _tabWhooshWav = SynthesizeTabWhoosh();
        _launchChordWav = SynthesizeLaunchChord();
        _achievementChimeWav = SynthesizeAchievementChime();
    }

    public void PlayHoverTick() => PlayBuffer(_hoverTickWav);
    public void PlayClick() => PlayBuffer(_clickWav);
    public void PlayTabWhoosh() => PlayBuffer(_tabWhooshWav);
    public void PlayLaunchChord() => PlayBuffer(_launchChordWav);
    public void PlayAchievementChime() => PlayBuffer(_achievementChimeWav);

    private void PlayBuffer(byte[] wavBytes)
    {
        if (!Enabled) return;

        try
        {
            if (ExternalAudioHook != null)
            {
                ExternalAudioHook(wavBytes);
                return;
            }

            if (OperatingSystem.IsWindows())
            {
                Win32PlaySound(wavBytes, IntPtr.Zero, SND_ASYNC | SND_MEMORY | SND_NODEFAULT);
            }
        }
        catch
        {
            // Non-critical fallback
        }
    }

    private static byte[] CreateWav(short[] samples, int sampleRate = 44100)
    {
        using var ms = new MemoryStream(44 + samples.Length * 2);
        using var bw = new BinaryWriter(ms);

        int subChunk2Size = samples.Length * 2;
        int chunkSize = 36 + subChunk2Size;

        // RIFF header
        bw.Write((byte)'R'); bw.Write((byte)'I'); bw.Write((byte)'F'); bw.Write((byte)'F');
        bw.Write(chunkSize);
        bw.Write((byte)'W'); bw.Write((byte)'A'); bw.Write((byte)'V'); bw.Write((byte)'E');

        // fmt subchunk
        bw.Write((byte)'f'); bw.Write((byte)'m'); bw.Write((byte)'t'); bw.Write((byte)' ');
        bw.Write(16); // subchunk1 size
        bw.Write((short)1); // PCM format
        bw.Write((short)1); // mono
        bw.Write(sampleRate);
        bw.Write(sampleRate * 2); // byte rate (sampleRate * numChannels * bitsPerSample/8)
        bw.Write((short)2); // block align
        bw.Write((short)16); // bits per sample

        // data subchunk
        bw.Write((byte)'d'); bw.Write((byte)'a'); bw.Write((byte)'t'); bw.Write((byte)'a');
        bw.Write(subChunk2Size);

        for (int i = 0; i < samples.Length; i++)
        {
            bw.Write(samples[i]);
        }

        return ms.ToArray();
    }

    private static byte[] SynthesizeHoverTick()
    {
        const int sampleRate = 44100;
        const int sampleCount = 120; // ~2.7 ms
        var samples = new short[sampleCount];

        for (int i = 0; i < sampleCount; i++)
        {
            double t = (double)i / sampleRate;
            double decay = Math.Exp(-i * 0.05);
            double freq = 3200.0;
            double val = Math.Sin(2.0 * Math.PI * freq * t) * decay * 0.35;
            samples[i] = (short)(val * short.MaxValue);
        }

        return CreateWav(samples, sampleRate);
    }

    private static byte[] SynthesizeClick()
    {
        const int sampleRate = 44100;
        const int sampleCount = 380; // ~8.6 ms
        var samples = new short[sampleCount];

        for (int i = 0; i < sampleCount; i++)
        {
            double t = (double)i / sampleRate;
            double decay = Math.Exp(-i * 0.02);
            double freq = 850.0 - (i * 1.5); // pitch drop
            double val = Math.Sin(2.0 * Math.PI * Math.Max(180.0, freq) * t) * decay * 0.55;
            samples[i] = (short)(val * short.MaxValue);
        }

        return CreateWav(samples, sampleRate);
    }

    private static byte[] SynthesizeTabWhoosh()
    {
        const int sampleRate = 44100;
        const int sampleCount = 1100; // ~25 ms
        var samples = new short[sampleCount];

        for (int i = 0; i < sampleCount; i++)
        {
            double t = (double)i / sampleRate;
            double env = Math.Sin(Math.PI * i / sampleCount);
            double freq = 350.0 + (i * 0.45);
            double val = Math.Sin(2.0 * Math.PI * freq * t) * env * 0.40;
            samples[i] = (short)(val * short.MaxValue);
        }

        return CreateWav(samples, sampleRate);
    }

    private static byte[] SynthesizeLaunchChord()
    {
        const int sampleRate = 44100;
        const int sampleCount = 5500; // ~125 ms
        var samples = new short[sampleCount];

        for (int i = 0; i < sampleCount; i++)
        {
            double t = (double)i / sampleRate;
            double decay = Math.Exp(-i * 0.0009);
            // C5 (523.25), E5 (659.25), G5 (783.99)
            double c = Math.Sin(2.0 * Math.PI * 523.25 * t);
            double e = Math.Sin(2.0 * Math.PI * 659.25 * t);
            double g = Math.Sin(2.0 * Math.PI * 783.99 * t);
            double val = ((c * 0.4) + (e * 0.35) + (g * 0.35)) * decay * 0.45;
            samples[i] = (short)(val * short.MaxValue);
        }

        return CreateWav(samples, sampleRate);
    }

    private static byte[] SynthesizeAchievementChime()
    {
        const int sampleRate = 44100;
        const int sampleCount = 8000; // ~180 ms
        var samples = new short[sampleCount];

        for (int i = 0; i < sampleCount; i++)
        {
            double t = (double)i / sampleRate;
            double decay = Math.Exp(-i * 0.0006);
            // E6 (1318.51), G#6 (1661.22), B6 (1975.53)
            double n1 = Math.Sin(2.0 * Math.PI * 1318.51 * t);
            double n2 = Math.Sin(2.0 * Math.PI * 1661.22 * t);
            double n3 = Math.Sin(2.0 * Math.PI * 1975.53 * t);
            double val = ((n1 * 0.4) + (n2 * 0.3) + (n3 * 0.3)) * decay * 0.50;
            samples[i] = (short)(val * short.MaxValue);
        }

        return CreateWav(samples, sampleRate);
    }
}
