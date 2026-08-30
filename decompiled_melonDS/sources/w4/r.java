package w4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final int f14155a;

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            if (this.f14155a != ((r) obj).f14155a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14155a);
    }

    public final String toString() {
        int i2 = this.f14155a;
        if (i2 == 1) {
            return "Linearity.Linear";
        }
        if (i2 == 2) {
            return "Linearity.FontHinting";
        }
        if (i2 == 3) {
            return "Linearity.None";
        }
        return "Invalid";
    }
}
