package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fj3  reason: default package */
/* loaded from: classes.dex */
public final class fj3 extends hj3 {
    public final yc2 a;

    public fj3(yc2 yc2Var) {
        yc2Var.getClass();
        this.a = yc2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof fj3) && nb3.k(this.a, ((fj3) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Firmware(result=" + this.a + ")";
    }
}
