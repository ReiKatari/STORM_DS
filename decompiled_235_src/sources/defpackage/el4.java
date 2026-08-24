package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: el4  reason: default package */
/* loaded from: classes.dex */
public final class el4 extends kj2 {
    public final dl4 i;
    public final hu3 j;

    public el4(hu3 hu3Var, dl4 dl4Var) {
        dl4Var.getClass();
        this.i = dl4Var;
        this.j = hu3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el4)) {
            return false;
        }
        el4 el4Var = (el4) obj;
        if (nb3.k(this.i, el4Var.i) && nb3.k(this.j, el4Var.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.i.hashCode() * 31;
        hu3 hu3Var = this.j;
        if (hu3Var == null) {
            hashCode = 0;
        } else {
            hashCode = hu3Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.i + ", owner=" + this.j + ')';
    }
}
