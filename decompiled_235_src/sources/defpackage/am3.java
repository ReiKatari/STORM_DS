package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: am3  reason: default package */
/* loaded from: classes.dex */
public final class am3 {
    public final int a;
    public final int b;
    public final boolean c;

    public am3(int i, boolean z, int i2) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am3)) {
            return false;
        }
        am3 am3Var = (am3) obj;
        if (this.a == am3Var.a && this.b == am3Var.b && this.c == am3Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + lb1.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BidiRun(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", isRtl=");
        return xg6.r(sb, this.c, ')');
    }
}
