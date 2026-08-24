package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zm0  reason: default package */
/* loaded from: classes.dex */
public final class zm0 {
    public final Long a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;

    public zm0(Long l, long j, long j2, String str, String str2, String str3, boolean z) {
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
        if (!(obj instanceof zm0)) {
            return false;
        }
        zm0 zm0Var = (zm0) obj;
        if (nb3.k(this.a, zm0Var.a) && this.b == zm0Var.b && this.c == zm0Var.c && nb3.k(this.d, zm0Var.d) && nb3.k(this.e, zm0Var.e) && nb3.k(this.f, zm0Var.f) && this.g == zm0Var.g) {
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
        int d = xg6.d(i61.c(this.c, i61.c(this.b, hashCode * 31, 31), 31), 31, this.d);
        String str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return Boolean.hashCode(this.g) + xg6.d((d + i) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheatEntity(id=");
        sb.append(this.a);
        sb.append(", cheatFolderId=");
        sb.append(this.b);
        xg6.B(sb, ", cheatDatabaseId=", this.c, ", name=");
        i61.B(sb, this.d, ", description=", this.e, ", code=");
        sb.append(this.f);
        sb.append(", enabled=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
