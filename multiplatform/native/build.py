import os
import sys
import shutil
import subprocess

NATIVE_DIR = os.path.dirname(os.path.abspath(__file__))
CMAKE_BIN = r"C:\Users\ReiKa\AppData\Local\Android\Sdk\cmake\3.22.1\bin\cmake.exe"
NINJA_BIN = r"C:\Users\ReiKa\AppData\Local\Android\Sdk\cmake\3.22.1\bin\ninja.exe"
NDK_TOOLCHAIN = r"C:\Users\ReiKa\AppData\Local\Android\Sdk\ndk\28.0.13004108\build\cmake\android.toolchain.cmake"
VCVARS64_BAT = r"C:\Program Files\Microsoft Visual Studio\18\Insiders\VC\Auxiliary\Build\vcvars64.bat"

DIST_DIR = os.path.join(NATIVE_DIR, "dist")
MELONDS_DIR = r"f:\STORM DS\melonDS-android-lib\src"

def prepare_compat_sources():
    # DSi_NWifi_compat.cpp
    src_wifi = os.path.join(MELONDS_DIR, "DSi_NWifi.cpp")
    dst_wifi = os.path.join(NATIVE_DIR, "src", "DSi_NWifi_compat.cpp")
    with open(src_wifi, "r", encoding="utf-8", errors="ignore") as f:
        tw = f.read()
    tw_fixed = tw.replace("int nchan = 11;", "constexpr int nchan = 11;")
    with open(dst_wifi, "w", encoding="utf-8") as f:
        f.write(tw_fixed)

    # GPU2D_Soft_compat.cpp
    src_gpu = os.path.join(MELONDS_DIR, "GPU2D_Soft.cpp")
    dst_gpu = os.path.join(NATIVE_DIR, "src", "GPU2D_Soft_compat.cpp")
    with open(src_gpu, "r", encoding="utf-8", errors="ignore") as f:
        tg = f.read()
    tg_fixed = tg.replace('asm volatile ("" : : : "memory");', "/* memory barrier */")
    with open(dst_gpu, "w", encoding="utf-8") as f:
        f.write(tg_fixed)

    # GPU2D_Soft_Compatibility_compat.cpp
    src_gpu_compat = os.path.join(MELONDS_DIR, "GPU2D_Soft_Compatibility.cpp")
    dst_gpu_compat = os.path.join(NATIVE_DIR, "src", "GPU2D_Soft_Compatibility_compat.cpp")
    with open(src_gpu_compat, "r", encoding="utf-8", errors="ignore") as f:
        tgc = f.read()
    tgc_fixed = tgc.replace('asm volatile ("" : : : "memory");', "/* memory barrier */")
    with open(dst_gpu_compat, "w", encoding="utf-8") as f:
        f.write(tgc_fixed)

    # FATStorage_compat.cpp
    src_fat = os.path.join(MELONDS_DIR, "FATStorage.cpp")
    dst_fat = os.path.join(NATIVE_DIR, "src", "FATStorage_compat.cpp")
    with open(src_fat, "r", encoding="utf-8", errors="ignore") as f:
        tf = f.read()
    tf_fixed = tf.replace(".u8string()", ".string()")
    with open(dst_fat, "w", encoding="utf-8") as f:
        f.write(tf_fixed)

    # SPU_compat.cpp
    src_spu = os.path.join(MELONDS_DIR, "SPU.cpp")
    dst_spu = os.path.join(NATIVE_DIR, "src", "SPU_compat.cpp")
    with open(src_spu, "r", encoding="utf-8", errors="ignore") as f:
        tsp = f.read()
    hdr = (
        "#if defined(_MSC_VER)\n"
        "#include <malloc.h>\n"
        "#define storm_alloca _alloca\n"
        "#else\n"
        "#include <alloca.h>\n"
        "#include <stdlib.h>\n"
        "#define storm_alloca alloca\n"
        "#endif\n"
    )
    tsp_fixed = hdr + tsp.replace("s16 temp[avail * 2];", "s16* temp = (s16*)storm_alloca((avail * 2 + 1) * sizeof(s16));")
    with open(dst_spu, "w", encoding="utf-8") as f:
        f.write(tsp_fixed)

    # VulkanContext_compat.cpp
    src_vkc = os.path.join(MELONDS_DIR, "VulkanContext.cpp")
    dst_vkc = os.path.join(NATIVE_DIR, "src", "VulkanContext_compat.cpp")
    with open(src_vkc, "r", encoding="utf-8", errors="ignore") as f:
        tvc = f.read()
    tvc_fixed = tvc.replace(
        "VK_KHR_ANDROID_SURFACE_EXTENSION_NAME",
        '"VK_KHR_win32_surface"'
    )
    with open(dst_vkc, "w", encoding="utf-8") as f:
        f.write(tvc_fixed)

    print("Prepared compat sources: DSi_NWifi_compat.cpp, GPU2D_Soft_compat.cpp, GPU2D_Soft_Compatibility_compat.cpp, FATStorage_compat.cpp, SPU_compat.cpp, VulkanContext_compat.cpp")

def build_windows_x64():
    print("=== Building Windows x64 (MSVC /std:c++latest) ===")
    prepare_compat_sources()
    build_dir = os.path.join(NATIVE_DIR, "build-win-x64")
    os.makedirs(build_dir, exist_ok=True)

    cmake_args = [
        f'"{CMAKE_BIN}"',
        "-GNinja",
        f'-DCMAKE_MAKE_PROGRAM="{NINJA_BIN}"',
        "-DCMAKE_BUILD_TYPE=Release",
        f'"{NATIVE_DIR}"'
    ]
    configure_cmd = f'call "{VCVARS64_BAT}" && ' + " ".join(cmake_args)
    print("Configuring Windows x64...")
    r = subprocess.run(configure_cmd, shell=True, cwd=build_dir, capture_output=True, text=True, errors="replace", creationflags=0x00004000 if os.name == "nt" else 0)
    if r.returncode != 0:
        print("Configure failed:\n", r.stdout, "\n", r.stderr)
        return False

    build_cmd = f'call "{VCVARS64_BAT}" && "{NINJA_BIN}" -j 4'
    print("Compiling Windows x64...")
    r = subprocess.run(build_cmd, shell=True, cwd=build_dir, capture_output=True, text=True, errors="replace", creationflags=0x00004000 if os.name == "nt" else 0)
    if r.returncode != 0:
        print("Build failed:\n", r.stdout, "\n", r.stderr)
        return False

    out_dll = os.path.join(build_dir, "storm_ds_core.dll")
    if not os.path.exists(out_dll):
        print("Expected output DLL not found:", out_dll)
        return False

    target_dir = os.path.join(DIST_DIR, "win-x64")
    os.makedirs(target_dir, exist_ok=True)
    target_dll = os.path.join(target_dir, "storm_ds_core.dll")
    shutil.copy2(out_dll, target_dll)
    size = os.path.getsize(target_dll)
    print(f"Windows x64 build SUCCESS: {target_dll} ({size} bytes, {size/1024/1024:.2f} MB)")
    return True

def build_android(abi, dist_subdir):
    print(f"=== Building Android {abi} ({dist_subdir}) ===")
    prepare_compat_sources()
    build_dir = os.path.join(NATIVE_DIR, f"build-android-{abi}")
    os.makedirs(build_dir, exist_ok=True)

    cmake_args = [
        f'"{CMAKE_BIN}"',
        "-GNinja",
        f'-DCMAKE_MAKE_PROGRAM="{NINJA_BIN}"',
        f'-DCMAKE_TOOLCHAIN_FILE="{NDK_TOOLCHAIN}"',
        f"-DANDROID_ABI={abi}",
        "-DANDROID_PLATFORM=android-24",
        "-DANDROID_STL=c++_static",
        "-DCMAKE_BUILD_TYPE=Release",
        f'"{NATIVE_DIR}"'
    ]
    configure_cmd = " ".join(cmake_args)
    print(f"Configuring Android {abi}...")
    r = subprocess.run(configure_cmd, shell=True, cwd=build_dir, capture_output=True, text=True, errors="replace", creationflags=0x00004000 if os.name == "nt" else 0)
    if r.returncode != 0:
        print(f"Configure Android {abi} failed:\n", r.stdout, "\n", r.stderr)
        return False

    build_cmd = f'"{NINJA_BIN}" -j 4'
    print(f"Compiling Android {abi}...")
    r = subprocess.run(build_cmd, shell=True, cwd=build_dir, capture_output=True, text=True, errors="replace", creationflags=0x00004000 if os.name == "nt" else 0)
    if r.returncode != 0:
        print(f"Build Android {abi} failed:\n", r.stdout, "\n", r.stderr)
        return False

    out_so = os.path.join(build_dir, "libstorm_ds_core.so")
    if not os.path.exists(out_so):
        print("Expected output SO not found:", out_so)
        return False

    target_dir = os.path.join(DIST_DIR, dist_subdir)
    os.makedirs(target_dir, exist_ok=True)
    target_so = os.path.join(target_dir, "libstorm_ds_core.so")
    shutil.copy2(out_so, target_so)
    
    strip_bin = r"C:\Users\ReiKa\AppData\Local\Android\Sdk\ndk\28.0.13004108\toolchains\llvm\prebuilt\windows-x86_64\bin\llvm-strip.exe"
    if os.path.exists(strip_bin):
        subprocess.run([strip_bin, "--strip-unneeded", target_so], check=False)

    size = os.path.getsize(target_so)
    print(f"Android {abi} build SUCCESS: {target_so} ({size} bytes, {size/1024/1024:.2f} MB)")
    return True

def diagnose_android(abi="arm64-v8a"):
    cmd = f'"{NINJA_BIN}" -j 1'
    build_dir = os.path.join(NATIVE_DIR, f"build-android-{abi}")
    r = subprocess.run(cmd, shell=True, cwd=build_dir, capture_output=True, text=True, errors="replace")
    for line in r.stdout.splitlines():
        if any(k in line for k in ["FAILED:", "error:", "fatal"]):
            print(line)

def diagnose():
    cmd = f'call "{VCVARS64_BAT}" && "{NINJA_BIN}" -j 4'
    build_dir = os.path.join(NATIVE_DIR, "build-win-x64")
    r = subprocess.run(cmd, shell=True, cwd=build_dir, capture_output=True, text=True, errors="replace")
    for line in r.stdout.splitlines():
        if "error LNK" in line or "fatal error LNK" in line:
            print(line)
            print(line)
    print("STDERR:\n", r.stderr)

if __name__ == "__main__":
    success = build_windows_x64()
    sys.exit(0 if success else 1)
