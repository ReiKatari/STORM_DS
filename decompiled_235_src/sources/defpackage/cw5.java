package defpackage;

import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cw5  reason: default package */
/* loaded from: classes.dex */
public final class cw5 {
    public final VideoRenderer a;
    public final boolean b;
    public final int c;
    public final VideoFiltering d;

    public cw5(VideoRenderer videoRenderer, boolean z, int i, VideoFiltering videoFiltering) {
        videoRenderer.getClass();
        videoFiltering.getClass();
        this.a = videoRenderer;
        this.b = z;
        this.c = i;
        this.d = videoFiltering;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cw5) {
            cw5 cw5Var = (cw5) obj;
            if (this.a == cw5Var.a && this.b == cw5Var.b && this.c == cw5Var.c && this.d == cw5Var.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int a = lb1.a(this.c, xg6.e(this.a.hashCode() * 31, this.b, 31), 31);
        return Boolean.hashCode(false) + ((this.d.hashCode() + a) * 29791);
    }

    public final String toString() {
        return "GlobalVideoConfig(renderer=" + this.a + ", threadedRendering=" + this.b + ", internalResolutionScaling=" + this.c + ", filtering=" + this.d + ", retroArchShaderPresetPath=null, retroArchShaderParameters=null, hasValidRetroArchShaderRoot=false)";
    }
}
