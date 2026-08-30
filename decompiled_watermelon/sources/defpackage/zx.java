package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zx  reason: default package */
/* loaded from: classes.dex */
public final class zx extends yy3 {
    public dt6 j0;
    public final /* synthetic */ ay k0;

    public zx(ay ayVar) {
        this.k0 = ayVar;
    }

    @Override // defpackage.yy3
    public final void J0() {
        ay ayVar = this.k0;
        ayVar.a = this;
        if (ayVar.b != null) {
            R0();
        }
    }

    @Override // defpackage.yy3
    public final void K0() {
        ay ayVar = this.k0;
        if (ayVar.a == this) {
            ayVar.a = null;
        }
        dt6 dt6Var = this.j0;
        if (dt6Var != null) {
            dt6Var.b();
        }
        this.j0 = null;
    }

    public final void R0() {
        x xVar = new x(3, this, this.k0);
        vf3 P = l.P(this);
        int i = P.B;
        b65 rectManager = ((ee) yf3.a(P)).getRectManager();
        et6 et6Var = rectManager.c;
        et6Var.getClass();
        j14 j14Var = et6Var.a;
        dt6 dt6Var = new dt6(et6Var, i, this, xVar);
        Object b = j14Var.b(i);
        if (b == null) {
            j14Var.i(i, dt6Var);
            b = dt6Var;
        }
        dt6 dt6Var2 = (dt6) b;
        if (dt6Var2 != dt6Var) {
            while (true) {
                dt6 dt6Var3 = dt6Var2.d;
                if (dt6Var3 == null) {
                    break;
                }
                dt6Var2 = dt6Var3;
            }
            dt6Var2.d = dt6Var;
        }
        if (l.P(this.A).Z) {
            rectManager.b.k(i, true);
        }
        rectManager.e = true;
        rectManager.i();
        this.j0 = dt6Var;
    }
}
