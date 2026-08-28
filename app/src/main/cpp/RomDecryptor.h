#ifndef ROM_DECRYPTOR_H
#define ROM_DECRYPTOR_H

#include <cstdint>
#include <cstddef>

namespace MelonDSAndroid {
namespace RomDecryptor {

enum class EncryptionStatus : int {
    NOT_ENCRYPTED = 0,
    MODCRYPT_ENCRYPTED = 1,
    ERROR_READING_FILE = -1,
    ERROR_NOT_DSI_ROM = -2,
    ERROR_FILE_TOO_SMALL = -3,
};

enum class DecryptResult : int {
    SUCCESS = 0,
    ALREADY_DECRYPTED = 1,
    ERROR_READING_FILE = -1,
    ERROR_WRITING_FILE = -2,
    ERROR_NOT_DSI_ROM = -3,
    ERROR_FILE_TOO_SMALL = -4,
    ERROR_MODCRYPT_AREA_OUT_OF_BOUNDS = -5,
};

// Check if a ROM file is encrypted (reads only the header)
EncryptionStatus CheckEncryption(const char* romPath);
EncryptionStatus CheckEncryptionFd(int fd);

// Decrypt a ROM file on disk in-place
// progressCallback: called with (current_bytes, total_bytes) during decryption
typedef void (*ProgressCallback)(uint32_t current, uint32_t total);
DecryptResult DecryptRomFile(const char* romPath, ProgressCallback progressCallback);
DecryptResult DecryptRomFd(int fd, ProgressCallback progressCallback);

// Decrypt a ROM buffer in-place in RAM
bool DecryptRomBuffer(uint8_t* romData, size_t romLength);

} // namespace RomDecryptor
} // namespace MelonDSAndroid

#endif // ROM_DECRYPTOR_H
