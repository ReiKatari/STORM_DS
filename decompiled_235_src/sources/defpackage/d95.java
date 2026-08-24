package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d95  reason: default package */
/* loaded from: classes.dex */
public final class d95 extends l95 {
    public final long a;
    public final long b;
    public final long c;
    public final int d;
    public final String e;

    public d95(long j, long j2, long j3, int i, String str) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = i;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d95) {
                d95 d95Var = (d95) obj;
                if (this.a != d95Var.a || this.b != d95Var.b || this.c != d95Var.c || this.d != d95Var.d || !this.e.equals(d95Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + lb1.a(this.d, i61.c(this.c, i61.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder s = xg6.s(this.a, "OnLeaderboardSubmissionFailed(leaderboardId=", ", attemptId=");
        s.append(this.b);
        xg6.B(s, ", eventSequence=", this.c, ", resultCode=");
        s.append(this.d);
        s.append(", message=");
        s.append(this.e);
        s.append(")");
        return s.toString();
    }
}
