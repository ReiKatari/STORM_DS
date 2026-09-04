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

    private static byte[] DeriveNormalKey(byte[] keyX, byte[] keyY)
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

    private static void CryptArea(Aes aes, byte[] ctrInit, byte[] rom, uint offset, uint size)
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

    public static bool IsBufferPlaintext(byte[] data, int offset, int size)
    {
        if (data == null || size < 16 || offset + size > data.Length) return false;
        int checkWords = Math.Min(size / 4, 32);
        if (checkWords < 8) return false;

        int armAlCount = 0;
        int thumbCount = 0;

        for (int i = 0; i < checkWords; i++)
        {
            uint w = BitConverter.ToUInt32(data, offset + i * 4);
            uint cond = w >> 28;
            if (w == 0 || cond == 0xE)
            {
                armAlCount++;
            }

            ushort hw0 = (ushort)w;
            ushort hw1 = (ushort)(w >> 16);
            if (hw0 == 0 || (hw0 & 0xFF00) == 0xB500 || (hw0 & 0xF800) == 0x4800 || (hw0 & 0xF000) == 0x2000 || (hw0 & 0xFF00) == 0xB000)
                thumbCount++;
            if (hw1 == 0 || (hw1 & 0xFF00) == 0xB500 || (hw1 & 0xF800) == 0x4800 || (hw1 & 0xF000) == 0x2000 || (hw1 & 0xFF00) == 0xB000)
                thumbCount++;
        }

        bool isArmPlaintext = armAlCount >= (checkWords * 12) / 32;
        bool isThumbPlaintext = thumbCount >= (checkWords * 2 * 12) / 32;
        return isArmPlaintext || isThumbPlaintext;
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
                fs.Seek(info.Modcrypt1Offset, SeekOrigin.Begin);
                byte[] sample = new byte[Math.Min(256, (int)info.Modcrypt1Size)];
                fs.ReadExactly(sample, 0, sample.Length);
                mod1Enc = !IsBufferPlaintext(sample, 0, sample.Length);
            }

            bool mod2Enc = false;
            if (info.Modcrypt2Offset != 0 && info.Modcrypt2Size > 0 && info.Modcrypt2Offset + info.Modcrypt2Size <= fi.Length)
            {
                fs.Seek(info.Modcrypt2Offset, SeekOrigin.Begin);
                byte[] sample = new byte[Math.Min(256, (int)info.Modcrypt2Size)];
                fs.ReadExactly(sample, 0, sample.Length);
                mod2Enc = !IsBufferPlaintext(sample, 0, sample.Length);
            }

            info.IsEncrypted = mod1Enc || mod2Enc;
        }

        return info;
    }

    public static bool DecryptRomBuffer(byte[] rom)
    {
        if (rom.Length < 0x400) return false;

        byte[] keyX = new byte[16];
        byte[] nintendo = System.Text.Encoding.ASCII.GetBytes("Nintendo");
        Array.Copy(nintendo, 0, keyX, 0, 8);
        Array.Copy(rom, 0x0C, keyX, 8, 4);
        keyX[12] = rom[0x0C + 3];
        keyX[13] = rom[0x0C + 2];
        keyX[14] = rom[0x0C + 1];
        keyX[15] = rom[0x0C + 0];

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
            if (!IsBufferPlaintext(rom, (int)mod1Off, Math.Min(256, (int)mod1Sz)))
            {
                byte[] iv1 = new byte[16];
                Array.Copy(rom, 0x300, iv1, 0, 16);
                CryptArea(aes, iv1, rom, mod1Off, mod1Sz);
            }
        }

        if (mod2Off != 0 && mod2Sz != 0 && mod2Sz != 0xFFFFFFFF && mod2Off + mod2Sz <= rom.Length)
        {
            if (!IsBufferPlaintext(rom, (int)mod2Off, Math.Min(256, (int)mod2Sz)))
            {
                byte[] iv2 = new byte[16];
                Array.Copy(rom, 0x314, iv2, 0, 16);
                CryptArea(aes, iv2, rom, mod2Off, mod2Sz);
            }
        }

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
