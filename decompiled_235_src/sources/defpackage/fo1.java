package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fo1  reason: default package */
/* loaded from: classes.dex */
public final class fo1 extends yn1 {
    public go1 F0;
    public lo4 G0;
    public boolean H0;
    public fo2 I0;
    public fo2 J0;
    public boolean K0;

    @Override // defpackage.yn1
    public final Object Y0(xn1 xn1Var, xn1 xn1Var2) {
        Object b = this.F0.b(xa4.UserInput, new b0(xn1Var, this, null, 24), xn1Var2);
        if (b == x61.COROUTINE_SUSPENDED) {
            return b;
        }
        return jg7.a;
    }

    @Override // defpackage.yn1
    public final void d1(long j) {
        if (this.j0 && !nb3.k(this.I0, eo1.a)) {
            hv.L(F0(), null, a71.UNDISPATCHED, new wk0(this, j, (r41) null), 1);
        }
    }

    @Override // defpackage.yn1
    public final void e1(hn1 hn1Var) {
        if (this.j0 && !nb3.k(this.J0, eo1.b)) {
            hv.L(F0(), null, a71.UNDISPATCHED, new b0(this, hn1Var, null, 25), 1);
        }
    }

    @Override // defpackage.yn1
    public final boolean j1() {
        return this.H0;
    }
}
