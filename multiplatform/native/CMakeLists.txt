cmake_minimum_required(VERSION 3.16)

project(storm_ds_core
    VERSION 8.9.0
    DESCRIPTION "STORM DS Cross-Platform C++26 Native Emulation Core"
    LANGUAGES C CXX)

set(CMAKE_C_STANDARD 11)
set(CMAKE_C_STANDARD_REQUIRED ON)

if (MSVC)
    set(CMAKE_CXX_STANDARD 23)
    add_compile_options("$<$<COMPILE_LANGUAGE:CXX>:/std:c++latest>")
    add_compile_definitions(
        _WIN32_WINNT=0x0601
        WIN32_LEAN_AND_MEAN
        NOMINMAX
        _CRT_SECURE_NO_WARNINGS
        _USE_MATH_DEFINES
        __WIN32__
        STORM_DS_BUILD_DLL
        VK_NO_PROTOTYPES
    )
else()
    set(CMAKE_CXX_STANDARD 20)
    add_compile_options("$<$<COMPILE_LANGUAGE:CXX>:-std=c++2c>")
    add_compile_definitions(
        STORM_DS_BUILD_DLL
        VK_NO_PROTOTYPES
    )
endif()

set(CMAKE_POSITION_INDEPENDENT_CODE ON)

set(MELONDS_CORE_DIR "${CMAKE_CURRENT_SOURCE_DIR}/../../melonDS-android-lib")

set(melonDS_HOMEPAGE_URL "https://github.com/ReiKatari/STORM-DS")
set(melonDS_VERSION "1.1")
set(MELONDS_VERSION_SUFFIX "")
configure_file("${MELONDS_CORE_DIR}/src/version.h.in" "${CMAKE_CURRENT_BINARY_DIR}/version.h")

set(TEAKRA_WARNINGS_AS_ERRORS OFF CACHE BOOL "" FORCE)
set(TEAKRA_BUILD_TOOLS OFF CACHE BOOL "" FORCE)
set(TEAKRA_BUILD_UNIT_TESTS OFF CACHE BOOL "" FORCE)
set(TEAKRA_RUN_TESTS OFF CACHE BOOL "" FORCE)
add_subdirectory("${MELONDS_CORE_DIR}/src/teakra" teakra EXCLUDE_FROM_ALL)

set(STORM_CORE_SOURCES
    # Native Bridge
    "${CMAKE_CURRENT_SOURCE_DIR}/src/storm_ds_core.cpp"
    "${CMAKE_CURRENT_SOURCE_DIR}/src/PlatformMultiplatform.cpp"
    "${CMAKE_CURRENT_SOURCE_DIR}/src/VulkanCompatProbe.cpp"
    "${CMAKE_CURRENT_SOURCE_DIR}/src/miniz/miniz.c"
    "${CMAKE_CURRENT_SOURCE_DIR}/src/miniz/miniz_tdef.c"
    "${CMAKE_CURRENT_SOURCE_DIR}/src/miniz/miniz_tinfl.c"
    "${CMAKE_CURRENT_SOURCE_DIR}/src/miniz/miniz_zip.c"

    # melonDS Core
    "${MELONDS_CORE_DIR}/src/ARCodeFile.cpp"
    "${MELONDS_CORE_DIR}/src/ARDatabaseDAT.cpp"
    "${MELONDS_CORE_DIR}/src/AREngine.cpp"
    "${MELONDS_CORE_DIR}/src/ARM.cpp"
    "${MELONDS_CORE_DIR}/src/ARMInterpreter.cpp"
    "${MELONDS_CORE_DIR}/src/ARMInterpreter_ALU.cpp"
    "${MELONDS_CORE_DIR}/src/ARMInterpreter_Branch.cpp"
    "${MELONDS_CORE_DIR}/src/ARMInterpreter_LoadStore.cpp"
    "${MELONDS_CORE_DIR}/src/CP15.cpp"
    "${MELONDS_CORE_DIR}/src/CRC32.cpp"
    "${MELONDS_CORE_DIR}/src/DMA.cpp"
    "${MELONDS_CORE_DIR}/src/DMA_Timings.cpp"
    "${MELONDS_CORE_DIR}/src/DSi.cpp"
    "${MELONDS_CORE_DIR}/src/DSi_AES.cpp"
    "${MELONDS_CORE_DIR}/src/DSi_Camera.cpp"
    "${MELONDS_CORE_DIR}/src/DSi_DSP.cpp"
    "${MELONDS_CORE_DIR}/src/DSi_I2C.cpp"
    "${MELONDS_CORE_DIR}/src/DSi_I2S.cpp"
    "${MELONDS_CORE_DIR}/src/DSi_NAND.cpp"
    "${MELONDS_CORE_DIR}/src/DSi_NDMA.cpp"
    "${CMAKE_CURRENT_SOURCE_DIR}/src/DSi_NWifi_compat.cpp"
    "${MELONDS_CORE_DIR}/src/DSi_SD.cpp"
    "${MELONDS_CORE_DIR}/src/DSi_SPI_TSC.cpp"
    "${MELONDS_CORE_DIR}/src/FATIO.cpp"
    "${CMAKE_CURRENT_SOURCE_DIR}/src/FATStorage_compat.cpp"
    "${MELONDS_CORE_DIR}/src/GBACart.cpp"
    "${MELONDS_CORE_DIR}/src/GBACartMotionPak.cpp"
    "${MELONDS_CORE_DIR}/src/GPU.cpp"
    "${MELONDS_CORE_DIR}/src/GPU2D.cpp"
    "${CMAKE_CURRENT_SOURCE_DIR}/src/GPU2D_Soft_compat.cpp"
    "${CMAKE_CURRENT_SOURCE_DIR}/src/GPU2D_Soft_Compatibility_compat.cpp"
    "${MELONDS_CORE_DIR}/src/GPU3D.cpp"
    "${MELONDS_CORE_DIR}/src/GPU3D_AcceleratedFrontend.cpp"
    "${MELONDS_CORE_DIR}/src/GPU3D_Soft.cpp"
    "${MELONDS_CORE_DIR}/src/GPU3D_Vulkan.cpp"
    "${MELONDS_CORE_DIR}/src/VulkanDispatch.cpp"
    "${MELONDS_CORE_DIR}/src/VulkanContext.cpp"
    "${MELONDS_CORE_DIR}/src/GPU3D_Texcache.cpp"
    "${MELONDS_CORE_DIR}/src/GPU3D_TexcacheVulkan.cpp"
    "${MELONDS_CORE_DIR}/src/Mic.cpp"
    "${MELONDS_CORE_DIR}/src/NDS.cpp"
    "${MELONDS_CORE_DIR}/src/NDSCart.cpp"
    "${MELONDS_CORE_DIR}/src/NDSCartR4.cpp"
    "${MELONDS_CORE_DIR}/src/ROMList.cpp"
    "${MELONDS_CORE_DIR}/src/FreeBIOS.cpp"
    "${MELONDS_CORE_DIR}/src/RTC.cpp"
    "${MELONDS_CORE_DIR}/src/Savestate.cpp"
    "${MELONDS_CORE_DIR}/src/SPI.cpp"
    "${MELONDS_CORE_DIR}/src/SPI_Firmware.cpp"
    "${CMAKE_CURRENT_SOURCE_DIR}/src/SPU_compat.cpp"
    "${MELONDS_CORE_DIR}/src/Utils.cpp"
    "${MELONDS_CORE_DIR}/src/Wifi.cpp"
    "${MELONDS_CORE_DIR}/src/WifiAP.cpp"
    "${MELONDS_CORE_DIR}/src/WMService.cpp"

    "${MELONDS_CORE_DIR}/src/DSP_HLE/UcodeBase.cpp"
    "${MELONDS_CORE_DIR}/src/DSP_HLE/AACUcode.cpp"
    "${MELONDS_CORE_DIR}/src/DSP_HLE/G711Ucode.cpp"
    "${MELONDS_CORE_DIR}/src/DSP_HLE/GraphicsUcode.cpp"

    "${MELONDS_CORE_DIR}/src/soundtouch/source/SoundTouch/AAFilter.cpp"
    "${MELONDS_CORE_DIR}/src/soundtouch/source/SoundTouch/cpu_detect_x86.cpp"
    "${MELONDS_CORE_DIR}/src/soundtouch/source/SoundTouch/FIFOSampleBuffer.cpp"
    "${MELONDS_CORE_DIR}/src/soundtouch/source/SoundTouch/FIRFilter.cpp"
    "${MELONDS_CORE_DIR}/src/soundtouch/source/SoundTouch/InterpolateCubic.cpp"
    "${MELONDS_CORE_DIR}/src/soundtouch/source/SoundTouch/InterpolateLinear.cpp"
    "${MELONDS_CORE_DIR}/src/soundtouch/source/SoundTouch/InterpolateShannon.cpp"
    "${MELONDS_CORE_DIR}/src/soundtouch/source/SoundTouch/mmx_optimized.cpp"
    "${MELONDS_CORE_DIR}/src/soundtouch/source/SoundTouch/RateTransposer.cpp"
    "${MELONDS_CORE_DIR}/src/soundtouch/source/SoundTouch/SoundTouch.cpp"
    "${MELONDS_CORE_DIR}/src/soundtouch/source/SoundTouch/sse_optimized.cpp"
    "${MELONDS_CORE_DIR}/src/soundtouch/source/SoundTouch/TDStretch.cpp"

    "${MELONDS_CORE_DIR}/src/fatfs/ff.c"
    "${MELONDS_CORE_DIR}/src/fatfs/ffsystem.c"
    "${MELONDS_CORE_DIR}/src/fatfs/ffunicode.c"

    "${MELONDS_CORE_DIR}/src/sha1/sha1.c"
    "${MELONDS_CORE_DIR}/src/tiny-AES-c/aes.c"
    "${MELONDS_CORE_DIR}/src/xxhash/xxhash.c"
    "${MELONDS_CORE_DIR}/src/blip-buf/blip_buf.c"
)

add_library(storm_ds_core SHARED ${STORM_CORE_SOURCES})

target_include_directories(storm_ds_core
    PUBLIC
        "${CMAKE_CURRENT_SOURCE_DIR}/include"
    PRIVATE
        "${CMAKE_CURRENT_SOURCE_DIR}/src"
        "${CMAKE_CURRENT_SOURCE_DIR}/src/miniz"
        "${MELONDS_CORE_DIR}/src"
        "${MELONDS_CORE_DIR}/src/soundtouch/include"
        "${MELONDS_CORE_DIR}/src/teakra/include"
        "${CMAKE_CURRENT_BINARY_DIR}"
)

target_link_libraries(storm_ds_core PRIVATE teakra)

if (MSVC)
    target_compile_options(storm_ds_core PRIVATE /FImsvc_compat.h)
endif()

if (WIN32)
    target_link_libraries(storm_ds_core PRIVATE ole32 comctl32 wsock32 ws2_32)
elseif (ANDROID)
    target_link_libraries(storm_ds_core PRIVATE log z dl)
else()
    find_package(Threads REQUIRED)
    target_link_libraries(storm_ds_core PRIVATE Threads::Threads dl z)
endif()
