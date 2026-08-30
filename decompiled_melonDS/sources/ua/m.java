package ua;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends j {
    public final wa.o A = new wa.o(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof m) || !((m) obj).A.equals(this.A)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }
}
