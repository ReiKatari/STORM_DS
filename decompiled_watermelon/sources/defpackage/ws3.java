package defpackage;

import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ws3  reason: default package */
/* loaded from: classes.dex */
public final class ws3 extends dz3 {
    public final el0 a;
    public final fq6 b;
    public final lo4 c;

    public ws3(el0 el0Var, fq6 fq6Var, lo4 lo4Var) {
        this.a = el0Var;
        this.b = fq6Var;
        this.c = lo4Var;
    }

    @Override // defpackage.dz3
    public final yy3 c() {
        return new zs3(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        zs3 zs3Var = (zs3) yy3Var;
        zs3Var.getClass();
        lo4 lo4Var = zs3Var.l0;
        View view = zs3Var.m0;
        od1 od1Var = zs3Var.n0;
        zs3Var.j0 = this.a;
        zs3Var.k0 = this.b;
        lo4 lo4Var2 = this.c;
        zs3Var.l0 = lo4Var2;
        View S = se.S(zs3Var);
        od1 od1Var2 = l.P(zs3Var).t0;
        if (zs3Var.o0 != null) {
            qz5 qz5Var = at3.a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !lo4Var2.a()) || !ji1.b(Float.NaN, Float.NaN) || !ji1.b(Float.NaN, Float.NaN) || !lo4Var2.equals(lo4Var) || !S.equals(view) || !b53.x(od1Var2, od1Var)) {
                zs3Var.S0();
            }
        }
        zs3Var.T0();
    }

    public final int hashCode() {
        int c = ej6.c(ej6.a(Float.NaN, ej6.a(Float.NaN, b31.c(9205357640488583168L, ej6.c(ej6.a(Float.NaN, this.a.hashCode() * 961, 31), true, 31), 31), 31), 31), true, 31);
        return this.c.hashCode() + ((this.b.hashCode() + c) * 31);
    }
}
