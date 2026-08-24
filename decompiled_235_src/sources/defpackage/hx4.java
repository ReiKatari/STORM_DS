package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hx4  reason: default package */
/* loaded from: classes.dex */
public final class hx4 {
    public final long a;
    public final long b;

    public hx4(long j, long j2) {
        this.a = j;
        this.b = j2;
        y47[] y47VarArr = x47.b;
        if ((j & 1095216660480L) == 0) {
            q53.a("width cannot be TextUnit.Unspecified");
        }
        if ((j2 & 1095216660480L) == 0) {
            q53.a("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hx4) {
            hx4 hx4Var = (hx4) obj;
            if (x47.a(this.a, hx4Var.a) && x47.a(this.b, hx4Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        y47[] y47VarArr = x47.b;
        return Integer.hashCode(4) + i61.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "Placeholder(width=" + ((Object) x47.d(this.a)) + ", height=" + ((Object) x47.d(this.b)) + ", placeholderVerticalAlign=" + ((Object) "Center") + ')';
    }
}
