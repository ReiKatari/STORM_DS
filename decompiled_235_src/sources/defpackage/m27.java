package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m27  reason: default package */
/* loaded from: classes.dex */
public final class m27 implements g17 {
    public final /* synthetic */ p27 a;
    public final /* synthetic */ boolean b;

    public m27(p27 p27Var, boolean z) {
        this.a = p27Var;
        this.b = z;
    }

    @Override // defpackage.g17
    public final void b() {
        p27 p27Var = this.a;
        p27Var.r.setValue(null);
        p27Var.s.setValue(null);
        p27Var.t(true);
    }

    @Override // defpackage.g17
    public final void c() {
        p27 p27Var = this.a;
        p27Var.r.setValue(null);
        p27Var.s.setValue(null);
        p27Var.t(true);
    }

    @Override // defpackage.g17
    public final void d() {
        fv2 fv2Var;
        b47 d;
        boolean z = this.b;
        if (z) {
            fv2Var = fv2.SelectionStart;
        } else {
            fv2Var = fv2.SelectionEnd;
        }
        p27 p27Var = this.a;
        p27Var.r.setValue(fv2Var);
        long a = pa6.a(p27Var.l(z));
        jt3 jt3Var = p27Var.d;
        if (jt3Var != null && (d = jt3Var.d()) != null) {
            long e = d.e(a);
            p27Var.o = e;
            p27Var.s.setValue(new jk4(e));
            p27Var.q = 0L;
            p27Var.t = -1;
            jt3 jt3Var2 = p27Var.d;
            if (jt3Var2 != null) {
                jt3Var2.q.setValue(Boolean.TRUE);
            }
            p27Var.t(false);
        }
    }

    @Override // defpackage.g17
    public final void e(long j) {
        p27 p27Var = this.a;
        long f = jk4.f(p27Var.q, j);
        p27Var.q = f;
        p27Var.s.setValue(new jk4(jk4.f(p27Var.o, f)));
        c37 n = p27Var.n();
        jk4 i = p27Var.i();
        i.getClass();
        p27.c(p27Var, n, i.a, false, this.b, xd5.r0, true, new uv2(9));
        p27Var.t(false);
    }

    @Override // defpackage.g17
    public final void onCancel() {
    }

    @Override // defpackage.g17
    public final void a(long j, ga6 ga6Var) {
    }
}
