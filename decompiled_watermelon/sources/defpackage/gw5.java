package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gw5  reason: default package */
/* loaded from: classes.dex */
public final class gw5 extends dz3 {
    public final sw5 a;
    public final jf4 b;
    public final boolean c;
    public final a92 d;
    public final l14 e;
    public final v50 f;
    public final boolean g;
    public final eg h;

    public gw5(eg egVar, v50 v50Var, a92 a92Var, l14 l14Var, jf4 jf4Var, sw5 sw5Var, boolean z, boolean z2) {
        this.a = sw5Var;
        this.b = jf4Var;
        this.c = z;
        this.d = a92Var;
        this.e = l14Var;
        this.f = v50Var;
        this.g = z2;
        this.h = egVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, xc1, hw5] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? xc1Var = new xc1();
        xc1Var.l0 = this.a;
        xc1Var.m0 = this.b;
        xc1Var.n0 = this.c;
        xc1Var.o0 = this.d;
        xc1Var.p0 = this.e;
        xc1Var.q0 = this.f;
        xc1Var.r0 = this.g;
        xc1Var.s0 = this.h;
        return xc1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && gw5.class == obj.getClass()) {
                gw5 gw5Var = (gw5) obj;
                if (b53.x(this.a, gw5Var.a) && this.b == gw5Var.b && this.c == gw5Var.c && b53.x(this.d, gw5Var.d) && b53.x(this.e, gw5Var.e) && b53.x(this.f, gw5Var.f) && this.g == gw5Var.g && b53.x(this.h, gw5Var.h)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        l14 l14Var = this.e;
        ((hw5) yy3Var).W0(this.h, this.f, this.d, l14Var, this.b, this.a, this.g, this.c);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int c = ej6.c(ej6.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), false, 31);
        a92 a92Var = this.d;
        if (a92Var != null) {
            i = a92Var.hashCode();
        } else {
            i = 0;
        }
        int i5 = (c + i) * 31;
        l14 l14Var = this.e;
        if (l14Var != null) {
            i2 = l14Var.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        v50 v50Var = this.f;
        if (v50Var != null) {
            i3 = v50Var.hashCode();
        } else {
            i3 = 0;
        }
        int c2 = ej6.c((i6 + i3) * 31, this.g, 31);
        eg egVar = this.h;
        if (egVar != null) {
            i4 = egVar.hashCode();
        }
        return c2 + i4;
    }
}
