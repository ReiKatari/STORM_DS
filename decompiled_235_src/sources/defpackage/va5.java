package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: va5  reason: default package */
/* loaded from: classes.dex */
public final class va5 {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final String h;
    public final boolean i;

    public va5(long j, long j2, long j3, String str, String str2, boolean z, String str3, String str4, boolean z2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = str3;
        this.h = str4;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va5)) {
            return false;
        }
        va5 va5Var = (va5) obj;
        if (this.a == va5Var.a && this.b == va5Var.b && this.c == va5Var.c && nb3.k(this.d, va5Var.d) && nb3.k(this.e, va5Var.e) && this.f == va5Var.f && nb3.k(this.g, va5Var.g) && nb3.k(this.h, va5Var.h) && this.i == va5Var.i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + xg6.d(xg6.d(xg6.e(xg6.d(xg6.d(i61.c(this.c, i61.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e), this.f, 31), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder s = xg6.s(this.a, "RALeaderboardEntity(id=", ", gameId=");
        s.append(this.b);
        xg6.B(s, ", setId=", this.c, ", mem=");
        i61.B(s, this.d, ", format=", this.e, ", lowerIsBetter=");
        s.append(this.f);
        s.append(", title=");
        s.append(this.g);
        s.append(", description=");
        s.append(this.h);
        s.append(", hidden=");
        s.append(this.i);
        s.append(")");
        return s.toString();
    }
}
