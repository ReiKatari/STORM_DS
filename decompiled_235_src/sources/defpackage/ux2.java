package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ux2  reason: default package */
/* loaded from: classes.dex */
public final class ux2 {
    public final of5 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ux2(of5 of5Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = of5Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ux2) {
                ux2 ux2Var = (ux2) obj;
                if (!this.a.equals(ux2Var.a) || this.b != ux2Var.b || this.c != ux2Var.c || this.d != ux2Var.d || this.e != ux2Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xg6.e(xg6.e(xg6.e(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HingeInfo(bounds=");
        sb.append(this.a);
        sb.append(", isFlat=");
        sb.append(this.b);
        sb.append(", isVertical=");
        sb.append(this.c);
        sb.append(", isSeparating=");
        sb.append(this.d);
        sb.append(", isOccluding=");
        return xg6.r(sb, this.e, ')');
    }
}
