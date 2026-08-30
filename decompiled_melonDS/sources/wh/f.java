package wh;

import cd.w0;
import g2.n0;
import java.util.List;
import java.util.UUID;
import mc.l;
import mc.r;
import n2.m;
import nc.k;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f implements r {
    public final /* synthetic */ List A;
    public final /* synthetic */ UUID B;
    public final /* synthetic */ l L;
    public final /* synthetic */ l R;
    public final /* synthetic */ w0 X;
    public final /* synthetic */ l Y;

    public f(List list, UUID uuid, l lVar, l lVar2, w0 w0Var, l lVar3) {
        this.A = list;
        this.B = uuid;
        this.L = lVar;
        this.R = lVar2;
        this.X = w0Var;
        this.Y = lVar3;
    }

    @Override // mc.r
    public final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        boolean z10;
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
            ve.f fVar = (ve.f) this.A.get(intValue);
            rVar.X(1008758773);
            boolean a10 = k.a(fVar.f13798a, this.B);
            l lVar = this.L;
            boolean f8 = rVar.f(lVar) | rVar.h(fVar);
            Object L = rVar.L();
            Object obj5 = n2.l.f9953a;
            if (f8 || L == obj5) {
                L = new c(lVar, fVar);
                rVar.h0(L);
            }
            mc.a aVar = (mc.a) L;
            boolean h2 = rVar.h(fVar);
            l lVar2 = this.R;
            boolean f10 = h2 | rVar.f(lVar2);
            Object L2 = rVar.L();
            if (f10 || L2 == obj5) {
                L2 = new c(fVar, lVar2);
                rVar.h0(L2);
            }
            mc.a aVar2 = (mc.a) L2;
            w0 w0Var = this.X;
            boolean h10 = rVar.h(w0Var) | rVar.h(fVar);
            l lVar3 = this.Y;
            boolean f11 = h10 | rVar.f(lVar3);
            Object L3 = rVar.L();
            if (f11 || L3 == obj5) {
                L3 = new d(w0Var, fVar, lVar3);
                rVar.h0(L3);
            }
            a.a(fVar, a10, aVar, aVar2, (mc.a) L3, rVar, 0);
            n0.c(null, 0L, 0.0f, 0.0f, rVar, 0, 15);
            rVar.p(false);
        } else {
            rVar.R();
        }
        return y.f14813a;
    }
}
