package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q15  reason: default package */
/* loaded from: classes.dex */
public final class q15 {
    public final long a;
    public final long b;
    public final boolean c;
    public final long d;

    public q15(long j, long j2, boolean z, long j3) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q15)) {
            return false;
        }
        q15 q15Var = (q15) obj;
        if (this.a == q15Var.a && this.b == q15Var.b && this.c == q15Var.c && this.d == q15Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ej6.c(b31.c(this.b, Long.hashCode(this.a) * 31, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder q = wh1.q(this.a, "RAPendingAchievementSubmissionEntity(achievementId=", ", gameId=");
        q.append(this.b);
        q.append(", forHardcoreMode=");
        q.append(this.c);
        return wh1.p(q, ", createdAtEpochMs=", this.d, ")");
    }
}
