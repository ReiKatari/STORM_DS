package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mh6  reason: default package */
/* loaded from: classes.dex */
public final class mh6 extends xc1 implements up4, ac2, yc2 {
    public ki2 l0;
    public boolean m0;
    public final uk6 n0;

    public mh6(ki2 ki2Var) {
        this.l0 = ki2Var;
        dg dgVar = new dg(4, this);
        kp4 kp4Var = pk6.a;
        uk6 uk6Var = new uk6(null, null, null, dgVar);
        R0(uk6Var);
        this.n0 = uk6Var;
    }

    @Override // defpackage.up4
    public final void O(kp4 kp4Var, lp4 lp4Var, long j) {
        this.n0.O(kp4Var, lp4Var, j);
    }

    @Override // defpackage.ac2
    public final void e0(bd2 bd2Var) {
        this.m0 = bd2Var.isFocused();
    }

    @Override // defpackage.up4
    public final void q0() {
        this.n0.q0();
    }

    @Override // defpackage.up4
    public final long v() {
        oi1 oi1Var = f34.k;
        od1 od1Var = l.P(this).t0;
        oi1Var.getClass();
        int i = fw6.b;
        return so1.l(od1Var.Y(10.0f), od1Var.Y(40.0f), od1Var.Y(10.0f), od1Var.Y(40.0f));
    }
}
