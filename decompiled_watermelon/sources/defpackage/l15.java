package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l15  reason: default package */
/* loaded from: classes.dex */
public final class l15 {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final String h;
    public final boolean i;

    public l15(long j, long j2, long j3, String str, String str2, boolean z, String str3, String str4, boolean z2) {
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
        if (!(obj instanceof l15)) {
            return false;
        }
        l15 l15Var = (l15) obj;
        if (this.a == l15Var.a && this.b == l15Var.b && this.c == l15Var.c && b53.x(this.d, l15Var.d) && b53.x(this.e, l15Var.e) && this.f == l15Var.f && b53.x(this.g, l15Var.g) && b53.x(this.h, l15Var.h) && this.i == l15Var.i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ej6.b(ej6.b(ej6.c(ej6.b(ej6.b(b31.c(this.c, b31.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e), this.f, 31), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder q = wh1.q(this.a, "RALeaderboardEntity(id=", ", gameId=");
        q.append(this.b);
        ej6.k(q, ", setId=", this.c, ", mem=");
        b31.B(q, this.d, ", format=", this.e, ", lowerIsBetter=");
        q.append(this.f);
        q.append(", title=");
        q.append(this.g);
        q.append(", description=");
        q.append(this.h);
        q.append(", hidden=");
        q.append(this.i);
        q.append(")");
        return q.toString();
    }
}
