package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ok3  reason: default package */
/* loaded from: classes.dex */
public final class ok3 {
    public final mk3 a;
    public final mk3 b;

    public ok3(mk3 mk3Var, mk3 mk3Var2) {
        mk3Var.getClass();
        this.a = mk3Var;
        this.b = mk3Var2;
    }

    public static ok3 a(ok3 ok3Var, mk3 mk3Var) {
        mk3 mk3Var2 = ok3Var.a;
        mk3Var2.getClass();
        return new ok3(mk3Var2, mk3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok3)) {
            return false;
        }
        ok3 ok3Var = (ok3) obj;
        if (nb3.k(this.a, ok3Var.a) && nb3.k(this.b, ok3Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        mk3 mk3Var = this.b;
        if (mk3Var == null) {
            hashCode = 0;
        } else {
            hashCode = mk3Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "LayoutDisplayPair(mainScreenDisplay=" + this.a + ", secondaryScreenDisplay=" + this.b + ")";
    }
}
