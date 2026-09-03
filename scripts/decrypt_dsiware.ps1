# STORM DS - DSiWare Modcrypt Decryptor Utility
param(
    [string]$InputPath = "C:\Users\ReiKatari\Downloads\2141241242131\Dr. Mario Express [US] [ENG] (1.1) (1G).nds",
    [string]$OutputPath = ""
)

if (-not (Test-Path -LiteralPath $InputPath)) {
    Write-Error "File not found: $InputPath"
    exit 1
}

if ([string]::IsNullOrWhiteSpace($OutputPath)) {
    $dir = [System.IO.Path]::GetDirectoryName($InputPath)
    $name = [System.IO.Path]::GetFileNameWithoutExtension($InputPath)
    $ext = [System.IO.Path]::GetExtension($InputPath)
    $OutputPath = [System.IO.Path]::Combine($dir, "$name (Decrypted)$ext")
}

$csharp = @"
using System;
using System.IO;
using System.Security.Cryptography;

public class DSiDecryptor
{
    private static void ROL16(byte[] val, uint n)
    {
        uint n_coarse = n >> 3;
        uint n_fine = n & 7;
        byte[] tmp = new byte[16];
        for (uint i = 0; i < 16; i++) tmp[i] = val[(i - n_coarse) & 0xF];
        for (uint i = 0; i < 16; i++) val[i] = (byte)((tmp[i] << (int)n_fine) | (tmp[(i - 1) & 0xF] >> (int)(8 - n_fine)));
    }

    private static void DeriveNormalKey(byte[] keyX, byte[] keyY, byte[] normalkey)
    {
        byte[] key_const = new byte[16] {
            0xFF, 0xFE, 0xFB, 0x4E, 0x29, 0x59, 0x02, 0x58,
            0x2A, 0x68, 0x0F, 0x5F, 0x1A, 0x4F, 0x3E, 0x79
        };
        byte[] tmp = new byte[16];
        for (int i = 0; i < 16; i++) tmp[i] = (byte)(keyX[i] ^ keyY[i]);
        uint carry = 0;
        for (int i = 0; i < 16; i++)
        {
            uint res = (uint)tmp[i] + (uint)key_const[15 - i] + carry;
            tmp[i] = (byte)(res & 0xFF);
            carry = res >> 8;
        }
        ROL16(tmp, 42);
        Array.Copy(tmp, normalkey, 16);
    }

    private static void Bswap128(byte[] dst, byte[] src)
    {
        for (int i = 0; i < 16; i++) dst[i] = src[15 - i];
    }

    private static void IncCounter128(byte[] counter)
    {
        for (int i = 15; i >= 0; i--)
        {
            counter[i]++;
            if (counter[i] != 0) break;
        }
    }

    private static ushort CalcHeaderCRC16(byte[] data, int len)
    {
        ushort crc = 0xFFFF;
        for (int i = 0; i < len; i++)
        {
            crc ^= (ushort)data[i];
            for (int b = 0; b < 8; b++)
            {
                if ((crc & 1) != 0) crc = (ushort)((crc >> 1) ^ 0xA001);
                else crc >>= 1;
            }
        }
        return crc;
    }

    public static bool Decrypt(string inPath, string outPath)
    {
        byte[] rom = File.ReadAllBytes(inPath);
        if (rom.Length < 0x1000)
        {
            Console.WriteLine("Error: ROM is smaller than 4KB header");
            return false;
        }

        uint mod1Off  = BitConverter.ToUInt32(rom, 0x220);
        uint mod1Size = BitConverter.ToUInt32(rom, 0x224);
        uint mod2Off  = BitConverter.ToUInt32(rom, 0x228);
        uint mod2Size = BitConverter.ToUInt32(rom, 0x22C);

        Console.WriteLine(string.Format("Modcrypt 1: Offset=0x{0:X6}, Size=0x{1:X6}", mod1Off, mod1Size));
        Console.WriteLine(string.Format("Modcrypt 2: Offset=0x{0:X6}, Size=0x{1:X6}", mod2Off, mod2Size));

        if (mod1Size == 0 && mod2Size == 0)
        {
            Console.WriteLine("ROM does not specify any Modcrypt areas.");
            return false;
        }

        byte[] keyX = new byte[16];
        keyX[0] = 0x4E; keyX[1] = 0x69; keyX[2] = 0x6E; keyX[3] = 0x74;
        keyX[4] = 0x65; keyX[5] = 0x6E; keyX[6] = 0x64; keyX[7] = 0x6F;
        keyX[8]  = rom[0x0C + 0]; keyX[9]  = rom[0x0C + 1];
        keyX[10] = rom[0x0C + 2]; keyX[11] = rom[0x0C + 3];
        keyX[12] = rom[0x0C + 3]; keyX[13] = rom[0x0C + 2];
        keyX[14] = rom[0x0C + 1]; keyX[15] = rom[0x0C + 0];

        byte[] keyY = new byte[16];
        bool hasArm9iHash = false;
        for (int i = 0; i < 4; i++) { if (rom[0x350 + i] != 0) hasArm9iHash = true; }
        if (hasArm9iHash) Array.Copy(rom, 0x350, keyY, 0, 16);
        else Array.Copy(rom, 0x364, keyY, 0, 16);

        byte[] normalKey = new byte[16];
        DeriveNormalKey(keyX, keyY, normalKey);

        byte[] normalKeySwapped = new byte[16];
        Bswap128(normalKeySwapped, normalKey);

        using (var aes = Aes.Create())
        {
            aes.Mode = CipherMode.ECB;
            aes.Padding = PaddingMode.None;
            aes.Key = normalKeySwapped;

            using (var encryptor = aes.CreateEncryptor())
            {
                // Decrypt Area 1 (ARM9i)
                if (mod1Off > 0 && mod1Size > 0 && mod1Off + mod1Size <= rom.Length)
                {
                    Console.WriteLine("Decrypting Modcrypt Area 1 (ARM9i)...");
                    byte[] iv1 = new byte[16];
                    byte[] rawIv1 = new byte[16]; Array.Copy(rom, 0x300, rawIv1, 0, 16);
                    Bswap128(iv1, rawIv1);

                    byte[] counter = (byte[])iv1.Clone();
                    byte[] keystream = new byte[16];
                    byte[] block = new byte[16];
                    byte[] swapped = new byte[16];

                    for (uint i = 0; i < mod1Size; i += 16)
                    {
                        encryptor.TransformBlock(counter, 0, 16, keystream, 0);
                        IncCounter128(counter);

                        uint len = Math.Min(16, mod1Size - i);
                        Array.Clear(block, 0, 16);
                        Array.Copy(rom, mod1Off + i, block, 0, len);

                        Bswap128(swapped, block);
                        for (int k = 0; k < 16; k++) swapped[k] ^= keystream[k];
                        Bswap128(block, swapped);

                        Array.Copy(block, 0, rom, mod1Off + i, len);
                    }
                }

                // Decrypt Area 2 (ARM7i)
                if (mod2Off > 0 && mod2Size > 0 && mod2Off + mod2Size <= rom.Length)
                {
                    Console.WriteLine("Decrypting Modcrypt Area 2 (ARM7i)...");
                    byte[] iv2 = new byte[16];
                    byte[] rawIv2 = new byte[16]; Array.Copy(rom, 0x314, rawIv2, 0, 16);
                    Bswap128(iv2, rawIv2);

                    byte[] counter = (byte[])iv2.Clone();
                    byte[] keystream = new byte[16];
                    byte[] block = new byte[16];
                    byte[] swapped = new byte[16];

                    for (uint i = 0; i < mod2Size; i += 16)
                    {
                        encryptor.TransformBlock(counter, 0, 16, keystream, 0);
                        IncCounter128(counter);

                        uint len = Math.Min(16, mod2Size - i);
                        Array.Clear(block, 0, 16);
                        Array.Copy(rom, mod2Off + i, block, 0, len);

                        Bswap128(swapped, block);
                        for (int k = 0; k < 16; k++) swapped[k] ^= keystream[k];
                        Bswap128(block, swapped);

                        Array.Copy(block, 0, rom, mod2Off + i, len);
                    }
                }
            }
        }

        // Print first 4 words of both areas
        if (mod1Off > 0 && mod1Off + 16 <= rom.Length)
        {
            Console.WriteLine(string.Format("Area 1 decrypted words: 0x{0:X8}, 0x{1:X8}, 0x{2:X8}, 0x{3:X8}",
                BitConverter.ToUInt32(rom, (int)mod1Off),
                BitConverter.ToUInt32(rom, (int)mod1Off + 4),
                BitConverter.ToUInt32(rom, (int)mod1Off + 8),
                BitConverter.ToUInt32(rom, (int)mod1Off + 12)));
        }

        if (mod2Off > 0 && mod2Off + 16 <= rom.Length)
        {
            Console.WriteLine(string.Format("Area 2 decrypted words: 0x{0:X8}, 0x{1:X8}, 0x{2:X8}, 0x{3:X8}",
                BitConverter.ToUInt32(rom, (int)mod2Off),
                BitConverter.ToUInt32(rom, (int)mod2Off + 4),
                BitConverter.ToUInt32(rom, (int)mod2Off + 8),
                BitConverter.ToUInt32(rom, (int)mod2Off + 12)));
        }

        // Mark as decrypted in DSiCryptoFlags
        rom[0x1C] |= 0x03;

        // Recalculate header CRC16
        ushort crc = CalcHeaderCRC16(rom, 0x15E);
        rom[0x15E] = (byte)(crc & 0xFF);
        rom[0x15F] = (byte)((crc >> 8) & 0xFF);

        File.WriteAllBytes(outPath, rom);
        Console.WriteLine("Successfully saved decrypted ROM to: " + outPath);
        return true;
    }
}
"@

Add-Type -TypeDefinition $csharp -Language CSharp
$res = [DSiDecryptor]::Decrypt($InputPath, $OutputPath)
if ($res) {
    Write-Host "DECRYPTION COMPLETE!" -ForegroundColor Green
} else {
    Write-Host "DECRYPTION FAILED!" -ForegroundColor Red
}
