package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cl4  reason: default package */
/* loaded from: classes.dex */
public final class cl4 extends fl4 {
    public final float c;
    public final float d;

    public cl4(float f, float f2) {
        super(1);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl4)) {
            return false;
        }
        cl4 cl4Var = (cl4) obj;
        if (Float.compare(this.c, cl4Var.c) == 0 && Float.compare(this.d, cl4Var.d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.c);
        sb.append(", dy=");
        return ej6.f(sb, this.d, ')');
    }
}
