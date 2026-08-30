package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a  reason: collision with root package name */
    public final float f2420a;

    /* renamed from: b  reason: collision with root package name */
    public final float f2421b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2422c;

    public f1(float f8, float f10, long j2) {
        this.f2420a = f8;
        this.f2421b = f10;
        this.f2422c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        if (Float.compare(this.f2420a, f1Var.f2420a) == 0 && Float.compare(this.f2421b, f1Var.f2421b) == 0 && this.f2422c == f1Var.f2422c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2422c) + w.d.b(this.f2421b, Float.hashCode(this.f2420a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f2420a + ", distance=" + this.f2421b + ", duration=" + this.f2422c + ')';
    }
}
