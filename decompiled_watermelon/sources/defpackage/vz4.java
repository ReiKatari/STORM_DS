package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vz4  reason: default package */
/* loaded from: classes.dex */
public final class vz4 extends b05 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final y25 e;
    public final long f;
    public final long g;
    public final long h;
    public final int i;
    public final boolean j;
    public final String k;

    public vz4(long j, long j2, long j3, long j4, y25 y25Var, long j5, long j6, long j7, int i, boolean z, String str) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = y25Var;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.i = i;
        this.j = z;
        this.k = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vz4) {
                vz4 vz4Var = (vz4) obj;
                if (this.a != vz4Var.a || this.b != vz4Var.b || this.c != vz4Var.c || this.d != vz4Var.d || this.e != vz4Var.e || this.f != vz4Var.f || this.g != vz4Var.g || this.h != vz4Var.h || this.i != vz4Var.i || this.j != vz4Var.j || !this.k.equals(vz4Var.k)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int c = b31.c(this.d, b31.c(this.c, b31.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31);
        return this.k.hashCode() + ej6.c(wh1.a(this.i, b31.c(this.h, b31.c(this.g, b31.c(this.f, (this.e.hashCode() + c) * 31, 31), 31), 31), 31), this.j, 31);
    }

    public final String toString() {
        StringBuilder q = wh1.q(this.a, "OnPendingSubmissionAdded(submissionSessionId=", ", nativeSubmissionId=");
        q.append(this.b);
        ej6.k(q, ", sequence=", this.c, ", createdAtEpochMs=");
        q.append(this.d);
        q.append(", submissionType=");
        q.append(this.e);
        ej6.k(q, ", achievementId=", this.f, ", leaderboardId=");
        q.append(this.g);
        ej6.k(q, ", attemptId=", this.h, ", rawScore=");
        q.append(this.i);
        q.append(", hardcore=");
        q.append(this.j);
        q.append(", formattedScore=");
        return b31.q(q, this.k, ")");
    }
}
