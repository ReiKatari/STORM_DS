package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ez4  reason: default package */
/* loaded from: classes.dex */
public final class ez4 {
    public final boolean a;
    public final int b;
    public final long c;
    public final long d;

    public ez4(boolean z, int i, long j, long j2) {
        this.a = z;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez4)) {
            return false;
        }
        ez4 ez4Var = (ez4) obj;
        if (this.a == ez4Var.a && this.b == ez4Var.b && this.c == ez4Var.c && this.d == ez4Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + b31.c(this.c, wh1.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RAAwardAchievementResponse(achievementAwarded=");
        sb.append(this.a);
        sb.append(", remainingAchievements=");
        sb.append(this.b);
        sb.append(", score=");
        sb.append(this.c);
        return wh1.p(sb, ", softcoreScore=", this.d, ")");
    }
}
