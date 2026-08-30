package m9;

import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: b  reason: collision with root package name */
    public static final r f9450b = new r(zb.r.A);

    /* renamed from: a  reason: collision with root package name */
    public final Map f9451a;

    public r(Map map) {
        this.f9451a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            if (nc.k.a(this.f9451a, ((r) obj).f9451a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9451a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.f9451a + ')';
    }
}
