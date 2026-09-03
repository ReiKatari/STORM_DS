# Telegram Uploader Utility for STORM DS
param(
    [string]$Token = "8210884351:AAEh4VOWHViz2KF_oElAqEfrMPHlI5TWCjM",
    [string]$ChatId = "-5389146045",
    [string]$ApkPath,
    [string]$Caption,
    [string]$Announcement
)

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
    Write-Host "Done $fileName: " ($resp.Content.ReadAsStringAsync().Result)
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

