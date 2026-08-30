package n4;

import android.text.SegmentFinder;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends SegmentFinder {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ jb.c f10091a;

    public a(jb.c cVar) {
        this.f10091a = cVar;
    }

    public final int nextEndBoundary(int i2) {
        return this.f10091a.e(i2);
    }

    public final int nextStartBoundary(int i2) {
        return this.f10091a.g(i2);
    }

    public final int previousEndBoundary(int i2) {
        return this.f10091a.h(i2);
    }

    public final int previousStartBoundary(int i2) {
        return this.f10091a.c(i2);
    }
}
