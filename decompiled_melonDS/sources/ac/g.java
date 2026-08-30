package ac;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import s2.l;
import s2.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends AbstractCollection implements Collection, oc.b {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ g(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.A) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.A) {
            case 0:
                ((e) this.B).clear();
                return;
            default:
                ((s2.d) this.B).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                return ((e) this.B).containsValue(obj);
            default:
                return ((s2.d) this.B).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.A) {
            case 0:
                return ((e) this.B).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                e eVar = (e) this.B;
                eVar.getClass();
                return new c(eVar, 2);
            default:
                s2.d dVar = (s2.d) this.B;
                l[] lVarArr = new l[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    lVarArr[i2] = new m(2);
                }
                return new s2.e(dVar, lVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.A) {
            case 0:
                e eVar = (e) this.B;
                eVar.c();
                int h2 = eVar.h(obj);
                if (h2 < 0) {
                    return false;
                }
                eVar.k(h2);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.A) {
            case 0:
                collection.getClass();
                ((e) this.B).c();
                return super.removeAll(collection);
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.A) {
            case 0:
                collection.getClass();
                ((e) this.B).c();
                return super.retainAll(collection);
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.A) {
            case 0:
                return ((e) this.B).f700c0;
            default:
                return ((s2.d) this.B).Y;
        }
    }
}
