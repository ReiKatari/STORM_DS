package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rk0  reason: default package */
/* loaded from: classes.dex */
public final class rk0 {
    public final Long a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;

    public rk0(Long l, long j, long j2, String str, String str2, String str3, boolean z) {
        str.getClass();
        str3.getClass();
        this.a = l;
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk0)) {
            return false;
        }
        rk0 rk0Var = (rk0) obj;
        if (b53.x(this.a, rk0Var.a) && this.b == rk0Var.b && this.c == rk0Var.c && b53.x(this.d, rk0Var.d) && b53.x(this.e, rk0Var.e) && b53.x(this.f, rk0Var.f) && this.g == rk0Var.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Long l = this.a;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int b = ej6.b(b31.c(this.c, b31.c(this.b, hashCode * 31, 31), 31), 31, this.d);
        String str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return Boolean.hashCode(this.g) + ej6.b((b + i) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheatEntity(id=");
        sb.append(this.a);
        sb.append(", cheatFolderId=");
        sb.append(this.b);
        ej6.k(sb, ", cheatDatabaseId=", this.c, ", name=");
        b31.B(sb, this.d, ", description=", this.e, ", code=");
        sb.append(this.f);
        sb.append(", enabled=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
