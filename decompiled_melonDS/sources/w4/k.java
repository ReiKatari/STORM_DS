package w4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final int f14142a;

    public static String a(int i2) {
        if (i2 == 1) {
            return "Left";
        }
        if (i2 == 2) {
            return "Right";
        }
        if (i2 == 3) {
            return "Center";
        }
        if (i2 == 4) {
            return "Justify";
        }
        if (i2 == 5) {
            return "Start";
        }
        if (i2 == 6) {
            return "End";
        }
        if (i2 == 0) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (this.f14142a != ((k) obj).f14142a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14142a);
    }

    public final String toString() {
        return a(this.f14142a);
    }
}
