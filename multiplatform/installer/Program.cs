// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using System.Diagnostics;
using System.IO;
using System.IO.Compression;
using System.Reflection;
using System.Security.Principal;
using System.Threading;
using System.Threading.Tasks;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Layout;
using Avalonia.Media;
using Avalonia.Media.Imaging;
using Avalonia.Themes.Fluent;
using Storm.AuroraFluid.Kit.Controls;
using Storm.AuroraFluid.Kit.Services;
using Storm.AuroraFluid.Kit.Themes;

namespace StormDs.Installer;

public static class Program
{
    public const string AppVersion = "8.9.0";

    // Target setup directory strictly by program name WITHOUT version suffix.
    public static string GetDefaultInstallDirectory(bool perMachine)
    {
        string baseDir = perMachine
            ? Environment.GetFolderPath(Environment.SpecialFolder.ProgramFiles)
            : Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData), "Programs");
        return Path.Combine(baseDir, "STORM DS");
    }

    public static bool IsProcessElevated()
    {
        if (!OperatingSystem.IsWindows()) return false;
        try
        {
            using var identity = WindowsIdentity.GetCurrent();
            var principal = new WindowsPrincipal(identity);
            return principal.IsInRole(WindowsBuiltInRole.Administrator);
        }
        catch
        {
            return false;
        }
    }

    [STAThread]
    public static int Main(string[] args)
    {
        AuroraThemeManager.Instance.ApplyTheme(AuroraThemeManager.ThemeMidnight, AuroraAccentKind.DefaultThemeAccent);
        _ = AuroraLocalizationService.Instance.CurrentLanguage;

        for (int i = 0; i < args.Length; i++)
        {
            if (string.Equals(args[i], "--smoke-test", StringComparison.OrdinalIgnoreCase))
            {
                string dirUser = GetDefaultInstallDirectory(false);
                string dirMachine = GetDefaultInstallDirectory(true);
                Console.WriteLine($"[STORM-INSTALLER] Default User Dir: {dirUser}");
                Console.WriteLine($"[STORM-INSTALLER] Default Machine Dir: {dirMachine}");
                if (dirUser.Contains(AppVersion, StringComparison.OrdinalIgnoreCase) ||
                    dirMachine.Contains(AppVersion, StringComparison.OrdinalIgnoreCase))
                {
                    Console.Error.WriteLine("FAIL: Install directory must not contain version number!");
                    return 1;
                }

                var asm = Assembly.GetExecutingAssembly();
                string[] requiredResources = ["AppIcon.png", "AppIcon.ico", "StormSoftLogo.png", "Payload.zip"];
                foreach (string resName in requiredResources)
                {
                    using var stream = asm.GetManifestResourceStream(resName);
                    if (stream == null || stream.Length == 0)
                    {
                        Console.Error.WriteLine($"FAIL: Embedded resource '{resName}' is missing or empty!");
                        return 1;
                    }
                    Console.WriteLine($"[STORM-INSTALLER] Embedded resource '{resName}': {stream.Length} bytes");
                }

                Console.WriteLine($"PASS: STORM_DS_{AppVersion}_Setup verified (Rules 4.3 and 4.4 compliant).");
                return 0;
            }
        }

        BuildAvaloniaApp().StartWithClassicDesktopLifetime(args);
        return 0;
    }

    public static AppBuilder BuildAvaloniaApp()
        => AppBuilder.Configure<InstallerApp>()
            .UsePlatformDetect()
            .LogToTrace();
}

public sealed class InstallerApp : Application
{
    public override void Initialize()
    {
        Styles.Add(new FluentTheme());
    }

    public override void OnFrameworkInitializationCompleted()
    {
        if (ApplicationLifetime is Avalonia.Controls.ApplicationLifetimes.IClassicDesktopStyleApplicationLifetime desktop)
        {
            desktop.MainWindow = new InstallerWindow();
        }
        base.OnFrameworkInitializationCompleted();
    }
}

public sealed class InstallerWindow : Window
{
    private readonly AuroraVolumetricButton _installBtn;
    private readonly AuroraVolumetricButton _cancelBtn;
    private readonly ProgressBar _progressBar;
    private readonly TextBlock _statusText;
    private readonly TextBox _installPathBox;
    private readonly AuroraNeonCheckBox _desktopShortcutCheck;
    private readonly AuroraNeonCheckBox _startMenuShortcutCheck;
    private readonly AuroraNeonCheckBox _perMachineCheck;
    private CancellationTokenSource? _cts;

    public InstallerWindow()
    {
        Title = $"STORM DS {Program.AppVersion}";
        Width = 680;
        Height = 490;
        CanResize = false;
        WindowStartupLocation = WindowStartupLocation.CenterScreen;
        ExtendClientAreaToDecorationsHint = true;
        Background = new SolidColorBrush(Color.Parse("#0A0D18"));

        var asm = Assembly.GetExecutingAssembly();
        using (var icoStream = asm.GetManifestResourceStream("AppIcon.ico"))
        {
            if (icoStream != null)
            {
                Icon = new WindowIcon(icoStream);
            }
        }

        var rootBorder = new Border
        {
            BorderBrush = new SolidColorBrush(Color.Parse("#2B3556")),
            BorderThickness = new Thickness(1),
            CornerRadius = new CornerRadius(12),
            Padding = new Thickness(24)
        };

        var mainGrid = new Grid
        {
            RowDefinitions = new RowDefinitions("Auto,Auto,*,Auto")
        };

        // 1. Header: Title on left; Program Icon in top-right strictly WITHOUT frame/container.
        var headerGrid = new Grid
        {
            ColumnDefinitions = new ColumnDefinitions("*,64"),
            Margin = new Thickness(0, 0, 0, 14)
        };

        var titleStack = new StackPanel { Spacing = 4, VerticalAlignment = VerticalAlignment.Center };
        titleStack.Children.Add(new TextBlock
        {
            Text = $"STORM DS {Program.AppVersion}",
            FontSize = 22,
            FontWeight = FontWeight.Bold,
            Foreground = Brushes.White
        });
        titleStack.Children.Add(new TextBlock
        {
            Text = "Установка эмулятора Nintendo DS и DSi для Windows (x64)",
            FontSize = 13,
            Foreground = new SolidColorBrush(Color.Parse("#94A3B8"))
        });
        Grid.SetColumn(titleStack, 0);
        headerGrid.Children.Add(titleStack);

        var appIconControl = CreateEmbeddedImage(asm, "AppIcon.png", 56);
        appIconControl.HorizontalAlignment = HorizontalAlignment.Right;
        appIconControl.VerticalAlignment = VerticalAlignment.Center;
        Grid.SetColumn(appIconControl, 1);
        headerGrid.Children.Add(appIconControl);

        Grid.SetRow(headerGrid, 0);
        mainGrid.Children.Add(headerGrid);

        // 2. Horizontal Separator
        var separator = new Border
        {
            Height = 1,
            Background = new SolidColorBrush(Color.Parse("#1E293B")),
            Margin = new Thickness(0, 0, 0, 16)
        };
        Grid.SetRow(separator, 1);
        mainGrid.Children.Add(separator);

        // 3. Body: Left = install type & path; Right = STORM SOFT emblem strictly aligned under header icon at same 56px size without frame.
        var bodyGrid = new Grid
        {
            ColumnDefinitions = new ColumnDefinitions("*,64")
        };

        bool elevated = Program.IsProcessElevated();
        var optionsStack = new StackPanel { Spacing = 10, Margin = new Thickness(0, 0, 16, 0) };

        _perMachineCheck = new AuroraNeonCheckBox
        {
            Label = "Установить для всех пользователей (Program Files)",
            IsChecked = elevated
        };
        _installPathBox = new TextBox
        {
            Text = Program.GetDefaultInstallDirectory(elevated),
            FontSize = 13,
            CornerRadius = new CornerRadius(8)
        };
        _perMachineCheck.IsCheckedChanged += (_, chk) =>
        {
            _installPathBox.Text = Program.GetDefaultInstallDirectory(chk);
        };

        optionsStack.Children.Add(_perMachineCheck);
        optionsStack.Children.Add(new TextBlock
        {
            Text = "Каталог установки (без номера версии):",
            FontSize = 12.5,
            Foreground = new SolidColorBrush(Color.Parse("#CBD5E1"))
        });
        optionsStack.Children.Add(_installPathBox);

        _desktopShortcutCheck = new AuroraNeonCheckBox
        {
            Label = "Создать ярлык на рабочем столе",
            IsChecked = true
        };
        optionsStack.Children.Add(_desktopShortcutCheck);

        _startMenuShortcutCheck = new AuroraNeonCheckBox
        {
            Label = "Добавить ярлык в меню Пуск",
            IsChecked = true
        };
        optionsStack.Children.Add(_startMenuShortcutCheck);

        _statusText = new TextBlock
        {
            Text = $"Готов к установке STORM DS {Program.AppVersion}.",
            FontSize = 12,
            Foreground = new SolidColorBrush(Color.Parse("#38BDF8")),
            Margin = new Thickness(0, 6, 0, 0)
        };
        optionsStack.Children.Add(_statusText);

        _progressBar = new ProgressBar
        {
            Minimum = 0,
            Maximum = 100,
            Value = 0,
            Height = 10,
            CornerRadius = new CornerRadius(5)
        };
        optionsStack.Children.Add(_progressBar);

        Grid.SetColumn(optionsStack, 0);
        bodyGrid.Children.Add(optionsStack);

        var stormEmblem = CreateEmbeddedImage(asm, "StormSoftLogo.png", 56);
        stormEmblem.HorizontalAlignment = HorizontalAlignment.Right;
        stormEmblem.VerticalAlignment = VerticalAlignment.Top;
        Grid.SetColumn(stormEmblem, 1);
        bodyGrid.Children.Add(stormEmblem);

        Grid.SetRow(bodyGrid, 2);
        mainGrid.Children.Add(bodyGrid);

        // 4. Footer Buttons
        var footerStack = new StackPanel
        {
            Orientation = Orientation.Horizontal,
            HorizontalAlignment = HorizontalAlignment.Right,
            Spacing = 12,
            Margin = new Thickness(0, 16, 0, 0)
        };

        _installBtn = new AuroraVolumetricButton
        {
            Content = "Установить",
            IsHero = true,
            MinWidth = 140
        };
        _installBtn.Click += async (_, _) => await StartInstallationAsync();

        _cancelBtn = new AuroraVolumetricButton
        {
            Content = "Отмена",
            MinWidth = 120
        };
        _cancelBtn.Click += (_, _) =>
        {
            _cts?.Cancel();
            Close();
        };

        footerStack.Children.Add(_installBtn);
        footerStack.Children.Add(_cancelBtn);

        Grid.SetRow(footerStack, 3);
        mainGrid.Children.Add(footerStack);

        rootBorder.Child = mainGrid;
        Content = rootBorder;
    }

    private static Image CreateEmbeddedImage(Assembly asm, string resourceName, double size)
    {
        var img = new Image
        {
            Width = size,
            Height = size,
            Stretch = Stretch.Uniform
        };
        using var stream = asm.GetManifestResourceStream(resourceName);
        if (stream != null)
        {
            img.Source = new Bitmap(stream);
        }
        return img;
    }

    private async Task StartInstallationAsync()
    {
        _installBtn.IsEnabled = false;
        _cancelBtn.IsEnabled = true;
        _cts = new CancellationTokenSource();

        try
        {
            string rawPath = (_installPathBox.Text ?? string.Empty).Trim();
            string targetDir = string.IsNullOrWhiteSpace(rawPath)
                ? Program.GetDefaultInstallDirectory(_perMachineCheck.IsChecked)
                : rawPath;

            Directory.CreateDirectory(targetDir);

            var asm = Assembly.GetExecutingAssembly();
            using var payloadStream = asm.GetManifestResourceStream("Payload.zip")
                ?? throw new FileNotFoundException("Встроенный архив Payload.zip не найден.");

            await Task.Run(() =>
            {
                using var zip = new ZipArchive(payloadStream, ZipArchiveMode.Read);
                int totalEntries = Math.Max(1, zip.Entries.Count);
                int processed = 0;

                foreach (var entry in zip.Entries)
                {
                    _cts.Token.ThrowIfCancellationRequested();
                    string destPath = Path.GetFullPath(Path.Combine(targetDir, entry.FullName));
                    string fullTargetDir = Path.GetFullPath(targetDir);
                    if (!destPath.StartsWith(fullTargetDir, StringComparison.OrdinalIgnoreCase))
                    {
                        continue;
                    }

                    if (string.IsNullOrEmpty(entry.Name))
                    {
                        Directory.CreateDirectory(destPath);
                    }
                    else
                    {
                        Directory.CreateDirectory(Path.GetDirectoryName(destPath)!);
                        using var src = entry.Open();
                        using var dst = File.Create(destPath);
                        src.CopyTo(dst);
                    }

                    processed++;
                    double pct = Math.Min(92.0, (processed * 92.0) / totalEntries);
                    Avalonia.Threading.Dispatcher.UIThread.Post(() =>
                    {
                        _progressBar.Value = pct;
                        _statusText.Text = $"Распаковка файлов... {pct:0}%";
                    });
                }
            }, _cts.Token);

            _cts.Token.ThrowIfCancellationRequested();
            _progressBar.Value = 95;
            _statusText.Text = "Создание ярлыков...";

            string exePath = Path.Combine(targetDir, "STORM DS.exe");
            string iconPath = Path.Combine(targetDir, "assets", "AppIcon.ico");
            if (!File.Exists(iconPath)) iconPath = exePath;

            if (_desktopShortcutCheck.IsChecked)
            {
                string desktopLnk = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.DesktopDirectory), "STORM DS.lnk");
                await CreateShortcutAsync(desktopLnk, exePath, targetDir, iconPath);
            }

            if (_startMenuShortcutCheck.IsChecked)
            {
                string programsDir = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.Programs), "STORM DS");
                Directory.CreateDirectory(programsDir);
                await CreateShortcutAsync(Path.Combine(programsDir, "STORM DS.lnk"), exePath, targetDir, iconPath);
            }

            _progressBar.Value = 100;
            _installBtn.IsEnabled = false;
            _cancelBtn.IsEnabled = false;
            _statusText.Text = "Установка завершена (100%). Запуск STORM DS...";
            await Task.Delay(350);

            if (File.Exists(exePath))
            {
                Process.Start(new ProcessStartInfo(exePath)
                {
                    WorkingDirectory = targetDir,
                    UseShellExecute = true
                });
            }
            Close();
        }
        catch (OperationCanceledException)
        {
            _statusText.Text = "Установка отменена пользователем.";
            _installBtn.IsEnabled = true;
        }
        catch (Exception ex)
        {
            _statusText.Text = $"Ошибка: {ex.Message}";
            _installBtn.IsEnabled = true;
        }
    }

    private static async Task CreateShortcutAsync(string lnkPath, string targetExe, string workDir, string iconPath)
    {
        if (!OperatingSystem.IsWindows()) return;
        string escapedLnk = lnkPath.Replace("'", "''");
        string escapedTarget = targetExe.Replace("'", "''");
        string escapedWork = workDir.Replace("'", "''");
        string escapedIcon = iconPath.Replace("'", "''");
        string psScript =
            $"$s=(New-Object -ComObject WScript.Shell).CreateShortcut('{escapedLnk}');" +
            $"$s.TargetPath='{escapedTarget}';$s.WorkingDirectory='{escapedWork}';" +
            $"$s.IconLocation='{escapedIcon},0';$s.Save()";

        using var proc = Process.Start(new ProcessStartInfo
        {
            FileName = "powershell.exe",
            Arguments = $"-NoProfile -NonInteractive -WindowStyle Hidden -Command \"{psScript}\"",
            CreateNoWindow = true,
            UseShellExecute = false
        });
        if (proc != null)
        {
            await proc.WaitForExitAsync();
        }
    }
}
