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
                    "STORM DSI DECRYPTOR - Ошибка",
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
            IntPtr hWnd = FindWindow(null, "STORM DSI DECRYPTOR 1.1.9");
            if (hWnd == IntPtr.Zero) hWnd = FindWindow(null, "STORM DSI DECRYPTOR");
            if (hWnd == IntPtr.Zero) hWnd = FindWindow(null, "STORM DSi Decryptor 1.1.9");
            if (hWnd == IntPtr.Zero) hWnd = FindWindow(null, "STORM DSi Decryptor");
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
                "STORM DSI DECRYPTOR уже запущен в одном экземпляре.\nСуществующее окно было выведено на передний план.",
                "STORM DSI DECRYPTOR",
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
        Console.WriteLine("  STORM DSI DECRYPTOR 1.1.9 (STORM SOFT)");
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
                Console.WriteLine("Использование: STORM_DSI_DECRYPTOR.exe [--inplace] [-o <папка>] <файл.nds | папка>...");
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

        var entriesToProcess = new System.Collections.Generic.List<(string path, bool isArchive, string archiveEntry, string suggestedName)>();

        void AddCandidateFile(string filePath)
        {
            if (ArchiveManager.IsArchiveFile(filePath))
            {
                var roms = ArchiveManager.FindRomsInArchive(filePath);
                foreach (var r in roms)
                {
                    entriesToProcess.Add((filePath, true, r.EntryName, r.SuggestedFileName));
                }
                return;
            }

            try
            {
                var fi = new FileInfo(filePath);
                if (fi.Length < 0x200) return;

                string ext = fi.Extension.ToLowerInvariant();
                bool isCandidate = (ext is ".nds" or ".dsi" or ".app") ||
                                   string.IsNullOrEmpty(ext) ||
                                   fi.Name.All(char.IsDigit) ||
                                   (ext.Length > 1 && ext[1..].All(char.IsDigit));

                if (isCandidate)
                {
                    using var fs = new FileStream(filePath, FileMode.Open, FileAccess.Read, FileShare.ReadWrite);
                    byte[] hdr = new byte[0x400];
                    int r = fs.Read(hdr, 0, 0x400);
                    if (r >= 0x160 && DsiDecryptorEngine.IsRomHeader(hdr))
                    {
                        string sName = fi.Name;
                        string parentDir = Path.GetFileName(Path.GetDirectoryName(filePath) ?? "");
                        if ((fi.Name.All(char.IsDigit) || string.IsNullOrEmpty(ext)) && !string.IsNullOrWhiteSpace(parentDir))
                        {
                            sName = $"{parentDir}.nds";
                        }
                        else if (!sName.EndsWith(".nds", StringComparison.OrdinalIgnoreCase) &&
                                 !sName.EndsWith(".dsi", StringComparison.OrdinalIgnoreCase) &&
                                 !sName.EndsWith(".app", StringComparison.OrdinalIgnoreCase))
                        {
                            sName = $"{sName}.nds";
                        }
                        entriesToProcess.Add((filePath, false, "", sName));
                    }
                }
            }
            catch { }
        }

        foreach (var t in targets)
        {
            if (File.Exists(t))
            {
                AddCandidateFile(t);
            }
            else if (Directory.Exists(t))
            {
                foreach (var f in Directory.EnumerateFiles(t, "*.*", SearchOption.AllDirectories))
                {
                    AddCandidateFile(f);
                }
            }
        }

        Console.WriteLine($"Найдено образов для обработки: {entriesToProcess.Count}");
        foreach (var item in entriesToProcess)
        {
            Console.Write($"[{item.suggestedName}] Проверка... ");

            string targetDir = !string.IsNullOrEmpty(outDir)
                ? outDir
                : (Path.GetDirectoryName(item.path) ?? "");

            string outPath = (inPlace && !item.isArchive && item.path.EndsWith(".nds", StringComparison.OrdinalIgnoreCase))
                ? item.path
                : Path.Combine(targetDir, item.suggestedName);

            bool ok = false;
            if (item.isArchive)
            {
                Console.Write("Извлечение и расшифровка... ");
                try
                {
                    ok = ArchiveManager.ExtractAndDecrypt(item.path, item.archiveEntry, outPath);
                }
                catch (Exception ex)
                {
                    Console.WriteLine($"Ошибка архива: {ex.Message}");
                    ok = false;
                }
            }
            else
            {
                var info = DsiDecryptorEngine.InspectRom(item.path);
                if (!info.IsDsiRom && !DsiDecryptorEngine.IsRomHeader(File.ReadAllBytes(item.path)))
                {
                    Console.WriteLine("Обычный DS (не DSi, пропущен)");
                    continue;
                }
                if (!info.IsEncrypted && !info.NeedsCompatibilityPatch)
                {
                    Console.WriteLine("Уже расшифрован (пропущен)");
                    continue;
                }

                Console.Write("Расшифровка... ");
                try
                {
                    ok = DsiDecryptorEngine.DecryptFile(item.path, outPath);
                }
                catch (Exception ex)
                {
                    Console.WriteLine($"Ошибка файла: {ex.Message}");
                    ok = false;
                }
            }

            if (ok)
            {
                Console.WriteLine("УСПЕХ");
                successCount++;
            }
            else
            {
                Console.WriteLine("ОШИБКА");
                failCount++;
            }
        }

        Console.WriteLine();
        Console.WriteLine($"Итого: успешно: {successCount}, ошибок: {failCount}");

    }
}
