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
        uint32_t titleIdLow = header.DSiTitleIDLow ? header.DSiTitleIDLow : *(const uint32_t*)&header.GameCode;
        uint32_t titleIdHigh = header.DSiTitleIDHigh ? header.DSiTitleIDHigh : melonDS::DSiWareTitleIDHigh;

        uint8_t titleId[8];
        memcpy(&titleId[0], &titleIdLow, 4);
        memcpy(&titleId[4], &titleIdHigh, 4);

        uint32_t bootType = header.IsDSiWare() ? 0x03 : 0x01;
        melonDS::Platform::Log(melonDS::Platform::LogLevel::Info,
            "DSiSupport::SetupDSiDirectBoot: Setting up Autoload for Cart GameCode=%.4s TitleIdLow=0x%08X TitleIdHigh=0x%08X bootType=0x%02X (IsDSiWare=%d)\n",
            header.GameCode, titleIdLow, titleIdHigh, bootType, header.IsDSiWare() ? 1 : 0);
        setupAutoLoadRaw(dsi, titleId, bootType);
    }
}

void MelonDSAndroid::DSiSupport::SetupDSiWareDirectBoot(melonDS::DSi* dsi, uint32_t titleIdLow, uint32_t titleIdHigh)
{
    uint8_t titleId[8];
    memcpy(&titleId[0], &titleIdLow, 4);
    memcpy(&titleId[4], &titleIdHigh, 4);

    // BootType 0x03 = DSiWare Title (0x01 = Cartridge, 0x02 = System Landing)
    setupAutoLoadRaw(dsi, titleId, 0x03);
}
