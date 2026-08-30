package w4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f14125a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (Float.compare(this.f14125a, ((a) obj).f14125a) != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14125a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f14125a + ')';
    }
}
