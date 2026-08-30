package cd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u0 implements h {
    public final /* synthetic */ h A;
    public final /* synthetic */ h B;
    public final /* synthetic */ ec.j L;

    public u0(h hVar, h hVar2, mc.q qVar) {
        this.A = hVar;
        this.B = hVar2;
        this.L = (ec.j) qVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [ec.j, mc.q] */
    @Override // cd.h
    public final Object c(i iVar, cc.c cVar) {
        Object a10 = dd.c.a(cVar, iVar, v0.A, new t0((mc.q) this.L, (cc.c) null), new h[]{this.A, this.B});
        if (a10 == dc.a.COROUTINE_SUSPENDED) {
            return a10;
        }
        return yb.y.f14813a;
    }
}
