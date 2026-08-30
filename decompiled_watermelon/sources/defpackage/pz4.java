package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pz4  reason: default package */
/* loaded from: classes.dex */
public final class pz4 extends b05 {
    public final long a;
    public final long b;
    public final long c;
    public final String d;

    public pz4(long j, long j2, long j3, String str) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pz4) {
                pz4 pz4Var = (pz4) obj;
                if (this.a != pz4Var.a || this.b != pz4Var.b || this.c != pz4Var.c || !this.d.equals(pz4Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + b31.c(this.c, b31.c(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder q = wh1.q(this.a, "OnLeaderboardAttemptSubmitted(leaderboardId=", ", attemptId=");
        q.append(this.b);
        ej6.k(q, ", eventSequence=", this.c, ", trackerDisplay=");
        return b31.q(q, this.d, ")");
    }
}
