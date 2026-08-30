package t1;

import x4.f;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final float f13073a;

    public b(float f8) {
        this.f13073a = f8;
    }

    @Override // t1.a
    public final float a(long j2, x4.c cVar) {
        return cVar.v(this.f13073a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof b) || !f.b(this.f13073a, ((b) obj).f13073a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13073a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f13073a + ".dp)";
    }
}
