package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rs3  reason: default package */
/* loaded from: classes.dex */
public final class rs3 extends ss3 {
    public final ya5 a;

    public rs3(ya5 ya5Var) {
        ya5Var.getClass();
        this.a = ya5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof rs3) && nb3.k(this.a, ((rs3) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loaded(ranking=" + this.a + ")";
    }
}
