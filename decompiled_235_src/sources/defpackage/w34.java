package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w34  reason: default package */
/* loaded from: classes.dex */
public final class w34 {
    public final String a;
    public final String b;

    public w34(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w34)) {
            return false;
        }
        w34 w34Var = (w34) obj;
        if (nb3.k(this.a, w34Var.a) && nb3.k(this.b, w34Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return lb1.n("RequestParameter(key=", this.a, ", value=", this.b, ")");
    }
}
