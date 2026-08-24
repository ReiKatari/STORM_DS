package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p75  reason: default package */
/* loaded from: classes.dex */
public final class p75 {
    public final long a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final String j;
    public final String k;
    public final String l;
    public final int m;

    public p75(long j, long j2, long j3, int i, int i2, String str, String str2, int i3, int i4, String str3, String str4, String str5, int i5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = i;
        this.e = i2;
        this.f = str;
        this.g = str2;
        this.h = i3;
        this.i = i4;
        this.j = str3;
        this.k = str4;
        this.l = str5;
        this.m = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p75)) {
            return false;
        }
        p75 p75Var = (p75) obj;
        if (this.a == p75Var.a && this.b == p75Var.b && this.c == p75Var.c && this.d == p75Var.d && this.e == p75Var.e && nb3.k(this.f, p75Var.f) && nb3.k(this.g, p75Var.g) && this.h == p75Var.h && this.i == p75Var.i && nb3.k(this.j, p75Var.j) && nb3.k(this.k, p75Var.k) && nb3.k(this.l, p75Var.l) && this.m == p75Var.m) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.m) + xg6.d(xg6.d(xg6.d(lb1.a(this.i, lb1.a(this.h, xg6.d(xg6.d(lb1.a(this.e, lb1.a(this.d, i61.c(this.c, i61.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31, this.f), 31, this.g), 31), 31), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder s = xg6.s(this.a, "RAAchievementEntity(id=", ", gameId=");
        s.append(this.b);
        xg6.B(s, ", setId=", this.c, ", totalAwardsCasual=");
        lb1.x(s, this.d, ", totalAwardsHardcore=", this.e, ", title=");
        i61.B(s, this.f, ", description=", this.g, ", points=");
        lb1.x(s, this.h, ", displayOrder=", this.i, ", badgeUrlUnlocked=");
        i61.B(s, this.j, ", badgeUrlLocked=", this.k, ", memoryAddress=");
        s.append(this.l);
        s.append(", type=");
        s.append(this.m);
        s.append(")");
        return s.toString();
    }
}
