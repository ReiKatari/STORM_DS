package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ta5  reason: default package */
/* loaded from: classes.dex */
public final class ta5 {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final String h;
    public final boolean i;

    public ta5(long j, long j2, long j3, String str, String str2, boolean z, String str3, String str4, boolean z2) {
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
            if (obj instanceof ta5) {
                ta5 ta5Var = (ta5) obj;
                if (this.a == ta5Var.a && ga5.a(this.b, ta5Var.b) && this.c == ta5Var.c && nb3.k(this.d, ta5Var.d) && nb3.k(this.e, ta5Var.e) && this.f == ta5Var.f && nb3.k(this.g, ta5Var.g) && nb3.k(this.h, ta5Var.h) && this.i == ta5Var.i) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + xg6.d(xg6.d(xg6.e(xg6.d(xg6.d(i61.c(this.c, i61.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e), this.f, 31), 31, this.g), 31, this.h);
    }

    public final String toString() {
        String b = ga5.b(this.b);
        String a0 = mp2.a0(this.c);
        StringBuilder sb = new StringBuilder("RALeaderboard(id=");
        sb.append(this.a);
        sb.append(", gameId=");
        sb.append(b);
        i61.B(sb, ", setId=", a0, ", mem=", this.d);
        sb.append(", format=");
        sb.append(this.e);
        sb.append(", lowerIsBetter=");
        sb.append(this.f);
        i61.B(sb, ", title=", this.g, ", description=", this.h);
        sb.append(", hidden=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
