package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cu4  reason: default package */
/* loaded from: classes.dex */
public final class cu4 extends hu4 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public cu4(float f, float f2, float f3, float f4) {
        super(1);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu4)) {
            return false;
        }
        cu4 cu4Var = (cu4) obj;
        if (Float.compare(this.c, cu4Var.c) == 0 && Float.compare(this.d, cu4Var.d) == 0 && Float.compare(this.e, cu4Var.e) == 0 && Float.compare(this.f, cu4Var.f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + xg6.a(this.e, xg6.a(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.c);
        sb.append(", dy1=");
        sb.append(this.d);
        sb.append(", dx2=");
        sb.append(this.e);
        sb.append(", dy2=");
        return xg6.p(sb, this.f, ')');
    }
}
