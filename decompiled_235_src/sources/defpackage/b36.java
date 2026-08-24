package defpackage;

import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b36  reason: default package */
/* loaded from: classes.dex */
public final class b36 {
    public final VideoRenderer a;
    public final VideoFiltering b;
    public final int c;
    public final po5 d;

    public b36(VideoRenderer videoRenderer, VideoFiltering videoFiltering, int i, po5 po5Var) {
        videoRenderer.getClass();
        videoFiltering.getClass();
        po5Var.getClass();
        this.a = videoRenderer;
        this.b = videoFiltering;
        this.c = i;
        this.d = po5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b36)) {
            return false;
        }
        b36 b36Var = (b36) obj;
        if (this.a == b36Var.a && this.b == b36Var.b && this.c == b36Var.c && nb3.k(this.d, b36Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.d.hashCode() + lb1.a(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "RuntimeRendererConfiguration(renderer=" + this.a + ", videoFiltering=" + this.b + ", resolutionScaling=" + this.c + ", retroArchShader=" + this.d + ")";
    }
}
