package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zg1  reason: default package */
/* loaded from: classes.dex */
public abstract class zg1 extends z64 {
    public final int k0 = fg4.e(this);
    public z64 l0;

    @Override // defpackage.z64
    public final void H0() {
        super.H0();
        for (z64 z64Var = this.l0; z64Var != null; z64Var = z64Var.Y) {
            z64Var.Q0(this.d0);
            if (!z64Var.j0) {
                z64Var.H0();
            }
        }
    }

    @Override // defpackage.z64
    public final void I0() {
        for (z64 z64Var = this.l0; z64Var != null; z64Var = z64Var.Y) {
            z64Var.I0();
        }
        super.I0();
    }

    @Override // defpackage.z64
    public final void M0() {
        super.M0();
        for (z64 z64Var = this.l0; z64Var != null; z64Var = z64Var.Y) {
            z64Var.M0();
        }
    }

    @Override // defpackage.z64
    public final void N0() {
        for (z64 z64Var = this.l0; z64Var != null; z64Var = z64Var.Y) {
            z64Var.N0();
        }
        super.N0();
    }

    @Override // defpackage.z64
    public final void O0() {
        super.O0();
        for (z64 z64Var = this.l0; z64Var != null; z64Var = z64Var.Y) {
            z64Var.O0();
        }
    }

    @Override // defpackage.z64
    public final void P0(z64 z64Var) {
        this.A = z64Var;
        for (z64 z64Var2 = this.l0; z64Var2 != null; z64Var2 = z64Var2.Y) {
            z64Var2.P0(z64Var);
        }
    }

    @Override // defpackage.z64
    public final void Q0(eg4 eg4Var) {
        this.d0 = eg4Var;
        for (z64 z64Var = this.l0; z64Var != null; z64Var = z64Var.Y) {
            z64Var.Q0(eg4Var);
        }
    }

    public final xg1 R0(xg1 xg1Var) {
        z64 z64Var;
        z64 z64Var2;
        z64 z64Var3 = ((z64) xg1Var).A;
        if (z64Var3 != xg1Var) {
            if (xg1Var instanceof z64) {
                z64Var = (z64) xg1Var;
            } else {
                z64Var = null;
            }
            if (z64Var != null) {
                z64Var2 = z64Var.X;
            } else {
                z64Var2 = null;
            }
            if (z64Var3 != this.A || !nb3.k(z64Var2, this)) {
                i.m("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (z64Var3.j0) {
                p53.c("Cannot delegate to an already attached node");
            }
            z64Var3.P0(this.A);
            int i = this.L;
            int f = fg4.f(z64Var3);
            z64Var3.L = f;
            int i2 = this.L;
            int i3 = f & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof jm3)) {
                p53.c("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + z64Var3);
            }
            z64Var3.Y = this.l0;
            this.l0 = z64Var3;
            z64Var3.X = this;
            T0(f | this.L, false);
            if (this.j0) {
                if (i3 != 0 && (i & 2) == 0) {
                    if0 if0Var = nc1.f0(this).B0;
                    this.A.Q0(null);
                    if0Var.k();
                } else {
                    Q0(this.d0);
                }
                z64Var3.H0();
                z64Var3.N0();
                if (!z64Var3.j0) {
                    p53.c("autoInvalidateInsertedNode called on unattached node");
                }
                fg4.a(z64Var3, -1, 1);
            }
        }
        return xg1Var;
    }

    public final void S0(xg1 xg1Var) {
        z64 z64Var = null;
        for (z64 z64Var2 = this.l0; z64Var2 != null; z64Var2 = z64Var2.Y) {
            if (z64Var2 == xg1Var) {
                boolean z = z64Var2.j0;
                if (z) {
                    y94 y94Var = fg4.a;
                    if (!z) {
                        p53.c("autoInvalidateRemovedNode called on unattached node");
                    }
                    fg4.a(z64Var2, -1, 2);
                    z64Var2.O0();
                    z64Var2.I0();
                }
                z64Var2.P0(z64Var2);
                z64Var2.R = 0;
                z64 z64Var3 = z64Var2.Y;
                if (z64Var == null) {
                    this.l0 = z64Var3;
                } else {
                    z64Var.Y = z64Var3;
                }
                z64Var2.Y = null;
                z64Var2.X = null;
                int i = this.L;
                int f = fg4.f(this);
                T0(f, true);
                if (this.j0 && (i & 2) != 0 && (f & 2) == 0) {
                    if0 if0Var = nc1.f0(this).B0;
                    this.A.Q0(null);
                    if0Var.k();
                    return;
                }
                return;
            }
            z64Var = z64Var2;
        }
        e41.h(xg1Var, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [z64] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final void T0(int i, boolean z) {
        int i2;
        z64 z64Var;
        int i3 = this.L;
        this.L = i;
        if (i3 != i) {
            z64 z64Var2 = this.A;
            if (z64Var2 == this) {
                this.R = i;
            }
            boolean z2 = this.j0;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.L;
                    r2.L = i;
                    if (r2 == z64Var2) {
                        break;
                    }
                    r2 = r2.X;
                }
                if (z && r2 == z64Var2) {
                    i = fg4.f(z64Var2);
                    z64Var2.L = i;
                }
                if (r2 != 0 && (z64Var = r2.Y) != null) {
                    i2 = z64Var.R;
                } else {
                    i2 = 0;
                }
                int i4 = i | i2;
                for (z64 z64Var3 = r2; z64Var3 != null; z64Var3 = z64Var3.X) {
                    i4 |= z64Var3.L;
                    z64Var3.R = i4;
                }
            }
        }
    }
}
