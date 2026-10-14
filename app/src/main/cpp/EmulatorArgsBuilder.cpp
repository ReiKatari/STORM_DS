#include <assert.h>
#include <codecvt>
#include <optional>
#include <random>
#include <vector>
#include <string>
#include "Args.h"
#include "Configuration.h"
#include "EmulatorArgsBuilder.h"
#include "FreeBIOS.h"
#include "Platform.h"
#include "PlatformAndroid.h"
#include "SDCardArgsBuilder.h"
#include "SPU.h"
#include "net/Net_Slirp.h"

using namespace melonDS;
using namespace melonDS::Platform;

namespace MelonDSAndroid
{

bool hasConfiguredPath(const char* path) noexcept
{
    return path != nullptr && path[0] != '\0';
}

std::unique_ptr<ARM9BIOSImage> loadARM9BIOS(const EmulatorConfiguration& configuration) noexcept
{
    if (configuration.userInternalFirmwareAndBios || !hasConfiguredPath(configuration.dsBios9Path))
    {
        return std::make_unique<ARM9BIOSImage>(bios_arm9_bin);
    }

    std::string path = configuration.dsBios9Path;

    if (FileHandle* f = OpenFile(path, Read))
    {
        std::unique_ptr<ARM9BIOSImage> bios = std::make_unique<ARM9BIOSImage>();
        FileRewind(f);
        FileRead(bios->data(), bios->size(), 1, f);
        CloseFile(f);
        Log(Info, "ARM9 BIOS loaded from %s\n", path.c_str());
        return bios;
    }

    Log(Warn, "ARM9 BIOS not found, falling back to FreeBIOS\n");
    return std::make_unique<ARM9BIOSImage>(bios_arm9_bin);
}

std::unique_ptr<ARM7BIOSImage> loadARM7BIOS(const EmulatorConfiguration& configuration) noexcept
{
    if (configuration.userInternalFirmwareAndBios || !hasConfiguredPath(configuration.dsBios7Path))
    {
        return std::make_unique<ARM7BIOSImage>(bios_arm7_bin);
    }

    std::string path = configuration.dsBios7Path;

    if (FileHandle* f = OpenFile(path, Read))
    {
        std::unique_ptr<ARM7BIOSImage> bios = std::make_unique<ARM7BIOSImage>();
        FileRead(bios->data(), bios->size(), 1, f);
        CloseFile(f);
        Log(Info, "ARM7 BIOS loaded from %s\n", path.c_str());
        return bios;
    }

    Log(Warn, "ARM7 BIOS not found, falling back to FreeBIOS\n");
    return std::make_unique<ARM7BIOSImage>(bios_arm7_bin);
}

bool parseMacAddress(std::string mac, void* data)
{
    u8* mac_out = (u8*)data;

    int o = 0;
    u8 tmp = 0;
    for (int i = 0; i < 18; i++)
    {
        char c = mac[i];
        if (c == '\0') break;

        int n;
        if      (c >= '0' && c <= '9') n = c - '0';
        else if (c >= 'a' && c <= 'f') n = c - 'a' + 10;
        else if (c >= 'A' && c <= 'F') n = c - 'A' + 10;
        else continue;

        if (!(o & 1))
            tmp = n;
        else
            mac_out[o >> 1] = n | (tmp << 4);

        o++;
        if (o >= 12) return true;
    }

    return false;
}

void customizeFirmware(const EmulatorConfiguration& configuration, Firmware& firmware, bool isInternalFirmware, int instanceId) noexcept
{
    auto firmwareConfig = configuration.firmwareConfiguration;
    auto &currentData = firmware.GetEffectiveUserData();

    if (firmwareConfig.language == 8)
    {
        currentData.Settings &= ~Firmware::Language::Reserved;
        currentData.Settings |= Firmware::Language::English;
    }
    else
    {
        auto language = static_cast<Firmware::Language>(firmwareConfig.language);
        if (language != Firmware::Language::Reserved)
        {
            currentData.Settings &= ~Firmware::Language::Reserved;
            currentData.Settings |= language;
        }
    }

    if (isInternalFirmware)
    {
        // setting up username
        std::u16string username = std::wstring_convert<std::codecvt_utf8_utf16<char16_t>, char16_t>{}.from_bytes(firmwareConfig.username);
        if (!username.empty())
        { // If the frontend defines a username, take it. If not, leave the existing one.
            size_t usernameLength = std::min((int) username.length(), 10);
            currentData.NameLength = usernameLength;
            memcpy(currentData.Nickname, username.data(), usernameLength * sizeof(char16_t));
        }

        // setting up color
        u8 favoritecolor = firmwareConfig.favouriteColour;
        if (favoritecolor != 0xFF)
        {
            currentData.FavoriteColor = favoritecolor;
        }

        u8 birthmonth = firmwareConfig.birthdayMonth;
        if (birthmonth != 0)
        { // If the frontend specifies a birth month (rather than using the existing value)...
            currentData.BirthdayMonth = birthmonth;
        }

        u8 birthday = firmwareConfig.birthdayDay;
        if (birthday != 0)
        { // If the frontend specifies a birthday (rather than using the existing value)...
            currentData.BirthdayDay = birthday;
        }

        // setup message
        std::u16string message = std::wstring_convert<std::codecvt_utf8_utf16<char16_t>, char16_t>{}.from_bytes(firmwareConfig.message);
        if (!message.empty())
        {
            size_t messageLength = std::min((int) message.length(), 26);
            currentData.MessageLength = messageLength;
            memcpy(currentData.Message, message.data(), messageLength * sizeof(char16_t));
        }
    }

    MacAddress mac;
    bool replaceMac = false;
    auto& header = firmware.GetHeader();

    memcpy(&mac, header.MacAddr.data(), sizeof(MacAddress));

    MacAddress configuredMac;
    if (firmwareConfig.randomizeMacAddress)
    {
        std::random_device rd;
        configuredMac = mac;
        configuredMac[3] = static_cast<u8>(rd() & 0xFF);
        configuredMac[4] = static_cast<u8>(rd() & 0xFF);
        configuredMac[5] = static_cast<u8>(rd() & 0xFF);
        replaceMac = true;
    }
    else if (isInternalFirmware || firmwareConfig.macAddress[0] != '\0')
    {
        replaceMac = parseMacAddress(firmwareConfig.macAddress, &configuredMac);
    }

    if (replaceMac)
        mac = configuredMac;

    if (instanceId > 0)
    {
        replaceMac = true;
        mac[3] += instanceId;
        mac[4] += instanceId * 0x44;
        mac[5] += instanceId * 0x10;
    }

    if (replaceMac)
    {
        mac[0] &= 0xFC; // ensure the MAC isn't a broadcast MAC
        header.MacAddr = mac;
        header.UpdateChecksum();
    }

    // Configure WFC DNS override in Net_Slirp and in firmware's melonAP slot
    melonDS::Net_Slirp::SetCustomDNS(configuration.wfcDnsIp);
    if (configuration.wfcDnsIp != 0)
    {
        std::array<u8, 4> dnsBytes = {
            static_cast<u8>((configuration.wfcDnsIp >> 24) & 0xFF),
            static_cast<u8>((configuration.wfcDnsIp >> 16) & 0xFF),
            static_cast<u8>((configuration.wfcDnsIp >> 8) & 0xFF),
            static_cast<u8>(configuration.wfcDnsIp & 0xFF)
        };
        auto& accessPoints = firmware.GetAccessPoints();
        if (!accessPoints.empty())
        {
            accessPoints[0].PrimaryDns = dnsBytes;
            accessPoints[0].SecondaryDns = dnsBytes;
            accessPoints[0].UpdateChecksum();
        }
    }

    firmware.UpdateChecksums();
}

Firmware generateFirmware(const EmulatorConfiguration& configuration, int type, int instanceId) noexcept
{
    const std::string kWifiSettingsPath = "wfcsettings.bin";

    // Construct the default firmware...
    Firmware firmware = Firmware(type);
    assert(firmware.Buffer() != nullptr);

    if (FileHandle* f = OpenInternalFile(kWifiSettingsPath, Read))
    {
        constexpr unsigned TOTAL_WFC_SETTINGS_SIZE = 3 * (sizeof(Firmware::WifiAccessPoint) + sizeof(Firmware::ExtendedWifiAccessPoint));
        const u64 fileLen = FileLength(f);
        const u32 wfcOffset = firmware.GetExtendedAccessPointOffset();

        bool seekOk = true;
        if (fileLen >= wfcOffset + TOTAL_WFC_SETTINGS_SIZE)
        {
            // Full firmware blob saved by SaveManager: seek to the WFC settings region
            seekOk = FileSeek(f, wfcOffset, FileSeekOrigin::Start);
        }
        else if (fileLen < TOTAL_WFC_SETTINGS_SIZE)
        {
            seekOk = false;
        }

        const bool readOk = seekOk && (FileRead(firmware.GetExtendedAccessPointPosition(), TOTAL_WFC_SETTINGS_SIZE, 1, f) == 1);
        CloseFile(f);

        auto& aps = firmware.GetAccessPoints();
        // Also heal previously corrupted wfcsettings.bin where slot 0 (melonAP) was overwritten with 0xFF/header bytes
        const bool slot0Corrupted = aps.empty()
            || aps[0].Status == Firmware::AccessPointStatus::NotConfigured
            || static_cast<u8>(aps[0].Status) == 0xFF
            || aps[0].SSID[0] == '\0'
            || static_cast<u8>(aps[0].SSID[0]) == 0xFF;

        if (!readOk || slot0Corrupted)
        {
            if (!readOk)
                Log(Warn, "Failed to read Wi-fi settings from \"%s\"; using defaults instead\n", kWifiSettingsPath.c_str());
            else
                Log(Info, "Restoring default melonAP in Wi-fi settings slot 0\n");

            if (!readOk)
            {
                firmware.GetAccessPoints() = {
                    Firmware::WifiAccessPoint(type),
                    Firmware::WifiAccessPoint(),
                    Firmware::WifiAccessPoint(),
                };
                firmware.GetExtendedAccessPoints() = {
                    Firmware::ExtendedWifiAccessPoint(),
                    Firmware::ExtendedWifiAccessPoint(),
                    Firmware::ExtendedWifiAccessPoint(),
                };
            }
            else
            {
                aps[0] = Firmware::WifiAccessPoint(type);
            }
            firmware.UpdateChecksums();
        }
    }

    customizeFirmware(configuration, firmware, true, instanceId);

    return firmware;
}

std::unique_ptr<DSiBIOSImage> loadDSiARM9BIOS(const EmulatorConfiguration& configuration) noexcept
{
    std::string path = configuration.dsiBios9Path;
    if (hasConfiguredPath(configuration.dsiBios9Path))
    {
        if (FileHandle* f = OpenFile(path, Read))
        {
            std::unique_ptr<DSiBIOSImage> bios = std::make_unique<DSiBIOSImage>();
            memset(bios->data(), 0, bios->size());
            u64 fsize = FileLength(f);

            if (fsize == 0x8000)
            {
                // 32KB dump: native DSi ARM9i code and AES KeyX live at 0x8000..0xFFFF
                FileRead(bios->data() + 0x8000, 1, 0x8000, f);
                memcpy(bios->data(), bios_arm9_bin.data(), std::min((size_t)0x1000, bios_arm9_bin.size()));
            }
            else if (fsize >= 0x10000)
            {
                FileRead(bios->data(), 1, 0x10000, f);
            }
            else
            {
                FileRead(bios->data(), 1, fsize, f);
                if (fsize <= 0x8000)
                {
                    memcpy(bios->data() + 0x8000, bios->data(), fsize);
                }
            }
            CloseFile(f);
            Log(Info, "ARM9i BIOS loaded from %s (size %llu)\n", path.c_str(), fsize);
            return bios;
        }
    }

    const std::vector<std::string> candidates = {
        "/sdcard/STORM DS/bios/dsi/bios9i.bin",
        "/sdcard/STORM DS/bios/dsi/bios9.bin",
        "/sdcard/STORM DS/bios/bios9i.bin",
        "/sdcard/STORM DS/bios/bios9.bin",
        "/sdcard/RetroArch/system/bios9i.bin",
        "/sdcard/RetroArch/system/dsi_bios9.bin"
    };
    for (const auto& cand : candidates)
    {
        if (FileHandle* f = OpenFile(cand, Read))
        {
            std::unique_ptr<DSiBIOSImage> bios = std::make_unique<DSiBIOSImage>();
            memset(bios->data(), 0, bios->size());
            u64 fsize = FileLength(f);
            if (fsize >= 0x10000) FileRead(bios->data(), 1, 0x10000, f);
            else {
                FileRead(bios->data(), 1, fsize, f);
                memcpy(bios->data() + 0x8000, bios->data(), std::min((size_t)0x8000, (size_t)fsize));
            }
            CloseFile(f);
            Log(Info, "ARM9i BIOS auto-loaded from candidate %s\n", cand.c_str());
            return bios;
        }
    }

    Log(Warn, "ARM9i BIOS not found, using built-in DSi ARM9 stub\n");
    std::unique_ptr<DSiBIOSImage> bios = std::make_unique<DSiBIOSImage>();
    memset(bios->data(), 0, bios->size());
    memcpy(bios->data(), bios_arm9_bin.data(), std::min((size_t)0x1000, bios_arm9_bin.size()));
    return bios;
}

std::unique_ptr<DSiBIOSImage> loadDSiARM7BIOS(const EmulatorConfiguration& configuration) noexcept
{
    std::string path = configuration.dsiBios7Path;
    if (hasConfiguredPath(configuration.dsiBios7Path))
    {
        if (FileHandle* f = OpenFile(path, Read))
        {
            std::unique_ptr<DSiBIOSImage> bios = std::make_unique<DSiBIOSImage>();
            memset(bios->data(), 0, bios->size());
            u64 fsize = FileLength(f);

            if (fsize == 0x8000)
            {
                // 32KB dump: place at 0x8000..0xFFFF
                FileRead(bios->data() + 0x8000, 1, 0x8000, f);
                memcpy(bios->data(), bios_arm7_bin.data(), std::min((size_t)0x4000, bios_arm7_bin.size()));
            }
            else if (fsize >= 0x10000)
            {
                FileRead(bios->data(), 1, 0x10000, f);
            }
            else
            {
                FileRead(bios->data(), 1, fsize, f);
                if (fsize <= 0x8000)
                {
                    memcpy(bios->data() + 0x8000, bios->data(), fsize);
                }
            }
            CloseFile(f);
            Log(Info, "ARM7i BIOS loaded from %s (size %llu)\n", path.c_str(), fsize);
            return bios;
        }
    }

    const std::vector<std::string> candidates = {
        "/sdcard/STORM DS/bios/dsi/bios7i.bin",
        "/sdcard/STORM DS/bios/dsi/bios7.bin",
        "/sdcard/STORM DS/bios/bios7i.bin",
        "/sdcard/STORM DS/bios/bios7.bin",
        "/sdcard/RetroArch/system/bios7i.bin",
        "/sdcard/RetroArch/system/dsi_bios7.bin"
    };
    for (const auto& cand : candidates)
    {
        if (FileHandle* f = OpenFile(cand, Read))
        {
            std::unique_ptr<DSiBIOSImage> bios = std::make_unique<DSiBIOSImage>();
            memset(bios->data(), 0, bios->size());
            u64 fsize = FileLength(f);
            if (fsize >= 0x10000) FileRead(bios->data(), 1, 0x10000, f);
            else {
                FileRead(bios->data(), 1, fsize, f);
                memcpy(bios->data() + 0x8000, bios->data(), std::min((size_t)0x8000, (size_t)fsize));
            }
            CloseFile(f);
            Log(Info, "ARM7i BIOS auto-loaded from candidate %s\n", cand.c_str());
            return bios;
        }
    }

    Log(Warn, "ARM7i BIOS not found, using built-in DSi ARM7 stub\n");
    std::unique_ptr<DSiBIOSImage> bios = std::make_unique<DSiBIOSImage>();
    memset(bios->data(), 0, bios->size());
    memcpy(bios->data(), bios_arm7_bin.data(), std::min((size_t)0x4000, bios_arm7_bin.size()));
    return bios;
}

std::optional<Firmware> loadFirmware(const EmulatorConfiguration& configuration, int type, int instanceId) noexcept
{
    if (configuration.userInternalFirmwareAndBios && type == 0)
    {
        return generateFirmware(std::move(configuration), type, instanceId);
    }

    const char* configuredFirmwarePath = type == 1 ? configuration.dsiFirmwarePath : configuration.dsFirmwarePath;
    if (!hasConfiguredPath(configuredFirmwarePath))
    {
        if (type == 1 && hasConfiguredPath(configuration.dsFirmwarePath))
        {
            configuredFirmwarePath = configuration.dsFirmwarePath;
        }
        else
        {
            Log(Info, "%s firmware path is not configured, generating built-in firmware\n", type == 1 ? "DSi" : "DS");
            return generateFirmware(std::move(configuration), type, instanceId);
        }
    }

    std::string firmwarePath = configuredFirmwarePath;
    std::string fwpath_inst = firmwarePath; // TODO: Add support for one firmware file per instance

    Log(Debug, "Loading firmware from file %s\n", fwpath_inst.c_str());
    FileHandle* file = OpenFile(fwpath_inst, Read);

    if (!file)
    {
        Log(Debug, "Loading firmware from file %s\n", firmwarePath.c_str());
        file = OpenFile(firmwarePath, Read);
        if (!file)
        {
            if (type == 1 && hasConfiguredPath(configuration.dsFirmwarePath))
            {
                file = OpenFile(configuration.dsFirmwarePath, Read);
            }
            if (!file)
            {
                Log(Warn, "Couldn't open firmware file, generating built-in firmware\n");
                return generateFirmware(std::move(configuration), type, instanceId);
            }
        }
    }

    Firmware firmware(file);
    CloseFile(file);

    if (!firmware.Buffer())
    {
        Log(Warn, "Couldn't read firmware file, generating built-in firmware\n");
        return generateFirmware(std::move(configuration), type, instanceId);
    }

    customizeFirmware(std::move(configuration), firmware, false, instanceId);

    return firmware;
}

std::optional<DSi_NAND::NANDImage> loadNAND(const EmulatorConfiguration& configuration, const std::array<u8, DSiBIOSSize>& arm7ibios) noexcept
{
    std::string path = configuration.dsiNandPath;
    FileHandle* nandfile = nullptr;

    if (hasConfiguredPath(configuration.dsiNandPath))
    {
        nandfile = OpenFile(path, ReadWriteExisting);
        if (!nandfile)
            nandfile = OpenFile(path, Read);
    }

    if (!nandfile)
    {
        const std::vector<std::string> candidates = {
            "/sdcard/STORM DS/bios/dsi/nand.bin",
            "/sdcard/STORM DS/bios/dsi/dsi_nand.bin",
            "/sdcard/STORM DS/bios/nand.bin",
            "/sdcard/STORM DS/system/nand.bin",
            "/sdcard/RetroArch/system/nand.bin",
            "/sdcard/RetroArch/system/dsi_nand.bin"
        };
        for (const auto& cand : candidates)
        {
            nandfile = OpenFile(cand, ReadWriteExisting);
            if (!nandfile) nandfile = OpenFile(cand, Read);
            if (nandfile)
            {
                path = cand;
                Log(Info, "DSi NAND auto-located at %s\n", cand.c_str());
                break;
            }
        }
    }

    std::optional<DSi_NAND::NANDImage> nandImage;

    if (nandfile)
    {
        DSi_NAND::NANDImage img(nandfile, &arm7ibios[0x8308]);
        if (img)
        {
            nandImage = std::move(img);
        }
        else
        {
            Log(Warn, "Failed to initialize configured DSi NAND image at %s, falling back to synthetic NAND\n", path.c_str());
        }
    }

    if (!nandImage)
    {
        // Generate a minimal valid synthetic NAND image so DSi initialization never fails
        std::string synPath = "dsi_synthetic_nand.bin";
        FileHandle* synFile = OpenInternalFile(synPath, ReadWriteExisting);
        if (!synFile)
        {
            synFile = OpenInternalFile(synPath, ReadWrite);
            if (synFile)
            {
                constexpr size_t kSynSize = 0x100000; // 1MB
                std::vector<u8> dummy(kSynSize, 0);
                auto writeFooterAt = [&](size_t offset) {
                    if (offset + 0x40 <= kSynSize) {
                        memcpy(&dummy[offset], "DSi eMMC CID/CPU", 16);
                        u8 cid[16] = { 0x15, 0x00, 0x00, 0x4D, 0x30, 0x30, 0x30, 0x30, 0x30, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 };
                        memcpy(&dummy[offset + 16], cid, 16);
                        u64 consoleId = 0x0000000012345678ULL;
                        memcpy(&dummy[offset + 32], &consoleId, 8);
                    }
                };
                writeFooterAt(0x000FF800);
                writeFooterAt(kSynSize - 0x40);
                FileWrite(dummy.data(), 1, kSynSize, synFile);
                FileFlush(synFile);
            }
        }

        if (synFile)
        {
            DSi_NAND::NANDImage synImg(synFile, &arm7ibios[0x8308]);
            if (synImg)
            {
                Log(Info, "Synthetic DSi NAND fallback successfully initialized\n");
                nandImage = std::move(synImg);
            }
        }
    }

    if (!nandImage)
    {
        Log(Error, "Critical: Could not initialize any DSi NAND\n");
        return std::nullopt;
    }

    // Scoped mount for user settings; if mounting FAT fails, continue anyway (for Direct Boot)
    {
        auto mount = DSi_NAND::NANDMount(*nandImage);
        if (mount)
        {
            DSi_NAND::DSiFirmwareSystemSettings settings {};
            if (mount.ReadUserData(settings))
            {
                auto firmcfg = configuration.firmwareConfiguration;
                if (firmcfg.language == 8)
                    settings.Language = Firmware::Language::English;
                else
                    settings.Language = static_cast<Firmware::Language>(firmcfg.language);
                mount.ApplyUserData(settings);
            }
        }
        else
        {
            Log(Info, "DSi NAND FAT partition unmounted (Direct Boot mode ready)\n");
        }
    }

    return nandImage;
}

std::optional<FATStorage> loadSDCard(SdCardSettings settings) noexcept
{
    return std::nullopt;
}

std::optional<std::unique_ptr<NDSArgs>> BuildArgsFromConfiguration(const EmulatorConfiguration& configuration, int instanceId)
{
#ifdef JIT_ENABLED
    JITArgs _jitArgs {
        .MaxBlockSize = 64,
        .LiteralOptimizations = true,
        .BranchOptimizations = true,
        .FastMemory = true,
        .HgEngineFix = configuration.hgEngineFixEnabled,
    };
    auto jitArgs = configuration.useJit ? std::make_optional(_jitArgs) : std::nullopt;
#else
    std::optional<JITArgs> jitArgs = std::nullopt;
#endif

    auto arm9bios = loadARM9BIOS(configuration);
    if (!arm9bios)
        return std::nullopt;

    auto arm7bios = loadARM7BIOS(configuration);
    if (!arm7bios)
        return std::nullopt;

    auto firmware = loadFirmware(configuration, configuration.consoleType, instanceId);
    if (!firmware)
        return std::nullopt;

    NDSArgs* _ndsArgs = new NDSArgs {
        .ARM9BIOS = std::move(arm9bios),
        .ARM7BIOS = std::move(arm7bios),
        .Firmware = std::move(*firmware),
        .JIT = jitArgs,
        .BitDepth = static_cast<AudioBitDepth>(configuration.audioSettings.audioBitrate),
        .Interpolation = static_cast<AudioInterpolation>(configuration.audioSettings.audioInterpolation),
        .OutputSampleRate = 48000.0,
        .GDB = std::nullopt,
    };
    std::unique_ptr<NDSArgs> ndsArgs = std::unique_ptr<NDSArgs>(_ndsArgs);

    if (configuration.consoleType == 1)
    {
        auto arm7ibios = loadDSiARM7BIOS(configuration);
        if (!arm7ibios)
            return std::nullopt;

        auto arm9ibios = loadDSiARM9BIOS(configuration);
        if (!arm9ibios)
            return std::nullopt;

        auto nand = loadNAND(configuration, *arm7ibios);
        if (!nand)
            return std::nullopt;

        auto sdcard = loadSDCard(configuration.dsiSdCardSettings);

        DSiArgs _dsiArgs = DSiArgs {
            std::move(*ndsArgs),
            std::move(arm9ibios),
            std::move(arm7ibios),
            std::move(*nand),
            std::move(sdcard),
            false,
            true,
        };

        std::unique_ptr<DSiArgs> uniqueArgs = std::make_unique<DSiArgs>(std::move(_dsiArgs));
        return uniqueArgs;
    }
    else
    {
        return ndsArgs;
    }
}

}
