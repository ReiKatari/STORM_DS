package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f52  reason: default package */
/* loaded from: classes.dex */
public final class f52 implements j52 {
    public final qb5 a;

    public f52(qb5 qb5Var) {
        this.a = qb5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f52) && this.a == ((f52) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Supported(resolvedFeatureGroup=" + this.a + ')';
    }
}
