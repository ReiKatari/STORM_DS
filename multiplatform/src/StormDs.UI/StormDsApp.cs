// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Controls.ApplicationLifetimes;
using Avalonia.Themes.Fluent;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Platform;
using Storm.AuroraFluid.Kit.Services;
using Storm.AuroraFluid.Kit.Themes;
using StormDs.Core.Localization;
using StormDs.UI.Common;
using StormDs.UI.Views;
using StormDs.UI.Windows;

namespace StormDs.UI;

/// <summary>
/// Root Avalonia Application for STORM DS.
/// Enforces NativeAOT trim safety, initializes the Aurora Fluid theme engine,
/// multi-language localization, zero-duplicate icon catalog, and Close-to-Tray system tray integration.
/// </summary>
public class StormDsApp : Application
{
    public override void Initialize()
    {
        Styles.Add(new FluentTheme());
    }

    public override void OnFrameworkInitializationCompleted()
    {
        // 1. Verify 0% duplicate icon geometries across the catalog
        AuroraIconCatalog.VerifyZeroDuplicates();

        // 2. Initialize and Apply Themes, Accent & Typography
        var uiState = StormDsUiState.Instance;
        string savedTheme = uiState.AppConfig.Theme;
        if (string.IsNullOrWhiteSpace(savedTheme)) savedTheme = AuroraThemeManager.ThemeMidnight;
        string themeKey = savedTheme.Replace("STORM ", "").Trim();

        AuroraAccentKind? parsedAccent = Enum.TryParse<AuroraAccentKind>(uiState.AppConfig.AccentName, true, out var acc)
            ? acc
            : null;
        AuroraTypographyPreset? parsedTypo = Enum.TryParse<AuroraTypographyPreset>(uiState.AppConfig.TypographyName, true, out var typ)
            ? typ
            : null;

        AuroraThemeManager.Instance.ApplyTheme(themeKey, parsedAccent, parsedTypo);
        AuroraTactileFeedbackService.Instance.Enabled = uiState.AppConfig.UiTactileAudioEnabled;

        // 3. Multi-Language Synchronization across all 11 languages
        if (!string.IsNullOrWhiteSpace(uiState.AppConfig.Language))
        {
            StormDsLoc.CurrentLanguage = uiState.AppConfig.Language;
        }

        // 4. Lifetime Wiring
        if (ApplicationLifetime is IClassicDesktopStyleApplicationLifetime desktop)
        {
            var mainWindow = new StormDsMainWindow();
            desktop.MainWindow = mainWindow;

            var trayIcon = new TrayIcon
            {
                ToolTipText = $"STORM DS {StormDsLoc.AppVersion}"
            };

            string iconPath = System.IO.Path.Combine(AppContext.BaseDirectory, "assets", "AppIcon.ico");
            if (System.IO.File.Exists(iconPath))
            {
                try
                {
                    trayIcon.Icon = new Avalonia.Controls.WindowIcon(iconPath);
                }
                catch
                {
                }
            }

            var trayMenu = new NativeMenu();

            var titleItem = new NativeMenuItem($"STORM DS {StormDsLoc.AppVersion}") { IsEnabled = false };
            trayMenu.Items.Add(titleItem);

            var statusItem = new NativeMenuItem(StormDsLoc.T("TrayReady")) { IsEnabled = false };
            trayMenu.Items.Add(statusItem);

            trayMenu.Items.Add(new NativeMenuItemSeparator());

            var openItem = new NativeMenuItem(StormDsLoc.T("TrayOpenWindow"));
            openItem.Click += (s, e) => AuroraTrayManager.Instance.ShowAndActivate();
            trayMenu.Items.Add(openItem);

            var resumeItem = new NativeMenuItem(StormDsLoc.T("TrayContinue"));
            resumeItem.Click += (s, e) =>
            {
                AuroraTrayManager.Instance.ShowAndActivate();
                if (!StormDsUiState.Instance.IsEmulationActive)
                {
                    StormDsUiState.Instance.StartEmulation();
                }
                else if (StormDsUiState.Instance.IsPaused)
                {
                    StormDsUiState.Instance.TogglePause();
                }
            };
            trayMenu.Items.Add(resumeItem);

            var pauseItem = new NativeMenuItem(StormDsLoc.T("TrayPause"));
            pauseItem.Click += (s, e) =>
            {
                if (StormDsUiState.Instance.IsEmulationActive && !StormDsUiState.Instance.IsPaused)
                {
                    StormDsUiState.Instance.TogglePause();
                }
            };
            trayMenu.Items.Add(pauseItem);

            var settingsItem = new NativeMenuItem(StormDsLoc.T("TraySettings"));
            settingsItem.Click += (s, e) =>
            {
                AuroraTrayManager.Instance.ShowAndActivate();
                StormDsUiState.Instance.SetNavSection(NavSectionKind.Settings);
            };
            trayMenu.Items.Add(settingsItem);

            trayMenu.Items.Add(new NativeMenuItemSeparator());

            var exitItem = new NativeMenuItem(StormDsLoc.T("TrayExit"));
            exitItem.Click += (s, e) => AuroraTrayManager.Instance.RequestExit();
            trayMenu.Items.Add(exitItem);

            trayIcon.Menu = trayMenu;

            StormDsLoc.LanguageChanged += _ =>
            {
                statusItem.Header = StormDsLoc.T("TrayReady");
                openItem.Header = StormDsLoc.T("TrayOpenWindow");
                resumeItem.Header = StormDsLoc.T("TrayContinue");
                pauseItem.Header = StormDsLoc.T("TrayPause");
                settingsItem.Header = StormDsLoc.T("TraySettings");
                exitItem.Header = StormDsLoc.T("TrayExit");
            };

            var trayIcons = new TrayIcons { trayIcon };
            TrayIcon.SetIcons(this, trayIcons);

            // Wire AuroraTrayManager with Close-to-Tray lifecycle and hidden state tracking
            AuroraTrayManager.Instance.AttachToWindow(
                mainWindow,
                "STORM DS",
                StormDsLoc.AppVersion,
                trayIcon,
                onShowRequested: () =>
                {
                    StormDsUiState.Instance.SetHiddenToTray(false);
                    mainWindow.Activate();
                }
            );

            mainWindow.Closing += (_, _) =>
            {
                if (!AuroraTrayManager.Instance.IsExitRequestedFromTray)
                {
                    StormDsUiState.Instance.SetHiddenToTray(true);
                }
            };
        }
        else if (ApplicationLifetime is ISingleViewApplicationLifetime singleView)
        {
            // Mobile (Android API 24+) Single View
            singleView.MainView = new StormDsMainView();
        }

        base.OnFrameworkInitializationCompleted();
    }
}
