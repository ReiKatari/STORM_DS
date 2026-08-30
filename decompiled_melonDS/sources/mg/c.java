package mg;

import b3.p;
import b4.q1;
import l1.d1;
import l1.h1;
import l1.r1;
import mc.q;
import n2.r;
import n2.t2;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements q {
    public final /* synthetic */ int A;
    public final /* synthetic */ l B;
    public final /* synthetic */ mc.a L;

    public /* synthetic */ c(l lVar, mc.a aVar, int i2) {
        this.A = i2;
        this.B = lVar;
        this.L = aVar;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z10;
        int i2;
        boolean z11;
        int i10;
        switch (this.A) {
            case 0:
                d1 d1Var = (d1) obj;
                n2.m mVar = (n2.m) obj2;
                int intValue = ((Integer) obj3).intValue();
                d1Var.getClass();
                if ((intValue & 6) == 0) {
                    if (((r) mVar).f(d1Var)) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue |= i2;
                }
                if ((intValue & 19) != 18) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = (r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    p r5 = f1.n.r(l1.c.k(b3.m.f1770a, d1Var), f1.n.o(rVar));
                    t2 t2Var = q1.f1924n;
                    float f8 = 16;
                    n.a(r5, this.B, new h1(l1.c.j(d1Var, (x4.m) rVar.j(t2Var)) + f8, d1Var.b() + f8, l1.c.i(d1Var, (x4.m) rVar.j(t2Var)) + f8, d1Var.a() + f8), this.L, rVar, 0);
                } else {
                    rVar.R();
                }
                return y.f14813a;
            default:
                d1 d1Var2 = (d1) obj;
                n2.m mVar2 = (n2.m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                d1Var2.getClass();
                if ((intValue2 & 6) == 0) {
                    if (((r) mVar2).f(d1Var2)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    intValue2 |= i10;
                }
                if ((intValue2 & 19) != 18) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                r rVar2 = (r) mVar2;
                if (rVar2.O(intValue2 & 1, z11)) {
                    n.a(r1.b(b3.m.f1770a, 1.0f), this.B, d1Var2, this.L, rVar2, ((intValue2 << 6) & 896) | 6);
                } else {
                    rVar2.R();
                }
                return y.f14813a;
        }
    }
}
