package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cj3  reason: default package */
/* loaded from: classes.dex */
public final class cj3 extends yh2 {
    public final pq5 d;

    public cj3(pq5 pq5Var) {
        pq5Var.getClass();
        this.d = pq5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof cj3) && nb3.k(this.d, ((cj3) obj).d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "RomObject(rom=" + this.d + ")";
    }
}
