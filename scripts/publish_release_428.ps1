# GitHub Release Publisher for STORM DS 4.2.8
param(
    [string]$TagName = "4.2.8",
    [string]$ReleaseName = "STORM DS 4.2.8",
    [string]$ApkPath = "E:\STORM DS\Files\STORM_DS_4.2.8.apk"
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

$bodyFile = Join-Path $PSScriptRoot "release_body_428.md"
$body = [System.IO.File]::ReadAllText($bodyFile, [System.Text.Encoding]::UTF8)

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
} catch {
    $release = $null
}

$tmpPayloadFile = [System.IO.Path]::GetTempFileName()
try {
    if ($release -and $release.id) {
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
    } else {
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
    }
} finally {
    if (Test-Path $tmpPayloadFile) { Remove-Item -Force $tmpPayloadFile }
}

# 2. Upload Assets (Only APK)
function Upload-Asset([string]$filePath, [string]$contentType) {
    if (-not ($filePath -and (Test-Path $filePath))) { 
        Write-Error "File not found: $filePath"
        return 
    }
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

Write-Host "All GitHub release operations completed successfully for STORM DS 4.2.8!"
