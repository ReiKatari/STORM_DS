package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hb5  reason: default package */
/* loaded from: classes.dex */
public final class hb5 extends jb5 {
    public final String a;
    public final String b;

    public hb5(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.jb5
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb5)) {
            return false;
        }
        hb5 hb5Var = (hb5) obj;
        if (nb3.k(this.a, hb5Var.a) && nb3.k(this.b, hb5Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return lb1.n("Authenticated(username=", this.a, ", token=", this.b, ")");
    }
}
