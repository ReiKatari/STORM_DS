package i3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f6618a;

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            if (this.f6618a != ((b0) obj).f6618a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6618a);
    }

    public final String toString() {
        int i2 = this.f6618a;
        if (i2 == 0) {
            return "Argb8888";
        }
        if (i2 == 1) {
            return "Alpha8";
        }
        if (i2 == 2) {
            return "Rgb565";
        }
        if (i2 == 3) {
            return "F16";
        }
        if (i2 == 4) {
            return "Gpu";
        }
        return "Unknown";
    }
}
