package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mk4  reason: default package */
/* loaded from: classes.dex */
public final class mk4 extends fl4 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public mk4(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
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
        if (!(obj instanceof mk4)) {
            return false;
        }
        mk4 mk4Var = (mk4) obj;
        if (Float.compare(this.c, mk4Var.c) == 0 && Float.compare(this.d, mk4Var.d) == 0 && Float.compare(this.e, mk4Var.e) == 0 && this.f == mk4Var.f && this.g == mk4Var.g && Float.compare(this.h, mk4Var.h) == 0 && Float.compare(this.i, mk4Var.i) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + ej6.a(this.h, ej6.c(ej6.c(ej6.a(this.e, ej6.a(this.d, Float.hashCode(this.c) * 31, 31), 31), this.f, 31), this.g, 31), 31);
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
        return ej6.f(sb, this.i, ')');
    }
}
