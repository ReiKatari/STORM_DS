package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lb5  reason: default package */
/* loaded from: classes.dex */
public final class lb5 {
    public final String a;
    public final long b;
    public final long c;

    public lb5(String str, long j, long j2) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb5)) {
            return false;
        }
        lb5 lb5Var = (lb5) obj;
        if (nb3.k(this.a, lb5Var.a) && this.b == lb5Var.b && this.c == lb5Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + i61.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RAUserProfile(username=");
        sb.append(this.a);
        sb.append(", score=");
        sb.append(this.b);
        return lb1.r(sb, ", softcoreScore=", this.c, ")");
    }
}
