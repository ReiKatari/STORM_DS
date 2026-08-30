package sc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends b {
    public static final d R = new b(1, 0, 1);

    @Override // sc.b
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (this.A == dVar.A && this.B == dVar.B) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // sc.b
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.A * 31) + this.B;
    }

    @Override // sc.b
    public final boolean isEmpty() {
        if (this.A > this.B) {
            return true;
        }
        return false;
    }

    @Override // sc.b
    public final String toString() {
        return this.A + ".." + this.B;
    }
}
