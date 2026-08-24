package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uw1  reason: default package */
/* loaded from: classes.dex */
public final class uw1 extends mb3 {
    public final pq5 F;

    public uw1(pq5 pq5Var) {
        pq5Var.getClass();
        this.F = pq5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof uw1) && nb3.k(this.F, ((uw1) obj).F)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.F.hashCode();
    }

    public final String toString() {
        return "ValidatingRom(rom=" + this.F + ")";
    }
}
