package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p95  reason: default package */
/* loaded from: classes.dex */
public final class p95 implements o31, l95 {
    public static final nh0 R = new nh0(0);
    public final e31 A;
    public final p95 B = this;
    public volatile e31 L;

    public p95(e31 e31Var) {
        this.A = e31Var;
    }

    @Override // defpackage.l95
    public final void b() {
        d();
    }

    @Override // defpackage.l95
    public final void c() {
        d();
    }

    public final void d() {
        synchronized (this.B) {
            try {
                e31 e31Var = this.L;
                if (e31Var == null) {
                    this.L = R;
                } else {
                    ln2.t(e31Var, new af2(0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.o31
    public final e31 w() {
        e31 e31Var;
        e31 e31Var2;
        e31 e31Var3 = this.L;
        if (e31Var3 == null || e31Var3 == R) {
            gv0 gv0Var = (gv0) this.A.I(gv0.B);
            if (gv0Var != null) {
                e31Var = new o95(gv0Var, this);
            } else {
                e31Var = mp1.A;
            }
            synchronized (this.B) {
                try {
                    e31 e31Var4 = this.L;
                    if (e31Var4 == null) {
                        e31 e31Var5 = this.A;
                        e31Var2 = e31Var5.C(new e63((c63) e31Var5.I(k45.d0))).C(mp1.A).C(e31Var);
                    } else if (e31Var4 == R) {
                        e31 e31Var6 = this.A;
                        e63 e63Var = new e63((c63) e31Var6.I(k45.d0));
                        e63Var.t(new af2(0));
                        e31Var2 = e31Var6.C(e63Var).C(mp1.A).C(e31Var);
                    } else {
                        e31Var2 = e31Var4;
                    }
                    this.L = e31Var2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            e31Var3 = e31Var2;
        }
        e31Var3.getClass();
        return e31Var3;
    }

    @Override // defpackage.l95
    public final void a() {
    }
}
