package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mb5  reason: default package */
/* loaded from: classes.dex */
public final class mb5 {
    public final String a;
    public final hb5 b;

    public mb5(String str, hb5 hb5Var) {
        str.getClass();
        hb5Var.getClass();
        this.a = str;
        this.b = hb5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb5)) {
            return false;
        }
        mb5 mb5Var = (mb5) obj;
        if (nb3.k(this.a, mb5Var.a) && nb3.k(this.b, mb5Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Lease(id=" + this.a + ", authentication=" + this.b + ")";
    }
}
