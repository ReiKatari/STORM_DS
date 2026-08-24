package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ym1  reason: default package */
/* loaded from: classes.dex */
public final class ym1 extends z64 implements ub7, kj3 {
    public ym1 k0;
    public ym1 l0;
    public long m0;

    @Override // defpackage.z64
    public final void K0() {
        this.l0 = null;
        this.k0 = null;
    }

    public final boolean R0() {
        ym1 ym1Var = this.k0;
        if (ym1Var == null) {
            ym1 ym1Var2 = this.l0;
            if (ym1Var2 != null) {
                return ym1Var2.R0();
            }
            return false;
        }
        return ym1Var.R0();
    }

    public final void S0() {
        ym1 ym1Var = this.l0;
        if (ym1Var == null) {
            ym1 ym1Var2 = this.k0;
            if (ym1Var2 != null) {
                ym1Var2.S0();
                return;
            }
            return;
        }
        ym1Var.S0();
    }

    public final void T0() {
        ym1 ym1Var = this.l0;
        if (ym1Var != null) {
            ym1Var.T0();
        }
        ym1 ym1Var2 = this.k0;
        if (ym1Var2 != null) {
            ym1Var2.T0();
        }
        this.k0 = null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [dh5, java.lang.Object] */
    public final void U0(d51 d51Var) {
        ub7 ub7Var;
        ym1 ym1Var;
        ym1 ym1Var2 = this.k0;
        if (ym1Var2 != null && jw2.f(ym1Var2, mb3.E(d51Var))) {
            ym1Var = ym1Var2;
        } else {
            if (!this.A.j0) {
                ub7Var = null;
            } else {
                ?? obj = new Object();
                ii2.Y(this, new ln(obj, this, d51Var, 2));
                ub7Var = (ub7) obj.A;
            }
            ym1Var = (ym1) ub7Var;
        }
        if (ym1Var != null && ym1Var2 == null) {
            ym1Var.S0();
            ym1Var.U0(d51Var);
            ym1 ym1Var3 = this.l0;
            if (ym1Var3 != null) {
                ym1Var3.T0();
            }
        } else if (ym1Var == null && ym1Var2 != null) {
            ym1 ym1Var4 = this.l0;
            if (ym1Var4 != null) {
                ym1Var4.S0();
                ym1Var4.U0(d51Var);
            }
            ym1Var2.T0();
        } else if (!nb3.k(ym1Var, ym1Var2)) {
            if (ym1Var != null) {
                ym1Var.S0();
                ym1Var.U0(d51Var);
            }
            if (ym1Var2 != null) {
                ym1Var2.T0();
            }
        } else if (ym1Var != null) {
            ym1Var.U0(d51Var);
        } else {
            ym1 ym1Var5 = this.l0;
            if (ym1Var5 != null) {
                ym1Var5.U0(d51Var);
            }
        }
        this.k0 = ym1Var;
    }

    public final void V0() {
        ym1 ym1Var = this.l0;
        if (ym1Var == null) {
            ym1 ym1Var2 = this.k0;
            if (ym1Var2 != null) {
                ym1Var2.V0();
                return;
            }
            return;
        }
        ym1Var.V0();
    }

    @Override // defpackage.kj3, defpackage.j34
    public final void b(long j) {
        this.m0 = j;
    }

    @Override // defpackage.ub7
    public final Object n() {
        return vs0.f0;
    }
}
