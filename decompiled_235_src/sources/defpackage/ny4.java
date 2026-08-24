package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ny4  reason: default package */
/* loaded from: classes.dex */
public final class ny4 {
    @gc6("x")
    private final int a;
    @gc6("y")
    private final int b;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: ny4$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public ny4(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final my4 a() {
        return new my4(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny4)) {
            return false;
        }
        ny4 ny4Var = (ny4) obj;
        if (this.a == ny4Var.a && this.b == ny4Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xg6.m(this.a, this.b, "PointDto(x=", ", y=", ")");
    }
}
