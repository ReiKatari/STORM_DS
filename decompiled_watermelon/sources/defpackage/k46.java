package defpackage;

import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.domain.model.VulkanPipelineProfile;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k46  reason: default package */
/* loaded from: classes.dex */
public final class k46 {
    public final VideoRenderer a;
    public final VideoFiltering b;
    public final boolean c;
    public final int d;
    public final VulkanPipelineProfile e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public k46(VideoRenderer videoRenderer, VideoFiltering videoFiltering, boolean z, int i, VulkanPipelineProfile vulkanPipelineProfile, boolean z2, boolean z3, boolean z4) {
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

    public static k46 a(k46 k46Var, boolean z, boolean z2, boolean z3, int i) {
        VideoRenderer videoRenderer = k46Var.a;
        VideoFiltering videoFiltering = k46Var.b;
        boolean z4 = k46Var.c;
        int i2 = k46Var.d;
        VulkanPipelineProfile vulkanPipelineProfile = k46Var.e;
        if ((i & 32) != 0) {
            z = k46Var.f;
        }
        boolean z5 = z;
        if ((i & 64) != 0) {
            z2 = k46Var.g;
        }
        boolean z6 = z2;
        if ((i & 128) != 0) {
            z3 = k46Var.h;
        }
        k46Var.getClass();
        videoRenderer.getClass();
        videoFiltering.getClass();
        vulkanPipelineProfile.getClass();
        return new k46(videoRenderer, videoFiltering, z4, i2, vulkanPipelineProfile, z5, z6, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k46)) {
            return false;
        }
        k46 k46Var = (k46) obj;
        if (this.a == k46Var.a && this.b == k46Var.b && this.c == k46Var.c && this.d == k46Var.d && this.e == k46Var.e && this.f == k46Var.f && this.g == k46Var.g && this.h == k46Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ej6.c(ej6.c((this.e.hashCode() + wh1.a(this.d, ej6.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), 31)) * 31, this.f, 31), this.g, 31);
    }

    public final String toString() {
        return "CoreRenderConfigurationInputs(renderer=" + this.a + ", filtering=" + this.b + ", threadedRenderingEnabled=" + this.c + ", resolutionScaling=" + this.d + ", vulkanPipelineProfile=" + this.e + ", rendererDebugToolsEnabled=" + this.f + ", rendererDebugBgObjEnabled=" + this.g + ", rendererDebugLatchTraceEnabled=" + this.h + ")";
    }
}
