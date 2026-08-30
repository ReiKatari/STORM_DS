package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u44  reason: default package */
/* loaded from: classes.dex */
public final class u44 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;

    public u44(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = z4;
        this.f = i2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof u44)) {
            u44 u44Var = (u44) obj;
            if (this.a == u44Var.a && this.b == u44Var.b && this.c == u44Var.c && this.d == u44Var.d && this.e == u44Var.e && this.f == u44Var.f && this.g == u44Var.g) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 923521) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f) * 31) + this.g) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(u44.class.getSimpleName());
        sb.append("(");
        if (this.a) {
            sb.append("launchSingleTop ");
        }
        if (this.b) {
            sb.append("restoreState ");
        }
        int i = this.g;
        int i2 = this.f;
        if (i2 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i2));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(")");
        }
        return sb.toString();
    }
}
