package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dr2  reason: default package */
/* loaded from: classes.dex */
public final class dr2 extends yy3 implements jv0, mf3, m94 {
    public ds6 j0;
    public int k0;
    public int l0;
    public boolean m0;
    public int n0;
    public int o0;
    public ds6 p0;
    public b17 q0;

    @Override // defpackage.vc1
    public final void C0() {
        this.p0 = cg2.T(this.j0, l.P(this).u0);
        this.m0 = true;
        hi2.D(this);
    }

    @Override // defpackage.yy3
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.yy3
    public final void J0() {
        int i;
        int i2;
        od2 od2Var = (od2) mh7.t(this, ov0.k);
        this.p0 = cg2.T(this.j0, l.P(this).u0);
        pd2 pd2Var = R0().a.f;
        pe2 pe2Var = R0().a.c;
        if (pe2Var == null) {
            pe2Var = pe2.Y;
        }
        ke2 ke2Var = R0().a.d;
        if (ke2Var != null) {
            i = ke2Var.a;
        } else {
            i = 0;
        }
        le2 le2Var = R0().a.e;
        if (le2Var != null) {
            i2 = le2Var.a;
        } else {
            i2 = 65535;
        }
        this.q0 = ((qd2) od2Var).b(pd2Var, pe2Var, i, i2);
        nk2.Q(this, new cr2(this, 0));
        this.m0 = true;
    }

    @Override // defpackage.yy3
    public final void K0() {
        this.p0 = null;
        this.q0 = null;
        this.m0 = false;
    }

    @Override // defpackage.m94
    public final void Q() {
        if (this.q0 != null) {
            nk2.Q(this, new cr2(this, 1));
        }
        this.m0 = true;
        hi2.D(this);
    }

    public final ds6 R0() {
        ds6 ds6Var = this.p0;
        if (ds6Var != null) {
            return ds6Var;
        }
        throw wh1.c("Resolved style is not set.");
    }

    @Override // defpackage.vc1
    public final void a() {
        this.m0 = true;
        hi2.D(this);
    }

    @Override // defpackage.mf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        int i;
        int g;
        int i2;
        int i3;
        if (this.m0) {
            ds6 R0 = R0();
            od2 od2Var = (od2) mh7.t(this, ov0.k);
            String str = zo6.a;
            int a = (int) (zo6.a(R0, vv3Var, od2Var, str, 1) & 4294967295L);
            int a2 = ((int) (zo6.a(R0, vv3Var, od2Var, str + '\n' + str, 2) & 4294967295L)) - a;
            int i4 = this.k0;
            if (i4 == 1) {
                i2 = -1;
            } else {
                i2 = ((i4 - 1) * a2) + a;
            }
            this.n0 = i2;
            int i5 = this.l0;
            if (i5 == Integer.MAX_VALUE) {
                i3 = -1;
            } else {
                i3 = ((i5 - 1) * a2) + a;
            }
            this.o0 = i3;
            this.m0 = false;
        }
        int i6 = this.n0;
        if (i6 != -1) {
            i = io2.m(i6, lz0.i(j), lz0.g(j));
        } else {
            i = lz0.i(j);
        }
        int i7 = i;
        int i8 = this.o0;
        if (i8 != -1) {
            g = io2.m(i8, lz0.i(j), lz0.g(j));
        } else {
            g = lz0.g(j);
        }
        yn4 c = mv3Var.c(lz0.a(j, 0, 0, i7, g, 3));
        return vv3Var.s0(c.A, c.B, qp1.A, new ru(c, 4));
    }
}
