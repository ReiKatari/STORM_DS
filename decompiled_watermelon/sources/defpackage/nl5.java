package defpackage;

import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nl5  reason: default package */
/* loaded from: classes.dex */
public final class nl5 {
    public final VideoRenderer a;
    public final boolean b;
    public final int c;
    public final VideoFiltering d;

    public nl5(VideoRenderer videoRenderer, boolean z, int i, VideoFiltering videoFiltering) {
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
        if (obj instanceof nl5) {
            nl5 nl5Var = (nl5) obj;
            if (this.a == nl5Var.a && this.b == nl5Var.b && this.c == nl5Var.c && this.d == nl5Var.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int a = wh1.a(this.c, ej6.c(this.a.hashCode() * 31, this.b, 31), 31);
        return Boolean.hashCode(false) + ((this.d.hashCode() + a) * 29791);
    }

    public final String toString() {
        return "GlobalVideoConfig(renderer=" + this.a + ", threadedRendering=" + this.b + ", internalResolutionScaling=" + this.c + ", filtering=" + this.d + ", retroArchShaderPresetPath=null, retroArchShaderParameters=null, hasValidRetroArchShaderRoot=false)";
    }
}
