package w4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final int f14137a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (this.f14137a != ((h) obj).f14137a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14137a);
    }

    public final String toString() {
        int i2 = this.f14137a;
        if (i2 == 1) {
            return "LineHeightStyle.Trim.FirstLineTop";
        }
        if (i2 == 16) {
            return "LineHeightStyle.Trim.LastLineBottom";
        }
        if (i2 == 17) {
            return "LineHeightStyle.Trim.Both";
        }
        if (i2 == 0) {
            return "LineHeightStyle.Trim.None";
        }
        return "Invalid";
    }
}
