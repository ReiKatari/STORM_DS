package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sz4  reason: default package */
/* loaded from: classes.dex */
public final class sz4 extends b05 {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;

    public sz4(long j, long j2, long j3, String str, String str2, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = str2;
        this.f = j4;
        this.g = j5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sz4) {
                sz4 sz4Var = (sz4) obj;
                if (this.a != sz4Var.a || this.b != sz4Var.b || this.c != sz4Var.c || !this.d.equals(sz4Var.d) || !this.e.equals(sz4Var.e) || this.f != sz4Var.f || this.g != sz4Var.g) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + b31.c(this.f, ej6.b(ej6.b(b31.c(this.c, b31.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder q = wh1.q(this.a, "OnLeaderboardScoreboard(leaderboardId=", ", attemptId=");
        q.append(this.b);
        ej6.k(q, ", eventSequence=", this.c, ", submittedScore=");
        b31.B(q, this.d, ", bestScore=", this.e, ", newRank=");
        q.append(this.f);
        return wh1.p(q, ", numEntries=", this.g, ")");
    }
}
