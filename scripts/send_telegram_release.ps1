# Telegram UTF-8 Uploader Utility for STORM DS
param(
    [string]$Token = "8210884351:AAEh4VOWHViz2KF_oElAqEfrMPHlI5TWCjM",
    [string]$ChatId = "-5389146045",
    [string]$ApkPath,
    [string]$Caption,
    [string]$DetailedMessage
)

$utf8NoBom = New-Object System.Text.UTF8Encoding($false)
$tempDir = [System.IO.Path]::GetTempPath()

if ($ApkPath -and (Test-Path $ApkPath)) {
    $captionFile = Join-Path $tempDir "tg_caption.txt"
    [System.IO.File]::WriteAllText($captionFile, $Caption, $utf8NoBom)
    
    $captionContent = [System.IO.File]::ReadAllText($captionFile, $utf8NoBom)
    curl.exe -F "chat_id=$ChatId" -F "document=@$ApkPath" -F "caption=$captionContent" "https://api.telegram.org/bot$Token/sendDocument"
}

if ($DetailedMessage) {
    $jsonObj = @{
        chat_id = $ChatId
        text = $DetailedMessage
    } | ConvertTo-Json -Compress
    
    $jsonFile = Join-Path $tempDir "tg_msg.json"
    [System.IO.File]::WriteAllText($jsonFile, $jsonObj, $utf8NoBom)
    
    curl.exe -H "Content-Type: application/json; charset=utf-8" --data-binary "@$jsonFile" "https://api.telegram.org/bot$Token/sendMessage"
}
