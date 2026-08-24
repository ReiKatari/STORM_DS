package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gu5  reason: default package */
/* loaded from: classes.dex */
public final class gu5 extends tu5 {
    public final ax5 a;

    public gu5(ax5 ax5Var) {
        ax5Var.getClass();
        this.a = ax5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gu5) && this.a == ((gu5) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GbaSlotTypeUpdated(type=" + this.a + ")";
    }
}
