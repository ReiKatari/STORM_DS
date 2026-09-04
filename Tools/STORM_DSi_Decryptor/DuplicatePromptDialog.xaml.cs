using System;
using System.Windows;
using System.Windows.Input;

namespace StormDsiDecryptor;

public enum DuplicateAction
{
    Skip,
    Reprocess
}

public partial class DuplicatePromptDialog : Window
{
    public DuplicateAction Decision { get; private set; } = DuplicateAction.Skip;
    public bool ApplyToAll => ChkApplyToAll.IsChecked == true;

    public DuplicatePromptDialog(Window? owner, string gameTitle, string fileName, string previousDate)
    {
        InitializeComponent();
        if (owner != null)
        {
            Owner = owner;
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
            Decision = DuplicateAction.Skip;
            DialogResult = false;
            Close();
        }
    }
}
