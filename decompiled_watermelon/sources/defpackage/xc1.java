package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xc1  reason: default package */
/* loaded from: classes.dex */
public abstract class xc1 extends yy3 {
    public final int j0 = n74.e(this);
    public yy3 k0;

    @Override // defpackage.yy3
    public final void H0() {
        super.H0();
        for (yy3 yy3Var = this.k0; yy3Var != null; yy3Var = yy3Var.Y) {
            yy3Var.Q0(this.c0);
            if (!yy3Var.i0) {
                yy3Var.H0();
            }
        }
    }

    @Override // defpackage.yy3
    public final void I0() {
        for (yy3 yy3Var = this.k0; yy3Var != null; yy3Var = yy3Var.Y) {
            yy3Var.I0();
        }
        super.I0();
    }

    @Override // defpackage.yy3
    public final void M0() {
        super.M0();
        for (yy3 yy3Var = this.k0; yy3Var != null; yy3Var = yy3Var.Y) {
            yy3Var.M0();
        }
    }

    @Override // defpackage.yy3
    public final void N0() {
        for (yy3 yy3Var = this.k0; yy3Var != null; yy3Var = yy3Var.Y) {
            yy3Var.N0();
        }
        super.N0();
    }

    @Override // defpackage.yy3
    public final void O0() {
        super.O0();
        for (yy3 yy3Var = this.k0; yy3Var != null; yy3Var = yy3Var.Y) {
            yy3Var.O0();
        }
    }

    @Override // defpackage.yy3
    public final void P0(yy3 yy3Var) {
        this.A = yy3Var;
        for (yy3 yy3Var2 = this.k0; yy3Var2 != null; yy3Var2 = yy3Var2.Y) {
            yy3Var2.P0(yy3Var);
        }
    }

    @Override // defpackage.yy3
    public final void Q0(m74 m74Var) {
        this.c0 = m74Var;
        for (yy3 yy3Var = this.k0; yy3Var != null; yy3Var = yy3Var.Y) {
            yy3Var.Q0(m74Var);
        }
    }

    public final vc1 R0(vc1 vc1Var) {
        yy3 yy3Var;
        yy3 yy3Var2;
        yy3 yy3Var3 = ((yy3) vc1Var).A;
        if (yy3Var3 != vc1Var) {
            if (vc1Var instanceof yy3) {
                yy3Var = (yy3) vc1Var;
            } else {
                yy3Var = null;
            }
            if (yy3Var != null) {
                yy3Var2 = yy3Var.X;
            } else {
                yy3Var2 = null;
            }
            if (yy3Var3 != this.A || !b53.x(yy3Var2, this)) {
                i.n("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (yy3Var3.i0) {
                mz2.c("Cannot delegate to an already attached node");
            }
            yy3Var3.P0(this.A);
            int i = this.L;
            int f = n74.f(yy3Var3);
            yy3Var3.L = f;
            int i2 = this.L;
            int i3 = f & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof mf3)) {
                mz2.c("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + yy3Var3);
            }
            yy3Var3.Y = this.k0;
            this.k0 = yy3Var3;
            yy3Var3.X = this;
            T0(f | this.L, false);
            if (this.i0) {
                if (i3 != 0 && (i & 2) == 0) {
                    zc0 zc0Var = l.P(this).A0;
                    this.A.Q0(null);
                    zc0Var.k();
                } else {
                    Q0(this.c0);
                }
                yy3Var3.H0();
                yy3Var3.N0();
                if (!yy3Var3.i0) {
                    mz2.c("autoInvalidateInsertedNode called on unattached node");
                }
                n74.a(yy3Var3, -1, 1);
            }
        }
        return vc1Var;
    }

    public final void S0(vc1 vc1Var) {
        yy3 yy3Var = null;
        for (yy3 yy3Var2 = this.k0; yy3Var2 != null; yy3Var2 = yy3Var2.Y) {
            if (yy3Var2 == vc1Var) {
                boolean z = yy3Var2.i0;
                if (z) {
                    s14 s14Var = n74.a;
                    if (!z) {
                        mz2.c("autoInvalidateRemovedNode called on unattached node");
                    }
                    n74.a(yy3Var2, -1, 2);
                    yy3Var2.O0();
                    yy3Var2.I0();
                }
                yy3Var2.P0(yy3Var2);
                yy3Var2.R = 0;
                yy3 yy3Var3 = yy3Var2.Y;
                if (yy3Var == null) {
                    this.k0 = yy3Var3;
                } else {
                    yy3Var.Y = yy3Var3;
                }
                yy3Var2.Y = null;
                yy3Var2.X = null;
                int i = this.L;
                int f = n74.f(this);
                T0(f, true);
                if (this.i0 && (i & 2) != 0 && (f & 2) == 0) {
                    zc0 zc0Var = l.P(this).A0;
                    this.A.Q0(null);
                    zc0Var.k();
                    return;
                }
                return;
            }
            yy3Var = yy3Var2;
        }
        f81.p(vc1Var, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [yy3] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final void T0(int i, boolean z) {
        int i2;
        yy3 yy3Var;
        int i3 = this.L;
        this.L = i;
        if (i3 != i) {
            yy3 yy3Var2 = this.A;
            if (yy3Var2 == this) {
                this.R = i;
            }
            boolean z2 = this.i0;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.L;
                    r2.L = i;
                    if (r2 == yy3Var2) {
                        break;
                    }
                    r2 = r2.X;
                }
                if (z && r2 == yy3Var2) {
                    i = n74.f(yy3Var2);
                    yy3Var2.L = i;
                }
                if (r2 != 0 && (yy3Var = r2.Y) != null) {
                    i2 = yy3Var.R;
                } else {
                    i2 = 0;
                }
                int i4 = i | i2;
                for (yy3 yy3Var3 = r2; yy3Var3 != null; yy3Var3 = yy3Var3.X) {
                    i4 |= yy3Var3.L;
                    yy3Var3.R = i4;
                }
            }
        }
    }
}
