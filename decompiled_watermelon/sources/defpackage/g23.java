package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g23  reason: default package */
/* loaded from: classes.dex */
public class g23 extends a23 implements mf3 {
    public re7 l0;

    public g23(re7 re7Var) {
        this.l0 = re7Var;
    }

    @Override // defpackage.a23
    public final re7 R0(re7 re7Var) {
        return new n27(re7Var, this.l0);
    }

    @Override // defpackage.a23
    public final void S0() {
        super.S0();
        hi2.D(this);
    }

    @Override // defpackage.mf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        int d = this.k0.d(vv3Var, vv3Var.getLayoutDirection()) - this.j0.d(vv3Var, vv3Var.getLayoutDirection());
        int b = this.k0.b(vv3Var) - this.j0.b(vv3Var);
        int c = (this.k0.c(vv3Var, vv3Var.getLayoutDirection()) - this.j0.c(vv3Var, vv3Var.getLayoutDirection())) + d;
        int a = (this.k0.a(vv3Var) - this.j0.a(vv3Var)) + b;
        yn4 c2 = mv3Var.c(nz0.i(j, -c, -a));
        return vv3Var.s0(nz0.g(c2.A + c, j), nz0.f(c2.B + a, j), qp1.A, new f23(c2, d, b, 0));
    }
}
