# STORM DS - Windows x64 Release Build & StormInstaller Packaging (Low-CPU Compliant)
$ErrorActionPreference = "Stop"
[System.Diagnostics.Process]::GetCurrentProcess().PriorityClass = [System.Diagnostics.ProcessPriorityClass]::BelowNormal

$multiplatformDir = $PSScriptRoot
if (-not $multiplatformDir) { $multiplatformDir = "f:\STORM DS\multiplatform" }
$repoRoot = Split-Path $multiplatformDir -Parent
$desktopProj = Join-Path $multiplatformDir "src\StormDs.Desktop\StormDs.Desktop.csproj"
$installerProj = Join-Path $multiplatformDir "installer\StormDs.Installer.csproj"
$installerDir = Join-Path $multiplatformDir "installer"
$payloadZip = Join-Path $installerDir "Payload\Payload.zip"
$filesDir = Join-Path $repoRoot "Files"

if (-not (Test-Path $filesDir)) { New-Item -ItemType Directory -Path $filesDir | Out-Null }
if (-not (Test-Path (Join-Path $installerDir "Payload"))) { New-Item -ItemType Directory -Path (Join-Path $installerDir "Payload") | Out-Null }

$appVersion = "8.9.6"
try {
    [xml]$projXml = Get-Content $desktopProj
    $verNode = ($projXml.Project.PropertyGroup | ForEach-Object { $_.Version } | Where-Object { $_ } | Select-Object -First 1)
    if ($verNode) { $appVersion = ([string]$verNode).Trim().TrimStart('v', 'V') }
} catch { }

Write-Host "=== STORM DS $appVersion Windows x64 Build & Pack ===" -ForegroundColor Cyan

# Step 0: Release locks on any running instances
foreach ($proc in @("STORM DS", "StormDs.Desktop", "StormInstaller")) {
    Get-Process -Name $proc -ErrorAction SilentlyContinue | Stop-Process -Force -ErrorAction SilentlyContinue
}
Start-Sleep -Milliseconds 500

# Step 1: Publish self-contained win-x64 StormDs.Desktop
$appPublishDir = Join-Path $multiplatformDir "src\StormDs.Desktop\bin\Release\net10.0\win-x64\publish"
if (Test-Path $appPublishDir) { Remove-Item $appPublishDir -Recurse -Force -ErrorAction SilentlyContinue }

Write-Host "[1/5] Publishing StormDs.Desktop (net10.0 win-x64, Low-CPU -m:2)..." -ForegroundColor Yellow
& dotnet publish $desktopProj -c Release -r win-x64 --self-contained true -m:2 /nr:false
if ($LASTEXITCODE -ne 0) { throw "StormDs.Desktop publish failed with exit code $LASTEXITCODE" }

$appExe = Join-Path $appPublishDir "STORM DS.exe"
$appDll = Join-Path $appPublishDir "STORM DS.dll"
$coreDll = Join-Path $appPublishDir "storm_ds_core.dll"
if (-not (Test-Path $appExe)) { throw "Missing published executable: $appExe" }
if (-not (Test-Path $coreDll)) { throw "Missing native core in publish dir: $coreDll" }

# Step 2: Locate CN=STORM TEAM Master Certificate & Sign Binaries
Write-Host "[2/5] Signing desktop binaries with CN=STORM TEAM certificate..." -ForegroundColor Yellow
$cert = Get-ChildItem Cert:\CurrentUser\My, Cert:\LocalMachine\My -ErrorAction SilentlyContinue |
    Where-Object { $_.HasPrivateKey -and $_.Subject -like "*CN=STORM TEAM*" } |
    Select-Object -First 1
if (-not $cert) {
    throw "CRITICAL ERROR: CN=STORM TEAM Master Certificate with private key not found in CurrentUser\My or LocalMachine\My!"
}
$certThumb = $cert.Thumbprint
Write-Host "  Certificate: $($cert.Subject) [$certThumb]" -ForegroundColor Green

$cerInstaller = Join-Path $installerDir "STORM_Certificate.cer"
[System.IO.File]::WriteAllBytes($cerInstaller, $cert.Export([System.Security.Cryptography.X509Certificates.X509ContentType]::Cert))
Copy-Item $cerInstaller (Join-Path $appPublishDir "STORM_Certificate.cer") -Force

$signtool = Get-ChildItem "C:\Program Files (x86)\Windows Kits\10\bin\*\x64\signtool.exe" -ErrorAction SilentlyContinue |
    Sort-Object FullName -Descending |
    Select-Object -First 1 -ExpandProperty FullName
if (-not $signtool -or -not (Test-Path $signtool)) {
    throw "signtool.exe not found under Windows Kits 10!"
}

function Invoke-StormSign([string]$TargetPath) {
    $tsUrls = @(
        "http://timestamp.digicert.com",
        "http://timestamp.sectigo.com",
        "http://tsa.starfieldtech.com",
        "http://timestamp.entrust.net/TSS/RFC3161sha2TS"
    )
    $signed = $false
    foreach ($ts in $tsUrls) {
        for ($attempt = 1; $attempt -le 2; $attempt++) {
            & $signtool sign /fd SHA256 /tr $ts /td SHA256 /d "STORM DS" /du "https://github.com/ReiKatari/STORM_DS" /sha1 $certThumb $TargetPath
            if ($LASTEXITCODE -eq 0) {
                $signed = $true
                break
            }
            Start-Sleep -Milliseconds 500
        }
        if ($signed) { break }
    }
    if (-not $signed) {
        Write-Warning "Timestamp signing failed for $TargetPath, signing without timestamp..."
        & $signtool sign /fd SHA256 /d "STORM DS" /du "https://github.com/ReiKatari/STORM_DS" /sha1 $certThumb $TargetPath
        if ($LASTEXITCODE -ne 0) { throw "signtool failed for $TargetPath" }
    }
}

Get-ChildItem $appPublishDir -Recurse -File | Unblock-File -ErrorAction SilentlyContinue
Invoke-StormSign $appExe
if (Test-Path $appDll) { Invoke-StormSign $appDll }
Invoke-StormSign $coreDll

# Step 3: Package Portable ZIP and Payload.zip
Write-Host "[3/5] Packaging Portable ZIP and installer Payload.zip..." -ForegroundColor Yellow
$portableZip = Join-Path $filesDir "STORM_DS_${appVersion}_Windows.zip"
if (Test-Path $portableZip) { Remove-Item $portableZip -Force }
if (Test-Path $payloadZip) { Remove-Item $payloadZip -Force }

Add-Type -AssemblyName System.IO.Compression.FileSystem
[System.IO.Compression.ZipFile]::CreateFromDirectory(
    $appPublishDir,
    $portableZip,
    [System.IO.Compression.CompressionLevel]::Optimal,
    $false
)
Copy-Item $portableZip $payloadZip -Force

# Step 4: Publish StormDs.Installer (WinForms Cyber Dark Single-File win-x64)
Write-Host "[4/5] Publishing StormInstaller (WinForms Cyber Dark win-x64)..." -ForegroundColor Yellow
$instPublishDir = Join-Path $installerDir "bin\Release\net10.0-windows\win-x64\publish"
if (Test-Path $instPublishDir) { Remove-Item $instPublishDir -Recurse -Force -ErrorAction SilentlyContinue }

& dotnet publish $installerProj -c Release -r win-x64 --self-contained true -p:PublishSingleFile=true -p:IncludeNativeLibrariesForSelfExtract=true -p:EnableCompressionInSingleFile=true -m:2 /nr:false
if ($LASTEXITCODE -ne 0) { throw "StormDs.Installer publish failed with exit code $LASTEXITCODE" }

$builtSetup = Join-Path $instPublishDir "StormInstaller.exe"
if (-not (Test-Path $builtSetup)) { throw "Built installer not found: $builtSetup" }

# Step 5: Copy to Files and Sign STORM_DS_<ver>_Setup.exe
$setupDest = Join-Path $filesDir "STORM_DS_${appVersion}_Setup.exe"
Copy-Item $builtSetup $setupDest -Force
Unblock-File -Path $setupDest -ErrorAction SilentlyContinue
Invoke-StormSign $setupDest
Unblock-File -Path $setupDest -ErrorAction SilentlyContinue

Write-Host "=== DONE ===" -ForegroundColor Green
Write-Host "Setup:    $setupDest" -ForegroundColor Green
Write-Host "Portable: $portableZip" -ForegroundColor Green
