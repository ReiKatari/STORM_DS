package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: al4  reason: default package */
/* loaded from: classes.dex */
public final class al4 extends fl4 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public al4(float f, float f2, float f3, float f4) {
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
        if (!(obj instanceof al4)) {
            return false;
        }
        al4 al4Var = (al4) obj;
        if (Float.compare(this.c, al4Var.c) == 0 && Float.compare(this.d, al4Var.d) == 0 && Float.compare(this.e, al4Var.e) == 0 && Float.compare(this.f, al4Var.f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + ej6.a(this.e, ej6.a(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.c);
        sb.append(", dy1=");
        sb.append(this.d);
        sb.append(", dx2=");
        sb.append(this.e);
        sb.append(", dy2=");
        return ej6.f(sb, this.f, ')');
    }
}
