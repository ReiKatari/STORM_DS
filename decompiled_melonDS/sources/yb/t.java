package yb;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t implements Comparable {
    public final long A;

    public /* synthetic */ t(long j2) {
        this.A = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return nc.k.c(this.A ^ Long.MIN_VALUE, ((t) obj).A ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            if (this.A != ((t) obj).A) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.A);
    }

    public final String toString() {
        return p7.k.A(10, this.A);
    }
}
