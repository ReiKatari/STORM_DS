package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qt4  reason: default package */
/* loaded from: classes.dex */
public final class qt4 extends hu4 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public qt4(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt4)) {
            return false;
        }
        qt4 qt4Var = (qt4) obj;
        if (Float.compare(this.c, qt4Var.c) == 0 && Float.compare(this.d, qt4Var.d) == 0 && Float.compare(this.e, qt4Var.e) == 0 && Float.compare(this.f, qt4Var.f) == 0 && Float.compare(this.g, qt4Var.g) == 0 && Float.compare(this.h, qt4Var.h) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + xg6.a(this.g, xg6.a(this.f, xg6.a(this.e, xg6.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.c);
        sb.append(", y1=");
        sb.append(this.d);
        sb.append(", x2=");
        sb.append(this.e);
        sb.append(", y2=");
        sb.append(this.f);
        sb.append(", x3=");
        sb.append(this.g);
        sb.append(", y3=");
        return xg6.p(sb, this.h, ')');
    }
}
