package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m50  reason: default package */
/* loaded from: classes.dex */
public final class m50 extends dz3 {
    public final o50 a;

    public m50(o50 o50Var) {
        this.a = o50Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, p50] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m50) {
                if (!b53.x(this.a, ((m50) obj).a)) {
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
        p50 p50Var = (p50) yy3Var;
        o50 o50Var = p50Var.j0;
        if (o50Var != null) {
            o50Var.a.k(p50Var);
        }
        o50 o50Var2 = this.a;
        if (o50Var2 != null) {
            o50Var2.a.b(p50Var);
        }
        p50Var.j0 = o50Var2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
