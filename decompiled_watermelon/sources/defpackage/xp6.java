package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xp6  reason: default package */
/* loaded from: classes.dex */
public final class xp6 implements vo6 {
    public final /* synthetic */ bq6 a;

    public xp6(bq6 bq6Var) {
        this.a = bq6Var;
    }

    @Override // defpackage.vo6
    public final void a() {
        bq6 bq6Var = this.a;
        bq6Var.r.setValue(null);
        bq6Var.s.setValue(null);
    }

    @Override // defpackage.vo6
    public final void b(long j, c44 c44Var) {
        mr6 d;
        bq6 bq6Var = this.a;
        long a = az5.a(bq6Var.l(true));
        hm3 hm3Var = bq6Var.d;
        if (hm3Var != null && (d = hm3Var.d()) != null) {
            long e = d.e(a);
            bq6Var.o = e;
            bq6Var.s.setValue(new mb4(e));
            bq6Var.q = 0L;
            bq6Var.r.setValue(dp2.Cursor);
            bq6Var.t(false);
        }
    }

    @Override // defpackage.vo6
    public final void c() {
        bq6 bq6Var = this.a;
        bq6Var.r.setValue(null);
        bq6Var.s.setValue(null);
    }

    @Override // defpackage.vo6
    public final void e(long j) {
        mr6 d;
        sp2 sp2Var;
        bq6 bq6Var = this.a;
        bq6Var.q = mb4.e(bq6Var.q, j);
        hm3 hm3Var = bq6Var.d;
        if (hm3Var != null && (d = hm3Var.d()) != null) {
            bq6Var.s.setValue(new mb4(mb4.e(bq6Var.o, bq6Var.q)));
            pb4 pb4Var = bq6Var.b;
            mb4 i = bq6Var.i();
            i.getClass();
            int n = pb4Var.n(d.b(i.a, true));
            long g = ve2.g(n, n);
            if (!vr6.b(g, bq6Var.n().b)) {
                hm3 hm3Var2 = bq6Var.d;
                if ((hm3Var2 == null || ((Boolean) hm3Var2.q.getValue()).booleanValue()) && (sp2Var = bq6Var.k) != null) {
                    ((ho4) sp2Var).a(9);
                }
                bq6Var.c.n(bq6.e(bq6Var.n().a, g));
                bq6Var.w = new vr6(g);
            }
        }
    }

    @Override // defpackage.vo6
    public final void d() {
    }

    @Override // defpackage.vo6
    public final void onCancel() {
    }
}
