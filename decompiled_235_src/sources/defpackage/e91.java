package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e91  reason: default package */
/* loaded from: classes.dex */
public final class e91 extends nc1 {
    public final int t;

    public e91(int i) {
        this.t = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e91) && this.t == ((e91) obj).t) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.t);
    }

    public final String toString() {
        return lb1.k("Running(activeCamera=", this.t, ")");
    }
}
