package l1;

import g2.k2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j1 extends b3.o implements a4.a0 {

    /* renamed from: i0  reason: collision with root package name */
    public d1 f8578i0;

    @Override // a4.a0
    public final y3.w0 d(y3.x0 x0Var, y3.u0 u0Var, long j2) {
        boolean z10;
        boolean z11;
        boolean z12;
        float c4 = this.f8578i0.c(x0Var.getLayoutDirection());
        float b10 = this.f8578i0.b();
        float d4 = this.f8578i0.d(x0Var.getLayoutDirection());
        float a10 = this.f8578i0.a();
        boolean z13 = false;
        float f8 = 0;
        if (x4.f.a(c4, f8) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (x4.f.a(b10, f8) >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z14 = z10 & z11;
        if (x4.f.a(d4, f8) >= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean z15 = z14 & z12;
        if (x4.f.a(a10, f8) >= 0) {
            z13 = true;
        }
        if (!(z13 & z15)) {
            m1.a.a("Padding must be non-negative");
        }
        int O = x0Var.O(c4);
        int O2 = x0Var.O(d4) + O;
        int O3 = x0Var.O(b10);
        int O4 = x0Var.O(a10) + O3;
        y3.i1 e6 = u0Var.e(x4.b.i(j2, -O2, -O4));
        return x0Var.u0(x4.b.g(e6.A + O2, j2), x4.b.f(e6.B + O4, j2), zb.r.A, new k2(e6, O, O3, 2));
    }
}
