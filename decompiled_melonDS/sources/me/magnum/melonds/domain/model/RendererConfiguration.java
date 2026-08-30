package me.magnum.melonds.domain.model;

import m9.o;
import oe.c0;
import oe.u0;
import w.d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class RendererConfiguration {
    public static final int $stable = 0;
    private final int internalResolutionScaling;
    private final VideoRenderer renderer;
    private final boolean threadedRendering;
    private final u0 videoFiltering;

    public RendererConfiguration(VideoRenderer videoRenderer, u0 u0Var, boolean z10, int i2) {
        videoRenderer.getClass();
        u0Var.getClass();
        this.renderer = videoRenderer;
        this.videoFiltering = u0Var;
        this.threadedRendering = z10;
        this.internalResolutionScaling = i2;
    }

    private final int component4() {
        return this.internalResolutionScaling;
    }

    public static /* synthetic */ RendererConfiguration copy$default(RendererConfiguration rendererConfiguration, VideoRenderer videoRenderer, u0 u0Var, boolean z10, int i2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            videoRenderer = rendererConfiguration.renderer;
        }
        if ((i10 & 2) != 0) {
            u0Var = rendererConfiguration.videoFiltering;
        }
        if ((i10 & 4) != 0) {
            z10 = rendererConfiguration.threadedRendering;
        }
        if ((i10 & 8) != 0) {
            i2 = rendererConfiguration.internalResolutionScaling;
        }
        return rendererConfiguration.copy(videoRenderer, u0Var, z10, i2);
    }

    public final VideoRenderer component1() {
        return this.renderer;
    }

    public final u0 component2() {
        return this.videoFiltering;
    }

    public final boolean component3() {
        return this.threadedRendering;
    }

    public final RendererConfiguration copy(VideoRenderer videoRenderer, u0 u0Var, boolean z10, int i2) {
        videoRenderer.getClass();
        u0Var.getClass();
        return new RendererConfiguration(videoRenderer, u0Var, z10, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RendererConfiguration)) {
            return false;
        }
        RendererConfiguration rendererConfiguration = (RendererConfiguration) obj;
        if (this.renderer == rendererConfiguration.renderer && this.videoFiltering == rendererConfiguration.videoFiltering && this.threadedRendering == rendererConfiguration.threadedRendering && this.internalResolutionScaling == rendererConfiguration.internalResolutionScaling) {
            return true;
        }
        return false;
    }

    public final VideoRenderer getRenderer() {
        return this.renderer;
    }

    public final int getResolutionScaling() {
        int i2 = c0.f10919a[this.renderer.ordinal()];
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return this.internalResolutionScaling;
        }
        o.o();
        return 0;
    }

    public final boolean getThreadedRendering() {
        return this.threadedRendering;
    }

    public final u0 getVideoFiltering() {
        return this.videoFiltering;
    }

    public int hashCode() {
        return Integer.hashCode(this.internalResolutionScaling) + d.e((this.videoFiltering.hashCode() + (this.renderer.hashCode() * 31)) * 31, this.threadedRendering, 31);
    }

    public String toString() {
        VideoRenderer videoRenderer = this.renderer;
        u0 u0Var = this.videoFiltering;
        boolean z10 = this.threadedRendering;
        int i2 = this.internalResolutionScaling;
        return "RendererConfiguration(renderer=" + videoRenderer + ", videoFiltering=" + u0Var + ", threadedRendering=" + z10 + ", internalResolutionScaling=" + i2 + ")";
    }
}
