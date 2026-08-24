package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rm1  reason: default package */
/* loaded from: classes.dex */
public final class rm1 {
    public final long a;

    public static String a(long j) {
        if (j != 9205357640488583168L) {
            return "(" + ((Object) om1.c(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) om1.c(Float.intBitsToFloat((int) (j & 4294967295L)))) + ')';
        }
        return "DpOffset.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rm1) {
            if (this.a != ((rm1) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
