package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lk1  reason: default package */
/* loaded from: classes.dex */
public final class lk1 extends dz3 {
    public final mi2 a;

    public lk1(mi2 mi2Var) {
        this.a = mi2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, mk1] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk1)) {
            return false;
        }
        if (this.a == ((lk1) obj).a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        ((mk1) yy3Var).j0 = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
