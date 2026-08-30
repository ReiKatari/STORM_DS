package b4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: c  reason: collision with root package name */
    public static final t1 f1947c = new t1(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f1948a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1949b;

    public t1(long j2, long j10) {
        this.f1948a = j2;
        this.f1949b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t1) {
            t1 t1Var = (t1) obj;
            if (x4.l.b(this.f1948a, t1Var.f1948a) && this.f1949b == t1Var.f1949b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1949b) + (Long.hashCode(this.f1948a) * 31);
    }
}
