package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fb5  reason: default package */
/* loaded from: classes.dex */
public final class fb5 {
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;

    public fb5(long j, long j2, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb5)) {
            return false;
        }
        fb5 fb5Var = (fb5) obj;
        if (this.a == fb5Var.a && this.b == fb5Var.b && this.c == fb5Var.c && this.d == fb5Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xg6.e(i61.c(this.b, Long.hashCode(this.a) * 31, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder s = xg6.s(this.a, "RAUserAchievementEntity(gameId=", ", achievementId=");
        s.append(this.b);
        s.append(", isUnlocked=");
        s.append(this.c);
        s.append(", isHardcore=");
        s.append(this.d);
        s.append(")");
        return s.toString();
    }
}
