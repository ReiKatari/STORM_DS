package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yt4  reason: default package */
/* loaded from: classes.dex */
public final class yt4 extends hu4 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public yt4(float f, float f2, float f3, float f4, float f5, float f6) {
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
        if (!(obj instanceof yt4)) {
            return false;
        }
        yt4 yt4Var = (yt4) obj;
        if (Float.compare(this.c, yt4Var.c) == 0 && Float.compare(this.d, yt4Var.d) == 0 && Float.compare(this.e, yt4Var.e) == 0 && Float.compare(this.f, yt4Var.f) == 0 && Float.compare(this.g, yt4Var.g) == 0 && Float.compare(this.h, yt4Var.h) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + xg6.a(this.g, xg6.a(this.f, xg6.a(this.e, xg6.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.c);
        sb.append(", dy1=");
        sb.append(this.d);
        sb.append(", dx2=");
        sb.append(this.e);
        sb.append(", dy2=");
        sb.append(this.f);
        sb.append(", dx3=");
        sb.append(this.g);
        sb.append(", dy3=");
        return xg6.p(sb, this.h, ')');
    }
}
