package f7;

import java.util.List;
import zb.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final List f4934a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4935b;

    public e(int i2, List list) {
        this.f4934a = list;
        this.f4935b = i2;
        if (!list.isEmpty() || i2 != -1) {
            if (!list.isEmpty()) {
                int size = list.size();
                if (i2 >= 0 && i2 < size) {
                    return;
                }
            }
            a0.j.n(kc.a.i("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", i2, "', bounds = '"), new sc.b(0, list.size() - 1, 1), "'.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f4935b == eVar.f4935b && nc.k.a(this.f4934a, eVar.f4934a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4934a.hashCode() + (this.f4935b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f4935b + ", mergedHistory=" + this.f4934a + ')';
    }

    public e() {
        this(-1, q.A);
    }
}
