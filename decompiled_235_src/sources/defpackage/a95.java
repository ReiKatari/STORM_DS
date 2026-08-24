package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a95  reason: default package */
/* loaded from: classes.dex */
public final class a95 extends l95 {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final boolean e;

    public a95(long j, long j2, long j3, String str, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a95) {
                a95 a95Var = (a95) obj;
                if (this.a != a95Var.a || this.b != a95Var.b || this.c != a95Var.c || !this.d.equals(a95Var.d) || this.e != a95Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xg6.d(i61.c(this.c, i61.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder s = xg6.s(this.a, "OnLeaderboardAttemptUpdated(leaderboardId=", ", attemptId=");
        s.append(this.b);
        xg6.B(s, ", eventSequence=", this.c, ", formattedValue=");
        s.append(this.d);
        s.append(", trackerShown=");
        s.append(this.e);
        s.append(")");
        return s.toString();
    }
}
