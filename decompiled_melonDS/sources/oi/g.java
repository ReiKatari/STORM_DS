package oi;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final long f11038a;

    public static final boolean a(long j2, long j10) {
        if (j2 == j10) {
            return true;
        }
        return false;
    }

    public static String b(long j2) {
        return "RAGameId(id=" + j2 + ")";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (this.f11038a != ((g) obj).f11038a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11038a);
    }

    public final String toString() {
        return b(this.f11038a);
    }
}
