package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vt4  reason: default package */
/* loaded from: classes.dex */
public final class vt4 extends hu4 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public vt4(float f, float f2, float f3, float f4) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt4)) {
            return false;
        }
        vt4 vt4Var = (vt4) obj;
        if (Float.compare(this.c, vt4Var.c) == 0 && Float.compare(this.d, vt4Var.d) == 0 && Float.compare(this.e, vt4Var.e) == 0 && Float.compare(this.f, vt4Var.f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + xg6.a(this.e, xg6.a(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.c);
        sb.append(", y1=");
        sb.append(this.d);
        sb.append(", x2=");
        sb.append(this.e);
        sb.append(", y2=");
        return xg6.p(sb, this.f, ')');
    }
}
