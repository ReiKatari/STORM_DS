package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j32  reason: default package */
/* loaded from: classes.dex */
public final class j32 {
    public final long a;
    public final r35 b;

    public j32(long j, r35 r35Var) {
        r35Var.getClass();
        this.a = j;
        this.b = r35Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j32)) {
            return false;
        }
        j32 j32Var = (j32) obj;
        if (this.a == j32Var.a && this.b == j32Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ExpectedNativeRaSubmission(nativeSubmissionId=" + this.a + ", type=" + this.b + ")";
    }
}
