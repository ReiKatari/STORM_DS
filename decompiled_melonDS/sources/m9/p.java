package m9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p implements Iterable, oc.a {
    public static final p B = new p(zb.r.A);
    public final Map A;

    public p(Map map) {
        this.A = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            if (nc.k.a(this.A, ((p) obj).A)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.A;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() == null) {
                arrayList.add(new yb.j(str, null));
            } else {
                o.b();
                return null;
            }
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.A + ')';
    }
}
