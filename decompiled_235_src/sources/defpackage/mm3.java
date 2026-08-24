package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mm3  reason: default package */
/* loaded from: classes.dex */
public final class mm3 extends eg4 {
    public static final aj T0;
    public jm3 P0;
    public q21 Q0;
    public km3 R0;
    public ut S0;

    static {
        aj t = nc1.t();
        int i = kt0.i;
        t.l(kt0.f);
        t.s(1.0f);
        t.t(1);
        T0 = t;
    }

    public mm3(sm3 sm3Var, jm3 jm3Var) {
        super(sm3Var);
        km3 km3Var;
        this.P0 = jm3Var;
        if (sm3Var.e0 != null) {
            km3Var = new km3(this);
        } else {
            km3Var = null;
        }
        this.R0 = km3Var;
        this.S0 = (((z64) jm3Var).A.L & 512) != 0 ? new ut(this, (cf6) jm3Var) : null;
    }

    public final void A1(jm3 jm3Var) {
        if (!jm3Var.equals(this.P0)) {
            if ((((z64) jm3Var).A.L & 512) != 0) {
                cf6 cf6Var = (cf6) jm3Var;
                ut utVar = this.S0;
                if (utVar != null) {
                    utVar.B = cf6Var;
                } else {
                    utVar = new ut(this, cf6Var);
                }
                this.S0 = utVar;
            } else {
                this.S0 = null;
            }
        }
        this.P0 = jm3Var;
    }

    @Override // defpackage.eg4
    public final void T0() {
        if (this.R0 == null) {
            this.R0 = new km3(this);
        }
    }

    @Override // defpackage.x24
    public final int V(int i) {
        ut utVar = this.S0;
        if (utVar != null) {
            cf6 cf6Var = utVar.B;
            eg4 eg4Var = this.n0;
            eg4Var.getClass();
            eg4 eg4Var2 = cf6Var.A.d0;
            eg4Var2.getClass();
            mz3 W0 = eg4Var2.W0();
            W0.getClass();
            if (W0.C0()) {
                return cf6Var.R0(new rt(utVar, utVar.getLayoutDirection()), new ce1(eg4Var, hg4.Min, ig4.Height, 2), s21.b(0, i, 0, 0, 13)).getHeight();
            }
            return eg4Var.V(i);
        }
        jm3 jm3Var = this.P0;
        eg4 eg4Var3 = this.n0;
        eg4Var3.getClass();
        return jm3Var.h0(this, eg4Var3, i);
    }

    @Override // defpackage.eg4
    public final mz3 W0() {
        return this.R0;
    }

    @Override // defpackage.eg4
    public final z64 Y0() {
        return ((z64) this.P0).A;
    }

    @Override // defpackage.x24
    public final int c(int i) {
        ut utVar = this.S0;
        if (utVar != null) {
            cf6 cf6Var = utVar.B;
            eg4 eg4Var = this.n0;
            eg4Var.getClass();
            eg4 eg4Var2 = cf6Var.A.d0;
            eg4Var2.getClass();
            mz3 W0 = eg4Var2.W0();
            W0.getClass();
            if (W0.C0()) {
                return cf6Var.R0(new rt(utVar, utVar.getLayoutDirection()), new ce1(eg4Var, hg4.Max, ig4.Height, 2), s21.b(0, i, 0, 0, 13)).getHeight();
            }
            return eg4Var.c(i);
        }
        jm3 jm3Var = this.P0;
        eg4 eg4Var3 = this.n0;
        eg4Var3.getClass();
        return jm3Var.Z(this, eg4Var3, i);
    }

    @Override // defpackage.dx4
    public final void h0(long j, float f, qn2 qn2Var) {
        boolean z;
        q93 q93Var;
        if (this.l0) {
            mz3 W0 = W0();
            W0.getClass();
            o1(W0.l0, f, qn2Var);
        } else {
            o1(j, f, qn2Var);
        }
        if (!this.f0) {
            j1();
            eg4 eg4Var = this.n0;
            eg4Var.getClass();
            ut utVar = this.S0;
            if (utVar != null) {
                this.R0.getClass();
                if (!utVar.L) {
                    long j2 = this.L;
                    km3 km3Var = this.R0;
                    q93 q93Var2 = null;
                    if (km3Var != null) {
                        q93Var = new q93(km3Var.O0());
                    } else {
                        q93Var = null;
                    }
                    if (q93.a(j2, q93Var)) {
                        long j3 = eg4Var.L;
                        mz3 W02 = eg4Var.W0();
                        if (W02 != null) {
                            q93Var2 = new q93(W02.O0());
                        }
                        if (q93.a(j3, q93Var2)) {
                            z = true;
                            eg4Var.l0 = z;
                        }
                    }
                }
                z = false;
                eg4Var.l0 = z;
            }
            eg4Var.g0 = this.g0;
            G0().a();
            eg4Var.g0 = false;
            eg4Var.l0 = false;
        }
    }

    @Override // defpackage.x24
    public final int n(int i) {
        ut utVar = this.S0;
        if (utVar != null) {
            cf6 cf6Var = utVar.B;
            eg4 eg4Var = this.n0;
            eg4Var.getClass();
            eg4 eg4Var2 = cf6Var.A.d0;
            eg4Var2.getClass();
            mz3 W0 = eg4Var2.W0();
            W0.getClass();
            if (W0.C0()) {
                return cf6Var.R0(new rt(utVar, utVar.getLayoutDirection()), new ce1(eg4Var, hg4.Min, ig4.Width, 2), s21.b(0, 0, 0, i, 7)).getWidth();
            }
            return eg4Var.n(i);
        }
        jm3 jm3Var = this.P0;
        eg4 eg4Var3 = this.n0;
        eg4Var3.getClass();
        return jm3Var.s0(this, eg4Var3, i);
    }

    @Override // defpackage.eg4
    public final void n1(xj0 xj0Var, ut2 ut2Var) {
        eg4 eg4Var;
        eg4 eg4Var2 = this.n0;
        eg4Var2.getClass();
        eg4Var2.R0(xj0Var, ut2Var);
        if (((te) vm3.a(this.k0)).getShowLayoutBounds() && (eg4Var = this.n0) != null) {
            if (!q93.b(this.L, eg4Var.L) || !i93.a(eg4Var.x0, 0L)) {
                long j = this.L;
                xj0Var.k(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, T0);
            }
        }
    }

    @Override // defpackage.x24
    public final int u(int i) {
        ut utVar = this.S0;
        if (utVar != null) {
            cf6 cf6Var = utVar.B;
            eg4 eg4Var = this.n0;
            eg4Var.getClass();
            eg4 eg4Var2 = cf6Var.A.d0;
            eg4Var2.getClass();
            mz3 W0 = eg4Var2.W0();
            W0.getClass();
            if (W0.C0()) {
                return cf6Var.R0(new rt(utVar, utVar.getLayoutDirection()), new ce1(eg4Var, hg4.Max, ig4.Width, 2), s21.b(0, 0, 0, i, 7)).getWidth();
            }
            return eg4Var.u(i);
        }
        jm3 jm3Var = this.P0;
        eg4 eg4Var3 = this.n0;
        eg4Var3.getClass();
        return jm3Var.f(this, eg4Var3, i);
    }

    @Override // defpackage.kz3
    public final int u0(ey2 ey2Var) {
        km3 km3Var = this.R0;
        if (km3Var != null) {
            y94 y94Var = km3Var.p0;
            int d = y94Var.d(ey2Var);
            if (d >= 0) {
                return y94Var.c[d];
            }
            return Integer.MIN_VALUE;
        }
        return uj2.i(this, ey2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
        if (r10 == r2.B) goto L25;
     */
    @Override // defpackage.x24
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dx4 y(long j) {
        f34 c;
        q21 q21Var;
        boolean z;
        q93 q93Var = null;
        if (this.m0) {
            q21 q21Var2 = this.Q0;
            if (q21Var2 != null) {
                j = q21Var2.a;
            } else {
                i.h("Lookahead constraints cannot be null in approach pass.");
                return null;
            }
        }
        m0(j);
        ut utVar = this.S0;
        if (utVar != null) {
            cf6 cf6Var = utVar.B;
            km3 km3Var = utVar.A.R0;
            km3Var.getClass();
            f34 G0 = km3Var.G0();
            G0.getWidth();
            G0.getHeight();
            boolean z2 = true;
            if ((cf6Var.m0.h() && cf6Var.m0.e().a() && cf6Var.m0.e().b.a()) || (q21Var = this.Q0) == null || j != q21Var.a) {
                z = true;
            } else {
                z = false;
            }
            utVar.L = z;
            if (!z) {
                eg4 eg4Var = this.n0;
                eg4Var.getClass();
                eg4Var.m0 = true;
            }
            eg4 eg4Var2 = this.n0;
            eg4Var2.getClass();
            c = cf6Var.R0(utVar, eg4Var2, j);
            eg4 eg4Var3 = this.n0;
            eg4Var3.getClass();
            eg4Var3.m0 = false;
            int width = c.getWidth();
            km3 km3Var2 = this.R0;
            km3Var2.getClass();
            if (width == km3Var2.A) {
                int height = c.getHeight();
                km3 km3Var3 = this.R0;
                km3Var3.getClass();
            }
            z2 = false;
            if (!utVar.L) {
                eg4 eg4Var4 = this.n0;
                eg4Var4.getClass();
                long j2 = eg4Var4.L;
                eg4 eg4Var5 = this.n0;
                eg4Var5.getClass();
                mz3 W0 = eg4Var5.W0();
                if (W0 != null) {
                    q93Var = new q93(W0.O0());
                }
                if (q93.a(j2, q93Var) && !z2) {
                    c = new lm3(c, this);
                }
            }
        } else {
            jm3 jm3Var = this.P0;
            eg4 eg4Var6 = this.n0;
            eg4Var6.getClass();
            c = jm3Var.c(this, eg4Var6, j);
        }
        r1(c);
        i1();
        return this;
    }
}
