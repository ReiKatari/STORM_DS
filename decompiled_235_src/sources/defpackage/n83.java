package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n83  reason: default package */
/* loaded from: classes.dex */
public class n83 extends h83 implements jm3 {
    public tt7 m0;

    public n83(tt7 tt7Var) {
        this.m0 = tt7Var;
    }

    @Override // defpackage.h83
    public final tt7 R0(tt7 tt7Var) {
        return new ig7(tt7Var, this.m0);
    }

    @Override // defpackage.h83
    public final void S0() {
        super.S0();
        xk2.w(this);
    }

    @Override // defpackage.jm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        int d = this.l0.d(g34Var, g34Var.getLayoutDirection()) - this.k0.d(g34Var, g34Var.getLayoutDirection());
        int a = this.l0.a(g34Var) - this.k0.a(g34Var);
        int b = (this.l0.b(g34Var, g34Var.getLayoutDirection()) - this.k0.b(g34Var, g34Var.getLayoutDirection())) + d;
        int c = (this.l0.c(g34Var) - this.k0.c(g34Var)) + a;
        dx4 y = x24Var.y(s21.i(j, -b, -c));
        return g34Var.K(s21.g(y.A + b, j), s21.f(y.B + c, j), zt1.A, new m83(y, d, a, 0));
    }
}
