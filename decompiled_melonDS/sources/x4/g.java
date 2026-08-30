package x4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final long f14338a;

    public static String a(long j2) {
        if (j2 != 9205357640488583168L) {
            return "(" + ((Object) f.c(Float.intBitsToFloat((int) (j2 >> 32)))) + ", " + ((Object) f.c(Float.intBitsToFloat((int) (j2 & 4294967295L)))) + ')';
        }
        return "DpOffset.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (this.f14338a != ((g) obj).f14338a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14338a);
    }

    public final String toString() {
        return a(this.f14338a);
    }
}
