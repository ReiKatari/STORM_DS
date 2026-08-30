package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yj5  reason: default package */
/* loaded from: classes.dex */
public final class yj5 extends dk5 {
    public final is5 a;

    public yj5(is5 is5Var) {
        is5Var.getClass();
        this.a = is5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof yj5) && this.a == ((yj5) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RuntimeMicSourceUpdate(newRuntimeMicSource=" + this.a + ")";
    }
}
