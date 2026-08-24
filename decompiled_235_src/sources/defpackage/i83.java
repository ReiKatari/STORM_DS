package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i83  reason: default package */
/* loaded from: classes.dex */
public final class i83 {
    @gc6("left")
    private final int a;
    @gc6("top")
    private final int b;
    @gc6("right")
    private final int c;
    @gc6("bottom")
    private final int d;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: i83$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public i83(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final d83 a() {
        return new d83(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i83)) {
            return false;
        }
        i83 i83Var = (i83) obj;
        if (this.a == i83Var.a && this.b == i83Var.b && this.c == i83Var.c && this.d == i83Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + lb1.a(this.c, lb1.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        StringBuilder q = i61.q(i, i2, "InsetsDto(left=", ", top=", ", right=");
        q.append(i3);
        q.append(", bottom=");
        q.append(i4);
        q.append(")");
        return q.toString();
    }
}
