package defpackage;

import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vc2  reason: default package */
/* loaded from: classes.dex */
public final class vc2 extends yc2 {
    public final VideoRenderer a;

    public vc2(VideoRenderer videoRenderer) {
        videoRenderer.getClass();
        this.a = videoRenderer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof vc2) && this.a == ((vc2) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RendererInitFailed(renderer=" + this.a + ")";
    }
}
