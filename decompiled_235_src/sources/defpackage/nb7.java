package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nb7  reason: default package */
/* loaded from: classes.dex */
public final class nb7 extends oa4 {
    public final oa4 o;
    public final boolean p;
    public final boolean q;
    public qn2 r;
    public qn2 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nb7(oa4 oa4Var, qn2 qn2Var, qn2 qn2Var2, boolean z, boolean z2) {
        super(0L, zl6.X, bm6.k(qn2Var, (oa4Var == null || (r0 = oa4Var.e()) == null) ? bm6.j.e : r0, z), bm6.l(qn2Var2, (oa4Var == null || (r9 = oa4Var.i()) == null) ? bm6.j.f : r9));
        qn2 qn2Var3;
        qn2 qn2Var4;
        r76 r76Var = bm6.a;
        this.o = oa4Var;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = kj2.s();
    }

    @Override // defpackage.oa4
    public final void B(ka4 ka4Var) {
        ak7.K0();
        throw null;
    }

    @Override // defpackage.oa4
    public final oa4 C(qn2 qn2Var, qn2 qn2Var2) {
        qn2 k = bm6.k(qn2Var, this.r, true);
        qn2 l = bm6.l(qn2Var2, this.s);
        if (!this.p) {
            return new nb7(D().C(null, l), k, l, false, true);
        }
        return D().C(k, l);
    }

    public final oa4 D() {
        oa4 oa4Var = this.o;
        if (oa4Var == null) {
            return bm6.j;
        }
        return oa4Var;
    }

    @Override // defpackage.oa4, defpackage.vl6
    public final void c() {
        oa4 oa4Var;
        this.c = true;
        if (this.q && (oa4Var = this.o) != null) {
            oa4Var.c();
        }
    }

    @Override // defpackage.vl6
    public final zl6 d() {
        return D().d();
    }

    @Override // defpackage.oa4, defpackage.vl6
    public final qn2 e() {
        return this.r;
    }

    @Override // defpackage.oa4, defpackage.vl6
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.vl6
    public final long g() {
        return D().g();
    }

    @Override // defpackage.oa4, defpackage.vl6
    public final int h() {
        return D().h();
    }

    @Override // defpackage.oa4, defpackage.vl6
    public final qn2 i() {
        return this.s;
    }

    @Override // defpackage.oa4, defpackage.vl6
    public final void k() {
        ak7.K0();
        throw null;
    }

    @Override // defpackage.oa4, defpackage.vl6
    public final void l() {
        ak7.K0();
        throw null;
    }

    @Override // defpackage.oa4, defpackage.vl6
    public final void m() {
        D().m();
    }

    @Override // defpackage.oa4, defpackage.vl6
    public final void n(eq6 eq6Var) {
        D().n(eq6Var);
    }

    @Override // defpackage.vl6
    public final void r(zl6 zl6Var) {
        ak7.K0();
        throw null;
    }

    @Override // defpackage.vl6
    public final void s(long j) {
        ak7.K0();
        throw null;
    }

    @Override // defpackage.oa4, defpackage.vl6
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.oa4, defpackage.vl6
    public final vl6 u(qn2 qn2Var) {
        qn2 k = bm6.k(qn2Var, this.r, true);
        if (!this.p) {
            return bm6.g(D().u(null), k, true);
        }
        return D().u(k);
    }

    @Override // defpackage.oa4
    public final qo2 w() {
        return D().w();
    }

    @Override // defpackage.oa4
    public final ka4 x() {
        return D().x();
    }

    @Override // defpackage.oa4
    public final qn2 y() {
        return this.r;
    }
}
