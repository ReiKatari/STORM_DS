package i3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: b  reason: collision with root package name */
    public static final long f6677b = z.g(0.5f, 0.5f);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f6678c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f6679a;

    public static final boolean a(long j2, long j10) {
        if (j2 == j10) {
            return true;
        }
        return false;
    }

    public static String b(long j2) {
        return "TransformOrigin(packedValue=" + j2 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q0) {
            if (this.f6679a != ((q0) obj).f6679a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6679a);
    }

    public final String toString() {
        return b(this.f6679a);
    }
}
