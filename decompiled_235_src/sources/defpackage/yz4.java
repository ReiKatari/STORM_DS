package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yz4  reason: default package */
/* loaded from: classes.dex */
public final class yz4 extends zz4 {
    public final ra5 a;

    public yz4(ra5 ra5Var) {
        ra5Var.getClass();
        this.a = ra5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof yz4) && nb3.k(this.a, ((yz4) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RAIntegrationPopup(event=" + this.a + ")";
    }
}
