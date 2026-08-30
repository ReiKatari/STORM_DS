package g2;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d5 implements y3.v0 {

    /* renamed from: b  reason: collision with root package name */
    public static final d5 f5114b = new d5(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5115a;

    public /* synthetic */ d5(int i2) {
        this.f5115a = i2;
    }

    @Override // y3.v0
    public final y3.w0 a(y3.x0 x0Var, List list, long j2) {
        float f8;
        boolean z10;
        int O;
        int max;
        switch (this.f5115a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                boolean z11 = false;
                int i2 = Integer.MIN_VALUE;
                int i10 = Integer.MIN_VALUE;
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    y3.i1 e6 = ((y3.u0) list.get(i12)).e(j2);
                    arrayList.add(e6);
                    y3.q qVar = y3.c.f14665a;
                    if (e6.i0(qVar) != Integer.MIN_VALUE && (i2 == Integer.MIN_VALUE || e6.i0(qVar) < i2)) {
                        i2 = e6.i0(qVar);
                    }
                    y3.q qVar2 = y3.c.f14666b;
                    if (e6.i0(qVar2) != Integer.MIN_VALUE && (i10 == Integer.MIN_VALUE || e6.i0(qVar2) > i10)) {
                        i10 = e6.i0(qVar2);
                    }
                    i11 = Math.max(i11, e6.B);
                }
                if (i2 != Integer.MIN_VALUE && i10 != Integer.MIN_VALUE) {
                    z11 = true;
                }
                if (i2 != i10 && z11) {
                    f8 = e5.f5130g;
                } else {
                    f8 = e5.f5129f;
                }
                int max2 = Math.max(x0Var.O(f8), i11);
                return x0Var.u0(x4.a.h(j2), max2, zb.r.A, new c3(max2, 1, arrayList));
            default:
                int size2 = list.size();
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    if (i14 < size2) {
                        y3.u0 u0Var = (y3.u0) list.get(i14);
                        if (nc.k.a(y3.c0.j(u0Var), "action")) {
                            final y3.i1 e10 = u0Var.e(j2);
                            int h2 = (x4.a.h(j2) - e10.A) - x0Var.O(e5.f5128e);
                            int j10 = x4.a.j(j2);
                            if (h2 >= j10) {
                                j10 = h2;
                            }
                            int size3 = list.size();
                            for (int i15 = 0; i15 < size3; i15++) {
                                y3.u0 u0Var2 = (y3.u0) list.get(i15);
                                if (nc.k.a(y3.c0.j(u0Var2), "text")) {
                                    final y3.i1 e11 = u0Var2.e(x4.a.a(j2, 0, j10, 0, 0, 9));
                                    y3.q qVar3 = y3.c.f14665a;
                                    int i02 = e11.i0(qVar3);
                                    int i03 = e11.i0(y3.c.f14666b);
                                    boolean z12 = true;
                                    if (i02 != Integer.MIN_VALUE && i03 != Integer.MIN_VALUE) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (i02 != i03 && z10) {
                                        z12 = false;
                                    }
                                    final int h10 = x4.a.h(j2) - e10.A;
                                    if (z12) {
                                        max = Math.max(x0Var.O(e5.f5129f), e10.B);
                                        O = (max - e11.B) / 2;
                                        int i04 = e10.i0(qVar3);
                                        if (i04 != Integer.MIN_VALUE) {
                                            i13 = (i02 + O) - i04;
                                        }
                                    } else {
                                        O = x0Var.O(e5.f5124a) - i02;
                                        max = Math.max(x0Var.O(e5.f5130g), e11.B + O);
                                        i13 = (max - e10.B) / 2;
                                    }
                                    final int i16 = O;
                                    final int i17 = i13;
                                    return x0Var.u0(x4.a.h(j2), max, zb.r.A, new mc.l() { // from class: g2.c5
                                        @Override // mc.l
                                        public final Object k(Object obj) {
                                            y3.h1 h1Var = (y3.h1) obj;
                                            y3.h1.n(h1Var, y3.i1.this, 0, i16);
                                            y3.h1.n(h1Var, e10, h10, i17);
                                            return yb.y.f14813a;
                                        }
                                    });
                                }
                            }
                            z4.a.b("Collection contains no element matching the predicate.");
                            wa.b.a();
                        } else {
                            i14++;
                        }
                    } else {
                        z4.a.b("Collection contains no element matching the predicate.");
                        wa.b.a();
                    }
                }
                return null;
        }
    }
}
