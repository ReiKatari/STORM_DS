package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nk3  reason: default package */
/* loaded from: classes.dex */
public final class nk3 {
    @gc6("id")
    private final int a;
    @gc6("type")
    private final String b;
    @gc6("width")
    private final int c;
    @gc6("height")
    private final int d;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: nk3$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public nk3(int i, int i2, int i3, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
    }

    public final mk3 a() {
        return new mk3(this.a, (lk3) jw2.o(this.b, lk3.values()), this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk3)) {
            return false;
        }
        nk3 nk3Var = (nk3) obj;
        if (this.a == nk3Var.a && nb3.k(this.b, nk3Var.b) && this.c == nk3Var.c && this.d == nk3Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + lb1.a(this.c, xg6.d(Integer.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        int i2 = this.c;
        int i3 = this.d;
        return "LayoutDisplayDto(id=" + i + ", type=" + str + ", width=" + i2 + ", height=" + i3 + ")";
    }
}
