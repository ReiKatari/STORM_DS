package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kq6  reason: default package */
/* loaded from: classes.dex */
public final class kq6 extends yy3 implements jv0, mf3 {
    public final ds6 j0;
    public b17 k0;
    public iq6 l0;

    public kq6(ds6 ds6Var) {
        this.j0 = ds6Var;
    }

    @Override // defpackage.vc1
    public final void C0() {
        iq6 iq6Var = this.l0;
        if (iq6Var != null) {
            iq6.a(iq6Var, l.P(this).u0, null, null, 30);
        }
        hi2.D(this);
    }

    @Override // defpackage.yy3
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.yy3
    public final void J0() {
        ds6 T = cg2.T(this.j0, l.P(this).u0);
        od2 od2Var = (od2) mh7.t(this, ov0.k);
        R0(T, od2Var);
        sd3 sd3Var = l.P(this).u0;
        od1 od1Var = l.P(this).t0;
        b17 b17Var = this.k0;
        if (b17Var != null) {
            this.l0 = new iq6(sd3Var, od1Var, od2Var, T, b17Var.getValue());
            return;
        }
        throw wh1.c("Font resolution state is not set.");
    }

    @Override // defpackage.yy3
    public final void K0() {
        this.k0 = null;
        this.l0 = null;
    }

    public final void R0(ds6 ds6Var, od2 od2Var) {
        int i;
        int i2;
        xb6 xb6Var = ds6Var.a;
        pd2 pd2Var = xb6Var.f;
        pe2 pe2Var = xb6Var.c;
        if (pe2Var == null) {
            pe2Var = pe2.Y;
        }
        ke2 ke2Var = xb6Var.d;
        if (ke2Var != null) {
            i = ke2Var.a;
        } else {
            i = 0;
        }
        le2 le2Var = xb6Var.e;
        if (le2Var != null) {
            i2 = le2Var.a;
        } else {
            i2 = 65535;
        }
        this.k0 = ((qd2) od2Var).b(pd2Var, pe2Var, i, i2);
        hi2.D(this);
    }

    @Override // defpackage.vc1
    public final void a() {
        iq6 iq6Var = this.l0;
        if (iq6Var != null) {
            iq6.a(iq6Var, null, l.P(this).t0, null, 29);
        }
        hi2.D(this);
    }

    @Override // defpackage.mf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        long a;
        iq6 iq6Var = this.l0;
        if (iq6Var != null) {
            tj4 tj4Var = iq6Var.f;
            b17 b17Var = this.k0;
            if (b17Var != null) {
                Object value = b17Var.getValue();
                if (!b53.x(value, iq6Var.e)) {
                    iq6Var.e = value;
                    tj4Var.setValue(Boolean.TRUE);
                }
                if (((Boolean) tj4Var.getValue()).booleanValue()) {
                    a = zo6.a(iq6Var.d, iq6Var.b, iq6Var.c, zo6.a, 1);
                    iq6Var.g = a;
                    tj4Var.setValue(Boolean.FALSE);
                }
                long j2 = iq6Var.g;
                yn4 c = mv3Var.c(nz0.e(j, nz0.b((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
                return vv3Var.s0(c.A, c.B, qp1.A, new ru(c, 9));
            }
            throw wh1.c("Font resolution state is not set.");
        }
        throw wh1.c("Min size state is not set.");
    }
}
