package dd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends f {
    public g(cd.h hVar, cc.g gVar, int i2, bd.a aVar, int i10) {
        super((i10 & 4) != 0 ? -3 : i2, (i10 & 8) != 0 ? bd.a.SUSPEND : aVar, (i10 & 2) != 0 ? cc.h.A : gVar, hVar);
    }

    @Override // dd.e
    public final e f(cc.g gVar, int i2, bd.a aVar) {
        return new f(i2, aVar, gVar, this.R);
    }

    @Override // dd.e
    public final cd.h g() {
        return this.R;
    }

    @Override // dd.f
    public final Object i(cd.i iVar, cc.c cVar) {
        Object c4 = this.R.c(iVar, cVar);
        if (c4 == dc.a.COROUTINE_SUSPENDED) {
            return c4;
        }
        return yb.y.f14813a;
    }
}
