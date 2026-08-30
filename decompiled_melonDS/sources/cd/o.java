package cd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends ec.j implements mc.l {
    public final /* synthetic */ long X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j2, cc.c cVar) {
        super(1, cVar);
        this.X = j2;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        new o(this.X, (cc.c) obj).v(yb.y.f14813a);
        throw null;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        p7.j.I(obj);
        throw new zc.p1("Timed out waiting for " + ((Object) wc.b.k(this.X)), null);
    }
}
