package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y85  reason: default package */
/* loaded from: classes.dex */
public final class y85 extends l95 {
    public final long a;
    public final long b;
    public final long c;

    public y85(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y85)) {
            return false;
        }
        y85 y85Var = (y85) obj;
        if (this.a == y85Var.a && this.b == y85Var.b && this.c == y85Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + i61.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder s = xg6.s(this.a, "OnLeaderboardAttemptStarted(leaderboardId=", ", attemptId=");
        s.append(this.b);
        return lb1.r(s, ", eventSequence=", this.c, ")");
    }
}
