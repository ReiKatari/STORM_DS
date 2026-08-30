package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qz4  reason: default package */
/* loaded from: classes.dex */
public final class qz4 extends b05 {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final boolean e;

    public qz4(long j, long j2, long j3, String str, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qz4) {
                qz4 qz4Var = (qz4) obj;
                if (this.a != qz4Var.a || this.b != qz4Var.b || this.c != qz4Var.c || !this.d.equals(qz4Var.d) || this.e != qz4Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ej6.b(b31.c(this.c, b31.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder q = wh1.q(this.a, "OnLeaderboardAttemptUpdated(leaderboardId=", ", attemptId=");
        q.append(this.b);
        ej6.k(q, ", eventSequence=", this.c, ", formattedValue=");
        q.append(this.d);
        q.append(", trackerShown=");
        q.append(this.e);
        q.append(")");
        return q.toString();
    }
}
