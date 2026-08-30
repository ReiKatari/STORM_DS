package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s72  reason: default package */
/* loaded from: classes.dex */
public final class s72 extends dz3 {
    public final sf1 a;
    public final float b;

    public s72(sf1 sf1Var, float f) {
        this.a = sf1Var;
        this.b = f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, t72] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        yy3Var.k0 = this.b;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s72)) {
            return false;
        }
        s72 s72Var = (s72) obj;
        if (this.a == s72Var.a && this.b == s72Var.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        t72 t72Var = (t72) yy3Var;
        t72Var.j0 = this.a;
        t72Var.k0 = this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
