package bd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: b  reason: collision with root package name */
    public static final n f2191b = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f2192a;

    public static final Object a(Object obj) {
        if (!(obj instanceof n)) {
            return obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            if (!nc.k.a(this.f2192a, ((o) obj).f2192a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f2192a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f2192a;
        if (obj instanceof m) {
            return ((m) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
