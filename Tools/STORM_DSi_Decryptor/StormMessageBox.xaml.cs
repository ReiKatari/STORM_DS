using System;
using System.Runtime.InteropServices;
using System.Windows;
using System.Windows.Input;
using System.Windows.Interop;

namespace StormDsiDecryptor;

public partial class StormMessageBox : Window
{
    [DllImport("dwmapi.dll")]
    private static extern int DwmSetWindowAttribute(IntPtr hwnd, int attr, ref int attrValue, int attrSize);

    private const int DWMWA_USE_IMMERSIVE_DARK_MODE = 20;
    private const int DWMWA_WINDOW_CORNER_PREFERENCE = 33;
    private const int DWMWCP_ROUND = 2;

    public bool Result { get; private set; }

    public StormMessageBox()
    {
        InitializeComponent();
    }

    protected override void OnSourceInitialized(EventArgs e)
    {
        base.OnSourceInitialized(e);
        try
        {
            var hwnd = new WindowInteropHelper(this).Handle;
            int darkMode = 1;
            DwmSetWindowAttribute(hwnd, DWMWA_USE_IMMERSIVE_DARK_MODE, ref darkMode, sizeof(int));
            int cornerPref = DWMWCP_ROUND;
            DwmSetWindowAttribute(hwnd, DWMWA_WINDOW_CORNER_PREFERENCE, ref cornerPref, sizeof(int));
        }
        catch { }
    }

    public static bool? Show(Window? owner, string message, string title = "STORM DSI DECRYPTOR", MessageBoxButton buttons = MessageBoxButton.OK, MessageBoxImage icon = MessageBoxImage.Information)
    {
        var dlg = new StormMessageBox
        {
            Title = title
        };
        if (owner != null && owner.IsLoaded && owner.IsVisible)
        {
            dlg.Owner = owner;
            dlg.WindowStartupLocation = WindowStartupLocation.CenterOwner;
        }
        else
        {
            dlg.WindowStartupLocation = WindowStartupLocation.CenterScreen;
        }

        dlg.TxtMessage.Text = message;

        var warningBrush = (owner != null ? owner.TryFindResource("ThemeWarning") : Application.Current?.TryFindResource("ThemeWarning")) as System.Windows.Media.Brush
            ?? new System.Windows.Media.SolidColorBrush(System.Windows.Media.Color.FromRgb(0xF5, 0x9E, 0x0B));
        var accentBrush = (owner != null ? owner.TryFindResource("ThemeAccent") : Application.Current?.TryFindResource("ThemeAccent")) as System.Windows.Media.Brush
            ?? new System.Windows.Media.SolidColorBrush(System.Windows.Media.Color.FromRgb(0x8B, 0x5C, 0xF6));

        if (icon == MessageBoxImage.Warning || icon == MessageBoxImage.Exclamation)
        {
            dlg.TxtIcon.Text = "!";
            dlg.TxtIcon.Foreground = warningBrush;
        }
        else if (icon == MessageBoxImage.Error || icon == MessageBoxImage.Hand || icon == MessageBoxImage.Stop)
        {
            dlg.TxtIcon.Text = "✕";
            dlg.TxtIcon.Foreground = new System.Windows.Media.SolidColorBrush(System.Windows.Media.Color.FromRgb(0xEF, 0x44, 0x44));
        }
        else
        {
            dlg.TxtIcon.Text = "✔";
            dlg.TxtIcon.Foreground = accentBrush;
        }

        if (buttons == MessageBoxButton.YesNo || buttons == MessageBoxButton.OKCancel)
        {
            dlg.BtnCancel.Visibility = Visibility.Visible;
            dlg.BtnCancel.Content = (buttons == MessageBoxButton.YesNo) ? "Нет" : "Отмена";
            dlg.BtnOk.Content = (buttons == MessageBoxButton.YesNo) ? "Да" : "OK";
        }
        else
        {
            dlg.BtnCancel.Visibility = Visibility.Collapsed;
            dlg.BtnOk.Content = "OK";
        }

        return dlg.ShowDialog();
    }

    private void BtnOk_Click(object sender, RoutedEventArgs e)
    {
        Result = true;
        DialogResult = true;
        Close();
    }

    private void BtnCancel_Click(object sender, RoutedEventArgs e)
    {
        Result = false;
        DialogResult = false;
        Close();
    }

    private void BtnClose_Click(object sender, RoutedEventArgs e)
    {
        Result = false;
        DialogResult = false;
        Close();
    }

    private void Window_KeyDown(object sender, KeyEventArgs e)
    {
        if (e.Key == Key.Escape)
        {
            BtnClose_Click(sender, e);
        }
    }
}
