package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rq2  reason: default package */
/* loaded from: classes.dex */
public final class rq2 {
    public final String a;
    public final String b;

    public rq2(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq2)) {
            return false;
        }
        rq2 rq2Var = (rq2) obj;
        if (nb3.k(this.a, rq2Var.a) && nb3.k(this.b, rq2Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return lb1.n("GamepadHint(button=", this.a, ", label=", this.b, ")");
    }
}
