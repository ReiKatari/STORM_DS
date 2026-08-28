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
        memcpy(&titleId[0], header.GameCode, 4);
        uint32_t titleIdHigh = header.DSiTitleIDHigh ? header.DSiTitleIDHigh : melonDS::DSiWareTitleIDHigh;
        titleId[4] = (uint8_t)(titleIdHigh & 0xFF);
        titleId[5] = (uint8_t)((titleIdHigh >> 8) & 0xFF);
        titleId[6] = (uint8_t)((titleIdHigh >> 16) & 0xFF);
        titleId[7] = (uint8_t)((titleIdHigh >> 24) & 0xFF);

        uint32_t bootType = 0x01;
        melonDS::Platform::Log(melonDS::Platform::LogLevel::Info,
            "DSiSupport::SetupDSiDirectBoot: Setting up Autoload for Cart GameCode=%.4s (%02X %02X %02X %02X %02X %02X %02X %02X) bootType=0x%02X (IsDSiWare=%d)\n",
            header.GameCode,
            titleId[0], titleId[1], titleId[2], titleId[3], titleId[4], titleId[5], titleId[6], titleId[7],
            bootType, header.IsDSiWare() ? 1 : 0);
        setupAutoLoadRaw(dsi, titleId, bootType);
    }
}

void MelonDSAndroid::DSiSupport::SetupDSiWareDirectBoot(melonDS::DSi* dsi, uint32_t titleIdLow, uint32_t titleIdHigh)
{
    uint8_t titleId[8];
    titleId[0] = (uint8_t)((titleIdLow >> 24) & 0xFF);
    titleId[1] = (uint8_t)((titleIdLow >> 16) & 0xFF);
    titleId[2] = (uint8_t)((titleIdLow >> 8) & 0xFF);
    titleId[3] = (uint8_t)(titleIdLow & 0xFF);

    titleId[4] = (uint8_t)(titleIdHigh & 0xFF);
    titleId[5] = (uint8_t)((titleIdHigh >> 8) & 0xFF);
    titleId[6] = (uint8_t)((titleIdHigh >> 16) & 0xFF);
    titleId[7] = (uint8_t)((titleIdHigh >> 24) & 0xFF);

    melonDS::Platform::Log(melonDS::Platform::LogLevel::Info,
        "DSiSupport::SetupDSiWareDirectBoot: Setting up Autoload for TitleID Low=0x%08X High=0x%08X (Bytes: %02X %02X %02X %02X %02X %02X %02X %02X)\n",
        titleIdLow, titleIdHigh,
        titleId[0], titleId[1], titleId[2], titleId[3], titleId[4], titleId[5], titleId[6], titleId[7]);

    setupAutoLoadRaw(dsi, titleId, 0x03);
}

