package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ly5  reason: default package */
/* loaded from: classes.dex */
public final class ly5 extends dz3 {
    public final boolean a;
    public final l14 b;
    public final jy2 c;
    public final boolean d;
    public final boolean e;
    public final og5 f;
    public final ki2 g;

    public ly5(boolean z, l14 l14Var, jy2 jy2Var, boolean z2, boolean z3, og5 og5Var, ki2 ki2Var) {
        this.a = z;
        this.b = l14Var;
        this.c = jy2Var;
        this.d = z2;
        this.e = z3;
        this.f = og5Var;
        this.g = ki2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, my5, g0] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? g0Var = new g0(this.b, this.c, this.d, this.e, null, this.f, this.g);
        g0Var.I0 = this.a;
        return g0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ly5.class == obj.getClass()) {
                ly5 ly5Var = (ly5) obj;
                if (this.a != ly5Var.a || !b53.x(this.b, ly5Var.b) || !b53.x(this.c, ly5Var.c) || this.d != ly5Var.d || this.e != ly5Var.e || !b53.x(this.f, ly5Var.f) || this.g != ly5Var.g) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        my5 my5Var = (my5) yy3Var;
        boolean z = my5Var.I0;
        boolean z2 = this.a;
        if (z != z2) {
            my5Var.I0 = z2;
            nl2.M(my5Var);
        }
        my5Var.f1(this.b, this.c, this.d, this.e, null, this.f, this.g);
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = Boolean.hashCode(this.a) * 31;
        int i3 = 0;
        l14 l14Var = this.b;
        if (l14Var != null) {
            i = l14Var.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        jy2 jy2Var = this.c;
        if (jy2Var != null) {
            i2 = jy2Var.hashCode();
        } else {
            i2 = 0;
        }
        int c = ej6.c(ej6.c((i4 + i2) * 31, this.d, 31), this.e, 31);
        og5 og5Var = this.f;
        if (og5Var != null) {
            i3 = Integer.hashCode(og5Var.a);
        }
        return this.g.hashCode() + ((c + i3) * 31);
    }
}
