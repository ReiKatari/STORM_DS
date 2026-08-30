package defpackage;

import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vu6  reason: default package */
/* loaded from: classes.dex */
public final class vu6 extends gv6 {
    public final VideoRenderer a;

    public vu6(VideoRenderer videoRenderer) {
        videoRenderer.getClass();
        this.a = videoRenderer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof vu6) && this.a == ((vu6) obj).a) {
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
