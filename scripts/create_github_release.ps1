# GitHub Release Publisher for STORM DS
param(
    [string]$TagName = "4.1.4",
    [string]$ReleaseName = "Релиз 4.1.4",
    [string]$ApkPath = "E:\STORM DS\Files\STORM_DS_4.1.4.apk",
    [string]$SetupPath = "E:\STORM DS\Files\STORM_DSi_Decryptor_1.0.3_Setup.exe"
)

$inputData = @"
protocol=https
host=github.com

"@
$res = $inputData | git credential fill
$token = ''
foreach ($line in $res) {
    if ($line -match '^password=(.+)$') {
        $token = $Matches[1]
    }
}

if (-not $token) {
    Write-Error "GitHub token not found!"
    exit 1
}

$repo = "ReiKatari/STORM_DS"

$body = @'
> 💡 **Релиз 4.1.4** — *Продвинутый эмулятор двухэкранных консолей Nintendo DS и Nintendo DSi для Android с аппаратным ускорением Vulkan, шейдерами librashader и автоматической поддержкой DSiWare.*

---

### 🚀 Ключевые изменения и улучшения
- 🌟 **[Архитектура памяти DSi и устранение белого экрана]**: Устранена критическая проблема зависания на белом экране при прямом запуске игр DSiWare (включая *Dr. Mario Express*, *SteamWorld Tower Defense*, *Castle of Magic*, *Gangstar 2*). Вызовы инициализации регистров системного контроллера `SCFG_EXT`, таймингов процессора `SCFG_Clock` и переключения физической маски `ApplyNewRAMSize(3)` перенесены в самое начало входа в DSi-режим, исключая искажение системных таблиц в 16 МБ MainRAM.
- 🌟 **[Таблица устройств SD/MMC в ARM7 NWRAM]**: Исправлена запись таблицы монтирования накопителей (`devListAddr`) в память ARM7. Для тайтлов, размещающих таблицу в области NWRAM (например, адрес `0x030315BC` в *Dr. Mario Express*), гарантирована своевременная активация шины NWRAM через бит 25 `SCFG_EXT[1]`.
- 🌟 **[Сквозное дешифрование Modcrypt в эмуляторе]**: Встроенный нативный модуль `RomDecryptor` производит прозрачную расшифровку зашифрованных областей DSiWare прямо в оперативной памяти устройства без перезаписи и изменения оригинальных ROM-файлов пользователя.
- 🌟 **[Утилита STORM DSi Decryptor 1.0.3]**: Обновлена автономная программа расшифровки для Windows. Инсталлятор по умолчанию устанавливает утилиту в системный каталог `Program Files`, при расшифровке автоматически устанавливаются официальные флаги заголовка DSi (`0x1C |= 0x03`) и пересчитывается контрольная сумма Header CRC16 (`0x15E`), обеспечивая 100% совместимость со всеми эмуляторами и реальным оборудованием.

<details>
<summary><b>📋 Полный список изменений (нажмите, чтобы развернуть)</b></summary>

- 🔹 **[Ядро melonDS]**: Корректный порядок инициализации 16 МБ физической памяти (`MainRAMMask = 0xFFFFFF`) перед записью системных структур DSi OS, зеркал заголовка картриджа (`0x02FFE000`) и контекста приложений (`0x02FFD800`).
- 🔹 **[ARM7 NWRAM Bank A]**: Полноценная поддержка записи таблицы устройств SD/MMC по адресам диапазона `0x03000000`–`0x03040000`.
- 🔹 **[RomDecryptor.cpp]**: Установка флагов дешифрования Modcrypt и синхронизация Header CRC16 в оперативной памяти перед загрузкой виртуального картриджа.
- 🔹 **[STORM DSi Decryptor]**: Версия 1.0.3 со стандартной установкой в `Program Files`, поддержкой UAC-элевации, обновленным интерфейсом и валидацией заголовков.
- 🔹 **[Версионирование]**: Версия эмулятора обновлена до 4.1.4 (номер сборки 414).

</details>

<details>
<summary><b>🌐 English Changelog (click to expand)</b></summary>

- 🔸 **[DSi Memory Architecture & White Screen Fix]**: Resolved white screen hangs on DSiWare titles (such as *Dr. Mario Express* and *SteamWorld Tower Defense*). Moved `SCFG_EXT`, `SCFG_Clock`, and `ApplyNewRAMSize(3)` to the start of DSi direct boot setup, preventing memory wrapping and ensuring clean 16MB RAM access.
- 🔸 **[SD/MMC Device List in ARM7 NWRAM]**: Ensured ARM7 NWRAM mapping is active prior to populating device storage tables, allowing titles using NWRAM addresses (like `0x030315BC`) to boot reliably.
- 🔸 **[In-Memory Modcrypt Decryption]**: Native real-time decryption in RAM without altering source files.
- 🔸 **[STORM DSi Decryptor 1.0.3]**: Installer now defaults to `Program Files` with UAC elevation, updates DSi header CryptoFlags (`0x1C |= 0x03`) and recalculates Header CRC16 (`0x15E`) for full compatibility.

</details>

<details>
<summary><b>📦 Файлы и вложения к релизу (нажмите, чтобы развернуть)</b></summary>

- 📁 **Прикреплённые файлы**: Исполняемые файлы, инсталляторы и архивы доступны в секции **Assets** ниже.
- 🛡️ **Контроль целостности**: Все бинарные файлы собраны из официального исходного кода и проверены перед публикацией.
- 💻 **Установка**: Скачайте соответствующий архив/инсталлятор из списка Assets и следуйте стандартным инструкциям.

</details>
'@

$headers = @{
    "Authorization" = "Bearer $token"
    "Accept" = "application/vnd.github.v3+json"
    "User-Agent" = "STORM-Release-Manager"
}

# 1. Create or update existing release
$release = $null
try {
    Write-Host "Checking if release $TagName exists..."
    $release = Invoke-RestMethod -Uri "https://api.github.com/repos/$repo/releases/tags/$TagName" -Method Get -Headers $headers -ErrorAction Stop
    Write-Host "Release already exists with ID $($release.id). Updating title and body..."
    
    $patchPayload = [ordered]@{
        name = $ReleaseName
        body = $body
    } | ConvertTo-Json -Depth 5
    $utf8Bytes = [System.Text.Encoding]::UTF8.GetBytes($patchPayload)
    $release = Invoke-RestMethod -Uri "https://api.github.com/repos/$repo/releases/$($release.id)" -Method Patch -Headers $headers -Body $utf8Bytes -ContentType "application/json; charset=utf-8"
    Write-Host "Release details updated successfully!"
} catch {
    Write-Host "Release does not exist, creating..."
    $payload = [ordered]@{
        tag_name = $TagName
        name = $ReleaseName
        body = $body
        draft = $false
        prerelease = $false
    } | ConvertTo-Json -Depth 5
    $utf8Bytes = [System.Text.Encoding]::UTF8.GetBytes($payload)

    $release = Invoke-RestMethod -Uri "https://api.github.com/repos/$repo/releases" -Method Post -Headers $headers -Body $utf8Bytes -ContentType "application/json; charset=utf-8"
    Write-Host "Release created successfully! ID: $($release.id)"
}

# 2. Upload Assets if not already uploaded
function Upload-Asset([string]$filePath, [string]$contentType) {
    if (-not ($filePath -and (Test-Path $filePath))) { return }
    $name = [System.IO.Path]::GetFileName($filePath)
    $existingAsset = $release.assets | Where-Object { $_.name -eq $name }
    if ($existingAsset) {
        Write-Host "Asset $name already exists on release!"
    } else {
        $uploadUrl = $release.upload_url -replace '\{\?name,label\}', "?name=$name"
        Write-Host "Uploading $name to $uploadUrl..."
        $bytes = [System.IO.File]::ReadAllBytes($filePath)
        
        $uploadHeaders = @{
            "Authorization" = "Bearer $token"
            "Accept" = "application/vnd.github.v3+json"
            "User-Agent" = "STORM-Release-Manager"
            "Content-Type" = $contentType
        }

        $asset = Invoke-RestMethod -Uri $uploadUrl -Method Post -Headers $uploadHeaders -Body $bytes
        Write-Host "Asset $name uploaded! URL: $($asset.browser_download_url)"
    }
}

Upload-Asset $ApkPath "application/vnd.android.package-archive"
Upload-Asset $SetupPath "application/octet-stream"

Write-Host "All release operations completed successfully!"
