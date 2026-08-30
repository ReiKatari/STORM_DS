package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zj1  reason: default package */
/* loaded from: classes.dex */
public final class zj1 extends sj1 {
    public ak1 E0;
    public jf4 F0;
    public boolean G0;
    public bj2 H0;
    public bj2 I0;
    public boolean J0;

    @Override // defpackage.sj1
    public final Object Y0(rj1 rj1Var, rj1 rj1Var2) {
        Object c = this.E0.c(r24.UserInput, new a0(rj1Var, this, null, 23), rj1Var2);
        if (c == p31.COROUTINE_SUSPENDED) {
            return c;
        }
        return o27.a;
    }

    @Override // defpackage.sj1
    public final void d1(long j) {
        if (this.i0 && !b53.x(this.H0, yj1.a)) {
            tq5.w(F0(), null, s31.UNDISPATCHED, new oi0(this, j, (j11) null), 1);
        }
    }

    @Override // defpackage.sj1
    public final void e1(bj1 bj1Var) {
        if (this.i0 && !b53.x(this.I0, yj1.b)) {
            tq5.w(F0(), null, s31.UNDISPATCHED, new a0(this, bj1Var, null, 24), 1);
        }
    }

    @Override // defpackage.sj1
    public final boolean j1() {
        return this.G0;
    }
}
