package defpackage;

import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ck5  reason: default package */
/* loaded from: classes.dex */
public final class ck5 extends dk5 {
    public final VideoRenderer a;

    public ck5(VideoRenderer videoRenderer) {
        this.a = videoRenderer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ck5) && this.a == ((ck5) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        VideoRenderer videoRenderer = this.a;
        if (videoRenderer == null) {
            return 0;
        }
        return videoRenderer.hashCode();
    }

    public final String toString() {
        return "VideoRendererUpdate(videoRenderer=" + this.a + ")";
    }
}
