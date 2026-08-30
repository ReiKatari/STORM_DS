package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i3 {

    /* renamed from: a  reason: collision with root package name */
    public final long f5178a = i3.s.f6687h;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i3) {
                if (!i3.s.c(this.f5178a, ((i3) obj).f5178a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = i3.s.f6688i;
        return Long.hashCode(this.f5178a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) i3.s.i(this.f5178a)) + ", rippleAlpha=null)";
    }
}
