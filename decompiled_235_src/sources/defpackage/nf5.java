package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nf5  reason: default package */
/* loaded from: classes.dex */
public final class nf5 {
    public static final int e = 0;
    @gc6("a")
    private final int a;
    @gc6("b")
    private final int b;
    @gc6("c")
    private final int c;
    @gc6("d")
    private final int d;

    public nf5(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static /* synthetic */ nf5 f(nf5 nf5Var, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = nf5Var.a;
        }
        if ((i5 & 2) != 0) {
            i2 = nf5Var.b;
        }
        if ((i5 & 4) != 0) {
            i3 = nf5Var.c;
        }
        if ((i5 & 8) != 0) {
            i4 = nf5Var.d;
        }
        return nf5Var.e(i, i2, i3, i4);
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

    public final nf5 e(int i, int i2, int i3, int i4) {
        return new nf5(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf5)) {
            return false;
        }
        nf5 nf5Var = (nf5) obj;
        if (this.a == nf5Var.a && this.b == nf5Var.b && this.c == nf5Var.c && this.d == nf5Var.d) {
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
        return Integer.hashCode(this.d) + lb1.a(this.c, lb1.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
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
        StringBuilder q = i61.q(i, i2, "Rect25(x=", ", y=", ", width=");
        q.append(i3);
        q.append(", height=");
        q.append(i4);
        q.append(")");
        return q.toString();
    }
}
