package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n26  reason: default package */
/* loaded from: classes.dex */
public final class n26 {
    public final long a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public n26(long j, String str, boolean z, String str2, String str3, String str4, String str5) {
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
            if (obj instanceof n26) {
                n26 n26Var = (n26) obj;
                if (this.a != n26Var.a || !b53.x(this.b, n26Var.b) || this.c != n26Var.c || !b53.x(this.d, n26Var.d) || !b53.x(this.e, n26Var.e) || !b53.x(this.f, n26Var.f) || !this.g.equals(n26Var.g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.g.hashCode() + ej6.b(ej6.b(ej6.b(ej6.c(ej6.b(Long.hashCode(this.a) * 31, 31, this.b), this.c, 31), 31, this.d), 31, this.e), 31, this.f);
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
        b31.B(sb, ", sourceSize=", this.e, ", outputSize=", this.f);
        sb.append(", reason=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
