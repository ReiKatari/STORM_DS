package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ea5  reason: default package */
/* loaded from: classes.dex */
public final class ea5 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;

    public ea5(long j, String str, String str2, String str3) {
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
        if (!(obj instanceof ea5)) {
            return false;
        }
        ea5 ea5Var = (ea5) obj;
        if (this.a == ea5Var.a && nb3.k(this.b, ea5Var.b) && nb3.k(this.c, ea5Var.c) && nb3.k(this.d, ea5Var.d)) {
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
        return this.d.hashCode() + xg6.d((hashCode2 + hashCode) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RAGameEntity(gameId=");
        sb.append(this.a);
        sb.append(", richPresencePatch=");
        sb.append(this.b);
        i61.B(sb, ", title=", this.c, ", icon=", this.d);
        sb.append(")");
        return sb.toString();
    }
}
