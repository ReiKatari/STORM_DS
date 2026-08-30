package v3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final int f13719a;

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            if (this.f13719a != ((x) obj).f13719a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13719a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f13719a + ')';
    }
}
