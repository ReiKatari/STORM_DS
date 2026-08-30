package w4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final int f14147a;

    public static String a(int i2) {
        if (i2 == 1) {
            return "Ltr";
        }
        if (i2 == 2) {
            return "Rtl";
        }
        if (i2 == 3) {
            return "Content";
        }
        if (i2 == 4) {
            return "ContentOrLtr";
        }
        if (i2 == 5) {
            return "ContentOrRtl";
        }
        if (i2 == 0) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            if (this.f14147a != ((m) obj).f14147a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14147a);
    }

    public final String toString() {
        return a(this.f14147a);
    }
}
