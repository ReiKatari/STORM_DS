using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
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

        // Init themes
        foreach (var theme in ThemeManager.Themes)
        {
            CmbTheme.Items.Add(theme.DisplayName);
        }
        CmbTheme.SelectedIndex = 0;

        // Init languages
        CmbLang.Items.Add("Русский");
        CmbLang.Items.Add("English");
        CmbLang.Items.Add("Deutsch");
        CmbLang.Items.Add("Français");
        CmbLang.Items.Add("中文");
        CmbLang.Items.Add("日本語");
        CmbLang.SelectedIndex = 0;

        UpdateLocalization();
        UpdateStats();
        UpdateHistoryStats();
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
        BtnDecrypt.Content = LocalizationManager.Get("DecryptAll");
        BtnClear.Content = LocalizationManager.Get("ClearList");
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
        ColHistFileName.Header = LocalizationManager.Get("ColFileName");
        ColHistTitle.Header = LocalizationManager.Get("ColTitle");
        ColHistCode.Header = LocalizationManager.Get("ColCode");
        ColHistDate.Header = LocalizationManager.Get("ColProcessedAt");
        ColHistSize.Header = LocalizationManager.Get("ColSize");
        ColHistStatus.Header = LocalizationManager.Get("ColStatus");
        MenuHistDelete.Header = LocalizationManager.Get("MenuDeleteSelected");
        MenuHistOpen.Header = LocalizationManager.Get("ShowInExplorer");
        MenuHistClearAll.Header = LocalizationManager.Get("ClearHistory");
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
            x.Status.Contains("成功", StringComparison.OrdinalIgnoreCase)).ToString();
        TxtHistReadyCount.Text = count.ToString();
        TxtTabHistoryCount.Text = $" ({count})";

        bool hasHist = count > 0;
        EmptyHistoryPanel.Visibility = hasHist ? Visibility.Collapsed : Visibility.Visible;
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

    private void BtnMinimize_Click(object sender, RoutedEventArgs e) => WindowState = WindowState.Minimized;
    private void BtnMaximize_Click(object sender, RoutedEventArgs e) => WindowState = WindowState == WindowState.Maximized ? WindowState.Normal : WindowState.Maximized;
    private void BtnClose_Click(object sender, RoutedEventArgs e) => Close();

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
        LblOutFolder.Opacity = isCopy ? 1.0 : 0.4;
        BorderOutFolder.IsEnabled = isCopy;
        BorderOutFolder.Opacity = isCopy ? 1.0 : 0.4;
        TxtOutFolder.IsEnabled = isCopy;
        TxtOutFolder.Opacity = isCopy ? 1.0 : 0.4;
        BtnBrowseOutFolder.IsEnabled = isCopy;
        BtnBrowseOutFolder.Opacity = isCopy ? 1.0 : 0.4;
        BtnResetOutFolder.IsEnabled = isCopy;
        BtnResetOutFolder.Opacity = isCopy ? 1.0 : 0.4;
        UpdateStats();
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

    private void BorderOutFolder_MouseDown(object sender, MouseButtonEventArgs e)
    {
        if (ChkCopy.IsChecked != true)
        {
            ChkCopy.IsChecked = true;
            ChkInPlace.IsChecked = false;
            UpdateModeUI();
        }
        BtnBrowseOutFolder_Click(sender, e);
    }

    private void BorderOutFolder_DragEnter(object sender, DragEventArgs e) => HandleFolderDragOver(e);
    private void BorderOutFolder_DragOver(object sender, DragEventArgs e) => HandleFolderDragOver(e);

    private void HandleFolderDragOver(DragEventArgs e)
    {
        try
        {
            if (e.Data.GetDataPresent(DataFormats.FileDrop) || e.Data.GetDataPresent("FileDrop") ||
                e.Data.GetDataPresent("FileNameW") || e.Data.GetDataPresent("FileName"))
            {
                e.Effects = DragDropEffects.Copy;
                BorderOutFolder.BorderBrush = (System.Windows.Media.Brush)FindResource("ThemeAccent");
                e.Handled = true;
                return;
            }
        }
        catch { }
        e.Effects = DragDropEffects.None;
        e.Handled = true;
    }

    private void BorderOutFolder_DragLeave(object sender, DragEventArgs e)
    {
        BorderOutFolder.BorderBrush = (System.Windows.Media.Brush)FindResource("ThemeCardBorder");
        e.Handled = true;
    }

    private void BorderOutFolder_Drop(object sender, DragEventArgs e)
    {
        BorderOutFolder.BorderBrush = (System.Windows.Media.Brush)FindResource("ThemeCardBorder");
        HandleOutputFolderDrop(e);
        e.Handled = true;
    }

    private void HandleOutputFolderDrop(DragEventArgs e)
    {
        try
        {
            string[]? items = ExtractDroppedPaths(e.Data);
            if (items != null && items.Length > 0)
            {
                string target = items[0];
                string? folder = null;
                if (Directory.Exists(target))
                {
                    folder = target;
                }
                else if (File.Exists(target))
                {
                    folder = Path.GetDirectoryName(target);
                }

                if (!string.IsNullOrEmpty(folder) && Directory.Exists(folder))
                {
                    _customOutputDir = folder;
                    TxtOutFolder.Text = folder;
                    TxtOutFolder.Foreground = (System.Windows.Media.Brush)FindResource("ThemeTextPrimary");

                    ChkCopy.IsChecked = true;
                    ChkInPlace.IsChecked = false;
                    UpdateModeUI();

                    TxtStatusLog.Text = $"Папка сохранения установлена: {folder}";
                }
            }
        }
        catch (Exception ex)
        {
            Debug.WriteLine($"[OutputFolderDrop Exception]: {ex.Message}");
        }
    }

    // --- Drag & Drop (Crash-Proof, Universal OLE & Tunneling Standard) ---
    private void Window_DragEnter(object sender, DragEventArgs e) => HandleDragOver(e);
    private void Window_DragOver(object sender, DragEventArgs e) => HandleDragOver(e);
    private void Window_DragLeave(object sender, DragEventArgs e)
    {
        if (BorderOutFolder != null)
        {
            BorderOutFolder.BorderBrush = (System.Windows.Media.Brush)FindResource("ThemeCardBorder");
        }
    }
    private void Window_Drop(object sender, DragEventArgs e) => HandleDrop(e);

    private void Window_PreviewDragEnter(object sender, DragEventArgs e) => HandleDragOver(e);
    private void Window_PreviewDragOver(object sender, DragEventArgs e) => HandleDragOver(e);
    private void Window_PreviewDrop(object sender, DragEventArgs e) => HandleDrop(e);

    private void HandleDragOver(DragEventArgs e)
    {
        try
        {
            if (BorderOutFolder != null && BorderOutFolder.IsVisible)
            {
                Point pt = e.GetPosition(BorderOutFolder);
                if (pt.X >= 0 && pt.X <= BorderOutFolder.ActualWidth && pt.Y >= 0 && pt.Y <= BorderOutFolder.ActualHeight)
                {
                    BorderOutFolder.BorderBrush = (System.Windows.Media.Brush)FindResource("ThemeAccent");
                }
                else
                {
                    BorderOutFolder.BorderBrush = (System.Windows.Media.Brush)FindResource("ThemeCardBorder");
                }
            }

            if (e.Data.GetDataPresent(DataFormats.FileDrop) || e.Data.GetDataPresent("FileDrop") ||
                e.Data.GetDataPresent("FileNameW") || e.Data.GetDataPresent("FileName"))
            {
                e.Effects = DragDropEffects.Copy;
                e.Handled = true;
                return;
            }
        }
        catch { }
        e.Effects = DragDropEffects.None;
        e.Handled = true;
    }

    private void HandleDrop(DragEventArgs e)
    {
        try
        {
            e.Handled = true;

            if (BorderOutFolder != null)
            {
                BorderOutFolder.BorderBrush = (System.Windows.Media.Brush)FindResource("ThemeCardBorder");
            }

            // Check if drop occurred over the output folder selection control
            if (BorderOutFolder != null && BorderOutFolder.IsVisible)
            {
                Point pt = e.GetPosition(BorderOutFolder);
                if (pt.X >= 0 && pt.X <= BorderOutFolder.ActualWidth && pt.Y >= 0 && pt.Y <= BorderOutFolder.ActualHeight)
                {
                    HandleOutputFolderDrop(e);
                    return;
                }
            }

            if ((DateTime.UtcNow - _lastDropHandledTime).TotalMilliseconds < 350)
            {
                return;
            }

            string[]? files = ExtractDroppedPaths(e.Data);
            if (files != null && files.Length > 0)
            {
                _lastDropHandledTime = DateTime.UtcNow;
                TabBtnQueue.IsChecked = true;
                TabBtnQueue_Click(this, new RoutedEventArgs());
                AddPaths(files);
            }
        }
        catch (Exception ex)
        {
            Debug.WriteLine($"[Drop Exception]: {ex.Message}");
        }
    }

    private static string[]? ExtractDroppedPaths(IDataObject data)
    {
        if (data == null) return null;
        try
        {
            if (data.GetDataPresent(DataFormats.FileDrop))
            {
                if (data.GetData(DataFormats.FileDrop) is string[] sa && sa.Length > 0)
                    return sa;
                if (data.GetData(DataFormats.FileDrop) is System.Collections.IEnumerable en)
                {
                    var list = new List<string>();
                    foreach (var it in en)
                        if (it is string s && !string.IsNullOrWhiteSpace(s)) list.Add(s);
                    if (list.Count > 0) return list.ToArray();
                }
            }
            if (data.GetDataPresent("FileDrop"))
            {
                if (data.GetData("FileDrop") is string[] sa && sa.Length > 0)
                    return sa;
            }
            if (data.GetDataPresent("FileNameW"))
            {
                if (data.GetData("FileNameW") is string[] sa && sa.Length > 0) return sa;
                if (data.GetData("FileNameW") is string s && !string.IsNullOrWhiteSpace(s)) return new[] { s };
            }
            if (data.GetDataPresent("FileName"))
            {
                if (data.GetData("FileName") is string[] sa && sa.Length > 0) return sa;
                if (data.GetData("FileName") is string s && !string.IsNullOrWhiteSpace(s)) return new[] { s };
            }
        }
        catch { }
        return null;
    }

    private static List<string> EnumerateRomFilesRecursively(string rootDir)
    {
        var result = new List<string>();
        var validExtensions = new HashSet<string>(StringComparer.OrdinalIgnoreCase) { ".nds", ".dsi", ".app" };
        var stack = new Stack<string>();
        stack.Push(rootDir);

        while (stack.Count > 0)
        {
            string current = stack.Pop();
            try
            {
                foreach (var file in Directory.EnumerateFiles(current))
                {
                    try
                    {
                        string ext = Path.GetExtension(file);
                        if (validExtensions.Contains(ext))
                        {
                            result.Add(file);
                        }
                    }
                    catch { }
                }
            }
            catch { }

            try
            {
                foreach (var subDir in Directory.EnumerateDirectories(current))
                {
                    try
                    {
                        var di = new DirectoryInfo(subDir);
                        if ((di.Attributes & FileAttributes.ReparsePoint) == 0)
                        {
                            stack.Push(subDir);
                        }
                    }
                    catch { }
                }
            }
            catch { }
        }

        return result;
    }

    private void DropZone_MouseDown(object sender, MouseButtonEventArgs e)
    {
        if (_games.Count == 0)
        {
            BtnAddFiles_Click(sender, e);
        }
    }

    private void BtnAddFiles_Click(object sender, RoutedEventArgs e)
    {
        var dlg = new OpenFileDialog
        {
            Filter = "Nintendo DS/DSi ROMs (*.nds;*.dsi;*.app)|*.nds;*.dsi;*.app|All files (*.*)|*.*",
            Multiselect = true,
            Title = "Выберите файлы для добавления"
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
            Title = "Выберите папку с играми Nintendo DSi"
        };
        if (dlg.ShowDialog() == true)
        {
            AddPaths(new[] { dlg.FolderName });
        }
    }

    private async void AddPaths(string[] paths)
    {
        if (_isScanning) return;
        _isScanning = true;

        try
        {
            TxtStatusLog.Text = "Сканирование файлов...";
            var newItems = new List<RomItem>();

            await Task.Run(() =>
            {
                foreach (var path in paths)
                {
                    try
                    {
                        if (File.Exists(path))
                        {
                            var item = CreateRomItem(path);
                            if (item != null) newItems.Add(item);
                        }
                        else if (Directory.Exists(path))
                        {
                            _lastFolderPath = path;
                            var files = EnumerateRomFilesRecursively(path);
                            foreach (var f in files)
                            {
                                var item = CreateRomItem(f);
                                if (item != null) newItems.Add(item);
                            }
                        }
                    }
                    catch { }
                }
            });

            foreach (var item in newItems)
            {
                if (!_games.Any(g => g.FilePath.Equals(item.FilePath, StringComparison.OrdinalIgnoreCase)))
                {
                    _games.Add(item);
                    _lastFolderPath ??= Path.GetDirectoryName(item.FilePath);
                }
            }

            UpdateStats();
            TxtStatusLog.Text = $"Загружено игр: {_games.Count}. Готово к расшифровке.";
        }
        catch (Exception ex)
        {
            Debug.WriteLine($"[AddPaths Exception]: {ex.Message}");
        }
        finally
        {
            _isScanning = false;
        }
    }

    private RomItem? CreateRomItem(string file)
    {
        try
        {
            var info = DsiDecryptorEngine.InspectRom(file);
            string statusText;
            if (info.IsEncrypted)
            {
                statusText = LocalizationManager.Get("StatusEncrypted");
            }
            else if (info.NeedsCompatibilityPatch)
            {
                statusText = LocalizationManager.Get("StatusNeedsPatch");
            }
            else if (info.IsDsiRom)
            {
                statusText = LocalizationManager.Get("StatusDecrypted");
            }
            else
            {
                statusText = LocalizationManager.Get("StatusNotDsi");
            }

            return new RomItem
            {
                FilePath = file,
                FileName = info.FileName,
                GameTitle = string.IsNullOrWhiteSpace(info.GameTitle) ? info.FileName : info.GameTitle,
                GameCode = string.IsNullOrWhiteSpace(info.GameCode) ? "-" : info.GameCode,
                FileSize = info.FileSize,
                IsEncrypted = info.IsEncrypted,
                NeedsCompatibilityPatch = info.NeedsCompatibilityPatch,
                Status = statusText
            };
        }
        catch
        {
            return null;
        }
    }

    // --- Decryption with Duplicate History Checking ---
    private async void BtnDecrypt_Click(object sender, RoutedEventArgs e)
    {
        bool inPlace = ChkInPlace.IsChecked == true;
        var targetGames = inPlace
            ? _games.Where(g => g.IsEncrypted || g.NeedsCompatibilityPatch).ToList()
            : _games.ToList();

        if (targetGames.Count == 0)
        {
            if (inPlace && _games.Count > 0)
            {
                TxtStatusLog.Text = "Все файлы в списке уже расшифрованы и не требуют исправлений.";
            }
            return;
        }

        if (inPlace)
        {
            bool? mbr = StormMessageBox.Show(
                this,
                "Вы выбрали перезапись оригинальных файлов на месте.\n\nФайлы будут расшифрованы без создания резервных копий. Продолжить?",
                "Подтверждение операции",
                MessageBoxButton.YesNo,
                MessageBoxImage.Warning);
            if (mbr != true) return;
        }

        // Duplicate history checking
        DuplicateAction? appliedToAll = null;
        var gamesToProcess = new List<RomItem>();

        foreach (var item in targetGames)
        {
            var previous = HistoryManager.FindPrevious(item.FilePath, item.GameCode);
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

        foreach (var item in gamesToProcess)
        {
            string targetDir = (!string.IsNullOrWhiteSpace(_customOutputDir) && Directory.Exists(_customOutputDir))
                ? _customOutputDir
                : (Path.GetDirectoryName(item.FilePath) ?? "");

            string outPath = inPlace
                ? item.FilePath
                : Path.Combine(targetDir, Path.GetFileName(item.FilePath));

            bool success = false;
            long elapsedMs = 0;
            bool wasEncrypted = item.IsEncrypted;
            bool neededPatch = item.NeedsCompatibilityPatch;

            if (item.IsEncrypted || item.NeedsCompatibilityPatch)
            {
                string statusProg = item.IsEncrypted
                    ? LocalizationManager.Get("StatusProcessing")
                    : LocalizationManager.Get("StatusPatching");
                item.Status = statusProg;
                TxtStatusLog.Text = $"{statusProg} {item.FileName}...";

                await Task.Run(() =>
                {
                    var sw = Stopwatch.StartNew();
                    success = DsiDecryptorEngine.DecryptFile(item.FilePath, outPath);
                    sw.Stop();
                    elapsedMs = sw.ElapsedMilliseconds;
                });
            }
            else
            {
                item.Status = LocalizationManager.Get("StatusCopying");
                TxtStatusLog.Text = $"Копирование: {item.FileName}...";

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
                    FileName = item.FileName,
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

        totalSw.Stop();
        UpdateStats();
        UpdateHistoryStats();

        BtnAddFiles.IsEnabled = true;
        BtnAddFolder.IsEnabled = true;
        BtnClear.IsEnabled = true;

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

    // --- Settings & Themes ---
    private void CmbTheme_SelectionChanged(object sender, SelectionChangedEventArgs e)
    {
        if (CmbTheme.SelectedItem is string themeName)
        {
            ThemeManager.ApplyTheme(themeName);
        }
    }

    private void CmbLang_SelectionChanged(object sender, SelectionChangedEventArgs e)
    {
        string lang = CmbLang.SelectedIndex switch
        {
            1 => "en",
            2 => "de",
            3 => "fr",
            4 => "zh",
            5 => "ja",
            _ => "ru"
        };
        LocalizationManager.CurrentLanguage = lang;
        UpdateLocalization();
        foreach (var item in _games)
        {
            var info = DsiDecryptorEngine.InspectRom(item.FilePath);
            item.Status = info.IsEncrypted
                ? LocalizationManager.Get("StatusEncrypted")
                : (info.IsDsiRom ? LocalizationManager.Get("StatusDecrypted") : LocalizationManager.Get("StatusNotDsi"));
        }
    }
}
