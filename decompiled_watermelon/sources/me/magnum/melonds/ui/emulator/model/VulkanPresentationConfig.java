package me.magnum.melonds.ui.emulator.model;

import java.util.Map;
import me.magnum.melonds.domain.model.Rect;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class VulkanPresentationConfig {
    public static final int $stable = 8;
    private final BackgroundMode backgroundMode;
    private final float bottomAlpha;
    private final boolean bottomOnTop;
    private final Rect bottomScreenRect;
    private final float hybridAlpha;
    private final Rect hybridBottomScreenRect;
    private final boolean hybridOnTop;
    private final Rect hybridTopScreenRect;
    private final boolean retroShaderClearHistory;
    private final boolean retroShaderEnabled;
    private final Map<String, Float> retroShaderParameterOverrides;
    private final int retroShaderPassCount;
    private final String retroShaderPresetPath;
    private final String retroShaderSourceResolution;
    private final float topAlpha;
    private final boolean topOnTop;
    private final Rect topScreenRect;
    private final VideoFiltering videoFiltering;

    public VulkanPresentationConfig(Rect rect, Rect rect2, float f, float f2, boolean z, boolean z2, Rect rect3, Rect rect4, float f3, boolean z3, BackgroundMode backgroundMode, VideoFiltering videoFiltering, boolean z4, String str, String str2, int i, Map<String, Float> map, boolean z5) {
        backgroundMode.getClass();
        videoFiltering.getClass();
        str2.getClass();
        map.getClass();
        this.topScreenRect = rect;
        this.bottomScreenRect = rect2;
        this.topAlpha = f;
        this.bottomAlpha = f2;
        this.topOnTop = z;
        this.bottomOnTop = z2;
        this.hybridTopScreenRect = rect3;
        this.hybridBottomScreenRect = rect4;
        this.hybridAlpha = f3;
        this.hybridOnTop = z3;
        this.backgroundMode = backgroundMode;
        this.videoFiltering = videoFiltering;
        this.retroShaderEnabled = z4;
        this.retroShaderPresetPath = str;
        this.retroShaderSourceResolution = str2;
        this.retroShaderPassCount = i;
        this.retroShaderParameterOverrides = map;
        this.retroShaderClearHistory = z5;
    }

    public static /* synthetic */ VulkanPresentationConfig copy$default(VulkanPresentationConfig vulkanPresentationConfig, Rect rect, Rect rect2, float f, float f2, boolean z, boolean z2, Rect rect3, Rect rect4, float f3, boolean z3, BackgroundMode backgroundMode, VideoFiltering videoFiltering, boolean z4, String str, String str2, int i, Map map, boolean z5, int i2, Object obj) {
        boolean z6;
        Map map2;
        Rect rect5 = (i2 & 1) != 0 ? vulkanPresentationConfig.topScreenRect : rect;
        Rect rect6 = (i2 & 2) != 0 ? vulkanPresentationConfig.bottomScreenRect : rect2;
        float f4 = (i2 & 4) != 0 ? vulkanPresentationConfig.topAlpha : f;
        float f5 = (i2 & 8) != 0 ? vulkanPresentationConfig.bottomAlpha : f2;
        boolean z7 = (i2 & 16) != 0 ? vulkanPresentationConfig.topOnTop : z;
        boolean z8 = (i2 & 32) != 0 ? vulkanPresentationConfig.bottomOnTop : z2;
        Rect rect7 = (i2 & 64) != 0 ? vulkanPresentationConfig.hybridTopScreenRect : rect3;
        Rect rect8 = (i2 & 128) != 0 ? vulkanPresentationConfig.hybridBottomScreenRect : rect4;
        float f6 = (i2 & 256) != 0 ? vulkanPresentationConfig.hybridAlpha : f3;
        boolean z9 = (i2 & 512) != 0 ? vulkanPresentationConfig.hybridOnTop : z3;
        BackgroundMode backgroundMode2 = (i2 & 1024) != 0 ? vulkanPresentationConfig.backgroundMode : backgroundMode;
        VideoFiltering videoFiltering2 = (i2 & 2048) != 0 ? vulkanPresentationConfig.videoFiltering : videoFiltering;
        boolean z10 = (i2 & 4096) != 0 ? vulkanPresentationConfig.retroShaderEnabled : z4;
        String str3 = (i2 & 8192) != 0 ? vulkanPresentationConfig.retroShaderPresetPath : str;
        Rect rect9 = rect5;
        String str4 = (i2 & 16384) != 0 ? vulkanPresentationConfig.retroShaderSourceResolution : str2;
        int i3 = (i2 & 32768) != 0 ? vulkanPresentationConfig.retroShaderPassCount : i;
        Map map3 = (i2 & 65536) != 0 ? vulkanPresentationConfig.retroShaderParameterOverrides : map;
        if ((i2 & 131072) != 0) {
            map2 = map3;
            z6 = vulkanPresentationConfig.retroShaderClearHistory;
        } else {
            z6 = z5;
            map2 = map3;
        }
        return vulkanPresentationConfig.copy(rect9, rect6, f4, f5, z7, z8, rect7, rect8, f6, z9, backgroundMode2, videoFiltering2, z10, str3, str4, i3, map2, z6);
    }

    public final Rect component1() {
        return this.topScreenRect;
    }

    public final boolean component10() {
        return this.hybridOnTop;
    }

    public final BackgroundMode component11() {
        return this.backgroundMode;
    }

    public final VideoFiltering component12() {
        return this.videoFiltering;
    }

    public final boolean component13() {
        return this.retroShaderEnabled;
    }

    public final String component14() {
        return this.retroShaderPresetPath;
    }

    public final String component15() {
        return this.retroShaderSourceResolution;
    }

    public final int component16() {
        return this.retroShaderPassCount;
    }

    public final Map<String, Float> component17() {
        return this.retroShaderParameterOverrides;
    }

    public final boolean component18() {
        return this.retroShaderClearHistory;
    }

    public final Rect component2() {
        return this.bottomScreenRect;
    }

    public final float component3() {
        return this.topAlpha;
    }

    public final float component4() {
        return this.bottomAlpha;
    }

    public final boolean component5() {
        return this.topOnTop;
    }

    public final boolean component6() {
        return this.bottomOnTop;
    }

    public final Rect component7() {
        return this.hybridTopScreenRect;
    }

    public final Rect component8() {
        return this.hybridBottomScreenRect;
    }

    public final float component9() {
        return this.hybridAlpha;
    }

    public final VulkanPresentationConfig copy(Rect rect, Rect rect2, float f, float f2, boolean z, boolean z2, Rect rect3, Rect rect4, float f3, boolean z3, BackgroundMode backgroundMode, VideoFiltering videoFiltering, boolean z4, String str, String str2, int i, Map<String, Float> map, boolean z5) {
        backgroundMode.getClass();
        videoFiltering.getClass();
        str2.getClass();
        map.getClass();
        return new VulkanPresentationConfig(rect, rect2, f, f2, z, z2, rect3, rect4, f3, z3, backgroundMode, videoFiltering, z4, str, str2, i, map, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VulkanPresentationConfig)) {
            return false;
        }
        VulkanPresentationConfig vulkanPresentationConfig = (VulkanPresentationConfig) obj;
        if (b53.x(this.topScreenRect, vulkanPresentationConfig.topScreenRect) && b53.x(this.bottomScreenRect, vulkanPresentationConfig.bottomScreenRect) && Float.compare(this.topAlpha, vulkanPresentationConfig.topAlpha) == 0 && Float.compare(this.bottomAlpha, vulkanPresentationConfig.bottomAlpha) == 0 && this.topOnTop == vulkanPresentationConfig.topOnTop && this.bottomOnTop == vulkanPresentationConfig.bottomOnTop && b53.x(this.hybridTopScreenRect, vulkanPresentationConfig.hybridTopScreenRect) && b53.x(this.hybridBottomScreenRect, vulkanPresentationConfig.hybridBottomScreenRect) && Float.compare(this.hybridAlpha, vulkanPresentationConfig.hybridAlpha) == 0 && this.hybridOnTop == vulkanPresentationConfig.hybridOnTop && this.backgroundMode == vulkanPresentationConfig.backgroundMode && this.videoFiltering == vulkanPresentationConfig.videoFiltering && this.retroShaderEnabled == vulkanPresentationConfig.retroShaderEnabled && b53.x(this.retroShaderPresetPath, vulkanPresentationConfig.retroShaderPresetPath) && b53.x(this.retroShaderSourceResolution, vulkanPresentationConfig.retroShaderSourceResolution) && this.retroShaderPassCount == vulkanPresentationConfig.retroShaderPassCount && b53.x(this.retroShaderParameterOverrides, vulkanPresentationConfig.retroShaderParameterOverrides) && this.retroShaderClearHistory == vulkanPresentationConfig.retroShaderClearHistory) {
            return true;
        }
        return false;
    }

    public final BackgroundMode getBackgroundMode() {
        return this.backgroundMode;
    }

    public final float getBottomAlpha() {
        return this.bottomAlpha;
    }

    public final boolean getBottomOnTop() {
        return this.bottomOnTop;
    }

    public final Rect getBottomScreenRect() {
        return this.bottomScreenRect;
    }

    public final float getHybridAlpha() {
        return this.hybridAlpha;
    }

    public final Rect getHybridBottomScreenRect() {
        return this.hybridBottomScreenRect;
    }

    public final boolean getHybridOnTop() {
        return this.hybridOnTop;
    }

    public final Rect getHybridTopScreenRect() {
        return this.hybridTopScreenRect;
    }

    public final boolean getRetroShaderClearHistory() {
        return this.retroShaderClearHistory;
    }

    public final boolean getRetroShaderEnabled() {
        return this.retroShaderEnabled;
    }

    public final Map<String, Float> getRetroShaderParameterOverrides() {
        return this.retroShaderParameterOverrides;
    }

    public final int getRetroShaderPassCount() {
        return this.retroShaderPassCount;
    }

    public final String getRetroShaderPresetPath() {
        return this.retroShaderPresetPath;
    }

    public final String getRetroShaderSourceResolution() {
        return this.retroShaderSourceResolution;
    }

    public final float getTopAlpha() {
        return this.topAlpha;
    }

    public final boolean getTopOnTop() {
        return this.topOnTop;
    }

    public final Rect getTopScreenRect() {
        return this.topScreenRect;
    }

    public final VideoFiltering getVideoFiltering() {
        return this.videoFiltering;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Rect rect = this.topScreenRect;
        int i = 0;
        if (rect == null) {
            hashCode = 0;
        } else {
            hashCode = rect.hashCode();
        }
        int i2 = hashCode * 31;
        Rect rect2 = this.bottomScreenRect;
        if (rect2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = rect2.hashCode();
        }
        int c = ej6.c(ej6.c(ej6.a(this.bottomAlpha, ej6.a(this.topAlpha, (i2 + hashCode2) * 31, 31), 31), this.topOnTop, 31), this.bottomOnTop, 31);
        Rect rect3 = this.hybridTopScreenRect;
        if (rect3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = rect3.hashCode();
        }
        int i3 = (c + hashCode3) * 31;
        Rect rect4 = this.hybridBottomScreenRect;
        if (rect4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = rect4.hashCode();
        }
        int c2 = ej6.c((this.videoFiltering.hashCode() + ((this.backgroundMode.hashCode() + ej6.c(ej6.a(this.hybridAlpha, (i3 + hashCode4) * 31, 31), this.hybridOnTop, 31)) * 31)) * 31, this.retroShaderEnabled, 31);
        String str = this.retroShaderPresetPath;
        if (str != null) {
            i = str.hashCode();
        }
        return Boolean.hashCode(this.retroShaderClearHistory) + ((this.retroShaderParameterOverrides.hashCode() + wh1.a(this.retroShaderPassCount, ej6.b((c2 + i) * 31, 31, this.retroShaderSourceResolution), 31)) * 31);
    }

    public String toString() {
        Rect rect = this.topScreenRect;
        Rect rect2 = this.bottomScreenRect;
        float f = this.topAlpha;
        float f2 = this.bottomAlpha;
        boolean z = this.topOnTop;
        boolean z2 = this.bottomOnTop;
        Rect rect3 = this.hybridTopScreenRect;
        Rect rect4 = this.hybridBottomScreenRect;
        float f3 = this.hybridAlpha;
        boolean z3 = this.hybridOnTop;
        BackgroundMode backgroundMode = this.backgroundMode;
        VideoFiltering videoFiltering = this.videoFiltering;
        boolean z4 = this.retroShaderEnabled;
        String str = this.retroShaderPresetPath;
        String str2 = this.retroShaderSourceResolution;
        int i = this.retroShaderPassCount;
        Map<String, Float> map = this.retroShaderParameterOverrides;
        boolean z5 = this.retroShaderClearHistory;
        return "VulkanPresentationConfig(topScreenRect=" + rect + ", bottomScreenRect=" + rect2 + ", topAlpha=" + f + ", bottomAlpha=" + f2 + ", topOnTop=" + z + ", bottomOnTop=" + z2 + ", hybridTopScreenRect=" + rect3 + ", hybridBottomScreenRect=" + rect4 + ", hybridAlpha=" + f3 + ", hybridOnTop=" + z3 + ", backgroundMode=" + backgroundMode + ", videoFiltering=" + videoFiltering + ", retroShaderEnabled=" + z4 + ", retroShaderPresetPath=" + str + ", retroShaderSourceResolution=" + str2 + ", retroShaderPassCount=" + i + ", retroShaderParameterOverrides=" + map + ", retroShaderClearHistory=" + z5 + ")";
    }
}
