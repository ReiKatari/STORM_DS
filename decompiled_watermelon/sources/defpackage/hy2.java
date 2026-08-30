package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hy2  reason: default package */
/* loaded from: classes.dex */
public final class hy2 extends dz3 {
    public final l14 a;
    public final jy2 b;

    public hy2(l14 l14Var, jy2 jy2Var) {
        this.a = l14Var;
        this.b = jy2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, iy2, xc1] */
    @Override // defpackage.dz3
    public final yy3 c() {
        vc1 a = this.b.a(this.a);
        ?? xc1Var = new xc1();
        xc1Var.l0 = a;
        xc1Var.R0(a);
        return xc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy2)) {
            return false;
        }
        hy2 hy2Var = (hy2) obj;
        if (b53.x(this.a, hy2Var.a) && b53.x(this.b, hy2Var.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        iy2 iy2Var = (iy2) yy3Var;
        vc1 a = this.b.a(this.a);
        iy2Var.S0(iy2Var.l0);
        iy2Var.l0 = a;
        iy2Var.R0(a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
