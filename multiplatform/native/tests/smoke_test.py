import os
import sys
import ctypes
from ctypes import (
    c_int32, c_uint32, c_uint64, c_char, c_int16, c_void_p, c_float,
    Structure, POINTER, byref
)

# ABI Structs matching storm_ds_core_abi.h
class StormDsVulkanCaps(Structure):
    _pack_ = 8
    _fields_ = [
        ("vulkan_available", c_int32),
        ("api_version_major", c_uint32),
        ("api_version_minor", c_uint32),
        ("api_version_patch", c_uint32),
        ("recommended_tier", c_int32),
        ("has_timeline_semaphore", c_int32),
        ("has_descriptor_indexing", c_int32),
        ("has_zero_copy_export", c_int32),
        ("vendor_id", c_uint32),
        ("device_id", c_uint32),
        ("device_name", c_char * 128),
    ]

class StormDsConfig(Structure):
    _pack_ = 8
    _fields_ = [
        ("console_type", c_int32),
        ("direct_boot", c_int32),
        ("renderer_backend", c_int32),
        ("vulkan_tier_mode", c_int32),
        ("compositor_mode", c_int32),
        ("upscale_factor", c_int32),
        ("jit_enable", c_int32),
        ("arm9_overclock", c_int32),
        ("audio_interpolation", c_int32),
        ("dsp_bass_boost", c_int32),
        ("mic_mode", c_int32),
        ("bios9_path", c_char * 512),
        ("bios7_path", c_char * 512),
        ("firmware_path", c_char * 512),
        ("dsi_bios9_path", c_char * 512),
        ("dsi_bios7_path", c_char * 512),
        ("dsi_firmware_path", c_char * 512),
        ("dsi_nand_path", c_char * 512),
        ("save_dir", c_char * 512),
    ]

class StormDsRomMeta(Structure):
    _pack_ = 8
    _fields_ = [
        ("title", c_char * 128),
        ("game_code", c_char * 8),
        ("maker_code", c_char * 4),
        ("unit_code", c_uint32),
        ("rom_size_bytes", c_uint32),
        ("crc32", c_uint32),
        ("is_encrypted_modcrypt", c_uint32),
        ("has_icon", c_uint32),
        ("title_id_high", c_uint32),
        ("title_id_low", c_uint32),
    ]

class StormDsFrameStats(Structure):
    _pack_ = 8
    _fields_ = [
        ("frame_index", c_uint32),
        ("active_backend", c_int32),
        ("active_vulkan_tier", c_int32),
        ("active_compositor_mode", c_int32),
        ("audio_frames_written", c_int32),
        ("power_cnt1", c_int32),
        ("vk_top_image_handle", c_uint64),
        ("vk_bottom_image_handle", c_uint64),
        ("core_frame_ms", c_float),
    ]

def run_smoke_test(dll_path):
    print(f"=== STORM DS Smoke Test: {dll_path} ===")
    assert os.path.exists(dll_path), f"DLL not found: {dll_path}"

    lib = ctypes.CDLL(dll_path)

    # 1. ABI Version
    lib.storm_ds_get_abi_version.argtypes = []
    lib.storm_ds_get_abi_version.restype = c_uint32
    abi_ver = lib.storm_ds_get_abi_version()
    print(f"[1] ABI Version: {abi_ver}")
    assert abi_ver == 800, f"Expected ABI version 800, got {abi_ver}"

    # 2. Vulkan Probe
    lib.storm_ds_probe_vulkan.argtypes = [POINTER(StormDsVulkanCaps)]
    lib.storm_ds_probe_vulkan.restype = c_int32
    caps = StormDsVulkanCaps()
    vulkan_ok = lib.storm_ds_probe_vulkan(byref(caps))
    dev_name = caps.device_name.decode("utf-8", errors="ignore").strip()
    print(f"[2] Vulkan Probe: available={caps.vulkan_available}, API={caps.api_version_major}.{caps.api_version_minor}.{caps.api_version_patch}, device='{dev_name}', tier={caps.recommended_tier}, timeline_sem={caps.has_timeline_semaphore}, desc_indexing={caps.has_descriptor_indexing}, zero_copy={caps.has_zero_copy_export}")

    # 3. Session Creation
    lib.storm_ds_create.argtypes = [POINTER(StormDsConfig)]
    lib.storm_ds_create.restype = c_void_p
    session = lib.storm_ds_create(None)
    assert session is not None and session != 0, "storm_ds_create failed!"
    print(f"[3] Created Session: 0x{session:X}")

    # 4. Boot FreeBIOS firmware
    lib.storm_ds_boot_firmware.argtypes = [c_void_p]
    lib.storm_ds_boot_firmware.restype = c_int32
    boot_res = lib.storm_ds_boot_firmware(session)
    print(f"[4] Boot FreeBIOS firmware result: {boot_res}")
    assert boot_res == 1, "Failed to boot FreeBIOS firmware"

    # 5. Run 5 frames
    lib.storm_ds_run_frame.argtypes = [
        c_void_p,
        POINTER(c_uint32),
        POINTER(c_uint32),
        c_int32,
        c_int32,
        POINTER(c_int16),
        c_int32,
        POINTER(StormDsFrameStats),
    ]
    lib.storm_ds_run_frame.restype = c_int32

    top_fb = (c_uint32 * (256 * 192))()
    bot_fb = (c_uint32 * (256 * 192))()
    audio_buf = (c_int16 * (2048 * 2))()
    stats = StormDsFrameStats()

    total_top_nonzero = 0
    total_bot_nonzero = 0
    total_audio_samples = 0

    for f in range(5):
        samples_ok = lib.storm_ds_run_frame(
            session,
            top_fb,
            bot_fb,
            256,
            192,
            audio_buf,
            2048,
            byref(stats),
        )
        assert samples_ok == 1, f"Frame {f+1} failed"
        top_nonzero = sum(1 for p in top_fb if p != 0)
        bot_nonzero = sum(1 for p in bot_fb if p != 0)
        audio_nonzero = sum(1 for s in audio_buf if s != 0)
        total_top_nonzero += top_nonzero
        total_bot_nonzero += bot_nonzero
        total_audio_samples += stats.audio_frames_written
        print(f"    Frame {f+1}: idx={stats.frame_index}, top_nonzero={top_nonzero}, bot_nonzero={bot_nonzero}, audio_written={stats.audio_frames_written}, frame_ms={stats.core_frame_ms:.2f}ms")

    assert total_top_nonzero > 0, "No top screen pixels rendered!"
    assert total_bot_nonzero > 0, "No bottom screen pixels rendered!"
    assert total_audio_samples > 0, "No audio frames generated!"
    print(f"[5] Frame execution verified. Top pixels={total_top_nonzero}, Bottom pixels={total_bot_nonzero}, Audio samples={total_audio_samples}")

    # 6. Destroy Session
    lib.storm_ds_destroy.argtypes = [c_void_p]
    lib.storm_ds_destroy.restype = None
    lib.storm_ds_destroy(session)
    print("[6] Session destroyed cleanly.")
    print("=== ALL SMOKE TESTS PASSED ===")
    return True

if __name__ == "__main__":
    dll_path = sys.argv[1] if len(sys.argv) > 1 else os.path.join(os.path.dirname(__file__), "..", "dist", "win-x64", "storm_ds_core.dll")
    try:
        run_smoke_test(dll_path)
    except Exception as e:
        print(f"SMOKE TEST FAILED: {e}")
        import traceback
        traceback.print_exc()
        sys.exit(1)
