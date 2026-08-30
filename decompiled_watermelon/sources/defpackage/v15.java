package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v15  reason: default package */
/* loaded from: classes.dex */
public final class v15 {
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;

    public v15(long j, long j2, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v15)) {
            return false;
        }
        v15 v15Var = (v15) obj;
        if (this.a == v15Var.a && this.b == v15Var.b && this.c == v15Var.c && this.d == v15Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ej6.c(b31.c(this.b, Long.hashCode(this.a) * 31, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder q = wh1.q(this.a, "RAUserAchievementEntity(gameId=", ", achievementId=");
        q.append(this.b);
        q.append(", isUnlocked=");
        q.append(this.c);
        q.append(", isHardcore=");
        q.append(this.d);
        q.append(")");
        return q.toString();
    }
}
