package yb;

import java.io.Serializable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l implements Serializable {
    public final Object A;

    public static final Throwable a(Object obj) {
        if (obj instanceof k) {
            return ((k) obj).A;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (!nc.k.a(this.A, ((l) obj).A)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.A;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.A;
        if (obj instanceof k) {
            return ((k) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
