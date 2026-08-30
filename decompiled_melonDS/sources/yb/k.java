package yb;

import java.io.Serializable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k implements Serializable {
    public final Throwable A;

    public k(Throwable th2) {
        th2.getClass();
        this.A = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (nc.k.a(this.A, ((k) obj).A)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.A + ')';
    }
}
