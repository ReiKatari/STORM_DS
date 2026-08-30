package q4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final int f12256a;

    public static String a(int i2) {
        if (i2 == -1) {
            return "Unspecified";
        }
        if (i2 == 0) {
            return "None";
        }
        if (i2 == 1) {
            return "Characters";
        }
        if (i2 == 2) {
            return "Words";
        }
        if (i2 == 3) {
            return "Sentences";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (this.f12256a != ((k) obj).f12256a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12256a);
    }

    public final String toString() {
        return a(this.f12256a);
    }
}
