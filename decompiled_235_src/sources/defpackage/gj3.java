package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gj3  reason: default package */
/* loaded from: classes.dex */
public final class gj3 extends hj3 {
    public final wx5 a;

    public gj3(wx5 wx5Var) {
        wx5Var.getClass();
        this.a = wx5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gj3) && nb3.k(this.a, ((gj3) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Rom(result=" + this.a + ")";
    }
}
