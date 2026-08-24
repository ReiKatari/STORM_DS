package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b07  reason: default package */
/* loaded from: classes.dex */
public final class b07 {
    public final fp a;
    public fp b;
    public boolean c = false;
    public y84 d = null;

    public b07(fp fpVar, fp fpVar2) {
        this.a = fpVar;
        this.b = fpVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b07)) {
            return false;
        }
        b07 b07Var = (b07) obj;
        if (nb3.k(this.a, b07Var.a) && nb3.k(this.b, b07Var.b) && this.c == b07Var.c && nb3.k(this.d, b07Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int e = xg6.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
        y84 y84Var = this.d;
        if (y84Var == null) {
            hashCode = 0;
        } else {
            hashCode = y84Var.hashCode();
        }
        return e + hashCode;
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) this.b) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ')';
    }
}
