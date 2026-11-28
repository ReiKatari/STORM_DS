# Open-Source Cores, Libraries and Licenses - STORM DS

**STORM DS** is distributed under the terms of the **GNU General Public License v3.0 (GPL-3.0)** (see [LICENSE](LICENSE)). All source code for STORM DS and all shipped modifications is publicly available at `https://github.com/ReiKatari/STORM_DS`.

In compliance with **GPL-3.0** and **RetroAchievements Hardcore Compliance Section F (Transparency and Legality)**, below is the complete inventory of FOSS cores, native engines, shader pipelines, drivers, and libraries shipped with STORM DS:

## 1. Emulation Cores and Native Engines

| Component | Purpose | License | Upstream Repository |
| :--- | :--- | :--- | :--- |
| **melonDS** | Core Nintendo DS / DSi hardware emulation | GPL-3.0 | `https://github.com/melonDS-emu/melonDS` |
| **WatermelonDS** | Android Vulkan renderer, shaders and UI upstream | GPL-3.0 | `https://github.com/SapphireRhodonite/WatermelonDS` |
| **melonDS Android** | Original Android frontend and port architecture | GPL-3.0 | `https://github.com/melonDS-emu/melonDS-android` |
| **melonDS DS (Libretro)** | DSiWare autoloading and TLNC research reference | GPL-3.0 | `https://github.com/JesseTG/melonds-ds` |
| **FreeBIOS (DraStic)** | Open-source replacement Nintendo DS BIOS routines | GPL-2.0+ / MIT | `https://github.com/Exophase/DraStic` |
| **Dolphin ARM64 / x64 Emitters** | `ARMJIT` dynamic recompiler code emitters | GPL-2.0+ | `https://github.com/dolphin-emu/dolphin` |
| **Teakra** | Nintendo DSi DSP emulation engine | MIT | `https://github.com/wwylele/teakra` |
| **SoundTouch** | Audio tempo and pitch processing | LGPL-2.1 | `https://codeberg.org/soundtouch/soundtouch` |
| **blip_buf** | Band-limited audio synthesis | LGPL-2.1+ | `https://code.google.com/archive/p/blip-buf/` |
| **FatFs** | Generic FAT filesystem module (NAND / SD) | BSD-1-Clause (ChaN) | `https://elm-chan.org/fsw/ff/` |
| **tiny-AES-c** | Lightweight AES cryptography for DSi / Modcrypt | Unlicense | `https://github.com/kokke/tiny-AES-c` |
| **xxHash** | Fast non-cryptographic hashing | BSD-2-Clause | `https://github.com/Cyan4973/xxHash` |

## 2. RetroAchievements, Graphics, Shaders, Audio and Networking

| Component | Purpose | License | Upstream Repository |
| :--- | :--- | :--- | :--- |
| **rcheevos (`rc_client`)** | RetroAchievements runtime, triggers, leaderboards and hashing | MIT | `https://github.com/RetroAchievements/rcheevos` |
| **librashader** | RetroArch Slang shader pipeline (`Rust` C-ABI) | MPL-2.0 | `https://github.com/SnowflakePowered/librashader` |
| **Vulkan-Headers / SPIRV** | Khronos Vulkan API and shader headers | Apache-2.0 | `https://github.com/KhronosGroup/Vulkan-Headers` |
| **libadrenotools** | Custom Qualcomm Adreno / Turnip driver loading (Android) | MIT / BSD-3-Clause | `https://github.com/bylaws/libadrenotools` |
| **Google Oboe** | Low-latency Android `AAudio` / `OpenSL ES` audio | Apache-2.0 | `https://github.com/google/oboe` |
| **FAAD2** | Open-source MPEG-4 AAC audio decoder | GPL-2.0+ | `https://github.com/knik0/faad2` |
| **libslirp** | User-mode TCP/IP stack for Nintendo WFC emulation | BSD-3-Clause | `https://gitlab.freedesktop.org/slirp/libslirp` |
| **ENet** | Reliable UDP networking library for NiFi / LAN multiplayer | MIT | `https://github.com/lsalzman/enet` |
| **Zstandard (zstd)** | Fast lossless compression | BSD-3-Clause | `https://github.com/facebook/zstd` |
| **miniz** | Lightweight deflate / ZIP compression (`Windows` native) | MIT | `https://github.com/richgel999/miniz` |

## 3. UI Frameworks, Archives, Fonts and Supporting Libraries

| Component | Purpose | License | Upstream Repository |
| :--- | :--- | :--- | :--- |
| **AndroidX, Jetpack Compose & Material 3** | Android UI framework and system compatibility | Apache-2.0 | `https://github.com/androidx/androidx` |
| **Dagger Hilt & Kotlin Coroutines / Serialization** | Dependency injection and async runtime | Apache-2.0 | `https://github.com/google/dagger` |
| **OkHttp, Retrofit & Gson** | HTTP transport and JSON parsing | Apache-2.0 | `https://github.com/square/okhttp` |
| **Coil, Picasso & Markwon** | Image loading and Markdown rendering | Apache-2.0 | `https://github.com/coil-kt/coil` |
| **Apache Commons Compress** | Archive extraction (`.zip`, `.7z`) | Apache-2.0 | `https://github.com/apache/commons-compress` |
| **junrar** | Archive extraction (`.rar`) | UnRar Freeware License (extract-only compatible) | `https://github.com/junrar/junrar` |
| **XZ for Java (Tukaani)** | XZ / LZMA stream decompression | Public Domain (0BSD) | `https://tukaani.org/xz/java.html` |
| **MasterSwitchPreference** | Preference switch widget (`masterswitch`) | Apache-2.0 | `https://github.com/stefanm2/MasterSwitchPreference` |
| **Google ML Kit** | Optional on-device OCR and offline translation (Android) | Apache-2.0 / Android SDK Terms | `https://developers.google.com/ml-kit` |
| **Avalonia UI & SkiaSharp** | Cross-platform desktop UI framework (Windows) | MIT | `https://github.com/AvaloniaUI/Avalonia` |
| **Fusion Pixel Font, Ark Pixel Font, Galmuri, Cubic 11** | Bitmap pixel fonts (`CJK` / `Cyrillic` / `Latin`) | SIL Open Font License 1.1 | `https://github.com/TakWolf/fusion-pixel-font` |
| **UsrCheat Database (`usrcheat.dat`)** | Nintendo DS Action Replay cheat reference | Community / Public | `https://github.com/DeadSkullzJr/NDS-i-Cheat-Databases` |
