$files = @(
    'Castle of Magic (USA).nds',
    'Dr. Mario Express [US] [ENG] (1.1) (1G).nds',
    'Gangstar 2 - Kings of L.A. (USA).nds',
    'Soul of Darkness (USA).nds',
    'SteamWorld Tower Defense [US] [ENG] (1.0) (1G).nds'
)
$folder = 'C:\Users\ReiKatari\Downloads\2141241242131'

foreach ($f in $files) {
    $path = Join-Path $folder $f
    $bytes = [System.IO.File]::ReadAllBytes($path)
    $title = [System.Text.Encoding]::ASCII.GetString($bytes, 0, 12).Trim([char]0)
    $code = [System.Text.Encoding]::ASCII.GetString($bytes, 0x0C, 4)
    $unitCode = $bytes[0x12]
    $cryptoFlags = $bytes[0x1C]
    $appFlags = $bytes[0x1D]
    
    $arm9Off = [BitConverter]::ToUInt32($bytes, 0x20)
    $arm9Entry = [BitConverter]::ToUInt32($bytes, 0x24)
    $arm9Ram = [BitConverter]::ToUInt32($bytes, 0x28)
    $arm9Sz = [BitConverter]::ToUInt32($bytes, 0x2C)
    
    $arm7Off = [BitConverter]::ToUInt32($bytes, 0x30)
    $arm7Entry = [BitConverter]::ToUInt32($bytes, 0x34)
    $arm7Ram = [BitConverter]::ToUInt32($bytes, 0x38)
    $arm7Sz = [BitConverter]::ToUInt32($bytes, 0x3C)
    
    $dsi9Off = [BitConverter]::ToUInt32($bytes, 0x1C0)
    $dsi9Entry = [BitConverter]::ToUInt32($bytes, 0x1C4)
    $dsi9Ram = [BitConverter]::ToUInt32($bytes, 0x1C8)
    $dsi9Sz = [BitConverter]::ToUInt32($bytes, 0x1CC)
    
    $dsi7Off = [BitConverter]::ToUInt32($bytes, 0x1D0)
    $dsi7Entry = [BitConverter]::ToUInt32($bytes, 0x1D4)
    $dsi7Ram = [BitConverter]::ToUInt32($bytes, 0x1D8)
    $dsi7Sz = [BitConverter]::ToUInt32($bytes, 0x1DC)
    
    $mod1Off = [BitConverter]::ToUInt32($bytes, 0x220)
    $mod1Sz = [BitConverter]::ToUInt32($bytes, 0x224)
    $mod2Off = [BitConverter]::ToUInt32($bytes, 0x228)
    $mod2Sz = [BitConverter]::ToUInt32($bytes, 0x22C)
    
    $titleIdLow = [BitConverter]::ToUInt32($bytes, 0x230)
    $titleIdHigh = [BitConverter]::ToUInt32($bytes, 0x234)
    $publicSavSz = [BitConverter]::ToUInt32($bytes, 0x238)
    $privateSavSz = [BitConverter]::ToUInt32($bytes, 0x23C)
    
    Write-Host ("=== {0} ===" -f $f)
    Write-Host ("  File Size: {0} bytes" -f $bytes.Length)
    Write-Host ("  Game Title: {0} | Code: {1}" -f $title, $code)
    Write-Host ("  UnitCode: 0x{0:X2} | CryptoFlags (0x1C): 0x{1:X2} | AppFlags (0x1D): 0x{2:X2}" -f $unitCode, $cryptoFlags, $appFlags)
    Write-Host ("  ARM9: off=0x{0:X}, entry=0x{1:X}, ram=0x{2:X}, size=0x{3:X}" -f $arm9Off, $arm9Entry, $arm9Ram, $arm9Sz)
    Write-Host ("  ARM7: off=0x{0:X}, entry=0x{1:X}, ram=0x{2:X}, size=0x{3:X}" -f $arm7Off, $arm7Entry, $arm7Ram, $arm7Sz)
    Write-Host ("  DSi ARM9i: off=0x{0:X}, entry=0x{1:X}, ram=0x{2:X}, size=0x{3:X}" -f $dsi9Off, $dsi9Entry, $dsi9Ram, $dsi9Sz)
    Write-Host ("  DSi ARM7i: off=0x{0:X}, entry=0x{1:X}, ram=0x{2:X}, size=0x{3:X}" -f $dsi7Off, $dsi7Entry, $dsi7Ram, $dsi7Sz)
    Write-Host ("  TitleID: 0x{0:X8}:0x{1:X8}" -f $titleIdHigh, $titleIdLow)
    Write-Host ("  Modcrypt1: off=0x{0:X}, size=0x{1:X} | Modcrypt2: off=0x{2:X}, size=0x{3:X}" -f $mod1Off, $mod1Sz, $mod2Off, $mod2Sz)
    Write-Host ("  PublicSavSize: 0x{0:X} ({0} bytes) | PrivateSavSize: 0x{1:X} ({1} bytes)" -f $publicSavSz, $privateSavSz)
    Write-Host ""
}
