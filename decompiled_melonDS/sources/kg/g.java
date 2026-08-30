package kg;

import java.util.List;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8298a;

    public g(List list) {
        this.f8298a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && k.a(this.f8298a, ((g) obj).f8298a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f8298a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Ready(data=" + this.f8298a + ")";
    }
}
