package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lp2  reason: default package */
/* loaded from: classes.dex */
public final class lp2 {
    public final Long a;
    public final String b;
    public final String c;
    public final String d;

    public lp2(Long l, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp2)) {
            return false;
        }
        lp2 lp2Var = (lp2) obj;
        if (nb3.k(this.a, lp2Var.a) && nb3.k(this.b, lp2Var.b) && nb3.k(this.c, lp2Var.c) && nb3.k(this.d, lp2Var.d)) {
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
        return this.d.hashCode() + xg6.d(xg6.d(hashCode * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "GameEntity(id=" + this.a + ", name=" + this.b + ", gameCode=" + this.c + ", gameChecksum=" + this.d + ")";
    }
}
