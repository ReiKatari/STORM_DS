package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b50  reason: default package */
/* loaded from: classes.dex */
public final class b50 extends dz3 {
    public final j20 a;
    public final boolean b;

    public b50(j20 j20Var, boolean z) {
        this.a = j20Var;
        this.b = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, c50] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        yy3Var.k0 = this.b;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        b50 b50Var;
        if (this != obj) {
            if (obj instanceof b50) {
                b50Var = (b50) obj;
            } else {
                b50Var = null;
            }
            if (b50Var != null && this.a.equals(b50Var.a) && this.b == b50Var.b) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        c50 c50Var = (c50) yy3Var;
        c50Var.j0 = this.a;
        c50Var.k0 = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
