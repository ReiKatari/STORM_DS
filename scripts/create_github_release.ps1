# GitHub Release Publisher for STORM DS
param(
    [string]$TagName = "4.1.2",
    [string]$ReleaseName = "Релиз 4.1.2",
    [string]$ApkPath = "E:\STORM DS\Files\STORM_DS_4.1.2.apk"
)

$inputData = "protocol=https`nhost=github.com`n`n"
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

$body = @"
> 💡 **Релиз 4.1.2** — *Продвинутый эмулятор двухэкранных консолей Nintendo DS и Nintendo DSi для Android с аппаратным ускорением Vulkan, шейдерами librashader и автоматической поддержкой DSiWare.*

---

### 🚀 Ключевые изменения и улучшения
- 🌟 **[DSiWare Auto-Decryption]**: Внедрена встроенная автоматическая in-place расшифровка Modcrypt для ROM-файлов Nintendo DSi и DSiWare (`.nds`, `.dsi`, `.app`). Больше не требуется предварительно дешифровать файлы на ПК!
- 🌟 **[Фоновая обработка медиатеки]**: Автоматическое обнаружение и безопасная расшифровка зашифрованных образов при стартовом сканировании директорий и добавлении новых игр с сохранением контрольных сумм заголовка.
- 🌟 **[Pre-Launch Boot Guard]**: Превентивная проверка и дешифровка непосредственно перед передачей в ядро (`loadRom` / `loadDsiWare`) и зеркалированием в виртуальный NAND.

<details>
<summary><b>📋 Полный список изменений (нажмите, чтобы развернуть)</b></summary>

- 🔹 **[Modcrypt Key Derivation]**: Адаптивный fallback получения ключей KeyY между хешами ARM9i и ARM7i в нативном модуле `RomDecryptor.cpp` для полной совместимости с различными дампами.
- 🔹 **[FileSystemRomsRepository]**: Асинхронное сканирование кэшированных тайтлов в фоновом пуле корутин без блокировки пользовательского интерфейса.
- 🔹 **[EmulatorLaunchPreconditionChecker]**: Предупреждение сбоев прошивки DSi путем превентивной in-place расшифровки прямо на накопителе устройства.
- 🔹 **[AndroidEmulatorManager]**: Защита прямого запуска (Direct Boot) от повреждений контекста системной памяти DSiWare.
- 🔹 **[Версионирование]**: Обновлен номер версии до 4.1.2 (версионный код 412).

</details>

<details>
<summary><b>🌐 English Changelog (click to expand)</b></summary>

- 🔸 **[Automatic In-Place Decryption]**: Implemented native automatic Modcrypt decryption for Nintendo DSi and DSiWare ROMs (`.nds`, `.dsi`, `.app`), removing the need for external PC decryption.
- 🔸 **[Background Library Indexing]**: Encrypted titles are seamlessly discovered and decrypted in the background upon addition or startup scan.
- 🔸 **[Pre-Launch Boot Guard]**: Verifies encryption status right before launching and decrypts directly on storage before loading into NAND/emulation core.
- 🔸 **[Modcrypt Key Fallback]**: Adaptive KeyY calculation in `RomDecryptor.cpp` between ARM9i and ARM7i hashes.

</details>

<details>
<summary><b>📦 Файлы и вложения к релизу (нажмите, чтобы развернуть)</b></summary>

- 📁 **Прикреплённые файлы**: Исполняемые файлы, инсталляторы и архивы доступны в секции **Assets** ниже.
- 🛡️ **Контроль целостности**: Все бинарные файлы собраны из официального исходного кода и проверены перед публикацией.
- 💻 **Установка**: Скачайте соответствующий архив/инсталлятор из списка Assets и следуйте стандартным инструкциям.

</details>
"@

$headers = @{
    "Authorization" = "Bearer $token"
    "Accept" = "application/vnd.github.v3+json"
    "User-Agent" = "STORM-Release-Manager"
}

# 1. Create or get existing release
$release = $null
try {
    Write-Host "Checking if release $TagName exists..."
    $release = Invoke-RestMethod -Uri "https://api.github.com/repos/$repo/releases/tags/$TagName" -Method Get -Headers $headers -ErrorAction Stop
    Write-Host "Release already exists with ID $($release.id)"
} catch {
    Write-Host "Release does not exist, creating..."
    $payload = @{
        tag_name = $TagName
        name = $ReleaseName
        body = $body
        draft = $false
        prerelease = $false
    } | ConvertTo-Json -Depth 5

    $release = Invoke-RestMethod -Uri "https://api.github.com/repos/$repo/releases" -Method Post -Headers $headers -Body $payload -ContentType "application/json; charset=utf-8"
    Write-Host "Release created successfully! ID: $($release.id)"
}

# 2. Upload APK Asset if not already uploaded
if ($ApkPath -and (Test-Path $ApkPath)) {
    $apkName = [System.IO.Path]::GetFileName($ApkPath)
    $existingAsset = $release.assets | Where-Object { $_.name -eq $apkName }
    if ($existingAsset) {
        Write-Host "Asset $apkName already exists on release!"
    } else {
        $uploadUrl = $release.upload_url -replace '\{\?name,label\}', "?name=$apkName"
        Write-Host "Uploading $apkName to $uploadUrl..."
        $apkBytes = [System.IO.File]::ReadAllBytes($ApkPath)
        
        $uploadHeaders = @{
            "Authorization" = "Bearer $token"
            "Accept" = "application/vnd.github.v3+json"
            "User-Agent" = "STORM-Release-Manager"
            "Content-Type" = "application/vnd.android.package-archive"
        }

        $asset = Invoke-RestMethod -Uri $uploadUrl -Method Post -Headers $uploadHeaders -Body $apkBytes
        Write-Host "Asset uploaded! URL: $($asset.browser_download_url)"
    }
}

Write-Host "All release operations completed successfully!"
