package r3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f12615a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (this.f12615a != ((a) obj).f12615a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12615a);
    }

    public final String toString() {
        int i2 = this.f12615a;
        if (i2 == 1) {
            return "Touch";
        }
        if (i2 == 2) {
            return "Keyboard";
        }
        return "Error";
    }
}
