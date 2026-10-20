#pragma once

// Runtime-adjustable Vulkan renderer controls shared between the melonDS core library
// (GPU3D_Vulkan.cpp) and the Android frontend (MelonInstance.cpp, VulkanOutput.cpp,
// VulkanSurfacePresenter.cpp, JNI). Header-only so both libraries see the same values
// without adding a link dependency. All values are read once per frame by the renderer.

#include <atomic>
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

inline std::atomic<int> gCompositorMode{static_cast<int>(CompositorMode::Precise)};
inline std::atomic<int> gDebugView{static_cast<int>(DebugView::None)};
inline std::atomic<bool> gThickHighResEdges{false};

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

}
