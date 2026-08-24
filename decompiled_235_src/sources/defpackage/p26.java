package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p26  reason: default package */
/* loaded from: classes.dex */
public final class p26 extends r26 {
    public final int a;

    public p26(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p26) && this.a == ((p26) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return lb1.k("RumbleStart(duration=", this.a, ")");
    }
}
