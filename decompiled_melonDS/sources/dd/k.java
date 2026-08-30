package dd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends f {
    public final ec.j X;

    public k(mc.q qVar, cd.h hVar, cc.g gVar, int i2, bd.a aVar) {
        super(i2, aVar, gVar, hVar);
        this.X = (ec.j) qVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ec.j, mc.q] */
    @Override // dd.e
    public final e f(cc.g gVar, int i2, bd.a aVar) {
        return new k(this.X, this.R, gVar, i2, aVar);
    }

    @Override // dd.f
    public final Object i(cd.i iVar, cc.c cVar) {
        Object g10 = zc.x.g(new h(this, iVar, null), cVar);
        if (g10 == dc.a.COROUTINE_SUSPENDED) {
            return g10;
        }
        return yb.y.f14813a;
    }
}
