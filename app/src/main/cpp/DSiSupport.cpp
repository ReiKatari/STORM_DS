#include "DSiSupport.h"

// Implementation adapted from https://github.com/JesseTG/melonds-ds/blob/main/src/libretro/console/dsi.cpp

constexpr size_t DSI_AUTOLOAD_OFFSET = 0x300;
// unknown bit, seems to be required to boot into games (errors otherwise?)
constexpr uint32_t UNKNOWN_BOOT_BIT = (1 << 4);

static void setupAutoLoad(melonDS::DSi* dsi, uint32_t titleIdLow, uint32_t titleIdHigh)
{
    auto* bptwl = dsi->I2C.GetBPTWL();

    bptwl->SetBootFlag(true);

    MelonDSAndroid::DSiSupport::DSiAutoLoad autoLoad {};
    memcpy(autoLoad.ID, "TLNC", sizeof(autoLoad.ID));
    autoLoad.Unknown1 = 0x01;
    autoLoad.Length = 0x18;
    memcpy(autoLoad.NewTitleID, &titleIdLow, sizeof(titleIdLow));
    memcpy(autoLoad.NewTitleID + sizeof(titleIdLow), &titleIdHigh, sizeof(titleIdHigh));

    autoLoad.Flags |= (0x03 << 1) | 0x01 | UNKNOWN_BOOT_BIT;
    autoLoad.CRC16 = melonDS::CRC16((uint8_t*) &autoLoad.PrevTitleID, autoLoad.Length, 0xFFFF);
    memcpy(&dsi->MainRAM[DSI_AUTOLOAD_OFFSET], &autoLoad, sizeof(autoLoad));
}

void MelonDSAndroid::DSiSupport::SetupDSiDirectBoot(melonDS::DSi* dsi)
{
    auto cart = dsi->GetNDSCart();
    auto header = cart->GetHeader();
    setupAutoLoad(dsi, header.DSiTitleIDLow, header.DSiTitleIDHigh);
}
