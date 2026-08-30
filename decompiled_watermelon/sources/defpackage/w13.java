package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w13  reason: default package */
/* loaded from: classes.dex */
public final class w13 {
    public static final w13 e = new w13(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public w13(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w13)) {
            return false;
        }
        w13 w13Var = (w13) obj;
        if (this.a == w13Var.a && this.b == w13Var.b && this.c == w13Var.c && this.d == w13Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + wh1.a(this.c, wh1.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder s = b31.s(this.a, this.b, "Insets(left=", ", top=", ", right=");
        s.append(this.c);
        s.append(", bottom=");
        s.append(this.d);
        s.append(")");
        return s.toString();
    }
}
