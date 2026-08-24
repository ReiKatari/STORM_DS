package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zd6  reason: default package */
/* loaded from: classes.dex */
public final class zd6 {
    public final long a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public zd6(long j, String str, boolean z, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = j;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zd6) {
                zd6 zd6Var = (zd6) obj;
                if (this.a != zd6Var.a || !nb3.k(this.b, zd6Var.b) || this.c != zd6Var.c || !nb3.k(this.d, zd6Var.d) || !nb3.k(this.e, zd6Var.e) || !nb3.k(this.f, zd6Var.f) || !this.g.equals(zd6Var.g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.g.hashCode() + xg6.d(xg6.d(xg6.d(xg6.e(xg6.d(Long.hashCode(this.a) * 31, 31, this.b), this.c, 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Entry(timestampMillis=");
        sb.append(this.a);
        sb.append(", backend=");
        sb.append(this.b);
        sb.append(", succeeded=");
        sb.append(this.c);
        sb.append(", presetPath=");
        sb.append(this.d);
        i61.B(sb, ", sourceSize=", this.e, ", outputSize=", this.f);
        sb.append(", reason=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
