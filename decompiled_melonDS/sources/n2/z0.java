package n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f10087a;

    public z0(String str) {
        this.f10087a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof z0) || !this.f10087a.equals(((z0) obj).f10087a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10087a.hashCode();
    }

    public final String toString() {
        return w.d.r(new StringBuilder("OpaqueKey(key="), this.f10087a, ')');
    }
}
