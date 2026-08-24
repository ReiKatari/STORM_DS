package me.magnum.melonds.ui.emulator.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class VulkanPresentationConfig {
    public static final int $stable = 8;
    private final me.magnum.melonds.domain.model.layout.BackgroundMode backgroundMode;
    private final float bottomAlpha;
    private final boolean bottomOnTop;
    private final me.magnum.melonds.domain.model.Rect bottomScreenRect;
    private final float hybridAlpha;
    private final me.magnum.melonds.domain.model.Rect hybridBottomScreenRect;
    private final boolean hybridOnTop;
    private final me.magnum.melonds.domain.model.Rect hybridTopScreenRect;
    private final boolean retroShaderClearHistory;
    private final boolean retroShaderEnabled;
    private final java.util.Map<java.lang.String, java.lang.Float> retroShaderParameterOverrides;
    private final int retroShaderPassCount;
    private final java.lang.String retroShaderPresetPath;
    private final java.lang.String retroShaderSourceResolution;
    private final float topAlpha;
    private final boolean topOnTop;
    private final me.magnum.melonds.domain.model.Rect topScreenRect;
    private final me.magnum.melonds.domain.model.VideoFiltering videoFiltering;

    public VulkanPresentationConfig(me.magnum.melonds.domain.model.Rect r1, me.magnum.melonds.domain.model.Rect r2, float r3, float r4, boolean r5, boolean r6, me.magnum.melonds.domain.model.Rect r7, me.magnum.melonds.domain.model.Rect r8, float r9, boolean r10, me.magnum.melonds.domain.model.layout.BackgroundMode r11, me.magnum.melonds.domain.model.VideoFiltering r12, boolean r13, java.lang.String r14, java.lang.String r15, int r16, java.util.Map<java.lang.String, java.lang.Float> r17, boolean r18) {
            r0 = this;
            r11.getClass()
            r12.getClass()
            r15.getClass()
            r17.getClass()
            r0.<init>()
            r0.topScreenRect = r1
            r0.bottomScreenRect = r2
            r0.topAlpha = r3
            r0.bottomAlpha = r4
            r0.topOnTop = r5
            r0.bottomOnTop = r6
            r0.hybridTopScreenRect = r7
            r0.hybridBottomScreenRect = r8
            r0.hybridAlpha = r9
            r0.hybridOnTop = r10
            r0.backgroundMode = r11
            r0.videoFiltering = r12
            r0.retroShaderEnabled = r13
            r0.retroShaderPresetPath = r14
            r0.retroShaderSourceResolution = r15
            r1 = r16
            r0.retroShaderPassCount = r1
            r1 = r17
            r0.retroShaderParameterOverrides = r1
            r1 = r18
            r0.retroShaderClearHistory = r1
            return
    }

    public static /* synthetic */ me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig copy$default(me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig r17, me.magnum.melonds.domain.model.Rect r18, me.magnum.melonds.domain.model.Rect r19, float r20, float r21, boolean r22, boolean r23, me.magnum.melonds.domain.model.Rect r24, me.magnum.melonds.domain.model.Rect r25, float r26, boolean r27, me.magnum.melonds.domain.model.layout.BackgroundMode r28, me.magnum.melonds.domain.model.VideoFiltering r29, boolean r30, java.lang.String r31, java.lang.String r32, int r33, java.util.Map r34, boolean r35, int r36, java.lang.Object r37) {
            r0 = r17
            r1 = r36
            r2 = r1 & 1
            if (r2 == 0) goto Lb
            me.magnum.melonds.domain.model.Rect r2 = r0.topScreenRect
            goto Ld
        Lb:
            r2 = r18
        Ld:
            r3 = r1 & 2
            if (r3 == 0) goto L14
            me.magnum.melonds.domain.model.Rect r3 = r0.bottomScreenRect
            goto L16
        L14:
            r3 = r19
        L16:
            r4 = r1 & 4
            if (r4 == 0) goto L1d
            float r4 = r0.topAlpha
            goto L1f
        L1d:
            r4 = r20
        L1f:
            r5 = r1 & 8
            if (r5 == 0) goto L26
            float r5 = r0.bottomAlpha
            goto L28
        L26:
            r5 = r21
        L28:
            r6 = r1 & 16
            if (r6 == 0) goto L2f
            boolean r6 = r0.topOnTop
            goto L31
        L2f:
            r6 = r22
        L31:
            r7 = r1 & 32
            if (r7 == 0) goto L38
            boolean r7 = r0.bottomOnTop
            goto L3a
        L38:
            r7 = r23
        L3a:
            r8 = r1 & 64
            if (r8 == 0) goto L41
            me.magnum.melonds.domain.model.Rect r8 = r0.hybridTopScreenRect
            goto L43
        L41:
            r8 = r24
        L43:
            r9 = r1 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L4a
            me.magnum.melonds.domain.model.Rect r9 = r0.hybridBottomScreenRect
            goto L4c
        L4a:
            r9 = r25
        L4c:
            r10 = r1 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L53
            float r10 = r0.hybridAlpha
            goto L55
        L53:
            r10 = r26
        L55:
            r11 = r1 & 512(0x200, float:7.17E-43)
            if (r11 == 0) goto L5c
            boolean r11 = r0.hybridOnTop
            goto L5e
        L5c:
            r11 = r27
        L5e:
            r12 = r1 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L65
            me.magnum.melonds.domain.model.layout.BackgroundMode r12 = r0.backgroundMode
            goto L67
        L65:
            r12 = r28
        L67:
            r13 = r1 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L6e
            me.magnum.melonds.domain.model.VideoFiltering r13 = r0.videoFiltering
            goto L70
        L6e:
            r13 = r29
        L70:
            r14 = r1 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L77
            boolean r14 = r0.retroShaderEnabled
            goto L79
        L77:
            r14 = r30
        L79:
            r15 = r1 & 8192(0x2000, float:1.148E-41)
            if (r15 == 0) goto L80
            java.lang.String r15 = r0.retroShaderPresetPath
            goto L82
        L80:
            r15 = r31
        L82:
            r18 = r2
            r2 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L8b
            java.lang.String r2 = r0.retroShaderSourceResolution
            goto L8d
        L8b:
            r2 = r32
        L8d:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r1 & r16
            if (r16 == 0) goto L97
            int r1 = r0.retroShaderPassCount
            goto L99
        L97:
            r1 = r33
        L99:
            r16 = 65536(0x10000, float:9.1835E-41)
            r16 = r36 & r16
            r19 = r1
            if (r16 == 0) goto La4
            java.util.Map<java.lang.String, java.lang.Float> r1 = r0.retroShaderParameterOverrides
            goto La6
        La4:
            r1 = r34
        La6:
            r16 = 131072(0x20000, float:1.83671E-40)
            r16 = r36 & r16
            if (r16 == 0) goto Ld7
            r20 = r1
            boolean r1 = r0.retroShaderClearHistory
            r35 = r20
            r36 = r1
        Lb4:
            r34 = r19
            r33 = r2
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r8
            r26 = r9
            r27 = r10
            r28 = r11
            r29 = r12
            r30 = r13
            r31 = r14
            r32 = r15
            r19 = r18
            r18 = r0
            goto Ldc
        Ld7:
            r36 = r35
            r35 = r1
            goto Lb4
        Ldc:
            me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig r0 = r18.copy(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return r0
    }

    public final me.magnum.melonds.domain.model.Rect component1() {
            r0 = this;
            me.magnum.melonds.domain.model.Rect r0 = r0.topScreenRect
            return r0
    }

    public final boolean component10() {
            r0 = this;
            boolean r0 = r0.hybridOnTop
            return r0
    }

    public final me.magnum.melonds.domain.model.layout.BackgroundMode component11() {
            r0 = this;
            me.magnum.melonds.domain.model.layout.BackgroundMode r0 = r0.backgroundMode
            return r0
    }

    public final me.magnum.melonds.domain.model.VideoFiltering component12() {
            r0 = this;
            me.magnum.melonds.domain.model.VideoFiltering r0 = r0.videoFiltering
            return r0
    }

    public final boolean component13() {
            r0 = this;
            boolean r0 = r0.retroShaderEnabled
            return r0
    }

    public final java.lang.String component14() {
            r0 = this;
            java.lang.String r0 = r0.retroShaderPresetPath
            return r0
    }

    public final java.lang.String component15() {
            r0 = this;
            java.lang.String r0 = r0.retroShaderSourceResolution
            return r0
    }

    public final int component16() {
            r0 = this;
            int r0 = r0.retroShaderPassCount
            return r0
    }

    public final java.util.Map<java.lang.String, java.lang.Float> component17() {
            r0 = this;
            java.util.Map<java.lang.String, java.lang.Float> r0 = r0.retroShaderParameterOverrides
            return r0
    }

    public final boolean component18() {
            r0 = this;
            boolean r0 = r0.retroShaderClearHistory
            return r0
    }

    public final me.magnum.melonds.domain.model.Rect component2() {
            r0 = this;
            me.magnum.melonds.domain.model.Rect r0 = r0.bottomScreenRect
            return r0
    }

    public final float component3() {
            r0 = this;
            float r0 = r0.topAlpha
            return r0
    }

    public final float component4() {
            r0 = this;
            float r0 = r0.bottomAlpha
            return r0
    }

    public final boolean component5() {
            r0 = this;
            boolean r0 = r0.topOnTop
            return r0
    }

    public final boolean component6() {
            r0 = this;
            boolean r0 = r0.bottomOnTop
            return r0
    }

    public final me.magnum.melonds.domain.model.Rect component7() {
            r0 = this;
            me.magnum.melonds.domain.model.Rect r0 = r0.hybridTopScreenRect
            return r0
    }

    public final me.magnum.melonds.domain.model.Rect component8() {
            r0 = this;
            me.magnum.melonds.domain.model.Rect r0 = r0.hybridBottomScreenRect
            return r0
    }

    public final float component9() {
            r0 = this;
            float r0 = r0.hybridAlpha
            return r0
    }

    public final me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig copy(me.magnum.melonds.domain.model.Rect r20, me.magnum.melonds.domain.model.Rect r21, float r22, float r23, boolean r24, boolean r25, me.magnum.melonds.domain.model.Rect r26, me.magnum.melonds.domain.model.Rect r27, float r28, boolean r29, me.magnum.melonds.domain.model.layout.BackgroundMode r30, me.magnum.melonds.domain.model.VideoFiltering r31, boolean r32, java.lang.String r33, java.lang.String r34, int r35, java.util.Map<java.lang.String, java.lang.Float> r36, boolean r37) {
            r19 = this;
            r30.getClass()
            r31.getClass()
            r34.getClass()
            r36.getClass()
            me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig r0 = new me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            r14 = r33
            r15 = r34
            r16 = r35
            r17 = r36
            r18 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig r5 = (me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig) r5
            me.magnum.melonds.domain.model.Rect r1 = r4.topScreenRect
            me.magnum.melonds.domain.model.Rect r3 = r5.topScreenRect
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            me.magnum.melonds.domain.model.Rect r1 = r4.bottomScreenRect
            me.magnum.melonds.domain.model.Rect r3 = r5.bottomScreenRect
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            float r1 = r4.topAlpha
            float r3 = r5.topAlpha
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L2d
            return r2
        L2d:
            float r1 = r4.bottomAlpha
            float r3 = r5.bottomAlpha
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L38
            return r2
        L38:
            boolean r1 = r4.topOnTop
            boolean r3 = r5.topOnTop
            if (r1 == r3) goto L3f
            return r2
        L3f:
            boolean r1 = r4.bottomOnTop
            boolean r3 = r5.bottomOnTop
            if (r1 == r3) goto L46
            return r2
        L46:
            me.magnum.melonds.domain.model.Rect r1 = r4.hybridTopScreenRect
            me.magnum.melonds.domain.model.Rect r3 = r5.hybridTopScreenRect
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L51
            return r2
        L51:
            me.magnum.melonds.domain.model.Rect r1 = r4.hybridBottomScreenRect
            me.magnum.melonds.domain.model.Rect r3 = r5.hybridBottomScreenRect
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L5c
            return r2
        L5c:
            float r1 = r4.hybridAlpha
            float r3 = r5.hybridAlpha
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L67
            return r2
        L67:
            boolean r1 = r4.hybridOnTop
            boolean r3 = r5.hybridOnTop
            if (r1 == r3) goto L6e
            return r2
        L6e:
            me.magnum.melonds.domain.model.layout.BackgroundMode r1 = r4.backgroundMode
            me.magnum.melonds.domain.model.layout.BackgroundMode r3 = r5.backgroundMode
            if (r1 == r3) goto L75
            return r2
        L75:
            me.magnum.melonds.domain.model.VideoFiltering r1 = r4.videoFiltering
            me.magnum.melonds.domain.model.VideoFiltering r3 = r5.videoFiltering
            if (r1 == r3) goto L7c
            return r2
        L7c:
            boolean r1 = r4.retroShaderEnabled
            boolean r3 = r5.retroShaderEnabled
            if (r1 == r3) goto L83
            return r2
        L83:
            java.lang.String r1 = r4.retroShaderPresetPath
            java.lang.String r3 = r5.retroShaderPresetPath
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L8e
            return r2
        L8e:
            java.lang.String r1 = r4.retroShaderSourceResolution
            java.lang.String r3 = r5.retroShaderSourceResolution
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L99
            return r2
        L99:
            int r1 = r4.retroShaderPassCount
            int r3 = r5.retroShaderPassCount
            if (r1 == r3) goto La0
            return r2
        La0:
            java.util.Map<java.lang.String, java.lang.Float> r1 = r4.retroShaderParameterOverrides
            java.util.Map<java.lang.String, java.lang.Float> r3 = r5.retroShaderParameterOverrides
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto Lab
            return r2
        Lab:
            boolean r4 = r4.retroShaderClearHistory
            boolean r5 = r5.retroShaderClearHistory
            if (r4 == r5) goto Lb2
            return r2
        Lb2:
            return r0
    }

    public final me.magnum.melonds.domain.model.layout.BackgroundMode getBackgroundMode() {
            r0 = this;
            me.magnum.melonds.domain.model.layout.BackgroundMode r0 = r0.backgroundMode
            return r0
    }

    public final float getBottomAlpha() {
            r0 = this;
            float r0 = r0.bottomAlpha
            return r0
    }

    public final boolean getBottomOnTop() {
            r0 = this;
            boolean r0 = r0.bottomOnTop
            return r0
    }

    public final me.magnum.melonds.domain.model.Rect getBottomScreenRect() {
            r0 = this;
            me.magnum.melonds.domain.model.Rect r0 = r0.bottomScreenRect
            return r0
    }

    public final float getHybridAlpha() {
            r0 = this;
            float r0 = r0.hybridAlpha
            return r0
    }

    public final me.magnum.melonds.domain.model.Rect getHybridBottomScreenRect() {
            r0 = this;
            me.magnum.melonds.domain.model.Rect r0 = r0.hybridBottomScreenRect
            return r0
    }

    public final boolean getHybridOnTop() {
            r0 = this;
            boolean r0 = r0.hybridOnTop
            return r0
    }

    public final me.magnum.melonds.domain.model.Rect getHybridTopScreenRect() {
            r0 = this;
            me.magnum.melonds.domain.model.Rect r0 = r0.hybridTopScreenRect
            return r0
    }

    public final boolean getRetroShaderClearHistory() {
            r0 = this;
            boolean r0 = r0.retroShaderClearHistory
            return r0
    }

    public final boolean getRetroShaderEnabled() {
            r0 = this;
            boolean r0 = r0.retroShaderEnabled
            return r0
    }

    public final java.util.Map<java.lang.String, java.lang.Float> getRetroShaderParameterOverrides() {
            r0 = this;
            java.util.Map<java.lang.String, java.lang.Float> r0 = r0.retroShaderParameterOverrides
            return r0
    }

    public final int getRetroShaderPassCount() {
            r0 = this;
            int r0 = r0.retroShaderPassCount
            return r0
    }

    public final java.lang.String getRetroShaderPresetPath() {
            r0 = this;
            java.lang.String r0 = r0.retroShaderPresetPath
            return r0
    }

    public final java.lang.String getRetroShaderSourceResolution() {
            r0 = this;
            java.lang.String r0 = r0.retroShaderSourceResolution
            return r0
    }

    public final float getTopAlpha() {
            r0 = this;
            float r0 = r0.topAlpha
            return r0
    }

    public final boolean getTopOnTop() {
            r0 = this;
            boolean r0 = r0.topOnTop
            return r0
    }

    public final me.magnum.melonds.domain.model.Rect getTopScreenRect() {
            r0 = this;
            me.magnum.melonds.domain.model.Rect r0 = r0.topScreenRect
            return r0
    }

    public final me.magnum.melonds.domain.model.VideoFiltering getVideoFiltering() {
            r0 = this;
            me.magnum.melonds.domain.model.VideoFiltering r0 = r0.videoFiltering
            return r0
    }

    public int hashCode() {
            r4 = this;
            me.magnum.melonds.domain.model.Rect r0 = r4.topScreenRect
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            r2 = 31
            int r0 = r0 * r2
            me.magnum.melonds.domain.model.Rect r3 = r4.bottomScreenRect
            if (r3 != 0) goto L14
            r3 = r1
            goto L18
        L14:
            int r3 = r3.hashCode()
        L18:
            int r0 = r0 + r3
            int r0 = r0 * r2
            float r3 = r4.topAlpha
            int r0 = defpackage.xg6.a(r3, r0, r2)
            float r3 = r4.bottomAlpha
            int r0 = defpackage.xg6.a(r3, r0, r2)
            boolean r3 = r4.topOnTop
            int r0 = defpackage.xg6.e(r0, r3, r2)
            boolean r3 = r4.bottomOnTop
            int r0 = defpackage.xg6.e(r0, r3, r2)
            me.magnum.melonds.domain.model.Rect r3 = r4.hybridTopScreenRect
            if (r3 != 0) goto L38
            r3 = r1
            goto L3c
        L38:
            int r3 = r3.hashCode()
        L3c:
            int r0 = r0 + r3
            int r0 = r0 * r2
            me.magnum.melonds.domain.model.Rect r3 = r4.hybridBottomScreenRect
            if (r3 != 0) goto L44
            r3 = r1
            goto L48
        L44:
            int r3 = r3.hashCode()
        L48:
            int r0 = r0 + r3
            int r0 = r0 * r2
            float r3 = r4.hybridAlpha
            int r0 = defpackage.xg6.a(r3, r0, r2)
            boolean r3 = r4.hybridOnTop
            int r0 = defpackage.xg6.e(r0, r3, r2)
            me.magnum.melonds.domain.model.layout.BackgroundMode r3 = r4.backgroundMode
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            int r3 = r3 * r2
            me.magnum.melonds.domain.model.VideoFiltering r0 = r4.videoFiltering
            int r0 = r0.hashCode()
            int r0 = r0 + r3
            int r0 = r0 * r2
            boolean r3 = r4.retroShaderEnabled
            int r0 = defpackage.xg6.e(r0, r3, r2)
            java.lang.String r3 = r4.retroShaderPresetPath
            if (r3 != 0) goto L71
            goto L75
        L71:
            int r1 = r3.hashCode()
        L75:
            int r0 = r0 + r1
            int r0 = r0 * r2
            java.lang.String r1 = r4.retroShaderSourceResolution
            int r0 = defpackage.xg6.d(r0, r2, r1)
            int r1 = r4.retroShaderPassCount
            int r0 = defpackage.lb1.a(r1, r0, r2)
            java.util.Map<java.lang.String, java.lang.Float> r1 = r4.retroShaderParameterOverrides
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * r2
            boolean r4 = r4.retroShaderClearHistory
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r1
            return r4
    }

    public java.lang.String toString() {
            r19 = this;
            r0 = r19
            me.magnum.melonds.domain.model.Rect r1 = r0.topScreenRect
            me.magnum.melonds.domain.model.Rect r2 = r0.bottomScreenRect
            float r3 = r0.topAlpha
            float r4 = r0.bottomAlpha
            boolean r5 = r0.topOnTop
            boolean r6 = r0.bottomOnTop
            me.magnum.melonds.domain.model.Rect r7 = r0.hybridTopScreenRect
            me.magnum.melonds.domain.model.Rect r8 = r0.hybridBottomScreenRect
            float r9 = r0.hybridAlpha
            boolean r10 = r0.hybridOnTop
            me.magnum.melonds.domain.model.layout.BackgroundMode r11 = r0.backgroundMode
            me.magnum.melonds.domain.model.VideoFiltering r12 = r0.videoFiltering
            boolean r13 = r0.retroShaderEnabled
            java.lang.String r14 = r0.retroShaderPresetPath
            java.lang.String r15 = r0.retroShaderSourceResolution
            r16 = r15
            int r15 = r0.retroShaderPassCount
            r17 = r15
            java.util.Map<java.lang.String, java.lang.Float> r15 = r0.retroShaderParameterOverrides
            boolean r0 = r0.retroShaderClearHistory
            r19 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r18 = r15
            java.lang.String r15 = "VulkanPresentationConfig(topScreenRect="
            r0.<init>(r15)
            r0.append(r1)
            java.lang.String r1 = ", bottomScreenRect="
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ", topAlpha="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ", bottomAlpha="
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ", topOnTop="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ", bottomOnTop="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ", hybridTopScreenRect="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ", hybridBottomScreenRect="
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = ", hybridAlpha="
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ", hybridOnTop="
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ", backgroundMode="
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = ", videoFiltering="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = ", retroShaderEnabled="
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = ", retroShaderPresetPath="
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = ", retroShaderSourceResolution="
            r0.append(r1)
            r1 = r16
            r0.append(r1)
            java.lang.String r1 = ", retroShaderPassCount="
            r0.append(r1)
            r1 = r17
            r0.append(r1)
            java.lang.String r1 = ", retroShaderParameterOverrides="
            r0.append(r1)
            r1 = r18
            r0.append(r1)
            java.lang.String r1 = ", retroShaderClearHistory="
            r0.append(r1)
            r1 = r19
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
