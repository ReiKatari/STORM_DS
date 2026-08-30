package ah;

import cd.q1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t0 extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public final /* synthetic */ h1 Y;
    public final /* synthetic */ ze.a Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(h1 h1Var, ze.a aVar, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Y = h1Var;
        this.Z = aVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                yb.y yVar = yb.y.f14813a;
                ((t0) t(cVar, uVar)).v(yVar);
                return yVar;
            default:
                yb.y yVar2 = yb.y.f14813a;
                ((t0) t(cVar, uVar)).v(yVar2);
                return yVar2;
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new t0(this.Y, this.Z, cVar, 0);
            default:
                return new t0(this.Y, this.Z, cVar, 1);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        int i2 = this.X;
        yb.y yVar = yb.y.f14813a;
        ze.a aVar = this.Z;
        h1 h1Var = this.Y;
        switch (i2) {
            case 0:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                q1 q1Var = h1Var.f777q;
                hh.n nVar = new hh.n(aVar);
                q1Var.getClass();
                q1Var.k(null, nVar);
                return yVar;
            default:
                dc.a aVar3 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                h1.j(h1Var, hh.g.f6526a);
                zc.x.v(h1Var.f775o, null, null, new t0(h1Var, aVar, null, 0), 3);
                return yVar;
        }
    }
}
