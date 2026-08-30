package kf;

import h1.c3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q extends ec.c {
    public String R;
    public oi.g X;
    public c3 Y;
    public Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f8258b0;

    /* renamed from: c0  reason: collision with root package name */
    public /* synthetic */ Object f8259c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ z f8260d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f8261e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z zVar, ec.c cVar) {
        super(cVar);
        this.f8260d0 = zVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.f8259c0 = obj;
        this.f8261e0 |= Integer.MIN_VALUE;
        Object j2 = this.f8260d0.j(null, false, this);
        if (j2 == dc.a.COROUTINE_SUSPENDED) {
            return j2;
        }
        return new yb.l(j2);
    }
}
