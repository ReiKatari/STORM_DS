package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iu0  reason: default package */
/* loaded from: classes.dex */
public final class iu0 implements a74 {
    public final a74 a;
    public final a74 b;

    public iu0(a74 a74Var, a74 a74Var2) {
        this.a = a74Var;
        this.b = a74Var2;
    }

    @Override // defpackage.a74
    public final boolean a(qn2 qn2Var) {
        if (this.a.a(qn2Var) && this.b.a(qn2Var)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.a74
    public final Object b(eo2 eo2Var, Object obj) {
        return this.b.b(eo2Var, this.a.b(eo2Var, obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof iu0) {
            iu0 iu0Var = (iu0) obj;
            if (this.a.equals(iu0Var.a) && nb3.k(this.b, iu0Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return lb1.q(new StringBuilder("["), (String) b(pn.X, ""), ']');
    }
}
