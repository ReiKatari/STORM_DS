package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class u1 implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ Object L;

    public /* synthetic */ u1(long j2, Object obj, int i2) {
        this.A = i2;
        this.B = j2;
        this.L = obj;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        switch (this.A) {
            case 0:
                v2.c cVar = (v2.c) this.L;
                n2.m mVar = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    n2.s.a(o0.f5308a.a(Float.valueOf(i3.s.d(this.B))), v2.h.c(-1072292694, new y(cVar, 1), rVar), rVar, 56);
                } else {
                    rVar.R();
                }
                return yb.y.f14813a;
            default:
                b3.p pVar = (b3.p) this.L;
                n2.m mVar2 = (n2.m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar2 = (n2.r) mVar2;
                if (rVar2.O(intValue2 & 1, z11)) {
                    long j2 = this.B;
                    if (j2 != 9205357640488583168L) {
                        rVar2.X(-1244013944);
                        b3.p h2 = l1.r1.h(pVar, x4.h.b(j2), x4.h.a(j2), 0.0f, 0.0f, 12);
                        y3.v0 d4 = l1.p.d(b3.c.B, false);
                        int hashCode = Long.hashCode(rVar2.T);
                        v2.g l10 = rVar2.l();
                        b3.p c4 = b3.a.c(h2, rVar2);
                        a4.h.f220a.getClass();
                        a4.f0 f0Var = a4.g.f212b;
                        rVar2.b0();
                        if (rVar2.S) {
                            rVar2.k(f0Var);
                        } else {
                            rVar2.k0();
                        }
                        n2.s.C(d4, a4.g.f215e, rVar2);
                        n2.s.C(l10, a4.g.f214d, rVar2);
                        n2.s.u(rVar2, Integer.valueOf(hashCode), a4.g.f216f);
                        n2.s.y(rVar2, a4.g.f217g);
                        n2.s.C(c4, a4.g.f213c, rVar2);
                        u1.a.b(null, rVar2, 0, 1);
                        rVar2.p(true);
                        rVar2.p(false);
                    } else {
                        rVar2.X(-1243644858);
                        u1.a.b(pVar, rVar2, 0, 0);
                        rVar2.p(false);
                    }
                } else {
                    rVar2.R();
                }
                return yb.y.f14813a;
        }
    }
}
