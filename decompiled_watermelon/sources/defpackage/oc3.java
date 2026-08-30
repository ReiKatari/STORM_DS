package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oc3  reason: default package */
/* loaded from: classes.dex */
public final class oc3 extends pc3 {
    public final hn5 a;

    public oc3(hn5 hn5Var) {
        hn5Var.getClass();
        this.a = hn5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof oc3) && b53.x(this.a, ((oc3) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Rom(result=" + this.a + ")";
    }
}
