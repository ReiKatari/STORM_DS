package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ln5  reason: default package */
/* loaded from: classes.dex */
public final class ln5 extends nn5 {
    public final ad6 a;

    public ln5(ad6 ad6Var) {
        this.a = ad6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ln5) && this.a == ((ln5) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LaunchFailedSramProblem(reason=" + this.a + ")";
    }
}
