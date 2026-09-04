# GitHub Release Publisher for STORM DS
param(
    [string]$TagName = "4.1.5",
    [string]$ReleaseName = "STORM DS 4.1.5",
    [string]$ApkPath = "E:\STORM DS\Files\STORM_DS_4.1.5.apk",
    [string]$SetupPath = "E:\STORM DS\Files\STORM_DSi_Decryptor_1.0.4_Setup.exe"
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
> 💡 **Релиз 4.1.5** — *Продвинутый эмулятор двухэкранных консолей Nintendo DS и Nintendo DSi для Android с аппаратным ускорением Vulkan, шейдерами librashader и эталонной архитектурной поддержкой DSiWare.*

---

### 🚀 Ключевые изменения и улучшения
- 🌟 **[Восстановление эталонного ядра melonDS (база 4.1.1)]**: Выполнен полный побайтовый откат ядра эмуляции DSi к стабильному эталону релиза 4.1.1. Восстановлена генерация системной таблицы накопителей SD/MMC Device List в памяти ARM7 (спецификация GBATEK `carthdr[1D4h]`) и контекста установленных приложений DSi OS (`0x02FFD800`, `0x02FFD840`, `0x02FFD850`), что устраняет зависания на белом экране в *Dr. Mario Express*, *SteamWorld Tower Defense*, *Castle of Magic* и *Gangstar 2*.
- 🌟 **[STORM DSi Decryptor 1.0.4 — Безупречный Drag and Drop]**: Полная переработка архитектуры перетаскивания: сквозная обработка `PreviewDragOver` / `PreviewDrop` на корневом уровне окна, контейнере `DropZone` и таблицах `DataGrid`, а также системная поддержка `WM_DROPFILES` через `ChangeWindowMessageFilterEx` и запуск приложения из инсталлятора через оболочку проводника для обхода ограничений UIPI.
- 🌟 **[Точное определение статуса расшифрованных игр]**: Реализован гибридный статистический алгоритм детекции (анализ энтропии нулей по эталону melonDS и пробное дешифрование блока AES-CTR). Расшифрованные игры (`... (Decrypted).nds`) теперь безошибочно определяются как «Расшифрован (Готов)» без ложных срабатываний.
- 🌟 **[Стилизованная история операций и обнаружение дубликатов]**: В утилиту внедрена вкладка «История операций» с сохранением в `%APPDATA%\STORM DSi Decryptor\history.json`, поддержкой полной очистки, выборочного удаления (DEL) и перехода к файлам в проводнике.

<details>
<summary><b>📋 Полный список изменений (нажмите, чтобы развернуть)</b></summary>

- 🔹 **[Ядро эмулятора DSi]**: Чистый откат `DSi.cpp`, `RomDecryptor.cpp`, `FileSystemRomsRepository.kt` и `EmulatorLaunchPreconditionChecker.kt` к эталону 4.1.1.
- 🔹 **[SD/MMC Device List]**: Полноценная регистрация виртуальных устройств `'A'`..`'I'`, включая точки монтирования `dataPub` (`nand:/title/.../data/public.sav`) и `dataPrv`.
- 🔹 **[STORM DSi Decryptor]**: Обновление до версии 1.0.4. Добавлены вкладки переключения между очередью обработки и историей, стилизованный диалог проверки дубликатов, расширенный список визуальных тем.
- 🔹 **[Локализация]**: 100% локализация интерфейса и диалогов истории на 6 языках: русский, английский, немецкий, французский, китайский, японский.
- 🔹 **[Пакеты установки]**: Сборка релизного APK `STORM_DS_4.1.5.apk` и полнофункционального автономного инсталлятора `STORM_DSi_Decryptor_1.0.4_Setup.exe`.

</details>

<details>
<summary><b>🌐 English Changelog (click to expand)</b></summary>

- 🔸 **[melonDS DSi Core Restored to 4.1.1 Golden Baseline]**: Restored exact 4.1.1 DSi core architecture. SD/MMC Device List in ARM7 memory (`carthdr[1D4h]`) and DSi OS application context (`0x02FFD800`, `0x02FFD840`, `0x02FFD850`) properly initialized, resolving white/black screen hangs on *Dr. Mario Express*, *SteamWorld Tower Defense*, *Castle of Magic*, and *Gangstar 2*.
- 🔸 **[STORM DSi Decryptor 1.0.4 — Seamless Drag and Drop]**: Integrated root-level tunneling `PreviewDragOver` / `PreviewDrop` alongside `WM_DROPFILES` message filters bypassing UIPI integrity restrictions. The installer now spawns the application via Windows Explorer shell, ensuring flawless drag-and-drop from Explorer.
- 🔸 **[Decrypted ROM Detection Fix]**: Multi-tier detection algorithm combining statistical zero-entropy analysis, AES-CTR trial block decryption, and session history prevents already-decrypted ROMs (`(Decrypted).nds`) from being falsely flagged as encrypted.
- 🔸 **[Operation History and Duplicate Detection]**: Added a dedicated History tab with persistent `%APPDATA%\STORM DSi Decryptor\history.json` storage, clear/delete capabilities, and an intelligent duplicate prompt dialog offering skip or reprocess options with batch support.

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
$tmpPayloadFile = [System.IO.Path]::GetTempFileName()
try {
    Write-Host "Checking if release $TagName exists..."
    $release = Invoke-RestMethod -Uri "https://api.github.com/repos/$repo/releases/tags/$TagName" -Method Get -Headers $headers -ErrorAction Stop
    Write-Host "Release already exists with ID $($release.id). Updating title and body..."
    
    $patchPayload = [ordered]@{
        name = $ReleaseName
        body = $body
    } | ConvertTo-Json -Depth 5
    [System.IO.File]::WriteAllText($tmpPayloadFile, $patchPayload, [System.Text.UTF8Encoding]::new($false))

    $resJson = & curl.exe -s -X PATCH `
        -H "Authorization: Bearer $token" `
        -H "Accept: application/vnd.github.v3+json" `
        -H "Content-Type: application/json; charset=utf-8" `
        -H "User-Agent: STORM-Release-Manager" `
        --data-binary "@$tmpPayloadFile" `
        "https://api.github.com/repos/$repo/releases/$($release.id)"
    $release = $resJson | ConvertFrom-Json
    Write-Host "Release details updated successfully! Name: $($release.name)"
} catch {
    Write-Host "Release does not exist, creating..."
    $payload = [ordered]@{
        tag_name = $TagName
        name = $ReleaseName
        body = $body
        draft = $false
        prerelease = $false
    } | ConvertTo-Json -Depth 5
    [System.IO.File]::WriteAllText($tmpPayloadFile, $payload, [System.Text.UTF8Encoding]::new($false))

    $resJson = & curl.exe -s -X POST `
        -H "Authorization: Bearer $token" `
        -H "Accept: application/vnd.github.v3+json" `
        -H "Content-Type: application/json; charset=utf-8" `
        -H "User-Agent: STORM-Release-Manager" `
        --data-binary "@$tmpPayloadFile" `
        "https://api.github.com/repos/$repo/releases"
    $release = $resJson | ConvertFrom-Json
    Write-Host "Release created successfully! ID: $($release.id)"
} finally {
    if (Test-Path $tmpPayloadFile) { Remove-Item -Force $tmpPayloadFile }
}

# 2. Upload Assets if not already uploaded
function Upload-Asset([string]$filePath, [string]$contentType) {
    if (-not ($filePath -and (Test-Path $filePath))) { return }
    $name = [System.IO.Path]::GetFileName($filePath)
    $existingAsset = $release.assets | Where-Object { $_.name -eq $name }
    if ($existingAsset) {
        Write-Host "Deleting existing asset $name (ID: $($existingAsset.id)) to ensure clean update..."
        try {
            Invoke-RestMethod -Uri "https://api.github.com/repos/$repo/releases/assets/$($existingAsset.id)" -Method Delete -Headers $headers
            Write-Host "Old asset deleted."
        } catch {
            Write-Host "Failed to delete old asset: $_"
        }
    }

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
    Write-Host "Asset $name uploaded successfully! URL: $($asset.browser_download_url)"
}

Upload-Asset $ApkPath "application/vnd.android.package-archive"
Upload-Asset $SetupPath "application/octet-stream"

Write-Host "All release operations completed successfully!"
