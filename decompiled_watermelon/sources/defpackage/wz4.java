package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wz4  reason: default package */
/* loaded from: classes.dex */
public final class wz4 extends b05 {
    public final long a;
    public final long b;

    public wz4(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz4)) {
            return false;
        }
        wz4 wz4Var = (wz4) obj;
        if (this.a == wz4Var.a && this.b == wz4Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wh1.n(wh1.q(this.a, "OnPendingSubmissionBarrier(submissionSessionId=", ", barrierId="), this.b, ")");
    }
}
