package ai;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k implements mc.r {
    public final /* synthetic */ List A;
    public final /* synthetic */ long B;
    public final /* synthetic */ mc.l L;

    public k(List list, long j2, mc.l lVar) {
        this.A = list;
        this.B = j2;
        this.L = lVar;
    }

    @Override // mc.r
    public final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        boolean z10;
        boolean z11;
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
            zh.c cVar2 = (zh.c) this.A.get(intValue);
            rVar.X(-1392517167);
            if (cVar2.f15110a == this.B) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object obj5 = this.L;
            boolean f8 = rVar.f(obj5) | rVar.h(cVar2);
            Object L = rVar.L();
            if (f8 || L == n2.l.f9953a) {
                L = new i(0, obj5, cVar2);
                rVar.h0(L);
            }
            n.j(null, cVar2, z11, (mc.a) L, rVar, 0);
            rVar.p(false);
        } else {
            rVar.R();
        }
        return yb.y.f14813a;
    }
}
