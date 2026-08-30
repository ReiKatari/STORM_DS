package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lj5  reason: default package */
/* loaded from: classes.dex */
public final class lj5 extends mj5 {
    public final jj5 a;

    public lj5(jj5 jj5Var) {
        jj5Var.getClass();
        this.a = jj5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lj5) && b53.x(this.a, ((lj5) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Ready(romConfigUiModel=" + this.a + ")";
    }
}
