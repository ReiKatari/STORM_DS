# Telegram Announcement and APK uploader for STORM DS 4.3.6
[Console]::InputEncoding = [System.Text.Encoding]::UTF8
[Console]::OutputEncoding = [System.Text.Encoding]::UTF8
$OutputEncoding = [System.Text.Encoding]::UTF8

$announcementFile = Join-Path $PSScriptRoot "announcement_436.txt"

powershell -ExecutionPolicy Bypass -File (Join-Path $PSScriptRoot "send_telegram_release.ps1") `
    -ChatId "-5389146045" `
    -ApkPath "E:\STORM DS\Files\STORM_DS_4.3.6.apk" `
    -AnnouncementFile $announcementFile `
    -Caption "STORM_DS_4.3.6.apk (Релиз • Эмулятор Nintendo DS и Nintendo DSi)"

Write-Host "Telegram publication script finished."
