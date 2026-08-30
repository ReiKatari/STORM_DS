package o2;

import n2.h2;
import n2.p1;
import n2.y1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 extends ek.a {

    /* renamed from: d  reason: collision with root package name */
    public static final e0 f10633d = new ek.a(1, 0, 2);

    @Override // ek.a
    public final void c(f2.s sVar, n2.c cVar, h2 h2Var, v2.i iVar, j0 j0Var) {
        int e6 = sVar.e(0);
        int i2 = h2Var.f9924v;
        int N = h2Var.N(h2Var.f9905b, h2Var.r(i2));
        int g10 = h2Var.g(h2Var.f9905b, h2Var.r(i2 + 1));
        for (int max = Math.max(N, g10 - e6); max < g10; max++) {
            Object obj = h2Var.f9906c[h2Var.h(max)];
            if (obj instanceof y1) {
                iVar.e((y1) obj);
            } else if (obj instanceof p1) {
                ((p1) obj).c();
            }
        }
        if (e6 <= 0) {
            n2.t.a("Check failed");
        }
        int i10 = h2Var.f9924v;
        int N2 = h2Var.N(h2Var.f9905b, h2Var.r(i10));
        int g11 = h2Var.g(h2Var.f9905b, h2Var.r(i10 + 1)) - e6;
        if (g11 < N2) {
            n2.t.a("Check failed");
        }
        h2Var.J(g11, e6, i10);
        int i11 = h2Var.f9912i;
        if (i11 >= N2) {
            h2Var.f9912i = i11 - e6;
        }
    }
}
