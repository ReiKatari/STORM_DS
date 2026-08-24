package defpackage;

import android.graphics.Insets;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e83  reason: default package */
/* loaded from: classes.dex */
public final class e83 {
    public static final e83 e = new e83(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public e83(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static e83 a(e83 e83Var, e83 e83Var2) {
        return c(Math.max(e83Var.a, e83Var2.a), Math.max(e83Var.b, e83Var2.b), Math.max(e83Var.c, e83Var2.c), Math.max(e83Var.d, e83Var2.d));
    }

    public static e83 b(e83 e83Var, e83 e83Var2) {
        return c(Math.min(e83Var.a, e83Var2.a), Math.min(e83Var.b, e83Var2.b), Math.min(e83Var.c, e83Var2.c), Math.min(e83Var.d, e83Var2.d));
    }

    public static e83 c(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return e;
        }
        return new e83(i, i2, i3, i4);
    }

    public static e83 d(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return c(i, i2, i3, i4);
    }

    public final Insets e() {
        return rp.n(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e83.class != obj.getClass()) {
            return false;
        }
        e83 e83Var = (e83) obj;
        if (this.d == e83Var.d && this.a == e83Var.a && this.c == e83Var.c && this.b == e83Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return xg6.q(sb, this.d, '}');
    }
}
