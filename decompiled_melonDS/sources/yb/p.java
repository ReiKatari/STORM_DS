package yb;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p implements Comparable {
    public final byte A;

    public /* synthetic */ p(byte b10) {
        this.A = b10;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return nc.k.b(this.A & 255, ((p) obj).A & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            if (this.A != ((p) obj).A) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.A);
    }

    public final String toString() {
        return String.valueOf(this.A & 255);
    }
}
