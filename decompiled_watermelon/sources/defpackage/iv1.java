package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: iv1  reason: default package */
/* loaded from: classes.dex */
public final class iv1 {
    public final long a;
    public final long b;

    public iv1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv1)) {
            return false;
        }
        iv1 iv1Var = (iv1) obj;
        if (this.a == iv1Var.a && this.b == iv1Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wh1.n(wh1.q(this.a, "PendingRaSubmissionBarrier(submissionSessionId=", ", barrierId="), this.b, ")");
    }
}
