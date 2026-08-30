package l4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: b  reason: collision with root package name */
    public static final long f8883b = i0.b(0, 0);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f8884c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f8885a;

    public /* synthetic */ q0(long j2) {
        this.f8885a = j2;
    }

    public static boolean a(long j2, Object obj) {
        if (!(obj instanceof q0) || j2 != ((q0) obj).f8885a) {
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

    public static final boolean c(long j2) {
        if (((int) (j2 >> 32)) == ((int) (j2 & 4294967295L))) {
            return true;
        }
        return false;
    }

    public static final int d(long j2) {
        return e(j2) - f(j2);
    }

    public static final int e(long j2) {
        return Math.max((int) (j2 >> 32), (int) (j2 & 4294967295L));
    }

    public static final int f(long j2) {
        return Math.min((int) (j2 >> 32), (int) (j2 & 4294967295L));
    }

    public static final boolean g(long j2) {
        if (((int) (j2 >> 32)) > ((int) (j2 & 4294967295L))) {
            return true;
        }
        return false;
    }

    public static String h(long j2) {
        StringBuilder sb2 = new StringBuilder("TextRange(");
        sb2.append((int) (j2 >> 32));
        sb2.append(", ");
        return w.d.p(sb2, (int) (j2 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        return a(this.f8885a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.f8885a);
    }

    public final String toString() {
        return h(this.f8885a);
    }
}
