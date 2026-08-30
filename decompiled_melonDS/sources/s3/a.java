package s3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f12822a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (this.f12822a != ((a) obj).f12822a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12822a);
    }

    public final String toString() {
        return "IndirectPointerEventPrimaryDirectionalMotionAxis(value=" + this.f12822a + ')';
    }
}
