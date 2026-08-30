package defpackage;

import android.text.SegmentFinder;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kp  reason: default package */
/* loaded from: classes.dex */
public final class kp extends SegmentFinder {
    public final /* synthetic */ wv6 a;

    public kp(wv6 wv6Var) {
        this.a = wv6Var;
    }

    public final int nextEndBoundary(int i) {
        return this.a.b(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.c(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.d(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.a(i);
    }
}
