package l1;

import g2.k2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class o0 extends l0 implements a4.a0 {

    /* renamed from: k0  reason: collision with root package name */
    public b2 f8592k0;

    public o0(b2 b2Var) {
        this.f8592k0 = b2Var;
    }

    @Override // l1.l0
    public final b2 O0(b2 b2Var) {
        return new v1(b2Var, this.f8592k0);
    }

    @Override // l1.l0
    public final void P0() {
        super.P0();
        a4.l.k(this);
    }

    @Override // a4.a0
    public final y3.w0 d(y3.x0 x0Var, y3.u0 u0Var, long j2) {
        int c4 = this.f8582j0.c(x0Var, x0Var.getLayoutDirection()) - this.f8581i0.c(x0Var, x0Var.getLayoutDirection());
        int d4 = this.f8582j0.d(x0Var) - this.f8581i0.d(x0Var);
        int b10 = (this.f8582j0.b(x0Var, x0Var.getLayoutDirection()) - this.f8581i0.b(x0Var, x0Var.getLayoutDirection())) + c4;
        int a10 = (this.f8582j0.a(x0Var) - this.f8581i0.a(x0Var)) + d4;
        y3.i1 e6 = u0Var.e(x4.b.i(j2, -b10, -a10));
        return x0Var.u0(x4.b.g(e6.A + b10, j2), x4.b.f(e6.B + a10, j2), zb.r.A, new k2(e6, c4, d4, 1));
    }
}
