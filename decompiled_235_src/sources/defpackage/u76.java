package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u76  reason: default package */
/* loaded from: classes.dex */
public final class u76 extends zg1 implements fy0, gi4 {
    public f86 m0;
    public lo4 n0;
    public boolean o0;
    public sd2 p0;
    public r94 q0;
    public z70 r0;
    public boolean s0;
    public sg t0;
    public e86 u0;
    public xg1 v0;
    public tg w0;
    public sg x0;
    public boolean y0;

    @Override // defpackage.z64
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.z64
    public final void J0() {
        sg sgVar;
        this.y0 = V0();
        U0();
        if (this.u0 == null) {
            f86 f86Var = this.m0;
            if (this.s0) {
                sgVar = this.x0;
            } else {
                sgVar = this.t0;
            }
            sg sgVar2 = sgVar;
            sd2 sd2Var = this.p0;
            lo4 lo4Var = this.n0;
            boolean z = this.o0;
            boolean z2 = this.y0;
            e86 e86Var = new e86(sgVar2, this.r0, sd2Var, this.q0, lo4Var, f86Var, z, z2);
            R0(e86Var);
            this.u0 = e86Var;
        }
    }

    @Override // defpackage.z64
    public final void K0() {
        xg1 xg1Var = this.v0;
        if (xg1Var != null) {
            S0(xg1Var);
        }
    }

    @Override // defpackage.xg1
    public final void S() {
        sg sgVar;
        boolean V0 = V0();
        if (this.y0 != V0) {
            this.y0 = V0;
            f86 f86Var = this.m0;
            lo4 lo4Var = this.n0;
            boolean z = this.s0;
            if (z) {
                sgVar = this.x0;
            } else {
                sgVar = this.t0;
            }
            sg sgVar2 = sgVar;
            boolean z2 = this.o0;
            W0(sgVar2, this.r0, this.p0, this.q0, lo4Var, f86Var, z, z2);
        }
    }

    public final void U0() {
        sg sgVar;
        xg1 xg1Var = this.v0;
        if (xg1Var == null) {
            if (this.s0) {
                jx2.B(this, new t46(this, 3));
            }
            if (this.s0) {
                sgVar = this.x0;
            } else {
                sgVar = this.t0;
            }
            if (sgVar != null) {
                zg1 zg1Var = sgVar.i;
                if (!zg1Var.A.j0) {
                    R0(zg1Var);
                    this.v0 = zg1Var;
                }
            }
        } else if (!((z64) xg1Var).A.j0) {
            R0(xg1Var);
        }
    }

    public final boolean V0() {
        kk3 kk3Var = kk3.Ltr;
        if (this.j0) {
            kk3Var = nc1.f0(this).v0;
        }
        lo4 lo4Var = this.n0;
        if (kk3Var == kk3.Rtl && lo4Var != lo4.Vertical) {
            return false;
        }
        return true;
    }

    public final void W0(sg sgVar, z70 z70Var, sd2 sd2Var, r94 r94Var, lo4 lo4Var, f86 f86Var, boolean z, boolean z2) {
        boolean z3;
        sg sgVar2;
        this.m0 = f86Var;
        this.n0 = lo4Var;
        boolean z4 = true;
        if (this.s0 != z) {
            this.s0 = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (!nb3.k(this.t0, sgVar)) {
            this.t0 = sgVar;
        } else {
            z4 = false;
        }
        if (z3 || (z4 && !z)) {
            xg1 xg1Var = this.v0;
            if (xg1Var != null) {
                S0(xg1Var);
            }
            this.v0 = null;
            U0();
        }
        this.o0 = z2;
        this.p0 = sd2Var;
        this.q0 = r94Var;
        this.r0 = z70Var;
        boolean V0 = V0();
        this.y0 = V0;
        e86 e86Var = this.u0;
        if (e86Var != null) {
            if (this.s0) {
                sgVar2 = this.x0;
            } else {
                sgVar2 = this.t0;
            }
            e86Var.m1(sgVar2, z70Var, sd2Var, r94Var, lo4Var, f86Var, z2, V0);
        }
    }

    @Override // defpackage.gi4
    public final void l0() {
        sg sgVar;
        tg tgVar = (tg) hf.K(this, xp4.a);
        if (!nb3.k(tgVar, this.w0)) {
            this.w0 = tgVar;
            this.x0 = null;
            xg1 xg1Var = this.v0;
            if (xg1Var != null) {
                S0(xg1Var);
            }
            this.v0 = null;
            U0();
            e86 e86Var = this.u0;
            if (e86Var != null) {
                f86 f86Var = this.m0;
                lo4 lo4Var = this.n0;
                if (this.s0) {
                    sgVar = this.x0;
                } else {
                    sgVar = this.t0;
                }
                sg sgVar2 = sgVar;
                boolean z = this.o0;
                boolean z2 = this.y0;
                e86Var.m1(sgVar2, this.r0, this.p0, this.q0, lo4Var, f86Var, z, z2);
            }
        }
    }
}
