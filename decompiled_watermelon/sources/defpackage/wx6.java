package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wx6  reason: default package */
/* loaded from: classes.dex */
public final class wx6 extends i24 {
    public final i24 o;
    public final boolean p;
    public final boolean q;
    public mi2 r;
    public mi2 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wx6(defpackage.i24 r8, defpackage.mi2 r9, defpackage.mi2 r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            d96 r0 = defpackage.ma6.a
            if (r8 == 0) goto La
            mi2 r0 = r8.e()
            if (r0 != 0) goto Le
        La:
            jm2 r0 = defpackage.ma6.j
            mi2 r0 = r0.e
        Le:
            mi2 r5 = defpackage.ma6.k(r9, r0, r11)
            if (r8 == 0) goto L1a
            mi2 r9 = r8.i()
            if (r9 != 0) goto L1e
        L1a:
            jm2 r9 = defpackage.ma6.j
            mi2 r9 = r9.f
        L1e:
            mi2 r6 = defpackage.ma6.l(r10, r9)
            r2 = 0
            ka6 r4 = defpackage.ka6.X
            r1 = r7
            r1.<init>(r2, r4, r5, r6)
            r1.o = r8
            r1.p = r11
            r1.q = r12
            mi2 r7 = r1.e
            r1.r = r7
            mi2 r7 = r1.f
            r1.s = r7
            long r7 = defpackage.jk2.s()
            r1.t = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx6.<init>(i24, mi2, mi2, boolean, boolean):void");
    }

    @Override // defpackage.i24
    public final void B(e24 e24Var) {
        ct3.X0();
        throw null;
    }

    @Override // defpackage.i24
    public final i24 C(mi2 mi2Var, mi2 mi2Var2) {
        mi2 k = ma6.k(mi2Var, this.r, true);
        mi2 l = ma6.l(mi2Var2, this.s);
        if (!this.p) {
            return new wx6(D().C(null, l), k, l, false, true);
        }
        return D().C(k, l);
    }

    public final i24 D() {
        i24 i24Var = this.o;
        if (i24Var == null) {
            return ma6.j;
        }
        return i24Var;
    }

    @Override // defpackage.i24, defpackage.ga6
    public final void c() {
        i24 i24Var;
        this.c = true;
        if (this.q && (i24Var = this.o) != null) {
            i24Var.c();
        }
    }

    @Override // defpackage.ga6
    public final ka6 d() {
        return D().d();
    }

    @Override // defpackage.i24, defpackage.ga6
    public final mi2 e() {
        return this.r;
    }

    @Override // defpackage.i24, defpackage.ga6
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.ga6
    public final long g() {
        return D().g();
    }

    @Override // defpackage.i24, defpackage.ga6
    public final int h() {
        return D().h();
    }

    @Override // defpackage.i24, defpackage.ga6
    public final mi2 i() {
        return this.s;
    }

    @Override // defpackage.i24, defpackage.ga6
    public final void k() {
        ct3.X0();
        throw null;
    }

    @Override // defpackage.i24, defpackage.ga6
    public final void l() {
        ct3.X0();
        throw null;
    }

    @Override // defpackage.i24, defpackage.ga6
    public final void m() {
        D().m();
    }

    @Override // defpackage.i24, defpackage.ga6
    public final void n(pe6 pe6Var) {
        D().n(pe6Var);
    }

    @Override // defpackage.ga6
    public final void r(ka6 ka6Var) {
        ct3.X0();
        throw null;
    }

    @Override // defpackage.ga6
    public final void s(long j) {
        ct3.X0();
        throw null;
    }

    @Override // defpackage.i24, defpackage.ga6
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.i24, defpackage.ga6
    public final ga6 u(mi2 mi2Var) {
        mi2 k = ma6.k(mi2Var, this.r, true);
        if (!this.p) {
            return ma6.g(D().u(null), k, true);
        }
        return D().u(k);
    }

    @Override // defpackage.i24
    public final oo2 w() {
        return D().w();
    }

    @Override // defpackage.i24
    public final e24 x() {
        return D().x();
    }

    @Override // defpackage.i24
    public final mi2 y() {
        return this.r;
    }
}
