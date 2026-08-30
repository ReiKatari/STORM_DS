package defpackage;

import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tr1  reason: default package */
/* loaded from: classes.dex */
public final class tr1 extends zr1 {
    public final VideoRenderer a;

    public tr1(VideoRenderer videoRenderer) {
        this.a = videoRenderer;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof tr1) || this.a != ((tr1) obj).a) {
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
