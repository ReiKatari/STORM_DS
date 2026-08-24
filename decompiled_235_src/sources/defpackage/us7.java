package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: us7  reason: default package */
/* loaded from: classes.dex */
public final class us7 {
    public final boolean a;
    public final Integer b;
    public final boolean c;
    public final Integer d;
    public final boolean e;
    public final boolean f;

    public us7(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.a = z;
        this.b = num;
        this.c = z2;
        this.d = num2;
        this.e = z3;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us7)) {
            return false;
        }
        us7 us7Var = (us7) obj;
        if (this.a == us7Var.a && nb3.k(this.b, us7Var.b) && this.c == us7Var.c && nb3.k(this.d, us7Var.d) && this.e == us7Var.e && this.f == us7Var.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Boolean.hashCode(this.a) * 31;
        int i = 0;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int e = xg6.e((hashCode2 + hashCode) * 31, this.c, 31);
        Integer num2 = this.d;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return Boolean.hashCode(this.f) + xg6.e((e + i) * 31, this.e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb.append(this.a);
        sb.append(", clientMaxWindowBits=");
        sb.append(this.b);
        sb.append(", clientNoContextTakeover=");
        sb.append(this.c);
        sb.append(", serverMaxWindowBits=");
        sb.append(this.d);
        sb.append(", serverNoContextTakeover=");
        sb.append(this.e);
        sb.append(", unknownValues=");
        return xg6.r(sb, this.f, ')');
    }
}
