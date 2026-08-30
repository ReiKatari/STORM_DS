package x4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final long f14340a;

    public static final boolean a(long j2, long j10) {
        if (j2 == j10) {
            return true;
        }
        return false;
    }

    public static final long b(long j2, long j10) {
        return ((((int) (j2 >> 32)) - ((int) (j10 >> 32))) << 32) | ((((int) (j2 & 4294967295L)) - ((int) (j10 & 4294967295L))) & 4294967295L);
    }

    public static final long c(long j2, long j10) {
        return ((((int) (j2 >> 32)) + ((int) (j10 >> 32))) << 32) | ((((int) (j2 & 4294967295L)) + ((int) (j10 & 4294967295L))) & 4294967295L);
    }

    public static String d(long j2) {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append((int) (j2 >> 32));
        sb2.append(", ");
        return w.d.p(sb2, (int) (j2 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (this.f14340a != ((j) obj).f14340a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14340a);
    }

    public final String toString() {
        return d(this.f14340a);
    }
}
