package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uz0  reason: default package */
/* loaded from: classes.dex */
public final class uz0 extends dz3 {
    public final mi2 a;

    public uz0(mi2 mi2Var) {
        this.a = mi2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, a23, vz0] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? a23Var = new a23();
        a23Var.l0 = this.a;
        return a23Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof uz0) && ((uz0) obj).a == this.a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        vz0 vz0Var = (vz0) yy3Var;
        mi2 mi2Var = vz0Var.l0;
        mi2 mi2Var2 = this.a;
        if (mi2Var2 != mi2Var) {
            vz0Var.l0 = mi2Var2;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
