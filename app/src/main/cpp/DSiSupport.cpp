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
}

void MelonDSAndroid::DSiSupport::SetupDSiDirectBoot(melonDS::DSi* dsi)
{
    auto cart = dsi->GetNDSCart();
    if (cart != nullptr)
    {
        auto header = cart->GetHeader();
        uint8_t titleId[8];
        memcpy(titleId, &header.DSiTitleIDLow, 4);
        memcpy(titleId + 4, &header.DSiTitleIDHigh, 4);
        setupAutoLoadRaw(dsi, titleId, 0x01);
    }
}

void MelonDSAndroid::DSiSupport::SetupDSiWareDirectBoot(melonDS::DSi* dsi, uint32_t titleIdLow, uint32_t titleIdHigh)
{
    uint8_t titleId[8];
    // Bytes 0..3: titleIdLow in little-endian (matching DSi NAND folder naming)
    titleId[0] = static_cast<uint8_t>(titleIdLow & 0xFF);
    titleId[1] = static_cast<uint8_t>((titleIdLow >> 8) & 0xFF);
    titleId[2] = static_cast<uint8_t>((titleIdLow >> 16) & 0xFF);
    titleId[3] = static_cast<uint8_t>((titleIdLow >> 24) & 0xFF);
    // Bytes 4..7: category in little-endian (0x04, 0x00, 0x03, 0x00 for DSiWare category 0x00030004)
    titleId[4] = static_cast<uint8_t>(titleIdHigh & 0xFF);
    titleId[5] = static_cast<uint8_t>((titleIdHigh >> 8) & 0xFF);
    titleId[6] = static_cast<uint8_t>((titleIdHigh >> 16) & 0xFF);
    titleId[7] = static_cast<uint8_t>((titleIdHigh >> 24) & 0xFF);

    setupAutoLoadRaw(dsi, titleId, 0x00);
}
