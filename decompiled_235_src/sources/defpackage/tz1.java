package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tz1  reason: default package */
/* loaded from: classes.dex */
public final class tz1 {
    public final long a;
    public final long b;

    public tz1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz1)) {
            return false;
        }
        tz1 tz1Var = (tz1) obj;
        if (this.a == tz1Var.a && this.b == tz1Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return lb1.p(xg6.s(this.a, "PendingRaSubmissionBarrier(submissionSessionId=", ", barrierId="), this.b, ")");
    }
}
