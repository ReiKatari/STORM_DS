package w4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f14129a;

    public static String a(int i2) {
        if (i2 == 1) {
            return "Hyphens.None";
        }
        if (i2 == 2) {
            return "Hyphens.Auto";
        }
        if (i2 == 0) {
            return "Hyphens.Unspecified";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (this.f14129a != ((d) obj).f14129a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14129a);
    }

    public final String toString() {
        return a(this.f14129a);
    }
}
