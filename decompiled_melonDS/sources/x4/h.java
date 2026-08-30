package x4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final long f14339a;

    public static final float a(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    public static final float b(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (this.f14339a != ((h) obj).f14339a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14339a);
    }

    public final String toString() {
        long j2 = this.f14339a;
        if (j2 != 9205357640488583168L) {
            return ((Object) f.c(b(j2))) + " x " + ((Object) f.c(a(j2)));
        }
        return "DpSize.Unspecified";
    }
}
