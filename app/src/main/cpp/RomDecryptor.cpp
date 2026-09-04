#include "RomDecryptor.h"
#include <cstring>
#include <cstdio>
#include <vector>
#include <algorithm>
#include <unistd.h>
#include <fcntl.h>
#include <android/log.h>

#define LOG_TAG "STORM_RomDecryptor"
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, LOG_TAG, __VA_ARGS__)
#define LOGW(...) __android_log_print(ANDROID_LOG_WARN, LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)

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

static void AddCtr(uint8_t* ctr, uint32_t carry)
{
    uint32_t counter[4];
    for (int i = 0; i < 4; i++)
        counter[i] = ((uint32_t)ctr[i * 4 + 0] << 24) | ((uint32_t)ctr[i * 4 + 1] << 16) |
                     ((uint32_t)ctr[i * 4 + 2] << 8)  | (uint32_t)ctr[i * 4 + 3];

    for (int i = 3; i >= 0; i--)
    {
        uint64_t sum = (uint64_t)counter[i] + carry;
        carry = (uint32_t)(sum >> 32);
        counter[i] = (uint32_t)sum;
    }

    for (int i = 0; i < 4; i++)
    {
        ctr[i * 4 + 0] = (uint8_t)(counter[i] >> 24);
        ctr[i * 4 + 1] = (uint8_t)(counter[i] >> 16);
        ctr[i * 4 + 2] = (uint8_t)(counter[i] >> 8);
        ctr[i * 4 + 3] = (uint8_t)(counter[i] >> 0);
    }
}

static void CryptArea(const struct AES_ctx* ctx, const uint8_t* ctrInit, uint8_t* rom, uint32_t offset, uint32_t size)
{
    uint8_t ctr[16];
    for (int i = 0; i < 16; i++)
        ctr[i] = ctrInit[15 - i];

    uint8_t stream[16];

    for (uint32_t i = 0; i < size; i += 16)
    {
        memcpy(stream, ctr, 16);
        AES_ECB_encrypt(ctx, stream);

        uint32_t blockLen = (size - i < 16) ? (size - i) : 16;
        for (uint32_t b = 0; b < blockLen; b++)
        {
            rom[offset + i + b] ^= stream[15 - b];
        }

        AddCtr(ctr, 1);
    }
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
static constexpr uint32_t OFFSET_MODCRYPT1_OFF    = 0x220;
static constexpr uint32_t OFFSET_MODCRYPT1_SIZE   = 0x224;
static constexpr uint32_t OFFSET_MODCRYPT2_OFF    = 0x228;
static constexpr uint32_t OFFSET_MODCRYPT2_SIZE   = 0x22C;
static constexpr uint32_t OFFSET_DSI_ARM9_HASH    = 0x300; // IV for area 1
static constexpr uint32_t OFFSET_DSI_ARM7_HASH    = 0x314; // IV for area 2
static constexpr uint32_t OFFSET_DSI_ARM9I_HASH   = 0x350; // KeyY source (ARM9i HMAC-SHA1)
static constexpr uint32_t OFFSET_DSI_ARM7I_HASH   = 0x364; // KeyY source (ARM7i HMAC-SHA1)
static constexpr uint32_t HEADER_SIZE             = 0x1000;

static bool isBufferPlaintext(const uint8_t* data, size_t size)
{
    if (!data || size < 16) return false;
    size_t checkWords = std::min<size_t>(size / 4, 32);
    if (checkWords < 8) return false;

    size_t armAlCount = 0;
    size_t thumbCount = 0;

    for (size_t i = 0; i < checkWords; i++)
    {
        uint32_t w = *(const uint32_t*)&data[i * 4];
        uint32_t cond = w >> 28;
        // In real ARM code, instructions almost universally use AL condition (0xE) or are zero padding/data
        if (w == 0 || cond == 0xE)
        {
            armAlCount++;
        }

        uint16_t hw0 = (uint16_t)w;
        uint16_t hw1 = (uint16_t)(w >> 16);
        // Thumb instructions: PUSH (0xB5xx), LDR PC (0x48xx..0x4Fxx), MOV (0x20xx..0x2Fxx), SUB/ADD SP (0xB0xx), etc.
        if (hw0 == 0 || (hw0 & 0xFF00) == 0xB500 || (hw0 & 0xF800) == 0x4800 || (hw0 & 0xF000) == 0x2000 || (hw0 & 0xFF00) == 0xB000)
            thumbCount++;
        if (hw1 == 0 || (hw1 & 0xFF00) == 0xB500 || (hw1 & 0xF800) == 0x4800 || (hw1 & 0xF000) == 0x2000 || (hw1 & 0xFF00) == 0xB000)
            thumbCount++;
    }

    // Plaintext ARM code has >= 37% AL/zero instructions (typically > 80%). Random AES ciphertext only has ~6% (2/32).
    bool isArmPlaintext = (armAlCount >= (checkWords * 12) / 32);
    bool isThumbPlaintext = (thumbCount >= (checkWords * 2 * 12) / 32);

    return isArmPlaintext || isThumbPlaintext;
}

static bool IsModcryptAreaEncrypted(FILE* f, uint32_t offset, uint32_t size)
{
    if (offset == 0 || size == 0) return false;
    if (fseek(f, offset, SEEK_SET) != 0) return false;

    uint8_t buffer[256];
    size_t sampleRead = fread(buffer, 1, sizeof(buffer), f);
    if (sampleRead < 16) return false;

    return !isBufferPlaintext(buffer, sampleRead);
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

    // Check if DSi ROM (UnitCode bit 1 or 0x03)
    uint8_t unitCode = header[OFFSET_UNIT_CODE];
    if (!(unitCode & 0x02) && unitCode != 0x03)
    {
        fclose(f);
        return EncryptionStatus::ERROR_NOT_DSI_ROM;
    }

    uint32_t mod1Off  = *(uint32_t*)&header[OFFSET_MODCRYPT1_OFF];
    uint32_t mod1Size = *(uint32_t*)&header[OFFSET_MODCRYPT1_SIZE];
    uint32_t mod2Off  = *(uint32_t*)&header[OFFSET_MODCRYPT2_OFF];
    uint32_t mod2Size = *(uint32_t*)&header[OFFSET_MODCRYPT2_SIZE];

    if ((mod1Size == 0 || mod1Size == 0xFFFFFFFF) && (mod2Size == 0 || mod2Size == 0xFFFFFFFF))
    {
        fclose(f);
        return EncryptionStatus::NOT_ENCRYPTED;
    }

    bool mod1Enc = (mod1Off > 0 && mod1Size > 0 && mod1Size != 0xFFFFFFFF) && IsModcryptAreaEncrypted(f, mod1Off, mod1Size);
    bool mod2Enc = (mod2Off > 0 && mod2Size > 0 && mod2Size != 0xFFFFFFFF) && IsModcryptAreaEncrypted(f, mod2Off, mod2Size);

    fclose(f);
    if (mod1Enc || mod2Enc)
        return EncryptionStatus::MODCRYPT_ENCRYPTED;
    else
        return EncryptionStatus::NOT_ENCRYPTED;
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
    if (!(unitCode & 0x02) && unitCode != 0x03)
    {
        fclose(f);
        return EncryptionStatus::ERROR_NOT_DSI_ROM;
    }

    uint32_t mod1Off  = *(uint32_t*)&header[OFFSET_MODCRYPT1_OFF];
    uint32_t mod1Size = *(uint32_t*)&header[OFFSET_MODCRYPT1_SIZE];
    uint32_t mod2Off  = *(uint32_t*)&header[OFFSET_MODCRYPT2_OFF];
    uint32_t mod2Size = *(uint32_t*)&header[OFFSET_MODCRYPT2_SIZE];

    if ((mod1Size == 0 || mod1Size == 0xFFFFFFFF) && (mod2Size == 0 || mod2Size == 0xFFFFFFFF))
    {
        fclose(f);
        return EncryptionStatus::NOT_ENCRYPTED;
    }

    bool mod1Enc = (mod1Off > 0 && mod1Size > 0 && mod1Size != 0xFFFFFFFF) && IsModcryptAreaEncrypted(f, mod1Off, mod1Size);
    bool mod2Enc = (mod2Off > 0 && mod2Size > 0 && mod2Size != 0xFFFFFFFF) && IsModcryptAreaEncrypted(f, mod2Off, mod2Size);

    fclose(f);
    if (mod1Enc || mod2Enc)
        return EncryptionStatus::MODCRYPT_ENCRYPTED;
    else
        return EncryptionStatus::NOT_ENCRYPTED;
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
    if (fileSize < (long)HEADER_SIZE)
    {
        fclose(f);
        return DecryptResult::ERROR_FILE_TOO_SMALL;
    }

    fseek(f, 0, SEEK_SET);

    // Read entire ROM into memory
    std::vector<uint8_t> rom(fileSize);
    size_t read = fread(rom.data(), 1, fileSize, f);
    if ((long)read != fileSize)
    {
        fclose(f);
        return DecryptResult::ERROR_READING_FILE;
    }

    // Check if DSi ROM (UnitCode bit 1 or 0x03)
    uint8_t unitCode = rom[OFFSET_UNIT_CODE];
    if (!(unitCode & 0x02) && unitCode != 0x03)
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

    bool mod1Encrypted = (mod1Off > 0 && mod1Size > 0 && mod1Off + mod1Size <= (uint32_t)fileSize) &&
                         !isBufferPlaintext(&rom[mod1Off], std::min<size_t>(mod1Size, 256));

    bool mod2Encrypted = (mod2Off > 0 && mod2Size > 0 && mod2Off + mod2Size <= (uint32_t)fileSize) &&
                         !isBufferPlaintext(&rom[mod2Off], std::min<size_t>(mod2Size, 256));

    if (!mod1Encrypted && !mod2Encrypted)
    {
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
    uint8_t keyX[16];
    memcpy(keyX, "Nintendo", 8);
    memcpy(&keyX[8], &rom[OFFSET_GAME_CODE], 4);
    keyX[12] = rom[OFFSET_GAME_CODE + 3];
    keyX[13] = rom[OFFSET_GAME_CODE + 2];
    keyX[14] = rom[OFFSET_GAME_CODE + 1];
    keyX[15] = rom[OFFSET_GAME_CODE + 0];

    uint8_t keyY[16];
    memcpy(keyY, &rom[0x350], 16);

    uint8_t normalKey[16];
    DeriveNormalKey(keyX, keyY, normalKey);

    uint8_t keySwap[16];
    for (int i = 0; i < 16; i++)
        keySwap[i] = normalKey[15 - i];

    struct AES_ctx ctx;
    AES_init_ctx(&ctx, keySwap);

    if (mod1Encrypted)
    {
        CryptArea(&ctx, &rom[0x300], rom.data(), mod1Off, mod1Size);
    }

    if (mod2Encrypted)
    {
        CryptArea(&ctx, &rom[0x314], rom.data(), mod2Off, mod2Size);
    }

    // Write decrypted ROM back in-place (without modifying header flags or CRC)
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

bool DecryptRomBuffer(uint8_t* rom, size_t fileSize)
{
    if (!rom || fileSize < HEADER_SIZE)
        return false;

    // Check if DSi ROM (UnitCode bit 1 or 0x03)
    uint8_t unitCode = rom[OFFSET_UNIT_CODE];
    if (!(unitCode & 0x02) && unitCode != 0x03)
        return false;

    // Read modcrypt area offsets and sizes
    uint32_t mod1Off  = *(uint32_t*)&rom[OFFSET_MODCRYPT1_OFF];
    uint32_t mod1Size = *(uint32_t*)&rom[OFFSET_MODCRYPT1_SIZE];
    uint32_t mod2Off  = *(uint32_t*)&rom[OFFSET_MODCRYPT2_OFF];
    uint32_t mod2Size = *(uint32_t*)&rom[OFFSET_MODCRYPT2_SIZE];

    if ((mod1Size == 0 || mod1Size == 0xFFFFFFFF) && (mod2Size == 0 || mod2Size == 0xFFFFFFFF))
        return false;

    bool mod1Encrypted = (mod1Off > 0 && mod1Size > 0 && mod1Off + mod1Size <= (uint32_t)fileSize) &&
                         !isBufferPlaintext(&rom[mod1Off], std::min<size_t>(mod1Size, 256));

    bool mod2Encrypted = (mod2Off > 0 && mod2Size > 0 && mod2Off + mod2Size <= (uint32_t)fileSize) &&
                         !isBufferPlaintext(&rom[mod2Off], std::min<size_t>(mod2Size, 256));

    LOGI("DecryptRomBuffer: GameCode=%.4s mod1=[0x%X, 0x%X, enc=%d] mod2=[0x%X, 0x%X, enc=%d]",
         (char*)&rom[OFFSET_GAME_CODE], mod1Off, mod1Size, mod1Encrypted, mod2Off, mod2Size, mod2Encrypted);

    if (!mod1Encrypted && !mod2Encrypted)
    {
        LOGI("DecryptRomBuffer: ROM is already plaintext in memory, skipping decryption.");
        return true;
    }

    uint8_t keyX[16];
    memcpy(keyX, "Nintendo", 8);
    memcpy(&keyX[8], &rom[OFFSET_GAME_CODE], 4);
    keyX[12] = rom[OFFSET_GAME_CODE + 3];
    keyX[13] = rom[OFFSET_GAME_CODE + 2];
    keyX[14] = rom[OFFSET_GAME_CODE + 1];
    keyX[15] = rom[OFFSET_GAME_CODE + 0];

    uint8_t keyY[16];
    memcpy(keyY, &rom[0x350], 16);

    uint8_t normalKey[16];
    DeriveNormalKey(keyX, keyY, normalKey);

    uint8_t keySwap[16];
    for (int i = 0; i < 16; i++)
        keySwap[i] = normalKey[15 - i];

    struct AES_ctx ctx;
    AES_init_ctx(&ctx, keySwap);

    if (mod1Encrypted)
    {
        CryptArea(&ctx, &rom[0x300], rom, mod1Off, mod1Size);
        LOGI("DecryptRomBuffer: In-memory decrypted Area 1 (ARM9i) at 0x%X (size=0x%X)", mod1Off, mod1Size);
    }

    if (mod2Encrypted)
    {
        CryptArea(&ctx, &rom[0x314], rom, mod2Off, mod2Size);
        LOGI("DecryptRomBuffer: In-memory decrypted Area 2 (ARM7i) at 0x%X (size=0x%X)", mod2Off, mod2Size);
    }

    rom[OFFSET_DSI_CRYPTO_FLAGS] |= 0x03;
    uint16_t headerCrc = CalcHeaderCRC16(rom, 0x15E);
    *(uint16_t*)&rom[0x15E] = headerCrc;
    return true;
}

} // namespace RomDecryptor
} // namespace MelonDSAndroid
