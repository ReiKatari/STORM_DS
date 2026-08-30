package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tw5  reason: default package */
/* loaded from: classes.dex */
public final class tw5 extends dz3 {
    public final fw5 a;

    public tw5(fw5 fw5Var) {
        this.a = fw5Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bw5, yy3] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        yy3Var.k0 = true;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tw5) {
            if (b53.x(this.a, ((tw5) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        bw5 bw5Var = (bw5) yy3Var;
        bw5Var.j0 = this.a;
        bw5Var.k0 = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ej6.c(this.a.hashCode() * 31, false, 31);
    }
}
