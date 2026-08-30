package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ey4  reason: default package */
/* loaded from: classes.dex */
public final class ey4 {
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

    public ey4(long j, long j2, long j3, int i, int i2, String str, String str2, int i3, int i4, String str3, String str4, String str5, int i5) {
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
        if (!(obj instanceof ey4)) {
            return false;
        }
        ey4 ey4Var = (ey4) obj;
        if (this.a == ey4Var.a && this.b == ey4Var.b && this.c == ey4Var.c && this.d == ey4Var.d && this.e == ey4Var.e && b53.x(this.f, ey4Var.f) && b53.x(this.g, ey4Var.g) && this.h == ey4Var.h && this.i == ey4Var.i && b53.x(this.j, ey4Var.j) && b53.x(this.k, ey4Var.k) && b53.x(this.l, ey4Var.l) && this.m == ey4Var.m) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.m) + ej6.b(ej6.b(ej6.b(wh1.a(this.i, wh1.a(this.h, ej6.b(ej6.b(wh1.a(this.e, wh1.a(this.d, b31.c(this.c, b31.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31, this.f), 31, this.g), 31), 31), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder q = wh1.q(this.a, "RAAchievementEntity(id=", ", gameId=");
        q.append(this.b);
        ej6.k(q, ", setId=", this.c, ", totalAwardsCasual=");
        b31.A(q, this.d, ", totalAwardsHardcore=", this.e, ", title=");
        b31.B(q, this.f, ", description=", this.g, ", points=");
        b31.A(q, this.h, ", displayOrder=", this.i, ", badgeUrlUnlocked=");
        b31.B(q, this.j, ", badgeUrlLocked=", this.k, ", memoryAddress=");
        q.append(this.l);
        q.append(", type=");
        q.append(this.m);
        q.append(")");
        return q.toString();
    }
}
