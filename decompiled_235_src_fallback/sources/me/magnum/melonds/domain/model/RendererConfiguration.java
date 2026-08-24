package me.magnum.melonds.domain.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RendererConfiguration {
    public static final int $stable = 8;
    private final boolean conservativeCoverageApplyClamp;
    private final boolean conservativeCoverageApplyRepeat;
    private final float conservativeCoverageDepthBias;
    private final boolean conservativeCoverageEnabled;
    private final float conservativeCoveragePx;
    private final boolean debug3dClearMagenta;
    private final int internalResolutionScaling;
    private final me.magnum.melonds.domain.model.VideoRenderer renderer;
    private final boolean rendererDebugBgObjEnabled;
    private final boolean rendererDebugLatchTraceEnabled;
    private final boolean rendererDebugToolsEnabled;
    private final defpackage.po5 retroArchShader;
    private final boolean threadedRendering;
    private final me.magnum.melonds.domain.model.VideoFiltering videoFiltering;
    private final me.magnum.melonds.domain.model.VulkanPipelineProfile vulkanPipelineProfile;

    public RendererConfiguration(me.magnum.melonds.domain.model.VideoRenderer r1, me.magnum.melonds.domain.model.VideoFiltering r2, boolean r3, me.magnum.melonds.domain.model.VulkanPipelineProfile r4, int r5, boolean r6, boolean r7, boolean r8, boolean r9, float r10, float r11, boolean r12, boolean r13, boolean r14, defpackage.po5 r15) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r4.getClass()
            r15.getClass()
            r0.<init>()
            r0.renderer = r1
            r0.videoFiltering = r2
            r0.threadedRendering = r3
            r0.vulkanPipelineProfile = r4
            r0.internalResolutionScaling = r5
            r0.rendererDebugToolsEnabled = r6
            r0.rendererDebugBgObjEnabled = r7
            r0.rendererDebugLatchTraceEnabled = r8
            r0.conservativeCoverageEnabled = r9
            r0.conservativeCoveragePx = r10
            r0.conservativeCoverageDepthBias = r11
            r0.conservativeCoverageApplyRepeat = r12
            r0.conservativeCoverageApplyClamp = r13
            r0.debug3dClearMagenta = r14
            r0.retroArchShader = r15
            return
    }

    private final int component5() {
            r0 = this;
            int r0 = r0.internalResolutionScaling
            return r0
    }

    public static /* synthetic */ me.magnum.melonds.domain.model.RendererConfiguration copy$default(me.magnum.melonds.domain.model.RendererConfiguration r16, me.magnum.melonds.domain.model.VideoRenderer r17, me.magnum.melonds.domain.model.VideoFiltering r18, boolean r19, me.magnum.melonds.domain.model.VulkanPipelineProfile r20, int r21, boolean r22, boolean r23, boolean r24, boolean r25, float r26, float r27, boolean r28, boolean r29, boolean r30, defpackage.po5 r31, int r32, java.lang.Object r33) {
            r0 = r16
            r1 = r32
            r2 = r1 & 1
            if (r2 == 0) goto Lb
            me.magnum.melonds.domain.model.VideoRenderer r2 = r0.renderer
            goto Ld
        Lb:
            r2 = r17
        Ld:
            r3 = r1 & 2
            if (r3 == 0) goto L14
            me.magnum.melonds.domain.model.VideoFiltering r3 = r0.videoFiltering
            goto L16
        L14:
            r3 = r18
        L16:
            r4 = r1 & 4
            if (r4 == 0) goto L1d
            boolean r4 = r0.threadedRendering
            goto L1f
        L1d:
            r4 = r19
        L1f:
            r5 = r1 & 8
            if (r5 == 0) goto L26
            me.magnum.melonds.domain.model.VulkanPipelineProfile r5 = r0.vulkanPipelineProfile
            goto L28
        L26:
            r5 = r20
        L28:
            r6 = r1 & 16
            if (r6 == 0) goto L2f
            int r6 = r0.internalResolutionScaling
            goto L31
        L2f:
            r6 = r21
        L31:
            r7 = r1 & 32
            if (r7 == 0) goto L38
            boolean r7 = r0.rendererDebugToolsEnabled
            goto L3a
        L38:
            r7 = r22
        L3a:
            r8 = r1 & 64
            if (r8 == 0) goto L41
            boolean r8 = r0.rendererDebugBgObjEnabled
            goto L43
        L41:
            r8 = r23
        L43:
            r9 = r1 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L4a
            boolean r9 = r0.rendererDebugLatchTraceEnabled
            goto L4c
        L4a:
            r9 = r24
        L4c:
            r10 = r1 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L53
            boolean r10 = r0.conservativeCoverageEnabled
            goto L55
        L53:
            r10 = r25
        L55:
            r11 = r1 & 512(0x200, float:7.17E-43)
            if (r11 == 0) goto L5c
            float r11 = r0.conservativeCoveragePx
            goto L5e
        L5c:
            r11 = r26
        L5e:
            r12 = r1 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L65
            float r12 = r0.conservativeCoverageDepthBias
            goto L67
        L65:
            r12 = r27
        L67:
            r13 = r1 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L6e
            boolean r13 = r0.conservativeCoverageApplyRepeat
            goto L70
        L6e:
            r13 = r28
        L70:
            r14 = r1 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L77
            boolean r14 = r0.conservativeCoverageApplyClamp
            goto L79
        L77:
            r14 = r29
        L79:
            r15 = r1 & 8192(0x2000, float:1.148E-41)
            if (r15 == 0) goto L80
            boolean r15 = r0.debug3dClearMagenta
            goto L82
        L80:
            r15 = r30
        L82:
            r1 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto La9
            po5 r1 = r0.retroArchShader
            r32 = r1
        L8a:
            r17 = r0
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r13
            r30 = r14
            r31 = r15
            goto Lac
        La9:
            r32 = r31
            goto L8a
        Lac:
            me.magnum.melonds.domain.model.RendererConfiguration r0 = r17.copy(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r0
    }

    public final me.magnum.melonds.domain.model.VideoRenderer component1() {
            r0 = this;
            me.magnum.melonds.domain.model.VideoRenderer r0 = r0.renderer
            return r0
    }

    public final float component10() {
            r0 = this;
            float r0 = r0.conservativeCoveragePx
            return r0
    }

    public final float component11() {
            r0 = this;
            float r0 = r0.conservativeCoverageDepthBias
            return r0
    }

    public final boolean component12() {
            r0 = this;
            boolean r0 = r0.conservativeCoverageApplyRepeat
            return r0
    }

    public final boolean component13() {
            r0 = this;
            boolean r0 = r0.conservativeCoverageApplyClamp
            return r0
    }

    public final boolean component14() {
            r0 = this;
            boolean r0 = r0.debug3dClearMagenta
            return r0
    }

    public final defpackage.po5 component15() {
            r0 = this;
            po5 r0 = r0.retroArchShader
            return r0
    }

    public final me.magnum.melonds.domain.model.VideoFiltering component2() {
            r0 = this;
            me.magnum.melonds.domain.model.VideoFiltering r0 = r0.videoFiltering
            return r0
    }

    public final boolean component3() {
            r0 = this;
            boolean r0 = r0.threadedRendering
            return r0
    }

    public final me.magnum.melonds.domain.model.VulkanPipelineProfile component4() {
            r0 = this;
            me.magnum.melonds.domain.model.VulkanPipelineProfile r0 = r0.vulkanPipelineProfile
            return r0
    }

    public final boolean component6() {
            r0 = this;
            boolean r0 = r0.rendererDebugToolsEnabled
            return r0
    }

    public final boolean component7() {
            r0 = this;
            boolean r0 = r0.rendererDebugBgObjEnabled
            return r0
    }

    public final boolean component8() {
            r0 = this;
            boolean r0 = r0.rendererDebugLatchTraceEnabled
            return r0
    }

    public final boolean component9() {
            r0 = this;
            boolean r0 = r0.conservativeCoverageEnabled
            return r0
    }

    public final me.magnum.melonds.domain.model.RendererConfiguration copy(me.magnum.melonds.domain.model.VideoRenderer r17, me.magnum.melonds.domain.model.VideoFiltering r18, boolean r19, me.magnum.melonds.domain.model.VulkanPipelineProfile r20, int r21, boolean r22, boolean r23, boolean r24, boolean r25, float r26, float r27, boolean r28, boolean r29, boolean r30, defpackage.po5 r31) {
            r16 = this;
            r17.getClass()
            r18.getClass()
            r20.getClass()
            r31.getClass()
            me.magnum.melonds.domain.model.RendererConfiguration r0 = new me.magnum.melonds.domain.model.RendererConfiguration
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof me.magnum.melonds.domain.model.RendererConfiguration
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            me.magnum.melonds.domain.model.RendererConfiguration r5 = (me.magnum.melonds.domain.model.RendererConfiguration) r5
            me.magnum.melonds.domain.model.VideoRenderer r1 = r4.renderer
            me.magnum.melonds.domain.model.VideoRenderer r3 = r5.renderer
            if (r1 == r3) goto L13
            return r2
        L13:
            me.magnum.melonds.domain.model.VideoFiltering r1 = r4.videoFiltering
            me.magnum.melonds.domain.model.VideoFiltering r3 = r5.videoFiltering
            if (r1 == r3) goto L1a
            return r2
        L1a:
            boolean r1 = r4.threadedRendering
            boolean r3 = r5.threadedRendering
            if (r1 == r3) goto L21
            return r2
        L21:
            me.magnum.melonds.domain.model.VulkanPipelineProfile r1 = r4.vulkanPipelineProfile
            me.magnum.melonds.domain.model.VulkanPipelineProfile r3 = r5.vulkanPipelineProfile
            if (r1 == r3) goto L28
            return r2
        L28:
            int r1 = r4.internalResolutionScaling
            int r3 = r5.internalResolutionScaling
            if (r1 == r3) goto L2f
            return r2
        L2f:
            boolean r1 = r4.rendererDebugToolsEnabled
            boolean r3 = r5.rendererDebugToolsEnabled
            if (r1 == r3) goto L36
            return r2
        L36:
            boolean r1 = r4.rendererDebugBgObjEnabled
            boolean r3 = r5.rendererDebugBgObjEnabled
            if (r1 == r3) goto L3d
            return r2
        L3d:
            boolean r1 = r4.rendererDebugLatchTraceEnabled
            boolean r3 = r5.rendererDebugLatchTraceEnabled
            if (r1 == r3) goto L44
            return r2
        L44:
            boolean r1 = r4.conservativeCoverageEnabled
            boolean r3 = r5.conservativeCoverageEnabled
            if (r1 == r3) goto L4b
            return r2
        L4b:
            float r1 = r4.conservativeCoveragePx
            float r3 = r5.conservativeCoveragePx
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L56
            return r2
        L56:
            float r1 = r4.conservativeCoverageDepthBias
            float r3 = r5.conservativeCoverageDepthBias
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L61
            return r2
        L61:
            boolean r1 = r4.conservativeCoverageApplyRepeat
            boolean r3 = r5.conservativeCoverageApplyRepeat
            if (r1 == r3) goto L68
            return r2
        L68:
            boolean r1 = r4.conservativeCoverageApplyClamp
            boolean r3 = r5.conservativeCoverageApplyClamp
            if (r1 == r3) goto L6f
            return r2
        L6f:
            boolean r1 = r4.debug3dClearMagenta
            boolean r3 = r5.debug3dClearMagenta
            if (r1 == r3) goto L76
            return r2
        L76:
            po5 r4 = r4.retroArchShader
            po5 r5 = r5.retroArchShader
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L81
            return r2
        L81:
            return r0
    }

    public final boolean getConservativeCoverageApplyClamp() {
            r0 = this;
            boolean r0 = r0.conservativeCoverageApplyClamp
            return r0
    }

    public final boolean getConservativeCoverageApplyRepeat() {
            r0 = this;
            boolean r0 = r0.conservativeCoverageApplyRepeat
            return r0
    }

    public final float getConservativeCoverageDepthBias() {
            r0 = this;
            float r0 = r0.conservativeCoverageDepthBias
            return r0
    }

    public final boolean getConservativeCoverageEnabled() {
            r0 = this;
            boolean r0 = r0.conservativeCoverageEnabled
            return r0
    }

    public final float getConservativeCoveragePx() {
            r0 = this;
            float r0 = r0.conservativeCoveragePx
            return r0
    }

    public final boolean getDebug3dClearMagenta() {
            r0 = this;
            boolean r0 = r0.debug3dClearMagenta
            return r0
    }

    public final me.magnum.melonds.domain.model.VideoRenderer getRenderer() {
            r0 = this;
            me.magnum.melonds.domain.model.VideoRenderer r0 = r0.renderer
            return r0
    }

    public final boolean getRendererDebugBgObjEnabled() {
            r0 = this;
            boolean r0 = r0.rendererDebugBgObjEnabled
            return r0
    }

    public final boolean getRendererDebugLatchTraceEnabled() {
            r0 = this;
            boolean r0 = r0.rendererDebugLatchTraceEnabled
            return r0
    }

    public final boolean getRendererDebugToolsEnabled() {
            r0 = this;
            boolean r0 = r0.rendererDebugToolsEnabled
            return r0
    }

    public final int getResolutionScaling() {
            r2 = this;
            me.magnum.melonds.domain.model.VideoRenderer r0 = r2.renderer
            int[] r1 = defpackage.sj5.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L24
            r1 = 2
            if (r0 == r1) goto L21
            r1 = 3
            if (r0 == r1) goto L1e
            r1 = 4
            if (r0 != r1) goto L19
            int r2 = r2.internalResolutionScaling
            return r2
        L19:
            defpackage.i.d()
            r2 = 0
            return r2
        L1e:
            int r2 = r2.internalResolutionScaling
            return r2
        L21:
            int r2 = r2.internalResolutionScaling
            return r2
        L24:
            return r1
    }

    public final defpackage.po5 getRetroArchShader() {
            r0 = this;
            po5 r0 = r0.retroArchShader
            return r0
    }

    public final boolean getThreadedRendering() {
            r0 = this;
            boolean r0 = r0.threadedRendering
            return r0
    }

    public final me.magnum.melonds.domain.model.VideoFiltering getVideoFiltering() {
            r0 = this;
            me.magnum.melonds.domain.model.VideoFiltering r0 = r0.videoFiltering
            return r0
    }

    public final me.magnum.melonds.domain.model.VulkanPipelineProfile getVulkanPipelineProfile() {
            r0 = this;
            me.magnum.melonds.domain.model.VulkanPipelineProfile r0 = r0.vulkanPipelineProfile
            return r0
    }

    public int hashCode() {
            r3 = this;
            me.magnum.melonds.domain.model.VideoRenderer r0 = r3.renderer
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            me.magnum.melonds.domain.model.VideoFiltering r2 = r3.videoFiltering
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.threadedRendering
            int r0 = defpackage.xg6.e(r2, r0, r1)
            me.magnum.melonds.domain.model.VulkanPipelineProfile r2 = r3.vulkanPipelineProfile
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = r3.internalResolutionScaling
            int r0 = defpackage.lb1.a(r0, r2, r1)
            boolean r2 = r3.rendererDebugToolsEnabled
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r3.rendererDebugBgObjEnabled
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r3.rendererDebugLatchTraceEnabled
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r3.conservativeCoverageEnabled
            int r0 = defpackage.xg6.e(r0, r2, r1)
            float r2 = r3.conservativeCoveragePx
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r2 = r3.conservativeCoverageDepthBias
            int r0 = defpackage.xg6.a(r2, r0, r1)
            boolean r2 = r3.conservativeCoverageApplyRepeat
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r3.conservativeCoverageApplyClamp
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r3.debug3dClearMagenta
            int r0 = defpackage.xg6.e(r0, r2, r1)
            po5 r3 = r3.retroArchShader
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public java.lang.String toString() {
            r16 = this;
            r0 = r16
            me.magnum.melonds.domain.model.VideoRenderer r1 = r0.renderer
            me.magnum.melonds.domain.model.VideoFiltering r2 = r0.videoFiltering
            boolean r3 = r0.threadedRendering
            me.magnum.melonds.domain.model.VulkanPipelineProfile r4 = r0.vulkanPipelineProfile
            int r5 = r0.internalResolutionScaling
            boolean r6 = r0.rendererDebugToolsEnabled
            boolean r7 = r0.rendererDebugBgObjEnabled
            boolean r8 = r0.rendererDebugLatchTraceEnabled
            boolean r9 = r0.conservativeCoverageEnabled
            float r10 = r0.conservativeCoveragePx
            float r11 = r0.conservativeCoverageDepthBias
            boolean r12 = r0.conservativeCoverageApplyRepeat
            boolean r13 = r0.conservativeCoverageApplyClamp
            boolean r14 = r0.debug3dClearMagenta
            po5 r0 = r0.retroArchShader
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r16 = r0
            java.lang.String r0 = "RendererConfiguration(renderer="
            r15.<init>(r0)
            r15.append(r1)
            java.lang.String r0 = ", videoFiltering="
            r15.append(r0)
            r15.append(r2)
            java.lang.String r0 = ", threadedRendering="
            r15.append(r0)
            r15.append(r3)
            java.lang.String r0 = ", vulkanPipelineProfile="
            r15.append(r0)
            r15.append(r4)
            java.lang.String r0 = ", internalResolutionScaling="
            r15.append(r0)
            r15.append(r5)
            java.lang.String r0 = ", rendererDebugToolsEnabled="
            r15.append(r0)
            r15.append(r6)
            java.lang.String r0 = ", rendererDebugBgObjEnabled="
            r15.append(r0)
            r15.append(r7)
            java.lang.String r0 = ", rendererDebugLatchTraceEnabled="
            r15.append(r0)
            r15.append(r8)
            java.lang.String r0 = ", conservativeCoverageEnabled="
            r15.append(r0)
            r15.append(r9)
            java.lang.String r0 = ", conservativeCoveragePx="
            r15.append(r0)
            r15.append(r10)
            java.lang.String r0 = ", conservativeCoverageDepthBias="
            r15.append(r0)
            r15.append(r11)
            java.lang.String r0 = ", conservativeCoverageApplyRepeat="
            r15.append(r0)
            r15.append(r12)
            java.lang.String r0 = ", conservativeCoverageApplyClamp="
            r15.append(r0)
            r15.append(r13)
            java.lang.String r0 = ", debug3dClearMagenta="
            r15.append(r0)
            r15.append(r14)
            java.lang.String r0 = ", retroArchShader="
            r15.append(r0)
            r0 = r16
            r15.append(r0)
            java.lang.String r0 = ")"
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            return r0
    }
}
