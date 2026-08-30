package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: du  reason: default package */
/* loaded from: classes.dex */
public final class du implements Collection {
    public final /* synthetic */ eu A;

    public du(eu euVar) {
        this.A = euVar;
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
        return new au(this.A, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        eu euVar = this.A;
        int a = euVar.a(obj);
        if (a >= 0) {
            euVar.g(a);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        eu euVar = this.A;
        int i = euVar.L;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(euVar.i(i2))) {
                euVar.g(i2);
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
        eu euVar = this.A;
        int i = euVar.L;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(euVar.i(i2))) {
                euVar.g(i2);
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
        eu euVar = this.A;
        int i = euVar.L;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = euVar.i(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        eu euVar = this.A;
        int i = euVar.L;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = euVar.i(i2);
        }
        return objArr;
    }
}
