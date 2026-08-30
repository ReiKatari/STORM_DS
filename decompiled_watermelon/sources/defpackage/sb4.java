package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sb4  reason: default package */
/* loaded from: classes.dex */
public final class sb4 extends dz3 {
    public final mi2 a;

    public sb4(mi2 mi2Var) {
        this.a = mi2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, tb4] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        yy3Var.k0 = true;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        sb4 sb4Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof sb4) {
            sb4Var = (sb4) obj;
        } else {
            sb4Var = null;
        }
        if (sb4Var != null && this.a == sb4Var.a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        tb4 tb4Var = (tb4) yy3Var;
        mi2 mi2Var = tb4Var.j0;
        mi2 mi2Var2 = this.a;
        if (mi2Var != mi2Var2 || !tb4Var.k0) {
            l.P(tb4Var).U(false);
        }
        tb4Var.j0 = mi2Var2;
        tb4Var.k0 = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.a + ", rtlAware=true)";
    }
}
