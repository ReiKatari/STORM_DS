package mg;

import a4.f0;
import ai.k0;
import g2.a0;
import g2.l0;
import g2.m0;
import i3.z;
import java.util.WeakHashMap;
import l1.c2;
import l1.v1;
import l1.y0;
import mc.p;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.r;
import n2.s;
import n2.t2;
import y3.v0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements p {
    public final /* synthetic */ int A;
    public final /* synthetic */ mc.a B;
    public final /* synthetic */ mc.a L;

    public /* synthetic */ g(mc.a aVar, mc.a aVar2, int i2) {
        this.A = i2;
        this.B = aVar;
        this.L = aVar2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        int i2 = this.A;
        y yVar = y.f14813a;
        boolean z11 = false;
        switch (i2) {
            case 0:
                n2.m mVar = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z11 = true;
                }
                r rVar = (r) mVar;
                if (rVar.O(intValue & 1, z11)) {
                    p7.l.d(l0.f.I(rVar, R.string.cancel), false, this.B, rVar, 0, 2);
                    p7.l.d(l0.f.I(rVar, R.string.save), false, this.L, rVar, 0, 2);
                } else {
                    rVar.R();
                }
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                n2.m mVar2 = (n2.m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z11 = true;
                }
                r rVar2 = (r) mVar2;
                if (rVar2.O(intValue2 & 1, z11)) {
                    p7.l.d(l0.f.I(rVar2, R.string.cancel), false, this.B, rVar2, 0, 2);
                    p7.l.d(l0.f.I(rVar2, R.string.exit), false, this.L, rVar2, 0, 2);
                } else {
                    rVar2.R();
                }
                return yVar;
            case 2:
                n2.m mVar3 = (n2.m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z11 = true;
                }
                r rVar3 = (r) mVar3;
                if (rVar3.O(intValue3 & 1, z11)) {
                    p7.l.d(l0.f.I(rVar3, R.string.cancel), false, this.B, rVar3, 0, 2);
                    p7.l.d(l0.f.I(rVar3, R.string.ok), false, this.L, rVar3, 0, 2);
                } else {
                    rVar3.R();
                }
                return yVar;
            default:
                n2.m mVar4 = (n2.m) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar4 = (r) mVar4;
                if (rVar4.O(intValue4 & 1, z10)) {
                    t2 t2Var = m0.f5257a;
                    b3.p y10 = l1.c.y(f1.n.f(b3.m.f1770a, ((l0) rVar4.j(t2Var)).h(), z.f6703b));
                    v0 d4 = l1.p.d(b3.c.A, false);
                    int hashCode = Long.hashCode(rVar4.T);
                    v2.g l10 = rVar4.l();
                    b3.p c4 = b3.a.c(y10, rVar4);
                    a4.h.f220a.getClass();
                    f0 f0Var = a4.g.f212b;
                    rVar4.b0();
                    if (rVar4.S) {
                        rVar4.k(f0Var);
                    } else {
                        rVar4.k0();
                    }
                    s.C(d4, a4.g.f215e, rVar4);
                    s.C(l10, a4.g.f214d, rVar4);
                    s.u(rVar4, Integer.valueOf(hashCode), a4.g.f216f);
                    s.y(rVar4, a4.g.f217g);
                    s.C(c4, a4.g.f213c, rVar4);
                    long g10 = ((l0) rVar4.j(t2Var)).g();
                    long d10 = ((l0) rVar4.j(t2Var)).d();
                    WeakHashMap weakHashMap = c2.f8518w;
                    v1 v1Var = l1.s.f(rVar4).f8530l;
                    int i10 = l1.c.f8512h;
                    a0.b(wh.a.f14217a, new y0(v1Var, 15 | 16), null, v2.h.c(2087504969, new k0(12, this.B), rVar4), v2.h.c(-445672896, new f(1, this.L), rVar4), g10, d10, 0.0f, rVar4, 27654, 132);
                    rVar4.p(true);
                } else {
                    rVar4.R();
                }
                return yVar;
        }
    }
}
