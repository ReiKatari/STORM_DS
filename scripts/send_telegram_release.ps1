# Telegram Uploader Utility for STORM DS
param(
    [string]$Token = "",
    [string]$ChatId = "-5389146045",
    [string]$ApkPath,
    [string]$SetupPath,
    [string]$Caption,
    [string]$CaptionFile,
    [string]$SetupCaption,
    [string]$SetupCaptionFile,
    [string]$Announcement,
    [string]$AnnouncementFile
)

[Console]::InputEncoding = [System.Text.Encoding]::UTF8
[Console]::OutputEncoding = [System.Text.Encoding]::UTF8
$OutputEncoding = [System.Text.Encoding]::UTF8

if (-not $Token) {
    if ($env:STORM_TELEGRAM_BOT_TOKEN) {
        $Token = $env:STORM_TELEGRAM_BOT_TOKEN
    } else {
        $localConfigFile = Join-Path $PSScriptRoot "config.local.json"
        if (Test-Path $localConfigFile) {
            $json = Get-Content $localConfigFile -Raw -Encoding UTF8 | ConvertFrom-Json
            $Token = $json.telegram_bot_token
        }
    }
}

if (-not $Token) {
    Write-Error "Telegram Bot Token not specified! Set `$env:STORM_TELEGRAM_BOT_TOKEN or provide scripts/config.local.json."
    exit 1
}

Add-Type -AssemblyName System.Net.Http

if (-not $ApkPath) {
    $latestApk = Get-ChildItem -Path "E:\STORM DS\Files" -Filter "STORM_DS_*.apk" | Sort-Object LastWriteTime -Descending | Select-Object -First 1
    if ($latestApk) {
        $ApkPath = $latestApk.FullName
    }
}

function Send-TelegramMessage([string]$text) {
    if (-not $text) { return }
    $payload = [ordered]@{
        chat_id = $ChatId
        text = $text
    } | ConvertTo-Json

    $client = [System.Net.Http.HttpClient]::new()
    $byteContent = [System.Net.Http.ByteArrayContent]::new([System.Text.Encoding]::UTF8.GetBytes($payload))
    $byteContent.Headers.ContentType = [System.Net.Http.Headers.MediaTypeHeaderValue]::Parse("application/json; charset=utf-8")

    $resp = $client.PostAsync("https://api.telegram.org/bot$Token/sendMessage", $byteContent).Result
    Write-Host "Telegram message sent: " ($resp.Content.ReadAsStringAsync().Result)
}

function Upload-TelegramDocument([string]$filePath, [string]$docCaption) {
    if (-not (Test-Path $filePath)) {
        Write-Warning "File not found: $filePath"
        return
    }
    $fileName = [System.IO.Path]::GetFileName($filePath)
    Write-Host "Uploading $filePath to Telegram..."

    $client = [System.Net.Http.HttpClient]::new()
    $client.Timeout = [System.TimeSpan]::FromMinutes(15)
    $form = [System.Net.Http.MultipartFormDataContent]::new()
    
    $chatContent = [System.Net.Http.StringContent]::new($ChatId, [System.Text.Encoding]::UTF8)
    $form.Add($chatContent, "chat_id")

    if ($docCaption) {
        $captionContent = [System.Net.Http.StringContent]::new($docCaption, [System.Text.Encoding]::UTF8)
        $form.Add($captionContent, "caption")
    }

    $fileBytes = [System.IO.File]::ReadAllBytes($filePath)
    $byteContent = [System.Net.Http.ByteArrayContent]::new($fileBytes)
    if ($fileName.EndsWith(".apk")) {
        $byteContent.Headers.ContentType = [System.Net.Http.Headers.MediaTypeHeaderValue]::Parse("application/vnd.android.package-archive")
    }
    $form.Add($byteContent, "document", $fileName)

    try {
        $resp = $client.PostAsync("https://api.telegram.org/bot$Token/sendDocument", $form).Result
        Write-Host "Done ${fileName}: " ($resp.Content.ReadAsStringAsync().Result)
    } catch {
        Write-Error "Upload failed for ${fileName}: $_"
    } finally {
        $form.Dispose()
        $client.Dispose()
    }
}

if ($AnnouncementFile -and (Test-Path $AnnouncementFile)) {
    $Announcement = [System.IO.File]::ReadAllText($AnnouncementFile, [System.Text.Encoding]::UTF8)
}

if ($Announcement) {
    Send-TelegramMessage $Announcement
}

if ($ApkPath) {
    $fileName = [System.IO.Path]::GetFileNameWithoutExtension($ApkPath)
    if ($CaptionFile -and (Test-Path $CaptionFile)) {
        $Caption = [System.IO.File]::ReadAllText($CaptionFile, [System.Text.Encoding]::UTF8).Trim()
    }
    if (-not $Caption) {
        $Caption = "$fileName (Релиз • Эмулятор Nintendo DS и DSi)"
    }
    Upload-TelegramDocument $ApkPath $Caption
}

if ($SetupPath) {
    $setupFileName = [System.IO.Path]::GetFileNameWithoutExtension($SetupPath)
    if ($SetupCaptionFile -and (Test-Path $SetupCaptionFile)) {
        $SetupCaption = [System.IO.File]::ReadAllText($SetupCaptionFile, [System.Text.Encoding]::UTF8).Trim()
    }
    if (-not $SetupCaption) {
        $SetupCaption = "$setupFileName (STORM DSi Decryptor for Windows)"
    }
    Upload-TelegramDocument $SetupPath $SetupCaption
}

