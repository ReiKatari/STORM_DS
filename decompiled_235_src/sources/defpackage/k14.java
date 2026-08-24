package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k14  reason: default package */
/* loaded from: classes.dex */
public final class k14 {
    public final String a;
    public final l93 b;

    public k14(String str, l93 l93Var) {
        this.a = str;
        this.b = l93Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k14) {
                k14 k14Var = (k14) obj;
                if (!this.a.equals(k14Var.a) || !this.b.equals(k14Var.b)) {
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
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
