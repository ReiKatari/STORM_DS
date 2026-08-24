package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gy1  reason: default package */
/* loaded from: classes.dex */
public final class gy1 extends hy1 {
    public final pq5 a;

    public gy1(pq5 pq5Var) {
        pq5Var.getClass();
        this.a = pq5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gy1) && nb3.k(this.a, ((gy1) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ValidatingRom(rom=" + this.a + ")";
    }
}
