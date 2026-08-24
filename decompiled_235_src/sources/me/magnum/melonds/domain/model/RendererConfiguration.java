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
    private final VideoRenderer renderer;
    private final boolean rendererDebugBgObjEnabled;
    private final boolean rendererDebugLatchTraceEnabled;
    private final boolean rendererDebugToolsEnabled;
    private final po5 retroArchShader;
    private final boolean threadedRendering;
    private final VideoFiltering videoFiltering;
    private final VulkanPipelineProfile vulkanPipelineProfile;

    public RendererConfiguration(VideoRenderer videoRenderer, VideoFiltering videoFiltering, boolean z, VulkanPipelineProfile vulkanPipelineProfile, int i, boolean z2, boolean z3, boolean z4, boolean z5, float f, float f2, boolean z6, boolean z7, boolean z8, po5 po5Var) {
        videoRenderer.getClass();
        videoFiltering.getClass();
        vulkanPipelineProfile.getClass();
        po5Var.getClass();
        this.renderer = videoRenderer;
        this.videoFiltering = videoFiltering;
        this.threadedRendering = z;
        this.vulkanPipelineProfile = vulkanPipelineProfile;
        this.internalResolutionScaling = i;
        this.rendererDebugToolsEnabled = z2;
        this.rendererDebugBgObjEnabled = z3;
        this.rendererDebugLatchTraceEnabled = z4;
        this.conservativeCoverageEnabled = z5;
        this.conservativeCoveragePx = f;
        this.conservativeCoverageDepthBias = f2;
        this.conservativeCoverageApplyRepeat = z6;
        this.conservativeCoverageApplyClamp = z7;
        this.debug3dClearMagenta = z8;
        this.retroArchShader = po5Var;
    }

    private final int component5() {
        return this.internalResolutionScaling;
    }

    public static /* synthetic */ RendererConfiguration copy$default(RendererConfiguration rendererConfiguration, VideoRenderer videoRenderer, VideoFiltering videoFiltering, boolean z, VulkanPipelineProfile vulkanPipelineProfile, int i, boolean z2, boolean z3, boolean z4, boolean z5, float f, float f2, boolean z6, boolean z7, boolean z8, po5 po5Var, int i2, Object obj) {
        VideoRenderer videoRenderer2;
        VideoFiltering videoFiltering2;
        boolean z9;
        VulkanPipelineProfile vulkanPipelineProfile2;
        int i3;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f3;
        float f4;
        boolean z14;
        boolean z15;
        boolean z16;
        po5 po5Var2;
        if ((i2 & 1) != 0) {
            videoRenderer2 = rendererConfiguration.renderer;
        } else {
            videoRenderer2 = videoRenderer;
        }
        if ((i2 & 2) != 0) {
            videoFiltering2 = rendererConfiguration.videoFiltering;
        } else {
            videoFiltering2 = videoFiltering;
        }
        if ((i2 & 4) != 0) {
            z9 = rendererConfiguration.threadedRendering;
        } else {
            z9 = z;
        }
        if ((i2 & 8) != 0) {
            vulkanPipelineProfile2 = rendererConfiguration.vulkanPipelineProfile;
        } else {
            vulkanPipelineProfile2 = vulkanPipelineProfile;
        }
        if ((i2 & 16) != 0) {
            i3 = rendererConfiguration.internalResolutionScaling;
        } else {
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            z10 = rendererConfiguration.rendererDebugToolsEnabled;
        } else {
            z10 = z2;
        }
        if ((i2 & 64) != 0) {
            z11 = rendererConfiguration.rendererDebugBgObjEnabled;
        } else {
            z11 = z3;
        }
        if ((i2 & 128) != 0) {
            z12 = rendererConfiguration.rendererDebugLatchTraceEnabled;
        } else {
            z12 = z4;
        }
        if ((i2 & 256) != 0) {
            z13 = rendererConfiguration.conservativeCoverageEnabled;
        } else {
            z13 = z5;
        }
        if ((i2 & 512) != 0) {
            f3 = rendererConfiguration.conservativeCoveragePx;
        } else {
            f3 = f;
        }
        if ((i2 & 1024) != 0) {
            f4 = rendererConfiguration.conservativeCoverageDepthBias;
        } else {
            f4 = f2;
        }
        if ((i2 & 2048) != 0) {
            z14 = rendererConfiguration.conservativeCoverageApplyRepeat;
        } else {
            z14 = z6;
        }
        if ((i2 & 4096) != 0) {
            z15 = rendererConfiguration.conservativeCoverageApplyClamp;
        } else {
            z15 = z7;
        }
        if ((i2 & 8192) != 0) {
            z16 = rendererConfiguration.debug3dClearMagenta;
        } else {
            z16 = z8;
        }
        if ((i2 & 16384) != 0) {
            po5Var2 = rendererConfiguration.retroArchShader;
        } else {
            po5Var2 = po5Var;
        }
        return rendererConfiguration.copy(videoRenderer2, videoFiltering2, z9, vulkanPipelineProfile2, i3, z10, z11, z12, z13, f3, f4, z14, z15, z16, po5Var2);
    }

    public final VideoRenderer component1() {
        return this.renderer;
    }

    public final float component10() {
        return this.conservativeCoveragePx;
    }

    public final float component11() {
        return this.conservativeCoverageDepthBias;
    }

    public final boolean component12() {
        return this.conservativeCoverageApplyRepeat;
    }

    public final boolean component13() {
        return this.conservativeCoverageApplyClamp;
    }

    public final boolean component14() {
        return this.debug3dClearMagenta;
    }

    public final po5 component15() {
        return this.retroArchShader;
    }

    public final VideoFiltering component2() {
        return this.videoFiltering;
    }

    public final boolean component3() {
        return this.threadedRendering;
    }

    public final VulkanPipelineProfile component4() {
        return this.vulkanPipelineProfile;
    }

    public final boolean component6() {
        return this.rendererDebugToolsEnabled;
    }

    public final boolean component7() {
        return this.rendererDebugBgObjEnabled;
    }

    public final boolean component8() {
        return this.rendererDebugLatchTraceEnabled;
    }

    public final boolean component9() {
        return this.conservativeCoverageEnabled;
    }

    public final RendererConfiguration copy(VideoRenderer videoRenderer, VideoFiltering videoFiltering, boolean z, VulkanPipelineProfile vulkanPipelineProfile, int i, boolean z2, boolean z3, boolean z4, boolean z5, float f, float f2, boolean z6, boolean z7, boolean z8, po5 po5Var) {
        videoRenderer.getClass();
        videoFiltering.getClass();
        vulkanPipelineProfile.getClass();
        po5Var.getClass();
        return new RendererConfiguration(videoRenderer, videoFiltering, z, vulkanPipelineProfile, i, z2, z3, z4, z5, f, f2, z6, z7, z8, po5Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RendererConfiguration)) {
            return false;
        }
        RendererConfiguration rendererConfiguration = (RendererConfiguration) obj;
        if (this.renderer == rendererConfiguration.renderer && this.videoFiltering == rendererConfiguration.videoFiltering && this.threadedRendering == rendererConfiguration.threadedRendering && this.vulkanPipelineProfile == rendererConfiguration.vulkanPipelineProfile && this.internalResolutionScaling == rendererConfiguration.internalResolutionScaling && this.rendererDebugToolsEnabled == rendererConfiguration.rendererDebugToolsEnabled && this.rendererDebugBgObjEnabled == rendererConfiguration.rendererDebugBgObjEnabled && this.rendererDebugLatchTraceEnabled == rendererConfiguration.rendererDebugLatchTraceEnabled && this.conservativeCoverageEnabled == rendererConfiguration.conservativeCoverageEnabled && Float.compare(this.conservativeCoveragePx, rendererConfiguration.conservativeCoveragePx) == 0 && Float.compare(this.conservativeCoverageDepthBias, rendererConfiguration.conservativeCoverageDepthBias) == 0 && this.conservativeCoverageApplyRepeat == rendererConfiguration.conservativeCoverageApplyRepeat && this.conservativeCoverageApplyClamp == rendererConfiguration.conservativeCoverageApplyClamp && this.debug3dClearMagenta == rendererConfiguration.debug3dClearMagenta && nb3.k(this.retroArchShader, rendererConfiguration.retroArchShader)) {
            return true;
        }
        return false;
    }

    public final boolean getConservativeCoverageApplyClamp() {
        return this.conservativeCoverageApplyClamp;
    }

    public final boolean getConservativeCoverageApplyRepeat() {
        return this.conservativeCoverageApplyRepeat;
    }

    public final float getConservativeCoverageDepthBias() {
        return this.conservativeCoverageDepthBias;
    }

    public final boolean getConservativeCoverageEnabled() {
        return this.conservativeCoverageEnabled;
    }

    public final float getConservativeCoveragePx() {
        return this.conservativeCoveragePx;
    }

    public final boolean getDebug3dClearMagenta() {
        return this.debug3dClearMagenta;
    }

    public final VideoRenderer getRenderer() {
        return this.renderer;
    }

    public final boolean getRendererDebugBgObjEnabled() {
        return this.rendererDebugBgObjEnabled;
    }

    public final boolean getRendererDebugLatchTraceEnabled() {
        return this.rendererDebugLatchTraceEnabled;
    }

    public final boolean getRendererDebugToolsEnabled() {
        return this.rendererDebugToolsEnabled;
    }

    public final int getResolutionScaling() {
        int i = sj5.a[this.renderer.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    return this.internalResolutionScaling;
                }
                i.d();
                return 0;
            }
            return this.internalResolutionScaling;
        }
        return this.internalResolutionScaling;
    }

    public final po5 getRetroArchShader() {
        return this.retroArchShader;
    }

    public final boolean getThreadedRendering() {
        return this.threadedRendering;
    }

    public final VideoFiltering getVideoFiltering() {
        return this.videoFiltering;
    }

    public final VulkanPipelineProfile getVulkanPipelineProfile() {
        return this.vulkanPipelineProfile;
    }

    public int hashCode() {
        int e = xg6.e((this.videoFiltering.hashCode() + (this.renderer.hashCode() * 31)) * 31, this.threadedRendering, 31);
        return this.retroArchShader.hashCode() + xg6.e(xg6.e(xg6.e(xg6.a(this.conservativeCoverageDepthBias, xg6.a(this.conservativeCoveragePx, xg6.e(xg6.e(xg6.e(xg6.e(lb1.a(this.internalResolutionScaling, (this.vulkanPipelineProfile.hashCode() + e) * 31, 31), this.rendererDebugToolsEnabled, 31), this.rendererDebugBgObjEnabled, 31), this.rendererDebugLatchTraceEnabled, 31), this.conservativeCoverageEnabled, 31), 31), 31), this.conservativeCoverageApplyRepeat, 31), this.conservativeCoverageApplyClamp, 31), this.debug3dClearMagenta, 31);
    }

    public String toString() {
        VideoRenderer videoRenderer = this.renderer;
        VideoFiltering videoFiltering = this.videoFiltering;
        boolean z = this.threadedRendering;
        VulkanPipelineProfile vulkanPipelineProfile = this.vulkanPipelineProfile;
        int i = this.internalResolutionScaling;
        boolean z2 = this.rendererDebugToolsEnabled;
        boolean z3 = this.rendererDebugBgObjEnabled;
        boolean z4 = this.rendererDebugLatchTraceEnabled;
        boolean z5 = this.conservativeCoverageEnabled;
        float f = this.conservativeCoveragePx;
        float f2 = this.conservativeCoverageDepthBias;
        boolean z6 = this.conservativeCoverageApplyRepeat;
        boolean z7 = this.conservativeCoverageApplyClamp;
        boolean z8 = this.debug3dClearMagenta;
        po5 po5Var = this.retroArchShader;
        return "RendererConfiguration(renderer=" + videoRenderer + ", videoFiltering=" + videoFiltering + ", threadedRendering=" + z + ", vulkanPipelineProfile=" + vulkanPipelineProfile + ", internalResolutionScaling=" + i + ", rendererDebugToolsEnabled=" + z2 + ", rendererDebugBgObjEnabled=" + z3 + ", rendererDebugLatchTraceEnabled=" + z4 + ", conservativeCoverageEnabled=" + z5 + ", conservativeCoveragePx=" + f + ", conservativeCoverageDepthBias=" + f2 + ", conservativeCoverageApplyRepeat=" + z6 + ", conservativeCoverageApplyClamp=" + z7 + ", debug3dClearMagenta=" + z8 + ", retroArchShader=" + po5Var + ")";
    }
}
