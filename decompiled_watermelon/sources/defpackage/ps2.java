package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ps2  reason: default package */
/* loaded from: classes.dex */
public final class ps2 extends dz3 {
    public final l14 a;

    public ps2(l14 l14Var) {
        this.a = l14Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, ts2] */
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
        if ((obj instanceof ps2) && b53.x(((ps2) obj).a, this.a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        ts2 ts2Var = (ts2) yy3Var;
        l14 l14Var = ts2Var.j0;
        l14 l14Var2 = this.a;
        if (!b53.x(l14Var, l14Var2)) {
            ts2Var.T0();
            ts2Var.j0 = l14Var2;
        }
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
