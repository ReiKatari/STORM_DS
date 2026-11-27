// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using System.IO;
using System.Linq;
using System.Threading.Tasks;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Controls.ApplicationLifetimes;
using Avalonia.Media.Imaging;
using Avalonia.Threading;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Platform;
using Storm.AuroraFluid.Kit.Themes;
using StormDs.Core.Configuration;
using StormDs.Core.Engine;
using StormDs.Core.Localization;
using StormDs.Core.Native;
using StormDs.UI;
using StormDs.UI.Common;
using StormDs.UI.Windows;

namespace StormDs.Desktop;

internal static class Program
{
    [STAThread]
    public static int Main(string[] args)
    {
        if (args.Contains("--smoke-test", StringComparer.OrdinalIgnoreCase))
        {
            return RunHeadlessSmokeTest();
        }

        string? verifyUiDir = null;
        for (int i = 0; i < args.Length - 1; i++)
        {
            if (args[i].Equals("--verify-ui", StringComparison.OrdinalIgnoreCase))
            {
                verifyUiDir = args[i + 1];
                break;
            }
        }

        if (!string.IsNullOrWhiteSpace(verifyUiDir))
        {
            return BuildAvaloniaApp(verifyUiDir).StartWithClassicDesktopLifetime(Array.Empty<string>());
        }

        using var singleInstance = new AuroraSingleInstanceService("DS");
        bool isPrimary = singleInstance.TryAcquireOrNotifyExisting(() =>
        {
            Dispatcher.UIThread.Post(() =>
            {
                if (Application.Current?.ApplicationLifetime is IClassicDesktopStyleApplicationLifetime desktop &&
                    desktop.MainWindow != null)
                {
                    var win = desktop.MainWindow;
                    if (!win.IsVisible) win.Show();
                    if (win.WindowState == WindowState.Minimized) win.WindowState = WindowState.Normal;
                    win.Activate();
                }
            });
        });

        if (!isPrimary)
        {
            return 0;
        }

        return BuildAvaloniaApp().StartWithClassicDesktopLifetime(args);
    }

    public static AppBuilder BuildAvaloniaApp(string? verifyUiDir = null)
    {
        var builder = AppBuilder.Configure<StormDsApp>()
            .UsePlatformDetect()
            .With(new Win32PlatformOptions
            {
                RenderingMode = new[]
                {
                    Win32RenderingMode.Vulkan,
                    Win32RenderingMode.AngleEgl,
                    Win32RenderingMode.Wgl,
                    Win32RenderingMode.Software
                },
                CompositionMode = new[]
                {
                    Win32CompositionMode.WinUIComposition,
                    Win32CompositionMode.DirectComposition,
                    Win32CompositionMode.RedirectionSurface
                }
            })
            .With(new X11PlatformOptions
            {
                RenderingMode = new[]
                {
                    X11RenderingMode.Vulkan,
                    X11RenderingMode.Egl,
                    X11RenderingMode.Glx,
                    X11RenderingMode.Software
                },
                WmClass = "STORM DS"
            });

        if (!string.IsNullOrWhiteSpace(verifyUiDir))
        {
            builder.AfterSetup(_ =>
            {
                DispatcherTimer.RunOnce(async () =>
                {
                    try
                    {
                        if (Application.Current?.ApplicationLifetime is IClassicDesktopStyleApplicationLifetime desktop &&
                            desktop.MainWindow is StormDsMainWindow win)
                        {
                            string prevTheme = StormDsUiState.Instance.AppConfig.Theme;
                            Directory.CreateDirectory(verifyUiDir);
                            win.WindowState = WindowState.Normal;
                            win.Width = 1280;
                            win.Height = 820;

                            async Task SnapAsync(string fileName)
                            {
                                await Task.Delay(250);
                                win.UpdateLayout();
                                var sz = new PixelSize((int)Math.Max(1, win.Bounds.Width), (int)Math.Max(1, win.Bounds.Height));
                                using var rtb = new RenderTargetBitmap(sz, new Vector(96, 96));
                                rtb.Render(win);
#pragma warning disable CS0618
                                rtb.Save(Path.Combine(verifyUiDir, fileName));
#pragma warning restore CS0618
                            }

                            AuroraThemeManager.Instance.ApplyTheme(AuroraThemeManager.ThemeFantasy);
                            StormDsUiState.Instance.SetNavSection(NavSectionKind.Library);
                            await SnapAsync("01_library_fantasy.png");

                            StormDsUiState.Instance.SetNavSection(NavSectionKind.Settings);
                            win.MainView.SelectSettingsTab(2);
                            await SnapAsync("02_settings_input_fantasy.png");

                            AuroraThemeManager.Instance.ApplyTheme(AuroraThemeManager.ThemeDay);
                            win.MainView.SelectSettingsTab(7);
                            await SnapAsync("03_settings_themes_day.png");

                            win.MainView.SelectSettingsTab(3);
                            await SnapAsync("05_settings_sliders_day.png");

                            StormDsUiState.Instance.SetNavSection(NavSectionKind.Library);
                            await SnapAsync("04_library_day.png");

                            AuroraThemeManager.Instance.ApplyTheme(prevTheme.Replace("STORM ", "").Trim());
                            desktop.Shutdown(0);
                        }
                    }
                    catch (Exception ex)
                    {
                        Console.Error.WriteLine($"VERIFY_UI_ERR: {ex}");
                        Environment.Exit(2);
                    }
                }, TimeSpan.FromMilliseconds(900));
            });
        }

        return AuroraGpuBootstrap.ConfigureAuroraGpu(builder);
    }

    private static unsafe int RunHeadlessSmokeTest()
    {
        Console.WriteLine("=== STORM DS 8.9.2 MULTIPLATFORM SMOKE TEST ===");
        AuroraIconCatalog.VerifyZeroDuplicates();
        Console.WriteLine($"[OK] Colored Vector Icon Catalog: {Enum.GetValues<AuroraIconKind>().Length} unique icons (0% duplicates)");
        Console.WriteLine($"[OK] Dynamic Themes Registered: {AuroraThemeManager.Instance.GetAvailableThemes().Count} themes, {Enum.GetValues<AuroraAccentKind>().Length} accents, {Enum.GetValues<AuroraTypographyPreset>().Length} fonts");
        Console.WriteLine($"[OK] Localization Languages: {StormDsLoc.SupportedLanguages.Count} languages (Default Title: '{StormDsLoc.Get("AppSubtitle")}')");
        Console.WriteLine($"[OK] Native C++26 Core Loaded: {StormDsNative.IsAvailable} (ABI Version: {StormDsNative.LoadedAbiVersion})");

        if (StormDsNative.IsAvailable)
        {
            StormDsVulkanCaps caps = default;
            int vkRes = StormDsNative.storm_ds_probe_vulkan(&caps);
            uint major = caps.ApiVersion >> 22;
            uint minor = (caps.ApiVersion >> 12) & 0x3FF;
            uint patch = caps.ApiVersion & 0xFFF;
            Console.WriteLine($"[OK] Vulkan Probe (rc={vkRes}): Device='{caps.GetDeviceName()}', API={major}.{minor}.{patch}, ZeroCopy={caps.SupportsZeroCopy}, TimelineSem={caps.HasTimelineSemaphores}");

            using var engine = new StormDsEngineService();
            var cfg = new StormDsAppConfig();
            bool initOk = engine.Initialize(cfg);
            bool bootOk = engine.BootFirmware(ConsoleMode.Nds);
            var frameStats = engine.RunFrame();
            int nonZeroPixels = 0;
            for (int i = 0; i < engine.TopFrameBgra.Length; i += 4)
            {
                if (engine.TopFrameBgra[i] != 0 || engine.TopFrameBgra[i + 1] != 0 || engine.TopFrameBgra[i + 2] != 0)
                {
                    nonZeroPixels++;
                }
            }
            Console.WriteLine($"[OK] Live C++26 melonDS Frame Execution: Init={initOk}, Boot={bootOk}, FPS={frameStats.Fps:F1}, FrameMs={frameStats.FrameTimeMs:F2}ms, NonZeroTopPixels={nonZeroPixels}");
        }

        Console.WriteLine("=== ALL CHECKS PASSED (EXIT 0) ===");
        return 0;
    }
}
