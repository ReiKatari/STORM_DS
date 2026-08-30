package zh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l extends p {

    /* renamed from: a  reason: collision with root package name */
    public final r f15131a;

    public l(r rVar) {
        rVar.getClass();
        this.f15131a = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && this.f15131a == ((l) obj).f15131a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15131a.hashCode();
    }

    public final String toString() {
        return "GbaSlotTypeUpdated(type=" + this.f15131a + ")";
    }
}
