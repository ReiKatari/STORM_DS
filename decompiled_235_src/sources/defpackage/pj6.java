package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pj6  reason: default package */
/* loaded from: classes.dex */
public final class pj6 {
    public final qn2 a;
    public final io6 b;

    public pj6(qn2 qn2Var, io6 io6Var) {
        this.a = qn2Var;
        this.b = io6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pj6) {
                pj6 pj6Var = (pj6) obj;
                if (!this.a.equals(pj6Var.a) || !this.b.equals(pj6Var.b)) {
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
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
