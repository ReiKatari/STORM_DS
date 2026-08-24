package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q87  reason: default package */
/* loaded from: classes.dex */
public final class q87 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof q87) {
            if (this.a != ((q87) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return xg6.o("TorchMode(value=", this.a, ')');
    }
}
