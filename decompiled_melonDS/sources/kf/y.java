package kf;

import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y extends ec.c {
    public Iterator R;
    public int X;
    public int Y;
    public /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ z f8283b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f8284c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, ec.c cVar) {
        super(cVar);
        this.f8283b0 = zVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Z = obj;
        this.f8284c0 |= Integer.MIN_VALUE;
        Object r5 = this.f8283b0.r(this);
        if (r5 == dc.a.COROUTINE_SUSPENDED) {
            return r5;
        }
        return new yb.l(r5);
    }
}
