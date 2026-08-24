package defpackage;

import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a04  reason: default package */
/* loaded from: classes.dex */
public final class a04 extends e74 {
    public final mn0 a;
    public final t27 b;
    public final px4 c;

    public a04(mn0 mn0Var, t27 t27Var, px4 px4Var) {
        this.a = mn0Var;
        this.b = t27Var;
        this.c = px4Var;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new c04(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        c04 c04Var = (c04) z64Var;
        c04Var.getClass();
        px4 px4Var = c04Var.m0;
        View view = c04Var.n0;
        qh1 qh1Var = c04Var.o0;
        c04Var.k0 = this.a;
        c04Var.l0 = this.b;
        px4 px4Var2 = this.c;
        c04Var.m0 = px4Var2;
        View z = jw2.z(c04Var);
        qh1 qh1Var2 = nc1.f0(c04Var).u0;
        if (c04Var.p0 != null) {
            fb6 fb6Var = d04.a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !px4Var2.a()) || !om1.b(Float.NaN, Float.NaN) || !om1.b(Float.NaN, Float.NaN) || !px4Var2.equals(px4Var) || !z.equals(view) || !nb3.k(qh1Var2, qh1Var)) {
                c04Var.S0();
            }
        }
        c04Var.T0();
    }

    public final int hashCode() {
        int e = xg6.e(xg6.a(Float.NaN, xg6.a(Float.NaN, i61.c(9205357640488583168L, xg6.e(xg6.a(Float.NaN, this.a.hashCode() * 961, 31), true, 31), 31), 31), 31), true, 31);
        return this.c.hashCode() + ((this.b.hashCode() + e) * 31);
    }
}
