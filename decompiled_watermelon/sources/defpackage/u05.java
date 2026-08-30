package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u05  reason: default package */
/* loaded from: classes.dex */
public final class u05 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;

    public u05(long j, String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u05)) {
            return false;
        }
        u05 u05Var = (u05) obj;
        if (this.a == u05Var.a && b53.x(this.b, u05Var.b) && b53.x(this.c, u05Var.c) && b53.x(this.d, u05Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Long.hashCode(this.a) * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.d.hashCode() + ej6.b((hashCode2 + hashCode) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RAGameEntity(gameId=");
        sb.append(this.a);
        sb.append(", richPresencePatch=");
        sb.append(this.b);
        b31.B(sb, ", title=", this.c, ", icon=", this.d);
        sb.append(")");
        return sb.toString();
    }
}
