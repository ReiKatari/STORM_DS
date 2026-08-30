package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wj1  reason: default package */
/* loaded from: classes.dex */
public final class wj1 extends dz3 {
    public static final nl0 i = new nl0(22);
    public final ak1 a;
    public final jf4 b;
    public final boolean c;
    public final l14 d;
    public final boolean e;
    public final bj2 f;
    public final bj2 g;
    public final boolean h;

    public wj1(ak1 ak1Var, jf4 jf4Var, boolean z, l14 l14Var, boolean z2, xj1 xj1Var, bj2 bj2Var, boolean z3) {
        this.a = ak1Var;
        this.b = jf4Var;
        this.c = z;
        this.d = l14Var;
        this.e = z2;
        this.f = xj1Var;
        this.g = bj2Var;
        this.h = z3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [zj1, yy3, sj1] */
    @Override // defpackage.dz3
    public final yy3 c() {
        nl0 nl0Var = i;
        boolean z = this.c;
        l14 l14Var = this.d;
        jf4 jf4Var = this.b;
        ?? sj1Var = new sj1(nl0Var, z, l14Var, jf4Var);
        sj1Var.E0 = this.a;
        sj1Var.F0 = jf4Var;
        sj1Var.G0 = this.e;
        sj1Var.H0 = this.f;
        sj1Var.I0 = this.g;
        sj1Var.J0 = this.h;
        return sj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wj1.class != obj.getClass()) {
            return false;
        }
        wj1 wj1Var = (wj1) obj;
        if (b53.x(this.a, wj1Var.a) && this.b == wj1Var.b && this.c == wj1Var.c && b53.x(this.d, wj1Var.d) && this.e == wj1Var.e && b53.x(this.f, wj1Var.f) && b53.x(this.g, wj1Var.g) && this.h == wj1Var.h) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        boolean z;
        boolean z2;
        zj1 zj1Var = (zj1) yy3Var;
        ak1 ak1Var = zj1Var.E0;
        ak1 ak1Var2 = this.a;
        if (!b53.x(ak1Var, ak1Var2)) {
            zj1Var.E0 = ak1Var2;
            z = true;
        } else {
            z = false;
        }
        jf4 jf4Var = zj1Var.F0;
        jf4 jf4Var2 = this.b;
        if (jf4Var != jf4Var2) {
            zj1Var.F0 = jf4Var2;
            z = true;
        }
        boolean z3 = zj1Var.J0;
        boolean z4 = this.h;
        if (z3 != z4) {
            zj1Var.J0 = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        zj1Var.H0 = this.f;
        zj1Var.I0 = this.g;
        zj1Var.G0 = this.e;
        zj1Var.l1(i, this.c, this.d, jf4Var2, z2);
    }

    public final int hashCode() {
        int i2;
        int c = ej6.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
        l14 l14Var = this.d;
        if (l14Var != null) {
            i2 = l14Var.hashCode();
        } else {
            i2 = 0;
        }
        int c2 = ej6.c((c + i2) * 31, this.e, 31);
        int hashCode = this.g.hashCode();
        return Boolean.hashCode(this.h) + ((hashCode + ((this.f.hashCode() + c2) * 31)) * 31);
    }
}
