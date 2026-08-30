package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ok4  reason: default package */
/* loaded from: classes.dex */
public final class ok4 extends fl4 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public ok4(float f, float f2, float f3, float f4, float f5, float f6) {
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
        if (!(obj instanceof ok4)) {
            return false;
        }
        ok4 ok4Var = (ok4) obj;
        if (Float.compare(this.c, ok4Var.c) == 0 && Float.compare(this.d, ok4Var.d) == 0 && Float.compare(this.e, ok4Var.e) == 0 && Float.compare(this.f, ok4Var.f) == 0 && Float.compare(this.g, ok4Var.g) == 0 && Float.compare(this.h, ok4Var.h) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + ej6.a(this.g, ej6.a(this.f, ej6.a(this.e, ej6.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
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
        return ej6.f(sb, this.h, ')');
    }
}
