using System;

namespace StormDsiDecryptor;

public class HistoryItem
{
    public string FilePath { get; set; } = string.Empty;
    public string FileName { get; set; } = string.Empty;
    public string GameTitle { get; set; } = string.Empty;
    public string GameCode { get; set; } = string.Empty;
    public long FileSize { get; set; }
    public string FileSizeFormatted => FileSize < 1024 * 1024
        ? $"{FileSize / 1024.0:F1} КБ"
        : $"{FileSize / (1024.0 * 1024.0):F2} МБ";
    public DateTime ProcessedAt { get; set; } = DateTime.Now;
    public string ProcessedAtFormatted => ProcessedAt.ToString("dd.MM.yyyy HH:mm");
    public string Status { get; set; } = string.Empty;
    public long ElapsedMs { get; set; }
    public string OutPath { get; set; } = string.Empty;
}
