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
    private bool _isScanning;

    [DllImport("user32.dll", SetLastError = true)]
    private static extern bool ChangeWindowMessageFilterEx(IntPtr hWnd, uint msg, uint action, IntPtr pChangeFilterStruct);

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
        }
        catch { }
    }

    private void UpdateLocalization()
    {
        TxtSubtitle.Text = LocalizationManager.Get("Subtitle");
        TxtDragDropHint.Text = LocalizationManager.Get("DragDropHint");
        BtnAddFiles.Content = LocalizationManager.Get("AddFiles");
        BtnAddFolder.Content = LocalizationManager.Get("AddFolder");
        BtnDecrypt.Content = LocalizationManager.Get("DecryptAll");
        BtnClear.Content = LocalizationManager.Get("ClearList");
        BtnOpenFolder.Content = LocalizationManager.Get("OpenFolder");
        RbCopy.Content = LocalizationManager.Get("ModeCopy");
        RbInPlace.Content = LocalizationManager.Get("ModeInPlace");
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
        BtnDecrypt.IsEnabled = _games.Any(g => g.IsEncrypted);
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

    // --- Drag & Drop (Crash-Proof, OLE Standard) ---
    private void Window_DragOver(object sender, DragEventArgs e)
    {
        try
        {
            if (e.Data.GetDataPresent(DataFormats.FileDrop))
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

    private void Window_Drop(object sender, DragEventArgs e)
    {
        try
        {
            e.Handled = true;
            if (e.Data.GetDataPresent(DataFormats.FileDrop))
            {
                var raw = e.Data.GetData(DataFormats.FileDrop);
                if (raw is string[] files && files.Length > 0)
                {
                    // Switch to Queue tab so user sees added games
                    TabBtnQueue.IsChecked = true;
                    TabBtnQueue_Click(this, new RoutedEventArgs());
                    AddPaths(files);
                }
                else if (raw is System.Collections.IEnumerable enumerable)
                {
                    var fileList = new List<string>();
                    foreach (var item in enumerable)
                    {
                        if (item is string s && !string.IsNullOrWhiteSpace(s))
                            fileList.Add(s);
                    }
                    if (fileList.Count > 0)
                    {
                        TabBtnQueue.IsChecked = true;
                        TabBtnQueue_Click(this, new RoutedEventArgs());
                        AddPaths(fileList.ToArray());
                    }
                }
            }
        }
        catch (Exception ex)
        {
            Debug.WriteLine($"[Drop Exception]: {ex.Message}");
        }
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
                            var files = Directory.GetFiles(path, "*.*", SearchOption.AllDirectories);
                            foreach (var f in files)
                            {
                                string ext = Path.GetExtension(f).ToLowerInvariant();
                                if (ext == ".nds" || ext == ".dsi" || ext == ".app")
                                {
                                    var item = CreateRomItem(f);
                                    if (item != null) newItems.Add(item);
                                }
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
            string statusText = info.IsEncrypted
                ? LocalizationManager.Get("StatusEncrypted")
                : (info.IsDsiRom ? LocalizationManager.Get("StatusDecrypted") : LocalizationManager.Get("StatusNotDsi"));

            return new RomItem
            {
                FilePath = file,
                FileName = info.FileName,
                GameTitle = string.IsNullOrWhiteSpace(info.GameTitle) ? info.FileName : info.GameTitle,
                GameCode = string.IsNullOrWhiteSpace(info.GameCode) ? "-" : info.GameCode,
                FileSize = info.FileSize,
                IsEncrypted = info.IsEncrypted,
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
        var targetGames = _games.Where(g => g.IsEncrypted).ToList();
        if (targetGames.Count == 0) return;

        bool inPlace = RbInPlace.IsChecked == true;
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
            item.Status = LocalizationManager.Get("StatusProcessing");
            TxtStatusLog.Text = $"Расшифровка: {item.FileName}...";

            string outPath = inPlace
                ? item.FilePath
                : Path.Combine(Path.GetDirectoryName(item.FilePath) ?? "",
                               Path.GetFileNameWithoutExtension(item.FilePath) + " (Decrypted)" + Path.GetExtension(item.FilePath));

            bool success = false;
            long elapsedMs = 0;

            await Task.Run(() =>
            {
                var sw = Stopwatch.StartNew();
                success = DsiDecryptorEngine.DecryptFile(item.FilePath, outPath);
                sw.Stop();
                elapsedMs = sw.ElapsedMilliseconds;
            });

            if (success)
            {
                item.IsEncrypted = false;
                item.IsSuccess = true;
                item.Status = $"{LocalizationManager.Get("StatusSuccess")} ({elapsedMs} мс)";

                // Record to persistent history
                HistoryManager.Add(new HistoryItem
                {
                    FilePath = item.FilePath,
                    FileName = item.FileName,
                    GameTitle = item.GameTitle,
                    GameCode = item.GameCode,
                    FileSize = item.FileSize,
                    ProcessedAt = DateTime.Now,
                    Status = LocalizationManager.Get("StatusSuccess"),
                    ElapsedMs = elapsedMs,
                    OutPath = outPath
                });
            }
            else
            {
                item.Status = LocalizationManager.Get("StatusFailed");
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
        string? target = _lastFolderPath;
        if (string.IsNullOrEmpty(target) || !Directory.Exists(target))
        {
            if (_games.Count > 0)
                target = Path.GetDirectoryName(_games[0].FilePath);
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
