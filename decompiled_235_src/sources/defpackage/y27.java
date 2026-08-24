package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y27  reason: default package */
/* loaded from: classes.dex */
public final class y27 extends z64 implements fy0, jm3 {
    public final s47 k0;
    public we7 l0;
    public w27 m0;

    public y27(s47 s47Var) {
        this.k0 = s47Var;
    }

    @Override // defpackage.z64
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.z64
    public final void J0() {
        s47 N = gi2.N(this.k0, nc1.f0(this).v0);
        ki2 ki2Var = (ki2) hf.K(this, ky0.k);
        R0(N, ki2Var);
        kk3 kk3Var = nc1.f0(this).v0;
        qh1 qh1Var = nc1.f0(this).u0;
        we7 we7Var = this.l0;
        if (we7Var != null) {
            this.m0 = new w27(kk3Var, qh1Var, ki2Var, N, we7Var.getValue());
            return;
        }
        throw lb1.c("Font resolution state is not set.");
    }

    @Override // defpackage.z64
    public final void K0() {
        this.l0 = null;
        this.m0 = null;
    }

    public final void R0(s47 s47Var, ki2 ki2Var) {
        int i;
        int i2;
        nn6 nn6Var = s47Var.a;
        li2 li2Var = nn6Var.f;
        oj2 oj2Var = nn6Var.c;
        if (oj2Var == null) {
            oj2Var = oj2.Y;
        }
        ij2 ij2Var = nn6Var.d;
        if (ij2Var != null) {
            i = ij2Var.a;
        } else {
            i = 0;
        }
        jj2 jj2Var = nn6Var.e;
        if (jj2Var != null) {
            i2 = jj2Var.a;
        } else {
            i2 = 65535;
        }
        this.l0 = ((mi2) ki2Var).b(li2Var, oj2Var, i, i2);
        xk2.w(this);
    }

    @Override // defpackage.xg1
    public final void S() {
        w27 w27Var = this.m0;
        if (w27Var != null) {
            w27.a(w27Var, nc1.f0(this).v0, null, null, 30);
        }
        xk2.w(this);
    }

    @Override // defpackage.jm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        long a;
        w27 w27Var = this.m0;
        if (w27Var != null) {
            vs4 vs4Var = w27Var.f;
            we7 we7Var = this.l0;
            if (we7Var != null) {
                Object value = we7Var.getValue();
                if (!nb3.k(value, w27Var.e)) {
                    w27Var.e = value;
                    vs4Var.setValue(Boolean.TRUE);
                }
                if (((Boolean) vs4Var.getValue()).booleanValue()) {
                    a = l17.a(w27Var.d, w27Var.b, w27Var.c, l17.a, 1);
                    w27Var.g = a;
                    vs4Var.setValue(Boolean.FALSE);
                }
                long j2 = w27Var.g;
                dx4 y = x24Var.y(s21.e(j, s21.b((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
                return g34Var.K(y.A, y.B, zt1.A, new jv(y, 9));
            }
            throw lb1.c("Font resolution state is not set.");
        }
        throw lb1.c("Min size state is not set.");
    }

    @Override // defpackage.xg1, defpackage.yy4
    public final void d() {
        w27 w27Var = this.m0;
        if (w27Var != null) {
            w27.a(w27Var, null, nc1.f0(this).u0, null, 29);
        }
        xk2.w(this);
    }
}
