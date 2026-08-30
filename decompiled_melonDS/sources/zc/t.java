package zc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t extends cc.a {
    public static final r L = new Object();
    public final String B;

    public t() {
        super(L);
        this.B = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof t) && nc.k.a(this.B, ((t) obj).B)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    public final String toString() {
        return w.d.r(new StringBuilder("CoroutineName("), this.B, ')');
    }
}
