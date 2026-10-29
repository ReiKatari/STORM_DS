using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Runtime.InteropServices;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Input;
using System.Windows.Interop;
using Microsoft.Win32;

namespace StormDsiDecryptor;

public partial class MainWindow : Window
{
    private readonly ObservableCollection<RomItem> _games = new();
    private string? _lastFolderPath;
    private string? _customOutputDir;
    private bool _isScanning;
    private DateTime _lastDropHandledTime = DateTime.MinValue;

    private System.Windows.Forms.NotifyIcon? _notifyIcon;
    private bool _isQuittingFromTray = false;

    [DllImport("user32.dll", SetLastError = true)]
    private static extern bool ChangeWindowMessageFilterEx(IntPtr hWnd, uint msg, uint action, IntPtr pChangeFilterStruct);

    [DllImport("shell32.dll", CharSet = CharSet.Unicode)]
    private static extern uint DragQueryFile(IntPtr hDrop, uint iFile, [Out] System.Text.StringBuilder? lpszFile, uint cch);

    [DllImport("shell32.dll")]
    private static extern void DragFinish(IntPtr hDrop);

    [DllImport("shell32.dll")]
    private static extern void DragAcceptFiles(IntPtr hWnd, bool fAccept);

    private const uint WM_DROPFILES = 0x0233;
    private const uint WM_COPYDATA = 0x004A;
    private const uint WM_COPYGLOBALDATA = 0x0049;
    private const uint MSGFLT_ALLOW = 1;

    public MainWindow()
    {
        InitializeComponent();
        GridGames.ItemsSource = _games;

        HistoryManager.Load();
        GridHistory.ItemsSource = HistoryManager.Items;

        // Init System Tray
        InitSystemTray();

        // Init themes (9 Themes, MIDNIGHT default)
        foreach (var theme in ThemeManager.Themes)
        {
            CmbTheme.Items.Add(theme.DisplayName);
        }
        CmbTheme.SelectedIndex = 0;

        // Init accents (13 Accents, Violet default)
        foreach (var acc in ThemeManager.Accents)
        {
            CmbAccent.Items.Add(acc.Name);
        }
        CmbAccent.SelectedIndex = 0;

        // Init fonts (10 Fonts, Inter Variable default)
        foreach (var font in ThemeManager.Fonts)
        {
            CmbFont.Items.Add(font.DisplayName);
        }
        CmbFont.SelectedIndex = 0;

        // Init languages (11 Languages, OS default)
        string sysLang = LocalizationManager.DetectSystemLanguage();
        int langIdx = 0;
        for (int i = 0; i < LocalizationManager.Languages.Length; i++)
        {
            var l = LocalizationManager.Languages[i];
            CmbLang.Items.Add(l.DisplayName);
            if (l.Code == sysLang)
            {
                langIdx = i;
            }
        }
        LocalizationManager.CurrentLanguage = sysLang;
        CmbLang.SelectedIndex = langIdx;

        UpdateLocalization();
        UpdateStats();
        UpdateHistoryStats();
        StateChanged += MainWindow_StateChanged;

        // Background automatic check for updates from GitHub (silent, non-blocking)
        Loaded += (s, e) =>
        {
            _ = Task.Run(async () =>
            {
                await Task.Delay(2500);
                await UpdateManager.CheckForUpdatesAsync(this, silent: true);
            });
        };
    }

    private void InitSystemTray()
    {
        try
        {
            _notifyIcon = new System.Windows.Forms.NotifyIcon
            {
                Text = "STORM DSI DECRYPTOR 1.1.9",
                Visible = true
            };

            try
            {
                var iconUri = new Uri("pack://application:,,,/AppIcon.ico");
                var streamInfo = Application.GetResourceStream(iconUri);
                if (streamInfo != null)
                {
                    _notifyIcon.Icon = new System.Drawing.Icon(streamInfo.Stream);
                }
            }
            catch
            {
                if (File.Exists("AppIcon.ico"))
                    _notifyIcon.Icon = new System.Drawing.Icon("AppIcon.ico");
                else
                    _notifyIcon.Icon = System.Drawing.SystemIcons.Application;
            }

            UpdateTrayMenu();

            _notifyIcon.DoubleClick += (s, e) => RestoreFromTray();
            _notifyIcon.MouseClick += (s, e) =>
            {
                if (e.Button == System.Windows.Forms.MouseButtons.Left)
                {
                    RestoreFromTray();
                }
            };
        }
        catch (Exception ex)
        {
            Debug.WriteLine($"[InitSystemTray Error]: {ex.Message}");
        }
    }

    private void UpdateTrayMenu()
    {
        if (_notifyIcon == null) return;
        var menuFont = System.Drawing.SystemFonts.MenuFont ?? new System.Drawing.Font("Segoe UI", 9f, System.Drawing.FontStyle.Regular);
        var boldMenuFont = new System.Drawing.Font(menuFont, System.Drawing.FontStyle.Bold);

        var menu = new System.Windows.Forms.ContextMenuStrip
        {
            BackColor = System.Drawing.Color.FromArgb(20, 16, 38),
            ForeColor = System.Drawing.Color.White,
            ShowImageMargin = false,
            Font = menuFont,
            Renderer = new StormDarkMenuRenderer(System.Drawing.Color.FromArgb(139, 92, 246))
        };

        var itemShow = new System.Windows.Forms.ToolStripMenuItem(LocalizationManager.Get("TrayShow"), null, (s, e) => RestoreFromTray())
        {
            Font = boldMenuFont
        };
        var itemCheckUpdates = new System.Windows.Forms.ToolStripMenuItem(LocalizationManager.Get("TrayCheckUpdates"), null, async (s, e) =>
        {
            RestoreFromTray();
            await UpdateManager.CheckForUpdatesAsync(this, silent: false);
        })
        {
            Font = menuFont
        };
        var itemAbout = new System.Windows.Forms.ToolStripMenuItem(LocalizationManager.Get("TrayAbout"), null, (s, e) => ShowAbout())
        {
            Font = menuFont
        };
        var itemExit = new System.Windows.Forms.ToolStripMenuItem(LocalizationManager.Get("TrayExit"), null, (s, e) => QuitApplication())
        {
            Font = menuFont
        };

        menu.Items.Add(itemShow);
        menu.Items.Add(itemCheckUpdates);
        menu.Items.Add(itemAbout);
        menu.Items.Add(new System.Windows.Forms.ToolStripSeparator());
        menu.Items.Add(itemExit);

        _notifyIcon.ContextMenuStrip = menu;
    }

    public void RestoreFromTray()
    {
        Show();
        WindowState = WindowState.Normal;
        Activate();
    }

    private async void BtnCheckUpdates_Click(object sender, RoutedEventArgs e)
    {
        BtnCheckUpdates.IsEnabled = false;
        try
        {
            await UpdateManager.CheckForUpdatesAsync(this, silent: false);
        }
        finally
        {
            BtnCheckUpdates.IsEnabled = true;
        }
    }

    private void BtnAbout_Click(object sender, RoutedEventArgs e)
    {
        ShowAbout();
    }

    public void ShowAbout()
    {
        RestoreFromTray();
        StormMessageBox.Show(
            this,
            LocalizationManager.Get("AboutMsg"),
            LocalizationManager.Get("AboutTitle"),
            MessageBoxButton.OK,
            MessageBoxImage.Information);
    }

    public void QuitApplication()
    {
        _isQuittingFromTray = true;
        if (_notifyIcon != null)
        {
            _notifyIcon.Visible = false;
            _notifyIcon.Dispose();
            _notifyIcon = null;
        }
        Application.Current.Shutdown();
    }

    protected override void OnClosing(CancelEventArgs e)
    {
        // Enforce Close-to-Tray law: complete exit ONLY from tray context menu
        if (!_isQuittingFromTray)
        {
            e.Cancel = true;
            Hide();
            try
            {
                _notifyIcon?.ShowBalloonTip(
                    1500,
                    LocalizationManager.Get("TrayBalloonTitle"),
                    LocalizationManager.Get("TrayBalloonMsg"),
                    System.Windows.Forms.ToolTipIcon.Info);
            }
            catch { }
            return;
        }

        if (_notifyIcon != null)
        {
            _notifyIcon.Visible = false;
            _notifyIcon.Dispose();
            _notifyIcon = null;
        }
        base.OnClosing(e);
    }

    protected override void OnSourceInitialized(EventArgs e)
    {
        base.OnSourceInitialized(e);
        try
        {
            var hwnd = new WindowInteropHelper(this).Handle;
            ChangeWindowMessageFilterEx(hwnd, WM_DROPFILES, MSGFLT_ALLOW, IntPtr.Zero);
            ChangeWindowMessageFilterEx(hwnd, WM_COPYDATA, MSGFLT_ALLOW, IntPtr.Zero);
            ChangeWindowMessageFilterEx(hwnd, WM_COPYGLOBALDATA, MSGFLT_ALLOW, IntPtr.Zero);
            DragAcceptFiles(hwnd, true);

            var source = HwndSource.FromHwnd(hwnd);
            source?.AddHook(WndProc);
        }
        catch { }
    }

    private IntPtr WndProc(IntPtr hwnd, int msg, IntPtr wParam, IntPtr lParam, ref bool handled)
    {
        if (msg == (int)WM_DROPFILES)
        {
            IntPtr hDrop = wParam;
            try
            {
                if ((DateTime.UtcNow - _lastDropHandledTime).TotalMilliseconds < 500)
                {
                    handled = true;
                    return IntPtr.Zero;
                }

                uint count = DragQueryFile(hDrop, 0xFFFFFFFF, null, 0);
                var files = new List<string>();
                for (uint i = 0; i < count; i++)
                {
                    var sb = new System.Text.StringBuilder(1024);
                    if (DragQueryFile(hDrop, i, sb, 1024) > 0)
                    {
                        files.Add(sb.ToString());
                    }
                }

                if (files.Count > 0)
                {
                    Dispatcher.BeginInvoke(() =>
                    {
                        TabBtnQueue.IsChecked = true;
                        TabBtnQueue_Click(this, new RoutedEventArgs());
                        AddPaths(files.ToArray());
                    });
                }
            }
            catch (Exception ex)
            {
                Debug.WriteLine($"[WM_DROPFILES Error]: {ex.Message}");
            }
            finally
            {
                DragFinish(hDrop);
            }
            handled = true;
            return IntPtr.Zero;
        }

        return IntPtr.Zero;
    }

    private void UpdateLocalization()
    {
        TxtSubtitle.Text = LocalizationManager.Get("Subtitle");
        TxtDragDropHint.Text = LocalizationManager.Get("DragDropHint");

        BtnAddFiles.Content = LocalizationManager.Get("AddFiles");
        BtnAddFolder.Content = LocalizationManager.Get("AddFolder");
        BtnClear.Content = LocalizationManager.Get("ClearList");
        BtnDecrypt.Content = LocalizationManager.Get("DecryptAll");
        BtnOpenFolder.Content = LocalizationManager.Get("OpenFolder");

        BtnAddFiles.ToolTip = LocalizationManager.Get("ToolTipAddFiles");
        BtnAddFolder.ToolTip = LocalizationManager.Get("ToolTipAddFolder");
        BtnClear.ToolTip = LocalizationManager.Get("ToolTipClearList");
        BtnDecrypt.ToolTip = LocalizationManager.Get("ToolTipDecryptAll");
        BtnOpenFolder.ToolTip = LocalizationManager.Get("ToolTipOpenFolder");

        ChkCopy.Content = LocalizationManager.Get("ModeCopy");
        ChkInPlace.Content = LocalizationManager.Get("ModeInPlace");
        LblOutFolder.Text = LocalizationManager.Get("OutputFolderLabel");
        BtnBrowseOutFolder.Content = LocalizationManager.Get("BrowseFolder");
        BtnResetOutFolder.ToolTip = LocalizationManager.Get("ResetOutputFolderTooltip");

        if (string.IsNullOrWhiteSpace(_customOutputDir))
        {
            TxtOutFolder.Text = LocalizationManager.Get("OutputFolderDefault");
        }
        UpdateModeUI();

        LblTotalGames.Text = LocalizationManager.Get("TotalGames");
        LblEncrypted.Text = LocalizationManager.Get("EncryptedCount");
        LblDecrypted.Text = LocalizationManager.Get("DecryptedCount");
        LblTheme.Text = LocalizationManager.Get("ThemeLabel");
        LblLang.Text = LocalizationManager.Get("LangLabel");
        LblAccent.Text = LocalizationManager.Get("AccentLabel");
        LblFont.Text = LocalizationManager.Get("FontLabel");

        ColFileName.Header = LocalizationManager.Get("ColFileName");
        ColTitle.Header = LocalizationManager.Get("ColTitle");
        ColCode.Header = LocalizationManager.Get("ColCode");
        ColSize.Header = LocalizationManager.Get("ColSize");
        ColStatus.Header = LocalizationManager.Get("ColStatus");
        MenuDeleteSelected.Header = LocalizationManager.Get("MenuDeleteSelected");
        MenuClearAll.Header = LocalizationManager.Get("MenuClearAll");

        // History localization
        TxtTabQueue.Text = LocalizationManager.Get("TabQueue");
        TxtTabHistory.Text = LocalizationManager.Get("TabHistory");
        TxtHistoryEmpty.Text = LocalizationManager.Get("HistoryEmpty");
        BtnClearHistory.Content = LocalizationManager.Get("ClearHistory");
        BtnDeleteHistory.Content = LocalizationManager.Get("MenuDeleteSelected");
        BtnOpenHistoryFolder.Content = LocalizationManager.Get("ShowInExplorer");

        ColHistName.Header = LocalizationManager.Get("ColFileName");
        ColHistTitle.Header = LocalizationManager.Get("ColTitle");
        ColHistCode.Header = LocalizationManager.Get("ColCode");
        ColHistDate.Header = LocalizationManager.Get("ColProcessedAt");
        ColHistSize.Header = LocalizationManager.Get("ColSize");
        ColHistStatus.Header = LocalizationManager.Get("ColStatus");

        BtnCheckUpdates.Content = LocalizationManager.Get("BtnCheckUpdates") ?? "🔄 Обновления";
        BtnAbout.Content = LocalizationManager.Get("TrayAbout") ?? "ℹ️ О программе";

        UpdateTrayMenu();
    }

    private void UpdateStats()
    {
        TxtTotalCount.Text = _games.Count.ToString();
        TxtEncryptedCount.Text = _games.Count(g => g.IsEncrypted).ToString();
        TxtDecryptedCount.Text = _games.Count(g => !g.IsEncrypted).ToString();
        TxtTabQueueCount.Text = $" ({_games.Count})";

        bool hasItems = _games.Count > 0;
        EmptyHintPanel.Visibility = hasItems ? Visibility.Collapsed : Visibility.Visible;
        GridGames.Visibility = hasItems ? Visibility.Visible : Visibility.Collapsed;

        bool isCopy = ChkCopy.IsChecked == true;
        BtnDecrypt.IsEnabled = isCopy ? hasItems : _games.Any(g => g.IsEncrypted || g.NeedsCompatibilityPatch);
    }

    private void UpdateHistoryStats()
    {
        int count = HistoryManager.Items.Count;
        TxtHistTotalCount.Text = count.ToString();
        TxtHistSuccessCount.Text = HistoryManager.Items.Count(x =>
            x.Status.Contains("Успешно", StringComparison.OrdinalIgnoreCase) ||
            x.Status.Contains("Success", StringComparison.OrdinalIgnoreCase) ||
            x.Status.Contains("Erfolgreich", StringComparison.OrdinalIgnoreCase) ||
            x.Status.Contains("succès", StringComparison.OrdinalIgnoreCase) ||
            x.Status.Contains("成功", StringComparison.OrdinalIgnoreCase) ||
            x.Status.Contains("성공", StringComparison.OrdinalIgnoreCase) ||
            x.Status.Contains("éxito", StringComparison.OrdinalIgnoreCase) ||
            x.Status.Contains("successo", StringComparison.OrdinalIgnoreCase) ||
            x.Status.Contains("sucesso", StringComparison.OrdinalIgnoreCase)).ToString();
        TxtHistReadyCount.Text = count.ToString();
        TxtTabHistoryCount.Text = $" ({count})";

        bool hasHist = count > 0;
        EmptyHistoryHintPanel.Visibility = hasHist ? Visibility.Collapsed : Visibility.Visible;
        GridHistory.Visibility = hasHist ? Visibility.Visible : Visibility.Collapsed;
        BtnClearHistory.IsEnabled = hasHist;
        BtnDeleteHistory.IsEnabled = hasHist;
    }

    private void TabBtnQueue_Click(object sender, RoutedEventArgs e)
    {
        QueueViewPanel.Visibility = Visibility.Visible;
        QueueStatsPanel.Visibility = Visibility.Visible;
        QueueActionsPanel.Visibility = Visibility.Visible;

        HistoryViewPanel.Visibility = Visibility.Collapsed;
        HistoryStatsPanel.Visibility = Visibility.Collapsed;
        HistoryActionsPanel.Visibility = Visibility.Collapsed;

        UpdateStats();
    }

    private void TabBtnHistory_Click(object sender, RoutedEventArgs e)
    {
        QueueViewPanel.Visibility = Visibility.Collapsed;
        QueueStatsPanel.Visibility = Visibility.Collapsed;
        QueueActionsPanel.Visibility = Visibility.Collapsed;

        HistoryViewPanel.Visibility = Visibility.Visible;
        HistoryStatsPanel.Visibility = Visibility.Visible;
        HistoryActionsPanel.Visibility = Visibility.Visible;

        UpdateHistoryStats();
        StateChanged += MainWindow_StateChanged;
    }

    private void TitleBar_MouseLeftButtonDown(object sender, MouseButtonEventArgs e)
    {
        if (e.ClickCount == 2)
        {
            WindowState = WindowState == WindowState.Maximized ? WindowState.Normal : WindowState.Maximized;
        }
        else
        {
            DragMove();
        }
    }

    private void MainWindow_StateChanged(object? sender, EventArgs e)
    {
        if (WindowState == WindowState.Maximized)
        {
            IconMaximizePath.Data = (System.Windows.Media.Geometry)FindResource("IconRestore");
            BtnMaximize.ToolTip = LocalizationManager.Get("BtnRestoreTooltip") ?? "Восстановить окно";
        }
        else
        {
            IconMaximizePath.Data = (System.Windows.Media.Geometry)FindResource("IconMaximize");
            BtnMaximize.ToolTip = LocalizationManager.Get("BtnMaximizeTooltip") ?? "Развернуть на весь экран";
        }
    }

    private void BtnMinimize_Click(object sender, RoutedEventArgs e) => WindowState = WindowState.Minimized;
    private void BtnMaximize_Click(object sender, RoutedEventArgs e) => WindowState = WindowState == WindowState.Maximized ? WindowState.Normal : WindowState.Maximized;
    private void BtnClose_Click(object sender, RoutedEventArgs e)
    {
        // Minimize to tray on close button click
        Hide();
        try
        {
            _notifyIcon?.ShowBalloonTip(
                1500,
                LocalizationManager.Get("TrayBalloonTitle"),
                LocalizationManager.Get("TrayBalloonMsg"),
                System.Windows.Forms.ToolTipIcon.Info);
        }
        catch { }
    }

    // --- Mode Selection & Output Folder ---
    private void ChkCopy_Click(object sender, RoutedEventArgs e)
    {
        ChkCopy.IsChecked = true;
        ChkInPlace.IsChecked = false;
        UpdateModeUI();
    }

    private void ChkInPlace_Click(object sender, RoutedEventArgs e)
    {
        ChkInPlace.IsChecked = true;
        ChkCopy.IsChecked = false;
        UpdateModeUI();
    }

    private void UpdateModeUI()
    {
        bool isCopy = ChkCopy.IsChecked == true;
        BorderOutFolder.IsEnabled = isCopy;
        BtnBrowseOutFolder.IsEnabled = isCopy;
        BtnResetOutFolder.IsEnabled = isCopy;
        BorderOutFolder.Opacity = isCopy ? 1.0 : 0.45;
        LblOutFolder.Opacity = isCopy ? 1.0 : 0.45;
        UpdateStats();
    }

    private void BorderOutFolder_MouseDown(object sender, MouseButtonEventArgs e)
    {
        if (ChkCopy.IsChecked == true)
        {
            BtnBrowseOutFolder_Click(sender, e);
        }
    }

    private void BtnBrowseOutFolder_Click(object sender, RoutedEventArgs e)
    {
        var dlg = new OpenFolderDialog
        {
            Title = LocalizationManager.Get("SelectOutputFolderTitle")
        };
        if (dlg.ShowDialog() == true && !string.IsNullOrWhiteSpace(dlg.FolderName))
        {
            _customOutputDir = dlg.FolderName;
            TxtOutFolder.Text = _customOutputDir;
            TxtOutFolder.Foreground = (System.Windows.Media.Brush)FindResource("ThemeTextPrimary");
        }
    }

    private void BtnResetOutFolder_Click(object sender, RoutedEventArgs e)
    {
        _customOutputDir = null;
        TxtOutFolder.Text = LocalizationManager.Get("OutputFolderDefault");
        TxtOutFolder.Foreground = (System.Windows.Media.Brush)FindResource("ThemeTextSecondary");
    }

    private void BorderOutFolder_DragEnter(object sender, DragEventArgs e)
    {
        if (ChkCopy.IsChecked == true && e.Data.GetDataPresent(DataFormats.FileDrop))
            e.Effects = DragDropEffects.Copy;
        else
            e.Effects = DragDropEffects.None;
        e.Handled = true;
    }

    private void BorderOutFolder_DragOver(object sender, DragEventArgs e)
    {
        if (ChkCopy.IsChecked == true && e.Data.GetDataPresent(DataFormats.FileDrop))
            e.Effects = DragDropEffects.Copy;
        else
            e.Effects = DragDropEffects.None;
        e.Handled = true;
    }

    private void BorderOutFolder_DragLeave(object sender, DragEventArgs e) => e.Handled = true;

    private void BorderOutFolder_Drop(object sender, DragEventArgs e)
    {
        e.Handled = true;
        if (ChkCopy.IsChecked != true) return;
        if (e.Data.GetDataPresent(DataFormats.FileDrop))
        {
            var dropped = (string[])e.Data.GetData(DataFormats.FileDrop);
            if (dropped != null && dropped.Length > 0)
            {
                string path = dropped[0];
                if (File.Exists(path))
                {
                    path = Path.GetDirectoryName(path) ?? path;
                }
                if (Directory.Exists(path))
                {
                    _customOutputDir = path;
                    TxtOutFolder.Text = _customOutputDir;
                    TxtOutFolder.Foreground = (System.Windows.Media.Brush)FindResource("ThemeTextPrimary");
                    TxtStatusLog.Text = $"Папка сохранения: {_customOutputDir}";
                }
            }
        }
    }

    // --- Drag & Drop for Main Window & DropZone ---
    private void Window_DragEnter(object sender, DragEventArgs e)
    {
        if (e.Data.GetDataPresent(DataFormats.FileDrop)) e.Effects = DragDropEffects.Copy;
        else e.Effects = DragDropEffects.None;
        e.Handled = true;
    }

    private void Window_DragOver(object sender, DragEventArgs e)
    {
        if (e.Data.GetDataPresent(DataFormats.FileDrop)) e.Effects = DragDropEffects.Copy;
        else e.Effects = DragDropEffects.None;
        e.Handled = true;
    }

    private void Window_DragLeave(object sender, DragEventArgs e) => e.Handled = true;

    private void Window_Drop(object sender, DragEventArgs e)
    {
        e.Handled = true;
        if (e.Data.GetDataPresent(DataFormats.FileDrop))
        {
            var files = (string[])e.Data.GetData(DataFormats.FileDrop);
            if (files != null && files.Length > 0)
            {
                TabBtnQueue.IsChecked = true;
                TabBtnQueue_Click(this, new RoutedEventArgs());
                AddPaths(files);
            }
        }
    }

    private void Window_PreviewDragEnter(object sender, DragEventArgs e) => Window_DragEnter(sender, e);
    private void Window_PreviewDragOver(object sender, DragEventArgs e) => Window_DragOver(sender, e);
    private void Window_PreviewDrop(object sender, DragEventArgs e) => Window_Drop(sender, e);

    private void DropZone_MouseDown(object sender, MouseButtonEventArgs e)
    {
        if (_games.Count == 0)
        {
            BtnAddFiles_Click(sender, e);
        }
    }

    // --- File & Folder Picker ---
    private void BtnAddFiles_Click(object sender, RoutedEventArgs e)
    {
        var dlg = new OpenFileDialog
        {
            Filter = "Все поддерживаемые форматы (*.nds;*.dsi;*.app;*.zip;*.7z;*.rar;*)|*.nds;*.dsi;*.app;*.zip;*.7z;*.rar|Образы Nintendo DS / DSi (*.nds;*.dsi;*.app)|*.nds;*.dsi;*.app|Архивы (*.zip;*.7z;*.rar;*.tar;*.gz)|*.zip;*.7z;*.rar;*.tar;*.gz|Все файлы (*.*)|*.*",
            Multiselect = true,
            Title = "Выберите образы игр или архивы для расшифровки"
        };

        if (dlg.ShowDialog() == true)
        {
            AddPaths(dlg.FileNames);
        }
    }

    private void BtnAddFolder_Click(object sender, RoutedEventArgs e)
    {
        var dlg = new OpenFolderDialog
        {
            Title = "Выберите папку с играми для сканирования"
        };

        if (dlg.ShowDialog() == true && !string.IsNullOrWhiteSpace(dlg.FolderName))
        {
            AddPaths(new[] { dlg.FolderName });
        }
    }

    private static bool IsRomCandidate(string filePath)
    {
        try
        {
            var fi = new FileInfo(filePath);
            if (fi.Length < 0x200) return false;

            string ext = fi.Extension.ToLowerInvariant();
            if (ext is ".nds" or ".dsi" or ".app") return true;

            // Check if name is numeric (e.g. 00000000) or no extension or numeric extension (.0, .1)
            if (string.IsNullOrEmpty(ext) || fi.Name.All(char.IsDigit) || (ext.Length > 1 && ext[1..].All(char.IsDigit)))
            {
                byte[] header = ReadFileHeader(filePath);
                return DsiDecryptorEngine.IsRomHeader(header);
            }
        }
        catch { }
        return false;
    }

    private static byte[] ReadFileHeader(string filePath)
    {
        try
        {
            using var fs = new FileStream(filePath, FileMode.Open, FileAccess.Read, FileShare.ReadWrite);
            byte[] buf = new byte[0x400];
            int read = fs.Read(buf, 0, 0x400);
            return buf;
        }
        catch
        {
            return Array.Empty<byte>();
        }
    }

    private async void AddPaths(string[] paths)
    {
        if (_isScanning) return;
        _isScanning = true;
        _lastDropHandledTime = DateTime.UtcNow;

        TxtStatusLog.Text = "Поиск и инспекция образов...";
        int added = 0;

        await Task.Run(() =>
        {
            var itemsToAdd = new List<RomItem>();

            void ProcessFile(string filePath)
            {
                if (ArchiveManager.IsArchiveFile(filePath))
                {
                    try
                    {
                        var roms = ArchiveManager.FindRomsInArchive(filePath);
                        foreach (var r in roms)
                        {
                            var item = new RomItem
                            {
                                FilePath = filePath,
                                FileName = $"{Path.GetFileName(filePath)} [{r.EntryName}]",
                                GameTitle = string.IsNullOrWhiteSpace(r.RomInfo.GameTitle) ? Path.GetFileNameWithoutExtension(filePath) : r.RomInfo.GameTitle,
                                GameCode = r.RomInfo.GameCode,
                                FileSize = r.UncompressedSize,
                                IsEncrypted = r.RomInfo.IsEncrypted,
                                IsDsiRom = r.RomInfo.IsDsiRom,
                                NeedsCompatibilityPatch = r.RomInfo.NeedsCompatibilityPatch,
                                IsFromArchive = true,
                                ArchivePath = filePath,
                                ArchiveEntryName = r.EntryName,
                                SuggestedFileName = r.SuggestedFileName,
                                Status = r.RomInfo.IsEncrypted
                                    ? LocalizationManager.Get("StatusEncrypted")
                                    : (r.RomInfo.NeedsCompatibilityPatch
                                        ? LocalizationManager.Get("StatusNeedsPatch")
                                        : (r.RomInfo.IsDsiRom ? LocalizationManager.Get("StatusDecrypted") : LocalizationManager.Get("StatusNotDsi")))
                            };
                            itemsToAdd.Add(item);
                        }
                    }
                    catch (Exception ex)
                    {
                        Debug.WriteLine($"[Archive scan error {filePath}]: {ex.Message}");
                    }
                    return;
                }

                // If not archive: check if direct ROM candidate or generic DSiWare content (e.g. 00000000)
                if (IsRomCandidate(filePath))
                {
                    var info = DsiDecryptorEngine.InspectRom(filePath);
                    if (info.IsDsiRom || DsiDecryptorEngine.IsRomHeader(ReadFileHeader(filePath)))
                    {
                        string fileName = Path.GetFileName(filePath);
                        string suggestedName = fileName;
                        string parentDir = Path.GetFileName(Path.GetDirectoryName(filePath) ?? "");

                        // If generic numeric name (e.g. 00000000), use parent directory name if available
                        if ((fileName.All(char.IsDigit) || string.IsNullOrEmpty(Path.GetExtension(filePath))) && !string.IsNullOrWhiteSpace(parentDir))
                        {
                            suggestedName = $"{parentDir}.nds";
                            fileName = $"{parentDir} ({fileName})";
                        }
                        else if (!fileName.EndsWith(".nds", StringComparison.OrdinalIgnoreCase) &&
                                 !fileName.EndsWith(".dsi", StringComparison.OrdinalIgnoreCase) &&
                                 !fileName.EndsWith(".app", StringComparison.OrdinalIgnoreCase))
                        {
                            suggestedName = $"{fileName}.nds";
                        }

                        var item = new RomItem
                        {
                            FilePath = filePath,
                            FileName = fileName,
                            SuggestedFileName = suggestedName,
                            GameTitle = string.IsNullOrWhiteSpace(info.GameTitle) ? Path.GetFileNameWithoutExtension(filePath) : info.GameTitle,
                            GameCode = info.GameCode,
                            FileSize = info.FileSize,
                            IsEncrypted = info.IsEncrypted,
                            IsDsiRom = info.IsDsiRom,
                            NeedsCompatibilityPatch = info.NeedsCompatibilityPatch,
                            Status = info.IsEncrypted
                                ? LocalizationManager.Get("StatusEncrypted")
                                : (info.NeedsCompatibilityPatch
                                    ? LocalizationManager.Get("StatusNeedsPatch")
                                    : (info.IsDsiRom ? LocalizationManager.Get("StatusDecrypted") : LocalizationManager.Get("StatusNotDsi")))
                        };
                        itemsToAdd.Add(item);
                    }
                }
            }

            foreach (var p in paths)
            {
                if (File.Exists(p))
                {
                    ProcessFile(p);
                }
                else if (Directory.Exists(p))
                {
                    _lastFolderPath = p;
                    try
                    {
                        foreach (var f in Directory.EnumerateFiles(p, "*.*", SearchOption.AllDirectories))
                        {
                            ProcessFile(f);
                        }
                    }
                    catch (Exception ex)
                    {
                        Debug.WriteLine($"[Dir Enum Error]: {ex.Message}");
                    }
                }
            }

            Dispatcher.Invoke(() =>
            {
                foreach (var it in itemsToAdd)
                {
                    bool exists = _games.Any(g =>
                        (it.IsFromArchive && g.IsFromArchive && g.ArchivePath.Equals(it.ArchivePath, StringComparison.OrdinalIgnoreCase) && g.ArchiveEntryName.Equals(it.ArchiveEntryName, StringComparison.OrdinalIgnoreCase)) ||
                        (!it.IsFromArchive && !g.IsFromArchive && g.FilePath.Equals(it.FilePath, StringComparison.OrdinalIgnoreCase)));

                    if (!exists)
                    {
                        _games.Add(it);
                        added++;
                    }
                }
            });
        });

        _isScanning = false;
        UpdateStats();
        TxtStatusLog.Text = added > 0 ? $"Добавлено {added} игр. Всего в списке: {_games.Count}." : "Новых поддерживаемых игр не найдено.";
    }

    // --- Decryption & Processing ---
    private async void BtnDecrypt_Click(object sender, RoutedEventArgs e)
    {
        if (_games.Count == 0) return;

        bool inPlace = ChkInPlace.IsChecked == true;
        var gamesToProcess = new List<RomItem>();
        DuplicateAction? appliedToAll = null;

        foreach (var item in _games)
        {
            var previous = HistoryManager.Find(item.FilePath);
            if (previous != null)
            {
                DuplicateAction decision;
                if (appliedToAll.HasValue)
                {
                    decision = appliedToAll.Value;
                }
                else
                {
                    var dlg = new DuplicatePromptDialog(this, item.GameTitle, item.FileName, previous.ProcessedAtFormatted);
                    dlg.ShowDialog();
                    decision = dlg.Decision;
                    if (dlg.ApplyToAll)
                    {
                        appliedToAll = decision;
                    }
                }

                if (decision == DuplicateAction.Skip)
                {
                    item.Status = $"{LocalizationManager.Get("BtnSkip")} ({previous.ProcessedAtFormatted})";
                    continue;
                }
            }

            gamesToProcess.Add(item);
        }

        if (gamesToProcess.Count == 0)
        {
            UpdateStats();
            TxtStatusLog.Text = "Все повторно добавленные игры пропущены.";
            return;
        }

        if (!inPlace && (string.IsNullOrWhiteSpace(_customOutputDir) || !Directory.Exists(_customOutputDir)))
        {
            var dlg = new OpenFolderDialog
            {
                Title = LocalizationManager.Get("SelectOutputFolderTitle")
            };
            if (dlg.ShowDialog() == true && !string.IsNullOrWhiteSpace(dlg.FolderName))
            {
                _customOutputDir = dlg.FolderName;
                TxtOutFolder.Text = _customOutputDir;
                TxtOutFolder.Foreground = (System.Windows.Media.Brush)FindResource("ThemeTextPrimary");
            }
            else
            {
                TxtStatusLog.Text = "Операция отменена: выберите папку для сохранения копий.";
                return;
            }
        }

        BtnDecrypt.IsEnabled = false;
        BtnAddFiles.IsEnabled = false;
        BtnAddFolder.IsEnabled = false;
        BtnClear.IsEnabled = false;

        ProgBar.Value = 0;
        ProgBar.Maximum = gamesToProcess.Count;

        int processed = 0;
        var totalSw = Stopwatch.StartNew();

        try
        {
            foreach (var item in gamesToProcess)
            {
                string targetDir = (!string.IsNullOrWhiteSpace(_customOutputDir) && Directory.Exists(_customOutputDir))
                    ? _customOutputDir
                    : (Path.GetDirectoryName(item.FilePath) ?? "");

                string outFileName = !string.IsNullOrEmpty(item.SuggestedFileName)
                    ? item.SuggestedFileName
                    : Path.GetFileName(item.FilePath);

                if (!outFileName.EndsWith(".nds", StringComparison.OrdinalIgnoreCase) &&
                    !outFileName.EndsWith(".dsi", StringComparison.OrdinalIgnoreCase) &&
                    !outFileName.EndsWith(".app", StringComparison.OrdinalIgnoreCase))
                {
                    outFileName += ".nds";
                }

                string outPath = (inPlace && !item.IsFromArchive && item.FilePath.EndsWith(".nds", StringComparison.OrdinalIgnoreCase))
                    ? item.FilePath
                    : Path.Combine(targetDir, outFileName);

                bool success = false;
                long elapsedMs = 0;
                bool wasEncrypted = item.IsEncrypted;
                bool neededPatch = item.NeedsCompatibilityPatch;

                if (item.IsFromArchive)
                {
                    item.Status = LocalizationManager.Get("StatusProcessing");
                    TxtStatusLog.Text = $"{item.Status} {outFileName}...";

                    await Task.Run(() =>
                    {
                        var sw = Stopwatch.StartNew();
                        try
                        {
                            success = ArchiveManager.ExtractAndDecrypt(item.ArchivePath, item.ArchiveEntryName, outPath);
                        }
                        catch (Exception ex)
                        {
                            Debug.WriteLine($"[Archive Decrypt Error {item.ArchivePath}]: {ex.Message}");
                            success = false;
                        }
                        sw.Stop();
                        elapsedMs = sw.ElapsedMilliseconds;
                    });
                }
                else if (item.IsEncrypted || item.NeedsCompatibilityPatch)
                {
                    string statusProg = item.IsEncrypted
                        ? LocalizationManager.Get("StatusProcessing")
                        : LocalizationManager.Get("StatusPatching");
                    item.Status = statusProg;
                    TxtStatusLog.Text = $"{statusProg} {outFileName}...";

                    await Task.Run(() =>
                    {
                        var sw = Stopwatch.StartNew();
                        try
                        {
                            success = DsiDecryptorEngine.DecryptFile(item.FilePath, outPath);
                        }
                        catch (Exception ex)
                        {
                            Debug.WriteLine($"[Decrypt Error {item.FilePath}]: {ex.Message}");
                            success = false;
                        }
                        sw.Stop();
                        elapsedMs = sw.ElapsedMilliseconds;
                    });
                }
                else
                {
                    item.Status = LocalizationManager.Get("StatusCopying");
                    TxtStatusLog.Text = $"Копирование: {outFileName}...";

                    await Task.Run(() =>
                    {
                        var sw = Stopwatch.StartNew();
                        try
                        {
                            if (!string.Equals(Path.GetFullPath(item.FilePath), Path.GetFullPath(outPath), StringComparison.OrdinalIgnoreCase))
                            {
                                var dir = Path.GetDirectoryName(outPath);
                                if (!string.IsNullOrEmpty(dir)) Directory.CreateDirectory(dir);
                                File.Copy(item.FilePath, outPath, true);
                            }
                            success = true;
                        }
                        catch (Exception ex)
                        {
                            Debug.WriteLine($"Error copying file: {ex.Message}");
                            success = false;
                        }
                        sw.Stop();
                        elapsedMs = sw.ElapsedMilliseconds;
                    });
                }

                if (success)
                {
                    item.IsEncrypted = false;
                    item.NeedsCompatibilityPatch = false;
                    item.IsSuccess = true;
                    string statusText = wasEncrypted
                        ? LocalizationManager.Get("StatusSuccess")
                        : (neededPatch ? LocalizationManager.Get("StatusPatched") : LocalizationManager.Get("StatusCopied"));
                    item.Status = $"{statusText} ({elapsedMs} мс)";

                    // Record to persistent history
                    HistoryManager.Add(new HistoryItem
                    {
                        FilePath = item.FilePath,
                        FileName = outFileName,
                        GameTitle = item.GameTitle,
                        GameCode = item.GameCode,
                        FileSize = item.FileSize,
                        ProcessedAt = DateTime.Now,
                        Status = statusText,
                        ElapsedMs = elapsedMs,
                        OutPath = outPath
                    });
                }
                else
                {
                    item.Status = wasEncrypted
                        ? LocalizationManager.Get("StatusFailed")
                        : (neededPatch ? LocalizationManager.Get("StatusFailed") : LocalizationManager.Get("StatusCopyFailed"));
                }

                processed++;
                ProgBar.Value = processed;
            }
        }
        finally
        {
            totalSw.Stop();
            UpdateStats();
            UpdateHistoryStats();
        StateChanged += MainWindow_StateChanged;

            BtnDecrypt.IsEnabled = true;
            BtnAddFiles.IsEnabled = true;
            BtnAddFolder.IsEnabled = true;
            BtnClear.IsEnabled = true;
        }

        TxtStatusLog.Text = $"Обработано {processed} игр за {totalSw.ElapsedMilliseconds} мс!";
        StormMessageBox.Show(
            this,
            LocalizationManager.Get("AllDone"),
            LocalizationManager.Get("AppTitle"),
            MessageBoxButton.OK,
            MessageBoxImage.Information);

    }

    // --- Queue Management ---
    private void GridGames_PreviewKeyDown(object sender, KeyEventArgs e)
    {
        if (e.Key == Key.Delete)
        {
            DeleteSelectedGames();
            e.Handled = true;
        }
    }

    private void MenuDeleteSelected_Click(object sender, RoutedEventArgs e) => DeleteSelectedGames();
    private void MenuClearAll_Click(object sender, RoutedEventArgs e) => ClearAllGames();
    private void BtnClear_Click(object sender, RoutedEventArgs e) => ClearAllGames();

    private void DeleteSelectedGames()
    {
        var selected = GridGames.SelectedItems.Cast<RomItem>().ToList();
        if (selected.Count == 0 && GridGames.SelectedItem is RomItem item)
        {
            selected.Add(item);
        }
        if (selected.Count == 0) return;

        foreach (var game in selected)
        {
            _games.Remove(game);
        }
        UpdateStats();
        TxtStatusLog.Text = $"Удалено игр: {selected.Count}. В списке: {_games.Count}.";
    }

    private void ClearAllGames()
    {
        _games.Clear();
        ProgBar.Value = 0;
        UpdateStats();
        TxtStatusLog.Text = "Список очищен";
    }

    private void BtnOpenFolder_Click(object sender, RoutedEventArgs e)
    {
        string? target = null;
        if (ChkCopy.IsChecked == true && !string.IsNullOrWhiteSpace(_customOutputDir) && Directory.Exists(_customOutputDir))
        {
            target = _customOutputDir;
        }
        else
        {
            target = _lastFolderPath;
            if (string.IsNullOrEmpty(target) || !Directory.Exists(target))
            {
                if (_games.Count > 0)
                    target = Path.GetDirectoryName(_games[0].FilePath);
            }
        }

        if (!string.IsNullOrEmpty(target) && Directory.Exists(target))
        {
            Process.Start(new ProcessStartInfo("explorer.exe", target) { UseShellExecute = true });
        }
        else
        {
            StormMessageBox.Show(this, "Папка с играми пока не выбрана", "Информация", MessageBoxButton.OK, MessageBoxImage.Information);
        }
    }

    // --- History Management ---
    private void GridHistory_PreviewKeyDown(object sender, KeyEventArgs e)
    {
        if (e.Key == Key.Delete)
        {
            DeleteSelectedHistory();
            e.Handled = true;
        }
    }

    private void BtnDeleteHistory_Click(object sender, RoutedEventArgs e) => DeleteSelectedHistory();

    private void DeleteSelectedHistory()
    {
        var selected = GridHistory.SelectedItems.Cast<HistoryItem>().ToList();
        if (selected.Count == 0 && GridHistory.SelectedItem is HistoryItem item)
        {
            selected.Add(item);
        }
        if (selected.Count == 0) return;

        foreach (var h in selected)
        {
            HistoryManager.Remove(h);
        }
        UpdateHistoryStats();
        StateChanged += MainWindow_StateChanged;
        TxtStatusLog.Text = $"Удалено из истории: {selected.Count}. Всего: {HistoryManager.Items.Count}.";
    }

    private void BtnClearHistory_Click(object sender, RoutedEventArgs e)
    {
        if (HistoryManager.Items.Count == 0) return;

        bool? res = StormMessageBox.Show(
            this,
            LocalizationManager.Get("ConfirmClearHistory"),
            LocalizationManager.Get("ClearHistory"),
            MessageBoxButton.YesNo,
            MessageBoxImage.Question);

        if (res == true)
        {
            HistoryManager.Clear();
            UpdateHistoryStats();
        StateChanged += MainWindow_StateChanged;
            TxtStatusLog.Text = "История операций очищена";
        }
    }

    private void BtnOpenHistoryFolder_Click(object sender, RoutedEventArgs e)
    {
        string? target = null;
        if (GridHistory.SelectedItem is HistoryItem item && !string.IsNullOrEmpty(item.FilePath))
        {
            target = Path.GetDirectoryName(item.FilePath);
        }
        if (string.IsNullOrEmpty(target) || !Directory.Exists(target))
        {
            target = _lastFolderPath;
        }

        if (!string.IsNullOrEmpty(target) && Directory.Exists(target))
        {
            Process.Start(new ProcessStartInfo("explorer.exe", target) { UseShellExecute = true });
        }
        else
        {
            StormMessageBox.Show(this, "Папка недоступна", "Информация", MessageBoxButton.OK, MessageBoxImage.Information);
        }
    }

    // --- Settings, Themes & Accents ---
    private void CmbTheme_SelectionChanged(object sender, SelectionChangedEventArgs e)
    {
        if (CmbTheme.SelectedIndex >= 0 && CmbTheme.SelectedIndex < ThemeManager.Themes.Count)
        {
            ThemeManager.ApplyTheme(ThemeManager.Themes[CmbTheme.SelectedIndex].Name);
        }
    }

    private void CmbAccent_SelectionChanged(object sender, SelectionChangedEventArgs e)
    {
        if (CmbAccent.SelectedIndex >= 0 && CmbAccent.SelectedIndex < ThemeManager.Accents.Length)
        {
            ThemeManager.ApplyAccent(CmbAccent.SelectedIndex);
        }
    }

    private void CmbFont_SelectionChanged(object sender, SelectionChangedEventArgs e)
    {
        if (CmbFont.SelectedIndex >= 0 && CmbFont.SelectedIndex < ThemeManager.Fonts.Length)
        {
            ThemeManager.ApplyFont(CmbFont.SelectedIndex);
        }
    }

    private void CmbLang_SelectionChanged(object sender, SelectionChangedEventArgs e)
    {
        if (CmbLang.SelectedIndex >= 0 && CmbLang.SelectedIndex < LocalizationManager.Languages.Length)
        {
            LocalizationManager.CurrentLanguage = LocalizationManager.Languages[CmbLang.SelectedIndex].Code;
            UpdateLocalization();
            foreach (var item in _games)
            {
                var info = DsiDecryptorEngine.InspectRom(item.FilePath);
                item.Status = info.IsEncrypted
                    ? LocalizationManager.Get("StatusEncrypted")
                    : (info.NeedsCompatibilityPatch
                        ? LocalizationManager.Get("StatusNeedsPatch")
                        : (info.IsDsiRom ? LocalizationManager.Get("StatusDecrypted") : LocalizationManager.Get("StatusNotDsi")));
            }
        }
    }
}

public class StormDarkMenuRenderer : System.Windows.Forms.ToolStripProfessionalRenderer
{
    public StormDarkMenuRenderer(System.Drawing.Color accentColor) : base(new StormDarkColorTable(accentColor)) { }
    protected override void OnRenderItemText(System.Windows.Forms.ToolStripItemTextRenderEventArgs e)
    {
        e.TextColor = e.Item.Selected ? System.Drawing.Color.White : System.Drawing.Color.FromArgb(240, 240, 245);
        base.OnRenderItemText(e);
    }
}

public class StormDarkColorTable : System.Windows.Forms.ProfessionalColorTable
{
    private readonly System.Drawing.Color _accent;
    public StormDarkColorTable(System.Drawing.Color accent) => _accent = accent;
    public override System.Drawing.Color ToolStripDropDownBackground => System.Drawing.Color.FromArgb(20, 16, 38);
    public override System.Drawing.Color MenuBorder => _accent;
    public override System.Drawing.Color MenuItemBorder => System.Drawing.Color.Transparent;
    public override System.Drawing.Color MenuItemSelected => System.Drawing.Color.FromArgb(46, 38, 82);
    public override System.Drawing.Color MenuItemSelectedGradientBegin => System.Drawing.Color.FromArgb(46, 38, 82);
    public override System.Drawing.Color MenuItemSelectedGradientEnd => System.Drawing.Color.FromArgb(46, 38, 82);
    public override System.Drawing.Color ImageMarginGradientBegin => System.Drawing.Color.FromArgb(20, 16, 38);
    public override System.Drawing.Color ImageMarginGradientMiddle => System.Drawing.Color.FromArgb(20, 16, 38);
    public override System.Drawing.Color ImageMarginGradientEnd => System.Drawing.Color.FromArgb(20, 16, 38);
    public override System.Drawing.Color SeparatorDark => System.Drawing.Color.FromArgb(50, 45, 80);
    public override System.Drawing.Color SeparatorLight => System.Drawing.Color.Transparent;
}
