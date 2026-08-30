package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: if5  reason: default package */
/* loaded from: classes.dex */
public final class if5 {
    public final int a;
    public final long b;

    public if5(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if5)) {
            return false;
        }
        if5 if5Var = (if5) obj;
        if (this.a == if5Var.a && this.b == if5Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Weight(passCount=" + this.a + ", sourceBytes=" + this.b + ")";
    }
}
