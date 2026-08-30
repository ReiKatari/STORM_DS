package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mz4  reason: default package */
/* loaded from: classes.dex */
public final class mz4 extends b05 {
    public final long a;
    public final long b;
    public final long c;

    public mz4(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz4)) {
            return false;
        }
        mz4 mz4Var = (mz4) obj;
        if (this.a == mz4Var.a && this.b == mz4Var.b && this.c == mz4Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + b31.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder q = wh1.q(this.a, "OnLeaderboardAttemptCancelled(leaderboardId=", ", attemptId=");
        q.append(this.b);
        return wh1.p(q, ", eventSequence=", this.c, ")");
    }
}
