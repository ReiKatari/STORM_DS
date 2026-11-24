// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using Android.App;
using Android.Content.PM;
using Android.OS;
using Android.Views;
using Avalonia;
using Avalonia.Android;
using Storm.AuroraFluid.Kit.Platform;
using Storm.AuroraFluid.Kit.Services;
using StormDs.Core.Paths;
using StormDs.UI;
using StormDs.UI.Common;

namespace StormDs.Android;

[Activity(
    Label = "STORM DS",
    Theme = "@style/MyTheme.NoActionBar",
    MainLauncher = true,
    Exported = true,
    HardwareAccelerated = true,
    ConfigurationChanges = ConfigChanges.Orientation | ConfigChanges.ScreenSize | ConfigChanges.UiMode | ConfigChanges.ScreenLayout | ConfigChanges.SmallestScreenSize | ConfigChanges.Density | ConfigChanges.Keyboard | ConfigChanges.KeyboardHidden | ConfigChanges.Navigation)]
public class MainActivity : AvaloniaMainActivity<StormDsApp>
{
    protected override AppBuilder CustomizeAppBuilder(AppBuilder builder)
    {
        var configured = base.CustomizeAppBuilder(builder)
            .With(new AndroidPlatformOptions
            {
                // Safe multi-tier cascade: Vulkan 1.4/1.1/1.0 -> EGL OpenGL ES 3.0/2.0 -> Software
                RenderingMode = new[]
                {
                    AndroidRenderingMode.Vulkan,
                    AndroidRenderingMode.Egl,
                    AndroidRenderingMode.Software
                }
            });

        return AuroraGpuBootstrap.Configure(configured);
    }

    protected override void OnCreate(Bundle? savedInstanceState)
    {
        base.OnCreate(savedInstanceState);

        try
        {
            // Law 5: Initialize /storage/emulated/0/STORM DS folder structure when accessible
            StormDsPlatformPaths.EnsureDirectoriesExist();
        }
        catch
        {
        }

        // Wire Android haptic feedback into Storm.AuroraFluid.Kit tactile engine
        AuroraTactileFeedbackService.Instance.ExternalAudioHook = _ =>
        {
            try
            {
                Window?.DecorView?.PerformHapticFeedback(
                    FeedbackConstants.VirtualKey,
                    FeedbackFlags.IgnoreGlobalSetting);
            }
            catch
            {
            }
        };

        // Support direct ROM launch intent (--es PATH "<rom>")
        string? launchRomPath = Intent?.GetStringExtra("PATH");
        if (!string.IsNullOrWhiteSpace(launchRomPath))
        {
            StormDsUiState.Instance.StartRomEmulationFromPath(launchRomPath);
        }
    }
}
