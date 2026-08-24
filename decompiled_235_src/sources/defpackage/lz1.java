package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lz1  reason: default package */
/* loaded from: classes.dex */
public final class lz1 {
    public final long a;
    public final tu0 b;

    public lz1(long j, tu0 tu0Var) {
        this.a = j;
        this.b = tu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lz1) {
            lz1 lz1Var = (lz1) obj;
            if (this.a == lz1Var.a && this.b == lz1Var.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "HardcoreExitChoiceWaiter(requestId=" + this.a + ", deferred=" + this.b + ")";
    }
}
