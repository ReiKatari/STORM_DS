package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z85  reason: default package */
/* loaded from: classes.dex */
public final class z85 extends l95 {
    public final long a;
    public final long b;
    public final long c;
    public final String d;

    public z85(long j, long j2, long j3, String str) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof z85) {
                z85 z85Var = (z85) obj;
                if (this.a != z85Var.a || this.b != z85Var.b || this.c != z85Var.c || !this.d.equals(z85Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + i61.c(this.c, i61.c(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder s = xg6.s(this.a, "OnLeaderboardAttemptSubmitted(leaderboardId=", ", attemptId=");
        s.append(this.b);
        xg6.B(s, ", eventSequence=", this.c, ", trackerDisplay=");
        return i61.n(s, this.d, ")");
    }
}
