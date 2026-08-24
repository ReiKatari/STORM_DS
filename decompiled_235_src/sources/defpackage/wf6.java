package defpackage;

import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.domain.model.VulkanPipelineProfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wf6  reason: default package */
/* loaded from: classes.dex */
public final class wf6 {
    public final VideoRenderer a;
    public final VideoFiltering b;
    public final boolean c;
    public final int d;
    public final VulkanPipelineProfile e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public wf6(VideoRenderer videoRenderer, VideoFiltering videoFiltering, boolean z, int i, VulkanPipelineProfile vulkanPipelineProfile, boolean z2, boolean z3, boolean z4) {
        videoRenderer.getClass();
        videoFiltering.getClass();
        vulkanPipelineProfile.getClass();
        this.a = videoRenderer;
        this.b = videoFiltering;
        this.c = z;
        this.d = i;
        this.e = vulkanPipelineProfile;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    public static wf6 a(wf6 wf6Var, boolean z, boolean z2, boolean z3, int i) {
        VideoRenderer videoRenderer = wf6Var.a;
        VideoFiltering videoFiltering = wf6Var.b;
        boolean z4 = wf6Var.c;
        int i2 = wf6Var.d;
        VulkanPipelineProfile vulkanPipelineProfile = wf6Var.e;
        if ((i & 32) != 0) {
            z = wf6Var.f;
        }
        boolean z5 = z;
        if ((i & 64) != 0) {
            z2 = wf6Var.g;
        }
        boolean z6 = z2;
        if ((i & 128) != 0) {
            z3 = wf6Var.h;
        }
        wf6Var.getClass();
        videoRenderer.getClass();
        videoFiltering.getClass();
        vulkanPipelineProfile.getClass();
        return new wf6(videoRenderer, videoFiltering, z4, i2, vulkanPipelineProfile, z5, z6, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf6)) {
            return false;
        }
        wf6 wf6Var = (wf6) obj;
        if (this.a == wf6Var.a && this.b == wf6Var.b && this.c == wf6Var.c && this.d == wf6Var.d && this.e == wf6Var.e && this.f == wf6Var.f && this.g == wf6Var.g && this.h == wf6Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + xg6.e(xg6.e((this.e.hashCode() + lb1.a(this.d, xg6.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), 31)) * 31, this.f, 31), this.g, 31);
    }

    public final String toString() {
        return "CoreRenderConfigurationInputs(renderer=" + this.a + ", filtering=" + this.b + ", threadedRenderingEnabled=" + this.c + ", resolutionScaling=" + this.d + ", vulkanPipelineProfile=" + this.e + ", rendererDebugToolsEnabled=" + this.f + ", rendererDebugBgObjEnabled=" + this.g + ", rendererDebugLatchTraceEnabled=" + this.h + ")";
    }
}
