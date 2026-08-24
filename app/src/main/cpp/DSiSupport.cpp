#include "DSiSupport.h"
#include <cstring>

// Implementation adapted from https://github.com/JesseTG/melonds-ds/blob/main/src/libretro/console/dsi.cpp
// and GBATEK DSi Autoload on Warmboot specifications (address 0x02000300).

constexpr size_t DSI_AUTOLOAD_OFFSET = 0x300;
// unknown bit, seems to be required to boot into games (errors otherwise?)
constexpr uint32_t UNKNOWN_BOOT_BIT = (1 << 4);

static void setupAutoLoadRaw(melonDS::DSi* dsi, const uint8_t newTitleId[8], uint32_t bootType)
{
    auto* bptwl = dsi->I2C.GetBPTWL();
    bptwl->SetBootFlag(true);

    MelonDSAndroid::DSiSupport::DSiAutoLoad autoLoad {};
    memcpy(autoLoad.ID, "TLNC", sizeof(autoLoad.ID));
    autoLoad.Unknown1 = 0x01;
    autoLoad.Length = 0x18;
    memset(autoLoad.PrevTitleID, 0, sizeof(autoLoad.PrevTitleID));
    memcpy(autoLoad.NewTitleID, newTitleId, sizeof(autoLoad.NewTitleID));

    autoLoad.Flags = (bootType << 1) | 0x01 | UNKNOWN_BOOT_BIT;
    autoLoad.CRC16 = melonDS::CRC16((uint8_t*) &autoLoad.PrevTitleID, autoLoad.Length, 0xFFFF);
    memcpy(&dsi->MainRAM[DSI_AUTOLOAD_OFFSET], &autoLoad, sizeof(autoLoad));

    melonDS::Platform::Log(melonDS::Platform::LogLevel::Info,
        "DSiSupport::setupAutoLoadRaw: TLNC warmboot initialized at 0x%08X (RAM offset 0x%X) TitleID=%02X%02X%02X%02X%02X%02X%02X%02X bootType=0x%02X Flags=0x%08X CRC16=0x%04X\n",
        (uint32_t)(0x02000000 + DSI_AUTOLOAD_OFFSET), (uint32_t)DSI_AUTOLOAD_OFFSET,
        newTitleId[0], newTitleId[1], newTitleId[2], newTitleId[3],
        newTitleId[4], newTitleId[5], newTitleId[6], newTitleId[7],
        bootType, autoLoad.Flags, autoLoad.CRC16);
}

void MelonDSAndroid::DSiSupport::SetupDSiDirectBoot(melonDS::DSi* dsi)
{
    auto cart = dsi->GetNDSCart();
    if (cart != nullptr)
    {
        auto header = cart->GetHeader();
        uint8_t titleId[8];

        // Byte 0-3: 4-character Title ID Low / GameCode ('K', 'C', 'M', 'E')
        memcpy(&titleId[0], header.GameCode, 4);

        // Byte 4-7: Title ID High (0x00030004 -> 04 00 03 00 in LE)
        uint32_t titleIdHigh = header.DSiTitleIDHigh ? header.DSiTitleIDHigh : melonDS::DSiWareTitleIDHigh;
        memcpy(&titleId[4], &titleIdHigh, 4);

        // Slot-1 Cartridge titles (DS, DSi-Enhanced, and DSiWare cart ROMs) in Slot-1 -> bootType 0x01
        uint32_t bootType = 0x01;
        melonDS::Platform::Log(melonDS::Platform::LogLevel::Info,
            "DSiSupport::SetupDSiDirectBoot: Setting up Autoload for Cart GameCode=%.4s TitleIdLowBytes=%02X%02X%02X%02X TitleIdHigh=0x%08X bootType=0x%02X (IsDSiWare=%d)\n",
            header.GameCode, titleId[0], titleId[1], titleId[2], titleId[3], titleIdHigh, bootType, header.IsDSiWare() ? 1 : 0);
        setupAutoLoadRaw(dsi, titleId, bootType);
    }
}

void MelonDSAndroid::DSiSupport::SetupDSiWareDirectBoot(melonDS::DSi* dsi, uint32_t titleIdLow, uint32_t titleIdHigh)
{
    uint8_t titleId[8];
    // Convert 32-bit hex titleIdLow (e.g. 0x4B434D45) to big-endian ASCII bytes ('K', 'C', 'M', 'E')
    titleId[0] = (uint8_t)((titleIdLow >> 24) & 0xFF);
    titleId[1] = (uint8_t)((titleIdLow >> 16) & 0xFF);
    titleId[2] = (uint8_t)((titleIdLow >> 8) & 0xFF);
    titleId[3] = (uint8_t)(titleIdLow & 0xFF);

    memcpy(&titleId[4], &titleIdHigh, 4);

    setupAutoLoadRaw(dsi, titleId, 0x03);
}
