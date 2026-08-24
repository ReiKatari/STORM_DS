package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xt4  reason: default package */
/* loaded from: classes.dex */
public final class xt4 extends hu4 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public xt4(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt4)) {
            return false;
        }
        xt4 xt4Var = (xt4) obj;
        if (Float.compare(this.c, xt4Var.c) == 0 && Float.compare(this.d, xt4Var.d) == 0 && Float.compare(this.e, xt4Var.e) == 0 && this.f == xt4Var.f && this.g == xt4Var.g && Float.compare(this.h, xt4Var.h) == 0 && Float.compare(this.i, xt4Var.i) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + xg6.a(this.h, xg6.e(xg6.e(xg6.a(this.e, xg6.a(this.d, Float.hashCode(this.c) * 31, 31), 31), this.f, 31), this.g, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.d);
        sb.append(", theta=");
        sb.append(this.e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f);
        sb.append(", isPositiveArc=");
        sb.append(this.g);
        sb.append(", arcStartDx=");
        sb.append(this.h);
        sb.append(", arcStartDy=");
        return xg6.p(sb, this.i, ')');
    }
}
