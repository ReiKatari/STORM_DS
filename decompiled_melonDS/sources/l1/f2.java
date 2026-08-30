package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f2 extends b3.o implements a4.a0 {

    /* renamed from: i0  reason: collision with root package name */
    public c0 f8554i0;

    /* renamed from: j0  reason: collision with root package name */
    public mc.p f8555j0;

    @Override // a4.a0
    public final y3.w0 d(final y3.x0 x0Var, y3.u0 u0Var, long j2) {
        int j10;
        int i2 = 0;
        if (this.f8554i0 != c0.Vertical) {
            j10 = 0;
        } else {
            j10 = x4.a.j(j2);
        }
        if (this.f8554i0 == c0.Horizontal) {
            i2 = x4.a.i(j2);
        }
        final y3.i1 e6 = u0Var.e(x4.b.a(j10, x4.a.h(j2), i2, x4.a.g(j2)));
        final int g10 = p7.j.g(e6.A, x4.a.j(j2), x4.a.h(j2));
        final int g11 = p7.j.g(e6.B, x4.a.i(j2), x4.a.g(j2));
        return x0Var.u0(g10, g11, zb.r.A, new mc.l() { // from class: l1.e2
            @Override // mc.l
            public final Object k(Object obj) {
                mc.p pVar = f2.this.f8555j0;
                y3.i1 i1Var = e6;
                y3.h1.l((y3.h1) obj, i1Var, ((x4.j) pVar.j(new x4.l(((g10 - i1Var.A) << 32) | ((g11 - i1Var.B) & 4294967295L)), x0Var.getLayoutDirection())).f14340a);
                return yb.y.f14813a;
            }
        });
    }
}
