package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w71  reason: default package */
/* loaded from: classes.dex */
public final class w71 {
    public final ff7 a;
    public final ck3 b;

    public w71(ff7 ff7Var, ck3 ck3Var) {
        ff7Var.getClass();
        ck3Var.getClass();
        this.a = ff7Var;
        this.b = ck3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w71)) {
            return false;
        }
        w71 w71Var = (w71) obj;
        if (nb3.k(this.a, w71Var.a) && this.b == w71Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CurrentLayoutState(layout=" + this.a + ", orientation=" + this.b + ")";
    }
}
