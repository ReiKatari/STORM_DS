package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vc5  reason: default package */
/* loaded from: classes.dex */
public final class vc5 implements xc5 {
    public final long a;
    public final dd5 b;
    public final ed5 c;
    public final sc5 d;

    public vc5(long j, dd5 dd5Var, ed5 ed5Var, sc5 sc5Var) {
        dd5Var.getClass();
        ed5Var.getClass();
        sc5Var.getClass();
        this.a = j;
        this.b = dd5Var;
        this.c = ed5Var;
        this.d = sc5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc5)) {
            return false;
        }
        vc5 vc5Var = (vc5) obj;
        if (this.a == vc5Var.a && nb3.k(this.b, vc5Var.b) && this.c == vc5Var.c && this.d == vc5Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (Long.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Result(requestId=" + this.a + ", result=" + this.b + ", action=" + this.c + ", priority=" + this.d + ")";
    }
}
