package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n27  reason: default package */
/* loaded from: classes.dex */
public final class n27 implements g17 {
    public k47 b;
    public final /* synthetic */ p27 d;
    public boolean a = true;
    public ga6 c = xd5.o0;

    public n27(p27 p27Var) {
        this.d = p27Var;
    }

    @Override // defpackage.g17
    public final void a(long j, ga6 ga6Var) {
        long j2;
        b47 d;
        b47 d2;
        p27 p27Var = this.d;
        vs4 vs4Var = p27Var.r;
        if (p27Var.k() && ((fv2) vs4Var.getValue()) == null) {
            vs4Var.setValue(fv2.SelectionEnd);
            p27Var.t = -1;
            this.a = true;
            this.c = ga6Var;
            p27Var.o();
            jt3 jt3Var = p27Var.d;
            if (jt3Var != null && (d2 = jt3Var.d()) != null && d2.c(j)) {
                if (p27Var.n().a.B.length() != 0) {
                    p27Var.h(false);
                    long c = p27.c(p27Var, c37.a(p27Var.n(), null, k47.b, 5), j, true, false, this.c, true, new uv2(0));
                    j2 = j;
                    p27Var.p = new k47(c);
                    this.b = new k47(c);
                } else {
                    return;
                }
            } else {
                j2 = j;
                jt3 jt3Var2 = p27Var.d;
                if (jt3Var2 != null && (d = jt3Var2.d()) != null) {
                    int i = p27Var.b.i(d.b(j2, true));
                    c37 e = p27.e(p27Var.n().a, jx2.f(i, i));
                    p27Var.h(false);
                    tv2 tv2Var = p27Var.k;
                    if (tv2Var != null) {
                        ((lx4) tv2Var).a(0);
                    }
                    p27Var.c.g(e);
                    p27Var.w = new k47(e.b);
                }
                this.a = false;
            }
            p27Var.q(hv2.None);
            p27Var.o = j2;
            p27Var.s.setValue(new jk4(j2));
            p27Var.q = 0L;
        }
    }

    @Override // defpackage.g17
    public final void b() {
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    @Override // defpackage.g17
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(long j) {
        b47 d;
        int b;
        long c;
        ga6 ga6Var;
        p27 p27Var = this.d;
        if (p27Var.k() && p27Var.n().a.B.length() != 0) {
            p27Var.q = jk4.f(p27Var.q, j);
            jt3 jt3Var = p27Var.d;
            if (jt3Var != null && (d = jt3Var.d()) != null) {
                p27Var.s.setValue(new jk4(jk4.f(p27Var.o, p27Var.q)));
                if (p27Var.p == null) {
                    jk4 i = p27Var.i();
                    i.getClass();
                    if (!d.c(i.a)) {
                        int i2 = p27Var.b.i(d.b(p27Var.o, true));
                        mk4 mk4Var = p27Var.b;
                        jk4 i3 = p27Var.i();
                        i3.getClass();
                        if (i2 == mk4Var.i(d.b(i3.a, true))) {
                            ga6Var = xd5.o0;
                        } else {
                            ga6Var = xd5.p0;
                        }
                        ga6 ga6Var2 = ga6Var;
                        c37 n = p27Var.n();
                        jk4 i4 = p27Var.i();
                        i4.getClass();
                        c = p27.c(p27Var, n, i4.a, false, false, ga6Var2, true, new uv2(9));
                        this.b = new k47(c);
                        if (!k47.a(c, p27Var.p)) {
                            this.a = false;
                        }
                    }
                }
                k47 k47Var = p27Var.p;
                if (k47Var != null) {
                    b = (int) (k47Var.a >> 32);
                } else {
                    b = d.b(p27Var.o, false);
                }
                jk4 i5 = p27Var.i();
                i5.getClass();
                int b2 = d.b(i5.a, false);
                if (p27Var.p != null || b != b2) {
                    c37 n2 = p27Var.n();
                    jk4 i6 = p27Var.i();
                    i6.getClass();
                    c = p27.c(p27Var, n2, i6.a, false, false, this.c, true, new uv2(9));
                    this.b = new k47(c);
                    if (!k47.a(c, p27Var.p)) {
                    }
                } else {
                    return;
                }
            }
            p27Var.t(false);
        }
    }

    public final void f() {
        long j;
        hv2 hv2Var;
        boolean z;
        boolean z2;
        p27 p27Var = this.d;
        p27Var.r.setValue(null);
        p27Var.s.setValue(null);
        this.c = xd5.o0;
        boolean z3 = true;
        p27Var.t(true);
        k47 k47Var = this.b;
        if (k47Var != null) {
            j = k47Var.a;
        } else {
            j = p27Var.n().b;
        }
        boolean c = k47.c(j);
        if (c) {
            hv2Var = hv2.Cursor;
        } else {
            hv2Var = hv2.Selection;
        }
        p27Var.q(hv2Var);
        jt3 jt3Var = p27Var.d;
        if (jt3Var != null) {
            if (!c && kn2.O(p27Var, true)) {
                z2 = true;
            } else {
                z2 = false;
            }
            jt3Var.m.setValue(Boolean.valueOf(z2));
        }
        jt3 jt3Var2 = p27Var.d;
        if (jt3Var2 != null) {
            if (!c && kn2.O(p27Var, false)) {
                z = true;
            } else {
                z = false;
            }
            jt3Var2.n.setValue(Boolean.valueOf(z));
        }
        jt3 jt3Var3 = p27Var.d;
        if (jt3Var3 != null) {
            if (!c || !kn2.O(p27Var, true)) {
                z3 = false;
            }
            jt3Var3.o.setValue(Boolean.valueOf(z3));
        }
        if (this.a) {
            p27.b(p27Var, p27Var.p);
        }
        p27Var.p = null;
    }

    @Override // defpackage.g17
    public final void onCancel() {
        f();
    }

    @Override // defpackage.g17
    public final void c() {
    }

    @Override // defpackage.g17
    public final void d() {
    }
}
