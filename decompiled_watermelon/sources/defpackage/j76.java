package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j76  reason: default package */
/* loaded from: classes.dex */
public final class j76 extends dz3 {
    public final sc6 a;

    public j76(sc6 sc6Var) {
        this.a = sc6Var;
    }

    @Override // defpackage.dz3
    public final yy3 c() {
        return new m76(this.a);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof j76) && ((j76) obj).a.equals(this.a)) {
            j20 j20Var = y60.L;
            if (j20Var.equals(j20Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        ((m76) yy3Var).k0 = this.a;
    }

    public final int hashCode() {
        return (Float.hashCode(-1.0f) + (Float.hashCode(-1.0f) * 31) + (this.a.hashCode() * 31)) * 31;
    }
}
