package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wk4  reason: default package */
/* loaded from: classes.dex */
public final class wk4 extends fl4 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public wk4(float f, float f2, float f3, float f4, float f5, float f6) {
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
        if (!(obj instanceof wk4)) {
            return false;
        }
        wk4 wk4Var = (wk4) obj;
        if (Float.compare(this.c, wk4Var.c) == 0 && Float.compare(this.d, wk4Var.d) == 0 && Float.compare(this.e, wk4Var.e) == 0 && Float.compare(this.f, wk4Var.f) == 0 && Float.compare(this.g, wk4Var.g) == 0 && Float.compare(this.h, wk4Var.h) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + ej6.a(this.g, ej6.a(this.f, ej6.a(this.e, ej6.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
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
        return ej6.f(sb, this.h, ')');
    }
}
