package defpackage;

import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fw1  reason: default package */
/* loaded from: classes.dex */
public final class fw1 extends lw1 {
    public final VideoRenderer a;

    public fw1(VideoRenderer videoRenderer) {
        this.a = videoRenderer;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof fw1) || this.a != ((fw1) obj).a) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RendererInitFailed(renderer=" + this.a + ")";
    }
}
