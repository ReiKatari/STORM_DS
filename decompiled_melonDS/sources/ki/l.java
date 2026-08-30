package ki;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l extends ec.c {
    public long R;
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ m Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f8313b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, ec.c cVar) {
        super(cVar);
        this.Z = mVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Y = obj;
        this.f8313b0 |= Integer.MIN_VALUE;
        Object k10 = this.Z.k(0L, 0, this);
        if (k10 == dc.a.COROUTINE_SUSPENDED) {
            return k10;
        }
        return new yb.l(k10);
    }
}
