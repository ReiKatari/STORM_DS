package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: na0  reason: default package */
/* loaded from: classes.dex */
public final class na0 extends z64 implements gi4, c90, mo1 {
    public final oa0 k0;
    public boolean l0;
    public qn2 m0;

    public na0(oa0 oa0Var, qn2 qn2Var) {
        this.k0 = oa0Var;
        this.m0 = qn2Var;
        oa0Var.A = this;
    }

    @Override // defpackage.z64
    public final void L0() {
        R0();
    }

    @Override // defpackage.mo1
    public final void O() {
        R0();
    }

    public final void R0() {
        this.l0 = false;
        this.k0.B = null;
        f04.I(this);
    }

    @Override // defpackage.xg1
    public final void S() {
        R0();
    }

    @Override // defpackage.c90
    public final qh1 a() {
        return nc1.f0(this).u0;
    }

    @Override // defpackage.xg1, defpackage.yy4
    public final void d() {
        R0();
    }

    @Override // defpackage.c90
    public final long e() {
        return qo2.S(nc1.d0(this, 4).L);
    }

    @Override // defpackage.c90
    public final kk3 getLayoutDirection() {
        return nc1.f0(this).v0;
    }

    @Override // defpackage.gi4
    public final void l0() {
        R0();
    }

    @Override // defpackage.mo1
    public final void m0(um3 um3Var) {
        boolean z = this.l0;
        oa0 oa0Var = this.k0;
        if (!z) {
            oa0Var.B = null;
            jx2.B(this, new le(3, this, oa0Var));
            if (oa0Var.B != null) {
                this.l0 = true;
            } else {
                throw i61.e("DrawResult not defined, did you forget to call onDraw?");
            }
        }
        d51 d51Var = oa0Var.B;
        d51Var.getClass();
        ((qn2) d51Var.B).g(um3Var);
    }

    @Override // defpackage.z64
    public final void K0() {
    }
}
