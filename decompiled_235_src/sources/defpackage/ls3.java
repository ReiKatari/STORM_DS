package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ls3  reason: default package */
/* loaded from: classes.dex */
public final class ls3 {
    public final long a;
    public final long b;

    public ls3(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls3)) {
            return false;
        }
        ls3 ls3Var = (ls3) obj;
        if (this.a == ls3Var.a && this.b == ls3Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return lb1.p(xg6.s(this.a, "LeaderboardAttemptKey(leaderboardId=", ", attemptId="), this.b, ")");
    }
}
