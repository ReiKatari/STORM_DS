// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System.Net;
using System.Net.Sockets;
using System.Text;
using StormDs.Core.Configuration;
using StormDs.Core.Paths;

namespace StormDs.Core.Subsystems;

public sealed class LanPeerSession
{
    public string SessionId { get; set; } = string.Empty;
    public string HostName { get; set; } = string.Empty;
    public string GameCode { get; set; } = string.Empty;
    public string GameTitle { get; set; } = string.Empty;
    public IPEndPoint EndPoint { get; set; } = new(IPAddress.Any, 0);
    public DateTime LastSeenUtc { get; set; } = DateTime.UtcNow;
    public int PlayerCount { get; set; } = 1;
    public int MaxPlayers { get; set; } = 4;
}

/// <summary>
/// Service managing Nintendo WFC DNS redirection presets (Wiimmfi, AltWFC, KaeruWFC),
/// LAN peer session discovery over UDP broadcast, and peer-to-peer save synchronization.
/// </summary>
public sealed class NetplayWfcService : IDisposable
{
    public const string WiimmfiDns = "95.217.77.151";
    public const string AltWfcDns = "178.62.43.212";
    public const string KaeruWfcDns = "178.62.43.212";
    public const int DefaultLanPort = 52774;

    private UdpClient? _udpClient;
    private CancellationTokenSource? _discoveryCts;
    private readonly Dictionary<string, LanPeerSession> _discoveredPeers = [];
    private readonly object _lock = new();

    public IReadOnlyList<LanPeerSession> DiscoveredPeers
    {
        get
        {
            lock (_lock)
            {
                var cutoff = DateTime.UtcNow.AddSeconds(-15);
                return _discoveredPeers.Values.Where(p => p.LastSeenUtc > cutoff).ToList();
            }
        }
    }

    public static string ResolveDnsAddress(WfcDnsPreset preset, string customDns)
    {
        return preset switch
        {
            WfcDnsPreset.Wiimmfi => WiimmfiDns,
            WfcDnsPreset.AltWfc => AltWfcDns,
            WfcDnsPreset.KaeruWfc => KaeruWfcDns,
            WfcDnsPreset.CustomDns => string.IsNullOrWhiteSpace(customDns) ? WiimmfiDns : customDns.Trim(),
            _ => WiimmfiDns
        };
    }

    /// <summary>
    /// Starts background UDP LAN discovery listener.
    /// </summary>
    public void StartLanDiscovery(int port = DefaultLanPort)
    {
        StopLanDiscovery();

        _discoveryCts = new CancellationTokenSource();
        try
        {
            _udpClient = new UdpClient(new IPEndPoint(IPAddress.Any, port));
            _udpClient.EnableBroadcast = true;
            Task.Run(() => ListenDiscoveryLoopAsync(_udpClient, _discoveryCts.Token));
        }
        catch (Exception ex)
        {
            Console.Error.WriteLine($"[NetplayWfcService] Notice: Starting LAN discovery: {ex.Message}");
        }
    }

    public void StopLanDiscovery()
    {
        _discoveryCts?.Cancel();
        _discoveryCts?.Dispose();
        _discoveryCts = null;

        _udpClient?.Close();
        _udpClient?.Dispose();
        _udpClient = null;
    }

    /// <summary>
    /// Broadcasts an active game session packet to the local network.
    /// </summary>
    public async Task BroadcastSessionAnnouncementAsync(string gameCode, string gameTitle, int port = DefaultLanPort)
    {
        try
        {
            using var sender = new UdpClient();
            sender.EnableBroadcast = true;
            var target = new IPEndPoint(IPAddress.Broadcast, port);

            string payload = $"STORMDS_ANNOUNCE|{Environment.MachineName}|{gameCode}|{gameTitle}|1|4";
            byte[] bytes = Encoding.UTF8.GetBytes(payload);
            await sender.SendAsync(bytes, bytes.Length, target);
        }
        catch
        {
            // Non-critical LAN broadcast failure
        }
    }

    /// <summary>
    /// Compares and synchronizes a save file with a peer payload, keeping the newer save if valid.
    /// </summary>
    public bool TrySyncSaveFromPeer(string gameCode, byte[] peerSaveData, DateTime peerSaveUtc)
    {
        if (string.IsNullOrWhiteSpace(gameCode) || peerSaveData.Length == 0) return false;

        string localSavePath = StormDsPlatformPaths.GetSaveFilePath(gameCode);
        if (File.Exists(localSavePath))
        {
            var localTime = File.GetLastWriteTimeUtc(localSavePath);
            if (localTime >= peerSaveUtc)
            {
                // Local save is newer or equal
                return false;
            }
        }

        try
        {
            Directory.CreateDirectory(Path.GetDirectoryName(localSavePath)!);
            File.WriteAllBytes(localSavePath, peerSaveData);
            File.SetLastWriteTimeUtc(localSavePath, peerSaveUtc);
            return true;
        }
        catch (Exception ex)
        {
            Console.Error.WriteLine($"[NetplayWfcService] Notice: Error syncing save: {ex.Message}");
            return false;
        }
    }

    private async Task ListenDiscoveryLoopAsync(UdpClient client, CancellationToken ct)
    {
        while (!ct.IsCancellationRequested)
        {
            try
            {
                var result = await client.ReceiveAsync(ct);
                string message = Encoding.UTF8.GetString(result.Buffer);
                if (message.StartsWith("STORMDS_ANNOUNCE|", StringComparison.Ordinal))
                {
                    string[] parts = message.Split('|');
                    if (parts.Length >= 6)
                    {
                        string host = parts[1];
                        string gameCode = parts[2];
                        string title = parts[3];
                        int current = int.TryParse(parts[4], out int c) ? c : 1;
                        int max = int.TryParse(parts[5], out int m) ? m : 4;

                        string key = $"{result.RemoteEndPoint.Address}_{gameCode}";
                        lock (_lock)
                        {
                            _discoveredPeers[key] = new LanPeerSession
                            {
                                SessionId = key,
                                HostName = host,
                                GameCode = gameCode,
                                GameTitle = title,
                                EndPoint = result.RemoteEndPoint,
                                PlayerCount = current,
                                MaxPlayers = max,
                                LastSeenUtc = DateTime.UtcNow
                            };
                        }
                    }
                }
            }
            catch (OperationCanceledException)
            {
                break;
            }
            catch
            {
                // Transient receive error
            }
        }
    }

    public void Dispose()
    {
        StopLanDiscovery();
    }
}
