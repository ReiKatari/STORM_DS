package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e95  reason: default package */
/* loaded from: classes.dex */
public final class e95 extends l95 {
    public final long a;
    public final long b;
    public final long c;

    public e95(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e95)) {
            return false;
        }
        e95 e95Var = (e95) obj;
        if (this.a == e95Var.a && this.b == e95Var.b && this.c == e95Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + i61.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder s = xg6.s(this.a, "OnLeaderboardTrackerHidden(leaderboardId=", ", attemptId=");
        s.append(this.b);
        return lb1.r(s, ", eventSequence=", this.c, ")");
    }
}
