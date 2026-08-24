package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fq5  reason: default package */
/* loaded from: classes.dex */
public final class fq5 {
    public final long a = kt0.h;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fq5) {
                if (!kt0.d(this.a, ((fq5) obj).a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = kt0.i;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) kt0.j(this.a)) + ", rippleAlpha=null)";
    }
}
