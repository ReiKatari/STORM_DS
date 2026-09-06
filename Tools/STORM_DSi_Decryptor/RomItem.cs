using System.ComponentModel;
using System.Runtime.CompilerServices;

namespace StormDsiDecryptor;

public class RomItem : INotifyPropertyChanged
{
    private string _status = "";
    private bool _isProcessing;
    private bool _isSuccess;
    private bool _isEncrypted;

    public string FilePath { get; set; } = string.Empty;
    public string FileName { get; set; } = string.Empty;
    public string GameTitle { get; set; } = string.Empty;
    public string GameCode { get; set; } = string.Empty;
    public long FileSize { get; set; }
    public string FileSizeFormatted => $"{(double)FileSize / (1024 * 1024):F2} МБ";

    public bool IsEncrypted
    {
        get => _isEncrypted;
        set { _isEncrypted = value; OnPropertyChanged(); }
    }

    private bool _needsCompatibilityPatch;
    public bool NeedsCompatibilityPatch
    {
        get => _needsCompatibilityPatch;
        set { _needsCompatibilityPatch = value; OnPropertyChanged(); }
    }

    public string Status
    {
        get => _status;
        set { _status = value; OnPropertyChanged(); }
    }

    public bool IsProcessing
    {
        get => _isProcessing;
        set { _isProcessing = value; OnPropertyChanged(); }
    }

    public bool IsSuccess
    {
        get => _isSuccess;
        set { _isSuccess = value; OnPropertyChanged(); }
    }

    public event PropertyChangedEventHandler? PropertyChanged;
    protected void OnPropertyChanged([CallerMemberName] string? name = null)
        => PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(name));
}
