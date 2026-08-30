package g2;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class d6 implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ v2.c B;
    public final /* synthetic */ mc.p L;
    public final /* synthetic */ v2.c R;

    public /* synthetic */ d6(v2.c cVar, mc.p pVar, v2.c cVar2, int i2) {
        this.A = i2;
        this.B = cVar;
        this.L = pVar;
        this.R = cVar2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        Object obj3;
        final int i2;
        boolean z10;
        switch (this.A) {
            case 0:
                final y3.r1 r1Var = (y3.r1) obj;
                final x4.a aVar = (x4.a) obj2;
                final int h2 = x4.a.h(aVar.f14337a);
                List D = r1Var.D(h6.Tabs, this.B);
                int size = D.size();
                final int i10 = h2 / size;
                final ArrayList arrayList = new ArrayList(D.size());
                int size2 = D.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    arrayList.add(((y3.u0) D.get(i11)).e(x4.a.a(aVar.f14337a, i10, i10, 0, 0, 12)));
                }
                if (arrayList.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = arrayList.get(0);
                    int i12 = ((y3.i1) obj3).B;
                    int i13 = 1;
                    int size3 = arrayList.size() - 1;
                    if (1 <= size3) {
                        while (true) {
                            Object obj4 = arrayList.get(i13);
                            int i14 = ((y3.i1) obj4).B;
                            if (i12 < i14) {
                                obj3 = obj4;
                                i12 = i14;
                            }
                            if (i13 != size3) {
                                i13++;
                            }
                        }
                    }
                }
                y3.i1 i1Var = (y3.i1) obj3;
                if (i1Var != null) {
                    i2 = i1Var.B;
                } else {
                    i2 = 0;
                }
                final ArrayList arrayList2 = new ArrayList(size);
                for (int i15 = 0; i15 < size; i15++) {
                    arrayList2.add(new y5(r1Var.t0(i10) * i15, r1Var.t0(i10)));
                }
                final mc.p pVar = this.L;
                final v2.c cVar = this.R;
                return r1Var.u0(h2, i2, zb.r.A, new mc.l() { // from class: g2.e6
                    @Override // mc.l
                    public final Object k(Object obj5) {
                        int i16;
                        boolean z11;
                        boolean z12;
                        y3.h1 h1Var = (y3.h1) obj5;
                        ArrayList arrayList3 = arrayList;
                        int size4 = arrayList3.size();
                        for (int i17 = 0; i17 < size4; i17++) {
                            y3.h1.n(h1Var, (y3.i1) arrayList3.get(i17), i10 * i17, 0);
                        }
                        h6 h6Var = h6.Divider;
                        y3.r1 r1Var2 = r1Var;
                        List D2 = r1Var2.D(h6Var, pVar);
                        int size5 = D2.size();
                        int i18 = 0;
                        while (true) {
                            i16 = i2;
                            if (i18 >= size5) {
                                break;
                            }
                            y3.i1 e6 = ((y3.u0) D2.get(i18)).e(x4.a.a(aVar.f14337a, 0, 0, 0, 0, 11));
                            y3.h1.n(h1Var, e6, 0, i16 - e6.B);
                            i18++;
                        }
                        List D3 = r1Var2.D(h6.Indicator, new v2.c(-220665376, true, new ai.r0(12, cVar, arrayList2)));
                        int size6 = D3.size();
                        for (int i19 = 0; i19 < size6; i19++) {
                            y3.u0 u0Var = (y3.u0) D3.get(i19);
                            int i20 = h2;
                            if (i20 >= 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (i16 >= 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!(z11 & z12)) {
                                x4.i.a("width and height must be >= 0");
                            }
                            y3.h1.n(h1Var, u0Var.e(x4.b.h(i20, i20, i16, i16)), 0, 0);
                        }
                        return yb.y.f14813a;
                    }
                });
            default:
                n2.m mVar = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    b3.p b10 = l1.r1.b(b3.m.f1770a, 1.0f);
                    v2.c cVar2 = this.B;
                    boolean f8 = rVar.f(cVar2);
                    mc.p pVar2 = this.L;
                    boolean f10 = f8 | rVar.f(pVar2);
                    v2.c cVar3 = this.R;
                    boolean f11 = f10 | rVar.f(cVar3);
                    Object L = rVar.L();
                    if (f11 || L == n2.l.f9953a) {
                        L = new d6(cVar2, pVar2, cVar3, 0);
                        rVar.h0(L);
                    }
                    y3.c0.b(b10, (mc.p) L, rVar, 6, 0);
                } else {
                    rVar.R();
                }
                return yb.y.f14813a;
        }
    }
}
