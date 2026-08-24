package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rj5  reason: default package */
/* loaded from: classes.dex */
public final class rj5 {
    public int a;

    public /* synthetic */ rj5() {
        this(524287);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof rj5) && this.a == ((rj5) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return lb1.k("Renderer3DDebugControlState(featureMask=", this.a, ")");
    }

    public rj5(int i) {
        this.a = i;
    }
}
