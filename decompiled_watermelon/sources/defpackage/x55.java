package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x55  reason: default package */
/* loaded from: classes.dex */
public final class x55 {
    public static final int e = 0;
    @r06("a")
    private final int a;
    @r06("b")
    private final int b;
    @r06("c")
    private final int c;
    @r06("d")
    private final int d;

    public x55(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static /* synthetic */ x55 f(x55 x55Var, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = x55Var.a;
        }
        if ((i5 & 2) != 0) {
            i2 = x55Var.b;
        }
        if ((i5 & 4) != 0) {
            i3 = x55Var.c;
        }
        if ((i5 & 8) != 0) {
            i4 = x55Var.d;
        }
        return x55Var.e(i, i2, i3, i4);
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final x55 e(int i, int i2, int i3, int i4) {
        return new x55(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x55)) {
            return false;
        }
        x55 x55Var = (x55) obj;
        if (this.a == x55Var.a && this.b == x55Var.b && this.c == x55Var.c && this.d == x55Var.d) {
            return true;
        }
        return false;
    }

    public final int g() {
        return this.d;
    }

    public final int h() {
        return this.c;
    }

    public int hashCode() {
        return Integer.hashCode(this.d) + wh1.a(this.c, wh1.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final int i() {
        return this.a;
    }

    public final int j() {
        return this.b;
    }

    public String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        StringBuilder s = b31.s(i, i2, "Rect25(x=", ", y=", ", width=");
        s.append(i3);
        s.append(", height=");
        s.append(i4);
        s.append(")");
        return s.toString();
    }
}
