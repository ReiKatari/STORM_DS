package g3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f5505a;

    public static String a(int i2) {
        if (i2 == 1) {
            return "Next";
        }
        if (i2 == 2) {
            return "Previous";
        }
        if (i2 == 3) {
            return "Left";
        }
        if (i2 == 4) {
            return "Right";
        }
        if (i2 == 5) {
            return "Up";
        }
        if (i2 == 6) {
            return "Down";
        }
        if (i2 == 7) {
            return "Enter";
        }
        if (i2 == 8) {
            return "Exit";
        }
        return "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (this.f5505a != ((f) obj).f5505a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5505a);
    }

    public final String toString() {
        return a(this.f5505a);
    }
}
