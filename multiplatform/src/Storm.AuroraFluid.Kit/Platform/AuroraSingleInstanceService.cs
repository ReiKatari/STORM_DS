using System;
using System.IO;
using System.IO.Pipes;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using Avalonia.Threading;

namespace Storm.AuroraFluid.Kit.Platform;

/// <summary>
/// Controls single-instance lifecycle via Global Mutex and Local IPC (AGENTS.md Rule 4.1).
/// Automatically notifies and activates existing window when duplicate launch is attempted.
/// </summary>
public sealed class AuroraSingleInstanceService : IDisposable
{
    private readonly string _mutexName;
    private readonly string _pipeName;
    private Mutex? _mutex;
    private CancellationTokenSource? _cts;
    private bool _hasOwnership;

    public AuroraSingleInstanceService(string appName)
    {
        var sanitized = appName.Replace(" ", "_").ToUpperInvariant();
        _mutexName = $@"Global\STORM_{sanitized}_SingleInstanceMutex";
        _pipeName = $"STORM_{sanitized}_IpcPipe";
    }

    /// <summary>
    /// Attempts to acquire single instance ownership.
    /// If another instance is already running, sends activation signal and returns false.
    /// </summary>
    public bool TryAcquireOrNotifyExisting(Action onActivateRequested)
    {
        try
        {
            _mutex = new Mutex(true, _mutexName, out _hasOwnership);
        }
        catch (AbandonedMutexException)
        {
            _hasOwnership = true;
        }
        catch
        {
            _hasOwnership = false;
        }

        if (!_hasOwnership)
        {
            // Second instance: Send activation signal to existing instance
            NotifyExistingInstance();
            return false;
        }

        // First instance: Start background IPC listener for future launch attempts
        StartIpcServer(onActivateRequested);
        return true;
    }

    private void NotifyExistingInstance()
    {
        try
        {
            using var client = new NamedPipeClientStream(".", _pipeName, PipeDirection.Out);
            client.Connect(1500); // Wait up to 1.5 seconds for existing instance
            using var writer = new StreamWriter(client, Encoding.UTF8);
            writer.WriteLine("ACTIVATE");
            writer.Flush();
        }
        catch
        {
            // If pipe communication fails, proceed quietly
        }
    }

    private void StartIpcServer(Action onActivateRequested)
    {
        _cts = new CancellationTokenSource();
        var token = _cts.Token;

        Task.Run(async () =>
        {
            while (!token.IsCancellationRequested)
            {
                try
                {
                    using var server = new NamedPipeServerStream(
                        _pipeName,
                        PipeDirection.In,
                        1,
                        PipeTransmissionMode.Byte,
                        PipeOptions.Asynchronous
                    );

                    await server.WaitForConnectionAsync(token).ConfigureAwait(false);

                    using var reader = new StreamReader(server, Encoding.UTF8);
                    var message = await reader.ReadLineAsync(token).ConfigureAwait(false);

                    if (string.Equals(message, "ACTIVATE", StringComparison.OrdinalIgnoreCase))
                    {
                        Dispatcher.UIThread.Post(onActivateRequested);
                    }
                }
                catch (OperationCanceledException)
                {
                    break;
                }
                catch
                {
                    // Delay slightly before retrying to prevent tight loops
                    await Task.Delay(500, token).ConfigureAwait(false);
                }
            }
        }, token);
    }

    public void Dispose()
    {
        try
        {
            _cts?.Cancel();
            _cts?.Dispose();

            if (_hasOwnership && _mutex != null)
            {
                _mutex.ReleaseMutex();
            }
            _mutex?.Dispose();
        }
        catch
        {
            // Cleanup quietly
        }
    }
}
