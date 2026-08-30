package a5;

import n2.w0;
import y3.v0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s extends nc.l implements mc.p {
    public final /* synthetic */ int B;
    public final /* synthetic */ m0 L;
    public final /* synthetic */ w0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(m0 m0Var, w0 w0Var, int i2) {
        super(2);
        this.B = i2;
        this.L = m0Var;
        this.R = w0Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        float f8;
        boolean z11;
        int i2 = this.B;
        yb.y yVar = yb.y.f14813a;
        w0 w0Var = this.R;
        m0 m0Var = this.L;
        switch (i2) {
            case 0:
                n2.m mVar = (n2.m) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    Object L = rVar.L();
                    n2.e eVar = n2.l.f9953a;
                    if (L == eVar) {
                        L = e.Y;
                        rVar.h0(L);
                    }
                    b3.p a10 = i4.n.a(b3.m.f1770a, false, (mc.l) L);
                    boolean h2 = rVar.h(m0Var);
                    Object L2 = rVar.L();
                    if (h2 || L2 == eVar) {
                        L2 = new p(m0Var, 1);
                        rVar.h0(L2);
                    }
                    b3.p o5 = y3.c0.o(a10, (mc.l) L2);
                    if (m0Var.getCanCalculatePosition()) {
                        f8 = 1.0f;
                    } else {
                        f8 = 0.0f;
                    }
                    b3.p a11 = f3.g.a(o5, f8);
                    n2.b0 b0Var = u.f433a;
                    mc.p pVar = (mc.p) w0Var.getValue();
                    Object L3 = rVar.L();
                    if (L3 == eVar) {
                        L3 = i.f399c;
                        rVar.h0(L3);
                    }
                    v0 v0Var = (v0) L3;
                    int hashCode = Long.hashCode(rVar.T);
                    v2.g l10 = rVar.l();
                    b3.p c4 = b3.a.c(a11, rVar);
                    a4.h.f220a.getClass();
                    a4.f0 f0Var = a4.g.f212b;
                    rVar.b0();
                    if (rVar.S) {
                        rVar.k(f0Var);
                    } else {
                        rVar.k0();
                    }
                    n2.s.C(v0Var, a4.g.f215e, rVar);
                    n2.s.C(l10, a4.g.f214d, rVar);
                    n2.s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
                    n2.s.y(rVar, a4.g.f217g);
                    n2.s.C(c4, a4.g.f213c, rVar);
                    pVar.j(rVar, 0);
                    rVar.p(true);
                } else {
                    rVar.R();
                }
                return yVar;
            default:
                n2.m mVar2 = (n2.m) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar2 = (n2.r) mVar2;
                if (rVar2.O(intValue2 & 1, z11)) {
                    n2.s.a(u.f434b.a(Boolean.TRUE), v2.h.c(1022273628, new s(m0Var, w0Var, 0), rVar2), rVar2, 56);
                } else {
                    rVar2.R();
                }
                return yVar;
        }
    }
}
