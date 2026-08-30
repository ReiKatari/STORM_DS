package x4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final long f14351a;

    public static final boolean a(long j2, long j10) {
        if (j2 == j10) {
            return true;
        }
        return false;
    }

    public static String b(long j2) {
        if (a(j2, 0L)) {
            return "Unspecified";
        }
        if (a(j2, 4294967296L)) {
            return "Sp";
        }
        if (a(j2, 8589934592L)) {
            return "Em";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            if (this.f14351a != ((p) obj).f14351a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14351a);
    }

    public final String toString() {
        return b(this.f14351a);
    }
}
