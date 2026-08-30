package o2;

import n2.h2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends ek.a {

    /* renamed from: d  reason: collision with root package name */
    public static final j f10642d = new ek.a(0, 2, 1);

    @Override // ek.a
    public final void c(f2.s sVar, n2.c cVar, h2 h2Var, v2.i iVar, j0 j0Var) {
        int i2;
        int i10;
        v2.d dVar = (v2.d) sVar.f(0);
        int c4 = h2Var.c((n2.a) sVar.f(1));
        if (h2Var.f9922t >= c4) {
            n2.t.a("Check failed");
        }
        k7.w.B(h2Var, cVar, c4);
        int i11 = h2Var.f9922t;
        int i12 = h2Var.f9924v;
        while (i12 >= 0 && !h2Var.y(i12)) {
            i12 = h2Var.E(h2Var.f9905b, i12);
        }
        int i13 = i12 + 1;
        int i14 = 0;
        while (i13 < i11) {
            if (h2Var.v(i11, i13)) {
                if (h2Var.y(i13)) {
                    i14 = 0;
                }
                i13++;
            } else {
                if (h2Var.y(i13)) {
                    i10 = 1;
                } else {
                    i10 = h2Var.f9905b[(h2Var.r(i13) * 5) + 1] & 67108863;
                }
                i14 += i10;
                i13 += h2Var.u(i13);
            }
        }
        while (true) {
            i2 = h2Var.f9922t;
            if (i2 >= c4) {
                break;
            } else if (h2Var.v(c4, i2)) {
                int i15 = h2Var.f9922t;
                if (i15 < h2Var.f9923u && (h2Var.f9905b[(h2Var.r(i15) * 5) + 1] & 1073741824) != 0) {
                    cVar.e(h2Var.D(h2Var.f9922t));
                    i14 = 0;
                }
                h2Var.P();
            } else {
                i14 += h2Var.L();
            }
        }
        if (i2 != c4) {
            n2.t.a("Check failed");
        }
        dVar.f13611a = i14;
    }
}
