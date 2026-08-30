package defpackage;

import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: js5  reason: default package */
/* loaded from: classes.dex */
public final class js5 {
    public final VideoRenderer a;
    public final VideoFiltering b;
    public final int c;
    public final ue5 d;

    public js5(VideoRenderer videoRenderer, VideoFiltering videoFiltering, int i, ue5 ue5Var) {
        videoRenderer.getClass();
        videoFiltering.getClass();
        ue5Var.getClass();
        this.a = videoRenderer;
        this.b = videoFiltering;
        this.c = i;
        this.d = ue5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js5)) {
            return false;
        }
        js5 js5Var = (js5) obj;
        if (this.a == js5Var.a && this.b == js5Var.b && this.c == js5Var.c && b53.x(this.d, js5Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.d.hashCode() + wh1.a(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "RuntimeRendererConfiguration(renderer=" + this.a + ", videoFiltering=" + this.b + ", resolutionScaling=" + this.c + ", retroArchShader=" + this.d + ")";
    }
}
