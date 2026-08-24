package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bu5  reason: default package */
/* loaded from: classes.dex */
public final class bu5 extends cu5 {
    public final zt5 a;

    public bu5(zt5 zt5Var) {
        zt5Var.getClass();
        this.a = zt5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof bu5) && nb3.k(this.a, ((bu5) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Ready(romConfigUiModel=" + this.a + ")";
    }
}
