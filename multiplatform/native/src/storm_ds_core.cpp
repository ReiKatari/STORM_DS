#include "storm_ds_core_abi.h"
#include "VulkanCompatProbe.h"

#include <algorithm>
#include <chrono>
#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <memory>
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
    uint32_t frame_counter = 0;

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
};

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
    args.Firmware = melonDS::Firmware(0);
    args.Renderer3D = std::make_unique<melonDS::SoftRenderer>();

    if (cfg && cfg->audio_interpolation > 0) {
        args.Interpolation = (melonDS::AudioInterpolation)cfg->audio_interpolation;
    }

    if (cfg && cfg->console_type == 1 && cfg->dsi_nand_path[0] != '\0') {
        auto* nand_file = melonDS::Platform::OpenFile(cfg->dsi_nand_path, melonDS::Platform::FileMode::ReadWriteExisting);
        if (nand_file) {
            melonDS::DSi_NAND::NANDImage nand(nand_file, nullptr);
            if (nand) {
                s->is_dsi = true;
                melonDS::DSiArgs dsiArgs {
                    std::move(args),
                    std::make_unique<melonDS::DSiBIOSImage>(melonDS::BrokenBIOS<melonDS::DSiBIOSSize>),
                    std::make_unique<melonDS::DSiBIOSImage>(melonDS::BrokenBIOS<melonDS::DSiBIOSSize>),
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

    if (cfg && cfg->arm9_overclock > 1) {
        s->nds->SetARM9OverclockMultiplier(cfg->arm9_overclock);
    }

    return s;
}

STORM_API void storm_ds_destroy(void* handle)
{
    auto* s = (StormDsSession*)handle;
    if (!s) return;
    delete s;
}

STORM_API int32_t storm_ds_update_config(void* handle, const StormDsConfig* cfg)
{
    auto* s = (StormDsSession*)handle;
    if (!s || !cfg) return 0;
    s->config = *cfg;
    if (s->nds && cfg->arm9_overclock > 0) {
        s->nds->SetARM9OverclockMultiplier(cfg->arm9_overclock);
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

    if (sram_path) {
        FILE* sf = std::fopen(sram_path, "rb");
        if (sf) {
            std::fseek(sf, 0, SEEK_END);
            long slen = std::ftell(sf);
            std::fseek(sf, 0, SEEK_SET);
            if (slen > 0) {
                std::vector<uint8_t> sdata((size_t)slen);
                if (std::fread(sdata.data(), 1, sdata.size(), sf) == sdata.size()) {
                    s->nds->SetNDSSave(sdata.data(), (melonDS::u32)sdata.size());
                }
            }
            std::fclose(sf);
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
    (void)pcm_samples;
    (void)sample_count;
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
        out_stats->active_backend = s->config.renderer_backend;
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
