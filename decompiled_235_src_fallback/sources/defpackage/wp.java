package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wp  reason: default package */
/* loaded from: classes.dex */
public final class wp extends android.text.SegmentFinder {
    public final /* synthetic */ defpackage.rr6 a;

    public wp(defpackage.rr6 r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    public final int nextEndBoundary(int r1) {
            r0 = this;
            rr6 r0 = r0.a
            int r0 = r0.d(r1)
            return r0
    }

    public final int nextStartBoundary(int r1) {
            r0 = this;
            rr6 r0 = r0.a
            int r0 = r0.a(r1)
            return r0
    }

    public final int previousEndBoundary(int r1) {
            r0 = this;
            rr6 r0 = r0.a
            int r0 = r0.b(r1)
            return r0
    }

    public final int previousStartBoundary(int r1) {
            r0 = this;
            rr6 r0 = r0.a
            int r0 = r0.c(r1)
            return r0
    }
}
