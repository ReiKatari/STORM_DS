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

    private const int ATTACH_PARENT_PROCESS = -1;
    private const int SW_RESTORE = 9;

    private void Application_Startup(object sender, StartupEventArgs e)
    {
        // CLI mode check
        if (e.Args.Length > 0)
        {
            RunCliMode(e.Args);
            Shutdown(0);
            return;
        }

        // Single instance check
        _mutex = new Mutex(true, MutexName, out _hasHandle);
        if (!_hasHandle)
        {
            IntPtr hWnd = FindWindow(null, "STORM DSi Decryptor");
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
        Console.WriteLine("  STORM DSi Decryptor 1.0.2 (STORM SOFT)");
        Console.WriteLine("  Nintendo DSi and DSiWare Fast Modcrypt Decryptor");
        Console.WriteLine("==========================================================");

        bool inPlace = false;
        var targets = new System.Collections.Generic.List<string>();

        foreach (var arg in args)
        {
            if (arg.Equals("--inplace", StringComparison.OrdinalIgnoreCase) || arg.Equals("-i", StringComparison.OrdinalIgnoreCase))
            {
                inPlace = true;
            }
            else if (arg.Equals("--help", StringComparison.OrdinalIgnoreCase) || arg.Equals("-h", StringComparison.OrdinalIgnoreCase))
            {
                Console.WriteLine("Использование: STORM_DSi_Decryptor.exe [--inplace] <файл.nds | папка>...");
                Console.WriteLine("  --inplace, -i    Перезаписывать оригинальные файлы на месте");
                Console.WriteLine("  по умолчанию     Создает копии с суффиксом (Decrypted)");
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
                ProcessFile(target, inPlace, ref successCount, ref failCount);
            }
            else if (Directory.Exists(target))
            {
                var files = Directory.GetFiles(target, "*.*", SearchOption.AllDirectories);
                foreach (var f in files)
                {
                    string ext = Path.GetExtension(f).ToLowerInvariant();
                    if (ext == ".nds" || ext == ".dsi" || ext == ".app")
                    {
                        ProcessFile(f, inPlace, ref successCount, ref failCount);
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

    private static void ProcessFile(string file, bool inPlace, ref int successCount, ref int failCount)
    {
        try
        {
            var info = DsiDecryptorEngine.InspectRom(file);
            if (!info.IsDsiRom)
            {
                Console.WriteLine($"[-] {info.FileName}: Не является DSi ROM (пропуск)");
                return;
            }

            if (!info.IsEncrypted)
            {
                Console.WriteLine($"[OK] {info.FileName} [{info.GameCode}]: Уже расшифрован");
                successCount++;
                return;
            }

            string outPath = inPlace
                ? file
                : Path.Combine(Path.GetDirectoryName(file) ?? "", Path.GetFileNameWithoutExtension(file) + " (Decrypted)" + Path.GetExtension(file));

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
