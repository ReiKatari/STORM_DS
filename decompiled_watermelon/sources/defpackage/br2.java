package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: br2  reason: default package */
/* loaded from: classes.dex */
final class br2 extends dz3 {
    public final ds6 a;
    public final int b;
    public final int c;

    public br2(ds6 ds6Var, int i, int i2) {
        this.a = ds6Var;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, dr2] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        yy3Var.k0 = this.b;
        yy3Var.l0 = this.c;
        yy3Var.n0 = -1;
        yy3Var.o0 = -1;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof br2) {
                br2 br2Var = (br2) obj;
                if (!b53.x(this.a, br2Var.a) || this.b != br2Var.b || this.c != br2Var.c) {
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
        dr2 dr2Var = (dr2) yy3Var;
        ds6 ds6Var = dr2Var.j0;
        ds6 ds6Var2 = this.a;
        boolean x = b53.x(ds6Var, ds6Var2);
        int i = this.b;
        int i2 = this.c;
        if (x && dr2Var.k0 == i && dr2Var.l0 == i2) {
            return;
        }
        dr2Var.j0 = ds6Var2;
        dr2Var.k0 = i;
        dr2Var.l0 = i2;
        dr2Var.p0 = cg2.T(ds6Var2, l.P(dr2Var).u0);
        dr2Var.m0 = true;
        hi2.D(dr2Var);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }
}
