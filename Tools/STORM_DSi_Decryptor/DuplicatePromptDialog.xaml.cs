using System;
using System.Runtime.InteropServices;
using System.Windows;
using System.Windows.Input;
using System.Windows.Interop;

namespace StormDsiDecryptor;

public enum DuplicateAction
{
    Skip,
    Reprocess
}

public partial class DuplicatePromptDialog : Window
{
    [DllImport("dwmapi.dll")]
    private static extern int DwmSetWindowAttribute(IntPtr hwnd, int attr, ref int attrValue, int attrSize);

    private const int DWMWA_USE_IMMERSIVE_DARK_MODE = 20;
    private const int DWMWA_WINDOW_CORNER_PREFERENCE = 33;
    private const int DWMWCP_ROUND = 2;

    public DuplicateAction Decision { get; private set; } = DuplicateAction.Skip;
    public bool ApplyToAll => ChkApplyToAll.IsChecked == true;

    public DuplicatePromptDialog(Window? owner, string gameTitle, string fileName, string previousDate)
    {
        InitializeComponent();
        if (owner != null && owner.IsLoaded && owner.IsVisible)
        {
            Owner = owner;
            WindowStartupLocation = WindowStartupLocation.CenterOwner;
        }
        else
        {
            WindowStartupLocation = WindowStartupLocation.CenterScreen;
        }

        TxtGameTitle.Text = string.IsNullOrWhiteSpace(gameTitle) ? fileName : gameTitle;
        TxtFileName.Text = fileName;
        TxtPreviousDate.Text = previousDate;

        // Apply localization
        TxtHeaderTitle.Text = LocalizationManager.Get("DuplicateTitle");
        TxtPrompt.Text = LocalizationManager.Get("DuplicateMsg");
        BtnSkip.Content = LocalizationManager.Get("BtnSkip");
        BtnReprocess.Content = LocalizationManager.Get("BtnReprocess");
        ChkApplyToAll.Content = LocalizationManager.Get("ChkApplyToAllDuplicates");
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

    private void BtnSkip_Click(object sender, RoutedEventArgs e)
    {
        Decision = DuplicateAction.Skip;
        DialogResult = true;
        Close();
    }

    private void BtnReprocess_Click(object sender, RoutedEventArgs e)
    {
        Decision = DuplicateAction.Reprocess;
        DialogResult = true;
        Close();
    }

    private void BtnClose_Click(object sender, RoutedEventArgs e)
    {
        Decision = DuplicateAction.Skip;
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
