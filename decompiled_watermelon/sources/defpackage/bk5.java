package defpackage;

import me.magnum.melonds.domain.model.VideoFiltering;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bk5  reason: default package */
/* loaded from: classes.dex */
public final class bk5 extends dk5 {
    public final VideoFiltering a;

    public bk5(VideoFiltering videoFiltering) {
        this.a = videoFiltering;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof bk5) && this.a == ((bk5) obj).a) {
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
