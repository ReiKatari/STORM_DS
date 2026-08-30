package b4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a  reason: collision with root package name */
    public final int f1854a;

    public final boolean equals(Object obj) {
        if (obj instanceof h1) {
            if (this.f1854a != ((h1) obj).f1854a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1854a);
    }

    public final String toString() {
        return "AutoClearFocusBehavior(value=" + this.f1854a + ')';
    }
}
