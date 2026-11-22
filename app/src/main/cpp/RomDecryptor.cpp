#include "RomDecryptor.h"
#include <algorithm>
#include <cstring>
#include <cstdio>
#include <string>
#include <vector>
#include <unistd.h>
#include <fcntl.h>

extern "C" {
#include "../../../melonDS-android-lib/src/tiny-AES-c/aes.h"
}

// ---------- Helper functions (adapted from melonDS DSi.cpp / DSi_AES.cpp) ----------

static uint16_t LE16(const uint8_t* p)
{
    uint16_t v = 0;
    memcpy(&v, p, sizeof(v));
    return v;
}

static uint32_t LE32(const uint8_t* p)
{
    uint32_t v = 0;
    memcpy(&v, p, sizeof(v));
    return v;
}

static void WriteLE16(uint8_t* p, uint16_t v)
{
    memcpy(p, &v, sizeof(v));
}

static bool RangeFitsInFile(uint32_t offset, uint32_t size, uint64_t fileSize)
{
    if (offset == 0 || size == 0 || size == 0xFFFFFFFFu)
        return false;
    return static_cast<uint64_t>(offset) + static_cast<uint64_t>(size) <= fileSize;
}

static void Bswap128(uint8_t* dst, const uint8_t* src)
{
    for (int i = 0; i < 16; i++)
        dst[i] = src[15 - i];
}

static void ROL16(uint8_t* val, uint32_t n)
{
    uint32_t n_coarse = n >> 3;
    uint32_t n_fine = n & 7;
    uint8_t tmp[16];

    for (uint32_t i = 0; i < 16; i++)
        tmp[i] = val[(i - n_coarse) & 0xF];

    for (uint32_t i = 0; i < 16; i++)
        val[i] = (tmp[i] << n_fine) | (tmp[(i - 1) & 0xF] >> (8 - n_fine));
}

static void DeriveNormalKey(const uint8_t* keyX, const uint8_t* keyY, uint8_t* normalkey)
{
    const uint8_t key_const[16] = {
        0xFF, 0xFE, 0xFB, 0x4E, 0x29, 0x59, 0x02, 0x58,
        0x2A, 0x68, 0x0F, 0x5F, 0x1A, 0x4F, 0x3E, 0x79
    };
    uint8_t tmp[16];

    for (int i = 0; i < 16; i++)
        tmp[i] = keyX[i] ^ keyY[i];

    uint32_t carry = 0;
    for (int i = 0; i < 16; i++)
    {
        uint32_t res = tmp[i] + key_const[15 - i] + carry;
        tmp[i] = res & 0xFF;
        carry = res >> 8;
    }

    ROL16(tmp, 42);
    memcpy(normalkey, tmp, 16);
}

static uint16_t CalcHeaderCRC16(const uint8_t* data, size_t len)
{
    uint16_t crc = 0xFFFF;
    for (size_t i = 0; i < len; i++)
    {
        crc ^= (uint16_t)data[i];
        for (int b = 0; b < 8; b++)
        {
            if (crc & 1)
                crc = (crc >> 1) ^ 0xA001;
            else
                crc >>= 1;
        }
    }
    return crc;
}

// NDS header offsets
static constexpr uint32_t OFFSET_GAME_CODE       = 0x0C;
static constexpr uint32_t OFFSET_UNIT_CODE        = 0x12;
static constexpr uint32_t OFFSET_DSI_CRYPTO_FLAGS = 0x1C;
static constexpr uint32_t OFFSET_APP_FLAGS        = 0x1D;
static constexpr uint32_t OFFSET_ARM9_ROM_OFFSET  = 0x20;
static constexpr uint32_t OFFSET_ARM9_SIZE        = 0x2C;
static constexpr uint32_t OFFSET_ARM7_ROM_OFFSET  = 0x30;
static constexpr uint32_t OFFSET_ARM7_SIZE        = 0x3C;
static constexpr uint32_t OFFSET_MODCRYPT1_OFF    = 0x220;
static constexpr uint32_t OFFSET_MODCRYPT1_SIZE   = 0x224;
static constexpr uint32_t OFFSET_MODCRYPT2_OFF    = 0x228;
static constexpr uint32_t OFFSET_MODCRYPT2_SIZE   = 0x22C;
static constexpr uint32_t OFFSET_DSI_ARM9_HASH        = 0x300; // IV for area 1
static constexpr uint32_t OFFSET_DSI_ARM7_HASH        = 0x314; // IV for area 2
static constexpr uint32_t OFFSET_DSI_DIGEST_HASH      = 0x328; // KeyY source (Digest master hash)
static constexpr uint32_t OFFSET_BANNER_HASH          = 0x33C;
static constexpr uint32_t OFFSET_DSI_ARM9I_HASH       = 0x350; // KeyY source (ARM9i HMAC-SHA1)
static constexpr uint32_t OFFSET_DSI_ARM7I_HASH       = 0x364; // KeyY source (ARM7i HMAC-SHA1)
static constexpr uint32_t OFFSET_HEADER_BIN_HASH      = 0x378;
static constexpr uint32_t OFFSET_ARM9_OVERLAY_HASH    = 0x38C;
static constexpr uint32_t OFFSET_DSI_ARM9_NOSEC_HASH  = 0x3A0;
static constexpr uint32_t HEADER_SIZE                 = 0x1000;

static int ScoreBuffer(const uint8_t* data, size_t size, size_t* outZeros = nullptr, size_t* outArmE = nullptr, size_t* outThumb = nullptr)
{
    if (!data || size < 16) return 0;

    size_t sampleLen = std::min<size_t>(size, 1024);
    size_t zeros = 0;
    for (size_t i = 0; i < sampleLen; i++)
    {
        if (data[i] == 0) zeros++;
    }

    size_t checkWords = sampleLen / 4;
    size_t armE = 0;
    size_t thumb = 0;
    for (size_t i = 0; i < checkWords; i++)
    {
        uint32_t w = LE32(&data[i * 4]);
        if ((w >> 28) == 0xE)
            armE++;

        uint16_t hw0 = (uint16_t)w;
        uint16_t hw1 = (uint16_t)(w >> 16);
        if ((hw0 & 0xF000) == 0x2000 || (hw0 & 0xF800) == 0x4800 || (hw0 & 0xFF00) == 0xB500 ||
            (hw0 & 0xFF00) == 0xBD00 || (hw0 & 0xF000) == 0xD000 || (hw0 & 0xF800) == 0xE000 ||
            (hw0 & 0xFF00) == 0xDF00 || (hw0 & 0xFF80) == 0x4700 || hw0 == 0)
            thumb++;
        if ((hw1 & 0xF000) == 0x2000 || (hw1 & 0xF800) == 0x4800 || (hw1 & 0xFF00) == 0xB500 ||
            (hw1 & 0xFF00) == 0xBD00 || (hw1 & 0xF000) == 0xD000 || (hw1 & 0xF800) == 0xE000 ||
            (hw1 & 0xFF00) == 0xDF00 || (hw1 & 0xFF80) == 0x4700 || hw1 == 0)
            thumb++;
    }

    if (outZeros) *outZeros = zeros;
    if (outArmE) *outArmE = armE;
    if (outThumb) *outThumb = thumb;

    return (int)(armE * 3 + thumb + zeros);
}

static bool isBufferPlaintext(const uint8_t* data, size_t size)
{
    if (!data || size < 16) return false;
    size_t sampleLen = std::min<size_t>(size, 1024);
    size_t zeros = 0, armE = 0, thumb = 0;
    int score = ScoreBuffer(data, sampleLen, &zeros, &armE, &thumb);

    if (score >= 350 || zeros >= 40 || (armE >= 60 && zeros >= 20))
        return true;

    return false;
}

static bool IsModcryptAreaEncrypted(FILE* f, uint32_t offset, uint32_t size, uint64_t fileSize)
{
    if (!RangeFitsInFile(offset, size, fileSize)) return false;
    if (fseek(f, static_cast<long>(offset), SEEK_SET) != 0) return false;

    uint8_t buffer[1024];
    size_t sampleRead = fread(buffer, 1, sizeof(buffer), f);
    if (sampleRead < 16) return false;

    return !isBufferPlaintext(buffer, sampleRead);
}

static bool TryDeriveAndTestKey(
    const uint8_t* rom,
    size_t fileSize,
    uint32_t keyYOffset,
    uint32_t modcryptOffset,
    uint32_t modcryptSize,
    uint32_t ivOffset,
    bool devKey,
    uint8_t* outNormalKey,
    int* outScore = nullptr
)
{
    if (devKey)
    {
        uint8_t tmp[16];
        memcpy(tmp, &rom[0], 16);
        Bswap128(outNormalKey, tmp);
        if (outScore) *outScore = 1000;
        return true;
    }

    uint8_t keyX[16], keyY[16], tmp[16];
    uint32_t nint = 0x746E694Eu; // "Nint"
    uint32_t endo = 0x6F646E65u; // "endo"
    memcpy(&keyX[0], &nint, 4);
    memcpy(&keyX[4], &endo, 4);
    keyX[8]  = rom[OFFSET_GAME_CODE + 0];
    keyX[9]  = rom[OFFSET_GAME_CODE + 1];
    keyX[10] = rom[OFFSET_GAME_CODE + 2];
    keyX[11] = rom[OFFSET_GAME_CODE + 3];
    keyX[12] = rom[OFFSET_GAME_CODE + 3];
    keyX[13] = rom[OFFSET_GAME_CODE + 2];
    keyX[14] = rom[OFFSET_GAME_CODE + 1];
    keyX[15] = rom[OFFSET_GAME_CODE + 0];

    memcpy(keyY, &rom[keyYOffset], 16);

    bool allZeros = true;
    for (int i = 0; i < 16; i++) {
        if (keyY[i] != 0) { allZeros = false; break; }
    }
    if (allZeros) return false;

    DeriveNormalKey(keyX, keyY, tmp);
    Bswap128(outNormalKey, tmp);

    if (modcryptOffset == 0 || modcryptSize == 0) return true;
    if (!RangeFitsInFile(modcryptOffset, modcryptSize, static_cast<uint64_t>(fileSize))) return false;

    size_t testLen = std::min<size_t>(modcryptSize, 1024);
    std::vector<uint8_t> testBuf(testLen);
    memcpy(testBuf.data(), &rom[modcryptOffset], testLen);

    AES_ctx ctx;
    uint8_t iv[16];
    Bswap128(iv, &rom[ivOffset]);
    AES_init_ctx_iv(&ctx, outNormalKey, iv);

    for (size_t i = 0; i < testLen; i += 16)
    {
        size_t blockLen = (i + 16 <= testLen) ? 16 : (testLen - i);
        uint8_t block[16] = {0};
        memcpy(block, &testBuf[i], blockLen);
        uint8_t swapped[16];
        Bswap128(swapped, block);
        AES_CTR_xcrypt_buffer(&ctx, swapped, 16);
        Bswap128(block, swapped);
        memcpy(&testBuf[i], block, blockLen);
    }

    size_t zeros = 0, armE = 0, thumb = 0;
    int score = ScoreBuffer(testBuf.data(), testLen, &zeros, &armE, &thumb);
    if (outScore) *outScore = score;

    size_t rawZeros = 0;
    int rawScore = ScoreBuffer(&rom[modcryptOffset], testLen, &rawZeros);

    bool isStandardCartKey = (keyYOffset == OFFSET_DSI_ARM9I_HASH);
    if (score > rawScore + 15 && (zeros >= 8 || (armE >= 16 && zeros >= 4) || (thumb >= 20 && zeros >= 2) || (isStandardCartKey && (score >= 15 || zeros >= 8))))
        return true;

    return isBufferPlaintext(testBuf.data(), testLen);
}

static bool ValidateDecryptedRom(const uint8_t* rom, size_t fileSize)
{
    if (rom == nullptr || fileSize < 0x200)
        return false;

    uint16_t headerCrc = LE16(&rom[0x15E]);
    if (headerCrc == 0 || headerCrc == 0xFFFF || headerCrc != CalcHeaderCRC16(rom, 0x15E))
        return false;

    uint32_t arm9Off = LE32(&rom[OFFSET_ARM9_ROM_OFFSET]);
    uint32_t arm9Size = LE32(&rom[OFFSET_ARM9_SIZE]);
    if (arm9Off > 0 && arm9Size > 0 &&
        static_cast<uint64_t>(arm9Off) + static_cast<uint64_t>(arm9Size) > static_cast<uint64_t>(fileSize))
        return false;

    uint32_t arm7Off = LE32(&rom[OFFSET_ARM7_ROM_OFFSET]);
    uint32_t arm7Size = LE32(&rom[OFFSET_ARM7_SIZE]);
    if (arm7Off > 0 && arm7Size > 0 &&
        static_cast<uint64_t>(arm7Off) + static_cast<uint64_t>(arm7Size) > static_cast<uint64_t>(fileSize))
        return false;

    return true;
}

static bool DecryptModcryptArea(
    uint8_t* rom,
    size_t fileSize,
    uint32_t areaOffset,
    uint32_t areaSize,
    uint32_t ivOffset,
    bool devKey,
    const uint32_t* keyCandidates,
    size_t keyCandidateCount,
    uint32_t& currentWork,
    uint32_t totalWork,
    MelonDSAndroid::RomDecryptor::ProgressCallback progressCallback
)
{
    uint8_t normalKey[16];
    bool keyFound = false;

    for (size_t c = 0; c < keyCandidateCount; c++)
    {
        if (TryDeriveAndTestKey(rom, fileSize, keyCandidates[c], areaOffset, areaSize, ivOffset, devKey, normalKey))
        {
            keyFound = true;
            break;
        }
    }
    if (!keyFound)
        return false;

    std::vector<uint8_t> decrypted(areaSize);
    memcpy(decrypted.data(), &rom[areaOffset], areaSize);

    AES_ctx ctx;
    uint8_t iv[16];
    Bswap128(iv, &rom[ivOffset]);
    AES_init_ctx_iv(&ctx, normalKey, iv);

    for (uint32_t i = 0; i < areaSize; i += 16)
    {
        uint32_t blockLen = (i + 16 <= areaSize) ? 16 : (areaSize - i);
        uint8_t block[16] = {0};
        memcpy(block, &decrypted[i], blockLen);
        uint8_t swapped[16];
        Bswap128(swapped, block);
        AES_CTR_xcrypt_buffer(&ctx, swapped, 16);
        Bswap128(block, swapped);
        memcpy(&decrypted[i], block, blockLen);

        currentWork += blockLen;
        if (progressCallback && (i % 65536 == 0))
            progressCallback(currentWork, totalWork);
    }

    if (!isBufferPlaintext(decrypted.data(), areaSize))
        return false;

    memcpy(&rom[areaOffset], decrypted.data(), areaSize);
    return true;
}

namespace MelonDSAndroid {
namespace RomDecryptor {

static EncryptionStatus CheckEncryptionFromFile(FILE* f)
{
    if (fseek(f, 0, SEEK_END) != 0)
        return EncryptionStatus::ERROR_READING_FILE;
    long rawSize = ftell(f);
    if (rawSize < 0)
        return EncryptionStatus::ERROR_READING_FILE;
    uint64_t fileSize = static_cast<uint64_t>(rawSize);

    if (fseek(f, 0, SEEK_SET) != 0)
        return EncryptionStatus::ERROR_READING_FILE;

    uint8_t header[HEADER_SIZE];
    size_t read = fread(header, 1, HEADER_SIZE, f);

    if (read < 0x400)
        return EncryptionStatus::ERROR_FILE_TOO_SMALL;

    // Check if DSi ROM (UnitCode bit 1 or 0x03)
    uint8_t unitCode = header[OFFSET_UNIT_CODE];
    if (!(unitCode & 0x02) && unitCode != 0x03)
        return EncryptionStatus::ERROR_NOT_DSI_ROM;

    // Per DSi spec, offset 0x1C bit 0 indicates Modcrypt is enabled
    if ((header[OFFSET_DSI_CRYPTO_FLAGS] & 0x01) == 0)
        return EncryptionStatus::NOT_ENCRYPTED;

    uint32_t mod1Off  = LE32(&header[OFFSET_MODCRYPT1_OFF]);
    uint32_t mod1Size = LE32(&header[OFFSET_MODCRYPT1_SIZE]);
    uint32_t mod2Off  = LE32(&header[OFFSET_MODCRYPT2_OFF]);
    uint32_t mod2Size = LE32(&header[OFFSET_MODCRYPT2_SIZE]);

    if ((mod1Size == 0 || mod1Size == 0xFFFFFFFFu) && (mod2Size == 0 || mod2Size == 0xFFFFFFFFu))
        return EncryptionStatus::NOT_ENCRYPTED;

    bool isEncrypted = false;
    if (RangeFitsInFile(mod1Off, mod1Size, fileSize))
        isEncrypted = IsModcryptAreaEncrypted(f, mod1Off, mod1Size, fileSize);
    if (!isEncrypted && RangeFitsInFile(mod2Off, mod2Size, fileSize))
        isEncrypted = IsModcryptAreaEncrypted(f, mod2Off, mod2Size, fileSize);

    if (!isEncrypted)
        return EncryptionStatus::NOT_ENCRYPTED;

    return EncryptionStatus::MODCRYPT_ENCRYPTED;
}

EncryptionStatus CheckEncryptionFd(int fd)
{
    if (fd < 0)
        return EncryptionStatus::ERROR_READING_FILE;

    int dupFd = dup(fd);
    if (dupFd < 0)
        return EncryptionStatus::ERROR_READING_FILE;

    FILE* f = fdopen(dupFd, "rb");
    if (!f)
    {
        close(dupFd);
        return EncryptionStatus::ERROR_READING_FILE;
    }

    EncryptionStatus status = CheckEncryptionFromFile(f);
    fclose(f);
    return status;
}

EncryptionStatus CheckEncryption(const char* romPath)
{
    if (!romPath)
        return EncryptionStatus::ERROR_READING_FILE;

    FILE* f = fopen(romPath, "rb");
    if (!f)
        return EncryptionStatus::ERROR_READING_FILE;

    EncryptionStatus status = CheckEncryptionFromFile(f);
    fclose(f);
    return status;
}

static int IndexOfSequence(const uint8_t* buffer, size_t bufferLen, const uint8_t* pattern, size_t patternLen)
{
    if (bufferLen < patternLen) return -1;
    size_t max = bufferLen - patternLen;
    for (size_t i = 0; i <= max; i++)
    {
        if (buffer[i] != pattern[0]) continue;
        if (memcmp(&buffer[i], pattern, patternLen) == 0)
            return (int)i;
    }
    return -1;
}

bool ApplyCompatibilityPatches(uint8_t* rom, size_t fileSize)
{
    if (!rom || fileSize < HEADER_SIZE) return false;
    bool patched = false;

    // AlphaBounce [KALE] / [KALP]: runs natively via TWLFontTable.dat auto-provisioning on NAND.
    // Reverse-heal any ROM previously modified on disk with the legacy "rom:/Arial.NFTR" redirect.
    if (memcmp(&rom[OFFSET_GAME_CODE], "KAL", 3) == 0)
    {
        uint32_t arm9Off = LE32(&rom[OFFSET_ARM9_ROM_OFFSET]);

        auto restoreAt = [&](uint32_t relOffset, uint32_t patchedOp, uint32_t origOp) {
            if (arm9Off > 0 && static_cast<uint64_t>(arm9Off) + relOffset + 4 <= static_cast<uint64_t>(fileSize))
            {
                uint64_t off = static_cast<uint64_t>(arm9Off) + relOffset;
                if (LE32(&rom[off]) == patchedOp)
                {
                    memcpy(&rom[off], &origOp, sizeof(origOp));
                    patched = true;
                }
            }
            if (static_cast<uint64_t>(relOffset) + 4 <= static_cast<uint64_t>(fileSize))
            {
                if (LE32(&rom[relOffset]) == patchedOp)
                {
                    memcpy(&rom[relOffset], &origOp, sizeof(origOp));
                    patched = true;
                }
            }
        };

        restoreAt(0x50d4, 0xe1a00000, 0xeb0085a3);
        restoreAt(0xba014, 0xea00000f, 0xebfdb1d3);
        restoreAt(0xe4548, 0xe1a00000, 0xebfd0886);
        restoreAt(0xf5c50, 0xe1a00000, 0xebfcc2c4);
        restoreAt(0xf5f0c, 0xe1a00000, 0xebfcc215);

        const char origPath[] = "nand:/sys/TWLFontTable.dat";
        const size_t targetLen = sizeof(origPath) - 1;
        const char legacyFont[] = "rom:/Arial.NFTR";
        char legacySeq[sizeof(origPath)] = {0};
        memcpy(legacySeq, legacyFont, strlen(legacyFont));

        size_t searchPos = 0;
        while (searchPos + targetLen <= fileSize)
        {
            int found = IndexOfSequence(rom + searchPos, fileSize - searchPos, (const uint8_t*)legacySeq, targetLen);
            if (found == -1)
                break;
            memcpy(&rom[searchPos + found], origPath, targetLen);
            patched = true;
            searchPos += found + targetLen;
        }

        if (patched && fileSize >= 0x8000)
        {
            uint16_t secCrc = CalcHeaderCRC16(&rom[0x4000], 0x4000);
            WriteLE16(&rom[0x6C], secCrc);
        }
    }

    return patched;
}

static DecryptResult DecryptRomInMemory(
    uint8_t* rom,
    size_t fileSize,
    ProgressCallback progressCallback,
    bool* outNeedsDiskWrite,
    uint32_t* outTotalWork
)
{
    if (outNeedsDiskWrite) *outNeedsDiskWrite = false;
    if (outTotalWork) *outTotalWork = 0;

    if (!rom || fileSize < HEADER_SIZE)
        return DecryptResult::ERROR_FILE_TOO_SMALL;

    // Check if DSi ROM (UnitCode bit 1 or 0x03)
    uint8_t unitCode = rom[OFFSET_UNIT_CODE];
    if (!(unitCode & 0x02) && unitCode != 0x03)
        return DecryptResult::ERROR_NOT_DSI_ROM;

    // Read modcrypt area offsets and sizes
    uint32_t mod1Off  = LE32(&rom[OFFSET_MODCRYPT1_OFF]);
    uint32_t mod1Size = LE32(&rom[OFFSET_MODCRYPT1_SIZE]);
    uint32_t mod2Off  = LE32(&rom[OFFSET_MODCRYPT2_OFF]);
    uint32_t mod2Size = LE32(&rom[OFFSET_MODCRYPT2_SIZE]);

    const uint64_t uFileSize = static_cast<uint64_t>(fileSize);
    const bool mod1Active = (mod1Size > 0 && mod1Size != 0xFFFFFFFFu && mod1Off > 0);
    const bool mod2Active = (mod2Size > 0 && mod2Size != 0xFFFFFFFFu && mod2Off > 0);

    if ((mod1Active && static_cast<uint64_t>(mod1Off) + static_cast<uint64_t>(mod1Size) > uFileSize) ||
        (mod2Active && static_cast<uint64_t>(mod2Off) + static_cast<uint64_t>(mod2Size) > uFileSize))
    {
        return DecryptResult::ERROR_MODCRYPT_AREA_OUT_OF_BOUNDS;
    }

    const bool modcryptEnabled = (rom[OFFSET_DSI_CRYPTO_FLAGS] & 0x01) != 0;

    bool mod1Encrypted = false;
    if (modcryptEnabled && mod1Active)
        mod1Encrypted = !isBufferPlaintext(&rom[mod1Off], mod1Size);

    bool mod2Encrypted = false;
    if (modcryptEnabled && mod2Active)
        mod2Encrypted = !isBufferPlaintext(&rom[mod2Off], mod2Size);

    if (!mod1Encrypted && !mod2Encrypted)
    {
        bool patched = ApplyCompatibilityPatches(rom, fileSize);
        bool flagsChanged = (rom[OFFSET_DSI_CRYPTO_FLAGS] & 0x03) != 0;
        rom[OFFSET_DSI_CRYPTO_FLAGS] &= ~0x03;
        if (patched || flagsChanged)
        {
            uint16_t headerCrc = CalcHeaderCRC16(rom, 0x15E);
            WriteLE16(&rom[0x15E], headerCrc);
            if (!ValidateDecryptedRom(rom, fileSize))
                return DecryptResult::ERROR_VALIDATION_FAILED;
            if (outNeedsDiskWrite) *outNeedsDiskWrite = true;
            return DecryptResult::SUCCESS;
        }
        if (!ValidateDecryptedRom(rom, fileSize))
        {
            return DecryptResult::ERROR_VALIDATION_FAILED;
        }
        return DecryptResult::ALREADY_DECRYPTED;
    }

    uint32_t totalWork = (mod1Encrypted ? mod1Size : 0) + (mod2Encrypted ? mod2Size : 0);
    uint32_t currentWork = 0;

    bool devKey = (rom[OFFSET_DSI_CRYPTO_FLAGS] & (1 << 4)) || (rom[OFFSET_APP_FLAGS] & (1 << 7));
    static constexpr uint32_t keyCandidates[] = {
        OFFSET_DSI_ARM9I_HASH,
        OFFSET_DSI_DIGEST_HASH,
        OFFSET_DSI_ARM7I_HASH,
        OFFSET_DSI_ARM9_HASH,
        OFFSET_DSI_ARM7_HASH,
        OFFSET_BANNER_HASH,
        OFFSET_HEADER_BIN_HASH,
        OFFSET_ARM9_OVERLAY_HASH,
        OFFSET_DSI_ARM9_NOSEC_HASH
    };
    const size_t keyCandidateCount = sizeof(keyCandidates) / sizeof(keyCandidates[0]);

    if (mod1Encrypted && mod1Active)
    {
        if (!DecryptModcryptArea(
                rom, fileSize, mod1Off, mod1Size, OFFSET_DSI_ARM9_HASH,
                devKey, keyCandidates, keyCandidateCount,
                currentWork, totalWork, progressCallback
            ))
        {
            return DecryptResult::ERROR_VALIDATION_FAILED;
        }
    }

    if (mod2Encrypted && mod2Active)
    {
        if (!DecryptModcryptArea(
                rom, fileSize, mod2Off, mod2Size, OFFSET_DSI_ARM7_HASH,
                devKey, keyCandidates, keyCandidateCount,
                currentWork, totalWork, progressCallback
            ))
        {
            return DecryptResult::ERROR_VALIDATION_FAILED;
        }
    }

    ApplyCompatibilityPatches(rom, fileSize);

    // Clear Modcrypt encrypted flags (bits 0 and 1: 0=decrypted/plaintext) and recalculate header CRC16
    rom[OFFSET_DSI_CRYPTO_FLAGS] &= ~0x03;
    uint16_t headerCrc = CalcHeaderCRC16(rom, 0x15E);
    WriteLE16(&rom[0x15E], headerCrc);

    if (!ValidateDecryptedRom(rom, fileSize))
        return DecryptResult::ERROR_VALIDATION_FAILED;

    if (outNeedsDiskWrite) *outNeedsDiskWrite = true;
    if (outTotalWork) *outTotalWork = totalWork;
    return DecryptResult::SUCCESS;
}

DecryptResult DecryptRomFd(int fd, ProgressCallback progressCallback)
{
    if (fd < 0)
        return DecryptResult::ERROR_READING_FILE;

    int dupFd = dup(fd);
    if (dupFd < 0)
        return DecryptResult::ERROR_READING_FILE;

    FILE* f = fdopen(dupFd, "r+b");
    if (!f)
    {
        close(dupFd);
        return DecryptResult::ERROR_READING_FILE;
    }

    if (fseek(f, 0, SEEK_END) != 0)
    {
        fclose(f);
        return DecryptResult::ERROR_READING_FILE;
    }
    long rawFileSize = ftell(f);
    if (rawFileSize < 0)
    {
        fclose(f);
        return DecryptResult::ERROR_READING_FILE;
    }
    if (rawFileSize < static_cast<long>(HEADER_SIZE))
    {
        fclose(f);
        return DecryptResult::ERROR_FILE_TOO_SMALL;
    }

    const size_t fileSize = static_cast<size_t>(rawFileSize);
    if (fseek(f, 0, SEEK_SET) != 0)
    {
        fclose(f);
        return DecryptResult::ERROR_READING_FILE;
    }

    std::vector<uint8_t> rom(fileSize);
    size_t read = fread(rom.data(), 1, fileSize, f);
    if (read != fileSize)
    {
        fclose(f);
        return DecryptResult::ERROR_READING_FILE;
    }

    bool needsDiskWrite = false;
    uint32_t totalWork = 0;
    DecryptResult result = DecryptRomInMemory(rom.data(), fileSize, progressCallback, &needsDiskWrite, &totalWork);
    if (result != DecryptResult::SUCCESS && result != DecryptResult::ALREADY_DECRYPTED)
    {
        fclose(f);
        return result;
    }

    if (needsDiskWrite)
    {
        if (fseek(f, 0, SEEK_SET) != 0)
        {
            fclose(f);
            return DecryptResult::ERROR_WRITING_FILE;
        }
        size_t written = fwrite(rom.data(), 1, fileSize, f);
        if (written != fileSize || fflush(f) != 0 || fsync(dupFd) != 0)
        {
            fclose(f);
            return DecryptResult::ERROR_WRITING_FILE;
        }
    }

    fclose(f);

    if (result == DecryptResult::SUCCESS && progressCallback)
        progressCallback(totalWork, totalWork);

    return result;
}

DecryptResult DecryptRomFile(const char* romPath, ProgressCallback progressCallback)
{
    if (!romPath || romPath[0] == '\0')
        return DecryptResult::ERROR_READING_FILE;

    FILE* src = fopen(romPath, "rb");
    if (!src)
        return DecryptResult::ERROR_READING_FILE;

    if (fseek(src, 0, SEEK_END) != 0)
    {
        fclose(src);
        return DecryptResult::ERROR_READING_FILE;
    }
    long rawFileSize = ftell(src);
    if (rawFileSize < 0)
    {
        fclose(src);
        return DecryptResult::ERROR_READING_FILE;
    }
    if (rawFileSize < static_cast<long>(HEADER_SIZE))
    {
        fclose(src);
        return DecryptResult::ERROR_FILE_TOO_SMALL;
    }

    const size_t fileSize = static_cast<size_t>(rawFileSize);
    if (fseek(src, 0, SEEK_SET) != 0)
    {
        fclose(src);
        return DecryptResult::ERROR_READING_FILE;
    }

    std::vector<uint8_t> rom(fileSize);
    size_t read = fread(rom.data(), 1, fileSize, src);
    fclose(src);
    if (read != fileSize)
        return DecryptResult::ERROR_READING_FILE;

    bool needsDiskWrite = false;
    uint32_t totalWork = 0;
    DecryptResult result = DecryptRomInMemory(rom.data(), fileSize, progressCallback, &needsDiskWrite, &totalWork);
    if (result != DecryptResult::SUCCESS && result != DecryptResult::ALREADY_DECRYPTED)
        return result;

    if (needsDiskWrite)
    {
        std::string tmpPath = std::string(romPath) + ".tmp_storm";
        FILE* tmp = fopen(tmpPath.c_str(), "wb");
        if (!tmp)
            return DecryptResult::ERROR_WRITING_FILE;

        size_t written = fwrite(rom.data(), 1, fileSize, tmp);
        bool ok = (written == fileSize) && (fflush(tmp) == 0) && (fsync(fileno(tmp)) == 0);
        if (fclose(tmp) != 0)
            ok = false;

        if (!ok || rename(tmpPath.c_str(), romPath) != 0)
        {
            remove(tmpPath.c_str());
            return DecryptResult::ERROR_WRITING_FILE;
        }
    }

    if (result == DecryptResult::SUCCESS && progressCallback)
        progressCallback(totalWork, totalWork);

    return result;
}

bool DecryptRomBuffer(uint8_t* rom, size_t fileSize)
{
    if (!rom || fileSize < HEADER_SIZE)
        return false;

    // Unconditionally apply in-memory compatibility patches (AlphaBounce KAL*, etc.)
    ApplyCompatibilityPatches(rom, fileSize);

    // Check if DSi ROM (UnitCode bit 1 or 0x03)
    uint8_t unitCode = rom[OFFSET_UNIT_CODE];
    if (!(unitCode & 0x02) && unitCode != 0x03)
        return false;

    // Read modcrypt area offsets and sizes
    uint32_t mod1Off  = LE32(&rom[OFFSET_MODCRYPT1_OFF]);
    uint32_t mod1Size = LE32(&rom[OFFSET_MODCRYPT1_SIZE]);
    uint32_t mod2Off  = LE32(&rom[OFFSET_MODCRYPT2_OFF]);
    uint32_t mod2Size = LE32(&rom[OFFSET_MODCRYPT2_SIZE]);

    if ((mod1Size == 0 || mod1Size == 0xFFFFFFFFu) && (mod2Size == 0 || mod2Size == 0xFFFFFFFFu))
        return false;

    const uint64_t uFileSize = static_cast<uint64_t>(fileSize);
    const bool modcryptEnabled = (rom[OFFSET_DSI_CRYPTO_FLAGS] & 0x01) != 0;
    bool mod1Encrypted = false;
    if (modcryptEnabled && RangeFitsInFile(mod1Off, mod1Size, uFileSize))
        mod1Encrypted = !isBufferPlaintext(&rom[mod1Off], mod1Size);

    bool mod2Encrypted = false;
    if (modcryptEnabled && RangeFitsInFile(mod2Off, mod2Size, uFileSize))
        mod2Encrypted = !isBufferPlaintext(&rom[mod2Off], mod2Size);

    if (!mod1Encrypted && !mod2Encrypted)
    {
        bool patched = ApplyCompatibilityPatches(rom, fileSize);
        bool flagsChanged = (rom[OFFSET_DSI_CRYPTO_FLAGS] & 0x03) != 0;
        rom[OFFSET_DSI_CRYPTO_FLAGS] &= ~0x03;
        if (patched || flagsChanged)
        {
            uint16_t headerCrc = CalcHeaderCRC16(rom, 0x15E);
            WriteLE16(&rom[0x15E], headerCrc);
        }
        return true;
    }

    bool devKey = (rom[OFFSET_DSI_CRYPTO_FLAGS] & (1 << 4)) || (rom[OFFSET_APP_FLAGS] & (1 << 7));
    static constexpr uint32_t keyCandidates[] = {
        OFFSET_DSI_ARM9I_HASH,
        OFFSET_DSI_DIGEST_HASH,
        OFFSET_DSI_ARM7I_HASH,
        OFFSET_DSI_ARM9_HASH,
        OFFSET_DSI_ARM7_HASH,
        OFFSET_BANNER_HASH,
        OFFSET_HEADER_BIN_HASH,
        OFFSET_ARM9_OVERLAY_HASH,
        OFFSET_DSI_ARM9_NOSEC_HASH
    };
    const size_t keyCandidateCount = sizeof(keyCandidates) / sizeof(keyCandidates[0]);
    uint32_t dummyWork = 0;

    if (mod1Encrypted && RangeFitsInFile(mod1Off, mod1Size, uFileSize))
    {
        if (!DecryptModcryptArea(
                rom, fileSize, mod1Off, mod1Size, OFFSET_DSI_ARM9_HASH,
                devKey, keyCandidates, keyCandidateCount,
                dummyWork, 0, nullptr
            ))
        {
            return false;
        }
    }

    if (mod2Encrypted && RangeFitsInFile(mod2Off, mod2Size, uFileSize))
    {
        if (!DecryptModcryptArea(
                rom, fileSize, mod2Off, mod2Size, OFFSET_DSI_ARM7_HASH,
                devKey, keyCandidates, keyCandidateCount,
                dummyWork, 0, nullptr
            ))
        {
            return false;
        }
    }

    ApplyCompatibilityPatches(rom, fileSize);
    rom[OFFSET_DSI_CRYPTO_FLAGS] &= ~0x03;
    uint16_t headerCrc = CalcHeaderCRC16(rom, 0x15E);
    WriteLE16(&rom[0x15E], headerCrc);
    return true;
}

} // namespace RomDecryptor
} // namespace MelonDSAndroid
