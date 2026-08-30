package f7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f4926a;

    /* renamed from: b  reason: collision with root package name */
    public final float f4927b;

    /* renamed from: c  reason: collision with root package name */
    public final float f4928c;

    /* renamed from: d  reason: collision with root package name */
    public final float f4929d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4930e;

    public b(int i2, float f8, float f10, float f11, long j2) {
        this.f4926a = i2;
        this.f4927b = f8;
        this.f4928c = f10;
        this.f4929d = f11;
        this.f4930e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f4928c == bVar.f4928c && this.f4929d == bVar.f4929d && this.f4927b == bVar.f4927b && this.f4926a == bVar.f4926a && this.f4930e == bVar.f4930e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4930e) + w.d.c(this.f4926a, w.d.b(this.f4927b, w.d.b(this.f4929d, Float.hashCode(this.f4928c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.f4928c + ", touchY=" + this.f4929d + ", progress=" + this.f4927b + ", swipeEdge=" + this.f4926a + ", frameTimeMillis=" + this.f4930e + ')';
    }
}
