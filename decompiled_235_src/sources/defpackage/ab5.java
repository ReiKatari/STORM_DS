package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ab5  reason: default package */
/* loaded from: classes.dex */
public final class ab5 {
    public final long a;
    public final long b;
    public final boolean c;
    public final long d;

    public ab5(long j, long j2, boolean z, long j3) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab5)) {
            return false;
        }
        ab5 ab5Var = (ab5) obj;
        if (this.a == ab5Var.a && this.b == ab5Var.b && this.c == ab5Var.c && this.d == ab5Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + xg6.e(i61.c(this.b, Long.hashCode(this.a) * 31, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder s = xg6.s(this.a, "RAPendingAchievementSubmissionEntity(achievementId=", ", gameId=");
        s.append(this.b);
        s.append(", forHardcoreMode=");
        s.append(this.c);
        return lb1.r(s, ", createdAtEpochMs=", this.d, ")");
    }
}
