package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pk3  reason: default package */
/* loaded from: classes.dex */
public final class pk3 {
    @gc6("mainScreenDisplay")
    private final nk3 a;
    @gc6("secondaryScreenDisplay")
    private final nk3 b;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: pk3$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public pk3(nk3 nk3Var, nk3 nk3Var2) {
        this.a = nk3Var;
        this.b = nk3Var2;
    }

    public final ok3 a() {
        mk3 mk3Var;
        mk3 a2 = this.a.a();
        nk3 nk3Var = this.b;
        if (nk3Var != null) {
            mk3Var = nk3Var.a();
        } else {
            mk3Var = null;
        }
        return new ok3(a2, mk3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk3)) {
            return false;
        }
        pk3 pk3Var = (pk3) obj;
        if (nb3.k(this.a, pk3Var.a) && nb3.k(this.b, pk3Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        nk3 nk3Var = this.b;
        if (nk3Var == null) {
            hashCode = 0;
        } else {
            hashCode = nk3Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        nk3 nk3Var = this.a;
        nk3 nk3Var2 = this.b;
        return "LayoutDisplayPairDto(mainScreenDisplay=" + nk3Var + ", secondaryScreenDisplay=" + nk3Var2 + ")";
    }
}
