package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ej5  reason: default package */
/* loaded from: classes.dex */
public final class ej5 implements w61, bj5 {
    public static final wj0 R = new wj0(0);
    public final l61 A;
    public final ej5 B = this;
    public volatile l61 L;

    public ej5(l61 l61Var) {
        this.A = l61Var;
    }

    @Override // defpackage.w61
    public final l61 A() {
        l61 l61Var;
        l61 l61Var2;
        l61 l61Var3 = this.L;
        if (l61Var3 == null || l61Var3 == R) {
            cy0 cy0Var = (cy0) this.A.Z(cy0.B);
            if (cy0Var != null) {
                l61Var = new dj5(cy0Var, this);
            } else {
                l61Var = vt1.A;
            }
            synchronized (this.B) {
                try {
                    l61 l61Var4 = this.L;
                    if (l61Var4 == null) {
                        l61 l61Var5 = this.A;
                        l61Var2 = l61Var5.N(new tc3((rc3) l61Var5.Z(vs0.h0))).N(vt1.A).N(l61Var);
                    } else if (l61Var4 == R) {
                        l61 l61Var6 = this.A;
                        tc3 tc3Var = new tc3((rc3) l61Var6.Z(vs0.h0));
                        tc3Var.s(new zj2(0));
                        l61Var2 = l61Var6.N(tc3Var).N(vt1.A).N(l61Var);
                    } else {
                        l61Var2 = l61Var4;
                    }
                    this.L = l61Var2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            l61Var3 = l61Var2;
        }
        l61Var3.getClass();
        return l61Var3;
    }

    @Override // defpackage.bj5
    public final void a() {
        d();
    }

    @Override // defpackage.bj5
    public final void b() {
        d();
    }

    public final void d() {
        synchronized (this.B) {
            try {
                l61 l61Var = this.L;
                if (l61Var == null) {
                    this.L = R;
                } else {
                    yh2.m(l61Var, new zj2(0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bj5
    public final void c() {
    }
}
