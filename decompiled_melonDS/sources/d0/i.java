package d0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final r0.m f3394a;

    public i(r0.m mVar) {
        this.f3394a = mVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof i) && this.f3394a.equals(((i) obj).f3394a)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f3394a.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.f3394a + "}";
    }
}
