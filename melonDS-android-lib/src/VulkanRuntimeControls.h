#pragma once

// Runtime-adjustable Vulkan renderer and DS hardware peripheral controls shared between
// the melonDS core library (GPU3D_Vulkan.cpp, GBACart.cpp, NDSCart.cpp) and the Android
// frontend (MelonInstance.cpp, VulkanOutput.cpp, VulkanSurfacePresenter.cpp, PlatformAndroid.cpp, JNI).
// Header-only so both libraries see the same values without adding a link dependency.

#include <algorithm>
#include <atomic>
#include <cmath>
#include <cstdint>

namespace MelonDSAndroid::VulkanRuntime
{

// Compositor used to combine the 2D engines with the high-resolution 3D image.
enum class CompositorMode : int
{
    // Deterministic compositor: 1:1 port of melonDS kCompositorFS_Nearest. Every 3D pixel
    // is taken from the 3D image of the same emulated frame at (x * scale, y * scale).
    // No temporal history, no capture heuristics. Default.
    Precise = 0,
    // Previous heuristic compositor (history3D / capture3D / class4 paths). Kept for A/B.
    Legacy = 1,
};

// In-game debug visualisation of the final composed image.
enum class DebugView : int
{
    None = 0,
    Only3D = 1,          // show only the 3D layer (transparent pixels as dark checkerboard)
    Only2D = 2,          // show only the 2D engines output (3D placeholders as magenta)
    CompositionMask = 3, // red = 3D pixel, green = 2D pixel, blue = 2D/3D blend, black = backdrop
};

// Real-time 3D depth effect mode in Vulkan presenter.
enum class Depth3DMode : int
{
    Off = 0,
    GyroParallax = 1, // Motion parallax 3D depth window driven by phone gyroscope
    Anaglyph = 2,     // Dubois stereoscopic Red/Cyan anaglyph 3D
    SideBySide = 3,   // Stereoscopic Side-by-Side 3D for XR/VR glasses (XREAL, Rokid, Viture)
};

// Authentic Nintendo DS / DSi display color calibration LUT profile.
enum class DisplayColorProfile : int
{
    Standard = 0,
    DsPhat = 1,   // Original NTR-001 transflective TFT (RGB666 warm low-contrast curve)
    DsLite = 2,   // USG-001 high-brightness backlit LCD vivid gamut
    DsiXlIps = 3, // UTL-001 wide-viewing-angle warm IPS panel calibration
};

inline std::atomic<int> gCompositorMode{static_cast<int>(CompositorMode::Precise)};
inline std::atomic<int> gDebugView{static_cast<int>(DebugView::None)};
inline std::atomic<bool> gThickHighResEdges{false};

inline std::atomic<int> gDepth3DMode{static_cast<int>(Depth3DMode::Off)};
inline std::atomic<int> gDepth3DStrength{50};
inline std::atomic<bool> gSsaoEnabled{false};
inline std::atomic<int> gDisplayColorProfile{static_cast<int>(DisplayColorProfile::Standard)};
inline std::atomic<int> gHingeGapPixels{0};
inline std::atomic<int> gGyroTiltXQuantized{0};
inline std::atomic<int> gGyroTiltYQuantized{0};

// Authentic Slot-2 & Slot-1 Hardware Peripherals state
inline std::atomic<int> gSolarSensorLuxLevel{-1};
inline std::atomic<uint32_t> gGuitarGripKeyMask{0u};
inline std::atomic<float> gMotionAccelX{0.0f};
inline std::atomic<float> gMotionAccelY{0.0f};
inline std::atomic<float> gMotionAccelZ{9.81f};
inline std::atomic<float> gMotionGyroX{0.0f};
inline std::atomic<float> gMotionGyroY{0.0f};
inline std::atomic<float> gMotionGyroZ{0.0f};
inline std::atomic<uint32_t> gIrPedometerStepCount{0u};

inline CompositorMode GetCompositorMode() noexcept
{
    const int value = gCompositorMode.load(std::memory_order_relaxed);
    return value == static_cast<int>(CompositorMode::Legacy) ? CompositorMode::Legacy : CompositorMode::Precise;
}

inline void SetCompositorMode(int mode) noexcept
{
    gCompositorMode.store(mode == static_cast<int>(CompositorMode::Legacy) ? 1 : 0, std::memory_order_relaxed);
}

inline DebugView GetDebugView() noexcept
{
    const int value = gDebugView.load(std::memory_order_relaxed);
    return (value >= 0 && value <= 3) ? static_cast<DebugView>(value) : DebugView::None;
}

inline void SetDebugView(int view) noexcept
{
    gDebugView.store((view >= 0 && view <= 3) ? view : 0, std::memory_order_relaxed);
}

inline bool GetThickHighResEdges() noexcept
{
    return gThickHighResEdges.load(std::memory_order_relaxed);
}

inline void SetThickHighResEdges(bool enabled) noexcept
{
    gThickHighResEdges.store(enabled, std::memory_order_relaxed);
}

inline Depth3DMode GetDepth3DMode() noexcept
{
    const int value = gDepth3DMode.load(std::memory_order_relaxed);
    return (value >= 0 && value <= 3) ? static_cast<Depth3DMode>(value) : Depth3DMode::Off;
}

inline void SetDepth3DMode(int mode) noexcept
{
    gDepth3DMode.store(std::clamp(mode, 0, 3), std::memory_order_relaxed);
}

inline int GetDepth3DStrength() noexcept
{
    return std::clamp(gDepth3DStrength.load(std::memory_order_relaxed), 0, 100);
}

inline void SetDepth3DStrength(int strength) noexcept
{
    gDepth3DStrength.store(std::clamp(strength, 0, 100), std::memory_order_relaxed);
}

inline bool GetSsaoEnabled() noexcept
{
    return gSsaoEnabled.load(std::memory_order_relaxed);
}

inline void SetSsaoEnabled(bool enabled) noexcept
{
    gSsaoEnabled.store(enabled, std::memory_order_relaxed);
}

inline DisplayColorProfile GetDisplayColorProfile() noexcept
{
    const int value = gDisplayColorProfile.load(std::memory_order_relaxed);
    return (value >= 0 && value <= 3) ? static_cast<DisplayColorProfile>(value) : DisplayColorProfile::Standard;
}

inline void SetDisplayColorProfile(int profile) noexcept
{
    gDisplayColorProfile.store(std::clamp(profile, 0, 3), std::memory_order_relaxed);
}

inline int GetHingeGapPixels() noexcept
{
    return std::clamp(gHingeGapPixels.load(std::memory_order_relaxed), 0, 96);
}

inline void SetHingeGapPixels(int pixels) noexcept
{
    gHingeGapPixels.store(std::clamp(pixels, 0, 96), std::memory_order_relaxed);
}

inline void SetGyroTilt(float tiltX, float tiltY) noexcept
{
    const int qx = std::clamp(static_cast<int>(std::lround(std::clamp(tiltX, -1.0f, 1.0f) * 100.0f)), -100, 100);
    const int qy = std::clamp(static_cast<int>(std::lround(std::clamp(tiltY, -1.0f, 1.0f) * 100.0f)), -100, 100);
    gGyroTiltXQuantized.store(qx, std::memory_order_relaxed);
    gGyroTiltYQuantized.store(qy, std::memory_order_relaxed);
}

inline int GetGyroTiltXQuantized() noexcept
{
    return gGyroTiltXQuantized.load(std::memory_order_relaxed);
}

inline int GetGyroTiltYQuantized() noexcept
{
    return gGyroTiltYQuantized.load(std::memory_order_relaxed);
}

inline uint32_t PackPresenterFilteringWord(uint32_t baseFiltering) noexcept
{
    const uint32_t depthMode = static_cast<uint32_t>(GetDepth3DMode()) & 0x7u;
    const uint32_t colorProfile = static_cast<uint32_t>(GetDisplayColorProfile()) & 0x7u;
    const uint32_t strength = static_cast<uint32_t>(GetDepth3DStrength()) & 0x7Fu;
    return (baseFiltering & 0xFFu)
        | (depthMode << 8u)
        | (colorProfile << 11u)
        | (strength << 14u);
}

inline uint32_t PackPresenterScreenSwapWord(uint32_t baseScreenSwap) noexcept
{
    const uint32_t qx = static_cast<uint8_t>(static_cast<int8_t>(GetGyroTiltXQuantized()));
    const uint32_t qy = static_cast<uint8_t>(static_cast<int8_t>(GetGyroTiltYQuantized()));
    return (baseScreenSwap & 1u)
        | (qx << 8u)
        | (qy << 16u);
}

inline int GetSolarSensorLuxLevel() noexcept
{
    return gSolarSensorLuxLevel.load(std::memory_order_relaxed);
}

inline void SetSolarSensorLuxLevel(int level) noexcept
{
    gSolarSensorLuxLevel.store(level < 0 ? -1 : std::clamp(level, 0, 10), std::memory_order_relaxed);
}

inline uint32_t GetGuitarGripKeyMask() noexcept
{
    return gGuitarGripKeyMask.load(std::memory_order_relaxed);
}

inline void SetGuitarGripKeyState(int fretIndex, bool pressed) noexcept
{
    if (fretIndex < 0 || fretIndex > 3)
        return;
    const uint32_t bit = 1u << static_cast<uint32_t>(fretIndex);
    if (pressed)
        gGuitarGripKeyMask.fetch_or(bit, std::memory_order_relaxed);
    else
        gGuitarGripKeyMask.fetch_and(~bit, std::memory_order_relaxed);
}

inline void SetHardwareMotionState(float ax, float ay, float az, float gx, float gy, float gz) noexcept
{
    gMotionAccelX.store(ax, std::memory_order_relaxed);
    gMotionAccelY.store(ay, std::memory_order_relaxed);
    gMotionAccelZ.store(az, std::memory_order_relaxed);
    gMotionGyroX.store(gx, std::memory_order_relaxed);
    gMotionGyroY.store(gy, std::memory_order_relaxed);
    gMotionGyroZ.store(gz, std::memory_order_relaxed);
}

inline float GetMotionQuery(int queryType) noexcept
{
    switch (queryType)
    {
        case 0: return gMotionAccelX.load(std::memory_order_relaxed);
        case 1: return gMotionAccelY.load(std::memory_order_relaxed);
        case 2: return gMotionAccelZ.load(std::memory_order_relaxed);
        case 3: return gMotionGyroX.load(std::memory_order_relaxed);
        case 4: return gMotionGyroY.load(std::memory_order_relaxed);
        case 5: return gMotionGyroZ.load(std::memory_order_relaxed);
        default: return 0.0f;
    }
}

inline uint32_t GetIrPedometerStepCount() noexcept
{
    return gIrPedometerStepCount.load(std::memory_order_relaxed);
}

inline void SetIrPedometerStepCount(uint32_t steps) noexcept
{
    gIrPedometerStepCount.store(steps, std::memory_order_relaxed);
}

inline uint32_t AddIrPedometerSteps(uint32_t delta) noexcept
{
    return gIrPedometerStepCount.fetch_add(delta, std::memory_order_relaxed) + delta;
}

}
