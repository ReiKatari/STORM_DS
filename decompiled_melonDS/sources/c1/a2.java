package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a2 extends nc.l implements mc.r {
    public final /* synthetic */ v2.c B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(v2.c cVar) {
        super(4);
        this.B = cVar;
    }

    @Override // mc.r
    public final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        boolean z10;
        int i10;
        int i11;
        y1 y1Var = (y1) obj;
        b3.p pVar = (b3.p) obj2;
        n2.m mVar = (n2.m) obj3;
        int intValue = ((Number) obj4).intValue();
        if ((intValue & 6) == 0) {
            if (((n2.r) mVar).f(y1Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | intValue;
        } else {
            i2 = intValue;
        }
        if ((intValue & 48) == 0) {
            if (((n2.r) mVar).f(pVar)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i2 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        n2.r rVar = (n2.r) mVar;
        if (rVar.O(i2 & 1, z10)) {
            y3.v0 d4 = l1.p.d(b3.c.A, false);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(pVar, rVar);
            a4.h.f220a.getClass();
            a4.f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(d4, a4.g.f215e, rVar);
            n2.s.C(l10, a4.g.f214d, rVar);
            n2.s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            n2.s.y(rVar, a4.g.f217g);
            n2.s.C(c4, a4.g.f213c, rVar);
            this.B.i(y1Var, rVar, Integer.valueOf(i2 & 14));
            rVar.p(true);
        } else {
            rVar.R();
        }
        return yb.y.f14813a;
    }
}
