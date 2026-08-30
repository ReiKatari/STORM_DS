package ug;

import a4.f0;
import b3.p;
import f1.n;
import g2.e7;
import g2.h3;
import java.util.List;
import l1.m1;
import l1.o1;
import l1.r1;
import mc.l;
import mc.r;
import n2.m;
import n2.s;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements r {
    public final /* synthetic */ List A;
    public final /* synthetic */ l B;
    public final /* synthetic */ mc.a L;
    public final /* synthetic */ int R;

    public i(List list, l lVar, mc.a aVar, int i2) {
        this.A = list;
        this.B = lVar;
        this.L = aVar;
        this.R = i2;
    }

    @Override // mc.r
    public final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        n1.c cVar = (n1.c) obj;
        int intValue = ((Number) obj2).intValue();
        m mVar = (m) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (((n2.r) mVar).f(cVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | intValue2;
        } else {
            i2 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (((n2.r) mVar).d(intValue)) {
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
            String str = (String) this.A.get(intValue);
            rVar.X(1374552944);
            b3.m mVar2 = b3.m.f1770a;
            p b10 = r1.b(mVar2, 1.0f);
            l lVar = this.B;
            boolean f8 = rVar.f(lVar);
            if ((((i2 & 112) ^ 48) > 32 && rVar.d(intValue)) || (i2 & 48) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z13 = z11 | f8;
            mc.a aVar = this.L;
            boolean f10 = z13 | rVar.f(aVar);
            Object L = rVar.L();
            if (f10 || L == n2.l.f9953a) {
                L = new h(lVar, intValue, aVar);
                rVar.h0(L);
            }
            p x9 = l1.c.x(r1.e(n.i(b10, false, null, (mc.a) L, 15), 48, 0.0f, 2), 24, 0.0f, 0.0f, 0.0f, 14);
            o1 a10 = m1.a(l1.i.f8571a, b3.c.f1756e0, rVar, 48);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            p c4 = b3.a.c(x9, rVar);
            a4.h.f220a.getClass();
            f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            s.C(a10, a4.g.f215e, rVar);
            s.C(l10, a4.g.f214d, rVar);
            s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            s.y(rVar, a4.g.f217g);
            s.C(c4, a4.g.f213c, rVar);
            if (intValue == this.R) {
                z12 = true;
            } else {
                z12 = false;
            }
            h3.a(z12, null, false, null, rVar, 48, 60);
            l1.c.d(r1.l(mVar2, 32), rVar);
            e7.b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 131070);
            rVar.p(true);
            rVar.p(false);
        } else {
            rVar.R();
        }
        return y.f14813a;
    }
}
