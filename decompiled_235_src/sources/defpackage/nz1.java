package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nz1  reason: default package */
/* loaded from: classes.dex */
public final class nz1 {
    public final long a;
    public final long b;
    public final long c;

    public nz1(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz1)) {
            return false;
        }
        nz1 nz1Var = (nz1) obj;
        if (this.a == nz1Var.a && this.b == nz1Var.b && this.c == nz1Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + i61.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder s = xg6.s(this.a, "LeaderboardEventIdentity(leaderboardId=", ", attemptId=");
        s.append(this.b);
        return lb1.r(s, ", eventSequence=", this.c, ")");
    }
}
