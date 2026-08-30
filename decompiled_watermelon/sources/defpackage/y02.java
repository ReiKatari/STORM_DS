package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y02  reason: default package */
/* loaded from: classes.dex */
public final class y02 extends v43 {
    public kx6 k0;
    public ax6 l0;
    public ax6 m0;
    public ax6 n0;
    public z02 o0;
    public h32 p0;
    public ki2 q0;
    public m02 r0;
    public long s0;
    public ub t0;
    public final x02 u0;
    public final x02 v0;

    public y02(kx6 kx6Var, ax6 ax6Var, ax6 ax6Var2, ax6 ax6Var3, z02 z02Var, h32 h32Var, ki2 ki2Var, m02 m02Var) {
        super(1);
        this.k0 = kx6Var;
        this.l0 = ax6Var;
        this.m0 = ax6Var2;
        this.n0 = ax6Var3;
        this.o0 = z02Var;
        this.p0 = h32Var;
        this.q0 = ki2Var;
        this.r0 = m02Var;
        this.s0 = -9223372034707292160L;
        nz0.b(0, 0, 0, 0, 15);
        this.u0 = new x02(this, 0);
        this.v0 = new x02(this, 1);
    }

    @Override // defpackage.yy3
    public final void J0() {
        this.s0 = -9223372034707292160L;
    }

    public final ub T0() {
        if (this.k0.f().b(k02.PreEnter, k02.Visible)) {
            jj0 jj0Var = this.o0.a.c;
            if (jj0Var != null) {
                return jj0Var.a;
            }
            jj0 jj0Var2 = this.p0.a.c;
            if (jj0Var2 != null) {
                return jj0Var2.a;
            }
            return null;
        }
        jj0 jj0Var3 = this.p0.a.c;
        if (jj0Var3 != null) {
            return jj0Var3.a;
        }
        jj0 jj0Var4 = this.o0.a.c;
        if (jj0Var4 != null) {
            return jj0Var4.a;
        }
        return null;
    }

    @Override // defpackage.v43, defpackage.mf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        char c;
        zw6 zw6Var;
        zw6 zw6Var2;
        zw6 zw6Var3;
        long j2;
        long j3;
        long j4;
        zw6 zw6Var4 = null;
        if (this.k0.a.f() == this.k0.d.getValue()) {
            this.t0 = null;
        } else if (this.t0 == null) {
            ub T0 = T0();
            if (T0 == null) {
                T0 = y60.L;
            }
            this.t0 = T0;
        }
        boolean w = vv3Var.w();
        qp1 qp1Var = qp1.A;
        if (w) {
            yn4 c2 = mv3Var.c(j);
            long j5 = (c2.A << 32) | (c2.B & 4294967295L);
            this.s0 = j5;
            return vv3Var.s0((int) (j5 >> 32), (int) (4294967295L & j5), qp1Var, new sd(c2, 3));
        } else if (((Boolean) this.q0.c()).booleanValue()) {
            m02 m02Var = this.r0;
            ax6 ax6Var = m02Var.a;
            ax6 ax6Var2 = m02Var.b;
            kx6 kx6Var = m02Var.c;
            z02 z02Var = m02Var.d;
            h32 h32Var = m02Var.e;
            ax6 ax6Var3 = m02Var.f;
            if (ax6Var != null) {
                c = ' ';
                zw6Var = ax6Var.a(new n02(z02Var, h32Var, 0), new n02(z02Var, h32Var, 1));
            } else {
                c = ' ';
                zw6Var = null;
            }
            if (ax6Var2 != null) {
                zw6Var2 = ax6Var2.a(new n02(z02Var, h32Var, 2), new n02(z02Var, h32Var, 3));
            } else {
                zw6Var2 = null;
            }
            if (kx6Var.a.f() == k02.PreEnter) {
                lx6 lx6Var = h32Var.a;
            } else {
                lx6 lx6Var2 = h32Var.a;
            }
            if (ax6Var3 != null) {
                zw6Var3 = ax6Var3.a(yd.v0, new zm(null, z02Var, h32Var, 4));
            } else {
                zw6Var3 = null;
            }
            zm zmVar = new zm(zw6Var, zw6Var2, zw6Var3, 3);
            yn4 c3 = mv3Var.c(j);
            long j6 = (c3.B & 4294967295L) | (c3.A << c);
            if (!i33.b(this.s0, -9223372034707292160L)) {
                j2 = this.s0;
            } else {
                j2 = j6;
            }
            ax6 ax6Var4 = this.l0;
            if (ax6Var4 != null) {
                zw6Var4 = ax6Var4.a(this.u0, new w02(this, j2, 0));
            }
            if (zw6Var4 != null) {
                j6 = ((i33) zw6Var4.getValue()).a;
            }
            long d = nz0.d(j, j6);
            ax6 ax6Var5 = this.m0;
            long j7 = 0;
            if (ax6Var5 != null) {
                j3 = ((a33) ax6Var5.a(yd.z0, new w02(this, j2, 1)).getValue()).a;
            } else {
                j3 = 0;
            }
            ax6 ax6Var6 = this.n0;
            if (ax6Var6 != null) {
                j4 = ((a33) ax6Var6.a(this.v0, new w02(this, j2, 2)).getValue()).a;
            } else {
                j4 = 0;
            }
            ub ubVar = this.t0;
            if (ubVar != null) {
                j7 = ubVar.a(j2, d, sd3.Ltr);
            }
            return vv3Var.s0((int) (d >> c), (int) (d & 4294967295L), qp1Var, new v02(c3, a33.c(j7, j4), j3, zmVar));
        } else {
            yn4 c4 = mv3Var.c(j);
            return vv3Var.s0(c4.A, c4.B, qp1Var, new sd(c4, 4));
        }
    }
}
