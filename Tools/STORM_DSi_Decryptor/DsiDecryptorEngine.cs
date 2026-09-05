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

    public static ushort CalcHeaderCRC16(byte[] data, int len)
    {
        ushort crc = 0xFFFF;
        for (int i = 0; i < len; i++)
        {
            crc ^= (ushort)data[i];
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

    public static bool IsAreaEncrypted(Stream fs, uint offset, uint size, int ivOffset, byte[] header, long fileLength)
    {
        if (offset == 0 || size == 0 || offset + size > fileLength) return false;

        // 1. Check zero-byte distribution across up to 4096 bytes
        int scanLen = (int)Math.Min(size, 4096);
        byte[] scanBuf = new byte[scanLen];
        fs.Seek(offset, SeekOrigin.Begin);
        fs.ReadExactly(scanBuf, 0, scanLen);

        int origZeros = 0;
        for (int i = 0; i < scanLen; i++)
            if (scanBuf[i] == 0) origZeros++;

        // In AES ciphertext, zeros are ~0.39% (approx 16 in 4096).
        // In real executable code / uncompressed data, zeros exceed 5% (>= 200 in 4096).
        if (origZeros > scanLen / 20)
            return false;

        // 2. Perform trial AES-CTR decryption on first 512 bytes
        try
        {
            int trialLen = (int)Math.Min(size, 512);
            byte[] trialBuf = new byte[trialLen];
            Array.Copy(scanBuf, 0, trialBuf, 0, trialLen);

            byte[] keyX = BuildKeyX(header);
            byte[] keyY = new byte[16];
            Array.Copy(header, 0x350, keyY, 0, 16);
            byte[] normalKey = DeriveNormalKey(keyX, keyY);
            byte[] keySwap = new byte[16];
            for (int i = 0; i < 16; i++) keySwap[i] = normalKey[15 - i];

            byte[] iv = new byte[16];
            Array.Copy(header, ivOffset, iv, 0, 16);

            using (var aes = Aes.Create())
            {
                aes.Mode = CipherMode.ECB;
                aes.Padding = PaddingMode.None;
                aes.Key = keySwap;
                CryptArea(aes, iv, trialBuf, 0, (uint)trialLen);
            }

            int trialZeros = 0;
            for (int i = 0; i < trialLen; i++)
                if (trialBuf[i] == 0) trialZeros++;

            int origTrialZeros = 0;
            for (int i = 0; i < trialLen; i++)
                if (scanBuf[i] == 0) origTrialZeros++;

            // If trial decryption yields significantly more zeros than orig, original was ENCRYPTED!
            if (trialZeros >= 12 && trialZeros > origTrialZeros * 2)
                return true;

            // If orig has significantly more zeros than decrypted, original was PLAINTEXT!
            if (origTrialZeros >= 6 && origTrialZeros > trialZeros)
                return false;

            // If trial decryption yields < 6 zeros (pseudo-random noise ≈ 1 zero in 512 bytes)
            // and ROM header indicates already decrypted (DSiCryptoFlags & 0x03 == 0x03), do not encrypt
            if (trialZeros < 6 && (header[0x1C] & 0x03) == 0x03)
                return false;
        }
        catch { }

        // 3. Fallback: ARM and Thumb opcode check across up to 256 words
        int checkWords = Math.Min(scanLen / 4, 256);
        int armMatches = 0;
        int thumbMatches = 0;
        for (int i = 0; i < checkWords; i++)
        {
            uint w = BitConverter.ToUInt32(scanBuf, i * 4);
            uint cond = w >> 28;
            if (w == 0 || (w >= 0x02000000 && w < 0x04000000) || w < 0x10000)
            {
                armMatches++;
            }
            else if (cond <= 0xE)
            {
                uint group = (w >> 25) & 0x7;
                if (group <= 5 && w != 0xE7FFDEFF)
                    armMatches++;
            }
            else if (cond == 0xF)
            {
                if ((w & 0xFE000000) == 0xFA000000 || (w & 0xFE000000) == 0xF4000000)
                    armMatches++;
            }

            ushort hw0 = (ushort)w;
            ushort hw1 = (ushort)(w >> 16);
            if ((hw0 & 0xF000) == 0x2000 || (hw0 & 0xF800) == 0x4800 || (hw0 & 0xFF00) == 0xB500 || (hw0 & 0xF000) == 0xD000 || (hw0 & 0xF800) == 0xE000 || hw0 == 0)
                thumbMatches++;
            if ((hw1 & 0xF000) == 0x2000 || (hw1 & 0xF800) == 0x4800 || (hw1 & 0xFF00) == 0xB500 || (hw1 & 0xF000) == 0xD000 || (hw1 & 0xF800) == 0xE000 || hw1 == 0)
                thumbMatches++;
        }

        if (armMatches >= (checkWords * 5) / 10 || thumbMatches >= (checkWords * 2 * 5) / 10)
            return false;

        return true;
    }

    public static bool IsAreaEncryptedBuffer(byte[] rom, uint offset, uint size, int ivOffset)
    {
        if (offset == 0 || size == 0 || offset + size > rom.Length) return false;

        int scanLen = (int)Math.Min(size, 4096);
        int origZeros = 0;
        for (int i = 0; i < scanLen; i++)
            if (rom[offset + i] == 0) origZeros++;

        if (origZeros > scanLen / 20)
            return false;

        try
        {
            int trialLen = (int)Math.Min(size, 512);
            byte[] trialBuf = new byte[trialLen];
            Array.Copy(rom, offset, trialBuf, 0, trialLen);

            byte[] keyX = BuildKeyX(rom);
            byte[] keyY = new byte[16];
            Array.Copy(rom, 0x350, keyY, 0, 16);
            byte[] normalKey = DeriveNormalKey(keyX, keyY);
            byte[] keySwap = new byte[16];
            for (int i = 0; i < 16; i++) keySwap[i] = normalKey[15 - i];

            byte[] iv = new byte[16];
            Array.Copy(rom, ivOffset, iv, 0, 16);

            using (var aes = Aes.Create())
            {
                aes.Mode = CipherMode.ECB;
                aes.Padding = PaddingMode.None;
                aes.Key = keySwap;
                CryptArea(aes, iv, trialBuf, 0, (uint)trialLen);
            }

            int trialZeros = 0;
            for (int i = 0; i < trialLen; i++)
                if (trialBuf[i] == 0) trialZeros++;

            int origTrialZeros = 0;
            for (int i = 0; i < trialLen; i++)
                if (rom[offset + i] == 0) origTrialZeros++;

            if (trialZeros >= 12 && trialZeros > origTrialZeros * 2)
                return true;

            if (origTrialZeros >= 6 && origTrialZeros > trialZeros)
                return false;

            if (trialZeros < 6 && (rom[0x1C] & 0x03) == 0x03)
                return false;
        }
        catch { }

        int checkWords = Math.Min(scanLen / 4, 256);
        int armMatches = 0;
        int thumbMatches = 0;
        for (int i = 0; i < checkWords; i++)
        {
            uint w = BitConverter.ToUInt32(rom, (int)offset + i * 4);
            uint cond = w >> 28;
            if (w == 0 || (w >= 0x02000000 && w < 0x04000000) || w < 0x10000)
            {
                armMatches++;
            }
            else if (cond <= 0xE)
            {
                uint group = (w >> 25) & 0x7;
                if (group <= 5 && w != 0xE7FFDEFF)
                    armMatches++;
            }
            else if (cond == 0xF)
            {
                if ((w & 0xFE000000) == 0xFA000000 || (w & 0xFE000000) == 0xF4000000)
                    armMatches++;
            }

            ushort hw0 = (ushort)w;
            ushort hw1 = (ushort)(w >> 16);
            if ((hw0 & 0xF000) == 0x2000 || (hw0 & 0xF800) == 0x4800 || (hw0 & 0xFF00) == 0xB500 || (hw0 & 0xF000) == 0xD000 || (hw0 & 0xF800) == 0xE000 || hw0 == 0)
                thumbMatches++;
            if ((hw1 & 0xF000) == 0x2000 || (hw1 & 0xF800) == 0x4800 || (hw1 & 0xFF00) == 0xB500 || (hw1 & 0xF000) == 0xD000 || (hw1 & 0xF800) == 0xE000 || hw1 == 0)
                thumbMatches++;
        }

        if (armMatches >= (checkWords * 5) / 10 || thumbMatches >= (checkWords * 2 * 5) / 10)
            return false;

        return true;
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

        return info;
    }

    public static bool DecryptRomBuffer(byte[] rom)
    {
        if (rom.Length < 0x400) return false;

        byte[] keyX = BuildKeyX(rom);
        byte[] keyY = new byte[16];
        Array.Copy(rom, 0x350, keyY, 0, 16);

        byte[] normalKey = DeriveNormalKey(keyX, keyY);
        byte[] keySwap = new byte[16];
        for (int i = 0; i < 16; i++)
            keySwap[i] = normalKey[15 - i];

        using var aes = Aes.Create();
        aes.Mode = CipherMode.ECB;
        aes.Padding = PaddingMode.None;
        aes.Key = keySwap;

        uint mod1Off = BitConverter.ToUInt32(rom, 0x220);
        uint mod1Sz  = BitConverter.ToUInt32(rom, 0x224);
        uint mod2Off = BitConverter.ToUInt32(rom, 0x228);
        uint mod2Sz  = BitConverter.ToUInt32(rom, 0x22C);

        if (mod1Off != 0 && mod1Sz != 0 && mod1Sz != 0xFFFFFFFF && mod1Off + mod1Sz <= rom.Length)
        {
            if (IsAreaEncryptedBuffer(rom, mod1Off, mod1Sz, 0x300))
            {
                byte[] iv1 = new byte[16];
                Array.Copy(rom, 0x300, iv1, 0, 16);
                CryptArea(aes, iv1, rom, mod1Off, mod1Sz);
            }
        }

        if (mod2Off != 0 && mod2Sz != 0 && mod2Sz != 0xFFFFFFFF && mod2Off + mod2Sz <= rom.Length)
        {
            if (IsAreaEncryptedBuffer(rom, mod2Off, mod2Sz, 0x314))
            {
                byte[] iv2 = new byte[16];
                Array.Copy(rom, 0x314, iv2, 0, 16);
                CryptArea(aes, iv2, rom, mod2Off, mod2Sz);
            }
        }


        // Set DSi cart header flags (Modcrypt areas decrypted: 0x03 = both decrypted)
        // Modcrypt offsets and sizes at 0x220..0x22F are preserved as required by TWL-SDK / DSi OS
        rom[0x1C] |= 0x03;

        // Recalculate Header CRC16 over 0x00..0x15D and store at 0x15E
        ushort headerCrc = CalcHeaderCRC16(rom, 0x15E);
        rom[0x15E] = (byte)(headerCrc & 0xFF);
        rom[0x15F] = (byte)(headerCrc >> 8);

        return true;
    }

    public static bool DecryptFile(string inputPath, string outputPath)
    {
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
