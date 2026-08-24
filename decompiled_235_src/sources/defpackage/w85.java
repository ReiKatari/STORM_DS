package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w85  reason: default package */
/* loaded from: classes.dex */
public final class w85 extends l95 {
    public final long a;
    public final long b;
    public final long c;

    public w85(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w85)) {
            return false;
        }
        w85 w85Var = (w85) obj;
        if (this.a == w85Var.a && this.b == w85Var.b && this.c == w85Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + i61.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder s = xg6.s(this.a, "OnLeaderboardAttemptCancelled(leaderboardId=", ", attemptId=");
        s.append(this.b);
        return lb1.r(s, ", eventSequence=", this.c, ")");
    }
}
