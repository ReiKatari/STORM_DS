using System;
using Avalonia.Controls;
using Avalonia.Controls.ApplicationLifetimes;

namespace Storm.AuroraFluid.Kit.Platform;

/// <summary>
/// Universal system tray manager enforcing Law 1:
/// Close-to-Tray behavior on [X]/Alt+F4, exit only via tray menu,
/// top info item, and strictly ZERO emojis and ZERO icons in tray items.
/// </summary>
public sealed class AuroraTrayManager
{
    private static readonly Lazy<AuroraTrayManager> s_lazyInstance = new(() => new AuroraTrayManager());
    public static AuroraTrayManager Instance => s_lazyInstance.Value;

    public bool IsExitRequestedFromTray { get; private set; }

    public Window? AttachedWindow { get; private set; }
    public TrayIcon? TrayIcon { get; private set; }

    private AuroraTrayManager() { }

    /// <summary>
    /// Attaches Close-to-Tray lifecycle interception to the main window and builds Law 1 compliant menu.
    /// </summary>
    public void AttachToWindow(Window window, string appTitle, string appVersion, TrayIcon? trayIcon = null, Action? onShowRequested = null)
    {
        AttachedWindow = window;
        TrayIcon = trayIcon;

        // Law 1 Interception: [X] and Alt+F4 hide to tray unless exit requested from tray
        window.Closing += (sender, e) =>
        {
            if (!IsExitRequestedFromTray)
            {
                e.Cancel = true;
                window.Hide();
            }
        };

        if (trayIcon != null)
        {
            trayIcon.Clicked += (sender, e) =>
            {
                ShowAndActivate(onShowRequested);
            };

            if (trayIcon.Menu == null || trayIcon.Menu.Items.Count == 0)
            {
                var menu = new NativeMenu();

                // 1. Top Info Header (App Title & Version, zero icons, zero emojis)
                var infoItem = new NativeMenuItem($"{appTitle} {appVersion}")
                {
                    IsEnabled = false
                };
                menu.Items.Add(infoItem);
                menu.Items.Add(new NativeMenuItemSeparator());

                // 2. Open / Restore Item
                var openItem = new NativeMenuItem("Открыть главное окно");
                openItem.Click += (sender, e) =>
                {
                    ShowAndActivate(onShowRequested);
                };
                menu.Items.Add(openItem);

                menu.Items.Add(new NativeMenuItemSeparator());

                // 3. Exit Item (The ONLY way to exit per Law 1)
                var exitItem = new NativeMenuItem("Выход");
                exitItem.Click += (sender, e) =>
                {
                    RequestExit();
                };
                menu.Items.Add(exitItem);

                trayIcon.Menu = menu;
            }
        }
    }

    /// <summary>
    /// Restores the window from tray and brings it to front.
    /// </summary>
    public void ShowAndActivate(Action? customShowAction = null)
    {
        if (AttachedWindow == null) return;

        AttachedWindow.Show();
        if (AttachedWindow.WindowState == WindowState.Minimized)
        {
            AttachedWindow.WindowState = WindowState.Normal;
        }
        AttachedWindow.Activate();
        customShowAction?.Invoke();
    }

    /// <summary>
    /// Officially requests application exit from the tray context menu (Law 1).
    /// </summary>
    public void RequestExit()
    {
        IsExitRequestedFromTray = true;

        if (AttachedWindow != null)
        {
            AttachedWindow.Close();
        }
        else if (Avalonia.Application.Current?.ApplicationLifetime is IClassicDesktopStyleApplicationLifetime desktop)
        {
            desktop.Shutdown();
        }
    }
}
