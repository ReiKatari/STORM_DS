package defpackage;

import me.magnum.melonds.domain.model.VideoFiltering;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ru5  reason: default package */
/* loaded from: classes.dex */
public final class ru5 extends tu5 {
    public final VideoFiltering a;

    public ru5(VideoFiltering videoFiltering) {
        this.a = videoFiltering;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ru5) && this.a == ((ru5) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        VideoFiltering videoFiltering = this.a;
        if (videoFiltering == null) {
            return 0;
        }
        return videoFiltering.hashCode();
    }

    public final String toString() {
        return "VideoFilteringUpdate(videoFiltering=" + this.a + ")";
    }
}
