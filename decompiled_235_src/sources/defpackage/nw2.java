package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nw2  reason: default package */
/* loaded from: classes.dex */
public final class nw2 {
    public final String a;
    public final String b;

    public nw2(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw2)) {
            return false;
        }
        nw2 nw2Var = (nw2) obj;
        if (nb3.k(this.a, nw2Var.a) && nb3.k(this.b, nw2Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return lb1.n("HashIconRow(hash=", this.a, ", iconUrl=", this.b, ")");
    }
}
