package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o0 extends k0 {
    public p0 C0;
    public n1 D0;
    public boolean E0;
    public mc.q F0;
    public mc.q G0;
    public boolean H0;

    @Override // h1.k0
    public final Object V0(j0 j0Var, j0 j0Var2) {
        Object f8 = this.C0.f(f1.f1.UserInput, new a2.o(j0Var, this, (cc.c) null, 25), j0Var2);
        if (f8 == dc.a.COROUTINE_SUSPENDED) {
            return f8;
        }
        return yb.y.f14813a;
    }

    @Override // h1.k0
    public final void a1(long j2) {
        if (this.f1777h0 && !nc.k.a(this.F0, n0.f5983a)) {
            zc.x.v(C0(), null, zc.w.UNDISPATCHED, new c1.l2(this, j2, null), 1);
        }
    }

    @Override // h1.k0
    public final void b1(w wVar) {
        if (this.f1777h0 && !nc.k.a(this.G0, n0.f5984b)) {
            zc.x.v(C0(), null, zc.w.UNDISPATCHED, new a2.o(this, wVar, (cc.c) null, 26), 1);
        }
    }

    @Override // h1.k0
    public final boolean g1() {
        return this.E0;
    }
}
