package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: si1  reason: default package */
/* loaded from: classes.dex */
public final class si1 extends yy3 implements zx6, sc3 {
    public si1 j0;
    public si1 k0;
    public long l0;

    @Override // defpackage.yy3
    public final void K0() {
        this.k0 = null;
        this.j0 = null;
    }

    public final boolean R0() {
        si1 si1Var = this.j0;
        if (si1Var == null) {
            si1 si1Var2 = this.k0;
            if (si1Var2 != null) {
                return si1Var2.R0();
            }
            return false;
        }
        return si1Var.R0();
    }

    public final void S0() {
        si1 si1Var = this.k0;
        if (si1Var == null) {
            si1 si1Var2 = this.j0;
            if (si1Var2 != null) {
                si1Var2.S0();
                return;
            }
            return;
        }
        si1Var.S0();
    }

    public final void T0() {
        si1 si1Var = this.k0;
        if (si1Var != null) {
            si1Var.T0();
        }
        si1 si1Var2 = this.j0;
        if (si1Var2 != null) {
            si1Var2.T0();
        }
        this.j0 = null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, n75] */
    public final void U0(t71 t71Var) {
        zx6 zx6Var;
        si1 si1Var;
        si1 si1Var2 = this.j0;
        if (si1Var2 != null && l.m(si1Var2, se.F(t71Var))) {
            si1Var = si1Var2;
        } else {
            if (!this.A.i0) {
                zx6Var = null;
            } else {
                ?? obj = new Object();
                ve2.Z(this, new zm(obj, this, t71Var, 2));
                zx6Var = (zx6) obj.A;
            }
            si1Var = (si1) zx6Var;
        }
        if (si1Var != null && si1Var2 == null) {
            si1Var.S0();
            si1Var.U0(t71Var);
            si1 si1Var3 = this.k0;
            if (si1Var3 != null) {
                si1Var3.T0();
            }
        } else if (si1Var == null && si1Var2 != null) {
            si1 si1Var4 = this.k0;
            if (si1Var4 != null) {
                si1Var4.S0();
                si1Var4.U0(t71Var);
            }
            si1Var2.T0();
        } else if (!b53.x(si1Var, si1Var2)) {
            if (si1Var != null) {
                si1Var.S0();
                si1Var.U0(t71Var);
            }
            if (si1Var2 != null) {
                si1Var2.T0();
            }
        } else if (si1Var != null) {
            si1Var.U0(t71Var);
        } else {
            si1 si1Var5 = this.k0;
            if (si1Var5 != null) {
                si1Var5.U0(t71Var);
            }
        }
        this.j0 = si1Var;
    }

    public final void V0() {
        si1 si1Var = this.k0;
        if (si1Var == null) {
            si1 si1Var2 = this.j0;
            if (si1Var2 != null) {
                si1Var2.V0();
                return;
            }
            return;
        }
        si1Var.V0();
    }

    @Override // defpackage.sc3, defpackage.yv3
    public final void c(long j) {
        this.l0 = j;
    }

    @Override // defpackage.zx6
    public final Object t() {
        return y60.r0;
    }
}
