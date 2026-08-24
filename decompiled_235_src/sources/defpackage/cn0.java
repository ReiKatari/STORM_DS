package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cn0  reason: default package */
/* loaded from: classes.dex */
public final class cn0 {
    public final Long a;
    public final long b;
    public final String c;

    public cn0(Long l, long j, String str) {
        str.getClass();
        this.a = l;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn0)) {
            return false;
        }
        cn0 cn0Var = (cn0) obj;
        if (nb3.k(this.a, cn0Var.a) && this.b == cn0Var.b && nb3.k(this.c, cn0Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Long l = this.a;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return this.c.hashCode() + i61.c(this.b, hashCode * 31, 31);
    }

    public final String toString() {
        return "CheatFolderEntity(id=" + this.a + ", gameId=" + this.b + ", name=" + this.c + ")";
    }
}
