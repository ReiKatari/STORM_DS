using System;
using System.Collections.ObjectModel;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Input;
using Microsoft.Win32;

namespace StormDsiDecryptor;

public partial class MainWindow : Window
{
    private readonly ObservableCollection<RomItem> _games = new();
    private string? _lastFolderPath;

    public MainWindow()
    {
        InitializeComponent();
        GridGames.ItemsSource = _games;

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
    }

    private void UpdateStats()
    {
        TxtTotalCount.Text = _games.Count.ToString();
        TxtEncryptedCount.Text = _games.Count(g => g.IsEncrypted).ToString();
        TxtDecryptedCount.Text = _games.Count(g => !g.IsEncrypted).ToString();

        bool hasItems = _games.Count > 0;
        EmptyHintPanel.Visibility = hasItems ? Visibility.Collapsed : Visibility.Visible;
        GridGames.Visibility = hasItems ? Visibility.Visible : Visibility.Collapsed;
        BtnDecrypt.IsEnabled = _games.Any(g => g.IsEncrypted);
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

    private void BtnMinimize_Click(object sender, RoutedEventArgs e)
    {
        WindowState = WindowState.Minimized;
    }

    private void BtnMaximize_Click(object sender, RoutedEventArgs e)
    {
        WindowState = WindowState == WindowState.Maximized ? WindowState.Normal : WindowState.Maximized;
    }

    private void BtnClose_Click(object sender, RoutedEventArgs e)
    {
        Close();
    }

    private void Window_DragOver(object sender, DragEventArgs e)
    {
        if (e.Data.GetDataPresent(DataFormats.FileDrop))
        {
            e.Effects = DragDropEffects.Copy;
            e.Handled = true;
        }
    }

    private void Window_Drop(object sender, DragEventArgs e)
    {
        if (e.Data.GetDataPresent(DataFormats.FileDrop))
        {
            var files = (string[])e.Data.GetData(DataFormats.FileDrop);
            if (files != null && files.Length > 0)
            {
                AddPaths(files);
            }
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
        TxtStatusLog.Text = "Сканирование файлов...";
        await Task.Run(() =>
        {
            foreach (var path in paths)
            {
                if (File.Exists(path))
                {
                    InspectAndAddFile(path);
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
                            InspectAndAddFile(f);
                        }
                    }
                }
            }
        });

        UpdateStats();
        TxtStatusLog.Text = $"Загружено игр: {_games.Count}. Готово к расшифровке.";
    }

    private void InspectAndAddFile(string file)
    {
        if (_games.Any(g => g.FilePath.Equals(file, StringComparison.OrdinalIgnoreCase)))
            return;

        var info = DsiDecryptorEngine.InspectRom(file);
        string statusText = info.IsEncrypted
            ? LocalizationManager.Get("StatusEncrypted")
            : (info.IsDsiRom ? LocalizationManager.Get("StatusDecrypted") : LocalizationManager.Get("StatusNotDsi"));

        Dispatcher.Invoke(() =>
        {
            _games.Add(new RomItem
            {
                FilePath = file,
                FileName = info.FileName,
                GameTitle = string.IsNullOrWhiteSpace(info.GameTitle) ? info.FileName : info.GameTitle,
                GameCode = string.IsNullOrWhiteSpace(info.GameCode) ? "-" : info.GameCode,
                FileSize = info.FileSize,
                IsEncrypted = info.IsEncrypted,
                Status = statusText
            });
            _lastFolderPath ??= Path.GetDirectoryName(file);
        });
    }

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

        BtnDecrypt.IsEnabled = false;
        BtnAddFiles.IsEnabled = false;
        BtnAddFolder.IsEnabled = false;
        BtnClear.IsEnabled = false;

        ProgBar.Value = 0;
        ProgBar.Maximum = targetGames.Count;

        int processed = 0;
        var totalSw = Stopwatch.StartNew();

        foreach (var item in targetGames)
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

        BtnAddFiles.IsEnabled = true;
        BtnAddFolder.IsEnabled = true;
        BtnClear.IsEnabled = true;

        TxtStatusLog.Text = $"Все {processed} игр успешно расшифрованы за {totalSw.ElapsedMilliseconds} мс!";
        StormMessageBox.Show(
            this,
            LocalizationManager.Get("AllDone"),
            LocalizationManager.Get("AppTitle"),
            MessageBoxButton.OK,
            MessageBoxImage.Information);
    }

    private void BtnClear_Click(object sender, RoutedEventArgs e)
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
