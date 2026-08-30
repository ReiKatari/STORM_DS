package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g1  reason: default package */
/* loaded from: classes.dex */
public abstract class g1 extends y0 {
    public abstract g1 c(int i, Object obj);

    @Override // defpackage.k0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.k0, java.util.Collection, java.util.List
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

    public abstract g1 d(Object obj);

    public g1 i(Collection collection) {
        en4 j = j();
        j.addAll(collection);
        return j.d();
    }

    @Override // defpackage.y0, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract en4 j();

    public abstract g1 k(f1 f1Var);

    public abstract g1 l(int i);

    @Override // defpackage.y0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract g1 m(int i, Object obj);

    @Override // defpackage.y0, java.util.List
    public final List subList(int i, int i2) {
        return new nx2(this, i, i2);
    }
}
