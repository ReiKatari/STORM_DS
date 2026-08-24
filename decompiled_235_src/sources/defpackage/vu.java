package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vu  reason: default package */
/* loaded from: classes.dex */
public final class vu implements Collection {
    public final /* synthetic */ wu A;

    public vu(wu wuVar) {
        this.A = wuVar;
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
        return new su(this.A, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        wu wuVar = this.A;
        int a = wuVar.a(obj);
        if (a >= 0) {
            wuVar.g(a);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        wu wuVar = this.A;
        int i = wuVar.L;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(wuVar.i(i2))) {
                wuVar.g(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        wu wuVar = this.A;
        int i = wuVar.L;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(wuVar.i(i2))) {
                wuVar.g(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.A.L;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        wu wuVar = this.A;
        int i = wuVar.L;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = wuVar.i(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        wu wuVar = this.A;
        int i = wuVar.L;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = wuVar.i(i2);
        }
        return objArr;
    }
}
