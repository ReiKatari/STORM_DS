package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f80  reason: default package */
/* loaded from: classes.dex */
public final class f80 extends yy3 implements m94, x60, gk1 {
    public final g80 j0;
    public boolean k0;
    public mi2 l0;

    public f80(g80 g80Var, mi2 mi2Var) {
        this.j0 = g80Var;
        this.l0 = mi2Var;
        g80Var.A = this;
    }

    @Override // defpackage.vc1
    public final void C0() {
        R0();
    }

    @Override // defpackage.yy3
    public final void L0() {
        R0();
    }

    @Override // defpackage.m94
    public final void Q() {
        R0();
    }

    public final void R0() {
        this.k0 = false;
        this.j0.B = null;
        n40.M(this);
    }

    @Override // defpackage.gk1
    public final void T(xf3 xf3Var) {
        boolean z = this.k0;
        g80 g80Var = this.j0;
        if (!z) {
            g80Var.B = null;
            nk2.Q(this, new wd(3, this, g80Var));
            if (g80Var.B != null) {
                this.k0 = true;
            } else {
                throw b31.e("DrawResult not defined, did you forget to call onDraw?");
            }
        }
        t71 t71Var = g80Var.B;
        t71Var.getClass();
        ((mi2) t71Var.B).n(xf3Var);
    }

    @Override // defpackage.vc1
    public final void a() {
        R0();
    }

    @Override // defpackage.x60
    public final od1 b() {
        return l.P(this).t0;
    }

    @Override // defpackage.x60
    public final long d() {
        return hk2.U(l.N(this, 4).L);
    }

    @Override // defpackage.x60
    public final sd3 getLayoutDirection() {
        return l.P(this).u0;
    }

    @Override // defpackage.gk1
    public final void x0() {
        R0();
    }

    @Override // defpackage.yy3
    public final void K0() {
    }
}
