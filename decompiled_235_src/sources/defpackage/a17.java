package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a17  reason: default package */
/* loaded from: classes.dex */
public final class a17 extends zg1 implements fy0, m07 {
    public rr6 m0;
    public wc0 n0;
    public k27 o0;
    public s51 p0;
    public ap6 q0;
    public final ii1 r0 = np2.I(new t46(this, 14));
    public of5 s0 = of5.e;

    public a17(rr6 rr6Var, wc0 wc0Var, k27 k27Var, s51 s51Var) {
        this.m0 = rr6Var;
        this.n0 = wc0Var;
        this.o0 = k27Var;
        this.p0 = s51Var;
    }

    @Override // defpackage.z64
    public final void J0() {
        rr6 rr6Var = this.m0;
        rr6Var.L = j87.Attached;
        rr6Var.B = this;
    }

    @Override // defpackage.z64
    public final void K0() {
        rr6 rr6Var = this.m0;
        rr6Var.L = j87.Detached;
        rr6Var.B = null;
    }

    @Override // defpackage.m07
    public final l07 R() {
        return (l07) this.r0.getValue();
    }

    @Override // defpackage.m07
    public final long i(jk3 jk3Var) {
        return l(jk3Var).d();
    }

    @Override // defpackage.m07
    public final of5 l(jk3 jk3Var) {
        if (!this.j0) {
            return this.s0;
        }
        of5 of5Var = (of5) this.p0.g(jk3Var);
        if (of5Var == null) {
            return this.s0;
        }
        this.s0 = of5Var;
        return of5Var;
    }
}
