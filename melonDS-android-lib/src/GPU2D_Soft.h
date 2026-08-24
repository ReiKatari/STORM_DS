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

#pragma once

#include <cstddef>
#include <memory>

#include "GPU2D.h"
#include "GPU3D.h"

namespace melonDS
{
class GPU;

namespace GPU2D
{

class SoftRenderer : public Renderer2D
{
public:
    enum class StructuredCaptureIdentityState : u8
    {
        Unknown = 0,
        Uniform = 1,
        Conflict = 2,
    };

    enum class StructuredCaptureWriterRoute : u8
    {
        Unknown = 0,
        Fast = 1,
        General = 2,
    };

    struct StructuredVulkan2DObjCaptureLineIdentity
    {
        CaptureSourceIdentity Source {};
        u16 ConsumedPixels = 0;
        u16 DirectXYPixels = 0;
        StructuredCaptureIdentityState State = StructuredCaptureIdentityState::Unknown;
    };

    struct StructuredVulkan2DDisplayedCaptureLineIdentity
    {
        CaptureSourceIdentity Source {};
        u8 VramBank = 0xFFu;
        bool Copied = false;
        bool PackedShadowExact = false;
        StructuredCaptureIdentityState State = StructuredCaptureIdentityState::Unknown;
        StructuredCaptureWriterRoute WriterRoute = StructuredCaptureWriterRoute::Unknown;
    };

    struct StructuredVulkan2DCaptureBankIdentity
    {
        CaptureSourceIdentity Source {};
        u8 VramBank = 0xFFu;
        bool Valid = false;
        u32 ValidLines = 0;
        u32 UniformLines = 0;
        u32 ConflictLines = 0;
        u32 FastLines = 0;
        u32 GeneralLines = 0;
        u32 UnknownLines = 0;
        u32 ShadowMatchedPixels = 0;
        bool ShadowExact = false;
    };

    struct DebugCaptureStats
    {
        u32 CaptureLines = 0;
        u32 CaptureWidth = 0;
        u32 CaptureMode = 0;
        u32 CaptureBit24 = 0;
        u32 Direct3DLines = 0;
        u32 SourceACompositeLines = 0;
        u32 CaptureLineUses3dLines = 0;
        u32 CaptureLineUsefulAlphaLines = 0;
        u32 CaptureDestinationBlankLines = 0;
        u32 Opaque3DSourcePixels = 0;
        u32 Opaque3DBackdropPixels = 0;
        u32 SourceAOutputUsefulPixels = 0;
        u32 SourceAOutputVisiblePixels = 0;
        u32 SourceAOutputOpaqueBlackPixels = 0;
        u32 StructuredCopyLines = 0;
        u32 StructuredCopyPlane0UsefulPixels = 0;
        u32 StructuredCopyPlane1UsefulPixels = 0;
        u32 StructuredCopySlotPixels = 0;
        u32 StructuredCopyAbovePixels = 0;
        u32 StructuredCopy2DOnlyPixels = 0;
        u32 StructuredCopySourceBOverlayPixels = 0;
        u32 CaptureBacked3DLines = 0;
        u32 CaptureBacked3DNoBestClassLines = 0;
        u32 CaptureBacked3DExplicitSlotLines = 0;
        u32 CaptureBacked3DBestClassCounts[17] {};
        u32 CompModeCounts[8] {};
    };

    SoftRenderer(melonDS::GPU& gpu);
    ~SoftRenderer() override;

    void DrawScanline(u32 line, Unit* unit) override;
    void DrawSprites(u32 line, Unit* unit) override;
    void VBlankEnd(Unit* unitA, Unit* unitB) override;
    bool StructuredVulkan2DSourceACaptureHasDominant2DReplay() const noexcept override;
    [[nodiscard]] virtual const DebugCaptureStats& GetDebugCaptureStats() const noexcept { return LastDebugCaptureStats; }
    [[nodiscard]] virtual const u32* GetDebugCapture3dSource() const noexcept { return HasLastDebugCapture3dSource ? LastDebugCapture3dSource : nullptr; }
    [[nodiscard]] virtual u32 GetDebugFramesSinceLastCapture() const noexcept { return FramesSinceLastCapture; }
    [[nodiscard]] virtual const std::array<u8, 192>& GetDebugCaptureLineUses3dMask() const noexcept { return CaptureLineUses3d; }
    [[nodiscard]] virtual const u32* GetStructuredVulkan2DPlane(bool topScreen, u32 plane) const noexcept;
    [[nodiscard]] virtual const u8* GetStructuredVulkan2DLinePayloadMask(bool topScreen) const noexcept;
    [[nodiscard]] virtual const u8* GetStructuredVulkan2DLine3DSlotMask(bool topScreen) const noexcept;
    [[nodiscard]] virtual const u8* GetStructuredVulkan2DLinePure3DMask(bool topScreen) const noexcept;
    [[nodiscard]] virtual const u8* GetStructuredVulkan2DLineKnownExactMask(bool topScreen) const noexcept;
    [[nodiscard]] virtual const StructuredVulkan2DObjCaptureLineIdentity*
        GetStructuredVulkan2DObjCaptureIdentityLines(bool topScreen) const noexcept;
    [[nodiscard]] virtual const StructuredVulkan2DDisplayedCaptureLineIdentity*
        GetStructuredVulkan2DDisplayedCaptureIdentityLines(bool topScreen) const noexcept;
    [[nodiscard]] virtual StructuredVulkan2DCaptureBankIdentity
        GetStructuredVulkan2DCaptureBankIdentity(u32 vramBank) const noexcept;
    [[nodiscard]] virtual bool GetSameBankMode2DisplayedCaptureIdentity(
        u32& outVramBank,
        CaptureSourceIdentity& outIdentity) const noexcept;
    [[nodiscard]] virtual bool GetSameBankMode2CompletedWriterIdentity(
        u32& outVramBank,
        CaptureSourceIdentity& outIdentity) const noexcept;
    virtual void BeginStructuredVulkan2DFrame() noexcept;
    virtual void ClearStructuredVulkan2DState() noexcept;
    virtual void SeedStructuredVulkan2DCaptureBanksFromVram();
    virtual void SwapStructuredVulkan2DBuffers() noexcept;
private:
    class IVulkan2DPipelineStrategy;
    class CompatibilityVulkan2DPipelineStrategy;
    class FastPathVulkan2DPipelineStrategy;

    [[nodiscard]] IVulkan2DPipelineStrategy& activeVulkan2DPipelineStrategy() noexcept;
    void DrawScanlineActivePipeline(u32 line, Unit* unit);
    void DrawSpritesActivePipeline(u32 line, Unit* unit);
    void VBlankEndActivePipeline(Unit* unitA, Unit* unitB);

    struct StructuredCaptureLineIdentity
    {
        CaptureSourceIdentity Source {};
        StructuredCaptureIdentityState State = StructuredCaptureIdentityState::Unknown;
    };

    struct ObjCaptureIdentityTag
    {
        CaptureSourceIdentity Source {};
        bool DirectXY = false;
    };

    static constexpr size_t kStructuredScreenWidth = 256;
    static constexpr size_t kStructuredScreenHeight = 192;
    static constexpr size_t kStructuredPixelCount = kStructuredScreenWidth * kStructuredScreenHeight;
    static constexpr size_t kStructuredPlaneCount = 3;
    static constexpr size_t kStructuredScreenCount = 2;

    melonDS::GPU& GPU;
    std::unique_ptr<IVulkan2DPipelineStrategy> CompatibilityVulkan2DPipelineStrategyInstance;
    std::unique_ptr<IVulkan2DPipelineStrategy> FastPathVulkan2DPipelineStrategyInstance;
    alignas(8) u32 BGOBJLine[256*3];
    u32* _3DLine;

    alignas(8) u8 WindowMask[256];

    alignas(8) u32 OBJLine[2][256];
    alignas(8) u8 OBJWindow[2][256];
    std::array<ObjCaptureIdentityTag, 2 * kStructuredScreenWidth> OBJLineCaptureIdentity {};
    std::array<bool, 2> OBJLineCaptureIdentityAvailable {};
    std::array<ObjCaptureIdentityTag, kStructuredPlaneCount * kStructuredScreenWidth>
        ComposedObjCaptureIdentity {};
    bool TrackSpriteObjCaptureIdentity = false;
    bool TrackComposedObjCaptureIdentity = false;
    u32 CurrentSpriteRenderLine = kStructuredScreenHeight;

    u32 NumSprites[2];

    u8* CurBGXMosaicTable;
    array2d<u8, 16, 256> MosaicTable = []() constexpr
    {
        array2d<u8, 16, 256> table {};
        // initialize mosaic table
        for (int m = 0; m < 16; m++)
        {
            for (int x = 0; x < 256; x++)
            {
                int offset = x % (m+1);
                table[m][x] = offset;
            }
        }

        return table;
    }();

    static constexpr u32 ColorBlend4(u32 val1, u32 val2, u32 eva, u32 evb) noexcept
    {
        u32 r =  (((val1 & 0x00003F) * eva) + ((val2 & 0x00003F) * evb) + 0x000008) >> 4;
        u32 g = ((((val1 & 0x003F00) * eva) + ((val2 & 0x003F00) * evb) + 0x000800) >> 4) & 0x007F00;
        u32 b = ((((val1 & 0x3F0000) * eva) + ((val2 & 0x3F0000) * evb) + 0x080000) >> 4) & 0x7F0000;

        if (r > 0x00003F) r = 0x00003F;
        if (g > 0x003F00) g = 0x003F00;
        if (b > 0x3F0000) b = 0x3F0000;

        return r | g | b | 0xFF000000;
    }

    static constexpr u32 ColorBlend5(u32 val1, u32 val2) noexcept
    {
        u32 eva = ((val1 >> 24) & 0x1F) + 1;
        u32 evb = 32 - eva;

        if (eva == 32) return val1;

        u32 r =  (((val1 & 0x00003F) * eva) + ((val2 & 0x00003F) * evb) + 0x000010) >> 5;
        u32 g = ((((val1 & 0x003F00) * eva) + ((val2 & 0x003F00) * evb) + 0x001000) >> 5) & 0x007F00;
        u32 b = ((((val1 & 0x3F0000) * eva) + ((val2 & 0x3F0000) * evb) + 0x100000) >> 5) & 0x7F0000;

        if (r > 0x00003F) r = 0x00003F;
        if (g > 0x003F00) g = 0x003F00;
        if (b > 0x3F0000) b = 0x3F0000;

        return r | g | b | 0xFF000000;
    }

    static constexpr u32 ColorBrightnessUp(u32 val, u32 factor, u32 bias) noexcept
    {
        u32 rb = val & 0x3F003F;
        u32 g = val & 0x003F00;

        rb += (((((0x3F003F - rb) * factor) + (bias*0x010001)) >> 4) & 0x3F003F);
        g +=  (((((0x003F00 - g ) * factor) + (bias*0x000100)) >> 4) & 0x003F00);

        return rb | g | 0xFF000000;
    }

    static constexpr u32 ColorBrightnessDown(u32 val, u32 factor, u32 bias) noexcept
    {
        u32 rb = val & 0x3F003F;
        u32 g = val & 0x003F00;

        rb -= ((((rb * factor) + (bias*0x010001)) >> 4) & 0x3F003F);
        g -=  ((((g  * factor) + (bias*0x000100)) >> 4) & 0x003F00);

        return rb | g | 0xFF000000;
    }
    u32 ColorComposite(int i, u32 val1, u32 val2) const;
    [[nodiscard]] bool UseStructuredVulkan2D() const noexcept;
    void ClearStructuredVulkan2DLine(u32 line);
    void ClearStructuredVulkan2DObjCaptureLineIdentity(u32 line) noexcept;
    void ClearStructuredVulkan2DDisplayedCaptureLineIdentity(u32 line) noexcept;
    void ObserveStructuredVulkan2DObjCaptureIdentity(
        const ObjCaptureIdentityTag& identity) noexcept;
    void MarkStructuredVulkan2DObjCaptureIdentityConflict() noexcept;
    void ObserveFinalStructuredVulkan2DObjCaptureIdentity(
        size_t index,
        size_t screenBase,
        u32 originalVal1,
        u32 originalVal2,
        u32 originalVal3) noexcept;
    void ShiftComposedObjCaptureIdentity(u32* dst) noexcept;
    [[nodiscard]] bool TryGetEngineBDirectBitmapObjCaptureIdentity(
        u32 objByteAddress,
        u16 packedColor,
        u32 screenX,
        CaptureSourceIdentity& outIdentity) const noexcept;
    [[nodiscard]] bool CanUseStructuredVulkan2DPure3DLine(u32 dispmode) const noexcept;
    void FillStructuredVulkan2DPure3DLine(u32 line, u32* dst, u32 masterBrightness, bool writeLineMeta = true);
    bool TryPromoteStructuredVulkan2DComposedPure3DLine(u32 line, u32 masterBrightness);
    void ClearStructuredVulkan2DCapture(u32 vramBank);
    void ClearStructuredVulkan2DCaptureRange(u32 vramBank, u32 dstAddress, u32 width);
    void FillStructuredVulkan2DCapturePure3DRange(u32 vramBank, u32 dstAddress, u32 width);
    void InvalidateStructuredVulkan2DCaptureIdentityRange(
        u32 vramBank,
        u32 dstAddress,
        u32 width,
        StructuredCaptureIdentityState state = StructuredCaptureIdentityState::Unknown) noexcept;
    void SealStructuredVulkan2DCaptureIdentity(
        u32 vramBank,
        u32 dstAddress,
        u32 width,
        const CaptureSourceIdentity* sourceIdentity,
        StructuredCaptureWriterRoute writerRoute) noexcept;
    void SaveStructuredVulkan2DCaptureSourceLine(u32 line);
    [[nodiscard]] bool StructuredVulkan2DCaptureSourceLineHas3DSlot(u32 line, u32 width) const noexcept;
    [[nodiscard]] bool StructuredVulkan2DCaptureSourceLineCanFastCopy(u32 line, u32 width) const noexcept;
    [[nodiscard]] bool StructuredVulkan2DLineHasVisibleSourceA(const u32* line, u32 width) const noexcept;
    [[nodiscard]] bool StructuredVulkan2DCaptureSourceLineCanCopy2DOnly(u32 line, u32 width) const noexcept;
    void CopyStructuredVulkan2DCaptureSourceLineToCapture(
        u32 line,
        u32 vramBank,
        u32 dstAddress,
        u32 width,
        u8* carriedOverlayProvenance = nullptr);
    void CopyStructuredVulkan2DCurrentLineToCapture(u32 line, u32 vramBank, u32 dstAddress, u32 width);
    void CopyStructuredVulkan2DCaptureLineToCurrentScreenCompatibility(
        u32 line,
        u32 vramBank);
    void CopyStructuredVulkan2DCaptureLineToCurrentScreen(u32 line, u32 vramBank, const u32* packedLine);
    void FillStructuredVulkan2DVramDisplayLine(u32 line, const u16* vramLine);
    __attribute__((always_inline)) bool ReadStructuredVulkan2DCapture2DOverlayPixel(
        u32 vramBank,
        u32 vramAddress,
        u32& overlayPixel,
        u32& overlayControl,
        bool allowCaptureMatched3DSlot = false) const noexcept;
    void MergeStructuredVulkan2DCapture2DOverlayPixel(
        u32 vramBank,
        u32 vramAddress,
        u32 overlayPixel,
        u32 overlayControl,
        u8 overlayLineage);
    [[nodiscard]] bool CurrentUnitTargetsTopScreen() const noexcept;
    [[nodiscard]] bool StoreStructuredVulkan2DPixel(
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
        bool evaluateKnownExact);
    void MarkStructuredVulkan2DLine(
        u32 line,
        size_t screenIndex,
        u32 plane0,
        u32 plane1,
        u32 control) noexcept;
    void MarkStructuredVulkan2DCaptureLine(
        u32 vramBank,
        u32 captureAddress,
        u32 plane0,
        u32 plane1,
        u32 control) noexcept;
    void StoreStructuredVulkan2DCapturePixel(
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
        u8 carriedProtectedBlack);
    template<u32 bgmode> void DrawScanlineBGMode(u32 line);
    void DrawScanlineBGMode6(u32 line);
    void DrawScanlineBGMode7(u32 line);
    void DrawScanline_BGOBJ(u32 line);

    static void DrawPixel_Normal(SoftRenderer& renderer, u32* dst, u16 color, u32 flag);
    static void DrawPixel_Accel(SoftRenderer& renderer, u32* dst, u16 color, u32 flag);
    static void DrawPixel_AccelTracked(SoftRenderer& renderer, u32* dst, u16 color, u32 flag);
    void PushRawPixel_Accel(u32* dst, u32 value);
    bool TryDrawStructuredVulkan2DCapturePixel(u32* dst, u32 flatByteAddress);

    typedef void (*DrawPixel)(SoftRenderer& renderer, u32* dst, u16 color, u32 flag);

    void DrawBG_3D();
    template<bool mosaic, DrawPixel drawPixel> void DrawBG_Text(u32 line, u32 bgnum);
    template<bool mosaic, DrawPixel drawPixel> void DrawBG_Affine(u32 line, u32 bgnum);
    template<bool mosaic, DrawPixel drawPixel> void DrawBG_Extended(u32 line, u32 bgnum);
    template<bool mosaic, DrawPixel drawPixel> void DrawBG_Large(u32 line);

    void ApplySpriteMosaicX();
    template<DrawPixel drawPixel>
    void InterleaveSprites(u32 prio);
    template<bool window> void DrawSprite_Rotscale(u32 num, u32 boundwidth, u32 boundheight, u32 width, u32 height, s32 xpos, s32 ypos);
    template<bool window> void DrawSprite_Normal(u32 num, u32 width, u32 height, s32 xpos, s32 ypos);

    void DoCapture(u32 line, u32 width, u32 sourceLine);

    DebugCaptureStats LastDebugCaptureStats {};
    u32 FramesSinceLastCapture = 255;
    bool HasLastDebugCapture3dSource = false;
    alignas(8) u32 LastDebugCapture3dSource[256 * 192] {};
    std::array<u8, 192> CaptureLineUses3d {};
    std::array<CaptureSourceIdentity, 4> SameBankMode2WriterIdentity {};
    std::array<bool, 4> SameBankMode2WriterIdentityValid {};
    CaptureSourceIdentity SameBankMode2DisplayedIdentity {};
    u32 SameBankMode2DisplayedVramBank = 4u;
    bool SameBankMode2DisplayedIdentityValid = false;
    CaptureSourceIdentity SameBankMode2CompletedWriterIdentity {};
    u32 SameBankMode2CompletedWriterVramBank = 4u;
    bool SameBankMode2CompletedWriterIdentityValid = false;
    CaptureSourceIdentity SameBankMode2PendingWriterIdentity {};
    u32 SameBankMode2PendingWriterLines = 0u;
    bool SameBankMode2PendingWriterConflict = false;
    bool CurrentLineRegularCaptureUses3d = false;
    static constexpr size_t kStructuredPlaneBufferWords =
        kStructuredScreenCount * kStructuredPlaneCount * kStructuredPixelCount;
    static constexpr size_t kStructuredLineMaskBytes =
        kStructuredScreenCount * kStructuredScreenHeight;
    std::array<u32, 2 * kStructuredPlaneBufferWords> StructuredVulkan2DPlanesStorage {};
    std::array<u8, 2 * kStructuredLineMaskBytes> StructuredVulkan2DLineHasPayloadStorage {};
    std::array<u8, 2 * kStructuredLineMaskBytes> StructuredVulkan2DLineHas3DSlotStorage {};
    std::array<u8, 2 * kStructuredLineMaskBytes> StructuredVulkan2DLinePure3DStorage {};
    std::array<u8, 2 * kStructuredLineMaskBytes> StructuredVulkan2DLineKnownExactStorage {};
    std::array<StructuredVulkan2DObjCaptureLineIdentity, 2 * kStructuredLineMaskBytes>
        StructuredVulkan2DObjCaptureIdentityStorage {};
    std::array<StructuredVulkan2DDisplayedCaptureLineIdentity, 2 * kStructuredLineMaskBytes>
        StructuredVulkan2DDisplayedCaptureIdentityStorage {};
    u32 StructuredVulkan2DWriteBufferIndex = 0;
    u32 StructuredVulkan2DReadBufferIndex = 0;
    u32* StructuredVulkan2DPlanes = StructuredVulkan2DPlanesStorage.data();
    u8* StructuredVulkan2DLineHasPayload = StructuredVulkan2DLineHasPayloadStorage.data();
    u8* StructuredVulkan2DLineHas3DSlot = StructuredVulkan2DLineHas3DSlotStorage.data();
    u8* StructuredVulkan2DLinePure3D = StructuredVulkan2DLinePure3DStorage.data();
    u8* StructuredVulkan2DLineKnownExact = StructuredVulkan2DLineKnownExactStorage.data();
    StructuredVulkan2DObjCaptureLineIdentity* StructuredVulkan2DObjCaptureIdentity =
        StructuredVulkan2DObjCaptureIdentityStorage.data();
    StructuredVulkan2DDisplayedCaptureLineIdentity* StructuredVulkan2DDisplayedCaptureIdentity =
        StructuredVulkan2DDisplayedCaptureIdentityStorage.data();
    std::array<u32, kStructuredPlaneCount * kStructuredScreenWidth> StructuredVulkan2DCaptureSourceLine {};
    bool StructuredVulkan2DCaptureSourceLineValid = false;
    u32 StructuredVulkan2DCaptureSourceLineY = 0;
    bool StructuredVulkan2DCurrentLineTargetsTop = false;
    bool StructuredVulkan2DCurrentLineMapsDirectly = false;
    u32 StructuredVulkan2DCurrentLineY = kStructuredScreenHeight;
    bool DirectCaptureSourceLineSink = false;
    bool DirectCaptureSourceLineSinkComplete = false;
    bool DirectCaptureDeferredTail = false;
    std::array<u32, 4 * kStructuredPlaneCount * kStructuredPixelCount> StructuredVulkan2DCapturePlanes {};
    std::array<u8, 4 * kStructuredPixelCount> StructuredVulkan2DCaptureOverlayLineage {};
    std::array<u8, 4 * kStructuredScreenHeight> StructuredVulkan2DCaptureLineValid {};
    std::array<u8, 4 * kStructuredScreenHeight> StructuredVulkan2DCaptureLineHasPayload {};
    std::array<u8, 4 * kStructuredScreenHeight> StructuredVulkan2DCaptureLineHas3DSlot {};
    std::array<u16, 4 * kStructuredPixelCount> StructuredVulkan2DCapturePackedShadow {};
    std::array<StructuredCaptureLineIdentity, 4 * kStructuredScreenHeight>
        StructuredVulkan2DCaptureLineIdentity {};
    std::array<StructuredCaptureWriterRoute, 4 * kStructuredScreenHeight>
        StructuredVulkan2DCaptureWriterRoute {};
};

}

}
