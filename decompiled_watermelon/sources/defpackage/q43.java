package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q43  reason: default package */
/* loaded from: classes.dex */
public final class q43 extends dz3 {
    public final u43 a;

    public q43(u43 u43Var) {
        this.a = u43Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [r43, yy3, v43] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? v43Var = new v43(0);
        v43Var.k0 = this.a;
        v43Var.l0 = true;
        return v43Var;
    }

    public final boolean equals(Object obj) {
        q43 q43Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof q43) {
            q43Var = (q43) obj;
        } else {
            q43Var = null;
        }
        if (q43Var != null && this.a == q43Var.a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        r43 r43Var = (r43) yy3Var;
        r43Var.k0 = this.a;
        r43Var.l0 = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }
}
