package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b23  reason: default package */
/* loaded from: classes.dex */
public final class b23 {
    @r06("left")
    private final int a;
    @r06("top")
    private final int b;
    @r06("right")
    private final int c;
    @r06("bottom")
    private final int d;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: b23$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public b23(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final w13 a() {
        return new w13(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b23)) {
            return false;
        }
        b23 b23Var = (b23) obj;
        if (this.a == b23Var.a && this.b == b23Var.b && this.c == b23Var.c && this.d == b23Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + wh1.a(this.c, wh1.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        StringBuilder s = b31.s(i, i2, "InsetsDto(left=", ", top=", ", right=");
        s.append(i3);
        s.append(", bottom=");
        s.append(i4);
        s.append(")");
        return s.toString();
    }
}
