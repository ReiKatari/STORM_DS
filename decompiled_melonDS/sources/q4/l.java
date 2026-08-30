package q4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final int f12257a;

    public static String a(int i2) {
        if (i2 == 0) {
            return "Unspecified";
        }
        if (i2 == 1) {
            return "Text";
        }
        if (i2 == 2) {
            return "Ascii";
        }
        if (i2 == 3) {
            return "Number";
        }
        if (i2 == 4) {
            return "Phone";
        }
        if (i2 == 5) {
            return "Uri";
        }
        if (i2 == 6) {
            return "Email";
        }
        if (i2 == 7) {
            return "Password";
        }
        if (i2 == 8) {
            return "NumberPassword";
        }
        if (i2 == 9) {
            return "Decimal";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (this.f12257a != ((l) obj).f12257a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12257a);
    }

    public final String toString() {
        return a(this.f12257a);
    }
}
