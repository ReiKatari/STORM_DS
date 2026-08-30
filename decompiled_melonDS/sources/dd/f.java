package dd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class f extends e {
    public final cd.h R;

    public f(int i2, bd.a aVar, cc.g gVar, cd.h hVar) {
        super(gVar, i2, aVar);
        this.R = hVar;
    }

    @Override // dd.e, cd.h
    public final Object c(cd.i iVar, cc.c cVar) {
        cc.g k10;
        if (this.B == -3) {
            cc.g g10 = cVar.g();
            Boolean bool = Boolean.FALSE;
            mg.m mVar = new mg.m(22, (byte) 0);
            cc.g gVar = this.A;
            if (!((Boolean) gVar.L(bool, mVar)).booleanValue()) {
                k10 = g10.H(gVar);
            } else {
                k10 = zc.x.k(g10, gVar, false);
            }
            if (nc.k.a(k10, g10)) {
                Object i2 = i(iVar, cVar);
                if (i2 == dc.a.COROUTINE_SUSPENDED) {
                    return i2;
                }
            } else {
                cc.d dVar = cc.d.A;
                if (nc.k.a(k10.t(dVar), g10.t(dVar))) {
                    cc.g g11 = cVar.g();
                    if (!(iVar instanceof y) && !(iVar instanceof u)) {
                        iVar = new b7.y(iVar, g11);
                    }
                    Object c4 = c.c(k10, iVar, ed.b.m(k10), new a5.o(26, null, this), cVar);
                    if (c4 == dc.a.COROUTINE_SUSPENDED) {
                        return c4;
                    }
                }
            }
            return yb.y.f14813a;
        }
        Object c10 = super.c(iVar, cVar);
        if (c10 == dc.a.COROUTINE_SUSPENDED) {
            return c10;
        }
        return yb.y.f14813a;
    }

    @Override // dd.e
    public final Object e(bd.v vVar, cc.c cVar) {
        Object i2 = i(new y(vVar), cVar);
        if (i2 == dc.a.COROUTINE_SUSPENDED) {
            return i2;
        }
        return yb.y.f14813a;
    }

    public abstract Object i(cd.i iVar, cc.c cVar);

    @Override // dd.e
    public final String toString() {
        return this.R + " -> " + super.toString();
    }
}
