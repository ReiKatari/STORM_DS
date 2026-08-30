package yb;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r implements Comparable {
    public final int A;

    public /* synthetic */ r(int i2) {
        this.A = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return nc.k.b(this.A ^ Integer.MIN_VALUE, ((r) obj).A ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            if (this.A != ((r) obj).A) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.A);
    }

    public final String toString() {
        return String.valueOf(this.A & 4294967295L);
    }
}
