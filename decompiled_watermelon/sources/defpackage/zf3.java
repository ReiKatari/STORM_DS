package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zf3  reason: default package */
/* loaded from: classes.dex */
public final class zf3 {
    public final vf3 a;
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
    public ms3 q;
    public rf3 d = rf3.Idle;
    public final sv3 p = new sv3(this);

    public zf3(vf3 vf3Var) {
        this.a = vf3Var;
    }

    public final m74 a() {
        return (m74) this.a.A0.e;
    }

    public final void b() {
        rf3 rf3Var = this.a.B0.d;
        if (rf3Var == rf3.LayingOut || rf3Var == rf3.LookaheadLayingOut) {
            if (this.p.v0) {
                g(true);
            } else {
                f(true);
            }
        }
        if (rf3Var == rf3.LookaheadLayingOut) {
            ms3 ms3Var = this.q;
            if (ms3Var != null && ms3Var.p0) {
                i(true);
            } else {
                h(true);
            }
        }
    }

    public final void c(long j) {
        ms3 ms3Var = this.q;
        if (ms3Var != null) {
            rf3 rf3Var = rf3.LookaheadMeasuring;
            zf3 zf3Var = ms3Var.Y;
            zf3Var.d = rf3Var;
            vf3 vf3Var = zf3Var.a;
            zf3Var.e = false;
            ms3Var.t0 = j;
            yg4 snapshotObserver = ((ee) yf3.a(vf3Var)).getSnapshotObserver();
            ls3 ls3Var = ms3Var.u0;
            snapshotObserver.a.d(vf3Var, snapshotObserver.b, ls3Var);
            zf3Var.f = true;
            zf3Var.g = true;
            boolean J = mj2.J(vf3Var);
            sv3 sv3Var = zf3Var.p;
            if (J) {
                sv3Var.q0 = true;
                sv3Var.r0 = true;
            } else {
                sv3Var.p0 = true;
            }
            zf3Var.d = rf3.Idle;
        }
    }

    public final void d(int i) {
        boolean z;
        zf3 zf3Var;
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
            vf3 u = this.a.u();
            if (u != null) {
                zf3Var = u.B0;
            } else {
                zf3Var = null;
            }
            if (zf3Var != null) {
                int i3 = zf3Var.l;
                if (i == 0) {
                    zf3Var.d(i3 - 1);
                } else {
                    zf3Var.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        boolean z;
        zf3 zf3Var;
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
            vf3 u = this.a.u();
            if (u != null) {
                zf3Var = u.B0;
            } else {
                zf3Var = null;
            }
            if (zf3Var != null) {
                int i3 = zf3Var.o;
                if (i == 0) {
                    zf3Var.e(i3 - 1);
                } else {
                    zf3Var.e(i3 + 1);
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
        sv3 sv3Var = this.p;
        zf3 zf3Var = sv3Var.Y;
        Object obj = sv3Var.m0;
        vf3 vf3Var = this.a;
        if ((obj != null || zf3Var.a().l() != null) && sv3Var.l0) {
            sv3Var.l0 = false;
            sv3Var.m0 = zf3Var.a().l();
            vf3 u = vf3Var.u();
            if (u != null) {
                vf3.V(u, false, 7);
            }
        }
        ms3 ms3Var = this.q;
        if (ms3Var != null) {
            zf3 zf3Var2 = ms3Var.Y;
            if (ms3Var.s0 == null) {
                hs3 W0 = zf3Var2.a().W0();
                W0.getClass();
                if (W0.j0.l() == null) {
                    return;
                }
            }
            if (ms3Var.r0) {
                ms3Var.r0 = false;
                hs3 W02 = zf3Var2.a().W0();
                W02.getClass();
                ms3Var.s0 = W02.j0.l();
                if (mj2.J(vf3Var)) {
                    vf3 u2 = vf3Var.u();
                    if (u2 != null) {
                        vf3.V(u2, false, 7);
                        return;
                    }
                    return;
                }
                vf3 u3 = vf3Var.u();
                if (u3 != null) {
                    vf3.T(u3, false, 7);
                }
            }
        }
    }
}
