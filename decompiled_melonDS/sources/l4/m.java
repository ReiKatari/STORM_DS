package l4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final int f8848a;

    public static String a(int i2) {
        if (i2 == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i2 == 1) {
            return "EmojiSupportMatch.None";
        }
        if (i2 == 2) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i2 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            if (this.f8848a != ((m) obj).f8848a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8848a);
    }

    public final String toString() {
        return a(this.f8848a);
    }
}
