package x4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final long f14346a;

    public static boolean a(long j2, Object obj) {
        if (!(obj instanceof l) || j2 != ((l) obj).f14346a) {
            return false;
        }
        return true;
    }

    public static final boolean b(long j2, long j10) {
        if (j2 == j10) {
            return true;
        }
        return false;
    }

    public static String c(long j2) {
        return ((int) (j2 >> 32)) + " x " + ((int) (j2 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        return a(this.f14346a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.f14346a);
    }

    public final String toString() {
        return c(this.f14346a);
    }
}
