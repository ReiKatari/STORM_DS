package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: te7  reason: default package */
/* loaded from: classes.dex */
public final class te7 {
    public final li2 a;
    public final oj2 b;
    public final int c;
    public final int d;
    public final Object e;

    public te7(li2 li2Var, oj2 oj2Var, int i, int i2, Object obj) {
        this.a = li2Var;
        this.b = oj2Var;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te7)) {
            return false;
        }
        te7 te7Var = (te7) obj;
        if (nb3.k(this.a, te7Var.a) && nb3.k(this.b, te7Var.b) && this.c == te7Var.c && this.d == te7Var.d && nb3.k(this.e, te7Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        li2 li2Var = this.a;
        if (li2Var == null) {
            hashCode = 0;
        } else {
            hashCode = li2Var.hashCode();
        }
        int a = lb1.a(this.d, lb1.a(this.c, ((hashCode * 31) + this.b.A) * 31, 31), 31);
        Object obj = this.e;
        if (obj != null) {
            i = obj.hashCode();
        }
        return a + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        String str2 = "Invalid";
        int i = this.c;
        if (i == 0) {
            str = "Normal";
        } else if (i != 1) {
            str = "Invalid";
        } else {
            str = "Italic";
        }
        sb.append((Object) str);
        sb.append(", fontSynthesis=");
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "Weight";
        } else if (i2 == 2) {
            str2 = "Style";
        } else if (i2 == 65535) {
            str2 = "All";
        }
        sb.append((Object) str2);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
