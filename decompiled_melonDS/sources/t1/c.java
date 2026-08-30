package t1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final float f13074a;

    public c(float f8) {
        this.f13074a = f8;
        if (f8 >= 0.0f && f8 <= 100.0f) {
            return;
        }
        k1.b.a("The percent should be in the range of [0, 100]");
    }

    @Override // t1.a
    public final float a(long j2, x4.c cVar) {
        return (this.f13074a / 100.0f) * h3.e.d(j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && Float.compare(this.f13074a, ((c) obj).f13074a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13074a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f13074a + "%)";
    }
}
