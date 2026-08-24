package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f95  reason: default package */
/* loaded from: classes.dex */
public final class f95 extends l95 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final ic5 e;
    public final long f;
    public final long g;
    public final long h;
    public final int i;
    public final boolean j;
    public final String k;

    public f95(long j, long j2, long j3, long j4, ic5 ic5Var, long j5, long j6, long j7, int i, boolean z, String str) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = ic5Var;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.i = i;
        this.j = z;
        this.k = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f95) {
                f95 f95Var = (f95) obj;
                if (this.a != f95Var.a || this.b != f95Var.b || this.c != f95Var.c || this.d != f95Var.d || this.e != f95Var.e || this.f != f95Var.f || this.g != f95Var.g || this.h != f95Var.h || this.i != f95Var.i || this.j != f95Var.j || !this.k.equals(f95Var.k)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int c = i61.c(this.d, i61.c(this.c, i61.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31);
        return this.k.hashCode() + xg6.e(lb1.a(this.i, i61.c(this.h, i61.c(this.g, i61.c(this.f, (this.e.hashCode() + c) * 31, 31), 31), 31), 31), this.j, 31);
    }

    public final String toString() {
        StringBuilder s = xg6.s(this.a, "OnPendingSubmissionAdded(submissionSessionId=", ", nativeSubmissionId=");
        s.append(this.b);
        xg6.B(s, ", sequence=", this.c, ", createdAtEpochMs=");
        s.append(this.d);
        s.append(", submissionType=");
        s.append(this.e);
        xg6.B(s, ", achievementId=", this.f, ", leaderboardId=");
        s.append(this.g);
        xg6.B(s, ", attemptId=", this.h, ", rawScore=");
        s.append(this.i);
        s.append(", hardcore=");
        s.append(this.j);
        s.append(", formattedScore=");
        return i61.n(s, this.k, ")");
    }
}
