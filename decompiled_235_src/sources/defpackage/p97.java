package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p97  reason: default package */
/* loaded from: classes.dex */
public final class p97 {
    public final fp a;
    public final mk4 b;

    public p97(fp fpVar, mk4 mk4Var) {
        this.a = fpVar;
        this.b = mk4Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p97) {
                p97 p97Var = (p97) obj;
                if (!nb3.k(this.a, p97Var.a) || !this.b.equals(p97Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
