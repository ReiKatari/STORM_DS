#include <jni.h>
#include <string>
#include <locale>
#include <codecvt>
#include <vector>
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
const u32 DSI_SYSTEM_MENU_CATEGORY = 0x00030017;
const size_t DSI_LAUNCHER_SLOT_COUNT = 39;
const size_t DSI_TITLE_ID_SIZE = 8;
const size_t WRAP_ENTRIES_OFFSET = 0x40;
const size_t WRAP_ENTRIES_SIZE = DSI_LAUNCHER_SLOT_COUNT * DSI_TITLE_ID_SIZE;
const size_t MENUSAVE_ENTRIES_OFFSET = 0x10;
const size_t MENUSAVE_FILE_SIZE = 0x154;
const u32 MENUSAVE_SPECIAL_CATEGORY = 0x00000000;
const u32 MENUSAVE_SPECIAL_TITLE_ID = 0x414c5845;
const u32 MENUSAVE_REPLACED_SYSTEM_CATEGORY = 0x00030005;
const u32 MENUSAVE_REPLACED_SYSTEM_TITLE_ID = 0x484e4a45;
const u64 DSI_USER_STORAGE_BLOCK_SIZE = 128ULL * 1024ULL;
const u64 DSI_USER_STORAGE_BLOCK_COUNT = 1024ULL;
const u64 DSI_USER_STORAGE_BYTES = DSI_USER_STORAGE_BLOCK_SIZE * DSI_USER_STORAGE_BLOCK_COUNT;
const u64 DSI_IMPORT_STORAGE_MARGIN_BYTES = 1024ULL * 1024ULL;

std::unique_ptr<melonDS::DSi_NAND::NANDImage> nand;
melonDS::DSi_NAND::NANDMount* nandMount;

jobject getTitleData(JNIEnv* env, u32 category, u32 titleId)
{
    if (!nandMount)
        return nullptr;

    u32 version = 0xFFFFFFFF;
    melonDS::NDSHeader header {};
    NDSBanner banner {};

    nandMount->GetTitleInfo(category, titleId, version, &header, &banner);
    if (version == 0xFFFFFFFF)
        return nullptr;

    u32 iconData[32 * 32];
    MelonDSAndroid::BuildRomIcon(banner.Icon, banner.Palette, iconData);
    jbyteArray iconBytes = env->NewByteArray(32 * 32 * sizeof(u32));
    if (!iconBytes)
    {
        if (env->ExceptionCheck()) env->ExceptionClear();
        return nullptr;
    }
    jbyte* iconArrayElements = env->GetByteArrayElements(iconBytes, NULL);
    if (iconArrayElements)
    {
        memcpy(iconArrayElements, iconData, sizeof(iconData));
        env->ReleaseByteArrayElements(iconBytes, iconArrayElements, 0);
    }

    jclass dsiWareTitleClass = env->FindClass("me/magnum/melonds/domain/model/DSiWareTitle");
    if (!dsiWareTitleClass)
    {
        if (iconBytes) env->DeleteLocalRef(iconBytes);
        return nullptr;
    }
    jmethodID dsiWareTitleConstructor = env->GetMethodID(dsiWareTitleClass, "<init>", "(Ljava/lang/String;Ljava/lang/String;J[BJJI)V");
    if (!dsiWareTitleConstructor)
    {
        if (iconBytes) env->DeleteLocalRef(iconBytes);
        env->DeleteLocalRef(dsiWareTitleClass);
        return nullptr;
    }

    auto extractU16Title = [](const char16_t (&arr)[128]) -> std::u16string {
        size_t len = 0;
        while (len < 128 && arr[len] != u'\0')
            ++len;
        return std::u16string(arr, len);
    };

    std::u16string fullTitle = extractU16Title(banner.EnglishTitle);
    if (fullTitle.empty()) fullTitle = extractU16Title(banner.JapaneseTitle);
    if (fullTitle.empty()) fullTitle = extractU16Title(banner.FrenchTitle);
    if (fullTitle.empty()) fullTitle = extractU16Title(banner.GermanTitle);
    if (fullTitle.empty()) fullTitle = extractU16Title(banner.ItalianTitle);
    if (fullTitle.empty()) fullTitle = extractU16Title(banner.SpanishTitle);

    const size_t pos = fullTitle.find(u'\n');
    std::u16string titleU16 = pos != std::u16string::npos ? fullTitle.substr(0, pos) : fullTitle;
    std::u16string producerU16 = pos != std::u16string::npos ? fullTitle.substr(pos + 1) : std::u16string();

    if (titleU16.empty())
    {
        char rawTitle[13] = {0};
        memcpy(rawTitle, header.GameTitle, 12);
        for (int i = 0; rawTitle[i] != '\0'; ++i)
            titleU16.push_back(static_cast<char16_t>(static_cast<unsigned char>(rawTitle[i])));
    }

    static_assert(sizeof(char16_t) == sizeof(jchar), "char16_t must match jchar");
    jstring jTitle = env->NewString(reinterpret_cast<const jchar*>(titleU16.data()), static_cast<jsize>(titleU16.size()));
    jstring jProducer = env->NewString(reinterpret_cast<const jchar*>(producerU16.data()), static_cast<jsize>(producerU16.size()));

    jobject titleObject = env->NewObject(
        dsiWareTitleClass,
        dsiWareTitleConstructor,
        jTitle,
        jProducer,
        (jlong) titleId,
        iconBytes,
        (jlong) header.DSiPublicSavSize,
        (jlong) header.DSiPrivateSavSize,
        header.AppFlags
    );

    if (jTitle) env->DeleteLocalRef(jTitle);
    if (jProducer) env->DeleteLocalRef(jProducer);
    if (iconBytes) env->DeleteLocalRef(iconBytes);
    env->DeleteLocalRef(dsiWareTitleClass);
    return titleObject;
}

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

enum class LauncherMetadataResult
{
    Ok,
    Full,
    Failed,
};

enum class LauncherEntryMutation
{
    Unchanged,
    Changed,
    Full,
};

struct LauncherTitle
{
    u32 category;
    u32 titleId;

    bool operator==(const LauncherTitle& other) const
    {
        return category == other.category && titleId == other.titleId;
    }
};

static u16 readLe16(const u8* data)
{
    return static_cast<u16>(data[0]) | (static_cast<u16>(data[1]) << 8);
}

static u32 readLe32(const u8* data)
{
    return static_cast<u32>(data[0]) |
        (static_cast<u32>(data[1]) << 8) |
        (static_cast<u32>(data[2]) << 16) |
        (static_cast<u32>(data[3]) << 24);
}

static void writeLe16(u8* data, u16 value)
{
    data[0] = value & 0xFF;
    data[1] = (value >> 8) & 0xFF;
}

static void writeLe32(u8* data, u32 value)
{
    data[0] = value & 0xFF;
    data[1] = (value >> 8) & 0xFF;
    data[2] = (value >> 16) & 0xFF;
    data[3] = (value >> 24) & 0xFF;
}

static bool isEmptyLauncherEntry(const u8* entry)
{
    for (size_t i = 0; i < DSI_TITLE_ID_SIZE; i++)
    {
        if (entry[i] != 0)
            return false;
    }
    return true;
}

static bool launcherEntryMatches(const u8* entry, u32 category, u32 titleId)
{
    return readLe32(entry) == titleId && readLe32(entry + 4) == category;
}

static LauncherTitle readLauncherTitle(const u8* entry)
{
    return LauncherTitle {
        readLe32(entry + 4),
        readLe32(entry),
    };
}

static void writeLauncherTitle(u8* entry, const LauncherTitle& title)
{
    writeLe32(entry, title.titleId);
    writeLe32(entry + 4, title.category);
}

static int countLauncherEntries(const u8* entries)
{
    int count = 0;
    for (size_t slot = 0; slot < DSI_LAUNCHER_SLOT_COUNT; slot++)
    {
        if (!isEmptyLauncherEntry(entries + slot * DSI_TITLE_ID_SIZE))
            count++;
    }
    return count;
}

static std::vector<LauncherTitle> readLauncherEntries(const u8* entries)
{
    std::vector<LauncherTitle> titles;
    for (size_t slot = 0; slot < DSI_LAUNCHER_SLOT_COUNT; slot++)
    {
        const u8* entry = entries + slot * DSI_TITLE_ID_SIZE;
        if (!isEmptyLauncherEntry(entry))
            titles.push_back(readLauncherTitle(entry));
    }
    return titles;
}

static bool containsLauncherTitle(const std::vector<LauncherTitle>& titles, const LauncherTitle& title)
{
    return std::find(titles.begin(), titles.end(), title) != titles.end();
}

static void appendUniqueLauncherTitle(std::vector<LauncherTitle>& titles, const LauncherTitle& title)
{
    if (!containsLauncherTitle(titles, title))
        titles.push_back(title);
}

static void writeLauncherEntries(u8* entries, const std::vector<LauncherTitle>& titles)
{
    memset(entries, 0, DSI_LAUNCHER_SLOT_COUNT * DSI_TITLE_ID_SIZE);
    const size_t count = std::min(titles.size(), DSI_LAUNCHER_SLOT_COUNT);
    for (size_t slot = 0; slot < count; slot++)
        writeLauncherTitle(entries + slot * DSI_TITLE_ID_SIZE, titles[slot]);
}

static LauncherEntryMutation addLauncherEntry(u8* entries, u32 category, u32 titleId, int& slotOut)
{
    slotOut = -1;
    int emptySlot = -1;

    for (size_t slot = 0; slot < DSI_LAUNCHER_SLOT_COUNT; slot++)
    {
        u8* entry = entries + slot * DSI_TITLE_ID_SIZE;
        if (launcherEntryMatches(entry, category, titleId))
        {
            slotOut = static_cast<int>(slot);
            return LauncherEntryMutation::Unchanged;
        }
        if (emptySlot < 0 && isEmptyLauncherEntry(entry))
            emptySlot = static_cast<int>(slot);
    }

    if (emptySlot < 0)
        return LauncherEntryMutation::Full;

    u8* entry = entries + emptySlot * DSI_TITLE_ID_SIZE;
    writeLe32(entry, titleId);
    writeLe32(entry + 4, category);
    slotOut = emptySlot;
    return LauncherEntryMutation::Changed;
}

static LauncherEntryMutation removeLauncherEntry(u8* entries, u32 category, u32 titleId, int& slotOut)
{
    bool changed = false;
    slotOut = -1;

    for (size_t slot = 0; slot < DSI_LAUNCHER_SLOT_COUNT; slot++)
    {
        u8* entry = entries + slot * DSI_TITLE_ID_SIZE;
        if (!launcherEntryMatches(entry, category, titleId))
            continue;

        if (slotOut < 0)
            slotOut = static_cast<int>(slot);

        for (size_t next = slot; next + 1 < DSI_LAUNCHER_SLOT_COUNT; next++)
        {
            memcpy(entries + next * DSI_TITLE_ID_SIZE, entries + (next + 1) * DSI_TITLE_ID_SIZE, DSI_TITLE_ID_SIZE);
        }
        memset(entries + (DSI_LAUNCHER_SLOT_COUNT - 1) * DSI_TITLE_ID_SIZE, 0, DSI_TITLE_ID_SIZE);
        changed = true;
        slot--;
    }

    return changed ? LauncherEntryMutation::Changed : LauncherEntryMutation::Unchanged;
}

static LauncherEntryMutation normalizeMenusaveSpecialEntry(u8* entries, int& slotOut)
{
    slotOut = -1;

    for (size_t slot = 0; slot < DSI_LAUNCHER_SLOT_COUNT; slot++)
    {
        u8* entry = entries + slot * DSI_TITLE_ID_SIZE;
        if (launcherEntryMatches(entry, MENUSAVE_SPECIAL_CATEGORY, MENUSAVE_SPECIAL_TITLE_ID))
        {
            slotOut = static_cast<int>(slot);
            return LauncherEntryMutation::Unchanged;
        }
    }

    for (size_t slot = 0; slot < DSI_LAUNCHER_SLOT_COUNT; slot++)
    {
        u8* entry = entries + slot * DSI_TITLE_ID_SIZE;
        if (!launcherEntryMatches(entry, MENUSAVE_REPLACED_SYSTEM_CATEGORY, MENUSAVE_REPLACED_SYSTEM_TITLE_ID))
            continue;

        writeLe32(entry, MENUSAVE_SPECIAL_TITLE_ID);
        writeLe32(entry + 4, MENUSAVE_SPECIAL_CATEGORY);
        slotOut = static_cast<int>(slot);
        return LauncherEntryMutation::Changed;
    }

    return addLauncherEntry(entries, MENUSAVE_SPECIAL_CATEGORY, MENUSAVE_SPECIAL_TITLE_ID, slotOut);
}

static void refreshWrapHashes(std::vector<u8>& wrap)
{
    SHA1_CTX sha;
    SHA1Init(&sha);
    SHA1Update(&sha, wrap.data() + WRAP_ENTRIES_OFFSET, WRAP_ENTRIES_SIZE);
    SHA1Final(wrap.data() + 0x14, &sha);

    SHA1Init(&sha);
    SHA1Update(&sha, wrap.data() + 0x14, 0x2C);
    SHA1Final(wrap.data(), &sha);
}

static void initializeCleanWrapBin(std::vector<u8>& wrap)
{
    wrap.assign(WRAP_ENTRIES_OFFSET + WRAP_ENTRIES_SIZE, 0);
    wrap[0x28] = 'A';
    wrap[0x29] = 'P';
    wrap[0x2A] = 'W';
    wrap[0x2B] = 'R';
    const u32 entriesSize = static_cast<u32>(WRAP_ENTRIES_SIZE);
    wrap[0x2C] = static_cast<u8>(entriesSize & 0xFF);
    wrap[0x2D] = static_cast<u8>((entriesSize >> 8) & 0xFF);
    wrap[0x2E] = static_cast<u8>((entriesSize >> 16) & 0xFF);
    wrap[0x2F] = static_cast<u8>((entriesSize >> 24) & 0xFF);
}

static bool isSupportedWrapMagic(const u8* data)
{
    return memcmp(data + 0x28, "APWR", 4) == 0 || memcmp(data + 0x28, "RWPA", 4) == 0;
}

static void normalizeWrapHeader(std::vector<u8>& wrap)
{
    if (wrap.size() < WRAP_ENTRIES_OFFSET + WRAP_ENTRIES_SIZE)
        return;

    if (memcmp(wrap.data() + 0x28, "RWPA", 4) == 0)
    {
        wrap[0x28] = 'A';
        wrap[0x29] = 'P';
        wrap[0x2A] = 'W';
        wrap[0x2B] = 'R';
    }
    if (readLe32(wrap.data() + 0x2C) < WRAP_ENTRIES_SIZE)
    {
        const u32 entriesSize = static_cast<u32>(WRAP_ENTRIES_SIZE);
        wrap[0x2C] = static_cast<u8>(entriesSize & 0xFF);
        wrap[0x2D] = static_cast<u8>((entriesSize >> 8) & 0xFF);
        wrap[0x2E] = static_cast<u8>((entriesSize >> 16) & 0xFF);
        wrap[0x2F] = static_cast<u8>((entriesSize >> 24) & 0xFF);
    }
}

static LauncherMetadataResult updateWrapBin(u32 category, u32 titleId, bool add, int& usedEntriesOut)
{
    usedEntriesOut = -1;

    std::vector<u8> wrap;
    bool createdOrRepaired = false;
    if (!nandMount->ExportFile("0:/shared2/launcher/wrap.bin", wrap))
    {
        if (!add)
        {
            usedEntriesOut = 0;
            return LauncherMetadataResult::Ok;
        }
        initializeCleanWrapBin(wrap);
        createdOrRepaired = true;
    }
    else if (wrap.size() < WRAP_ENTRIES_OFFSET + WRAP_ENTRIES_SIZE || !isSupportedWrapMagic(wrap.data()))
    {
        if (!add)
        {
            usedEntriesOut = 0;
            return LauncherMetadataResult::Ok;
        }
        initializeCleanWrapBin(wrap);
        createdOrRepaired = true;
    }
    else
    {
        if (memcmp(wrap.data() + 0x28, "RWPA", 4) == 0 || readLe32(wrap.data() + 0x2C) < WRAP_ENTRIES_SIZE)
        {
            normalizeWrapHeader(wrap);
            createdOrRepaired = true;
        }
    }

    u8* entries = wrap.data() + WRAP_ENTRIES_OFFSET;
    int before = countLauncherEntries(entries);
    int slot = -1;
    LauncherEntryMutation mutation = add ?
        addLauncherEntry(entries, category, titleId, slot) :
        removeLauncherEntry(entries, category, titleId, slot);

    if (mutation == LauncherEntryMutation::Full)
    {
        usedEntriesOut = before;
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "DSiWareImport: launcher wrap.bin full entries=%d max=%zu category=%08x title=%08x\n",
            before,
            DSI_LAUNCHER_SLOT_COUNT,
            category,
            titleId
        );
        return LauncherMetadataResult::Full;
    }

    int after = countLauncherEntries(entries);
    usedEntriesOut = after;

    if (mutation == LauncherEntryMutation::Changed || createdOrRepaired)
    {
        refreshWrapHashes(wrap);
        if (!nandMount->ImportFile("0:/shared2/launcher/wrap.bin", wrap.data(), wrap.size()))
        {
            melonDS::Platform::Log(melonDS::Platform::LogLevel::Error, "DSiWareImport: failed to write launcher wrap.bin\n");
            return LauncherMetadataResult::Failed;
        }
    }

    melonDS::Platform::Log(
        melonDS::Platform::LogLevel::Info,
        "DSiWareImport: launcher wrap action=%s category=%08x title=%08x entries=%d->%d slot=%d changed=%d\n",
        add ? "add" : "remove",
        category,
        titleId,
        before,
        after,
        slot,
        mutation == LauncherEntryMutation::Changed
    );

    return LauncherMetadataResult::Ok;
}

static bool readWrapLauncherEntries(std::vector<LauncherTitle>& entriesOut)
{
    entriesOut.clear();

    std::vector<u8> wrap;
    if (!nandMount->ExportFile("0:/shared2/launcher/wrap.bin", wrap))
    {
        melonDS::Platform::Log(melonDS::Platform::LogLevel::Warn, "DSiWareImport: wrap.bin not found while syncing menusave\n");
        return false;
    }

    if (wrap.size() < WRAP_ENTRIES_OFFSET + WRAP_ENTRIES_SIZE ||
        !isSupportedWrapMagic(wrap.data()) ||
        readLe32(wrap.data() + 0x2C) < WRAP_ENTRIES_SIZE)
    {
        melonDS::Platform::Log(melonDS::Platform::LogLevel::Warn, "DSiWareImport: non-standard launcher wrap.bin while syncing menusave size=%zu\n", wrap.size());
        return false;
    }

    entriesOut = readLauncherEntries(wrap.data() + WRAP_ENTRIES_OFFSET);
    return true;
}

static std::vector<LauncherTitle> buildMenusaveLauncherEntries(
    const std::vector<LauncherTitle>& currentEntries,
    const std::vector<LauncherTitle>& wrapEntries
)
{
    std::vector<LauncherTitle> systemEntries;
    std::vector<LauncherTitle> wrapDsiWareEntries;

    for (const LauncherTitle& title : wrapEntries)
    {
        if (title.category == DSI_NAND_FILE_CATEGORY)
            appendUniqueLauncherTitle(wrapDsiWareEntries, title);
        else
            appendUniqueLauncherTitle(systemEntries, title);
    }

    const LauncherTitle specialEntry {
        MENUSAVE_SPECIAL_CATEGORY,
        MENUSAVE_SPECIAL_TITLE_ID,
    };

    std::vector<LauncherTitle> result;
    if (systemEntries.size() >= 7)
    {
        appendUniqueLauncherTitle(result, systemEntries[0]);
        appendUniqueLauncherTitle(result, specialEntry);
        appendUniqueLauncherTitle(result, systemEntries[4]);
        appendUniqueLauncherTitle(result, systemEntries[6]);
    }
    else
    {
        if (!systemEntries.empty())
            appendUniqueLauncherTitle(result, systemEntries[0]);
        appendUniqueLauncherTitle(result, specialEntry);
    }

    std::vector<LauncherTitle> dsiWareEntries;
    for (const LauncherTitle& title : currentEntries)
    {
        if (title.category == DSI_NAND_FILE_CATEGORY && containsLauncherTitle(wrapDsiWareEntries, title))
            appendUniqueLauncherTitle(dsiWareEntries, title);
    }
    for (const LauncherTitle& title : wrapDsiWareEntries)
        appendUniqueLauncherTitle(dsiWareEntries, title);
    for (const LauncherTitle& title : dsiWareEntries)
        appendUniqueLauncherTitle(result, title);

    if (systemEntries.size() >= 7)
    {
        appendUniqueLauncherTitle(result, systemEntries[1]);
        appendUniqueLauncherTitle(result, systemEntries[2]);
        appendUniqueLauncherTitle(result, systemEntries[3]);
    }
    else
    {
        for (const LauncherTitle& title : systemEntries)
        {
            if (title.category == MENUSAVE_REPLACED_SYSTEM_CATEGORY &&
                title.titleId == MENUSAVE_REPLACED_SYSTEM_TITLE_ID)
            {
                continue;
            }
            appendUniqueLauncherTitle(result, title);
        }
    }

    return result;
}

static bool readFat12Entry(const std::vector<u8>& fat, u16 cluster, u16& nextCluster)
{
    size_t offset = cluster + (cluster / 2);
    if (offset + 1 >= fat.size())
        return false;

    u16 value = static_cast<u16>(fat[offset]) | (static_cast<u16>(fat[offset + 1]) << 8);
    if (cluster & 1)
        value >>= 4;

    nextCluster = value & 0x0FFF;
    return true;
}

static bool findMenusaveDat(
    const std::vector<u8>& privateSav,
    std::vector<size_t>& clusterOffsets,
    std::vector<u8>& menusave
)
{
    if (privateSav.size() < 0x24)
        return false;

    const u16 bytesPerSector = readLe16(privateSav.data() + 0x0B);
    const u8 sectorsPerCluster = privateSav[0x0D];
    const u16 reservedSectors = readLe16(privateSav.data() + 0x0E);
    const u8 fatCount = privateSav[0x10];
    const u16 rootEntryCount = readLe16(privateSav.data() + 0x11);
    const u16 fatSectors = readLe16(privateSav.data() + 0x16);

    if (bytesPerSector == 0 || sectorsPerCluster == 0 || fatCount == 0 || rootEntryCount == 0 || fatSectors == 0)
        return false;

    const size_t fatOffset = static_cast<size_t>(reservedSectors) * bytesPerSector;
    const size_t fatSize = static_cast<size_t>(fatSectors) * bytesPerSector;
    const size_t rootOffset = (static_cast<size_t>(reservedSectors) + static_cast<size_t>(fatCount) * fatSectors) * bytesPerSector;
    const size_t rootSize = ((static_cast<size_t>(rootEntryCount) * 32 + bytesPerSector - 1) / bytesPerSector) * bytesPerSector;
    const size_t dataOffset = rootOffset + rootSize;
    const size_t clusterSize = static_cast<size_t>(sectorsPerCluster) * bytesPerSector;

    if (fatOffset + fatSize > privateSav.size() || rootOffset + rootSize > privateSav.size() || dataOffset > privateSav.size())
        return false;

    std::vector<u8> fat(privateSav.begin() + fatOffset, privateSav.begin() + fatOffset + fatSize);

    const u8 menusaveName[11] = {'M','E','N','U','S','A','V','E','D','A','T'};
    for (size_t entryOffset = rootOffset; entryOffset + 32 <= rootOffset + rootSize; entryOffset += 32)
    {
        const u8* entry = privateSav.data() + entryOffset;
        if (entry[0] == 0x00)
            break;
        if (entry[0] == 0xE5)
            continue;
        if (memcmp(entry, menusaveName, sizeof(menusaveName)) != 0)
            continue;

        u16 cluster = readLe16(entry + 26);
        const u32 fileSize = readLe32(entry + 28);
        if (cluster < 2 || fileSize < MENUSAVE_FILE_SIZE)
            return false;

        menusave.clear();
        clusterOffsets.clear();
        while (cluster >= 2 && cluster < 0x0FF8 && menusave.size() < fileSize)
        {
            const size_t clusterOffset = dataOffset + static_cast<size_t>(cluster - 2) * clusterSize;
            if (clusterOffset + clusterSize > privateSav.size())
                return false;

            clusterOffsets.push_back(clusterOffset);
            const size_t copySize = std::min(clusterSize, static_cast<size_t>(fileSize) - menusave.size());
            menusave.insert(menusave.end(), privateSav.begin() + clusterOffset, privateSav.begin() + clusterOffset + copySize);

            u16 nextCluster = 0;
            if (!readFat12Entry(fat, cluster, nextCluster))
                return false;
            cluster = nextCluster;
        }

        return menusave.size() >= MENUSAVE_FILE_SIZE;
    }

    return false;
}

static LauncherMetadataResult updateMenusaveData(
    std::vector<u8>& privateSav,
    const std::vector<LauncherTitle>& wrapEntries,
    u32 category,
    u32 titleId,
    bool add,
    bool& foundOut,
    bool& changedOut
)
{
    foundOut = false;
    changedOut = false;

    std::vector<size_t> clusterOffsets;
    std::vector<u8> menusave;
    if (!findMenusaveDat(privateSav, clusterOffsets, menusave))
        return LauncherMetadataResult::Ok;

    foundOut = true;
    if (menusave.size() < MENUSAVE_FILE_SIZE || memcmp(menusave.data(), "TSSV", 4) != 0)
    {
        melonDS::Platform::Log(melonDS::Platform::LogLevel::Error, "DSiWareImport: invalid System Menu menusave.dat\n");
        return LauncherMetadataResult::Failed;
    }

    u8* entries = menusave.data() + MENUSAVE_ENTRIES_OFFSET;
    std::vector<LauncherTitle> currentEntries = readLauncherEntries(entries);
    std::vector<LauncherTitle> rebuiltEntries = buildMenusaveLauncherEntries(currentEntries, wrapEntries);
    int before = static_cast<int>(currentEntries.size());

    if (rebuiltEntries.size() > DSI_LAUNCHER_SLOT_COUNT)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "DSiWareImport: System Menu menusave.dat full after rebuild entries=%zu max=%zu category=%08x title=%08x\n",
            rebuiltEntries.size(),
            DSI_LAUNCHER_SLOT_COUNT,
            category,
            titleId
        );
        return LauncherMetadataResult::Full;
    }

    int slot = -1;
    for (size_t i = 0; i < rebuiltEntries.size(); i++)
    {
        if (rebuiltEntries[i].category == category && rebuiltEntries[i].titleId == titleId)
        {
            slot = static_cast<int>(i);
            break;
        }
    }

    changedOut = currentEntries != rebuiltEntries;
    int after = static_cast<int>(rebuiltEntries.size());
    if (!changedOut)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Info,
            "DSiWareImport: menusave rebuild action=%s category=%08x title=%08x entries=%d->%d slot=%d changed=0\n",
            add ? "add" : "remove",
            category,
            titleId,
            before,
            after,
            slot
        );
        return LauncherMetadataResult::Ok;
    }

    writeLauncherEntries(entries, rebuiltEntries);

    menusave[0x08] = 0;
    menusave[0x09] = 0;
    const u16 crc = melonDS::CRC16(menusave.data(), MENUSAVE_FILE_SIZE, 0x5356);
    writeLe16(menusave.data() + 0x08, crc);

    size_t menusaveOffset = 0;
    for (size_t clusterOffset : clusterOffsets)
    {
        const size_t copySize = std::min(privateSav.size() - clusterOffset, menusave.size() - menusaveOffset);
        memcpy(privateSav.data() + clusterOffset, menusave.data() + menusaveOffset, copySize);
        menusaveOffset += copySize;
        if (menusaveOffset >= menusave.size())
            break;
    }

    melonDS::Platform::Log(
        melonDS::Platform::LogLevel::Info,
        "DSiWareImport: menusave rebuild action=%s category=%08x title=%08x entries=%d->%d slot=%d changed=1 crc=%04x\n",
        add ? "add" : "remove",
        category,
        titleId,
        before,
        after,
        slot,
        crc
    );

    return LauncherMetadataResult::Ok;
}

static LauncherMetadataResult updateSystemMenuSave(
    const std::vector<LauncherTitle>& wrapEntries,
    u32 category,
    u32 titleId,
    bool add
)
{
    std::vector<u32> systemMenus;
    nandMount->ListTitles(DSI_SYSTEM_MENU_CATEGORY, systemMenus);

    for (u32 systemMenuId : systemMenus)
    {
        char path[128];
        snprintf(path, sizeof(path), "0:/title/%08x/%08x/data/private.sav", DSI_SYSTEM_MENU_CATEGORY, systemMenuId);

        std::vector<u8> privateSav;
        if (!nandMount->ExportFile(path, privateSav))
            continue;

        bool found = false;
        bool changed = false;
        LauncherMetadataResult result = updateMenusaveData(privateSav, wrapEntries, category, titleId, add, found, changed);
        if (!found)
            continue;
        if (result != LauncherMetadataResult::Ok)
            return result;

        if (changed && !nandMount->ImportFile(path, privateSav.data(), privateSav.size()))
        {
            melonDS::Platform::Log(melonDS::Platform::LogLevel::Error, "DSiWareImport: failed to write System Menu private.sav path=%s\n", path);
            return LauncherMetadataResult::Failed;
        }

        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Info,
            "DSiWareImport: System Menu private.sav updated title=%08x changed=%d path=%s\n",
            systemMenuId,
            changed,
            path
        );
        return LauncherMetadataResult::Ok;
    }

    melonDS::Platform::Log(melonDS::Platform::LogLevel::Warn, "DSiWareImport: System Menu menusave.dat not found; continuing with wrap.bin only\n");
    return LauncherMetadataResult::Ok;
}

static LauncherMetadataResult updateSystemMenuSlotCounts(int usedEntries)
{
    melonDS::DSi_NAND::DSiFirmwareSystemSettings settings {};
    if (!nandMount->ReadUserData(settings))
    {
        melonDS::Platform::Log(melonDS::Platform::LogLevel::Error, "DSiWareImport: failed to read TWLCFG slot counters\n");
        return LauncherMetadataResult::Failed;
    }

    const u8 clampedUsed = static_cast<u8>(std::min<int>(std::max<int>(usedEntries, 0), DSI_LAUNCHER_SLOT_COUNT));
    const u8 freeSlots = static_cast<u8>(DSI_LAUNCHER_SLOT_COUNT - clampedUsed);
    const u8 oldUsed = settings.SystemMenuUsedTitleSlots;
    const u8 oldFree = settings.SystemMenuFreeTitleSlots;

    settings.SystemMenuUsedTitleSlots = clampedUsed;
    settings.SystemMenuFreeTitleSlots = freeSlots;
    settings.UpdateHash();

    if (!nandMount->ApplyUserData(settings))
    {
        melonDS::Platform::Log(melonDS::Platform::LogLevel::Error, "DSiWareImport: failed to write TWLCFG slot counters\n");
        return LauncherMetadataResult::Failed;
    }

    melonDS::Platform::Log(
        melonDS::Platform::LogLevel::Info,
        "DSiWareImport: TWLCFG launcher slots used=%u->%u free=%u->%u\n",
        oldUsed,
        settings.SystemMenuUsedTitleSlots,
        oldFree,
        settings.SystemMenuFreeTitleSlots
    );

    return LauncherMetadataResult::Ok;
}

static LauncherMetadataResult updateDsiLauncherMetadata(u32 category, u32 titleId, bool add)
{
    int usedEntries = -1;
    LauncherMetadataResult result = updateWrapBin(category, titleId, add, usedEntries);
    if (result != LauncherMetadataResult::Ok)
        return result;

    std::vector<LauncherTitle> wrapEntries;
    if (!readWrapLauncherEntries(wrapEntries))
        return LauncherMetadataResult::Failed;

    result = updateSystemMenuSave(wrapEntries, category, titleId, add);
    if (result != LauncherMetadataResult::Ok)
        return result;

    if (usedEntries >= 0)
        return updateSystemMenuSlotCounts(usedEntries);

    return LauncherMetadataResult::Ok;
}

static LauncherMetadataResult syncInstalledDsiWareLauncherMetadata(u32 skipTitleId)
{
    std::vector<u32> installedTitles;
    nandMount->ListTitles(DSI_NAND_FILE_CATEGORY, installedTitles);

    int checked = 0;
    for (u32 installedTitle : installedTitles)
    {
        if (installedTitle == skipTitleId)
            continue;

        checked++;
        LauncherMetadataResult result = updateDsiLauncherMetadata(DSI_NAND_FILE_CATEGORY, installedTitle, true);
        if (result != LauncherMetadataResult::Ok)
        {
            melonDS::Platform::Log(
                melonDS::Platform::LogLevel::Warn,
                "DSiWareImport: launcher metadata sync stopped result=%d checked=%d category=%08x title=%08x\n",
                static_cast<int>(result),
                checked,
                DSI_NAND_FILE_CATEGORY,
                installedTitle
            );
            return result;
        }
    }

    melonDS::Platform::Log(
        melonDS::Platform::LogLevel::Info,
        "DSiWareImport: launcher metadata sync complete checked=%d skipped=%08x\n",
        checked,
        skipTitleId
    );

    return LauncherMetadataResult::Ok;
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
    if (!nand || !nandMount)
        return TITLE_IMPORT_NAND_NOT_OPEN;
    if (titleUri == nullptr || tmdMetadata == nullptr ||
        env->GetArrayLength(tmdMetadata) < static_cast<jsize>(sizeof(melonDS::DSi_TMD::TitleMetadata)))
        return TITLE_IMPORT_INSATLL_FAILED;

    u32 titleId[2];

    const char* titlePath = env->GetStringUTFChars(titleUri, NULL);
    if (titlePath == nullptr)
    {
        if (env->ExceptionCheck()) env->ExceptionClear();
        return TITLE_IMPORT_ERROR_OPENING_FILE;
    }

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
    if (tmdBytes == nullptr)
    {
        if (env->ExceptionCheck()) env->ExceptionClear();
        env->ReleaseStringUTFChars(titleUri, titlePath);
        return TITLE_IMPORT_INSATLL_FAILED;
    }
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
        return TITLE_IMPORT_INSATLL_FAILED;
    }

    LauncherMetadataResult launcherResult = updateDsiLauncherMetadata(titleId[1], titleId[0], true);
    if (launcherResult != LauncherMetadataResult::Ok)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Error,
            "DSiWareImport: launcher metadata update failed category=%08x title=%08x result=%d\n",
            titleId[1],
            titleId[0],
            static_cast<int>(launcherResult)
        );
        updateDsiLauncherMetadata(titleId[1], titleId[0], false);
        nandMount->DeleteTitle(titleId[1], titleId[0]);
        return launcherResult == LauncherMetadataResult::Full ? TITLE_IMPORT_LAUNCHER_FULL : TITLE_IMPORT_INSATLL_FAILED;
    }

    LauncherMetadataResult syncResult = syncInstalledDsiWareLauncherMetadata(titleId[0]);
    if (syncResult != LauncherMetadataResult::Ok)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "DSiWareImport: imported title but metadata sync for existing titles is incomplete category=%08x title=%08x result=%d\n",
            titleId[1],
            titleId[0],
            static_cast<int>(syncResult)
        );
    }

    melonDS::Platform::Log(melonDS::Platform::LogLevel::Info, "DSiWareImport: imported title category=%08x title=%08x bytes=%zu\n", titleId[1], titleId[0], titleData.size());
    return TITLE_IMPORT_OK;
}

JNIEXPORT void JNICALL
Java_me_magnum_melonds_MelonDSiNand_deleteTitle(JNIEnv* env, jobject thiz, jint titleId)
{
    if (nand && nandMount)
    {
        nandMount->DeleteTitle(DSI_NAND_FILE_CATEGORY, (u32) titleId);
        updateDsiLauncherMetadata(DSI_NAND_FILE_CATEGORY, (u32) titleId, false);
        syncInstalledDsiWareLauncherMetadata((u32) titleId);
    }
}

static void formatFatSaveBuffer(std::vector<u8>& buf, u32 size)
{
    buf.assign(size, 0);
    if (size < 0x200)
        return;

    const u16 bytesPerSector = 512;
    const u32 totalSectors = size / bytesPerSector;
    const u8 sectorsPerCluster = (totalSectors > 8192) ? 8 : (totalSectors > 1024 ? 4 : 1);
    const u16 reservedSectors = 1;
    const u8 numFats = 2;
    const u16 rootDirEntries = (size <= 0x8000) ? 16 : ((size <= 0x20000) ? 64 : 128);
    const u32 rootDirSectors = ((rootDirEntries * 32) + bytesPerSector - 1) / bytesPerSector;

    // Accurate 2-step calculation matching DSi_NAND.cpp (TWL-SDK FAT12 limit: totalClusters < 4086)
    u32 approxDataSectors = (totalSectors > (1u + rootDirSectors + 2u)) ? (totalSectors - 1u - rootDirSectors - 2u) : 1u;
    u32 estClusters = std::max<u32>(1u, approxDataSectors / sectorsPerCluster);
    bool isFat16 = (estClusters >= 4086);
    u32 fatBytes = isFat16 ? ((estClusters + 2) * 2) : (((estClusters + 2) * 3 + 1) / 2);
    u16 sectorsPerFat = (u16)std::max<u32>(1u, (fatBytes + bytesPerSector - 1) / bytesPerSector);

    u32 totalFatSectors = 2 * sectorsPerFat;
    u32 dataSectors = (totalSectors > (1u + rootDirSectors + totalFatSectors)) ? (totalSectors - 1u - rootDirSectors - totalFatSectors) : 1u;
    u32 totalClusters = std::max<u32>(1u, dataSectors / sectorsPerCluster);
    isFat16 = (totalClusters >= 4086);
    fatBytes = isFat16 ? ((totalClusters + 2) * 2) : (((totalClusters + 2) * 3 + 1) / 2);
    sectorsPerFat = (u16)std::max<u32>(1u, (fatBytes + bytesPerSector - 1) / bytesPerSector);

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
    buf[0x18] = 32; buf[0x19] = 0x00;
    buf[0x1A] = 2; buf[0x1B] = 0x00;
    buf[0x24] = (size > 0x80000) ? 0x80 : 0x00;
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
            u16 bytesPerSec = (u16)bootSec[0x00B] | ((u16)bootSec[0x00C] << 8);
            bool rootValid = rootEntries > 0;
            if (nread < 512 ||
                bootSec[0x1FE] != 0x55 || bootSec[0x1FF] != 0xAA ||
                (bootSec[0] != 0xEB && bootSec[0] != 0xE9) ||
                bootSec[0x010] < 1 ||
                bytesPerSec != 512 ||
                !rootValid)
            {
                needsFormatting = true;
            }

            u32 totsec = expectedSize / 512;
            u8 clustersize = (totsec > 8192) ? 8 : (totsec > 1024 ? 4 : 1);
            u16 rDirEntries = (expectedSize <= 0x8000) ? 16 : ((expectedSize <= 0x20000) ? 64 : 128);
            u16 rDirSectors = ((rDirEntries * 32) + 512 - 1) / 512;
            u32 appDataSec = (totsec > (1u + rDirSectors + 2u)) ? (totsec - 1u - rDirSectors - 2u) : 1u;
            u32 calcClusters = std::max<u32>(1u, appDataSec / clustersize);
            bool targetIsFat16 = (calcClusters >= 4086);

            // If existing file is marked FAT16 but should be FAT12, check if root dir is empty
            if (!needsFormatting && !targetIsFat16 && memcmp(&bootSec[0x36], "FAT16", 5) == 0)
            {
                u16 existingSectorsPerFat = (u16)bootSec[0x016] | ((u16)bootSec[0x017] << 8);
                u32 rootDirOffset = (1 + 2 * existingSectorsPerFat) * 512;
                if (f_lseek(&file, rootDirOffset) == FR_OK)
                {
                    bool rootIsEmpty = true;
                    u8 rootSec[512];
                    for (u16 s = 0; s < rDirSectors; ++s)
                    {
                        u32 rread = 0;
                        if (f_read(&file, rootSec, sizeof(rootSec), &rread) == FR_OK && rread == sizeof(rootSec))
                        {
                            for (size_t entry = 0; entry < sizeof(rootSec); entry += 32)
                            {
                                if (rootSec[entry] != 0x00)
                                {
                                    rootIsEmpty = false;
                                    break;
                                }
                            }
                        }
                        if (!rootIsEmpty) break;
                    }
                    if (rootIsEmpty)
                    {
                        needsFormatting = true;
                    }
                }
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
        // Direct ROM launched from storage: preserve existing public.sav size if valid, fallback to header size, then 64KB only if absent
        char pubSavPath[128];
        snprintf(pubSavPath, sizeof(pubSavPath), "0:/title/%08x/%08x/data/public.sav", DSI_NAND_FILE_CATEGORY, (u32) titleId);
        u32 targetPubSav = header.DSiPublicSavSize > 0 ? header.DSiPublicSavSize : 0x10000;
        FF_FILINFO pinfo;
        if (f_stat(pubSavPath, &pinfo) == FR_OK && pinfo.fsize == targetPubSav)
        {
            return ensureValidSaveFile(pubSavPath, (u32) pinfo.fsize);
        }
        return ensureValidSaveFile(pubSavPath, targetPubSav);
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

    // NAND cleanup pass over 0:/ticket/00030004: unlink corrupt files with fsize < 0x2C4
    {
        FF_DIR tikDir;
        if (f_opendir(&tikDir, path) == FR_OK)
        {
            FF_FILINFO tikFno;
            while (f_readdir(&tikDir, &tikFno) == FR_OK && tikFno.fname[0] != 0)
            {
                if (!(tikFno.fattrib & AM_DIR) && tikFno.fsize < 0x2C4)
                {
                    char corruptTikPath[256];
                    snprintf(corruptTikPath, sizeof(corruptTikPath), "%s/%s", path, tikFno.fname);
                    f_unlink(corruptTikPath);
                    melonDS::Platform::Log(melonDS::Platform::LogLevel::Info, "DSiWare: Cleaned up 0-byte corrupt ticket %s\n", corruptTikPath);
                }
            }
            f_closedir(&tikDir);
        }
    }

    f_mkdir("0:/title");
    snprintf(path, sizeof(path), "0:/title/%08x", DSI_NAND_FILE_CATEGORY);
    f_mkdir(path);

    // NAND cleanup pass over 0:/title/00030004: unlink 00000000.app for other titles
    {
        FF_DIR titleBaseDir;
        if (f_opendir(&titleBaseDir, path) == FR_OK)
        {
            FF_FILINFO titleFno;
            while (f_readdir(&titleBaseDir, &titleFno) == FR_OK && titleFno.fname[0] != 0)
            {
                if (titleFno.fattrib & AM_DIR)
                {
                    u32 dirTid = (u32)strtoul(titleFno.fname, nullptr, 16);
                    if (dirTid != idNormal && dirTid != idSwapped)
                    {
                        char otherAppPath[256];
                        snprintf(otherAppPath, sizeof(otherAppPath), "%s/%s/content/00000000.app", path, titleFno.fname);
                        FF_FILINFO otherAppInfo;
                        if (f_stat(otherAppPath, &otherAppInfo) == FR_OK)
                        {
                            f_unlink(otherAppPath);
                            melonDS::Platform::Log(melonDS::Platform::LogLevel::Info, "DSiWare: Pruned dormant 00000000.app (%u B) from %s\n", (u32)otherAppInfo.fsize, otherAppPath);
                        }
                    }
                }
            }
            f_closedir(&titleBaseDir);
        }
    }

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
    if (!nand || !nandMount || fileUri == nullptr)
        return false;

    const char* filePath = env->GetStringUTFChars(fileUri, nullptr);
    if (filePath == nullptr)
    {
        if (env->ExceptionCheck()) env->ExceptionClear();
        return false;
    }

    bool result = nandMount->ImportTitleData(DSI_NAND_FILE_CATEGORY, (u32) titleId, fileType, filePath);
    env->ReleaseStringUTFChars(fileUri, filePath);
    return result;
}

JNIEXPORT jboolean JNICALL
Java_me_magnum_melonds_MelonDSiNand_exportTitleFile(JNIEnv* env, jobject thiz, jint titleId, jint fileType, jstring fileUri)
{
    if (!nand || !nandMount || fileUri == nullptr)
        return false;

    const char* filePath = env->GetStringUTFChars(fileUri, nullptr);
    if (filePath == nullptr)
    {
        if (env->ExceptionCheck()) env->ExceptionClear();
        return false;
    }

    bool result = nandMount->ExportTitleData(DSI_NAND_FILE_CATEGORY, (u32) titleId, fileType, filePath);
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

u64 getTmdContentSize(const melonDS::DSi_TMD::TitleMetadata& titleMetadata)
{
    u64 contentSize = 0;
    for (u8 byte : titleMetadata.Contents.ContentSize)
    {
        contentSize = (contentSize << 8) | byte;
    }
    return contentSize;
}
