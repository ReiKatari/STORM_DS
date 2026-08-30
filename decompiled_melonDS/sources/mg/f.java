package mg;

import ai.k0;
import g2.l0;
import g2.m0;
import g2.n0;
import g2.o0;
import g2.q0;
import i3.s;
import i3.z;
import l1.p1;
import mc.q;
import n2.b0;
import n2.r;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements q {
    public final /* synthetic */ int A;
    public final /* synthetic */ mc.a B;

    public /* synthetic */ f(int i2, mc.a aVar) {
        this.A = i2;
        this.B = aVar;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z10;
        boolean z11;
        float f8;
        int i2 = this.A;
        p1 p1Var = (p1) obj;
        n2.m mVar = (n2.m) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i2) {
            case 0:
                p1Var.getClass();
                if ((intValue & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = (r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    n0.j(this.B, null, false, null, n.f9660b, rVar, 805306368, 510);
                } else {
                    rVar.R();
                }
                return y.f14813a;
            default:
                p1Var.getClass();
                if ((intValue & 17) != 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                r rVar2 = (r) mVar;
                if (rVar2.O(intValue & 1, z11)) {
                    b0 b0Var = o0.f5308a;
                    long j2 = ((s) rVar2.j(q0.f5361a)).f6689a;
                    if (!((l0) rVar2.j(m0.f5257a)).k() ? z.r(j2) < 0.5d : z.r(j2) > 0.5d) {
                        f8 = 1.0f;
                    } else {
                        f8 = 0.87f;
                    }
                    n2.s.a(b0Var.a(Float.valueOf(f8)), v2.h.c(1150289664, new k0(11, this.B), rVar2), rVar2, 56);
                } else {
                    rVar2.R();
                }
                return y.f14813a;
        }
    }
}
