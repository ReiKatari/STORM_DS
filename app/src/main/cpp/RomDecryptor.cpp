#include "RomDecryptor.h"
#include <cstring>
#include <cstdio>
#include <vector>
#include <unistd.h>
#include <fcntl.h>

extern "C" {
#include "../../../melonDS-android-lib/src/tiny-AES-c/aes.h"
}

// ---------- Helper functions (adapted from melonDS DSi.cpp / DSi_AES.cpp) ----------

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

// NDS header offsets
static constexpr uint32_t OFFSET_GAME_CODE       = 0x0C;
static constexpr uint32_t OFFSET_UNIT_CODE        = 0x12;
static constexpr uint32_t OFFSET_DSI_CRYPTO_FLAGS = 0x1C;
static constexpr uint32_t OFFSET_APP_FLAGS        = 0x1D;
static constexpr uint32_t OFFSET_MODCRYPT1_OFF    = 0x220;
static constexpr uint32_t OFFSET_MODCRYPT1_SIZE   = 0x224;
static constexpr uint32_t OFFSET_MODCRYPT2_OFF    = 0x228;
static constexpr uint32_t OFFSET_MODCRYPT2_SIZE   = 0x22C;
static constexpr uint32_t OFFSET_DSI_ARM9_HASH    = 0x300; // IV for area 1
static constexpr uint32_t OFFSET_DSI_ARM7_HASH    = 0x314; // IV for area 2
static constexpr uint32_t OFFSET_DSI_ARM9I_HASH   = 0x328; // KeyY source
static constexpr uint32_t HEADER_SIZE             = 0x1000;

static bool IsModcryptAreaEncrypted(FILE* f, uint32_t offset, uint32_t size)
{
    if (offset == 0 || size == 0) return false;
    if (fseek(f, offset, SEEK_SET) != 0) return false;

    uint8_t sample[512];
    size_t sampleRead = fread(sample, 1, sizeof(sample), f);
    if (sampleRead < 64) return false;

    int zeroCount = 0;
    for (size_t i = 0; i < sampleRead; i++)
    {
        if (sample[i] == 0x00) zeroCount++;
    }

    // In compiled ARM/Thumb code, 20-30% of bytes are 0x00.
    // In AES ciphertext, zero count is ~0.4% (2 zeros per 512 bytes).
    // If zero count is >= 12 in 512 bytes (~2.3%), data is cleartext ARM code (ALREADY DECRYPTED).
    int threshold = (sampleRead >= 256) ? 12 : 4;
    return (zeroCount < threshold);
}

namespace MelonDSAndroid {
namespace RomDecryptor {

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

    fseek(f, 0, SEEK_SET);
    uint8_t header[HEADER_SIZE];
    size_t read = fread(header, 1, HEADER_SIZE, f);

    if (read < 0x400)
    {
        fclose(f);
        return EncryptionStatus::ERROR_FILE_TOO_SMALL;
    }

    // Check if DSi ROM (UnitCode bit 1)
    uint8_t unitCode = header[OFFSET_UNIT_CODE];
    if (!(unitCode & 0x02))
    {
        fclose(f);
        return EncryptionStatus::ERROR_NOT_DSI_ROM;
    }

    // Check Modcrypt flag (bit 1 of DSiCryptoFlags)
    uint8_t cryptoFlags = header[OFFSET_DSI_CRYPTO_FLAGS];
    if (!(cryptoFlags & (1 << 1)))
    {
        fclose(f);
        return EncryptionStatus::NOT_ENCRYPTED;
    }

    uint32_t mod1Off  = *(uint32_t*)&header[OFFSET_MODCRYPT1_OFF];
    uint32_t mod1Size = *(uint32_t*)&header[OFFSET_MODCRYPT1_SIZE];
    uint32_t mod2Off  = *(uint32_t*)&header[OFFSET_MODCRYPT2_OFF];
    uint32_t mod2Size = *(uint32_t*)&header[OFFSET_MODCRYPT2_SIZE];

    bool isEncrypted = false;
    if (mod1Off > 0 && mod1Size > 0)
        isEncrypted = IsModcryptAreaEncrypted(f, mod1Off, mod1Size);
    if (!isEncrypted && mod2Off > 0 && mod2Size > 0)
        isEncrypted = IsModcryptAreaEncrypted(f, mod2Off, mod2Size);

    fclose(f);
    return isEncrypted ? EncryptionStatus::MODCRYPT_ENCRYPTED : EncryptionStatus::NOT_ENCRYPTED;
}

EncryptionStatus CheckEncryption(const char* romPath)
{
    FILE* f = fopen(romPath, "rb");
    if (!f)
        return EncryptionStatus::ERROR_READING_FILE;

    uint8_t header[HEADER_SIZE];
    size_t read = fread(header, 1, HEADER_SIZE, f);

    if (read < 0x400)
    {
        fclose(f);
        return EncryptionStatus::ERROR_FILE_TOO_SMALL;
    }

    uint8_t unitCode = header[OFFSET_UNIT_CODE];
    if (!(unitCode & 0x02))
    {
        fclose(f);
        return EncryptionStatus::ERROR_NOT_DSI_ROM;
    }

    uint8_t cryptoFlags = header[OFFSET_DSI_CRYPTO_FLAGS];
    if (!(cryptoFlags & (1 << 1)))
    {
        fclose(f);
        return EncryptionStatus::NOT_ENCRYPTED;
    }

    uint32_t mod1Off  = *(uint32_t*)&header[OFFSET_MODCRYPT1_OFF];
    uint32_t mod1Size = *(uint32_t*)&header[OFFSET_MODCRYPT1_SIZE];
    uint32_t mod2Off  = *(uint32_t*)&header[OFFSET_MODCRYPT2_OFF];
    uint32_t mod2Size = *(uint32_t*)&header[OFFSET_MODCRYPT2_SIZE];

    bool isEncrypted = false;
    if (mod1Off > 0 && mod1Size > 0)
        isEncrypted = IsModcryptAreaEncrypted(f, mod1Off, mod1Size);
    if (!isEncrypted && mod2Off > 0 && mod2Size > 0)
        isEncrypted = IsModcryptAreaEncrypted(f, mod2Off, mod2Size);

    fclose(f);
    return isEncrypted ? EncryptionStatus::MODCRYPT_ENCRYPTED : EncryptionStatus::NOT_ENCRYPTED;
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

    // Get file size
    fseek(f, 0, SEEK_END);
    long fileSize = ftell(f);
    fseek(f, 0, SEEK_SET);

    if (fileSize < HEADER_SIZE)
    {
        fclose(f);
        return DecryptResult::ERROR_FILE_TOO_SMALL;
    }

    // Read entire ROM into memory
    std::vector<uint8_t> rom(fileSize);
    size_t read = fread(rom.data(), 1, fileSize, f);
    if ((long)read != fileSize)
    {
        fclose(f);
        return DecryptResult::ERROR_READING_FILE;
    }

    // Check if DSi ROM
    uint8_t unitCode = rom[OFFSET_UNIT_CODE];
    if (!(unitCode & 0x02))
    {
        fclose(f);
        return DecryptResult::ERROR_NOT_DSI_ROM;
    }

    // Read modcrypt area offsets and sizes
    uint32_t mod1Off  = *(uint32_t*)&rom[OFFSET_MODCRYPT1_OFF];
    uint32_t mod1Size = *(uint32_t*)&rom[OFFSET_MODCRYPT1_SIZE];
    uint32_t mod2Off  = *(uint32_t*)&rom[OFFSET_MODCRYPT2_OFF];
    uint32_t mod2Size = *(uint32_t*)&rom[OFFSET_MODCRYPT2_SIZE];

    // Check if encrypted
    uint8_t cryptoFlags = rom[OFFSET_DSI_CRYPTO_FLAGS];
    if (!(cryptoFlags & (1 << 1)))
    {
        fclose(f);
        return DecryptResult::ALREADY_DECRYPTED;
    }

    // Validate if data is actually encrypted
    bool mod1Encrypted = false;
    if (mod1Off > 0 && mod1Size > 0 && mod1Off + mod1Size <= (uint32_t)fileSize)
    {
        int zCount = 0;
        size_t sLen = (mod1Size < 512) ? mod1Size : 512;
        for (size_t i = 0; i < sLen; i++)
            if (rom[mod1Off + i] == 0) zCount++;
        mod1Encrypted = (zCount < 12);
    }

    bool mod2Encrypted = false;
    if (mod2Off > 0 && mod2Size > 0 && mod2Off + mod2Size <= (uint32_t)fileSize)
    {
        int zCount = 0;
        size_t sLen = (mod2Size < 512) ? mod2Size : 512;
        for (size_t i = 0; i < sLen; i++)
            if (rom[mod2Off + i] == 0) zCount++;
        mod2Encrypted = (zCount < 12);
    }

    if (!mod1Encrypted && !mod2Encrypted)
    {
        // Already decrypted: clear header flag
        rom[OFFSET_DSI_CRYPTO_FLAGS] &= ~(1 << 1);
        fseek(f, 0, SEEK_SET);
        fwrite(rom.data(), 1, fileSize, f);
        fflush(f);
        fclose(f);
        return DecryptResult::ALREADY_DECRYPTED;
    }

    uint32_t totalWork = (mod1Encrypted ? mod1Size : 0) + (mod2Encrypted ? mod2Size : 0);
    uint32_t currentWork = 0;

    // Validate bounds
    if ((mod1Off + mod1Size > (uint32_t)fileSize) || (mod2Off + mod2Size > (uint32_t)fileSize))
    {
        fclose(f);
        return DecryptResult::ERROR_MODCRYPT_AREA_OUT_OF_BOUNDS;
    }

    // Derive the AES key
    uint8_t normalKey[16];

    bool devKey = (rom[OFFSET_DSI_CRYPTO_FLAGS] & (1 << 4)) || (rom[OFFSET_APP_FLAGS] & (1 << 7));
    if (devKey)
    {
        uint8_t tmp[16];
        memcpy(tmp, &rom[0], 16);
        Bswap128(normalKey, tmp);
    }
    else
    {
        uint8_t keyX[16], keyY[16], tmp[16];

        *(uint32_t*)&keyX[0] = 0x746E694E; // "Nint" (little-endian)
        *(uint32_t*)&keyX[4] = 0x6F646E65; // "endo"
        keyX[8]  = rom[OFFSET_GAME_CODE + 0];
        keyX[9]  = rom[OFFSET_GAME_CODE + 1];
        keyX[10] = rom[OFFSET_GAME_CODE + 2];
        keyX[11] = rom[OFFSET_GAME_CODE + 3];
        keyX[12] = rom[OFFSET_GAME_CODE + 3];
        keyX[13] = rom[OFFSET_GAME_CODE + 2];
        keyX[14] = rom[OFFSET_GAME_CODE + 1];
        keyX[15] = rom[OFFSET_GAME_CODE + 0];

        memcpy(keyY, &rom[OFFSET_DSI_ARM9I_HASH], 16);

        DeriveNormalKey(keyX, keyY, tmp);
        Bswap128(normalKey, tmp);
    }

    // --- Decrypt Modcrypt Area 1 (ARM9i) ---
    if (mod1Encrypted && mod1Off > 0 && mod1Size > 0)
    {
        AES_ctx ctx;
        uint8_t iv[16];
        Bswap128(iv, &rom[OFFSET_DSI_ARM9_HASH]);
        AES_init_ctx_iv(&ctx, normalKey, iv);

        for (uint32_t i = 0; i < mod1Size; i += 16)
        {
            uint32_t blockLen = (i + 16 <= mod1Size) ? 16 : (mod1Size - i);
            uint8_t block[16] = {0};
            memcpy(block, &rom[mod1Off + i], blockLen);
            uint8_t swapped[16];
            Bswap128(swapped, block);
            AES_CTR_xcrypt_buffer(&ctx, swapped, 16);
            Bswap128(block, swapped);
            memcpy(&rom[mod1Off + i], block, blockLen);

            currentWork += blockLen;
            if (progressCallback && (i % 65536 == 0))
                progressCallback(currentWork, totalWork);
        }
    }

    // --- Decrypt Modcrypt Area 2 (ARM7i) ---
    if (mod2Encrypted && mod2Off > 0 && mod2Size > 0)
    {
        AES_ctx ctx;
        uint8_t iv[16];
        Bswap128(iv, &rom[OFFSET_DSI_ARM7_HASH]);
        AES_init_ctx_iv(&ctx, normalKey, iv);

        for (uint32_t i = 0; i < mod2Size; i += 16)
        {
            uint32_t blockLen = (i + 16 <= mod2Size) ? 16 : (mod2Size - i);
            uint8_t block[16] = {0};
            memcpy(block, &rom[mod2Off + i], blockLen);
            uint8_t swapped[16];
            Bswap128(swapped, block);
            AES_CTR_xcrypt_buffer(&ctx, swapped, 16);
            Bswap128(block, swapped);
            memcpy(&rom[mod2Off + i], block, blockLen);

            currentWork += blockLen;
            if (progressCallback && (i % 65536 == 0))
                progressCallback(currentWork, totalWork);
        }
    }

    // Clear Modcrypt encryption flag
    rom[OFFSET_DSI_CRYPTO_FLAGS] &= ~(1 << 1);

    // Write decrypted ROM back in-place
    fseek(f, 0, SEEK_SET);
    size_t written = fwrite(rom.data(), 1, fileSize, f);
    fflush(f);
    fclose(f);

    if ((long)written != fileSize)
        return DecryptResult::ERROR_WRITING_FILE;

    if (progressCallback)
        progressCallback(totalWork, totalWork);

    return DecryptResult::SUCCESS;
}

DecryptResult DecryptRomFile(const char* romPath, ProgressCallback progressCallback)
{
    int fd = open(romPath, O_RDWR);
    if (fd < 0)
        return DecryptResult::ERROR_READING_FILE;

    DecryptResult result = DecryptRomFd(fd, progressCallback);
    close(fd);
    return result;
}

} // namespace RomDecryptor
} // namespace MelonDSAndroid
