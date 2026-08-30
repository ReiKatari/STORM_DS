package mg;

import ai.k0;
import g2.a0;
import g2.l0;
import g2.m0;
import g2.r3;
import java.util.WeakHashMap;
import l1.c2;
import l1.e0;
import l1.r1;
import l1.s;
import l1.v1;
import l1.y0;
import mc.p;
import n2.r;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements p {
    public final /* synthetic */ int A;
    public final /* synthetic */ l B;
    public final /* synthetic */ mc.a L;
    public final /* synthetic */ mc.a R;

    public /* synthetic */ b(l lVar, mc.a aVar, mc.a aVar2, int i2) {
        this.A = i2;
        this.B = lVar;
        this.L = aVar;
        this.R = aVar2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        int i2 = this.A;
        y yVar = y.f14813a;
        mc.a aVar = this.R;
        mc.a aVar2 = this.L;
        l lVar = this.B;
        switch (i2) {
            case 0:
                n2.m mVar = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = (r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    WeakHashMap weakHashMap = c2.f8518w;
                    v1 v1Var = s.f(rVar).f8530l;
                    int i10 = l1.c.f8512h;
                    a0.b(v2.h.c(-2035792789, new e(lVar, 1), rVar), new y0(v1Var, 15 | 16), null, v2.h.c(585222318, new k0(7, aVar2), rVar), v2.h.c(1389562135, new f(0, aVar), rVar), ((l0) rVar.j(m0.f5257a)).j(), 0L, 0, rVar, 12610566, 68);
                } else {
                    rVar.R();
                }
                return yVar;
            default:
                n2.m mVar2 = (n2.m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                r rVar2 = (r) mVar2;
                if (rVar2.O(1 & intValue2, z11)) {
                    e0 e0Var = r1.f8615c;
                    long j2 = ((l0) rVar2.j(m0.f5257a)).j();
                    WeakHashMap weakHashMap2 = c2.f8518w;
                    r3.b(s.f(rVar2).f8530l, e0Var, null, v2.h.c(790802855, new b(lVar, aVar2, aVar, 0), rVar2), null, null, null, 0, false, null, 0.0f, 0L, 0L, 0L, j2, 0L, v2.h.c(-913206642, new c(lVar, aVar, 0), rVar2), rVar2, 3120, 100663296, 196596);
                } else {
                    rVar2.R();
                }
                return yVar;
        }
    }
}
