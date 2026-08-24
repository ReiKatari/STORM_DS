package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l27  reason: default package */
/* loaded from: classes.dex */
public final class l27 implements g17 {
    public final /* synthetic */ p27 a;

    public l27(p27 p27Var) {
        this.a = p27Var;
    }

    @Override // defpackage.g17
    public final void a(long j, ga6 ga6Var) {
        b47 d;
        p27 p27Var = this.a;
        long a = pa6.a(p27Var.l(true));
        jt3 jt3Var = p27Var.d;
        if (jt3Var != null && (d = jt3Var.d()) != null) {
            long e = d.e(a);
            p27Var.o = e;
            p27Var.s.setValue(new jk4(e));
            p27Var.q = 0L;
            p27Var.r.setValue(fv2.Cursor);
            p27Var.t(false);
        }
    }

    @Override // defpackage.g17
    public final void b() {
        p27 p27Var = this.a;
        p27Var.r.setValue(null);
        p27Var.s.setValue(null);
    }

    @Override // defpackage.g17
    public final void c() {
        p27 p27Var = this.a;
        p27Var.r.setValue(null);
        p27Var.s.setValue(null);
    }

    @Override // defpackage.g17
    public final void e(long j) {
        b47 d;
        tv2 tv2Var;
        p27 p27Var = this.a;
        p27Var.q = jk4.f(p27Var.q, j);
        jt3 jt3Var = p27Var.d;
        if (jt3Var != null && (d = jt3Var.d()) != null) {
            p27Var.s.setValue(new jk4(jk4.f(p27Var.o, p27Var.q)));
            mk4 mk4Var = p27Var.b;
            jk4 i = p27Var.i();
            i.getClass();
            int i2 = mk4Var.i(d.b(i.a, true));
            long f = jx2.f(i2, i2);
            if (!k47.b(f, p27Var.n().b)) {
                jt3 jt3Var2 = p27Var.d;
                if ((jt3Var2 == null || ((Boolean) jt3Var2.q.getValue()).booleanValue()) && (tv2Var = p27Var.k) != null) {
                    ((lx4) tv2Var).a(9);
                }
                p27Var.c.g(p27.e(p27Var.n().a, f));
                p27Var.w = new k47(f);
            }
        }
    }

    @Override // defpackage.g17
    public final void d() {
    }

    @Override // defpackage.g17
    public final void onCancel() {
    }
}
