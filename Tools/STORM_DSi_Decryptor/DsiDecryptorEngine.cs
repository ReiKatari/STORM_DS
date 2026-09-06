using System;
using System.IO;
using System.Security.Cryptography;

namespace StormDsiDecryptor;

public class RomInfo
{
    public string FilePath { get; set; } = string.Empty;
    public string FileName { get; set; } = string.Empty;
    public string GameTitle { get; set; } = string.Empty;
    public string GameCode { get; set; } = string.Empty;
    public long FileSize { get; set; }
    public bool IsDsiRom { get; set; }
    public bool HasModcrypt { get; set; }
    public bool IsEncrypted { get; set; }
    public bool NeedsCompatibilityPatch { get; set; }
    public uint Modcrypt1Offset { get; set; }
    public uint Modcrypt1Size { get; set; }
    public uint Modcrypt2Offset { get; set; }
    public uint Modcrypt2Size { get; set; }
}

public static class DsiDecryptorEngine
{
    private static void ROL16(byte[] val, int n)
    {
        int n_coarse = n >> 3;
        int n_fine = n & 7;
        byte[] tmp = new byte[16];
        for (int i = 0; i < 16; i++)
            tmp[i] = val[(i - n_coarse) & 0xF];
        for (int i = 0; i < 16; i++)
            val[i] = (byte)((tmp[i] << n_fine) | (tmp[(i - 1) & 0xF] >> (8 - n_fine)));
    }

    public static byte[] DeriveNormalKey(byte[] keyX, byte[] keyY)
    {
        byte[] keyConst = new byte[] {
            0xFF, 0xFE, 0xFB, 0x4E, 0x29, 0x59, 0x02, 0x58,
            0x2A, 0x68, 0x0F, 0x5F, 0x1A, 0x4F, 0x3E, 0x79
        };
        byte[] tmp = new byte[16];
        for (int i = 0; i < 16; i++)
            tmp[i] = (byte)(keyX[i] ^ keyY[i]);

        uint carry = 0;
        for (int i = 0; i < 16; i++)
        {
            uint res = (uint)(tmp[i] + keyConst[15 - i] + carry);
            tmp[i] = (byte)(res & 0xFF);
            carry = res >> 8;
        }

        ROL16(tmp, 42);
        return tmp;
    }

    private static void AddCtr(byte[] ctr, uint carry)
    {
        uint[] counter = new uint[4];
        for (int i = 0; i < 4; i++)
            counter[i] = ((uint)ctr[i * 4 + 0] << 24) | ((uint)ctr[i * 4 + 1] << 16) |
                         ((uint)ctr[i * 4 + 2] << 8) | (uint)ctr[i * 4 + 3];

        for (int i = 3; i >= 0; i--)
        {
            ulong sum = (ulong)counter[i] + carry;
            carry = (uint)(sum >> 32);
            counter[i] = (uint)sum;
        }

        for (int i = 0; i < 4; i++)
        {
            ctr[i * 4 + 0] = (byte)(counter[i] >> 24);
            ctr[i * 4 + 1] = (byte)(counter[i] >> 16);
            ctr[i * 4 + 2] = (byte)(counter[i] >> 8);
            ctr[i * 4 + 3] = (byte)(counter[i] >> 0);
        }
    }

    public static void CryptArea(Aes aes, byte[] ctrInit, byte[] rom, uint offset, uint size)
    {
        byte[] ctr = new byte[16];
        for (int i = 0; i < 16; i++)
            ctr[i] = ctrInit[15 - i];

        byte[] stream = new byte[16];
        using var encryptor = aes.CreateEncryptor();

        for (uint i = 0; i < size; i += 16)
        {
            encryptor.TransformBlock(ctr, 0, 16, stream, 0);

            uint blockLen = Math.Min(16, size - i);
            for (uint b = 0; b < blockLen; b++)
            {
                rom[offset + i + b] ^= stream[15 - b];
            }

            AddCtr(ctr, 1);
        }
    }

    public static byte[] BuildKeyX(byte[] header)
    {
        byte[] keyX = new byte[16];
        byte[] nintendo = System.Text.Encoding.ASCII.GetBytes("Nintendo");
        Array.Copy(nintendo, 0, keyX, 0, 8);
        Array.Copy(header, 0x0C, keyX, 8, 4);
        keyX[12] = header[0x0C + 3];
        keyX[13] = header[0x0C + 2];
        keyX[14] = header[0x0C + 1];
        keyX[15] = header[0x0C + 0];
        return keyX;
    }

    public static ushort CalcHeaderCRC16(byte[] data, int offset, int len)
    {
        ushort crc = 0xFFFF;
        for (int i = 0; i < len; i++)
        {
            crc ^= (ushort)data[offset + i];
            for (int b = 0; b < 8; b++)
            {
                if ((crc & 1) != 0)
                    crc = (ushort)((crc >> 1) ^ 0xA001);
                else
                    crc >>= 1;
            }
        }
        return crc;
    }

    public static ushort CalcHeaderCRC16(byte[] data, int len) => CalcHeaderCRC16(data, 0, len);

    public static byte[]? FindWorkingNormalKey(byte[] rom, uint offset, uint size, int ivOffset)
    {
        if (offset == 0 || size == 0 || offset + size > rom.Length) return null;

        byte[] keyX = BuildKeyX(rom);
        byte[] iv = new byte[16];
        Array.Copy(rom, ivOffset, iv, 0, 16);

        int trialLen = (int)Math.Min(size, 512);
        int[] hashOffsets = new int[] { 0x350, 0x328, 0x364 };

        foreach (int hashOff in hashOffsets)
        {
            if (hashOff + 16 > rom.Length) continue;

            bool allZero = true;
            for (int k = 0; k < 16; k++)
            {
                if (rom[hashOff + k] != 0) { allZero = false; break; }
            }
            if (allZero) continue;

            byte[] keyY = new byte[16];
            Array.Copy(rom, hashOff, keyY, 0, 16);
            byte[] normalKey = DeriveNormalKey(keyX, keyY);
            byte[] keySwap = new byte[16];
            for (int i = 0; i < 16; i++) keySwap[i] = normalKey[15 - i];

            byte[] trialBuf = new byte[trialLen];
            Array.Copy(rom, offset, trialBuf, 0, trialLen);

            using (var aes = Aes.Create())
            {
                aes.Mode = CipherMode.ECB;
                aes.Padding = PaddingMode.None;
                aes.Key = keySwap;
                CryptArea(aes, iv, trialBuf, 0, (uint)trialLen);
            }

            int trialZeros = 0;
            for (int i = 0; i < trialLen; i++)
            {
                if (trialBuf[i] == 0) trialZeros++;
            }

            // In AES ciphertext, zeros are ~1-2 per 512 bytes (< 6).
            // When properly decrypted into ARM/crt0 code, zeros exceed 15 (typically > 35).
            if (trialZeros >= 15)
            {
                return normalKey;
            }
        }

        return null;
    }

    public static bool IsAreaEncrypted(Stream fs, uint offset, uint size, int ivOffset, byte[] header, long fileLength)
    {
        if (offset == 0 || size == 0 || offset + size > fileLength) return false;

        int sampleLen = (int)Math.Min(size, 512);
        byte[] sample = new byte[sampleLen];
        fs.Seek(offset, SeekOrigin.Begin);
        fs.ReadExactly(sample, 0, sampleLen);

        int origZeros = 0;
        for (int i = 0; i < sampleLen; i++)
            if (sample[i] == 0) origZeros++;

        // In real executable code / uncompressed data, zeros exceed 5% (>= 25 in 512 bytes).
        if (origZeros >= 25)
            return false;

        byte[] keyX = BuildKeyX(header);
        byte[] iv = new byte[16];
        Array.Copy(header, ivOffset, iv, 0, 16);

        int[] hashOffsets = new int[] { 0x350, 0x328, 0x364 };
        foreach (int hashOff in hashOffsets)
        {
            if (hashOff + 16 > header.Length) continue;

            bool allZero = true;
            for (int k = 0; k < 16; k++)
            {
                if (header[hashOff + k] != 0) { allZero = false; break; }
            }
            if (allZero) continue;

            byte[] keyY = new byte[16];
            Array.Copy(header, hashOff, keyY, 0, 16);
            byte[] normalKey = DeriveNormalKey(keyX, keyY);
            byte[] keySwap = new byte[16];
            for (int i = 0; i < 16; i++) keySwap[i] = normalKey[15 - i];

            byte[] trialBuf = new byte[sampleLen];
            Array.Copy(sample, 0, trialBuf, 0, sampleLen);

            using (var aes = Aes.Create())
            {
                aes.Mode = CipherMode.ECB;
                aes.Padding = PaddingMode.None;
                aes.Key = keySwap;
                CryptArea(aes, iv, trialBuf, 0, (uint)sampleLen);
            }

            int trialZeros = 0;
            for (int i = 0; i < sampleLen; i++)
                if (trialBuf[i] == 0) trialZeros++;

            if (trialZeros >= 15)
                return true;
        }

        // If no candidate key can decrypt this area into valid executable code,
        // it cannot be decrypted with Modcrypt and is not an active Modcrypt area.
        return false;
    }

    public static bool IsAreaEncryptedBuffer(byte[] rom, uint offset, uint size, int ivOffset)
    {
        if (offset == 0 || size == 0 || offset + size > rom.Length) return false;

        int scanLen = (int)Math.Min(size, 512);
        int origZeros = 0;
        for (int i = 0; i < scanLen; i++)
            if (rom[offset + i] == 0) origZeros++;

        if (origZeros >= 25)
            return false;

        byte[]? workingKey = FindWorkingNormalKey(rom, offset, size, ivOffset);
        return workingKey != null;
    }

    public static RomInfo InspectRom(string filePath)
    {
        var fi = new FileInfo(filePath);
        var info = new RomInfo
        {
            FilePath = filePath,
            FileName = fi.Name,
            FileSize = fi.Length
        };

        if (fi.Length < 0x400) return info;

        using var fs = new FileStream(filePath, FileMode.Open, FileAccess.Read, FileShare.Read);
        byte[] header = new byte[0x400];
        fs.ReadExactly(header, 0, 0x400);

        info.GameTitle = System.Text.Encoding.ASCII.GetString(header, 0, 12).Trim((char)0);
        info.GameCode = System.Text.Encoding.ASCII.GetString(header, 0x0C, 4);

        byte unitCode = header[0x12];
        info.IsDsiRom = (unitCode & 0x02) != 0 || unitCode == 0x03;

        info.Modcrypt1Offset = BitConverter.ToUInt32(header, 0x220);
        info.Modcrypt1Size   = BitConverter.ToUInt32(header, 0x224);
        info.Modcrypt2Offset = BitConverter.ToUInt32(header, 0x228);
        info.Modcrypt2Size   = BitConverter.ToUInt32(header, 0x22C);

        info.HasModcrypt = (info.Modcrypt1Offset != 0 && info.Modcrypt1Size != 0 && info.Modcrypt1Size != 0xFFFFFFFF) ||
                           (info.Modcrypt2Offset != 0 && info.Modcrypt2Size != 0 && info.Modcrypt2Size != 0xFFFFFFFF);

        if (info.HasModcrypt)
        {
            bool mod1Enc = false;
            if (info.Modcrypt1Offset != 0 && info.Modcrypt1Size > 0 && info.Modcrypt1Offset + info.Modcrypt1Size <= fi.Length)
            {
                mod1Enc = IsAreaEncrypted(fs, info.Modcrypt1Offset, info.Modcrypt1Size, 0x300, header, fi.Length);
            }

            bool mod2Enc = false;
            if (info.Modcrypt2Offset != 0 && info.Modcrypt2Size > 0 && info.Modcrypt2Offset + info.Modcrypt2Size <= fi.Length)
            {
                mod2Enc = IsAreaEncrypted(fs, info.Modcrypt2Offset, info.Modcrypt2Size, 0x314, header, fi.Length);
            }

            info.IsEncrypted = mod1Enc || mod2Enc;
        }

        // Check for compatibility patches (e.g. AlphaBounce [KAL])
        if (info.GameCode.StartsWith("KAL", StringComparison.OrdinalIgnoreCase))
        {
            if (info.IsEncrypted)
            {
                info.NeedsCompatibilityPatch = true;
            }
            else if (fi.Length > 0x50d7)
            {
                fs.Seek(0x50d4, SeekOrigin.Begin);
                byte[] checkBytes = new byte[4];
                fs.ReadExactly(checkBytes, 0, 4);
                uint val = BitConverter.ToUInt32(checkBytes, 0);
                // 0xeb0085a3 is unpatched bl to OS_Terminate in NitroMain; 0xe1a00000 is nop
                if (val == 0xeb0085a3)
                {
                    info.NeedsCompatibilityPatch = true;
                }
            }
        }

        return info;
    }

    public static bool ApplyCompatibilityPatches(byte[] rom, string gameCode)
    {
        bool patched = false;

        // AlphaBounce [KALE] / [KALP] compatibility fix:
        // The game attempts to load TWLFontTable.dat from NAND, fails magic check, and calls OS_Terminate.
        // We NOP/redirect OS_Terminate calls and redirect the NAND font path to internal rom:/Arial.NFTR.
        if (gameCode.StartsWith("KAL", StringComparison.OrdinalIgnoreCase))
        {
            // 1. 0x50d4: bl OS_Terminate in NitroMain (0xeb0085a3 -> nop 0xe1a00000)
            if (rom.Length > 0x50d7)
            {
                uint op1 = BitConverter.ToUInt32(rom, 0x50d4);
                if (op1 == 0xeb0085a3)
                {
                    byte[] nop = BitConverter.GetBytes(0xe1a00000u);
                    Array.Copy(nop, 0, rom, 0x50d4, 4);
                    patched = true;
                }
            }

            // 2. 0xba014: bl OS_Terminate on font validation failure (0xebfdb1d3 -> b 0x20ba058 0xea00000f)
            if (rom.Length > 0xba017)
            {
                uint op2 = BitConverter.ToUInt32(rom, 0xba014);
                if (op2 == 0xebfdb1d3)
                {
                    byte[] branch = BitConverter.GetBytes(0xea00000fu);
                    Array.Copy(branch, 0, rom, 0xba014, 4);
                    patched = true;
                }
            }

            // 3. 0xe4548: bl OS_Terminate (0xebfd0886 -> nop 0xe1a00000)
            if (rom.Length > 0xe454b)
            {
                uint op3 = BitConverter.ToUInt32(rom, 0xe4548);
                if (op3 == 0xebfd0886)
                {
                    byte[] nop = BitConverter.GetBytes(0xe1a00000u);
                    Array.Copy(nop, 0, rom, 0xe4548, 4);
                    patched = true;
                }
            }

            // 4. 0xf5c50: bl OS_Terminate (0xebfcc2c4 -> nop 0xe1a00000)
            if (rom.Length > 0xf5c53)
            {
                uint op4 = BitConverter.ToUInt32(rom, 0xf5c50);
                if (op4 == 0xebfcc2c4)
                {
                    byte[] nop = BitConverter.GetBytes(0xe1a00000u);
                    Array.Copy(nop, 0, rom, 0xf5c50, 4);
                    patched = true;
                }
            }

            // 5. 0xf5f0c: bl OS_Terminate (0xebfcc215 -> nop 0xe1a00000)
            if (rom.Length > 0xf5f0f)
            {
                uint op5 = BitConverter.ToUInt32(rom, 0xf5f0c);
                if (op5 == 0xebfcc215)
                {
                    byte[] nop = BitConverter.GetBytes(0xe1a00000u);
                    Array.Copy(nop, 0, rom, 0xf5f0c, 4);
                    patched = true;
                }
            }

            // 6. Font path redirect: replace "nand:/sys/TWLFontTable.dat" with "rom:/Arial.NFTR"
            byte[] targetPath = System.Text.Encoding.ASCII.GetBytes("nand:/sys/TWLFontTable.dat");
            int pathIdx = IndexOfSequence(rom, targetPath);
            if (pathIdx != -1)
            {
                byte[] replacement = new byte[targetPath.Length];
                byte[] fontName = System.Text.Encoding.ASCII.GetBytes("rom:/Arial.NFTR");
                Array.Copy(fontName, 0, replacement, 0, fontName.Length);
                Array.Copy(replacement, 0, rom, pathIdx, targetPath.Length);
                patched = true;
            }

            // 7. Recalculate Secure Area CRC16 if present
            if (rom.Length >= 0x8000)
            {
                ushort secCrc = CalcHeaderCRC16(rom, 0x4000, 0x4000);
                rom[0x6C] = (byte)(secCrc & 0xFF);
                rom[0x6D] = (byte)(secCrc >> 8);
            }

            // 8. Recalculate Header CRC16
            ushort headerCrc = CalcHeaderCRC16(rom, 0, 0x15E);
            rom[0x15E] = (byte)(headerCrc & 0xFF);
            rom[0x15F] = (byte)(headerCrc >> 8);
        }

        return patched;
    }

    private static int IndexOfSequence(byte[] buffer, byte[] pattern)
    {
        int max = buffer.Length - pattern.Length;
        for (int i = 0; i <= max; i++)
        {
            if (buffer[i] != pattern[0]) continue;
            bool match = true;
            for (int k = 1; k < pattern.Length; k++)
            {
                if (buffer[i + k] != pattern[k])
                {
                    match = false;
                    break;
                }
            }
            if (match) return i;
        }
        return -1;
    }

    public static bool DecryptRomBuffer(byte[] rom)
    {
        if (rom.Length < 0x400) return false;

        uint mod1Off = BitConverter.ToUInt32(rom, 0x220);
        uint mod1Sz  = BitConverter.ToUInt32(rom, 0x224);
        uint mod2Off = BitConverter.ToUInt32(rom, 0x228);
        uint mod2Sz  = BitConverter.ToUInt32(rom, 0x22C);

        bool mod1Encrypted = mod1Off != 0 && mod1Sz != 0 && mod1Sz != 0xFFFFFFFF && mod1Off + mod1Sz <= rom.Length && IsAreaEncryptedBuffer(rom, mod1Off, mod1Sz, 0x300);
        bool mod2Encrypted = mod2Off != 0 && mod2Sz != 0 && mod2Sz != 0xFFFFFFFF && mod2Off + mod2Sz <= rom.Length && IsAreaEncryptedBuffer(rom, mod2Off, mod2Sz, 0x314);

        if (!mod1Encrypted && !mod2Encrypted)
        {
            // Already decrypted: check if compatibility patch is needed
            string code = System.Text.Encoding.ASCII.GetString(rom, 0x0C, 4);
            bool patched = ApplyCompatibilityPatches(rom, code);

            if ((rom[0x1C] & 0x03) != 0x03)
            {
                rom[0x1C] |= 0x03;
                patched = true;
            }

            if (patched)
            {
                ushort crc = CalcHeaderCRC16(rom, 0x15E);
                rom[0x15E] = (byte)(crc & 0xFF);
                rom[0x15F] = (byte)(crc >> 8);
            }
            return true;
        }

        if (mod1Encrypted)
        {
            byte[]? normalKey1 = FindWorkingNormalKey(rom, mod1Off, mod1Sz, 0x300);
            if (normalKey1 != null)
            {
                byte[] keySwap1 = new byte[16];
                for (int i = 0; i < 16; i++) keySwap1[i] = normalKey1[15 - i];

                using var aes1 = Aes.Create();
                aes1.Mode = CipherMode.ECB;
                aes1.Padding = PaddingMode.None;
                aes1.Key = keySwap1;

                byte[] iv1 = new byte[16];
                Array.Copy(rom, 0x300, iv1, 0, 16);
                CryptArea(aes1, iv1, rom, mod1Off, mod1Sz);
            }
        }

        if (mod2Encrypted)
        {
            byte[]? normalKey2 = FindWorkingNormalKey(rom, mod2Off, mod2Sz, 0x314);
            if (normalKey2 != null)
            {
                byte[] keySwap2 = new byte[16];
                for (int i = 0; i < 16; i++) keySwap2[i] = normalKey2[15 - i];

                using var aes2 = Aes.Create();
                aes2.Mode = CipherMode.ECB;
                aes2.Padding = PaddingMode.None;
                aes2.Key = keySwap2;

                byte[] iv2 = new byte[16];
                Array.Copy(rom, 0x314, iv2, 0, 16);
                CryptArea(aes2, iv2, rom, mod2Off, mod2Sz);
            }
        }

        // Apply compatibility patches if needed (e.g. AlphaBounce)
        string gameCode = System.Text.Encoding.ASCII.GetString(rom, 0x0C, 4);
        ApplyCompatibilityPatches(rom, gameCode);

        // Set DSi cart header flags (Modcrypt areas decrypted: 0x03 = both decrypted)
        rom[0x1C] |= 0x03;

        // Recalculate Header CRC16 over 0x00..0x15D and store at 0x15E
        ushort headerCrc = CalcHeaderCRC16(rom, 0x15E);
        rom[0x15E] = (byte)(headerCrc & 0xFF);
        rom[0x15F] = (byte)(headerCrc >> 8);

        return true;
    }

    public static bool DecryptFile(string inputPath, string outputPath)
    {
        var info = InspectRom(inputPath);
        if (!info.IsEncrypted && !info.NeedsCompatibilityPatch)
        {
            // If already decrypted and doesn't need patches, copy file verbatim to destination
            string? outDir = Path.GetDirectoryName(outputPath);
            if (!string.IsNullOrEmpty(outDir) && !Directory.Exists(outDir))
                Directory.CreateDirectory(outDir);

            if (!string.Equals(Path.GetFullPath(inputPath), Path.GetFullPath(outputPath), StringComparison.OrdinalIgnoreCase))
            {
                File.Copy(inputPath, outputPath, true);
            }
            return true;
        }

        byte[] rom = File.ReadAllBytes(inputPath);
        bool res = DecryptRomBuffer(rom);
        if (!res) return false;

        string? dir = Path.GetDirectoryName(outputPath);
        if (!string.IsNullOrEmpty(dir) && !Directory.Exists(dir))
            Directory.CreateDirectory(dir);

        File.WriteAllBytes(outputPath, rom);
        return true;
    }
}
