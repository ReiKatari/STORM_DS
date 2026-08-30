package kf;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w extends ec.c {
    public long R;
    public long X;
    public boolean Y;
    public Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public /* synthetic */ Object f8275b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ z f8276c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f8277d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar, ec.c cVar) {
        super(cVar);
        this.f8276c0 = zVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.f8275b0 = obj;
        this.f8277d0 |= Integer.MIN_VALUE;
        Object p10 = this.f8276c0.p(0L, 0L, false, this);
        if (p10 == dc.a.COROUTINE_SUSPENDED) {
            return p10;
        }
        return new yb.l(p10);
    }
}
