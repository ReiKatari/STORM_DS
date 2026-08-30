package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lh4  reason: default package */
/* loaded from: classes.dex */
public final class lh4 extends dz3 {
    public final ih4 a;

    public lh4(ih4 ih4Var) {
        this.a = ih4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, oh4] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        lh4 lh4Var;
        if (obj instanceof lh4) {
            lh4Var = (lh4) obj;
        } else {
            lh4Var = null;
        }
        if (lh4Var == null) {
            return false;
        }
        return b53.x(this.a, lh4Var.a);
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        ((oh4) yy3Var).j0 = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
