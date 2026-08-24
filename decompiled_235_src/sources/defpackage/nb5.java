package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nb5  reason: default package */
/* loaded from: classes.dex */
public final class nb5 implements tb5 {
    public final int a;

    public nb5(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof nb5) && this.a == ((nb5) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return lb1.k("NetworkLost(pendingTotal=", this.a, ")");
    }
}
