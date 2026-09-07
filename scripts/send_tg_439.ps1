$scriptDir = Split-Path -Parent $MyInvocation.MyCommand.Definition
$announcementFile = Join-Path $scriptDir "announcement_439.txt"
$captionFile = Join-Path $scriptDir "caption_439.txt"
$apkPath = "E:\STORM DS\Files\STORM_DS_4.3.9.apk"

& (Join-Path $scriptDir "send_telegram_release.ps1") `
    -AnnouncementFile $announcementFile `
    -ApkPath $apkPath `
    -CaptionFile $captionFile
