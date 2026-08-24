package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gf7  reason: default package */
/* loaded from: classes.dex */
public final class gf7 {
    @gc6("mainScreenLayoutDto")
    private final b76 a;
    @gc6("secondaryScreenLayoutDto")
    private final b76 b;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: gf7$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public gf7(b76 b76Var, b76 b76Var2) {
        this.a = b76Var;
        this.b = b76Var2;
    }

    public final ff7 a() {
        return new ff7(this.a.a(), this.b.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf7)) {
            return false;
        }
        gf7 gf7Var = (gf7) obj;
        if (nb3.k(this.a, gf7Var.a) && nb3.k(this.b, gf7Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        b76 b76Var = this.a;
        b76 b76Var2 = this.b;
        return "UILayoutDto(mainScreenLayout=" + b76Var + ", secondaryScreenLayout=" + b76Var2 + ")";
    }
}
