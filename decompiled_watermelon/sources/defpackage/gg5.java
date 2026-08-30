package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gg5  reason: default package */
/* loaded from: classes.dex */
public final class gg5 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public gg5(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg5)) {
            return false;
        }
        gg5 gg5Var = (gg5) obj;
        if (this.a == gg5Var.a && this.b == gg5Var.b && this.c == gg5Var.c && this.d == gg5Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ej6.a(this.c, ej6.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.a);
        sb.append(", focusedAlpha=");
        sb.append(this.b);
        sb.append(", hoveredAlpha=");
        sb.append(this.c);
        sb.append(", pressedAlpha=");
        return ej6.f(sb, this.d, ')');
    }
}
