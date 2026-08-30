package ua;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends j implements Iterable {
    public final ArrayList A = new ArrayList();

    @Override // ua.j
    public final String a() {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        if (size == 1) {
            return ((j) arrayList.get(0)).a();
        }
        a0.j.p(w.d.l(size, "Array must have size 1, but has size "));
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof i) || !((i) obj).A.equals(this.A)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.A.iterator();
    }
}
