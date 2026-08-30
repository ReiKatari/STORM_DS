package lg;

import ai.a1;
import b3.p;
import java.util.ArrayList;
import java.util.List;
import l1.r1;
import mc.r;
import me.magnum.melonds.common.camera.DSiCameraSource;
import oe.q;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n implements r {
    public final /* synthetic */ int A;
    public final /* synthetic */ List B;
    public final /* synthetic */ mc.l L;

    public /* synthetic */ n(List list, mc.l lVar, int i2) {
        this.A = i2;
        this.B = list;
        this.L = lVar;
    }

    @Override // mc.r
    public final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        boolean z10;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        int i14;
        int i15;
        boolean z12;
        int i16;
        int i17;
        int i18;
        boolean z13;
        int i19;
        int i20;
        int i21;
        boolean z14;
        int i22;
        int i23;
        switch (this.A) {
            case 0:
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
                    oe.f fVar = (oe.f) this.B.get(intValue);
                    rVar.X(1158729181);
                    p b10 = r1.b(b3.m.f1770a, 1.0f);
                    mc.l lVar = this.L;
                    boolean f8 = rVar.f(lVar) | rVar.f(fVar);
                    Object L = rVar.L();
                    if (f8 || L == n2.l.f9953a) {
                        L = new ai.i(2, lVar, fVar);
                        rVar.h0(L);
                    }
                    ng.b.a(b10, fVar, (mc.a) L, rVar, 6);
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
                    oe.c cVar3 = (oe.c) this.B.get(intValue3);
                    rVar2.X(-476599689);
                    p b11 = r1.b(b3.m.f1770a, 1.0f);
                    mc.l lVar2 = this.L;
                    boolean f10 = rVar2.f(lVar2) | rVar2.h(cVar3);
                    Object L2 = rVar2.L();
                    if (f10 || L2 == n2.l.f9953a) {
                        L2 = new ai.i(3, lVar2, cVar3);
                        rVar2.h0(L2);
                    }
                    ng.b.c(b11, cVar3, (mc.a) L2, rVar2, 6);
                    rVar2.p(false);
                } else {
                    rVar2.R();
                }
                return y.f14813a;
            case 2:
                n1.c cVar4 = (n1.c) obj;
                int intValue5 = ((Number) obj2).intValue();
                n2.m mVar3 = (n2.m) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    if (((n2.r) mVar3).f(cVar4)) {
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
                    z12 = true;
                } else {
                    z12 = false;
                }
                n2.r rVar3 = (n2.r) mVar3;
                if (rVar3.O(i15 & 1, z12)) {
                    q qVar = (q) this.B.get(intValue5);
                    rVar3.X(-196696351);
                    p b12 = r1.b(b3.m.f1770a, 1.0f);
                    mc.l lVar3 = this.L;
                    boolean f11 = rVar3.f(lVar3) | rVar3.h(qVar);
                    Object L3 = rVar3.L();
                    if (f11 || L3 == n2.l.f9953a) {
                        L3 = new ai.i(4, lVar3, qVar);
                        rVar3.h0(L3);
                    }
                    ng.b.d(b12, qVar, (mc.a) L3, rVar3, 6);
                    rVar3.p(false);
                } else {
                    rVar3.R();
                }
                return y.f14813a;
            case 3:
                n1.c cVar5 = (n1.c) obj;
                int intValue7 = ((Number) obj2).intValue();
                n2.m mVar4 = (n2.m) obj3;
                int intValue8 = ((Number) obj4).intValue();
                if ((intValue8 & 6) == 0) {
                    if (((n2.r) mVar4).f(cVar5)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i18 = i20 | intValue8;
                } else {
                    i18 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    if (((n2.r) mVar4).d(intValue7)) {
                        i19 = 32;
                    } else {
                        i19 = 16;
                    }
                    i18 |= i19;
                }
                if ((i18 & 147) != 146) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                n2.r rVar4 = (n2.r) mVar4;
                if (rVar4.O(i18 & 1, z13)) {
                    pg.c cVar6 = (pg.c) this.B.get(intValue7);
                    rVar4.X(-1915856614);
                    p b13 = r1.b(b3.m.f1770a, 1.0f);
                    mc.l lVar4 = this.L;
                    boolean f12 = rVar4.f(lVar4) | rVar4.f(cVar6);
                    Object L4 = rVar4.L();
                    if (f12 || L4 == n2.l.f9953a) {
                        L4 = new a1(lVar4, cVar6, 1);
                        rVar4.h0(L4);
                    }
                    ai.n.q(b13, cVar6, (mc.a) L4, 52, rVar4, 3078, 0);
                    rVar4.p(false);
                } else {
                    rVar4.R();
                }
                return y.f14813a;
            default:
                n1.c cVar7 = (n1.c) obj;
                int intValue9 = ((Number) obj2).intValue();
                n2.m mVar5 = (n2.m) obj3;
                int intValue10 = ((Number) obj4).intValue();
                if ((intValue10 & 6) == 0) {
                    if (((n2.r) mVar5).f(cVar7)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i21 = i23 | intValue10;
                } else {
                    i21 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    if (((n2.r) mVar5).d(intValue9)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i21 |= i22;
                }
                if ((i21 & 147) != 146) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                n2.r rVar5 = (n2.r) mVar5;
                if (rVar5.O(i21 & 1, z14)) {
                    pg.c cVar8 = (pg.c) ((ArrayList) this.B).get(intValue9);
                    rVar5.X(1213764447);
                    p b14 = r1.b(b3.m.f1770a, 1.0f);
                    mc.l lVar5 = this.L;
                    boolean f13 = rVar5.f(lVar5) | rVar5.f(cVar8);
                    Object L5 = rVar5.L();
                    if (f13 || L5 == n2.l.f9953a) {
                        L5 = new a1(lVar5, cVar8, 0);
                        rVar5.h0(L5);
                    }
                    ai.n.q(b14, cVar8, (mc.a) L5, 0.0f, rVar5, 6, 8);
                    rVar5.p(false);
                } else {
                    rVar5.R();
                }
                return y.f14813a;
        }
    }
}
