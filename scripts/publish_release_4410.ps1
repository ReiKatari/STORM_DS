# GitHub Release Publisher for STORM DS 4.4.10
param(
    [string]$TagName = "4.4.10",
    [string]$ReleaseName = "STORM DS 4.4.10",
    [string]$ApkPath = "E:\STORM DS\Files\STORM_DS_4.4.10.apk"
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

$bodyFile = Join-Path $PSScriptRoot "release_body_4410.md"
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
    } else {
        Write-Host "Creating release $TagName..."
        $postPayload = [ordered]@{
            tag_name = $TagName
            name = $ReleaseName
            body = $body
            draft = $false
            prerelease = $false
        } | ConvertTo-Json -Depth 5
        [System.IO.File]::WriteAllText($tmpPayloadFile, $postPayload, [System.Text.UTF8Encoding]::new($false))

        $resJson = & curl.exe -s -X POST `
            -H "Authorization: Bearer $token" `
            -H "Accept: application/vnd.github.v3+json" `
            -H "Content-Type: application/json; charset=utf-8" `
            -H "User-Agent: STORM-Release-Manager" `
            --data-binary "@$tmpPayloadFile" `
            "https://api.github.com/repos/$repo/releases"
        $release = $resJson | ConvertFrom-Json
    }
} finally {
    if (Test-Path $tmpPayloadFile) {
        Remove-Item -Force $tmpPayloadFile
    }
}

if (-not $release -or -not $release.id) {
    Write-Error "Failed to create/get release! Raw: $resJson"
    exit 1
}

Write-Host "Release ID: $($release.id)"
Write-Host "Upload URL: $($release.upload_url)"

# 2. Upload Asset (APK)
if (Test-Path $ApkPath) {
    $apkName = [System.IO.Path]::GetFileName($ApkPath)
    Write-Host "Checking existing assets for $apkName..."
    
    $existingAssets = Invoke-RestMethod -Uri "https://api.github.com/repos/$repo/releases/$($release.id)/assets" -Method Get -Headers $headers
    foreach ($asset in $existingAssets) {
        if ($asset.name -eq $apkName) {
            Write-Host "Deleting existing asset $($asset.id)..."
            Invoke-RestMethod -Uri "https://api.github.com/repos/$repo/releases/assets/$($asset.id)" -Method Delete -Headers $headers
        }
    }

    Write-Host "Uploading $apkName ($((Get-Item $ApkPath).Length) bytes)..."
    $cleanUploadUrl = $release.upload_url -replace '\{\?name,label\}', ''
    $uploadUri = "$cleanUploadUrl`?name=$apkName"

    $uploadHeaders = @{
        "Authorization" = "Bearer $token"
        "Content-Type" = "application/vnd.android.package-archive"
        "User-Agent" = "STORM-Release-Manager"
    }

    $uploadResult = Invoke-RestMethod -Uri $uploadUri -Method Post -Headers $uploadHeaders -InFile $ApkPath
    Write-Host "Asset uploaded successfully! Download URL: $($uploadResult.browser_download_url)"
} else {
    Write-Warning "APK not found at $ApkPath"
}

Write-Host "STORM DS 4.4.10 Release process completed successfully!"