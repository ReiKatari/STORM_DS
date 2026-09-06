# Telegram Uploader Utility for STORM DS
[Console]::OutputEncoding = [System.Text.Encoding]::UTF8
$OutputEncoding = [System.Text.Encoding]::UTF8

param(
    [string]$Token = "",
    [string]$ChatId = "-5389146045",
    [string]$ApkPath,
    [string]$SetupPath,
    [string]$Caption,
    [string]$SetupCaption,
    [string]$Announcement,
    [string]$AnnouncementFile
)

if (-not $Token) {
    if ($env:STORM_TELEGRAM_BOT_TOKEN) {
        $Token = $env:STORM_TELEGRAM_BOT_TOKEN
    } else {
        $localConfigFile = Join-Path $PSScriptRoot "config.local.json"
        if (Test-Path $localConfigFile) {
            $json = Get-Content $localConfigFile -Raw | ConvertFrom-Json
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
    Write-Host "Uploading $filePath to Telegram..."
    $fileBytes = [System.IO.File]::ReadAllBytes($filePath)
    $fileName = [System.IO.Path]::GetFileName($filePath)

    $client = [System.Net.Http.HttpClient]::new()
    $client.Timeout = [System.TimeSpan]::FromMinutes(10)
    $form = [System.Net.Http.MultipartFormDataContent]::new()
    
    $chatContent = [System.Net.Http.StringContent]::new($ChatId)
    $form.Add($chatContent, "chat_id")

    if ($docCaption) {
        $captionContent = [System.Net.Http.ByteArrayContent]::new([System.Text.Encoding]::UTF8.GetBytes($docCaption))
        $captionContent.Headers.ContentType = [System.Net.Http.Headers.MediaTypeHeaderValue]::Parse("text/plain; charset=utf-8")
        $form.Add($captionContent, "caption")
    }

    $byteContent = [System.Net.Http.ByteArrayContent]::new($fileBytes)
    $form.Add($byteContent, "document", $fileName)

    $resp = $client.PostAsync("https://api.telegram.org/bot$Token/sendDocument", $form).Result
    Write-Host "Done ${fileName}: " ($resp.Content.ReadAsStringAsync().Result)
}

if ($AnnouncementFile -and (Test-Path $AnnouncementFile)) {
    $Announcement = [System.IO.File]::ReadAllText($AnnouncementFile, [System.Text.Encoding]::UTF8)
}

if ($Announcement) {
    Send-TelegramMessage $Announcement
}

if ($ApkPath) {
    $fileName = [System.IO.Path]::GetFileNameWithoutExtension($ApkPath)
    if (-not $Caption) {
        $Caption = "$fileName (Release • Nintendo DS and DSi Emulator)"
    }
    Upload-TelegramDocument $ApkPath $Caption
}

if ($SetupPath) {
    $setupFileName = [System.IO.Path]::GetFileNameWithoutExtension($SetupPath)
    if (-not $SetupCaption) {
        $SetupCaption = "$setupFileName (STORM DSi Decryptor for Windows)"
    }
    Upload-TelegramDocument $SetupPath $SetupCaption
}

