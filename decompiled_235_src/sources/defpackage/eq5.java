package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eq5  reason: default package */
/* loaded from: classes.dex */
public final class eq5 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public eq5(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq5)) {
            return false;
        }
        eq5 eq5Var = (eq5) obj;
        if (this.a == eq5Var.a && this.b == eq5Var.b && this.c == eq5Var.c && this.d == eq5Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + xg6.a(this.c, xg6.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.a);
        sb.append(", focusedAlpha=");
        sb.append(this.b);
        sb.append(", hoveredAlpha=");
        sb.append(this.c);
        sb.append(", pressedAlpha=");
        return xg6.p(sb, this.d, ')');
    }
}
