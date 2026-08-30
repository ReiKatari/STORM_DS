package p4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final int f11311a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (this.f11311a != ((h) obj).f11311a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11311a);
    }

    public final String toString() {
        int i2 = this.f11311a;
        if (i2 == 0) {
            return "Normal";
        }
        if (i2 == 1) {
            return "Italic";
        }
        return "Invalid";
    }
}
