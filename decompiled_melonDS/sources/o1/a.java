package o1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f10496a;

    public a(float f8) {
        this.f10496a = f8;
        if (x4.f.a(f8, 0) > 0) {
            return;
        }
        k1.b.a("Provided min size should be larger than zero.");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (x4.f.b(this.f10496a, ((a) obj).f10496a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10496a);
    }
}
