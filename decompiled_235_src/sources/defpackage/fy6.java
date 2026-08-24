package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fy6  reason: default package */
/* loaded from: classes.dex */
public final class fy6 {
    public final float a;
    public final float b;

    public fy6(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fy6) {
                fy6 fy6Var = (fy6) obj;
                if (!om1.b(this.a, fy6Var.a) || !om1.b(this.b, fy6Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f = this.a;
        sb.append((Object) om1.c(f));
        sb.append(", right=");
        float f2 = this.b;
        sb.append((Object) om1.c(f + f2));
        sb.append(", width=");
        sb.append((Object) om1.c(f2));
        sb.append(')');
        return sb.toString();
    }
}
