package zg;

import java.util.List;
import l1.d1;
import l1.h1;
import l1.r1;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements mc.q {
    public final /* synthetic */ int A;
    public final /* synthetic */ yg.j B;
    public final /* synthetic */ mc.l L;
    public final /* synthetic */ mc.p R;

    public /* synthetic */ m(yg.j jVar, mc.l lVar, mc.p pVar, int i2) {
        this.A = i2;
        this.B = jVar;
        this.L = lVar;
        this.R = pVar;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z10;
        int i2;
        boolean z11;
        switch (this.A) {
            case 0:
                d1 d1Var = (d1) obj;
                n2.m mVar = (n2.m) obj2;
                int intValue = ((Integer) obj3).intValue();
                d1Var.getClass();
                if ((intValue & 6) == 0) {
                    if (((n2.r) mVar).f(d1Var)) {
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
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    yg.j jVar = this.B;
                    if (jVar instanceof yg.i) {
                        rVar.X(578442313);
                        a.n(l1.c.s(r1.f8615c, d1Var), rVar, 0);
                        rVar.p(false);
                    } else if (jVar instanceof yg.h) {
                        rVar.X(578595236);
                        a.c(r1.f8615c, d1Var, ((yg.h) jVar).f14824a, this.L, this.R, null, rVar, ((intValue << 3) & 112) | 6, 32);
                        rVar.p(false);
                    } else if (jVar instanceof yg.g) {
                        rVar.X(578989835);
                        a.g(l1.c.s(r1.f8615c, d1Var), rVar, 0);
                        rVar.p(false);
                    } else {
                        throw w.d.i(rVar, -396984452, false);
                    }
                } else {
                    rVar.R();
                }
                return y.f14813a;
            default:
                n2.m mVar2 = (n2.m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((d1) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar2 = (n2.r) mVar2;
                if (rVar2.O(intValue2 & 1, z11)) {
                    yg.j jVar2 = this.B;
                    boolean z12 = jVar2 instanceof yg.i;
                    b3.m mVar3 = b3.m.f1770a;
                    if (z12) {
                        rVar2.X(-134727535);
                        a.n(r1.b(mVar3, 1.0f), rVar2, 6);
                        rVar2.p(false);
                    } else if (jVar2 instanceof yg.h) {
                        rVar2.X(-134585958);
                        float f8 = 0;
                        h1 h1Var = new h1(f8, f8, f8, f8);
                        List list = ((yg.h) jVar2).f14824a;
                        float f10 = 24;
                        float f11 = 8;
                        a.c(mVar3, h1Var, list, this.L, this.R, new h1(f10, f11, f10, f11), rVar2, 196662, 0);
                        rVar2.p(false);
                    } else if (jVar2 instanceof yg.g) {
                        rVar2.X(-134096685);
                        a.g(r1.b(mVar3, 1.0f), rVar2, 6);
                        rVar2.p(false);
                    } else {
                        throw w.d.i(rVar2, -1528368504, false);
                    }
                } else {
                    rVar2.R();
                }
                return y.f14813a;
        }
    }
}
