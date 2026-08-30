package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: po6  reason: default package */
/* loaded from: classes.dex */
public final class po6 extends xc1 implements jv0, ao6 {
    public wv6 l0;
    public oa0 m0;
    public wp6 n0;
    public k21 o0;
    public kd6 p0;
    public final ee1 q0 = me2.q(new t06(7, this));
    public y55 r0 = y55.e;

    public po6(wv6 wv6Var, oa0 oa0Var, wp6 wp6Var, k21 k21Var) {
        this.l0 = wv6Var;
        this.m0 = oa0Var;
        this.n0 = wp6Var;
        this.o0 = k21Var;
    }

    @Override // defpackage.ao6
    public final zn6 B0() {
        return (zn6) this.q0.getValue();
    }

    @Override // defpackage.yy3
    public final void J0() {
        wv6 wv6Var = this.l0;
        wv6Var.L = vv6.Attached;
        wv6Var.B = this;
    }

    @Override // defpackage.yy3
    public final void K0() {
        wv6 wv6Var = this.l0;
        wv6Var.L = vv6.Detached;
        wv6Var.B = null;
    }

    @Override // defpackage.ao6
    public final long k(rd3 rd3Var) {
        return p(rd3Var).d();
    }

    @Override // defpackage.ao6
    public final y55 p(rd3 rd3Var) {
        if (!this.i0) {
            return this.r0;
        }
        y55 y55Var = (y55) this.o0.n(rd3Var);
        if (y55Var == null) {
            return this.r0;
        }
        this.r0 = y55Var;
        return y55Var;
    }
}
