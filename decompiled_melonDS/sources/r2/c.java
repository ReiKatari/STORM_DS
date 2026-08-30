package r2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c extends zb.e {
    public abstract c b(int i2, Object obj);

    public abstract c c(Object obj);

    @Override // zb.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // zb.b, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection<Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public c d(Collection collection) {
        f e6 = e();
        e6.addAll(collection);
        return e6.c();
    }

    public abstract f e();

    public abstract c f(b bVar);

    public abstract c g(int i2);

    public abstract c h(int i2, Object obj);

    @Override // zb.e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // zb.e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // zb.e, java.util.List
    public final List subList(int i2, int i10) {
        return new q2.a(this, i2, i10);
    }
}
