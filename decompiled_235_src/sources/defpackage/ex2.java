package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ex2  reason: default package */
/* loaded from: classes.dex */
public final class ex2 extends z64 implements fy0, jm3, gi4 {
    public s47 k0;
    public int l0;
    public int m0;
    public boolean n0;
    public int o0;
    public int p0;
    public s47 q0;
    public we7 r0;

    @Override // defpackage.z64
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.z64
    public final void J0() {
        int i;
        int i2;
        ki2 ki2Var = (ki2) hf.K(this, ky0.k);
        this.q0 = gi2.N(this.k0, nc1.f0(this).v0);
        li2 li2Var = R0().a.f;
        oj2 oj2Var = R0().a.c;
        if (oj2Var == null) {
            oj2Var = oj2.Y;
        }
        ij2 ij2Var = R0().a.d;
        if (ij2Var != null) {
            i = ij2Var.a;
        } else {
            i = 0;
        }
        jj2 jj2Var = R0().a.e;
        if (jj2Var != null) {
            i2 = jj2Var.a;
        } else {
            i2 = 65535;
        }
        this.r0 = ((mi2) ki2Var).b(li2Var, oj2Var, i, i2);
        jx2.B(this, new dx2(this, 0));
        this.n0 = true;
    }

    @Override // defpackage.z64
    public final void K0() {
        this.q0 = null;
        this.r0 = null;
        this.n0 = false;
    }

    public final s47 R0() {
        s47 s47Var = this.q0;
        if (s47Var != null) {
            return s47Var;
        }
        throw lb1.c("Resolved style is not set.");
    }

    @Override // defpackage.xg1
    public final void S() {
        this.q0 = gi2.N(this.k0, nc1.f0(this).v0);
        this.n0 = true;
        xk2.w(this);
    }

    @Override // defpackage.jm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        int i;
        int g;
        int i2;
        int i3;
        if (this.n0) {
            s47 R0 = R0();
            ki2 ki2Var = (ki2) hf.K(this, ky0.k);
            String str = l17.a;
            int a = (int) (l17.a(R0, g34Var, ki2Var, str, 1) & 4294967295L);
            int a2 = ((int) (l17.a(R0, g34Var, ki2Var, str + '\n' + str, 2) & 4294967295L)) - a;
            int i4 = this.l0;
            if (i4 == 1) {
                i2 = -1;
            } else {
                i2 = ((i4 - 1) * a2) + a;
            }
            this.o0 = i2;
            int i5 = this.m0;
            if (i5 == Integer.MAX_VALUE) {
                i3 = -1;
            } else {
                i3 = ((i5 - 1) * a2) + a;
            }
            this.p0 = i3;
            this.n0 = false;
        }
        int i6 = this.o0;
        if (i6 != -1) {
            i = gi2.q(i6, q21.i(j), q21.g(j));
        } else {
            i = q21.i(j);
        }
        int i7 = i;
        int i8 = this.p0;
        if (i8 != -1) {
            g = gi2.q(i8, q21.i(j), q21.g(j));
        } else {
            g = q21.g(j);
        }
        dx4 y = x24Var.y(q21.a(j, 0, 0, i7, g, 3));
        return g34Var.K(y.A, y.B, zt1.A, new jv(y, 4));
    }

    @Override // defpackage.xg1, defpackage.yy4
    public final void d() {
        this.n0 = true;
        xk2.w(this);
    }

    @Override // defpackage.gi4
    public final void l0() {
        if (this.r0 != null) {
            jx2.B(this, new dx2(this, 1));
        }
        this.n0 = true;
        xk2.w(this);
    }
}
