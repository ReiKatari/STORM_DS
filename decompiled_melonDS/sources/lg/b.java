package lg;

import g2.n0;
import java.util.List;
import l1.d1;
import l1.r1;
import mc.p;
import mc.r;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.Cheat;
import n2.w0;
import oe.s;
import yb.y;
import zg.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements r {
    public final /* synthetic */ int A = 2;
    public final /* synthetic */ List B;
    public final /* synthetic */ mc.l L;
    public final /* synthetic */ yb.d R;
    public final /* synthetic */ Object X;

    public b(List list, mc.l lVar, p pVar, d1 d1Var) {
        this.B = list;
        this.L = lVar;
        this.R = pVar;
        this.X = d1Var;
    }

    @Override // mc.r
    public final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        boolean z10;
        int i10;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        int i13;
        int i14;
        int i15;
        boolean z13;
        int i16;
        int i17;
        switch (this.A) {
            case 0:
                n1.c cVar = (n1.c) obj;
                int intValue = ((Number) obj2).intValue();
                n2.m mVar = (n2.m) obj3;
                int intValue2 = ((Number) obj4).intValue();
                mc.l lVar = (mc.l) this.R;
                Object obj5 = (w0) this.X;
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
                    Cheat cheat = (Cheat) this.B.get(intValue);
                    rVar.X(-517217729);
                    if (intValue > 0) {
                        rVar.X(-517215188);
                        n0.c(null, 0L, 0.0f, 0.0f, rVar, 0, 15);
                        rVar.p(false);
                    } else {
                        rVar.X(-517160411);
                        rVar.p(false);
                    }
                    b3.p b10 = r1.b(b3.m.f1770a, 1.0f);
                    mc.l lVar2 = this.L;
                    boolean f8 = rVar.f(lVar2) | rVar.f(cheat);
                    Object L = rVar.L();
                    Object obj6 = n2.l.f9953a;
                    if (f8 || L == obj6) {
                        L = new a(lVar2, cheat, 0);
                        rVar.h0(L);
                    }
                    mc.a aVar = (mc.a) L;
                    boolean f10 = rVar.f(obj5) | rVar.f(cheat);
                    Object L2 = rVar.L();
                    if (f10 || L2 == obj6) {
                        L2 = new ai.i(1, cheat, obj5);
                        rVar.h0(L2);
                    }
                    mc.a aVar2 = (mc.a) L2;
                    boolean f11 = rVar.f(lVar) | rVar.f(cheat);
                    Object L3 = rVar.L();
                    if (f11 || L3 == obj6) {
                        L3 = new a(lVar, cheat, 1);
                        rVar.h0(L3);
                    }
                    ng.b.b(b10, cheat, aVar, aVar2, (mc.a) L3, rVar, 6);
                    rVar.p(false);
                } else {
                    rVar.R();
                }
                return y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                n1.c cVar2 = (n1.c) obj;
                int intValue3 = ((Number) obj2).intValue();
                n2.m mVar2 = (n2.m) obj3;
                int intValue4 = ((Number) obj4).intValue();
                mc.l lVar3 = (mc.l) this.R;
                if ((intValue4 & 6) == 0) {
                    if (((n2.r) mVar2).f(cVar2)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = i14 | intValue4;
                } else {
                    i12 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (((n2.r) mVar2).d(intValue3)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i12 |= i13;
                }
                if ((i12 & 147) != 146) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar2 = (n2.r) mVar2;
                if (rVar2.O(i12 & 1, z11)) {
                    oe.y yVar = (oe.y) this.B.get(intValue3);
                    rVar2.X(-118840910);
                    if (yVar.f10962a == ((s) this.X)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    mc.l lVar4 = this.L;
                    boolean f12 = rVar2.f(lVar4) | rVar2.f(yVar);
                    Object L4 = rVar2.L();
                    Object obj7 = n2.l.f9953a;
                    if (f12 || L4 == obj7) {
                        L4 = new qh.d(lVar4, yVar, 0);
                        rVar2.h0(L4);
                    }
                    mc.a aVar3 = (mc.a) L4;
                    boolean f13 = rVar2.f(lVar3) | rVar2.f(yVar);
                    Object L5 = rVar2.L();
                    if (f13 || L5 == obj7) {
                        L5 = new qh.d(lVar3, yVar, 1);
                        rVar2.h0(L5);
                    }
                    qh.b.a(yVar, z12, aVar3, (mc.a) L5, rVar2, 0);
                    rVar2.p(false);
                } else {
                    rVar2.R();
                }
                return y.f14813a;
            default:
                n1.c cVar3 = (n1.c) obj;
                int intValue5 = ((Number) obj2).intValue();
                n2.m mVar3 = (n2.m) obj3;
                int intValue6 = ((Number) obj4).intValue();
                Object obj8 = (p) this.R;
                if ((intValue6 & 6) == 0) {
                    if (((n2.r) mVar3).f(cVar3)) {
                        i17 = 4;
                    } else {
                        i17 = 2;
                    }
                    i15 = i17 | intValue6;
                } else {
                    i15 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    if (((n2.r) mVar3).d(intValue5)) {
                        i16 = 32;
                    } else {
                        i16 = 16;
                    }
                    i15 |= i16;
                }
                if ((i15 & 147) != 146) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                n2.r rVar3 = (n2.r) mVar3;
                if (rVar3.O(i15 & 1, z13)) {
                    ze.a aVar4 = (ze.a) this.B.get(intValue5);
                    rVar3.X(-568966401);
                    b3.p b11 = r1.b(b3.m.f1770a, 1.0f);
                    Object obj9 = this.L;
                    boolean f14 = rVar3.f(obj9) | rVar3.h(aVar4);
                    Object L6 = rVar3.L();
                    Object obj10 = n2.l.f9953a;
                    if (f14 || L6 == obj10) {
                        L6 = new ai.i(6, obj9, aVar4);
                        rVar3.h0(L6);
                    }
                    mc.a aVar5 = (mc.a) L6;
                    boolean h2 = rVar3.h(obj8) | rVar3.h(aVar4);
                    Object L7 = rVar3.L();
                    if (h2 || L7 == obj10) {
                        L7 = new b2.c(obj8, aVar4, null, 6);
                        rVar3.h0(L7);
                    }
                    u.a(b11, aVar4, aVar5, (mc.l) L7, (d1) this.X, rVar3, 6);
                    rVar3.p(false);
                } else {
                    rVar3.R();
                }
                return y.f14813a;
        }
    }

    public b(List list, mc.l lVar, w0 w0Var, mc.l lVar2) {
        this.B = list;
        this.L = lVar;
        this.X = w0Var;
        this.R = lVar2;
    }

    public b(List list, s sVar, mc.l lVar, mc.l lVar2) {
        this.B = list;
        this.X = sVar;
        this.L = lVar;
        this.R = lVar2;
    }
}
