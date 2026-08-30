package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ef3  reason: default package */
/* loaded from: classes.dex */
public final class ef3 extends dz3 {
    public final String a;

    public ef3(String str) {
        this.a = str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, ff3] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ef3) || !this.a.equals(((ef3) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        ((ff3) yy3Var).j0 = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.a) + ')';
    }
}
