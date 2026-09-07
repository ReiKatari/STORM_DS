$scriptDir = Split-Path -Parent $MyInvocation.MyCommand.Definition
$announcementFile = Join-Path $scriptDir "announcement_441.txt"
$captionFile = Join-Path $scriptDir "caption_441.txt"
$apkPath = "E:\STORM DS\Files\STORM_DS_4.4.1.apk"

& (Join-Path $scriptDir "send_telegram_release.ps1") `
    -AnnouncementFile $announcementFile `
    -ApkPath $apkPath `
    -CaptionFile $captionFile
