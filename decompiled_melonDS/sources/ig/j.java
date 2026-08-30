package ig;

import ah.y;
import c1.p;
import c1.y1;
import java.util.List;
import java.util.UUID;
import mc.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j implements r {
    public final /* synthetic */ List A;
    public final /* synthetic */ UUID B;
    public final /* synthetic */ mc.l L;
    public final /* synthetic */ y1 R;
    public final /* synthetic */ p X;
    public final /* synthetic */ mc.l Y;
    public final /* synthetic */ mc.l Z;

    public j(List list, UUID uuid, mc.l lVar, y1 y1Var, p pVar, mc.l lVar2, mc.l lVar3) {
        this.A = list;
        this.B = uuid;
        this.L = lVar;
        this.R = y1Var;
        this.X = pVar;
        this.Y = lVar2;
        this.Z = lVar3;
    }

    @Override // mc.r
    public final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        boolean z10;
        int i10;
        int i11;
        o1.i iVar = (o1.i) obj;
        int intValue = ((Number) obj2).intValue();
        n2.m mVar = (n2.m) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (((n2.r) mVar).f(iVar)) {
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
        boolean z11 = true;
        if ((i2 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        n2.r rVar = (n2.r) mVar;
        if (rVar.O(i2 & 1, z10)) {
            oe.a aVar = (oe.a) this.A.get(intValue);
            rVar.X(673656973);
            UUID uuid = this.B;
            Object obj5 = n2.l.f9953a;
            mc.l lVar = this.L;
            if (aVar == null) {
                rVar.X(673656817);
                if (uuid != null) {
                    z11 = false;
                }
                boolean f8 = rVar.f(lVar);
                Object L = rVar.L();
                if (f8 || L == obj5) {
                    L = new y(1, lVar);
                    rVar.h0(L);
                }
                m.h(z11, (mc.a) L, rVar, 0);
                rVar.p(false);
            } else {
                rVar.X(673861665);
                boolean a10 = nc.k.a(uuid, aVar.f10905a);
                boolean f10 = rVar.f(lVar) | rVar.h(aVar);
                Object L2 = rVar.L();
                if (f10 || L2 == obj5) {
                    L2 = new i(lVar, aVar, 0);
                    rVar.h0(L2);
                }
                mc.a aVar2 = (mc.a) L2;
                mc.l lVar2 = this.Y;
                boolean f11 = rVar.f(lVar2) | rVar.h(aVar);
                Object L3 = rVar.L();
                if (f11 || L3 == obj5) {
                    L3 = new i(lVar2, aVar, 1);
                    rVar.h0(L3);
                }
                mc.a aVar3 = (mc.a) L3;
                mc.l lVar3 = this.Z;
                boolean f12 = rVar.f(lVar3) | rVar.h(aVar);
                Object L4 = rVar.L();
                if (f12 || L4 == obj5) {
                    L4 = new i(lVar3, aVar, 2);
                    rVar.h0(L4);
                }
                m.b(aVar, a10, this.R, this.X, aVar2, aVar3, (mc.a) L4, rVar, 0);
                rVar.p(false);
            }
            rVar.p(false);
        } else {
            rVar.R();
        }
        return yb.y.f14813a;
    }
}
