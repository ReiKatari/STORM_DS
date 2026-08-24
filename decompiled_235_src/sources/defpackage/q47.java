package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q47  reason: default package */
/* loaded from: classes.dex */
public final class q47 {
    public final String a;
    public String b;
    public boolean c = false;
    public bs4 d = null;

    public q47(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q47)) {
            return false;
        }
        q47 q47Var = (q47) obj;
        if (nb3.k(this.a, q47Var.a) && nb3.k(this.b, q47Var.b) && this.c == q47Var.c && nb3.k(this.d, q47Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int e = xg6.e(xg6.d(this.a.hashCode() * 31, 31, this.b), this.c, 31);
        bs4 bs4Var = this.d;
        if (bs4Var == null) {
            hashCode = 0;
        } else {
            hashCode = bs4Var.hashCode();
        }
        return e + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
        sb.append(this.d);
        sb.append(", isShowingSubstitution=");
        return xg6.r(sb, this.c, ')');
    }
}
