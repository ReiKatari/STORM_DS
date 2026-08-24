package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d43  reason: default package */
/* loaded from: classes.dex */
public final class d43 {
    public final int a;
    public final ig1 b;
    public final sf0 c;

    public d43(int i, ig1 ig1Var, sf0 sf0Var) {
        ig1Var.getClass();
        this.a = i;
        this.b = ig1Var;
        this.c = sf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d43) {
            d43 d43Var = (d43) obj;
            if (this.a == d43Var.a && nb3.k(this.b, d43Var.b) && this.c == d43Var.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "ConfiguredOutput(streamId=" + ((Object) kr6.a(this.a)) + ", deferrableSurface=" + this.b + ", graph=" + this.c + ')';
    }
}
