package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yp6  reason: default package */
/* loaded from: classes.dex */
public final class yp6 implements vo6 {
    public final /* synthetic */ bq6 a;
    public final /* synthetic */ boolean b;

    public yp6(bq6 bq6Var, boolean z) {
        this.a = bq6Var;
        this.b = z;
    }

    @Override // defpackage.vo6
    public final void a() {
        bq6 bq6Var = this.a;
        bq6Var.r.setValue(null);
        bq6Var.s.setValue(null);
        bq6Var.t(true);
    }

    @Override // defpackage.vo6
    public final void c() {
        bq6 bq6Var = this.a;
        bq6Var.r.setValue(null);
        bq6Var.s.setValue(null);
        bq6Var.t(true);
    }

    @Override // defpackage.vo6
    public final void d() {
        dp2 dp2Var;
        mr6 d;
        boolean z = this.b;
        if (z) {
            dp2Var = dp2.SelectionStart;
        } else {
            dp2Var = dp2.SelectionEnd;
        }
        bq6 bq6Var = this.a;
        bq6Var.r.setValue(dp2Var);
        long a = az5.a(bq6Var.l(z));
        hm3 hm3Var = bq6Var.d;
        if (hm3Var != null && (d = hm3Var.d()) != null) {
            long e = d.e(a);
            bq6Var.o = e;
            bq6Var.s.setValue(new mb4(e));
            bq6Var.q = 0L;
            bq6Var.t = -1;
            hm3 hm3Var2 = bq6Var.d;
            if (hm3Var2 != null) {
                hm3Var2.q.setValue(Boolean.TRUE);
            }
            bq6Var.t(false);
        }
    }

    @Override // defpackage.vo6
    public final void e(long j) {
        bq6 bq6Var = this.a;
        long e = mb4.e(bq6Var.q, j);
        bq6Var.q = e;
        bq6Var.s.setValue(new mb4(mb4.e(bq6Var.o, e)));
        oq6 n = bq6Var.n();
        mb4 i = bq6Var.i();
        i.getClass();
        bq6.c(bq6Var, n, i.a, false, this.b, k45.m0, true, new tp2(9));
        bq6Var.t(false);
    }

    @Override // defpackage.vo6
    public final void onCancel() {
    }

    @Override // defpackage.vo6
    public final void b(long j, c44 c44Var) {
    }
}
