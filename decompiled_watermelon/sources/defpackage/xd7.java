package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xd7  reason: default package */
/* loaded from: classes.dex */
public final class xd7 {
    public final float a;
    public final float b;

    public xd7(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float[] a() {
        float f = this.a;
        float f2 = this.b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd7)) {
            return false;
        }
        xd7 xd7Var = (xd7) obj;
        if (Float.compare(this.a, xd7Var.a) == 0 && Float.compare(this.b, xd7Var.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.a);
        sb.append(", y=");
        return ej6.f(sb, this.b, ')');
    }
}
