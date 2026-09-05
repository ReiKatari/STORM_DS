using System;
using System.IO;
using System.Runtime.InteropServices;
using System.Threading;
using System.Windows;

namespace StormDsiDecryptor;

public partial class App : Application
{
    private const string MutexName = @"Global\STORM_DSI_DECRYPTOR_SingleInstanceMutex";
    private Mutex? _mutex;
    private bool _hasHandle;

    [DllImport("user32.dll")]
    private static extern bool SetForegroundWindow(IntPtr hWnd);

    [DllImport("user32.dll")]
    private static extern bool ShowWindow(IntPtr hWnd, int nCmdShow);

    [DllImport("user32.dll")]
    private static extern IntPtr FindWindow(string? lpClassName, string lpWindowName);

    [DllImport("kernel32.dll")]
    private static extern bool AttachConsole(int dwProcessId);

    [DllImport("kernel32.dll")]
    private static extern bool AllocConsole();

    [DllImport("user32.dll", SetLastError = true)]
    private static extern bool ChangeWindowMessageFilter(uint message, uint dwFlag);

    private const uint WM_DROPFILES = 0x0233;
    private const uint WM_COPYDATA = 0x004A;
    private const uint WM_COPYGLOBALDATA = 0x0049;
    private const uint MSGFLT_ALLOW = 1;

    private const int ATTACH_PARENT_PROCESS = -1;
    private const int SW_RESTORE = 9;

    private void Application_Startup(object sender, StartupEventArgs e)
    {
        // Unblock Windows UIPI message filtering at process level for Drag & Drop
        try
        {
            ChangeWindowMessageFilter(WM_DROPFILES, MSGFLT_ALLOW);
            ChangeWindowMessageFilter(WM_COPYDATA, MSGFLT_ALLOW);
            ChangeWindowMessageFilter(WM_COPYGLOBALDATA, MSGFLT_ALLOW);
        }
        catch { }
        // CLI mode check
        if (e.Args.Length > 0)
        {
            RunCliMode(e.Args);
            Environment.Exit(0);
            return;
        }

        // Single instance check
        try
        {
            _mutex = new Mutex(true, MutexName, out _hasHandle);
        }
        catch (AbandonedMutexException)
        {
            _hasHandle = true;
        }
        catch (UnauthorizedAccessException)
        {
            try
            {
                _mutex = new Mutex(true, @"Local\STORM_DSI_DECRYPTOR_SingleInstanceMutex", out _hasHandle);
            }
            catch
            {
                _hasHandle = true;
            }
        }
        catch
        {
            _hasHandle = true;
        }

        // Global unhandled exception handlers to guarantee the application never abruptly terminates
        this.DispatcherUnhandledException += (s, args) =>
        {
            try
            {
                System.Diagnostics.Debug.WriteLine($"[CRITICAL DISPATCHER ERROR]: {args.Exception}");
                args.Handled = true;
                StormMessageBox.Show(
                    null,
                    $"Произошла непредвиденная ошибка:\n{args.Exception.Message}",
                    "Ошибка приложения",
                    MessageBoxButton.OK,
                    MessageBoxImage.Error);
            }
            catch
            {
                args.Handled = true;
            }
        };

        AppDomain.CurrentDomain.UnhandledException += (s, args) =>
        {
            System.Diagnostics.Debug.WriteLine($"[CRITICAL DOMAIN ERROR]: {args.ExceptionObject}");
        };

        TaskScheduler.UnobservedTaskException += (s, args) =>
        {
            System.Diagnostics.Debug.WriteLine($"[CRITICAL TASK ERROR]: {args.Exception}");
            args.SetObserved();
        };

        if (!_hasHandle)
        {
            IntPtr hWnd = FindWindow(null, "STORM DSi Decryptor 1.1.7");
            if (hWnd == IntPtr.Zero)
            {
                hWnd = FindWindow(null, "STORM DSi Decryptor 1.1.6");
            }
            if (hWnd == IntPtr.Zero)
            {
                hWnd = FindWindow(null, "STORM DSi Decryptor 1.1.5");
            }
            if (hWnd == IntPtr.Zero)
            {
                hWnd = FindWindow(null, "STORM DSi Decryptor 1.1.4");
            }
            if (hWnd == IntPtr.Zero)
            {
                hWnd = FindWindow(null, "STORM DSi Decryptor 1.1.2");
            }
            if (hWnd == IntPtr.Zero)
            {
                hWnd = FindWindow(null, "STORM DSi Decryptor 1.1.1");
            }
            if (hWnd == IntPtr.Zero)
            {
                hWnd = FindWindow(null, "STORM DSi Decryptor 1.1.0");
            }
            if (hWnd == IntPtr.Zero)
            {
                hWnd = FindWindow(null, "STORM DSi Decryptor 1.0.9");
            }
            if (hWnd == IntPtr.Zero)
            {
                hWnd = FindWindow(null, "STORM DSi Decryptor 1.0.7");
            }
            if (hWnd == IntPtr.Zero)
            {
                hWnd = FindWindow(null, "STORM DSi Decryptor 1.0.6");
            }
            if (hWnd == IntPtr.Zero)
            {
                hWnd = FindWindow(null, "STORM DSi Decryptor 1.0.5");
            }
            if (hWnd == IntPtr.Zero)
            {
                hWnd = FindWindow(null, "STORM DSi Decryptor 1.0.4");
            }
            if (hWnd == IntPtr.Zero)
            {
                hWnd = FindWindow(null, "STORM DSi Decryptor");
            }
            if (hWnd == IntPtr.Zero)
            {
                try
                {
                    var current = System.Diagnostics.Process.GetCurrentProcess();
                    foreach (var p in System.Diagnostics.Process.GetProcessesByName(current.ProcessName))
                    {
                        if (p.Id != current.Id && p.MainWindowHandle != IntPtr.Zero)
                        {
                            hWnd = p.MainWindowHandle;
                            break;
                        }
                    }
                }
                catch { }
            }

            if (hWnd != IntPtr.Zero)
            {
                ShowWindow(hWnd, SW_RESTORE);
                SetForegroundWindow(hWnd);
            }

            MessageBox.Show(
                "Программа уже запущена в одном экземпляре.\nСуществующее окно было выведено на передний план.",
                "STORM DSi Decryptor",
                MessageBoxButton.OK,
                MessageBoxImage.Information);
            Shutdown();
            return;
        }

        var mainWin = new MainWindow();
        mainWin.Show();
    }

    private void RunCliMode(string[] args)
    {
        if (!AttachConsole(ATTACH_PARENT_PROCESS))
        {
            AllocConsole();
        }

        Console.WriteLine();
        Console.WriteLine("==========================================================");
        Console.WriteLine("  STORM DSi Decryptor 1.1.7 (STORM SOFT)");
        Console.WriteLine("  Nintendo DSi and DSiWare Fast Modcrypt Decryptor");
        Console.WriteLine("==========================================================");

        bool inPlace = false;
        string? outDir = null;
        var targets = new System.Collections.Generic.List<string>();

        for (int i = 0; i < args.Length; i++)
        {
            var arg = args[i];
            if (arg.Equals("--inplace", StringComparison.OrdinalIgnoreCase) || arg.Equals("-i", StringComparison.OrdinalIgnoreCase))
            {
                inPlace = true;
            }
            else if ((arg.Equals("--out", StringComparison.OrdinalIgnoreCase) || arg.Equals("-o", StringComparison.OrdinalIgnoreCase)) && i + 1 < args.Length)
            {
                outDir = args[++i];
            }
            else if (arg.Equals("--help", StringComparison.OrdinalIgnoreCase) || arg.Equals("-h", StringComparison.OrdinalIgnoreCase))
            {
                Console.WriteLine("Использование: STORM_DSi_Decryptor.exe [--inplace] [-o <папка>] <файл.nds | папка>...");
                Console.WriteLine("  --inplace, -i    Перезаписывать оригинальные файлы на месте");
                Console.WriteLine("  --out, -o <дир>  Папка для сохранения копий");
                Console.WriteLine("  по умолчанию     Создает копии файлов без изменения имени");
                return;
            }
            else
            {
                targets.Add(arg);
            }
        }

        int successCount = 0;
        int failCount = 0;

        foreach (var target in targets)
        {
            if (File.Exists(target))
            {
                ProcessFile(target, inPlace, outDir, ref successCount, ref failCount);
            }
            else if (Directory.Exists(target))
            {
                var files = Directory.GetFiles(target, "*.*", SearchOption.AllDirectories);
                foreach (var f in files)
                {
                    string ext = Path.GetExtension(f).ToLowerInvariant();
                    if (ext == ".nds" || ext == ".dsi" || ext == ".app")
                    {
                        ProcessFile(f, inPlace, outDir, ref successCount, ref failCount);
                    }
                }
            }
            else
            {
                Console.WriteLine($"[!] Файл или папка не найдены: {target}");
                failCount++;
            }
        }

        Console.WriteLine();
        Console.WriteLine($"Готово! Успешно обработано: {successCount}, ошибок: {failCount}");
        Console.WriteLine("==========================================================");
    }

    private static void ProcessFile(string file, bool inPlace, string? outDir, ref int successCount, ref int failCount)
    {
        try
        {
            var info = DsiDecryptorEngine.InspectRom(file);
            if (!info.IsDsiRom)
            {
                Console.WriteLine($"[-] {info.FileName}: Не является DSi ROM (пропуск)");
                return;
            }

            string targetDir = !string.IsNullOrWhiteSpace(outDir) ? outDir : (Path.GetDirectoryName(file) ?? "");
            string outPath = inPlace
                ? file
                : Path.Combine(targetDir, Path.GetFileName(file));

            if (!info.IsEncrypted)
            {
                if (!inPlace && !string.IsNullOrWhiteSpace(outDir))
                {
                    if (!string.Equals(Path.GetFullPath(file), Path.GetFullPath(outPath), StringComparison.OrdinalIgnoreCase))
                    {
                        if (!Directory.Exists(targetDir)) Directory.CreateDirectory(targetDir);
                        File.Copy(file, outPath, true);
                    }
                }
                Console.WriteLine($"[OK] {info.FileName} [{info.GameCode}]: Уже расшифрован");
                successCount++;
                return;
            }

            var sw = System.Diagnostics.Stopwatch.StartNew();
            bool ok = DsiDecryptorEngine.DecryptFile(file, outPath);
            sw.Stop();

            if (ok)
            {
                Console.WriteLine($"[+] {info.FileName} -> {Path.GetFileName(outPath)} ({sw.ElapsedMilliseconds} мс)");
                successCount++;
            }
            else
            {
                Console.WriteLine($"[ERR] {info.FileName}: Ошибка дешифровки");
                failCount++;
            }
        }
        catch (Exception ex)
        {
            Console.WriteLine($"[ERR] {Path.GetFileName(file)}: {ex.Message}");
            failCount++;
        }
    }

    private void Application_Exit(object sender, ExitEventArgs e)
    {
        if (_hasHandle && _mutex != null)
        {
            _mutex.ReleaseMutex();
            _mutex.Dispose();
        }
    }
}
