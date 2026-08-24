package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h1  reason: default package */
/* loaded from: classes.dex */
public abstract class h1 extends z0 {
    public abstract h1 b(int i, Object obj);

    public abstract h1 c(Object obj);

    @Override // defpackage.l0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.l0, java.util.Collection, java.util.List
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

    public h1 d(Collection collection) {
        jw4 f = f();
        f.addAll(collection);
        return f.c();
    }

    public abstract jw4 f();

    public abstract h1 g(g1 g1Var);

    public abstract h1 h(int i);

    public abstract h1 i(int i, Object obj);

    @Override // defpackage.z0, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.z0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.z0, java.util.List
    public final List subList(int i, int i2) {
        return new r33(this, i, i2);
    }
}
