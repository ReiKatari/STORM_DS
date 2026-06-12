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

static LauncherMetadataResult updateWrapBin(u32 category, u32 titleId, bool add, int& usedEntriesOut)
{
    usedEntriesOut = -1;

    std::vector<u8> wrap;
    if (!nandMount->ExportFile("0:/shared2/launcher/wrap.bin", wrap))
    {
        melonDS::Platform::Log(melonDS::Platform::LogLevel::Error, "DSiWareImport: failed to read launcher wrap.bin\n");
        return LauncherMetadataResult::Failed;
    }

    if (wrap.size() < WRAP_ENTRIES_OFFSET + WRAP_ENTRIES_SIZE ||
        memcmp(wrap.data() + 0x28, "APWR", 4) != 0 ||
        readLe32(wrap.data() + 0x2C) < WRAP_ENTRIES_SIZE)
    {
        melonDS::Platform::Log(melonDS::Platform::LogLevel::Error, "DSiWareImport: invalid launcher wrap.bin size=%zu\n", wrap.size());
        return LauncherMetadataResult::Failed;
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

    if (mutation == LauncherEntryMutation::Changed)
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
        melonDS::Platform::Log(melonDS::Platform::LogLevel::Error, "DSiWareImport: failed to read launcher wrap.bin for menusave sync\n");
        return false;
    }

    if (wrap.size() < WRAP_ENTRIES_OFFSET + WRAP_ENTRIES_SIZE ||
        memcmp(wrap.data() + 0x28, "APWR", 4) != 0 ||
        readLe32(wrap.data() + 0x2C) < WRAP_ENTRIES_SIZE)
    {
        melonDS::Platform::Log(melonDS::Platform::LogLevel::Error, "DSiWareImport: invalid launcher wrap.bin while syncing menusave size=%zu\n", wrap.size());
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

    memcpy(titleId, titleData.data() + 0x230, sizeof(titleId));

    if (titleId[1] != DSI_NAND_FILE_CATEGORY)
    {
        // Not a DSiWare title
        melonDS::Platform::Log(melonDS::Platform::LogLevel::Warn, "DSiWareImport: rejected non-DSiWare title category=%08x title=%08x\n", titleId[1], titleId[0]);
        env->ReleaseStringUTFChars(titleUri, titlePath);
        return TITLE_IMPORT_NOT_DSIWARE_TITLE;
    }

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
            melonDS::Platform::LogLevel::Error,
            "DSiWareImport: TMD/title mismatch selected=%08x/%08x tmd=%08x/%08x\n",
            titleId[1],
            titleId[0],
            tmdCategory,
            tmdTitle
        );
        env->ReleaseStringUTFChars(titleUri, titlePath);
        env->ReleaseByteArrayElements(tmdMetadata, tmdBytes, JNI_ABORT);
        return TITLE_IMPORT_INSATLL_FAILED;
    }
    if (tmdContentSize != titleData.size())
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Error,
            "DSiWareImport: TMD content size mismatch selected=%08x/%08x tmdBytes=%llu appBytes=%zu\n",
            titleId[1],
            titleId[0],
            static_cast<unsigned long long>(tmdContentSize),
            titleData.size()
        );
        env->ReleaseStringUTFChars(titleUri, titlePath);
        env->ReleaseByteArrayElements(tmdMetadata, tmdBytes, JNI_ABORT);
        return TITLE_IMPORT_INSATLL_FAILED;
    }

    melonDS::NDSHeader header {};
    memcpy(&header, titleData.data(), sizeof(header));
    if (!hasDsiWareUserStorageForTitle(nandMount, header, titleData.size(), titleId[1], titleId[0]))
    {
        env->ReleaseStringUTFChars(titleUri, titlePath);
        env->ReleaseByteArrayElements(tmdMetadata, tmdBytes, JNI_ABORT);
        return TITLE_IMPORT_DSI_MEMORY_FULL;
    }

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
    if (nand)
    {
        nandMount->DeleteTitle(DSI_NAND_FILE_CATEGORY, (u32) titleId);
        updateDsiLauncherMetadata(DSI_NAND_FILE_CATEGORY, (u32) titleId, false);
        syncInstalledDsiWareLauncherMetadata((u32) titleId);
    }
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

    size_t pos = englishTitle.find("\n");
    std::string title = englishTitle.substr(0, pos);
    std::string producer = englishTitle.substr(pos + 1);

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
