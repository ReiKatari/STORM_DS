package kf;

import h1.c3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends ec.c {
    public long R;
    public c3 X;
    public oi.f Y;
    public int Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f8228b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f8229c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f8230d0;

    /* renamed from: e0  reason: collision with root package name */
    public /* synthetic */ Object f8231e0;

    /* renamed from: f0  reason: collision with root package name */
    public final /* synthetic */ z f8232f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f8233g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(z zVar, ec.c cVar) {
        super(cVar);
        this.f8232f0 = zVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.f8231e0 = obj;
        this.f8233g0 |= Integer.MIN_VALUE;
        Object b10 = this.f8232f0.b(0L, null, null, this);
        if (b10 == dc.a.COROUTINE_SUSPENDED) {
            return b10;
        }
        return new yb.l(b10);
    }
}
