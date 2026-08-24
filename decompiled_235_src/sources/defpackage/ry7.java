package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ry7  reason: default package */
/* loaded from: classes.dex */
public final class ry7 {
    public final float a;
    public final float b;

    public ry7(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ry7) {
                ry7 ry7Var = (ry7) obj;
                if (Float.compare(1.0f, 1.0f) != 0 || Float.compare(this.a, ry7Var.a) != 0 || Float.compare(this.b, ry7Var.b) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + xg6.a(this.a, Float.hashCode(1.0f) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ZoomValue(zoomRatio=1.0, minZoomRatio=");
        sb.append(this.a);
        sb.append(", maxZoomRatio=");
        return xg6.p(sb, this.b, ')');
    }
}
