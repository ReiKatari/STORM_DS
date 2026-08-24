package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n52  reason: default package */
/* loaded from: classes.dex */
public final class n52 extends hb3 {
    public ga7 l0;
    public w97 m0;
    public w97 n0;
    public w97 o0;
    public o52 p0;
    public z72 q0;
    public on2 r0;
    public b52 s0;
    public long t0;
    public ic u0;
    public final m52 v0;
    public final m52 w0;

    public n52(ga7 ga7Var, w97 w97Var, w97 w97Var2, w97 w97Var3, o52 o52Var, z72 z72Var, on2 on2Var, b52 b52Var) {
        super(1);
        this.l0 = ga7Var;
        this.m0 = w97Var;
        this.n0 = w97Var2;
        this.o0 = w97Var3;
        this.p0 = o52Var;
        this.q0 = z72Var;
        this.r0 = on2Var;
        this.s0 = b52Var;
        this.t0 = -9223372034707292160L;
        s21.b(0, 0, 0, 0, 15);
        this.v0 = new m52(this, 0);
        this.w0 = new m52(this, 1);
    }

    @Override // defpackage.z64
    public final void J0() {
        this.t0 = -9223372034707292160L;
    }

    public final ic T0() {
        if (this.l0.f().b(z42.PreEnter, z42.Visible)) {
            sl0 sl0Var = this.p0.a.c;
            if (sl0Var != null) {
                return sl0Var.a;
            }
            sl0 sl0Var2 = this.q0.a.c;
            if (sl0Var2 != null) {
                return sl0Var2.a;
            }
            return null;
        }
        sl0 sl0Var3 = this.q0.a.c;
        if (sl0Var3 != null) {
            return sl0Var3.a;
        }
        sl0 sl0Var4 = this.p0.a.c;
        if (sl0Var4 != null) {
            return sl0Var4.a;
        }
        return null;
    }

    @Override // defpackage.hb3, defpackage.jm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        char c;
        v97 v97Var;
        v97 v97Var2;
        i97 i97Var;
        v97 v97Var3;
        long j2;
        v97 v97Var4;
        long j3;
        long j4;
        if (this.l0.a.f() == this.l0.d.getValue()) {
            this.u0 = null;
        } else if (this.u0 == null) {
            ic T0 = T0();
            if (T0 == null) {
                T0 = d90.L;
            }
            this.u0 = T0;
        }
        boolean a0 = g34Var.a0();
        zt1 zt1Var = zt1.A;
        if (a0) {
            dx4 y = x24Var.y(j);
            long j5 = (y.A << 32) | (y.B & 4294967295L);
            this.t0 = j5;
            return g34Var.K((int) (j5 >> 32), (int) (4294967295L & j5), zt1Var, new he(y, 3));
        } else if (((Boolean) this.r0.c()).booleanValue()) {
            b52 b52Var = this.s0;
            w97 w97Var = b52Var.a;
            w97 w97Var2 = b52Var.b;
            ga7 ga7Var = b52Var.c;
            o52 o52Var = b52Var.d;
            ha7 ha7Var = o52Var.a;
            z72 z72Var = b52Var.e;
            w97 w97Var3 = b52Var.f;
            if (w97Var != null) {
                c = ' ';
                v97Var = w97Var.a(new c52(o52Var, z72Var, 0), new c52(o52Var, z72Var, 1));
            } else {
                c = ' ';
                v97Var = null;
            }
            if (w97Var2 != null) {
                v97Var2 = w97Var2.a(new c52(o52Var, z72Var, 2), new c52(o52Var, z72Var, 3));
            } else {
                v97Var2 = null;
            }
            if (ga7Var.a.f() == z42.PreEnter) {
                z56 z56Var = ha7Var.d;
                if (z56Var != null) {
                    i97Var = new i97(z56Var.a);
                } else {
                    z56 z56Var2 = z72Var.a.d;
                    if (z56Var2 != null) {
                        i97Var = new i97(z56Var2.a);
                    }
                    i97Var = null;
                }
            } else {
                z56 z56Var3 = z72Var.a.d;
                if (z56Var3 != null) {
                    i97Var = new i97(z56Var3.a);
                } else {
                    z56 z56Var4 = ha7Var.d;
                    if (z56Var4 != null) {
                        i97Var = new i97(z56Var4.a);
                    }
                    i97Var = null;
                }
            }
            if (w97Var3 != null) {
                v97Var3 = w97Var3.a(ne.x0, new ln(i97Var, o52Var, z72Var, 4));
            } else {
                v97Var3 = null;
            }
            ln lnVar = new ln(v97Var, v97Var2, v97Var3, 3);
            dx4 y2 = x24Var.y(j);
            long j6 = (y2.B & 4294967295L) | (y2.A << c);
            if (!q93.b(this.t0, -9223372034707292160L)) {
                j2 = this.t0;
            } else {
                j2 = j6;
            }
            w97 w97Var4 = this.m0;
            if (w97Var4 != null) {
                v97Var4 = w97Var4.a(this.v0, new l52(this, j2, 0));
            } else {
                v97Var4 = null;
            }
            if (v97Var4 != null) {
                j6 = ((q93) v97Var4.getValue()).a;
            }
            long d = s21.d(j, j6);
            w97 w97Var5 = this.n0;
            long j7 = 0;
            if (w97Var5 != null) {
                j3 = ((i93) w97Var5.a(ne.B0, new l52(this, j2, 1)).getValue()).a;
            } else {
                j3 = 0;
            }
            w97 w97Var6 = this.o0;
            if (w97Var6 != null) {
                j4 = ((i93) w97Var6.a(this.w0, new l52(this, j2, 2)).getValue()).a;
            } else {
                j4 = 0;
            }
            ic icVar = this.u0;
            if (icVar != null) {
                j7 = icVar.a(j2, d, kk3.Ltr);
            }
            return g34Var.K((int) (d >> c), (int) (d & 4294967295L), zt1Var, new k52(y2, i93.c(j7, j4), j3, lnVar));
        } else {
            dx4 y3 = x24Var.y(j);
            return g34Var.K(y3.A, y3.B, zt1Var, new he(y3, 4));
        }
    }
}
