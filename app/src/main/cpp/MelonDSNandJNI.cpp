#include <jni.h>
#include <string>
#include <locale>
#include <codecvt>
#include <vector>
#include <set>
#include <algorithm>
#include <cstring>
#include "DSi_NAND.h"
#include "ROMManager.h"
#include "Platform.h"
#include "MelonDSAndroidConfiguration.h"
#include "MelonDS.h"
#include "RomIconBuilder.h"
#include "UriFileHandler.h"
#include "sha1/sha1.hpp"

#define NAND_INIT_OK 0
#define NAND_INIT_ERROR_ALREADY_OPEN 1
#define NAND_INIT_ERROR_BIOS7_NOT_FOUND 2
#define NAND_INIT_ERROR_NAND_FAILED 3

#define TITLE_IMPORT_OK 0
#define TITLE_IMPORT_NAND_NOT_OPEN 1
#define TITLE_IMPORT_ERROR_OPENING_FILE 2
#define TITLE_IMPORT_NOT_DSIWARE_TITLE 3
#define TITLE_IMPORT_TITLE_ALREADY_IMPORTED 4
#define TITLE_IMPORT_INSATLL_FAILED 5
#define TITLE_IMPORT_LAUNCHER_FULL 6
#define TITLE_IMPORT_DSI_MEMORY_FULL 7

const u32 DSI_NAND_FILE_CATEGORY = 0x00030004;
const u64 DSI_USER_STORAGE_BLOCK_SIZE = 128ULL * 1024ULL;
const u64 DSI_USER_STORAGE_BLOCK_COUNT = 1024ULL;
const u64 DSI_USER_STORAGE_BYTES = DSI_USER_STORAGE_BLOCK_SIZE * DSI_USER_STORAGE_BLOCK_COUNT;
const u64 DSI_IMPORT_STORAGE_MARGIN_BYTES = 1024ULL * 1024ULL;

std::unique_ptr<melonDS::DSi_NAND::NANDImage> nand;
melonDS::DSi_NAND::NANDMount* nandMount;

jobject getTitleData(JNIEnv* env, u32 category, u32 titleId);
u64 getTmdContentSize(const melonDS::DSi_TMD::TitleMetadata& titleMetadata);

static u64 roundUpToBlock(u64 value, u32 blockSize)
{
    if (blockSize == 0 || value == 0)
        return value;

    const u64 block = static_cast<u64>(blockSize);
    return ((value + block - 1) / block) * block;
}

static u64 estimateImportedTitleDirectoryBytes(const melonDS::NDSHeader& header, size_t appSize, u32 blockSize)
{
    u64 size = 0;
    size += roundUpToBlock(static_cast<u64>(appSize), blockSize);
    size += roundUpToBlock(static_cast<u64>(sizeof(melonDS::DSi_TMD::TitleMetadata)), blockSize);
    size += roundUpToBlock(static_cast<u64>(header.DSiPublicSavSize), blockSize);
    size += roundUpToBlock(static_cast<u64>(header.DSiPrivateSavSize), blockSize);
    if (header.AppFlags & 0x04)
        size += roundUpToBlock(0x4000, blockSize);
    return size;
}

static bool hasDsiWareUserStorageForTitle(
    melonDS::DSi_NAND::NANDMount* mount,
    const melonDS::NDSHeader& header,
    size_t appSize,
    u32 category,
    u32 titleId
)
{
    u32 clusterSize = mount->GetClusterSizeBytes();
    if (clusterSize == 0)
        clusterSize = 0x4000;

    const u64 currentBytes = mount->GetDirectorySizeOnDisk("0:/title/00030004", clusterSize);
    const u64 installBytes = estimateImportedTitleDirectoryBytes(header, appSize, clusterSize);
    const u64 projectedBytes = currentBytes + installBytes;
    const u64 importLimitBytes = DSI_USER_STORAGE_BYTES - DSI_IMPORT_STORAGE_MARGIN_BYTES;
    const bool allowed = projectedBytes <= importLimitBytes;

    melonDS::Platform::Log(
        allowed ? melonDS::Platform::LogLevel::Info : melonDS::Platform::LogLevel::Warn,
        "DSiWareImport: DSi storage category=%08x title=%08x current=%llu install=%llu projected=%llu limit=%llu cluster=%u currentBlocks=%llu projectedBlocks=%llu allowed=%d\n",
        category,
        titleId,
        static_cast<unsigned long long>(currentBytes),
        static_cast<unsigned long long>(installBytes),
        static_cast<unsigned long long>(projectedBytes),
        static_cast<unsigned long long>(importLimitBytes),
        clusterSize,
        static_cast<unsigned long long>((currentBytes + DSI_USER_STORAGE_BLOCK_SIZE - 1) / DSI_USER_STORAGE_BLOCK_SIZE),
        static_cast<unsigned long long>((projectedBytes + DSI_USER_STORAGE_BLOCK_SIZE - 1) / DSI_USER_STORAGE_BLOCK_SIZE),
        allowed ? 1 : 0
    );

    return allowed;
}

static u32 readLe32(const u8* data)
{
    return static_cast<u32>(data[0]) |
        (static_cast<u32>(data[1]) << 8) |
        (static_cast<u32>(data[2]) << 16) |
        (static_cast<u32>(data[3]) << 24);
}

static void writeLe32(u8* data, u32 value)
{
    data[0] = value & 0xFF;
    data[1] = (value >> 8) & 0xFF;
    data[2] = (value >> 16) & 0xFF;
    data[3] = (value >> 24) & 0xFF;
}

const size_t DSI_TITLE_ID_SIZE = 8;
const size_t DSI_LAUNCHER_SLOT_COUNT = 40;
const size_t DSI_WRAP_HEADER_SIZE = 0x40; // 64 bytes
const size_t DSI_WRAP_ENTRIES_SIZE = DSI_LAUNCHER_SLOT_COUNT * DSI_TITLE_ID_SIZE; // 320 bytes (0x140)
const size_t DSI_WRAP_TOTAL_SIZE = DSI_WRAP_HEADER_SIZE + DSI_WRAP_ENTRIES_SIZE; // 384 bytes (0x180)

static void refreshWrapHashes(std::vector<u8>& wrap)
{
    if (wrap.size() < DSI_WRAP_TOTAL_SIZE)
        wrap.resize(DSI_WRAP_TOTAL_SIZE, 0);

    SHA1_CTX sha;

    // Hash 2: SHA-1 of entries (0x40..0x17F, size 0x140 = 320 bytes) -> written to 0x14..0x27
    SHA1Init(&sha);
    SHA1Update(&sha, wrap.data() + 0x40, 0x140);
    SHA1Final(wrap.data() + 0x14, &sha);

    // Magic RWPA (0x41505752 in LE: 'R'=0x52, 'W'=0x57, 'P'=0x50, 'A'=0x41)
    wrap[0x28] = 'R';
    wrap[0x29] = 'W';
    wrap[0x2A] = 'P';
    wrap[0x2B] = 'A';

    // Size 320 (0x00000140 LE)
    wrap[0x2C] = 0x40;
    wrap[0x2D] = 0x01;
    wrap[0x2E] = 0x00;
    wrap[0x2F] = 0x00;

    // Hash 1: SHA-1 of header (0x14..0x3F, size 0x2C = 44 bytes) -> written to 0x00..0x13
    SHA1Init(&sha);
    SHA1Update(&sha, wrap.data() + 0x14, 0x2C);
    SHA1Final(wrap.data(), &sha);
}

static void updateWrapAndTwlCfg(u32 category, u32 titleId, bool add)
{
    if (!nand || !nandMount)
        return;

    const char* wrapPath = "0:/shared2/launcher/wrap.bin";
    std::vector<u8> wrap(DSI_WRAP_TOTAL_SIZE, 0);

    FF_FIL file;
    if (f_open(&file, wrapPath, FA_READ) == FR_OK)
    {
        u32 bytesRead = 0;
        f_read(&file, wrap.data(), DSI_WRAP_TOTAL_SIZE, &bytesRead);
        f_close(&file);
    }

    if (wrap.size() < DSI_WRAP_TOTAL_SIZE)
        wrap.resize(DSI_WRAP_TOTAL_SIZE, 0);

    bool modified = false;
    int existingSlot = -1;
    int firstEmptySlot = -1;

    for (size_t slot = 0; slot < DSI_LAUNCHER_SLOT_COUNT; slot++)
    {
        u8* entry = wrap.data() + 0x40 + slot * DSI_TITLE_ID_SIZE;
        u32 eTitle = (static_cast<u32>(entry[0]) << 24) |
                     (static_cast<u32>(entry[1]) << 16) |
                     (static_cast<u32>(entry[2]) << 8)  |
                     static_cast<u32>(entry[3]);
        u32 eCat   = (static_cast<u32>(entry[4]) << 24) |
                     (static_cast<u32>(entry[5]) << 16) |
                     (static_cast<u32>(entry[6]) << 8)  |
                     static_cast<u32>(entry[7]);

        if (eTitle == titleId && eCat == category)
        {
            existingSlot = static_cast<int>(slot);
            break;
        }
        if (firstEmptySlot == -1 && eTitle == 0 && eCat == 0)
        {
            firstEmptySlot = static_cast<int>(slot);
        }
    }

    if (add)
    {
        int targetSlot = (existingSlot != -1) ? existingSlot : firstEmptySlot;
        if (targetSlot != -1)
        {
            u8* entry = wrap.data() + 0x40 + targetSlot * DSI_TITLE_ID_SIZE;
            entry[0] = static_cast<u8>((titleId >> 24) & 0xFF);
            entry[1] = static_cast<u8>((titleId >> 16) & 0xFF);
            entry[2] = static_cast<u8>((titleId >> 8) & 0xFF);
            entry[3] = static_cast<u8>(titleId & 0xFF);
            entry[4] = static_cast<u8>((category >> 24) & 0xFF);
            entry[5] = static_cast<u8>((category >> 16) & 0xFF);
            entry[6] = static_cast<u8>((category >> 8) & 0xFF);
            entry[7] = static_cast<u8>(category & 0xFF);
            // Mark unwrapped bit
            wrap[0x30 + (targetSlot / 8)] |= (1 << (targetSlot % 8));
            modified = true;
        }
    }
    else
    {
        if (existingSlot != -1)
        {
            u8* entry = wrap.data() + 0x40 + existingSlot * DSI_TITLE_ID_SIZE;
            memset(entry, 0, DSI_TITLE_ID_SIZE);
            // Clear unwrapped bit
            wrap[0x30 + (existingSlot / 8)] &= ~(1 << (existingSlot % 8));
            modified = true;
        }
    }

    if (modified)
    {
        refreshWrapHashes(wrap);

        f_mkdir("0:/shared2");
        f_mkdir("0:/shared2/launcher");

        if (f_open(&file, wrapPath, FA_CREATE_ALWAYS | FA_WRITE) == FR_OK)
        {
            u32 bytesWritten = 0;
            f_write(&file, wrap.data(), wrap.size(), &bytesWritten);
            f_close(&file);
        }

        // Count used slots
        u8 usedCount = 0;
        for (size_t slot = 0; slot < DSI_LAUNCHER_SLOT_COUNT; slot++)
        {
            u8* entry = wrap.data() + 0x40 + slot * DSI_TITLE_ID_SIZE;
            if (readLe32(entry) != 0 || readLe32(entry + 4) != 0)
                usedCount++;
        }

        melonDS::DSi_NAND::DSiFirmwareSystemSettings settings {};
        if (nandMount->ReadUserData(settings))
        {
            u8 clampedUsed = std::min<u8>(usedCount, 39);
            settings.SystemMenuUsedTitleSlots = clampedUsed;
            settings.SystemMenuFreeTitleSlots = (clampedUsed >= 39) ? 0 : static_cast<u8>(39 - clampedUsed);
            settings.UpdateHash();
            nandMount->ApplyUserData(settings);
        }
    }
}

static void sanitizeLauncherWrapBin()
{
    if (!nand || !nandMount)
        return;

    const char* wrapPath = "0:/shared2/launcher/wrap.bin";
    std::vector<u8> wrap(DSI_WRAP_TOTAL_SIZE, 0);

    FF_FIL file;
    if (f_open(&file, wrapPath, FA_READ) != FR_OK)
        return;

    u32 bytesRead = 0;
    f_read(&file, wrap.data(), DSI_WRAP_TOTAL_SIZE, &bytesRead);
    f_close(&file);

    if (wrap.size() < DSI_WRAP_TOTAL_SIZE)
        return;

    // 1. Query all physically installed titles from NAND
    std::vector<u32> installedTitles;
    nandMount->ListTitles(DSI_NAND_FILE_CATEGORY, installedTitles);
    std::set<u32> installedSet(installedTitles.begin(), installedTitles.end());
    std::set<u32> titlesInWrap;

    bool modified = false;

    // 2. Reconcile existing slots in wrap.bin
    for (size_t slot = 0; slot < DSI_LAUNCHER_SLOT_COUNT; slot++)
    {
        u8* entry = wrap.data() + 0x40 + slot * DSI_TITLE_ID_SIZE;
        u32 eTitle = (static_cast<u32>(entry[0]) << 24) |
                     (static_cast<u32>(entry[1]) << 16) |
                     (static_cast<u32>(entry[2]) << 8)  |
                     static_cast<u32>(entry[3]);
        u32 eCat   = (static_cast<u32>(entry[4]) << 24) |
                     (static_cast<u32>(entry[5]) << 16) |
                     (static_cast<u32>(entry[6]) << 8)  |
                     static_cast<u32>(entry[7]);

        if (eCat == DSI_NAND_FILE_CATEGORY && eTitle != 0)
        {
            if (installedSet.find(eTitle) == installedSet.end())
            {
                // Title has no content in NAND (orphan or direct ROM bug). Remove from wrap.bin to prevent system error!
                memset(entry, 0, DSI_TITLE_ID_SIZE);
                wrap[0x30 + (slot / 8)] &= ~(1 << (slot % 8));
                modified = true;
            }
            else
            {
                // Valid installed title: ensure unwrapped bit is active
                wrap[0x30 + (slot / 8)] |= (1 << (slot % 8));
                titlesInWrap.insert(eTitle);
            }
        }
    }

    // 3. Restore any valid installed titles that were accidentally missing from wrap.bin
    for (u32 titleId : installedTitles)
    {
        if (titlesInWrap.find(titleId) == titlesInWrap.end())
        {
            int emptySlot = -1;
            for (size_t slot = 0; slot < DSI_LAUNCHER_SLOT_COUNT; slot++)
            {
                u8* entry = wrap.data() + 0x40 + slot * DSI_TITLE_ID_SIZE;
                if (readLe32(entry) == 0 && readLe32(entry + 4) == 0)
                {
                    emptySlot = static_cast<int>(slot);
                    break;
                }
            }

            if (emptySlot != -1)
            {
                u8* entry = wrap.data() + 0x40 + emptySlot * DSI_TITLE_ID_SIZE;
                entry[0] = static_cast<u8>((titleId >> 24) & 0xFF);
                entry[1] = static_cast<u8>((titleId >> 16) & 0xFF);
                entry[2] = static_cast<u8>((titleId >> 8) & 0xFF);
                entry[3] = static_cast<u8>(titleId & 0xFF);
                entry[4] = static_cast<u8>((DSI_NAND_FILE_CATEGORY >> 24) & 0xFF);
                entry[5] = static_cast<u8>((DSI_NAND_FILE_CATEGORY >> 16) & 0xFF);
                entry[6] = static_cast<u8>((DSI_NAND_FILE_CATEGORY >> 8) & 0xFF);
                entry[7] = static_cast<u8>(DSI_NAND_FILE_CATEGORY & 0xFF);
                wrap[0x30 + (emptySlot / 8)] |= (1 << (emptySlot % 8));
                titlesInWrap.insert(titleId);
                modified = true;
            }
        }
    }

    if (modified)
    {
        refreshWrapHashes(wrap);

        if (f_open(&file, wrapPath, FA_CREATE_ALWAYS | FA_WRITE) == FR_OK)
        {
            u32 bytesWritten = 0;
            f_write(&file, wrap.data(), wrap.size(), &bytesWritten);
            f_close(&file);
            melonDS::Platform::Log(melonDS::Platform::LogLevel::Info, "DSiWare: synchronized wrap.bin (%zu installed titles)\n", titlesInWrap.size());
        }

        u8 usedCount = 0;
        for (size_t slot = 0; slot < DSI_LAUNCHER_SLOT_COUNT; slot++)
        {
            u8* entry = wrap.data() + 0x40 + slot * DSI_TITLE_ID_SIZE;
            if (readLe32(entry) != 0 || readLe32(entry + 4) != 0)
                usedCount++;
        }

        melonDS::DSi_NAND::DSiFirmwareSystemSettings settings {};
        if (nandMount->ReadUserData(settings))
        {
            u8 clampedUsed = std::min<u8>(usedCount, 39);
            settings.SystemMenuUsedTitleSlots = clampedUsed;
            settings.SystemMenuFreeTitleSlots = (clampedUsed >= 39) ? 0 : static_cast<u8>(39 - clampedUsed);
            settings.UpdateHash();
            nandMount->ApplyUserData(settings);
        }
    }
}

extern "C"
{
JNIEXPORT jint JNICALL
Java_me_magnum_melonds_MelonDSiNand_openNand(JNIEnv* env, jobject thiz, jobject emulatorConfiguration)
{
    if (nand)
        return NAND_INIT_ERROR_ALREADY_OPEN;

    MelonDSAndroid::EmulatorConfiguration configuration = MelonDSAndroidConfiguration::buildEmulatorConfiguration(env, emulatorConfiguration);
    MelonDSAndroid::setConfiguration(std::move(configuration));

    auto bios7file = Platform::OpenFile(configuration.dsiBios7Path, melonDS::Platform::FileMode::Read);
    if (!bios7file)
        return NAND_INIT_ERROR_BIOS7_NOT_FOUND;

    u8 esKey[16];
    Platform::FileSeek(bios7file, 0x8308, melonDS::Platform::FileSeekOrigin::Start);
    Platform::FileRead(esKey, 16, 1, bios7file);
    Platform::CloseFile(bios7file);

    auto nandfile = Platform::OpenFile(configuration.dsiNandPath, melonDS::Platform::FileMode::ReadWriteExisting);
    if (!nandfile)
        return NAND_INIT_ERROR_NAND_FAILED;

    nand = std::make_unique<melonDS::DSi_NAND::NANDImage>(nandfile, esKey);
    if (!*nand)
    {
        nand = nullptr;
        return NAND_INIT_ERROR_NAND_FAILED;
    }

    nandMount = new melonDS::DSi_NAND::NANDMount(*nand);
    if (nandMount)
    {
        sanitizeLauncherWrapBin();
    }

    return NAND_INIT_OK;
}

JNIEXPORT jobject JNICALL
Java_me_magnum_melonds_MelonDSiNand_listTitles(JNIEnv* env, jobject thiz)
{
    const u32 category = DSI_NAND_FILE_CATEGORY;
    std::vector<u32> titleList;
    nandMount->ListTitles(category, titleList);

    jclass listClass = env->FindClass("java/util/ArrayList");
    jmethodID listConstructor = env->GetMethodID(listClass, "<init>", "()V");
    jmethodID listAddMethod = env->GetMethodID(listClass, "add", "(ILjava/lang/Object;)V");
    jobject jniTitleList = env->NewObject(listClass, listConstructor);

    int index = 0;
    for (std::vector<u32>::iterator it = titleList.begin(); it != titleList.end(); it++)
    {
        u32 titleId = *it;
        jobject titleData = getTitleData(env, category, titleId);
        env->CallVoidMethod(jniTitleList, listAddMethod, index++, titleData);
    }

    return jniTitleList;
}

JNIEXPORT jint JNICALL
Java_me_magnum_melonds_MelonDSiNand_importTitle(JNIEnv* env, jobject thiz, jstring titleUri, jbyteArray tmdMetadata)
{
    if (!nand)
        return TITLE_IMPORT_NAND_NOT_OPEN;

    u32 titleId[2];

    const char* titlePath = env->GetStringUTFChars(titleUri, NULL);

    auto titleFile = Platform::OpenFile(titlePath, melonDS::Platform::FileMode::Read);
    if (!titleFile)
    {
        melonDS::Platform::Log(melonDS::Platform::LogLevel::Error, "DSiWareImport: failed to open selected title\n");
        env->ReleaseStringUTFChars(titleUri, titlePath);
        return TITLE_IMPORT_ERROR_OPENING_FILE;
    }

    std::vector<u8> titleData;
    u8 readBuffer[0x10000];
    while (true)
    {
        u64 read = Platform::FileRead(readBuffer, 1, sizeof(readBuffer), titleFile);
        if (read == 0)
            break;
        const size_t readCount = static_cast<size_t>(read);
        titleData.insert(titleData.end(), readBuffer, readBuffer + readCount);
    }
    Platform::CloseFile(titleFile);

    if (titleData.size() < sizeof(melonDS::NDSHeader))
    {
        melonDS::Platform::Log(melonDS::Platform::LogLevel::Error, "DSiWareImport: selected title is too small (%zu bytes)\n", titleData.size());
        env->ReleaseStringUTFChars(titleUri, titlePath);
        return TITLE_IMPORT_ERROR_OPENING_FILE;
    }

    const u8* rawGameCode = titleData.data() + 0x0C;
    titleId[0] = (static_cast<u32>(rawGameCode[0]) << 24) |
                 (static_cast<u32>(rawGameCode[1]) << 16) |
                 (static_cast<u32>(rawGameCode[2]) << 8)  |
                 static_cast<u32>(rawGameCode[3]);
    titleId[1] = DSI_NAND_FILE_CATEGORY;

    if (nandMount->TitleExists(titleId[1], titleId[0]))
    {
        // Title already exists
        melonDS::Platform::Log(melonDS::Platform::LogLevel::Warn, "DSiWareImport: title already imported category=%08x title=%08x\n", titleId[1], titleId[0]);
        env->ReleaseStringUTFChars(titleUri, titlePath);
        return TITLE_IMPORT_TITLE_ALREADY_IMPORTED;
    }

    jbyte* tmdBytes = env->GetByteArrayElements(tmdMetadata, NULL);
    auto titleMetadata = reinterpret_cast<melonDS::DSi_TMD::TitleMetadata*>(tmdBytes);

    const u32 tmdCategory = titleMetadata->GetCategory();
    const u32 tmdTitle = titleMetadata->GetID();
    const u64 tmdContentSize = getTmdContentSize(*titleMetadata);
    if (tmdCategory != titleId[1] || tmdTitle != titleId[0])
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Info,
            "DSiWareImport: syncing TMD title id to match ROM selected=%08x/%08x tmd=%08x/%08x\n",
            titleId[1],
            titleId[0],
            tmdCategory,
            tmdTitle
        );
        titleMetadata->TitleId[0] = static_cast<u8>((titleId[1] >> 24) & 0xFF);
        titleMetadata->TitleId[1] = static_cast<u8>((titleId[1] >> 16) & 0xFF);
        titleMetadata->TitleId[2] = static_cast<u8>((titleId[1] >> 8) & 0xFF);
        titleMetadata->TitleId[3] = static_cast<u8>(titleId[1] & 0xFF);
        titleMetadata->TitleId[4] = static_cast<u8>((titleId[0] >> 24) & 0xFF);
        titleMetadata->TitleId[5] = static_cast<u8>((titleId[0] >> 16) & 0xFF);
        titleMetadata->TitleId[6] = static_cast<u8>((titleId[0] >> 8) & 0xFF);
        titleMetadata->TitleId[7] = static_cast<u8>(titleId[0] & 0xFF);
    }
    if (tmdContentSize != titleData.size())
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Info,
            "DSiWareImport: syncing TMD content size to match ROM selected=%08x/%08x tmdBytes=%llu appBytes=%zu\n",
            titleId[1],
            titleId[0],
            static_cast<unsigned long long>(tmdContentSize),
            titleData.size()
        );
        u64 actualSize = static_cast<u64>(titleData.size());
        for (int i = 7; i >= 0; --i)
        {
            titleMetadata->Contents.ContentSize[i] = static_cast<u8>(actualSize & 0xFF);
            actualSize >>= 8;
        }
    }

    SHA1_CTX sha;
    SHA1Init(&sha);
    SHA1Update(&sha, titleData.data(), titleData.size());
    SHA1Final(titleMetadata->Contents.ContentSha1Hash, &sha);

    melonDS::NDSHeader header {};
    memcpy(&header, titleData.data(), sizeof(header));
    hasDsiWareUserStorageForTitle(nandMount, header, titleData.size(), titleId[1], titleId[0]);

    nandMount->DeleteTitle(titleId[1], titleId[0]);
    bool result = nandMount->ImportTitle(titleData.data(), titleData.size(), *titleMetadata, false);

    env->ReleaseStringUTFChars(titleUri, titlePath);
    env->ReleaseByteArrayElements(tmdMetadata, tmdBytes, JNI_ABORT);

    if (!result)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Error,
            "DSiWareImport: NAND import failed category=%08x title=%08x bytes=%zu\n",
            titleId[1],
            titleId[0],
            titleData.size()
        );
        nandMount->DeleteTitle(titleId[1], titleId[0]);
        updateWrapAndTwlCfg(titleId[1], titleId[0], false);
        return TITLE_IMPORT_INSATLL_FAILED;
    }

    updateWrapAndTwlCfg(titleId[1], titleId[0], true);

    melonDS::Platform::Log(melonDS::Platform::LogLevel::Info, "DSiWareImport: successfully imported title category=%08x title=%08x bytes=%zu\n", titleId[1], titleId[0], titleData.size());
    return TITLE_IMPORT_OK;
}

JNIEXPORT void JNICALL
Java_me_magnum_melonds_MelonDSiNand_deleteTitle(JNIEnv* env, jobject thiz, jint titleId)
{
    if (nand && nandMount)
    {
        nandMount->DeleteTitle(DSI_NAND_FILE_CATEGORY, (u32) titleId);
        updateWrapAndTwlCfg(DSI_NAND_FILE_CATEGORY, (u32) titleId, false);
    }
}

static void formatFatSaveBuffer(std::vector<u8>& buf, u32 size)
{
    buf.assign(size, 0);
    if (size < 0x200)
        return;

    const u16 bytesPerSector = 512;
    const u32 totalSectors = size / bytesPerSector;
    const u8 sectorsPerCluster = 1;
    const u16 reservedSectors = 1;
    const u8 numFats = 2;
    const u16 rootDirEntries = (size <= 0x20000) ? 64 : 128;
    const u16 sectorsPerFat = (size <= 0x80000) ? 1 : 2;

    // Boot Sector (Sector 0)
    buf[0x00] = 0xEB; buf[0x01] = 0x3C; buf[0x02] = 0x90;
    memcpy(&buf[0x03], "MSDOS5.0", 8);
    buf[0x0B] = static_cast<u8>(bytesPerSector & 0xFF);
    buf[0x0C] = static_cast<u8>((bytesPerSector >> 8) & 0xFF);
    buf[0x0D] = sectorsPerCluster;
    buf[0x0E] = static_cast<u8>(reservedSectors & 0xFF);
    buf[0x0F] = static_cast<u8>((reservedSectors >> 8) & 0xFF);
    buf[0x10] = numFats;
    buf[0x11] = static_cast<u8>(rootDirEntries & 0xFF);
    buf[0x12] = static_cast<u8>((rootDirEntries >> 8) & 0xFF);
    if (totalSectors < 0x10000)
    {
        buf[0x13] = static_cast<u8>(totalSectors & 0xFF);
        buf[0x14] = static_cast<u8>((totalSectors >> 8) & 0xFF);
    }
    else
    {
        buf[0x20] = static_cast<u8>(totalSectors & 0xFF);
        buf[0x21] = static_cast<u8>((totalSectors >> 8) & 0xFF);
        buf[0x22] = static_cast<u8>((totalSectors >> 16) & 0xFF);
        buf[0x23] = static_cast<u8>((totalSectors >> 24) & 0xFF);
    }
    buf[0x15] = 0xF8;
    buf[0x16] = static_cast<u8>(sectorsPerFat & 0xFF);
    buf[0x17] = static_cast<u8>((sectorsPerFat >> 8) & 0xFF);
    buf[0x18] = 0x00; buf[0x19] = 0x00;
    buf[0x1A] = 0x00; buf[0x1B] = 0x00;
    buf[0x24] = 0x80;
    buf[0x26] = 0x29;
    buf[0x27] = 0x12; buf[0x28] = 0x34; buf[0x29] = 0x56; buf[0x2A] = 0x78;
    memcpy(&buf[0x2B], "NO NAME    ", 11);
    memcpy(&buf[0x36], (size <= 0x80000) ? "FAT12   " : "FAT16   ", 8);
    buf[0x1FE] = 0x55;
    buf[0x1FF] = 0xAA;

    // FAT1
    const size_t fat1Offset = reservedSectors * bytesPerSector;
    if (fat1Offset + 3 <= size)
    {
        buf[fat1Offset + 0] = 0xF8;
        buf[fat1Offset + 1] = 0xFF;
        buf[fat1Offset + 2] = 0xFF;
        if (size > 0x80000 && fat1Offset + 4 <= size)
            buf[fat1Offset + 3] = 0xFF;
    }

    // FAT2
    const size_t fat2Offset = (reservedSectors + sectorsPerFat) * bytesPerSector;
    if (fat2Offset + 3 <= size)
    {
        buf[fat2Offset + 0] = 0xF8;
        buf[fat2Offset + 1] = 0xFF;
        buf[fat2Offset + 2] = 0xFF;
        if (size > 0x80000 && fat2Offset + 4 <= size)
            buf[fat2Offset + 3] = 0xFF;
    }
}

static bool ensureValidSaveFile(const char* path, u32 expectedSize)
{
    if (expectedSize == 0)
        return true;

    FF_FILINFO info;
    bool needsFormatting = false;
    if (f_stat(path, &info) != FR_OK || info.fsize != expectedSize)
    {
        needsFormatting = true;
    }
    else
    {
        FF_FIL file;
        if (f_open(&file, path, FA_READ) == FR_OK)
        {
            u8 bootSec[1024];
            u32 nread = 0;
            f_read(&file, bootSec, sizeof(bootSec), &nread);
            f_close(&file);
            u16 rootEntries = (u16)bootSec[0x011] | ((u16)bootSec[0x012] << 8);
            if (nread < sizeof(bootSec) ||
                bootSec[0x1FE] != 0x55 || bootSec[0x1FF] != 0xAA ||
                (bootSec[0] != 0xEB && bootSec[0] != 0xE9) ||
                bootSec[0x010] < 1 ||
                rootEntries < 16 ||
                bootSec[0x200] != 0xF8)
            {
                needsFormatting = true;
            }
        }
        else
        {
            needsFormatting = true;
        }
    }

    if (needsFormatting)
    {
        std::vector<u8> fatData;
        formatFatSaveBuffer(fatData, expectedSize);
        FF_FIL file;
        if (f_open(&file, path, FA_CREATE_ALWAYS | FA_WRITE) == FR_OK)
        {
            u32 nwrite = 0;
            f_write(&file, fatData.data(), fatData.size(), &nwrite);
            f_close(&file);
            melonDS::Platform::Log(melonDS::Platform::LogLevel::Info, "DSiWare: formatted valid FAT save for %s (size=0x%x)\n", path, expectedSize);
            return true;
        }
        return false;
    }
    return true;
}

JNIEXPORT jboolean JNICALL
Java_me_magnum_melonds_MelonDSiNand_repairTitleSaves(JNIEnv* env, jobject thiz, jint titleId)
{
    if (!nand || !nandMount)
        return false;

    u32 version = 0xFFFFFFFF;
    melonDS::NDSHeader header {};
    nandMount->GetTitleInfo(DSI_NAND_FILE_CATEGORY, (u32) titleId, version, &header, nullptr);

    char dataDir[128];
    snprintf(dataDir, sizeof(dataDir), "0:/title/%08x/%08x/data", DSI_NAND_FILE_CATEGORY, (u32) titleId);
    f_mkdir(dataDir);

    if (version == 0xFFFFFFFF)
    {
        // Direct ROM launched from storage: preserve existing public.sav size if valid, fallback to 64KB only if absent
        char pubSavPath[128];
        snprintf(pubSavPath, sizeof(pubSavPath), "0:/title/%08x/%08x/data/public.sav", DSI_NAND_FILE_CATEGORY, (u32) titleId);
        FF_FILINFO pinfo;
        if (f_stat(pubSavPath, &pinfo) == FR_OK && pinfo.fsize > 0)
        {
            return ensureValidSaveFile(pubSavPath, (u32) pinfo.fsize);
        }
        return ensureValidSaveFile(pubSavPath, 0x10000);
    }

    if (header.DSiPublicSavSize > 0)
    {
        char pubSavPath[128];
        snprintf(pubSavPath, sizeof(pubSavPath), "0:/title/%08x/%08x/data/public.sav", DSI_NAND_FILE_CATEGORY, (u32) titleId);
        ensureValidSaveFile(pubSavPath, header.DSiPublicSavSize);
    }

    if (header.DSiPrivateSavSize > 0)
    {
        char privSavPath[128];
        snprintf(privSavPath, sizeof(privSavPath), "0:/title/%08x/%08x/data/private.sav", DSI_NAND_FILE_CATEGORY, (u32) titleId);
        ensureValidSaveFile(privSavPath, header.DSiPrivateSavSize);
    }

    if (header.AppFlags & 0x04)
    {
        char bannerSavPath[128];
        snprintf(bannerSavPath, sizeof(bannerSavPath), "0:/title/%08x/%08x/data/banner.sav", DSI_NAND_FILE_CATEGORY, (u32) titleId);
        FF_FILINFO binfo;
        if (f_stat(bannerSavPath, &binfo) != FR_OK || binfo.fsize != 0x4000)
        {
            FF_FIL file;
            if (f_open(&file, bannerSavPath, FA_CREATE_ALWAYS | FA_WRITE) == FR_OK)
            {
                u8 bannersav[0x4000];
                memset(bannersav, 0, sizeof(bannersav));
                u32 nwrite;
                f_write(&file, bannersav, sizeof(bannersav), &nwrite);
                f_close(&file);
            }
        }
    }

    melonDS::Platform::Log(melonDS::Platform::LogLevel::Info, "DSiWare: successfully repaired saves for title=%08x pubSavSize=%x privSavSize=%x\n", (u32) titleId, header.DSiPublicSavSize, header.DSiPrivateSavSize);
    return true;
}

JNIEXPORT jboolean JNICALL
Java_me_magnum_melonds_MelonDSiNand_ensureTitleSaveStructure(JNIEnv* env, jobject thiz, jint titleId, jbyteArray romHeaderBytes, jbyteArray tmdMetadata)
{
    if (!nand || !nandMount)
        return false;

    melonDS::NDSHeader header {};
    if (romHeaderBytes != nullptr)
    {
        jsize hLen = env->GetArrayLength(romHeaderBytes);
        jbyte* hBytes = env->GetByteArrayElements(romHeaderBytes, nullptr);
        if (hBytes != nullptr)
        {
            memcpy(&header, hBytes, std::min<size_t>((size_t)hLen, sizeof(header)));
            env->ReleaseByteArrayElements(romHeaderBytes, hBytes, JNI_ABORT);
        }
    }

    u32 idNormal = (u32)titleId;
    u32 idSwapped = ((idNormal >> 24) & 0xFF) | ((idNormal >> 8) & 0xFF00) | ((idNormal & 0xFF00) << 8) | ((idNormal & 0xFF) << 24);
    std::vector<u32> targetIds = { idNormal };
    if (idSwapped != idNormal)
        targetIds.push_back(idSwapped);

    char path[256];
    f_mkdir("0:/ticket");
    snprintf(path, sizeof(path), "0:/ticket/%08x", DSI_NAND_FILE_CATEGORY);
    f_mkdir(path);

    f_mkdir("0:/title");
    snprintf(path, sizeof(path), "0:/title/%08x", DSI_NAND_FILE_CATEGORY);
    f_mkdir(path);

    u32 pubSavSize = header.DSiPublicSavSize;
    if (pubSavSize == 0) pubSavSize = 0x10000; // 64KB minimum FAT12 public save
    u32 privSavSize = header.DSiPrivateSavSize;

    for (u32 tid : targetIds)
    {
        snprintf(path, sizeof(path), "0:/title/%08x/%08x", DSI_NAND_FILE_CATEGORY, tid);
        f_mkdir(path);
        snprintf(path, sizeof(path), "0:/title/%08x/%08x/content", DSI_NAND_FILE_CATEGORY, tid);
        f_mkdir(path);
        snprintf(path, sizeof(path), "0:/title/%08x/%08x/data", DSI_NAND_FILE_CATEGORY, tid);
        f_mkdir(path);

        // Create ticket if missing or empty
        snprintf(path, sizeof(path), "0:/ticket/%08x/%08x.tik", DSI_NAND_FILE_CATEGORY, tid);
        FF_FILINFO tikInfo;
        if (f_stat(path, &tikInfo) != FR_OK || tikInfo.fsize == 0)
        {
            u32 catNoSwap = (DSI_NAND_FILE_CATEGORY >> 24) | ((DSI_NAND_FILE_CATEGORY & 0xFF0000) >> 8) | ((DSI_NAND_FILE_CATEGORY & 0xFF00) << 8) | (DSI_NAND_FILE_CATEGORY << 24);
            u32 idNoSwap = (tid >> 24) | ((tid & 0xFF0000) >> 8) | ((tid & 0xFF00) << 8) | (tid << 24);
            nandMount->CreateTicket(path, catNoSwap, idNoSwap, header.ROMVersion);
        }

        // Create TMD if provided and missing
        if (tmdMetadata != nullptr)
        {
            snprintf(path, sizeof(path), "0:/title/%08x/%08x/content/title.tmd", DSI_NAND_FILE_CATEGORY, tid);
            FF_FILINFO tmdInfo;
            if (f_stat(path, &tmdInfo) != FR_OK || tmdInfo.fsize == 0)
            {
                jsize tmdLen = env->GetArrayLength(tmdMetadata);
                jbyte* tmdBytes = env->GetByteArrayElements(tmdMetadata, nullptr);
                if (tmdBytes != nullptr)
                {
                    FF_FIL tmdFile;
                    if (f_open(&tmdFile, path, FA_CREATE_ALWAYS | FA_WRITE) == FR_OK)
                    {
                        u32 nw = 0;
                        f_write(&tmdFile, tmdBytes, tmdLen, &nw);
                        f_close(&tmdFile);
                    }
                    env->ReleaseByteArrayElements(tmdMetadata, tmdBytes, JNI_ABORT);
                }
            }
        }

        if (pubSavSize > 0)
        {
            snprintf(path, sizeof(path), "0:/title/%08x/%08x/data/public.sav", DSI_NAND_FILE_CATEGORY, tid);
            ensureValidSaveFile(path, pubSavSize);
        }

        if (privSavSize > 0)
        {
            snprintf(path, sizeof(path), "0:/title/%08x/%08x/data/private.sav", DSI_NAND_FILE_CATEGORY, tid);
            ensureValidSaveFile(path, privSavSize);
        }

        if (header.AppFlags & 0x04)
        {
            snprintf(path, sizeof(path), "0:/title/%08x/%08x/data/banner.sav", DSI_NAND_FILE_CATEGORY, tid);
            FF_FILINFO binfo;
            if (f_stat(path, &binfo) != FR_OK || binfo.fsize != 0x4000)
            {
                FF_FIL file;
                if (f_open(&file, path, FA_CREATE_ALWAYS | FA_WRITE) == FR_OK)
                {
                    u8 bannersav[0x4000];
                    memset(bannersav, 0, sizeof(bannersav));
                    u32 nwrite = 0;
                    f_write(&file, bannersav, sizeof(bannersav), &nwrite);
                    f_close(&file);
                }
            }
        }
    }

    melonDS::Platform::Log(melonDS::Platform::LogLevel::Info, "DSiWare: ensureTitleSaveStructure completed for title=%08x pubSav=%x privSav=%x\n", (u32) titleId, pubSavSize, privSavSize);
    return true;
}

JNIEXPORT jboolean JNICALL
Java_me_magnum_melonds_MelonDSiNand_ensureSystemFontTable(JNIEnv* env, jobject thiz, jbyteArray fontData)
{
    if (!nand || !nandMount || fontData == nullptr)
        return false;

    FF_FILINFO fontInfo;
    if (f_stat("0:/sys/TWLFontTable.dat", &fontInfo) == FR_OK && fontInfo.fsize >= 100000)
    {
        return true; // Already valid
    }

    f_mkdir("0:/sys");
    jsize fLen = env->GetArrayLength(fontData);
    jbyte* fBytes = env->GetByteArrayElements(fontData, nullptr);
    if (fBytes == nullptr)
        return false;

    FF_FIL fFile;
    bool success = false;
    if (f_open(&fFile, "0:/sys/TWLFontTable.dat", FA_CREATE_ALWAYS | FA_WRITE) == FR_OK)
    {
        u32 nw = 0;
        f_write(&fFile, fBytes, fLen, &nw);
        f_close(&fFile);
        success = (nw == (u32)fLen);
        melonDS::Platform::Log(melonDS::Platform::LogLevel::Info, "DSiWare: Wrote 0:/sys/TWLFontTable.dat (%u bytes) to NAND\n", nw);
    }
    env->ReleaseByteArrayElements(fontData, fBytes, JNI_ABORT);
    return success;
}

JNIEXPORT jboolean JNICALL
Java_me_magnum_melonds_MelonDSiNand_exportTitleExecutable(JNIEnv* env, jobject thiz, jint titleId, jstring outputPath)
{
    if (!nand || !nandMount || outputPath == nullptr)
        return false;

    const char* filePath = env->GetStringUTFChars(outputPath, nullptr);
    if (filePath == nullptr)
        return false;

    u32 version = 0xFFFFFFFF;
    melonDS::NDSHeader header {};
    nandMount->GetTitleInfo(DSI_NAND_FILE_CATEGORY, (u32) titleId, version, &header, nullptr);
    if (version == 0xFFFFFFFF)
    {
        env->ReleaseStringUTFChars(outputPath, filePath);
        return false;
    }

    char titlePath[128];
    snprintf(
        titlePath,
        sizeof(titlePath),
        "0:/title/%08x/%08x/content/%08x.app",
        DSI_NAND_FILE_CATEGORY,
        (u32) titleId,
        version
    );
    bool result = nandMount->ExportFile(titlePath, filePath);

    if (!result)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "DSiWareShortcut: failed to export executable title=%08x version=%08x\n",
            (u32) titleId,
            version
        );
    }

    env->ReleaseStringUTFChars(outputPath, filePath);
    return result;
}

JNIEXPORT jboolean JNICALL
Java_me_magnum_melonds_MelonDSiNand_importTitleExecutable(JNIEnv* env, jobject thiz, jint titleId, jstring inputPath)
{
    if (!nand || !nandMount || inputPath == nullptr)
        return false;

    const char* filePath = env->GetStringUTFChars(inputPath, nullptr);
    if (filePath == nullptr)
        return false;

    u32 version = 0xFFFFFFFF;
    melonDS::NDSHeader header {};
    nandMount->GetTitleInfo(DSI_NAND_FILE_CATEGORY, (u32) titleId, version, &header, nullptr);
    if (version == 0xFFFFFFFF)
    {
        env->ReleaseStringUTFChars(inputPath, filePath);
        return false;
    }

    char titlePath[128];
    snprintf(
        titlePath,
        sizeof(titlePath),
        "0:/title/%08x/%08x/content/%08x.app",
        DSI_NAND_FILE_CATEGORY,
        (u32) titleId,
        version
    );
    bool result = nandMount->ImportFile(titlePath, filePath);

    if (!result)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "DSiWareShortcut: failed to import executable title=%08x version=%08x\n",
            (u32) titleId,
            version
        );
    }

    env->ReleaseStringUTFChars(inputPath, filePath);
    return result;
}

JNIEXPORT jint JNICALL
Java_me_magnum_melonds_MelonDSiNand_checkTitleEncryption(JNIEnv* env, jobject thiz, jint titleId)
{
    if (!nand || !nandMount)
        return -1;

    u32 version = 0xFFFFFFFF;
    melonDS::NDSHeader header {};
    nandMount->GetTitleInfo(DSI_NAND_FILE_CATEGORY, (u32) titleId, version, &header, nullptr);
    if (version == 0xFFFFFFFF)
        return -1;

    if (!(header.UnitCode & 0x02))
        return 0; // NOT_ENCRYPTED

    if (header.DSiCryptoFlags & (1 << 1))
        return 1; // MODCRYPT_ENCRYPTED

    return 0; // NOT_ENCRYPTED
}

JNIEXPORT jboolean JNICALL
Java_me_magnum_melonds_MelonDSiNand_importTitleFile(JNIEnv* env, jobject thiz, jint titleId, jint fileType, jstring fileUri)
{
    const char* filePath = env->GetStringUTFChars(fileUri, nullptr);

    bool result = nandMount->ImportTitleData(DSI_NAND_FILE_CATEGORY, (u32) titleId, fileType, filePath);

    if (filePath != nullptr)
        env->ReleaseStringUTFChars(fileUri, filePath);

    return result;
}

JNIEXPORT jboolean JNICALL
Java_me_magnum_melonds_MelonDSiNand_exportTitleFile(JNIEnv* env, jobject thiz, jint titleId, jint fileType, jstring fileUri)
{
    const char* filePath = env->GetStringUTFChars(fileUri, nullptr);

    bool result = nandMount->ExportTitleData(DSI_NAND_FILE_CATEGORY, (u32) titleId, fileType, filePath);

    if (filePath != nullptr)
        env->ReleaseStringUTFChars(fileUri, filePath);

    return result;
}

JNIEXPORT void JNICALL
Java_me_magnum_melonds_MelonDSiNand_closeNand(JNIEnv* env, jobject thiz)
{
    if (!nand)
        return;

    delete nandMount;
    nandMount = nullptr;
    nand = nullptr;
}
}

jobject getTitleData(JNIEnv* env, u32 category, u32 titleId)
{
    u32 version;
    melonDS::NDSHeader header;
    NDSBanner banner;

    nandMount->GetTitleInfo(category, titleId, version, &header, &banner);

    u32 iconData[32 * 32];
    MelonDSAndroid::BuildRomIcon(banner.Icon, banner.Palette, iconData);
    jbyteArray iconBytes = env->NewByteArray(32 * 32 * sizeof(u32));
    jbyte* iconArrayElements = env->GetByteArrayElements(iconBytes, NULL);
    memcpy(iconArrayElements, iconData, sizeof(iconData));
    env->ReleaseByteArrayElements(iconBytes, iconArrayElements, 0);

    jclass dsiWareTitleClass = env->FindClass("me/magnum/melonds/domain/model/DSiWareTitle");
    jmethodID dsiWareTitleConstructor = env->GetMethodID(dsiWareTitleClass, "<init>", "(Ljava/lang/String;Ljava/lang/String;J[BJJI)V");

    std::wstring_convert<std::codecvt_utf8_utf16<char16_t>, char16_t> convert;
    std::string englishTitle = convert.to_bytes(banner.EnglishTitle);
    if (englishTitle.empty())
        englishTitle = convert.to_bytes(banner.JapaneseTitle);
    if (englishTitle.empty())
        englishTitle = convert.to_bytes(banner.FrenchTitle);
    if (englishTitle.empty())
        englishTitle = convert.to_bytes(banner.GermanTitle);
    if (englishTitle.empty())
        englishTitle = convert.to_bytes(banner.ItalianTitle);
    if (englishTitle.empty())
        englishTitle = convert.to_bytes(banner.SpanishTitle);

    size_t pos = englishTitle.find("\n");
    std::string title = pos != std::string::npos ? englishTitle.substr(0, pos) : englishTitle;
    std::string producer = pos != std::string::npos ? englishTitle.substr(pos + 1) : "";

    if (title.empty())
    {
        char rawTitle[13] = {0};
        memcpy(rawTitle, header.GameTitle, 12);
        title = rawTitle;
    }

    jobject titleObject = env->NewObject(
        dsiWareTitleClass,
        dsiWareTitleConstructor,
        env->NewStringUTF(title.c_str()),
        env->NewStringUTF(producer.c_str()),
        (jlong) titleId,
        iconBytes,
        (jlong) header.DSiPublicSavSize,
        (jlong) header.DSiPrivateSavSize,
        header.AppFlags
    );
    return titleObject;
}

u64 getTmdContentSize(const melonDS::DSi_TMD::TitleMetadata& titleMetadata)
{
    u64 contentSize = 0;
    for (u8 byte : titleMetadata.Contents.ContentSize)
    {
        contentSize = (contentSize << 8) | byte;
    }
    return contentSize;
}
