package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c95  reason: default package */
/* loaded from: classes.dex */
public final class c95 extends l95 {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;

    public c95(long j, long j2, long j3, String str, String str2, long j4, long j5) {
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
            if (obj instanceof c95) {
                c95 c95Var = (c95) obj;
                if (this.a != c95Var.a || this.b != c95Var.b || this.c != c95Var.c || !this.d.equals(c95Var.d) || !this.e.equals(c95Var.e) || this.f != c95Var.f || this.g != c95Var.g) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + i61.c(this.f, xg6.d(xg6.d(i61.c(this.c, i61.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder s = xg6.s(this.a, "OnLeaderboardScoreboard(leaderboardId=", ", attemptId=");
        s.append(this.b);
        xg6.B(s, ", eventSequence=", this.c, ", submittedScore=");
        i61.B(s, this.d, ", bestScore=", this.e, ", newRank=");
        s.append(this.f);
        return lb1.r(s, ", numEntries=", this.g, ")");
    }
}
