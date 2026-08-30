package g2;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w5 implements y3.v0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5453a;

    /* renamed from: b  reason: collision with root package name */
    public final yb.d f5454b;

    public /* synthetic */ w5(yb.d dVar, int i2) {
        this.f5453a = i2;
        this.f5454b = dVar;
    }

    @Override // y3.v0
    public final y3.w0 a(final y3.x0 x0Var, List list, long j2) {
        final y3.i1 i1Var;
        int i2;
        final Integer num;
        final Integer num2;
        switch (this.f5453a) {
            case 0:
                if (((mc.p) this.f5454b) != null) {
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        y3.u0 u0Var = (y3.u0) list.get(i10);
                        if (nc.k.a(y3.c0.j(u0Var), "text")) {
                            i1Var = u0Var.e(x4.a.a(j2, 0, 0, 0, 0, 11));
                        }
                    }
                    z4.a.b("Collection contains no element matching the predicate.");
                    wa.b.a();
                    return null;
                }
                i1Var = null;
                if (i1Var != null) {
                    i2 = i1Var.A;
                } else {
                    i2 = 0;
                }
                final int max = Math.max(i2, 0);
                final int O = x0Var.O(x5.f5475a);
                if (i1Var != null) {
                    num = Integer.valueOf(i1Var.i0(y3.c.f14665a));
                } else {
                    num = null;
                }
                if (i1Var != null) {
                    num2 = Integer.valueOf(i1Var.i0(y3.c.f14666b));
                } else {
                    num2 = null;
                }
                return x0Var.u0(max, O, zb.r.A, new mc.l() { // from class: g2.v5
                    @Override // mc.l
                    public final Object k(Object obj) {
                        float f8;
                        y3.h1 h1Var = (y3.h1) obj;
                        y3.i1 i1Var2 = y3.i1.this;
                        y3.i1 i1Var3 = r2;
                        int i11 = O;
                        if (i1Var2 != null && i1Var3 != null) {
                            Integer num3 = num;
                            num3.getClass();
                            int intValue = num3.intValue();
                            Integer num4 = num2;
                            num4.getClass();
                            int intValue2 = num4.intValue();
                            if (intValue == intValue2) {
                                f8 = x5.f5477c;
                            } else {
                                f8 = x5.f5478d;
                            }
                            y3.x0 x0Var2 = x0Var;
                            int O2 = x0Var2.O(c6.f5075c) + x0Var2.O(f8);
                            int G = (x0Var2.G(x5.f5479e) + i1Var3.B) - intValue;
                            int i12 = i1Var2.A;
                            int i13 = max;
                            int i14 = (i11 - intValue2) - O2;
                            y3.h1.n(h1Var, i1Var2, (i13 - i12) / 2, i14);
                            y3.h1.n(h1Var, i1Var3, (i13 - i1Var3.A) / 2, i14 - G);
                        } else if (i1Var2 != null) {
                            float f10 = x5.f5475a;
                            y3.h1.n(h1Var, i1Var2, 0, (i11 - i1Var2.B) / 2);
                        } else if (i1Var3 != null) {
                            float f11 = x5.f5475a;
                            y3.h1.n(h1Var, i1Var3, 0, (i11 - i1Var3.B) / 2);
                        }
                        return yb.y.f14813a;
                    }
                });
            default:
                return x0Var.u0(x4.a.h(j2), x4.a.g(j2), zb.r.A, new he.g(28, list, this));
        }
    }
}
