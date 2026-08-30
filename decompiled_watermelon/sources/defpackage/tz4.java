package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tz4  reason: default package */
/* loaded from: classes.dex */
public final class tz4 extends b05 {
    public final long a;
    public final long b;
    public final long c;
    public final int d;
    public final String e;

    public tz4(long j, long j2, long j3, int i, String str) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = i;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tz4) {
                tz4 tz4Var = (tz4) obj;
                if (this.a != tz4Var.a || this.b != tz4Var.b || this.c != tz4Var.c || this.d != tz4Var.d || !this.e.equals(tz4Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + wh1.a(this.d, b31.c(this.c, b31.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder q = wh1.q(this.a, "OnLeaderboardSubmissionFailed(leaderboardId=", ", attemptId=");
        q.append(this.b);
        ej6.k(q, ", eventSequence=", this.c, ", resultCode=");
        q.append(this.d);
        q.append(", message=");
        q.append(this.e);
        q.append(")");
        return q.toString();
    }
}
