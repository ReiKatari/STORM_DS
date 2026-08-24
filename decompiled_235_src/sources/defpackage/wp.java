package defpackage;

import android.text.SegmentFinder;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wp  reason: default package */
/* loaded from: classes.dex */
public final class wp extends SegmentFinder {
    public final /* synthetic */ rr6 a;

    public wp(rr6 rr6Var) {
        this.a = rr6Var;
    }

    public final int nextEndBoundary(int i) {
        return this.a.d(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.a(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.b(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.c(i);
    }
}
