package defpackage;

import android.graphics.Insets;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x13  reason: default package */
/* loaded from: classes.dex */
public final class x13 {
    public static final x13 e = new x13(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public x13(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static x13 a(x13 x13Var, x13 x13Var2) {
        return c(Math.max(x13Var.a, x13Var2.a), Math.max(x13Var.b, x13Var2.b), Math.max(x13Var.c, x13Var2.c), Math.max(x13Var.d, x13Var2.d));
    }

    public static x13 b(x13 x13Var, x13 x13Var2) {
        return c(Math.min(x13Var.a, x13Var2.a), Math.min(x13Var.b, x13Var2.b), Math.min(x13Var.c, x13Var2.c), Math.min(x13Var.d, x13Var2.d));
    }

    public static x13 c(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return e;
        }
        return new x13(i, i2, i3, i4);
    }

    public static x13 d(Insets insets) {
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
        return fp.n(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x13.class != obj.getClass()) {
            return false;
        }
        x13 x13Var = (x13) obj;
        if (this.d == x13Var.d && this.a == x13Var.a && this.c == x13Var.c && this.b == x13Var.b) {
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
        return ej6.g(sb, this.d, '}');
    }
}
