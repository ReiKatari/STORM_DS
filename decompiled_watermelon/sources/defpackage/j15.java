package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j15  reason: default package */
/* loaded from: classes.dex */
public final class j15 {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final String h;
    public final boolean i;

    public j15(long j, long j2, long j3, String str, String str2, boolean z, String str3, String str4, boolean z2) {
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
        if (this != obj) {
            if (obj instanceof j15) {
                j15 j15Var = (j15) obj;
                if (this.a == j15Var.a && w05.a(this.b, j15Var.b) && this.c == j15Var.c && b53.x(this.d, j15Var.d) && b53.x(this.e, j15Var.e) && this.f == j15Var.f && b53.x(this.g, j15Var.g) && b53.x(this.h, j15Var.h) && this.i == j15Var.i) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ej6.b(ej6.b(ej6.c(ej6.b(ej6.b(b31.c(this.c, b31.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e), this.f, 31), 31, this.g), 31, this.h);
    }

    public final String toString() {
        String b = w05.b(this.b);
        String b0 = nk2.b0(this.c);
        StringBuilder sb = new StringBuilder("RALeaderboard(id=");
        sb.append(this.a);
        sb.append(", gameId=");
        sb.append(b);
        b31.B(sb, ", setId=", b0, ", mem=", this.d);
        sb.append(", format=");
        sb.append(this.e);
        sb.append(", lowerIsBetter=");
        sb.append(this.f);
        b31.B(sb, ", title=", this.g, ", description=", this.h);
        sb.append(", hidden=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
