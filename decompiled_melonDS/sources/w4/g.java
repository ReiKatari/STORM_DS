package w4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final int f14136a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (this.f14136a != ((g) obj).f14136a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14136a);
    }

    public final String toString() {
        int i2 = this.f14136a;
        if (i2 == 0) {
            return "LineHeightStyle.Mode.Fixed";
        }
        if (i2 == 1) {
            return "LineHeightStyle.Mode.Minimum";
        }
        if (i2 == 2) {
            return "LineHeightStyle.Mode.Tight";
        }
        return "Invalid";
    }
}
