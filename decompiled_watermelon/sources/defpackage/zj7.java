package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zj7  reason: default package */
/* loaded from: classes.dex */
public final class zj7 {
    public final float a;
    public final float b;

    public zj7(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zj7) {
                zj7 zj7Var = (zj7) obj;
                if (Float.compare(1.0f, 1.0f) != 0 || Float.compare(this.a, zj7Var.a) != 0 || Float.compare(this.b, zj7Var.b) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + ej6.a(this.a, Float.hashCode(1.0f) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ZoomValue(zoomRatio=1.0, minZoomRatio=");
        sb.append(this.a);
        sb.append(", maxZoomRatio=");
        return ej6.f(sb, this.b, ')');
    }
}
