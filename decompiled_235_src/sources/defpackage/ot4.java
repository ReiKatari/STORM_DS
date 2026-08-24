package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ot4  reason: default package */
/* loaded from: classes.dex */
public final class ot4 extends hu4 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public ot4(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
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
        if (!(obj instanceof ot4)) {
            return false;
        }
        ot4 ot4Var = (ot4) obj;
        if (Float.compare(this.c, ot4Var.c) == 0 && Float.compare(this.d, ot4Var.d) == 0 && Float.compare(this.e, ot4Var.e) == 0 && this.f == ot4Var.f && this.g == ot4Var.g && Float.compare(this.h, ot4Var.h) == 0 && Float.compare(this.i, ot4Var.i) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + xg6.a(this.h, xg6.e(xg6.e(xg6.a(this.e, xg6.a(this.d, Float.hashCode(this.c) * 31, 31), 31), this.f, 31), this.g, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.d);
        sb.append(", theta=");
        sb.append(this.e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f);
        sb.append(", isPositiveArc=");
        sb.append(this.g);
        sb.append(", arcStartX=");
        sb.append(this.h);
        sb.append(", arcStartY=");
        return xg6.p(sb, this.i, ')');
    }
}
