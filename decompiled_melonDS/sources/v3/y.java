package v3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final int f13720a;

    public static String a(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return "Unknown";
                    }
                    return "Eraser";
                }
                return "Stylus";
            }
            return "Mouse";
        }
        return "Touch";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            if (this.f13720a != ((y) obj).f13720a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13720a);
    }

    public final String toString() {
        return a(this.f13720a);
    }
}
