package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ys6  reason: default package */
/* loaded from: classes.dex */
public final class ys6 extends oo1 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public ys6(float f, float f2, int i, int i2, ij ijVar, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys6)) {
            return false;
        }
        ys6 ys6Var = (ys6) obj;
        if (this.a == ys6Var.a && this.b == ys6Var.b && this.c == ys6Var.c && this.d == ys6Var.d && nb3.k(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return lb1.a(this.d, lb1.a(this.c, xg6.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31) + 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.a);
        sb.append(", miter=");
        sb.append(this.b);
        sb.append(", cap=");
        String str2 = "Unknown";
        int i = this.c;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else if (i != 2) {
            str = "Unknown";
        } else {
            str = "Square";
        }
        sb.append((Object) str);
        sb.append(", join=");
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "Miter";
        } else if (i2 == 1) {
            str2 = "Round";
        } else if (i2 == 2) {
            str2 = "Bevel";
        }
        sb.append((Object) str2);
        sb.append(", pathEffect=");
        sb.append((Object) null);
        sb.append(')');
        return sb.toString();
    }
}
