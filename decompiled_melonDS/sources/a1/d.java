package a1;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements Collection {
    public final /* synthetic */ e A;

    public d(e eVar) {
        this.A = eVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.A.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (this.A.a(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.A.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this.A, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.A;
        int a10 = eVar.a(obj);
        if (a10 >= 0) {
            eVar.g(a10);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.A;
        int i2 = eVar.L;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < i2) {
            if (collection.contains(eVar.i(i10))) {
                eVar.g(i10);
                i10--;
                i2--;
                z10 = true;
            }
            i10++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.A;
        int i2 = eVar.L;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < i2) {
            if (!collection.contains(eVar.i(i10))) {
                eVar.g(i10);
                i10--;
                i2--;
                z10 = true;
            }
            i10++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.A.L;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.A;
        int i2 = eVar.L;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        }
        for (int i10 = 0; i10 < i2; i10++) {
            objArr[i10] = eVar.i(i10);
        }
        if (objArr.length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        e eVar = this.A;
        int i2 = eVar.L;
        Object[] objArr = new Object[i2];
        for (int i10 = 0; i10 < i2; i10++) {
            objArr[i10] = eVar.i(i10);
        }
        return objArr;
    }
}
