package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t75  reason: default package */
/* loaded from: classes.dex */
public final class t75 {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;

    public t75(long j, long j2, String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t75)) {
            return false;
        }
        t75 t75Var = (t75) obj;
        if (this.a == t75Var.a && this.b == t75Var.b && nb3.k(this.c, t75Var.c) && nb3.k(this.d, t75Var.d) && nb3.k(this.e, t75Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c = i61.c(this.b, Long.hashCode(this.a) * 31, 31);
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.e.hashCode() + xg6.d((c + hashCode) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder s = xg6.s(this.a, "RAAchievementSetEntity(id=", ", gameId=");
        s.append(this.b);
        s.append(", title=");
        s.append(this.c);
        i61.B(s, ", type=", this.d, ", iconUrl=", this.e);
        s.append(")");
        return s.toString();
    }
}
