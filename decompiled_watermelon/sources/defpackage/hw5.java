package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hw5  reason: default package */
/* loaded from: classes.dex */
public final class hw5 extends xc1 implements jv0, m94 {
    public sw5 l0;
    public jf4 m0;
    public boolean n0;
    public a92 o0;
    public l14 p0;
    public v50 q0;
    public boolean r0;
    public eg s0;
    public rw5 t0;
    public vc1 u0;
    public fg v0;
    public eg w0;
    public boolean x0;

    @Override // defpackage.vc1
    public final void C0() {
        eg egVar;
        boolean V0 = V0();
        if (this.x0 != V0) {
            this.x0 = V0;
            sw5 sw5Var = this.l0;
            jf4 jf4Var = this.m0;
            boolean z = this.r0;
            if (z) {
                egVar = this.w0;
            } else {
                egVar = this.s0;
            }
            eg egVar2 = egVar;
            boolean z2 = this.n0;
            W0(egVar2, this.q0, this.o0, this.p0, jf4Var, sw5Var, z, z2);
        }
    }

    @Override // defpackage.yy3
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.yy3
    public final void J0() {
        eg egVar;
        this.x0 = V0();
        U0();
        if (this.t0 == null) {
            sw5 sw5Var = this.l0;
            if (this.r0) {
                egVar = this.w0;
            } else {
                egVar = this.s0;
            }
            eg egVar2 = egVar;
            a92 a92Var = this.o0;
            jf4 jf4Var = this.m0;
            boolean z = this.n0;
            boolean z2 = this.x0;
            rw5 rw5Var = new rw5(egVar2, this.q0, a92Var, this.p0, jf4Var, sw5Var, z, z2);
            R0(rw5Var);
            this.t0 = rw5Var;
        }
    }

    @Override // defpackage.yy3
    public final void K0() {
        vc1 vc1Var = this.u0;
        if (vc1Var != null) {
            S0(vc1Var);
        }
    }

    @Override // defpackage.m94
    public final void Q() {
        eg egVar;
        fg fgVar = (fg) mh7.t(this, ug4.a);
        if (!b53.x(fgVar, this.v0)) {
            this.v0 = fgVar;
            this.w0 = null;
            vc1 vc1Var = this.u0;
            if (vc1Var != null) {
                S0(vc1Var);
            }
            this.u0 = null;
            U0();
            rw5 rw5Var = this.t0;
            if (rw5Var != null) {
                sw5 sw5Var = this.l0;
                jf4 jf4Var = this.m0;
                if (this.r0) {
                    egVar = this.w0;
                } else {
                    egVar = this.s0;
                }
                eg egVar2 = egVar;
                boolean z = this.n0;
                boolean z2 = this.x0;
                rw5Var.m1(egVar2, this.q0, this.o0, this.p0, jf4Var, sw5Var, z, z2);
            }
        }
    }

    public final void U0() {
        eg egVar;
        vc1 vc1Var = this.u0;
        if (vc1Var == null) {
            if (this.r0) {
                nk2.Q(this, new bz2(26, this));
            }
            if (this.r0) {
                egVar = this.w0;
            } else {
                egVar = this.s0;
            }
            if (egVar != null) {
                xc1 xc1Var = egVar.i;
                if (!xc1Var.A.i0) {
                    R0(xc1Var);
                    this.u0 = xc1Var;
                }
            }
        } else if (!((yy3) vc1Var).A.i0) {
            R0(vc1Var);
        }
    }

    public final boolean V0() {
        sd3 sd3Var = sd3.Ltr;
        if (this.i0) {
            sd3Var = l.P(this).u0;
        }
        jf4 jf4Var = this.m0;
        if (sd3Var == sd3.Rtl && jf4Var != jf4.Vertical) {
            return false;
        }
        return true;
    }

    public final void W0(eg egVar, v50 v50Var, a92 a92Var, l14 l14Var, jf4 jf4Var, sw5 sw5Var, boolean z, boolean z2) {
        boolean z3;
        eg egVar2;
        this.l0 = sw5Var;
        this.m0 = jf4Var;
        boolean z4 = true;
        if (this.r0 != z) {
            this.r0 = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (!b53.x(this.s0, egVar)) {
            this.s0 = egVar;
        } else {
            z4 = false;
        }
        if (z3 || (z4 && !z)) {
            vc1 vc1Var = this.u0;
            if (vc1Var != null) {
                S0(vc1Var);
            }
            this.u0 = null;
            U0();
        }
        this.n0 = z2;
        this.o0 = a92Var;
        this.p0 = l14Var;
        this.q0 = v50Var;
        boolean V0 = V0();
        this.x0 = V0;
        rw5 rw5Var = this.t0;
        if (rw5Var != null) {
            if (this.r0) {
                egVar2 = this.w0;
            } else {
                egVar2 = this.s0;
            }
            rw5Var.m1(egVar2, v50Var, a92Var, l14Var, jf4Var, sw5Var, z2, V0);
        }
    }
}
