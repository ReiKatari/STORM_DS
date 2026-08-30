package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ l1.b2 B;
    public final /* synthetic */ l1.d1 L;
    public final /* synthetic */ v2.c R;

    public /* synthetic */ w(l1.b2 b2Var, l1.d1 d1Var, v2.c cVar, int i2) {
        this.A = i2;
        this.B = b2Var;
        this.L = d1Var;
        this.R = cVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        float f8;
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
                    n2.b0 b0Var = o0.f5308a;
                    long j2 = ((i3.s) rVar.j(q0.f5361a)).f6689a;
                    if (!((l0) rVar.j(m0.f5257a)).k() ? i3.z.r(j2) < 0.5d : i3.z.r(j2) > 0.5d) {
                        f8 = 0.74f;
                    } else {
                        f8 = 0.6f;
                    }
                    n2.s.a(b0Var.a(Float.valueOf(f8)), v2.h.c(597057613, new w(this.B, this.L, this.R, 1), rVar), rVar, 56);
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
                    b3.p c4 = l1.r1.c(l1.c.s(l1.c.C(l1.r1.b(b3.m.f1770a, 1.0f), this.B), this.L), a0.f5036a);
                    l1.o1 a10 = l1.m1.a(l1.i.f8571a, b3.c.f1756e0, rVar2, 54);
                    int hashCode = Long.hashCode(rVar2.T);
                    v2.g l10 = rVar2.l();
                    b3.p c10 = b3.a.c(c4, rVar2);
                    a4.h.f220a.getClass();
                    a4.f0 f0Var = a4.g.f212b;
                    rVar2.b0();
                    if (rVar2.S) {
                        rVar2.k(f0Var);
                    } else {
                        rVar2.k0();
                    }
                    n2.s.C(a10, a4.g.f215e, rVar2);
                    n2.s.C(l10, a4.g.f214d, rVar2);
                    a4.f fVar = a4.g.f216f;
                    if (rVar2.S || !nc.k.a(rVar2.L(), Integer.valueOf(hashCode))) {
                        w.d.w(hashCode, rVar2, hashCode, fVar);
                    }
                    n2.s.C(c10, a4.g.f213c, rVar2);
                    this.R.i(l1.p1.f8600a, rVar2, 6);
                    rVar2.p(true);
                } else {
                    rVar2.R();
                }
                return yb.y.f14813a;
        }
    }
}
