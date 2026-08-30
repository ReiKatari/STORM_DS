package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hh6  reason: default package */
/* loaded from: classes.dex */
public final class hh6 extends ik1 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public hh6(float f, float f2, int i, int i2, wi wiVar, int i3) {
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
        if (!(obj instanceof hh6)) {
            return false;
        }
        hh6 hh6Var = (hh6) obj;
        if (this.a == hh6Var.a && this.b == hh6Var.b && this.c == hh6Var.c && this.d == hh6Var.d && b53.x(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return wh1.a(this.d, wh1.a(this.c, ej6.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31) + 0;
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
