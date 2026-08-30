package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ mc.q B;

    public /* synthetic */ z(mc.q qVar, int i2) {
        this.A = i2;
        this.B = qVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        int i2 = this.A;
        n2.m mVar = (n2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i2) {
            case 0:
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    l1.e0 e0Var = l1.r1.f8614b;
                    l1.o1 a10 = l1.m1.a(l1.i.f8572b, b3.c.f1756e0, rVar, 54);
                    int hashCode = Long.hashCode(rVar.T);
                    v2.g l10 = rVar.l();
                    b3.p c4 = b3.a.c(e0Var, rVar);
                    a4.h.f220a.getClass();
                    a4.f0 f0Var = a4.g.f212b;
                    rVar.b0();
                    if (rVar.S) {
                        rVar.k(f0Var);
                    } else {
                        rVar.k0();
                    }
                    n2.s.C(a10, a4.g.f215e, rVar);
                    n2.s.C(l10, a4.g.f214d, rVar);
                    a4.f fVar = a4.g.f216f;
                    if (rVar.S || !nc.k.a(rVar.L(), Integer.valueOf(hashCode))) {
                        w.d.w(hashCode, rVar, hashCode, fVar);
                    }
                    n2.s.C(c4, a4.g.f213c, rVar);
                    this.B.i(l1.p1.f8600a, rVar, 6);
                    rVar.p(true);
                } else {
                    rVar.R();
                }
                return yb.y.f14813a;
            default:
                if ((intValue & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar2 = (n2.r) mVar;
                if (rVar2.O(intValue & 1, z11)) {
                    this.B.i(l1.p1.f8600a, rVar2, 0);
                } else {
                    rVar2.R();
                }
                return yb.y.f14813a;
        }
    }
}
