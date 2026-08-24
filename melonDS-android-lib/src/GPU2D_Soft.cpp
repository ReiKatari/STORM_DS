/*
    Copyright 2016-2025 melonDS team

    This file is part of melonDS.

    melonDS is free software: you can redistribute it and/or modify it under
    the terms of the GNU General Public License as published by the Free
    Software Foundation, either version 3 of the License, or (at your option)
    any later version.

    melonDS is distributed in the hope that it will be useful, but WITHOUT ANY
    WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
    FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along
    with melonDS. If not, see http://www.gnu.org/licenses/.
*/

#include "GPU2D_Soft.h"
#include "GPU.h"
#include "GPU3D.h"
#include "NDS.h"
#include "Platform.h"
#include "VulkanPerfStats.h"

#include <algorithm>
#include <array>
#include <cstring>

namespace MelonDSAndroid
{
bool areRendererDebugToolsEnabled();
bool areRendererDebugBgObjLogsEnabled();
int getRenderer2DDebugForcedMode(melonDS::u32 unit);
bool isRenderer2DDebugBgLayerEnabled(melonDS::u32 unit, melonDS::u32 bgnum);
bool isRenderer2DDebugBgPriorityEnabled(melonDS::u32 unit, melonDS::u32 priority);
bool isRenderer2DDebugBackgroundKindEnabled(melonDS::u32 featureFlag);
bool areRenderer2DDebugObjectsEnabled(melonDS::u32 unit);
bool isRenderer2DDebugObjectPriorityEnabled(melonDS::u32 unit, melonDS::u32 priority);
bool isRenderer2DDebugObjectOrderEnabled(melonDS::u32 unit, melonDS::u32 orderBucket);
bool isRenderer2DDebugObjectFeatureEnabled(melonDS::u32 featureFlag);
bool areRenderer2DDebugControlsActive();
bool isVulkanGpu2DPerfLoggingEnabled();
}

namespace
{
struct RendererDebugSamplePoint
{
    const char* label;
    melonDS::u32 x;
    melonDS::u32 y;
};

static constexpr RendererDebugSamplePoint kRendererDebugSamplePoints[] = {
    {"seamA", 85u, 14u},
    {"goodA", 84u, 14u},
    {"seamB", 75u, 58u},
    {"goodB", 74u, 58u},
    {"seamC", 150u, 81u},
    {"goodC", 149u, 81u},
};

const RendererDebugSamplePoint* findRendererDebugSamplePoint(melonDS::u32 x, melonDS::u32 y)
{
    for (const RendererDebugSamplePoint& sample : kRendererDebugSamplePoints)
    {
        if (sample.x == x && sample.y == y)
            return &sample;
    }
    return nullptr;
}
}

namespace melonDS
{
namespace GPU2D
{
namespace
{
constexpr u32 kStructuredVulkan2DSlot3DFlag = 0x40u;
constexpr u32 kStructuredVulkan2DAbove3DFlag = 0x80u;
constexpr u32 kStructuredVulkan2DOnlyFlag = 0x80u;
constexpr u32 kStructuredVulkan2DProtectedBlackFlag = 0x20u;
constexpr u32 kStructuredVulkan2DNo3DCoverageFlag = 0x10u;
constexpr u32 kStructuredVulkan2DProtectedBlackTargetsBottomFlag = 0x000001u;
constexpr u8 kStructuredVulkan2DCarriedProtectedBlack = 0x01u;
constexpr u32 kStructuredVulkan2D3DPlaceholder = 0x20000000u;
enum class StructuredVulkan2DOverlayLineage : u8
{
    Unknown = 0u,
    Fresh = 1u,
    CarriedOnce = 2u,
    Carried2Plus = 3u,
};
constexpr u8 kStructuredVulkan2DOverlayLineageUnknown =
    static_cast<u8>(StructuredVulkan2DOverlayLineage::Unknown);
constexpr u8 kStructuredVulkan2DOverlayLineageFresh =
    static_cast<u8>(StructuredVulkan2DOverlayLineage::Fresh);
constexpr u8 kStructuredVulkan2DOverlayLineageCarried2Plus =
    static_cast<u8>(StructuredVulkan2DOverlayLineage::Carried2Plus);
PerfSampleWindow<4096> gStructuredBGObjSetupWindow;
PerfSampleWindow<4096> gStructuredBGObjBgWindow;
PerfSampleWindow<4096> gStructuredBGObjClassifyWindow;
PerfSampleWindow<4096> gStructuredBGObjCompositeWindow;

void RecordStructuredBGObjPerf(u64 setupNs, u64 bgNs, u64 classifyNs, u64 compositeNs)
{
    gStructuredBGObjSetupWindow.Add(setupNs);
    gStructuredBGObjBgWindow.Add(bgNs);
    gStructuredBGObjClassifyWindow.Add(classifyNs);
    gStructuredBGObjCompositeWindow.Add(compositeNs);

    if (!gStructuredBGObjSetupWindow.Ready()
        || !gStructuredBGObjBgWindow.Ready()
        || !gStructuredBGObjClassifyWindow.Ready()
        || !gStructuredBGObjCompositeWindow.Ready())
    {
        return;
    }

    const auto setupSummary = gStructuredBGObjSetupWindow.SummarizeAndReset();
    const auto bgSummary = gStructuredBGObjBgWindow.SummarizeAndReset();
    const auto classifySummary = gStructuredBGObjClassifyWindow.SummarizeAndReset();
    const auto compositeSummary = gStructuredBGObjCompositeWindow.SummarizeAndReset();
    Platform::Log(
        Platform::LogLevel::Warn,
        "VulkanPerf[GPU2D_BGOBJ]: line setup avg=%.3fus p95=%.3fus bg avg=%.3fus p95=%.3fus classify avg=%.3fus p95=%.3fus composite avg=%.3fus p95=%.3fus",
        PerfNsToMs(setupSummary.MeanNs) * 1000.0,
        PerfNsToMs(setupSummary.P95Ns) * 1000.0,
        PerfNsToMs(bgSummary.MeanNs) * 1000.0,
        PerfNsToMs(bgSummary.P95Ns) * 1000.0,
        PerfNsToMs(classifySummary.MeanNs) * 1000.0,
        PerfNsToMs(classifySummary.P95Ns) * 1000.0,
        PerfNsToMs(compositeSummary.MeanNs) * 1000.0,
        PerfNsToMs(compositeSummary.P95Ns) * 1000.0
    );
}

u32 StructuredVulkan2DSourceClass(u32 value)
{
    const u32 flags = value >> 24u;
    if (flags == 0u || flags == 0x20u)
        return 0u;
    if ((flags & 0xC0u) == 0x40u)
        return 0u;
    if ((flags & 0x80u) != 0u || (flags & 0x10u) != 0u)
        return 0x10u;
    return flags & 0x0Fu;
}

bool StructuredVulkan2DHas3DSlot(u32 value)
{
    const u32 flags = value >> 24u;
    return (flags & 0xC0u) == 0x40u;
}

bool StructuredVulkan2DIsReal2D(u32 value)
{
    return StructuredVulkan2DSourceClass(value) != 0u;
}

bool StructuredVulkan2DSourceIsReal2D(u32 sourceClass)
{
    return sourceClass != 0u;
}

bool StructuredVulkan2DCanPreserveCaptureOverlay(u32 value)
{
    if (value == 0u
        || value == kStructuredVulkan2D3DPlaceholder
        || StructuredVulkan2DHas3DSlot(value))
    {
        return false;
    }

    const u32 sourceClass = StructuredVulkan2DSourceClass(value);
    return StructuredVulkan2DSourceIsReal2D(sourceClass)
        || (sourceClass == 0u && (value & 0x00FFFFFFu) != 0u);
}

u8 AdvanceStructuredVulkan2DOverlayLineage(u8 lineage) noexcept
{
    switch (static_cast<StructuredVulkan2DOverlayLineage>(lineage))
    {
    case StructuredVulkan2DOverlayLineage::Fresh:
        return static_cast<u8>(StructuredVulkan2DOverlayLineage::CarriedOnce);
    case StructuredVulkan2DOverlayLineage::CarriedOnce:
    case StructuredVulkan2DOverlayLineage::Carried2Plus:
        return kStructuredVulkan2DOverlayLineageCarried2Plus;
    case StructuredVulkan2DOverlayLineage::Unknown:
    default:
        return kStructuredVulkan2DOverlayLineageUnknown;
    }
}

bool StructuredVulkan2DHasPreservableCaptureOverlay(
    u32 plane0,
    u32 plane1,
    u32 control) noexcept
{
    const u32 controlAlpha = control >> 24u;
    const bool structuredSlot =
        (controlAlpha & kStructuredVulkan2DSlot3DFlag) != 0u;
    if (structuredSlot)
    {
        return (controlAlpha & kStructuredVulkan2DAbove3DFlag) != 0u
            && StructuredVulkan2DCanPreserveCaptureOverlay(plane1);
    }

    return (controlAlpha & kStructuredVulkan2DOnlyFlag) != 0u
        && StructuredVulkan2DCanPreserveCaptureOverlay(plane0);
}

bool StructuredVulkan2DCanUseCaptureMatched3DOverlay(u32 value)
{
    return value != 0u
        && value != kStructuredVulkan2D3DPlaceholder
        && StructuredVulkan2DHas3DSlot(value)
        && (value & 0x00FFFFFFu) != 0u;
}

u32 StructuredVulkan2DControlRgbWithProtectedBlackTarget(u32 controlRgb, bool protectedBlack, bool targetTop)
{
    if (!protectedBlack)
        return controlRgb;

    return targetTop
        ? (controlRgb & ~kStructuredVulkan2DProtectedBlackTargetsBottomFlag)
        : (controlRgb | kStructuredVulkan2DProtectedBlackTargetsBottomFlag);
}

bool StructuredVulkan2DIsOpaqueBlack(u32 value)
{
    return value != 0u
        && (value >> 24u) != 0x40u
        && (value & 0x00FFFFFFu) == 0u;
}

bool StructuredVulkan2DIsUnblendedProtectedBlackTargetBottom(u32 pixel, u32 control)
{
    return ((control >> 24u) & kStructuredVulkan2DProtectedBlackFlag) != 0u
        && StructuredVulkan2DIsOpaqueBlack(pixel)
        && (control & 0x00FFFFFEu) == 0u
        && (control & kStructuredVulkan2DProtectedBlackTargetsBottomFlag) != 0u;
}

inline __attribute__((always_inline)) bool StructuredVulkan2DMergePixelResolvesToStructured(
    u32 packedPlane0,
    u32 packedPlane1,
    u32 packedControl,
    u32 structuredPlane0,
    u32 structuredPlane1,
    u32 structuredControl) noexcept
{
    const auto useful = [](u32 value) {
        return value != 0u && value != kStructuredVulkan2D3DPlaceholder;
    };
    const auto planeHas3DSlot = [](u32 value) {
        return ((value >> 24u) & 0xC0u) == kStructuredVulkan2DSlot3DFlag;
    };
    const auto controlHas3DSlot = [](u32 value) {
        return ((value >> 24u) & kStructuredVulkan2DSlot3DFlag) != 0u;
    };

    const bool packedNeeds3DSlot =
        planeHas3DSlot(packedPlane0)
        || planeHas3DSlot(packedPlane1)
        || controlHas3DSlot(packedControl);
    const bool packedCurrent2DOnly =
        (useful(packedPlane0) || useful(packedPlane1))
        && !packedNeeds3DSlot;
    const bool structuredRenderable =
        useful(structuredPlane0) || useful(structuredPlane1);
    const bool structuredHas3DSlot =
        planeHas3DSlot(structuredPlane0)
        || planeHas3DSlot(structuredPlane1)
        || controlHas3DSlot(structuredControl);
    const u32 structuredControlAlpha = structuredControl >> 24u;
    const bool structuredHasAbove =
        (structuredControlAlpha & (kStructuredVulkan2DSlot3DFlag | kStructuredVulkan2DAbove3DFlag))
            == (kStructuredVulkan2DSlot3DFlag | kStructuredVulkan2DAbove3DFlag)
        && structuredPlane1 != 0u;

    return (structuredRenderable || (packedNeeds3DSlot && structuredHas3DSlot))
        && !(structuredHas3DSlot && !structuredHasAbove && packedCurrent2DOnly);
}

constexpr u32 kRenderer2DDebugFeatureStaticBackground = 1u << 0u;
constexpr u32 kRenderer2DDebugFeatureAffineBackground = 1u << 1u;
constexpr u32 kRenderer2DDebugFeatureAffineExtendedTiledBackground = 1u << 2u;
constexpr u32 kRenderer2DDebugFeatureAffineExtendedBitmap256Background = 1u << 3u;
constexpr u32 kRenderer2DDebugFeatureAffineExtendedDirectColorBackground = 1u << 4u;
constexpr u32 kRenderer2DDebugFeatureLargeScreenBackground = 1u << 5u;
constexpr u32 kRenderer2DDebugFeature3DBackground = 1u << 6u;
constexpr u32 kRenderer2DDebugFeatureRegularObject = 1u << 8u;
constexpr u32 kRenderer2DDebugFeatureAffineObject = 1u << 9u;
constexpr u32 kRenderer2DDebugFeatureTiled4BppObject = 1u << 10u;
constexpr u32 kRenderer2DDebugFeatureTiled8BppObject = 1u << 11u;
constexpr u32 kRenderer2DDebugFeatureBitmapObject = 1u << 12u;
constexpr u32 kRenderer2DDebugFeatureBlendedObject = 1u << 13u;
constexpr u32 kRenderer2DDebugFeatureWindowObject = 1u << 14u;
constexpr u32 kRenderer2DDebugFeatureMosaicObject = 1u << 15u;
constexpr u32 kRenderer2DDebugFeatureObjectUpperBand = 1u << 16u;
constexpr u32 kRenderer2DDebugFeatureObjectMiddleBand = 1u << 17u;
constexpr u32 kRenderer2DDebugFeatureObjectLowerBand = 1u << 18u;

bool Renderer2DDebugShouldDrawLayer(u32 unit, u32 bgnum)
{
    return MelonDSAndroid::isRenderer2DDebugBgLayerEnabled(unit, bgnum);
}

bool Renderer2DDebugShouldDrawFeature(u32 featureFlag)
{
    return MelonDSAndroid::isRenderer2DDebugBackgroundKindEnabled(featureFlag);
}

bool Renderer2DDebugShouldDrawTextBg(u32 unit, u32 bgnum, u16 bgcnt)
{
    return Renderer2DDebugShouldDrawLayer(unit, bgnum)
        && MelonDSAndroid::isRenderer2DDebugBgPriorityEnabled(unit, bgcnt & 0x3u)
        && Renderer2DDebugShouldDrawFeature(kRenderer2DDebugFeatureStaticBackground);
}

bool Renderer2DDebugShouldDrawAffineBg(u32 unit, u32 bgnum, u16 bgcnt)
{
    return Renderer2DDebugShouldDrawLayer(unit, bgnum)
        && MelonDSAndroid::isRenderer2DDebugBgPriorityEnabled(unit, bgcnt & 0x3u)
        && Renderer2DDebugShouldDrawFeature(kRenderer2DDebugFeatureAffineBackground);
}

bool Renderer2DDebugShouldDrawExtendedBg(u32 unit, u32 bgnum, u16 bgcnt)
{
    if (!Renderer2DDebugShouldDrawLayer(unit, bgnum))
        return false;
    if (!MelonDSAndroid::isRenderer2DDebugBgPriorityEnabled(unit, bgcnt & 0x3u))
        return false;

    if ((bgcnt & 0x0080u) == 0u)
        return Renderer2DDebugShouldDrawFeature(kRenderer2DDebugFeatureAffineExtendedTiledBackground);

    if ((bgcnt & 0x0004u) != 0u)
        return Renderer2DDebugShouldDrawFeature(kRenderer2DDebugFeatureAffineExtendedDirectColorBackground);

    return Renderer2DDebugShouldDrawFeature(kRenderer2DDebugFeatureAffineExtendedBitmap256Background);
}

bool Renderer2DDebugShouldDrawLargeBg(u32 unit, u16 bgcnt)
{
    return Renderer2DDebugShouldDrawLayer(unit, 2)
        && MelonDSAndroid::isRenderer2DDebugBgPriorityEnabled(unit, bgcnt & 0x3u)
        && Renderer2DDebugShouldDrawFeature(kRenderer2DDebugFeatureLargeScreenBackground);
}

bool Renderer2DDebugShouldDraw3DBg(u32 unit, u16 bgcnt)
{
    return Renderer2DDebugShouldDrawLayer(unit, 0)
        && MelonDSAndroid::isRenderer2DDebugBgPriorityEnabled(unit, bgcnt & 0x3u)
        && Renderer2DDebugShouldDrawFeature(kRenderer2DDebugFeature3DBackground);
}

bool Renderer2DDebugShouldInterleaveObjects(u32 unit, u32 priority)
{
    return MelonDSAndroid::areRenderer2DDebugObjectsEnabled(unit)
        && MelonDSAndroid::isRenderer2DDebugObjectPriorityEnabled(unit, priority);
}

bool Renderer2DDebugShouldDrawObjectLine(u32 line)
{
    if (line < 64u)
        return MelonDSAndroid::isRenderer2DDebugObjectFeatureEnabled(kRenderer2DDebugFeatureObjectUpperBand);
    if (line < 128u)
        return MelonDSAndroid::isRenderer2DDebugObjectFeatureEnabled(kRenderer2DDebugFeatureObjectMiddleBand);
    return MelonDSAndroid::isRenderer2DDebugObjectFeatureEnabled(kRenderer2DDebugFeatureObjectLowerBand);
}

bool Renderer2DDebugShouldDrawObject(u32 unit, u32 sprnum, const u16* attrib)
{
    if (!MelonDSAndroid::areRenderer2DDebugObjectsEnabled(unit))
        return false;

    if (!MelonDSAndroid::isRenderer2DDebugObjectOrderEnabled(unit, sprnum / 32u))
        return false;

    const u32 priority = (attrib[2] >> 10u) & 0x3u;
    if (!MelonDSAndroid::isRenderer2DDebugObjectPriorityEnabled(unit, priority))
        return false;

    const u32 objectMode = (attrib[0] >> 10u) & 0x3u;
    if (objectMode == 2u)
        return MelonDSAndroid::isRenderer2DDebugObjectFeatureEnabled(kRenderer2DDebugFeatureWindowObject);

    if ((attrib[0] & 0x0100u) != 0u)
    {
        if (!MelonDSAndroid::isRenderer2DDebugObjectFeatureEnabled(kRenderer2DDebugFeatureAffineObject))
            return false;
    }
    else if (!MelonDSAndroid::isRenderer2DDebugObjectFeatureEnabled(kRenderer2DDebugFeatureRegularObject))
    {
        return false;
    }

    if ((attrib[0] & 0x1000u) != 0u
        && !MelonDSAndroid::isRenderer2DDebugObjectFeatureEnabled(kRenderer2DDebugFeatureMosaicObject))
    {
        return false;
    }

    if (objectMode == 1u
        && !MelonDSAndroid::isRenderer2DDebugObjectFeatureEnabled(kRenderer2DDebugFeatureBlendedObject))
    {
        return false;
    }

    if (objectMode == 3u)
        return MelonDSAndroid::isRenderer2DDebugObjectFeatureEnabled(kRenderer2DDebugFeatureBitmapObject);

    const u32 tiledFeature = (attrib[0] & 0x2000u) != 0u
        ? kRenderer2DDebugFeatureTiled8BppObject
        : kRenderer2DDebugFeatureTiled4BppObject;
    return MelonDSAndroid::isRenderer2DDebugObjectFeatureEnabled(tiledFeature);
}
}

class SoftRenderer::IVulkan2DPipelineStrategy
{
public:
    explicit IVulkan2DPipelineStrategy(SoftRenderer& renderer) noexcept
        : Renderer(renderer)
    {
    }

    virtual ~IVulkan2DPipelineStrategy() = default;

    virtual void DrawScanline(u32 line, Unit* unit) = 0;
    virtual void DrawSprites(u32 line, Unit* unit) = 0;
    virtual void VBlankEnd(Unit* unitA, Unit* unitB) = 0;
    [[nodiscard]] virtual bool UsesHistoricalVramDisplayCopy() const noexcept = 0;

protected:
    SoftRenderer& Renderer;
};

class SoftRenderer::FastPathVulkan2DPipelineStrategy final
    : public SoftRenderer::IVulkan2DPipelineStrategy
{
public:
    using IVulkan2DPipelineStrategy::IVulkan2DPipelineStrategy;

    void DrawScanline(u32 line, Unit* unit) override
    {
        Renderer.DrawScanlineActivePipeline(line, unit);
    }

    void DrawSprites(u32 line, Unit* unit) override
    {
        Renderer.DrawSpritesActivePipeline(line, unit);
    }

    void VBlankEnd(Unit* unitA, Unit* unitB) override
    {
        Renderer.VBlankEndActivePipeline(unitA, unitB);
    }

    [[nodiscard]] bool UsesHistoricalVramDisplayCopy() const noexcept override
    {
        return false;
    }
};

class SoftRenderer::CompatibilityVulkan2DPipelineStrategy final
    : public SoftRenderer::IVulkan2DPipelineStrategy
{
public:
    using IVulkan2DPipelineStrategy::IVulkan2DPipelineStrategy;

    void DrawScanline(u32 line, Unit* unit) override
    {
        Renderer.DrawScanlineActivePipeline(line, unit);
    }

    void DrawSprites(u32 line, Unit* unit) override
    {
        Renderer.DrawSpritesActivePipeline(line, unit);
    }

    void VBlankEnd(Unit* unitA, Unit* unitB) override
    {
        Renderer.VBlankEndActivePipeline(unitA, unitB);
    }

    [[nodiscard]] bool UsesHistoricalVramDisplayCopy() const noexcept override
    {
        return true;
    }
};

SoftRenderer::SoftRenderer(melonDS::GPU& gpu)
    : Renderer2D()
    , GPU(gpu)
    , CompatibilityVulkan2DPipelineStrategyInstance(
        std::make_unique<CompatibilityVulkan2DPipelineStrategy>(*this))
    , FastPathVulkan2DPipelineStrategyInstance(
        std::make_unique<FastPathVulkan2DPipelineStrategy>(*this))
{
    // mosaic table is initialized at compile-time
}

SoftRenderer::~SoftRenderer() = default;

SoftRenderer::IVulkan2DPipelineStrategy&
SoftRenderer::activeVulkan2DPipelineStrategy() noexcept
{
    const VulkanPipelineProfile profile =
        GPU.GPU3D.GetCurrentRenderer().GetVulkanPipelineProfile();
    return UsesVulkanFastPath(profile)
        ? *FastPathVulkan2DPipelineStrategyInstance
        : *CompatibilityVulkan2DPipelineStrategyInstance;
}

void SoftRenderer::DrawScanline(u32 line, Unit* unit)
{
    activeVulkan2DPipelineStrategy().DrawScanline(line, unit);
}

void SoftRenderer::DrawSprites(u32 line, Unit* unit)
{
    activeVulkan2DPipelineStrategy().DrawSprites(line, unit);
}

void SoftRenderer::VBlankEnd(Unit* unitA, Unit* unitB)
{
    activeVulkan2DPipelineStrategy().VBlankEnd(unitA, unitB);
}

u32 SoftRenderer::ColorComposite(int i, u32 val1, u32 val2) const
{
    u32 coloreffect = 0;
    u32 eva, evb;

    u32 flag1 = val1 >> 24;
    u32 flag2 = val2 >> 24;

    u32 blendCnt = CurUnit->BlendCnt;

    u32 target2;
    if      (flag2 & 0x80) target2 = 0x1000;
    else if (flag2 & 0x40) target2 = 0x0100;
    else                   target2 = flag2 << 8;

    if ((flag1 & 0x80) && (blendCnt & target2))
    {
        // sprite blending

        coloreffect = 1;

        if (flag1 & 0x40)
        {
            eva = flag1 & 0x1F;
            evb = 16 - eva;
        }
        else
        {
            eva = CurUnit->EVA;
            evb = CurUnit->EVB;
        }
    }
    else if ((flag1 & 0x40) && (blendCnt & target2))
    {
        // 3D layer blending

        coloreffect = 4;
    }
    else
    {
        if      (flag1 & 0x80) flag1 = 0x10;
        else if (flag1 & 0x40) flag1 = 0x01;

        if ((blendCnt & flag1) && (WindowMask[i] & 0x20))
        {
            coloreffect = (blendCnt >> 6) & 0x3;

            if (coloreffect == 1)
            {
                if (blendCnt & target2)
                {
                    eva = CurUnit->EVA;
                    evb = CurUnit->EVB;
                }
                else
                    coloreffect = 0;
            }
        }
    }

    switch (coloreffect)
    {
    case 0: return val1;
    case 1: return ColorBlend4(val1, val2, eva, evb);
    case 2: return ColorBrightnessUp(val1, CurUnit->EVY, 0x8);
    case 3: return ColorBrightnessDown(val1, CurUnit->EVY, 0x7);
    case 4: return ColorBlend5(val1, val2);
    }

    return val1;
}

const u32* SoftRenderer::GetStructuredVulkan2DPlane(bool topScreen, u32 plane) const noexcept
{
    if (!UseStructuredVulkan2D() || plane >= kStructuredPlaneCount)
        return nullptr;

    const size_t screenIndex = topScreen ? 0u : 1u;
    const size_t offset =
        ((screenIndex * kStructuredPlaneCount) + static_cast<size_t>(plane)) * kStructuredPixelCount;
    return StructuredVulkan2DPlanesStorage.data()
        + (static_cast<size_t>(StructuredVulkan2DReadBufferIndex) * kStructuredPlaneBufferWords)
        + offset;
}

const u8* SoftRenderer::GetStructuredVulkan2DLinePayloadMask(bool topScreen) const noexcept
{
    if (!UseStructuredVulkan2D())
        return nullptr;

    const size_t screenIndex = topScreen ? 0u : 1u;
    return StructuredVulkan2DLineHasPayloadStorage.data()
        + (static_cast<size_t>(StructuredVulkan2DReadBufferIndex) * kStructuredLineMaskBytes)
        + (screenIndex * kStructuredScreenHeight);
}

const u8* SoftRenderer::GetStructuredVulkan2DLine3DSlotMask(bool topScreen) const noexcept
{
    if (!UseStructuredVulkan2D())
        return nullptr;

    const size_t screenIndex = topScreen ? 0u : 1u;
    return StructuredVulkan2DLineHas3DSlotStorage.data()
        + (static_cast<size_t>(StructuredVulkan2DReadBufferIndex) * kStructuredLineMaskBytes)
        + (screenIndex * kStructuredScreenHeight);
}

const u8* SoftRenderer::GetStructuredVulkan2DLinePure3DMask(bool topScreen) const noexcept
{
    if (!UseStructuredVulkan2D())
        return nullptr;

    const size_t screenIndex = topScreen ? 0u : 1u;
    return StructuredVulkan2DLinePure3DStorage.data()
        + (static_cast<size_t>(StructuredVulkan2DReadBufferIndex) * kStructuredLineMaskBytes)
        + (screenIndex * kStructuredScreenHeight);
}

const u8* SoftRenderer::GetStructuredVulkan2DLineKnownExactMask(bool topScreen) const noexcept
{
    if (!UseStructuredVulkan2D())
        return nullptr;

    const size_t screenIndex = topScreen ? 0u : 1u;
    return StructuredVulkan2DLineKnownExactStorage.data()
        + (static_cast<size_t>(StructuredVulkan2DReadBufferIndex) * kStructuredLineMaskBytes)
        + (screenIndex * kStructuredScreenHeight);
}

const SoftRenderer::StructuredVulkan2DObjCaptureLineIdentity*
SoftRenderer::GetStructuredVulkan2DObjCaptureIdentityLines(bool topScreen) const noexcept
{
    if (!UseStructuredVulkan2D())
        return nullptr;

    const size_t screenIndex = topScreen ? 0u : 1u;
    return StructuredVulkan2DObjCaptureIdentityStorage.data()
        + (static_cast<size_t>(StructuredVulkan2DReadBufferIndex) * kStructuredLineMaskBytes)
        + (screenIndex * kStructuredScreenHeight);
}

const SoftRenderer::StructuredVulkan2DDisplayedCaptureLineIdentity*
SoftRenderer::GetStructuredVulkan2DDisplayedCaptureIdentityLines(bool topScreen) const noexcept
{
    if (!UseStructuredVulkan2D())
        return nullptr;

    const size_t screenIndex = topScreen ? 0u : 1u;
    return StructuredVulkan2DDisplayedCaptureIdentityStorage.data()
        + (static_cast<size_t>(StructuredVulkan2DReadBufferIndex) * kStructuredLineMaskBytes)
        + (screenIndex * kStructuredScreenHeight);
}

SoftRenderer::StructuredVulkan2DCaptureBankIdentity
SoftRenderer::GetStructuredVulkan2DCaptureBankIdentity(u32 vramBank) const noexcept
{
    StructuredVulkan2DCaptureBankIdentity result{};
    if (!UseStructuredVulkan2D() || vramBank >= 4u)
        return result;

    result.VramBank = static_cast<u8>(vramBank);
    bool hasFirstIdentity = false;
    bool conflictingIdentity = false;
    const size_t bankLineBase =
        static_cast<size_t>(vramBank) * kStructuredScreenHeight;
    for (size_t line = 0; line < kStructuredScreenHeight; line++)
    {
        const size_t lineIndex = bankLineBase + line;
        if (StructuredVulkan2DCaptureLineValid[lineIndex] != 0u)
            result.ValidLines++;

        switch (StructuredVulkan2DCaptureWriterRoute[lineIndex])
        {
        case StructuredCaptureWriterRoute::Fast:
            result.FastLines++;
            break;
        case StructuredCaptureWriterRoute::General:
            result.GeneralLines++;
            break;
        default:
            result.UnknownLines++;
            break;
        }

        const StructuredCaptureLineIdentity& lineIdentity =
            StructuredVulkan2DCaptureLineIdentity[lineIndex];
        if (lineIdentity.State == StructuredCaptureIdentityState::Conflict)
        {
            result.ConflictLines++;
            conflictingIdentity = true;
            continue;
        }
        if (lineIdentity.State != StructuredCaptureIdentityState::Uniform
            || !lineIdentity.Source.Valid)
        {
            continue;
        }

        result.UniformLines++;
        if (!hasFirstIdentity)
        {
            result.Source = lineIdentity.Source;
            hasFirstIdentity = true;
            continue;
        }
        if (result.Source.Sequence != lineIdentity.Source.Sequence
            || result.Source.PolygonCount != lineIdentity.Source.PolygonCount
            || result.Source.CaptureCnt != lineIdentity.Source.CaptureCnt
            || result.Source.ScreenSwap != lineIdentity.Source.ScreenSwap)
        {
            conflictingIdentity = true;
            result.ConflictLines++;
        }
    }

    const u16* const vramPixels =
        reinterpret_cast<const u16*>(GPU.VRAM[vramBank]);
    const size_t packedShadowBase =
        static_cast<size_t>(vramBank) * kStructuredPixelCount;
    if (vramPixels != nullptr)
    {
        for (size_t index = 0; index < kStructuredPixelCount; index++)
        {
            if (StructuredVulkan2DCapturePackedShadow[packedShadowBase + index]
                == vramPixels[index])
            {
                result.ShadowMatchedPixels++;
            }
        }
    }
    result.ShadowExact = result.ShadowMatchedPixels == kStructuredPixelCount;

    result.Valid =
        hasFirstIdentity
        && !conflictingIdentity
        && result.ValidLines == kStructuredScreenHeight
        && result.UniformLines == kStructuredScreenHeight
        && result.ShadowExact;
    if (!result.Valid)
        result.Source = {};
    return result;
}

bool SoftRenderer::GetSameBankMode2DisplayedCaptureIdentity(
    u32& outVramBank,
    CaptureSourceIdentity& outIdentity) const noexcept
{
    outVramBank = SameBankMode2DisplayedVramBank;
    outIdentity = SameBankMode2DisplayedIdentity;
    return SameBankMode2DisplayedIdentityValid
        && outVramBank < SameBankMode2WriterIdentity.size()
        && outIdentity.Valid;
}

bool SoftRenderer::GetSameBankMode2CompletedWriterIdentity(
    u32& outVramBank,
    CaptureSourceIdentity& outIdentity) const noexcept
{
    outVramBank = SameBankMode2CompletedWriterVramBank;
    outIdentity = SameBankMode2CompletedWriterIdentity;
    return SameBankMode2CompletedWriterIdentityValid
        && outVramBank < SameBankMode2WriterIdentity.size()
        && outIdentity.Valid;
}

void SoftRenderer::BeginStructuredVulkan2DFrame() noexcept
{
    SameBankMode2DisplayedIdentity = {};
    SameBankMode2DisplayedVramBank = 4u;
    SameBankMode2DisplayedIdentityValid = false;
    SameBankMode2CompletedWriterIdentity = {};
    SameBankMode2CompletedWriterVramBank = 4u;
    SameBankMode2CompletedWriterIdentityValid = false;
    std::fill_n(StructuredVulkan2DLineKnownExact, kStructuredLineMaskBytes, 0u);
    std::fill_n(
        StructuredVulkan2DObjCaptureIdentity,
        kStructuredLineMaskBytes,
        StructuredVulkan2DObjCaptureLineIdentity{});
    std::fill_n(
        StructuredVulkan2DDisplayedCaptureIdentity,
        kStructuredLineMaskBytes,
        StructuredVulkan2DDisplayedCaptureLineIdentity{});
}

void SoftRenderer::SwapStructuredVulkan2DBuffers() noexcept
{
    StructuredVulkan2DReadBufferIndex = StructuredVulkan2DWriteBufferIndex;
    StructuredVulkan2DWriteBufferIndex ^= 1u;
    const size_t writePlaneBase =
        static_cast<size_t>(StructuredVulkan2DWriteBufferIndex) * kStructuredPlaneBufferWords;
    const size_t writeMaskBase =
        static_cast<size_t>(StructuredVulkan2DWriteBufferIndex) * kStructuredLineMaskBytes;
    StructuredVulkan2DPlanes = StructuredVulkan2DPlanesStorage.data() + writePlaneBase;
    StructuredVulkan2DLineHasPayload = StructuredVulkan2DLineHasPayloadStorage.data() + writeMaskBase;
    StructuredVulkan2DLineHas3DSlot = StructuredVulkan2DLineHas3DSlotStorage.data() + writeMaskBase;
    StructuredVulkan2DLinePure3D = StructuredVulkan2DLinePure3DStorage.data() + writeMaskBase;
    StructuredVulkan2DLineKnownExact = StructuredVulkan2DLineKnownExactStorage.data() + writeMaskBase;
    StructuredVulkan2DObjCaptureIdentity =
        StructuredVulkan2DObjCaptureIdentityStorage.data() + writeMaskBase;
    StructuredVulkan2DDisplayedCaptureIdentity =
        StructuredVulkan2DDisplayedCaptureIdentityStorage.data() + writeMaskBase;
    std::fill_n(StructuredVulkan2DLineKnownExact, kStructuredLineMaskBytes, 0u);
    std::fill_n(
        StructuredVulkan2DObjCaptureIdentity,
        kStructuredLineMaskBytes,
        StructuredVulkan2DObjCaptureLineIdentity{});
    std::fill_n(
        StructuredVulkan2DDisplayedCaptureIdentity,
        kStructuredLineMaskBytes,
        StructuredVulkan2DDisplayedCaptureLineIdentity{});
}

void SoftRenderer::ClearStructuredVulkan2DState() noexcept
{
    LastDebugCaptureStats = {};
    HasLastDebugCapture3dSource = false;
    std::fill_n(LastDebugCapture3dSource, kStructuredPixelCount, 0u);
    CaptureLineUses3d.fill(0);
    SameBankMode2WriterIdentity.fill({});
    SameBankMode2WriterIdentityValid.fill(false);
    SameBankMode2DisplayedIdentity = {};
    SameBankMode2DisplayedVramBank = 4u;
    SameBankMode2DisplayedIdentityValid = false;
    SameBankMode2CompletedWriterIdentity = {};
    SameBankMode2CompletedWriterVramBank = 4u;
    SameBankMode2CompletedWriterIdentityValid = false;
    SameBankMode2PendingWriterIdentity = {};
    SameBankMode2PendingWriterLines = 0u;
    SameBankMode2PendingWriterConflict = false;
    StructuredVulkan2DCaptureSourceLine.fill(0);
    StructuredVulkan2DCaptureSourceLineValid = false;
    StructuredVulkan2DCaptureSourceLineY = 0;
    StructuredVulkan2DPlanesStorage.fill(0);
    StructuredVulkan2DLineHasPayloadStorage.fill(0);
    StructuredVulkan2DLineHas3DSlotStorage.fill(0);
    StructuredVulkan2DLinePure3DStorage.fill(0);
    StructuredVulkan2DLineKnownExactStorage.fill(0);
    StructuredVulkan2DObjCaptureIdentityStorage.fill({});
    StructuredVulkan2DDisplayedCaptureIdentityStorage.fill({});
    StructuredVulkan2DWriteBufferIndex = 0;
    StructuredVulkan2DReadBufferIndex = 0;
    StructuredVulkan2DPlanes = StructuredVulkan2DPlanesStorage.data();
    StructuredVulkan2DLineHasPayload = StructuredVulkan2DLineHasPayloadStorage.data();
    StructuredVulkan2DLineHas3DSlot = StructuredVulkan2DLineHas3DSlotStorage.data();
    StructuredVulkan2DLinePure3D = StructuredVulkan2DLinePure3DStorage.data();
    StructuredVulkan2DLineKnownExact = StructuredVulkan2DLineKnownExactStorage.data();
    StructuredVulkan2DObjCaptureIdentity = StructuredVulkan2DObjCaptureIdentityStorage.data();
    StructuredVulkan2DDisplayedCaptureIdentity =
        StructuredVulkan2DDisplayedCaptureIdentityStorage.data();
    OBJLineCaptureIdentity.fill({});
    OBJLineCaptureIdentityAvailable.fill(false);
    ComposedObjCaptureIdentity.fill({});
    TrackSpriteObjCaptureIdentity = false;
    TrackComposedObjCaptureIdentity = false;
    CurrentSpriteRenderLine = kStructuredScreenHeight;
    StructuredVulkan2DCurrentLineY = kStructuredScreenHeight;
    StructuredVulkan2DCapturePlanes.fill(0);
    StructuredVulkan2DCaptureOverlayLineage.fill(
        kStructuredVulkan2DOverlayLineageUnknown);
    StructuredVulkan2DCaptureLineValid.fill(0);
    StructuredVulkan2DCaptureLineHasPayload.fill(0);
    StructuredVulkan2DCaptureLineHas3DSlot.fill(0);
    StructuredVulkan2DCapturePackedShadow.fill(0);
    StructuredVulkan2DCaptureLineIdentity.fill({});
    StructuredVulkan2DCaptureWriterRoute.fill(StructuredCaptureWriterRoute::Unknown);
}

bool SoftRenderer::UseStructuredVulkan2D() const noexcept
{
    return GPU.GPU3D.GetCurrentRenderer().UsesStructured2DMetadata();
}

void SoftRenderer::ClearStructuredVulkan2DObjCaptureLineIdentity(u32 line) noexcept
{
    if (!UseStructuredVulkan2D() || line >= kStructuredScreenHeight)
        return;

    const size_t screenIndex = StructuredVulkan2DCurrentLineTargetsTop ? 0u : 1u;
    StructuredVulkan2DObjCaptureIdentity[
        (screenIndex * kStructuredScreenHeight) + static_cast<size_t>(line)] = {};
}

void SoftRenderer::ClearStructuredVulkan2DDisplayedCaptureLineIdentity(u32 line) noexcept
{
    if (!UseStructuredVulkan2D() || line >= kStructuredScreenHeight)
        return;

    const size_t screenIndex = StructuredVulkan2DCurrentLineTargetsTop ? 0u : 1u;
    StructuredVulkan2DDisplayedCaptureIdentity[
        (screenIndex * kStructuredScreenHeight) + static_cast<size_t>(line)] = {};
}

void SoftRenderer::ObserveStructuredVulkan2DObjCaptureIdentity(
    const ObjCaptureIdentityTag& identity) noexcept
{
    if (!UseStructuredVulkan2D()
        || !identity.Source.Valid
        || StructuredVulkan2DCurrentLineY >= kStructuredScreenHeight)
    {
        return;
    }

    const size_t screenIndex = StructuredVulkan2DCurrentLineTargetsTop ? 0u : 1u;
    StructuredVulkan2DObjCaptureLineIdentity& lineIdentity =
        StructuredVulkan2DObjCaptureIdentity[
            (screenIndex * kStructuredScreenHeight)
            + static_cast<size_t>(StructuredVulkan2DCurrentLineY)];
    if (lineIdentity.State == StructuredCaptureIdentityState::Unknown)
    {
        lineIdentity.Source = identity.Source;
        lineIdentity.ConsumedPixels = 1u;
        lineIdentity.DirectXYPixels = identity.DirectXY ? 1u : 0u;
        lineIdentity.State = StructuredCaptureIdentityState::Uniform;
        return;
    }

    if (lineIdentity.ConsumedPixels < kStructuredScreenWidth)
        lineIdentity.ConsumedPixels++;
    if (identity.DirectXY && lineIdentity.DirectXYPixels < kStructuredScreenWidth)
        lineIdentity.DirectXYPixels++;
    if (lineIdentity.State == StructuredCaptureIdentityState::Uniform
        && (lineIdentity.Source.Sequence != identity.Source.Sequence
            || lineIdentity.Source.PolygonCount != identity.Source.PolygonCount
            || lineIdentity.Source.CaptureCnt != identity.Source.CaptureCnt
            || lineIdentity.Source.ScreenSwap != identity.Source.ScreenSwap))
    {
        lineIdentity.Source = {};
        lineIdentity.State = StructuredCaptureIdentityState::Conflict;
    }
}

void SoftRenderer::ShiftComposedObjCaptureIdentity(u32* dst) noexcept
{
    if (!TrackComposedObjCaptureIdentity
        || dst < BGOBJLine
        || dst >= BGOBJLine + kStructuredScreenWidth)
    {
        return;
    }

    const size_t x = static_cast<size_t>(dst - BGOBJLine);
    ComposedObjCaptureIdentity[(kStructuredScreenWidth * 2u) + x] =
        ComposedObjCaptureIdentity[kStructuredScreenWidth + x];
    ComposedObjCaptureIdentity[kStructuredScreenWidth + x] =
        ComposedObjCaptureIdentity[x];
    ComposedObjCaptureIdentity[x] = {};
}

void SoftRenderer::MarkStructuredVulkan2DObjCaptureIdentityConflict() noexcept
{
    if (!UseStructuredVulkan2D()
        || StructuredVulkan2DCurrentLineY >= kStructuredScreenHeight)
    {
        return;
    }

    const size_t screenIndex = StructuredVulkan2DCurrentLineTargetsTop ? 0u : 1u;
    StructuredVulkan2DObjCaptureLineIdentity& lineIdentity =
        StructuredVulkan2DObjCaptureIdentity[
            (screenIndex * kStructuredScreenHeight)
            + static_cast<size_t>(StructuredVulkan2DCurrentLineY)];
    lineIdentity.Source = {};
    lineIdentity.ConsumedPixels = 0u;
    lineIdentity.DirectXYPixels = 0u;
    lineIdentity.State = StructuredCaptureIdentityState::Conflict;
}

void SoftRenderer::ObserveFinalStructuredVulkan2DObjCaptureIdentity(
    size_t index,
    size_t screenBase,
    u32 originalVal1,
    u32 originalVal2,
    u32 originalVal3) noexcept
{
    if (!TrackComposedObjCaptureIdentity
        || DirectCaptureSourceLineSink
        || index >= kStructuredPixelCount)
    {
        return;
    }

    const size_t x = index % kStructuredScreenWidth;
    const u32 outputPlane0 = StructuredVulkan2DPlanes[screenBase + index];
    const u32 outputPlane1 =
        StructuredVulkan2DPlanes[screenBase + kStructuredPixelCount + index];
    const u32 outputControl =
        StructuredVulkan2DPlanes[screenBase + (kStructuredPixelCount * 2u) + index];
    const u32 controlAlpha = outputControl >> 24u;
    if ((controlAlpha & kStructuredVulkan2DSlot3DFlag) == 0u)
        return;

    const std::array<u32, kStructuredPlaneCount> rawValues = {
        originalVal1,
        originalVal2,
        originalVal3,
    };
    ObjCaptureIdentityTag survivingIdentity{};
    bool hasSurvivingIdentity = false;
    for (size_t depth = 0; depth < kStructuredPlaneCount; depth++)
    {
        const ObjCaptureIdentityTag& candidate =
            ComposedObjCaptureIdentity[(depth * kStructuredScreenWidth) + x];
        const u32 raw = rawValues[depth];
        if (!candidate.Source.Valid
            || raw == 0u
            || raw == kStructuredVulkan2D3DPlaceholder
            || !StructuredVulkan2DSourceIsReal2D(StructuredVulkan2DSourceClass(raw)))
        {
            continue;
        }
        bool rawValueIsUnique = true;
        for (size_t otherDepth = 0; otherDepth < kStructuredPlaneCount; otherDepth++)
        {
            if (otherDepth != depth && rawValues[otherDepth] == raw)
            {
                rawValueIsUnique = false;
                break;
            }
        }
        if (!rawValueIsUnique)
            continue;

        const bool survivesBelow = outputPlane0 == raw;
        const bool survivesAbove =
            (controlAlpha & kStructuredVulkan2DAbove3DFlag) != 0u
            && outputPlane1 == raw;
        if (survivesBelow == survivesAbove)
            continue;

        if (!hasSurvivingIdentity)
        {
            survivingIdentity = candidate;
            hasSurvivingIdentity = true;
            continue;
        }

        MarkStructuredVulkan2DObjCaptureIdentityConflict();
        return;
    }

    if (hasSurvivingIdentity)
        ObserveStructuredVulkan2DObjCaptureIdentity(survivingIdentity);
}

bool SoftRenderer::TryGetEngineBDirectBitmapObjCaptureIdentity(
    u32 objByteAddress,
    u16 packedColor,
    u32 screenX,
    CaptureSourceIdentity& outIdentity) const noexcept
{
    outIdentity = {};
    if (!UseStructuredVulkan2D()
        || CurUnit == nullptr
        || CurUnit->Num != 1u
        || CurrentSpriteRenderLine >= kStructuredScreenHeight
        || screenX >= kStructuredScreenWidth
        || (packedColor & 0x8000u) == 0u
        || (objByteAddress & 1u) != 0u)
    {
        return false;
    }

    const u32 mapIndex = (objByteAddress >> 14u) & 0x7u;
    if (GPU.VRAMMap_BOBJ[mapIndex] != (1u << 3u))
        return false;

    constexpr u32 vramBank = 3u;
    const u32 physicalByteAddress = objByteAddress & GPU.VRAMMask[vramBank];
    const u32 captureAddress = physicalByteAddress >> 1u;
    if (captureAddress >= kStructuredPixelCount
        || captureAddress
            != (CurrentSpriteRenderLine * kStructuredScreenWidth) + screenX)
    {
        return false;
    }

    const size_t lineIndex =
        (static_cast<size_t>(vramBank) * kStructuredScreenHeight)
        + static_cast<size_t>(CurrentSpriteRenderLine);
    const StructuredCaptureLineIdentity& lineIdentity =
        StructuredVulkan2DCaptureLineIdentity[lineIndex];
    if (StructuredVulkan2DCaptureLineValid[lineIndex] == 0u
        || StructuredVulkan2DCaptureLineHas3DSlot[lineIndex] == 0u
        || lineIdentity.State != StructuredCaptureIdentityState::Uniform
        || !lineIdentity.Source.Valid)
    {
        return false;
    }

    const size_t packedShadowIndex =
        (static_cast<size_t>(vramBank) * kStructuredPixelCount)
        + static_cast<size_t>(captureAddress);
    if (StructuredVulkan2DCapturePackedShadow[packedShadowIndex] != packedColor)
        return false;

    const size_t captureBase =
        static_cast<size_t>(vramBank) * kStructuredPlaneCount * kStructuredPixelCount;
    const size_t captureIndex = static_cast<size_t>(captureAddress);
    const u32 belowPlane = StructuredVulkan2DCapturePlanes[captureBase + captureIndex];
    const u32 abovePlane =
        StructuredVulkan2DCapturePlanes[captureBase + kStructuredPixelCount + captureIndex];
    const u32 control =
        StructuredVulkan2DCapturePlanes[
            captureBase + (kStructuredPixelCount * 2u) + captureIndex];
    const bool structured3DSlot =
        StructuredVulkan2DHas3DSlot(belowPlane)
        || StructuredVulkan2DHas3DSlot(abovePlane)
        || ((control >> 24u) & kStructuredVulkan2DSlot3DFlag) != 0u;
    if (!structured3DSlot)
        return false;

    const auto packStructuredColor = [](u32 color) noexcept -> u16 {
        return static_cast<u16>(
            ((color >> 1u) & 0x1Fu)
            | (((color >> 9u) & 0x1Fu) << 5u)
            | (((color >> 17u) & 0x1Fu) << 10u)
            | ((color >> 24u) != 0u ? 0x8000u : 0u));
    };
    const auto matchesPackedColor = [&](u32 color) noexcept {
        return color != 0u
            && color != kStructuredVulkan2D3DPlaceholder
            && packStructuredColor(color) == packedColor;
    };
    if (!matchesPackedColor(belowPlane) && !matchesPackedColor(abovePlane))
        return false;

    outIdentity = lineIdentity.Source;
    return true;
}

bool SoftRenderer::StructuredVulkan2DSourceACaptureHasDominant2DReplay() const noexcept
{
    if (LastDebugCaptureStats.CaptureLines == 0u || LastDebugCaptureStats.CaptureMode != 0u)
        return true;

    constexpr u32 dominantLineThreshold = kStructuredScreenHeight / 2u;
    if (LastDebugCaptureStats.CaptureBacked3DExplicitSlotLines > dominantLineThreshold
        && LastDebugCaptureStats.CaptureBacked3DNoBestClassLines <= dominantLineThreshold)
    {
        return false;
    }

    constexpr u32 dominantStructured2DThreshold = (kStructuredScreenWidth * kStructuredScreenHeight) / 4u;
    return LastDebugCaptureStats.StructuredCopy2DOnlyPixels > dominantStructured2DThreshold
        || LastDebugCaptureStats.StructuredCopySourceBOverlayPixels > dominantStructured2DThreshold;
}

void SoftRenderer::ClearStructuredVulkan2DLine(u32 line)
{
    if (!UseStructuredVulkan2D() || line >= kStructuredScreenHeight)
        return;

    const size_t screenIndex = StructuredVulkan2DCurrentLineTargetsTop ? 0u : 1u;
    const size_t rowBase = static_cast<size_t>(line) * kStructuredScreenWidth;
    const size_t screenBase = screenIndex * kStructuredPlaneCount * kStructuredPixelCount;
    for (size_t plane = 0; plane < kStructuredPlaneCount; plane++)
    {
        std::fill_n(
            StructuredVulkan2DPlanes + screenBase + (plane * kStructuredPixelCount) + rowBase,
            kStructuredScreenWidth,
            0u);
    }
    const size_t lineIndex = (screenIndex * kStructuredScreenHeight) + static_cast<size_t>(line);
    StructuredVulkan2DLineHasPayload[lineIndex] = 0u;
    StructuredVulkan2DLineHas3DSlot[lineIndex] = 0u;
    StructuredVulkan2DLinePure3D[lineIndex] = 0u;
    StructuredVulkan2DLineKnownExact[lineIndex] = 0u;
    ClearStructuredVulkan2DObjCaptureLineIdentity(line);
    ClearStructuredVulkan2DDisplayedCaptureLineIdentity(line);
}

bool SoftRenderer::CanUseStructuredVulkan2DPure3DLine(u32 dispmode) const noexcept
{
    if (!UseStructuredVulkan2D()
        || !GPU.GPU3D.IsRendererAccelerated()
        || CurUnit == nullptr
        || CurUnit->Num != 0
        || (CurUnit->CaptureCnt & (1u << 31u)) != 0u
        || dispmode != 1u)
    {
        return false;
    }
    if (MelonDSAndroid::getRenderer2DDebugForcedMode(CurUnit->Num) >= 0)
        return false;
    if (LastDebugCaptureStats.CaptureLines != 0u
        && LastDebugCaptureStats.CaptureMode == 0u)
    {
        return false;
    }

    constexpr u32 kBg0Is3D = 1u << 3u;
    constexpr u32 kBg0Enable = 1u << 8u;
    constexpr u32 kOtherBgEnable = (1u << 9u) | (1u << 10u) | (1u << 11u);
    constexpr u32 kObjEnable = 1u << 12u;
    constexpr u32 kWindowEnable = 0xE000u;
    constexpr u32 kDisplayModeMask = 0x30000u;
    const u32 dispcnt = CurUnit->DispCnt;
    if ((dispcnt & (kBg0Is3D | kBg0Enable)) != (kBg0Is3D | kBg0Enable))
        return false;
    if ((dispcnt & (kOtherBgEnable | kObjEnable | kWindowEnable)) != 0u)
        return false;
    if ((dispcnt & kDisplayModeMask) != (1u << 16u))
        return false;
    if (!Renderer2DDebugShouldDraw3DBg(CurUnit->Num, CurUnit->BGCnt[0]))
        return false;

    return true;
}

void SoftRenderer::FillStructuredVulkan2DPure3DLine(u32 line, u32* dst, u32 masterBrightness, bool writeLineMeta)
{
    if (!UseStructuredVulkan2D() || line >= kStructuredScreenHeight)
        return;

    constexpr u32 kPure3DControl = kStructuredVulkan2DSlot3DFlag << 24u;
    constexpr u32 kPure3DRaw = 0x40000000u;
    const size_t rowBase = static_cast<size_t>(line) * kStructuredScreenWidth;
    const size_t screenIndex = StructuredVulkan2DCurrentLineTargetsTop ? 0u : 1u;
    const size_t screenBase = screenIndex * kStructuredPlaneCount * kStructuredPixelCount;

    std::fill_n(dst, kStructuredScreenWidth, kPure3DRaw);
    std::fill_n(dst + kStructuredScreenWidth, kStructuredScreenWidth, 0u);
    std::fill_n(dst + (kStructuredScreenWidth * 2u), kStructuredScreenWidth, kPure3DControl);

    std::fill_n(
        StructuredVulkan2DPlanes + screenBase + rowBase,
        kStructuredScreenWidth,
        0u);
    std::fill_n(
        StructuredVulkan2DPlanes + screenBase + kStructuredPixelCount + rowBase,
        kStructuredScreenWidth,
        0u);
    std::fill_n(
        StructuredVulkan2DPlanes + screenBase + (kStructuredPixelCount * 2u) + rowBase,
        kStructuredScreenWidth,
        kPure3DControl);
    const size_t lineIndex = (screenIndex * kStructuredScreenHeight) + static_cast<size_t>(line);
    StructuredVulkan2DLineHasPayload[lineIndex] = 1u;
    StructuredVulkan2DLineHas3DSlot[lineIndex] = 1u;
    StructuredVulkan2DLinePure3D[lineIndex] = 1u;
    StructuredVulkan2DLineKnownExact[lineIndex] =
        StructuredVulkan2DCurrentLineMapsDirectly ? 1u : 0u;
    ClearStructuredVulkan2DObjCaptureLineIdentity(line);
    ClearStructuredVulkan2DDisplayedCaptureLineIdentity(line);

    if (writeLineMeta)
    {
        const u32 xpos = GPU.GPU3D.GetRenderXPos();
        dst[kStructuredScreenWidth * 3u] =
            masterBrightness
            | (CurUnit->DispCnt & 0x30000u)
            | (xpos << 24u)
            | ((xpos & 0x100u) << 15u);
    }
}

bool SoftRenderer::TryPromoteStructuredVulkan2DComposedPure3DLine(u32 line, u32 masterBrightness)
{
    if (!UseStructuredVulkan2D()
        || !GPU.GPU3D.IsRendererAccelerated()
        || line >= kStructuredScreenHeight
        || CurUnit == nullptr
        || CurUnit->CaptureLatch
        || MelonDSAndroid::getRenderer2DDebugForcedMode(CurUnit->Num) >= 0)
    {
        return false;
    }

    const u32 displayMode = (CurUnit->DispCnt >> 16u) & (CurUnit->Num ? 0x1u : 0x3u);
    if (!CanUseStructuredVulkan2DPure3DLine(displayMode))
        return false;

    for (u32 x = 0; x < kStructuredScreenWidth; x++)
    {
        const u32 val0 = BGOBJLine[x];
        const u32 val1 = BGOBJLine[kStructuredScreenWidth + x];
        const u32 val2 = BGOBJLine[(kStructuredScreenWidth * 2u) + x];
        const bool slot0 = StructuredVulkan2DHas3DSlot(val0);
        const bool slot1 = StructuredVulkan2DHas3DSlot(val1);
        const bool slot2 = StructuredVulkan2DHas3DSlot(val2);
        if (!slot0 && !slot1 && !slot2)
            return false;

        const bool real0 = StructuredVulkan2DSourceIsReal2D(StructuredVulkan2DSourceClass(val0));
        const bool real1 = StructuredVulkan2DSourceIsReal2D(StructuredVulkan2DSourceClass(val1));
        if ((slot1 && real0) || (slot2 && (real0 || real1)))
            return false;
    }

    FillStructuredVulkan2DPure3DLine(line, BGOBJLine, masterBrightness, false);
    return true;
}

void SoftRenderer::ClearStructuredVulkan2DCapture(u32 vramBank)
{
    if (!UseStructuredVulkan2D() || vramBank >= 4u)
        return;

    const size_t screenBase = static_cast<size_t>(vramBank) * kStructuredPlaneCount * kStructuredPixelCount;
    std::fill_n(
        StructuredVulkan2DCapturePlanes.data() + screenBase,
        kStructuredPlaneCount * kStructuredPixelCount,
        0u);
    std::fill_n(
        StructuredVulkan2DCaptureOverlayLineage.data()
            + (static_cast<size_t>(vramBank) * kStructuredPixelCount),
        kStructuredPixelCount,
        kStructuredVulkan2DOverlayLineageUnknown);
    std::fill_n(
        StructuredVulkan2DCaptureLineValid.data() + (static_cast<size_t>(vramBank) * kStructuredScreenHeight),
        kStructuredScreenHeight,
        0u);
    std::fill_n(
        StructuredVulkan2DCaptureLineHasPayload.data() + (static_cast<size_t>(vramBank) * kStructuredScreenHeight),
        kStructuredScreenHeight,
        0u);
    std::fill_n(
        StructuredVulkan2DCaptureLineHas3DSlot.data() + (static_cast<size_t>(vramBank) * kStructuredScreenHeight),
        kStructuredScreenHeight,
        0u);
    std::fill_n(
        StructuredVulkan2DCaptureLineIdentity.data() + (static_cast<size_t>(vramBank) * kStructuredScreenHeight),
        kStructuredScreenHeight,
        StructuredCaptureLineIdentity{});
    std::fill_n(
        StructuredVulkan2DCaptureWriterRoute.data()
            + (static_cast<size_t>(vramBank) * kStructuredScreenHeight),
        kStructuredScreenHeight,
        StructuredCaptureWriterRoute::Unknown);
    std::fill_n(
        StructuredVulkan2DCapturePackedShadow.data()
            + (static_cast<size_t>(vramBank) * kStructuredPixelCount),
        kStructuredPixelCount,
        0u);
}

void SoftRenderer::InvalidateStructuredVulkan2DCaptureIdentityRange(
    u32 vramBank,
    u32 dstAddress,
    u32 width,
    StructuredCaptureIdentityState state) noexcept
{
    if (!UseStructuredVulkan2D() || vramBank >= 4u)
        return;

    std::array<bool, kStructuredScreenHeight> touchedLines {};
    const u32 invalidateWidth = std::min<u32>(width, kStructuredScreenWidth);
    for (u32 x = 0; x < invalidateWidth; x++)
    {
        const u32 captureAddress = (dstAddress + x) & 0xFFFFu;
        if (captureAddress >= kStructuredPixelCount)
            continue;

        StructuredVulkan2DCapturePackedShadow[
            (static_cast<size_t>(vramBank) * kStructuredPixelCount)
            + static_cast<size_t>(captureAddress)] = 0u;
        touchedLines[captureAddress / kStructuredScreenWidth] = true;
    }

    for (u32 line = 0; line < kStructuredScreenHeight; line++)
    {
        if (!touchedLines[line])
            continue;

        StructuredCaptureLineIdentity& identity =
            StructuredVulkan2DCaptureLineIdentity[
                (static_cast<size_t>(vramBank) * kStructuredScreenHeight) + line];
        identity = {};
        identity.State = state;
        StructuredVulkan2DCaptureWriterRoute[
            (static_cast<size_t>(vramBank) * kStructuredScreenHeight) + line] =
            StructuredCaptureWriterRoute::Unknown;
    }
}

void SoftRenderer::SealStructuredVulkan2DCaptureIdentity(
    u32 vramBank,
    u32 dstAddress,
    u32 width,
    const CaptureSourceIdentity* sourceIdentity,
    StructuredCaptureWriterRoute writerRoute) noexcept
{
    if (!UseStructuredVulkan2D() || vramBank >= 4u)
        return;

    const bool fullAlignedLine =
        width == kStructuredScreenWidth
        && (dstAddress % kStructuredScreenWidth) == 0u
        && dstAddress <= (kStructuredPixelCount - kStructuredScreenWidth);
    if (!fullAlignedLine)
    {
        InvalidateStructuredVulkan2DCaptureIdentityRange(
            vramBank,
            dstAddress,
            width,
            sourceIdentity != nullptr && sourceIdentity->Valid
                ? StructuredCaptureIdentityState::Conflict
                : StructuredCaptureIdentityState::Unknown);
        return;
    }

    const size_t lineIndex =
        (static_cast<size_t>(vramBank) * kStructuredScreenHeight)
        + (static_cast<size_t>(dstAddress) / kStructuredScreenWidth);
    StructuredVulkan2DCaptureWriterRoute[lineIndex] = writerRoute;
    StructuredCaptureLineIdentity& identity =
        StructuredVulkan2DCaptureLineIdentity[lineIndex];
    identity = {};
    u16* const packedShadow =
        StructuredVulkan2DCapturePackedShadow.data()
        + (static_cast<size_t>(vramBank) * kStructuredPixelCount)
        + static_cast<size_t>(dstAddress);
    std::fill_n(packedShadow, width, 0u);
    if (sourceIdentity == nullptr
        || !sourceIdentity->Valid
        || StructuredVulkan2DCaptureLineValid[lineIndex] == 0u)
    {
        return;
    }

    identity.Source = *sourceIdentity;
    identity.State = StructuredCaptureIdentityState::Uniform;
    std::copy_n(
        reinterpret_cast<const u16*>(GPU.VRAM[vramBank]) + dstAddress,
        width,
        packedShadow);
}

void SoftRenderer::SeedStructuredVulkan2DCaptureBanksFromVram()
{
    if (!UseStructuredVulkan2D())
        return;

    SameBankMode2WriterIdentity.fill({});
    SameBankMode2WriterIdentityValid.fill(false);
    SameBankMode2DisplayedIdentity = {};
    SameBankMode2DisplayedVramBank = 4u;
    SameBankMode2DisplayedIdentityValid = false;
    SameBankMode2CompletedWriterIdentity = {};
    SameBankMode2CompletedWriterVramBank = 4u;
    SameBankMode2CompletedWriterIdentityValid = false;
    SameBankMode2PendingWriterIdentity = {};
    SameBankMode2PendingWriterLines = 0u;
    SameBankMode2PendingWriterConflict = false;

    StructuredVulkan2DCaptureLineIdentity.fill({});
    StructuredVulkan2DCaptureWriterRoute.fill(StructuredCaptureWriterRoute::Unknown);
    StructuredVulkan2DCapturePackedShadow.fill(0u);
    StructuredVulkan2DCaptureOverlayLineage.fill(
        kStructuredVulkan2DOverlayLineageUnknown);

    for (u32 bank = 0; bank < 4u; bank++)
    {
        const u16* vram = reinterpret_cast<const u16*>(GPU.VRAM[bank]);
        const size_t captureBase =
            static_cast<size_t>(bank) * kStructuredPlaneCount * kStructuredPixelCount;
        bool lineHasPayload[kStructuredScreenHeight] {};
        bool bankHasContent = false;
        for (u32 addr = 0; addr < kStructuredPixelCount; addr++)
        {
            const u16 value = vram[addr];
            u32 below = 0u;
            u32 control = 0u;
            if (value & 0x8000u)
            {
                const u32 r5 = value & 0x1Fu;
                const u32 g5 = (value >> 5u) & 0x1Fu;
                const u32 b5 = (value >> 10u) & 0x1Fu;
                const u32 r6 = (r5 << 1u) | (r5 >> 4u);
                const u32 g6 = (g5 << 1u) | (g5 >> 4u);
                const u32 b6 = (b5 << 1u) | (b5 >> 4u);
                below = r6 | (g6 << 8u) | (b6 << 16u) | (0x10u << 24u);
                const bool protectedBlack2D = (below & 0x00FFFFFFu) == 0u;
                control =
                    (0x01u
                        | kStructuredVulkan2DOnlyFlag
                        | (protectedBlack2D ? kStructuredVulkan2DProtectedBlackFlag : 0u)) << 24u;
                lineHasPayload[addr / kStructuredScreenWidth] = true;
                bankHasContent = true;
            }
            StructuredVulkan2DCapturePlanes[captureBase + addr] = below;
            StructuredVulkan2DCapturePlanes[captureBase + kStructuredPixelCount + addr] = 0u;
            StructuredVulkan2DCapturePlanes[captureBase + (kStructuredPixelCount * 2u) + addr] = control;
        }

        if (!bankHasContent)
            continue;

        for (u32 line = 0; line < kStructuredScreenHeight; line++)
        {
            const size_t lineIndex = (static_cast<size_t>(bank) * kStructuredScreenHeight) + line;
            StructuredVulkan2DCaptureLineValid[lineIndex] = lineHasPayload[line] ? 1u : 0u;
            StructuredVulkan2DCaptureLineHasPayload[lineIndex] = lineHasPayload[line] ? 1u : 0u;
            StructuredVulkan2DCaptureLineHas3DSlot[lineIndex] = 0u;
        }
    }
}

void SoftRenderer::ClearStructuredVulkan2DCaptureRange(u32 vramBank, u32 dstAddress, u32 width)
{
    if (!UseStructuredVulkan2D() || vramBank >= 4u)
        return;

    InvalidateStructuredVulkan2DCaptureIdentityRange(vramBank, dstAddress, width);

    const size_t captureBase = static_cast<size_t>(vramBank) * kStructuredPlaneCount * kStructuredPixelCount;
    const u32 clearWidth = std::min<u32>(width, kStructuredScreenWidth);
    for (u32 x = 0; x < clearWidth; x++)
    {
        const u32 captureAddress = (dstAddress + x) & 0xFFFFu;
        if (captureAddress >= kStructuredPixelCount)
            continue;

        const size_t captureIndex = static_cast<size_t>(captureAddress);
        for (size_t plane = 0; plane < kStructuredPlaneCount; plane++)
            StructuredVulkan2DCapturePlanes[captureBase + (plane * kStructuredPixelCount) + captureIndex] = 0u;
        StructuredVulkan2DCaptureOverlayLineage[
            (static_cast<size_t>(vramBank) * kStructuredPixelCount) + captureIndex] =
            kStructuredVulkan2DOverlayLineageUnknown;

        StructuredVulkan2DCaptureLineValid[
            (static_cast<size_t>(vramBank) * kStructuredScreenHeight)
                + (captureIndex / kStructuredScreenWidth)] = 0u;
        StructuredVulkan2DCaptureLineHasPayload[
            (static_cast<size_t>(vramBank) * kStructuredScreenHeight)
                + (captureIndex / kStructuredScreenWidth)] = 0u;
        StructuredVulkan2DCaptureLineHas3DSlot[
            (static_cast<size_t>(vramBank) * kStructuredScreenHeight)
                + (captureIndex / kStructuredScreenWidth)] = 0u;
    }
}

void SoftRenderer::FillStructuredVulkan2DCapturePure3DRange(u32 vramBank, u32 dstAddress, u32 width)
{
    if (!UseStructuredVulkan2D() || vramBank >= 4u)
        return;

    InvalidateStructuredVulkan2DCaptureIdentityRange(vramBank, dstAddress, width);

    constexpr u32 kPure3DControl = kStructuredVulkan2DSlot3DFlag << 24u;
    const size_t captureBase = static_cast<size_t>(vramBank) * kStructuredPlaneCount * kStructuredPixelCount;
    const u32 fillWidth = std::min<u32>(width, kStructuredScreenWidth);
    const u32 baseLine = dstAddress / kStructuredScreenWidth;
    const u32 baseX = dstAddress % kStructuredScreenWidth;
    if (dstAddress < kStructuredPixelCount
        && baseLine < kStructuredScreenHeight
        && baseX + fillWidth <= kStructuredScreenWidth)
    {
        const size_t captureIndex = static_cast<size_t>(dstAddress);
        std::fill_n(
            StructuredVulkan2DCapturePlanes.data() + captureBase + captureIndex,
            fillWidth,
            0u);
        std::fill_n(
            StructuredVulkan2DCapturePlanes.data() + captureBase + kStructuredPixelCount + captureIndex,
            fillWidth,
            0u);
        std::fill_n(
            StructuredVulkan2DCapturePlanes.data() + captureBase + (kStructuredPixelCount * 2u) + captureIndex,
            fillWidth,
            kPure3DControl);
        std::fill_n(
            StructuredVulkan2DCaptureOverlayLineage.data()
                + (static_cast<size_t>(vramBank) * kStructuredPixelCount)
                + captureIndex,
            fillWidth,
            kStructuredVulkan2DOverlayLineageUnknown);

        const size_t lineValidIndex = (static_cast<size_t>(vramBank) * kStructuredScreenHeight) + baseLine;
        if (StructuredVulkan2DCaptureLineValid[lineValidIndex] == 0u)
            LastDebugCaptureStats.StructuredCopyLines++;
        StructuredVulkan2DCaptureLineValid[lineValidIndex] = 1u;
        StructuredVulkan2DCaptureLineHasPayload[lineValidIndex] = 1u;
        StructuredVulkan2DCaptureLineHas3DSlot[lineValidIndex] = 1u;
        LastDebugCaptureStats.StructuredCopySlotPixels += fillWidth;
        return;
    }

    bool markedLine[kStructuredScreenHeight] {};
    for (u32 x = 0; x < fillWidth; x++)
    {
        const u32 captureAddress = (dstAddress + x) & 0xFFFFu;
        if (captureAddress >= kStructuredPixelCount)
            continue;

        const size_t captureIndex = static_cast<size_t>(captureAddress);
        StructuredVulkan2DCapturePlanes[captureBase + captureIndex] = 0u;
        StructuredVulkan2DCapturePlanes[captureBase + kStructuredPixelCount + captureIndex] = 0u;
        StructuredVulkan2DCapturePlanes[captureBase + (kStructuredPixelCount * 2u) + captureIndex] = kPure3DControl;
        StructuredVulkan2DCaptureOverlayLineage[
            (static_cast<size_t>(vramBank) * kStructuredPixelCount) + captureIndex] =
            kStructuredVulkan2DOverlayLineageUnknown;
        markedLine[captureIndex / kStructuredScreenWidth] = true;
    }

    for (u32 y = 0; y < kStructuredScreenHeight; y++)
    {
        if (!markedLine[y])
            continue;
        const size_t lineValidIndex = (static_cast<size_t>(vramBank) * kStructuredScreenHeight) + y;
        if (StructuredVulkan2DCaptureLineValid[lineValidIndex] == 0u)
            LastDebugCaptureStats.StructuredCopyLines++;
        StructuredVulkan2DCaptureLineValid[lineValidIndex] = 1u;
        StructuredVulkan2DCaptureLineHasPayload[lineValidIndex] = 1u;
        StructuredVulkan2DCaptureLineHas3DSlot[lineValidIndex] = 1u;
    }
    LastDebugCaptureStats.StructuredCopySlotPixels += fillWidth;
}

void SoftRenderer::SaveStructuredVulkan2DCaptureSourceLine(u32 line)
{
    if (!UseStructuredVulkan2D() || line >= kStructuredScreenHeight)
        return;

    const bool sourceTop = CurrentUnitTargetsTopScreen();
    const size_t sourceScreenIndex = sourceTop ? 0u : 1u;
    const size_t sourceBase = sourceScreenIndex * kStructuredPlaneCount * kStructuredPixelCount;
    const size_t sourceRowBase = static_cast<size_t>(line) * kStructuredScreenWidth;
    for (size_t plane = 0; plane < kStructuredPlaneCount; plane++)
    {
        std::memcpy(
            StructuredVulkan2DCaptureSourceLine.data() + (plane * kStructuredScreenWidth),
            StructuredVulkan2DPlanes + sourceBase + (plane * kStructuredPixelCount) + sourceRowBase,
            kStructuredScreenWidth * sizeof(u32));
    }
    StructuredVulkan2DCaptureSourceLineY = line;
    StructuredVulkan2DCaptureSourceLineValid = true;
}

bool SoftRenderer::StructuredVulkan2DCaptureSourceLineHas3DSlot(u32 line, u32 width) const noexcept
{
    if (!UseStructuredVulkan2D()
        || !StructuredVulkan2DCaptureSourceLineValid
        || StructuredVulkan2DCaptureSourceLineY != line)
    {
        return false;
    }

    const u32 checkWidth = std::min<u32>(width, kStructuredScreenWidth);
    const u32* controlLine = StructuredVulkan2DCaptureSourceLine.data() + (kStructuredScreenWidth * 2u);
    for (u32 x = 0; x < checkWidth; x++)
    {
        if (((controlLine[x] >> 24u) & kStructuredVulkan2DSlot3DFlag) != 0u)
            return true;
    }

    return false;
}

bool SoftRenderer::StructuredVulkan2DCaptureSourceLineCanFastCopy(u32 line, u32 width) const noexcept
{
    if (!UseStructuredVulkan2D()
        || !StructuredVulkan2DCaptureSourceLineValid
        || StructuredVulkan2DCaptureSourceLineY != line)
    {
        return false;
    }

    const u32 checkWidth = std::min<u32>(width, kStructuredScreenWidth);
    const u32* plane0 = StructuredVulkan2DCaptureSourceLine.data();
    const u32* plane1 = StructuredVulkan2DCaptureSourceLine.data() + kStructuredScreenWidth;
    const u32* controlLine = StructuredVulkan2DCaptureSourceLine.data() + (kStructuredScreenWidth * 2u);
    bool has3DSlot = false;
    bool has2DContext = false;
    for (u32 x = 0; x < checkWidth; x++)
    {
        const u32 controlAlpha = controlLine[x] >> 24u;
        if ((controlAlpha & kStructuredVulkan2DSlot3DFlag) != 0u)
            has3DSlot = true;
        const bool plane0IsReal2D = StructuredVulkan2DSourceIsReal2D(StructuredVulkan2DSourceClass(plane0[x]));
        const bool plane1IsReal2D = StructuredVulkan2DSourceIsReal2D(StructuredVulkan2DSourceClass(plane1[x]));
        const bool aboveIsPreservable2D =
            (controlAlpha & kStructuredVulkan2DAbove3DFlag) != 0u
            && StructuredVulkan2DCanPreserveCaptureOverlay(plane1[x]);
        if (plane0IsReal2D || plane1IsReal2D || aboveIsPreservable2D)
        {
            has2DContext = true;
        }
    }

    return has3DSlot && has2DContext;
}

bool SoftRenderer::StructuredVulkan2DLineHasVisibleSourceA(const u32* line, u32 width) const noexcept
{
    if (line == nullptr)
        return false;

    const u32 checkWidth = std::min<u32>(width, kStructuredScreenWidth);
    u32 visiblePixels = 0u;
    const u32 requiredVisiblePixels = std::max<u32>(8u, checkWidth / 8u);
    for (u32 x = 0; x < checkWidth; x++)
    {
        const u32 pixel = line[x];
        if (pixel == 0u
            || pixel == kStructuredVulkan2D3DPlaceholder
            || StructuredVulkan2DIsOpaqueBlack(pixel))
        {
            continue;
        }

        visiblePixels++;
        if (visiblePixels >= requiredVisiblePixels)
            return true;
    }

    return false;
}

bool SoftRenderer::StructuredVulkan2DCaptureSourceLineCanCopy2DOnly(u32 line, u32 width) const noexcept
{
    if (!UseStructuredVulkan2D()
        || !StructuredVulkan2DCaptureSourceLineValid
        || StructuredVulkan2DCaptureSourceLineY != line)
    {
        return false;
    }

    const u32 checkWidth = std::min<u32>(width, kStructuredScreenWidth);
    const u32* plane0 = StructuredVulkan2DCaptureSourceLine.data();
    const u32* plane1 = StructuredVulkan2DCaptureSourceLine.data() + kStructuredScreenWidth;
    const u32* controlLine = StructuredVulkan2DCaptureSourceLine.data() + (kStructuredScreenWidth * 2u);
    u32 visible2D = 0u;
    for (u32 x = 0; x < checkWidth; x++)
    {
        const u32 controlAlpha = controlLine[x] >> 24u;
        if ((controlAlpha & kStructuredVulkan2DSlot3DFlag) != 0u)
            return false;

        const bool plane0IsVisible2D =
            StructuredVulkan2DSourceIsReal2D(StructuredVulkan2DSourceClass(plane0[x]))
            && !StructuredVulkan2DIsOpaqueBlack(plane0[x]);
        const bool plane1IsVisible2D =
            StructuredVulkan2DSourceIsReal2D(StructuredVulkan2DSourceClass(plane1[x]))
            && !StructuredVulkan2DIsOpaqueBlack(plane1[x]);
        const bool aboveIsVisible2D =
            (controlAlpha & kStructuredVulkan2DAbove3DFlag) != 0u
            && plane1[x] != 0u
            && !StructuredVulkan2DIsOpaqueBlack(plane1[x]);
        if (plane0IsVisible2D || plane1IsVisible2D || aboveIsVisible2D)
            visible2D++;
    }

    return visible2D >= std::max<u32>(8u, checkWidth / 8u);
}

void SoftRenderer::CopyStructuredVulkan2DCaptureSourceLineToCapture(
    u32 line,
    u32 vramBank,
    u32 dstAddress,
    u32 width,
    u8* carriedProtectedBlack)
{
    if (!UseStructuredVulkan2D()
        || !StructuredVulkan2DCaptureSourceLineValid
        || StructuredVulkan2DCaptureSourceLineY != line
        || vramBank >= 4u)
    {
        return;
    }

    const size_t captureBase = static_cast<size_t>(vramBank) * kStructuredPlaneCount * kStructuredPixelCount;
    const u32 copyWidth = std::min<u32>(width, kStructuredScreenWidth);
    if (carriedProtectedBlack != nullptr)
        std::fill_n(carriedProtectedBlack, copyWidth, 0u);
    LastDebugCaptureStats.StructuredCopyLines++;
    if (copyWidth == kStructuredScreenWidth
        && (dstAddress % kStructuredScreenWidth) == 0u
        && dstAddress <= (kStructuredPixelCount - kStructuredScreenWidth))
    {
        const size_t captureIndex = static_cast<size_t>(dstAddress);
        const size_t lineIndex = (static_cast<size_t>(vramBank) * kStructuredScreenHeight)
            + (captureIndex / kStructuredScreenWidth);
        u32* const destinationPlane0 = StructuredVulkan2DCapturePlanes.data()
            + captureBase + captureIndex;
        u32* const destinationPlane1 = destinationPlane0 + kStructuredPixelCount;
        u32* const destinationControl = destinationPlane1 + kStructuredPixelCount;
        u8* const destinationOverlayLineage =
            StructuredVulkan2DCaptureOverlayLineage.data()
            + (static_cast<size_t>(vramBank) * kStructuredPixelCount)
            + captureIndex;
        const u32* const sourcePlane0 = StructuredVulkan2DCaptureSourceLine.data();
        const u32* const sourcePlane1 = sourcePlane0 + kStructuredScreenWidth;
        const u32* const sourceControl = sourcePlane1 + kStructuredScreenWidth;
        const bool initialLineValid = StructuredVulkan2DCaptureLineValid[lineIndex] != 0u;
        bool lineHasPayload = StructuredVulkan2DCaptureLineHasPayload[lineIndex] != 0u;
        bool lineHas3DSlot = StructuredVulkan2DCaptureLineHas3DSlot[lineIndex] != 0u;
        const bool captureModeIsSourceA = LastDebugCaptureStats.CaptureMode == 0u;
        u32 plane0UsefulPixels = 0u;
        u32 plane1UsefulPixels = 0u;
        u32 slotPixels = 0u;
        u32 abovePixels = 0u;
        u32 only2DPixels = 0u;
        u32 overlayPixels = 0u;

        for (u32 x = 0u; x < kStructuredScreenWidth; x++)
        {
            const u32 oldPlane0 = destinationPlane0[x];
            const u32 oldPlane1 = destinationPlane1[x];
            const u32 oldControl = destinationControl[x];
            const u8 oldOverlayLineage = destinationOverlayLineage[x];
            u32 newPlane0 = sourcePlane0[x];
            u32 newPlane1 = sourcePlane1[x];
            u32 newControl = sourceControl[x];
            plane0UsefulPixels += newPlane0 != 0u ? 1u : 0u;
            plane1UsefulPixels += newPlane1 != 0u ? 1u : 0u;

            const u32 sourceControlAlpha = newControl >> 24u;
            const bool structuredSlot =
                (sourceControlAlpha & kStructuredVulkan2DSlot3DFlag) != 0u;
            const bool sourceHas2DAbove =
                structuredSlot
                && (sourceControlAlpha & kStructuredVulkan2DAbove3DFlag) != 0u
                && newPlane1 != 0u
                && StructuredVulkan2DCanPreserveCaptureOverlay(newPlane1);
            const bool allowCaptureMatchedOverlay =
                captureModeIsSourceA && structuredSlot && !sourceHas2DAbove;
            slotPixels += structuredSlot ? 1u : 0u;
            abovePixels +=
                structuredSlot && (sourceControlAlpha & kStructuredVulkan2DAbove3DFlag) != 0u
                    ? 1u
                    : 0u;
            only2DPixels +=
                !structuredSlot && (sourceControlAlpha & kStructuredVulkan2DOnlyFlag) != 0u
                    ? 1u
                    : 0u;

            u32 existingOverlayPixel = 0u;
            u32 existingOverlayControl = 0u;
            if ((initialLineValid || x != 0u) && (oldControl >> 24u) != 0u)
            {
                const u32 oldControlAlpha = oldControl >> 24u;
                const bool oldStructuredSlot =
                    (oldControlAlpha & kStructuredVulkan2DSlot3DFlag) != 0u;
                if (oldStructuredSlot
                    && (oldControlAlpha & kStructuredVulkan2DAbove3DFlag) != 0u
                    && oldPlane1 != 0u
                    && (StructuredVulkan2DCanPreserveCaptureOverlay(oldPlane1)
                        || (allowCaptureMatchedOverlay
                            && StructuredVulkan2DCanUseCaptureMatched3DOverlay(oldPlane1))))
                {
                    existingOverlayPixel = oldPlane1;
                    existingOverlayControl = oldControl;
                }
                else if (!oldStructuredSlot
                    && (oldControlAlpha & kStructuredVulkan2DOnlyFlag) != 0u
                    && oldPlane0 != 0u
                    && (StructuredVulkan2DCanPreserveCaptureOverlay(oldPlane0)
                        || (allowCaptureMatchedOverlay
                            && StructuredVulkan2DCanUseCaptureMatched3DOverlay(oldPlane0))))
                {
                    existingOverlayPixel = oldPlane0;
                    existingOverlayControl = oldControl;
                }
            }

            const bool carriedExistingOverlay =
                structuredSlot && !sourceHas2DAbove && existingOverlayPixel != 0u;
            if (carriedExistingOverlay)
            {
                if (carriedProtectedBlack != nullptr)
                {
                    if (StructuredVulkan2DIsUnblendedProtectedBlackTargetBottom(
                            existingOverlayPixel,
                            existingOverlayControl))
                    {
                        carriedProtectedBlack[x] |=
                            kStructuredVulkan2DCarriedProtectedBlack;
                    }
                }
                const u32 overlayControlAlpha = existingOverlayControl >> 24u;
                const u32 protectedBlack =
                    overlayControlAlpha & kStructuredVulkan2DProtectedBlackFlag;
                const bool protectedBlackTargetTop =
                    (existingOverlayControl & kStructuredVulkan2DProtectedBlackTargetsBottomFlag) == 0u;
                newPlane1 = existingOverlayPixel;
                newControl = StructuredVulkan2DControlRgbWithProtectedBlackTarget(
                    newControl & 0x00FFFFFFu,
                    protectedBlack != 0u,
                    protectedBlackTargetTop)
                    | ((sourceControlAlpha
                        | kStructuredVulkan2DAbove3DFlag
                        | protectedBlack) << 24u);
                overlayPixels++;
            }

            destinationPlane0[x] = newPlane0;
            destinationPlane1[x] = newPlane1;
            destinationControl[x] = newControl;
            destinationOverlayLineage[x] =
                !StructuredVulkan2DHasPreservableCaptureOverlay(
                    newPlane0,
                    newPlane1,
                    newControl)
                ? kStructuredVulkan2DOverlayLineageUnknown
                : carriedExistingOverlay
                    ? AdvanceStructuredVulkan2DOverlayLineage(oldOverlayLineage)
                    : kStructuredVulkan2DOverlayLineageFresh;
            if (newPlane0 != 0u || newPlane1 != 0u || newControl != 0u)
                lineHasPayload = true;
            if (((newPlane0 >> 24u) & 0xC0u) == 0x40u
                || ((newPlane1 >> 24u) & 0xC0u) == 0x40u
                || ((newControl >> 24u) & kStructuredVulkan2DSlot3DFlag) != 0u)
            {
                lineHas3DSlot = true;
            }
        }

        StructuredVulkan2DCaptureLineValid[lineIndex] = 1u;
        StructuredVulkan2DCaptureLineHasPayload[lineIndex] = lineHasPayload ? 1u : 0u;
        StructuredVulkan2DCaptureLineHas3DSlot[lineIndex] = lineHas3DSlot ? 1u : 0u;
        LastDebugCaptureStats.StructuredCopyPlane0UsefulPixels += plane0UsefulPixels;
        LastDebugCaptureStats.StructuredCopyPlane1UsefulPixels += plane1UsefulPixels;
        LastDebugCaptureStats.StructuredCopySlotPixels += slotPixels;
        LastDebugCaptureStats.StructuredCopyAbovePixels += abovePixels;
        LastDebugCaptureStats.StructuredCopy2DOnlyPixels += only2DPixels;
        LastDebugCaptureStats.StructuredCopySourceBOverlayPixels += overlayPixels;
        return;
    }

    for (u32 x = 0; x < copyWidth; x++)
    {
        const u32 captureAddress = (dstAddress + x) & 0xFFFFu;
        if (captureAddress >= kStructuredPixelCount)
            continue;

        const size_t captureIndex = static_cast<size_t>(captureAddress);
        const size_t overlayLineageIndex =
            (static_cast<size_t>(vramBank) * kStructuredPixelCount) + captureIndex;
        const u8 oldOverlayLineage =
            StructuredVulkan2DCaptureOverlayLineage[overlayLineageIndex];
        const u32 sourcePlane0 = StructuredVulkan2DCaptureSourceLine[static_cast<size_t>(x)];
        const u32 sourcePlane1 =
            StructuredVulkan2DCaptureSourceLine[kStructuredScreenWidth + static_cast<size_t>(x)];
        const u32 sourceControl =
            StructuredVulkan2DCaptureSourceLine[(kStructuredScreenWidth * 2u) + static_cast<size_t>(x)];
        if (sourcePlane0 != 0u)
            LastDebugCaptureStats.StructuredCopyPlane0UsefulPixels++;
        if (sourcePlane1 != 0u)
            LastDebugCaptureStats.StructuredCopyPlane1UsefulPixels++;
        const u32 sourceControlAlpha = sourceControl >> 24u;
        const bool structuredSlot = (sourceControlAlpha & kStructuredVulkan2DSlot3DFlag) != 0u;
        const bool sourcePlane1IsReal2D =
            StructuredVulkan2DCanPreserveCaptureOverlay(sourcePlane1);
        const bool sourceHas2DAbove =
            structuredSlot
            && (sourceControlAlpha & kStructuredVulkan2DAbove3DFlag) != 0u
            && sourcePlane1 != 0u
            && sourcePlane1IsReal2D;
        u32 existingOverlayPixel = 0u;
        u32 existingOverlayControl = 0u;
        const bool allowSourceACaptureMatchedOverlay =
            LastDebugCaptureStats.CaptureMode == 0u
            && structuredSlot
            && !sourceHas2DAbove;
        ReadStructuredVulkan2DCapture2DOverlayPixel(
            vramBank,
            captureAddress,
            existingOverlayPixel,
            existingOverlayControl,
            allowSourceACaptureMatchedOverlay);
        if (structuredSlot)
            LastDebugCaptureStats.StructuredCopySlotPixels++;
        if (structuredSlot && (sourceControlAlpha & kStructuredVulkan2DAbove3DFlag) != 0u)
            LastDebugCaptureStats.StructuredCopyAbovePixels++;
        if (!structuredSlot && (sourceControlAlpha & kStructuredVulkan2DOnlyFlag) != 0u)
            LastDebugCaptureStats.StructuredCopy2DOnlyPixels++;

        StructuredVulkan2DCapturePlanes[captureBase + captureIndex] = sourcePlane0;
        StructuredVulkan2DCapturePlanes[captureBase + kStructuredPixelCount + captureIndex] = sourcePlane1;
        StructuredVulkan2DCapturePlanes[captureBase + (kStructuredPixelCount * 2u) + captureIndex] = sourceControl;
        StructuredVulkan2DCaptureOverlayLineage[overlayLineageIndex] =
            StructuredVulkan2DHasPreservableCaptureOverlay(
                sourcePlane0,
                sourcePlane1,
                sourceControl)
            ? kStructuredVulkan2DOverlayLineageFresh
            : kStructuredVulkan2DOverlayLineageUnknown;
        StructuredVulkan2DCaptureLineValid[
            (static_cast<size_t>(vramBank) * kStructuredScreenHeight)
                + (captureIndex / kStructuredScreenWidth)] = 1u;
        MarkStructuredVulkan2DCaptureLine(
            vramBank,
            captureAddress,
            sourcePlane0,
            sourcePlane1,
            sourceControl);
        if (structuredSlot && !sourceHas2DAbove && existingOverlayPixel != 0u)
        {
            if (carriedProtectedBlack != nullptr)
            {
                if (StructuredVulkan2DIsUnblendedProtectedBlackTargetBottom(
                        existingOverlayPixel,
                        existingOverlayControl))
                {
                    carriedProtectedBlack[x] |=
                        kStructuredVulkan2DCarriedProtectedBlack;
                }
            }
            MergeStructuredVulkan2DCapture2DOverlayPixel(
                vramBank,
                captureAddress,
                existingOverlayPixel,
                existingOverlayControl,
                oldOverlayLineage);
        }
    }
}

void SoftRenderer::CopyStructuredVulkan2DCurrentLineToCapture(u32 line, u32 vramBank, u32 dstAddress, u32 width)
{
    if (!UseStructuredVulkan2D()
        || line >= kStructuredScreenHeight
        || vramBank >= 4u)
    {
        return;
    }

    const bool sourceTop = CurrentUnitTargetsTopScreen();
    const size_t sourceScreenIndex = sourceTop ? 0u : 1u;
    const size_t sourceBase = sourceScreenIndex * kStructuredPlaneCount * kStructuredPixelCount;
    const size_t captureBase = static_cast<size_t>(vramBank) * kStructuredPlaneCount * kStructuredPixelCount;
    const size_t sourceRowBase = static_cast<size_t>(line) * kStructuredScreenWidth;
    const u32 copyWidth = std::min<u32>(width, kStructuredScreenWidth);
    LastDebugCaptureStats.StructuredCopyLines++;
    for (u32 x = 0; x < copyWidth; x++)
    {
        const u32 captureAddress = (dstAddress + x) & 0xFFFFu;
        if (captureAddress >= kStructuredPixelCount)
            continue;

        const size_t sourceIndex = sourceRowBase + static_cast<size_t>(x);
        const size_t captureIndex = static_cast<size_t>(captureAddress);
        const size_t overlayLineageIndex =
            (static_cast<size_t>(vramBank) * kStructuredPixelCount) + captureIndex;
        const u8 oldOverlayLineage =
            StructuredVulkan2DCaptureOverlayLineage[overlayLineageIndex];
        const u32 sourcePlane0 = StructuredVulkan2DPlanes[sourceBase + sourceIndex];
        const u32 sourcePlane1 = StructuredVulkan2DPlanes[sourceBase + kStructuredPixelCount + sourceIndex];
        const u32 sourceControl = StructuredVulkan2DPlanes[sourceBase + (kStructuredPixelCount * 2u) + sourceIndex];
        if (sourcePlane0 != 0u)
            LastDebugCaptureStats.StructuredCopyPlane0UsefulPixels++;
        if (sourcePlane1 != 0u)
            LastDebugCaptureStats.StructuredCopyPlane1UsefulPixels++;
        const u32 sourceControlAlpha = sourceControl >> 24u;
        const bool structuredSlot = (sourceControlAlpha & kStructuredVulkan2DSlot3DFlag) != 0u;
        const bool sourcePlane1IsReal2D =
            StructuredVulkan2DCanPreserveCaptureOverlay(sourcePlane1);
        const bool sourceHas2DAbove =
            structuredSlot
            && (sourceControlAlpha & kStructuredVulkan2DAbove3DFlag) != 0u
            && sourcePlane1 != 0u
            && sourcePlane1IsReal2D;
        u32 existingOverlayPixel = 0u;
        u32 existingOverlayControl = 0u;
        const bool allowSourceACaptureMatchedOverlay =
            LastDebugCaptureStats.CaptureMode == 0u
            && structuredSlot
            && !sourceHas2DAbove;
        ReadStructuredVulkan2DCapture2DOverlayPixel(
            vramBank,
            captureAddress,
            existingOverlayPixel,
            existingOverlayControl,
            allowSourceACaptureMatchedOverlay);
        if (structuredSlot)
            LastDebugCaptureStats.StructuredCopySlotPixels++;
        if (structuredSlot && (sourceControlAlpha & kStructuredVulkan2DAbove3DFlag) != 0u)
            LastDebugCaptureStats.StructuredCopyAbovePixels++;
        if (!structuredSlot && (sourceControlAlpha & kStructuredVulkan2DOnlyFlag) != 0u)
            LastDebugCaptureStats.StructuredCopy2DOnlyPixels++;
        for (size_t plane = 0; plane < kStructuredPlaneCount; plane++)
        {
            StructuredVulkan2DCapturePlanes[captureBase + (plane * kStructuredPixelCount) + captureIndex] =
                StructuredVulkan2DPlanes[sourceBase + (plane * kStructuredPixelCount) + sourceIndex];
        }
        StructuredVulkan2DCaptureOverlayLineage[overlayLineageIndex] =
            StructuredVulkan2DHasPreservableCaptureOverlay(
                sourcePlane0,
                sourcePlane1,
                sourceControl)
            ? kStructuredVulkan2DOverlayLineageFresh
            : kStructuredVulkan2DOverlayLineageUnknown;
        StructuredVulkan2DCaptureLineValid[
            (static_cast<size_t>(vramBank) * kStructuredScreenHeight)
                + (captureIndex / kStructuredScreenWidth)] = 1u;
        MarkStructuredVulkan2DCaptureLine(
            vramBank,
            captureAddress,
            sourcePlane0,
            sourcePlane1,
            sourceControl);
        if (structuredSlot && !sourceHas2DAbove && existingOverlayPixel != 0u)
        {
            MergeStructuredVulkan2DCapture2DOverlayPixel(
                vramBank,
                captureAddress,
                existingOverlayPixel,
                existingOverlayControl,
                oldOverlayLineage);
        }
    }
}

void SoftRenderer::CopyStructuredVulkan2DCaptureLineToCurrentScreen(
    u32 line,
    u32 vramBank,
    const u32* packedLine)
{
    if (line < kStructuredScreenHeight)
    {
        const size_t targetScreenIndex =
            StructuredVulkan2DCurrentLineTargetsTop ? 0u : 1u;
        const size_t targetLineIndex =
            (targetScreenIndex * kStructuredScreenHeight) + line;
        StructuredVulkan2DLineKnownExact[targetLineIndex] = 0u;
        ClearStructuredVulkan2DDisplayedCaptureLineIdentity(line);
    }
    if (!UseStructuredVulkan2D()
        || line >= kStructuredScreenHeight
        || vramBank >= 4u
        || StructuredVulkan2DCaptureLineValid[(static_cast<size_t>(vramBank) * kStructuredScreenHeight) + line] == 0u)
    {
        return;
    }

    const size_t screenIndex = StructuredVulkan2DCurrentLineTargetsTop ? 0u : 1u;
    const size_t screenBase = screenIndex * kStructuredPlaneCount * kStructuredPixelCount;
    const size_t captureBase = static_cast<size_t>(vramBank) * kStructuredPlaneCount * kStructuredPixelCount;
    const size_t rowBase = static_cast<size_t>(line) * kStructuredScreenWidth;
    const u16* const displayedVram =
        reinterpret_cast<const u16*>(GPU.VRAM[vramBank]) + rowBase;
    const u16* const capturedVramShadow =
        StructuredVulkan2DCapturePackedShadow.data()
        + (static_cast<size_t>(vramBank) * kStructuredPixelCount)
        + rowBase;
    const bool displayedPackedShadowExact =
        std::equal(
            capturedVramShadow,
            capturedVramShadow + kStructuredScreenWidth,
            displayedVram);
    for (size_t plane = 0; plane < kStructuredPlaneCount - 1u; plane++)
    {
        std::memcpy(
            StructuredVulkan2DPlanes + screenBase + (plane * kStructuredPixelCount) + rowBase,
            StructuredVulkan2DCapturePlanes.data() + captureBase + (plane * kStructuredPixelCount) + rowBase,
            kStructuredScreenWidth * sizeof(u32));
    }
    u32* const dstPlane0 =
        StructuredVulkan2DPlanes + screenBase + rowBase;
    u32* const dstAbove =
        StructuredVulkan2DPlanes + screenBase + kStructuredPixelCount + rowBase;
    u32* dstControl =
        StructuredVulkan2DPlanes + screenBase + (2u * kStructuredPixelCount) + rowBase;
    const u32* srcControl =
        StructuredVulkan2DCapturePlanes.data() + captureBase + (2u * kStructuredPixelCount) + rowBase;
    const u8* const captureOverlayLineage =
        StructuredVulkan2DCaptureOverlayLineage.data()
        + (static_cast<size_t>(vramBank) * kStructuredPixelCount)
        + rowBase;
    const size_t captureLineIndex =
        (static_cast<size_t>(vramBank) * kStructuredScreenHeight)
        + static_cast<size_t>(line);
    const bool goldenCarriedOverlayTuple =
        CurUnit != nullptr
        && CurUnit->Num == 0u
        && (CurUnit->CaptureCnt & 0x7FFFFFFFu) == 0x00330010u
        && (CurUnit->DispCnt & 0x000F0000u) == 0x000E0000u
        && (GPU.GPU2D_B.DispCnt & 0x00030000u) == 0x00010000u
        && vramBank == 3u;
    const bool filterGoldenCarriedTopOverlay =
        goldenCarriedOverlayTuple
        && StructuredVulkan2DCurrentLineTargetsTop;
    const StructuredCaptureWriterRoute captureWriterRoute =
        StructuredVulkan2DCaptureWriterRoute[captureLineIndex];
    const StructuredCaptureLineIdentity& captureIdentity =
        StructuredVulkan2DCaptureLineIdentity[captureLineIndex];
    u32 oppositeTopLcd3DSlotLines = 0u;
    if (goldenCarriedOverlayTuple
        && !StructuredVulkan2DCurrentLineTargetsTop
        && captureWriterRoute == StructuredCaptureWriterRoute::General)
    {
        for (u32 maskLine = 0u;
             maskLine < kStructuredScreenHeight;
             maskLine++)
        {
            if (StructuredVulkan2DLineHas3DSlot[maskLine] != 0u)
                oppositeTopLcd3DSlotLines++;
        }
    }
    const bool oppositeTopLcdSlotCountMatchesLine =
        oppositeTopLcd3DSlotLines == line;
    CaptureSourceIdentity latestCaptureIdentity {};
    const bool latestCaptureIdentityValid =
        oppositeTopLcdSlotCountMatchesLine
        && GPU.GPU3D.GetLastServedCaptureSourceIdentity(
            latestCaptureIdentity)
        && latestCaptureIdentity.Valid;
    const bool captureIdentityContradictedByLatest =
        latestCaptureIdentityValid
        && (captureIdentity.Source.Sequence
                != latestCaptureIdentity.Sequence
            || captureIdentity.Source.PolygonCount
                != latestCaptureIdentity.PolygonCount
            || captureIdentity.Source.CaptureCnt
                != latestCaptureIdentity.CaptureCnt
            || captureIdentity.Source.ScreenSwap
                != latestCaptureIdentity.ScreenSwap);
    const bool preserveUncontradictedGeneralWriterStructure =
        captureWriterRoute == StructuredCaptureWriterRoute::General
        && displayedPackedShadowExact
        && captureIdentity.State == StructuredCaptureIdentityState::Uniform
        && captureIdentity.Source.Valid
        && oppositeTopLcdSlotCountMatchesLine
        && !captureIdentityContradictedByLatest;
    const bool replaceGoldenCarriedBottomOverlayWithRaw =
        goldenCarriedOverlayTuple
        && !StructuredVulkan2DCurrentLineTargetsTop
        && StructuredVulkan2DCurrentLineMapsDirectly
        && packedLine != nullptr
        && captureWriterRoute != StructuredCaptureWriterRoute::Fast
        && !preserveUncontradictedGeneralWriterStructure;
    bool lineKnownExact =
        StructuredVulkan2DCurrentLineMapsDirectly && packedLine != nullptr;
    bool replacedGoldenBottomRaw = false;
    for (size_t x = 0; x < kStructuredScreenWidth; x++)
    {
        const u32 control = srcControl[x];
        const bool protectedBlack = ((control >> 24u) & kStructuredVulkan2DProtectedBlackFlag) != 0u;
        dstControl[x] = StructuredVulkan2DControlRgbWithProtectedBlackTarget(
            control & 0x00FFFFFFu,
            protectedBlack,
            StructuredVulkan2DCurrentLineTargetsTop)
            | (control & 0xFF000000u);
        const u32 controlAlpha = dstControl[x] >> 24u;
        if (filterGoldenCarriedTopOverlay
            && captureOverlayLineage[x]
                == kStructuredVulkan2DOverlayLineageCarried2Plus
            && (controlAlpha & 0x0Fu) == 4u
            && (controlAlpha
                    & (kStructuredVulkan2DSlot3DFlag
                        | kStructuredVulkan2DAbove3DFlag))
                == (kStructuredVulkan2DSlot3DFlag
                    | kStructuredVulkan2DAbove3DFlag)
            && StructuredVulkan2DCanPreserveCaptureOverlay(dstAbove[x]))
        {
            const u32 retainedControlRgb =
                (dstControl[x] & 0x00FFFFFFu)
                & ~kStructuredVulkan2DProtectedBlackTargetsBottomFlag;
            const u32 retainedControlAlpha =
                controlAlpha
                & ~(kStructuredVulkan2DAbove3DFlag
                    | kStructuredVulkan2DProtectedBlackFlag);
            dstAbove[x] = 0u;
            dstControl[x] =
                retainedControlRgb | (retainedControlAlpha << 24u);
            lineKnownExact = false;
        }
        else if (replaceGoldenCarriedBottomOverlayWithRaw
            && captureOverlayLineage[x]
                == kStructuredVulkan2DOverlayLineageCarried2Plus
            && (controlAlpha & 0x0Fu) == 4u
            && (controlAlpha
                    & (kStructuredVulkan2DSlot3DFlag
                        | kStructuredVulkan2DAbove3DFlag))
                == (kStructuredVulkan2DSlot3DFlag
                    | kStructuredVulkan2DAbove3DFlag)
            && StructuredVulkan2DCanPreserveCaptureOverlay(dstAbove[x]))
        {
            const u32 rawRgb = packedLine[x] & 0x00FFFFFFu;
            const bool protectedBlack2D = rawRgb == 0u;
            dstPlane0[x] = rawRgb | (0x10u << 24u);
            dstAbove[x] = 0u;
            dstControl[x] = StructuredVulkan2DControlRgbWithProtectedBlackTarget(
                0u,
                protectedBlack2D,
                false)
                | ((0x01u
                    | kStructuredVulkan2DOnlyFlag
                    | (protectedBlack2D
                        ? kStructuredVulkan2DProtectedBlackFlag
                        : 0u)) << 24u);
            replacedGoldenBottomRaw = true;
            lineKnownExact = false;
        }
        if (lineKnownExact
            && !StructuredVulkan2DMergePixelResolvesToStructured(
                packedLine[x],
                packedLine[kStructuredScreenWidth + x],
                packedLine[(kStructuredScreenWidth * 2u) + x],
                dstPlane0[x],
                dstAbove[x],
                dstControl[x]))
        {
            lineKnownExact = false;
        }
    }
    const size_t screenLineIndex = (screenIndex * kStructuredScreenHeight) + static_cast<size_t>(line);
    if (replacedGoldenBottomRaw)
    {
        bool lineHasPayload = false;
        bool lineHas3DSlot = false;
        for (size_t x = 0; x < kStructuredScreenWidth; x++)
        {
            const u32 controlAlpha = dstControl[x] >> 24u;
            lineHasPayload =
                lineHasPayload
                || dstPlane0[x] != 0u
                || dstAbove[x] != 0u
                || dstControl[x] != 0u;
            lineHas3DSlot =
                lineHas3DSlot
                || StructuredVulkan2DHas3DSlot(dstPlane0[x])
                || StructuredVulkan2DHas3DSlot(dstAbove[x])
                || (controlAlpha & kStructuredVulkan2DSlot3DFlag) != 0u;
        }
        StructuredVulkan2DLineHasPayload[screenLineIndex] = lineHasPayload ? 1u : 0u;
        StructuredVulkan2DLineHas3DSlot[screenLineIndex] = lineHas3DSlot ? 1u : 0u;
    }
    else
    {
        StructuredVulkan2DLineHasPayload[screenLineIndex] =
            StructuredVulkan2DCaptureLineHasPayload[captureLineIndex];
        StructuredVulkan2DLineHas3DSlot[screenLineIndex] =
            StructuredVulkan2DCaptureLineHas3DSlot[captureLineIndex];
    }
    StructuredVulkan2DLineKnownExact[screenLineIndex] = lineKnownExact ? 1u : 0u;
    StructuredVulkan2DDisplayedCaptureLineIdentity& displayedIdentity =
        StructuredVulkan2DDisplayedCaptureIdentity[screenLineIndex];
    displayedIdentity.Copied = true;
    displayedIdentity.VramBank = static_cast<u8>(vramBank);
    displayedIdentity.PackedShadowExact = displayedPackedShadowExact;
    displayedIdentity.WriterRoute =
        StructuredVulkan2DCaptureWriterRoute[captureLineIndex];
    if (lineKnownExact || displayedPackedShadowExact)
    {
        const StructuredCaptureLineIdentity& captureIdentity =
            StructuredVulkan2DCaptureLineIdentity[captureLineIndex];
        displayedIdentity.State = captureIdentity.State;
        if (captureIdentity.State == StructuredCaptureIdentityState::Uniform
            && captureIdentity.Source.Valid)
        {
            displayedIdentity.Source = captureIdentity.Source;
        }
    }
}

void SoftRenderer::CopyStructuredVulkan2DCaptureLineToCurrentScreenCompatibility(
    u32 line,
    u32 vramBank)
{
    if (!UseStructuredVulkan2D()
        || line >= kStructuredScreenHeight
        || vramBank >= 4u
        || StructuredVulkan2DCaptureLineValid[
            (static_cast<size_t>(vramBank) * kStructuredScreenHeight)
                + line] == 0u)
    {
        return;
    }

    const size_t screenIndex =
        StructuredVulkan2DCurrentLineTargetsTop ? 0u : 1u;
    const size_t screenBase =
        screenIndex * kStructuredPlaneCount * kStructuredPixelCount;
    const size_t captureBase =
        static_cast<size_t>(vramBank)
        * kStructuredPlaneCount
        * kStructuredPixelCount;
    const size_t rowBase =
        static_cast<size_t>(line) * kStructuredScreenWidth;
    for (size_t plane = 0; plane < kStructuredPlaneCount; plane++)
    {
        std::memcpy(
            StructuredVulkan2DPlanes
                + screenBase
                + (plane * kStructuredPixelCount)
                + rowBase,
            StructuredVulkan2DCapturePlanes.data()
                + captureBase
                + (plane * kStructuredPixelCount)
                + rowBase,
            kStructuredScreenWidth * sizeof(u32));
    }
}

void SoftRenderer::FillStructuredVulkan2DVramDisplayLine(u32 line, const u16* vramLine)
{
    if (!UseStructuredVulkan2D() || line >= kStructuredScreenHeight)
        return;

    ClearStructuredVulkan2DDisplayedCaptureLineIdentity(line);

    const size_t screenIndex = StructuredVulkan2DCurrentLineTargetsTop ? 0u : 1u;
    const size_t screenBase = screenIndex * kStructuredPlaneCount * kStructuredPixelCount;
    const size_t rowBase = static_cast<size_t>(line) * kStructuredScreenWidth;
    u32* dstBelow = StructuredVulkan2DPlanes + screenBase + rowBase;
    u32* dstAbove = StructuredVulkan2DPlanes + screenBase + kStructuredPixelCount + rowBase;
    u32* dstControl = StructuredVulkan2DPlanes + screenBase + (2u * kStructuredPixelCount) + rowBase;
    for (size_t x = 0; x < kStructuredScreenWidth; x++)
    {
        const u16 value = vramLine != nullptr ? vramLine[x] : 0u;
        const u32 r5 = value & 0x1Fu;
        const u32 g5 = (value >> 5u) & 0x1Fu;
        const u32 b5 = (value >> 10u) & 0x1Fu;
        const u32 r6 = (r5 << 1u) | (r5 >> 4u);
        const u32 g6 = (g5 << 1u) | (g5 >> 4u);
        const u32 b6 = (b5 << 1u) | (b5 >> 4u);
        const u32 below = r6 | (g6 << 8u) | (b6 << 16u) | (0x10u << 24u);
        const bool protectedBlack2D = (below & 0x00FFFFFFu) == 0u;
        dstBelow[x] = below;
        dstAbove[x] = 0u;
        dstControl[x] = StructuredVulkan2DControlRgbWithProtectedBlackTarget(
            0u,
            protectedBlack2D,
            StructuredVulkan2DCurrentLineTargetsTop)
            | ((0x01u
                | kStructuredVulkan2DOnlyFlag
                | (protectedBlack2D ? kStructuredVulkan2DProtectedBlackFlag : 0u)) << 24u);
    }
    const size_t screenLineIndex = (screenIndex * kStructuredScreenHeight) + static_cast<size_t>(line);
    StructuredVulkan2DLineHasPayload[screenLineIndex] = 1u;
    StructuredVulkan2DLineHas3DSlot[screenLineIndex] = 0u;
    StructuredVulkan2DLineKnownExact[screenLineIndex] =
        StructuredVulkan2DCurrentLineMapsDirectly ? 1u : 0u;
}

inline __attribute__((always_inline)) bool SoftRenderer::ReadStructuredVulkan2DCapture2DOverlayPixel(
    u32 vramBank,
    u32 vramAddress,
    u32& overlayPixel,
    u32& overlayControl,
    bool allowCaptureMatched3DSlot) const noexcept
{
    overlayPixel = 0u;
    overlayControl = 0u;
    if (!UseStructuredVulkan2D() || vramBank >= 4u || vramAddress >= kStructuredPixelCount)
        return false;

    const u32 line = vramAddress / kStructuredScreenWidth;
    const size_t lineValidIndex = (static_cast<size_t>(vramBank) * kStructuredScreenHeight) + line;
    if (StructuredVulkan2DCaptureLineValid[lineValidIndex] == 0u)
        return false;

    const size_t captureBase = static_cast<size_t>(vramBank) * kStructuredPlaneCount * kStructuredPixelCount;
    const size_t captureIndex = static_cast<size_t>(vramAddress);
    const u32 belowPlane = StructuredVulkan2DCapturePlanes[captureBase + captureIndex];
    const u32 abovePlane =
        StructuredVulkan2DCapturePlanes[captureBase + kStructuredPixelCount + captureIndex];
    const u32 control =
        StructuredVulkan2DCapturePlanes[captureBase + (kStructuredPixelCount * 2u) + captureIndex];
    const u32 controlAlpha = control >> 24u;
    if (controlAlpha == 0u)
        return false;

    const bool structuredSlot = (controlAlpha & kStructuredVulkan2DSlot3DFlag) != 0u;
    const bool abovePlaneIsReal2D =
        StructuredVulkan2DCanPreserveCaptureOverlay(abovePlane);
    const bool abovePlaneIsCaptureMatchedCandidate =
        allowCaptureMatched3DSlot
        && StructuredVulkan2DCanUseCaptureMatched3DOverlay(abovePlane);
    if (structuredSlot
        && (controlAlpha & kStructuredVulkan2DAbove3DFlag) != 0u
        && abovePlane != 0u
        && (abovePlaneIsReal2D || abovePlaneIsCaptureMatchedCandidate))
    {
        overlayPixel = abovePlane;
        overlayControl = control;
        return true;
    }

    const bool belowPlaneIsReal2D =
        StructuredVulkan2DCanPreserveCaptureOverlay(belowPlane);
    const bool belowPlaneIsCaptureMatchedCandidate =
        allowCaptureMatched3DSlot
        && StructuredVulkan2DCanUseCaptureMatched3DOverlay(belowPlane);
    if (!structuredSlot
        && (controlAlpha & kStructuredVulkan2DOnlyFlag) != 0u
        && belowPlane != 0u
        && (belowPlaneIsReal2D || belowPlaneIsCaptureMatchedCandidate))
    {
        overlayPixel = belowPlane;
        overlayControl = control;
        return true;
    }

    return false;
}

void SoftRenderer::MergeStructuredVulkan2DCapture2DOverlayPixel(
    u32 vramBank,
    u32 vramAddress,
    u32 overlayPixel,
    u32 overlayControl,
    u8 overlayLineage)
{
    if (!UseStructuredVulkan2D() || vramBank >= 4u || vramAddress >= kStructuredPixelCount || overlayPixel == 0u)
        return;

    const size_t captureBase = static_cast<size_t>(vramBank) * kStructuredPlaneCount * kStructuredPixelCount;
    const size_t captureIndex = static_cast<size_t>(vramAddress);
    u32& belowPlane = StructuredVulkan2DCapturePlanes[captureBase + captureIndex];
    u32& abovePlane = StructuredVulkan2DCapturePlanes[captureBase + kStructuredPixelCount + captureIndex];
    u32& control =
        StructuredVulkan2DCapturePlanes[captureBase + (kStructuredPixelCount * 2u) + captureIndex];
    const u32 controlAlpha = control >> 24u;
    const bool destinationHas3DSlot = (controlAlpha & kStructuredVulkan2DSlot3DFlag) != 0u;
    const u32 overlayControlAlpha = overlayControl >> 24u;
    const u32 protectedBlack =
        overlayControlAlpha & kStructuredVulkan2DProtectedBlackFlag;
    const bool protectedBlackTargetTop =
        (overlayControl & kStructuredVulkan2DProtectedBlackTargetsBottomFlag) == 0u;
    const u32 controlRgb = StructuredVulkan2DControlRgbWithProtectedBlackTarget(
        control & 0x00FFFFFFu,
        protectedBlack != 0u,
        protectedBlackTargetTop);

    if (destinationHas3DSlot)
    {
        abovePlane = overlayPixel;
        control = controlRgb
            | ((controlAlpha
                | kStructuredVulkan2DAbove3DFlag
                | protectedBlack) << 24u);
    }
    else
    {
        belowPlane = overlayPixel;
        const u32 compMode = controlAlpha & 0x0Fu;
        control = controlRgb
            | (((compMode <= 7u ? compMode : 5u)
                | kStructuredVulkan2DOnlyFlag
                | protectedBlack) << 24u);
    }

    const u32 line = vramAddress / kStructuredScreenWidth;
    StructuredVulkan2DCaptureLineValid[
        (static_cast<size_t>(vramBank) * kStructuredScreenHeight) + line] = 1u;
    StructuredVulkan2DCaptureOverlayLineage[
        (static_cast<size_t>(vramBank) * kStructuredPixelCount) + captureIndex] =
        StructuredVulkan2DHasPreservableCaptureOverlay(
            belowPlane,
            abovePlane,
            control)
        ? AdvanceStructuredVulkan2DOverlayLineage(overlayLineage)
        : kStructuredVulkan2DOverlayLineageUnknown;
    MarkStructuredVulkan2DCaptureLine(vramBank, vramAddress, belowPlane, abovePlane, control);
    LastDebugCaptureStats.StructuredCopySourceBOverlayPixels++;
}

bool SoftRenderer::CurrentUnitTargetsTopScreen() const noexcept
{
    if (CurUnit == nullptr)
        return false;

    const u32* currentFramebuffer = Framebuffer[CurUnit->Num];
    for (int buffer = 0; buffer < 2; buffer++)
    {
        if (currentFramebuffer == GPU.Framebuffer[buffer][0].get())
            return true;
        if (currentFramebuffer == GPU.Framebuffer[buffer][1].get())
            return false;
    }

    const bool unitAWritesTop = (GPU.NDS.PowerControl9 & (1u << 15u)) != 0u;
    return CurUnit->Num == 0 ? unitAWritesTop : !unitAWritesTop;
}

void SoftRenderer::MarkStructuredVulkan2DLine(
    u32 line,
    size_t screenIndex,
    u32 plane0,
    u32 plane1,
    u32 control) noexcept
{
    if (line >= kStructuredScreenHeight || screenIndex >= kStructuredScreenCount)
        return;

    const size_t lineIndex = (screenIndex * kStructuredScreenHeight) + static_cast<size_t>(line);
    if (plane0 != 0u || plane1 != 0u || control != 0u)
        StructuredVulkan2DLineHasPayload[lineIndex] = 1u;

    const u32 plane0Alpha = plane0 >> 24u;
    const u32 plane1Alpha = plane1 >> 24u;
    const u32 controlAlpha = control >> 24u;
    if ((plane0Alpha & 0xC0u) == 0x40u
        || (plane1Alpha & 0xC0u) == 0x40u
        || (controlAlpha & kStructuredVulkan2DSlot3DFlag) != 0u)
    {
        StructuredVulkan2DLineHas3DSlot[lineIndex] = 1u;
    }

}

void SoftRenderer::MarkStructuredVulkan2DCaptureLine(
    u32 vramBank,
    u32 captureAddress,
    u32 plane0,
    u32 plane1,
    u32 control) noexcept
{
    if (vramBank >= 4u || captureAddress >= kStructuredPixelCount)
        return;

    const size_t lineIndex =
        (static_cast<size_t>(vramBank) * kStructuredScreenHeight)
            + (static_cast<size_t>(captureAddress) / kStructuredScreenWidth);
    if (plane0 != 0u || plane1 != 0u || control != 0u)
        StructuredVulkan2DCaptureLineHasPayload[lineIndex] = 1u;

    const u32 plane0Alpha = plane0 >> 24u;
    const u32 plane1Alpha = plane1 >> 24u;
    const u32 controlAlpha = control >> 24u;
    if ((plane0Alpha & 0xC0u) == 0x40u
        || (plane1Alpha & 0xC0u) == 0x40u
        || (controlAlpha & kStructuredVulkan2DSlot3DFlag) != 0u)
    {
        StructuredVulkan2DCaptureLineHas3DSlot[lineIndex] = 1u;
    }

}

inline __attribute__((always_inline)) bool SoftRenderer::StoreStructuredVulkan2DPixel(
    size_t index,
    size_t screenBase,
    size_t lineIndex,
    u32 originalVal1,
    u32 originalVal2,
    u32 originalVal3,
    u32 legacyVal1,
    u32 legacyVal2,
    u32 legacyControl,
    u32 captureBacked3DSourceClass,
    bool preserveCaptureBackedReplayAs2D,
    bool evaluateKnownExact)
{
    const size_t directSinkX = index % kStructuredScreenWidth;
    const bool currentLineIsRegularDisplay =
        CurUnit != nullptr
        && (((CurUnit->DispCnt >> 16u) & (CurUnit->Num ? 0x1u : 0x3u)) == 1u);
    u32* const outputPlane0 = DirectCaptureSourceLineSink
        ? StructuredVulkan2DCaptureSourceLine.data() + directSinkX
        : StructuredVulkan2DPlanes + screenBase + index;
    u32* const outputPlane1 = DirectCaptureSourceLineSink
        ? StructuredVulkan2DCaptureSourceLine.data() + kStructuredScreenWidth + directSinkX
        : StructuredVulkan2DPlanes + screenBase + kStructuredPixelCount + index;
    u32* const outputControl = DirectCaptureSourceLineSink
        ? StructuredVulkan2DCaptureSourceLine.data() + (kStructuredScreenWidth * 2u) + directSinkX
        : StructuredVulkan2DPlanes + screenBase + (kStructuredPixelCount * 2u) + index;
    auto markLine =
        [&](u32 plane0, u32 plane1, u32 control) {
            if (DirectCaptureSourceLineSink)
            {
                if (directSinkX == (kStructuredScreenWidth - 1u))
                    DirectCaptureSourceLineSinkComplete = true;
                return false;
            }
            StructuredVulkan2DLinePure3D[lineIndex] = 0u;
            if (plane0 != 0u || plane1 != 0u || control != 0u)
                StructuredVulkan2DLineHasPayload[lineIndex] = 1u;

            const u32 plane0Alpha = plane0 >> 24u;
            const u32 plane1Alpha = plane1 >> 24u;
            const u32 controlAlpha = control >> 24u;
            if ((plane0Alpha & 0xC0u) == 0x40u
                || (plane1Alpha & 0xC0u) == 0x40u
                || (controlAlpha & kStructuredVulkan2DSlot3DFlag) != 0u)
            {
                StructuredVulkan2DLineHas3DSlot[lineIndex] = 1u;
            }
            return evaluateKnownExact
                && StructuredVulkan2DCurrentLineMapsDirectly
                && currentLineIsRegularDisplay
                && StructuredVulkan2DMergePixelResolvesToStructured(
                    legacyVal1,
                    legacyVal2,
                    legacyControl,
                    plane0,
                    plane1,
                    control);
        };

    const u32 flags0 = originalVal1 >> 24u;
    const u32 flags1 = originalVal2 >> 24u;
    const u32 flags2 = originalVal3 >> 24u;
    const bool slotInPlane0 = (flags0 & 0xC0u) == 0x40u;
    const bool slotInPlane1 = (flags1 & 0xC0u) == 0x40u;
    const bool slotInPlane2 = (flags2 & 0xC0u) == 0x40u;
    const bool has3DSlot = slotInPlane0 || slotInPlane1 || slotInPlane2;
    const u32 legacyAlpha = (legacyControl >> 24u) & 0x0Fu;
    const bool legacyCompMode4 = legacyAlpha == 4u;
    const bool legacyCaptureBackedComp4 =
        legacyCompMode4
        && legacyVal1 == kStructuredVulkan2D3DPlaceholder
        && legacyVal2 == kStructuredVulkan2D3DPlaceholder;
    if (!has3DSlot
        && captureBacked3DSourceClass == 0u
        && !legacyCaptureBackedComp4
        && !preserveCaptureBackedReplayAs2D)
    {
        const bool protectedBlack2D = StructuredVulkan2DIsOpaqueBlack(legacyVal1);
        const u32 controlRgb = StructuredVulkan2DControlRgbWithProtectedBlackTarget(
            legacyControl & 0x00FFFFFFu,
            protectedBlack2D,
            CurrentUnitTargetsTopScreen());
        *outputPlane0 = legacyVal1;
        *outputPlane1 = 0u;
        *outputControl =
            controlRgb
            | ((legacyAlpha
                | kStructuredVulkan2DOnlyFlag
                | (protectedBlack2D ? kStructuredVulkan2DProtectedBlackFlag : 0u)) << 24u);
        return markLine(legacyVal1, 0u, *outputControl);
    }
    const u32 sourceClass0 = StructuredVulkan2DSourceClass(originalVal1);
    const u32 sourceClass1 = StructuredVulkan2DSourceClass(originalVal2);
    const u32 sourceClass2 = StructuredVulkan2DSourceClass(originalVal3);
    const bool targetTop = CurrentUnitTargetsTopScreen();
    const bool replayHasReal2DSource =
        StructuredVulkan2DSourceIsReal2D(sourceClass0)
        || StructuredVulkan2DSourceIsReal2D(sourceClass1)
        || StructuredVulkan2DSourceIsReal2D(sourceClass2);
    const bool preserveRegularCaptureOverlayAbove3D =
        preserveCaptureBackedReplayAs2D
        && CurUnit != nullptr
        && CurUnit->Num == 1
        && currentLineIsRegularDisplay
        && captureBacked3DSourceClass == 0u
        && (originalVal1 >> 24u) == 0xD0u
        && originalVal2 == kStructuredVulkan2D3DPlaceholder
        && originalVal3 == 0u
        && legacyVal1 == originalVal1
        && legacyVal2 == 0u
        && legacyControl == 0x07000000u;
    if (preserveRegularCaptureOverlayAbove3D)
    {
        const bool protectedBlack2D = StructuredVulkan2DIsOpaqueBlack(originalVal1);
        const u32 controlRgb = StructuredVulkan2DControlRgbWithProtectedBlackTarget(
            legacyControl & 0x00FFFFFFu,
            protectedBlack2D,
            targetTop);
        const u32 control =
            controlRgb
            | ((legacyAlpha
                | kStructuredVulkan2DSlot3DFlag
                | kStructuredVulkan2DAbove3DFlag
                | (protectedBlack2D ? kStructuredVulkan2DProtectedBlackFlag : 0u)) << 24u);
        *outputPlane0 = 0u;
        *outputPlane1 = originalVal1;
        *outputControl = control;
        return markLine(0u, originalVal1, control);
    }
    if (preserveCaptureBackedReplayAs2D
        && !replayHasReal2DSource
        && !legacyCaptureBackedComp4
        && legacyVal1 != 0u
        && legacyVal1 != kStructuredVulkan2D3DPlaceholder)
    {
        *outputPlane0 = legacyVal1;
        *outputPlane1 = 0u;
        *outputControl =
            (legacyControl & 0x00FFFFFFu)
            | ((legacyAlpha | kStructuredVulkan2DSlot3DFlag) << 24u);
        return markLine(legacyVal1, 0u, *outputControl);
    }
    if (preserveCaptureBackedReplayAs2D && replayHasReal2DSource && !legacyCaptureBackedComp4)
    {
        u32 replayPixel = legacyVal1;
        if (replayPixel == 0u
            || replayPixel == kStructuredVulkan2D3DPlaceholder
            || StructuredVulkan2DIsOpaqueBlack(replayPixel))
        {
            if (StructuredVulkan2DSourceIsReal2D(sourceClass0)
                && originalVal1 != 0u
                && originalVal1 != kStructuredVulkan2D3DPlaceholder)
            {
                replayPixel = originalVal1;
            }
            else if (StructuredVulkan2DSourceIsReal2D(StructuredVulkan2DSourceClass(originalVal2))
                && originalVal2 != 0u
                && originalVal2 != kStructuredVulkan2D3DPlaceholder)
            {
                replayPixel = originalVal2;
            }
            else if (legacyVal2 != 0u && legacyVal2 != kStructuredVulkan2D3DPlaceholder)
            {
                replayPixel = legacyVal2;
            }
        }

        if (replayPixel != 0u && replayPixel != kStructuredVulkan2D3DPlaceholder)
        {
            const bool protectedBlack2D = StructuredVulkan2DIsOpaqueBlack(replayPixel);
            const u32 controlRgb = StructuredVulkan2DControlRgbWithProtectedBlackTarget(
                legacyControl & 0x00FFFFFFu,
                protectedBlack2D,
                targetTop);
            *outputPlane0 = replayPixel;
            *outputPlane1 = 0u;
            *outputControl =
                controlRgb
                | ((legacyAlpha
                    | kStructuredVulkan2DOnlyFlag
                    | (protectedBlack2D ? kStructuredVulkan2DProtectedBlackFlag : 0u)) << 24u);
            return markLine(replayPixel, 0u, *outputControl);
        }
    }
    if (!has3DSlot
        && captureBacked3DSourceClass != 0u
        && sourceClass0 == captureBacked3DSourceClass
        && !legacyCaptureBackedComp4)
    {
        *outputPlane0 = legacyVal2;
        *outputPlane1 = 0u;
        *outputControl =
            (legacyControl & 0x00FFFFFFu)
            | ((legacyAlpha | kStructuredVulkan2DSlot3DFlag) << 24u);
        return markLine(legacyVal2, 0u, *outputControl);
    }
    if (!has3DSlot
        && captureBacked3DSourceClass == 0u
        && !legacyCaptureBackedComp4)
    {
        const bool protectedBlack2D = StructuredVulkan2DIsOpaqueBlack(legacyVal1);
        const u32 controlRgb = StructuredVulkan2DControlRgbWithProtectedBlackTarget(
            legacyControl & 0x00FFFFFFu,
            protectedBlack2D,
            targetTop);
        *outputPlane0 = legacyVal1;
        *outputPlane1 = 0u;
        *outputControl =
            controlRgb
            | ((legacyAlpha
                | kStructuredVulkan2DOnlyFlag
                | (protectedBlack2D ? kStructuredVulkan2DProtectedBlackFlag : 0u)) << 24u);
        return markLine(legacyVal1, 0u, *outputControl);
    }

    const bool captureBackedSlotInPlane0 =
        captureBacked3DSourceClass != 0u
        && sourceClass0 == captureBacked3DSourceClass;
    const bool captureBackedSlotInPlane1 =
        captureBacked3DSourceClass != 0u
        && sourceClass1 == captureBacked3DSourceClass;
    const bool captureBackedSlotInPlane2 =
        captureBacked3DSourceClass != 0u
        && sourceClass2 == captureBacked3DSourceClass;
    const bool hasCaptureBacked3DSlot =
        !has3DSlot
        && (captureBackedSlotInPlane0 || captureBackedSlotInPlane1 || captureBackedSlotInPlane2);

    u32 belowPlane = legacyVal1;
    u32 abovePlane = 0u;
    u32 control = legacyControl;
    bool protectedBlack2D = false;

    if (has3DSlot || hasCaptureBacked3DSlot || legacyCaptureBackedComp4)
    {
        bool hasAbovePlane = false;
        if (legacyCaptureBackedComp4)
        {
            belowPlane = 0u;
        }
        else if (slotInPlane0 || captureBackedSlotInPlane0)
        {
            belowPlane = legacyVal2;
            if (CurUnit != nullptr
                && CurUnit->Num == 1
                && CurrentLineRegularCaptureUses3d
                && StructuredVulkan2DSourceIsReal2D(sourceClass1))
            {
                abovePlane = originalVal2;
                hasAbovePlane = true;
                protectedBlack2D =
                    StructuredVulkan2DSourceIsReal2D(sourceClass1)
                    && StructuredVulkan2DIsOpaqueBlack(abovePlane);
            }
        }
        else if (slotInPlane1 || captureBackedSlotInPlane1)
        {
            belowPlane = legacyVal2;
            if (StructuredVulkan2DSourceIsReal2D(sourceClass0))
            {
                abovePlane = originalVal1;
                hasAbovePlane = true;
                protectedBlack2D =
                    StructuredVulkan2DSourceIsReal2D(sourceClass0)
                    && StructuredVulkan2DIsOpaqueBlack(abovePlane);
            }
        }
        else
        {
            belowPlane = legacyVal1;
            if (StructuredVulkan2DSourceIsReal2D(sourceClass0) || StructuredVulkan2DSourceIsReal2D(sourceClass1))
            {
                abovePlane = legacyVal1;
                hasAbovePlane = true;
                protectedBlack2D =
                    (StructuredVulkan2DSourceIsReal2D(sourceClass0)
                        || StructuredVulkan2DSourceIsReal2D(sourceClass1))
                    && StructuredVulkan2DIsOpaqueBlack(abovePlane);
            }
        }

        const u32 structuredAlpha = legacyAlpha
            | kStructuredVulkan2DSlot3DFlag
            | (hasAbovePlane ? kStructuredVulkan2DAbove3DFlag : 0u);
        const u32 controlRgb = StructuredVulkan2DControlRgbWithProtectedBlackTarget(
            legacyControl & 0x00FFFFFFu,
            protectedBlack2D,
            targetTop);
        control = controlRgb
            | ((structuredAlpha
                | (protectedBlack2D ? kStructuredVulkan2DProtectedBlackFlag : 0u)) << 24u);
    }
    else
    {
        protectedBlack2D =
            (StructuredVulkan2DSourceIsReal2D(sourceClass0)
                || StructuredVulkan2DSourceIsReal2D(sourceClass1)
                || StructuredVulkan2DSourceIsReal2D(sourceClass2))
            && StructuredVulkan2DIsOpaqueBlack(legacyVal1);
        const u32 controlRgb = StructuredVulkan2DControlRgbWithProtectedBlackTarget(
            legacyControl & 0x00FFFFFFu,
            protectedBlack2D,
            targetTop);
        control = controlRgb
            | ((legacyAlpha
                | kStructuredVulkan2DOnlyFlag
                | (protectedBlack2D ? kStructuredVulkan2DProtectedBlackFlag : 0u)) << 24u);
    }

    *outputPlane0 = belowPlane;
    *outputPlane1 = abovePlane;
    *outputControl = control;
    return markLine(belowPlane, abovePlane, control);
}

void SoftRenderer::StoreStructuredVulkan2DCapturePixel(
    u32 vramBank,
    u32 vramAddress,
    u32 originalVal1,
    u32 originalVal2,
    u32 originalVal3,
    u32 legacyVal1,
    u32 legacyVal2,
    u32 legacyControl,
    u32 external3DSourceClass,
    bool external3DSlot,
    bool external3DCoverage,
    bool allowUnclassifiedExternal3DSlot,
    u8 carriedProtectedBlack)
{
    if (vramBank >= 4u || vramAddress >= kStructuredPixelCount)
        return;

    const size_t screenBase =
        static_cast<size_t>(vramBank) * kStructuredPlaneCount * kStructuredPixelCount;
    const u32 line = vramAddress / kStructuredScreenWidth;
    const u32 x = vramAddress % kStructuredScreenWidth;
    const size_t screenIndex =
        screenBase
        + (static_cast<size_t>(line) * kStructuredScreenWidth)
        + static_cast<size_t>(x);
    const size_t pixelOffset = screenIndex - screenBase;
    const size_t overlayLineageIndex =
        (static_cast<size_t>(vramBank) * kStructuredPixelCount) + pixelOffset;
    const size_t lineValidIndex =
        (static_cast<size_t>(vramBank) * kStructuredScreenHeight) + line;
    const u32 sourceClass0 = StructuredVulkan2DSourceClass(originalVal1);
    const u32 sourceClass1 = StructuredVulkan2DSourceClass(originalVal2);
    const u32 sourceClass2 = StructuredVulkan2DSourceClass(originalVal3);
    const bool targetTop = CurrentUnitTargetsTopScreen();
    const bool slotInPlane0 = StructuredVulkan2DHas3DSlot(originalVal1);
    const bool slotInPlane1 = StructuredVulkan2DHas3DSlot(originalVal2);
    const bool slotInPlane2 = StructuredVulkan2DHas3DSlot(originalVal3);
    const bool has3DSlot = slotInPlane0 || slotInPlane1 || slotInPlane2;
    const u32 legacyAlpha = (legacyControl >> 24u) & 0x0Fu;
    u32 existingBelowPlane = StructuredVulkan2DCapturePlanes[screenIndex];
    u32 existingAbovePlane =
        StructuredVulkan2DCapturePlanes[
            screenBase + kStructuredPixelCount + pixelOffset];
    u32 existingControl =
        StructuredVulkan2DCapturePlanes[
            screenBase + (kStructuredPixelCount * 2u) + pixelOffset];
    const u8 existingOverlayLineage =
        StructuredVulkan2DCaptureOverlayLineage[overlayLineageIndex];
    const u32 existingControlAlpha = existingControl >> 24u;
    const bool existingHasStructuredAbove =
        (existingControlAlpha & kStructuredVulkan2DSlot3DFlag) != 0u
        && (existingControlAlpha & kStructuredVulkan2DAbove3DFlag) != 0u
        && existingAbovePlane != 0u;
    u32 existingOverlayPixel = 0u;
    u32 existingOverlayControl = 0u;
    if (StructuredVulkan2DCaptureLineValid[lineValidIndex] != 0u
        && existingControlAlpha != 0u)
    {
        const bool existingHasStructuredSlot =
            (existingControlAlpha & kStructuredVulkan2DSlot3DFlag) != 0u;
        if (existingHasStructuredSlot
            && (existingControlAlpha & kStructuredVulkan2DAbove3DFlag) != 0u
            && existingAbovePlane != 0u
            && StructuredVulkan2DCanPreserveCaptureOverlay(existingAbovePlane))
        {
            existingOverlayPixel = existingAbovePlane;
            existingOverlayControl = existingControl;
        }
        else if (!existingHasStructuredSlot
            && (existingControlAlpha & kStructuredVulkan2DOnlyFlag) != 0u)
        {
            if (existingBelowPlane != 0u
                && StructuredVulkan2DCanPreserveCaptureOverlay(existingBelowPlane))
            {
                existingOverlayPixel = existingBelowPlane;
                existingOverlayControl = existingControl;
            }
        }
    }
    if (external3DSlot
        && external3DSourceClass == 0u
        && !allowUnclassifiedExternal3DSlot
        && !StructuredVulkan2DSourceIsReal2D(sourceClass0)
        && !StructuredVulkan2DSourceIsReal2D(sourceClass1)
        && !StructuredVulkan2DSourceIsReal2D(sourceClass2)
        && legacyVal1 != 0u
        && legacyVal1 != kStructuredVulkan2D3DPlaceholder)
    {
        const bool protectedBlack2D = StructuredVulkan2DIsOpaqueBlack(legacyVal1);
        const u32 controlRgb = StructuredVulkan2DControlRgbWithProtectedBlackTarget(
            legacyControl & 0x00FFFFFFu,
            protectedBlack2D,
            targetTop);
        const u32 control =
            controlRgb
            | ((legacyAlpha
                | kStructuredVulkan2DOnlyFlag
                | (protectedBlack2D ? kStructuredVulkan2DProtectedBlackFlag : 0u)) << 24u);

        if (StructuredVulkan2DCaptureLineValid[lineValidIndex] == 0u)
            LastDebugCaptureStats.StructuredCopyLines++;
        LastDebugCaptureStats.StructuredCopyPlane0UsefulPixels++;
        LastDebugCaptureStats.StructuredCopy2DOnlyPixels++;

        StructuredVulkan2DCapturePlanes[screenIndex] = legacyVal1;
        StructuredVulkan2DCapturePlanes[
            screenBase + kStructuredPixelCount + pixelOffset] = 0u;
        StructuredVulkan2DCapturePlanes[
            screenBase + (kStructuredPixelCount * 2u) + pixelOffset] = control;
        StructuredVulkan2DCaptureOverlayLineage[overlayLineageIndex] =
            kStructuredVulkan2DOverlayLineageFresh;
        StructuredVulkan2DCaptureLineValid[lineValidIndex] = 1u;
        MarkStructuredVulkan2DCaptureLine(
            vramBank,
            vramAddress,
            legacyVal1,
            0u,
            control);
        return;
    }

    if (!has3DSlot
        && external3DSlot
        && legacyAlpha == 4u
        && (external3DSourceClass != 0u || allowUnclassifiedExternal3DSlot))
    {
        const u32 structuredAlpha =
            legacyAlpha
            | kStructuredVulkan2DSlot3DFlag
            | (!external3DCoverage ? kStructuredVulkan2DNo3DCoverageFlag : 0u);
        const u32 control = (legacyControl & 0x00FFFFFFu) | (structuredAlpha << 24u);

        if (StructuredVulkan2DCaptureLineValid[lineValidIndex] == 0u)
            LastDebugCaptureStats.StructuredCopyLines++;
        if (legacyVal2 != 0u)
            LastDebugCaptureStats.StructuredCopyPlane0UsefulPixels++;
        LastDebugCaptureStats.StructuredCopySlotPixels++;

        StructuredVulkan2DCapturePlanes[screenIndex] = legacyVal2;
        StructuredVulkan2DCapturePlanes[
            screenBase + kStructuredPixelCount + pixelOffset] = 0u;
        StructuredVulkan2DCapturePlanes[
            screenBase + (kStructuredPixelCount * 2u) + pixelOffset] = control;
        StructuredVulkan2DCaptureOverlayLineage[overlayLineageIndex] =
            kStructuredVulkan2DOverlayLineageUnknown;
        StructuredVulkan2DCaptureLineValid[lineValidIndex] = 1u;
        MarkStructuredVulkan2DCaptureLine(
            vramBank,
            vramAddress,
            legacyVal2,
            0u,
            control);
        return;
    }

    const bool hasExternal3DSlot =
        !has3DSlot
        && external3DSlot
        && (external3DSourceClass != 0u || allowUnclassifiedExternal3DSlot);

    u32 captureBacked3DSourceClass = 0u;
    if (!has3DSlot && !hasExternal3DSlot)
    {
        if (sourceClass0 != 0x10u && sourceClass0 != 0u)
            captureBacked3DSourceClass = sourceClass0;
        else if (sourceClass1 != 0x10u && sourceClass1 != 0u)
            captureBacked3DSourceClass = sourceClass1;
        else if (sourceClass2 != 0x10u && sourceClass2 != 0u)
            captureBacked3DSourceClass = sourceClass2;
    }

    const bool captureBackedSlotInPlane0 =
        captureBacked3DSourceClass != 0u
        && sourceClass0 == captureBacked3DSourceClass;
    const bool captureBackedSlotInPlane1 =
        captureBacked3DSourceClass != 0u
        && sourceClass1 == captureBacked3DSourceClass;
    const bool captureBackedSlotInPlane2 =
        captureBacked3DSourceClass != 0u
        && sourceClass2 == captureBacked3DSourceClass;
    const bool hasCaptureBacked3DSlot =
        !has3DSlot
        && !hasExternal3DSlot
        && (captureBackedSlotInPlane0 || captureBackedSlotInPlane1 || captureBackedSlotInPlane2);

    u32 belowPlane = legacyVal1;
    u32 abovePlane = 0u;
    u32 control = legacyControl;
    bool usedExistingOverlay = false;
    const bool legacyCompMode4 = legacyAlpha == 4u;
    const bool legacyCaptureBackedComp4 =
        legacyCompMode4
        && legacyVal1 == kStructuredVulkan2D3DPlaceholder
        && legacyVal2 == kStructuredVulkan2D3DPlaceholder;
    bool protectedBlack2D = false;
    bool protectedBlackTargetTop = targetTop;
    if (has3DSlot || hasExternal3DSlot || hasCaptureBacked3DSlot || legacyCaptureBackedComp4)
    {
        bool hasAbovePlane = false;
        if (legacyCaptureBackedComp4)
        {
            belowPlane = 0u;
        }
        else if (hasExternal3DSlot)
        {
            belowPlane = legacyVal2;
            if ((legacyAlpha == 1u || legacyAlpha == 2u || legacyAlpha == 3u)
                && StructuredVulkan2DCanPreserveCaptureOverlay(originalVal1))
            {
                abovePlane = originalVal1;
                hasAbovePlane = true;
                protectedBlack2D = StructuredVulkan2DIsOpaqueBlack(abovePlane);
            }
            else if (
                legacyAlpha == 7u
                && existingHasStructuredAbove
                && existingAbovePlane == legacyVal1)
            {
                abovePlane = existingAbovePlane;
                hasAbovePlane = true;
                usedExistingOverlay = true;
                protectedBlack2D =
                    (existingControlAlpha & kStructuredVulkan2DProtectedBlackFlag) != 0u;
                protectedBlackTargetTop =
                    (existingControl & kStructuredVulkan2DProtectedBlackTargetsBottomFlag) == 0u;
            }
            else if (
                legacyAlpha == 7u
                && external3DSourceClass != 0u
                && sourceClass0 != external3DSourceClass
                && StructuredVulkan2DSourceIsReal2D(sourceClass0))
            {
                abovePlane = originalVal1;
                hasAbovePlane = true;
                protectedBlack2D =
                    StructuredVulkan2DSourceIsReal2D(sourceClass0)
                    && StructuredVulkan2DIsOpaqueBlack(abovePlane);
            }
            else if (
                slotInPlane0
                && StructuredVulkan2DCanPreserveCaptureOverlay(originalVal2))
            {
                abovePlane = originalVal2;
                hasAbovePlane = true;
                protectedBlack2D =
                    StructuredVulkan2DSourceIsReal2D(sourceClass1)
                    && StructuredVulkan2DIsOpaqueBlack(abovePlane);
            }
        }
        else if (external3DSlot && slotInPlane0)
        {
            belowPlane = legacyVal2;
            if (StructuredVulkan2DSourceIsReal2D(sourceClass1))
            {
                abovePlane = legacyVal2;
                hasAbovePlane = true;
                protectedBlack2D =
                    StructuredVulkan2DSourceIsReal2D(sourceClass1)
                    && StructuredVulkan2DIsOpaqueBlack(abovePlane);
            }
        }
        else if (slotInPlane0 || captureBackedSlotInPlane0)
        {
            belowPlane = legacyVal2;
            if (StructuredVulkan2DCanPreserveCaptureOverlay(originalVal2))
            {
                abovePlane = originalVal2;
                hasAbovePlane = true;
                protectedBlack2D =
                    StructuredVulkan2DSourceIsReal2D(sourceClass1)
                    && StructuredVulkan2DIsOpaqueBlack(abovePlane);
            }
        }
        else if (slotInPlane1 || captureBackedSlotInPlane1)
        {
            belowPlane = legacyVal2;
            if (StructuredVulkan2DSourceIsReal2D(sourceClass0))
            {
                abovePlane = originalVal1;
                hasAbovePlane = true;
                protectedBlack2D =
                    StructuredVulkan2DSourceIsReal2D(sourceClass0)
                    && StructuredVulkan2DIsOpaqueBlack(abovePlane);
            }
        }
        else
        {
            belowPlane = legacyVal1;
            if (StructuredVulkan2DSourceIsReal2D(sourceClass0) || StructuredVulkan2DSourceIsReal2D(sourceClass1))
            {
                abovePlane = legacyVal1;
                hasAbovePlane = true;
                protectedBlack2D =
                    (StructuredVulkan2DSourceIsReal2D(sourceClass0)
                        || StructuredVulkan2DSourceIsReal2D(sourceClass1))
                    && StructuredVulkan2DIsOpaqueBlack(abovePlane);
            }
        }
        const bool dropCarriedProtectedBlackOverlay =
            (carriedProtectedBlack & kStructuredVulkan2DCarriedProtectedBlack) != 0u
            && legacyAlpha == 4u
            && StructuredVulkan2DIsUnblendedProtectedBlackTargetBottom(
                existingOverlayPixel,
                existingOverlayControl);
        if (!hasAbovePlane
            && !dropCarriedProtectedBlackOverlay
            && existingOverlayPixel != 0u
            && StructuredVulkan2DCanPreserveCaptureOverlay(existingOverlayPixel))
        {
            abovePlane = existingOverlayPixel;
            hasAbovePlane = true;
            usedExistingOverlay = true;
            protectedBlack2D =
                ((existingOverlayControl >> 24u) & kStructuredVulkan2DProtectedBlackFlag) != 0u
                || StructuredVulkan2DIsOpaqueBlack(abovePlane);
            protectedBlackTargetTop =
                (existingOverlayControl & kStructuredVulkan2DProtectedBlackTargetsBottomFlag) == 0u;
        }

        const u32 structuredAlpha = legacyAlpha
            | kStructuredVulkan2DSlot3DFlag
            | (hasAbovePlane ? kStructuredVulkan2DAbove3DFlag : 0u)
            | (external3DSlot && !external3DCoverage ? kStructuredVulkan2DNo3DCoverageFlag : 0u);
        const u32 controlRgb = StructuredVulkan2DControlRgbWithProtectedBlackTarget(
            legacyControl & 0x00FFFFFFu,
            protectedBlack2D,
            protectedBlackTargetTop);
        control = controlRgb
            | ((structuredAlpha
                | (protectedBlack2D ? kStructuredVulkan2DProtectedBlackFlag : 0u)) << 24u);
    }
    else
    {
        protectedBlack2D =
            (StructuredVulkan2DSourceIsReal2D(sourceClass0)
                || StructuredVulkan2DSourceIsReal2D(sourceClass1)
                || StructuredVulkan2DSourceIsReal2D(sourceClass2))
            && StructuredVulkan2DIsOpaqueBlack(legacyVal1);
        const u32 controlRgb = StructuredVulkan2DControlRgbWithProtectedBlackTarget(
            legacyControl & 0x00FFFFFFu,
            protectedBlack2D,
            targetTop);
        control = controlRgb
            | ((legacyAlpha
                | kStructuredVulkan2DOnlyFlag
                | (protectedBlack2D ? kStructuredVulkan2DProtectedBlackFlag : 0u)) << 24u);
    }

    if (StructuredVulkan2DCaptureLineValid[lineValidIndex] == 0u)
        LastDebugCaptureStats.StructuredCopyLines++;
    if (belowPlane != 0u)
        LastDebugCaptureStats.StructuredCopyPlane0UsefulPixels++;
    if (abovePlane != 0u)
        LastDebugCaptureStats.StructuredCopyPlane1UsefulPixels++;
    const u32 controlAlpha = control >> 24u;
    const bool structuredSlot =
        (controlAlpha & kStructuredVulkan2DSlot3DFlag) != 0u;
    if (structuredSlot)
        LastDebugCaptureStats.StructuredCopySlotPixels++;
    if (structuredSlot && (controlAlpha & kStructuredVulkan2DAbove3DFlag) != 0u)
        LastDebugCaptureStats.StructuredCopyAbovePixels++;
    if (!structuredSlot && (controlAlpha & kStructuredVulkan2DOnlyFlag) != 0u)
        LastDebugCaptureStats.StructuredCopy2DOnlyPixels++;

    StructuredVulkan2DCapturePlanes[screenIndex] = belowPlane;
    StructuredVulkan2DCapturePlanes[
        screenBase + kStructuredPixelCount + pixelOffset] = abovePlane;
    StructuredVulkan2DCapturePlanes[
        screenBase + (kStructuredPixelCount * 2u) + pixelOffset] = control;
    StructuredVulkan2DCaptureOverlayLineage[overlayLineageIndex] =
        !StructuredVulkan2DHasPreservableCaptureOverlay(
            belowPlane,
            abovePlane,
            control)
        ? kStructuredVulkan2DOverlayLineageUnknown
        : usedExistingOverlay
            ? AdvanceStructuredVulkan2DOverlayLineage(existingOverlayLineage)
            : kStructuredVulkan2DOverlayLineageFresh;
    StructuredVulkan2DCaptureLineValid[lineValidIndex] = 1u;
    MarkStructuredVulkan2DCaptureLine(
        vramBank,
        vramAddress,
        belowPlane,
        abovePlane,
        control);
}


void SoftRenderer::DrawScanlineActivePipeline(u32 line, Unit* unit)
{
    CurUnit = unit;
    _3DLine = nullptr;
    CurrentLineRegularCaptureUses3d = false;
    DirectCaptureSourceLineSink = false;
    DirectCaptureSourceLineSinkComplete = false;
    DirectCaptureDeferredTail = false;

    int stride = GPU.GPU3D.IsRendererAccelerated() ? (256*3 + 1) : 256;
    u32* dst = &Framebuffer[CurUnit->Num][stride * line];

    int n3dline = line;
    line = GPU.VCount;
    StructuredVulkan2DCurrentLineTargetsTop = CurrentUnitTargetsTopScreen();
    StructuredVulkan2DCurrentLineY =
        line < kStructuredScreenHeight ? line : kStructuredScreenHeight;
    StructuredVulkan2DCurrentLineMapsDirectly =
        n3dline == static_cast<int>(line)
        && n3dline >= 0
        && n3dline < static_cast<int>(kStructuredScreenHeight);
    if (n3dline >= 0 && n3dline < static_cast<int>(kStructuredScreenHeight))
    {
        const size_t physicalScreenIndex =
            StructuredVulkan2DCurrentLineTargetsTop ? 0u : 1u;
        const size_t physicalLineIndex =
            (physicalScreenIndex * kStructuredScreenHeight)
            + static_cast<size_t>(n3dline);
        StructuredVulkan2DLineKnownExact[physicalLineIndex] = 0u;
        StructuredVulkan2DDisplayedCaptureIdentity[physicalLineIndex] = {};
    }

    bool forceblank = false;

    // scanlines that end up outside of the GPU drawing range
    // (as a result of writing to VCount) are filled white
    if (line > 192) forceblank = true;

    // GPU B can be completely disabled by POWCNT1
    // oddly that's not the case for GPU A
    if (CurUnit->Num && !CurUnit->Enabled) forceblank = true;

    const bool useStructuredVulkan2D = UseStructuredVulkan2D();

    if (useStructuredVulkan2D && CurUnit->Num == 0 && line == 0)
    {
        CaptureLineUses3d.fill(0);
        if (FramesSinceLastCapture < 255u)
            FramesSinceLastCapture++;
    }

    if (line == 0 && CurUnit->CaptureCnt & (1 << 31) && !forceblank)
        CurUnit->CaptureLatch = true;

    if (CurUnit->Num == 0)
    {
        if (!GPU.GPU3D.IsRendererAccelerated())
            _3DLine = GPU.GPU3D.GetLine(n3dline);
        else if (!useStructuredVulkan2D && CurUnit->CaptureLatch && (((CurUnit->CaptureCnt >> 29) & 0x3) != 1))
            _3DLine = GPU.GPU3D.GetLine(n3dline);
    }

    if (forceblank)
    {
        ClearStructuredVulkan2DLine(line);
        for (int i = 0; i < 256; i++)
            dst[i] = 0xFFFFFFFF;

        if (GPU.GPU3D.IsRendererAccelerated())
        {
            dst[256*3] = 0;
        }
        return;
    }

    u32 dispmode = CurUnit->DispCnt >> 16;
    dispmode &= (CurUnit->Num ? 0x1 : 0x3);
    u32 masterBrightness = CurUnit->MasterBrightness;

    const u32 directSinkCaptureCnt = CurUnit->CaptureCnt;
    const u32 directSinkDstBank = (directSinkCaptureCnt >> 16u) & 0x3u;
    DirectCaptureSourceLineSink =
        useStructuredVulkan2D
        && CurUnit->Num == 0
        && CurUnit->CaptureLatch
        && (directSinkCaptureCnt & (1u << 31u)) != 0u
        && ((directSinkCaptureCnt >> 29u) & 0x3u) == 0u
        && (directSinkCaptureCnt & (1u << 24u)) == 0u
        && ((directSinkCaptureCnt >> 20u) & 0x3u) == 3u
        && ((directSinkCaptureCnt >> 18u) & 0x3u) == 0u
        && (GPU.VRAMMap_LCDC & (1u << directSinkDstBank)) != 0u
        && dispmode == 2u
        && (CurUnit->DispCnt & (1u << 7u)) == 0u
        && n3dline == static_cast<int>(line);

    auto capturePure3DLineIfNeeded = [&]() {
        if (!CurUnit->CaptureLatch)
            return;

        constexpr u32 kPure3DControl = kStructuredVulkan2DSlot3DFlag << 24u;
        std::fill_n(BGOBJLine, 256, 0x40000000u);
        std::fill_n(BGOBJLine + 256, 256, 0u);
        std::fill_n(BGOBJLine + 512, 256, kPure3DControl);
        SaveStructuredVulkan2DCaptureSourceLine(line);

        u32 capwidth = 128u;
        u32 capheight = 128u;
        switch ((CurUnit->CaptureCnt >> 20) & 0x3)
        {
        case 0: capwidth = 128; capheight = 128; break;
        case 1: capwidth = 256; capheight = 64;  break;
        case 2: capwidth = 256; capheight = 128; break;
        case 3: capwidth = 256; capheight = 192; break;
        }

        if (line < capheight)
            DoCapture(line, capwidth, static_cast<u32>(n3dline));
    };

    if (!CurUnit->CaptureLatch && CanUseStructuredVulkan2DPure3DLine(dispmode))
    {
        FillStructuredVulkan2DPure3DLine(line, dst, masterBrightness);
        CurUnit->UpdateMosaicCounters(line);
        capturePure3DLineIfNeeded();

        return;
    }

    ClearStructuredVulkan2DLine(line);

    // always render regular graphics
    if (CurUnit->Num == 0)
    {
        auto bgDirty = GPU.VRAMDirty_ABG.DeriveState(GPU.VRAMMap_ABG, GPU);
        GPU.MakeVRAMFlat_ABGCoherent(bgDirty);
        auto bgExtPalDirty = GPU.VRAMDirty_ABGExtPal.DeriveState(GPU.VRAMMap_ABGExtPal, GPU);
        GPU.MakeVRAMFlat_ABGExtPalCoherent(bgExtPalDirty);
        auto objExtPalDirty = GPU.VRAMDirty_AOBJExtPal.DeriveState(&GPU.VRAMMap_AOBJExtPal, GPU);
        GPU.MakeVRAMFlat_AOBJExtPalCoherent(objExtPalDirty);
    }
    else
    {
        auto bgDirty = GPU.VRAMDirty_BBG.DeriveState(GPU.VRAMMap_BBG, GPU);
        GPU.MakeVRAMFlat_BBGCoherent(bgDirty);
        auto bgExtPalDirty = GPU.VRAMDirty_BBGExtPal.DeriveState(GPU.VRAMMap_BBGExtPal, GPU);
        GPU.MakeVRAMFlat_BBGExtPalCoherent(bgExtPalDirty);
        auto objExtPalDirty = GPU.VRAMDirty_BOBJExtPal.DeriveState(&GPU.VRAMMap_BOBJExtPal, GPU);
        GPU.MakeVRAMFlat_BOBJExtPalCoherent(objExtPalDirty);
    }

    DrawScanline_BGOBJ(line);
    CurUnit->UpdateMosaicCounters(line);
    if (DirectCaptureDeferredTail)
    {
        StructuredVulkan2DCaptureSourceLineValid = false;
    }
    else if (DirectCaptureSourceLineSink && DirectCaptureSourceLineSinkComplete)
    {
        StructuredVulkan2DCaptureSourceLineY = line;
        StructuredVulkan2DCaptureSourceLineValid = true;
    }
    else if (useStructuredVulkan2D && CurUnit->Num == 0 && CurUnit->CaptureLatch)
        SaveStructuredVulkan2DCaptureSourceLine(line);

    switch (dispmode)
    {
    case 0: // screen off
        {
            for (int i = 0; i < 256; i++)
                dst[i] = 0x003F3F3F;
        }
        break;

    case 1: // regular display
        {
            int i = 0;
            for (; i < (stride & ~1); i+=2)
                *(u64*)&dst[i] = *(u64*)&BGOBJLine[i];
        }
        break;

    case 2: // VRAM display
        {
            u32 vrambank = (CurUnit->DispCnt >> 18) & 0x3;
            if (line == 0u && useStructuredVulkan2D)
            {
                const u32 captureCnt = CurUnit->CaptureCnt;
                const bool sameBankMode2Tuple =
                    CurUnit->Num == 0u
                    && ((CurUnit->DispCnt >> 16u) & 0x3u) == 2u
                    && ((captureCnt >> 29u) & 0x3u) == 2u
                    && ((captureCnt >> 20u) & 0x3u) == 3u
                    && (captureCnt & (1u << 25u)) == 0u
                    && ((captureCnt >> 16u) & 0x3u) == vrambank
                    && (captureCnt & 0x1Fu) != 0u
                    && ((captureCnt >> 8u) & 0x1Fu) != 0u
                    && (GPU.VRAMMap_LCDC & (1u << vrambank)) != 0u;
                if (sameBankMode2Tuple)
                {
                    const StructuredVulkan2DCaptureBankIdentity bankIdentity =
                        GetStructuredVulkan2DCaptureBankIdentity(vrambank);
                    SameBankMode2DisplayedVramBank = vrambank;
                    SameBankMode2DisplayedIdentity =
                        SameBankMode2WriterIdentity[vrambank];
                    SameBankMode2DisplayedIdentityValid =
                        SameBankMode2WriterIdentityValid[vrambank]
                        && SameBankMode2DisplayedIdentity.Valid
                        && bankIdentity.Valid
                        && bankIdentity.VramBank == vrambank
                        && bankIdentity.Source.Valid
                        && bankIdentity.Source.Sequence
                            == SameBankMode2DisplayedIdentity.Sequence
                        && bankIdentity.Source.PolygonCount
                            == SameBankMode2DisplayedIdentity.PolygonCount
                        && bankIdentity.Source.CaptureCnt
                            == SameBankMode2DisplayedIdentity.CaptureCnt
                        && bankIdentity.Source.ScreenSwap
                            == SameBankMode2DisplayedIdentity.ScreenSwap;
                }
            }
            if (GPU.VRAMMap_LCDC & (1<<vrambank))
            {
                u16* vram = (u16*)GPU.VRAM[vrambank];
                vram = &vram[line * 256];

                for (int i = 0; i < 256; i++)
                {
                    u16 color = vram[i];
                    u8 r = (color & 0x001F) << 1;
                    u8 g = (color & 0x03E0) >> 4;
                    u8 b = (color & 0x7C00) >> 9;

                    dst[i] = r | (g << 8) | (b << 16);
                }
                const u16* vramLineForStructured = vram;
                if (useStructuredVulkan2D)
                {
                    if (activeVulkan2DPipelineStrategy()
                            .UsesHistoricalVramDisplayCopy())
                    {
                        CopyStructuredVulkan2DCaptureLineToCurrentScreenCompatibility(
                            line,
                            vrambank);
                    }
                    else
                    {
                    const size_t captureLineIndex =
                        (static_cast<size_t>(vrambank) * kStructuredScreenHeight) + line;
                    bool mirrorRepresentsBank = false;
                    if (line < kStructuredScreenHeight
                        && StructuredVulkan2DCaptureLineValid[captureLineIndex] != 0u)
                    {
                        if (StructuredVulkan2DCaptureLineHas3DSlot[captureLineIndex] != 0u
                            && line < CaptureLineUses3d.size()
                            && CaptureLineUses3d[line] != 0)
                        {
                            mirrorRepresentsBank = true;
                        }
                        else
                        {
                            const size_t captureBase =
                                static_cast<size_t>(vrambank) * kStructuredPlaneCount * kStructuredPixelCount;
                            const u32* mirrorBelow = StructuredVulkan2DCapturePlanes.data()
                                + captureBase
                                + (static_cast<size_t>(line) * kStructuredScreenWidth);
                            u32 visible = 0;
                            u32 matches = 0;
                            for (size_t x = 0; x < kStructuredScreenWidth; x += 4)
                            {
                                const u32 mirror = mirrorBelow[x];
                                if ((mirror >> 24u) == 0u)
                                    continue;
                                visible++;
                                const u16 value = vramLineForStructured[x];
                                const u32 r5 = value & 0x1Fu;
                                const u32 g5 = (value >> 5u) & 0x1Fu;
                                const u32 b5 = (value >> 10u) & 0x1Fu;
                                const u32 bank = ((r5 << 1u) | (r5 >> 4u))
                                    | (((g5 << 1u) | (g5 >> 4u)) << 8u)
                                    | (((b5 << 1u) | (b5 >> 4u)) << 16u);
                                const int dr = static_cast<int>(mirror & 0xFFu) - static_cast<int>(bank & 0xFFu);
                                const int dg = static_cast<int>((mirror >> 8u) & 0xFFu) - static_cast<int>((bank >> 8u) & 0xFFu);
                                const int db = static_cast<int>((mirror >> 16u) & 0xFFu) - static_cast<int>((bank >> 16u) & 0xFFu);
                                if (dr >= -2 && dr <= 2 && dg >= -2 && dg <= 2 && db >= -2 && db <= 2)
                                    matches++;
                            }
                            mirrorRepresentsBank = visible >= 48u && matches * 20u >= visible * 19u;
                            if (!mirrorRepresentsBank
                                && line < kStructuredScreenHeight
                                && StructuredVulkan2DCaptureLineHas3DSlot[captureLineIndex] != 0u
                                && FramesSinceLastCapture <= 2u)
                            {
                                u32 bankReal = 0;
                                u32 bankSampled = 0;
                                for (size_t x = 0; x < kStructuredScreenWidth; x += 8)
                                {
                                    bankSampled++;
                                    const u16 value = vramLineForStructured[x];
                                    if ((value & 0x8000u) != 0u && (value & 0x7FFFu) != 0u)
                                        bankReal++;
                                }
                                if (bankReal * 4u >= bankSampled)
                                    mirrorRepresentsBank = true;
                            }
                        }
                    }
                    if (mirrorRepresentsBank)
                        CopyStructuredVulkan2DCaptureLineToCurrentScreen(line, vrambank, dst);
                    else
                        FillStructuredVulkan2DVramDisplayLine(line, vram);
                    }
                }
            }
            else
            {
                for (int i = 0; i < 256; i++)
                {
                    dst[i] = 0;
                }
                if (useStructuredVulkan2D)
                    FillStructuredVulkan2DVramDisplayLine(line, nullptr);
            }
        }
        break;

    case 3: // FIFO display
        {
            for (int i = 0; i < 256; i++)
            {
                u16 color = CurUnit->DispFIFOBuffer[i];
                u8 r = (color & 0x001F) << 1;
                u8 g = (color & 0x03E0) >> 4;
                u8 b = (color & 0x7C00) >> 9;

                dst[i] = r | (g << 8) | (b << 16);
            }
        }
        break;
    }

    // capture
    if ((CurUnit->Num == 0) && CurUnit->CaptureLatch)
    {
        u32 capwidth, capheight;
        switch ((CurUnit->CaptureCnt >> 20) & 0x3)
        {
        case 0: capwidth = 128; capheight = 128; break;
        case 1: capwidth = 256; capheight = 64;  break;
        case 2: capwidth = 256; capheight = 128; break;
        case 3: capwidth = 256; capheight = 192; break;
        }

        if (line < capheight)
            DoCapture(line, capwidth, static_cast<u32>(n3dline));
    }

    if (GPU.GPU3D.IsRendererAccelerated())
    {
        constexpr u32 kMetaFlagRegularCaptureUses3d = 1u << 21u;
        constexpr u32 kMetaFlagVramCaptureUses3d = 1u << 22u;
        constexpr u32 kMetaFlagExactRegularCaptureUses3d = 1u << 19u;
        u32 xpos = GPU.GPU3D.GetRenderXPos();
        u32 rendererMetaFlags = 0;
        const u32 engineACaptureCnt = GPU.GPU2D_A.CaptureCnt;
        const bool captureConfiguredFullScreen =
            (engineACaptureCnt & (1u << 31u)) != 0u
            && ((engineACaptureCnt >> 20u) & 0x3u) == 3u;
        const bool structuredLineHas3DSlot =
            useStructuredVulkan2D
            && line < kStructuredScreenHeight
            && StructuredVulkan2DLineHas3DSlot[
                ((StructuredVulkan2DCurrentLineTargetsTop ? 0u : 1u) * kStructuredScreenHeight)
                    + static_cast<size_t>(line)] != 0u;
        const u32 captureDstVram = (engineACaptureCnt >> 16u) & 0x3u;
        const u32 displayVram = (CurUnit->DispCnt >> 18u) & 0x3u;
        const u32 captureMode = (engineACaptureCnt >> 29u) & 0x3u;
        const u32 captureEva = engineACaptureCnt & 0x1Fu;
        const u32 captureEvb = (engineACaptureCnt >> 8u) & 0x1Fu;
        const bool fullSameBankBlendCaptureReplay =
            CurUnit->Num == 0u
            && dispmode == 2u
            && captureMode == 2u
            && ((engineACaptureCnt >> 20u) & 0x3u) == 3u
            && (engineACaptureCnt & (1u << 25u)) == 0u
            && captureDstVram == displayVram
            && captureEva != 0u
            && captureEvb != 0u
            && (GPU.VRAMMap_LCDC & (1u << displayVram)) != 0u;
        const bool captureLineHas3DSlot =
            useStructuredVulkan2D
            && line < kStructuredScreenHeight
            && captureDstVram < 4u
            && StructuredVulkan2DCaptureLineHas3DSlot[
                (static_cast<size_t>(captureDstVram) * kStructuredScreenHeight)
                    + static_cast<size_t>(line)] != 0u;

        if (useStructuredVulkan2D && dispmode == 2)
        {
            if (line < CaptureLineUses3d.size()
                && CaptureLineUses3d[line] != 0
                && (structuredLineHas3DSlot || fullSameBankBlendCaptureReplay))
            {
                rendererMetaFlags |= kMetaFlagVramCaptureUses3d;
            }
        }
        else if (useStructuredVulkan2D && dispmode == 1)
        {
            const bool broadCaptureLineUses3d =
                CurUnit->Num == 1
                && captureConfiguredFullScreen
                && line < CaptureLineUses3d.size()
                && CaptureLineUses3d[line] != 0
                && captureLineHas3DSlot;
            if (CurrentLineRegularCaptureUses3d || broadCaptureLineUses3d)
            {
                rendererMetaFlags |= kMetaFlagRegularCaptureUses3d;
                if (CurrentLineRegularCaptureUses3d)
                    rendererMetaFlags |= kMetaFlagExactRegularCaptureUses3d;
            }
        }

        dst[256*3] = masterBrightness |
                     (CurUnit->DispCnt & 0x30000) |
                     rendererMetaFlags |
                     (xpos << 24) | ((xpos & 0x100) << 15);
        return;
    }

    // master brightness
    if (dispmode != 0)
    {
        if ((masterBrightness >> 14) == 1)
        {
            // up
            u32 factor = masterBrightness & 0x1F;
            if (factor > 16) factor = 16;

            for (int i = 0; i < 256; i++)
            {
                dst[i] = ColorBrightnessUp(dst[i], factor, 0x0);
            }
        }
        else if ((masterBrightness >> 14) == 2)
        {
            // down
            u32 factor = masterBrightness & 0x1F;
            if (factor > 16) factor = 16;

            for (int i = 0; i < 256; i++)
            {
                dst[i] = ColorBrightnessDown(dst[i], factor, 0xF);
            }
        }
    }

    // convert to 32-bit BGRA
    // note: 32-bit RGBA would be more straightforward, but
    // BGRA seems to be more compatible (Direct2D soft, cairo...)
    for (int i = 0; i < 256; i+=2)
    {
        u64 c = *(u64*)&dst[i];

        u64 r = (c << 18) & 0xFC000000FC0000;
        u64 g = (c << 2) & 0xFC000000FC00;
        u64 b = (c >> 14) & 0xFC000000FC;
        c = r | g | b;

        *(u64*)&dst[i] = c | ((c & 0x00C0C0C000C0C0C0) >> 6) | 0xFF000000FF000000;
    }
}

void SoftRenderer::VBlankEndActivePipeline(Unit* unitA, Unit* unitB)
{
#ifdef OGLRENDERER_ENABLED
    if (Renderer3D& renderer3d = GPU.GPU3D.GetCurrentRenderer(); renderer3d.Accelerated)
    {
        const u32 captureCnt = unitA->CaptureCnt;
        const u32 captureMode = (captureCnt >> 29u) & 0x3u;
        const bool captureEnabled = (captureCnt & (1u << 31u)) != 0u;
        if (!renderer3d.UsesStructured2DMetadata())
        {
            if (captureEnabled && captureMode != 1u)
                renderer3d.PrepareCaptureFrame();
            return;
        }

        const bool captureUsesDirect3D = (captureCnt & (1u << 24u)) != 0u;
        const bool sourceAContributes = captureMode == 0u
            || ((captureMode >= 2u) && ((captureCnt & 0x1Fu) != 0u));
        const bool bg0Uses3D = (unitA->DispCnt & 0x0108u) == 0x0108u;
        if (captureEnabled
            && captureMode != 1u
            && (captureUsesDirect3D || (bg0Uses3D && sourceAContributes)))
        {
            renderer3d.SetCaptureScreenSwapHint(
                (GPU.NDS.PowerControl9 & (1u << 15u)) != 0u,
                captureCnt,
                unitA->DispCnt);
            renderer3d.BeginCaptureFrame();
            renderer3d.PrepareCaptureFrame();
        }
    }
#endif
}

void SoftRenderer::DoCapture(u32 line, u32 width, u32 sourceLine)
{
    u32 captureCnt = CurUnit->CaptureCnt;
    const u32 captureMode = (captureCnt >> 29u) & 0x3u;
    const bool captureUsesDirect3D = (captureCnt & (1u << 24u)) != 0u;
    bool captureLineUses3d = false;
    bool captureLineHasUseful3dAlpha = false;
    bool captureDestinationHasNonZeroPixel = false;
    bool debugCaptureSourceReady = false;
    const bool useStructuredVulkan2D = UseStructuredVulkan2D();
    CaptureSourceIdentity servedCaptureSourceIdentity {};
    bool servedCaptureSourceIdentityValid = false;
    const auto latchServedCaptureSourceIdentity = [&]() {
        servedCaptureSourceIdentity = {};
        if (!useStructuredVulkan2D)
            return;
        servedCaptureSourceIdentityValid =
            _3DLine != nullptr
            && GPU.GPU3D.GetLastServedCaptureSourceIdentity(servedCaptureSourceIdentity)
            && servedCaptureSourceIdentity.Valid;
        if (!servedCaptureSourceIdentityValid)
            servedCaptureSourceIdentity = {};
    };
    if (useStructuredVulkan2D && CurUnit->Num == 0 && line < CaptureLineUses3d.size())
        CaptureLineUses3d[line] = 0;
    const bool captureScreenSwap = (GPU.NDS.PowerControl9 & (1u << 15u)) != 0u;
    const bool captureDebugEnabled = MelonDSAndroid::areRendererDebugToolsEnabled();
    const bool captureMetadataEnabled = captureDebugEnabled || useStructuredVulkan2D;
    const bool logCaptureSamples = MelonDSAndroid::areRendererDebugBgObjLogsEnabled();
    if (line == 0)
    {
        HasLastDebugCapture3dSource = false;
        std::memset(LastDebugCapture3dSource, 0, sizeof(LastDebugCapture3dSource));
        LastDebugCaptureStats = {};
        LastDebugCaptureStats.CaptureWidth = width;
        LastDebugCaptureStats.CaptureMode = captureMode;
        LastDebugCaptureStats.CaptureBit24 = (captureCnt & (1u << 24u)) != 0u ? 1u : 0u;
        FramesSinceLastCapture = 0;
    }
    LastDebugCaptureStats.CaptureLines++;
    u32 dstvram = (captureCnt >> 16) & 0x3;

    // TODO: confirm this
    // it should work like VRAM display mode, which requires VRAM to be mapped to LCDC
    if (!(GPU.VRAMMap_LCDC & (1<<dstvram)))
        return;

    u16* dst = (u16*)GPU.VRAM[dstvram];
    u32 dstaddr = (((captureCnt >> 18) & 0x3) << 14) + (line * width);

    const u32 captureDisplayMode = (CurUnit->DispCnt >> 16u) & (CurUnit->Num ? 0x1u : 0x3u);
    const bool canUsePure3DStructuredCapture =
        useStructuredVulkan2D
        && CurUnit->Num == 0
        && GPU.GPU3D.IsRendererAccelerated()
        && !captureUsesDirect3D
        && !CurUnit->CaptureLatch
        && captureMode == 0u
        && CanUseStructuredVulkan2DPure3DLine(captureDisplayMode);
    if (canUsePure3DStructuredCapture)
    {
        dstaddr &= 0xFFFFu;
        static_assert(VRAMDirtyGranularity == 512);
        GPU.VRAMDirty[dstvram][(dstaddr * 2) / VRAMDirtyGranularity] = true;
        FillStructuredVulkan2DCapturePure3DRange(dstvram, dstaddr, width);
        if (line < CaptureLineUses3d.size())
            CaptureLineUses3d[line] = 1u;
        if (captureMetadataEnabled)
        {
            LastDebugCaptureStats.SourceACompositeLines++;
            LastDebugCaptureStats.CaptureLineUses3dLines++;
        }
        return;
    }
    if (!useStructuredVulkan2D)
    {
        u32* srcA;
        if (captureCnt & (1<<24))
        {
            srcA = _3DLine;
        }
        else
        {
            srcA = BGOBJLine;
            if (GPU.GPU3D.IsRendererAccelerated())
            {
                for (int i = 0; i < 256; i++)
                {
                    u32 val1 = BGOBJLine[i];
                    u32 val2 = BGOBJLine[256+i];
                    u32 val3 = BGOBJLine[512+i];

                    u32 compmode = (val3 >> 24) & 0xF;

                    if (compmode == 4)
                    {
                        u32 _3dval = _3DLine[i];
                        if ((_3dval >> 24) > 0)
                            val1 = ColorBlend5(_3dval, val1);
                        else
                            val1 = val2;
                    }
                    else if (compmode == 1)
                    {
                        u32 _3dval = _3DLine[i];
                        if ((_3dval >> 24) > 0)
                        {
                            u32 eva = (val3 >> 8) & 0x1F;
                            u32 evb = (val3 >> 16) & 0x1F;

                            val1 = ColorBlend4(val1, _3dval, eva, evb);
                        }
                        else
                            val1 = val2;
                    }
                    else if (compmode <= 3)
                    {
                        u32 _3dval = _3DLine[i];
                        if ((_3dval >> 24) > 0)
                        {
                            u32 evy = (val3 >> 8) & 0x1F;

                            val1 = _3dval;
                            if      (compmode == 2) val1 = ColorBrightnessUp(val1, evy, 0x8);
                            else if (compmode == 3) val1 = ColorBrightnessDown(val1, evy, 0x7);
                        }
                        else
                            val1 = val2;
                    }

                    BGOBJLine[i] = val1;
                }
            }
        }

        u16* srcB = NULL;
        u32 srcBaddr = line * 256;

        if (captureCnt & (1<<25))
        {
            srcB = &CurUnit->DispFIFOBuffer[0];
            srcBaddr = 0;
        }
        else
        {
            u32 srcvram = (CurUnit->DispCnt >> 18) & 0x3;
            if (GPU.VRAMMap_LCDC & (1<<srcvram))
                srcB = (u16*)GPU.VRAM[srcvram];

            if (((CurUnit->DispCnt >> 16) & 0x3) != 2)
                srcBaddr += ((captureCnt >> 26) & 0x3) << 14;
        }

        dstaddr &= 0xFFFF;
        srcBaddr &= 0xFFFF;

        static_assert(VRAMDirtyGranularity == 512);
        GPU.VRAMDirty[dstvram][(dstaddr * 2) / VRAMDirtyGranularity] = true;

        switch ((captureCnt >> 29) & 0x3)
        {
        case 0:
            {
                for (u32 i = 0; i < width; i++)
                {
                    u32 val = srcA[i];

                    u32 r = (val >> 1) & 0x1F;
                    u32 g = (val >> 9) & 0x1F;
                    u32 b = (val >> 17) & 0x1F;
                    u32 a = ((val >> 24) != 0) ? 0x8000 : 0;

                    dst[dstaddr] = r | (g << 5) | (b << 10) | a;
                    dstaddr = (dstaddr + 1) & 0xFFFF;
                }
            }
            break;

        case 1:
            {
                if (srcB)
                {
                    for (u32 i = 0; i < width; i++)
                    {
                        dst[dstaddr] = srcB[srcBaddr];
                        srcBaddr = (srcBaddr + 1) & 0xFFFF;
                        dstaddr = (dstaddr + 1) & 0xFFFF;
                    }
                }
                else
                {
                    for (u32 i = 0; i < width; i++)
                    {
                        dst[dstaddr] = 0;
                        dstaddr = (dstaddr + 1) & 0xFFFF;
                    }
                }
            }
            break;

        case 2:
        case 3:
            {
                u32 eva = captureCnt & 0x1F;
                u32 evb = (captureCnt >> 8) & 0x1F;

                if (eva > 16) eva = 16;
                if (evb > 16) evb = 16;

                if (srcB)
                {
                    for (u32 i = 0; i < width; i++)
                    {
                        u32 val = srcA[i];

                        u32 rA = (val >> 1) & 0x1F;
                        u32 gA = (val >> 9) & 0x1F;
                        u32 bA = (val >> 17) & 0x1F;
                        u32 aA = ((val >> 24) != 0) ? 1 : 0;

                        val = srcB[srcBaddr];

                        u32 rB = val & 0x1F;
                        u32 gB = (val >> 5) & 0x1F;
                        u32 bB = (val >> 10) & 0x1F;
                        u32 aB = val >> 15;

                        u32 rD = ((rA * aA * eva) + (rB * aB * evb) + 8) >> 4;
                        u32 gD = ((gA * aA * eva) + (gB * aB * evb) + 8) >> 4;
                        u32 bD = ((bA * aA * eva) + (bB * aB * evb) + 8) >> 4;
                        u32 aD = (eva>0 ? aA : 0) | (evb>0 ? aB : 0);

                        if (rD > 0x1F) rD = 0x1F;
                        if (gD > 0x1F) gD = 0x1F;
                        if (bD > 0x1F) bD = 0x1F;

                        dst[dstaddr] = rD | (gD << 5) | (bD << 10) | (aD << 15);
                        srcBaddr = (srcBaddr + 1) & 0xFFFF;
                        dstaddr = (dstaddr + 1) & 0xFFFF;
                    }
                }
                else
                {
                    for (u32 i = 0; i < width; i++)
                    {
                        u32 val = srcA[i];

                        u32 rA = (val >> 1) & 0x1F;
                        u32 gA = (val >> 9) & 0x1F;
                        u32 bA = (val >> 17) & 0x1F;
                        u32 aA = ((val >> 24) != 0) ? 1 : 0;

                        u32 rD = ((rA * aA * eva) + 8) >> 4;
                        u32 gD = ((gA * aA * eva) + 8) >> 4;
                        u32 bD = ((bA * aA * eva) + 8) >> 4;
                        u32 aD = (eva>0 ? aA : 0);

                        dst[dstaddr] = rD | (gD << 5) | (bD << 10) | (aD << 15);
                        dstaddr = (dstaddr + 1) & 0xFFFF;
                    }
                }
            }
            break;
        }
        return;
    }

    const u32 structuredCaptureDstBase = dstaddr & 0xFFFFu;
    bool structuredCaptureStoredFromSourceA = false;

    u16* srcB = NULL;
    u32 srcBaddr = line * 256;
    u32 structuredSourceBVram = 4u;
    bool structuredSourceBFromVram = false;

    if (captureCnt & (1<<25))
    {
        srcB = &CurUnit->DispFIFOBuffer[0];
        srcBaddr = 0;
    }
    else
    {
        u32 srcvram = (CurUnit->DispCnt >> 18) & 0x3;
        if (GPU.VRAMMap_LCDC & (1<<srcvram))
        {
            srcB = (u16*)GPU.VRAM[srcvram];
            structuredSourceBVram = srcvram;
            structuredSourceBFromVram = true;
        }

        if (((CurUnit->DispCnt >> 16) & 0x3) != 2)
            srcBaddr += ((captureCnt >> 26) & 0x3) << 14;
    }

    srcBaddr &= 0xFFFF;
    const u32 structuredSourceBBaseAddr = srcBaddr;
    const u32 sourceBEvb = (captureCnt >> 8) & 0x1Fu;
    const bool captureBlendsStructuredSourceB =
        useStructuredVulkan2D
        && captureMode >= 2u
        && sourceBEvb != 0u
        && structuredSourceBFromVram;
    std::array<u32, 256> structuredSourceBOverlayPixels {};
    std::array<u32, 256> structuredSourceBOverlayControl {};
    std::array<u8, 256> structuredSourceBOverlayLineage {};
    std::array<u16, 256> structuredCaptureOutputPixels {};
    if (captureBlendsStructuredSourceB)
    {
        const u32 sampleWidth = std::min<u32>(width, 256u);
        for (u32 i = 0; i < sampleWidth; i++)
        {
            const u32 sourceAddress =
                (structuredSourceBBaseAddr + i) & 0xFFFFu;
            ReadStructuredVulkan2DCapture2DOverlayPixel(
                structuredSourceBVram,
                sourceAddress,
                structuredSourceBOverlayPixels[static_cast<size_t>(i)],
                structuredSourceBOverlayControl[static_cast<size_t>(i)],
                true);
            if (sourceAddress < kStructuredPixelCount)
            {
                structuredSourceBOverlayLineage[static_cast<size_t>(i)] =
                    StructuredVulkan2DCaptureOverlayLineage[
                        (static_cast<size_t>(structuredSourceBVram)
                            * kStructuredPixelCount)
                        + static_cast<size_t>(sourceAddress)];
            }
        }
    }
    const bool structuredCaptureWritesFullLine =
        width >= kStructuredScreenWidth
        && (structuredCaptureDstBase % kStructuredScreenWidth) == 0u;
    if (useStructuredVulkan2D && !structuredCaptureWritesFullLine)
        ClearStructuredVulkan2DCaptureRange(dstvram, structuredCaptureDstBase, width);

    // TODO: handle 3D in GPU3D::CurrentRenderer->Accelerated mode!!

    bool acceleratedSourceACompositeNeeded = false;
    u32* srcA;
    if (captureUsesDirect3D)
    {
        if (captureDebugEnabled)
            LastDebugCaptureStats.Direct3DLines++;
        if (GPU.GPU3D.IsRendererAccelerated())
            GPU.GPU3D.GetCurrentRenderer().SetCaptureScreenSwapHint(
                captureScreenSwap, captureCnt, CurUnit->DispCnt);
        if (GPU.GPU3D.IsRendererAccelerated())
        {
            _3DLine = GPU.GPU3D.GetLine(static_cast<int>(sourceLine));
            latchServedCaptureSourceIdentity();
        }
        srcA = _3DLine;
        captureLineUses3d = srcA != nullptr;
        if (captureMetadataEnabled && srcA != nullptr)
            debugCaptureSourceReady = true;
        if (captureDebugEnabled && srcA != nullptr)
        {
            for (u32 i = 0; i < width; i++)
            {
                if ((srcA[i] >> 24) != 0u)
                {
                    captureLineHasUseful3dAlpha = true;
                    break;
                }
            }
        }
    }
    else
    {
        srcA = BGOBJLine;
        if (GPU.GPU3D.IsRendererAccelerated())
        {
            // In accelerated mode, only fetch the 3D line if this capture line actually
            // needs 3D contribution for source A.
            const bool sourceAContributes = captureMode == 0u
                || ((captureMode >= 2u) && ((captureCnt & 0x1Fu) != 0u));
            bool needs3dComposite = false;
            if (sourceAContributes)
            {
                for (int i = 0; i < 256; i++)
                {
                    const u32 compmode = (BGOBJLine[512 + i] >> 24) & 0xF;
                    if (captureDebugEnabled && compmode < 8u)
                        LastDebugCaptureStats.CompModeCounts[compmode]++;
                    if (compmode <= 4u)
                    {
                        needs3dComposite = true;
                        break;
                    }
                    if (((BGOBJLine[i] >> 24) & 0xC0u) == 0x40u)
                    {
                        needs3dComposite = true;
                        break;
                    }
                }
            }

            acceleratedSourceACompositeNeeded = needs3dComposite;
            if (needs3dComposite)
            {
                if (captureDebugEnabled)
                    LastDebugCaptureStats.SourceACompositeLines++;
                if (captureMode == 0u
                    && StructuredVulkan2DCaptureSourceLineCanFastCopy(line, width)
                    && StructuredVulkan2DLineHasVisibleSourceA(BGOBJLine, width))
                {
                    dstaddr &= 0xFFFFu;
                    static_assert(VRAMDirtyGranularity == 512);
                    GPU.VRAMDirty[dstvram][(dstaddr * 2) / VRAMDirtyGranularity] = true;
                    CopyStructuredVulkan2DCaptureSourceLineToCapture(
                        line,
                        dstvram,
                        structuredCaptureDstBase,
                        width);
                    GPU.GPU3D.GetCurrentRenderer().SetCaptureScreenSwapHint(
                        captureScreenSwap, captureCnt, CurUnit->DispCnt);
                    _3DLine = GPU.GPU3D.GetLine(static_cast<int>(sourceLine));
                    latchServedCaptureSourceIdentity();
                    u32 dstWriteAddr = structuredCaptureDstBase;
                    for (u32 i = 0; i < width; i++)
                    {
                        u32 val = BGOBJLine[i];
                        const u32 control = BGOBJLine[512 + i];
                        const u32 compmode = (control >> 24) & 0xF;
                        if (_3DLine != nullptr && compmode <= 4u)
                        {
                            const u32 _3dval = _3DLine[i];
                            const bool has3d = (_3dval >> 24) != 0u;
                            if (compmode == 4)
                                val = has3d ? ColorBlend5(_3dval, val) : BGOBJLine[256 + i];
                            else if (compmode == 1)
                                val = has3d
                                    ? ColorBlend4(val, _3dval, (control >> 8) & 0x1F, (control >> 16) & 0x1F)
                                    : BGOBJLine[256 + i];
                            else if (has3d)
                            {
                                const u32 evy = (control >> 8) & 0x1F;
                                val = _3dval;
                                if      (compmode == 2) val = ColorBrightnessUp(val, evy, 0x8);
                                else if (compmode == 3) val = ColorBrightnessDown(val, evy, 0x7);
                            }
                            else
                                val = BGOBJLine[256 + i];
                        }
                        const u16 packed =
                            static_cast<u16>(((val >> 1u) & 0x1Fu)
                                | (((val >> 9u) & 0x1Fu) << 5u)
                                | (((val >> 17u) & 0x1Fu) << 10u)
                                | (((val >> 24u) != 0u) ? 0x8000u : 0u));
                        dst[dstWriteAddr] = packed;
                        if (captureMetadataEnabled && packed != 0u)
                        {
                            LastDebugCaptureStats.SourceAOutputUsefulPixels++;
                            if ((packed & 0x7FFFu) != 0u)
                                LastDebugCaptureStats.SourceAOutputVisiblePixels++;
                            else
                                LastDebugCaptureStats.SourceAOutputOpaqueBlackPixels++;
                        }
                        if (logCaptureSamples)
                        {
                            struct CaptureFastSamplePoint
                            {
                                const char* label;
                                u32 x;
                                u32 y;
                            };
                            static constexpr CaptureFastSamplePoint kFastSamples[] = {
                                {"seamA", 85u, 14u},
                                {"goodA", 84u, 14u},
                                {"seamB", 75u, 58u},
                                {"goodB", 74u, 58u},
                                {"seamC", 150u, 81u},
                                {"goodC", 149u, 81u},
                            };
                            for (const CaptureFastSamplePoint& sample : kFastSamples)
                            {
                                if (sample.y != sourceLine || sample.x != i)
                                    continue;

                                Platform::Log(
                                    Platform::LogLevel::Warn,
                                    "RendererDebug[CaptureFastCopy]: label=%s line=%u sourceLine=%u x=%u dstvram=%u dst=%04X val=%08X packed=%04X cnt=%08X",
                                    sample.label,
                                    line,
                                    sourceLine,
                                    i,
                                    dstvram,
                                    dstWriteAddr,
                                    val,
                                    packed,
                                    captureCnt);
                                break;
                            }
                        }
                        dstWriteAddr = (dstWriteAddr + 1u) & 0xFFFFu;
                    }
                    if (line < CaptureLineUses3d.size())
                        CaptureLineUses3d[line] = 1u;
                    if (captureMetadataEnabled)
                        LastDebugCaptureStats.CaptureLineUses3dLines++;
                    SealStructuredVulkan2DCaptureIdentity(
                        dstvram,
                        structuredCaptureDstBase,
                        width,
                        servedCaptureSourceIdentityValid
                            ? &servedCaptureSourceIdentity
                            : nullptr,
                        StructuredCaptureWriterRoute::Fast);
                    return;
                }

                GPU.GPU3D.GetCurrentRenderer().SetCaptureScreenSwapHint(
                    captureScreenSwap, captureCnt, CurUnit->DispCnt);
                _3DLine = GPU.GPU3D.GetLine(static_cast<int>(sourceLine));
                latchServedCaptureSourceIdentity();
                if (_3DLine)
                {
                    std::array<u8, kStructuredScreenWidth> carriedProtectedBlack {};
                    u8* const carriedProtectedBlackOutput =
                        captureMode == 0u && width == kStructuredScreenWidth
                            ? carriedProtectedBlack.data()
                            : nullptr;
                    if (DirectCaptureDeferredTail)
                    {
                        const u32 copyWidth = std::min<u32>(width, kStructuredScreenWidth);
                        LastDebugCaptureStats.StructuredCopyLines++;
                        for (u32 x = 0; x < copyWidth; x++)
                        {
                            if (BGOBJLine[kStructuredScreenWidth + x] != 0u)
                                LastDebugCaptureStats.StructuredCopyPlane0UsefulPixels++;
                        }
                        LastDebugCaptureStats.StructuredCopySlotPixels += copyWidth;
                        const size_t captureLineIndex =
                            (static_cast<size_t>(dstvram) * kStructuredScreenHeight)
                            + (static_cast<size_t>(structuredCaptureDstBase) / kStructuredScreenWidth);
                        StructuredVulkan2DCaptureLineValid[captureLineIndex] = 1u;
                        StructuredVulkan2DCaptureLineHasPayload[captureLineIndex] = 1u;
                        StructuredVulkan2DCaptureLineHas3DSlot[captureLineIndex] = 1u;
                    }
                    else
                    {
                        CopyStructuredVulkan2DCaptureSourceLineToCapture(
                            line,
                            dstvram,
                            structuredCaptureDstBase,
                            width,
                            carriedProtectedBlackOutput);
                    }

                    captureLineUses3d = true;
                    if (captureDebugEnabled)
                    {
                        for (u32 i = 0; i < width; i++)
                        {
                            if ((_3DLine[i] >> 24) != 0u)
                            {
                                captureLineHasUseful3dAlpha = true;
                                break;
                            }
                        }
                    }

                        u32 external3DSourceClass = 0u;
                        u32 external3DSourceCounts[17] {};
                        const u32 captureOutputMode = (captureCnt >> 29) & 0x3u;
                        const bool allowUnclassifiedExternal3DSlot =
                            captureOutputMode >= 2u
                            && width == 256u
                            && srcB != nullptr;
                        const bool captureBackedPlane2LineGeometry =
                            useStructuredVulkan2D
                            && width == kStructuredScreenWidth
                            && dstvram < 4u
                            && (structuredCaptureDstBase % kStructuredScreenWidth) == 0u
                            && structuredCaptureDstBase
                                <= (kStructuredPixelCount - kStructuredScreenWidth);
                        const size_t captureBackedPlane2Base = captureBackedPlane2LineGeometry
                            ? static_cast<size_t>(dstvram) * kStructuredPlaneCount * kStructuredPixelCount
                            : 0u;
                        const size_t captureBackedPlane2Index = captureBackedPlane2LineGeometry
                            ? static_cast<size_t>(structuredCaptureDstBase)
                            : 0u;
                        const size_t captureBackedPlane2LineIndex = captureBackedPlane2LineGeometry
                            ? (static_cast<size_t>(dstvram) * kStructuredScreenHeight)
                                + (captureBackedPlane2Index / kStructuredScreenWidth)
                            : 0u;
                        const bool captureBackedPlane2InitialLineValid =
                            captureBackedPlane2LineGeometry
                            && StructuredVulkan2DCaptureLineValid[captureBackedPlane2LineIndex] != 0u;
                        bool captureBackedPlane2LineShape = true;
                        bool captureBackedPlane2HasExplicitSlot = false;
                        bool captureBackedPlane2HasConsumableOverlay = false;
                        bool captureBackedPlane2HasLegacyComp4 = false;
                        if (!DirectCaptureDeferredTail)
                        {
                            for (int i = 0; i < 256; i++)
                            {
                                const u32 raw0 = BGOBJLine[i];
                                const u32 raw1 = BGOBJLine[256 + i];
                                const u32 raw2 = BGOBJLine[512 + i];
                                const u32 sourceClass = StructuredVulkan2DSourceClass(raw0);
                                if (sourceClass <= 16u)
                                    external3DSourceCounts[sourceClass]++;
                                if (captureBackedPlane2LineGeometry
                                    && !DirectCaptureDeferredTail
                                    && captureBackedPlane2LineShape)
                                {
                                    const u32 sourceClass1 = StructuredVulkan2DSourceClass(raw1);
                                    const u32 sourceClass2 = StructuredVulkan2DSourceClass(raw2);
                                    const bool explicitSlot =
                                        StructuredVulkan2DHas3DSlot(raw0)
                                        || StructuredVulkan2DHas3DSlot(raw1)
                                        || StructuredVulkan2DHas3DSlot(raw2);
                                    captureBackedPlane2HasExplicitSlot =
                                        captureBackedPlane2HasExplicitSlot || explicitSlot;
                                    captureBackedPlane2LineShape =
                                        sourceClass == 0u
                                        && sourceClass1 == 0u
                                        && sourceClass2 != 0u
                                        && sourceClass2 != 0x10u
                                        && !explicitSlot;
                                    if (!captureBackedPlane2LineShape)
                                        continue;

                                    const size_t x = static_cast<size_t>(i);
                                    if (captureBackedPlane2InitialLineValid || x != 0u)
                                    {
                                        const u32 oldBelow = StructuredVulkan2DCapturePlanes[
                                            captureBackedPlane2Base + captureBackedPlane2Index + x];
                                        const u32 oldAbove = StructuredVulkan2DCapturePlanes[
                                            captureBackedPlane2Base + kStructuredPixelCount
                                                + captureBackedPlane2Index + x];
                                        const u32 oldControl = StructuredVulkan2DCapturePlanes[
                                            captureBackedPlane2Base + (kStructuredPixelCount * 2u)
                                                + captureBackedPlane2Index + x];
                                        const u32 oldAlpha = oldControl >> 24u;
                                        const bool oldSlot =
                                            (oldAlpha & kStructuredVulkan2DSlot3DFlag) != 0u;
                                        captureBackedPlane2HasConsumableOverlay =
                                            captureBackedPlane2HasConsumableOverlay
                                            || (oldSlot
                                                && (oldAlpha & kStructuredVulkan2DAbove3DFlag) != 0u
                                                && oldAbove != 0u
                                                && StructuredVulkan2DCanPreserveCaptureOverlay(oldAbove))
                                            || (!oldSlot
                                                && (oldAlpha & kStructuredVulkan2DOnlyFlag) != 0u
                                                && oldBelow != 0u
                                                && StructuredVulkan2DCanPreserveCaptureOverlay(oldBelow));
                                    }

                                    const u32 legacyAlpha = (raw2 >> 24u) & 0x0Fu;
                                    if (legacyAlpha == 4u)
                                    {
                                        const u32 resolvedVal1 = (_3DLine[i] >> 24u) != 0u
                                            ? ColorBlend5(_3DLine[i], raw0)
                                            : raw1;
                                        captureBackedPlane2HasLegacyComp4 =
                                            captureBackedPlane2HasLegacyComp4
                                            || (resolvedVal1 == kStructuredVulkan2D3DPlaceholder
                                                && raw1 == kStructuredVulkan2D3DPlaceholder);
                                    }
                                }
                            }
                            constexpr u32 sourceClasses[] = {1u, 2u, 4u, 8u};
                            u32 bestSourceCount = 0u;
                            for (u32 sourceClass : sourceClasses)
                            {
                                if (external3DSourceCounts[sourceClass] > bestSourceCount)
                                {
                                    bestSourceCount = external3DSourceCounts[sourceClass];
                                    external3DSourceClass = sourceClass;
                                }
                            }
                            if (bestSourceCount < 128u)
                                external3DSourceClass = 0u;
                        }
                        const bool captureBackedPlane2DirectStore =
                            captureBackedPlane2LineGeometry
                            && !DirectCaptureDeferredTail
                            && captureBackedPlane2LineShape
                            && !captureBackedPlane2HasExplicitSlot
                            && external3DSourceClass == 0u
                            && !allowUnclassifiedExternal3DSlot
                            && !captureBackedPlane2HasConsumableOverlay
                            && !captureBackedPlane2HasLegacyComp4;
                        u32 captureBackedPlane2UsefulPixels = 0u;

                        struct CaptureSamplePoint
                        {
                            const char* label;
                            u32 x;
                            u32 y;
                        };
                        static constexpr CaptureSamplePoint kCaptureSamplePoints[] = {
                            {"seamA", 85u, 14u},
                            {"goodA", 84u, 14u},
                            {"seamB", 75u, 58u},
                            {"goodB", 74u, 58u},
                            {"seamC", 150u, 81u},
                            {"goodC", 149u, 81u},
                        };

                        // In accelerated mode compositing is normally done on the GPU, but
                        // display capture needs source A on CPU for VRAM writes.
                        for (int i = 0; i < 256; i++)
                        {
                            const u32 originalVal1 = BGOBJLine[i];
                            const u32 originalVal2 = BGOBJLine[256+i];
                            const u32 originalVal3 = BGOBJLine[512+i];
                            u32 val1 = originalVal1;
                            u32 val2 = originalVal2;
                            u32 val3 = originalVal3;

                            u32 compmode = (val3 >> 24) & 0xF;
                            const u32 _3dval = _3DLine[i];
                            const bool sourceA3dHasAlpha = (_3dval >> 24u) != 0u;
                            if (captureDebugEnabled && sourceA3dHasAlpha)
                            {
                                LastDebugCaptureStats.Opaque3DSourcePixels++;
                                if ((val1 & 0xFF000000u) == 0x20000000u)
                                    LastDebugCaptureStats.Opaque3DBackdropPixels++;
                            }

                            if (compmode == 4)
                            {
                                // 3D on top, blending

                                if (sourceA3dHasAlpha)
                                    val1 = ColorBlend5(_3dval, val1);
                                else
                                    val1 = val2;
                            }
                            else if (compmode == 1)
                            {
                                // 3D on bottom, blending

                                if (sourceA3dHasAlpha)
                                {
                                    u32 eva = (val3 >> 8) & 0x1F;
                                    u32 evb = (val3 >> 16) & 0x1F;

                                    val1 = ColorBlend4(val1, _3dval, eva, evb);
                                }
                                else
                                    val1 = val2;
                            }
                            else if (compmode <= 3)
                            {
                                // 3D on top, normal/fade

                                if (sourceA3dHasAlpha)
                                {
                                    u32 evy = (val3 >> 8) & 0x1F;

                                    val1 = _3dval;
                                    if      (compmode == 2) val1 = ColorBrightnessUp(val1, evy, 0x8);
                                    else if (compmode == 3) val1 = ColorBrightnessDown(val1, evy, 0x7);
                                }
                                else
                                    val1 = val2;
                            }

                            if (logCaptureSamples)
                            {
                                for (const CaptureSamplePoint& sample : kCaptureSamplePoints)
                                {
                                    if (sample.y != sourceLine || sample.x != static_cast<u32>(i))
                                        continue;

                                    const u32 packedWord =
                                        ((val1 >> 1) & 0x1Fu)
                                        | (((val1 >> 9) & 0x1Fu) << 5)
                                        | (((val1 >> 17) & 0x1Fu) << 10)
                                        | (((val1 >> 24) != 0u) ? 0x8000u : 0u);

                                    Platform::Log(
                                        Platform::LogLevel::Warn,
                                        "RendererDebug[CaptureLoop]: label=%s line=%u sourceLine=%u x=%u comp=%u raw3d=%08X val1=%08X val2=%08X val3=%08X packed=%08X",
                                        sample.label,
                                        line,
                                        sourceLine,
                                        static_cast<u32>(i),
                                        compmode,
                                        _3dval,
                                        val1,
                                        val2,
                                        val3,
                                        packedWord
                                    );
                                    break;
                                }
                            }

                            BGOBJLine[i] = val1;
                            if (captureBackedPlane2DirectStore)
                            {
                                const size_t x = static_cast<size_t>(i);
                                const u32 legacyAlpha = (val3 >> 24u) & 0x0Fu;
                                const u32 structuredAlpha =
                                    legacyAlpha
                                    | kStructuredVulkan2DSlot3DFlag
                                    | (!sourceA3dHasAlpha
                                        ? kStructuredVulkan2DNo3DCoverageFlag
                                        : 0u);
                                StructuredVulkan2DCapturePlanes[
                                    captureBackedPlane2Base + captureBackedPlane2Index + x] = val1;
                                StructuredVulkan2DCapturePlanes[
                                    captureBackedPlane2Base + kStructuredPixelCount
                                        + captureBackedPlane2Index + x] = 0u;
                                StructuredVulkan2DCapturePlanes[
                                    captureBackedPlane2Base + (kStructuredPixelCount * 2u)
                                        + captureBackedPlane2Index + x] =
                                    (val3 & 0x00FFFFFFu) | (structuredAlpha << 24u);
                                StructuredVulkan2DCaptureOverlayLineage[
                                    (static_cast<size_t>(dstvram)
                                        * kStructuredPixelCount)
                                    + captureBackedPlane2Index + x] =
                                    kStructuredVulkan2DOverlayLineageUnknown;
                                captureBackedPlane2UsefulPixels += val1 != 0u ? 1u : 0u;
                            }
                            else if (useStructuredVulkan2D)
                            {
                                const bool currentSourceA3DVisibleNonBlack =
                                    sourceA3dHasAlpha
                                    && (val1 >> 24u) != 0u
                                    && (val1 & 0x00FFFFFFu) != 0u;
                                const u8 currentCarriedProtectedBlack =
                                    currentSourceA3DVisibleNonBlack
                                        ? carriedProtectedBlack[static_cast<size_t>(i)]
                                        : static_cast<u8>(
                                            carriedProtectedBlack[static_cast<size_t>(i)]
                                            & ~kStructuredVulkan2DCarriedProtectedBlack);
                                StoreStructuredVulkan2DCapturePixel(
                                    dstvram,
                                    (structuredCaptureDstBase + static_cast<u32>(i)) & 0xFFFFu,
                                    originalVal1,
                                    originalVal2,
                                    originalVal3,
                                    val1,
                                    val2,
                                    val3,
                                    external3DSourceClass,
                                    true,
                                    sourceA3dHasAlpha,
                                    allowUnclassifiedExternal3DSlot,
                                    currentCarriedProtectedBlack);
                            }
                            structuredCaptureStoredFromSourceA = true;
                        }

                        if (captureBackedPlane2DirectStore)
                        {
                            if (!captureBackedPlane2InitialLineValid)
                                LastDebugCaptureStats.StructuredCopyLines++;
                            LastDebugCaptureStats.StructuredCopyPlane0UsefulPixels +=
                                captureBackedPlane2UsefulPixels;
                            LastDebugCaptureStats.StructuredCopySlotPixels +=
                                kStructuredScreenWidth;
                            StructuredVulkan2DCaptureLineValid[
                                captureBackedPlane2LineIndex] = 1u;
                            StructuredVulkan2DCaptureLineHasPayload[
                                captureBackedPlane2LineIndex] = 1u;
                            StructuredVulkan2DCaptureLineHas3DSlot[
                                captureBackedPlane2LineIndex] = 1u;
                        }

                    debugCaptureSourceReady = true;
                }
            }
        }
    }

    dstaddr &= 0xFFFF;
    if (useStructuredVulkan2D && captureLineUses3d && !structuredCaptureStoredFromSourceA)
        CopyStructuredVulkan2DCurrentLineToCapture(line, dstvram, dstaddr, width);
    else if (useStructuredVulkan2D && !captureLineUses3d)
        ClearStructuredVulkan2DCaptureRange(dstvram, structuredCaptureDstBase, width);

    if (useStructuredVulkan2D && CurUnit->Num == 0 && line < CaptureLineUses3d.size())
        CaptureLineUses3d[line] = captureLineUses3d ? 1 : 0;

    if (captureMetadataEnabled && captureLineUses3d && debugCaptureSourceReady && srcA != nullptr)
    {
        std::memcpy(
            &LastDebugCapture3dSource[static_cast<size_t>(sourceLine) * 256u],
            srcA,
            256u * sizeof(u32));
        HasLastDebugCapture3dSource = true;
    }

    static_assert(VRAMDirtyGranularity == 512);
    GPU.VRAMDirty[dstvram][(dstaddr * 2) / VRAMDirtyGranularity] = true;

    auto packCaptureColor = [](u32 val) -> u16 {
        u32 r = (val >> 1) & 0x1F;
        u32 g = (val >> 9) & 0x1F;
        u32 b = (val >> 17) & 0x1F;
        u32 a = ((val >> 24) != 0) ? 0x8000 : 0;
        return static_cast<u16>(r | (g << 5) | (b << 10) | a);
    };
    auto captureColorsClose = [](u16 lhs, u16 rhs) -> bool {
        if (((lhs ^ rhs) & 0x8000u) != 0u)
            return false;

        const int lhsR = lhs & 0x1F;
        const int lhsG = (lhs >> 5) & 0x1F;
        const int lhsB = (lhs >> 10) & 0x1F;
        const int rhsR = rhs & 0x1F;
        const int rhsG = (rhs >> 5) & 0x1F;
        const int rhsB = (rhs >> 10) & 0x1F;
        return std::abs(lhsR - rhsR) <= 2
            && std::abs(lhsG - rhsG) <= 2
            && std::abs(lhsB - rhsB) <= 2;
    };
    switch ((captureCnt >> 29) & 0x3)
    {
    case 0: // source A
        {
            for (u32 i = 0; i < width; i++)
            {
                u32 val = srcA[i];

                // TODO: check what happens when alpha=0

                const u16 packed = packCaptureColor(val);
                structuredCaptureOutputPixels[static_cast<size_t>(i)] = packed;
                dst[dstaddr] = packed;
                if (GPU.GPU3D.IsRendererAccelerated())
                {
                    if (packed != 0)
                    {
                        LastDebugCaptureStats.SourceAOutputUsefulPixels++;
                        if ((packed & 0x7FFFu) != 0u)
                            LastDebugCaptureStats.SourceAOutputVisiblePixels++;
                        else
                            LastDebugCaptureStats.SourceAOutputOpaqueBlackPixels++;
                    }
                }
                if (packed != 0)
                    captureDestinationHasNonZeroPixel = true;
                dstaddr = (dstaddr + 1) & 0xFFFF;
            }
        }
        break;

    case 1: // source B
        {
            if (srcB)
            {
                for (u32 i = 0; i < width; i++)
                {
                    const u16 packed = srcB[srcBaddr];
                    structuredCaptureOutputPixels[static_cast<size_t>(i)] = packed;
                    dst[dstaddr] = packed;
                    if (packed != 0)
                        captureDestinationHasNonZeroPixel = true;
                    srcBaddr = (srcBaddr + 1) & 0xFFFF;
                    dstaddr = (dstaddr + 1) & 0xFFFF;
                }
            }
            else
            {
                for (u32 i = 0; i < width; i++)
                {
                    dst[dstaddr] = 0;
                    dstaddr = (dstaddr + 1) & 0xFFFF;
                }
            }
        }
        break;

    case 2: // sources A+B
    case 3:
        {
            u32 eva = captureCnt & 0x1F;
            u32 evb = (captureCnt >> 8) & 0x1F;

            // checkme
            if (eva > 16) eva = 16;
            if (evb > 16) evb = 16;

            if (srcB)
            {
                for (u32 i = 0; i < width; i++)
                {
                    u32 val = srcA[i];

                    // TODO: check what happens when alpha=0

                    u32 rA = (val >> 1) & 0x1F;
                    u32 gA = (val >> 9) & 0x1F;
                    u32 bA = (val >> 17) & 0x1F;
                    u32 aA = ((val >> 24) != 0) ? 1 : 0;

                    val = srcB[srcBaddr];

                    u32 rB = val & 0x1F;
                    u32 gB = (val >> 5) & 0x1F;
                    u32 bB = (val >> 10) & 0x1F;
                    u32 aB = val >> 15;

                    u32 rD = ((rA * aA * eva) + (rB * aB * evb) + 8) >> 4;
                    u32 gD = ((gA * aA * eva) + (gB * aB * evb) + 8) >> 4;
                    u32 bD = ((bA * aA * eva) + (bB * aB * evb) + 8) >> 4;
                    u32 aD = (eva>0 ? aA : 0) | (evb>0 ? aB : 0);

                    if (rD > 0x1F) rD = 0x1F;
                    if (gD > 0x1F) gD = 0x1F;
                    if (bD > 0x1F) bD = 0x1F;

                    const u16 packed = rD | (gD << 5) | (bD << 10) | (aD << 15);
                    structuredCaptureOutputPixels[static_cast<size_t>(i)] = packed;
                    dst[dstaddr] = packed;
                    if (packed != 0)
                        captureDestinationHasNonZeroPixel = true;
                    srcBaddr = (srcBaddr + 1) & 0xFFFF;
                    dstaddr = (dstaddr + 1) & 0xFFFF;
                }
            }
            else
            {
                for (u32 i = 0; i < width; i++)
                {
                    u32 val = srcA[i];

                    // TODO: check what happens when alpha=0

                    u32 rA = (val >> 1) & 0x1F;
                    u32 gA = (val >> 9) & 0x1F;
                    u32 bA = (val >> 17) & 0x1F;
                    u32 aA = ((val >> 24) != 0) ? 1 : 0;

                    u32 rD = ((rA * aA * eva) + 8) >> 4;
                    u32 gD = ((gA * aA * eva) + 8) >> 4;
                    u32 bD = ((bA * aA * eva) + 8) >> 4;
                    u32 aD = (eva>0 ? aA : 0);

                    const u16 packed = rD | (gD << 5) | (bD << 10) | (aD << 15);
                    structuredCaptureOutputPixels[static_cast<size_t>(i)] = packed;
                    dst[dstaddr] = packed;
                    if (packed != 0)
                        captureDestinationHasNonZeroPixel = true;
                    dstaddr = (dstaddr + 1) & 0xFFFF;
                }
            }
        }
        break;
    }

    if (captureBlendsStructuredSourceB)
    {
        const u32 mergeWidth = std::min<u32>(width, 256u);
        for (u32 i = 0; i < mergeWidth; i++)
        {
            const u32 overlayPixel = structuredSourceBOverlayPixels[static_cast<size_t>(i)];
            const u16 outputPacked = structuredCaptureOutputPixels[static_cast<size_t>(i)];
            const u16 overlayPacked = packCaptureColor(overlayPixel);
            if (!captureColorsClose(overlayPacked, outputPacked))
                continue;
            const bool canPreserveOverlay =
                StructuredVulkan2DCanPreserveCaptureOverlay(overlayPixel);
            const bool captureMatched3DOverlay =
                !canPreserveOverlay
                && outputPacked != 0u
                && StructuredVulkan2DCanUseCaptureMatched3DOverlay(overlayPixel);
            if (!canPreserveOverlay && !captureMatched3DOverlay)
                continue;

            MergeStructuredVulkan2DCapture2DOverlayPixel(
                dstvram,
                (structuredCaptureDstBase + i) & 0xFFFFu,
                overlayPixel,
                structuredSourceBOverlayControl[static_cast<size_t>(i)],
                structuredSourceBOverlayLineage[static_cast<size_t>(i)]);
        }
    }

    if (captureMetadataEnabled && captureLineUses3d)
        LastDebugCaptureStats.CaptureLineUses3dLines++;

    if (captureDebugEnabled)
    {
        if (captureLineHasUseful3dAlpha)
            LastDebugCaptureStats.CaptureLineUsefulAlphaLines++;
        if (!captureDestinationHasNonZeroPixel)
            LastDebugCaptureStats.CaptureDestinationBlankLines++;
    }

    const bool sameBankMode2CaptureLine =
        useStructuredVulkan2D
        && CurUnit->Num == 0u
        && captureMode == 2u
        && width == kStructuredScreenWidth
        && ((captureCnt >> 20u) & 0x3u) == 3u
        && (captureCnt & (1u << 25u)) == 0u
        && ((CurUnit->DispCnt >> 16u) & 0x3u) == 2u
        && dstvram == ((CurUnit->DispCnt >> 18u) & 0x3u)
        && (captureCnt & 0x1Fu) != 0u
        && ((captureCnt >> 8u) & 0x1Fu) != 0u;
    if (useStructuredVulkan2D)
    {
        const CaptureSourceIdentity* sourceIdentity =
            ((captureMode == 0u && captureLineUses3d)
                || sameBankMode2CaptureLine)
                && servedCaptureSourceIdentityValid
            ? &servedCaptureSourceIdentity
            : nullptr;
        SealStructuredVulkan2DCaptureIdentity(
            dstvram,
            structuredCaptureDstBase,
            width,
            sourceIdentity,
            StructuredCaptureWriterRoute::General);
    }

    const bool sameBankMode2Tuple = sameBankMode2CaptureLine;
    if (sameBankMode2Tuple)
    {
        if (line == 0u)
        {
            SameBankMode2PendingWriterIdentity = {};
            SameBankMode2PendingWriterLines = 0u;
            SameBankMode2PendingWriterConflict = false;
        }
        if (!servedCaptureSourceIdentityValid)
        {
            SameBankMode2PendingWriterConflict = true;
        }
        else if (SameBankMode2PendingWriterLines == 0u)
        {
            SameBankMode2PendingWriterIdentity =
                servedCaptureSourceIdentity;
        }
        else if (SameBankMode2PendingWriterIdentity.Sequence
                != servedCaptureSourceIdentity.Sequence
            || SameBankMode2PendingWriterIdentity.PolygonCount
                != servedCaptureSourceIdentity.PolygonCount
            || SameBankMode2PendingWriterIdentity.CaptureCnt
                != servedCaptureSourceIdentity.CaptureCnt
            || SameBankMode2PendingWriterIdentity.ScreenSwap
                != servedCaptureSourceIdentity.ScreenSwap)
        {
            SameBankMode2PendingWriterConflict = true;
        }
        SameBankMode2PendingWriterLines++;

        if (line + 1u == kStructuredScreenHeight)
        {
            const bool uniformFullWriter =
                !SameBankMode2PendingWriterConflict
                && SameBankMode2PendingWriterLines
                    == kStructuredScreenHeight
                && SameBankMode2PendingWriterIdentity.Valid;
            SameBankMode2WriterIdentity[dstvram] =
                uniformFullWriter
                    ? SameBankMode2PendingWriterIdentity
                    : CaptureSourceIdentity{};
            SameBankMode2WriterIdentityValid[dstvram] =
                uniformFullWriter;
            SameBankMode2CompletedWriterIdentity =
                SameBankMode2WriterIdentity[dstvram];
            SameBankMode2CompletedWriterVramBank = dstvram;
            SameBankMode2CompletedWriterIdentityValid =
                uniformFullWriter;
        }
    }

}

#define DoDrawBG(type, line, num) \
    do \
    { \
        if (!Renderer2DDebugShouldDraw##type##Bg(CurUnit->Num, num, bgCnt[num])) \
            break; \
        if ((bgCnt[num] & 0x0040) && (CurUnit->BGMosaicSize[0] > 0)) \
        { \
            if (TrackComposedObjCaptureIdentity) DrawBG_##type<true, DrawPixel_AccelTracked>(line, num); \
            else if (GPU.GPU3D.IsRendererAccelerated()) DrawBG_##type<true, DrawPixel_Accel>(line, num); \
            else DrawBG_##type<true, DrawPixel_Normal>(line, num); \
        } \
        else \
        { \
            if (TrackComposedObjCaptureIdentity) DrawBG_##type<false, DrawPixel_AccelTracked>(line, num); \
            else if (GPU.GPU3D.IsRendererAccelerated()) DrawBG_##type<false, DrawPixel_Accel>(line, num); \
            else DrawBG_##type<false, DrawPixel_Normal>(line, num); \
        } \
    } while (false)

#define DoDrawBG_Large(line) \
    do \
    { \
        if (!Renderer2DDebugShouldDrawLargeBg(CurUnit->Num, bgCnt[2])) \
            break; \
        if ((bgCnt[2] & 0x0040) && (CurUnit->BGMosaicSize[0] > 0)) \
        { \
            if (TrackComposedObjCaptureIdentity) DrawBG_Large<true, DrawPixel_AccelTracked>(line); \
            else if (GPU.GPU3D.IsRendererAccelerated()) DrawBG_Large<true, DrawPixel_Accel>(line); \
            else DrawBG_Large<true, DrawPixel_Normal>(line); \
        } \
        else \
        { \
            if (TrackComposedObjCaptureIdentity) DrawBG_Large<false, DrawPixel_AccelTracked>(line); \
            else if (GPU.GPU3D.IsRendererAccelerated()) DrawBG_Large<false, DrawPixel_Accel>(line); \
            else DrawBG_Large<false, DrawPixel_Normal>(line); \
        } \
    } while (false)

#define DoInterleaveSprites(prio) \
    if (Renderer2DDebugShouldInterleaveObjects(CurUnit->Num, ((prio) >> 16) & 0x3u)) { if (TrackComposedObjCaptureIdentity) InterleaveSprites<DrawPixel_AccelTracked>(prio); else if (GPU.GPU3D.IsRendererAccelerated()) InterleaveSprites<DrawPixel_Accel>(prio); else InterleaveSprites<DrawPixel_Normal>(prio); }

template<u32 bgmode>
void SoftRenderer::DrawScanlineBGMode(u32 line)
{
    u32 dispCnt = CurUnit->DispCnt;
    u16* bgCnt = CurUnit->BGCnt;
    for (int i = 3; i >= 0; i--)
    {
        if ((bgCnt[3] & 0x3) == i)
        {
            if (dispCnt & 0x0800)
            {
                if (bgmode >= 3)
                    DoDrawBG(Extended, line, 3);
                else if (bgmode >= 1)
                    DoDrawBG(Affine, line, 3);
                else
                    DoDrawBG(Text, line, 3);
            }
        }
        if ((bgCnt[2] & 0x3) == i)
        {
            if (dispCnt & 0x0400)
            {
                if (bgmode == 5)
                    DoDrawBG(Extended, line, 2);
                else if (bgmode == 4 || bgmode == 2)
                    DoDrawBG(Affine, line, 2);
                else
                    DoDrawBG(Text, line, 2);
            }
        }
        if ((bgCnt[1] & 0x3) == i)
        {
            if (dispCnt & 0x0200)
            {
                DoDrawBG(Text, line, 1);
            }
        }
        if ((bgCnt[0] & 0x3) == i)
        {
            if (dispCnt & 0x0100)
            {
                if (!CurUnit->Num && (dispCnt & 0x8))
                {
                    if (Renderer2DDebugShouldDraw3DBg(CurUnit->Num, bgCnt[0]))
                        DrawBG_3D();
                }
                else
                {
                    DoDrawBG(Text, line, 0);
                }
            }
        }
        if ((dispCnt & 0x1000) && NumSprites[CurUnit->Num])
        {
            DoInterleaveSprites(0x40000 | (i<<16));
        }

    }
}

void SoftRenderer::DrawScanlineBGMode6(u32 line)
{
    u32 dispCnt = CurUnit->DispCnt;
    u16* bgCnt = CurUnit->BGCnt;
    for (int i = 3; i >= 0; i--)
    {
        if ((bgCnt[2] & 0x3) == i)
        {
            if (dispCnt & 0x0400)
            {
                DoDrawBG_Large(line);
            }
        }
        if ((bgCnt[0] & 0x3) == i)
        {
            if (dispCnt & 0x0100)
            {
                if ((!CurUnit->Num) && (dispCnt & 0x8))
                {
                    if (Renderer2DDebugShouldDraw3DBg(CurUnit->Num, bgCnt[0]))
                        DrawBG_3D();
                }
            }
        }
        if ((dispCnt & 0x1000) && NumSprites[CurUnit->Num])
        {
            DoInterleaveSprites(0x40000 | (i<<16))
        }
    }
}

void SoftRenderer::DrawScanlineBGMode7(u32 line)
{
    u32 dispCnt = CurUnit->DispCnt;
    u16* bgCnt = CurUnit->BGCnt;
    // mode 7 only has text-mode BG0 and BG1

    for (int i = 3; i >= 0; i--)
    {
        if ((bgCnt[1] & 0x3) == i)
        {
            if (dispCnt & 0x0200)
            {
                DoDrawBG(Text, line, 1);
            }
        }
        if ((bgCnt[0] & 0x3) == i)
        {
            if (dispCnt & 0x0100)
            {
                if (!CurUnit->Num && (dispCnt & 0x8))
                {
                    if (Renderer2DDebugShouldDraw3DBg(CurUnit->Num, bgCnt[0]))
                        DrawBG_3D();
                }
                else
                {
                    DoDrawBG(Text, line, 0);
                }
            }
        }
        if ((dispCnt & 0x1000) && NumSprites[CurUnit->Num])
        {
            DoInterleaveSprites(0x40000 | (i<<16))
        }
    }
}

void SoftRenderer::DrawScanline_BGOBJ(u32 line)
{
    TrackComposedObjCaptureIdentity = false;
    if (!UseStructuredVulkan2D() && !MelonDSAndroid::areRendererDebugToolsEnabled())
    {
        if (CurUnit->DispCnt & (1<<7))
        {
            for (int i = 0; i < 256; i++)
                BGOBJLine[i] = 0xFF3F3F3F;

            return;
        }

        u64 backdrop;
        if (CurUnit->Num) backdrop = *(u16*)&GPU.Palette[0x400];
        else     backdrop = *(u16*)&GPU.Palette[0];

        {
            u8 r = (backdrop & 0x001F) << 1;
            u8 g = (backdrop & 0x03E0) >> 4;
            u8 b = (backdrop & 0x7C00) >> 9;

            backdrop = r | (g << 8) | (b << 16) | 0x20000000;
            backdrop |= (backdrop << 32);

            for (int i = 0; i < 256; i+=2)
                *(u64*)&BGOBJLine[i] = backdrop;
        }

        if (CurUnit->DispCnt & 0xE000)
            CurUnit->CalculateWindowMask(line, WindowMask, OBJWindow[CurUnit->Num]);
        else
            memset(WindowMask, 0xFF, 256);

        ApplySpriteMosaicX();
        CurBGXMosaicTable = MosaicTable[CurUnit->BGMosaicSize[0]].data();

        switch (CurUnit->DispCnt & 0x7)
        {
        case 0: DrawScanlineBGMode<0>(line); break;
        case 1: DrawScanlineBGMode<1>(line); break;
        case 2: DrawScanlineBGMode<2>(line); break;
        case 3: DrawScanlineBGMode<3>(line); break;
        case 4: DrawScanlineBGMode<4>(line); break;
        case 5: DrawScanlineBGMode<5>(line); break;
        case 6: DrawScanlineBGMode6(line); break;
        case 7: DrawScanlineBGMode7(line); break;
        }

        if (!GPU.GPU3D.IsRendererAccelerated())
        {
            for (int i = 0; i < 256; i++)
            {
                u32 val1 = BGOBJLine[i];
                u32 val2 = BGOBJLine[256+i];

                BGOBJLine[i] = ColorComposite(i, val1, val2);
            }
        }
        else
        {
            if (CurUnit->Num == 0)
            {
                for (int i = 0; i < 256; i++)
                {
                    u32 val1 = BGOBJLine[i];
                    u32 val2 = BGOBJLine[256+i];
                    u32 val3 = BGOBJLine[512+i];

                    u32 flag1 = val1 >> 24;
                    u32 flag2 = val2 >> 24;

                    u32 bldcnteffect = (CurUnit->BlendCnt >> 6) & 0x3;

                    u32 target1;
                    if      (flag1 & 0x80) target1 = 0x0010;
                    else if (flag1 & 0x40) target1 = 0x0001;
                    else                   target1 = flag1;

                    u32 target2;
                    if      (flag2 & 0x80) target2 = 0x1000;
                    else if (flag2 & 0x40) target2 = 0x0100;
                    else                   target2 = flag2 << 8;

                    if (((flag1 & 0xC0) == 0x40) && (CurUnit->BlendCnt & target2))
                    {
                        BGOBJLine[i]     = val2;
                        BGOBJLine[256+i] = ColorComposite(i, val2, val3);
                        BGOBJLine[512+i] = 0x04000000;
                    }
                    else if ((flag1 & 0xC0) == 0x40)
                    {
                        if (bldcnteffect == 1)             bldcnteffect = 0;
                        if (!(CurUnit->BlendCnt & 0x0001)) bldcnteffect = 0;
                        if (!(WindowMask[i] & 0x20))       bldcnteffect = 0;

                        BGOBJLine[i]     = val2;
                        BGOBJLine[256+i] = ColorComposite(i, val2, val3);
                        BGOBJLine[512+i] = (bldcnteffect << 24) | (CurUnit->EVY << 8);
                    }
                    else if (((flag2 & 0xC0) == 0x40) && ((CurUnit->BlendCnt & 0x01C0) == 0x0140))
                    {
                        u32 eva, evb;
                        if ((flag1 & 0xC0) == 0xC0)
                        {
                            eva = flag1 & 0x1F;
                            evb = 16 - eva;
                        }
                        else if (((CurUnit->BlendCnt & target1) && (WindowMask[i] & 0x20)) ||
                                ((flag1 & 0xC0) == 0x80))
                        {
                            eva = CurUnit->EVA;
                            evb = CurUnit->EVB;
                        }
                        else
                            bldcnteffect = 7;

                        BGOBJLine[i]     = val1;
                        BGOBJLine[256+i] = ColorComposite(i, val1, val3);
                        BGOBJLine[512+i] = (bldcnteffect << 24) | (CurUnit->EVB << 16) | (CurUnit->EVA << 8);
                    }
                    else
                    {
                        BGOBJLine[i]     = ColorComposite(i, val1, val2);
                        BGOBJLine[256+i] = 0;
                        BGOBJLine[512+i] = 0x07000000;
                    }
                }
            }
            else
            {
                for (int i = 0; i < 256; i++)
                {
                    u32 val1 = BGOBJLine[i];
                    u32 val2 = BGOBJLine[256+i];

                    BGOBJLine[i]     = ColorComposite(i, val1, val2);
                    BGOBJLine[256+i] = 0;
                    BGOBJLine[512+i] = 0x07000000;
                }
            }
        }

        if (CurUnit->BGMosaicY >= CurUnit->BGMosaicYMax)
        {
            CurUnit->BGMosaicY = 0;
            CurUnit->BGMosaicYMax = CurUnit->BGMosaicSize[1];
        }
        else
            CurUnit->BGMosaicY++;

        return;
    }

    struct CaptureSamplePoint
    {
        const char* label;
        u32 x;
        u32 y;
    };
    static constexpr CaptureSamplePoint kCaptureSamplePoints[] = {
        {"seamA", 85u, 14u},
        {"goodA", 84u, 14u},
        {"seamB", 75u, 58u},
        {"goodB", 74u, 58u},
        {"seamC", 150u, 81u},
        {"goodC", 149u, 81u},
        {"hud_gem_l",   8u,  8u},
        {"hud_gem_r",  16u, 10u},
        {"hud_text",   24u,  8u},
        {"hud_can",    50u,  8u},
        {"hud_arrow",  35u, 18u},
        {"hud_lawn",    5u, 65u},
        {"band_mid",  128u, 132u},
        {"band_lo",   128u, 145u},
        {"band_hi",   128u, 120u},
    };
    const bool logCaptureSamples = MelonDSAndroid::areRendererDebugBgObjLogsEnabled();
    const bool useStructuredVulkan2D = UseStructuredVulkan2D();
    const bool measureStructuredBgObj =
        useStructuredVulkan2D && MelonDSAndroid::isVulkanGpu2DPerfLoggingEnabled();
    const u64 structuredBgObjStartNs = measureStructuredBgObj ? PerfNowNs() : 0;

    auto logHudStageAfterBGMode =
        [&]() {
            if (!logCaptureSamples)
                return;
            for (const CaptureSamplePoint& sample : kCaptureSamplePoints)
            {
                if (sample.y != line)
                    continue;
                const u32 i = sample.x;
                if (i >= 256)
                    continue;
                Platform::Log(
                    Platform::LogLevel::Warn,
                    "RendererDebug[BGOBJ]: stage=after_bgmode unit=%u label=%s line=%u x=%u v0=%08X v1=%08X v2=%08X",
                    CurUnit->Num,
                    sample.label,
                    line,
                    i,
                    BGOBJLine[i],
                    BGOBJLine[256+i],
                    BGOBJLine[512+i]
                );
            }
        };

    // forced blank disables BG/OBJ compositing
    if (CurUnit->DispCnt & (1<<7))
    {
        for (int i = 0; i < 256; i++)
            BGOBJLine[i] = 0xFF3F3F3F;

        return;
    }

    TrackComposedObjCaptureIdentity =
        useStructuredVulkan2D
        && GPU.GPU3D.IsRendererAccelerated()
        && CurUnit->Num == 1u
        && OBJLineCaptureIdentityAvailable[CurUnit->Num]
        && line < kStructuredScreenHeight;
    if (TrackComposedObjCaptureIdentity)
        ComposedObjCaptureIdentity.fill({});

    u64 backdrop;
    if (CurUnit->Num) backdrop = *(u16*)&GPU.Palette[0x400];
    else     backdrop = *(u16*)&GPU.Palette[0];

    {
        u8 r = (backdrop & 0x001F) << 1;
        u8 g = (backdrop & 0x03E0) >> 4;
        u8 b = (backdrop & 0x7C00) >> 9;

        backdrop = r | (g << 8) | (b << 16) | 0x20000000;
        backdrop |= (backdrop << 32);

        for (int i = 0; i < 256; i+=2)
        {
            *(u64*)&BGOBJLine[i] = backdrop;
            if (useStructuredVulkan2D)
            {
                *(u64*)&BGOBJLine[256 + i] = 0;
                *(u64*)&BGOBJLine[512 + i] = 0;
            }
        }
    }

    if (CurUnit->DispCnt & 0xE000)
        CurUnit->CalculateWindowMask(line, WindowMask, OBJWindow[CurUnit->Num]);
    else
        memset(WindowMask, 0xFF, 256);

    ApplySpriteMosaicX();
    CurBGXMosaicTable = MosaicTable[CurUnit->BGMosaicSize[0]].data();

    u32 bgMode = CurUnit->DispCnt & 0x7;
    const int forcedBgMode = MelonDSAndroid::getRenderer2DDebugForcedMode(CurUnit->Num);
    if (forcedBgMode >= 0 && forcedBgMode <= 6)
        bgMode = static_cast<u32>(forcedBgMode);

    const u64 structuredBgObjBgStartNs = measureStructuredBgObj ? PerfNowNs() : 0;
    switch (bgMode)
    {
    case 0: DrawScanlineBGMode<0>(line); break;
    case 1: DrawScanlineBGMode<1>(line); break;
    case 2: DrawScanlineBGMode<2>(line); break;
    case 3: DrawScanlineBGMode<3>(line); break;
    case 4: DrawScanlineBGMode<4>(line); break;
    case 5: DrawScanlineBGMode<5>(line); break;
    case 6: DrawScanlineBGMode6(line); break;
    case 7: DrawScanlineBGMode7(line); break;
    }
    const u64 structuredBgObjAfterBgNs = measureStructuredBgObj ? PerfNowNs() : 0;

    logHudStageAfterBGMode();

    if (useStructuredVulkan2D
        && GPU.GPU3D.IsRendererAccelerated()
        && !CurrentLineRegularCaptureUses3d
        && TryPromoteStructuredVulkan2DComposedPure3DLine(line, CurUnit->MasterBrightness))
    {
        if (measureStructuredBgObj)
        {
            const u64 structuredBgObjEndNs = PerfNowNs();
            RecordStructuredBGObjPerf(
                structuredBgObjBgStartNs - structuredBgObjStartNs,
                structuredBgObjAfterBgNs - structuredBgObjBgStartNs,
                0,
                structuredBgObjEndNs - structuredBgObjAfterBgNs);
        }

        if (CurUnit->BGMosaicY >= CurUnit->BGMosaicYMax)
        {
            CurUnit->BGMosaicY = 0;
            CurUnit->BGMosaicYMax = CurUnit->BGMosaicSize[1];
        }
        else
            CurUnit->BGMosaicY++;

        TrackComposedObjCaptureIdentity = false;
        return;
    }

    // color special effects
    // can likely be optimized

    if (!GPU.GPU3D.IsRendererAccelerated())
    {
        for (int i = 0; i < 256; i++)
        {
            u32 val1 = BGOBJLine[i];
            u32 val2 = BGOBJLine[256+i];

            BGOBJLine[i] = ColorComposite(i, val1, val2);
        }
    }
    else
    {
        const u32 displayMode =
            (CurUnit->DispCnt >> 16u) & (CurUnit->Num ? 0x1u : 0x3u);
        const bool trackKnownExactLine =
            useStructuredVulkan2D
            && StructuredVulkan2DCurrentLineMapsDirectly
            && displayMode == 1u
            && line < kStructuredScreenHeight;
        bool knownExactLine = trackKnownExactLine;
        u32 knownExactPixelCount = 0u;
        const size_t knownExactScreenIndex =
            StructuredVulkan2DCurrentLineTargetsTop ? 0u : 1u;
        const size_t knownExactLineIndex =
            (knownExactScreenIndex * kStructuredScreenHeight)
            + (line < kStructuredScreenHeight ? static_cast<size_t>(line) : 0u);
        const bool captureBacked3DLine =
            useStructuredVulkan2D
            &&
            CurUnit->Num == 1
            && displayMode == 1u
            && line < CaptureLineUses3d.size()
            && CaptureLineUses3d[line] != 0u;
        u32 captureBacked3DSourceClass = 0u;
        bool captureBackedNoDominantReplay = false;
        if (captureBacked3DLine)
        {
            LastDebugCaptureStats.CaptureBacked3DLines++;
            u32 sourceCounts[17] {};
            bool lineHasExplicit3DSlot = false;
            for (int i = 0; i < 256; i++)
            {
                lineHasExplicit3DSlot =
                    lineHasExplicit3DSlot
                    || StructuredVulkan2DHas3DSlot(BGOBJLine[i])
                    || StructuredVulkan2DHas3DSlot(BGOBJLine[256+i])
                    || StructuredVulkan2DHas3DSlot(BGOBJLine[512+i]);
                const u32 sourceClass = StructuredVulkan2DSourceClass(BGOBJLine[i]);
                if (sourceClass <= 16u)
                    sourceCounts[sourceClass]++;
            }

            if (!lineHasExplicit3DSlot)
            {
                constexpr u32 sourceClasses[] = {1u, 2u, 4u, 8u};
                u32 bestSourceClass = 0u;
                u32 bestSourceCount = 0u;
                for (u32 sourceClass : sourceClasses)
                {
                    if (sourceCounts[sourceClass] > bestSourceCount)
                    {
                        bestSourceCount = sourceCounts[sourceClass];
                        bestSourceClass = sourceClass;
                    }
                }

                if (bestSourceCount >= 128u)
                    captureBacked3DSourceClass = bestSourceClass;
                else
                {
                    LastDebugCaptureStats.CaptureBacked3DNoBestClassLines++;
                    captureBackedNoDominantReplay = true;
                }
            }
            else
            {
                LastDebugCaptureStats.CaptureBacked3DExplicitSlotLines++;
            }

            if (captureBacked3DSourceClass < (sizeof(LastDebugCaptureStats.CaptureBacked3DBestClassCounts) / sizeof(LastDebugCaptureStats.CaptureBacked3DBestClassCounts[0])))
                LastDebugCaptureStats.CaptureBacked3DBestClassCounts[captureBacked3DSourceClass]++;
        }
        const u64 structuredBgObjAfterClassifyNs = measureStructuredBgObj ? PerfNowNs() : 0;

        if (CurUnit->Num == 0)
        {
            const size_t structuredScreenIndex = StructuredVulkan2DCurrentLineTargetsTop ? 0u : 1u;
            const size_t structuredScreenBase = structuredScreenIndex * kStructuredPlaneCount * kStructuredPixelCount;
            const size_t structuredLineIndex =
                (structuredScreenIndex * kStructuredScreenHeight) + static_cast<size_t>(line);
            const size_t structuredRowBase = static_cast<size_t>(line) * kStructuredScreenWidth;

            DirectCaptureDeferredTail =
                DirectCaptureSourceLineSink
                && GPU.GPU3D.IsRendererAccelerated()
                && ((CurUnit->BlendCnt >> 6u) & 0x3u) == 3u
                && (CurUnit->BlendCnt & 0x0001u) != 0u;
            if (DirectCaptureDeferredTail)
            {
                const u32 captureCnt = CurUnit->CaptureCnt;
                const u32 captureBank = (captureCnt >> 16u) & 0x3u;
                const u32 captureAddressBase = static_cast<u32>(line) * kStructuredScreenWidth;
                const size_t captureBase =
                    static_cast<size_t>(captureBank) * kStructuredPlaneCount * kStructuredPixelCount;
                for (u32 x = 0; x < kStructuredScreenWidth; x++)
                {
                    const u32 raw0 = BGOBJLine[x];
                    const u32 raw1 = BGOBJLine[kStructuredScreenWidth + x];
                    const u32 raw2 = BGOBJLine[(kStructuredScreenWidth * 2u) + x];
                    const u32 flags1 = raw1 >> 24u;
                    const u32 target2 = (flags1 & 0x80u) != 0u
                        ? 0x1000u
                        : ((flags1 & 0x40u) != 0u ? 0x0100u : (flags1 << 8u));
                    const u32 tail1 = ColorComposite(static_cast<int>(x), raw1, raw2);
                    const bool pixelShapeMatches =
                        StructuredVulkan2DHas3DSlot(raw0)
                        && !StructuredVulkan2DHas3DSlot(raw1)
                        && !StructuredVulkan2DHas3DSlot(raw2)
                        && StructuredVulkan2DSourceClass(raw0) == 0u
                        && StructuredVulkan2DSourceClass(raw1) == 0u
                        && StructuredVulkan2DSourceClass(raw2) == 0u
                        && !StructuredVulkan2DCanPreserveCaptureOverlay(raw1)
                        && (CurUnit->BlendCnt & target2) == 0u
                        && (WindowMask[x] & 0x20u) != 0u
                        && StructuredVulkan2DSourceClass(tail1) == 0u;
                    if (!pixelShapeMatches)
                    {
                        DirectCaptureDeferredTail = false;
                        break;
                    }

                    const size_t captureIndex =
                        static_cast<size_t>((captureAddressBase + x) & 0xFFFFu);
                    const u32 oldBelow = StructuredVulkan2DCapturePlanes[captureBase + captureIndex];
                    const u32 oldAbove = StructuredVulkan2DCapturePlanes[
                        captureBase + kStructuredPixelCount + captureIndex];
                    const u32 oldControl = StructuredVulkan2DCapturePlanes[
                        captureBase + (kStructuredPixelCount * 2u) + captureIndex];
                    const u32 oldAlpha = oldControl >> 24u;
                    const bool oldSlot = (oldAlpha & kStructuredVulkan2DSlot3DFlag) != 0u;
                    const bool oldAboveCandidate =
                        StructuredVulkan2DCanPreserveCaptureOverlay(oldAbove)
                        || StructuredVulkan2DCanUseCaptureMatched3DOverlay(oldAbove);
                    const bool oldBelowCandidate =
                        StructuredVulkan2DCanPreserveCaptureOverlay(oldBelow)
                        || StructuredVulkan2DCanUseCaptureMatched3DOverlay(oldBelow);
                    const bool oldOverlayVisible =
                        (oldSlot
                            && (oldAlpha & kStructuredVulkan2DAbove3DFlag) != 0u
                            && oldAbove != 0u
                            && oldAboveCandidate)
                        || (!oldSlot
                            && (oldAlpha & kStructuredVulkan2DOnlyFlag) != 0u
                            && oldBelow != 0u
                            && oldBelowCandidate);
                    if (oldOverlayVisible)
                    {
                        DirectCaptureDeferredTail = false;
                        break;
                    }
                }
            }
            for (int i = 0; i < 256; i++)
            {
                const u32 originalVal1 = BGOBJLine[i];
                const u32 originalVal2 = BGOBJLine[256+i];
                const u32 originalVal3 = BGOBJLine[512+i];

                u32 val1 = originalVal1;
                u32 val2 = originalVal2;
                u32 val3 = originalVal3;

                u32 flag1 = val1 >> 24;
                u32 flag2 = val2 >> 24;

                u32 bldcnteffect = (CurUnit->BlendCnt >> 6) & 0x3;

                u32 target1;
                if      (flag1 & 0x80) target1 = 0x0010;
                else if (flag1 & 0x40) target1 = 0x0001;
                else                   target1 = flag1;

                u32 target2;
                if      (flag2 & 0x80) target2 = 0x1000;
                else if (flag2 & 0x40) target2 = 0x0100;
                else                   target2 = flag2 << 8;

                if (((flag1 & 0xC0) == 0x40) && (CurUnit->BlendCnt & target2))
                {
                    // 3D on top, blending

                    BGOBJLine[i]     = val2;
                    BGOBJLine[256+i] = ColorComposite(i, val2, val3);
                    BGOBJLine[512+i] = 0x04000000;
                }
                else if ((flag1 & 0xC0) == 0x40)
                {
                    // 3D on top, normal/fade

                    if (bldcnteffect == 1)             bldcnteffect = 0;
                    if (!(CurUnit->BlendCnt & 0x0001)) bldcnteffect = 0;
                    if (!(WindowMask[i] & 0x20))       bldcnteffect = 0;

                    BGOBJLine[i]     = val2;
                    BGOBJLine[256+i] = ColorComposite(i, val2, val3);
                    BGOBJLine[512+i] = (bldcnteffect << 24) | (CurUnit->EVY << 8);
                }
                else if (((flag2 & 0xC0) == 0x40) && ((CurUnit->BlendCnt & 0x01C0) == 0x0140))
                {
                    // 3D on bottom, blending

                    u32 eva, evb;
                    if ((flag1 & 0xC0) == 0xC0)
                    {
                        eva = flag1 & 0x1F;
                        evb = 16 - eva;
                    }
                    else if (((CurUnit->BlendCnt & target1) && (WindowMask[i] & 0x20)) ||
                            ((flag1 & 0xC0) == 0x80))
                    {
                        eva = CurUnit->EVA;
                        evb = CurUnit->EVB;
                    }
                    else
                        bldcnteffect = 7;

                    BGOBJLine[i]     = val1;
                    BGOBJLine[256+i] = ColorComposite(i, val1, val3);
                    BGOBJLine[512+i] = (bldcnteffect << 24) | (CurUnit->EVB << 16) | (CurUnit->EVA << 8);
                }
                else
                {
                    // no potential 3D pixel involved

                    const u32 flag3 = originalVal3 >> 24;
                    const bool overlayOver3d = useStructuredVulkan2D
                        && (((flag2 & 0xC0u) == 0x40u)
                            || ((flag3 & 0xC0u) == 0x40u));

                    u32 overlayBlend = 0u;
                    if (overlayOver3d)
                    {
                        u32 target1Mask = flag1;
                        if      (target1Mask & 0x80u) target1Mask = 0x10u;
                        else if (target1Mask & 0x40u) target1Mask = 0x01u;
                        const bool spriteBlend = (flag1 & 0x80u) != 0u;
                        const bool effect1 = ((CurUnit->BlendCnt >> 6u) & 0x3u) == 1u;
                        const bool targets3dBelow = (CurUnit->BlendCnt & 0x0100u) != 0u;
                        if (targets3dBelow
                            && (spriteBlend
                                || (effect1
                                    && (CurUnit->BlendCnt & target1Mask)
                                    && (WindowMask[i] & 0x20u))))
                        {
                            u32 eva, evb;
                            if ((flag1 & 0xC0u) == 0xC0u)
                            {
                                eva = flag1 & 0x1Fu;
                                evb = 16u - eva;
                            }
                            else
                            {
                                eva = CurUnit->EVA;
                                evb = CurUnit->EVB;
                            }
                            overlayBlend = (evb << 16u) | (eva << 8u);
                        }
                    }

                    BGOBJLine[i]     = ColorComposite(i, val1, val2);
                    BGOBJLine[256+i] = 0;
                    BGOBJLine[512+i] = (overlayOver3d ? 0x87000000u : 0x07000000u) | overlayBlend;
                }

                if (useStructuredVulkan2D && !DirectCaptureDeferredTail)
                {
                    knownExactLine = StoreStructuredVulkan2DPixel(
                        structuredRowBase + static_cast<size_t>(i),
                        structuredScreenBase,
                        structuredLineIndex,
                        originalVal1,
                        originalVal2,
                        originalVal3,
                        BGOBJLine[i],
                        BGOBJLine[256+i],
                        BGOBJLine[512+i],
                        captureBacked3DSourceClass,
                        false,
                        knownExactLine)
                        && knownExactLine;
                    knownExactPixelCount++;
                }

                if (logCaptureSamples)
                {
                    for (const CaptureSamplePoint& sample : kCaptureSamplePoints)
                    {
                        if (sample.y != line || sample.x != static_cast<u32>(i))
                            continue;

                        Platform::Log(
                            Platform::LogLevel::Warn,
                            "RendererDebug[BGOBJ]: unit=%u label=%s line=%u x=%u pre0=%08X pre1=%08X pre2=%08X out0=%08X out1=%08X out2=%08X",
                            CurUnit->Num,
                            sample.label,
                            line,
                            static_cast<u32>(i),
                            originalVal1,
                            originalVal2,
                            originalVal3,
                            BGOBJLine[i],
                            BGOBJLine[256+i],
                            BGOBJLine[512+i]
                        );
                        break;
                    }
                }
            }

        }
        else
        {
            const size_t structuredScreenIndex = StructuredVulkan2DCurrentLineTargetsTop ? 0u : 1u;
            const size_t structuredScreenBase = structuredScreenIndex * kStructuredPlaneCount * kStructuredPixelCount;
            const size_t structuredLineIndex =
                (structuredScreenIndex * kStructuredScreenHeight) + static_cast<size_t>(line);
            const size_t structuredRowBase = static_cast<size_t>(line) * kStructuredScreenWidth;

            for (int i = 0; i < 256; i++)
            {
                const u32 originalVal1 = BGOBJLine[i];
                const u32 originalVal2 = BGOBJLine[256+i];
                const u32 originalVal3 = BGOBJLine[512+i];

                u32 val1 = originalVal1;
                u32 val2 = originalVal2;

                const u32 flag2 = originalVal2 >> 24;
                const u32 flag3 = originalVal3 >> 24;
                const bool overlayOver3d = useStructuredVulkan2D
                    && (((flag2 & 0xC0u) == 0x40u)
                        || ((flag3 & 0xC0u) == 0x40u));

                u32 overlayBlend = 0u;
                if (overlayOver3d)
                {
                    const u32 flag1 = originalVal1 >> 24;
                    u32 target1Mask = flag1;
                    if      (target1Mask & 0x80u) target1Mask = 0x10u;
                    else if (target1Mask & 0x40u) target1Mask = 0x01u;
                    const bool spriteBlend = (flag1 & 0x80u) != 0u;
                    const bool effect1 = ((CurUnit->BlendCnt >> 6u) & 0x3u) == 1u;
                    const bool targets3dBelow = (CurUnit->BlendCnt & 0x0100u) != 0u;
                    if (targets3dBelow
                        && (spriteBlend
                            || (effect1
                                && (CurUnit->BlendCnt & target1Mask)
                                && (WindowMask[i] & 0x20u))))
                    {
                        u32 eva, evb;
                        if ((flag1 & 0xC0u) == 0xC0u)
                        {
                            eva = flag1 & 0x1Fu;
                            evb = 16u - eva;
                        }
                        else
                        {
                            eva = CurUnit->EVA;
                            evb = CurUnit->EVB;
                        }
                        overlayBlend = (evb << 16u) | (eva << 8u);
                    }
                }

                BGOBJLine[i]     = ColorComposite(i, val1, val2);
                BGOBJLine[256+i] = 0;
                BGOBJLine[512+i] = (overlayOver3d ? 0x87000000u : 0x07000000u) | overlayBlend;

                if (useStructuredVulkan2D)
                {
                    knownExactLine = StoreStructuredVulkan2DPixel(
                        structuredRowBase + static_cast<size_t>(i),
                        structuredScreenBase,
                        structuredLineIndex,
                        originalVal1,
                        originalVal2,
                        originalVal3,
                        BGOBJLine[i],
                        BGOBJLine[256+i],
                        BGOBJLine[512+i],
                        captureBacked3DSourceClass,
                        captureBackedNoDominantReplay,
                        knownExactLine)
                        && knownExactLine;
                    ObserveFinalStructuredVulkan2DObjCaptureIdentity(
                        structuredRowBase + static_cast<size_t>(i),
                        structuredScreenBase,
                        originalVal1,
                        originalVal2,
                        originalVal3);
                    knownExactPixelCount++;
                }

                if (logCaptureSamples)
                {
                    for (const CaptureSamplePoint& sample : kCaptureSamplePoints)
                    {
                        if (sample.y != line || sample.x != static_cast<u32>(i))
                            continue;

                        Platform::Log(
                            Platform::LogLevel::Warn,
                            "RendererDebug[BGOBJ]: unit=%u label=%s line=%u x=%u pre0=%08X pre1=%08X pre2=%08X out0=%08X out1=%08X out2=%08X",
                            CurUnit->Num,
                            sample.label,
                            line,
                            static_cast<u32>(i),
                            originalVal1,
                            originalVal2,
                            originalVal3,
                            BGOBJLine[i],
                            BGOBJLine[256+i],
                            BGOBJLine[512+i]
                        );
                        break;
                    }
                }
            }

        }
        if (useStructuredVulkan2D && line < kStructuredScreenHeight)
        {
            StructuredVulkan2DLineKnownExact[knownExactLineIndex] =
                knownExactLine && knownExactPixelCount == kStructuredScreenWidth ? 1u : 0u;
        }
        TrackComposedObjCaptureIdentity = false;
        if (measureStructuredBgObj)
        {
            const u64 structuredBgObjEndNs = PerfNowNs();
            RecordStructuredBGObjPerf(
                structuredBgObjBgStartNs - structuredBgObjStartNs,
                structuredBgObjAfterBgNs - structuredBgObjBgStartNs,
                structuredBgObjAfterClassifyNs - structuredBgObjAfterBgNs,
                structuredBgObjEndNs - structuredBgObjAfterClassifyNs);
        }
    }

    if (CurUnit->BGMosaicY >= CurUnit->BGMosaicYMax)
    {
        CurUnit->BGMosaicY = 0;
        CurUnit->BGMosaicYMax = CurUnit->BGMosaicSize[1];
    }
    else
        CurUnit->BGMosaicY++;

    /*if (OBJMosaicY >= OBJMosaicYMax)
    {
        OBJMosaicY = 0;
        OBJMosaicYMax = OBJMosaicSize[1];
    }
    else
        OBJMosaicY++;*/
}


void SoftRenderer::DrawPixel_Normal(SoftRenderer& renderer, u32* dst, u16 color, u32 flag)
{
    (void)renderer;
    u8 r = (color & 0x001F) << 1;
    u8 g = (color & 0x03E0) >> 4;
    u8 b = (color & 0x7C00) >> 9;
    //g |= ((color & 0x8000) >> 15);

    *(dst+256) = *dst;
    *dst = r | (g << 8) | (b << 16) | flag;
}

void SoftRenderer::DrawPixel_Accel(SoftRenderer& renderer, u32* dst, u16 color, u32 flag)
{
    (void)renderer;
    u8 r = (color & 0x001F) << 1;
    u8 g = (color & 0x03E0) >> 4;
    u8 b = (color & 0x7C00) >> 9;

    *(dst+512) = *(dst+256);
    *(dst+256) = *dst;
    *dst = r | (g << 8) | (b << 16) | flag;
}

void SoftRenderer::DrawPixel_AccelTracked(SoftRenderer& renderer, u32* dst, u16 color, u32 flag)
{
    u8 r = (color & 0x001F) << 1;
    u8 g = (color & 0x03E0) >> 4;
    u8 b = (color & 0x7C00) >> 9;

    renderer.ShiftComposedObjCaptureIdentity(dst);
    *(dst+512) = *(dst+256);
    *(dst+256) = *dst;
    *dst = r | (g << 8) | (b << 16) | flag;
}

void SoftRenderer::PushRawPixel_Accel(u32* dst, u32 value)
{
    if (TrackComposedObjCaptureIdentity)
        ShiftComposedObjCaptureIdentity(dst);
    *(dst+512) = *(dst+256);
    *(dst+256) = *dst;
    *dst = value;
}

bool SoftRenderer::TryDrawStructuredVulkan2DCapturePixel(u32* dst, u32 flatByteAddress)
{
    if (!UseStructuredVulkan2D())
        return false;

    const u32 displayMode =
        (CurUnit->DispCnt >> 16u) & (CurUnit->Num ? 0x1u : 0x3u);
    if (displayMode != 1u)
        return false;

    const u32 maskedByteAddress = flatByteAddress & (CurUnit->Num ? 0x1FFFFu : 0x7FFFFu);
    const u32 mapMask = CurUnit->Num
        ? GPU.VRAMMap_BBG[(maskedByteAddress >> 14u) & 0x7u]
        : GPU.VRAMMap_ABG[(maskedByteAddress >> 14u) & 0x1Fu];

    const u32 captureAddress = (maskedByteAddress & 0x1FFFFu) >> 1u;
    if (captureAddress >= kStructuredPixelCount)
        return false;

    struct StructuredCaptureCandidate
    {
        bool Valid = false;
        bool Slot = false;
        bool Above = false;
        u32 BelowPlane = 0u;
        u32 AbovePlane = 0u;
    };
    StructuredCaptureCandidate fallbackSlot;
    StructuredCaptureCandidate fallback2D;

    auto emitCandidate =
        [&](const StructuredCaptureCandidate& candidate) {
            if (candidate.Slot)
            {
                if (candidate.BelowPlane != 0u)
                    PushRawPixel_Accel(dst, candidate.BelowPlane);
                PushRawPixel_Accel(dst, 0x40000000u);
                if (candidate.Above)
                    PushRawPixel_Accel(dst, candidate.AbovePlane);
                CurrentLineRegularCaptureUses3d = true;
            }
            else
            {
                PushRawPixel_Accel(dst, candidate.BelowPlane);
            }
        };

    u32 mappedBanks = mapMask & 0xFu;
    while (mappedBanks != 0u)
    {
        const u32 vramBank = static_cast<u32>(__builtin_ctz(mappedBanks));
        mappedBanks &= mappedBanks - 1u;

        const size_t lineValidIndex =
            (static_cast<size_t>(vramBank) * kStructuredScreenHeight)
                + (captureAddress / kStructuredScreenWidth);
        if (StructuredVulkan2DCaptureLineValid[lineValidIndex] == 0u)
            continue;

        const size_t captureBase =
            static_cast<size_t>(vramBank) * kStructuredPlaneCount * kStructuredPixelCount;
        const size_t captureIndex = static_cast<size_t>(captureAddress);
        const u32 belowPlane = StructuredVulkan2DCapturePlanes[captureBase + captureIndex];
        const u32 abovePlane =
            StructuredVulkan2DCapturePlanes[captureBase + kStructuredPixelCount + captureIndex];
        const u32 control =
            StructuredVulkan2DCapturePlanes[captureBase + (kStructuredPixelCount * 2u) + captureIndex];
        const u32 controlAlpha = control >> 24u;
        if (controlAlpha == 0u)
            continue;

        const bool structuredSlot = (controlAlpha & kStructuredVulkan2DSlot3DFlag) != 0u;
        if (structuredSlot)
        {
            StructuredCaptureCandidate candidate;
            candidate.Valid = true;
            candidate.Slot = true;
            candidate.Above =
                (controlAlpha & kStructuredVulkan2DAbove3DFlag) != 0u
                && abovePlane != 0u
                && StructuredVulkan2DCanPreserveCaptureOverlay(abovePlane);
            candidate.BelowPlane = belowPlane;
            candidate.AbovePlane = abovePlane;
            if (candidate.Above)
            {
                emitCandidate(candidate);
                return true;
            }
            if (!fallbackSlot.Valid)
                fallbackSlot = candidate;
            continue;
        }

        if ((controlAlpha & kStructuredVulkan2DOnlyFlag) != 0u
            && belowPlane != 0u
            && StructuredVulkan2DCanPreserveCaptureOverlay(belowPlane))
        {
            if (!fallback2D.Valid)
            {
                fallback2D.Valid = true;
                fallback2D.BelowPlane = belowPlane;
            }
            continue;
        }
    }

    if (fallback2D.Valid)
    {
        emitCandidate(fallback2D);
        return true;
    }
    if (fallbackSlot.Valid)
    {
        emitCandidate(fallbackSlot);
        return true;
    }

    return false;
}

void SoftRenderer::DrawBG_3D()
{
    if (!Renderer2DDebugShouldDraw3DBg(CurUnit->Num, CurUnit->BGCnt[0]))
        return;

    int i = 0;

    if (GPU.GPU3D.IsRendererAccelerated())
    {
        if (TrackComposedObjCaptureIdentity)
        {
            for (i = 0; i < 256; i++)
            {
                if (!(WindowMask[i] & 0x01)) continue;
                ShiftComposedObjCaptureIdentity(&BGOBJLine[i]);
                BGOBJLine[i+512] = BGOBJLine[i+256];
                BGOBJLine[i+256] = BGOBJLine[i];
                BGOBJLine[i] = 0x40000000; // 3D-layer placeholder
            }
        }
        else
        {
            for (i = 0; i < 256; i++)
            {
                if (!(WindowMask[i] & 0x01)) continue;
                BGOBJLine[i+512] = BGOBJLine[i+256];
                BGOBJLine[i+256] = BGOBJLine[i];
                BGOBJLine[i] = 0x40000000; // 3D-layer placeholder
            }
        }
    }
    else
    {
        for (i = 0; i < 256; i++)
        {
            u32 c = _3DLine[i];

            if ((c >> 24) == 0) continue;
            if (!(WindowMask[i] & 0x01)) continue;

            BGOBJLine[i+256] = BGOBJLine[i];
            BGOBJLine[i] = c | 0x40000000;
        }
    }
}

template<bool mosaic, SoftRenderer::DrawPixel drawPixel>
void SoftRenderer::DrawBG_Text(u32 line, u32 bgnum)
{
    // workaround for backgrounds missing on aarch64 with lto build
    asm volatile ("" : : : "memory");

    u16 bgcnt = CurUnit->BGCnt[bgnum];

    u32 tilesetaddr, tilemapaddr;
    u16* pal;
    u32 extpal, extpalslot;

    u16 xoff = CurUnit->BGXPos[bgnum];
    u16 yoff = CurUnit->BGYPos[bgnum] + line;

    if (bgcnt & 0x0040)
    {
        // vertical mosaic
        yoff -= CurUnit->BGMosaicY;
    }

    u32 widexmask = (bgcnt & 0x4000) ? 0x100 : 0;

    extpal = (CurUnit->DispCnt & 0x40000000);
    if (extpal) extpalslot = ((bgnum<2) && (bgcnt&0x2000)) ? (2+bgnum) : bgnum;

    u8* bgvram;
    u32 bgvrammask;
    CurUnit->GetBGVRAM(bgvram, bgvrammask);
    if (CurUnit->Num)
    {
        tilesetaddr = ((bgcnt & 0x003C) << 12);
        tilemapaddr = ((bgcnt & 0x1F00) << 3);

        pal = (u16*)&GPU.Palette[0x400];
    }
    else
    {
        tilesetaddr = ((CurUnit->DispCnt & 0x07000000) >> 8) + ((bgcnt & 0x003C) << 12);
        tilemapaddr = ((CurUnit->DispCnt & 0x38000000) >> 11) + ((bgcnt & 0x1F00) << 3);

        pal = (u16*)&GPU.Palette[0];
    }

    // adjust Y position in tilemap
    if (bgcnt & 0x8000)
    {
        tilemapaddr += ((yoff & 0x1F8) << 3);
        if (bgcnt & 0x4000)
            tilemapaddr += ((yoff & 0x100) << 3);
    }
    else
        tilemapaddr += ((yoff & 0xF8) << 3);

    u16 curtile;
    u16* curpal;
    u32 pixelsaddr;
    u8 color;
    u32 lastxpos;

    if (bgcnt & 0x0080)
    {
        // 256-color

        // preload shit as needed
        if ((xoff & 0x7) || mosaic)
        {
            curtile = *(u16*)&bgvram[(tilemapaddr + ((xoff & 0xF8) >> 2) + ((xoff & widexmask) << 3)) & bgvrammask];

            if (extpal) curpal = CurUnit->GetBGExtPal(extpalslot, curtile>>12);
            else        curpal = pal;

            pixelsaddr = tilesetaddr + ((curtile & 0x03FF) << 6)
                                     + (((curtile & 0x0800) ? (7-(yoff&0x7)) : (yoff&0x7)) << 3);
        }

        if (mosaic) lastxpos = xoff;

        for (int i = 0; i < 256; i++)
        {
            u32 xpos;
            if (mosaic) xpos = xoff - CurBGXMosaicTable[i];
            else        xpos = xoff;

            if ((!mosaic && (!(xpos & 0x7))) ||
                (mosaic && ((xpos >> 3) != (lastxpos >> 3))))
            {
                // load a new tile
                curtile = *(u16*)&bgvram[(tilemapaddr + ((xpos & 0xF8) >> 2) + ((xpos & widexmask) << 3)) & bgvrammask];

                if (extpal) curpal = CurUnit->GetBGExtPal(extpalslot, curtile>>12);
                else        curpal = pal;

                pixelsaddr = tilesetaddr + ((curtile & 0x03FF) << 6)
                                         + (((curtile & 0x0800) ? (7-(yoff&0x7)) : (yoff&0x7)) << 3);

                if (mosaic) lastxpos = xpos;
            }

            // draw pixel
            if (WindowMask[i] & (1<<bgnum))
            {
                u32 tilexoff = (curtile & 0x0400) ? (7-(xpos&0x7)) : (xpos&0x7);
                color = bgvram[(pixelsaddr + tilexoff) & bgvrammask];

                if (color)
                    drawPixel(*this, &BGOBJLine[i], curpal[color], 0x01000000<<bgnum);
            }

            xoff++;
        }
    }
    else
    {
        // 16-color

        // preload shit as needed
        if ((xoff & 0x7) || mosaic)
        {
            curtile = *(u16*)&bgvram[((tilemapaddr + ((xoff & 0xF8) >> 2) + ((xoff & widexmask) << 3))) & bgvrammask];
            curpal = pal + ((curtile & 0xF000) >> 8);
            pixelsaddr = tilesetaddr + ((curtile & 0x03FF) << 5)
                                     + (((curtile & 0x0800) ? (7-(yoff&0x7)) : (yoff&0x7)) << 2);
        }

        if (mosaic) lastxpos = xoff;

        for (int i = 0; i < 256; i++)
        {
            u32 xpos;
            if (mosaic) xpos = xoff - CurBGXMosaicTable[i];
            else        xpos = xoff;

            if ((!mosaic && (!(xpos & 0x7))) ||
                (mosaic && ((xpos >> 3) != (lastxpos >> 3))))
            {
                // load a new tile
                curtile = *(u16*)&bgvram[(tilemapaddr + ((xpos & 0xF8) >> 2) + ((xpos & widexmask) << 3)) & bgvrammask];
                curpal = pal + ((curtile & 0xF000) >> 8);
                pixelsaddr = tilesetaddr + ((curtile & 0x03FF) << 5)
                                         + (((curtile & 0x0800) ? (7-(yoff&0x7)) : (yoff&0x7)) << 2);

                if (mosaic) lastxpos = xpos;
            }

            // draw pixel
            if (WindowMask[i] & (1<<bgnum))
            {
                u32 tilexoff = (curtile & 0x0400) ? (7-(xpos&0x7)) : (xpos&0x7);
                if (tilexoff & 0x1)
                {
                    color = bgvram[(pixelsaddr + (tilexoff >> 1)) & bgvrammask] >> 4;
                }
                else
                {
                    color = bgvram[(pixelsaddr + (tilexoff >> 1)) & bgvrammask] & 0x0F;
                }

                if (color)
                    drawPixel(*this, &BGOBJLine[i], curpal[color], 0x01000000<<bgnum);
            }

            xoff++;
        }
    }
}

template<bool mosaic, SoftRenderer::DrawPixel drawPixel>
void SoftRenderer::DrawBG_Affine(u32 line, u32 bgnum)
{
    u16 bgcnt = CurUnit->BGCnt[bgnum];

    u32 tilesetaddr, tilemapaddr;
    u16* pal;

    u32 coordmask;
    u32 yshift;
    switch (bgcnt & 0xC000)
    {
    case 0x0000: coordmask = 0x07800; yshift = 7; break;
    case 0x4000: coordmask = 0x0F800; yshift = 8; break;
    case 0x8000: coordmask = 0x1F800; yshift = 9; break;
    case 0xC000: coordmask = 0x3F800; yshift = 10; break;
    }

    u32 overflowmask;
    if (bgcnt & 0x2000) overflowmask = 0;
    else                overflowmask = ~(coordmask | 0x7FF);

    s16 rotA = CurUnit->BGRotA[bgnum-2];
    s16 rotB = CurUnit->BGRotB[bgnum-2];
    s16 rotC = CurUnit->BGRotC[bgnum-2];
    s16 rotD = CurUnit->BGRotD[bgnum-2];

    s32 rotX = CurUnit->BGXRefInternal[bgnum-2];
    s32 rotY = CurUnit->BGYRefInternal[bgnum-2];

    if (bgcnt & 0x0040)
    {
        // vertical mosaic
        rotX -= (CurUnit->BGMosaicY * rotB);
        rotY -= (CurUnit->BGMosaicY * rotD);
    }

    u8* bgvram;
    u32 bgvrammask;
    CurUnit->GetBGVRAM(bgvram, bgvrammask);

    if (CurUnit->Num)
    {
        tilesetaddr = ((bgcnt & 0x003C) << 12);
        tilemapaddr = ((bgcnt & 0x1F00) << 3);

        pal = (u16*)&GPU.Palette[0x400];
    }
    else
    {
        tilesetaddr = ((CurUnit->DispCnt & 0x07000000) >> 8) + ((bgcnt & 0x003C) << 12);
        tilemapaddr = ((CurUnit->DispCnt & 0x38000000) >> 11) + ((bgcnt & 0x1F00) << 3);

        pal = (u16*)&GPU.Palette[0];
    }

    u16 curtile;
    u8 color;

    yshift -= 3;

    for (int i = 0; i < 256; i++)
    {
        if (WindowMask[i] & (1<<bgnum))
        {
            s32 finalX, finalY;
            if (mosaic)
            {
                int im = CurBGXMosaicTable[i];
                finalX = rotX - (im * rotA);
                finalY = rotY - (im * rotC);
            }
            else
            {
                finalX = rotX;
                finalY = rotY;
            }

            if ((!((finalX|finalY) & overflowmask)))
            {
                curtile = bgvram[(tilemapaddr + ((((finalY & coordmask) >> 11) << yshift) + ((finalX & coordmask) >> 11))) & bgvrammask];

                // draw pixel
                u32 tilexoff = (finalX >> 8) & 0x7;
                u32 tileyoff = (finalY >> 8) & 0x7;

                color = bgvram[(tilesetaddr + (curtile << 6) + (tileyoff << 3) + tilexoff) & bgvrammask];

                if (color)
                    drawPixel(*this, &BGOBJLine[i], pal[color], 0x01000000<<bgnum);
            }
        }

        rotX += rotA;
        rotY += rotC;
    }

    CurUnit->BGXRefInternal[bgnum-2] += rotB;
    CurUnit->BGYRefInternal[bgnum-2] += rotD;
}

template<bool mosaic, SoftRenderer::DrawPixel drawPixel>
void SoftRenderer::DrawBG_Extended(u32 line, u32 bgnum)
{
    u16 bgcnt = CurUnit->BGCnt[bgnum];

    u32 tilesetaddr, tilemapaddr;
    u16* pal;
    u32 extpal;

    u8* bgvram;
    u32 bgvrammask;
    CurUnit->GetBGVRAM(bgvram, bgvrammask);

    extpal = (CurUnit->DispCnt & 0x40000000);

    s16 rotA = CurUnit->BGRotA[bgnum-2];
    s16 rotB = CurUnit->BGRotB[bgnum-2];
    s16 rotC = CurUnit->BGRotC[bgnum-2];
    s16 rotD = CurUnit->BGRotD[bgnum-2];

    s32 rotX = CurUnit->BGXRefInternal[bgnum-2];
    s32 rotY = CurUnit->BGYRefInternal[bgnum-2];

    if (bgcnt & 0x0040)
    {
        // vertical mosaic
        rotX -= (CurUnit->BGMosaicY * rotB);
        rotY -= (CurUnit->BGMosaicY * rotD);
    }

    if (bgcnt & 0x0080)
    {
        // bitmap modes

        u32 xmask, ymask;
        u32 yshift;
        switch (bgcnt & 0xC000)
        {
        case 0x0000: xmask = 0x07FFF; ymask = 0x07FFF; yshift = 7; break;
        case 0x4000: xmask = 0x0FFFF; ymask = 0x0FFFF; yshift = 8; break;
        case 0x8000: xmask = 0x1FFFF; ymask = 0x0FFFF; yshift = 9; break;
        case 0xC000: xmask = 0x1FFFF; ymask = 0x1FFFF; yshift = 9; break;
        }

        u32 ofxmask, ofymask;
        if (bgcnt & 0x2000)
        {
            ofxmask = 0;
            ofymask = 0;
        }
        else
        {
            ofxmask = ~xmask;
            ofymask = ~ymask;
        }

        if (CurUnit->Num) tilemapaddr = ((bgcnt & 0x1F00) << 6);
        else              tilemapaddr = ((bgcnt & 0x1F00) << 6);

        if (bgcnt & 0x0004)
        {
            // direct color bitmap

            u16 color;

            auto tryDrawStructuredCaptureLineView =
                [&](u32* lineDst, bool& lineUses3d) -> bool {
                    if (mosaic
                        || !UseStructuredVulkan2D()
                        || !GPU.GPU3D.IsRendererAccelerated()
                        || CurUnit->Num != 1u
                        || bgnum != 2u
                        || ((CurUnit->DispCnt >> 16u) & 0x1u) != 1u
                        || (CurUnit->DispCnt & 0xE000u) != 0u
                        || (bgcnt & 0x0040u) != 0u
                        || (bgcnt & 0x2000u) != 0u
                        || rotA != 0x100
                        || rotC != 0)
                    {
                        return false;
                    }

                    const s64 firstXWide = static_cast<s64>(rotX);
                    const s64 lastXWide = firstXWide
                        + (255 * static_cast<s64>(rotA));
                    const s64 yWide = static_cast<s64>(rotY);
                    if (firstXWide < 0
                        || lastXWide > static_cast<s64>(xmask)
                        || yWide < 0
                        || yWide > static_cast<s64>(ymask))
                    {
                        return false;
                    }

                    const u32 firstByteAddress =
                        (tilemapaddr
                            + (((((rotY & ymask) >> 8) << yshift)
                                + ((rotX & xmask) >> 8)) << 1))
                        & bgvrammask;
                    constexpr u32 kLineByteSpan = (kStructuredScreenWidth - 1u) * 2u;
                    if (bgvrammask < kLineByteSpan
                        || firstByteAddress > bgvrammask - kLineByteSpan
                        || (firstByteAddress >> 14u)
                            != ((firstByteAddress + kLineByteSpan) >> 14u))
                    {
                        return false;
                    }

                    const u32 mapMask =
                        GPU.VRAMMap_BBG[(firstByteAddress >> 14u) & 0x7u] & 0xFu;
                    if (__builtin_popcount(mapMask) != 1)
                        return false;
                    const u32 vramBank = static_cast<u32>(__builtin_ctz(mapMask));
                    const u32 captureAddress = (firstByteAddress & 0x1FFFFu) >> 1u;
                    if ((captureAddress % kStructuredScreenWidth) != 0u
                        || captureAddress + (kStructuredScreenWidth - 1u) >= kStructuredPixelCount)
                    {
                        return false;
                    }

                    const size_t lineValidIndex =
                        (static_cast<size_t>(vramBank) * kStructuredScreenHeight)
                        + (captureAddress / kStructuredScreenWidth);
                    if (StructuredVulkan2DCaptureLineValid[lineValidIndex] == 0u)
                        return false;

                    const size_t captureBase =
                        static_cast<size_t>(vramBank) * kStructuredPlaneCount * kStructuredPixelCount;
                    const u32* const belowLine =
                        StructuredVulkan2DCapturePlanes.data() + captureBase + captureAddress;
                    const u32* const aboveLine =
                        StructuredVulkan2DCapturePlanes.data()
                        + captureBase + kStructuredPixelCount + captureAddress;
                    const u32* const controlLine =
                        StructuredVulkan2DCapturePlanes.data()
                        + captureBase + (kStructuredPixelCount * 2u) + captureAddress;

                    for (u32 x = 0u; x < kStructuredScreenWidth; x++)
                    {
                        const u32 belowPlane = belowLine[x];
                        const u32 abovePlane = aboveLine[x];
                        const u32 controlAlpha = controlLine[x] >> 24u;
                        const bool structuredSlot =
                            (controlAlpha & kStructuredVulkan2DSlot3DFlag) != 0u;
                        if (structuredSlot)
                        {
                            if (belowPlane != 0u)
                                PushRawPixel_Accel(lineDst + x, belowPlane);
                            PushRawPixel_Accel(lineDst + x, 0x40000000u);
                            if ((controlAlpha & kStructuredVulkan2DAbove3DFlag) != 0u
                                && abovePlane != 0u
                                && StructuredVulkan2DCanPreserveCaptureOverlay(abovePlane))
                            {
                                PushRawPixel_Accel(lineDst + x, abovePlane);
                            }
                            lineUses3d = true;
                            continue;
                        }

                        if ((controlAlpha & kStructuredVulkan2DOnlyFlag) != 0u
                            && belowPlane != 0u
                            && StructuredVulkan2DCanPreserveCaptureOverlay(belowPlane))
                        {
                            PushRawPixel_Accel(lineDst + x, belowPlane);
                            continue;
                        }

                        u16 rawColor = 0u;
                        std::memcpy(
                            &rawColor,
                            bgvram + firstByteAddress + (x * 2u),
                            sizeof(rawColor));
                        if ((rawColor & 0x8000u) != 0u)
                            drawPixel(*this, lineDst + x, rawColor, 0x01000000u << bgnum);
                    }
                    return true;
                };

            bool fastLineSaw3d = false;
            if (tryDrawStructuredCaptureLineView(BGOBJLine, fastLineSaw3d))
            {
                CurrentLineRegularCaptureUses3d =
                    CurrentLineRegularCaptureUses3d || fastLineSaw3d;
            }
            else
            {
                for (int i = 0; i < 256; i++)
                {
                    if (WindowMask[i] & (1<<bgnum))
                    {
                        s32 finalX, finalY;
                        if (mosaic)
                        {
                            int im = CurBGXMosaicTable[i];
                            finalX = rotX - (im * rotA);
                            finalY = rotY - (im * rotC);
                        }
                        else
                        {
                            finalX = rotX;
                            finalY = rotY;
                        }

                        if (!(finalX & ofxmask) && !(finalY & ofymask))
                        {
                            const u32 pixelByteAddress =
                                (tilemapaddr + (((((finalY & ymask) >> 8) << yshift) + ((finalX & xmask) >> 8)) << 1)) & bgvrammask;
                            if (TryDrawStructuredVulkan2DCapturePixel(&BGOBJLine[i], pixelByteAddress))
                            {
                                rotX += rotA;
                                rotY += rotC;
                                continue;
                            }

                            color = *(u16*)&bgvram[pixelByteAddress];

                            if (color & 0x8000)
                                drawPixel(*this, &BGOBJLine[i], color, 0x01000000<<bgnum);
                        }
                    }

                    rotX += rotA;
                    rotY += rotC;
                }
            }
        }
        else
        {
            // 256-color bitmap

            if (CurUnit->Num) pal = (u16*)&GPU.Palette[0x400];
            else              pal = (u16*)&GPU.Palette[0];

            u8 color;

            for (int i = 0; i < 256; i++)
            {
                if (WindowMask[i] & (1<<bgnum))
                {
                    s32 finalX, finalY;
                    if (mosaic)
                    {
                        int im = CurBGXMosaicTable[i];
                        finalX = rotX - (im * rotA);
                        finalY = rotY - (im * rotC);
                    }
                    else
                    {
                        finalX = rotX;
                        finalY = rotY;
                    }

                    if (!(finalX & ofxmask) && !(finalY & ofymask))
                    {
                        color = bgvram[(tilemapaddr + (((finalY & ymask) >> 8) << yshift) + ((finalX & xmask) >> 8)) & bgvrammask];

                        if (color)
                            drawPixel(*this, &BGOBJLine[i], pal[color], 0x01000000<<bgnum);
                    }
                }

                rotX += rotA;
                rotY += rotC;
            }
        }
    }
    else
    {
        // mixed affine/text mode

        u32 coordmask;
        u32 yshift;
        switch (bgcnt & 0xC000)
        {
        case 0x0000: coordmask = 0x07800; yshift = 7; break;
        case 0x4000: coordmask = 0x0F800; yshift = 8; break;
        case 0x8000: coordmask = 0x1F800; yshift = 9; break;
        case 0xC000: coordmask = 0x3F800; yshift = 10; break;
        }

        u32 overflowmask;
        if (bgcnt & 0x2000) overflowmask = 0;
        else                overflowmask = ~(coordmask | 0x7FF);

        if (CurUnit->Num)
        {
            tilesetaddr = ((bgcnt & 0x003C) << 12);
            tilemapaddr = ((bgcnt & 0x1F00) << 3);

            pal = (u16*)&GPU.Palette[0x400];
        }
        else
        {
            tilesetaddr = ((CurUnit->DispCnt & 0x07000000) >> 8) + ((bgcnt & 0x003C) << 12);
            tilemapaddr = ((CurUnit->DispCnt & 0x38000000) >> 11) + ((bgcnt & 0x1F00) << 3);

            pal = (u16*)&GPU.Palette[0];
        }

        u16 curtile;
        u16* curpal;
        u8 color;

        yshift -= 3;

        for (int i = 0; i < 256; i++)
        {
            if (WindowMask[i] & (1<<bgnum))
            {
                s32 finalX, finalY;
                if (mosaic)
                {
                    int im = CurBGXMosaicTable[i];
                    finalX = rotX - (im * rotA);
                    finalY = rotY - (im * rotC);
                }
                else
                {
                    finalX = rotX;
                    finalY = rotY;
                }

                if ((!((finalX|finalY) & overflowmask)))
                {
                    curtile = *(u16*)&bgvram[(tilemapaddr + (((((finalY & coordmask) >> 11) << yshift) + ((finalX & coordmask) >> 11)) << 1)) & bgvrammask];

                    if (extpal) curpal = CurUnit->GetBGExtPal(bgnum, curtile>>12);
                    else        curpal = pal;

                    // draw pixel
                    u32 tilexoff = (finalX >> 8) & 0x7;
                    u32 tileyoff = (finalY >> 8) & 0x7;

                    if (curtile & 0x0400) tilexoff = 7-tilexoff;
                    if (curtile & 0x0800) tileyoff = 7-tileyoff;

                    color = bgvram[(tilesetaddr + ((curtile & 0x03FF) << 6) + (tileyoff << 3) + tilexoff) & bgvrammask];

                    if (color)
                        drawPixel(*this, &BGOBJLine[i], curpal[color], 0x01000000<<bgnum);
                }
            }

            rotX += rotA;
            rotY += rotC;
        }
    }

    CurUnit->BGXRefInternal[bgnum-2] += rotB;
    CurUnit->BGYRefInternal[bgnum-2] += rotD;
}

template<bool mosaic, SoftRenderer::DrawPixel drawPixel>
void SoftRenderer::DrawBG_Large(u32 line) // BG is always BG2
{
    u16 bgcnt = CurUnit->BGCnt[2];

    u16* pal;

    // large BG sizes:
    // 0: 512x1024
    // 1: 1024x512
    // 2: 512x256
    // 3: 512x512
    u32 xmask, ymask;
    u32 yshift;
    switch (bgcnt & 0xC000)
    {
    case 0x0000: xmask = 0x1FFFF; ymask = 0x3FFFF; yshift = 9; break;
    case 0x4000: xmask = 0x3FFFF; ymask = 0x1FFFF; yshift = 10; break;
    case 0x8000: xmask = 0x1FFFF; ymask = 0x0FFFF; yshift = 9; break;
    case 0xC000: xmask = 0x1FFFF; ymask = 0x1FFFF; yshift = 9; break;
    }

    u32 ofxmask, ofymask;
    if (bgcnt & 0x2000)
    {
        ofxmask = 0;
        ofymask = 0;
    }
    else
    {
        ofxmask = ~xmask;
        ofymask = ~ymask;
    }

    s16 rotA = CurUnit->BGRotA[0];
    s16 rotB = CurUnit->BGRotB[0];
    s16 rotC = CurUnit->BGRotC[0];
    s16 rotD = CurUnit->BGRotD[0];

    s32 rotX = CurUnit->BGXRefInternal[0];
    s32 rotY = CurUnit->BGYRefInternal[0];

    if (bgcnt & 0x0040)
    {
        // vertical mosaic
        rotX -= (CurUnit->BGMosaicY * rotB);
        rotY -= (CurUnit->BGMosaicY * rotD);
    }

    u8* bgvram;
    u32 bgvrammask;
    CurUnit->GetBGVRAM(bgvram, bgvrammask);

    // 256-color bitmap

    if (CurUnit->Num) pal = (u16*)&GPU.Palette[0x400];
    else     pal = (u16*)&GPU.Palette[0];

    u8 color;

    for (int i = 0; i < 256; i++)
    {
        if (WindowMask[i] & (1<<2))
        {
            s32 finalX, finalY;
            if (mosaic)
            {
                int im = CurBGXMosaicTable[i];
                finalX = rotX - (im * rotA);
                finalY = rotY - (im * rotC);
            }
            else
            {
                finalX = rotX;
                finalY = rotY;
            }

            if (!(finalX & ofxmask) && !(finalY & ofymask))
            {
                color = bgvram[((((finalY & ymask) >> 8) << yshift) + ((finalX & xmask) >> 8)) & bgvrammask];

                if (color)
                    drawPixel(*this, &BGOBJLine[i], pal[color], 0x01000000<<2);
            }
        }

        rotX += rotA;
        rotY += rotC;
    }

    CurUnit->BGXRefInternal[0] += rotB;
    CurUnit->BGYRefInternal[0] += rotD;
}

// OBJ line buffer:
// * bit0-15: color (bit15=1: direct color, bit15=0: palette index, bit12=0 to indicate extpal)
// * bit16-17: BG-relative priority
// * bit18: non-transparent sprite pixel exists here
// * bit19: X mosaic should be applied here
// * bit24-31: compositor flags

void SoftRenderer::ApplySpriteMosaicX()
{
    // apply X mosaic if needed
    // X mosaic for sprites is applied after all sprites are rendered

    if (CurUnit->OBJMosaicSize[0] == 0) return;

    u32* objLine = OBJLine[CurUnit->Num];
    ObjCaptureIdentityTag* objIdentity = TrackSpriteObjCaptureIdentity
        ? OBJLineCaptureIdentity.data() + (CurUnit->Num * kStructuredScreenWidth)
        : nullptr;

    u8* curOBJXMosaicTable = MosaicTable[CurUnit->OBJMosaicSize[0]].data();

    u32 lastcolor = objLine[0];
    ObjCaptureIdentityTag lastIdentity =
        objIdentity != nullptr ? objIdentity[0] : ObjCaptureIdentityTag{};

    for (u32 i = 1; i < 256; i++)
    {
        u32 currentcolor = objLine[i];

        if (!(lastcolor & currentcolor & 0x100000) || curOBJXMosaicTable[i] == 0)
        {
            lastcolor = currentcolor;
            if (objIdentity != nullptr)
                lastIdentity = objIdentity[i];
        }
        else
        {
            objLine[i] = lastcolor;
            if (objIdentity != nullptr)
                objIdentity[i] = lastIdentity;
        }
    }
}

template <SoftRenderer::DrawPixel drawPixel>
void SoftRenderer::InterleaveSprites(u32 prio)
{
    u32* objLine = OBJLine[CurUnit->Num];
    const ObjCaptureIdentityTag* objIdentity =
        OBJLineCaptureIdentity.data() + (CurUnit->Num * kStructuredScreenWidth);
    u16* pal = (u16*)&GPU.Palette[CurUnit->Num ? 0x600 : 0x200];

    if (CurUnit->DispCnt & 0x80000000)
    {
        u16* extpal = CurUnit->GetOBJExtPal();

        for (u32 i = 0; i < 256; i++)
        {
            if ((objLine[i] & 0x70000) != prio) continue;
            if (!(WindowMask[i] & 0x10))        continue;

            u16 color;
            u32 pixel = objLine[i];

            if (pixel & 0x8000)
                color = pixel & 0x7FFF;
            else if (pixel & 0x1000)
                color = pal[pixel & 0xFF];
            else
                color = extpal[pixel & 0xFFF];

            drawPixel(*this, &BGOBJLine[i], color, pixel & 0xFF000000);
            if (TrackComposedObjCaptureIdentity)
                ComposedObjCaptureIdentity[i] = objIdentity[i];
        }
    }
    else
    {
        // optimized no-extpal version

        for (u32 i = 0; i < 256; i++)
        {
            if ((objLine[i] & 0x70000) != prio) continue;
            if (!(WindowMask[i] & 0x10))        continue;

            u16 color;
            u32 pixel = objLine[i];

            if (pixel & 0x8000)
                color = pixel & 0x7FFF;
            else
                color = pal[pixel & 0xFF];

            drawPixel(*this, &BGOBJLine[i], color, pixel & 0xFF000000);
            if (TrackComposedObjCaptureIdentity)
                ComposedObjCaptureIdentity[i] = objIdentity[i];
        }
    }
}

#define DoDrawSprite(type, ...) \
    if (iswin) \
    { \
        DrawSprite_##type<true>(__VA_ARGS__); \
    } \
    else \
    { \
        DrawSprite_##type<false>(__VA_ARGS__); \
    }

void SoftRenderer::DrawSpritesActivePipeline(u32 line, Unit* unit)
{
    CurUnit = unit;
    CurrentSpriteRenderLine = line;
    OBJLineCaptureIdentityAvailable[CurUnit->Num] = false;
    TrackSpriteObjCaptureIdentity =
        UseStructuredVulkan2D()
        && GPU.GPU3D.IsRendererAccelerated()
        && CurUnit->Num == 1u
        && line < kStructuredScreenHeight;

    if (line == 0)
    {
        // reset those counters here
        // TODO: find out when those are supposed to be reset
        // it would make sense to reset them at the end of VBlank
        // however, sprites are rendered one scanline in advance
        // so they need to be reset a bit earlier

        CurUnit->OBJMosaicY = 0;
        CurUnit->OBJMosaicYCount = 0;
    }

    NumSprites[CurUnit->Num] = 0;
    memset(OBJLine[CurUnit->Num], 0, 256*4);
    memset(OBJWindow[CurUnit->Num], 0, 256);
    if (TrackSpriteObjCaptureIdentity)
    {
        std::fill_n(
            OBJLineCaptureIdentity.data() + (CurUnit->Num * kStructuredScreenWidth),
            kStructuredScreenWidth,
            ObjCaptureIdentityTag{});
    }
    const bool renderer2dDebugControlsActive = MelonDSAndroid::areRenderer2DDebugControlsActive();
    if (renderer2dDebugControlsActive)
    {
        if (!MelonDSAndroid::areRenderer2DDebugObjectsEnabled(CurUnit->Num)) return;
        if (!Renderer2DDebugShouldDrawObjectLine(line)) return;
    }
    if (!(CurUnit->DispCnt & 0x1000)) return;

    if (CurUnit->Num == 0)
    {
        auto objDirty = GPU.VRAMDirty_AOBJ.DeriveState(GPU.VRAMMap_AOBJ, GPU);
        GPU.MakeVRAMFlat_AOBJCoherent(objDirty);
    }
    else
    {
        auto objDirty = GPU.VRAMDirty_BOBJ.DeriveState(GPU.VRAMMap_BOBJ, GPU);
        GPU.MakeVRAMFlat_BOBJCoherent(objDirty);
    }

    u16* oam = (u16*)&GPU.OAM[CurUnit->Num ? 0x400 : 0];

    const s32 spritewidth[16] =
    {
        8, 16, 8, 8,
        16, 32, 8, 8,
        32, 32, 16, 8,
        64, 64, 32, 8
    };
    const s32 spriteheight[16] =
    {
        8, 8, 16, 8,
        16, 8, 32, 8,
        32, 16, 32, 8,
        64, 32, 64, 8
    };

    for (int bgnum = 0x0C00; bgnum >= 0x0000; bgnum -= 0x0400)
    {
        if (renderer2dDebugControlsActive
            && !MelonDSAndroid::isRenderer2DDebugObjectPriorityEnabled(CurUnit->Num, static_cast<u32>(bgnum) >> 10u))
            continue;

        for (int sprnum = 127; sprnum >= 0; sprnum--)
        {
            u16* attrib = &oam[sprnum*4];

            if ((attrib[2] & 0x0C00) != bgnum)
                continue;
            if (renderer2dDebugControlsActive
                && !Renderer2DDebugShouldDrawObject(CurUnit->Num, static_cast<u32>(sprnum), attrib))
                continue;

            bool iswin = (((attrib[0] >> 10) & 0x3) == 2);

            u32 sprline;
            if ((attrib[0] & 0x1000) && !iswin)
            {
                // apply Y mosaic
                sprline = CurUnit->OBJMosaicY;
            }
            else
                sprline = line;

            if (attrib[0] & 0x0100)
            {
                u32 sizeparam = (attrib[0] >> 14) | ((attrib[1] & 0xC000) >> 12);
                s32 width = spritewidth[sizeparam];
                s32 height = spriteheight[sizeparam];
                s32 boundwidth = width;
                s32 boundheight = height;

                if (attrib[0] & 0x0200)
                {
                    boundwidth <<= 1;
                    boundheight <<= 1;
                }

                u32 ypos = attrib[0] & 0xFF;
                if (((line - ypos) & 0xFF) >= (u32)boundheight)
                    continue;
                ypos = (sprline - ypos) & 0xFF;

                s32 xpos = (s32)(attrib[1] << 23) >> 23;
                if (xpos <= -boundwidth)
                    continue;

                DoDrawSprite(Rotscale, sprnum, boundwidth, boundheight, width, height, xpos, ypos);

                NumSprites[CurUnit->Num]++;
            }
            else
            {
                if (attrib[0] & 0x0200)
                    continue;

                u32 sizeparam = (attrib[0] >> 14) | ((attrib[1] & 0xC000) >> 12);
                s32 width = spritewidth[sizeparam];
                s32 height = spriteheight[sizeparam];

                u32 ypos = attrib[0] & 0xFF;
                if (((line - ypos) & 0xFF) >= (u32)height)
                    continue;
                ypos = (sprline - ypos) & 0xFF;

                s32 xpos = (s32)(attrib[1] << 23) >> 23;
                if (xpos <= -width)
                    continue;

                DoDrawSprite(Normal, sprnum, width, height, xpos, ypos);

                NumSprites[CurUnit->Num]++;
            }
        }
    }
}

template<bool window>
void SoftRenderer::DrawSprite_Rotscale(u32 num, u32 boundwidth, u32 boundheight, u32 width, u32 height, s32 xpos, s32 ypos)
{
    u16* oam = (u16*)&GPU.OAM[CurUnit->Num ? 0x400 : 0];
    u16* attrib = &oam[num * 4];
    u16* rotparams = &oam[(((attrib[1] >> 9) & 0x1F) * 16) + 3];

    u32 pixelattr = ((attrib[2] & 0x0C00) << 6) | 0xC0000;
    u32 tilenum = attrib[2] & 0x03FF;
    u32 spritemode = window ? 0 : ((attrib[0] >> 10) & 0x3);

    u32 ytilefactor;

    u8* objvram;
    u32 objvrammask;
    CurUnit->GetOBJVRAM(objvram, objvrammask);

    u32* objLine = OBJLine[CurUnit->Num];
    u8* objWindow = OBJWindow[CurUnit->Num];
    ObjCaptureIdentityTag* objIdentity = TrackSpriteObjCaptureIdentity
        ? OBJLineCaptureIdentity.data() + (CurUnit->Num * kStructuredScreenWidth)
        : nullptr;

    s32 centerX = boundwidth >> 1;
    s32 centerY = boundheight >> 1;

    if ((attrib[0] & 0x1000) && !window)
    {
        // apply Y mosaic
        pixelattr |= 0x100000;
    }

    u32 xoff;
    if (xpos >= 0)
    {
        xoff = 0;
        if ((xpos+boundwidth) > 256)
            boundwidth = 256-xpos;
    }
    else
    {
        xoff = -xpos;
        xpos = 0;
    }

    s16 rotA = (s16)rotparams[0];
    s16 rotB = (s16)rotparams[4];
    s16 rotC = (s16)rotparams[8];
    s16 rotD = (s16)rotparams[12];

    s32 rotX = ((xoff-centerX) * rotA) + ((ypos-centerY) * rotB) + (width << 7);
    s32 rotY = ((xoff-centerX) * rotC) + ((ypos-centerY) * rotD) + (height << 7);

    width <<= 8;
    height <<= 8;

    u16 color = 0; // transparent in all cases

    if (spritemode == 3)
    {
        u32 alpha = attrib[2] >> 12;
        if (!alpha) return;
        alpha++;

        pixelattr |= (0xC0000000 | (alpha << 24));

        u32 pixelsaddr;
        if (CurUnit->DispCnt & 0x40)
        {
            if (CurUnit->DispCnt & 0x20)
            {
                // 'reserved'
                // draws nothing

                return;
            }
            else
            {
                pixelsaddr = tilenum << (7 + ((CurUnit->DispCnt >> 22) & 0x1));
                ytilefactor = ((width >> 8) * 2);
            }
        }
        else
        {
            if (CurUnit->DispCnt & 0x20)
            {
                pixelsaddr = ((tilenum & 0x01F) << 4) + ((tilenum & 0x3E0) << 7);
                ytilefactor = (256 * 2);
            }
            else
            {
                pixelsaddr = ((tilenum & 0x00F) << 4) + ((tilenum & 0x3F0) << 7);
                ytilefactor = (128 * 2);
            }
        }

        for (; xoff < boundwidth;)
        {
            if ((u32)rotX < width && (u32)rotY < height)
            {
                const u32 sampleAddr = (pixelsaddr + ((rotY >> 8) * ytilefactor) + ((rotX >> 8) << 1)) & objvrammask;
                color = *(u16*)&objvram[sampleAddr];

                const u32 currentLine = (GPU.VCount + 1u) & 0xFFu;
                if (!window && CurUnit->Num == 1 && MelonDSAndroid::areRendererDebugBgObjLogsEnabled())
                {
                    if (const RendererDebugSamplePoint* sample = findRendererDebugSamplePoint(static_cast<u32>(xpos), currentLine))
                    {
                        Platform::Log(
                            Platform::LogLevel::Warn,
                            "RendererDebug[SpriteBitmap]: unit=%u label=%s sprite=%u rotscale=1 line=%u x=%u color=%04X old=%08X pixelattr=%08X pixelsaddr=%u tilenum=%u srcX=%u srcY=%u attr0=%04X attr1=%04X attr2=%04X",
                            CurUnit->Num,
                            sample->label,
                            num,
                            currentLine,
                            static_cast<u32>(xpos),
                            color,
                            objLine[xpos],
                            pixelattr,
                            sampleAddr,
                            tilenum,
                            static_cast<u32>(rotX >> 8),
                            static_cast<u32>(rotY >> 8),
                            attrib[0],
                            attrib[1],
                            attrib[2]
                        );
                    }
                }

                if (color & 0x8000)
                {
                    if (window) objWindow[xpos] = 1;
                    else
                    {
                        objLine[xpos] = color | pixelattr;
                        if (objIdentity != nullptr)
                            objIdentity[xpos] = {};
                    }
                }
                else if (!window)
                {
                    if (objLine[xpos] == 0)
                    {
                        objLine[xpos] = pixelattr & 0x180000;
                        if (objIdentity != nullptr)
                            objIdentity[xpos] = {};
                    }
                }
            }

            rotX += rotA;
            rotY += rotC;
            xoff++;
            xpos++;
        }
    }
    else
    {
        u32 pixelsaddr = tilenum;
        if (CurUnit->DispCnt & 0x10)
        {
            pixelsaddr <<= ((CurUnit->DispCnt >> 20) & 0x3);
            ytilefactor = (width >> 11) << ((attrib[0] & 0x2000) ? 1:0);
        }
        else
        {
            ytilefactor = 0x20;
        }

        if (spritemode == 1) pixelattr |= 0x80000000;
        else                 pixelattr |= 0x10000000;

        ytilefactor <<= 5;
        pixelsaddr <<= 5;

        if (attrib[0] & 0x2000)
        {
            // 256-color

            if (!window)
            {
                if (!(CurUnit->DispCnt & 0x80000000))
                    pixelattr |= 0x1000;
                else
                    pixelattr |= ((attrib[2] & 0xF000) >> 4);
            }

            for (; xoff < boundwidth;)
            {
                if ((u32)rotX < width && (u32)rotY < height)
                {
                    color = objvram[(pixelsaddr + ((rotY>>11)*ytilefactor) + ((rotY&0x700)>>5) + ((rotX>>11)*64) + ((rotX&0x700)>>8)) & objvrammask];

                    if (color)
                    {
                        if (window) objWindow[xpos] = 1;
                        else
                        {
                            objLine[xpos] = color | pixelattr;
                            if (objIdentity != nullptr)
                                objIdentity[xpos] = {};
                        }
                    }
                    else if (!window)
                    {
                        if (objLine[xpos] == 0)
                        {
                            objLine[xpos] = pixelattr & 0x180000;
                            if (objIdentity != nullptr)
                                objIdentity[xpos] = {};
                        }
                    }
                }

                rotX += rotA;
                rotY += rotC;
                xoff++;
                xpos++;
            }
        }
        else
        {
            // 16-color
            if (!window)
            {
                pixelattr |= 0x1000;
                pixelattr |= ((attrib[2] & 0xF000) >> 8);
            }

            for (; xoff < boundwidth;)
            {
                if ((u32)rotX < width && (u32)rotY < height)
                {
                    color = objvram[(pixelsaddr + ((rotY>>11)*ytilefactor) + ((rotY&0x700)>>6) + ((rotX>>11)*32) + ((rotX&0x700)>>9)) & objvrammask];
                    if (rotX & 0x100)
                        color >>= 4;
                    else
                        color &= 0x0F;

                    if (color)
                    {
                        if (window) objWindow[xpos] = 1;
                        else
                        {
                            objLine[xpos] = color | pixelattr;
                            if (objIdentity != nullptr)
                                objIdentity[xpos] = {};
                        }
                    }
                    else if (!window)
                    {
                        if (objLine[xpos] == 0)
                        {
                            objLine[xpos] = pixelattr & 0x180000;
                            if (objIdentity != nullptr)
                                objIdentity[xpos] = {};
                        }
                    }
                }

                rotX += rotA;
                rotY += rotC;
                xoff++;
                xpos++;
            }
        }
    }
}

template<bool window>
void SoftRenderer::DrawSprite_Normal(u32 num, u32 width, u32 height, s32 xpos, s32 ypos)
{
    u16* oam = (u16*)&GPU.OAM[CurUnit->Num ? 0x400 : 0];
    u16* attrib = &oam[num * 4];

    u32 pixelattr = ((attrib[2] & 0x0C00) << 6) | 0xC0000;
    u32 tilenum = attrib[2] & 0x03FF;
    u32 spritemode = window ? 0 : ((attrib[0] >> 10) & 0x3);

    u32 wmask = width - 8; // really ((width - 1) & ~0x7)

    if ((attrib[0] & 0x1000) && !window)
    {
        // apply Y mosaic
        pixelattr |= 0x100000;
    }

    u8* objvram;
    u32 objvrammask;
    CurUnit->GetOBJVRAM(objvram, objvrammask);

    u32* objLine = OBJLine[CurUnit->Num];
    u8* objWindow = OBJWindow[CurUnit->Num];
    ObjCaptureIdentityTag* objIdentity = TrackSpriteObjCaptureIdentity
        ? OBJLineCaptureIdentity.data() + (CurUnit->Num * kStructuredScreenWidth)
        : nullptr;

    // yflip
    if (attrib[1] & 0x2000)
        ypos = height-1 - ypos;

    u32 xoff;
    u32 xend = width;
    if (xpos >= 0)
    {
        xoff = 0;
        if ((xpos+xend) > 256)
            xend = 256-xpos;
    }
    else
    {
        xoff = -xpos;
        xpos = 0;
    }

    u16 color = 0; // transparent in all cases

    if (spritemode == 3)
    {
        // bitmap sprite

        const bool directIdentityEligible =
            objIdentity != nullptr
            && !window
            && CurUnit->Num == 1u
            && (attrib[0] & 0x1000u) == 0u
            && (attrib[1] & 0x3000u) == 0u;

        u32 alpha = attrib[2] >> 12;
        if (!alpha) return;
        alpha++;

        pixelattr |= (0xC0000000 | (alpha << 24));

        u32 pixelsaddr = tilenum;
        if (CurUnit->DispCnt & 0x40)
        {
            if (CurUnit->DispCnt & 0x20)
            {
                // 'reserved'
                // draws nothing

                return;
            }
            else
            {
                pixelsaddr <<= (7 + ((CurUnit->DispCnt >> 22) & 0x1));
                pixelsaddr += (ypos * width * 2);
            }
        }
        else
        {
            if (CurUnit->DispCnt & 0x20)
            {
                pixelsaddr = ((tilenum & 0x01F) << 4) + ((tilenum & 0x3E0) << 7);
                pixelsaddr += (ypos * 256 * 2);
            }
            else
            {
                pixelsaddr = ((tilenum & 0x00F) << 4) + ((tilenum & 0x3F0) << 7);
                pixelsaddr += (ypos * 128 * 2);
            }
        }

        s32 pixelstride;

        if (attrib[1] & 0x1000) // xflip
        {
            pixelsaddr += ((width-1) << 1);
            pixelsaddr -= (xoff << 1);
            pixelstride = -2;
        }
        else
        {
            pixelsaddr += (xoff << 1);
            pixelstride = 2;
        }

        for (; xoff < xend;)
        {
            const u32 sampleAddr = pixelsaddr & objvrammask;
            color = *(u16*)&objvram[sampleAddr];

            const u32 currentLine = (GPU.VCount + 1u) & 0xFFu;
            if (!window && CurUnit->Num == 1 && MelonDSAndroid::areRendererDebugBgObjLogsEnabled())
            {
                if (const RendererDebugSamplePoint* sample = findRendererDebugSamplePoint(static_cast<u32>(xpos), currentLine))
                {
                    Platform::Log(
                        Platform::LogLevel::Warn,
                        "RendererDebug[SpriteBitmap]: unit=%u label=%s sprite=%u rotscale=0 line=%u x=%u color=%04X old=%08X pixelattr=%08X pixelsaddr=%u tilenum=%u ypos=%u xoff=%u attr0=%04X attr1=%04X attr2=%04X",
                        CurUnit->Num,
                        sample->label,
                        num,
                        currentLine,
                        static_cast<u32>(xpos),
                        color,
                        objLine[xpos],
                        pixelattr,
                        sampleAddr,
                        tilenum,
                        ypos,
                        xoff,
                        attrib[0],
                        attrib[1],
                        attrib[2]
                    );
                }
            }

            pixelsaddr += pixelstride;

            if (color & 0x8000)
            {
                if (window) objWindow[xpos] = 1;
                else
                {
                    CaptureSourceIdentity sourceIdentity {};
                    objLine[xpos] = color | pixelattr;
                    if (objIdentity != nullptr)
                        objIdentity[xpos] = {};
                    if (directIdentityEligible
                        && TryGetEngineBDirectBitmapObjCaptureIdentity(
                            sampleAddr,
                            color,
                            static_cast<u32>(xpos),
                            sourceIdentity))
                    {
                        objIdentity[xpos].Source = sourceIdentity;
                        objIdentity[xpos].DirectXY = true;
                        OBJLineCaptureIdentityAvailable[CurUnit->Num] = true;
                    }
                }
            }
            else if (!window)
            {
                if (objLine[xpos] == 0)
                {
                    objLine[xpos] = pixelattr & 0x180000;
                    if (objIdentity != nullptr)
                        objIdentity[xpos] = {};
                }
            }

            xoff++;
            xpos++;
        }
    }
    else
    {
        u32 pixelsaddr = tilenum;
        if (CurUnit->DispCnt & 0x10)
        {
            pixelsaddr <<= ((CurUnit->DispCnt >> 20) & 0x3);
            pixelsaddr += ((ypos >> 3) * (width >> 3)) << ((attrib[0] & 0x2000) ? 1:0);
        }
        else
        {
            pixelsaddr += ((ypos >> 3) * 0x20);
        }

        if (spritemode == 1) pixelattr |= 0x80000000;
        else                 pixelattr |= 0x10000000;

        if (attrib[0] & 0x2000)
        {
            // 256-color
            pixelsaddr <<= 5;
            pixelsaddr += ((ypos & 0x7) << 3);
            s32 pixelstride;

            if (!window)
            {
                if (!(CurUnit->DispCnt & 0x80000000))
                    pixelattr |= 0x1000;
                else
                    pixelattr |= ((attrib[2] & 0xF000) >> 4);
            }

            if (attrib[1] & 0x1000) // xflip
            {
                pixelsaddr += (((width-1) & wmask) << 3);
                pixelsaddr += ((width-1) & 0x7);
                pixelsaddr -= ((xoff & wmask) << 3);
                pixelsaddr -= (xoff & 0x7);
                pixelstride = -1;
            }
            else
            {
                pixelsaddr += ((xoff & wmask) << 3);
                pixelsaddr += (xoff & 0x7);
                pixelstride = 1;
            }

            for (; xoff < xend;)
            {
                color = objvram[pixelsaddr & objvrammask];

                pixelsaddr += pixelstride;

                if (color)
                {
                    if (window) objWindow[xpos] = 1;
                    else
                    {
                        objLine[xpos] = color | pixelattr;
                        if (objIdentity != nullptr)
                            objIdentity[xpos] = {};
                    }
                }
                else if (!window)
                {
                    if (objLine[xpos] == 0)
                    {
                        objLine[xpos] = pixelattr & 0x180000;
                        if (objIdentity != nullptr)
                            objIdentity[xpos] = {};
                    }
                }

                xoff++;
                xpos++;
                if (!(xoff & 0x7)) pixelsaddr += (56 * pixelstride);
            }
        }
        else
        {
            // 16-color
            pixelsaddr <<= 5;
            pixelsaddr += ((ypos & 0x7) << 2);
            s32 pixelstride;

            if (!window)
            {
                pixelattr |= 0x1000;
                pixelattr |= ((attrib[2] & 0xF000) >> 8);
            }

            // TODO: optimize VRAM access!!
            // TODO: do xflip better? the 'two pixels per byte' thing makes it a bit shitty

            if (attrib[1] & 0x1000) // xflip
            {
                pixelsaddr += (((width-1) & wmask) << 2);
                pixelsaddr += (((width-1) & 0x7) >> 1);
                pixelsaddr -= ((xoff & wmask) << 2);
                pixelsaddr -= ((xoff & 0x7) >> 1);
                pixelstride = -1;
            }
            else
            {
                pixelsaddr += ((xoff & wmask) << 2);
                pixelsaddr += ((xoff & 0x7) >> 1);
                pixelstride = 1;
            }

            for (; xoff < xend;)
            {
                if (attrib[1] & 0x1000)
                {
                    if (xoff & 0x1) { color = objvram[pixelsaddr & objvrammask] & 0x0F; pixelsaddr--; }
                    else              color = objvram[pixelsaddr & objvrammask] >> 4;
                }
                else
                {
                    if (xoff & 0x1) { color = objvram[pixelsaddr & objvrammask] >> 4; pixelsaddr++; }
                    else              color = objvram[pixelsaddr & objvrammask] & 0x0F;
                }

                if (color)
                {
                    if (window) objWindow[xpos] = 1;
                    else
                    {
                        objLine[xpos] = color | pixelattr;
                        if (objIdentity != nullptr)
                            objIdentity[xpos] = {};
                    }
                }
                else if (!window)
                {
                    if (objLine[xpos] == 0)
                    {
                        objLine[xpos] = pixelattr & 0x180000;
                        if (objIdentity != nullptr)
                            objIdentity[xpos] = {};
                    }
                }

                xoff++;
                xpos++;
                if (!(xoff & 0x7)) pixelsaddr += ((attrib[1] & 0x1000) ? -28 : 28);
            }
        }
    }
}

}
}
