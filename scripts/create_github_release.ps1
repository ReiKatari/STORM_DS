# GitHub Release Publisher for STORM DS
param(
    [string]$TagName = "4.1.6",
    [string]$ReleaseName = "STORM DS 4.1.6",
    [string]$ApkPath = "E:\STORM DS\Files\STORM_DS_4.1.6.apk",
    [string]$SetupPath = "E:\STORM DS\Files\STORM_DSi_Decryptor_1.1.1_Setup.exe"
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
> 💡 **Релиз 4.1.6** — *Продвинутый эмулятор двухэкранных консолей Nintendo DS и Nintendo DSi для Android с аппаратным ускорением Vulkan, шейдерами librashader, интеллектуальной защитой сохранений и эталонной архитектурной поддержкой DSiWare.*

---

### 🚀 Ключевые изменения и улучшения
- 🌟 **[Ликвидация файлов-призраков (Ghost Saves Fix)]**: Полностью устранён двухсторонний цикл синхронизации хранилища, приводивший к воскрешению удалённых пользователем сохранений из внутреннего каталога `/data/data/.../files/saves`. Папка `/sdcard/STORM DS/saves/` стала единственным и непререкаемым источником сохранений, а устаревшие внутренние копии и файлы-призраки надёжно очищаются.
- 🌟 **[Автоочистка повреждённых сохранений и устранение белого экрана (Corrupted Save Auto-Cleanup)]**: Внедрена строгая валидация структуры FAT12 для сохранений DSiWare (проверка загрузочного сектора `0x55 0xAA`, перехода `0xEB`/`0xE9`, таблиц FAT и дескриптора `0xF8`). При обнаружении 0-байтовых или повреждённых старыми версиями файлов эмулятор автоматически генерирует и экспортирует чистое валидное сохранение из NAND, предотвращая зависание на белом экране при старте. Реальные валидные сохранения пользователя гарантированно сохраняются.
- 🌟 **[Чистота каталога сохранений]**: Полностью исключено создание теневых дубликатов `.sav.bak` и `.srm.bak` в пользовательской папке сохранений, а все старые и нулевые артефакты автоматически вычищаются.
- 🌟 **[Безопасная очистка кеша nds-bootstrap]**: Добавлена интеллектуальная очистка устаревших и повреждённых файлов кеша `fatTableCache` и `patchOffsetCache` для совместимости с физическими консолями и TWiLight Menu++ без риска повреждения реальных сохранений.

<details>
<summary><b>📋 Полный список изменений (нажмите, чтобы развернуть)</b></summary>

- 🔹 **[Синхронизация сохранений]**: Отключено обратное копирование `savesDir` во внутреннюю память приложения, гарантируя сохранность действий пользователя при ручном удалении файлов.
- 🔹 **[Защита от 0-байтовых файлов]**: В `AndroidDSiNandManager` экспорт и импорт переведены на промежуточный безопасный буфер — создание пустых 0-байтовых файлов `.sav` при сбоях полностью исключено.
- 🔹 **[Проверка целостности FAT12]**: Автоматическое распознавание повреждённых файлов сохранений DSiWare и их безопасное переформатирование через `repairTitleSaves` в NAND.
- 🔹 **[SramProvider]**: Автоматическое удаление пустых 0-байтовых заглушек при открытии сохранений стандартных DS и DSi игр.
- 🔹 **[Совместимость с консолями]**: Автоматическая очистка устаревшего кеша смещений и таблиц FAT в каталоге `_nds/nds-bootstrap` при наличии.
- 🔹 **[STORM DSi Decryptor 1.1.1]**: Комплектация инсталлятором утилиты дешифрования 1.1.1 со 100% побайтовым совпадением расшифрованных образов и исправленным интерфейсом.
- 🔹 **[Пакеты установки]**: Сборка релизного APK `STORM_DS_4.1.6.apk` и полнофункционального автономного инсталлятора `STORM_DSi_Decryptor_1.1.1_Setup.exe`.

</details>

<details>
<summary><b>🌐 English Changelog (click to expand)</b></summary>

- 🔸 **[Ghost Saves Resurrection Eliminated]**: Fixed two-way storage synchronization loop where deleted user saves were being restored from internal `/data/data/.../files/saves`. The user-accessible `/sdcard/STORM DS/saves/` directory is now the single source of truth, and stale internal ghost files are purged.
- 🔸 **[Corrupted Save Auto-Cleanup and White Screen Boot Fix]**: Introduced comprehensive FAT12 integrity verification for DSiWare public/private saves (`0x55 0xAA` signature, `0xEB`/`0xE9` boot jmp, FAT count, media descriptor `0xF8`). If a 0-byte or corrupted save from previous aborted launches is detected, the emulator automatically formats and exports a fresh, valid FAT12 filesystem from NAND, preventing white screen freezes. Real valid user progress is 100% protected and preserved.
- 🔸 **[Clean Saves Folder Architecture]**: Eradicated in-place `.sav.bak` and `.srm.bak` duplicates from cluttering the user saves folder; stray 0-byte stubs are cleanly purged.
- 🔸 **[nds-bootstrap Stale Cache Maintenance]**: Added safe purging of outdated and zero-byte cache files in `_nds/nds-bootstrap/fatTableCache` and `patchOffsetCache` without touching real save files.
- 🔸 **[STORM DSi Decryptor 1.1.1 Included]**: Bundled with the updated standalone desktop decryptor featuring bit-exact Modcrypt decryption and modernized UI.

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
