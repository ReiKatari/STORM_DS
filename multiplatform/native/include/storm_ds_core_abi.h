#pragma once

#include <stdint.h>
#include <stddef.h>

#if defined(_WIN32) || defined(__CYGWIN__)
  #ifdef STORM_DS_BUILD_DLL
    #define STORM_API __declspec(dllexport)
  #else
    #define STORM_API __declspec(dllimport)
  #endif
#else
  #if __GNUC__ >= 4
    #define STORM_API __attribute__((visibility("default")))
  #else
    #define STORM_API
  #endif
#endif

#pragma pack(push, 8)

struct StormDsVulkanCaps {
    int32_t vulkan_available;
    uint32_t api_version_major;
    uint32_t api_version_minor;
    uint32_t api_version_patch;
    int32_t recommended_tier; /* 4=VK1.3+ ZeroCopy, 2=VK1.0/1.1 Compat, 1=OpenGL, 0=Software */
    int32_t has_timeline_semaphore;
    int32_t has_descriptor_indexing;
    int32_t has_zero_copy_export;
    uint32_t vendor_id;
    uint32_t device_id;
    char device_name[128];
};

struct StormDsConfig {
    int32_t console_type; /* 0=NDS, 1=DSi */
    int32_t direct_boot;
    int32_t renderer_backend; /* 0=Auto, 1=Vulkan, 2=OpenGL, 3=Software */
    int32_t vulkan_tier_mode; /* 0=Auto, 1=ForceCompat10_11, 2=ZeroCopy14 */
    int32_t compositor_mode; /* 0=Auto, 1=Precise, 2=Fast, 3=Compatibility */
    int32_t upscale_factor; /* 1..8 */
    int32_t jit_enable;
    int32_t arm9_overclock;
    int32_t audio_interpolation;
    int32_t dsp_bass_boost;
    int32_t mic_mode;
    char bios9_path[512];
    char bios7_path[512];
    char firmware_path[512];
    char dsi_bios9_path[512];
    char dsi_bios7_path[512];
    char dsi_firmware_path[512];
    char dsi_nand_path[512];
    char save_dir[512];
};

struct StormDsRomMeta {
    char title[128];
    char game_code[8];
    char maker_code[4];
    uint32_t unit_code; /* 0=NDS, 2=NDS+DSi, 3=DSiWare */
    uint32_t rom_size_bytes;
    uint32_t crc32;
    uint32_t is_encrypted_modcrypt;
    uint32_t has_icon;
    uint32_t title_id_high;
    uint32_t title_id_low;
};

struct StormDsFrameStats {
    uint32_t frame_index;
    int32_t active_backend;
    int32_t active_vulkan_tier;
    int32_t active_compositor_mode;
    int32_t audio_frames_written;
    int32_t power_cnt1;
    uint64_t vk_top_image_handle;
    uint64_t vk_bottom_image_handle;
    float core_frame_ms;
};

struct StormDsCheatEntry {
    char name[64];
    int32_t enabled;
    uint32_t code_words[64];
    int32_t code_word_count;
};

struct StormDsNandSummary {
    int32_t valid;
    uint64_t total_bytes;
    uint64_t free_bytes;
    int32_t installed_title_count;
};

struct StormDsNandTitleInfo {
    uint32_t title_id_high;
    uint32_t title_id_low;
    char game_code[8];
    char title[128];
    uint32_t size_bytes;
    int32_t tmd_valid;
    int32_t public_sav_exists;
    uint32_t icon_rgba[1024];
};

#pragma pack(pop)

#ifdef __cplusplus
extern "C" {
#endif

STORM_API int32_t storm_ds_get_abi_version(void);
STORM_API int32_t storm_ds_probe_vulkan(StormDsVulkanCaps* out_caps);
STORM_API void* storm_ds_create(const StormDsConfig* cfg);
STORM_API void storm_ds_destroy(void* handle);
STORM_API int32_t storm_ds_update_config(void* handle, const StormDsConfig* cfg);
STORM_API int32_t storm_ds_inspect_rom_header(const uint8_t* data, size_t len, StormDsRomMeta* out_meta, uint32_t* out_icon_rgba_32x32);
STORM_API int32_t storm_ds_load_rom(void* handle, const uint8_t* data, size_t len, const char* rom_path, const char* sram_path);
STORM_API int32_t storm_ds_boot_firmware(void* handle);
STORM_API void storm_ds_reset(void* handle);
STORM_API void storm_ds_set_input(void* handle, uint32_t key_mask, int32_t touch_x, int32_t touch_y, int32_t is_touching, int32_t lid_closed);
STORM_API void storm_ds_set_motion_and_slot2(void* handle, int32_t slot2_addon, int32_t solar_lux, uint32_t guitar_mask, float gyro_x, float gyro_y, float gyro_z, uint32_t pedometer_steps);
STORM_API void storm_ds_set_mic_state(void* handle, int32_t mic_mode, const int16_t* pcm_samples, int32_t sample_count);
STORM_API int32_t storm_ds_run_frame(void* handle, uint32_t* out_top_bgra, uint32_t* out_bottom_bgra, int32_t out_width, int32_t out_height, int16_t* out_audio_lr, int32_t max_audio_frames, StormDsFrameStats* out_stats);
STORM_API int32_t storm_ds_tap_ocr_screen(void* handle, int32_t screen_index, uint32_t* out_bgra_256x192);
STORM_API int32_t storm_ds_save_state(void* handle, const char* state_path);
STORM_API int32_t storm_ds_load_state(void* handle, const char* state_path);
STORM_API int32_t storm_ds_rewind_push(void* handle);
STORM_API int32_t storm_ds_rewind_pop(void* handle);
STORM_API int32_t storm_ds_set_cheats(void* handle, const StormDsCheatEntry* cheats, int32_t count);
STORM_API int32_t storm_ds_nand_scan(const char* nand_path, StormDsNandSummary* out_summary, StormDsNandTitleInfo* out_titles, int32_t max_titles);
STORM_API int32_t storm_ds_nand_import_title(const char* nand_path, const char* app_path);
STORM_API int32_t storm_ds_nand_delete_title(const char* nand_path, uint32_t title_id_low);
STORM_API int32_t storm_ds_nand_repair_saves(const char* nand_path, uint32_t title_id_low);

#ifdef __cplusplus
}
#endif
