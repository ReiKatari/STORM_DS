#include "storm_ds_core_abi.h"
#include "storm_ds_internal.h"
#include "VulkanCompatProbe.h"

#include <algorithm>
#include <array>
#include <chrono>
#include <cmath>
#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <filesystem>
#include <memory>
#include <mutex>
#include <string>
#include <vector>

#include "NDS.h"
#include "DSi.h"
#include "NDSCart.h"
#include "GBACart.h"
#include "Savestate.h"
#include "Platform.h"
#include "Args.h"
#include "FreeBIOS.h"
#include "CRC32.h"
#include "GPU3D_Soft.h"
#include "GPU3D_Vulkan.h"
#include "VulkanContext.h"
#include "VulkanDispatch.h"
#include "DSi_NAND.h"

namespace
{

void BuildRomIcon(const melonDS::u8 (&data)[512], const melonDS::u16 (&palette)[16], melonDS::u32 (&iconRef)[32*32])
{
    melonDS::u32 paletteRGBA[16];
    for (int i = 0; i < 16; i++)
    {
        melonDS::u8 r = ((palette[i] >> 0)  & 0x1F) * 255 / 31;
        melonDS::u8 g = ((palette[i] >> 5)  & 0x1F) * 255 / 31;
        melonDS::u8 b = ((palette[i] >> 10) & 0x1F) * 255 / 31;
        melonDS::u8 a = i ? 255 : 0;
        paletteRGBA[i] = r | (g << 8) | (b << 16) | (a << 24);
    }

    int count = 0;
    for (int ytile = 0; ytile < 4; ytile++)
    {
        for (int xtile = 0; xtile < 4; xtile++)
        {
            for (int ypixel = 0; ypixel < 8; ypixel++)
            {
                for (int xpixel = 0; xpixel < 8; xpixel++)
                {
                    melonDS::u8 pal_index = count % 2 ? data[count/2] >> 4 : data[count/2] & 0x0F;
                    iconRef[ytile*256 + ypixel*32 + xtile*8 + xpixel] = paletteRGBA[pal_index];
                    count++;
                }
            }
        }
    }
}

struct StormDsSession
{
    StormDsConfig config {};
    std::unique_ptr<melonDS::NDS> nds;
    bool is_dsi = false;
    bool vulkan_context_acquired = false;
    int32_t active_backend = 3;
    melonDS::VulkanRenderer3D* vk_renderer = nullptr;
    uint32_t frame_counter = 0;

    std::string sram_path;
    std::string gba_sram_path;
    bool sram_dirty = false;

    std::vector<std::vector<uint8_t>> rewind_buffer;
    size_t rewind_max_states = 60;

    uint32_t key_mask = 0xFFF;
    int32_t touch_x = 0;
    int32_t touch_y = 0;
    int32_t is_touching = 0;
    int32_t lid_closed = 0;

    int32_t slot2_addon = 0;
    int32_t solar_lux = 0;
    uint32_t guitar_mask = 0;
    float gyro_x = 0;
    float gyro_y = 0;
    float gyro_z = 0;
    uint32_t pedometer_steps = 0;

    int32_t mic_mode = 0;
    std::mutex mic_mtx;
    std::vector<int16_t> mic_pcm_queue;
    uint32_t mic_noise_seed = 0x13579BDFu;
    uint32_t mic_phase = 0;
};

template <size_t ExpectedSize>
std::unique_ptr<std::array<melonDS::u8, ExpectedSize>> TryLoadBiosImage(const char* path)
{
    if (!path || path[0] == '\0') return nullptr;
    auto* f = melonDS::Platform::OpenFile(path, melonDS::Platform::FileMode::Read);
    if (!f) return nullptr;
    auto len = melonDS::Platform::FileLength(f);
    if (len < ExpectedSize)
    {
        melonDS::Platform::CloseFile(f);
        return nullptr;
    }
    auto img = std::make_unique<std::array<melonDS::u8, ExpectedSize>>();
    melonDS::u64 read = melonDS::Platform::FileRead(img->data(), 1, ExpectedSize, f);
    melonDS::Platform::CloseFile(f);
    if (read != ExpectedSize) return nullptr;
    return img;
}

bool WriteBytesAtomically(const std::string& path, const uint8_t* data, size_t len)
{
    if (path.empty() || !data || len == 0) return false;
    try
    {
        std::filesystem::path dstPath = std::filesystem::u8path(path);
        if (dstPath.has_parent_path())
        {
            std::filesystem::create_directories(dstPath.parent_path());
        }
        std::string tmpPath = path + ".tmp";
        auto* f = melonDS::Platform::OpenFile(tmpPath, melonDS::Platform::FileMode::Write);
        if (!f) return false;
        melonDS::u64 written = melonDS::Platform::FileWrite(data, 1, len, f);
        melonDS::Platform::FileFlush(f);
        melonDS::Platform::CloseFile(f);
        if (written != len) return false;

        std::error_code ec;
        std::filesystem::path tmpFsPath = std::filesystem::u8path(tmpPath);
        std::filesystem::rename(tmpFsPath, dstPath, ec);
        if (ec)
        {
            std::filesystem::copy_file(tmpFsPath, dstPath, std::filesystem::copy_options::overwrite_existing, ec);
            std::filesystem::remove(tmpFsPath, ec);
        }
        return !ec;
    }
    catch (...)
    {
        return false;
    }
}

}

namespace StormDS::Internal
{

void OnWriteNDSSave(void* userdata, const uint8_t* savedata, uint32_t savelen, uint32_t writeoffset, uint32_t writelen)
{
    (void)writeoffset;
    (void)writelen;
    auto* s = static_cast<StormDsSession*>(userdata);
    if (!s || !savedata || savelen == 0) return;
    s->sram_dirty = true;
    if (!s->sram_path.empty())
    {
        if (WriteBytesAtomically(s->sram_path, savedata, savelen))
        {
            s->sram_dirty = false;
        }
    }
}

void OnWriteGBASave(void* userdata, const uint8_t* savedata, uint32_t savelen, uint32_t writeoffset, uint32_t writelen)
{
    (void)writeoffset;
    (void)writelen;
    auto* s = static_cast<StormDsSession*>(userdata);
    if (!s || !savedata || savelen == 0 || s->gba_sram_path.empty()) return;
    WriteBytesAtomically(s->gba_sram_path, savedata, savelen);
}

int OnMicReadInput(void* userdata, int16_t* data, int maxlength)
{
    auto* s = static_cast<StormDsSession*>(userdata);
    if (!s || !data || maxlength <= 0) return 0;

    {
        std::lock_guard<std::mutex> lock(s->mic_mtx);
        if (!s->mic_pcm_queue.empty())
        {
            int toCopy = std::min<int>(maxlength, (int)s->mic_pcm_queue.size());
            std::memcpy(data, s->mic_pcm_queue.data(), (size_t)toCopy * sizeof(int16_t));
            s->mic_pcm_queue.erase(s->mic_pcm_queue.begin(), s->mic_pcm_queue.begin() + toCopy);
            return toCopy;
        }
    }

    if (s->mic_mode == 1)
    {
        // Simulated Blow: airy low-mid turbulence + soft sub-harmonic blow envelope
        for (int i = 0; i < maxlength; ++i)
        {
            s->mic_noise_seed = s->mic_noise_seed * 1664525u + 1013904223u;
            int16_t noise = (int16_t)((s->mic_noise_seed >> 16) & 0xFFFF);
            float breath = std::sinf((float)(s->mic_phase++) * 0.14f) * 9000.0f;
            int32_t mixed = (int32_t)(noise / 2) + (int32_t)breath;
            data[i] = (int16_t)std::clamp(mixed, -32767, 32767);
        }
        return maxlength;
    }

    if (s->mic_mode == 2)
    {
        // White Noise
        for (int i = 0; i < maxlength; ++i)
        {
            s->mic_noise_seed = s->mic_noise_seed * 1664525u + 1013904223u;
            data[i] = (int16_t)(((s->mic_noise_seed >> 16) & 0xFFFF) / 3);
        }
        return maxlength;
    }

    std::memset(data, 0, (size_t)maxlength * sizeof(int16_t));
    return 0;
}

bool OnAddonKeyDown(void* userdata, int keyType)
{
    auto* s = static_cast<StormDsSession*>(userdata);
    if (!s || keyType < 0 || keyType >= 4) return false;
    return (s->guitar_mask & (1u << keyType)) != 0;
}

float OnAddonMotionQuery(void* userdata, int motionQueryType)
{
    auto* s = static_cast<StormDsSession*>(userdata);
    if (!s) return 0.0f;
    switch (motionQueryType)
    {
        case melonDS::Platform::MotionAccelerationX: return s->gyro_x;
        case melonDS::Platform::MotionAccelerationY: return s->gyro_y;
        case melonDS::Platform::MotionAccelerationZ: return s->gyro_z;
        case melonDS::Platform::MotionRotationX: return s->gyro_x;
        case melonDS::Platform::MotionRotationY: return s->gyro_y;
        case melonDS::Platform::MotionRotationZ: return s->gyro_z;
        default: return 0.0f;
    }
}

}

extern "C" {

STORM_API int32_t storm_ds_get_abi_version(void)
{
    return 800;
}

STORM_API int32_t storm_ds_probe_vulkan(StormDsVulkanCaps* out_caps)
{
    return StormDS::ProbeVulkanCapabilities(out_caps);
}

STORM_API void* storm_ds_create(const StormDsConfig* cfg)
{
    auto* s = new StormDsSession();
    if (cfg) {
        s->config = *cfg;
    }

    melonDS::NDSArgs args;
    args.ARM9BIOS = std::make_unique<melonDS::ARM9BIOSImage>(melonDS::bios_arm9_bin);
    args.ARM7BIOS = std::make_unique<melonDS::ARM7BIOSImage>(melonDS::bios_arm7_bin);
    args.Firmware = melonDS::Firmware(cfg && cfg->console_type == 1 ? 1 : 0);
    args.OutputSampleRate = 48000.0;

    if (cfg) {
        if (auto ext9 = TryLoadBiosImage<melonDS::ARM9BIOSSize>(cfg->bios9_path)) {
            args.ARM9BIOS = std::move(ext9);
        }
        if (auto ext7 = TryLoadBiosImage<melonDS::ARM7BIOSSize>(cfg->bios7_path)) {
            args.ARM7BIOS = std::move(ext7);
        }
        if (cfg->firmware_path[0] != '\0') {
            if (auto* fwFile = melonDS::Platform::OpenFile(cfg->firmware_path, melonDS::Platform::FileMode::Read)) {
                melonDS::Firmware extFw(fwFile);
                melonDS::Platform::CloseFile(fwFile);
                if (extFw.Buffer() != nullptr) {
                    args.Firmware = std::move(extFw);
                }
            }
        }
        if (cfg->jit_enable == 0) {
            args.JIT = std::nullopt;
        } else {
            args.JIT = melonDS::JITArgs();
        }
        if (cfg->audio_interpolation >= 0 && cfg->audio_interpolation <= 4) {
            args.Interpolation = (melonDS::AudioInterpolation)cfg->audio_interpolation;
        }
    }

    int32_t requestedBackend = cfg ? cfg->renderer_backend : 0;
    if (requestedBackend == 0 || requestedBackend == 1) {
        if (melonDS::VulkanDispatch::Initialize() && melonDS::VulkanContext::Get().Acquire()) {
            s->vulkan_context_acquired = true;
            auto vk = melonDS::VulkanRenderer3D::New();
            if (vk) {
                s->vk_renderer = vk.get();
                args.Renderer3D = std::move(vk);
                s->active_backend = 1;
            }
        }
    }
    if (!args.Renderer3D) {
        args.Renderer3D = std::make_unique<melonDS::SoftRenderer>();
        s->active_backend = 3;
    }

    if (cfg && cfg->console_type == 1 && cfg->dsi_nand_path[0] != '\0') {
        auto* nand_file = melonDS::Platform::OpenFile(cfg->dsi_nand_path, melonDS::Platform::FileMode::ReadWriteExisting);
        if (nand_file) {
            melonDS::DSi_NAND::NANDImage nand(nand_file, nullptr);
            if (nand) {
                s->is_dsi = true;
                auto dsi9 = TryLoadBiosImage<melonDS::DSiBIOSSize>(cfg->dsi_bios9_path);
                auto dsi7 = TryLoadBiosImage<melonDS::DSiBIOSSize>(cfg->dsi_bios7_path);
                if (!dsi9) dsi9 = std::make_unique<melonDS::DSiBIOSImage>(melonDS::BrokenBIOS<melonDS::DSiBIOSSize>);
                if (!dsi7) dsi7 = std::make_unique<melonDS::DSiBIOSImage>(melonDS::BrokenBIOS<melonDS::DSiBIOSSize>);
                melonDS::DSiArgs dsiArgs {
                    std::move(args),
                    std::move(dsi9),
                    std::move(dsi7),
                    std::move(nand),
                    std::nullopt,
                    false,
                    false
                };
                s->nds = std::make_unique<melonDS::DSi>(std::move(dsiArgs), s);
            }
        }
    }

    if (!s->nds) {
        s->is_dsi = false;
        s->nds = std::make_unique<melonDS::NDS>(std::move(args), s);
    }

    if (s->vk_renderer && cfg) {
        int scale = std::clamp(cfg->upscale_factor, 1, 8);
        s->vk_renderer->SetRenderSettings(true, true, scale, false, 0.0f, 0.0f, false, false, false, s->nds->GPU);
    }

    if (cfg && cfg->arm9_overclock > 1) {
        s->nds->SetARM9OverclockMultiplier(cfg->arm9_overclock);
    }

    return s;
}

STORM_API void storm_ds_destroy(void* handle)
{
    auto* s = (StormDsSession*)handle;
    if (!s) return;
    if (s->nds && s->sram_dirty && !s->sram_path.empty()) {
        const uint8_t* saveBuf = s->nds->GetNDSSave();
        uint32_t saveLen = s->nds->GetNDSSaveLength();
        if (saveBuf && saveLen > 0) {
            WriteBytesAtomically(s->sram_path, saveBuf, saveLen);
        }
    }
    s->vk_renderer = nullptr;
    s->nds.reset();
    if (s->vulkan_context_acquired) {
        melonDS::VulkanContext::Get().Release();
        s->vulkan_context_acquired = false;
    }
    delete s;
}

STORM_API int32_t storm_ds_update_config(void* handle, const StormDsConfig* cfg)
{
    auto* s = (StormDsSession*)handle;
    if (!s || !cfg) return 0;
    s->config = *cfg;
    if (s->nds) {
        if (cfg->arm9_overclock > 0) {
            s->nds->SetARM9OverclockMultiplier(cfg->arm9_overclock);
        }
        if (cfg->audio_interpolation >= 0 && cfg->audio_interpolation <= 4) {
            s->nds->SPU.SetInterpolation((melonDS::AudioInterpolation)cfg->audio_interpolation);
        }
        s->nds->SetJITArgs(cfg->jit_enable != 0 ? std::optional<melonDS::JITArgs>(melonDS::JITArgs()) : std::nullopt);
        if (s->vk_renderer) {
            int scale = std::clamp(cfg->upscale_factor, 1, 8);
            s->vk_renderer->SetRenderSettings(true, true, scale, false, 0.0f, 0.0f, false, false, false, s->nds->GPU);
        }
    }
    return 1;
}

STORM_API int32_t storm_ds_inspect_rom_header(const uint8_t* data, size_t len, StormDsRomMeta* out_meta, uint32_t* out_icon_rgba_32x32)
{
    if (!data || len < 512 || !out_meta) return 0;
    std::memset(out_meta, 0, sizeof(StormDsRomMeta));

    std::memcpy(out_meta->title, data, 12);
    out_meta->title[12] = '\0';
    for (int i = 11; i >= 0 && (out_meta->title[i] == ' ' || out_meta->title[i] == '\0'); --i) {
        out_meta->title[i] = '\0';
    }

    std::memcpy(out_meta->game_code, data + 0x0C, 4);
    out_meta->game_code[4] = '\0';

    std::memcpy(out_meta->maker_code, data + 0x10, 2);
    out_meta->maker_code[2] = '\0';

    out_meta->unit_code = data[0x12];
    out_meta->rom_size_bytes = (uint32_t)len;
    out_meta->crc32 = melonDS::CRC32(data, (melonDS::u32)std::min<size_t>(len, 0x1000));

    uint8_t dsi_crypto = (len > 0x1C) ? data[0x1C] : 0;
    out_meta->is_encrypted_modcrypt = (out_meta->unit_code != 0 && (dsi_crypto & 0x03) != 0) ? 1 : 0;

    if (len >= 0x238) {
        out_meta->title_id_low = *(const uint32_t*)(data + 0x230);
        out_meta->title_id_high = *(const uint32_t*)(data + 0x234);
    }

    uint32_t banner_offset = *(const uint32_t*)(data + 0x68);
    if (banner_offset > 0 && banner_offset + 0x240 <= len) {
        out_meta->has_icon = 1;
        if (out_icon_rgba_32x32) {
            const uint8_t* icon_tiles = data + banner_offset + 0x20;
            const uint16_t* pal_data = (const uint16_t*)(data + banner_offset + 0x220);
            melonDS::u8 t_bytes[512];
            melonDS::u16 p_words[16];
            std::memcpy(t_bytes, icon_tiles, 512);
            std::memcpy(p_words, pal_data, 32);
            melonDS::u32 icon_buf[32*32];
            BuildRomIcon(t_bytes, p_words, icon_buf);
            std::memcpy(out_icon_rgba_32x32, icon_buf, sizeof(icon_buf));
        }
    }

    return 1;
}

STORM_API int32_t storm_ds_load_rom(void* handle, const uint8_t* data, size_t len, const char* rom_path, const char* sram_path)
{
    auto* s = (StormDsSession*)handle;
    if (!s || !s->nds) return 0;

    std::unique_ptr<melonDS::NDSCart::CartCommon> cart;
    if (data && len > 0) {
        cart = melonDS::NDSCart::ParseROM(data, (melonDS::u32)len, s);
    } else if (rom_path) {
        FILE* rf = std::fopen(rom_path, "rb");
        if (!rf) return 0;
        std::fseek(rf, 0, SEEK_END);
        long rlen = std::ftell(rf);
        std::fseek(rf, 0, SEEK_SET);
        if (rlen <= 0) { std::fclose(rf); return 0; }
        std::vector<uint8_t> rdata((size_t)rlen);
        if (std::fread(rdata.data(), 1, rdata.size(), rf) != rdata.size()) {
            std::fclose(rf);
            return 0;
        }
        std::fclose(rf);
        cart = melonDS::NDSCart::ParseROM(rdata.data(), (melonDS::u32)rdata.size(), s);
    }

    if (!cart) return 0;

    s->nds->SetNDSCart(std::move(cart));
    s->sram_path = (sram_path && sram_path[0] != '\0') ? sram_path : "";
    s->sram_dirty = false;

    if (!s->sram_path.empty()) {
        if (auto* sf = melonDS::Platform::OpenFile(s->sram_path, melonDS::Platform::FileMode::Read)) {
            melonDS::u64 slen = melonDS::Platform::FileLength(sf);
            if (slen > 0 && slen <= 16u * 1024u * 1024u) {
                std::vector<uint8_t> sdata((size_t)slen);
                if (melonDS::Platform::FileRead(sdata.data(), 1, (melonDS::u64)sdata.size(), sf) == (melonDS::u64)sdata.size()) {
                    s->nds->SetNDSSave(sdata.data(), (melonDS::u32)sdata.size());
                }
            }
            melonDS::Platform::CloseFile(sf);
        }
    }

    s->nds->Reset();
    s->nds->Start();
    return 1;
}

STORM_API int32_t storm_ds_boot_firmware(void* handle)
{
    auto* s = (StormDsSession*)handle;
    if (!s || !s->nds) return 0;

    s->nds->Reset();
    s->nds->Start();
    return 1;
}

STORM_API void storm_ds_reset(void* handle)
{
    auto* s = (StormDsSession*)handle;
    if (!s || !s->nds) return;
    s->nds->Reset();
}

STORM_API void storm_ds_set_input(void* handle, uint32_t key_mask, int32_t touch_x, int32_t touch_y, int32_t is_touching, int32_t lid_closed)
{
    auto* s = (StormDsSession*)handle;
    if (!s || !s->nds) return;

    s->key_mask = key_mask;
    s->touch_x = touch_x;
    s->touch_y = touch_y;
    s->is_touching = is_touching;
    s->lid_closed = lid_closed;

    s->nds->SetKeyMask(key_mask);
    if (is_touching) {
        s->nds->TouchScreen((melonDS::u16)touch_x, (melonDS::u16)touch_y);
    } else {
        s->nds->ReleaseScreen();
    }
    s->nds->SetLidClosed(lid_closed != 0);
}

STORM_API void storm_ds_set_motion_and_slot2(void* handle, int32_t slot2_addon, int32_t solar_lux, uint32_t guitar_mask, float gyro_x, float gyro_y, float gyro_z, uint32_t pedometer_steps)
{
    auto* s = (StormDsSession*)handle;
    if (!s) return;
    s->slot2_addon = slot2_addon;
    s->solar_lux = solar_lux;
    s->guitar_mask = guitar_mask;
    s->gyro_x = gyro_x;
    s->gyro_y = gyro_y;
    s->gyro_z = gyro_z;
    s->pedometer_steps = pedometer_steps;
}

STORM_API void storm_ds_set_mic_state(void* handle, int32_t mic_mode, const int16_t* pcm_samples, int32_t sample_count)
{
    auto* s = (StormDsSession*)handle;
    if (!s) return;
    s->mic_mode = mic_mode;
    if (pcm_samples && sample_count > 0) {
        std::lock_guard<std::mutex> lock(s->mic_mtx);
        int32_t count = std::min<int32_t>(sample_count, 16384);
        s->mic_pcm_queue.insert(s->mic_pcm_queue.end(), pcm_samples, pcm_samples + count);
        if (s->mic_pcm_queue.size() > 16384) {
            size_t excess = s->mic_pcm_queue.size() - 16384;
            s->mic_pcm_queue.erase(s->mic_pcm_queue.begin(), s->mic_pcm_queue.begin() + (ptrdiff_t)excess);
        }
    }
}

STORM_API int32_t storm_ds_run_frame(void* handle, uint32_t* out_top_bgra, uint32_t* out_bottom_bgra, int32_t out_width, int32_t out_height, int16_t* out_audio_lr, int32_t max_audio_frames, StormDsFrameStats* out_stats)
{
    auto* s = (StormDsSession*)handle;
    if (!s || !s->nds) return 0;

    auto t0 = std::chrono::high_resolution_clock::now();

    s->nds->RunFrame();

    auto t1 = std::chrono::high_resolution_clock::now();
    float elapsed_ms = std::chrono::duration<float, std::milli>(t1 - t0).count();

    int fb = s->nds->GPU.FrontBuffer;
    const uint32_t* top_raw = s->nds->GPU.Framebuffer[fb][0].get();
    const uint32_t* btm_raw = s->nds->GPU.Framebuffer[fb][1].get();

    if (out_top_bgra && top_raw) {
        if (out_width == 256 && out_height == 192) {
            std::memcpy(out_top_bgra, top_raw, 256 * 192 * sizeof(uint32_t));
        } else if (out_width > 0 && out_height > 0) {
            for (int y = 0; y < out_height; ++y) {
                int sy = (y * 192) / out_height;
                const uint32_t* srow = top_raw + sy * 256;
                uint32_t* drow = out_top_bgra + y * out_width;
                for (int x = 0; x < out_width; ++x) {
                    drow[x] = srow[(x * 256) / out_width];
                }
            }
        }
    }

    if (out_bottom_bgra && btm_raw) {
        if (out_width == 256 && out_height == 192) {
            std::memcpy(out_bottom_bgra, btm_raw, 256 * 192 * sizeof(uint32_t));
        } else if (out_width > 0 && out_height > 0) {
            for (int y = 0; y < out_height; ++y) {
                int sy = (y * 192) / out_height;
                const uint32_t* srow = btm_raw + sy * 256;
                uint32_t* drow = out_bottom_bgra + y * out_width;
                for (int x = 0; x < out_width; ++x) {
                    drow[x] = srow[(x * 256) / out_width];
                }
            }
        }
    }

    int frames_written = 0;
    if (out_audio_lr && max_audio_frames > 0) {
        frames_written = s->nds->SPU.ReadOutput((melonDS::s16*)out_audio_lr, max_audio_frames);
    }

    if (out_stats) {
        out_stats->frame_index = s->frame_counter++;
        out_stats->active_backend = s->active_backend;
        out_stats->active_vulkan_tier = s->config.vulkan_tier_mode;
        out_stats->active_compositor_mode = s->config.compositor_mode;
        out_stats->audio_frames_written = frames_written;
        out_stats->power_cnt1 = (int32_t)s->nds->PowerControl9;
        out_stats->vk_top_image_handle = 0;
        out_stats->vk_bottom_image_handle = 0;
        out_stats->core_frame_ms = elapsed_ms;
    }

    return 1;
}

STORM_API int32_t storm_ds_tap_ocr_screen(void* handle, int32_t screen_index, uint32_t* out_bgra_256x192)
{
    auto* s = (StormDsSession*)handle;
    if (!s || !s->nds || !out_bgra_256x192) return 0;

    int fb = s->nds->GPU.FrontBuffer;
    int idx = (screen_index == 1) ? 1 : 0;
    const uint32_t* src = s->nds->GPU.Framebuffer[fb][idx].get();
    if (!src) return 0;

    std::memcpy(out_bgra_256x192, src, 256 * 192 * sizeof(uint32_t));
    return 1;
}

STORM_API int32_t storm_ds_save_state(void* handle, const char* state_path)
{
    auto* s = (StormDsSession*)handle;
    if (!s || !s->nds || !state_path) return 0;

    melonDS::Savestate save(melonDS::Savestate::DEFAULT_SIZE);
    if (!s->nds->DoSavestate(&save) || save.Error) return 0;

    FILE* f = std::fopen(state_path, "wb");
    if (!f) return 0;
    size_t w = std::fwrite(save.Buffer(), 1, save.Length(), f);
    std::fclose(f);
    return w == save.Length() ? 1 : 0;
}

STORM_API int32_t storm_ds_load_state(void* handle, const char* state_path)
{
    auto* s = (StormDsSession*)handle;
    if (!s || !s->nds || !state_path) return 0;

    FILE* f = std::fopen(state_path, "rb");
    if (!f) return 0;
    std::fseek(f, 0, SEEK_END);
    long len = std::ftell(f);
    std::fseek(f, 0, SEEK_SET);
    if (len <= 0) { std::fclose(f); return 0; }

    std::vector<uint8_t> buf((size_t)len);
    if (std::fread(buf.data(), 1, buf.size(), f) != buf.size()) {
        std::fclose(f);
        return 0;
    }
    std::fclose(f);

    melonDS::Savestate load(buf.data(), (melonDS::u32)buf.size(), false);
    return (s->nds->DoSavestate(&load) && !load.Error) ? 1 : 0;
}

STORM_API int32_t storm_ds_rewind_push(void* handle)
{
    auto* s = (StormDsSession*)handle;
    if (!s || !s->nds) return 0;

    melonDS::Savestate save(melonDS::Savestate::DEFAULT_SIZE);
    if (!s->nds->DoSavestate(&save) || save.Error) return 0;

    std::vector<uint8_t> sbytes(save.Length());
    std::memcpy(sbytes.data(), save.Buffer(), save.Length());

    if (s->rewind_buffer.size() >= s->rewind_max_states) {
        s->rewind_buffer.erase(s->rewind_buffer.begin());
    }
    s->rewind_buffer.push_back(std::move(sbytes));
    return 1;
}

STORM_API int32_t storm_ds_rewind_pop(void* handle)
{
    auto* s = (StormDsSession*)handle;
    if (!s || !s->nds || s->rewind_buffer.empty()) return 0;

    auto sbytes = std::move(s->rewind_buffer.back());
    s->rewind_buffer.pop_back();

    melonDS::Savestate load(sbytes.data(), (melonDS::u32)sbytes.size(), false);
    return (s->nds->DoSavestate(&load) && !load.Error) ? 1 : 0;
}

STORM_API int32_t storm_ds_set_cheats(void* handle, const StormDsCheatEntry* cheats, int32_t count)
{
    auto* s = (StormDsSession*)handle;
    if (!s || !s->nds) return 0;

    s->nds->AREngine.Cheats.clear();
    if (!cheats || count <= 0) return 1;

    for (int32_t i = 0; i < count; ++i) {
        const auto& c = cheats[i];
        melonDS::ARCode ar;
        ar.Parent = nullptr;
        ar.Name = c.name;
        ar.Enabled = (c.enabled != 0);
        int32_t num_words = std::min<int32_t>(c.code_word_count, 64);
        for (int32_t w = 0; w < num_words; ++w) {
            ar.Code.push_back(c.code_words[w]);
        }
        s->nds->AREngine.Cheats.push_back(std::move(ar));
    }
    return 1;
}

STORM_API int32_t storm_ds_nand_scan(const char* nand_path, StormDsNandSummary* out_summary, StormDsNandTitleInfo* out_titles, int32_t max_titles)
{
    if (out_summary) std::memset(out_summary, 0, sizeof(StormDsNandSummary));
    if (!nand_path || !out_summary) return 0;

    auto* f = melonDS::Platform::OpenFile(nand_path, melonDS::Platform::FileMode::ReadWriteExisting);
    if (!f) f = melonDS::Platform::OpenFile(nand_path, melonDS::Platform::FileMode::Read);
    if (!f) return 0;

    melonDS::DSi_NAND::NANDImage nand(f, nullptr);
    if (!nand) return 0;

    melonDS::DSi_NAND::NANDMount mount(nand);
    if (!mount) return 0;

    out_summary->valid = 1;
    out_summary->total_bytes = 256ULL * 1024ULL * 1024ULL;
    out_summary->free_bytes = out_summary->total_bytes - mount.GetDirectorySizeOnDisk("0:/title", mount.GetClusterSizeBytes());

    std::vector<melonDS::u32> titlelist;
    mount.ListTitles(0x00030004, titlelist);
    out_summary->installed_title_count = (int32_t)titlelist.size();

    if (out_titles && max_titles > 0) {
        int count = std::min<int>((int)titlelist.size(), max_titles);
        for (int i = 0; i < count; ++i) {
            std::memset(&out_titles[i], 0, sizeof(StormDsNandTitleInfo));
            out_titles[i].title_id_high = 0x00030004;
            out_titles[i].title_id_low = titlelist[i];

            melonDS::u32 version = 0;
            melonDS::NDSHeader header {};
            melonDS::NDSBanner banner {};
            mount.GetTitleInfo(0x00030004, titlelist[i], version, &header, &banner);

            std::memcpy(out_titles[i].game_code, header.GameCode, 4);
            out_titles[i].game_code[4] = '\0';
            std::memcpy(out_titles[i].title, header.GameTitle, 12);
            out_titles[i].title[12] = '\0';
            out_titles[i].size_bytes = (header.CardSize > 0) ? (128u * 1024u << header.CardSize) : (header.ARM9Size + header.ARM7Size);
            out_titles[i].tmd_valid = 1;

            melonDS::u32 icon_buf[32*32];
            BuildRomIcon(banner.Icon, banner.Palette, icon_buf);
            std::memcpy(out_titles[i].icon_rgba, icon_buf, sizeof(icon_buf));
        }
    }

    return 1;
}

STORM_API int32_t storm_ds_nand_import_title(const char* nand_path, const char* app_path)
{
    if (!nand_path || !app_path) return 0;

    auto* f = melonDS::Platform::OpenFile(nand_path, melonDS::Platform::FileMode::ReadWriteExisting);
    if (!f) return 0;

    melonDS::DSi_NAND::NANDImage nand(f, nullptr);
    if (!nand) return 0;

    melonDS::DSi_NAND::NANDMount mount(nand);
    if (!mount) return 0;

    FILE* app_file = std::fopen(app_path, "rb");
    if (!app_file) return 0;
    std::fseek(app_file, 0, SEEK_END);
    long app_len = std::ftell(app_file);
    std::fseek(app_file, 0, SEEK_SET);
    if (app_len <= 0) { std::fclose(app_file); return 0; }

    std::vector<uint8_t> app_data((size_t)app_len);
    if (std::fread(app_data.data(), 1, app_data.size(), app_file) != app_data.size()) {
        std::fclose(app_file);
        return 0;
    }
    std::fclose(app_file);

    melonDS::DSi_TMD::TitleMetadata tmd {};
    return mount.ImportTitle(app_data.data(), app_data.size(), tmd, false) ? 1 : 0;
}

STORM_API int32_t storm_ds_nand_delete_title(const char* nand_path, uint32_t title_id_low)
{
    if (!nand_path) return 0;

    auto* f = melonDS::Platform::OpenFile(nand_path, melonDS::Platform::FileMode::ReadWriteExisting);
    if (!f) return 0;

    melonDS::DSi_NAND::NANDImage nand(f, nullptr);
    if (!nand) return 0;

    melonDS::DSi_NAND::NANDMount mount(nand);
    if (!mount) return 0;

    mount.DeleteTitle(0x00030004, title_id_low);
    return 1;
}

STORM_API int32_t storm_ds_nand_repair_saves(const char* nand_path, uint32_t title_id_low)
{
    if (!nand_path) return 0;

    auto* f = melonDS::Platform::OpenFile(nand_path, melonDS::Platform::FileMode::ReadWriteExisting);
    if (!f) return 0;

    melonDS::DSi_NAND::NANDImage nand(f, nullptr);
    if (!nand) return 0;

    melonDS::DSi_NAND::NANDMount mount(nand);
    if (!mount) return 0;

    char pubPath[128];
    std::snprintf(pubPath, sizeof(pubPath), "0:/title/00030004/%08x/data/public.sav", title_id_low);
    mount.CreateSaveFile(pubPath, 512 * 1024);

    char privPath[128];
    std::snprintf(privPath, sizeof(privPath), "0:/title/00030004/%08x/data/private.sav", title_id_low);
    mount.CreateSaveFile(privPath, 512 * 1024);

    return 1;
}

}
