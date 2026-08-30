package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pc2  reason: default package */
/* loaded from: classes.dex */
public final class pc2 extends dz3 {
    public final sc2 a;

    public pc2(sc2 sc2Var) {
        this.a = sc2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, uc2] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof pc2) || !this.a.equals(((pc2) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        ((uc2) yy3Var).j0 = this.a;
    }

    public final int hashCode() {
        return this.a.A.hashCode();
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.a + ')';
    }
}
