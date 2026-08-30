package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vn3  reason: default package */
/* loaded from: classes.dex */
public final class vn3 {
    public static final vn3 d = new vn3(sn3.c, 17, 0);
    public final float a;
    public final int b;
    public final int c;

    public vn3(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn3)) {
            return false;
        }
        vn3 vn3Var = (vn3) obj;
        float f = vn3Var.a;
        float f2 = sn3.b;
        if (Float.compare(this.a, f) == 0 && this.b == vn3Var.b && this.c == vn3Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        float f = sn3.b;
        return Integer.hashCode(this.c) + wh1.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) sn3.b(this.a));
        sb.append(", trim=");
        String str2 = "Invalid";
        int i = this.b;
        if (i == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else if (i != 0) {
            str = "Invalid";
        } else {
            str = "LineHeightStyle.Trim.None";
        }
        sb.append((Object) str);
        sb.append(",mode=");
        int i2 = this.c;
        if (i2 == 0) {
            str2 = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str2 = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str2 = "LineHeightStyle.Mode.Tight";
        }
        sb.append((Object) str2);
        sb.append(')');
        return sb.toString();
    }
}
