package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zr4  reason: default package */
/* loaded from: classes.dex */
public final class zr4 {
    public final gj a;
    public final int b;
    public final int c;

    public zr4(gj gjVar, int i, int i2) {
        this.a = gjVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zr4) {
                zr4 zr4Var = (zr4) obj;
                if (this.a == zr4Var.a && this.b == zr4Var.b && this.c == zr4Var.c) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + lb1.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return xg6.q(sb, this.c, ')');
    }
}
