package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ti7  reason: default package */
/* loaded from: classes.dex */
public final class ti7 {
    public final int a;
    public final tu0 b;

    public ti7(int i, tu0 tu0Var) {
        tu0Var.getClass();
        this.a = i;
        this.b = tu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti7)) {
            return false;
        }
        ti7 ti7Var = (ti7) obj;
        if (this.a == ti7Var.a && nb3.k(this.b, ti7Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RequestSignal(requestNo=" + this.a + ", signal=" + this.b + ')';
    }
}
