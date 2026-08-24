package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g95  reason: default package */
/* loaded from: classes.dex */
public final class g95 extends l95 {
    public final long a;
    public final long b;

    public g95(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g95)) {
            return false;
        }
        g95 g95Var = (g95) obj;
        if (this.a == g95Var.a && this.b == g95Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return lb1.p(xg6.s(this.a, "OnPendingSubmissionBarrier(submissionSessionId=", ", barrierId="), this.b, ")");
    }
}
