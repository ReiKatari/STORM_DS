package defpackage;

import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: su5  reason: default package */
/* loaded from: classes.dex */
public final class su5 extends tu5 {
    public final VideoRenderer a;

    public su5(VideoRenderer videoRenderer) {
        this.a = videoRenderer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof su5) && this.a == ((su5) obj).a) {
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
