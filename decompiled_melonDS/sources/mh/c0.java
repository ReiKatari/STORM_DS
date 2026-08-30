package mh;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c0 implements mc.r {
    public final /* synthetic */ List A;

    public c0(List list) {
        this.A = list;
    }

    @Override // mc.r
    public final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        boolean z10;
        int i10;
        int i11;
        n1.c cVar = (n1.c) obj;
        int intValue = ((Number) obj2).intValue();
        n2.m mVar = (n2.m) obj3;
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
            h hVar = (h) this.A.get(intValue);
            rVar.X(-783354530);
            if (hVar instanceof a) {
                rVar.X(-2103478174);
                aj.g.c((a) hVar, rVar, 0);
                rVar.p(false);
            } else if (hVar instanceof b) {
                rVar.X(-2103475996);
                pc.a.d((b) hVar, rVar, 0);
                rVar.p(false);
            } else if (hVar instanceof c) {
                rVar.X(-2103473277);
                q8.r.b((c) hVar, rVar, 0);
                rVar.p(false);
            } else if (hVar instanceof d) {
                rVar.X(-2103470357);
                a.a.c((d) hVar, rVar, 0);
                rVar.p(false);
            } else if (hVar instanceof g) {
                rVar.X(-2103467190);
                d0.d.F((g) hVar, rVar, 0);
                rVar.p(false);
            } else {
                throw w.d.i(rVar, -2103479483, false);
            }
            rVar.p(false);
        } else {
            rVar.R();
        }
        return yb.y.f14813a;
    }
}
