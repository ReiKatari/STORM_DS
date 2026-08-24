package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wm3  reason: default package */
/* loaded from: classes.dex */
public final class wm3 {
    public final sm3 a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public rz3 q;
    public om3 d = om3.Idle;
    public final d34 p = new d34(this);

    public wm3(sm3 sm3Var) {
        this.a = sm3Var;
    }

    public final eg4 a() {
        return (eg4) this.a.B0.e;
    }

    public final void b() {
        om3 om3Var = this.a.C0.d;
        if (om3Var == om3.LayingOut || om3Var == om3.LookaheadLayingOut) {
            if (this.p.w0) {
                g(true);
            } else {
                f(true);
            }
        }
        if (om3Var == om3.LookaheadLayingOut) {
            rz3 rz3Var = this.q;
            if (rz3Var != null && rz3Var.q0) {
                i(true);
            } else {
                h(true);
            }
        }
    }

    public final void c(long j) {
        rz3 rz3Var = this.q;
        if (rz3Var != null) {
            om3 om3Var = om3.LookaheadMeasuring;
            wm3 wm3Var = rz3Var.Y;
            wm3Var.d = om3Var;
            sm3 sm3Var = wm3Var.a;
            wm3Var.e = false;
            rz3Var.u0 = j;
            bq4 snapshotObserver = ((te) vm3.a(sm3Var)).getSnapshotObserver();
            qz3 qz3Var = rz3Var.v0;
            snapshotObserver.a.d(sm3Var, snapshotObserver.b, qz3Var);
            wm3Var.f = true;
            wm3Var.g = true;
            boolean J = bl2.J(sm3Var);
            d34 d34Var = wm3Var.p;
            if (J) {
                d34Var.r0 = true;
                d34Var.s0 = true;
            } else {
                d34Var.q0 = true;
            }
            wm3Var.d = om3.Idle;
        }
    }

    public final void d(int i) {
        boolean z;
        wm3 wm3Var;
        int i2 = this.l;
        this.l = i;
        boolean z2 = false;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            z2 = true;
        }
        if (z != z2) {
            sm3 v = this.a.v();
            if (v != null) {
                wm3Var = v.C0;
            } else {
                wm3Var = null;
            }
            if (wm3Var != null) {
                int i3 = wm3Var.l;
                if (i == 0) {
                    wm3Var.d(i3 - 1);
                } else {
                    wm3Var.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        boolean z;
        wm3 wm3Var;
        int i2 = this.o;
        this.o = i;
        boolean z2 = false;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            z2 = true;
        }
        if (z != z2) {
            sm3 v = this.a.v();
            if (v != null) {
                wm3Var = v.C0;
            } else {
                wm3Var = null;
            }
            if (wm3Var != null) {
                int i3 = wm3Var.o;
                if (i == 0) {
                    wm3Var.e(i3 - 1);
                } else {
                    wm3Var.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else if (!z && !this.j) {
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else if (!z && !this.k) {
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else if (!z && !this.m) {
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else if (!z && !this.n) {
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        d34 d34Var = this.p;
        wm3 wm3Var = d34Var.Y;
        Object obj = d34Var.n0;
        sm3 sm3Var = this.a;
        if ((obj != null || wm3Var.a().B() != null) && d34Var.m0) {
            d34Var.m0 = false;
            d34Var.n0 = wm3Var.a().B();
            sm3 v = sm3Var.v();
            if (v != null) {
                sm3.V(v, false, 7);
            }
        }
        rz3 rz3Var = this.q;
        if (rz3Var != null) {
            wm3 wm3Var2 = rz3Var.Y;
            if (rz3Var.t0 == null) {
                mz3 W0 = wm3Var2.a().W0();
                W0.getClass();
                if (W0.k0.B() == null) {
                    return;
                }
            }
            if (rz3Var.s0) {
                rz3Var.s0 = false;
                mz3 W02 = wm3Var2.a().W0();
                W02.getClass();
                rz3Var.t0 = W02.k0.B();
                if (bl2.J(sm3Var)) {
                    sm3 v2 = sm3Var.v();
                    if (v2 != null) {
                        sm3.V(v2, false, 7);
                        return;
                    }
                    return;
                }
                sm3 v3 = sm3Var.v();
                if (v3 != null) {
                    sm3.T(v3, false, 7);
                }
            }
        }
    }
}
