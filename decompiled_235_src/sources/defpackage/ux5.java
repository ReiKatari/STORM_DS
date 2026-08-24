package defpackage;

import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ux5  reason: default package */
/* loaded from: classes.dex */
public final class ux5 extends wx5 {
    public final VideoRenderer a;

    public ux5(VideoRenderer videoRenderer) {
        videoRenderer.getClass();
        this.a = videoRenderer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ux5) && this.a == ((ux5) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RendererUnsupported(renderer=" + this.a + ")";
    }
}
