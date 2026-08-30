package p8;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f11468a;

    /* renamed from: b  reason: collision with root package name */
    public final long f11469b;

    public d0(long j2, long j10) {
        this.f11468a = j2;
        this.f11469b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d0.class.equals(obj.getClass())) {
            d0 d0Var = (d0) obj;
            if (d0Var.f11468a == this.f11468a && d0Var.f11469b == this.f11469b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11469b) + (Long.hashCode(this.f11468a) * 31);
    }

    public final String toString() {
        return "PeriodicityInfo{repeatIntervalMillis=" + this.f11468a + ", flexIntervalMillis=" + this.f11469b + '}';
    }
}
