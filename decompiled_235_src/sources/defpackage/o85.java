package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o85  reason: default package */
/* loaded from: classes.dex */
public final class o85 {
    public final boolean a;
    public final int b;
    public final long c;
    public final long d;

    public o85(boolean z, int i, long j, long j2) {
        this.a = z;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o85)) {
            return false;
        }
        o85 o85Var = (o85) obj;
        if (this.a == o85Var.a && this.b == o85Var.b && this.c == o85Var.c && this.d == o85Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + i61.c(this.c, lb1.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RAAwardAchievementResponse(achievementAwarded=");
        sb.append(this.a);
        sb.append(", remainingAchievements=");
        sb.append(this.b);
        sb.append(", score=");
        sb.append(this.c);
        return lb1.r(sb, ", softcoreScore=", this.d, ")");
    }
}
