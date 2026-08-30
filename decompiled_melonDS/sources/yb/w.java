package yb;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w implements Comparable {
    public final short A;

    public /* synthetic */ w(short s10) {
        this.A = s10;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return nc.k.b(this.A & 65535, ((w) obj).A & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            if (this.A != ((w) obj).A) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.A);
    }

    public final String toString() {
        return String.valueOf(this.A & 65535);
    }
}
