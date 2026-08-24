package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rx1  reason: default package */
/* loaded from: classes.dex */
public final class rx1 extends lb4 {
    public final pq5 o;

    public rx1(pq5 pq5Var) {
        pq5Var.getClass();
        this.o = pq5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof rx1) && nb3.k(this.o, ((rx1) obj).o)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final String toString() {
        return "RomSession(rom=" + this.o + ")";
    }
}
