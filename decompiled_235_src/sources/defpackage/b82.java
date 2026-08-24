package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b82  reason: default package */
/* loaded from: classes.dex */
public final class b82 {
    public final long a;
    public final bd5 b;

    public b82(long j, bd5 bd5Var) {
        bd5Var.getClass();
        this.a = j;
        this.b = bd5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b82)) {
            return false;
        }
        b82 b82Var = (b82) obj;
        if (this.a == b82Var.a && this.b == b82Var.b) {
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
